package com.lp3.trabalho1.repository;

import com.lp3.trabalho1.domain.Company;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompanyRepository extends JpaRepository<Company, Integer> {
}
