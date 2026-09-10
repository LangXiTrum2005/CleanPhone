package com.google.android.gms.internal.measurement;

import java.util.Arrays;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public abstract class zh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Locale f24211a = Locale.ROOT;

    public static String a(Object obj) {
        String simpleName;
        if (obj == null) {
            return "null";
        }
        try {
            if (!obj.getClass().isArray()) {
                String string = obj.toString();
                return string != null ? string : c(obj, "toString() returned null");
            }
            if (obj instanceof int[]) {
                return Arrays.toString((int[]) obj);
            }
            if (obj instanceof long[]) {
                return Arrays.toString((long[]) obj);
            }
            if (obj instanceof byte[]) {
                return Arrays.toString((byte[]) obj);
            }
            if (obj instanceof char[]) {
                return Arrays.toString((char[]) obj);
            }
            if (obj instanceof short[]) {
                return Arrays.toString((short[]) obj);
            }
            if (obj instanceof float[]) {
                return Arrays.toString((float[]) obj);
            }
            if (obj instanceof double[]) {
                return Arrays.toString((double[]) obj);
            }
            return obj instanceof boolean[] ? Arrays.toString((boolean[]) obj) : Arrays.toString((Object[]) obj);
        } catch (RuntimeException e10) {
            try {
                simpleName = e10.toString();
            } catch (RuntimeException e11) {
                simpleName = e11.getClass().getSimpleName();
            }
            return c(obj, simpleName);
        }
    }

    public static void b(StringBuilder sb2, long j10, boolean z10) {
        if (j10 == 0) {
            sb2.append("0");
            return;
        }
        String str = true != z10 ? "0123456789abcdef" : "0123456789ABCDEF";
        for (int iNumberOfLeadingZeros = (63 - Long.numberOfLeadingZeros(j10)) & (-4); iNumberOfLeadingZeros >= 0; iNumberOfLeadingZeros -= 4) {
            sb2.append(str.charAt((int) ((j10 >>> iNumberOfLeadingZeros) & 15)));
        }
    }

    public static String c(Object obj, String str) {
        String name = obj.getClass().getName();
        int iIdentityHashCode = System.identityHashCode(obj);
        StringBuilder sb2 = new StringBuilder(com.applovin.impl.ca.h(name.length(), 2, String.valueOf(iIdentityHashCode).length(), 2, String.valueOf(str).length()) + 1);
        sb2.append("{");
        sb2.append(name);
        sb2.append("@");
        sb2.append(iIdentityHashCode);
        return q4.a.j(sb2, ": ", str, "}");
    }
}
