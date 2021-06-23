package com.deeeplabs.newgraphql;

import com.coxautodev.graphql.tools.SchemaParser;
import com.deeeplabs.newgraphql.repository.CarRepository;
import com.deeeplabs.newgraphql.resolver.Mutation;
import com.deeeplabs.newgraphql.resolver.Query;
import graphql.execution.AsyncExecutionStrategy;
import graphql.execution.ExecutionStrategy;
import graphql.schema.GraphQLSchema;
import graphql.servlet.GraphQLServlet;
import graphql.servlet.SimpleGraphQLServlet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@SpringBootApplication
public class NewGraphqlApplication {

	public static void main(String[] args) {
		SpringApplication.run(NewGraphqlApplication.class, args);
	}

//	@Autowired
//	CarRepository carRepository;

//	@Bean
//	public ServletRegistrationBean servletRegistrationBean() {
//
//		GraphQLSchema schema  = SchemaParser.newParser()
//				.resolvers(mutation(carRepository), query(carRepository))
//				.file("graphql/schemaNewCar.graphql")
//				.build().makeExecutableSchema();
//		ExecutionStrategy executionStrategy = new AsyncExecutionStrategy();
//		GraphQLServlet servlet = new SimpleGraphQLServlet(schema, executionStrategy);
//		ServletRegistrationBean bean = new ServletRegistrationBean(servlet, "/graphql");
//		return bean;
//	}

//	@Bean
//	public Query query(CarRepository carRepository) {
//		return new Query(carRepository);
//	}

//	@Bean
//	public Mutation mutation(CarRepository carRepository) {
//		return new Mutation(carRepository);
//	}

//	@Bean
//	public WebMvcConfigurer corsConfigurer() {
//		return new WebMvcConfigurerAdapter() {
//			@Override
//			public void addCorsMappings(CorsRegistry registry) {
//				registry.addMapping("*").allowedOrigins("http://localhost:*");
//			}
//		};
//	}

}
