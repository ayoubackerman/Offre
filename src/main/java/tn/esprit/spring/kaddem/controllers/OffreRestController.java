package tn.esprit.spring.kaddem.controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.spring.kaddem.entities.Offre;
import tn.esprit.spring.kaddem.services.IOffreService;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/offre")
public class OffreRestController {

	private final IOffreService offreService;
	// http://localhost:8089/Kaddem/departement/retrieve-all-departements
	@GetMapping("/retrieve-all-offres")
	public List<Offre> getoffres() {
		return offreService.retrieveAllOffre();
	}
	// http://localhost:8089/Kaddem/departement/retrieve-departement/8
	@GetMapping("/retrieve-offre/{offre-id}")
	public Offre retrieveOffre(@PathVariable("offre-id") Integer offreId) {
		return offreService.retrieveOffre(offreId);
	}

	// http://localhost:8089/Kaddem/departement/add-departement
	@PostMapping("/add-offre")
	public Offre addOffre(@RequestBody Offre d) {
		return offreService.addOffre(d);
	}

	// http://localhost:8089/Kaddem/departement/remove-departement/1
	@DeleteMapping("/remove-offre/{offre-id}")
	public void removeOffre(@PathVariable("offre-id") Integer departementId) {
		offreService.deleteOffre(departementId);
	}

	// http://localhost:8089/Kaddem/departement/update-departement
	@PutMapping("/update-offre")
	public Offre updateOffre(@RequestBody Offre e) {
		return offreService.updateOffre(e);
	}
}


