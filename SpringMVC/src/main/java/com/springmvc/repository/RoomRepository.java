package com.springmvc.repository;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;

import org.springframework.stereotype.Repository;

import com.springmvc.entity.RoomBookingEntity;

@Repository
@Transactional
public class RoomRepository {

	@Autowired
	private HibernateTemplate hibernateTemplate;

	public void save(RoomBookingEntity roomBooking) {
		hibernateTemplate.save(roomBooking);
	}
	
	public void update(RoomBookingEntity roomBooking) {
		hibernateTemplate.update(roomBooking);
	}

}
