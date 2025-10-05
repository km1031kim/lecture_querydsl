package study.querydsl.repository;

import com.querydsl.jpa.impl.JPAQueryFactory;
import jakarta.persistence.EntityManager;
import org.springframework.stereotype.Repository;

/**
 * 특정 API나 화면에 종속된 기능이다 -> 클래스 분리. 조회용 레포지토리를 따로 만든다.
 * 너무 프로젝트가 커진다 -> 분리
 */
@Repository
public class MemberQueryRepository {

    private final JPAQueryFactory queryFactory;

    public MemberQueryRepository(EntityManager em) {
        this.queryFactory = new JPAQueryFactory(em);
    }
}
