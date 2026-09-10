package an;

import java.util.Comparator;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class p extends o {
    public static String g0(char[] cArr, int i10, int i11) {
        xj.c cVar = xj.f.Companion;
        int length = cArr.length;
        cVar.getClass();
        if (i10 < 0 || i11 > length) {
            StringBuilder sbL = l1.d.l("startIndex: ", i10, ", endIndex: ", i11, ", size: ");
            sbL.append(length);
            throw new IndexOutOfBoundsException(sbL.toString());
        }
        if (i10 <= i11) {
            return new String(cArr, i10, i11 - i10);
        }
        throw new IllegalArgumentException(defpackage.e.g(i10, i11, "startIndex: ", " > endIndex: "));
    }

    public static boolean h0(String str, String suffix, boolean z10) {
        kotlin.jvm.internal.n.f(str, "<this>");
        kotlin.jvm.internal.n.f(suffix, "suffix");
        return !z10 ? str.endsWith(suffix) : k0(str, str.length() - suffix.length(), suffix, 0, suffix.length(), true);
    }

    public static boolean i0(String str, String str2) {
        if (str == null) {
            return str2 == null;
        }
        return str.equalsIgnoreCase(str2);
    }

    public static void j0() {
        Comparator CASE_INSENSITIVE_ORDER = String.CASE_INSENSITIVE_ORDER;
        kotlin.jvm.internal.n.e(CASE_INSENSITIVE_ORDER, "CASE_INSENSITIVE_ORDER");
    }

    public static boolean k0(String str, int i10, String other, int i11, int i12, boolean z10) {
        kotlin.jvm.internal.n.f(str, "<this>");
        kotlin.jvm.internal.n.f(other, "other");
        return !z10 ? str.regionMatches(i10, other, i11, i12) : str.regionMatches(z10, i10, other, i11, i12);
    }

    public static String l0(int i10, String str) {
        if (i10 < 0) {
            throw new IllegalArgumentException(("Count 'n' must be non-negative, but was " + i10 + '.').toString());
        }
        if (i10 == 0) {
            return "";
        }
        int i11 = 1;
        if (i10 == 1) {
            return str.toString();
        }
        int length = str.length();
        if (length == 0) {
            return "";
        }
        if (length == 1) {
            char cCharAt = str.charAt(0);
            char[] cArr = new char[i10];
            for (int i12 = 0; i12 < i10; i12++) {
                cArr[i12] = cCharAt;
            }
            return new String(cArr);
        }
        StringBuilder sb2 = new StringBuilder(str.length() * i10);
        if (1 <= i10) {
            while (true) {
                sb2.append((CharSequence) str);
                if (i11 == i10) {
                    break;
                }
                i11++;
            }
        }
        String string = sb2.toString();
        kotlin.jvm.internal.n.c(string);
        return string;
    }

    public static String m0(String str, char c4, char c5) {
        kotlin.jvm.internal.n.f(str, "<this>");
        String strReplace = str.replace(c4, c5);
        kotlin.jvm.internal.n.e(strReplace, "replace(...)");
        return strReplace;
    }

    public static String n0(String str, String oldValue, String newValue) {
        kotlin.jvm.internal.n.f(str, "<this>");
        kotlin.jvm.internal.n.f(oldValue, "oldValue");
        kotlin.jvm.internal.n.f(newValue, "newValue");
        int iT0 = h.t0(str, oldValue, 0, false);
        if (iT0 < 0) {
            return str;
        }
        int length = oldValue.length();
        int i10 = length >= 1 ? length : 1;
        int length2 = newValue.length() + (str.length() - length);
        if (length2 < 0) {
            throw new OutOfMemoryError();
        }
        StringBuilder sb2 = new StringBuilder(length2);
        int i11 = 0;
        do {
            sb2.append((CharSequence) str, i11, iT0);
            sb2.append(newValue);
            i11 = iT0 + length;
            if (iT0 >= str.length()) {
                break;
            }
            iT0 = h.t0(str, oldValue, iT0 + i10, false);
        } while (iT0 > 0);
        sb2.append((CharSequence) str, i11, str.length());
        String string = sb2.toString();
        kotlin.jvm.internal.n.e(string, "toString(...)");
        return string;
    }

    public static boolean o0(String str, int i10, String str2, boolean z10) {
        kotlin.jvm.internal.n.f(str, "<this>");
        return !z10 ? str.startsWith(str2, i10) : k0(str, i10, str2, 0, str2.length(), z10);
    }

    public static boolean p0(String str, String prefix, boolean z10) {
        kotlin.jvm.internal.n.f(str, "<this>");
        kotlin.jvm.internal.n.f(prefix, "prefix");
        return !z10 ? str.startsWith(prefix) : k0(str, 0, prefix, 0, prefix.length(), z10);
    }
}
