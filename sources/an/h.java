package an;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes4.dex */
public abstract class h extends p {
    public static int A0(CharSequence charSequence, String string, int i10) {
        int iS0 = (i10 & 2) != 0 ? s0(charSequence) : 0;
        kotlin.jvm.internal.n.f(charSequence, "<this>");
        kotlin.jvm.internal.n.f(string, "string");
        return !(charSequence instanceof String) ? u0(charSequence, string, iS0, 0, false, true) : ((String) charSequence).lastIndexOf(string, iS0);
    }

    public static int B0(String str, char c4, int i10, int i11) {
        if ((i11 & 2) != 0) {
            i10 = s0(str);
        }
        kotlin.jvm.internal.n.f(str, "<this>");
        return str.lastIndexOf(c4, i10);
    }

    public static String C0(String str, int i10, char c4) {
        CharSequence charSequenceSubSequence;
        kotlin.jvm.internal.n.f(str, "<this>");
        if (i10 < 0) {
            throw new IllegalArgumentException(defpackage.e.h(i10, "Desired length ", " is less than zero."));
        }
        if (i10 <= str.length()) {
            charSequenceSubSequence = str.subSequence(0, str.length());
        } else {
            StringBuilder sb2 = new StringBuilder(i10);
            int length = i10 - str.length();
            int i11 = 1;
            if (1 <= length) {
                while (true) {
                    sb2.append(c4);
                    if (i11 == length) {
                        break;
                    }
                    i11++;
                }
            }
            sb2.append((CharSequence) str);
            charSequenceSubSequence = sb2;
        }
        return charSequenceSubSequence.toString();
    }

    public static final boolean D0(CharSequence charSequence, int i10, CharSequence other, int i11, int i12, boolean z10) {
        kotlin.jvm.internal.n.f(charSequence, "<this>");
        kotlin.jvm.internal.n.f(other, "other");
        if (i11 < 0 || i10 < 0 || i10 > charSequence.length() - i12 || i11 > other.length() - i12) {
            return false;
        }
        for (int i13 = 0; i13 < i12; i13++) {
            if (!go.c.q(charSequence.charAt(i10 + i13), other.charAt(i11 + i13), z10)) {
                return false;
            }
        }
        return true;
    }

    public static String E0(String str, String prefix) {
        kotlin.jvm.internal.n.f(str, "<this>");
        kotlin.jvm.internal.n.f(prefix, "prefix");
        if (!L0(str, prefix)) {
            return str;
        }
        String strSubstring = str.substring(prefix.length());
        kotlin.jvm.internal.n.e(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static String F0(String str, String str2) {
        kotlin.jvm.internal.n.f(str, "<this>");
        if (!p.h0(str, str2, false)) {
            return str;
        }
        String strSubstring = str.substring(0, str.length() - str2.length());
        kotlin.jvm.internal.n.e(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static final void G0(int i10) {
        if (i10 < 0) {
            throw new IllegalArgumentException(l1.d.e(i10, "Limit must be non-negative, but was ").toString());
        }
    }

    public static final List H0(CharSequence charSequence, String str, int i10) {
        G0(i10);
        int iT0 = t0(charSequence, str, 0, false);
        if (iT0 == -1 || i10 == 1) {
            return j1.f.C(charSequence.toString());
        }
        boolean z10 = i10 > 0;
        int i11 = 10;
        if (z10 && i10 <= 10) {
            i11 = i10;
        }
        ArrayList arrayList = new ArrayList(i11);
        int length = 0;
        do {
            arrayList.add(charSequence.subSequence(length, iT0).toString());
            length = str.length() + iT0;
            if (z10 && arrayList.size() == i10 - 1) {
                break;
            }
            iT0 = t0(charSequence, str, length, false);
        } while (iT0 != -1);
        arrayList.add(charSequence.subSequence(length, charSequence.length()).toString());
        return arrayList;
    }

    public static List I0(CharSequence charSequence, String[] strArr, int i10, int i11) {
        if ((i11 & 4) != 0) {
            i10 = 0;
        }
        kotlin.jvm.internal.n.f(charSequence, "<this>");
        if (strArr.length == 1) {
            String str = strArr[0];
            if (str.length() != 0) {
                return H0(charSequence, str, i10);
            }
        }
        G0(i10);
        c<pk.c> cVar = new c(charSequence, i10, new q(xj.k.a0(strArr), 1));
        ArrayList arrayList = new ArrayList(xj.p.W(new xj.m(cVar, 2), 10));
        for (pk.c range : cVar) {
            kotlin.jvm.internal.n.f(range, "range");
            arrayList.add(charSequence.subSequence(range.f48393a, range.f48394b + 1).toString());
        }
        return arrayList;
    }

    public static List J0(String str, char[] cArr) {
        kotlin.jvm.internal.n.f(str, "<this>");
        if (cArr.length == 1) {
            return H0(str, String.valueOf(cArr[0]), 0);
        }
        G0(0);
        c<pk.c> cVar = new c(str, 0, new q(cArr, 0));
        ArrayList arrayList = new ArrayList(xj.p.W(new xj.m(cVar, 2), 10));
        for (pk.c range : cVar) {
            kotlin.jvm.internal.n.f(range, "range");
            arrayList.add(str.subSequence(range.f48393a, range.f48394b + 1).toString());
        }
        return arrayList;
    }

    public static boolean K0(String str, char c4) {
        return str.length() > 0 && go.c.q(str.charAt(0), c4, false);
    }

    public static boolean L0(String str, CharSequence prefix) {
        kotlin.jvm.internal.n.f(str, "<this>");
        kotlin.jvm.internal.n.f(prefix, "prefix");
        return prefix instanceof String ? p.p0(str, (String) prefix, false) : D0(str, 0, prefix, 0, prefix.length(), false);
    }

    public static String M0(String str, String delimiter, String str2) {
        kotlin.jvm.internal.n.f(delimiter, "delimiter");
        int iW0 = w0(str, delimiter, 0, false, 6);
        if (iW0 == -1) {
            return str2;
        }
        String strSubstring = str.substring(delimiter.length() + iW0, str.length());
        kotlin.jvm.internal.n.e(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static String N0(char c4, String str, String missingDelimiterValue) {
        kotlin.jvm.internal.n.f(str, "<this>");
        kotlin.jvm.internal.n.f(missingDelimiterValue, "missingDelimiterValue");
        int iB0 = B0(str, c4, 0, 6);
        if (iB0 == -1) {
            return missingDelimiterValue;
        }
        String strSubstring = str.substring(iB0 + 1, str.length());
        kotlin.jvm.internal.n.e(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static String O0(String missingDelimiterValue, String str) {
        kotlin.jvm.internal.n.f(missingDelimiterValue, "<this>");
        kotlin.jvm.internal.n.f(missingDelimiterValue, "missingDelimiterValue");
        int iA0 = A0(missingDelimiterValue, str, 6);
        if (iA0 == -1) {
            return missingDelimiterValue;
        }
        String strSubstring = missingDelimiterValue.substring(str.length() + iA0, missingDelimiterValue.length());
        kotlin.jvm.internal.n.e(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static String P0(String missingDelimiterValue, char c4) {
        kotlin.jvm.internal.n.f(missingDelimiterValue, "<this>");
        kotlin.jvm.internal.n.f(missingDelimiterValue, "missingDelimiterValue");
        int iV0 = v0(missingDelimiterValue, c4, 0, 6);
        if (iV0 == -1) {
            return missingDelimiterValue;
        }
        String strSubstring = missingDelimiterValue.substring(0, iV0);
        kotlin.jvm.internal.n.e(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static String Q0(String missingDelimiterValue, String str) {
        kotlin.jvm.internal.n.f(missingDelimiterValue, "<this>");
        kotlin.jvm.internal.n.f(missingDelimiterValue, "missingDelimiterValue");
        int iW0 = w0(missingDelimiterValue, str, 0, false, 6);
        if (iW0 == -1) {
            return missingDelimiterValue;
        }
        String strSubstring = missingDelimiterValue.substring(0, iW0);
        kotlin.jvm.internal.n.e(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static String R0(String str, String str2, String missingDelimiterValue) {
        kotlin.jvm.internal.n.f(str, "<this>");
        kotlin.jvm.internal.n.f(missingDelimiterValue, "missingDelimiterValue");
        int iA0 = A0(str, str2, 6);
        if (iA0 == -1) {
            return missingDelimiterValue;
        }
        String strSubstring = str.substring(0, iA0);
        kotlin.jvm.internal.n.e(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static String S0(int i10, String str) {
        kotlin.jvm.internal.n.f(str, "<this>");
        if (i10 < 0) {
            throw new IllegalArgumentException(defpackage.e.h(i10, "Requested character count ", " is less than zero.").toString());
        }
        int length = str.length();
        if (i10 > length) {
            i10 = length;
        }
        String strSubstring = str.substring(0, i10);
        kotlin.jvm.internal.n.e(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static CharSequence T0(CharSequence charSequence) {
        kotlin.jvm.internal.n.f(charSequence, "<this>");
        int length = charSequence.length() - 1;
        int i10 = 0;
        boolean z10 = false;
        while (i10 <= length) {
            boolean zX = go.c.x(charSequence.charAt(!z10 ? i10 : length));
            if (z10) {
                if (!zX) {
                    break;
                }
                length--;
            } else if (zX) {
                i10++;
            } else {
                z10 = true;
            }
        }
        return charSequence.subSequence(i10, length + 1);
    }

    public static String U0(String str, char... cArr) {
        kotlin.jvm.internal.n.f(str, "<this>");
        int length = str.length() - 1;
        int i10 = 0;
        boolean z10 = false;
        while (i10 <= length) {
            char cCharAt = str.charAt(!z10 ? i10 : length);
            int length2 = cArr.length;
            int i11 = 0;
            while (true) {
                if (i11 >= length2) {
                    i11 = -1;
                    break;
                }
                if (cCharAt == cArr[i11]) {
                    break;
                }
                i11++;
            }
            boolean z11 = i11 >= 0;
            if (z10) {
                if (!z11) {
                    break;
                }
                length--;
            } else if (z11) {
                i10++;
            } else {
                z10 = true;
            }
        }
        return str.subSequence(i10, length + 1).toString();
    }

    public static boolean q0(CharSequence charSequence, CharSequence other, boolean z10) {
        kotlin.jvm.internal.n.f(charSequence, "<this>");
        kotlin.jvm.internal.n.f(other, "other");
        if (other instanceof String) {
            if (w0(charSequence, (String) other, 0, z10, 2) >= 0) {
                return true;
            }
        } else if (u0(charSequence, other, 0, charSequence.length(), z10, false) >= 0) {
            return true;
        }
        return false;
    }

    public static boolean r0(CharSequence charSequence, char c4) {
        kotlin.jvm.internal.n.f(charSequence, "<this>");
        return v0(charSequence, c4, 0, 2) >= 0;
    }

    public static int s0(CharSequence charSequence) {
        kotlin.jvm.internal.n.f(charSequence, "<this>");
        return charSequence.length() - 1;
    }

    public static final int t0(CharSequence charSequence, String string, int i10, boolean z10) {
        kotlin.jvm.internal.n.f(charSequence, "<this>");
        kotlin.jvm.internal.n.f(string, "string");
        return (z10 || !(charSequence instanceof String)) ? u0(charSequence, string, i10, charSequence.length(), z10, false) : ((String) charSequence).indexOf(string, i10);
    }

    public static final int u0(CharSequence charSequence, CharSequence charSequence2, int i10, int i11, boolean z10, boolean z11) {
        pk.a aVar;
        CharSequence charSequence3 = charSequence2;
        int i12 = i10;
        int i13 = i11;
        if (z11) {
            int iS0 = s0(charSequence);
            if (i12 > iS0) {
                i12 = iS0;
            }
            if (i13 < 0) {
                i13 = 0;
            }
            aVar = new pk.a(i12, i13, -1);
        } else {
            if (i12 < 0) {
                i12 = 0;
            }
            int length = charSequence.length();
            if (i13 > length) {
                i13 = length;
            }
            aVar = new pk.c(i12, i13, 1);
        }
        boolean z12 = charSequence instanceof String;
        int i14 = aVar.f48395c;
        int i15 = aVar.f48394b;
        int i16 = aVar.f48393a;
        if (z12 && (charSequence3 instanceof String)) {
            if ((i14 > 0 && i16 <= i15) || (i14 < 0 && i15 <= i16)) {
                int i17 = i16;
                while (true) {
                    String str = (String) charSequence3;
                    if (p.k0(str, 0, (String) charSequence, i17, str.length(), z10)) {
                        return i17;
                    }
                    if (i17 != i15) {
                        i17 += i14;
                    }
                }
            }
        } else if ((i14 > 0 && i16 <= i15) || (i14 < 0 && i15 <= i16)) {
            int i18 = i16;
            while (!D0(charSequence3, 0, charSequence, i18, charSequence3.length(), z10)) {
                if (i18 != i15) {
                    i18 += i14;
                    charSequence3 = charSequence2;
                }
            }
            return i18;
        }
        return -1;
    }

    public static int v0(CharSequence charSequence, char c4, int i10, int i11) {
        if ((i11 & 2) != 0) {
            i10 = 0;
        }
        kotlin.jvm.internal.n.f(charSequence, "<this>");
        return !(charSequence instanceof String) ? x0(charSequence, new char[]{c4}, i10, false) : ((String) charSequence).indexOf(c4, i10);
    }

    public static /* synthetic */ int w0(CharSequence charSequence, String str, int i10, boolean z10, int i11) {
        if ((i11 & 2) != 0) {
            i10 = 0;
        }
        if ((i11 & 4) != 0) {
            z10 = false;
        }
        return t0(charSequence, str, i10, z10);
    }

    public static final int x0(CharSequence charSequence, char[] cArr, int i10, boolean z10) {
        kotlin.jvm.internal.n.f(charSequence, "<this>");
        if (!z10 && cArr.length == 1 && (charSequence instanceof String)) {
            int length = cArr.length;
            if (length == 0) {
                throw new NoSuchElementException("Array is empty.");
            }
            if (length != 1) {
                throw new IllegalArgumentException("Array has more than one element.");
            }
            return ((String) charSequence).indexOf(cArr[0], i10);
        }
        if (i10 < 0) {
            i10 = 0;
        }
        int iS0 = s0(charSequence);
        if (i10 > iS0) {
            return -1;
        }
        while (true) {
            char cCharAt = charSequence.charAt(i10);
            for (char c4 : cArr) {
                if (go.c.q(c4, cCharAt, z10)) {
                    return i10;
                }
            }
            if (i10 == iS0) {
                return -1;
            }
            i10++;
        }
    }

    public static boolean y0(CharSequence charSequence) {
        kotlin.jvm.internal.n.f(charSequence, "<this>");
        for (int i10 = 0; i10 < charSequence.length(); i10++) {
            if (!go.c.x(charSequence.charAt(i10))) {
                return false;
            }
        }
        return true;
    }

    public static char z0(CharSequence charSequence) {
        if (charSequence.length() != 0) {
            return charSequence.charAt(s0(charSequence));
        }
        throw new NoSuchElementException("Char sequence is empty.");
    }
}
