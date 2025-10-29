package com.example.travel

import io.swagger.v3.oas.annotations.Operation
import io.swagger.v3.oas.annotations.tags.Tag
import org.springframework.web.bind.annotation.*


@RestController
@RequestMapping("admins")
@Tag(name = "관리자 관련 API")
class adminController {

    @Operation(summary = "관리자 등록")
    @PostMapping
    fun create() {
    }

    @Operation(summary = "관리자 리스트 조회")
    @GetMapping
    fun getList() {
    }

    @Operation(summary = "관리자 상세조회")
    @GetMapping("{adminId}")
    fun getDetail(@PathVariable adminId: String) {
    }

    @Operation(summary = "관리자 수정")
    @PutMapping("{adminId}")
    fun update(@PathVariable adminId: String) {
    }

    @Operation(summary = "관리자 단건 삭제")
    @DeleteMapping("{adminId}")
    fun delete(@PathVariable adminId: String) {

    }

    @Operation(summary = "관리자 여러개 삭제")
    @DeleteMapping("{adminIds}")
    fun deleteList(@PathVariable adminIds: List<String>) {

    }
}