package org.exampleDB;

public class OracleConnector implements DatabaseConnector {


    @Override
    public String create(String[] payload) {
        return "Create in Oracle";
    }

    @Override
    public String[] read(String[] payload) {
        return new String[0];
    }

    @Override
    public String update(String[] payload) {
        return null;
    }

    @Override
    public String delete(String[] payload) {
        return null;
    }
}
