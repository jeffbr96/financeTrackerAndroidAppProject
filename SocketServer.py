import socket
import time

listenSocket = socket.socket()
port = 8000
maxConnections = 999
ip = socket.gethostname()

listenSocket.bind(('', port))

listenSocket.listen(maxConnections)
print("server started at " + ip + ' on port ' + str(port))

(clientSocket, address) = listenSocket.accept()
print('new connection made!')

running = True

while running:
    message = clientSocket.recv(1024).decode()
    print(message)
    if not message == '':
        time.sleep(5)
    else:
        clientSocket.close()
        running = False