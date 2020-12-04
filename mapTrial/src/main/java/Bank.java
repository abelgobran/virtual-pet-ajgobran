import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Bank {

    Map<String, Account> accounts = new HashMap<String, Account>();

    public void addAccount(Account inNewAccount){
        accounts.put(inNewAccount.getAccountNumber(),inNewAccount);
    }

    public Account getAccount(String accountNumber){
        return accounts.get(accountNumber);
    }

    public Collection<Account> getAllAccounts(){
        return accounts.values();
    }

    public void closeAccount (String accountNumber){
        accounts.remove(accountNumber);
    }
}

