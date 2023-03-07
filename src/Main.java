import company.impl.UserServiceImpl;
import company.model.Gender;
import company.model.User;
import company.service.UserService;

public class Main {
    public static void main(String[] args) {

            User user = new User(1, "Malika", 16, Gender.FEMALE);
            User user2 = new User(2, "Nurisa", 20, Gender.FEMALE);
            User user3 = new User(3, "Gulnur", 25, Gender.FEMALE);

            UserServiceImpl userService = new UserServiceImpl();
            userService.userAdd(user);
            userService.userAdd(user2);
            userService.userAdd(user3);
            userService.printAllUsers();
            System.out.println("----------------------------");
        try{
            userService.idByDelete(2);
            userService.printAllUsers();
        }catch (RuntimeException runtimeException){
            System.out.println(runtimeException.getMessage());
        }




    }
}