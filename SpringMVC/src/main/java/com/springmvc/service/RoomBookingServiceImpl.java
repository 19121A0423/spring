package com.springmvc.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springmvc.bean.RoomBooking;
import com.springmvc.entity.RoomBookingEntity;
import com.springmvc.repository.RoomRepository;

@Service
public class RoomBookingServiceImpl implements RoomBookingService{

	@Autowired
	private RoomRepository roomRepository;
	
	@Override
	public void save(RoomBooking roomBooking) {
		
		RoomBookingEntity roomBookingEntity = new RoomBookingEntity();
		roomBookingEntity.setName(roomBooking.getName());
		roomBookingEntity.setNoOfPersons(roomBooking.getNoOfPersons());
		
		roomRepository.save(roomBookingEntity);
	}

	@Override
	public void update(RoomBooking roomBooking) {
		
		RoomBookingEntity roomBookingEntity = new RoomBookingEntity();
		roomBookingEntity.setId(roomBooking.getId());
		roomBookingEntity.setName(roomBooking.getName());
		roomBookingEntity.setNoOfPersons(roomBooking.getNoOfPersons());
		
		roomRepository.update(roomBookingEntity);
		
	}

	
	
	
}
