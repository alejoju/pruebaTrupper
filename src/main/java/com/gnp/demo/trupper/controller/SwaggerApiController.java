package com.gnp.demo.trupper.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import springfox.documentation.annotations.ApiIgnore;

@Controller
@ApiIgnore
@RequestMapping("/rest/trupper")
public class SwaggerApiController {

    /**
     * Index.
     *
     * @return the string
     */
    @GetMapping(value = "swagger-ui.html")
    public String index() {
        return "forward:/swagger-ui.html";
    }

    /**
     * Docs.
     *
     * @return the string
     */
    @GetMapping(value = "v2/api-docs")
    public String docs() {
        return "forward:/v2/api-docs";
    }

    /**
     * Ui.
     *
     * @return the string
     */
    @GetMapping(value = "swagger-resources/configuration/ui")
    public String ui() {
        return "forward:/swagger-resources/configuration/ui";
    }

    /**
     * Resources.
     *
     * @return the string
     */
    @GetMapping(value = "swagger-resources")
    public String resources() {
        return "forward:/swagger-resources";
    }

    /**
     * Security.
     *
     * @return the string
     */
    @GetMapping(value = "swagger-resources/configuration/security")
    public String security() {
        return "forward:/swagger-resources/configuration/security";
    }

    /**
     * spring fox css.
     *
     * @return the string
     */
    @GetMapping(value = "webjars/springfox-swagger-ui/springfox.css")
    public String springfoxCSS() {
        return "forward:/webjars/springfox-swagger-ui/springfox.css";
    }

    /**
     * swagger ui css.
     *
     * @return the string
     */
    @GetMapping(value = "webjars/springfox-swagger-ui/swagger-ui.css")
    public String swaggeruiCSS() {
        return "forward:/webjars/springfox-swagger-ui/swagger-ui.css";
    }

    /**
     * swaggeruibundle js.
     *
     * @return the string
     */
    @GetMapping(value = "webjars/springfox-swagger-ui/swagger-ui-bundle.js")
    public String swaggeruibundleJS() {
        return "forward:/webjars/springfox-swagger-ui/swagger-ui-bundle.js";
    }

    /**
     * swagger ui standalone js.
     *
     * @return the string
     */
    @GetMapping(value = "webjars/springfox-swagger-ui/swagger-ui-standalone-preset.js")
    public String swaggeruistandalonepresetJS() {
        return "forward:/webjars/springfox-swagger-ui/swagger-ui-standalone-preset.js";
    }

    /**
     * spring fox js.
     *
     * @return the string
     */
    @GetMapping(value = "webjars/springfox-swagger-ui/springfox.js")
    public String springfoxJS() {
        return "forward:/webjars/springfox-swagger-ui/springfox.js";
    }
}

