package com.moises.Lombok.PrjLombok.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.moises.Lombok.PrjLombok.entities.Usuario;

public interface Repository extends JpaRepository <Usuario, Long>{

}
