package company.impl;

import company.UserDao;
import company.model.User;
import company.service.UserService;

public   class UserServiceImpl implements UserService {
    private UserDao userDao = new UserDao();


    @Override
    public void userAdd(User user) {
        userDao.getUser().add(user);
    }

    @Override
    public User findById(int id) {
        User user = userDao.getUser().stream().filter(x -> x.getId() == id).findFirst().
                orElseThrow(() -> new MyException("Not found user with id " + id));
        return user;
    }


    @Override
    public String idByDelete(int id) {
        User user = userDao.getUser().stream().filter(x -> x.getId() == id).findFirst().
                orElseThrow(() -> new MyException("Not found user with id " + id));
        userDao.getUser().remove(user);
        return "Successfully deleted: " + user;
    }

    @Override
    public void printAllUsers() {
        userDao.getUser().forEach(System.out::println);

    }
}


