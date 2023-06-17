package com.ty.boot.springboot_trainer_demo.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ty.boot.springboot_trainer_demo.dto.Items;
import com.ty.boot.springboot_trainer_demo.repo.ItemsRepo;

@Repository
public class ItemsDao {

	@Autowired
	public ItemsRepo itemsRepo;

	public Items saveItems(Items items) {
		return itemsRepo.save(items);
	}

	public Items deleteItems(int id) {
		Items items = itemsRepo.findById(id).get();
		itemsRepo.delete(items);
		return items;
	}

	public Items getItems(int id) {
		Items items1 = itemsRepo.findById(id).get();
		return items1;

	}

	public Items updateItems(int id, Items items) {
		Items items1 = itemsRepo.findById(id).get();
		items.setId(id);
		if (items1 != null) {
			return itemsRepo.save(items);

		}
		return null;

	}

}
