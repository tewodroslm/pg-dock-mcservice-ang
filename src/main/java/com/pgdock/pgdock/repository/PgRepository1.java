package com.pgdock.pgdock.repository;

import com.pgdock.pgdock.model.PgModel1;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PgRepository1 extends JpaRepository<PgModel1, Integer> {
}
