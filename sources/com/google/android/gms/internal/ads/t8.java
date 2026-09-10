package com.google.android.gms.internal.ads;

import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class t8 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Pattern f20235c = Pattern.compile("\\[voice=\"([^\"]*)\"\\]");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Pattern f20236d = Pattern.compile("^((?:[0-9]*\\.)?[0-9]+)(px|em|%)$");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final np0 f20237a = new np0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final StringBuilder f20238b = new StringBuilder();

    public static void a(np0 np0Var) {
        while (true) {
            for (boolean z10 = true; np0Var.B() > 0 && z10; z10 = false) {
                int i10 = np0Var.f17881b;
                byte[] bArr = np0Var.f17880a;
                byte b10 = bArr[i10];
                char c4 = (char) b10;
                if (c4 == '\t' || c4 == '\n' || c4 == '\f' || c4 == '\r' || c4 == ' ') {
                    np0Var.G(1);
                } else {
                    int i11 = np0Var.f17882c;
                    if (i10 + 2 <= i11) {
                        int i12 = i10 + 1;
                        if (b10 == 47) {
                            int i13 = i10 + 2;
                            if (bArr[i12] == 42) {
                                while (true) {
                                    int i14 = i13 + 1;
                                    if (i14 >= i11) {
                                        break;
                                    }
                                    if (((char) bArr[i13]) == '*' && ((char) bArr[i14]) == '/') {
                                        i11 = i13 + 2;
                                        i13 = i11;
                                    } else {
                                        i13 = i14;
                                    }
                                }
                                np0Var.G(i11 - np0Var.f17881b);
                            }
                        } else {
                            continue;
                        }
                    }
                }
            }
            return;
        }
    }

    public static String b(np0 np0Var, StringBuilder sb2) {
        a(np0Var);
        if (np0Var.B() == 0) {
            return null;
        }
        String strC = c(np0Var, sb2);
        if (!strC.isEmpty()) {
            return strC;
        }
        char cK = (char) np0Var.K();
        StringBuilder sb3 = new StringBuilder(String.valueOf(cK).length());
        sb3.append(cK);
        return sb3.toString();
    }

    public static String c(np0 np0Var, StringBuilder sb2) {
        char c4;
        sb2.setLength(0);
        int i10 = np0Var.f17881b;
        int i11 = np0Var.f17882c;
        loop0: while (true) {
            boolean z10 = false;
            while (true) {
                if (i10 < i11 && !z10) {
                    c4 = (char) np0Var.f17880a[i10];
                    if ((c4 >= 'A' && c4 <= 'Z') || ((c4 >= 'a' && c4 <= 'z') || ((c4 >= '0' && c4 <= '9') || c4 == '#' || c4 == '-' || c4 == '.' || c4 == '_'))) {
                        break;
                    }
                    z10 = true;
                } else {
                    break loop0;
                }
            }
            sb2.append(c4);
            i10++;
        }
        np0Var.G(i10 - np0Var.f17881b);
        return sb2.toString();
    }
}
