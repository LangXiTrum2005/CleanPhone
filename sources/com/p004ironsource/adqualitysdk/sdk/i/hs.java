package com.p004ironsource.adqualitysdk.sdk.i;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class hs {

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private hs f2289;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private dp f2290;

    public static class b {

        /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
        private hv f2291;

        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        private int f2292;

        private b() {
        }

        /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
        public final hv m2257() {
            return this.f2291;
        }

        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        public final void m2259(hv hvVar) {
            this.f2291 = hvVar;
            this.f2292 = hvVar.m2275();
        }

        public /* synthetic */ b(byte b2) {
            this();
        }

        /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
        public final boolean m2258(Method method) {
            if (this.f2291 == null || (method.getModifiers() & this.f2291.m2202()) != this.f2291.m2202() || (method.getModifiers() & this.f2291.m2204()) != 0 || this.f2291.m2276().contains(method.getReturnType())) {
                return false;
            }
            Class<?>[] parameterTypes = method.getParameterTypes();
            if (this.f2291.m2273() != -1 && this.f2291.m2273() != parameterTypes.length) {
                return false;
            }
            List<Class> listM2274 = this.f2291.m2274();
            if (listM2274 != null) {
                if (listM2274.size() != parameterTypes.length) {
                    return false;
                }
                for (int i2 = 0; i2 < listM2274.size(); i2++) {
                    if (!listM2274.get(i2).equals(parameterTypes[i2])) {
                        return false;
                    }
                }
            }
            if (this.f2291.m2278() != null ? this.f2291.m2277() ? method.getReturnType().equals(this.f2291.m2278()) : this.f2291.m2278().isAssignableFrom(method.getReturnType()) : true) {
                int i3 = this.f2292;
                if (i3 == 0) {
                    return true;
                }
                this.f2292 = i3 - 1;
            }
            return false;
        }
    }

    public hs() {
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static void m2247(Class cls, hv hvVar, List<Method> list) {
        b bVar = new b((byte) 0);
        bVar.m2259(hvVar);
        m2249(cls, bVar, list);
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static List<Method> m2248(Class cls, hv hvVar) {
        ArrayList arrayList = new ArrayList();
        m2247(cls, hvVar, arrayList);
        return arrayList;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static Method m2250(Class cls, hv hvVar) {
        ArrayList arrayList = new ArrayList();
        m2247(cls, hvVar, arrayList);
        if (arrayList.isEmpty()) {
            return null;
        }
        return (Method) arrayList.get(0);
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public final hs m2252() {
        return this.f2289;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final String m2256() {
        return this.f2290.m1970();
    }

    public hs(dp dpVar, hs hsVar) {
        this.f2290 = dpVar;
        this.f2289 = hsVar;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static void m2249(Class cls, b bVar, List<Method> list) {
        List<Method> listAsList;
        hv hvVarM2257 = bVar.m2257();
        if (hvVarM2257 != null && hvVarM2257.m2205()) {
            listAsList = m2246(cls, hvVarM2257.m2205(), hvVarM2257.m2203());
        } else {
            listAsList = Arrays.asList(cls.getDeclaredMethods());
        }
        for (Method method : listAsList) {
            if (bVar.m2258(method)) {
                list.add(method);
            }
        }
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static List<Method> m2246(Class cls, boolean z2, int i2) {
        Method[] methodArrM2720 = new Method[0];
        if (cls != null) {
            methodArrM2720 = jz.m2720(cls.getDeclaredMethods(), cls.getMethods());
            if (!z2) {
                return Arrays.asList(methodArrM2720);
            }
            Class superclass = cls.getSuperclass();
            for (int i3 = 0; superclass != null && i3 != i2; i3++) {
                methodArrM2720 = jz.m2720(jz.m2720(methodArrM2720, superclass.getDeclaredMethods()), superclass.getMethods());
                superclass = superclass.getSuperclass();
            }
        }
        return Arrays.asList(methodArrM2720);
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final Cdo m2255(String str) {
        Cdo cdo;
        hs hsVar = this;
        do {
            cdo = hsVar.f2290.m1967().get(str);
            if (cdo != null) {
                break;
            }
            hsVar = hsVar.f2289;
        } while (hsVar != null);
        return cdo;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final List<dn> m2254() {
        ArrayList arrayList = new ArrayList(this.f2290.m1966());
        hs hsVar = this.f2289;
        if (hsVar != null) {
            arrayList.addAll(hsVar.m2254());
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final dt m2253(String str) {
        dt dtVar;
        hs hsVar = this;
        do {
            dtVar = hsVar.f2290.m1971().get(str);
            if (dtVar != null) {
                break;
            }
            hsVar = hsVar.f2289;
        } while (hsVar != null);
        return dtVar;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public final List<String> m2251() {
        ArrayList arrayList = new ArrayList(this.f2290.m1968());
        hs hsVar = this.f2289;
        if (hsVar != null) {
            arrayList.addAll(hsVar.m2251());
        }
        return arrayList;
    }
}
