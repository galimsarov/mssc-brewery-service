package guru.springframework.msscbreweryservice.repositories;

import guru.springframework.msscbreweryservice.domain.Beer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.UUID;

public interface BeerRepository extends PagingAndSortingRepository<Beer, UUID>, CrudRepository<Beer, UUID> {
}
