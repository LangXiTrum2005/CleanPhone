package com.adcolony.sdk;

/* JADX INFO: loaded from: classes.dex */
public class AdColonyReward {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f8938a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f8939b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f8940c;
    private boolean d;

    public AdColonyReward(h0 h0Var) {
        f1 f1VarA = h0Var.a();
        this.f8938a = c0.d(f1VarA, "reward_amount");
        this.f8939b = c0.h(f1VarA, "reward_name");
        this.d = c0.b(f1VarA, "success");
        this.f8940c = c0.h(f1VarA, "zone_id");
    }

    public int getRewardAmount() {
        return this.f8938a;
    }

    public String getRewardName() {
        return this.f8939b;
    }

    public String getZoneID() {
        return this.f8940c;
    }

    public boolean success() {
        return this.d;
    }
}
