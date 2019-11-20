package com.utbm.lo54.clientservice.repository;

import com.utbm.lo54.core.courses.domain.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {

}