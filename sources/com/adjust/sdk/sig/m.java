package com.adjust.sdk.sig;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Class f6983a;

    static {
        List listAsList = Arrays.asList(g0.class, r0.class, v0.class, w0.class, x0.class, y0.class, z0.class, a1.class, b1.class, c1.class, h0.class, i0.class, j0.class, k0.class, l0.class, m0.class, n0.class, o0.class, p0.class, q0.class, s0.class, t0.class, u0.class);
        ArrayList arrayList = new ArrayList(listAsList.size());
        int i10 = 0;
        int i11 = 0;
        for (Object obj : listAsList) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                throw new ArithmeticException("Index overflow has happened.");
            }
            arrayList.add(new a2((Class) obj, Integer.valueOf(i11)));
            i11 = i12;
        }
        int size = arrayList.size();
        if (size != 0) {
            if (size == 1) {
                a2 a2Var = (a2) arrayList.get(0);
                Collections.singletonMap(a2Var.f6922a, a2Var.f6923b);
                return;
            }
            int size2 = arrayList.size();
            if (size2 >= 0) {
                size2 = size2 < 3 ? size2 + 1 : size2 < 1073741824 ? (int) ((size2 / 0.75f) + 1.0f) : Integer.MAX_VALUE;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(size2);
            int size3 = arrayList.size();
            while (i10 < size3) {
                Object obj2 = arrayList.get(i10);
                i10++;
                a2 a2Var2 = (a2) obj2;
                linkedHashMap.put(a2Var2.f6922a, a2Var2.f6923b);
            }
        }
    }

    public m(Class cls) {
        this.f6983a = cls;
    }

    public final String a() {
        String strA;
        Class cls = this.f6983a;
        String strConcat = null;
        if (cls.isAnonymousClass()) {
            return null;
        }
        if (!cls.isLocalClass()) {
            if (!cls.isArray()) {
                String strA2 = l.a(cls.getName());
                return strA2 == null ? cls.getSimpleName() : strA2;
            }
            Class<?> componentType = cls.getComponentType();
            if (componentType.isPrimitive() && (strA = l.a(componentType.getName())) != null) {
                strConcat = strA.concat("Array");
            }
            return strConcat == null ? "Array" : strConcat;
        }
        String simpleName = cls.getSimpleName();
        Method enclosingMethod = cls.getEnclosingMethod();
        if (enclosingMethod != null) {
            String str = enclosingMethod.getName() + '$';
            int iIndexOf = simpleName.indexOf(str, 0);
            if (iIndexOf != -1) {
                return simpleName.substring(str.length() + iIndexOf, simpleName.length());
            }
        } else {
            Constructor<?> enclosingConstructor = cls.getEnclosingConstructor();
            if (enclosingConstructor != null) {
                String str2 = enclosingConstructor.getName() + '$';
                int iIndexOf2 = simpleName.indexOf(str2, 0);
                if (iIndexOf2 != -1) {
                    return simpleName.substring(str2.length() + iIndexOf2, simpleName.length());
                }
            } else {
                int iIndexOf3 = simpleName.indexOf(36, 0);
                if (iIndexOf3 != -1) {
                    return simpleName.substring(iIndexOf3 + 1, simpleName.length());
                }
            }
        }
        return simpleName;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof m) && p1.a(this).equals(p1.a((m) obj));
    }

    public final int hashCode() {
        return p1.a(this).hashCode();
    }

    public final String toString() {
        return this.f6983a + " (Kotlin reflection is not available)";
    }
}
