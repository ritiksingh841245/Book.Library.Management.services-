package Book.Library.Management.System;

/**
 * @since 24
 * @author  Ritik  singh
 * User with details like name, ID, and contact information.
 */
public class User {
    private String name;
    private String id;

    public User(String name, String id)
    {
        this.id          = id;
        this.name        = name;
    }
    public String getName()
    {
        return name;
    }
    public  String getId()
    {
        return id;
    }

    public String toString()
    {
        return "Name         : "+"\n"+name+
                "id          : " +"\n"+id  ;

    }

}
