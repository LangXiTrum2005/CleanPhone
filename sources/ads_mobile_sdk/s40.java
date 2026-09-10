package ads_mobile_sdk;

import com.ironsource.mediationsdk.utils.IronSourceConstants;
import complexometry.formularize;
import java.util.LinkedHashMap;
import saneness.coffeecake;
import saneness.dustman;
import saneness.eia;
import saneness.geminiflorous;
import saneness.jugal;

/* JADX INFO: loaded from: classes.dex */
public final class s40 {
    public final i60 a;
    public h21 b;
    public h21 c;
    public sg2 d;
    public h21 e;
    public coffeecake f;
    public b80 g;
    public coffeecake h;
    public h21 i;
    public h21 j;
    public h21 k;
    public h21 l;
    public coffeecake m;
    public b22 n;
    public ne o;
    public coffeecake p;
    public pe q;
    public oe r;
    public h21 s;
    public se t;
    public re u;
    public h21 v;
    public h21 w;
    public h21 x;
    public qe y;
    public coffeecake z;

    public s40(i60 i60Var, ur urVar, h1 h1Var, jm2 jm2Var, Long l, Integer num, formularize formularizeVar, yf2 yf2Var, xb2 xb2Var, j71 j71Var, Boolean bool, gy0 gy0Var, d6 d6Var, jugal jugalVar) {
        this.a = i60Var;
        a(urVar, h1Var, jm2Var, l, num, formularizeVar, yf2Var, xb2Var, j71Var);
        a(bool, gy0Var, d6Var, jugalVar);
    }

    public final void a(ur urVar, h1 h1Var, jm2 jm2Var, Long l, Integer num, formularize formularizeVar, yf2 yf2Var, xb2 xb2Var, j71 j71Var) {
        this.b = h21.a(h1Var);
        h21 h21VarA = h21.a(urVar);
        this.c = h21VarA;
        i60 i60Var = this.a;
        this.d = new sg2(this.b, h21VarA, new tg2(i60Var.p, i60Var.t2, i60Var.g, i60Var.t, i60Var.z, i60Var.B0, i60Var.r0, i60Var.H, i60Var.q));
        h21 h21VarA2 = h21.a(yf2Var);
        this.e = h21VarA2;
        i60 i60Var2 = this.a;
        v20 v20Var = new v20(i60Var2.t, i60Var2.d, i60Var2.p, i60Var2.g, this.d, h21VarA2, i60Var2.E, this.c);
        Object obj = qd0.c;
        this.f = new qd0(v20Var);
        this.g = new b80(h21.a(xb2Var));
        this.h = new qd0(new wr(this.g, new b80(h21.a(j71Var))));
        this.i = h21.a(formularizeVar);
        this.j = h21.a(l);
        this.k = h21.a(num);
        this.l = h21.a(jm2Var);
        qd0 qd0Var = new qd0(new vr(this.a.o0));
        this.m = qd0Var;
        h21 h21Var = this.i;
        b22 b22Var = new b22(h21Var);
        this.n = b22Var;
        i60 i60Var3 = this.a;
        this.o = new ne(new qd0(new ee(i60Var3.Y3, this.f, i60Var3.V, i60Var3.v, i60Var3.s0, this.h, h21Var, this.e, this.j, this.k, this.b, this.c, this.l, qd0Var, i60Var3.N, b22Var)));
        qd0 qd0Var2 = new qd0(geminiflorous.f37154attabal);
        this.p = qd0Var2;
        h21 h21Var2 = this.i;
        i60 i60Var4 = this.a;
        this.q = new pe(new qd0(new ge(h21Var2, i60Var4.K0, i60Var4.d, i60Var4.G, qd0Var2, i60Var4.Z3)));
        h21 h21Var3 = this.i;
        i60 i60Var5 = this.a;
        this.r = new oe(new qd0(new we(h21Var3, i60Var5.K0, i60Var5.d, i60Var5.G, this.p, i60Var5.Z3)));
        this.s = eia.f37136attabal;
    }

    public final void a(Boolean bool, gy0 gy0Var, d6 d6Var, jugal jugalVar) {
        pe peVar = this.q;
        oe oeVar = this.r;
        h21 h21Var = this.s;
        i60 i60Var = this.a;
        kx2 kx2Var = new kx2(peVar, oeVar, h21Var, i60Var.b1, this.p, i60Var.v, this.h, this.i, this.e, this.j, this.k, this.b, this.c, this.l, this.m, this.n);
        Object obj = qd0.c;
        qd0 qd0Var = new qd0(kx2Var);
        this.t = new se(qd0Var);
        this.u = new re(new qd0(new zi2(qd0Var, this.h, this.i, this.e, this.j, this.k, this.b, this.c, this.l, this.m, this.n)));
        this.v = h21.a(jugalVar);
        this.w = h21.a(bool);
        this.x = h21.a(gy0Var);
        this.y = new qe(new qd0(new wc2(this.v, this.h, this.i, this.e, this.j, this.k, this.b, this.c, this.l, this.m, this.w, this.x, h21.a(d6Var), this.n)));
        h21 h21Var2 = bd1.b;
        LinkedHashMap linkedHashMapAttabal = dustman.attabal(4);
        ne neVar = this.o;
        if (neVar != null) {
            linkedHashMapAttabal.put("FirstPartyRendererAppOpenInterstitial", neVar);
            se seVar = this.t;
            if (seVar != null) {
                linkedHashMapAttabal.put("ThirdPartyRendererAppOpenInterstitial", seVar);
                re reVar = this.u;
                if (reVar != null) {
                    linkedHashMapAttabal.put("RtbRendererAppOpenInterstitial", reVar);
                    qe qeVar = this.y;
                    if (qeVar != null) {
                        linkedHashMapAttabal.put("RecursiveRendererAppOpenInterstitial", qeVar);
                        this.z = new qd0(new a4(new bd1(linkedHashMapAttabal)));
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
}
