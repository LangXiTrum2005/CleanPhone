package com.unity3d.mediation.rewarded;

import kotlin.jvm.internal.n;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class LevelPlayReward {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f38540a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f38541b;

    public LevelPlayReward(String name, int i10) {
        n.f(name, "name");
        this.f38540a = name;
        this.f38541b = i10;
    }

    public static /* synthetic */ LevelPlayReward copy$default(LevelPlayReward levelPlayReward, String str, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = levelPlayReward.f38540a;
        }
        if ((i11 & 2) != 0) {
            i10 = levelPlayReward.f38541b;
        }
        return levelPlayReward.copy(str, i10);
    }

    public final String component1() {
        return this.f38540a;
    }

    public final int component2() {
        return this.f38541b;
    }

    public final LevelPlayReward copy(String name, int i10) {
        n.f(name, "name");
        return new LevelPlayReward(name, i10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LevelPlayReward)) {
            return false;
        }
        LevelPlayReward levelPlayReward = (LevelPlayReward) obj;
        return n.a(this.f38540a, levelPlayReward.f38540a) && this.f38541b == levelPlayReward.f38541b;
    }

    public final int getAmount() {
        return this.f38541b;
    }

    public final String getName() {
        return this.f38540a;
    }

    public int hashCode() {
        return Integer.hashCode(this.f38541b) + (this.f38540a.hashCode() * 31);
    }

    public String toString() {
        return "LevelPlayReward(name=" + this.f38540a + ", amount=" + this.f38541b + ")";
    }
}
