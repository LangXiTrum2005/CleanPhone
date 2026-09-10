package com.google.android.gms.internal.ads;

import android.content.Context;
import android.util.Pair;
import android.util.SparseArray;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class c1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f12972a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a1 f12973b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final SparseArray f12974c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f12975d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final n0 f12976e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final s6 f12977f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final CopyOnWriteArraySet f12978g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f12979h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final g1 f12980i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public ht0 f12981j = new ht0(0);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public ys0 f12982k;
    public Pair l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f12983m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f12984n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public long f12985o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f12986p;

    public c1(x0 x0Var) {
        this.f12972a = x0Var.f21655a;
        a1 a1Var = (a1) x0Var.f21660f;
        a1Var.getClass();
        this.f12973b = a1Var;
        this.f12974c = new SparseArray();
        aa1 aa1Var = ca1.f13122b;
        ya1 ya1Var = ya1.f22208e;
        this.f12975d = x0Var.f21656b;
        s6 s6Var = (s6) x0Var.f21661g;
        this.f12977f = s6Var;
        this.f12979h = -x0Var.f21658d;
        g1 g1Var = (g1) x0Var.f21662h;
        this.f12980i = g1Var;
        this.f12976e = new n0((f1) x0Var.f21659e, g1Var, s6Var);
        this.f12978g = new CopyOnWriteArraySet();
        new g22(new i12());
        this.f12985o = C.TIME_UNSET;
        this.f12986p = -1;
        this.f12984n = 0;
    }
}
