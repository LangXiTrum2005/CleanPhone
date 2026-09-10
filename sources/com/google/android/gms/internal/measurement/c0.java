package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public abstract class c0 extends e1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f23335b;

    static {
        String property;
        try {
            property = System.getProperty("line.separator");
            if (!property.matches("\\n|\\r(?:\\n)?")) {
                property = "\n";
            }
        } catch (SecurityException unused) {
        }
        f23335b = property;
    }

    public static int g(int i10, String str) {
        while (i10 < str.length()) {
            int i11 = i10 + 1;
            if (str.charAt(i10) != '%') {
                i10 = i11;
            } else {
                if (i11 >= str.length()) {
                    throw new aa.b(aa.b.c(i10, -1, "trailing unquoted '%' character", str), 10);
                }
                char cCharAt = str.charAt(i11);
                if (cCharAt != '%' && cCharAt != 'n') {
                    return i10;
                }
                i10 += 2;
            }
        }
        return -1;
    }

    public final void f(int i10, int i11, String str, StringBuilder sb2) {
        int i12 = i10;
        while (i10 < i11) {
            int i13 = i10 + 1;
            if (str.charAt(i10) == '%') {
                if (i13 == i11) {
                    break;
                }
                char cCharAt = str.charAt(i13);
                if (cCharAt == '%') {
                    sb2.append((CharSequence) str, i12, i13);
                } else if (cCharAt == 'n') {
                    sb2.append((CharSequence) str, i12, i10);
                    sb2.append(f23335b);
                }
                i12 = i10 + 2;
                i10 = i12;
            }
            i10 = i13;
        }
        if (i12 < i11) {
            sb2.append((CharSequence) str, i12, i11);
        }
    }
}
