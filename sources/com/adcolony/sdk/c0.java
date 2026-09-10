package com.adcolony.sdk;

import java.io.IOException;
import org.json.JSONException;

/* JADX INFO: loaded from: classes.dex */
class c0 {
    public static f1 a(String str, String str2) {
        String string;
        try {
            return new f1(str);
        } catch (JSONException e2) {
            if (str2 == null) {
                string = "";
            } else {
                StringBuilder sbX = android.support.v4.media.a.x(str2, ": ");
                sbX.append(e2.toString());
                string = sbX.toString();
            }
            new e0.a().a(string).a(e0.f9132i);
            return new f1();
        }
    }

    public static f1 b() {
        return new f1();
    }

    public static double c(f1 f1Var, String str) {
        return f1Var.a(str, 0.0d);
    }

    public static int d(f1 f1Var, String str) {
        return f1Var.j(str);
    }

    public static e1 e(f1 f1Var, String str) {
        return f1Var.l(str);
    }

    public static f1 f(f1 f1Var, String str) {
        return f1Var.m(str);
    }

    public static Object g(f1 f1Var, String str) {
        Object objO = f1Var.o(str);
        return objO == null ? Boolean.FALSE : objO;
    }

    public static String h(f1 f1Var, String str) {
        return f1Var.p(str);
    }

    public static String i(f1 f1Var, String str) {
        return f1Var.q(str);
    }

    public static boolean j(f1 f1Var, String str) {
        try {
            a.b().p().a(str, f1Var.toString(), false);
            return true;
        } catch (IOException e2) {
            new e0.a().a("IOException in ADCJSON's saveObject: ").a(e2.toString()).a(e0.f9132i);
            return false;
        }
    }

    public static f1 b(String str) {
        return a(str, (String) null);
    }

    public static f1 c(String str) {
        try {
            return a(a.b().p().a(str, false).toString(), "loadObject from filepath " + str);
        } catch (IOException e2) {
            new e0.a().a("IOException in ADCJSON's loadObject: ").a(e2.toString()).a(e0.f9132i);
            return b();
        }
    }

    public static String b(e1 e1Var, int i2) {
        return e1Var.d(i2);
    }

    public static boolean b(f1 f1Var, String str) {
        return f1Var.f(str);
    }

    public static boolean b(f1 f1Var, String str, int i2) {
        try {
            f1Var.b(str, i2);
            return true;
        } catch (JSONException e2) {
            new e0.a().a("JSON error in ADCJSON putInteger(): ").a(e2.toString()).a(android.support.v4.media.a.C(" with key: ", str)).a(android.support.v4.media.a.h(i2, " and value: ")).a(e0.f9132i);
            return false;
        }
    }

    public static e1 a() {
        return new e1();
    }

    public static e1 a(String str) {
        try {
            return new e1(str);
        } catch (JSONException e2) {
            new e0.a().a(e2.toString()).a(e0.f9132i);
            return new e1();
        }
    }

    public static int a(f1 f1Var, String str, int i2) {
        return f1Var.a(str, i2);
    }

    public static long a(f1 f1Var, String str, long j) {
        return f1Var.a(str, j);
    }

    public static boolean a(f1 f1Var, String str, boolean z2) {
        return f1Var.a(str, z2);
    }

    public static boolean b(f1 f1Var, String str, long j) {
        try {
            f1Var.b(str, j);
            return true;
        } catch (JSONException e2) {
            new e0.a().a("JSON error in ADCJSON putLong(): ").a(e2.toString()).a(android.support.v4.media.a.C(" with key: ", str)).a(androidx.datastore.preferences.protobuf.a.i(j, " and value: ")).a(e0.f9132i);
            return false;
        }
    }

    public static f1 a(e1 e1Var, int i2) {
        return e1Var.c(i2);
    }

    public static e1 a(f1 f1Var, String str) {
        return f1Var.k(str);
    }

    public static boolean a(f1 f1Var, String str, String str2) {
        try {
            f1Var.a(str, str2);
            return true;
        } catch (JSONException e2) {
            new e0.a().a("JSON error in ADCJSON putString(): ").a(e2.toString()).a(android.support.v4.media.a.C(" with key: ", str)).a(android.support.v4.media.a.C(" and value: ", str2)).a(e0.f9132i);
            return false;
        }
    }

    public static boolean b(f1 f1Var, String str, boolean z2) {
        try {
            f1Var.b(str, z2);
            return true;
        } catch (JSONException e2) {
            new e0.a().a("JSON error in ADCJSON putBoolean(): ").a(e2.toString()).a(android.support.v4.media.a.C(" with key: ", str)).a(" and value: " + z2).a(e0.f9132i);
            return false;
        }
    }

    public static boolean a(f1 f1Var, String str, e1 e1Var) {
        try {
            f1Var.a(str, e1Var);
            return true;
        } catch (JSONException e2) {
            new e0.a().a("JSON error in ADCJSON putArray(): ").a(e2.toString()).a(android.support.v4.media.a.C(" with key: ", str)).a(" and value: " + e1Var).a(e0.f9132i);
            return false;
        }
    }

    public static f1[] b(e1 e1Var) {
        return e1Var.c();
    }

    public static boolean a(f1 f1Var, String str, f1 f1Var2) {
        try {
            f1Var.a(str, f1Var2);
            return true;
        } catch (JSONException e2) {
            new e0.a().a("JSON error in ADCJSON putObject(): ").a(e2.toString()).a(android.support.v4.media.a.C(" with key: ", str)).a(" and value: " + f1Var2).a(e0.f9132i);
            return false;
        }
    }

    public static boolean a(f1 f1Var, String str, double d) {
        try {
            f1Var.b(str, d);
            return true;
        } catch (JSONException unused) {
            new e0.a().a("JSON error in ADCJSON putDouble(): ").a(android.support.v4.media.a.C(" with key: ", str)).a(" and value: " + d).a(e0.f9132i);
            return false;
        }
    }

    public static void a(e1 e1Var, String str) {
        e1Var.b(str);
    }

    public static void a(e1 e1Var, f1 f1Var) {
        e1Var.a(f1Var);
    }

    public static String[] a(e1 e1Var) {
        return e1Var.d();
    }

    public static f1 a(f1... f1VarArr) {
        f1 f1Var = new f1();
        for (f1 f1Var2 : f1VarArr) {
            f1Var.a(f1Var2);
        }
        return f1Var;
    }
}
