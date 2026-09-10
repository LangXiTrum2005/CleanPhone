package an;

import com.applovin.shadow.okhttp3.internal.http2.Settings;
import com.ironsource.InterfaceC0435l1;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class n extends m {
    /* JADX WARN: Code duplicated, block: B:106:0x0121  */
    /* JADX WARN: Code duplicated, block: B:69:0x00c5  */
    public static final boolean c0(String str) {
        char c4;
        boolean z10;
        boolean z11;
        int i10;
        boolean z12;
        String str2;
        boolean z13;
        boolean z14 = true;
        int length = str.length() - 1;
        int i11 = 0;
        while (true) {
            c4 = ' ';
            if (i11 > length || str.charAt(i11) > ' ') {
                break;
            }
            i11++;
        }
        if (i11 > length) {
            return false;
        }
        while (length > i11 && str.charAt(length) <= ' ') {
            length--;
        }
        if (str.charAt(i11) == '+' || str.charAt(i11) == '-') {
            i11++;
        }
        if (i11 > length) {
            return false;
        }
        if (str.charAt(i11) != '0') {
            z10 = true;
            z11 = false;
        } else {
            int i12 = i11 + 1;
            if (i12 > length) {
                return true;
            }
            if ((str.charAt(i12) | ' ') == 120) {
                int i13 = i11 + 2;
                int i14 = i13;
                while (true) {
                    if (i14 > length) {
                        z10 = z14;
                        break;
                    }
                    char cCharAt = str.charAt(i14);
                    z10 = z14;
                    if (((cCharAt - '0') & Settings.DEFAULT_INITIAL_WINDOW_SIZE) >= 10 && (((cCharAt | ' ') - 97) & Settings.DEFAULT_INITIAL_WINDOW_SIZE) >= 6) {
                        break;
                    }
                    i14++;
                    z14 = z10;
                }
                boolean z15 = i13 != i14 ? z10 : false;
                if (i14 <= length) {
                    if (str.charAt(i14) == '.') {
                        int i15 = i14 + 1;
                        int i16 = i15;
                        while (i16 <= length) {
                            char cCharAt2 = str.charAt(i16);
                            char c5 = c4;
                            if (((cCharAt2 - '0') & Settings.DEFAULT_INITIAL_WINDOW_SIZE) >= 10 && (((cCharAt2 | ' ') - 97) & Settings.DEFAULT_INITIAL_WINDOW_SIZE) >= 6) {
                                break;
                            }
                            i16++;
                            c4 = c5;
                        }
                        z13 = i15 != i16 ? z10 : false;
                        i14 = i16;
                    } else {
                        z13 = false;
                    }
                    if (z15 || z13) {
                        i11 = i14;
                    }
                    if (i11 != -1 || i11 > length) {
                        return false;
                    }
                    z11 = z10;
                }
                i11 = -1;
                if (i11 != -1) {
                }
                return false;
            }
            z10 = true;
            z11 = false;
        }
        if (!z11) {
            int i17 = i11;
            while (i17 <= length && ((str.charAt(i17) - '0') & Settings.DEFAULT_INITIAL_WINDOW_SIZE) < 10) {
                i17++;
            }
            boolean z16 = i11 != i17 ? z10 : false;
            if (i17 > length) {
                i11 = i17;
            } else {
                if (str.charAt(i17) == '.') {
                    int i18 = i17 + 1;
                    i10 = i18;
                    while (i10 <= length && ((str.charAt(i10) - '0') & Settings.DEFAULT_INITIAL_WINDOW_SIZE) < 10) {
                        i10++;
                    }
                    if (i18 != i10) {
                        z12 = z10;
                    }
                    if (!z16 || z12) {
                        i11 = i10;
                    } else {
                        if (length == i10 + 2) {
                            str2 = "NaN";
                        } else {
                            str2 = length == i10 + 7 ? "Infinity" : null;
                        }
                        i11 = (str2 != null && h.t0(str, str2, i10, false) == i10) ? length + 1 : -1;
                    }
                } else {
                    i10 = i17;
                }
                z12 = false;
                if (z16) {
                    i11 = i10;
                } else {
                    i11 = i10;
                }
            }
            if (i11 == -1) {
                return false;
            }
            if (i11 > length) {
                return z10;
            }
        }
        int i19 = i11 + 1;
        int iCharAt = str.charAt(i11) | ' ';
        if (iCharAt != (z11 ? InterfaceC0435l1.d.b.f29113j : InterfaceC0435l1.d.b.f29105b)) {
            if (z11 || (!(iCharAt == 102 || iCharAt == 100) || i19 <= length)) {
                return false;
            }
            return z10;
        }
        if (i19 > length) {
            return false;
        }
        if ((str.charAt(i19) == '+' || str.charAt(i19) == '-') && (i19 = i11 + 2) > length) {
            return false;
        }
        while (i19 <= length && ((str.charAt(i19) - '0') & Settings.DEFAULT_INITIAL_WINDOW_SIZE) < 10) {
            i19++;
        }
        if (i19 > length) {
            return z10;
        }
        if (i19 != length) {
            return false;
        }
        int iCharAt2 = str.charAt(i19) | ' ';
        if (iCharAt2 == 102 || iCharAt2 == 100) {
            return z10;
        }
        return false;
    }

    public static Double d0(String str) {
        kotlin.jvm.internal.n.f(str, "<this>");
        try {
            if (c0(str)) {
                return Double.valueOf(Double.parseDouble(str));
            }
            return null;
        } catch (NumberFormatException unused) {
            return null;
        }
    }
}
