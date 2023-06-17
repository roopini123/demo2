package com.ty.boot.springboot_trainer_demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.ty.boot.springboot_trainer_demo.dao.ItemsDao;

@Service
public class ItemsService {
	
	
	@Autowired
	public ItemsDao itemsDao;
	
	
	//public ResponseEntity<ResponseStructure<Items>> saveItems()

}
