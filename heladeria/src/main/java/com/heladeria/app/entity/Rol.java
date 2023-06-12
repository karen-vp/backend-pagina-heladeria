package com.heladeria.app.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data 
@Table(name="roles")
public class Rol {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int rolId;
	@Column(name="rol_nombre", nullable=false, length=20)
	private String rolNombre;
	
	
	
	@Override
	  public String toString() {
	    return String.format(
	        "Cliente[id=%d, nombre='%s']",
	        rolId, rolNombre);
	  }
}
