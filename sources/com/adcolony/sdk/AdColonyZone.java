package com.adcolony.sdk;

/* JADX INFO: loaded from: classes.dex */
public class AdColonyZone {
    public static final int BANNER = 1;
    public static final int INTERSTITIAL = 0;

    @Deprecated
    public static final int NATIVE = 2;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f8944a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f8945b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f8946c = 5;
    private int d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f8947e;
    private int f;
    private int g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f8948h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f8949i;
    private boolean j;
    private boolean k;

    public AdColonyZone(String str) {
        this.f8944a = str;
    }

    private int a(int i2) {
        if (a.d() && !a.b().E() && !a.b().F()) {
            return i2;
        }
        b();
        return 0;
    }

    public void b(int i2) {
        this.f8949i = i2;
    }

    public void c(int i2) {
        this.f8946c = i2;
    }

    public int getPlayFrequency() {
        return a(this.g);
    }

    public int getRemainingViewsUntilReward() {
        return a(this.f8947e);
    }

    public int getRewardAmount() {
        return a(this.f8948h);
    }

    public String getRewardName() {
        return a(this.f8945b);
    }

    public int getViewsPerReward() {
        return a(this.f);
    }

    public String getZoneID() {
        return a(this.f8944a);
    }

    public int getZoneType() {
        return this.d;
    }

    public boolean isRewarded() {
        return this.k;
    }

    public boolean isValid() {
        return a(this.j);
    }

    private void b() {
        new e0.a().a("The AdColonyZone API is not available while AdColony is disabled.").a(e0.f9131h);
    }

    private boolean a(boolean z2) {
        if (a.d() && !a.b().E() && !a.b().F()) {
            return z2;
        }
        b();
        return false;
    }

    private String a(String str) {
        return a(str, "");
    }

    private String a(String str, String str2) {
        if (a.d() && !a.b().E() && !a.b().F()) {
            return str;
        }
        b();
        return str2;
    }

    public void a(h0 h0Var) {
        f1 f1VarA = h0Var.a();
        f1 f1VarF = c0.f(f1VarA, "reward");
        this.f8945b = c0.h(f1VarF, "reward_name");
        this.f8948h = c0.d(f1VarF, "reward_amount");
        this.f = c0.d(f1VarF, "views_per_reward");
        this.f8947e = c0.d(f1VarF, "views_until_reward");
        this.k = c0.b(f1VarA, "rewarded");
        this.f8946c = c0.d(f1VarA, "status");
        this.d = c0.d(f1VarA, "type");
        this.g = c0.d(f1VarA, "play_interval");
        this.f8944a = c0.h(f1VarA, "zone_id");
        this.j = this.f8946c != 1;
    }

    public int a() {
        return this.f8949i;
    }
}
