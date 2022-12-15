package com.example.demo.gsgsdg

import org.springframework.data.repository.reactive.ReactiveCrudRepository
import org.springframework.stereotype.Repository

@Repository
interface ItemRepo: ReactiveCrudRepository<Long, Product>