package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class q02 extends Exception {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f18851a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f18852b;

    public q02(int i10, boolean z10) {
        super(l1.d.k(new StringBuilder(String.valueOf(i10).length() + 26), "AudioOutput write failed: ", i10));
        this.f18852b = z10;
        this.f18851a = i10;
    }
}
