package com.visualpathit.account.service;

<<<<<<< HEAD
=======
import java.util.List;

>>>>>>> vp-rem
import com.visualpathit.account.model.User;

/** {@author waheedk}!*/
public interface UserService {
	/** {@inheritDoc}} !*/
    void save(User user);
    /** {@inheritDoc}} !*/
    User findByUsername(String username);
<<<<<<< HEAD
=======
    User findById(long id);
    /*public void updateUser(User user);*/
    public List <User> getList();
>>>>>>> vp-rem
}
