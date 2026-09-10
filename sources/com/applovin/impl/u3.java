package com.applovin.impl;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public class u3 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Set f9820c = new HashSet();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Map f9821d = new HashMap();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final u3 f9822e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final u3 f9823f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final u3 f9824g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f9825a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Set f9826b;

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public enum a {
        SESSION("session"),
        INSTALL("install");


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f9830a;

        a(String str) {
            this.f9830a = str;
        }

        public String b() {
            return this.f9830a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public interface b {
        Object a(Object obj);
    }

    static {
        a aVar = a.SESSION;
        f9822e = a("ars", aVar, a.INSTALL);
        f9823f = a("ar", aVar);
        f9824g = a("ttdasi_ms", aVar);
    }

    private u3(String str, Set set) {
        this.f9825a = str;
        this.f9826b = set;
    }

    public boolean a(Object obj) {
        return obj instanceof u3;
    }

    public Set b() {
        return this.f9826b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof u3)) {
            return false;
        }
        u3 u3Var = (u3) obj;
        if (!u3Var.a(this)) {
            return false;
        }
        String strA = a();
        String strA2 = u3Var.a();
        if (strA != null ? !strA.equals(strA2) : strA2 != null) {
            return false;
        }
        Set setB = b();
        Set setB2 = u3Var.b();
        return setB != null ? setB.equals(setB2) : setB2 == null;
    }

    public int hashCode() {
        String strA = a();
        int iHashCode = strA == null ? 43 : strA.hashCode();
        Set setB = b();
        return ((iHashCode + 59) * 59) + (setB != null ? setB.hashCode() : 43);
    }

    public String toString() {
        return this.f9825a;
    }

    public String a() {
        return this.f9825a;
    }

    private static u3 a(String str, a... aVarArr) {
        Set set = f9820c;
        if (!set.contains(str)) {
            u3 u3Var = new u3(str, new HashSet(Arrays.asList(aVarArr)));
            set.add(str);
            f9821d.put(str, u3Var);
            return u3Var;
        }
        throw new IllegalArgumentException(defpackage.e.n("Key has already been used: ", str));
    }

    public boolean a(a aVar) {
        return this.f9826b.contains(aVar);
    }

    public static u3 a(String str) {
        return (u3) f9821d.get(str);
    }
}
