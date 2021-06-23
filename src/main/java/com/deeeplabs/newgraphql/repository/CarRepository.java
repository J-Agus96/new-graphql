package com.deeeplabs.newgraphql.repository;

import com.deeeplabs.newgraphql.domain.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarRepository extends JpaRepository<Car, String> {


}
