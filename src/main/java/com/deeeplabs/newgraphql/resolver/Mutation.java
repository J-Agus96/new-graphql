package com.deeeplabs.newgraphql.resolver;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.deeeplabs.newgraphql.domain.Car;
import com.deeeplabs.newgraphql.dto.CarDto;
import com.deeeplabs.newgraphql.repository.CarRepository;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

import javax.transaction.Transactional;
import java.time.OffsetDateTime;

@ComponentScan
//@Component
@Transactional
@AllArgsConstructor
public class Mutation implements GraphQLMutationResolver {

    @Autowired
    private CarRepository carRepository;

    public Car saveCar(CarDto carDto) {
        Car car = new Car();
        car.setCode(carDto.getCode());
        car.setName(carDto.getName());
        car.setTypeCar(carDto.getTypeCar());
        car.setCylinderCapacity(carDto.getCylinderCapacity());
        car.setTypeTransmission(carDto.getTypeTransmission());
        car.setColor(carDto.getColor());
        car.setPrice(carDto.getPrice());
        car.setCreatedAt(OffsetDateTime.now());

        return carRepository.save(car);
    }

    public Car updateCar(CarDto carDto) {
        Car car = carRepository.findById(carDto.getId()).orElseThrow(() -> new RuntimeException("No Car Found with Id " + carDto.getId()));
        car.setName(carDto.getName());
        car.setTypeCar(carDto.getTypeCar());
        car.setCylinderCapacity(carDto.getCylinderCapacity());
        car.setTypeTransmission(carDto.getTypeTransmission());
        car.setColor(carDto.getColor());
        car.setPrice(carDto.getPrice());
        car.setUpdatedAt(OffsetDateTime.now());

        return carRepository.save(car);
    }

    public boolean deleteCar(String id) {
        Car car = carRepository.findById(id).orElseThrow(() -> new RuntimeException("No Car Found with Id " + id));
        car.setDeleteFlag(true);
        car.setUpdatedAt(OffsetDateTime.now());
        carRepository.delete(car);
        return true;
    }

}
