package com.ty.boot.springboot_trainer_demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ty.boot.springboot_trainer_demo.dto.Items;

public interface ItemsRepo extends JpaRepository<Items, Integer> {

}
