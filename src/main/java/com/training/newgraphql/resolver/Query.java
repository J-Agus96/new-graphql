package com.training.newgraphql.resolver;

import com.training.newgraphql.domain.Car;
import com.training.newgraphql.repository.CarRepository;
import graphql.PublicApi;
import graphql.kickstart.tools.GraphQLQueryResolver;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

//@ComponentScan
//@Component
@AllArgsConstructor
//@PublicApi
public class Query implements GraphQLQueryResolver {

//    @Autowired
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
