package guru.qa.demoback.controller;

import guru.qa.demoback.domain.Request;
import guru.qa.demoback.domain.Response;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Api
public class DemoController {

    @PostMapping("user/create")
    @ApiOperation("Тестовый метод")
    public Response postEndpoint(@RequestBody Request request) {
        Response response = new Response();
        response.setName(request.getName());
        return response;
    }
}
