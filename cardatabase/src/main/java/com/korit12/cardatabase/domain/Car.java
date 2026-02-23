package com.korit12.cardatabase.domain;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;


@Entity
// Lombok을 의존성 주입하고, Car 클래스를 롬복 적용 버전으로 다 수정하시오.
// 이후 동일하게 localhost:8080/h2-console 을 통해서 접속에 성공하시오.
@Data
@NoArgsConstructor
@RequiredArgsConstructor
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @NonNull
    private String brand;
    @NonNull
    private String model;
    @NonNull
    private String color;
    @NonNull
    private String registrationNumber;
    @NonNull
    private int modelYear;
    @NonNull
    private int price;

    @ManyToOne
    @JoinColumn(name = "owner")     // 컬럼명은 제가 지었습니다.
    @NonNull
    private Owner owner;        // @NonNull이 없으니까 얘는 옵셔널이라고 봐야겠네요.


}
