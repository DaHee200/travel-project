package test.develop.controller

import io.swagger.v3.oas.annotations.tags.Tag
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/products")
@Tag(name = "product", description = "지역 상품(product)에 관련된 API")
class ProductController {
}