package com.google.android.gms.internal.ads;

import android.net.NetworkCapabilities;
import java.lang.reflect.Method;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class q41 extends u41 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f18924f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Object f18925g;

    public q41(xd xdVar, h41 h41Var, h21 h21Var, a71 a71Var) {
        super("4x2Hh5iTg/qW5xffP7XUVyyhNVEHgfMgXZN24VVA9KHUAzifkbImBn58u0wzbVSZ", "gKocIG5D8c3aRlaOl/4axnWoyxTZtkz2guMC88wPwLk=", xdVar, h41Var, a71Var.a(116));
        this.f18925g = h21Var;
    }

    @Override // com.google.android.gms.internal.ads.u41
    public final void a(Method method, xd xdVar) {
        switch (this.f18924f) {
            case 0:
                Object[] objArr = (Object[]) method.invoke("", ((h21) this.f18925g).Q());
                objArr.getClass();
                synchronized (xdVar) {
                    String str = (String) objArr[0];
                    xdVar.b();
                    ((je) xdVar.f19193b).D0(str);
                    String str2 = (String) objArr[1];
                    xdVar.b();
                    ((je) xdVar.f19193b).k0(str2);
                    break;
                }
                return;
            default:
                Map map = (Map) this.f18925g;
                Object[] objArr2 = (Object[]) method.invoke("", (NetworkCapabilities) map.get("ntc"), (Long) map.get("vs"), (Long) map.get("vf"));
                objArr2.getClass();
                synchronized (xdVar) {
                    long jLongValue = ((Long) objArr2[0]).longValue();
                    xdVar.b();
                    ((je) xdVar.f19193b).H0(jLongValue);
                    long jLongValue2 = ((Long) objArr2[1]).longValue();
                    if (jLongValue2 >= 0) {
                        xdVar.b();
                        ((je) xdVar.f19193b).g0(jLongValue2);
                    }
                    long jLongValue3 = ((Long) objArr2[2]).longValue();
                    if (jLongValue3 >= 0) {
                        xdVar.b();
                        ((je) xdVar.f19193b).h0(jLongValue3);
                    }
                    break;
                }
                return;
        }
    }

    public q41(xd xdVar, h41 h41Var, Map map, a71 a71Var) {
        super("YG+UUJxJEVSGG6jfg3qjLnMxlQFUVyMMjgzEbZMK/+kyZ0C5+m/L80+lYQbH4OQO", "6dR3aiNoBR9E5efHnflEq0hfvoZwKGjGgWyKk1r6EjY=", xdVar, h41Var, a71Var.a(118));
        this.f18925g = map;
    }
}
