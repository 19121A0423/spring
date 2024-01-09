package com.springmvc.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.springmvc.bean.RoomBooking;
import com.springmvc.service.RoomBookingService;

@Controller
public class RoomController {
	
	@Autowired
	private RoomBookingService roomService;
	
	@RequestMapping( path = "/roombooking" , method = RequestMethod.GET )
	public ModelAndView booking() {
		
		return new ModelAndView("room","roombooking", new RoomBooking());
	}
	
	@RequestMapping( path = "/update" , method = RequestMethod.GET )
	public ModelAndView update() {
		
		return new ModelAndView("roomupdate","roombooking", new RoomBooking());
	}
	
//	@RequestMapping(path = "/thankyou" , method = RequestMethod.POST)
//	public ModelAndView thankyou() {
//		
//		//return new ModelAndView("room","roombooking",booking);
//		return new ModelAndView("thankyou");
//	}
	
	@RequestMapping(path = "/thankyou" , method = RequestMethod.POST)
	public ModelAndView thankyou(@Valid @ModelAttribute(name="roombooking") RoomBooking booking  , BindingResult bindingResult, ModelMap map) {
//		System.out.println(bindingResult.hasErrors());
		
		
		if(bindingResult.hasErrors()) {
			return new ModelAndView("room","roombooking",booking);
		}
		else {
			roomService.save(booking);
			return new ModelAndView("thankyou");
		}
	}
	
	@RequestMapping(path = "/updateRoom" , method = RequestMethod.PUT)
	public ModelAndView roomUpdate(@Valid @ModelAttribute(name="roombooking") RoomBooking booking  , BindingResult bindingResult, ModelMap map) {
//		System.out.println(bindingResult.hasErrors());
		
		
		if(bindingResult.hasErrors()) {
			return new ModelAndView("roomupdate","roombooking",booking);
		}
		else {
			roomService.update(booking);
			return new ModelAndView("thankyou");
		}
	}

}
