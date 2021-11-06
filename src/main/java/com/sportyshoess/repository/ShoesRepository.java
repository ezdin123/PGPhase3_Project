package com.sportyshoess.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sportyshoess.model.Shoe;

public interface ShoesRepository extends JpaRepository<Shoe, Integer>{

}
