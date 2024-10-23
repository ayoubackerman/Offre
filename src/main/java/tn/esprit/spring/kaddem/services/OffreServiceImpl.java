package tn.esprit.spring.kaddem.services;

import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;
import tn.esprit.spring.kaddem.entities.Offre;
import tn.esprit.spring.kaddem.repositories.OffreRepository;

import java.util.List;
import java.util.Optional;

@Slf4j

@Service
public class OffreServiceImpl implements IOffreService {
  private final	OffreRepository offreRepository;

	public OffreServiceImpl(OffreRepository offreRepository) {
		this.offreRepository = offreRepository;
	}

	public List<Offre> retrieveAllOffre(){
		return (List<Offre>) offreRepository.findAll();
	}

	public Offre addOffre (Offre d){
		return offreRepository.save(d);
	}

	public Offre updateOffre (Offre d){
		return offreRepository.save(d);
	}

	public Offre retrieveOffre (Integer idDepart){
		return offreRepository.findById(idDepart).get();
	}
	public  void deleteOffre(Integer idDepartement){
		Optional<Offre> o = offreRepository.findById(idDepartement);
		if (o.isPresent()){
			Offre d=retrieveOffre(idDepartement);
			offreRepository.delete(d);
		}

	}



}
