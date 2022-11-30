package biz.xsoftware.impl.usersvc;

import biz.xsoftware.api.usersvc.User;
import biz.xsoftware.api.usersvc.UserListener;
import biz.xsoftware.api.usersvc.UserService;

import java.util.ArrayList;

public class UserService1 implements UserService {

    ArrayList<User1> userList = new ArrayList<>();

    UserListener userListener = new UseListener1();
    @Override
    public User createUser(int id, String firstName, String lastName) {
         User1 user = new User1();
         user.setId(id);
         user.setFirstName(firstName);
         user.setLastName(lastName);
         userList.add(user);
         userListener.userCreated(user);
        return user;
    }

    @Override
    public User removeUser(int id)  {

        User user = getUserOfId(id);
        if(user != null){
            //int id1 = user.getId();
            userList.remove(user);
            userListener.userRemoved(user);
            return user;
        }
        return null;
    }

    @Override
    public User getUser(int id) {

        return getUserOfId(id);
    }

   /* @Override
    public User getUserOfId() {
        return null;
    }*/

    private User getUserOfId(int id){
        for (int i =0 ; i < userList.size(); i++) {
            if(id == userList.get(i).getId()){
                return userList.get(i);
            }
        }
        return null;
    }


    @Override
    public void addUserListener(UserListener listener) {
              this.userListener = listener;
    }
}
