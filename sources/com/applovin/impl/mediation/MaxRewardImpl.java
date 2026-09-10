package com.applovin.impl.mediation;

import androidx.annotation.NonNull;
import com.applovin.mediation.MaxReward;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public class MaxRewardImpl implements MaxReward {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f8455a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f8456b;

    private MaxRewardImpl(int i10, String str) {
        if (i10 < 0) {
            throw new IllegalArgumentException("Reward amount must be greater than or equal to 0");
        }
        this.f8455a = str;
        this.f8456b = i10;
    }

    public static MaxReward create(int i10, String str) {
        return new MaxRewardImpl(i10, str);
    }

    public static MaxReward createDefault() {
        return create(0, "");
    }

    @Override // com.applovin.mediation.MaxReward
    public final int getAmount() {
        return this.f8456b;
    }

    @Override // com.applovin.mediation.MaxReward
    public final String getLabel() {
        return this.f8455a;
    }

    @NonNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder("MaxReward{amount=");
        sb2.append(this.f8456b);
        sb2.append(", label=");
        return defpackage.e.q(this.f8455a, "}", sb2);
    }
}
