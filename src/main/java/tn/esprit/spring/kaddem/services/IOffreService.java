package tn.esprit.spring.kaddem.services;

import tn.esprit.spring.kaddem.entities.Offre;

import java.util.List;

public interface IOffreService {
    public List<Offre> retrieveAllOffre();

    public Offre addOffre (Offre d);

    public Offre updateOffre (Offre d);

    public Offre retrieveOffre (Integer idDepart);

    public  void deleteOffre(Integer idDepartement);

}
