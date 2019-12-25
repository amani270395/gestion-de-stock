package com.chaouachi.stock.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class LigneCommandeFournisseur implements Serializable {
	@Id
	@GeneratedValue
	private Long idLigneCommandeFournisseur;
	
	@ManyToOne
	@JoinColumn(name="idArticle")
	private Article article;
	@ManyToOne
	@JoinColumn(name="idCommandeFournisseur")
	private CommandeFournisseur comandeFournisseur;

	public Long getIdLigneCommandeFournisseur() {
		return idLigneCommandeFournisseur;
	}

	public void setIdLigneCommandeFournisseur(Long idLigneCommandeFournisseur) {
		this.idLigneCommandeFournisseur = idLigneCommandeFournisseur;
	}

	public Article getArticle() {
		return article;
	}

	public void setArticle(Article article) {
		this.article = article;
	}

	public CommandeFournisseur getComandeFournisseur() {
		return comandeFournisseur;
	}

	public void setComandeFournisseur(CommandeFournisseur comandeFournisseur) {
		this.comandeFournisseur = comandeFournisseur;
	}
	

}
