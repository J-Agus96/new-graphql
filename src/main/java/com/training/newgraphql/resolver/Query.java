package com.training.newgraphql.resolver;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.training.newgraphql.domain.Car;
import com.training.newgraphql.repository.CarRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

//@ComponentScan
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
