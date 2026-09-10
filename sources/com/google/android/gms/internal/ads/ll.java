package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public enum ll implements us1 {
    ENUM_FALSE(0),
    ENUM_TRUE(1),
    ENUM_UNKNOWN(1000);


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f17050a;

    ll(int i10) {
        this.f17050a = i10;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f17050a);
    }

    @Override // com.google.android.gms.internal.ads.us1
    public final int zza() {
        return this.f17050a;
    }
}
