package tn.esprit.spring.kaddem.entities;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;

@Entity
@Data
public class Offre implements Serializable{
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer idOffre;
    private Long reference ;
    private String title;
    private String location;
    private String description ;
    private Date deadline ;
    private String contratType;
    private String skills ;
    private String experienceLevel ;


}
