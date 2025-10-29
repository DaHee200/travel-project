package com.example.travel

import io.swagger.v3.oas.annotations.Operation
import io.swagger.v3.oas.annotations.tags.Tag
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("themes")
@Tag(name = "테마관련 API")
class ThemeController {

    @Operation(summary = "테마 등록")
    @PostMapping
    fun register() {
    }

    @Operation(summary = "테마 리스트 조회")
    @GetMapping
    fun getList() {
    }

    @Operation(summary = "테마 상세조회")
    @GetMapping("{themeId}")
    fun getDetail(@PathVariable themeId: String) {
    }

    @Operation(summary = "테마 수정")
    @PutMapping("{themeId}")
    fun update(@PathVariable themeId: String) {
    }

    @Operation(summary = "테마 단건 삭제")
    @DeleteMapping("{themeId}")
    fun delete(@PathVariable themeId: String) {
    }

    @Operation(summary = "테마 여러개 삭제")
    @DeleteMapping("{themeIds}")
    fun deleteList(@PathVariable themeIds: List<String>) {
    }
}