package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Build;
import android.os.Looper;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class fy1 {

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final /* synthetic */ int f14575z = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f14576a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final s6 f14577b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final z61 f14578c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final mm0 f14579d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public q81 f14580e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public q81 f14581f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final zl f14582g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Looper f14583h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f14584i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final z80 f14585j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f14586k;
    public final boolean l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final wz1 f14587m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final vz1 f14588n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final long f14589o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final long f14590p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final int f14591q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final int f14592r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final int f14593s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final int f14594t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final boolean f14595u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f14596v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final String f14597w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final boolean f14598x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final zx1 f14599y;

    static {
        String str = uu0.f20901a;
        String strE = x10.e(Build.DEVICE);
        if (strE.contains("emulator") || strE.contains("emu64a") || strE.contains("emu64x")) {
            return;
        }
        strE.contains("generic");
    }

    public fy1(Context context, b21 b21Var) {
        z61 z61Var = new z61(b21Var);
        mm0 mm0Var = new mm0(context);
        sl slVar = new sl(context, 3);
        ey1 ey1Var = ey1.f14111b;
        zl zlVar = new zl(context, 2);
        context.getClass();
        this.f14576a = context;
        this.f14578c = z61Var;
        this.f14579d = mm0Var;
        this.f14580e = slVar;
        this.f14581f = ey1Var;
        this.f14582g = zlVar;
        String str = uu0.f20901a;
        Looper looperMyLooper = Looper.myLooper();
        this.f14583h = looperMyLooper == null ? Looper.getMainLooper() : looperMyLooper;
        this.f14585j = z80.f22559b;
        this.f14586k = 1;
        this.l = true;
        this.f14587m = wz1.f21653c;
        this.f14588n = vz1.f21326b;
        this.f14599y = new zx1(uu0.t(20L), uu0.t(500L));
        this.f14577b = s6.f19862f;
        this.f14589o = 500L;
        this.f14590p = 2000L;
        this.f14591q = 600000;
        this.f14592r = Integer.MAX_VALUE;
        this.f14593s = Integer.MAX_VALUE;
        this.f14594t = 600000;
        this.f14595u = true;
        this.f14597w = "";
        this.f14584i = -1000;
        if (Build.VERSION.SDK_INT >= 35) {
            int i10 = cy1.f13311a;
        }
        this.f14598x = true;
    }
}
