package com.ty.boot.springboot_trainer_demo.controller.copy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ty.boot.springboot_trainer_demo.dao.ItemsDao;
import com.ty.boot.springboot_trainer_demo.dto.Items;

@RestController
public class ItemsController {

	@Autowired
	public ItemsDao itemsDao;

	@PostMapping("/save")
	public Items saveItems(@RequestBody Items items) {
		return itemsDao.saveItems(items);
	}

	@DeleteMapping("/delete")
	public Items deleteItems(@RequestParam int id) {
		return itemsDao.deleteItems(id);
	}

	@GetMapping("/get")
	public Items getItems(@RequestParam int id) {
		return itemsDao.getItems(id);
	}

	@PutMapping("/update")
	public Items updateItems(@RequestParam int id,@RequestBody Items items) {
		return itemsDao.updateItems(id, items);
	}

}