package br.com.gft.learnSpring.resources;

import br.com.gft.learnSpring.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
public class UserResources {
    @GetMapping
    public ResponseEntity<User> findAll(){
        User u = new User(1L, "marlon ergon dos santos", "marlonergondossantos@gmail.com", "4195490128", "egvtest");
        return ResponseEntity.ok().body(u);
    }
}
