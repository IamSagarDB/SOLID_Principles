package ISP.Bad;

public class FileOperation implements DAOInterface{
    @Override
    public void openConnection() {
        throw new UnsupportedOperationException("Open DB connection not supported in File operation");
    }

    @Override
    public void closeConnection() {
        throw new UnsupportedOperationException("Close DB connection not supported in File operation");
    }

    @Override
    public void deleteRecord() {
        throw new UnsupportedOperationException("Delete record to DB not supported in File operation");
    }

    @Override
    public void addRecord() {
        throw new UnsupportedOperationException("Add record to DB not supported in File operation");
    }

    @Override
    public void readFile() {

    }

    @Override
    public void writeFile() {

    }
}
