package com.certus.challenge.persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.certus.challenge.model.JugadorModel;

@Repository
public interface IJugadorRepository extends JpaRepository<JugadorModel, Integer> {

}
