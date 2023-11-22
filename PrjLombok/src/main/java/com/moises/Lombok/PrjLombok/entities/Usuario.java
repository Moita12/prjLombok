package com.moises.Lombok.PrjLombok.entities;

import java.util.List;
import java.util.Optional;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Table(name="usuario")
public class Usuario {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@NotBlank
	@NotNull
	private String nome;
	
	@NotBlank
	@NotNull
	@Email(message = "digite o email corretamente")
	private String email;
	
	public Object getNome() {
		// TODO Auto-generated method stub
		return null;
	}
	public Object getEmail() {
		// TODO Auto-generated method stub
		return null;
	}
	public void setEmail(Object email2) {
		// TODO Auto-generated method stub
		
	}
	public void setNome(Object nome2) {
		// TODO Auto-generated method stub
		
	}
	public void deleteById(Long id2) {
		// TODO Auto-generated method stub
		
	}
	public Optional<Usuario> findById(Long id2) {
		// TODO Auto-generated method stub
		return null;
	}
	public List<Usuario> findAll() {
		// TODO Auto-generated method stub
		return null;
	}
	public Usuario save(Usuario usuarioExistente) {
		// TODO Auto-generated method stub
		return null;
	}
}
