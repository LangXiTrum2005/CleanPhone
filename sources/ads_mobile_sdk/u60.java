package ads_mobile_sdk;

import com.ironsource.mediationsdk.utils.IronSourceConstants;
import complexometry.formularize;
import java.util.LinkedHashMap;
import liquory.beachfront;
import saneness.coffeecake;
import saneness.dustman;
import saneness.phytopathogen;
import saneness.rockless;
import saneness.wittig;

/* JADX INFO: loaded from: classes.dex */
public final class u60 {
    public coffeecake A;
    public final i60 a;
    public coffeecake b;
    public coffeecake c;
    public coffeecake d;
    public h21 e;
    public h21 f;
    public h21 g;
    public coffeecake h;
    public tg2 i;
    public y61 j;
    public c71 k;
    public a71 l;
    public coffeecake m;
    public coffeecake n;
    public b80 o;
    public coffeecake p;
    public h21 q;
    public h21 r;
    public h21 s;
    public f71 t;
    public h21 u;
    public h21 v;
    public r02 w;
    public z61 x;
    public b71 y;
    public e71 z;

    public u60(i60 i60Var, jp2 jp2Var, String str, formularize formularizeVar, Boolean bool, xb2 xb2Var, j71 j71Var, gy0 gy0Var, phytopathogen phytopathogenVar, beachfront beachfrontVar, rockless rocklessVar, Boolean bool2) {
        this.a = i60Var;
        a(jp2Var, str, formularizeVar, bool, xb2Var, j71Var, phytopathogenVar, beachfrontVar, bool2);
        a(gy0Var, rocklessVar);
    }

    public final void a(jp2 jp2Var, String str, formularize formularizeVar, Boolean bool, xb2 xb2Var, j71 j71Var, phytopathogen phytopathogenVar, beachfront beachfrontVar, Boolean bool2) {
        d71 d71Var = new d71(this.a.o0);
        Object obj = qd0.c;
        this.b = new qd0(d71Var);
        this.c = new qd0(new h71(this.a.C2));
        this.d = new qd0(wittig.f37363attabal);
        this.e = h21.a(str);
        this.f = h21.a(jp2Var);
        h21 h21VarA = h21.a(formularizeVar);
        this.g = h21VarA;
        this.h = new qd0(new n6(this.a.h0, this.e, this.f, h21VarA));
        i60 i60Var = this.a;
        coffeecake coffeecakeVar = i60Var.p;
        coffeecake coffeecakeVar2 = i60Var.t2;
        coffeecake coffeecakeVar3 = i60Var.g;
        this.i = new tg2(coffeecakeVar, coffeecakeVar2, coffeecakeVar3, i60Var.t, i60Var.z, i60Var.B0, i60Var.r0, i60Var.H, i60Var.q);
        this.j = new y61(new qd0(new e7(this.b, this.g, i60Var.N2, coffeecakeVar3)));
        i60 i60Var2 = this.a;
        this.k = new c71(i60Var2.y3);
        this.l = new a71(i60Var2.G1);
        h21 h21Var = bd1.b;
        LinkedHashMap linkedHashMapAttabal = dustman.attabal(3);
        y61 y61Var = this.j;
        if (y61Var == null) {
            throw new NullPointerException(IronSourceConstants.EVENTS_PROVIDER);
        }
        linkedHashMapAttabal.put("adUnitStatsTrackerAdLoadListener", y61Var);
        c71 c71Var = this.k;
        if (c71Var == null) {
            throw new NullPointerException(IronSourceConstants.EVENTS_PROVIDER);
        }
        linkedHashMapAttabal.put("debugSignalsAdLoadListener", c71Var);
        a71 a71Var = this.l;
        if (a71Var == null) {
            throw new NullPointerException(IronSourceConstants.EVENTS_PROVIDER);
        }
        linkedHashMapAttabal.put("customTabsConnectionInitializationTaskInternalAdLoadListener", a71Var);
        qd0 qd0Var = new qd0(new b31(this.a.t, new bd1(linkedHashMapAttabal)));
        this.m = qd0Var;
        i60 i60Var3 = this.a;
        this.n = new qd0(new we2(i60Var3.t, i60Var3.g, this.i, i60Var3.x3, qd0Var, this.d, this.c));
        this.o = new b80(h21.a(xb2Var));
        this.p = new qd0(new i71(this.o, new b80(h21.a(j71Var))));
        this.q = h21.a(beachfrontVar);
        this.r = h21.a(phytopathogenVar);
        this.s = h21.a(bool);
        this.t = new f71(this.a.g);
        this.u = h21.a(bool2);
    }

    public final void a(gy0 gy0Var, rockless rocklessVar) {
        this.v = h21.a(rocklessVar);
        h21 h21VarA = h21.a(gy0Var);
        i60 i60Var = this.a;
        jj jjVar = new jj(i60Var.z3, this.p, this.g, this.q, this.r, this.s, this.t, this.c, this.b, this.u, this.v, i60Var.A3, h21VarA, this.d);
        Object obj = qd0.c;
        qd0 qd0Var = new qd0(jjVar);
        i60 i60Var2 = this.a;
        this.w = new r02(i60Var2.t, i60Var2.s, i60Var2.w3, i60Var2.g, this.n, qd0Var);
        this.x = new z61(new qd0(new jv2(i60Var2.N2, i60Var2.C2, this.b, this.t)));
        i60 i60Var3 = this.a;
        this.y = new b71(i60Var3.G1);
        this.z = new e71(i60Var3.j3);
        h21 h21Var = bd1.b;
        LinkedHashMap linkedHashMapAttabal = dustman.attabal(4);
        ag agVar = this.a.U2;
        if (agVar != null) {
            linkedHashMapAttabal.put("configLoaderRefreshSignalRequestedListener", agVar);
            z61 z61Var = this.x;
            if (z61Var != null) {
                linkedHashMapAttabal.put("adUnitStatsTrackerSignalsRequestedListener", z61Var);
                b71 b71Var = this.y;
                if (b71Var != null) {
                    linkedHashMapAttabal.put("customTabsConnectionInitializationTask", b71Var);
                    e71 e71Var = this.z;
                    if (e71Var != null) {
                        linkedHashMapAttabal.put("nativeSingletonPreloaderAsInternalAdRequestEventListener", e71Var);
                        this.A = new qd0(new k31(this.b, this.c, this.d, this.h, this.w, this.p, new qd0(new q31(this.a.t, new bd1(linkedHashMapAttabal))), this.a.p, this.m));
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
