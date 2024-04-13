package sdu.edu.kz.SpringRestfulAPI.config;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import sdu.edu.kz.SpringRestfulAPI.entity.Account;
import sdu.edu.kz.SpringRestfulAPI.services.AccountService;

@Component
public class SeeData implements CommandLineRunner {
    private final AccountService accountService;

    public SeeData(AccountService accountService) {
        this.accountService = accountService;
    }

    @Override
    public void run(String... args) throws Exception {
        Account account = new Account();
        Account account1 = new Account();

        account.setEmail("user@user.com");
        account.setPassword("user");
        account.setRole("ROLE_USER");
        accountService.save(account);

        account1.setEmail("admin@admin.com");
        account1.setPassword("admin");
        account1.setRole("ROLE_ADMIN");
        accountService.save(account1);
    }
}
