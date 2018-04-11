package edu.bsuir.parser;

import org.xml.sax.SAXException;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.*;
import java.util.List;

public class RoleDAO {
    public Role getRole(String roleCode) throws JAXBException {
        List<Role> roles = readRoles();
        for (Role role : roles){
            if (role.getId().equals(roleCode)){
                return role;
            }
        }
        return null;
    }


    private List<Role> readRoles() throws JAXBException {
        JAXBContext context = JAXBContext.newInstance(User.class);
        Unmarshaller un = context.createUnmarshaller();
        User user = (User) un.unmarshal(new File("src/resources/data.xml"));
        return user.getRole();
    }
}
