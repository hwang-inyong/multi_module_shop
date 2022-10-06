package shop.api.user;

import shop.user.service.UserService;
import shop.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.ObjectUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/create-user")
    public ResponseEntity createUser() {
        User user = new User();
        user.setUserId(1);
        user.setLoginId("tester");
        User savedUser = userService.createUser(user);
        return new ResponseEntity<>(savedUser, HttpStatus.OK);
    }

    @GetMapping("/update-user")
    public ResponseEntity updateUser() {
        User user = new User();
        user.setUserId(1);
        user.setLoginId("tester-1");
        User updatedUser = userService.updateUser(user);

        if (!ObjectUtils.isEmpty(updatedUser)) {
            return new ResponseEntity<>(updatedUser, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(user, HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping("/userList")
    public ResponseEntity getUserList() {
        List<User> userList = userService.getUserList();
        return new ResponseEntity<>(userList, HttpStatus.OK);
    }

    @GetMapping("/user")
    public ResponseEntity getUser() {
        long id = 1;
        User user = userService.getUser(id);
        return new ResponseEntity<>(user, HttpStatus.OK);
    }

    @GetMapping("/delete-user")
    public ResponseEntity deleteUser() {
        long id = 1;
         userService.deleteUser(id);
        return new ResponseEntity<>(id, HttpStatus.OK);
    }
}
