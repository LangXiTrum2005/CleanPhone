package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public enum zj implements us1 {
    UNSPECIFIED(0),
    CONNECTING(1),
    CONNECTED(2),
    DISCONNECTING(3),
    DISCONNECTED(4),
    SUSPENDED(5);


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f22638a;

    zj(int i10) {
        this.f22638a = i10;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f22638a);
    }

    @Override // com.google.android.gms.internal.ads.us1
    public final int zza() {
        return this.f22638a;
    }
}
