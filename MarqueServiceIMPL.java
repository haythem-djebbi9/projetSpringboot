package com.example.marque.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.marque.entities.Marque;
import com.example.marque.repos.MarqueRepository;

@Service
public class MarqueServiceIMPL implements MarqueService {

	@Autowired
	MarqueRepository marqueRepository;
	@Override
	public Marque saveMarque(Marque m) {
	
		return marqueRepository.save(m);
	}

	@Override
	public Marque updateMarque(Marque m) {
		
		return marqueRepository.save(m);
	}

	@Override
	public void deleteMarque(Marque m) {
		marqueRepository.delete(m);
		
	}

	@Override
	public void deleteMarqueById(Long id) {
		marqueRepository.deleteById(id);
		
	}

	@Override
	public Marque getMarque(Long id) {
		
		return marqueRepository.findById(id).get();
	}

	@Override
	public List<Marque> getAllMarque() {

		return marqueRepository.findAll();
	}

}
