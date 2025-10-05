package test.develop.controller

import io.swagger.v3.oas.annotations.tags.Tag
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/histories")
@Tag(name = "history", description = "나의 여정(history) 관련 API")
class HistoryController {
}