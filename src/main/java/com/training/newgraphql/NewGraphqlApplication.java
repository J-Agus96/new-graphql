package com.training.newgraphql;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

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
//				.file("schemaNewCar.graphql")
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
