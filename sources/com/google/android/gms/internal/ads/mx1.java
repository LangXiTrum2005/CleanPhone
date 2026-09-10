package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class mx1 implements kx1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object f17585c = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile gx1 f17586a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile Object f17587b;

    public static kx1 a(gx1 gx1Var) {
        if ((gx1Var instanceof mx1) || (gx1Var instanceof fx1)) {
            return gx1Var;
        }
        mx1 mx1Var = new mx1();
        mx1Var.f17587b = f17585c;
        mx1Var.f17586a = gx1Var;
        return mx1Var;
    }

    @Override // com.google.android.gms.internal.ads.kx1
    public final Object zzb() {
        Object obj = this.f17587b;
        if (obj != f17585c) {
            return obj;
        }
        gx1 gx1Var = this.f17586a;
        if (gx1Var == null) {
            return this.f17587b;
        }
        Object objZzb = gx1Var.zzb();
        this.f17587b = objZzb;
        this.f17586a = null;
        return objZzb;
    }
}
