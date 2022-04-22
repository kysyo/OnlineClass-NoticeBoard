package com.onlinestudy.noticeborad.router;

import com.onlinestudy.noticeborad.handler.NoticeBoardHandler;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;
import org.springframework.web.reactive.function.server.ServerResponse;

import static org.springframework.web.reactive.function.server.RequestPredicates.GET;
import static org.springframework.web.reactive.function.server.RequestPredicates.POST;

@Configuration(proxyBeanMethods = false)
public class NoticeBoardRouter {

    NoticeBoardHandler noticeBoardHandler = new NoticeBoardHandler();

    @Bean
    public RouterFunction<ServerResponse> route() {
        return RouterFunctions
                .route(GET("/noticeboard/view"), noticeBoardHandler::viewNoticeBoardHandler)
                .andRoute(POST("/noticeboard/board/set"), noticeBoardHandler::writeBoardHandler)
                .andRoute(POST("/noticeboard/comment/set"), noticeBoardHandler::writeCommentHandler)
                .andRoute(POST("/noticeboard/operator/show"), noticeBoardHandler::showNoticeContentYnHandler)
                ;
    }
}
