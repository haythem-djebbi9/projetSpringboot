package com.example.marque.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.marque.entities.Marque;

public interface MarqueRepository extends JpaRepository<Marque, Long> {

}
