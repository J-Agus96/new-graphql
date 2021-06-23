package com.training.newgraphql.domain;

import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.OffsetDateTime;

@Data
@Entity
@Table(name = "car_new_graphql")
public class Car {

    @Id
    @GeneratedValue(generator = "system-uuid")
    @GenericGenerator(name = "system-uuid", strategy = "uuid2")
    @Column(name = "id")
    private String id;

    @Column(name = "code")
    private String code;

    @Column(name = "name")
    private String name;

    @Column(name = "color")
    private String color;

    @Column(name = "type_car")
    private String typeCar;

    @Column(name = "type_transmission")
    private String typeTransmission;

    @Column(name = "cylinder_capacity")
    private int cylinderCapacity;

    @Column(name = "price")
    private BigDecimal price;

    @Column(name = "delete_flag")
    private boolean deleteFlag;

    @Column(name = "created_at")
    private OffsetDateTime createdAt;

    @Column(name = "updated_at")
    private OffsetDateTime updatedAt;


}
