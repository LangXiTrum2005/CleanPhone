package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.util.List;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.n50, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C4108n50 {
    public static final C4020m50 Companion = new C4020m50(null);
    private List<String> friends;
    private Float healthPercentile;
    private Float inGamePurchasesUSD;
    private Float levelPercentile;
    private String page;
    private Integer sessionDuration;
    private Integer sessionStartTime;
    private Integer signupDate;
    private Integer timeSpent;
    private String userID;
    private Float userLevelPercentile;
    private Float userScorePercentile;

    public C4108n50() {
    }

    public static final void write$Self(C4108n50 c4108n50, InterfaceC4596sh interfaceC4596sh, D40 d40) {
        AbstractC2995aW.q(c4108n50, "self");
        if (AbstractC5044xl.v(interfaceC4596sh, "output", d40, "serialDesc", d40) || c4108n50.levelPercentile != null) {
            interfaceC4596sh.r(d40, 0, C4179nv.f4766a, c4108n50.levelPercentile);
        }
        if (interfaceC4596sh.j(d40) || c4108n50.page != null) {
            interfaceC4596sh.r(d40, 1, W90.f3912a, c4108n50.page);
        }
        if (interfaceC4596sh.j(d40) || c4108n50.timeSpent != null) {
            interfaceC4596sh.r(d40, 2, AD.f2808a, c4108n50.timeSpent);
        }
        if (interfaceC4596sh.j(d40) || c4108n50.signupDate != null) {
            interfaceC4596sh.r(d40, 3, AD.f2808a, c4108n50.signupDate);
        }
        if (interfaceC4596sh.j(d40) || c4108n50.userScorePercentile != null) {
            interfaceC4596sh.r(d40, 4, C4179nv.f4766a, c4108n50.userScorePercentile);
        }
        if (interfaceC4596sh.j(d40) || c4108n50.userID != null) {
            interfaceC4596sh.r(d40, 5, W90.f3912a, c4108n50.userID);
        }
        if (interfaceC4596sh.j(d40) || c4108n50.friends != null) {
            interfaceC4596sh.r(d40, 6, new T5(W90.f3912a, 0), c4108n50.friends);
        }
        if (interfaceC4596sh.j(d40) || c4108n50.userLevelPercentile != null) {
            interfaceC4596sh.r(d40, 7, C4179nv.f4766a, c4108n50.userLevelPercentile);
        }
        if (interfaceC4596sh.j(d40) || c4108n50.healthPercentile != null) {
            interfaceC4596sh.r(d40, 8, C4179nv.f4766a, c4108n50.healthPercentile);
        }
        if (interfaceC4596sh.j(d40) || c4108n50.sessionStartTime != null) {
            interfaceC4596sh.r(d40, 9, AD.f2808a, c4108n50.sessionStartTime);
        }
        if (interfaceC4596sh.j(d40) || c4108n50.sessionDuration != null) {
            interfaceC4596sh.r(d40, 10, AD.f2808a, c4108n50.sessionDuration);
        }
        if (!interfaceC4596sh.j(d40) && c4108n50.inGamePurchasesUSD == null) {
            return;
        }
        interfaceC4596sh.r(d40, 11, C4179nv.f4766a, c4108n50.inGamePurchasesUSD);
    }

    public final C4108n50 setFriends(List<String> list) {
        this.friends = list != null ? AbstractC2853Wf.v0(list) : null;
        return this;
    }

    public final C4108n50 setHealthPercentile(float f) {
        if (C3526gX.INSTANCE.isInRange(f, 0.0f, 100.0f)) {
            this.healthPercentile = Float.valueOf(f);
        }
        return this;
    }

    public final C4108n50 setInGamePurchasesUSD(float f) {
        if (C3526gX.isInRange$default(C3526gX.INSTANCE, f, 0.0f, 0.0f, 4, (Object) null)) {
            this.inGamePurchasesUSD = Float.valueOf(f);
        }
        return this;
    }

    public final C4108n50 setLevelPercentile(float f) {
        if (C3526gX.INSTANCE.isInRange(f, 0.0f, 100.0f)) {
            this.levelPercentile = Float.valueOf(f);
        }
        return this;
    }

    public final C4108n50 setPage(String str) {
        AbstractC2995aW.q(str, "page");
        this.page = str;
        return this;
    }

    public final C4108n50 setSessionDuration(int i) {
        this.sessionDuration = Integer.valueOf(i);
        return this;
    }

    public final C4108n50 setSessionStartTime(int i) {
        this.sessionStartTime = Integer.valueOf(i);
        return this;
    }

    public final C4108n50 setSignupDate(int i) {
        this.signupDate = Integer.valueOf(i);
        return this;
    }

    public final C4108n50 setTimeSpent(int i) {
        this.timeSpent = Integer.valueOf(i);
        return this;
    }

    public final C4108n50 setUserID(String str) {
        AbstractC2995aW.q(str, "userID");
        this.userID = str;
        return this;
    }

    public final C4108n50 setUserLevelPercentile(float f) {
        if (C3526gX.INSTANCE.isInRange(f, 0.0f, 100.0f)) {
            this.userLevelPercentile = Float.valueOf(f);
        }
        return this;
    }

    public final C4108n50 setUserScorePercentile(float f) {
        if (C3526gX.INSTANCE.isInRange(f, 0.0f, 100.0f)) {
            this.userScorePercentile = Float.valueOf(f);
        }
        return this;
    }

    public /* synthetic */ C4108n50(int i, Float f, String str, Integer num, Integer num2, Float f2, String str2, List list, Float f3, Float f4, Integer num3, Integer num4, Float f5, O40 o40) {
        if ((i & 1) == 0) {
            this.levelPercentile = null;
        } else {
            this.levelPercentile = f;
        }
        if ((i & 2) == 0) {
            this.page = null;
        } else {
            this.page = str;
        }
        if ((i & 4) == 0) {
            this.timeSpent = null;
        } else {
            this.timeSpent = num;
        }
        if ((i & 8) == 0) {
            this.signupDate = null;
        } else {
            this.signupDate = num2;
        }
        if ((i & 16) == 0) {
            this.userScorePercentile = null;
        } else {
            this.userScorePercentile = f2;
        }
        if ((i & 32) == 0) {
            this.userID = null;
        } else {
            this.userID = str2;
        }
        if ((i & 64) == 0) {
            this.friends = null;
        } else {
            this.friends = list;
        }
        if ((i & 128) == 0) {
            this.userLevelPercentile = null;
        } else {
            this.userLevelPercentile = f3;
        }
        if ((i & 256) == 0) {
            this.healthPercentile = null;
        } else {
            this.healthPercentile = f4;
        }
        if ((i & 512) == 0) {
            this.sessionStartTime = null;
        } else {
            this.sessionStartTime = num3;
        }
        if ((i & 1024) == 0) {
            this.sessionDuration = null;
        } else {
            this.sessionDuration = num4;
        }
        if ((i & 2048) == 0) {
            this.inGamePurchasesUSD = null;
        } else {
            this.inGamePurchasesUSD = f5;
        }
    }

    private static /* synthetic */ void getFriends$annotations() {
    }

    private static /* synthetic */ void getHealthPercentile$annotations() {
    }

    private static /* synthetic */ void getInGamePurchasesUSD$annotations() {
    }

    private static /* synthetic */ void getLevelPercentile$annotations() {
    }

    private static /* synthetic */ void getPage$annotations() {
    }

    private static /* synthetic */ void getSessionDuration$annotations() {
    }

    private static /* synthetic */ void getSessionStartTime$annotations() {
    }

    private static /* synthetic */ void getSignupDate$annotations() {
    }

    private static /* synthetic */ void getTimeSpent$annotations() {
    }

    private static /* synthetic */ void getUserID$annotations() {
    }

    private static /* synthetic */ void getUserLevelPercentile$annotations() {
    }

    private static /* synthetic */ void getUserScorePercentile$annotations() {
    }
}
