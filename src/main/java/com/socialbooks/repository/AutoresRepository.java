package com.socialbooks.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.socialbooks.domain.Autor;

@Repository
public interface AutoresRepository extends JpaRepository<Autor, Long> {

}
