/**
 * 
 */
package com.patrimonio.br.model;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;

/**
 * @author welinton
 *
 */
@Entity
public class Item {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_item;

	@NotEmpty
	private String etiqueta;

	@NotEmpty
	private String descricao;

	private LocalDate dataAquisicao;

	/**
	 * @return the id_item
	 */
	public Long getId_item() {
		return id_item;
	}

	/**
	 * @param id_item
	 *            the id_item to set
	 */
	public void setId_item(Long id_item) {
		this.id_item = id_item;
	}

	/**
	 * @return the etiqueta
	 */
	public String getEtiqueta() {
		return etiqueta;
	}

	/**
	 * @param etiqueta
	 *            the etiqueta to set
	 */
	public void setEtiqueta(String etiqueta) {
		this.etiqueta = etiqueta;
	}

	/**
	 * @return the descricao
	 */
	public String getDescricao() {
		return descricao;
	}

	/**
	 * @param descricao
	 *            the descricao to set
	 */
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	/**
	 * @return the dataAquisicao
	 */
	public LocalDate getDataAquisicao() {
		return dataAquisicao;
	}

	/**
	 * @param dataAquisicao
	 *            the dataAquisicao to set
	 */
	public void setDataAquisicao(LocalDate dataAquisicao) {
		this.dataAquisicao = dataAquisicao;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id_item == null) ? 0 : id_item.hashCode());
		return result;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Item other = (Item) obj;
		if (id_item == null) {
			if (other.id_item != null)
				return false;
		} else if (!id_item.equals(other.id_item))
			return false;
		return true;
	}

}
