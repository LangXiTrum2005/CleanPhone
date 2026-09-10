package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.ba0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC3089ba0 extends Z90 {
    public static C4874vo A0(CharSequence charSequence, String[] strArr, boolean z, int i) {
        I0(i);
        return new C4874vo(charSequence, 0, i, new C3000aa0(1, U5.h0(strArr), z));
    }

    public static boolean B0(String str, int i, String str2, int i2, int i3, boolean z) {
        AbstractC2995aW.q(str, "<this>");
        AbstractC2995aW.q(str2, "other");
        return !z ? str.regionMatches(i, str2, i2, i3) : str.regionMatches(z, i, str2, i2, i3);
    }

    public static final boolean C0(CharSequence charSequence, int i, CharSequence charSequence2, int i2, int i3, boolean z) {
        AbstractC2995aW.q(charSequence, "<this>");
        AbstractC2995aW.q(charSequence2, "other");
        if (i2 < 0 || i < 0 || i > charSequence.length() - i3 || i2 > charSequence2.length() - i3) {
            return false;
        }
        for (int i4 = 0; i4 < i3; i4++) {
            if (!WD.q(charSequence.charAt(i + i4), charSequence2.charAt(i2 + i4), z)) {
                return false;
            }
        }
        return true;
    }

    public static String D0(String str, String str2) {
        if (!N0(str2, str, false)) {
            return str2;
        }
        String strSubstring = str2.substring(str.length());
        AbstractC2995aW.p(strSubstring, "this as java.lang.String).substring(startIndex)");
        return strSubstring;
    }

    public static String E0(String str, String str2) {
        AbstractC2995aW.q(str2, "<this>");
        if (!str2.endsWith(str)) {
            return str2;
        }
        String strSubstring = str2.substring(0, str2.length() - str.length());
        AbstractC2995aW.p(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }

    public static String F0(String str, int i) {
        if (i < 0) {
            throw new IllegalArgumentException(("Count 'n' must be non-negative, but was " + i + '.').toString());
        }
        if (i == 0) {
            return "";
        }
        if (i == 1) {
            return str.toString();
        }
        int length = str.length();
        if (length == 0) {
            return "";
        }
        if (length == 1) {
            char cCharAt = str.charAt(0);
            char[] cArr = new char[i];
            for (int i2 = 0; i2 < i; i2++) {
                cArr[i2] = cCharAt;
            }
            return new String(cArr);
        }
        StringBuilder sb = new StringBuilder(str.length() * i);
        C5087yD it = new C5175zD(1, i, 1).iterator();
        while (it.c) {
            it.nextInt();
            sb.append((CharSequence) str);
        }
        String string = sb.toString();
        AbstractC2995aW.p(string, "{\n                    va…tring()\n                }");
        return string;
    }

    public static String G0(String str, char c, char c2) {
        AbstractC2995aW.q(str, "<this>");
        String strReplace = str.replace(c, c2);
        AbstractC2995aW.p(strReplace, "this as java.lang.String…replace(oldChar, newChar)");
        return strReplace;
    }

    public static String H0(String str, String str2, String str3) {
        AbstractC2995aW.q(str, "<this>");
        AbstractC2995aW.q(str2, "oldValue");
        int iQ0 = q0(0, str, str2, false);
        if (iQ0 < 0) {
            return str;
        }
        int length = str2.length();
        int i = length >= 1 ? length : 1;
        int length2 = str3.length() + (str.length() - length);
        if (length2 < 0) {
            throw new OutOfMemoryError();
        }
        StringBuilder sb = new StringBuilder(length2);
        int i2 = 0;
        do {
            sb.append((CharSequence) str, i2, iQ0);
            sb.append(str3);
            i2 = iQ0 + length;
            if (iQ0 >= str.length()) {
                break;
            }
            iQ0 = q0(iQ0 + i, str, str2, false);
        } while (iQ0 > 0);
        sb.append((CharSequence) str, i2, str.length());
        String string = sb.toString();
        AbstractC2995aW.p(string, "stringBuilder.append(this, i, length).toString()");
        return string;
    }

    public static final void I0(int i) {
        if (i < 0) {
            throw new IllegalArgumentException(AbstractC3950lJ.p("Limit must be non-negative, but was ", i).toString());
        }
    }

    public static final List J0(int i, CharSequence charSequence, String str, boolean z) {
        I0(i);
        int length = 0;
        int iQ0 = q0(0, charSequence, str, z);
        if (iQ0 == -1 || i == 1) {
            return AbstractC2340Cl.J(charSequence.toString());
        }
        boolean z2 = i > 0;
        int i2 = 10;
        if (z2 && i <= 10) {
            i2 = i;
        }
        ArrayList arrayList = new ArrayList(i2);
        do {
            arrayList.add(charSequence.subSequence(length, iQ0).toString());
            length = str.length() + iQ0;
            if (z2 && arrayList.size() == i - 1) {
                break;
            }
            iQ0 = q0(length, charSequence, str, z);
        } while (iQ0 != -1);
        arrayList.add(charSequence.subSequence(length, charSequence.length()).toString());
        return arrayList;
    }

    public static List K0(CharSequence charSequence, char[] cArr) {
        AbstractC2995aW.q(charSequence, "<this>");
        int i = 0;
        byte b = 0;
        if (cArr.length == 1) {
            return J0(0, charSequence, String.valueOf(cArr[0]), false);
        }
        I0(0);
        C3242dD c3242dD = new C3242dD(new C4874vo(charSequence, 0, 0, new C3000aa0(i, cArr, b == true ? 1 : 0)));
        ArrayList arrayList = new ArrayList(AbstractC2749Sf.Y(10, c3242dD));
        Iterator it = c3242dD.iterator();
        while (it.hasNext()) {
            arrayList.add(P0(charSequence, (C5175zD) it.next()));
        }
        return arrayList;
    }

    public static List L0(CharSequence charSequence, String[] strArr) {
        AbstractC2995aW.q(charSequence, "<this>");
        if (strArr.length == 1) {
            String str = strArr[0];
            if (str.length() != 0) {
                return J0(0, charSequence, str, false);
            }
        }
        C3242dD c3242dD = new C3242dD(A0(charSequence, strArr, false, 0));
        ArrayList arrayList = new ArrayList(AbstractC2749Sf.Y(10, c3242dD));
        Iterator it = c3242dD.iterator();
        while (it.hasNext()) {
            arrayList.add(P0(charSequence, (C5175zD) it.next()));
        }
        return arrayList;
    }

    public static boolean M0(String str, String str2, int i, boolean z) {
        AbstractC2995aW.q(str, "<this>");
        return !z ? str.startsWith(str2, i) : B0(str, i, str2, 0, str2.length(), z);
    }

    public static boolean N0(String str, String str2, boolean z) {
        AbstractC2995aW.q(str, "<this>");
        AbstractC2995aW.q(str2, "prefix");
        return !z ? str.startsWith(str2) : B0(str, 0, str2, 0, str2.length(), z);
    }

    public static boolean O0(CharSequence charSequence, char c) {
        AbstractC2995aW.q(charSequence, "<this>");
        return charSequence.length() > 0 && WD.q(charSequence.charAt(0), c, false);
    }

    public static final String P0(CharSequence charSequence, C5175zD c5175zD) {
        AbstractC2995aW.q(charSequence, "<this>");
        AbstractC2995aW.q(c5175zD, "range");
        return charSequence.subSequence(c5175zD.f5212a, c5175zD.b + 1).toString();
    }

    public static String Q0(String str, String str2) {
        AbstractC2995aW.q(str2, "delimiter");
        int iT0 = t0(str, str2, 0, false, 6);
        if (iT0 == -1) {
            return str;
        }
        String strSubstring = str.substring(str2.length() + iT0, str.length());
        AbstractC2995aW.p(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }

    public static String R0(String str) {
        AbstractC2995aW.q(str, "<this>");
        AbstractC2995aW.q(str, "missingDelimiterValue");
        int iX0 = x0(str, "/", 6);
        if (iX0 == -1) {
            return str;
        }
        String strSubstring = str.substring(1 + iX0, str.length());
        AbstractC2995aW.p(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }

    public static String S0(String str, char c) {
        AbstractC2995aW.q(str, "<this>");
        AbstractC2995aW.q(str, "missingDelimiterValue");
        int iW0 = w0(str, c, 0, 6);
        if (iW0 == -1) {
            return str;
        }
        String strSubstring = str.substring(iW0 + 1, str.length());
        AbstractC2995aW.p(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }

    public static String T0(String str, String str2) {
        int iT0 = t0(str, str2, 0, false, 6);
        if (iT0 == -1) {
            return str;
        }
        String strSubstring = str.substring(0, iT0);
        AbstractC2995aW.p(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }

    public static String U0(String str, String str2) {
        AbstractC2995aW.q(str, "<this>");
        AbstractC2995aW.q(str, "missingDelimiterValue");
        int iX0 = x0(str, str2, 6);
        if (iX0 == -1) {
            return str;
        }
        String strSubstring = str.substring(0, iX0);
        AbstractC2995aW.p(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }

    public static CharSequence V0(CharSequence charSequence) {
        AbstractC2995aW.q(charSequence, "<this>");
        int length = charSequence.length() - 1;
        int i = 0;
        boolean z = false;
        while (i <= length) {
            boolean zA = WD.A(charSequence.charAt(!z ? i : length));
            if (z) {
                if (!zA) {
                    break;
                }
                length--;
            } else if (zA) {
                i++;
            } else {
                z = true;
            }
        }
        return charSequence.subSequence(i, length + 1);
    }

    public static String W0(String str, char... cArr) {
        boolean z;
        AbstractC2995aW.q(str, "<this>");
        int length = str.length() - 1;
        int i = 0;
        boolean z2 = false;
        while (i <= length) {
            char cCharAt = str.charAt(!z2 ? i : length);
            int length2 = cArr.length;
            int i2 = 0;
            while (true) {
                if (i2 < length2) {
                    if (cCharAt != cArr[i2]) {
                        i2++;
                    } else if (i2 >= 0) {
                        z = true;
                        break;
                    }
                }
                z = false;
                break;
            }
            if (z2) {
                if (!z) {
                    break;
                }
                length--;
            } else if (z) {
                i++;
            } else {
                z2 = true;
            }
        }
        return str.subSequence(i, length + 1).toString();
    }

    public static boolean k0(CharSequence charSequence, char c) {
        return s0(charSequence, c, 0, false, 2) >= 0;
    }

    public static boolean l0(CharSequence charSequence, String str) {
        AbstractC2995aW.q(charSequence, "<this>");
        AbstractC2995aW.q(str, "other");
        return t0(charSequence, str, 0, false, 2) >= 0;
    }

    public static boolean m0(String str, char c) {
        return str.length() > 0 && WD.q(str.charAt(p0(str)), c, false);
    }

    public static boolean n0(String str, String str2) {
        AbstractC2995aW.q(str, "<this>");
        return str.endsWith(str2);
    }

    public static boolean o0(String str, String str2) {
        if (str == null) {
            return str2 == null;
        }
        return str.equalsIgnoreCase(str2);
    }

    public static int p0(CharSequence charSequence) {
        AbstractC2995aW.q(charSequence, "<this>");
        return charSequence.length() - 1;
    }

    public static final int q0(int i, CharSequence charSequence, String str, boolean z) {
        AbstractC2995aW.q(charSequence, "<this>");
        AbstractC2995aW.q(str, TypedValues.Custom.S_STRING);
        return (z || !(charSequence instanceof String)) ? r0(charSequence, str, i, charSequence.length(), z, false) : ((String) charSequence).indexOf(str, i);
    }

    public static final int r0(CharSequence charSequence, CharSequence charSequence2, int i, int i2, boolean z, boolean z2) {
        C4999xD c4999xD;
        if (z2) {
            int iP0 = p0(charSequence);
            if (i > iP0) {
                i = iP0;
            }
            if (i2 < 0) {
                i2 = 0;
            }
            c4999xD = new C4999xD(i, i2, -1);
        } else {
            if (i < 0) {
                i = 0;
            }
            int length = charSequence.length();
            if (i2 > length) {
                i2 = length;
            }
            c4999xD = new C5175zD(i, i2, 1);
        }
        boolean z3 = charSequence instanceof String;
        int i3 = c4999xD.c;
        int i4 = c4999xD.b;
        int i5 = c4999xD.f5212a;
        if (z3 && (charSequence2 instanceof String)) {
            if ((i3 > 0 && i5 <= i4) || (i3 < 0 && i4 <= i5)) {
                while (!B0((String) charSequence2, 0, (String) charSequence, i5, charSequence2.length(), z)) {
                    if (i5 != i4) {
                        i5 += i3;
                    }
                }
                return i5;
            }
        } else if ((i3 > 0 && i5 <= i4) || (i3 < 0 && i4 <= i5)) {
            while (!C0(charSequence2, 0, charSequence, i5, charSequence2.length(), z)) {
                if (i5 != i4) {
                    i5 += i3;
                }
            }
            return i5;
        }
        return -1;
    }

    public static int s0(CharSequence charSequence, char c, int i, boolean z, int i2) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        AbstractC2995aW.q(charSequence, "<this>");
        return (z || !(charSequence instanceof String)) ? u0(i, charSequence, z, new char[]{c}) : ((String) charSequence).indexOf(c, i);
    }

    public static /* synthetic */ int t0(CharSequence charSequence, String str, int i, boolean z, int i2) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        return q0(i, charSequence, str, z);
    }

    public static final int u0(int i, CharSequence charSequence, boolean z, char[] cArr) {
        AbstractC2995aW.q(charSequence, "<this>");
        AbstractC2995aW.q(cArr, "chars");
        if (!z && cArr.length == 1 && (charSequence instanceof String)) {
            return ((String) charSequence).indexOf(U5.y0(cArr), i);
        }
        if (i < 0) {
            i = 0;
        }
        C5087yD it = new C5175zD(i, p0(charSequence), 1).iterator();
        while (it.c) {
            int iNextInt = it.nextInt();
            char cCharAt = charSequence.charAt(iNextInt);
            for (char c : cArr) {
                if (WD.q(c, cCharAt, z)) {
                    return iNextInt;
                }
            }
        }
        return -1;
    }

    public static boolean v0(CharSequence charSequence) {
        AbstractC2995aW.q(charSequence, "<this>");
        if (charSequence.length() == 0) {
            return true;
        }
        Iterable c5175zD = new C5175zD(0, charSequence.length() - 1, 1);
        if ((c5175zD instanceof Collection) && ((Collection) c5175zD).isEmpty()) {
            return true;
        }
        Iterator it = c5175zD.iterator();
        while (it.hasNext()) {
            if (!WD.A(charSequence.charAt(((AbstractC4823vD) it).nextInt()))) {
                return false;
            }
        }
        return true;
    }

    public static int w0(CharSequence charSequence, char c, int i, int i2) {
        if ((i2 & 2) != 0) {
            i = p0(charSequence);
        }
        AbstractC2995aW.q(charSequence, "<this>");
        if (charSequence instanceof String) {
            return ((String) charSequence).lastIndexOf(c, i);
        }
        char[] cArr = {c};
        if (charSequence instanceof String) {
            return ((String) charSequence).lastIndexOf(U5.y0(cArr), i);
        }
        int iP0 = p0(charSequence);
        if (i > iP0) {
            i = iP0;
        }
        while (-1 < i) {
            if (WD.q(cArr[0], charSequence.charAt(i), false)) {
                return i;
            }
            i--;
        }
        return -1;
    }

    public static int x0(CharSequence charSequence, String str, int i) {
        int iP0 = (i & 2) != 0 ? p0(charSequence) : 0;
        AbstractC2995aW.q(charSequence, "<this>");
        AbstractC2995aW.q(str, TypedValues.Custom.S_STRING);
        return !(charSequence instanceof String) ? r0(charSequence, str, iP0, 0, false, true) : ((String) charSequence).lastIndexOf(str, iP0);
    }

    public static Ld0 y0(CharSequence charSequence) {
        AbstractC2995aW.q(charSequence, "<this>");
        return AbstractC5073y40.M0(A0(charSequence, new String[]{"\r\n", "\n", "\r"}, false, 0), new C4140nX(charSequence, 8));
    }

    public static String z0(String str, int i) {
        CharSequence charSequenceSubSequence;
        AbstractC2995aW.q(str, "<this>");
        if (i < 0) {
            throw new IllegalArgumentException(AbstractC5044xl.g("Desired length ", i, " is less than zero."));
        }
        if (i <= str.length()) {
            charSequenceSubSequence = str.subSequence(0, str.length());
        } else {
            StringBuilder sb = new StringBuilder(i);
            C5087yD it = new C5175zD(1, i - str.length(), 1).iterator();
            while (it.c) {
                it.nextInt();
                sb.append('0');
            }
            sb.append((CharSequence) str);
            charSequenceSubSequence = sb;
        }
        return charSequenceSubSequence.toString();
    }
}
