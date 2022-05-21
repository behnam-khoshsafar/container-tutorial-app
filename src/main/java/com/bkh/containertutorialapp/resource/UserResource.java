package com.bkh.containertutorialapp.resource;

import com.bkh.containertutorialapp.model.UserModel;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class UserResource {

    @GetMapping(path = "/users", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<UserModel>> getUsers() {
        List<UserModel> users = Arrays.asList(new UserModel("Behnam", "Khoshsafar", 32),
                                              new UserModel("Faranak", "Fereidouni", 32));
        return ResponseEntity.ok(users);
    }

}
