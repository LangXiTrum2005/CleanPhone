package ads_mobile_sdk;

import com.ironsource.mediationsdk.utils.IronSourceConstants;
import complexometry.formularize;
import java.util.LinkedHashMap;
import java.util.List;
import saneness.coffeecake;
import saneness.dustman;
import saneness.eia;
import saneness.revoltingly;

/* JADX INFO: loaded from: classes.dex */
public final class e70 {
    public ks2 A;
    public ls2 B;
    public ms2 C;
    public os2 D;
    public ps2 E;
    public ws2 F;
    public nr2 G;
    public vs2 H;
    public qr2 I;
    public qs2 J;
    public rs2 K;
    public ts2 L;
    public wr2 M;
    public ss2 N;
    public us2 O;
    public xs2 P;
    public sr2 Q;
    public hs2 R;
    public js2 S;
    public xr2 T;
    public fs2 U;
    public ds2 V;
    public ns2 W;
    public xm2 X;
    public h21 Y;
    public v61 Z;
    public final i60 a;
    public f71 a0;
    public coffeecake b;
    public z61 b0;
    public coffeecake c;
    public b71 c0;
    public h21 d;
    public e71 d0;
    public coffeecake e;
    public coffeecake e0;
    public lq f;
    public tt2 f0;
    public pr2 g;
    public bn2 g0;
    public h21 h;
    public coffeecake h0;
    public h21 i;
    public coffeecake i0;
    public h21 j;
    public tg2 j0;
    public h21 k;
    public u61 k0;
    public rr2 l;
    public y61 l0;
    public ur2 m;
    public c71 m0;
    public tr2 n;
    public a71 n0;
    public g71 o;
    public coffeecake o0;
    public or2 p;
    public coffeecake p0;
    public vr2 q;
    public b80 q0;
    public yr2 r;
    public coffeecake r0;
    public mr2 s;
    public r02 s0;
    public zr2 t;
    public coffeecake t0;
    public as2 u;
    public bs2 v;
    public cs2 w;
    public es2 x;
    public gs2 y;
    public is2 z;

    public e70(i60 i60Var, yf2 yf2Var, formularize formularizeVar, xb2 xb2Var, j71 j71Var, gy0 gy0Var, Boolean bool, rc2 rc2Var, Boolean bool2, d6 d6Var) {
        this.a = i60Var;
        a(yf2Var, formularizeVar, bool, bool2, d6Var);
        a();
        a(gy0Var, rc2Var);
        a(xb2Var, j71Var);
        b();
    }

    public final void a(yf2 yf2Var, formularize formularizeVar, Boolean bool, Boolean bool2, d6 d6Var) {
        d71 d71Var = new d71(this.a.o0);
        Object obj = qd0.c;
        this.b = new qd0(d71Var);
        this.c = new qd0(new h71(this.a.C2));
        this.d = h21.a(d6Var);
        i60 i60Var = this.a;
        this.e = yt2.a(new ss1(i60Var.h0, i60Var.e0, i60Var.z, i60Var.y, i60Var.p, i60Var.g));
        i60 i60Var2 = this.a;
        coffeecake coffeecakeVar = i60Var2.d2;
        coffeecake coffeecakeVar2 = i60Var2.p;
        this.f = new lq(coffeecakeVar, coffeecakeVar2);
        this.g = new pr2(i60Var2.Z1, coffeecakeVar2);
        this.h = h21.a(formularizeVar);
        this.i = eia.f37136attabal;
        this.j = h21.a(yf2Var);
        this.k = h21.a(bool);
        h21 h21VarA = h21.a(bool2);
        i60 i60Var3 = this.a;
        qd0 qd0Var = new qd0(new i4(i60Var3.g, this.h, this.i, i60Var3.K0, i60Var3.d, this.j, this.k, i60Var3.p, i60Var3.E2, h21VarA));
        i60 i60Var4 = this.a;
        coffeecake coffeecakeVar3 = i60Var4.p;
        this.l = new rr2(qd0Var, coffeecakeVar3);
        this.m = new ur2(new k6(i60Var4.M), coffeecakeVar3);
        h21 h21Var = this.i;
        h21 h21Var2 = this.j;
        this.n = new tr2(new b6(h21Var, h21Var2, i60Var4.d, coffeecakeVar3), coffeecakeVar3);
        this.o = new g71(h21Var2);
        this.p = new or2(this.h);
        int i = xm2.f3295attabal;
        List listDern = dustman.dern(1);
        List listDern2 = dustman.dern(1);
        g71 g71Var = this.o;
        boolean z = wm2.c;
        if (!z && g71Var == null) {
            throw new AssertionError("Codegen error? Null provider");
        }
        listDern.add(g71Var);
        or2 or2Var = this.p;
        if (!z && or2Var == null) {
            throw new AssertionError("Codegen error? Null provider");
        }
        listDern2.add(or2Var);
        if (!z && dustman.saneness(listDern)) {
            throw new AssertionError("Codegen error?  Duplicates in the provider list");
        }
        if (!z && dustman.saneness(listDern2)) {
            throw new AssertionError("Codegen error?  Duplicates in the provider list");
        }
        t6 t6Var = new t6(new xm2(listDern, listDern2));
        i60 i60Var5 = this.a;
        coffeecake coffeecakeVar4 = i60Var5.p;
        this.q = new vr2(t6Var, coffeecakeVar4);
        this.r = new yr2(i60Var5.F2, coffeecakeVar4);
        this.s = new mr2(i60Var5.x1, coffeecakeVar4);
        this.t = new zr2(i60Var5.G2, coffeecakeVar4);
    }

    public final void b() {
        k31 k31Var = new k31(this.b, this.c, this.d, this.i0, this.s0, this.r0, this.e0, this.a.p, this.o0);
        Object obj = qd0.c;
        this.t0 = new qd0(k31Var);
    }

    public final void a() {
        i60 i60Var = this.a;
        coffeecake coffeecakeVar = i60Var.i2;
        coffeecake coffeecakeVar2 = i60Var.p;
        this.u = new as2(coffeecakeVar, coffeecakeVar2);
        this.v = new bs2(i60Var.k2, coffeecakeVar2);
        this.w = new cs2(new ap(this.j, i60Var.I0, this.h, i60Var.f1), coffeecakeVar2);
        this.x = new es2(i60Var.H2, coffeecakeVar2);
        coffeecake coffeecakeVarA = yt2.a(new tf0(coffeecakeVar2));
        i60 i60Var2 = this.a;
        coffeecake coffeecakeVar3 = i60Var2.p;
        this.y = new gs2(coffeecakeVarA, coffeecakeVar3);
        this.z = new is2(i60Var2.I2, coffeecakeVar3);
        this.A = new ks2(coffeecakeVar3, new ef1(i60Var2.c0));
        this.B = new ls2(i60Var2.J2, coffeecakeVar3);
        this.C = new ms2(i60Var2.z1, coffeecakeVar3);
        this.D = new os2(i60Var2.K2, coffeecakeVar3);
        this.E = new ps2(i60Var2.L2, coffeecakeVar3);
        this.F = new ws2(i60Var2.D1, coffeecakeVar3);
        coffeecake coffeecakeVarA2 = yt2.a(new zw2(i60Var2.n1));
        i60 i60Var3 = this.a;
        coffeecake coffeecakeVar4 = i60Var3.p;
        this.G = new nr2(coffeecakeVarA2, coffeecakeVar4);
        this.H = new vs2(i60Var3.M2, coffeecakeVar4);
        this.I = new qr2(i60Var3.v1, coffeecakeVar4);
        ic2 ic2Var = new ic2(i60Var3.C2, i60Var3.N2, this.h, i60Var3.c0);
        Object obj = qd0.c;
        this.J = new qs2(new qd0(ic2Var), this.a.p);
        qd0 qd0Var = new qd0(new qf2(this.b));
        i60 i60Var4 = this.a;
        coffeecake coffeecakeVar5 = i60Var4.p;
        this.K = new rs2(qd0Var, coffeecakeVar5);
        this.L = new ts2(i60Var4.B1, coffeecakeVar5);
        this.M = new wr2(i60Var4.O2, coffeecakeVar5);
    }

    public final void a(gy0 gy0Var, rc2 rc2Var) {
        h21 h21Var = eia.f37136attabal;
        i60 i60Var = this.a;
        coffeecake coffeecakeVar = i60Var.p;
        h21 h21Var2 = i60Var.d;
        this.N = new ss2(new yj2(coffeecakeVar, this.i, h21Var, new qj2(coffeecakeVar, h21Var2, i60Var.g, i60Var.I0, i60Var.G, i60Var.b1, i60Var.t, i60Var.q, i60Var.H), this.j, this.h), coffeecakeVar);
        this.O = new us2(i60Var.P2, coffeecakeVar);
        this.P = new xs2(i60Var.Q2, coffeecakeVar);
        this.Q = new sr2(i60Var.g2, coffeecakeVar);
        this.R = new hs2(i60Var.R2, coffeecakeVar);
        this.S = new js2(new l11(i60Var.Q0), coffeecakeVar);
        this.T = new xr2(i60Var.S2, coffeecakeVar);
        this.U = new fs2(new ld0(h21Var2), coffeecakeVar);
        this.V = new ds2(i60Var.T2, coffeecakeVar);
        u02 u02Var = new u02(h21.a(rc2Var));
        Object obj = qd0.c;
        this.W = new ns2(new qd0(u02Var), this.a.p);
        int i = xm2.f3295attabal;
        wm2 wm2Var = new wm2(38);
        wm2Var.a(this.f);
        wm2Var.a(this.g);
        wm2Var.a(this.l);
        wm2Var.a(this.m);
        wm2Var.a(this.n);
        wm2Var.a(this.q);
        wm2Var.a(this.r);
        wm2Var.a(this.s);
        wm2Var.a(this.t);
        wm2Var.a(this.u);
        wm2Var.a(this.v);
        wm2Var.a(this.w);
        wm2Var.a(this.x);
        wm2Var.a(this.y);
        wm2Var.a(this.z);
        wm2Var.a(this.A);
        wm2Var.a(this.B);
        wm2Var.a(this.C);
        wm2Var.a(this.D);
        wm2Var.a(this.E);
        wm2Var.a(this.F);
        wm2Var.a(this.G);
        wm2Var.a(this.H);
        wm2Var.a(this.I);
        wm2Var.a(this.J);
        wm2Var.a(this.K);
        wm2Var.a(this.L);
        wm2Var.a(this.M);
        wm2Var.a(this.N);
        wm2Var.a(this.O);
        wm2Var.a(this.P);
        wm2Var.a(this.Q);
        wm2Var.a(this.R);
        wm2Var.a(this.S);
        wm2Var.a(this.T);
        wm2Var.a(this.U);
        wm2Var.a(this.V);
        wm2Var.a(this.W);
        this.X = wm2Var.a();
        h21 h21VarA = h21.a(gy0Var);
        this.Y = h21VarA;
        this.Z = new v61(h21VarA);
        i60 i60Var2 = this.a;
        f71 f71Var = new f71(i60Var2.g);
        this.a0 = f71Var;
        this.b0 = new z61(new qd0(new jv2(i60Var2.N2, i60Var2.C2, this.b, f71Var)));
        i60 i60Var3 = this.a;
        this.c0 = new b71(i60Var3.G1);
        this.d0 = new e71(i60Var3.j3);
    }

    public final void a(xb2 xb2Var, j71 j71Var) {
        h21 h21Var = bd1.b;
        LinkedHashMap linkedHashMapAttabal = dustman.attabal(5);
        ag agVar = this.a.U2;
        if (agVar != null) {
            linkedHashMapAttabal.put("configLoaderRefreshSignalRequestedListener", agVar);
            v61 v61Var = this.Z;
            if (v61Var != null) {
                linkedHashMapAttabal.put("InspectorAdLifecycleMonitorRequestListener", v61Var);
                z61 z61Var = this.b0;
                if (z61Var != null) {
                    linkedHashMapAttabal.put("adUnitStatsTrackerSignalsRequestedListener", z61Var);
                    b71 b71Var = this.c0;
                    if (b71Var != null) {
                        linkedHashMapAttabal.put("customTabsConnectionInitializationTask", b71Var);
                        e71 e71Var = this.d0;
                        if (e71Var != null) {
                            linkedHashMapAttabal.put("nativeSingletonPreloaderAsInternalAdRequestEventListener", e71Var);
                            q31 q31Var = new q31(this.a.t, new bd1(linkedHashMapAttabal));
                            Object obj = qd0.c;
                            qd0 qd0Var = new qd0(q31Var);
                            this.e0 = qd0Var;
                            xm2 xm2Var = this.X;
                            i60 i60Var = this.a;
                            this.f0 = new tt2(xm2Var, i60Var.v, i60Var.t, i60Var.p, this.h, qd0Var);
                            this.g0 = new bn2(i60Var.e0);
                            LinkedHashMap linkedHashMapAttabal2 = dustman.attabal(5);
                            bn2 bn2Var = this.g0;
                            if (bn2Var != null) {
                                linkedHashMapAttabal2.put("setCookie", bn2Var);
                                coffeecake coffeecakeVar = this.a.s3;
                                if (coffeecakeVar != null) {
                                    linkedHashMapAttabal2.put("invokeGetTopicsApiWithRecordObservation", coffeecakeVar);
                                    coffeecake coffeecakeVar2 = this.a.t3;
                                    if (coffeecakeVar2 != null) {
                                        linkedHashMapAttabal2.put("setInspectorGesture", coffeecakeVar2);
                                        coffeecake coffeecakeVar3 = this.a.u3;
                                        if (coffeecakeVar3 != null) {
                                            linkedHashMapAttabal2.put("setInspectorServerData", coffeecakeVar3);
                                            coffeecake coffeecakeVar4 = this.a.v3;
                                            if (coffeecakeVar4 != null) {
                                                this.h0 = new qd0(new m(revoltingly.attabal(linkedHashMapAttabal2, "setTestMode", coffeecakeVar4, linkedHashMapAttabal2)));
                                                h21 h21Var2 = eia.f37136attabal;
                                                i60 i60Var2 = this.a;
                                                qd0 qd0Var2 = new qd0(new kf2(i60Var2.p, i60Var2.c0, i60Var2.q, i60Var2.k3, h21Var2, i60Var2.o0, i60Var2.h0, i60Var2.B, i60Var2.d));
                                                i60 i60Var3 = this.a;
                                                this.i0 = new qd0(new gt1(i60Var3.h0, this.e, this.f0, this.h, this.e0, this.h0, qd0Var2, i60Var3.w3, i60Var3.p, i60Var3.o0, i60Var3.q, i60Var3.W1));
                                                i60 i60Var4 = this.a;
                                                coffeecake coffeecakeVar5 = i60Var4.p;
                                                coffeecake coffeecakeVar6 = i60Var4.t2;
                                                coffeecake coffeecakeVar7 = i60Var4.g;
                                                this.j0 = new tg2(coffeecakeVar5, coffeecakeVar6, coffeecakeVar7, i60Var4.t, i60Var4.z, i60Var4.B0, i60Var4.r0, i60Var4.H, i60Var4.q);
                                                this.k0 = new u61(this.Y);
                                                this.l0 = new y61(new qd0(new e7(this.b, this.h, i60Var4.N2, coffeecakeVar7)));
                                                i60 i60Var5 = this.a;
                                                this.m0 = new c71(i60Var5.y3);
                                                this.n0 = new a71(i60Var5.G1);
                                                LinkedHashMap linkedHashMapAttabal3 = dustman.attabal(4);
                                                u61 u61Var = this.k0;
                                                if (u61Var != null) {
                                                    linkedHashMapAttabal3.put("InspectorAdLifecycleMonitorLoadListener", u61Var);
                                                    y61 y61Var = this.l0;
                                                    if (y61Var != null) {
                                                        linkedHashMapAttabal3.put("adUnitStatsTrackerAdLoadListener", y61Var);
                                                        c71 c71Var = this.m0;
                                                        if (c71Var != null) {
                                                            linkedHashMapAttabal3.put("debugSignalsAdLoadListener", c71Var);
                                                            a71 a71Var = this.n0;
                                                            if (a71Var != null) {
                                                                linkedHashMapAttabal3.put("customTabsConnectionInitializationTaskInternalAdLoadListener", a71Var);
                                                                qd0 qd0Var3 = new qd0(new b31(this.a.t, new bd1(linkedHashMapAttabal3)));
                                                                this.o0 = qd0Var3;
                                                                i60 i60Var6 = this.a;
                                                                this.p0 = new qd0(new we2(i60Var6.t, i60Var6.g, this.j0, i60Var6.x3, qd0Var3, this.d, this.c));
                                                                this.q0 = new b80(h21.a(xb2Var));
                                                                qd0 qd0Var4 = new qd0(new i71(this.q0, new b80(h21.a(j71Var))));
                                                                this.r0 = qd0Var4;
                                                                i60 i60Var7 = this.a;
                                                                qd0 qd0Var5 = new qd0(new s81(i60Var7.B3, qd0Var4, this.h, this.a0, this.c, this.b, this.j, this.k, this.Y, i60Var7.C3, this.d));
                                                                i60 i60Var8 = this.a;
                                                                this.s0 = new r02(i60Var8.t, i60Var8.s, i60Var8.w3, i60Var8.g, this.p0, qd0Var5);
                                                                return;
                                                            }
                                                            throw new NullPointerException(IronSourceConstants.EVENTS_PROVIDER);
                                                        }
                                                        throw new NullPointerException(IronSourceConstants.EVENTS_PROVIDER);
                                                    }
                                                    throw new NullPointerException(IronSourceConstants.EVENTS_PROVIDER);
                                                }
                                                throw new NullPointerException(IronSourceConstants.EVENTS_PROVIDER);
                                            }
                                            throw new NullPointerException(IronSourceConstants.EVENTS_PROVIDER);
                                        }
                                        throw new NullPointerException(IronSourceConstants.EVENTS_PROVIDER);
                                    }
                                    throw new NullPointerException(IronSourceConstants.EVENTS_PROVIDER);
                                }
                                throw new NullPointerException(IronSourceConstants.EVENTS_PROVIDER);
                            }
                            throw new NullPointerException(IronSourceConstants.EVENTS_PROVIDER);
                        }
                        throw new NullPointerException(IronSourceConstants.EVENTS_PROVIDER);
                    }
                    throw new NullPointerException(IronSourceConstants.EVENTS_PROVIDER);
                }
                throw new NullPointerException(IronSourceConstants.EVENTS_PROVIDER);
            }
            throw new NullPointerException(IronSourceConstants.EVENTS_PROVIDER);
        }
        throw new NullPointerException(IronSourceConstants.EVENTS_PROVIDER);
    }
}
