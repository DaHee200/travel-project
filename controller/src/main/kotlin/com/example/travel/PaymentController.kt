package com.example.travel

import io.swagger.v3.oas.annotations.Operation
import io.swagger.v3.oas.annotations.tags.Tag
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("payments")
@Tag(name = "결제 관련 시스템 API")
class PaymentController {
    @Operation(summary = "결제 내용 전체 조회 API")
    @GetMapping
    fun getList() {
    }

    @Operation(summary = "결제 내용 사용자 기준 조회 API")
    @GetMapping("{userId}")
    fun getUserPaymentList(@PathVariable userId: String) {

    }

    @Operation(summary = "결제 내용 상세 조회 API")
    @GetMapping("{paymentId}")
    fun getDetail(@PathVariable paymentId: String) {

    }
}