package com.example.demo.gsgsdg

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import reactor.core.publisher.Flux

@RestController
@RequestMapping("/")
class ProductC(
    private val itemService: ItemService
) {

    @GetMapping
    fun getAll(): Flux<Long> {
        return itemService.getAllItems()
    }

}