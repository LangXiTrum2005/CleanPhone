package com.ironsource.adqualitysdk.sdk.i;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class ic {

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private ic f2448;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private dl f2449;

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static class c {

        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
        private ie f2450;

        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        private int f2451;

        private c() {
        }

        /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
        public final ie m2378() {
            return this.f2450;
        }

        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        public final void m2380(ie ieVar) {
            this.f2450 = ieVar;
            this.f2451 = ieVar.m2394();
        }

        public /* synthetic */ c(byte b10) {
            this();
        }

        /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
        public final boolean m2379(Method method) {
            if (this.f2450 == null || (method.getModifiers() & this.f2450.m2324()) != this.f2450.m2324() || (method.getModifiers() & this.f2450.m2320()) != 0 || this.f2450.m2395().contains(method.getReturnType())) {
                return false;
            }
            Class<?>[] parameterTypes = method.getParameterTypes();
            if (this.f2450.m2391() != -1 && this.f2450.m2391() != parameterTypes.length) {
                return false;
            }
            List<Class> listM2396 = this.f2450.m2396();
            if (listM2396 != null) {
                if (listM2396.size() != parameterTypes.length) {
                    return false;
                }
                for (int i10 = 0; i10 < listM2396.size(); i10++) {
                    if (!listM2396.get(i10).equals(parameterTypes[i10])) {
                        return false;
                    }
                }
            }
            if (this.f2450.m2393() != null ? this.f2450.m2392() ? method.getReturnType().equals(this.f2450.m2393()) : this.f2450.m2393().isAssignableFrom(method.getReturnType()) : true) {
                int i11 = this.f2451;
                if (i11 == 0) {
                    return true;
                }
                this.f2451 = i11 - 1;
            }
            return false;
        }
    }

    public ic() {
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static List<Method> m2367(Class cls, ie ieVar) {
        ArrayList arrayList = new ArrayList();
        m2371(cls, ieVar, arrayList);
        return arrayList;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static Method m2368(Class cls, ie ieVar) {
        ArrayList arrayList = new ArrayList();
        m2371(cls, ieVar, arrayList);
        if (arrayList.isEmpty()) {
            return null;
        }
        return (Method) arrayList.get(0);
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static void m2371(Class cls, ie ieVar, List<Method> list) {
        c cVar = new c((byte) 0);
        cVar.m2380(ieVar);
        m2370(cls, cVar, list);
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final dz m2375(String str) {
        dz dzVar;
        do {
            dzVar = this.f2449.m2020().get(str);
            if (dzVar != null) {
                break;
            }
            this = this.f2448;
        } while (this != null);
        return dzVar;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final List<dm> m2377() {
        ArrayList arrayList = new ArrayList(this.f2449.m2018());
        ic icVar = this.f2448;
        if (icVar != null) {
            arrayList.addAll(icVar.m2377());
        }
        return arrayList;
    }

    public ic(dl dlVar, ic icVar) {
        this.f2449 = dlVar;
        this.f2448 = icVar;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public final String m2372() {
        return this.f2449.m2024();
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static void m2370(Class cls, c cVar, List<Method> list) {
        List<Method> listAsList;
        ie ieVarM2378 = cVar.m2378();
        if (ieVarM2378 != null && ieVarM2378.m2321()) {
            listAsList = m2369(cls, ieVarM2378.m2321(), ieVarM2378.m2322());
        } else {
            listAsList = Arrays.asList(cls.getDeclaredMethods());
        }
        for (Method method : listAsList) {
            if (cVar.m2379(method)) {
                list.add(method);
            }
        }
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public final ic m2374() {
        return this.f2448;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public final dh m2373(String str) {
        dh dhVar;
        do {
            dhVar = this.f2449.m2019().get(str);
            if (dhVar != null) {
                break;
            }
            this = this.f2448;
        } while (this != null);
        return dhVar;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static List<Method> m2369(Class cls, boolean z10, int i10) {
        Method[] methodArrM2888 = new Method[0];
        if (cls != null) {
            methodArrM2888 = kk.m2888(cls.getDeclaredMethods(), cls.getMethods());
            if (!z10) {
                return Arrays.asList(methodArrM2888);
            }
            Class superclass = cls.getSuperclass();
            for (int i11 = 0; superclass != null && i11 != i10; i11++) {
                methodArrM2888 = kk.m2888(kk.m2888(methodArrM2888, superclass.getDeclaredMethods()), superclass.getMethods());
                superclass = superclass.getSuperclass();
            }
        }
        return Arrays.asList(methodArrM2888);
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final List<String> m2376() {
        ArrayList arrayList = new ArrayList(this.f2449.m2023());
        ic icVar = this.f2448;
        if (icVar != null) {
            arrayList.addAll(icVar.m2376());
        }
        return arrayList;
    }
}
