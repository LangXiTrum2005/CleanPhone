package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class r42 extends ci {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Object f19373g = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f19374b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f19375c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f19376d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final f5 f19377e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final w1 f19378f;

    static {
        aa1 aa1Var = ca1.f13122b;
        ya1 ya1Var = ya1.f22208e;
        List list = Collections.EMPTY_LIST;
        ya1 ya1Var2 = ya1.f22208e;
        t3 t3Var = t3.f20138a;
        Uri uri = Uri.EMPTY;
        if (uri != null) {
            new l2(uri, ya1Var2);
        }
        new b0();
        f7 f7Var = f7.B;
    }

    public r42(long j10, long j11, boolean z10, f5 f5Var, w1 w1Var) {
        this.f19374b = j10;
        this.f19375c = j11;
        this.f19376d = z10;
        f5Var.getClass();
        this.f19377e = f5Var;
        this.f19378f = w1Var;
    }

    @Override // com.google.android.gms.internal.ads.ci
    public final int a() {
        return 1;
    }

    @Override // com.google.android.gms.internal.ads.ci
    public final ih b(int i10, ih ihVar, long j10) {
        ps1.f0(i10, 1);
        Object obj = ih.f15742m;
        ihVar.a(this.f19377e, this.f19376d, false, this.f19378f, this.f19375c);
        return ihVar;
    }

    @Override // com.google.android.gms.internal.ads.ci
    public final int c() {
        return 1;
    }

    @Override // com.google.android.gms.internal.ads.ci
    public final ug d(int i10, ug ugVar, boolean z10) {
        ps1.f0(i10, 1);
        Object obj = z10 ? f19373g : null;
        vw vwVar = vw.f21303b;
        ugVar.a(null, obj, 0, this.f19374b, false);
        return ugVar;
    }

    @Override // com.google.android.gms.internal.ads.ci
    public final int e(Object obj) {
        return f19373g.equals(obj) ? 0 : -1;
    }

    @Override // com.google.android.gms.internal.ads.ci
    public final Object f(int i10) {
        ps1.f0(i10, 1);
        return f19373g;
    }
}
