package cources.checkers;

import cources.MenuChecker;
import cources.pages.DeliveryClubMainPageObject;


public class AccountChecker implements MenuChecker {

    private DeliveryClubMainPageObject page;

    public AccountChecker(DeliveryClubMainPageObject page) {
        this.page = page;
    }

    public boolean check() {

        if (page.getAccountList().isEnabled()) {
            return true;
        }


        return false;
    }
}
