package ads_mobile_sdk;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import java.util.Map;
import saneness.bochum;
import saneness.coffeecake;

/* JADX INFO: loaded from: classes.dex */
public final class m40 {
    public coffeecake A;
    public final d40 a;
    public final i40 b;
    public h21 c;
    public h21 d;
    public h21 e;
    public be0 f;
    public hc0 g;
    public h21 h;
    public us1 i;
    public ef0 j;
    public d03 k;
    public z81 l;
    public h21 m;
    public bl2 n;
    public rd o;
    public q62 p;
    public pc2 q;
    public q0 r;
    public xm2 s;
    public h21 t;
    public q u;
    public coffeecake v;
    public l73 w;
    public xm2 x;
    public u03 y;
    public xm2 z;

    public m40(d40 d40Var, i40 i40Var, Context context, View view, Activity activity, String str, Map map, bochum bochumVar, yu2 yu2Var) {
        this.a = d40Var;
        this.b = i40Var;
        a(context, view, activity, str, map, bochumVar, yu2Var);
        a();
    }

    public final void a(Context context, View view, Activity activity, String str, Map map, bochum bochumVar, yu2 yu2Var) {
        this.c = h21.a(yu2Var);
        this.d = str == null ? h21.b : new h21(str);
        h21 h21VarA = h21.a(bochumVar);
        this.e = h21VarA;
        coffeecake coffeecakeVar = this.b.c;
        d40 d40Var = this.a;
        h21 h21Var = d40Var.b;
        coffeecake coffeecakeVar2 = d40Var.r;
        this.f = new be0(h21VarA, coffeecakeVar, h21Var, coffeecakeVar2);
        this.g = new hc0(h21VarA, coffeecakeVar, coffeecakeVar2);
        h21 h21VarA2 = h21.a(map);
        this.h = h21VarA2;
        h21 h21Var2 = this.e;
        coffeecake coffeecakeVar3 = this.b.c;
        d40 d40Var2 = this.a;
        coffeecake coffeecakeVar4 = d40Var2.r;
        this.i = new us1(h21Var2, coffeecakeVar3, h21VarA2, coffeecakeVar4);
        this.j = new ef0(h21Var2, coffeecakeVar3, d40Var2.j, coffeecakeVar4);
        this.k = new d03(h21Var2, coffeecakeVar3, this.c, h21VarA2, coffeecakeVar4);
        this.l = new z81(h21Var2, coffeecakeVar3, coffeecakeVar4);
        h21 h21VarA3 = h21.a(context);
        this.m = h21VarA3;
        h21 h21Var3 = this.e;
        coffeecake coffeecakeVar5 = this.b.c;
        h21 h21Var4 = this.c;
        h21 h21Var5 = this.h;
        d40 d40Var3 = this.a;
        coffeecake coffeecakeVar6 = d40Var3.r;
        this.n = new bl2(h21Var3, coffeecakeVar5, h21Var4, h21VarA3, h21Var5, coffeecakeVar6);
        h21 h21Var6 = d40Var3.b;
        h21 h21Var7 = d40Var3.j;
        this.o = new rd(h21Var3, coffeecakeVar5, h21Var5, h21Var6, h21Var4, h21Var7, coffeecakeVar6);
        this.p = new q62(h21Var3, coffeecakeVar5, h21Var6, coffeecakeVar6);
        this.q = new pc2(h21Var3, coffeecakeVar5, h21Var5, h21Var6, coffeecakeVar6);
        this.r = new q0(h21Var3, h21Var5, h21Var7, coffeecakeVar6);
        int i = xm2.f3295attabal;
        wm2 wm2Var = new wm2(11);
        wm2Var.a(this.f);
        wm2Var.a(this.g);
        wm2Var.a(this.i);
        wm2Var.a(this.j);
        wm2Var.a(this.k);
        wm2Var.a(this.l);
        wm2Var.a(this.n);
        wm2Var.a(this.o);
        wm2Var.a(this.p);
        wm2Var.a(this.q);
        wm2Var.a(this.r);
        this.s = wm2Var.a();
        h21 h21Var8 = view == null ? h21.b : new h21(view);
        this.t = h21Var8;
        this.u = new q(this.e, this.b.c, h21Var8, activity == null ? h21.b : new h21(activity), this.a.r);
        er2 er2Var = new er2(this.m);
        Object obj = qd0.c;
        qd0 qd0Var = new qd0(er2Var);
        this.v = qd0Var;
        this.w = new l73(this.e, this.b.c, qd0Var, this.t, this.a.r);
        wm2 wm2Var2 = new wm2(11);
        wm2Var2.a(this.f);
        wm2Var2.a(this.g);
        wm2Var2.a(this.j);
        wm2Var2.a(this.u);
        wm2Var2.a(this.w);
        wm2Var2.a(this.k);
        wm2Var2.a(this.l);
        wm2Var2.a(this.n);
        wm2Var2.a(this.o);
        wm2Var2.a(this.p);
        wm2Var2.a(this.q);
        this.x = wm2Var2.a();
        this.y = new u03(this.e, this.b.c, this.h, this.v, this.a.r);
        wm2 wm2Var3 = new wm2(12);
        wm2Var3.a(this.f);
        wm2Var3.a(this.g);
        wm2Var3.a(this.j);
        wm2Var3.a(this.u);
        wm2Var3.a(this.w);
        wm2Var3.a(this.k);
        wm2Var3.a(this.l);
        wm2Var3.a(this.n);
        wm2Var3.a(this.o);
        wm2Var3.a(this.p);
        wm2Var3.a(this.q);
        wm2Var3.a(this.y);
        this.z = wm2Var3.a();
    }

    public final void a() {
        d40 d40Var = this.a;
        cr2 cr2Var = new cr2(d40Var.t, d40Var.A, this.b.c, this.c, this.d, this.e, this.s, this.x, this.z, d40Var.r);
        Object obj = qd0.c;
        this.A = new qd0(cr2Var);
    }
}
