package exercise;
import java.util.List;
import java.util.ArrayList;
import exercise.connections.Connected;
import exercise.connections.Disconnected;
import exercise.connections.Connection;


// BEGIN
public class TcpConnection implements Connection {
    private String ip;
    private int port;
    private Connection state;
    public TcpConnection(String ip, int port) {
        this.ip = ip;
        this.port = port;
        state = new Disconnected(this);
    }

    public void setState(Connection state) {
        this.state = state;
    }

    public String getCurrentState() {
        return state.getCurrentState();
    }
    public void connect() {
        state.connect();
    }
    public void disconnect() {
        state.disconnect();
    }
    public void write(String string) {
        state.write(string);
    }
}
// END
