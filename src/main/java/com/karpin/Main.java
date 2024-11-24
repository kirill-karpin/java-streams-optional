package com.karpin;

import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        // Доработайте данный метод, чтобы на экран выводилось
        // сообщение в соответствии с заданием

        SearchService searchService = new SearchService();
        Optional<Candy> result = searchService.search("Африка");
        if (result.isPresent()) {
            System.out.printf("Товар \"%s\" доступен в количестве %s кг по цене %s руб за кг",
                    result.get().getName(),
                    result.get().getPrice(),
                    result.get().getAmount()
            );
        } else {
            System.out.println("Данный товар не найден");
        }
    }
}