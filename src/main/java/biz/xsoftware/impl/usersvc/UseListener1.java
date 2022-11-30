package biz.xsoftware.impl.usersvc;

import biz.xsoftware.api.usersvc.User;
import biz.xsoftware.api.usersvc.UserListener;

import java.util.ArrayList;

public class UseListener1 implements UserListener {


    public ArrayList<User> userCreatedList = new ArrayList<>();
    public ArrayList<User> userRemovedList = new ArrayList<>();

    @Override
    public void userCreated(User user) {
        userCreatedList.add(user);
    }

    @Override
    public void userRemoved(User user) {
        userRemovedList.remove(user);
    }
    
}
