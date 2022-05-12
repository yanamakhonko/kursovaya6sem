package com.milos.vulic.quiz.services;

import com.milos.vulic.quiz.Iterator.Iterator;
import com.milos.vulic.quiz.Iterator.Validate;
import com.milos.vulic.quiz.models.User;
import com.milos.vulic.quiz.repositories.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImp implements UserService {

    private final UserRepository userRepository;

    public UserServiceImp(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public List<User> getAllUsers() {
        Singleton.getInstance().addPrWriteFile("Произошел поиск в таблице User");
        return userRepository.findAll();
    }

    @Override
    public void registerUser(User user) {
        String[] valide = {"true"};
        Validate validate = new Validate(valide);
        Iterator iterator = validate.getIterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next().toString());
        }
        Singleton.getInstance().addPrWriteFile("Произошло изменение в таблице User");
        userRepository.save(user);
    }

    @Override
    public User findUserByCredentials(String username, String password) {
        Singleton.getInstance().addPrWriteFile("Произошел поиск в таблице User");
        return userRepository.findByUsernameAndPassword(username, password);
    }

    @Override
    public User findByUsername(String username) {
        Singleton.getInstance().addPrWriteFile("Произошел поиск в таблице User");
        return userRepository.findByUsername(username);
    }

    @Override
    public User findByUserId(Long userId) {
        Singleton.getInstance().addPrWriteFile("Произошел поиск в таблице User");
        return userRepository.findByUserId(userId);
    }
}
