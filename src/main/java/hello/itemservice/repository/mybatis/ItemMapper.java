package hello.itemservice.repository.mybatis;

import hello.itemservice.domain.Item;
import hello.itemservice.repository.ItemSearchCond;
import hello.itemservice.repository.ItemUpdateDto;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Optional;

// 1. 에플리케이션 로딩 시점에 MyBatis 스프링 연동 모듈은 @Mapper가 붙어있는 인터페이스를 찾는다.
// 2. 해당 인터페이스가 발견되면 동적 프록시 기술을 사용해서 ItemMapper 인터페이스의 구현체를 만든다.
// 3. 생성된 구현체를 스프링 빈으로 자동 등록해준다.
@Mapper
public interface ItemMapper {

    // parameter가 하나인 경우에는 @Param을 안넣어도 되는데 2개 이상일때는 넣어주어야 한다.

    void save(Item item);

    void update(@Param("id") Long id, @Param("updateParam") ItemUpdateDto itemUpdateDto);

    Optional<Item> findById(Long id);

    List<Item> findAll(ItemSearchCond itemSearchCond);
}
