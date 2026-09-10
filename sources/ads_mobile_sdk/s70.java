package ads_mobile_sdk;

import com.ironsource.mediationsdk.utils.IronSourceConstants;
import complexometry.formularize;
import java.util.LinkedHashMap;
import saneness.coffeecake;
import saneness.dustman;
import saneness.excrescency;
import saneness.rockless;

/* JADX INFO: loaded from: classes.dex */
public final class s70 {
    public final i60 a;
    public h21 b;
    public b80 c;
    public coffeecake d;
    public h21 e;
    public h21 f;
    public h21 g;
    public h21 h;
    public h21 i;
    public h21 j;
    public h21 k;
    public coffeecake l;
    public h21 m;
    public h21 n;
    public h21 o;
    public h21 p;
    public h21 q;
    public h21 r;
    public ar1 s;
    public bd1 t;
    public coffeecake u;

    public s70(i60 i60Var, ur urVar, h1 h1Var, jm2 jm2Var, Long l, Integer num, formularize formularizeVar, yf2 yf2Var, xb2 xb2Var, j71 j71Var, Boolean bool, gy0 gy0Var, d6 d6Var, Integer num2, com.google.android.libraries.ads.mobile.sdk.nativead.dern dernVar, Boolean bool2, rockless rocklessVar, excrescency excrescencyVar) {
        this.a = i60Var;
        a(urVar, h1Var, jm2Var, l, num, formularizeVar, yf2Var, xb2Var, j71Var, bool, gy0Var, d6Var, num2, dernVar, bool2, rocklessVar, excrescencyVar);
        a();
    }

    public final void a(ur urVar, h1 h1Var, jm2 jm2Var, Long l, Integer num, formularize formularizeVar, yf2 yf2Var, xb2 xb2Var, j71 j71Var, Boolean bool, gy0 gy0Var, d6 d6Var, Integer num2, com.google.android.libraries.ads.mobile.sdk.nativead.dern dernVar, Boolean bool2, rockless rocklessVar, excrescency excrescencyVar) {
        this.b = h21.a(excrescencyVar);
        this.c = new b80(h21.a(xb2Var));
        wr wrVar = new wr(this.c, new b80(h21.a(j71Var)));
        Object obj = qd0.c;
        this.d = new qd0(wrVar);
        this.e = h21.a(formularizeVar);
        this.f = h21.a(yf2Var);
        this.g = h21.a(l);
        this.h = h21.a(num);
        this.i = h21.a(h1Var);
        this.j = h21.a(urVar);
        this.k = h21.a(jm2Var);
        this.l = new qd0(new vr(this.a.o0));
        this.m = h21.a(bool);
        this.n = h21.a(gy0Var);
        this.o = h21.a(dernVar);
        this.p = h21.a(num2);
        this.q = h21.a(bool2);
        this.r = h21.a(rocklessVar);
        h21 h21VarA = h21.a(d6Var);
        h21 h21Var = this.e;
        this.s = new ar1(new qd0(new gd2(this.b, this.d, h21Var, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, this.q, this.r, h21VarA, new b22(h21Var))));
        h21 h21Var2 = bd1.b;
        LinkedHashMap linkedHashMapAttabal = dustman.attabal(1);
        ar1 ar1Var = this.s;
        if (ar1Var == null) {
            throw new NullPointerException(IronSourceConstants.EVENTS_PROVIDER);
        }
        linkedHashMapAttabal.put("RecursiveRendererNative", ar1Var);
        this.t = new bd1(linkedHashMapAttabal);
    }

    public final void a() {
        a4 a4Var = new a4(this.t);
        Object obj = qd0.c;
        this.u = new qd0(a4Var);
    }
}
