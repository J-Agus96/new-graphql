package com.training.newgraphql.resolver;

import com.training.newgraphql.domain.Car;
import com.training.newgraphql.dto.CarDto;
import com.training.newgraphql.repository.CarRepository;
import graphql.kickstart.tools.GraphQLMutationResolver;
import lombok.AllArgsConstructor;

import javax.transaction.Transactional;
import java.time.OffsetDateTime;

@Transactional
@AllArgsConstructor
public class Mutation implements GraphQLMutationResolver {

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

    public Car updateCar(String id, CarDto carDto) {
        Car car = carRepository.findById(id).orElseThrow(() -> new RuntimeException("No Car Found with Id " + id));
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
