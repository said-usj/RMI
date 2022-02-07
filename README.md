# RMI
Java RMI - Put to action

## Running the project

Pull the project, go to the src directory in 3 distinct terminals, run: rmiregistry in the first terminal, then run java CalculatorServer and java CalculatorClient in the second and third terminals respectively and watch the output on the clientside.

## How it works

The client application invokes methods on the proxy object, RMI sends the request to the remote JVM. The return value is sent back to the proxy object and then to the client application.
