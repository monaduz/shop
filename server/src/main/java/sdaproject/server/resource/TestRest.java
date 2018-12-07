package sdaproject.server.resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@RestController
public class TestRest {

    @GetMapping("/api/test")
    List<String> getProducts() {
        List<String> products = new ArrayList<>();
        products.add("Klej");
        products.add("Pasta");
        products.add("Proszek");
        products.add("Pen");
        products.add("Pan");
        return products;
    }
    @GetMapping("api/users")
    List<User> getUsers(){
        List<User> users = new ArrayList<>();
        users.add(new User("Mark","Bond",  LocalDate.of(1994, 11, 23)));
        users.add(new User("Mark","Bond",  LocalDate.of(1994, 11, 23)));
        users.add(new User("Mark","Bond",  LocalDate.of(1994, 11, 23)));
        users.add(new User("Mark","Bond",  LocalDate.of(1994, 11, 23)));
        return users;
    }
}