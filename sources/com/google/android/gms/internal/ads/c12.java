package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class c12 extends Exception {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f12990a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f12991b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g22 f12992c;

    public c12(int i10, g22 g22Var, boolean z10) {
        super(l1.d.k(new StringBuilder(String.valueOf(i10).length() + 25), "AudioTrack write failed: ", i10));
        this.f12991b = z10;
        this.f12990a = i10;
        this.f12992c = g22Var;
    }
}
