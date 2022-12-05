package SOLID_Principles.ISP.Good;

public interface DBDAOInterface {
    void openConnection();
    void closeConnection();
    void deleteRecord();
    void addRecord();
}
