package ISP.Bad;

public interface DAOInterface {
    void openConnection();
    void closeConnection();
    void deleteRecord();
    void addRecord();
    void readFile();
    void writeFile();
}
