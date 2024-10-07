package com.gl.labwk15d03dem01.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gl.labwk15d03dem01.dao.CCRepDetailRepository;
import com.gl.labwk15d03dem01.model.CCRepDetails;



@Service
public class CCRepDetailServiceImpl implements CCRepDetailService{

	
	@Autowired
	CCRepDetailRepository ccRepRepository;

	@Override
	public List<CCRepDetails> getAllCCRepDetails() {
		// TODO Auto-generated method stub
		return ccRepRepository.findAll();
	}

	
}
