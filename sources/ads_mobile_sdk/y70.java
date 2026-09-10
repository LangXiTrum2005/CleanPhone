package ads_mobile_sdk;

import com.ironsource.mediationsdk.utils.IronSourceConstants;
import complexometry.formularize;
import java.util.LinkedHashMap;
import saneness.coffeecake;
import saneness.dustman;
import saneness.geminiflorous;
import saneness.sealless;

/* JADX INFO: loaded from: classes.dex */
public final class y70 {
    public h21 A;
    public coffeecake B;
    public b22 C;
    public wq1 D;
    public coffeecake E;
    public zq1 F;
    public yq1 G;
    public xq1 H;
    public cr1 I;
    public br1 J;
    public coffeecake K;
    public final i60 a;
    public h21 b;
    public h21 c;
    public sg2 d;
    public h21 e;
    public coffeecake f;
    public do1 g;
    public h21 h;
    public coffeecake i;
    public gp1 j;
    public fp1 k;
    public cp1 l;
    public hp1 m;
    public ep1 n;
    public bp1 o;
    public dp1 p;
    public coffeecake q;
    public w32 r;
    public v32 s;
    public x32 t;
    public y32 u;
    public b80 v;
    public coffeecake w;
    public h21 x;
    public h21 y;
    public h21 z;

    public y70(i60 i60Var, ur urVar, h1 h1Var, jm2 jm2Var, Long l, Integer num, formularize formularizeVar, yf2 yf2Var, xb2 xb2Var, j71 j71Var, Integer num2, com.google.android.libraries.ads.mobile.sdk.nativead.dern dernVar) {
        this.a = i60Var;
        a(urVar, h1Var, yf2Var, dernVar);
        a(jm2Var, l, num, formularizeVar, xb2Var, j71Var, num2);
        a();
    }

    public final void a(ur urVar, h1 h1Var, yf2 yf2Var, com.google.android.libraries.ads.mobile.sdk.nativead.dern dernVar) {
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
        i60 i60Var3 = this.a;
        this.g = new do1(i60Var3.v, i60Var3.t, i60Var3.p, i60Var3.V, i60Var3.H, i60Var3.i3, i60Var3.h3);
        this.h = h21.a(dernVar);
        i60 i60Var4 = this.a;
        this.i = yt2.a(new xl(i60Var4.z, i60Var4.p, i60Var4.q));
        i60 i60Var5 = this.a;
        this.j = new gp1(i60Var5.P3);
        this.k = new fp1(i60Var5.Q3);
        this.l = new cp1(i60Var5.R3);
        this.m = new hp1(i60Var5.S3);
        this.n = new ep1(i60Var5.X);
        this.o = new bp1(i60Var5.T3);
        h21 h21Var = bd1.b;
        sealless seallessVar = new sealless(6);
        seallessVar.attabal("/videoMeta", this.j);
        seallessVar.attabal("/video", this.k);
        seallessVar.attabal("/delayPageLoaded", this.l);
        seallessVar.attabal("/getLocationInfo", this.m);
        seallessVar.attabal("/log", this.n);
        seallessVar.attabal("/instrument", this.o);
        this.p = new dp1(new bd1(seallessVar.a));
        LinkedHashMap linkedHashMapAttabal = dustman.attabal(1);
        dp1 dp1Var = this.p;
        if (dp1Var == null) {
            throw new NullPointerException(IronSourceConstants.EVENTS_PROVIDER);
        }
        linkedHashMapAttabal.put("GmsgHandlerInstaller", dp1Var);
        ip1 ip1Var = new ip1(new bd1(linkedHashMapAttabal));
        i60 i60Var6 = this.a;
        qd0 qd0Var = new qd0(new to1(i60Var6.d, i60Var6.v, i60Var6.V, ip1Var, i60Var6.p, this.h));
        h21 h21Var2 = this.h;
        coffeecake coffeecakeVar = this.i;
        i60 i60Var7 = this.a;
        qd0 qd0Var2 = new qd0(new in1(h21Var2, coffeecakeVar, i60Var7.q, qd0Var, i60Var7.V, i60Var7.u, i60Var7.v, i60Var7.H));
        tn1 tn1Var = new tn1(qd0Var2);
        i60 i60Var8 = this.a;
        this.q = new qd0(new wj1(i60Var8.d, i60Var8.s, qd0Var2, tn1Var, this.h, i60Var8.p));
        h21 h21Var3 = this.b;
        this.r = new w32(h21Var3);
        this.s = new v32(h21Var3, this.a.U3);
    }

    public final void a(jm2 jm2Var, Long l, Integer num, formularize formularizeVar, xb2 xb2Var, j71 j71Var, Integer num2) {
        h21 h21Var = bd1.b;
        LinkedHashMap linkedHashMapAttabal = dustman.attabal(2);
        w32 w32Var = this.r;
        if (w32Var != null) {
            linkedHashMapAttabal.put("/canOpenURLs", w32Var);
            v32 v32Var = this.s;
            if (v32Var != null) {
                linkedHashMapAttabal.put("/canOpenIntents", v32Var);
                this.t = new x32(new bd1(linkedHashMapAttabal));
                LinkedHashMap linkedHashMapAttabal2 = dustman.attabal(1);
                x32 x32Var = this.t;
                if (x32Var != null) {
                    linkedHashMapAttabal2.put("GmsgHandlerInstaller", x32Var);
                    this.u = new y32(new bd1(linkedHashMapAttabal2));
                    this.v = new b80(h21.a(xb2Var));
                    wr wrVar = new wr(this.v, new b80(h21.a(j71Var)));
                    Object obj = qd0.c;
                    this.w = new qd0(wrVar);
                    this.x = h21.a(formularizeVar);
                    this.y = h21.a(l);
                    this.z = h21.a(num);
                    this.A = h21.a(jm2Var);
                    this.B = new qd0(new vr(this.a.o0));
                    h21 h21VarA = h21.a(num2);
                    h21 h21Var2 = this.x;
                    b22 b22Var = new b22(h21Var2);
                    this.C = b22Var;
                    coffeecake coffeecakeVar = this.f;
                    i60 i60Var = this.a;
                    this.D = new wq1(new qd0(new rk1(coffeecakeVar, i60Var.N3, i60Var.O3, this.g, this.q, this.h, this.u, i60Var.H, this.w, h21Var2, this.e, this.y, this.z, this.b, this.c, this.A, this.B, i60Var.t, h21VarA, b22Var)));
                    qd0 qd0Var = new qd0(geminiflorous.f37154attabal);
                    this.E = qd0Var;
                    h21 h21Var3 = this.x;
                    h21 h21Var4 = this.h;
                    i60 i60Var2 = this.a;
                    this.F = new zq1(new qd0(new rm1(h21Var3, h21Var4, i60Var2.K0, i60Var2.d, i60Var2.G, qd0Var, i60Var2.V3)));
                    h21 h21Var5 = this.x;
                    h21 h21Var6 = this.h;
                    i60 i60Var3 = this.a;
                    this.G = new yq1(new qd0(new gr1(h21Var5, h21Var6, i60Var3.K0, i60Var3.d, i60Var3.G, this.E, i60Var3.V3)));
                    h21 h21Var7 = this.x;
                    h21 h21Var8 = this.h;
                    i60 i60Var4 = this.a;
                    this.H = new xq1(new qd0(new lp1(h21Var7, h21Var8, i60Var4.K0, i60Var4.d, i60Var4.G, this.E, i60Var4.V3)));
                    return;
                }
                throw new NullPointerException(IronSourceConstants.EVENTS_PROVIDER);
            }
            throw new NullPointerException(IronSourceConstants.EVENTS_PROVIDER);
        }
        throw new NullPointerException(IronSourceConstants.EVENTS_PROVIDER);
    }

    public final void a() {
        b80 b80Var = new b80(this.H);
        zq1 zq1Var = this.F;
        yq1 yq1Var = this.G;
        i60 i60Var = this.a;
        kx2 kx2Var = new kx2(zq1Var, yq1Var, b80Var, i60Var.b1, this.E, i60Var.v, this.w, this.x, this.e, this.y, this.z, this.b, this.c, this.A, this.B, this.C);
        Object obj = qd0.c;
        qd0 qd0Var = new qd0(kx2Var);
        this.I = new cr1(qd0Var);
        this.J = new br1(new qd0(new zi2(qd0Var, this.w, this.x, this.e, this.y, this.z, this.b, this.c, this.A, this.B, this.C)));
        h21 h21Var = bd1.b;
        LinkedHashMap linkedHashMapAttabal = dustman.attabal(3);
        wq1 wq1Var = this.D;
        if (wq1Var != null) {
            linkedHashMapAttabal.put("FirstPartyRenderer", wq1Var);
            cr1 cr1Var = this.I;
            if (cr1Var != null) {
                linkedHashMapAttabal.put("ThirdPartyRenderer", cr1Var);
                br1 br1Var = this.J;
                if (br1Var != null) {
                    linkedHashMapAttabal.put("RtbRendererNative", br1Var);
                    this.K = new qd0(new a4(new bd1(linkedHashMapAttabal)));
                    return;
                }
                throw new NullPointerException(IronSourceConstants.EVENTS_PROVIDER);
            }
            throw new NullPointerException(IronSourceConstants.EVENTS_PROVIDER);
        }
        throw new NullPointerException(IronSourceConstants.EVENTS_PROVIDER);
    }
}
