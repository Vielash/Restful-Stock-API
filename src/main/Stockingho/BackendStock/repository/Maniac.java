package src.main.Stockingho.BackendStock.repository;

import src.main.Stockingho.BackendStock.model.User;

import java.util.List;

public class Maniac {
        public static void main(String[] args) {
            UserRepository userRepository = new UserRepository();
//            List<User> users = userRepository.getAllUserObjects();
//
//            for (User user : users) {
//                System.out.println(user.toString());
//            }
            System.out.println(userRepository.getUserByID(2).toString());
        }
    }


