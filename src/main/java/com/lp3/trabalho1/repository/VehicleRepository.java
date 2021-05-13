package com.lp3.trabalho1.repository;


import com.lp3.trabalho1.domain.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VehicleRepository extends JpaRepository<Vehicle, Integer> {
}
