package com.smartdigimkt.n1;

import android.content.Context;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f36950a = "b";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f36951b = 500;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f36952c = "anythink";
    private static volatile b d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static HashMap<String, c> f36953e = new HashMap<>();
    private static a f = null;

    private b() {
    }

    public static void a(Context context, String str) {
        try {
            Map<String, ?> all = context.getSharedPreferences(com.smartdigimkt.b0.a.s, 0).getAll();
            for (String str2 : all.keySet()) {
                if (str2.startsWith(str + "_")) {
                    f36953e.put(str2, c.d((String) all.get(str2)));
                }
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public static b b() {
        if (d == null) {
            synchronized (b.class) {
                try {
                    if (d == null) {
                        d = new b();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return d;
    }

    public a c(String str) {
        if (f == null) {
            f = a();
        }
        return f;
    }

    public String d(String str) {
        return str == null ? "" : c(str).x1();
    }

    public c e(String str, String str2) {
        c cVarB = b(str, str2);
        if (cVarB != null && cVarB.M() == 0) {
            cVarB.d(1);
        }
        return cVarB;
    }

    public void f(String str, String str2) {
        com.smartdigimkt.t.a.b().a(str, str2);
        a aVarB = a.b(str2);
        f = aVarB;
        if (aVarB != null) {
            aVarB.y1();
        }
    }

    public void g(String str, String str2) {
        com.smartdigimkt.t.a.b().a("ivreward_" + str, str2);
    }

    public c c(String str, String str2) {
        c cVarA = a(str, str2);
        return cVarA == null ? c.p() : cVarA;
    }

    public c d(String str, String str2) {
        c cVarE = e(str, str2);
        return cVarE == null ? c.p() : cVarE;
    }

    public void e(String str) {
        com.smartdigimkt.t.a.b().d("ivreward_" + str);
    }

    private c b(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            str = com.smartdigimkt.u.a.f().a();
        }
        String strD = android.support.v4.media.a.D(str, "_", str2);
        if (f36953e.containsKey(strD)) {
            return f36953e.get(strD);
        }
        return null;
    }

    public c a(String str, String str2) {
        return b(str, str2);
    }

    public static c a(String str) {
        c cVar = new c();
        ArrayList arrayList = new ArrayList();
        arrayList.add(1);
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(8);
        arrayList2.add(8);
        cVar.z(2);
        cVar.r(1);
        cVar.h(str);
        cVar.c(arrayList);
        cVar.d(arrayList2);
        cVar.x(1);
        cVar.b(-2);
        cVar.c(-2);
        cVar.A(5);
        cVar.d(com.smartdigimkt.o1.b.f37307P);
        cVar.k(2);
        cVar.d(1);
        cVar.u(100);
        cVar.g(0);
        cVar.i(1);
        cVar.m(0);
        cVar.v(60);
        cVar.p(10);
        cVar.q(60);
        return cVar;
    }

    public String b(String str) {
        return com.smartdigimkt.t.a.b().a("ivreward_" + str);
    }

    public void a(String str, String str2, String str3) {
        String strD = android.support.v4.media.a.D(str, "_", str2);
        com.smartdigimkt.t.a.b().a(strD, str3);
        f36953e.put(strD, c.d(str3));
    }

    public a a() {
        a aVar = new a();
        aVar.l(1);
        aVar.c(true);
        aVar.f(com.smartdigimkt.o1.b.f37307P);
        aVar.a(0L);
        aVar.f(false);
        aVar.g(false);
        aVar.g(com.smartdigimkt.o1.b.f37308Q);
        aVar.s(f36952c);
        aVar.w(1);
        aVar.h(com.smartdigimkt.o1.b.C0);
        aVar.i(com.smartdigimkt.o1.b.y1);
        aVar.j(10L);
        aVar.n0(1);
        aVar.q0(1);
        aVar.m0(1);
        aVar.i0(0);
        aVar.k0(1);
        aVar.x(-1);
        aVar.k(0);
        aVar.t("");
        aVar.J(120);
        aVar.d(false);
        aVar.j(0);
        aVar.J(100);
        aVar.v(1);
        aVar.e(com.smartdigimkt.b0.a.L2);
        aVar.h(com.smartdigimkt.b0.a.O2);
        aVar.f(com.smartdigimkt.b0.a.N2);
        aVar.I(10);
        aVar.g(com.smartdigimkt.b0.a.T2);
        aVar.H(10);
        return aVar;
    }
}
