package com.vinsys.devops;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.xml.ws.Response;

@RestController
public class LoginAPI {

    @PostMapping(produces = "application/json", path = "login")
    @ResponseBody
    public ResponseEntity<LoginResponse> login(@RequestBody LoginRequest request){
        LoginResponse response = new LoginResponse();
        boolean error = false;
        if(request.getUsername() == null || request.getUsername().length()==0){
            response.setErrorMessage("Username Should be supplied");
            response.setStatus(2);
            error = true;
        }

        if(error){
            return ResponseEntity.status(500).body(response);
        }else{
            return ResponseEntity.status(200).body(response);
        }
    }
}
