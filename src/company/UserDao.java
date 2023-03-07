package company;

import company.model.User;

import java.util.ArrayList;
import java.util.List;

public class UserDao {
      private List<User> user=new ArrayList<>();

    public UserDao() {
    }

    public  UserDao(List<User>user){
          this.user=user;
      }

    public List<User> getUser() {
        return user;
    }

    public void setUser(List<User> user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "UserDao{" +
                "user=" + user +
                '}';
    }
}