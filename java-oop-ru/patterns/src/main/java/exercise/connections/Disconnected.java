package exercise.connections;

import exercise.TcpConnection;
// BEGIN
public class Disconnected implements Connection {
    private TcpConnection tcpConnection;

    public Disconnected(TcpConnection tcpConnection) {
        this.tcpConnection = tcpConnection;
    }
    public String getCurrentState() {
        return "disconnected";
    }
    public void connect() {
        tcpConnection.setState(new Connected(tcpConnection));

    }
    public void disconnect() {
        System.out.println("Error! Connection is already disconnected!");
    }
    public void write(String string) {
        System.out.println("Error! Connection is disconnected!");
    }

}
// END
