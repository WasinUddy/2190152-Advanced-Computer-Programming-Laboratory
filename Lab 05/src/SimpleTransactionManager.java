public class SimpleTransactionManager implements TransactionManager {
    
    // An array to store all Wallet IDs in the system. Maximum size is 1000.
    private String[] wallets = new String[1000];
    
    // An array to store all successful transactions in the format "source wallet id|receive wallet id|amount".
    // Maximum size is 10,000.
    private String[] transactions = new String[10000];
    
    // Count of how many wallets are currently in the system.
    private int walletCount;

    // Count of how many transactions have been processed.
    private int transactionCount;

    /**
     * Constructor that initializes the system with a set of wallet IDs.
     * 
     * @param wallets Initial array of wallet IDs.
     */
    public SimpleTransactionManager(String[] wallets) {
        for (String walletId : wallets) {
            this.wallets[walletCount++] = walletId;
        }
    }

    /**
     * Transfers funds from one wallet to another.
     * 
     * @param senderWalletId ID of the wallet sending the funds.
     * @param receiverWalletId ID of the wallet receiving the funds.
     * @param amount The amount to be transferred.
     * @return true if the transaction is successful.
     * @throws InvalidTransactionException if there's not enough balance in the source wallet.
     */
    @Override
    public boolean transferFunds(String senderWalletId, String receiverWalletId, double amount) {
        // If sender isn't "Wallet0", check the balance.
        if (!senderWalletId.equals("Wallet0")) {
            double senderBalance = getBalance(senderWalletId);
            if (senderBalance < amount) {
                throw new InvalidTransactionException("Not enough balance in the source wallet.");
            }
        }

        // If the receiver wallet is not in the system, add it.
        if (!isValidWallet(receiverWalletId)) {
            this.wallets[walletCount++] = receiverWalletId;
        }

        // Log the transaction.
        String transaction = senderWalletId + "|" + receiverWalletId + "|" + amount;
        this.transactions[transactionCount++] = transaction;

        return true;
    }

    /**
     * Gets the current balance of a specified wallet.
     * 
     * @param walletId ID of the wallet to check.
     * @return The balance of the wallet.
     * @throws IllegalArgumentException if the wallet does not exist in the system.
     */
    @Override
    public double getBalance(String walletId) {
        if (!isValidWallet(walletId)) {
            throw new IllegalArgumentException("Sender wallet does not exist.");
        }

        double balance = 0.0;
        for (int i = 0; i < transactionCount; i++) {
            String[] parts = transactions[i].split("\\|");
            if (parts[0].equals(walletId)) {
                balance -= Double.parseDouble(parts[2]);
            }
            if (parts[1].equals(walletId)) {
                balance += Double.parseDouble(parts[2]);
            }
        }

        return balance;
    }

    /**
     * Checks if a wallet ID exists in the system.
     * 
     * @param walletId The ID of the wallet to check.
     * @return true if the wallet exists, false otherwise.
     */
    @Override
    public boolean isValidWallet(String walletId) {
        for (int i = 0; i < this.walletCount; i++) {
            if (this.wallets[i].equals(walletId)) {
                return true;
            }
        }
        return false;  
    }
}

/**
 * Custom exception class to handle invalid transactions.
 */
class InvalidTransactionException extends RuntimeException {
    public InvalidTransactionException(String message) {
        super(message);
    }
}