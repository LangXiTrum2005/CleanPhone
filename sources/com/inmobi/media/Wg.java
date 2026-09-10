package com.inmobi.media;

/* JADX INFO: loaded from: classes3.dex */
public final class Wg {
    public int a = 0;
    public int b = 0;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Wg)) {
            return false;
        }
        Wg wg = (Wg) obj;
        return this.a == wg.a && this.b == wg.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "PurchaseData(noOfInAppPurchases=" + this.a + ", noOfSubscriptions=" + this.b + ")";
    }
}
