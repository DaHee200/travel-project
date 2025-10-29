package com.example.travel

import io.swagger.v3.oas.annotations.Operation
import io.swagger.v3.oas.annotations.tags.Tag
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("records")
@Tag(name = "여행 기록 관련 API")
class RecordController {
    @Operation(summary = "기록 등록")
    @PostMapping
    fun register() {
    }

    @Operation(summary = "사용자의 기록 리스트 조회")
    @GetMapping("{userId}")
    fun getUserList(@PathVariable userId: String) {

    }

    @Operation(summary = "전체 기록 리스트 조회")
    @GetMapping
    fun getList() {

    }

    @Operation(summary = "기록 상세 조회")
    @GetMapping("{recordId}")
    fun getDetail(@PathVariable recordId: String) {

    }

    @Operation(summary = "기록 단건 삭제")
    @DeleteMapping("{recordId}")
    fun delete(@PathVariable recordId: String) {

    }

    @Operation(summary = "기록 여러건 삭제")
    @DeleteMapping("{recordIds}")
    fun deleteList(recordIds: List<String>) {
    }

}