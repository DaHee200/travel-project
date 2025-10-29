package com.example.travel

import io.swagger.v3.oas.annotations.Operation
import io.swagger.v3.oas.annotations.tags.Tag
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("regions")
@Tag(name = "지역 관련 API")
class RegionController {
    @Operation(summary = "지역 등록")
    @PostMapping
    fun register() {
    }

    @Operation(summary = "지역 리스트 조회")
    @GetMapping
    fun getList() {

    }

    @Operation(summary = "지역 상세조회")
    @GetMapping("{regionId}")
    fun getDetail(@PathVariable regionId: String) {
    }

    @Operation(summary = "지역 수정")
    @PutMapping("{regionId}")
    fun update(@PathVariable regionId: String) {
    }

    @Operation(summary = "지역 단건 삭제")
    @DeleteMapping("{regionId}")
    fun delete(@PathVariable reionId: String) {
    }

    @Operation(summary = "지역 여러개 삭제")
    @DeleteMapping("{regionsIds}")
    fun deleteList(@PathVariable regionIds: String) {
    }
}