package guru.springframework.reactivebeerclient.config;

/**
 * Created by jt on 3/13/21.
 */
public class WebClientProperties {

    public static final String BASE_URL = "http://api.springframework.guru";
    public static final String BEER_V1_PATH = "/api/v1/beer";
    public static final String BEER_V1_PATH_GET_BY_ID = "/api/v1/beer/{uuid}";
    public static final String BEER_V1_UPC_PATH = "/api/v1/beerUpc/{upc}";
}
