package com.example.demo.entity;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="POST")

public class PostEntity implements Serializable{
	

	/**
	 * 
	 */
	private static final long serialVersionUID = 2000567672298399538L;

	@Id
  	@Column(name = "IDPOST")
  	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seqProducto")
    @SequenceGenerator(sequenceName = "SEQ_POST", allocationSize = 1, name = "seqPost")
	private Long id;
  
  	@Column(name = "TITULO")
  	private String titulo;
  	
  	@Column(name = "DESCRIPCION")
  	private String descripcion;

  	@Column(name = "ESTADO")
  	private Double estado;

  	


}