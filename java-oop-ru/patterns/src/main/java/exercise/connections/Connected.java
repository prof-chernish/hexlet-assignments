package exercise.connections;

import exercise.TcpConnection;

// BEGIN
public class Connected implements Connection {
    private TcpConnection tcpConnection;

    public Connected(TcpConnection tcpConnection) {
        this.tcpConnection = tcpConnection;
    }
    public String getCurrentState() {
        return "connected";
    }
    public void connect() {
        System.out.println("Error! Connection is already established!");
    }
    public void disconnect() {
        tcpConnection.setState(new Disconnected(tcpConnection));

    }
    public void write(String string) {

    }

}
// END
