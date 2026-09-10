package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class l32 extends h32 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Object f16697e = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f16698c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f16699d;

    public l32(ci ciVar, Object obj, Object obj2) {
        super(ciVar);
        this.f16698c = obj;
        this.f16699d = obj2;
    }

    @Override // com.google.android.gms.internal.ads.h32, com.google.android.gms.internal.ads.ci
    public final ih b(int i10, ih ihVar, long j10) {
        this.f15101b.b(i10, ihVar, j10);
        if (Objects.equals(ihVar.f15744a, this.f16698c)) {
            ihVar.f15744a = ih.f15742m;
        }
        return ihVar;
    }

    @Override // com.google.android.gms.internal.ads.h32, com.google.android.gms.internal.ads.ci
    public final ug d(int i10, ug ugVar, boolean z10) {
        this.f15101b.d(i10, ugVar, z10);
        if (Objects.equals(ugVar.f20771b, this.f16699d) && z10) {
            ugVar.f20771b = f16697e;
        }
        return ugVar;
    }

    @Override // com.google.android.gms.internal.ads.h32, com.google.android.gms.internal.ads.ci
    public final int e(Object obj) {
        Object obj2;
        if (f16697e.equals(obj) && (obj2 = this.f16699d) != null) {
            obj = obj2;
        }
        return this.f15101b.e(obj);
    }

    @Override // com.google.android.gms.internal.ads.h32, com.google.android.gms.internal.ads.ci
    public final Object f(int i10) {
        Object objF = this.f15101b.f(i10);
        return Objects.equals(objF, this.f16699d) ? f16697e : objF;
    }
}
