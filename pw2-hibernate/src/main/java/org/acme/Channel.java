package org.acme;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.FetchType;
import javax.persistence.ManyToMany;

import io.quarkus.hibernate.orm.panache.PanacheEntity;

public class Channel extends PanacheEntity {
    @ManyToMany(mappedBy = "channels", fetch = FetchType.EAGER)
    private List<User> users;

    public Channel(){
        this.users = new ArrayList<>();
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    @Override
    public String toString() {
        return "Channel{" +
                "users=" + users +
                '}';
    }

    
    
}
