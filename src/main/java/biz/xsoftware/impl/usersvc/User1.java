package biz.xsoftware.impl.usersvc;

import biz.xsoftware.api.usersvc.User;

public class User1 implements User {

    protected int id = 0;
    protected String firstName = "";
    protected String lastName = "";
    @Override
    public int getId() {
        return id;
    }

    @Override
    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String getFirstName() {
        return this.firstName;
    }

    @Override
    public void setFirstName(String firstName) {
         this.firstName = firstName;
    }

    @Override
    public String getLastName() {
        return this.lastName;
    }

    @Override
    public void setLastName(String lastName) {
         this.lastName = lastName;
    }
}
