package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public class vh1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long[] f21176a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long[] f21177b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long[] f21178c;

    public vh1(long[] jArr, long[] jArr2, long[] jArr3) {
        this.f21176a = jArr;
        this.f21177b = jArr2;
        this.f21178c = jArr3;
    }

    public void a(long[] jArr, long[] jArr2) {
        System.arraycopy(jArr2, 0, jArr, 0, 10);
    }

    public final void b(vh1 vh1Var, int i10) {
        zw1.f(this.f21176a, vh1Var.f21176a, i10);
        zw1.f(this.f21177b, vh1Var.f21177b, i10);
        zw1.f(this.f21178c, vh1Var.f21178c, i10);
    }

    public vh1() {
        vh1 vh1Var = pi1.N;
        this.f21176a = Arrays.copyOf(vh1Var.f21176a, 10);
        this.f21177b = Arrays.copyOf(vh1Var.f21177b, 10);
        this.f21178c = Arrays.copyOf(vh1Var.f21178c, 10);
    }
}
