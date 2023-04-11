package com.example.marque.service;


import java.util.List;

import com.example.marque.entities.Marque;
public interface MarqueService {
	Marque saveMarque(Marque m);
	Marque updateMarque(Marque m);
	void deleteMarque(Marque m);
	 void deleteMarqueById(Long id);
	 Marque getMarque(Long id);
	List<Marque > getAllMarque();
	
	
}
