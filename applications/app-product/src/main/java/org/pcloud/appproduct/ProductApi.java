package org.pcloud.appproduct;

import lombok.Getter;
import lombok.ToString;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RequestMapping("/product")
@RestControllerAdvice
public class ProductApi {

    @GetMapping("/hello")
    public Data hello(@RequestParam("msg") String msg) {
        return new Data(msg);
    }

    @ToString
    @Getter
    static class Data {
        private String msg;

        public Data(String msg) {
            this.msg = msg;
        }
    }
}
