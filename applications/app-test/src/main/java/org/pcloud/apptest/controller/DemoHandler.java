package org.pcloud.apptest.controller;

import org.springframework.context.annotation.Bean;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.BodyInserters;
import org.springframework.web.reactive.function.server.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.Collections;
import java.util.Map;
import java.util.stream.Stream;

@Component
public class DemoHandler {
    @Bean
    public RouterFunction<ServerResponse> routes() {
        return RouterFunctions.route(
                        RequestPredicates.GET("/hello"), this::hello)
                .andRoute(
                        RequestPredicates.GET("/stream-hello"), this::stream
                );
    }

    public Mono<ServerResponse> hello(ServerRequest request) {
        return ServerResponse.ok()
                .body(Flux.just("Hello", " ", "World"), String.class);
    }

    public Mono<ServerResponse> stream(ServerRequest request) {
        Stream<Integer> stream = Stream.iterate(0, i -> i + 1);
        Flux<Map<String, Integer>> flux = Flux.fromStream(stream)
                .map(i -> Collections.singletonMap("value", i));

        return ServerResponse.ok().contentType(MediaType.APPLICATION_JSON)
                .body(BodyInserters.fromPublisher(flux, new ParameterizedTypeReference<Map<String, Integer>>() {}));
    }
}
