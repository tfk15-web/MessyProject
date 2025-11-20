public class User
{
    private int id; // bruger identitet
    private String name; // bruger navn
    private String address; // bruger adresse

    private int MAX_NAME_LENGTH = 100; // det maksimale antal karakterer i navm

    // Opret bruger
    public User(String name, int id){
        this.id = id;
        if(name.isEmpty() || name.length() > MAX_NAME_LENGTH) // Testing length
        {
            return; //If string is invalid, we dont try to store it
        }
        this.name = name;
    }

    // Skift navn
    public void setName(String name)
    {
        if(name.isEmpty())
        {
            return; //If string is invalid, we dont try to store it
        }
        this.name = name;
    }

    // Skift adresse
    public void setAddress(String address)
    {
        this.address = address;
    }

    // Hent ID
    public int getId() {
        return this.id;
    }

    // Hent navn
    public String getName(){
        return this.name;
    }

    // Hent adresse
    public String getAddress(){
        if (this.address != null) {
            return this.address;
        }
        return "";
    }

    @Override
    public boolean equals(Object o){
        if(o instanceof User u){
            return u.c_nam == c_nam;
        }
        return false;
    }
}
