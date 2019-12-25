package com.chaouachi.stock.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class LigneCommandeClient implements Serializable {
	@Id
	@GeneratedValue
	private Long idLigneCommandeClient;

	@ManyToOne
	@JoinColumn(name="idArticle")
	private Article article;
	@ManyToOne
	@JoinColumn(name="idCommandeClient")
	private CommandeClient comandeClient;
	
	
	public Long getIdLigneCommandeClient() {
		return idLigneCommandeClient;
	}

	public void setIdLigneCommandeClient(Long idLigneCommandeClient) {
		this.idLigneCommandeClient = idLigneCommandeClient;
	}

	public Article getArticle() {
		return article;
	}

	public void setArticle(Article article) {
		this.article = article;
	}

	public CommandeClient getComandeClient() {
		return comandeClient;
	}

	public void setComandeClient(CommandeClient comandeClient) {
		this.comandeClient = comandeClient;
	}
	
	

}
