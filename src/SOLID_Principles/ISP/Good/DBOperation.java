package SOLID_Principles.ISP.Good;

public class DBOperation implements DBDAOInterface{
    @Override
    public void openConnection() {
    }
    @Override
    public void closeConnection() {
    }
    @Override
    public void deleteRecord() {
    }
    @Override
    public void addRecord() {
    }
}

interface DBDAOInterface {
    void openConnection();
    void closeConnection();
    void deleteRecord();
    void addRecord();
}