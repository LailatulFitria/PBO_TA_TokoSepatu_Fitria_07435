package Entity;

public class Petugas {   
    private String pass, user_id, user;
    
    public Petugas(String user_id, String user, String pass){
        this.user = user;
        this.user_id = user_id;
        this.pass = pass;
    }
    
    public String getUser_id(){
        return user_id;
    }

    public void setPassword(String pass) {
        this.pass = pass;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public void setUser(String user) {
        this.user = user;
    }
    
    public String getUser(){
        return user;
    }
    public String getPassword(){
        return this.pass;
    }
}
