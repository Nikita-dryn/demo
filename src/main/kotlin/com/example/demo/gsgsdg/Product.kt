package com.example.demo.gsgsdg

import org.springframework.data.relational.core.mapping.Table
import java.math.BigDecimal

@Table
data class Product
    (
    val id: Long,
    val productName: String,
    val company: String,
    val productCount: Int,
    val price: BigDecimal
)
