package edu.bsuir.parser;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@XmlRootElement(name="user")
public class User {
    private List<Role> role;

    public User() {}

    @XmlElement(name="role")
    public List<Role> getRole() {
        return role;
    }

//    public Role getRoleById(String roleCode){
//        getRole();
//        for (Role r: role) {
//            if(r.getId().equals("recruter")){ return r;}
//            if(r.getId().equals("director")){ return r;}
//        }
//    }

    public void setRole(List<Role> roleList) {
        this.role = roleList;
    }

    public User(List<Role> role) {
        super();
        this.role = role;
    }
}
