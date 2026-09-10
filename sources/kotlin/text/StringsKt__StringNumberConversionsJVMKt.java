package kotlin.text;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"kotlin-stdlib"}, k = 5, mv = {2, 1, 0}, xi = 49, xs = "kotlin/text/StringsKt")
class StringsKt__StringNumberConversionsJVMKt extends StringsKt__StringBuilderKt {
    /* JADX WARN: Code duplicated, block: B:106:0x0121  */
    /* JADX WARN: Code duplicated, block: B:69:0x00c5  */
    public static final boolean a(String str) {
        char c2;
        boolean z2;
        boolean z3;
        int i2;
        boolean z4;
        String str2;
        boolean z5;
        boolean z6 = true;
        int length = str.length() - 1;
        int i3 = 0;
        while (true) {
            c2 = ' ';
            if (i3 > length || str.charAt(i3) > ' ') {
                break;
            }
            i3++;
        }
        if (i3 > length) {
            return false;
        }
        while (length > i3 && str.charAt(length) <= ' ') {
            length--;
        }
        if (str.charAt(i3) == '+' || str.charAt(i3) == '-') {
            i3++;
        }
        if (i3 > length) {
            return false;
        }
        if (str.charAt(i3) != '0') {
            z2 = true;
            z3 = false;
        } else {
            int i4 = i3 + 1;
            if (i4 > length) {
                return true;
            }
            if ((str.charAt(i4) | ' ') == 120) {
                int i5 = i3 + 2;
                int i6 = i5;
                while (true) {
                    if (i6 > length) {
                        z2 = z6;
                        break;
                    }
                    char cCharAt = str.charAt(i6);
                    z2 = z6;
                    if (((cCharAt - '0') & 65535) >= 10 && (((cCharAt | ' ') - 97) & 65535) >= 6) {
                        break;
                    }
                    i6++;
                    z6 = z2;
                }
                boolean z7 = i5 != i6 ? z2 : false;
                if (i6 <= length) {
                    if (str.charAt(i6) == '.') {
                        int i7 = i6 + 1;
                        int i8 = i7;
                        while (i8 <= length) {
                            char cCharAt2 = str.charAt(i8);
                            char c3 = c2;
                            if (((cCharAt2 - '0') & 65535) >= 10 && (((cCharAt2 | ' ') - 97) & 65535) >= 6) {
                                break;
                            }
                            i8++;
                            c2 = c3;
                        }
                        z5 = i7 != i8 ? z2 : false;
                        i6 = i8;
                    } else {
                        z5 = false;
                    }
                    if (z7 || z5) {
                        i3 = i6;
                    }
                    if (i3 != -1 || i3 > length) {
                        return false;
                    }
                    z3 = z2;
                }
                i3 = -1;
                if (i3 != -1) {
                }
                return false;
            }
            z2 = true;
            z3 = false;
        }
        if (!z3) {
            int i9 = i3;
            while (i9 <= length && ((str.charAt(i9) - '0') & 65535) < 10) {
                i9++;
            }
            boolean z8 = i3 != i9 ? z2 : false;
            if (i9 > length) {
                i3 = i9;
            } else {
                if (str.charAt(i9) == '.') {
                    int i10 = i9 + 1;
                    i2 = i10;
                    while (i2 <= length && ((str.charAt(i2) - '0') & 65535) < 10) {
                        i2++;
                    }
                    if (i10 != i2) {
                        z4 = z2;
                    }
                    if (!z8 || z4) {
                        i3 = i2;
                    } else {
                        if (length == i2 + 2) {
                            str2 = "NaN";
                        } else {
                            str2 = length == i2 + 7 ? "Infinity" : null;
                        }
                        i3 = (str2 != null && StringsKt__StringsKt.c(str, str2, i2, false) == i2) ? length + 1 : -1;
                    }
                } else {
                    i2 = i9;
                }
                z4 = false;
                if (z8) {
                    i3 = i2;
                } else {
                    i3 = i2;
                }
            }
            if (i3 == -1) {
                return false;
            }
            if (i3 > length) {
                return z2;
            }
        }
        int i11 = i3 + 1;
        int iCharAt = str.charAt(i3) | ' ';
        if (iCharAt != (z3 ? 112 : 101)) {
            if (z3 || (!(iCharAt == 102 || iCharAt == 100) || i11 <= length)) {
                return false;
            }
            return z2;
        }
        if (i11 > length) {
            return false;
        }
        if ((str.charAt(i11) == '+' || str.charAt(i11) == '-') && (i11 = i3 + 2) > length) {
            return false;
        }
        while (i11 <= length && ((str.charAt(i11) - '0') & 65535) < 10) {
            i11++;
        }
        if (i11 > length) {
            return z2;
        }
        if (i11 != length) {
            return false;
        }
        int iCharAt2 = str.charAt(i11) | ' ';
        if (iCharAt2 == 102 || iCharAt2 == 100) {
            return z2;
        }
        return false;
    }
}
