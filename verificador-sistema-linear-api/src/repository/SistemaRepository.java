package com.projeto.verificador.repository;

import com.projeto.verificador.model.SistemaEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SistemaRepository extends JpaRepository<SistemaEntity, Long> {
}
