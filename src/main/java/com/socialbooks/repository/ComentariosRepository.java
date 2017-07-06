package com.socialbooks.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.socialbooks.domain.Comentario;

@Repository
public interface ComentariosRepository extends JpaRepository<Comentario, Long> {

}
