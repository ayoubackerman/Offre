package tn.esprit.spring.kaddem.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;
import tn.esprit.spring.kaddem.entities.Offre;
import tn.esprit.spring.kaddem.repositories.OffreRepository;

import java.util.List;

@Slf4j

@Service
public class OffreServiceImpl implements IOffreService {
	@Autowired
	OffreRepository departementRepository;
	public List<Offre> retrieveAllOffre(){
		return (List<Offre>) departementRepository.findAll();
	}

	public Offre addOffre (Offre d){
		return departementRepository.save(d);
	}

	public Offre updateOffre (Offre d){
		return departementRepository.save(d);
	}

	public Offre retrieveOffre (Integer idDepart){
		return departementRepository.findById(idDepart).get();
	}
	public  void deleteOffre(Integer idDepartement){
		Offre d=retrieveOffre(idDepartement);
		departementRepository.delete(d);
	}



}
