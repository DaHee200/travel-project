package com.example.travel

import io.swagger.v3.oas.annotations.Operation
import io.swagger.v3.oas.annotations.tags.Tag
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("products")
@Tag(name = "지역 상품 관련 API")
class ProductController {

    @Operation(summary = "지역 상품 등록")
    @PostMapping
    fun register() {

    }

    @Operation(summary = "지역 상품 리스트 조회")
    @GetMapping
    fun getList() {
    }

    @Operation(summary = "지역 상품 상세 조회")
    @GetMapping("{productId}")
    fun getDetail(@PathVariable productId: String) {

    }

    @Operation(summary = "지역 상품 수정")
    @PutMapping("{productId}")
    fun update(@PathVariable productId: String) {

    }

    @Operation(summary = "지역 상품 단건 삭제")
    @DeleteMapping("{productId}")
    fun delete(@PathVariable productId: String) {
    }

    @Operation(summary = "지역 상품 여러개 삭제")
    @DeleteMapping("{productIds}")
    fun deleteList(@PathVariable productIds: List<String>) {
    }

}