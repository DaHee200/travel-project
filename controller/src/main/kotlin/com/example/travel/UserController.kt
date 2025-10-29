package com.example.travel

import io.swagger.v3.oas.annotations.Operation
import io.swagger.v3.oas.annotations.tags.Tag
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("users")
@Tag(name = "사용자 관련 API")
class UserController {

    @Operation(summary = "사용자 등록")
    @PostMapping("register")
    fun register() {

    }

    @Operation(summary = "사용자 리스트 조회")
    @GetMapping
    fun getList() {

    }

    @Operation(summary = "사용자 상세조회")
    @GetMapping("{userId}")
    fun getDetail(@PathVariable userId: String) {
    }

    @Operation(summary = "사용자 수정")
    @PutMapping("{userId}")
    fun update(@PathVariable userId: String) {
    }

    @Operation(summary = "사용자 단건 삭제")
    @DeleteMapping(("{userId}"))
    fun delete(@PathVariable userId: String) {

    }

    @Operation(summary = "사용자 여러개 삭제")
    @DeleteMapping(("{userIds}"))
    fun delete(@PathVariable userIds: List<String>) {

    }

}