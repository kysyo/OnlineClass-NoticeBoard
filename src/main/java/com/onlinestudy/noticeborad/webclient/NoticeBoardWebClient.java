package com.onlinestudy.noticeborad.webclient;

import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;

@Component
public class NoticeBoardWebClient {

    private final WebClient client;
    public NoticeBoardWebClient(WebClient.Builder builder) {
        this.client = builder.baseUrl("http://localhost:8082").build();
    }

}
