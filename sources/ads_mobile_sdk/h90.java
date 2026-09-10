package ads_mobile_sdk;

import com.google.android.libraries.ads.mobile.sdk.internal.nativead.InternalNativeAd;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import complexometry.formularize;
import java.util.LinkedHashMap;
import java.util.List;
import saneness.coffeecake;
import saneness.dustman;
import saneness.eia;
import saneness.formularism;
import saneness.hoiden;
import saneness.igo;
import saneness.imperceivable;
import saneness.kaolinize;
import saneness.overabundance;
import saneness.recumbency;
import saneness.revoltingly;
import saneness.weimar;

/* JADX INFO: loaded from: classes.dex */
public final class h90 implements kaolinize {
    public coffeecake A;
    public coffeecake B;
    public coffeecake C;
    public coffeecake D;
    public coffeecake E;
    public coffeecake F;
    public coffeecake G;
    public coffeecake H;
    public coffeecake I;
    public coffeecake J;
    public coffeecake K;
    public h21 L;
    public coffeecake M;
    public coffeecake N;
    public zy2 O;
    public coffeecake P;
    public coffeecake Q;
    public final i60 a;
    public coffeecake b;
    public h21 c;
    public h21 d;
    public b80 e;
    public b80 f;
    public b80 g;
    public coffeecake h;
    public h21 i;
    public sg2 j;
    public h21 k;
    public h21 l;
    public h21 m;
    public coffeecake n;
    public h21 o;
    public hb0 p;
    public h21 q;
    public coffeecake r;
    public kk1 s;
    public coffeecake t;
    public coffeecake u;
    public h21 v;
    public coffeecake w;
    public coffeecake x;
    public h21 y;
    public h21 z;

    public h90(i60 i60Var, formularize formularizeVar, yf2 yf2Var, Integer num, h1 h1Var, ur urVar, jm2 jm2Var, xb2 xb2Var, j71 j71Var, le2 le2Var, o6 o6Var, a22 a22Var, weimar weimarVar, hj1 hj1Var) {
        this.a = i60Var;
        a(yf2Var, num, h1Var, urVar, jm2Var, xb2Var, j71Var, le2Var, o6Var, a22Var);
        a(formularizeVar, weimarVar, hj1Var);
        g();
    }

    @Override // saneness.kaolinize
    public final imperceivable a() {
        return (InternalNativeAd) this.M.get();
    }

    @Override // saneness.kaolinize
    public final igo f() {
        return (igo) this.Q.get();
    }

    public final void g() {
        i60 i60Var = this.a;
        hk2 hk2Var = new hk2(i60Var.x, this.c, i60Var.L, i60Var.z, this.q, i60Var.p);
        Object obj = qd0.c;
        qd0 qd0Var = new qd0(hk2Var);
        i60 i60Var2 = this.a;
        this.M = new qd0(new n61(i60Var2.v, this.b, this.c, this.d, this.h, this.i, this.p, this.u, this.y, this.A, this.C, this.K, this.B, this.L, i60Var2.q1, qd0Var, i60Var2.q, this.o));
        this.N = new qd0(new rh2(this.a.t, bd1.b));
        this.O = new zy2(new qd0(new xz2(this.y, this.a.v)));
        LinkedHashMap linkedHashMapAttabal = dustman.attabal(1);
        zy2 zy2Var = this.O;
        if (zy2Var == null) {
            throw new NullPointerException(IronSourceConstants.EVENTS_PROVIDER);
        }
        linkedHashMapAttabal.put("provideThirdPartyVideoEventListener", zy2Var);
        this.P = new qd0(new nz2(this.a.t, new bd1(linkedHashMapAttabal)));
        this.Q = new qd0(new iy2(this.a.t, this.c, this.p, this.N, this.P, new b80(this.z)));
        i60 i60Var3 = this.a;
        new qd0(new yw1(i60Var3.I, this.c, i60Var3.p, i60Var3.u));
    }

    public final void a(formularize formularizeVar, weimar weimarVar, hj1 hj1Var) {
        int i = xm2.f3295attabal;
        List listDern = dustman.dern(1);
        List listDern2 = dustman.dern(1);
        coffeecake coffeecakeVar = this.r;
        boolean z = wm2.c;
        if (!z && coffeecakeVar == null) {
            throw new AssertionError("Codegen error? Null provider");
        }
        listDern.add(coffeecakeVar);
        kk1 kk1Var = this.s;
        if (!z && kk1Var == null) {
            throw new AssertionError("Codegen error? Null provider");
        }
        listDern2.add(kk1Var);
        if (!z && dustman.saneness(listDern)) {
            throw new AssertionError("Codegen error?  Duplicates in the provider list");
        }
        if (!z && dustman.saneness(listDern2)) {
            throw new AssertionError("Codegen error?  Duplicates in the provider list");
        }
        xm2 xm2Var = new xm2(listDern, listDern2);
        i60 i60Var = this.a;
        n23 n23Var = new n23(i60Var.H, i60Var.x3, i60Var.M, this.j, this.k, this.l, this.c, this.h, this.m, i60Var.g, this.n, i60Var.b4, this.o, this.p, i60Var.C2, xm2Var, i60Var.p);
        Object obj = qd0.c;
        this.t = new qd0(n23Var);
        i60 i60Var2 = this.a;
        this.u = new qd0(new xb0(i60Var2.t, i60Var2.p, this.h, i60Var2.H));
        h21 h21VarA = h21.a(formularizeVar);
        this.v = h21VarA;
        this.w = new qd0(new g7(this.a.N2, h21VarA));
        h21 h21Var = this.c;
        i60 i60Var3 = this.a;
        this.x = new qd0(new g22(h21Var, i60Var3.c4, i60Var3.p));
        h21 h21Var2 = bd1.b;
        LinkedHashMap linkedHashMapAttabal = dustman.attabal(4);
        coffeecake coffeecakeVar2 = this.t;
        if (coffeecakeVar2 == null) {
            throw new NullPointerException(IronSourceConstants.EVENTS_PROVIDER);
        }
        linkedHashMapAttabal.put("TrackingPingMonitorAsAdEventListener", coffeecakeVar2);
        coffeecake coffeecakeVar3 = this.u;
        if (coffeecakeVar3 == null) {
            throw new NullPointerException(IronSourceConstants.EVENTS_PROVIDER);
        }
        linkedHashMapAttabal.put("DelegatingAdEventListener", coffeecakeVar3);
        coffeecake coffeecakeVar4 = this.w;
        if (coffeecakeVar4 == null) {
            throw new NullPointerException(IronSourceConstants.EVENTS_PROVIDER);
        }
        linkedHashMapAttabal.put("AdStatsTrackerListener", coffeecakeVar4);
        coffeecake coffeecakeVar5 = this.x;
        if (coffeecakeVar5 == null) {
            throw new NullPointerException(IronSourceConstants.EVENTS_PROVIDER);
        }
        hb0.a(this.p, new qd0(new f2(this.a.t, revoltingly.attabal(linkedHashMapAttabal, "PlayPrewarmListener", coffeecakeVar5, linkedHashMapAttabal), this.c)));
        this.y = h21.a(hj1Var);
        h21 h21VarA2 = h21.a(weimarVar);
        this.z = h21VarA2;
        i60 i60Var4 = this.a;
        this.A = new qd0(new vy2(i60Var4.t, h21VarA2, this.p, this.c, i60Var4.X0));
        qd0 qd0Var = new qd0(new g51(this.y));
        this.B = qd0Var;
        i60 i60Var5 = this.a;
        this.C = new qd0(new hm1(i60Var5.v, i60Var5.t, this.y, i60Var5.p, qd0Var, i60Var5.l1, this.v, overabundance.f37240attabal));
        h21 h21Var3 = this.v;
        i60 i60Var6 = this.a;
        this.D = new qd0(new sg0(h21Var3, i60Var6.n0, this.c, i60Var6.t));
        this.E = new qd0(new lm1(this.A));
        LinkedHashMap linkedHashMapAttabal2 = dustman.attabal(2);
        coffeecake coffeecakeVar6 = this.D;
        if (coffeecakeVar6 == null) {
            throw new NullPointerException(IronSourceConstants.EVENTS_PROVIDER);
        }
        linkedHashMapAttabal2.put("FirebaseAnalyticsAdEventListener", coffeecakeVar6);
        coffeecake coffeecakeVar7 = this.E;
        if (coffeecakeVar7 == null) {
            throw new NullPointerException(IronSourceConstants.EVENTS_PROVIDER);
        }
        this.F = new qd0(new g8(this.a.v, revoltingly.attabal(linkedHashMapAttabal2, "NativeAdViewVisibilityChangedEventListener", coffeecakeVar7, linkedHashMapAttabal2)));
        this.G = new qd0(new vo1(this.a.p, this.A));
        LinkedHashMap linkedHashMapAttabal3 = dustman.attabal(1);
        coffeecake coffeecakeVar8 = this.G;
        if (coffeecakeVar8 == null) {
            throw new NullPointerException(IronSourceConstants.EVENTS_PROVIDER);
        }
        this.H = new qd0(new nd1(this.a.v, revoltingly.attabal(linkedHashMapAttabal3, "NativeMediaViewFullyVisibleEventListener", coffeecakeVar8, linkedHashMapAttabal3)));
        LinkedHashMap linkedHashMapAttabal4 = dustman.attabal(2);
        coffeecake coffeecakeVar9 = this.F;
        if (coffeecakeVar9 == null) {
            throw new NullPointerException(IronSourceConstants.EVENTS_PROVIDER);
        }
        linkedHashMapAttabal4.put("AdVisibilityChangedEventEmitter", coffeecakeVar9);
        coffeecake coffeecakeVar10 = this.H;
        if (coffeecakeVar10 == null) {
            throw new NullPointerException(IronSourceConstants.EVENTS_PROVIDER);
        }
        qd0 qd0Var2 = new qd0(new w7(this.a.v, revoltingly.attabal(linkedHashMapAttabal4, "MediaViewFullyVisibleEventEmitter", coffeecakeVar10, linkedHashMapAttabal4)));
        this.I = qd0Var2;
        i60 i60Var7 = this.a;
        qd0 qd0Var3 = new qd0(new nm1(i60Var7.v, qd0Var2, i60Var7.y2, i60Var7.g, i60Var7.p));
        this.J = qd0Var3;
        this.K = new qd0(new pm1(qd0Var3, this.E, this.G));
        this.L = eia.f37136attabal;
    }

    public final void a(yf2 yf2Var, Integer num, h1 h1Var, ur urVar, jm2 jm2Var, xb2 xb2Var, j71 j71Var, le2 le2Var, o6 o6Var, a22 a22Var) {
        formularism formularismVar = recumbency.f37287attabal;
        Object obj = qd0.c;
        this.b = new qd0(formularismVar);
        this.c = h21.a(h1Var);
        this.d = h21.a(urVar);
        this.e = new b80(h21.a(xb2Var));
        this.f = new b80(h21.a(j71Var));
        this.g = new b80(h21.a(le2Var));
        this.h = new qd0(new sr(this.e, this.f, this.g, new b80(h21.a(o6Var))));
        h21 h21Var = eia.f37136attabal;
        this.i = h21Var;
        i60 i60Var = this.a;
        this.j = new sg2(this.c, this.d, new tg2(i60Var.p, i60Var.t2, i60Var.g, i60Var.t, i60Var.z, i60Var.B0, i60Var.r0, i60Var.H, i60Var.q));
        this.k = h21Var;
        this.l = h21.a(jm2Var);
        this.m = h21.a(num);
        this.n = new qd0(hoiden.f37167attabal);
        this.o = h21.a(a22Var);
        this.p = new hb0();
        h21 h21VarA = h21.a(yf2Var);
        this.q = h21VarA;
        this.r = new qd0(new rr(h21VarA));
        this.s = new kk1(h21Var);
    }
}
