package test.develop.controller

import io.swagger.v3.oas.annotations.tags.Tag
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/regions")
@Tag(name = "region", description = "지역 추천 관련 API")
class RegionController {
}