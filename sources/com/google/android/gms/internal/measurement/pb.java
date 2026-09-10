package com.google.android.gms.internal.measurement;

import android.content.Context;
import com.google.android.gms.internal.ads.zs;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class pb {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final Object f23842j = new Object();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final AtomicReference f23843k = new AtomicReference();
    public static volatile pb l = null;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final na.r f23844m = no.b.z(tb.f23988b);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v9.e f23845a = new v9.e(7);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f23846b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final na.r f23847c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final na.r f23848d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final na.r f23849e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final na.r f23850f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final oe f23851g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final na.r f23852h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ee f23853i;

    public pb(Context context, na.r rVar, na.r rVar2, na.r rVar3, na.r rVar4, na.r rVar5) {
        Context applicationContext = context.getApplicationContext();
        applicationContext.getClass();
        rVar.getClass();
        rVar2.getClass();
        rVar3.getClass();
        rVar4.getClass();
        rVar5.getClass();
        na.r rVarZ = no.b.z(rVar);
        na.r rVarZ2 = no.b.z(rVar2);
        na.r rVarZ3 = no.b.z(new ub(rVar3, 0));
        na.r rVarZ4 = no.b.z(rVar4);
        na.r rVarZ5 = no.b.z(rVar5);
        this.f23846b = applicationContext;
        this.f23847c = rVarZ;
        this.f23848d = rVarZ2;
        this.f23849e = rVarZ3;
        this.f23850f = rVarZ4;
        this.f23851g = new oe(applicationContext, rVarZ, rVarZ4, rVarZ2);
        this.f23852h = rVarZ5;
        this.f23853i = new ee(applicationContext, rVarZ, rVarZ3, rVarZ2);
    }

    public static void b() {
        synchronized (gb.f23509c) {
        }
        if (f23843k.get() == null && gb.f23510d == null) {
            gb.f23510d = new zs(4);
        }
    }

    public final ta.q0 a() {
        return (ta.q0) this.f23847c.get();
    }
}
