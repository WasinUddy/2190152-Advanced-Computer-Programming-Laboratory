/**
 * An interface for managing transactions between wallets in a blockchain-like system.
 * This serves as a blueprint for implementing transaction management functionality.
 */
public interface TransactionManager {

    /**
     * Transfers a specified amount of funds from a sender wallet to a receiver wallet.
     * 
     * @param senderWalletId The unique ID of the wallet sending the funds.
     * @param receiverWalletId The unique ID of the wallet receiving the funds.
     * @param amount The amount of funds to be transferred.
     * @return true if the transaction is successful, false otherwise.
     */
    public boolean transferFunds(String senderWalletId, String receiverWalletId, double amount);

    /**
     * Retrieves the current balance of a specified wallet.
     * 
     * @param walletId The unique ID of the wallet for which the balance needs to be checked.
     * @return The balance of the specified wallet.
     */
    public double getBalance(String walletId);

    /**
     * Validates if a given wallet ID exists in the system.
     * 
     * @param walletId The unique ID of the wallet to be checked.
     * @return true if the wallet ID is valid and exists in the system, false otherwise.
     */
    public boolean isValidWallet(String walletId);
}
