package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class fr1 extends dr1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final nr1 f14521a = new nr1();

    public final boolean equals(Object obj) {
        if (obj != this) {
            return (obj instanceof fr1) && ((fr1) obj).f14521a.equals(this.f14521a);
        }
        return true;
    }

    public final int hashCode() {
        return this.f14521a.hashCode();
    }

    public final dr1 n(String str) {
        return (dr1) this.f14521a.get(str);
    }
}
