package com.example.demo.gsgsdg

import org.springframework.stereotype.Component
import reactor.core.publisher.Flux

@Component
class ItemService(
    private val itemRepo: ItemRepo
) {
    fun getAllItems(): Flux<Long> = itemRepo.findAll()
}