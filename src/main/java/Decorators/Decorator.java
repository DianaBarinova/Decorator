package Decorators;

public class Decorator implements IFileSource {
    private IFileSource fileSource;

    Decorator(IFileSource source) {
        this.fileSource = source;
    }

    @Override
    public void writeData(String data) {
        fileSource.writeData(data);
    }

    @Override
    public String readData() {
        return fileSource.readData();
    }
}