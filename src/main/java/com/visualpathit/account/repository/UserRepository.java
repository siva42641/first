package com.visualpathit.account.repository;

<<<<<<< HEAD
=======
import java.util.List;

>>>>>>> vp-rem
import org.springframework.data.jpa.repository.JpaRepository;

import com.visualpathit.account.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
<<<<<<< HEAD
=======
    User findById(long id);
    /*public void updateUser(User user)*/;
    
>>>>>>> vp-rem
}
