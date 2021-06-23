package com.deeeplabs.newgraphql.dto;

import lombok.Data;

import java.math.BigDecimal;
import java.time.OffsetDateTime;

@Data
public class CarDto {

    private String id;

    private String code;

    private String name;

    private String color;

    private String typeCar;

    private String typeTransmission;

    private int cylinderCapacity;

    private BigDecimal price;

    private Boolean deleteFlag;

    private OffsetDateTime createdAt;

    private OffsetDateTime updatedAt;

}
