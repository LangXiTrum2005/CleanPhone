package com.tiktok.appevents.base;

/* JADX INFO: loaded from: classes6.dex */
public enum EventName {
    /* JADX INFO: Fake field, exist only in values array */
    ACHIEVE_LEVEL("AchieveLevel"),
    /* JADX INFO: Fake field, exist only in values array */
    ADD_PAYMENT_INFO("AddPaymentInfo"),
    /* JADX INFO: Fake field, exist only in values array */
    COMPLETE_TUTORIAL("CompleteTutorial"),
    /* JADX INFO: Fake field, exist only in values array */
    CREATE_GROUP("CreateGroup"),
    /* JADX INFO: Fake field, exist only in values array */
    CREATE_ROLE("CreateRole"),
    /* JADX INFO: Fake field, exist only in values array */
    GENERATE_LEAD("GenerateLead"),
    /* JADX INFO: Fake field, exist only in values array */
    IN_APP_AD_CLICK("InAppADClick"),
    /* JADX INFO: Fake field, exist only in values array */
    IN_APP_AD_IMPR("InAppAdImpr"),
    /* JADX INFO: Fake field, exist only in values array */
    INSTALL_APP("InstallApp"),
    /* JADX INFO: Fake field, exist only in values array */
    JOIN_GROUP("JoinGroup"),
    /* JADX INFO: Fake field, exist only in values array */
    LAUNCH_APP("LaunchAPP"),
    /* JADX INFO: Fake field, exist only in values array */
    LOAN_APPLICATION("LoanApplication"),
    /* JADX INFO: Fake field, exist only in values array */
    LOAN_APPROVAL("LoanApproval"),
    /* JADX INFO: Fake field, exist only in values array */
    LOAN_DISBURSAL("LoanDisbursal"),
    /* JADX INFO: Fake field, exist only in values array */
    LOGIN("Login"),
    /* JADX INFO: Fake field, exist only in values array */
    RATE("Rate"),
    /* JADX INFO: Fake field, exist only in values array */
    REGISTRATION("Registration"),
    /* JADX INFO: Fake field, exist only in values array */
    SEARCH("Search"),
    /* JADX INFO: Fake field, exist only in values array */
    SPEND_CREDITS("SpendCredits"),
    /* JADX INFO: Fake field, exist only in values array */
    START_TRIAL("StartTrial"),
    /* JADX INFO: Fake field, exist only in values array */
    SUBSCRIBE("Subscribe"),
    /* JADX INFO: Fake field, exist only in values array */
    IMPRESSION_LEVEL_AD_REVENUE("ImpressionLevelAdRevenue"),
    /* JADX INFO: Fake field, exist only in values array */
    UNLOCK_ACHIEVEMENT("UnlockAchievement");

    public final String X;

    EventName(String str) {
        this.X = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.X;
    }
}
