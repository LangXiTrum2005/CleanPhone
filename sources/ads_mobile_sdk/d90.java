package ads_mobile_sdk;

import android.view.View;
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
import saneness.phytopathogen;
import saneness.recumbency;
import saneness.revoltingly;
import saneness.scannable;

/* JADX INFO: loaded from: classes.dex */
public final class d90 implements scannable {
    public coffeecake A;
    public coffeecake B;
    public coffeecake C;
    public coffeecake D;
    public coffeecake E;
    public coffeecake F;
    public coffeecake G;
    public final i60 a;
    public h21 b;
    public coffeecake c;
    public h21 d;
    public h21 e;
    public b80 f;
    public b80 g;
    public b80 h;
    public coffeecake i;
    public h21 j;
    public sg2 k;
    public b80 l;
    public h21 m;
    public h21 n;
    public coffeecake o;
    public h21 p;
    public hb0 q;
    public h21 r;
    public coffeecake s;
    public xm2 t;
    public coffeecake u;
    public coffeecake v;
    public h21 w;
    public coffeecake x;
    public coffeecake y;
    public coffeecake z;

    public d90(i60 i60Var, formularize formularizeVar, yf2 yf2Var, Integer num, h1 h1Var, ur urVar, jm2 jm2Var, xb2 xb2Var, j71 j71Var, le2 le2Var, o6 o6Var, a22 a22Var, phytopathogen phytopathogenVar, View view) {
        this.a = i60Var;
        a(yf2Var, num, h1Var, urVar, jm2Var, xb2Var, j71Var, le2Var, o6Var, a22Var, view);
        a(formularizeVar, phytopathogenVar);
    }

    @Override // saneness.kaolinize
    public final imperceivable a() {
        return (d41) this.A.get();
    }

    @Override // saneness.kaolinize
    public final igo f() {
        return (igo) this.C.get();
    }

    public final void a(yf2 yf2Var, Integer num, h1 h1Var, ur urVar, jm2 jm2Var, xb2 xb2Var, j71 j71Var, le2 le2Var, o6 o6Var, a22 a22Var, View view) {
        this.b = h21.a(view);
        formularism formularismVar = recumbency.f37287attabal;
        Object obj = qd0.c;
        this.c = new qd0(formularismVar);
        this.d = h21.a(h1Var);
        this.e = h21.a(urVar);
        this.f = new b80(h21.a(xb2Var));
        this.g = new b80(h21.a(j71Var));
        this.h = new b80(h21.a(le2Var));
        this.i = new qd0(new sr(this.f, this.g, this.h, new b80(h21.a(o6Var))));
        this.j = eia.f37136attabal;
        i60 i60Var = this.a;
        this.k = new sg2(this.d, this.e, new tg2(i60Var.p, i60Var.t2, i60Var.g, i60Var.t, i60Var.z, i60Var.B0, i60Var.r0, i60Var.H, i60Var.q));
        this.l = new b80(this.b);
        this.m = h21.a(jm2Var);
        this.n = h21.a(num);
        this.o = new qd0(hoiden.f37167attabal);
        this.p = h21.a(a22Var);
        this.q = new hb0();
        h21 h21VarA = h21.a(yf2Var);
        this.r = h21VarA;
        this.s = new qd0(new rr(h21VarA));
        int i = xm2.f3295attabal;
        List listDern = dustman.dern(1);
        List listDern2 = dustman.dern(0);
        coffeecake coffeecakeVar = this.s;
        boolean z = wm2.c;
        if (!z && coffeecakeVar == null) {
            throw new AssertionError("Codegen error? Null provider");
        }
        listDern.add(coffeecakeVar);
        if (!z && dustman.saneness(listDern)) {
            throw new AssertionError("Codegen error?  Duplicates in the provider list");
        }
        if (!z && dustman.saneness(listDern2)) {
            throw new AssertionError("Codegen error?  Duplicates in the provider list");
        }
        this.t = new xm2(listDern, listDern2);
    }

    public final void a(formularize formularizeVar, phytopathogen phytopathogenVar) {
        i60 i60Var = this.a;
        n23 n23Var = new n23(i60Var.H, i60Var.x3, i60Var.M, this.k, this.l, this.m, this.d, this.i, this.n, i60Var.g, this.o, i60Var.b4, this.p, this.q, i60Var.C2, this.t, i60Var.p);
        Object obj = qd0.c;
        this.u = new qd0(n23Var);
        i60 i60Var2 = this.a;
        this.v = new qd0(new xb0(i60Var2.t, i60Var2.p, this.i, i60Var2.H));
        h21 h21VarA = h21.a(formularizeVar);
        this.w = h21VarA;
        this.x = new qd0(new g7(this.a.N2, h21VarA));
        h21 h21Var = this.d;
        i60 i60Var3 = this.a;
        this.y = new qd0(new g22(h21Var, i60Var3.c4, i60Var3.p));
        h21 h21Var2 = bd1.b;
        LinkedHashMap linkedHashMapAttabal = dustman.attabal(4);
        coffeecake coffeecakeVar = this.u;
        if (coffeecakeVar != null) {
            linkedHashMapAttabal.put("TrackingPingMonitorAsAdEventListener", coffeecakeVar);
            coffeecake coffeecakeVar2 = this.v;
            if (coffeecakeVar2 != null) {
                linkedHashMapAttabal.put("DelegatingAdEventListener", coffeecakeVar2);
                coffeecake coffeecakeVar3 = this.x;
                if (coffeecakeVar3 != null) {
                    linkedHashMapAttabal.put("AdStatsTrackerListener", coffeecakeVar3);
                    coffeecake coffeecakeVar4 = this.y;
                    if (coffeecakeVar4 != null) {
                        hb0.a(this.q, new qd0(new f2(this.a.t, revoltingly.attabal(linkedHashMapAttabal, "PlayPrewarmListener", coffeecakeVar4, linkedHashMapAttabal), this.d)));
                        i60 i60Var4 = this.a;
                        this.z = new qd0(new hk2(i60Var4.x, this.d, i60Var4.L, i60Var4.z, this.r, i60Var4.p));
                        this.A = new qd0(new h41(this.b, this.c, this.d, this.e, this.i, this.j, this.q, this.v, this.a.q1, this.z, this.p, h21.a(phytopathogenVar)));
                        coffeecake coffeecakeVar5 = this.a.t;
                        h21 h21Var3 = bd1.b;
                        this.B = new qd0(new rh2(coffeecakeVar5, h21Var3));
                        this.C = new qd0(new iy2(this.a.t, this.d, this.q, this.B, new qd0(new nz2(this.a.t, h21Var3)), eia.f37136attabal));
                        i60 i60Var5 = this.a;
                        new qd0(new yw1(i60Var5.I, this.d, i60Var5.p, i60Var5.u));
                        h21 h21Var4 = this.w;
                        i60 i60Var6 = this.a;
                        this.D = new qd0(new sg0(h21Var4, i60Var6.n0, this.d, i60Var6.t));
                        this.E = new qd0(new sj2(this.q, this.d));
                        LinkedHashMap linkedHashMapAttabal2 = dustman.attabal(2);
                        coffeecake coffeecakeVar6 = this.D;
                        if (coffeecakeVar6 != null) {
                            linkedHashMapAttabal2.put("FirebaseAnalyticsAdEventListener", coffeecakeVar6);
                            coffeecake coffeecakeVar7 = this.E;
                            if (coffeecakeVar7 != null) {
                                this.F = new qd0(new g8(this.a.v, revoltingly.attabal(linkedHashMapAttabal2, "BannerRtbVisibilityListener", coffeecakeVar7, linkedHashMapAttabal2)));
                                LinkedHashMap linkedHashMapAttabal3 = dustman.attabal(1);
                                coffeecake coffeecakeVar8 = this.F;
                                if (coffeecakeVar8 != null) {
                                    qd0 qd0Var = new qd0(new w7(this.a.v, revoltingly.attabal(linkedHashMapAttabal3, "AdVisibilityChangedEventEmitter", coffeecakeVar8, linkedHashMapAttabal3)));
                                    i60 i60Var7 = this.a;
                                    this.G = new qd0(new b8(i60Var7.v, qd0Var, i60Var7.y2, this.b, i60Var7.g, i60Var7.p, this.r));
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
}
