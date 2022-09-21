package com.sarlanga.test.controller;

import com.sarlanga.test.model.EmpleadoResponse;
import com.sarlanga.test.domain.service.IEmpleadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class UserRegistryController {


    @Autowired
    IEmpleadoService iEmpleadoService;

    @RequestMapping(value = "/read_empleados", method = RequestMethod.GET)
    public ResponseEntity<EmpleadoResponse> retrieveEmployees(){

        iEmpleadoService.buscarEmpleados();
        String s = "";

        return null;
    }

    /*@RequestMapping(value = "/create_empleado", method = RequestMethod.POST)
    public String createEmployee(@Valid @RequestBody CreateEmpleadoRequest request) throws Exception {
        String info = "";
        return info = crearEmpleadoService.crearEmpleadoFullData(request);
    }*/

    @RequestMapping(value = "/update_empleado", method = RequestMethod.PUT)
    public String updateEmployees(){


        return null;
    }

}
