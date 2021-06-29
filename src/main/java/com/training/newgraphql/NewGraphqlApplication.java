package com.training.newgraphql;

import com.training.newgraphql.repository.CarRepository;
import com.training.newgraphql.resolver.Mutation;
import com.training.newgraphql.resolver.Query;
import graphql.kickstart.tools.SchemaParser;
import graphql.schema.GraphQLSchema;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class NewGraphqlApplication {

    public static void main(String[] args) {
        SpringApplication.run(NewGraphqlApplication.class, args);
    }

    @Autowired
    CarRepository carRepository;

    @Bean
    public GraphQLSchema schema() {
        return SchemaParser.newParser()
                .resolvers(mutation(carRepository), query(carRepository))
                .file("graphql/schemaNewCar.graphql")
                .build()
                .makeExecutableSchema();
    }

    @Bean
    public Query query(CarRepository carRepository) {
        return new Query(carRepository);
    }

    @Bean
    public Mutation mutation(CarRepository carRepository) {
        return new Mutation(carRepository);
    }


}
