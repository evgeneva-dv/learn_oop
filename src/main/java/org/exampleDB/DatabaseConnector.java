package org.exampleDB;

public interface DatabaseConnector {

    public String create (String[] payload);
    public String[] read (String[] payload);
    public String update (String[] payload);
    public String delete (String[] payload);


}
