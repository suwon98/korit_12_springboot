package com.korit12.cardatabase00;

import com.korit12.cardatabase00.domain.Car;
import com.korit12.cardatabase00.domain.CarRepository;
import com.korit12.cardatabase00.domain.Owner;
import com.korit12.cardatabase00.domain.OwnerRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


import java.util.Arrays;

@SpringBootApplication
public class Cardatabase00Application implements CommandLineRunner {
	private static final Logger logger = LoggerFactory.getLogger(Cardatabase00Application.class);


    public Cardatabase00Application(CarRepository carRepository, OwnerRepository ownerRepository) {
        this.carRepository = carRepository;
        this.ownerRepository = ownerRepository;
    }

    public static void main(String[] args) {
		SpringApplication.run(Cardatabase00Application.class, args);
		logger.info("애플리케이션이 실행됩니다.");
	}

	private final CarRepository carRepository;
	private final OwnerRepository ownerRepository;

@Override
    public void run(String... args) throws Exception {
		Owner owner1 = new Owner("김", "일");
		Owner owner2 = new Owner("Jone", "Doe");

		ownerRepository.saveAll(Arrays.asList(owner1, owner2));
		carRepository.save(new Car("현대", "소나타", "검정", "123가4567", 2026, 30000000, owner1));
		carRepository.save(new Car("기아", "K9", "흰색", "987나5432", 2025, 20000000, owner2));
		carRepository.save(new Car("람보르기니", "쿤타치", "빨강", "159다7532", 2010, 130000000, owner2));
    }
}
