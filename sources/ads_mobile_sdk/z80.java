package ads_mobile_sdk;

import com.ironsource.mediationsdk.utils.IronSourceConstants;
import complexometry.formularize;
import java.util.LinkedHashMap;
import java.util.List;
import saneness.adjudge;
import saneness.coffeecake;
import saneness.dustman;
import saneness.eia;
import saneness.ib;

/* JADX INFO: loaded from: classes.dex */
public final class z80 implements adjudge {
    public gs2 A;
    public is2 B;
    public ks2 C;
    public ls2 D;
    public ms2 E;
    public os2 F;
    public ps2 G;
    public ws2 H;
    public nr2 I;
    public vs2 J;
    public qr2 K;
    public qs2 L;
    public rs2 M;
    public ts2 N;
    public wr2 O;
    public ss2 P;
    public us2 Q;
    public xs2 R;
    public sr2 S;
    public hs2 T;
    public js2 U;
    public xr2 V;
    public fs2 W;
    public ds2 X;
    public ns2 Y;
    public xm2 Z;
    public final i60 a;
    public f71 a0;
    public coffeecake b;
    public z61 b0;
    public coffeecake c;
    public b71 c0;
    public h21 d;
    public e71 d0;
    public coffeecake e;
    public tt2 e0;
    public zp2 f;
    public coffeecake f0;
    public yp2 g;
    public aq2 h;
    public pr2 i;
    public h21 j;
    public h21 k;
    public tp2 l;
    public h21 m;
    public rr2 n;
    public ur2 o;
    public tr2 p;
    public g71 q;
    public or2 r;
    public vr2 s;
    public yr2 t;
    public mr2 u;
    public zr2 v;
    public as2 w;
    public bs2 x;
    public cs2 y;
    public es2 z;

    public z80(i60 i60Var, adjudge.saneness sanenessVar, formularize formularizeVar, Boolean bool, Boolean bool2) {
        this.a = i60Var;
        a(sanenessVar, formularizeVar, bool, bool2);
        b();
        c();
        d();
    }

    public final void a(adjudge.saneness sanenessVar, formularize formularizeVar, Boolean bool, Boolean bool2) {
        d71 d71Var = new d71(this.a.o0);
        Object obj = qd0.c;
        this.b = new qd0(d71Var);
        this.c = new qd0(new h71(this.a.C2));
        this.d = h21.a(sanenessVar);
        h21 h21Var = eia.f37136attabal;
        this.e = new qd0(new i71(h21Var, h21Var));
        i60 i60Var = this.a;
        coffeecake coffeecakeVar = i60Var.p;
        coffeecake coffeecakeVar2 = i60Var.i1;
        h21 h21Var2 = this.d;
        this.f = new zp2(new wp2(coffeecakeVar, coffeecakeVar2, h21Var2), coffeecakeVar);
        this.g = new yp2(new tk2(h21Var2), coffeecakeVar);
        this.h = new aq2(i60Var.d2, coffeecakeVar, h21Var2);
        this.i = new pr2(i60Var.Z1, coffeecakeVar);
        this.j = h21.a(formularizeVar);
        this.k = h21Var;
        this.l = new tp2(this.d);
        this.m = h21.a(bool);
        h21 h21VarA = h21.a(bool2);
        i60 i60Var2 = this.a;
        qd0 qd0Var = new qd0(new i4(i60Var2.g, this.j, this.k, i60Var2.K0, i60Var2.d, this.l, this.m, i60Var2.p, i60Var2.E2, h21VarA));
        i60 i60Var3 = this.a;
        coffeecake coffeecakeVar3 = i60Var3.p;
        this.n = new rr2(qd0Var, coffeecakeVar3);
        this.o = new ur2(new k6(i60Var3.M), coffeecakeVar3);
        h21 h21Var3 = this.k;
        tp2 tp2Var = this.l;
        this.p = new tr2(new b6(h21Var3, tp2Var, i60Var3.d, coffeecakeVar3), coffeecakeVar3);
        this.q = new g71(tp2Var);
        this.r = new or2(this.j);
    }

    public final void b() {
        int i = xm2.f3295attabal;
        List listDern = dustman.dern(1);
        List listDern2 = dustman.dern(1);
        g71 g71Var = this.q;
        boolean z = wm2.c;
        if (!z && g71Var == null) {
            throw new AssertionError("Codegen error? Null provider");
        }
        listDern.add(g71Var);
        or2 or2Var = this.r;
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
        i60 i60Var = this.a;
        coffeecake coffeecakeVar = i60Var.p;
        this.s = new vr2(t6Var, coffeecakeVar);
        this.t = new yr2(i60Var.F2, coffeecakeVar);
        this.u = new mr2(i60Var.x1, coffeecakeVar);
        this.v = new zr2(i60Var.G2, coffeecakeVar);
        this.w = new as2(i60Var.i2, coffeecakeVar);
        this.x = new bs2(i60Var.k2, coffeecakeVar);
        this.y = new cs2(new ap(this.l, i60Var.I0, this.j, i60Var.f1), coffeecakeVar);
        this.z = new es2(i60Var.H2, coffeecakeVar);
        coffeecake coffeecakeVarA = yt2.a(new tf0(coffeecakeVar));
        i60 i60Var2 = this.a;
        coffeecake coffeecakeVar2 = i60Var2.p;
        this.A = new gs2(coffeecakeVarA, coffeecakeVar2);
        this.B = new is2(i60Var2.I2, coffeecakeVar2);
        this.C = new ks2(coffeecakeVar2, new ef1(i60Var2.c0));
        this.D = new ls2(i60Var2.J2, coffeecakeVar2);
        this.E = new ms2(i60Var2.z1, coffeecakeVar2);
        this.F = new os2(i60Var2.K2, coffeecakeVar2);
        this.G = new ps2(i60Var2.L2, coffeecakeVar2);
        this.H = new ws2(i60Var2.D1, coffeecakeVar2);
        coffeecake coffeecakeVarA2 = yt2.a(new zw2(i60Var2.n1));
        i60 i60Var3 = this.a;
        coffeecake coffeecakeVar3 = i60Var3.p;
        this.I = new nr2(coffeecakeVarA2, coffeecakeVar3);
        this.J = new vs2(i60Var3.M2, coffeecakeVar3);
        this.K = new qr2(i60Var3.v1, coffeecakeVar3);
    }

    public final void c() {
        i60 i60Var = this.a;
        ic2 ic2Var = new ic2(i60Var.C2, i60Var.N2, this.j, i60Var.c0);
        Object obj = qd0.c;
        this.L = new qs2(new qd0(ic2Var), this.a.p);
        qd0 qd0Var = new qd0(new qf2(this.b));
        i60 i60Var2 = this.a;
        coffeecake coffeecakeVar = i60Var2.p;
        this.M = new rs2(qd0Var, coffeecakeVar);
        this.N = new ts2(i60Var2.B1, coffeecakeVar);
        this.O = new wr2(i60Var2.O2, coffeecakeVar);
        b80 b80Var = new b80(this.d);
        i60 i60Var3 = this.a;
        coffeecake coffeecakeVar2 = i60Var3.p;
        h21 h21Var = i60Var3.d;
        this.P = new ss2(new yj2(coffeecakeVar2, this.k, b80Var, new qj2(coffeecakeVar2, h21Var, i60Var3.g, i60Var3.I0, i60Var3.G, i60Var3.b1, i60Var3.t, i60Var3.q, i60Var3.H), this.l, this.j), coffeecakeVar2);
        this.Q = new us2(i60Var3.P2, coffeecakeVar2);
        this.R = new xs2(i60Var3.Q2, coffeecakeVar2);
        this.S = new sr2(i60Var3.g2, coffeecakeVar2);
        this.T = new hs2(i60Var3.R2, coffeecakeVar2);
        this.U = new js2(new l11(i60Var3.Q0), coffeecakeVar2);
        this.V = new xr2(i60Var3.S2, coffeecakeVar2);
        this.W = new fs2(new ld0(h21Var), coffeecakeVar2);
        this.X = new ds2(i60Var3.T2, coffeecakeVar2);
        this.Y = new ns2(new qd0(new u02(new qd0(ib.f37175attabal))), this.a.p);
        int i = xm2.f3295attabal;
        wm2 wm2Var = new wm2(40);
        wm2Var.a(this.f);
        wm2Var.a(this.g);
        wm2Var.a(this.h);
        wm2Var.a(this.i);
        wm2Var.a(this.n);
        wm2Var.a(this.o);
        wm2Var.a(this.p);
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
        wm2Var.a(this.X);
        wm2Var.a(this.Y);
        this.Z = wm2Var.a();
        this.a0 = new f71(this.a.g);
    }

    public final void d() {
        i60 i60Var = this.a;
        jv2 jv2Var = new jv2(i60Var.N2, i60Var.C2, this.b, this.a0);
        Object obj = qd0.c;
        this.b0 = new z61(new qd0(jv2Var));
        i60 i60Var2 = this.a;
        this.c0 = new b71(i60Var2.G1);
        this.d0 = new e71(i60Var2.j3);
        h21 h21Var = bd1.b;
        LinkedHashMap linkedHashMapAttabal = dustman.attabal(4);
        ag agVar = this.a.U2;
        if (agVar == null) {
            throw new NullPointerException(IronSourceConstants.EVENTS_PROVIDER);
        }
        linkedHashMapAttabal.put("configLoaderRefreshSignalRequestedListener", agVar);
        z61 z61Var = this.b0;
        if (z61Var == null) {
            throw new NullPointerException(IronSourceConstants.EVENTS_PROVIDER);
        }
        linkedHashMapAttabal.put("adUnitStatsTrackerSignalsRequestedListener", z61Var);
        b71 b71Var = this.c0;
        if (b71Var == null) {
            throw new NullPointerException(IronSourceConstants.EVENTS_PROVIDER);
        }
        linkedHashMapAttabal.put("customTabsConnectionInitializationTask", b71Var);
        e71 e71Var = this.d0;
        if (e71Var == null) {
            throw new NullPointerException(IronSourceConstants.EVENTS_PROVIDER);
        }
        linkedHashMapAttabal.put("nativeSingletonPreloaderAsInternalAdRequestEventListener", e71Var);
        qd0 qd0Var = new qd0(new q31(this.a.t, new bd1(linkedHashMapAttabal)));
        xm2 xm2Var = this.Z;
        i60 i60Var3 = this.a;
        coffeecake coffeecakeVar = i60Var3.v;
        coffeecake coffeecakeVar2 = i60Var3.t;
        coffeecake coffeecakeVar3 = i60Var3.p;
        this.e0 = new tt2(xm2Var, coffeecakeVar, coffeecakeVar2, coffeecakeVar3, this.j, qd0Var);
        qd0 qd0Var2 = new qd0(new kf2(coffeecakeVar3, i60Var3.c0, i60Var3.q, i60Var3.k3, eia.f37136attabal, i60Var3.o0, i60Var3.h0, i60Var3.B, i60Var3.d));
        i60 i60Var4 = this.a;
        this.f0 = new qd0(new vq2(i60Var4.v2, i60Var4.s, this.b, this.c, this.d, i60Var4.H, this.e, i60Var4.D2, this.e0, i60Var4.h0, i60Var4.o0, i60Var4.p, qd0Var2, i60Var4.q));
    }

    @Override // saneness.adjudge
    public final uq2 a() {
        return (uq2) this.f0.get();
    }
}
