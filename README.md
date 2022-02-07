# RMI
Java RMI - Put to action

## Running the project

Pull the project, go to the src directory and run javac *.java to compile then rmic CalculatorImpl to create a stub, and if needed, a skeleton.
Then in 3 distinct terminals, run: rmiregistry in the first terminal, then run java CalculatorServer in the second, and java CalculatorClient in the third terminal respectively and watch the output on the clientside.

## How it works

The client application invokes methods on the proxy object, RMI sends the request to the remote JVM. The return value is sent back to the proxy object and then to the client application.

![output](https://github.com/said-usj/RMI/blob/master/assets/terminal.png?raw=true)
