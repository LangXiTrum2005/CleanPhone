package com.inmobi.media;

/* JADX INFO: renamed from: com.inmobi.media.eb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C3004eb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f23566a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f23567b = 0;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3004eb)) {
            return false;
        }
        C3004eb c3004eb = (C3004eb) obj;
        return this.f23566a == c3004eb.f23566a && this.f23567b == c3004eb.f23567b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f23567b) + (Integer.hashCode(this.f23566a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PurchaseData(noOfInAppPurchases=");
        sb.append(this.f23566a);
        sb.append(", noOfSubscriptions=");
        return android.support.v4.media.a.p(sb, this.f23567b, ')');
    }
}
