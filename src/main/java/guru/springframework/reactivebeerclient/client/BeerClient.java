package guru.springframework.reactivebeerclient.client;

import guru.springframework.reactivebeerclient.model.BeerDto;
import guru.springframework.reactivebeerclient.model.BeerPagedList;
import org.springframework.http.ResponseEntity;
import reactor.core.publisher.Mono;

import java.util.UUID;

/**
 * Created by jt on 3/13/21.
 */
public interface BeerClient {

    Mono<BeerDto> getBeerById(UUID id, Boolean showInventoryOnHand);

    Mono<BeerPagedList> listBeers(Integer pageNumber, Integer pageSize, String beerName,
                                  String beerStyle, Boolean showInventoryOnhand);

    Mono<ResponseEntity<Void>> createBeer(BeerDto beerDto);

    Mono<ResponseEntity<Void>> updateBeer(UUID beerId, BeerDto beerDto);

    Mono<ResponseEntity<Void>> deleteBeerById(UUID id);

    Mono<BeerDto> getBeerByUPC(String upc);
}
