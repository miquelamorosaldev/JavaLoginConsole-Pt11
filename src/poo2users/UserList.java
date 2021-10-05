package poo2users;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Classe que gestiona els usuaris de la nostre app. El login, logout, info...
 * @author alumne
 */
public class UserList {
    
    private List<User> users = new ArrayList<User>();
    
    // ADMIN role is a user with a role = ADMIN
    private static final String ADMIN = "ADMIN";
    
    public UserList() {
        User pr1 = new User("pga","123456", ADMIN);
        users.add(pr1);
        users.add(new User("mba","123456", ADMIN));
        users.add(new User("rse","123456", ADMIN));
        users.add(new User("vra","123456", ADMIN));
        User pr5 = new User("mam","123456", "USER");
        users.add(pr5);
    }
    
    /**
     * Detects if the username and the password are in the users database.
     * @param username
     * @param password
     * @return true if the username and password exists
     */
    public boolean loginUser(String username, String password) {
        // User.contains is not possible, let's search in the collection.
        // users.contains()
        boolean exists = false;
        int listSize = users.size();
        for (int i = 0; i < listSize && !exists; i++) {
            if(users.get(i).getUsername().equals(username) 
                    && users.get(i).getPassword().equals(password) ) {
                exists = true;
            }
        }
        return exists;
    }
    
     /**
     * Detects if the user with this username and password has an Admin role or not.
     * @param username
     * @param password
     * @return true if the username has Admin role in the system.
     */
    boolean isAdminUser(String username, String password) {
        
        boolean admin = false;
        User loggedUser = null;
        // Versió Java 8 i posteriors de cercar elements.
        // https://stackoverflow.com/questions/13138990/how-to-search-in-a-list-of-java-object
        List<User> userAdmin = users.stream()
            .filter(user -> 
            user.getUsername().equals(username) && 
            user.getPassword().equals(password) &&
             user.getRole().equals(ADMIN))
            .collect(Collectors.toList());
        if(userAdmin != null && userAdmin.get(0)!= null)
            return true;
        else
            return false;  
    }
    
}
