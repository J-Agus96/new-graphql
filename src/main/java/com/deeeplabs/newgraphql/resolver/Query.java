package com.deeeplabs.newgraphql.resolver;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.deeeplabs.newgraphql.domain.Car;
import com.deeeplabs.newgraphql.repository.CarRepository;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@ComponentScan
//@Component
@AllArgsConstructor
public class Query implements GraphQLQueryResolver {

    @Autowired
    private CarRepository carRepository;

    public List<Car> findAllCars() {
        return carRepository.findAll();
    }

    public Optional<Car> findCarById(String id) {
        return carRepository.findById(id);
    }


}
