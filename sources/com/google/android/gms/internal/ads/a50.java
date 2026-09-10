package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.RemoteException;
import com.applovin.sdk.AppLovinMediationProvider;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzcv;
import com.google.android.gms.ads.internal.client.zzez;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zzbz;
import com.google.android.gms.ads.internal.util.zzca;
import com.google.android.gms.ads.internal.util.zzd;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.nonagon.devicetier.DeviceTierManager;
import com.google.android.gms.ads.nonagon.devicetier.zza;
import com.google.android.gms.ads.nonagon.signalgeneration.zzaq;
import com.google.android.gms.ads.nonagon.signalgeneration.zzb;
import com.google.android.gms.ads.nonagon.signalgeneration.zzm;
import com.google.android.gms.ads.nonagon.signalgeneration.zzt;
import com.google.android.gms.ads.nonagon.util.logging.csi.CsiParamDefaults_Factory;
import com.google.android.gms.ads.nonagon.util.logging.csi.CsiUrlBuilder_Factory;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class a50 {
    public static a50 P0;
    public final fx1 A;
    public final fx1 A0;
    public final q40 B;
    public final fx1 B0;
    public final fx1 C;
    public final u50 C0;
    public final fx1 D;
    public final fx1 D0;
    public final fx1 E;
    public final fx1 E0;
    public final k40 F;
    public final fx1 F0;
    public final fx1 G;
    public final ei G0;
    public final fx1 H;
    public final fx1 H0;
    public final hx1 I;
    public final n70 I0;
    public final fx1 J;
    public final fx1 J0;
    public final o50 K;
    public final fx1 K0;
    public final fx1 L;
    public final fx1 L0;
    public final fx1 M;
    public final fx1 M0;
    public final fx1 N;
    public final fx1 N0;
    public final fx1 O;
    public final fx1 O0;
    public final fx1 P;
    public final fx1 Q;
    public final fx1 R;
    public final fx1 S;
    public final fx1 T;
    public final fx1 U;
    public final fx1 V;
    public final t40 W;
    public final w40 X;
    public final fx1 Y;
    public final v40 Z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j40 f11852a;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final fx1 f11853a0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a50 f11854b = this;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final fx1 f11855b0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final fx1 f11856c;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public final fx1 f11857c0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final fx1 f11858d;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public final qr0 f11859d0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final fx1 f11860e;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public final fx1 f11861e0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final fx1 f11862f;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public final fx1 f11863f0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final o40 f11864g;
    public final tq0 g0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final u40 f11865h;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public final fx1 f11866h0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final fx1 f11867i;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public final yr0 f11868i0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final fx1 f11869j;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public final fx1 f11870j0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final fx1 f11871k;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public final fs0 f11872k0;
    public final fx1 l;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public final fx1 f11873l0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final fx1 f11874m;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public final fx1 f11875m0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final fx1 f11876n;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public final fx1 f11877n0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final fx1 f11878o;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public final fx1 f11879o0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final fx1 f11880p;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final fx1 f11881p0;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final fx1 f11882q;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final lq0 f11883q0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final fx1 f11884r;
    public final fx1 r0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final fx1 f11885s;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final sp0 f11886s0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final fx1 f11887t;
    public final fx1 t0;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final fx1 f11888u;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public final rq0 f11889u0;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final fx1 f11890v;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public final fx1 f11891v0;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final fx1 f11892w;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public final fx1 f11893w0;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final fx1 f11894x;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public final ir0 f11895x0;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final fx1 f11896y;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public final fx1 f11897y0;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final fx1 f11898z;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    public final fx1 f11899z0;

    public a50(j40 j40Var, jq jqVar) {
        this.f11852a = j40Var;
        fx1 fx1VarA = fx1.a(pi1.K);
        this.f11856c = fx1VarA;
        fx1 fx1VarA2 = fx1.a(new ej0(fx1.a(v71.f21095s), 12));
        this.f11858d = fx1VarA2;
        this.f11860e = fx1.a(ps1.f18804m);
        fx1 fx1VarA3 = fx1.a(new lr0(6));
        this.f11862f = fx1VarA3;
        o40 o40Var = new o40(j40Var);
        this.f11864g = o40Var;
        int i10 = 1;
        kx1 kx1VarA = mx1.a(new s40(o40Var, fx1.a(new m40(j40Var, 5)), i10));
        u40 u40Var = new u40(j40Var);
        this.f11865h = u40Var;
        int i11 = 0;
        fx1 fx1VarA4 = fx1.a(new n40(o40Var, i11));
        this.f11867i = fx1VarA4;
        fx1 fx1VarA5 = fx1.a(new s40(o40Var, fx1VarA4, i11));
        this.f11869j = fx1VarA5;
        fx1 fx1VarA6 = fx1.a(new n40(o40Var, i10));
        fx1 fx1VarA7 = fx1.a(zza.zza(o40Var));
        this.f11871k = fx1VarA7;
        CsiParamDefaults_Factory csiParamDefaults_FactoryCreate = CsiParamDefaults_Factory.create(o40Var, u40Var, fx1VarA5, fx1VarA6, fx1VarA7);
        lr0 lr0Var = dv.l;
        fx1 fx1VarA8 = fx1.a(new l40(kx1VarA, csiParamDefaults_FactoryCreate, CsiUrlBuilder_Factory.create(), o40Var, 10));
        this.l = fx1VarA8;
        fx1 fx1VarA9 = fx1.a(new wd0(fx1VarA8, 19));
        this.f11874m = fx1VarA9;
        fx1 fx1VarA10 = fx1.a(rb0.f19501d);
        this.f11876n = fx1VarA10;
        this.f11878o = fx1.a(new g40(fx1VarA10, fx1VarA9, i11));
        fx1 fx1VarA11 = fx1.a(new nj0(o40Var, u40Var, 1));
        this.f11880p = fx1VarA11;
        n40 n40Var = new n40(o40Var, 3);
        fx1 fx1VarA12 = fx1.a(v71.f21090n);
        this.f11882q = fx1VarA12;
        fx1 fx1VarA13 = fx1.a(new oz(n40Var, fx1VarA12, 18));
        this.f11884r = fx1VarA13;
        fx1 fx1VarA14 = fx1.a(new r40(fx1VarA13, 2));
        this.f11885s = fx1VarA14;
        fx1 fx1VarA15 = fx1.a(new qd0(23));
        this.f11887t = fx1VarA15;
        m40 m40Var = new m40(j40Var, 2);
        fx1 fx1VarA16 = fx1.a(new ei(5));
        this.f11888u = fx1VarA16;
        fx1 fx1VarA17 = fx1.a(new g40(fx1VarA16, fx1VarA8, 9));
        fx1 fx1VarA18 = fx1.a(x10.f21688o);
        this.f11890v = fx1VarA18;
        fx1 fx1VarA19 = fx1.a(new r40(fx1VarA18, 0));
        int i12 = lx1.f17149c;
        List list = Collections.EMPTY_LIST;
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(fx1VarA19);
        ca0 ca0Var = new ca0(new lx1(list, arrayList), 17);
        fx1 fx1VarA20 = fx1.a(new g40(fx1VarA10, fx1VarA2, 1));
        fx1 fx1VarA21 = fx1.a(new l40(o40Var, u40Var, fx1VarA12, fx1VarA20));
        this.f11892w = fx1VarA21;
        fx1 fx1VarA22 = fx1.a(new og0(fx1VarA, o40Var, m40Var, fx1VarA13, fx1VarA2, fx1VarA17, u40Var, ca0Var, fx1VarA21));
        this.f11894x = fx1VarA22;
        fx1 fx1VarA23 = fx1.a(new ei(11));
        this.f11896y = fx1VarA23;
        fx1 fx1VarA24 = fx1.a(new qd0(10));
        this.f11898z = fx1VarA24;
        fx1 fx1VarA25 = fx1.a(new nj0(o40Var, u40Var, 0));
        fx1 fx1VarA26 = fx1.a(new n40(o40Var, 5));
        fx1 fx1VarA27 = fx1.a(new n40(o40Var, 4));
        fx1 fx1VarA28 = fx1.a(new g40(fx1VarA22, fx1VarA12, 10));
        fx1 fx1VarA29 = fx1.a(new fz(o40Var, m40Var, fx1VarA25, 11));
        this.A = fx1VarA29;
        q40 q40Var = new q40(o40Var);
        this.B = q40Var;
        fx1 fx1VarA30 = fx1.a(new te0(fx1VarA25, fx1VarA26, fx1VarA27, o40Var, u40Var, fx1VarA28, fx1VarA29, q40Var));
        this.C = fx1VarA30;
        m40 m40Var2 = new m40(j40Var, 3);
        fx1 fx1VarA31 = fx1.a(new f90(o40Var, fx1VarA21, u40Var));
        this.D = fx1VarA31;
        fx1 fx1VarA32 = fx1.a(new n40(o40Var, 6));
        fx1 fx1VarA33 = fx1.a(new ei(2));
        this.E = fx1VarA33;
        k40 k40Var = new k40(fx1VarA33);
        this.F = k40Var;
        this.G = fx1.a(new s50(o40Var, u40Var, fx1VarA13, fx1VarA14, fx1VarA15, fx1VarA22, fx1VarA23, fx1VarA24, fx1VarA30, m40Var2, fx1VarA21, n40Var, fx1VarA31, fx1VarA9, fx1.a(new l40(fx1VarA32, fx1VarA9, o40Var, k40Var))));
        fx1 fx1VarA34 = fx1.a(new ej0(fx1VarA2, 13));
        s40 s40Var = new s40(o40Var, fx1VarA9);
        fx1 fx1VarA35 = fx1.a(new l40((gx1) k40Var, fx1VarA2, (kx1) s40Var, fx1VarA3, 0));
        fx1 fx1VarA36 = fx1.a(new te0(o40Var, u40Var, fx1VarA2, fx1VarA34, n40Var, fx1VarA3, fx1VarA35, s40Var));
        int i13 = 14;
        this.H = fx1.a(new g40(fx1.a(new l40(fx1VarA36, s40Var, o40Var, fx1VarA3)), fx1.a(new n60(fx1VarA36, s40Var, o40Var, fx1VarA3, fx1VarA35, k40Var)), i13));
        hx1 hx1VarA = hx1.a(this);
        this.I = hx1VarA;
        fx1 fx1VarA37 = fx1.a(new g40(fx1.a(new m40(j40Var, 4)), fx1.a(new m40(j40Var, 0)), 2));
        this.J = fx1VarA37;
        o50 o50Var = new o50(jqVar);
        this.K = o50Var;
        fx1 fx1VarA38 = fx1.a(new n40(o40Var, 7));
        this.L = fx1VarA38;
        fx1 fx1VarA39 = fx1.a(x10.f21693t);
        fx1 fx1VarA40 = fx1.a(new ej0(fx1VarA38, i13));
        this.M = fx1VarA40;
        fx1 fx1VarA41 = fx1.a(new n60(o40Var, fx1VarA39, kx1VarA, fx1VarA40, fx1VarA21, fx1VarA20));
        this.N = fx1VarA41;
        fx1 fx1VarA42 = fx1.a(new l40((gx1) o40Var, fx1VarA38, kx1VarA, fx1VarA9, 12));
        this.O = fx1VarA42;
        fx1 fx1VarA43 = fx1.a(new ej0(fx1VarA37, 10));
        this.P = fx1VarA43;
        fx1 fx1VarA44 = fx1.a(new r40(fx1.a(new og0(o40Var, fx1VarA, fx1VarA37, u40Var, o50Var, fx1VarA38, fx1VarA41, fx1VarA9, fx1VarA42, fx1VarA43)), 3));
        this.Q = fx1VarA44;
        fx1 fx1VarA45 = fx1.a(zzm.zza(o40Var, fx1VarA8, lr0Var));
        fx1 fx1VarA46 = fx1.a(zzb.zza(o40Var, pi1.D, rb0.f19507j, u40Var));
        this.R = fx1.a(zzaq.zza(hx1VarA, o40Var, fx1VarA37, fx1VarA44, lr0Var, fx1VarA2, fx1VarA8, fx1VarA41, u40Var, new rm(fx1VarA2, fx1VarA45, fx1VarA46, fx1VarA8), fx1VarA43, fx1VarA45, fx1VarA46));
        this.S = fx1.a(zzt.zza(fx1VarA8));
        this.T = fx1.a(ps1.l);
        this.U = fx1.a(zzca.zza(o40Var));
        int i14 = 22;
        int i15 = 15;
        this.V = fx1.a(new e60(new g40(fx1.a(new e60(new m40(j40Var, 1), i14)), fx1.a(new wd0(fx1VarA9, 7)), i15), 16));
        this.W = new t40(hx1VarA);
        this.X = new w40(o40Var, fx1VarA21);
        this.Y = fx1.a(v71.f21088k);
        this.Z = new v40(fx1VarA33);
        this.f11853a0 = fx1.a(new wd0(fx1VarA3, 20));
        this.f11855b0 = fx1.a(new fz(new fz(o40Var, fx1VarA11, fx1VarA6, 25), fx1VarA3, fx1VarA9, i15));
        this.f11857c0 = fx1.a(dv.f13738j);
        qr0 qr0Var = new qr0(fx1VarA4, fx1VarA5, o40Var);
        this.f11859d0 = qr0Var;
        this.f11861e0 = fx1.a(new fz(qr0Var, fx1VarA3, fx1VarA9, 21));
        this.f11863f0 = fx1.a(x10.f21689p);
        tq0 tq0Var = new tq0(o40Var);
        this.g0 = tq0Var;
        this.f11866h0 = fx1.a(new fz(tq0Var, fx1VarA3, fx1VarA9, 19));
        yr0 yr0Var = new yr0(o40Var, u40Var, q40Var);
        this.f11868i0 = yr0Var;
        this.f11870j0 = fx1.a(new fz(yr0Var, fx1VarA3, fx1VarA9, i14));
        fs0 fs0Var = new fs0(o40Var);
        this.f11872k0 = fs0Var;
        this.f11873l0 = fx1.a(new fz(fs0Var, fx1VarA3, fx1VarA9, 23));
        int i16 = 13;
        this.f11875m0 = fx1.a(new fz(new n40(o40Var, 8), fx1VarA3, fx1VarA9, i16));
        this.f11877n0 = fx1.a(new g40(fx1VarA3, fx1VarA9, 12));
        this.f11879o0 = fx1.a(dv.f13737i);
        this.f11881p0 = fx1.a(new g40(fx1VarA3, fx1VarA9, i16));
        lq0 lq0Var = new lq0(fx1VarA33);
        this.f11883q0 = lq0Var;
        this.r0 = fx1.a(new fz(lq0Var, fx1VarA3, fx1VarA9, 17));
        sp0 sp0Var = new sp0(o40Var);
        this.f11886s0 = sp0Var;
        this.t0 = fx1.a(new fz(sp0Var, fx1VarA3, fx1VarA9, 16));
        rq0 rq0Var = new rq0(u40Var);
        this.f11889u0 = rq0Var;
        this.f11891v0 = fx1.a(new fz(rq0Var, fx1VarA3, fx1VarA9, 18));
        fx1 fx1VarA47 = fx1.a(new ei(4));
        this.f11893w0 = fx1VarA47;
        ir0 ir0Var = new ir0(o40Var, fx1VarA47);
        this.f11895x0 = ir0Var;
        this.f11897y0 = fx1.a(new fz(ir0Var, fx1VarA3, fx1VarA9, 20));
        this.f11899z0 = fx1.a(pi1.E);
        this.A0 = fx1.a(new m40(j40Var, 6));
        this.B0 = fx1.a(new fz(new n40(o40Var, 9), fx1VarA3, fx1VarA9, 14));
        this.C0 = new u50(o40Var);
        this.D0 = fx1.a(dv.f13739k);
        this.E0 = fx1.a(rb0.l);
        this.F0 = fx1.a(new r40(fx1VarA13, 1));
        this.G0 = new ei(8);
        this.H0 = fx1.a(new f90(o40Var, u40Var, fx1VarA21));
        this.I0 = new n70(fx1VarA2, fx1VarA3, fx1VarA9);
        this.J0 = fx1.a(rb0.f19508k);
        this.K0 = fx1.a(v71.f21094r);
        this.L0 = fx1.a(new n40(o40Var, 2));
        this.M0 = fx1.a(new wd0(fx1VarA9, 3));
        this.N0 = fx1.a(rb0.f19500c);
        this.O0 = fx1.a(new n40(o40Var, 10));
    }

    public static a50 a(Context context, st stVar, int i10) {
        fe1 fe1Var;
        SharedPreferences sharedPreferences;
        synchronized (a50.class) {
            try {
                a50 a50Var = P0;
                if (a50Var != null) {
                    return a50Var;
                }
                ((p9.b) com.google.android.gms.ads.internal.zzt.zzk()).getClass();
                long jCurrentTimeMillis = System.currentTimeMillis();
                am.a(context);
                boolean z10 = false;
                if (((Boolean) zm.f22663e.o()).booleanValue() && (sharedPreferences = context.getSharedPreferences(AppLovinMediationProvider.ADMOB, 0)) != null) {
                    sharedPreferences.edit().putInt("init_without_write", x10.B(context, "init_without_write") + 1).commit();
                }
                vu0 vu0VarH = vu0.h(context);
                com.google.android.gms.ads.internal.zzt.zzc();
                boolean zZzH = zzs.zzH((Context) vu0VarH.f21274b);
                VersionInfoParcel versionInfoParcel = new VersionInfoParcel(261710000, i10, true, zZzH);
                if (((Boolean) gn.f14904c.o()).booleanValue()) {
                    zzcv zzcvVar = (zzcv) vu0VarH.f21275c;
                    zzez liteSdkVersion = null;
                    if (zzcvVar != null) {
                        try {
                            liteSdkVersion = zzcvVar.getLiteSdkVersion();
                        } catch (RemoteException unused) {
                        }
                    }
                    if (liteSdkVersion != null) {
                        versionInfoParcel = new VersionInfoParcel(261710000, liteSdkVersion.zza(), true, zZzH);
                    }
                }
                vu0VarH.o(stVar);
                j40 j40Var = new j40();
                j40Var.f15965a = versionInfoParcel;
                j40Var.f15968d = new WeakReference(context);
                j40Var.f15966b = context.getApplicationContext() != null ? context.getApplicationContext() : context;
                j40Var.f15967c = jCurrentTimeMillis;
                j40 j40Var2 = new j40();
                j40Var2.f15965a = j40Var.f15965a;
                j40Var2.f15966b = j40Var.f15966b;
                j40Var2.f15968d = j40Var.f15968d;
                j40Var2.f15967c = j40Var.f15967c;
                a50 a50Var2 = new a50(j40Var2, new jq(17));
                if (((Boolean) zzba.zzc().a(am.f12428xf)).booleanValue()) {
                    i00 i00VarZze = com.google.android.gms.ads.internal.zzt.zze();
                    k00 k00Var = l00.f16608a;
                    ic1.h(k00Var);
                    i00VarZze.a(k00Var, (yh0) a50Var2.f11874m.zzb(), context);
                    i00 i00VarZze2 = com.google.android.gms.ads.internal.zzt.zze();
                    if (i00VarZze2.f15459d.get() && i00VarZze2.f15461f >= 0 && i00VarZze2.f15462g >= 0 && i00VarZze2.f15460e.compareAndSet(false, true) && (fe1Var = i00VarZze2.f15456a) != null) {
                        ((k00) fe1Var).a(new d(i00VarZze2, 18));
                    }
                }
                ((bk0) a50Var2.f11880p.zzb()).a();
                ((f40) a50Var2.f11878o.zzb()).a(context, versionInfoParcel);
                com.google.android.gms.ads.internal.zzt.zzh().b(context, versionInfoParcel, (yh0) a50Var2.f11874m.zzb());
                com.google.android.gms.ads.internal.zzt.zzj().a(context);
                com.google.android.gms.ads.internal.zzt.zzc().zzc(context);
                com.google.android.gms.ads.internal.zzt.zzc().zzd(context);
                zzd.zza(context);
                com.google.android.gms.ads.internal.zzt.zzg().a(context);
                com.google.android.gms.ads.internal.zzt.zzA().zza(context);
                if (((Boolean) zzba.zzc().a(am.Tf)).booleanValue()) {
                    String str = (String) zzba.zzc().a(am.Uf);
                    if (!str.isEmpty()) {
                        if (Arrays.asList(str.split(",")).contains(context.getPackageName())) {
                            ((jh0) a50Var2.V.zzb()).a(com.google.android.gms.ads.internal.zzt.zzg());
                        }
                    }
                } else if (((Boolean) zzba.zzc().a(am.Sf)).booleanValue()) {
                    ((jh0) a50Var2.V.zzb()).a(com.google.android.gms.ads.internal.zzt.zzg());
                }
                if (((Boolean) zzba.zzc().a(am.f12124dg)).booleanValue()) {
                    ((DeviceTierManager) a50Var2.f11871k.zzb()).initialize();
                }
                ((zzbz) a50Var2.U.zzb()).zza();
                hz.f(context);
                com.google.android.gms.ads.internal.zzt.zzD().f16570e = (yh0) a50Var2.f11874m.zzb();
                if (((Boolean) zzba.zzc().a(am.f12269n7)).booleanValue()) {
                    if (!((Boolean) zzba.zzc().a(am.f12264n1)).booleanValue()) {
                        pj pjVar = new pj(new t6.l(context, 5));
                        lj1 lj1Var = new lj1(new nl0(context), z10, (fe1) a50Var2.f11860e.zzb(), 23);
                        try {
                            lj1Var.i(new bc.i(3, new vu0(context, versionInfoParcel, pjVar, lj1Var), com.google.android.gms.ads.internal.zzt.zzh().g().zzx()));
                        } catch (Exception e10) {
                            String strValueOf = String.valueOf(e10.getMessage());
                            int i11 = zze.zza;
                            zzo.zzf("Error in offline signals database startup: ".concat(strValueOf));
                        }
                    }
                }
                if (((Boolean) zzba.zzc().a(am.Mf)).booleanValue()) {
                    Context context2 = a50Var2.f11852a.f15966b;
                    ic1.h(context2);
                    k00 k00Var2 = l00.f16608a;
                    ic1.h(k00Var2);
                    k00Var2.execute(new x60(new vu0(a50Var2, context2, k00Var2), 15));
                }
                P0 = a50Var2;
                return a50Var2;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final Executor b() {
        return (Executor) this.f11856c.zzb();
    }

    public final kw0 c() {
        return (kw0) this.f11892w.zzb();
    }
}
