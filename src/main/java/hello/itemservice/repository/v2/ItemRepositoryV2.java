package hello.itemservice.repository.v2;

import hello.itemservice.domain.Item;
import org.springframework.data.jpa.repository.JpaRepository;

// Spring Data Jpa는 스프링이 자동으로 스프링 bean등록을 해줘서 따로 Config 설정할 필요없음
public interface ItemRepositoryV2 extends JpaRepository<Item, Long> {
}
