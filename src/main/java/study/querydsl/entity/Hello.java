package study.querydsl.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Hello {

    @Id
    @GeneratedValue
    private Long id;

    // QType을 뽑아내고 쿼리를 한다.

}
