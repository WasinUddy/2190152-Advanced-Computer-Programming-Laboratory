**Problem Description:**

In the context of a simplified blockchain-like system, our task is to design an interface class for a Transaction Manager. This Transaction Manager is responsible for handling transactions between wallets, enabling the transfer of funds from one wallet to another. The system's primary data structure is an array of wallets, each identified by a unique wallet ID represented as a string.

**Requirements:**

***TransactionManager Interface***

Design an interface class named `TransactionManager` that defines the methods and operations required for handling transactions between wallets. This interface should serve as a blueprint for implementing the transaction management functionality.

* **Wallet ID:** Each wallet is uniquely identified by a string-based Wallet ID. This ID should serve as a key for accessing and managing individual wallets within the system.
* **Transaction Functionality:** The interface must include methods for initiating transactions, checking balances, and performing any necessary validation. Specifically, the following methods should be defined:
  * `transferFunds(senderWalletId: String, receiverWalletId: String, amount: double): boolean:`
  * `getBalance(walletId: String): number:`
  * `isValidWallet(walletId: String): boolean:`

***SimpleTransactionManager***

Implement a subclass of the `TransactionManager` interface named `SimpleTransactionManager`. This subclass should provide concrete implementations for the methods defined in the interface.
  * `SimpleTransactionManager(wallets: String)`
    * This constructor is used to copy the input Wallet IDs to the wallets array member.
  * `transferFunds(senderWalletId: String, receiverWalletId: String, amount: double): boolean:` This method should attempt to transfer the specified amount of funds from the sender wallet to the receiver wallet. It should return a boolean indicating whether the transaction was successful.
    * This method should attempt to transfer the specified amount of funds from the sender wallet to the receiver wallet. It should return a boolean indicating whether the transaction was successful.
    * In the case that the current balance of the source wallet is less than the amount, it should throw a new `InvalidTransactionException` with the message `"Not enough balance in the source wallet."`
      * Because we must have an initial source of the system, so please do not check for amount of `Wall ID` `"Wallet0".
    * If the source wallet ID is not in the system, throw a new `IllegalArgumentException`, which is a standard Exception in Java.
    * For every successful transaction, if there is no target Wallet ID, please process it as if the target wallet is a new one (add the target Wallet ID to the wallets array of this class).
  * `getBalance(walletId: String): number:`
    * This method should return the current balance of the wallet identified by the given Wallet ID. If the input `walletID` is invalid, throw a new `IllegalArgumentException`.
    * You should calculate the balance from the transactions array which is the private member of this class.
  * `isValidWallet(walletId: String): boolean:`
    * This method should check if a wallet with the given Wallet ID exists in the system.
  * `wallets: String[]`
    * This array should store all Wallet IDs in the system. You can simply initiate it with a size of 1,000 Strings (we will let the system crash if there are more wallets than 1,000).
  * `transactions: String[]`
    * This array store all successful transactions in the format `"source wallet id|receive wallet id|amount"`
    * Please initiate it with a size of 10,000 Strings (we don't care the case that there are more than 10,000 transactions).
    
**How to submit:** Zip all java files in a Lab5_XXXXXXXXXX.zip (where XXXXXXXXXX is your student id) and submit to mycourseville.
