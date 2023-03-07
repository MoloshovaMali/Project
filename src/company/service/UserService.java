package company.service;

import company.model.User;

public interface UserService {
    void userAdd(User user);
    User findById(int id);
   String idByDelete(int id);

    void printAllUsers();
}
