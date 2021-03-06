package co.simplon.domain;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
public class Stage {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	private Integer nombre_min;
	private Integer nombre_max;
	private Integer nbr_stagiaire;
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	private Date date_limite_inscription;
	@OneToOne(mappedBy = "stage")
	private Evenement evenement;
	@ManyToOne
	private Ceramiste ceramiste;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Integer getNombre_min() {
		return nombre_min;
	}
	public void setNombre_min(Integer nombre_min) {
		this.nombre_min = nombre_min;
	}
	public Integer getNombre_max() {
		return nombre_max;
	}
	public void setNombre_max(Integer nombre_max) {
		this.nombre_max = nombre_max;
	}
	public Integer getNbr_stagiaire() {
		return nbr_stagiaire;
	}
	public void setNbr_stagiaire(Integer nbr_stagiaire) {
		this.nbr_stagiaire = nbr_stagiaire;
	}
	public Date getDate_limite_inscription() {
		return date_limite_inscription;
	}
	public void setDate_limite_inscription(Date date_limite_inscription) {
		this.date_limite_inscription = date_limite_inscription;
	}
	public Evenement getEvenement() {
		return evenement;
	}
	public void setEvenement(Evenement evenement) {
		this.evenement = evenement;
	}
	public Ceramiste getCeramiste() {
		return ceramiste;
	}
	public void setCeramiste(Ceramiste ceramiste) {
		this.ceramiste = ceramiste;
	}
}
