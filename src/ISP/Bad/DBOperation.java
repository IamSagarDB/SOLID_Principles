package ISP.Bad;

public class DBOperation implements DAOInterface{
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

    @Override
    public void readFile() {
        throw new UnsupportedOperationException("Read file not supported in DB operation");
    }

    @Override
    public void writeFile() {
        throw new UnsupportedOperationException("Write file is not supported in DB operation");
    }
}
