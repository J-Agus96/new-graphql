package com.training.newgraphql.resolver;

import com.training.newgraphql.domain.Car;
import com.training.newgraphql.repository.CarRepository;
import graphql.kickstart.tools.GraphQLQueryResolver;
import lombok.AllArgsConstructor;

import java.util.List;
import java.util.Optional;

@AllArgsConstructor
public class Query implements GraphQLQueryResolver {

    private CarRepository carRepository;

    public List<Car> findAllCars() {
        return carRepository.findAll();
    }

    public Car findCarById(String id) {
        try {
            Optional<Car> book = carRepository.findById(id);
            if (book.isPresent()) {
                return book.get();
            }
        } catch (Exception e) {
            // TODO: handle exception
        }
        return null;
    }


}
