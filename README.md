# Stock_Market

1-The use of the Builder Pattern

We have decided to use the builder pattern to separate the construction of the objects Company and Investor.
The builder pattern allow the construction of 100 different representation of an objects in the same process of construction.

2-The use  of Observer Pattern

Observer Pattern was used to reflect on the prices of the shares. It keeps track of which companies were part of the last ten transactions and which weren't, and then forces the ones that weren't part of the last 10 transactions to reduce their prices by 2%.

3-Chain of Responsability
We tried to use chain of responsability to perform the transactions. By selecting the first investor in the list to buy shares until he doesn't enough money to buy anything, when that happens he moves to the next investor in the chain, but unfortunately we didn't manage to get it working correctly

4-The use of the Facade Pattern

We used the Facade pattern  to hides the complexities when creating random data on the  system, so then We can provide a simpler interface to the client.
