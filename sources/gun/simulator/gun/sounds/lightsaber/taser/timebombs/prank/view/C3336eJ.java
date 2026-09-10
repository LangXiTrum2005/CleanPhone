package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.os.Build;
import androidx.webkit.ProxyConfig;
import com.badlogic.gdx.net.HttpResponseHeader;
import com.mbridge.msdk.foundation.tools.SameMD5;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.GregorianCalendar;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.TreeSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.net.ssl.SSLSocket;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.eJ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3336eJ implements InterfaceC4353pt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4315a;

    public /* synthetic */ C3336eJ(int i) {
        this.f4315a = i;
    }

    public static final C2800Ue b(C3336eJ c3336eJ, String str) {
        C2800Ue c2800Ue = new C2800Ue(str);
        C2800Ue.d.put(str, c2800Ue);
        return c2800Ue;
    }

    public static String d(String str, int i, int i2, String str2, boolean z, boolean z2, boolean z3, boolean z4, int i3) {
        char[] cArr = ZA.k;
        int i4 = (i3 & 1) != 0 ? 0 : i;
        int length = (i3 & 2) != 0 ? str.length() : i2;
        boolean z5 = (i3 & 8) != 0 ? false : z;
        boolean z6 = (i3 & 16) != 0 ? false : z2;
        boolean z7 = (i3 & 32) != 0 ? false : z3;
        boolean z8 = (i3 & 64) == 0 ? z4 : false;
        AbstractC2995aW.q(str, "<this>");
        int iCharCount = i4;
        while (iCharCount < length) {
            int iCodePointAt = str.codePointAt(iCharCount);
            int i5 = 32;
            int i6 = 128;
            if (iCodePointAt < 32 || iCodePointAt == 127 || ((iCodePointAt >= 128 && !z8) || AbstractC3089ba0.k0(str2, (char) iCodePointAt) || ((iCodePointAt == 37 && (!z5 || (z6 && !m(iCharCount, length, str)))) || (iCodePointAt == 43 && z7)))) {
                C4848vb c4848vb = new C4848vb();
                c4848vb.X(i4, iCharCount, str);
                C4848vb c4848vb2 = null;
                while (iCharCount < length) {
                    int iCodePointAt2 = str.codePointAt(iCharCount);
                    if (!z5 || (iCodePointAt2 != 9 && iCodePointAt2 != 10 && iCodePointAt2 != 12 && iCodePointAt2 != 13)) {
                        if (iCodePointAt2 == 43 && z7) {
                            c4848vb.Y(z5 ? "+" : "%2B");
                        } else if (iCodePointAt2 < i5 || iCodePointAt2 == 127 || ((iCodePointAt2 >= i6 && !z8) || AbstractC3089ba0.k0(str2, (char) iCodePointAt2) || (iCodePointAt2 == 37 && (!z5 || (z6 && !m(iCharCount, length, str)))))) {
                            if (c4848vb2 == null) {
                                c4848vb2 = new C4848vb();
                            }
                            c4848vb2.Z(iCodePointAt2);
                            while (!c4848vb2.K()) {
                                byte b = c4848vb2.readByte();
                                c4848vb.R(37);
                                char[] cArr2 = ZA.k;
                                c4848vb.R(cArr2[((b & 255) >> 4) & 15]);
                                c4848vb.R(cArr2[b & com.umeng.analytics.pro.cw.m]);
                            }
                        } else {
                            c4848vb.Z(iCodePointAt2);
                        }
                    }
                    iCharCount += Character.charCount(iCodePointAt2);
                    i5 = 32;
                    i6 = 128;
                }
                return c4848vb.t();
            }
            iCharCount += Character.charCount(iCodePointAt);
        }
        String strSubstring = str.substring(i4, length);
        AbstractC2995aW.p(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }

    public static void e(String str) {
        if (str.length() <= 0) {
            throw new IllegalArgumentException("name is empty".toString());
        }
        int length = str.length();
        int i = 0;
        while (i < length) {
            int i2 = i + 1;
            char cCharAt = str.charAt(i);
            if ('!' > cCharAt || cCharAt >= 127) {
                throw new IllegalArgumentException(Vg0.h("Unexpected char %#04x at %d in header name: %s", Integer.valueOf(cCharAt), Integer.valueOf(i), str).toString());
            }
            i = i2;
        }
    }

    public static void f(String str, String str2) {
        int length = str.length();
        int i = 0;
        while (i < length) {
            int i2 = i + 1;
            char cCharAt = str.charAt(i);
            if (cCharAt != '\t' && (' ' > cCharAt || cCharAt >= 127)) {
                throw new IllegalArgumentException(AbstractC2995aW.v0(Vg0.p(str2) ? "" : AbstractC2995aW.v0(str, ": "), Vg0.h("Unexpected char %#04x at %d in %s value", Integer.valueOf(cCharAt), Integer.valueOf(i), str2)).toString());
            }
            i = i2;
        }
    }

    public static int g(int i, int i2, String str, boolean z) {
        while (i < i2) {
            int i3 = i + 1;
            char cCharAt = str.charAt(i);
            if (((cCharAt < ' ' && cCharAt != '\t') || cCharAt >= 127 || (cCharAt <= '9' && '0' <= cCharAt) || ((cCharAt <= 'z' && 'a' <= cCharAt) || ((cCharAt <= 'Z' && 'A' <= cCharAt) || cCharAt == ':'))) == (!z)) {
                return i;
            }
            i = i3;
        }
        return i2;
    }

    public static int h(String str) {
        AbstractC2995aW.q(str, "scheme");
        if (AbstractC2995aW.i(str, ProxyConfig.MATCH_HTTP)) {
            return 80;
        }
        return AbstractC2995aW.i(str, "https") ? 443 : -1;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static Oc0 j(String str) {
        AbstractC2995aW.q(str, "javaName");
        int iHashCode = str.hashCode();
        if (iHashCode != 79201641) {
            if (iHashCode != 79923350) {
                switch (iHashCode) {
                    case -503070503:
                        if (str.equals("TLSv1.1")) {
                            return Oc0.TLS_1_1;
                        }
                        break;
                    case -503070502:
                        if (str.equals("TLSv1.2")) {
                            return Oc0.TLS_1_2;
                        }
                        break;
                    case -503070501:
                        if (str.equals("TLSv1.3")) {
                            return Oc0.TLS_1_3;
                        }
                        break;
                }
            } else if (str.equals("TLSv1")) {
                return Oc0.TLS_1_0;
            }
        } else if (str.equals("SSLv3")) {
            return Oc0.SSL_3_0;
        }
        throw new IllegalArgumentException(AbstractC2995aW.v0(str, "Unexpected TLS version: "));
    }

    public static ZA k(String str) {
        AbstractC2995aW.q(str, "<this>");
        YA ya = new YA();
        ya.b(null, str);
        return ya.a();
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0039  */
    public static boolean l(HY hy, C5021xZ c5021xZ) {
        AbstractC2995aW.q(c5021xZ, "response");
        AbstractC2995aW.q(hy, J0.REQUEST_KEY_EXTRA);
        int i = c5021xZ.d;
        if (i != 200 && i != 410 && i != 414 && i != 501 && i != 203 && i != 204) {
            if (i == 307) {
                if (C5021xZ.i(c5021xZ, HttpResponseHeader.Expires) == null && c5021xZ.h().c == -1 && !c5021xZ.h().f && !c5021xZ.h().e) {
                    return false;
                }
            } else if (i != 308 && i != 404 && i != 405) {
                switch (i) {
                    case 300:
                    case 301:
                        break;
                    case 302:
                        if (C5021xZ.i(c5021xZ, HttpResponseHeader.Expires) == null) {
                            return false;
                        }
                        break;
                    default:
                        return false;
                }
            }
        }
        if (c5021xZ.h().b) {
            return false;
        }
        C4938wc c4938wcQ = hy.f;
        if (c4938wcQ == null) {
            int i2 = C4938wc.n;
            c4938wcQ = q(hy.c);
            hy.f = c4938wcQ;
        }
        return !c4938wcQ.b;
    }

    public static boolean m(int i, int i2, String str) {
        int i3 = i + 2;
        return i3 < i2 && str.charAt(i) == '%' && Vg0.q(str.charAt(i + 1)) != -1 && Vg0.q(str.charAt(i3)) != -1;
    }

    public static String o(ZA za) {
        AbstractC2995aW.q(za, "url");
        C3971lc c3971lc = C3971lc.d;
        return G7.x(za.i).b(SameMD5.TAG).d();
    }

    public static C4447qz p(String... strArr) {
        if (strArr.length % 2 != 0) {
            throw new IllegalArgumentException("Expected alternating header names and values".toString());
        }
        String[] strArr2 = (String[]) strArr.clone();
        int length = strArr2.length;
        int i = 0;
        int i2 = 0;
        while (i2 < length) {
            int i3 = i2 + 1;
            String str = strArr2[i2];
            if (str == null) {
                throw new IllegalArgumentException("Headers cannot be null".toString());
            }
            strArr2[i2] = AbstractC3089ba0.V0(str).toString();
            i2 = i3;
        }
        int iM = AbstractC2995aW.M(0, strArr2.length - 1, 2);
        if (iM >= 0) {
            while (true) {
                int i4 = i + 2;
                String str2 = strArr2[i];
                String str3 = strArr2[i + 1];
                e(str2);
                f(str3, str2);
                if (i == iM) {
                    break;
                }
                i = i4;
            }
        }
        return new C4447qz(strArr2);
    }

    /* JADX WARN: Code duplicated, block: B:100:0x013e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:101:0x0136 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:102:0x0168 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:103:0x0178 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:104:0x0188 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:105:0x01b7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:106:0x01c8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:107:0x01d9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:108:0x0146 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:109:0x015b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:110:0x0198 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:111:0x01a8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:112:0x014b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:113:0x01d1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:114:0x01c0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:115:0x0190 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:116:0x0180 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:117:0x0170 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:128:0x0064 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:129:0x0068 A[EDGE_INSN: B:129:0x0068->B:22:0x0068 BREAK  A[LOOP:2: B:16:0x004e->B:20:0x005f], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:15:0x0049  */
    /* JADX WARN: Code duplicated, block: B:17:0x0050  */
    /* JADX WARN: Code duplicated, block: B:20:0x005f A[LOOP:2: B:16:0x004e->B:20:0x005f, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:28:0x008f  */
    /* JADX WARN: Code duplicated, block: B:62:0x0152  */
    /* JADX WARN: Code duplicated, block: B:65:0x0160  */
    /* JADX WARN: Code duplicated, block: B:77:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:80:0x01ae  */
    /* JADX WARN: Code duplicated, block: B:98:0x012e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:99:0x0126 A[SYNTHETIC] */
    public static C4938wc q(C4447qz c4447qz) {
        int i;
        int length;
        int length2;
        String string;
        String string2;
        int i2;
        C4447qz c4447qz2 = c4447qz;
        AbstractC2995aW.q(c4447qz2, "headers");
        int size = c4447qz.size();
        int i3 = 0;
        boolean z = true;
        String str = null;
        boolean z2 = false;
        boolean z3 = false;
        int iX = -1;
        int iX2 = -1;
        boolean z4 = false;
        boolean z5 = false;
        boolean z6 = false;
        int iX3 = -1;
        int iX4 = -1;
        boolean z7 = false;
        boolean z8 = false;
        boolean z9 = false;
        while (i3 < size) {
            int i4 = i3 + 1;
            String strB = c4447qz2.b(i3);
            String strE = c4447qz2.e(i3);
            if (AbstractC3089ba0.o0(strB, "Cache-Control")) {
                if (str == null) {
                    str = strE;
                }
                i = 0;
                while (i < strE.length()) {
                    length = strE.length();
                    length2 = i;
                    while (true) {
                        if (length2 < length) {
                            length2 = strE.length();
                            break;
                        }
                        i2 = length2 + 1;
                        if (AbstractC3089ba0.k0("=,;", strE.charAt(length2))) {
                            break;
                        }
                        length2 = i2;
                    }
                    String strSubstring = strE.substring(i, length2);
                    AbstractC2995aW.p(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                    string = AbstractC3089ba0.V0(strSubstring).toString();
                    if (length2 != strE.length() || strE.charAt(length2) == ',' || strE.charAt(length2) == ';') {
                        size = size;
                        i = length2 + 1;
                        string2 = null;
                    } else {
                        int length3 = length2 + 1;
                        byte[] bArr = Vg0.f3884a;
                        int length4 = strE.length();
                        while (true) {
                            if (length3 >= length4) {
                                size = size;
                                length3 = strE.length();
                                break;
                            }
                            int i5 = length3 + 1;
                            size = size;
                            char cCharAt = strE.charAt(length3);
                            int i6 = length4;
                            if (cCharAt != ' ' && cCharAt != '\t') {
                                break;
                            }
                            length3 = i5;
                            size = size;
                            length4 = i6;
                        }
                        if (length3 >= strE.length() || strE.charAt(length3) != '\"') {
                            int length5 = strE.length();
                            int length6 = length3;
                            while (true) {
                                if (length6 >= length5) {
                                    length6 = strE.length();
                                    break;
                                }
                                int i7 = length6 + 1;
                                int i8 = length5;
                                if (AbstractC3089ba0.k0(",;", strE.charAt(length6))) {
                                    break;
                                }
                                length6 = i7;
                                length5 = i8;
                            }
                            String strSubstring2 = strE.substring(length3, length6);
                            AbstractC2995aW.p(strSubstring2, "this as java.lang.String…ing(startIndex, endIndex)");
                            int i9 = length6;
                            string2 = AbstractC3089ba0.V0(strSubstring2).toString();
                            i = i9;
                        } else {
                            int i10 = length3 + 1;
                            int iS0 = AbstractC3089ba0.s0(strE, '\"', i10, false, 4);
                            string2 = strE.substring(i10, iS0);
                            AbstractC2995aW.p(string2, "this as java.lang.String…ing(startIndex, endIndex)");
                            i = iS0 + 1;
                        }
                    }
                    if (AbstractC3089ba0.o0("no-cache", string)) {
                        z2 = true;
                    } else if (AbstractC3089ba0.o0("no-store", string)) {
                        z3 = true;
                    } else if (AbstractC3089ba0.o0("max-age", string)) {
                        iX = Vg0.x(-1, string2);
                    } else if (AbstractC3089ba0.o0("s-maxage", string)) {
                        iX2 = Vg0.x(-1, string2);
                    } else if (AbstractC3089ba0.o0("private", string)) {
                        z4 = true;
                    } else if (AbstractC3089ba0.o0("public", string)) {
                        z5 = true;
                    } else if (AbstractC3089ba0.o0("must-revalidate", string)) {
                        z6 = true;
                    } else if (AbstractC3089ba0.o0("max-stale", string)) {
                        iX3 = Vg0.x(Integer.MAX_VALUE, string2);
                    } else if (AbstractC3089ba0.o0("min-fresh", string)) {
                        iX4 = Vg0.x(-1, string2);
                    } else if (AbstractC3089ba0.o0("only-if-cached", string)) {
                        z7 = true;
                    } else if (AbstractC3089ba0.o0("no-transform", string)) {
                        z8 = true;
                    } else if (AbstractC3089ba0.o0("immutable", string)) {
                        z9 = true;
                    }
                }
                c4447qz2 = c4447qz;
                i3 = i4;
            } else {
                if (AbstractC3089ba0.o0(strB, "Pragma")) {
                }
                c4447qz2 = c4447qz;
                i3 = i4;
            }
            z = false;
            i = 0;
            while (i < strE.length()) {
                length = strE.length();
                length2 = i;
                while (true) {
                    if (length2 < length) {
                        length2 = strE.length();
                        break;
                    }
                    i2 = length2 + 1;
                    if (AbstractC3089ba0.k0("=,;", strE.charAt(length2))) {
                        break;
                        break;
                    }
                    length2 = i2;
                }
                String strSubstring3 = strE.substring(i, length2);
                AbstractC2995aW.p(strSubstring3, "this as java.lang.String…ing(startIndex, endIndex)");
                string = AbstractC3089ba0.V0(strSubstring3).toString();
                if (length2 != strE.length()) {
                    size = size;
                    i = length2 + 1;
                    string2 = null;
                } else {
                    size = size;
                    i = length2 + 1;
                    string2 = null;
                }
                if (AbstractC3089ba0.o0("no-cache", string)) {
                    z2 = true;
                } else if (AbstractC3089ba0.o0("no-store", string)) {
                    z3 = true;
                } else if (AbstractC3089ba0.o0("max-age", string)) {
                    iX = Vg0.x(-1, string2);
                } else if (AbstractC3089ba0.o0("s-maxage", string)) {
                    iX2 = Vg0.x(-1, string2);
                } else if (AbstractC3089ba0.o0("private", string)) {
                    z4 = true;
                } else if (AbstractC3089ba0.o0("public", string)) {
                    z5 = true;
                } else if (AbstractC3089ba0.o0("must-revalidate", string)) {
                    z6 = true;
                } else if (AbstractC3089ba0.o0("max-stale", string)) {
                    iX3 = Vg0.x(Integer.MAX_VALUE, string2);
                } else if (AbstractC3089ba0.o0("min-fresh", string)) {
                    iX4 = Vg0.x(-1, string2);
                } else if (AbstractC3089ba0.o0("only-if-cached", string)) {
                    z7 = true;
                } else if (AbstractC3089ba0.o0("no-transform", string)) {
                    z8 = true;
                } else if (AbstractC3089ba0.o0("immutable", string)) {
                    z9 = true;
                }
            }
            c4447qz2 = c4447qz;
            i3 = i4;
        }
        return new C4938wc(z2, z3, iX, iX2, z4, z5, z6, iX3, iX4, z7, z8, z9, !z ? null : str);
    }

    public static ZA r(String str) {
        AbstractC2995aW.q(str, "<this>");
        try {
            return k(str);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:18:0x00a6  */
    public static long s(int i, String str) {
        int iG = g(0, i, str, false);
        Matcher matcher = C3019ak.m.matcher(str);
        int i2 = -1;
        int i3 = -1;
        int i4 = -1;
        int iT0 = -1;
        int i5 = -1;
        int i6 = -1;
        while (iG < i) {
            int iG2 = g(iG + 1, i, str, true);
            matcher.region(iG, iG2);
            if (i3 == -1 && matcher.usePattern(C3019ak.m).matches()) {
                String strGroup = matcher.group(1);
                AbstractC2995aW.p(strGroup, "matcher.group(1)");
                i3 = Integer.parseInt(strGroup);
                String strGroup2 = matcher.group(2);
                AbstractC2995aW.p(strGroup2, "matcher.group(2)");
                i5 = Integer.parseInt(strGroup2);
                String strGroup3 = matcher.group(3);
                AbstractC2995aW.p(strGroup3, "matcher.group(3)");
                i6 = Integer.parseInt(strGroup3);
            } else if (i4 == -1 && matcher.usePattern(C3019ak.l).matches()) {
                String strGroup4 = matcher.group(1);
                AbstractC2995aW.p(strGroup4, "matcher.group(1)");
                i4 = Integer.parseInt(strGroup4);
            } else if (iT0 == -1) {
                Pattern pattern = C3019ak.k;
                if (matcher.usePattern(pattern).matches()) {
                    String strGroup5 = matcher.group(1);
                    AbstractC2995aW.p(strGroup5, "matcher.group(1)");
                    Locale locale = Locale.US;
                    AbstractC2995aW.p(locale, "US");
                    String lowerCase = strGroup5.toLowerCase(locale);
                    AbstractC2995aW.p(lowerCase, "this as java.lang.String).toLowerCase(locale)");
                    String strPattern = pattern.pattern();
                    AbstractC2995aW.p(strPattern, "MONTH_PATTERN.pattern()");
                    iT0 = AbstractC3089ba0.t0(strPattern, lowerCase, 0, false, 6) / 4;
                } else if (i2 != -1 && matcher.usePattern(C3019ak.j).matches()) {
                    String strGroup6 = matcher.group(1);
                    AbstractC2995aW.p(strGroup6, "matcher.group(1)");
                    i2 = Integer.parseInt(strGroup6);
                }
            } else if (i2 != -1) {
            }
            iG = g(iG2 + 1, i, str, false);
        }
        if (70 <= i2 && i2 < 100) {
            i2 += 1900;
        }
        if (i2 >= 0 && i2 < 70) {
            i2 += 2000;
        }
        if (i2 < 1601) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        if (iT0 == -1) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        if (1 > i4 || i4 >= 32) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        if (i3 < 0 || i3 >= 24) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        if (i5 < 0 || i5 >= 60) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        if (i6 < 0 || i6 >= 60) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        GregorianCalendar gregorianCalendar = new GregorianCalendar(Vg0.e);
        gregorianCalendar.setLenient(false);
        gregorianCalendar.set(1, i2);
        gregorianCalendar.set(2, iT0 - 1);
        gregorianCalendar.set(5, i4);
        gregorianCalendar.set(11, i3);
        gregorianCalendar.set(12, i5);
        gregorianCalendar.set(13, i6);
        gregorianCalendar.set(14, 0);
        return gregorianCalendar.getTimeInMillis();
    }

    public static String t(String str, int i, int i2, boolean z, int i3) {
        int i4;
        char[] cArr = ZA.k;
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = str.length();
        }
        if ((i3 & 4) != 0) {
            z = false;
        }
        AbstractC2995aW.q(str, "<this>");
        int iCharCount = i;
        while (iCharCount < i2) {
            int i5 = iCharCount + 1;
            char cCharAt = str.charAt(iCharCount);
            if (cCharAt == '%' || (cCharAt == '+' && z)) {
                C4848vb c4848vb = new C4848vb();
                c4848vb.X(i, iCharCount, str);
                while (iCharCount < i2) {
                    int iCodePointAt = str.codePointAt(iCharCount);
                    if (iCodePointAt == 37 && (i4 = iCharCount + 2) < i2) {
                        int iQ = Vg0.q(str.charAt(iCharCount + 1));
                        int iQ2 = Vg0.q(str.charAt(i4));
                        if (iQ == -1 || iQ2 == -1) {
                            c4848vb.Z(iCodePointAt);
                            iCharCount += Character.charCount(iCodePointAt);
                        } else {
                            c4848vb.R((iQ << 4) + iQ2);
                            iCharCount = Character.charCount(iCodePointAt) + i4;
                        }
                    } else if (iCodePointAt == 43 && z) {
                        c4848vb.R(32);
                        iCharCount++;
                    } else {
                        c4848vb.Z(iCodePointAt);
                        iCharCount += Character.charCount(iCodePointAt);
                    }
                }
                return c4848vb.t();
            }
            iCharCount = i5;
        }
        String strSubstring = str.substring(i, i2);
        AbstractC2995aW.p(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }

    public static int u(EX ex) throws IOException {
        try {
            long jK = ex.k();
            String strJ = ex.j(Long.MAX_VALUE);
            if (jK >= 0 && jK <= 2147483647L && strJ.length() <= 0) {
                return (int) jK;
            }
            throw new IOException("expected an int but was \"" + jK + strJ + '\"');
        } catch (NumberFormatException e) {
            throw new IOException(e.getMessage());
        }
    }

    public static ArrayList v(String str) {
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (i <= str.length()) {
            int iS0 = AbstractC3089ba0.s0(str, '&', i, false, 4);
            if (iS0 == -1) {
                iS0 = str.length();
            }
            int iS1 = AbstractC3089ba0.s0(str, '=', i, false, 4);
            if (iS1 == -1 || iS1 > iS0) {
                String strSubstring = str.substring(i, iS0);
                AbstractC2995aW.p(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                arrayList.add(strSubstring);
                arrayList.add(null);
            } else {
                String strSubstring2 = str.substring(i, iS1);
                AbstractC2995aW.p(strSubstring2, "this as java.lang.String…ing(startIndex, endIndex)");
                arrayList.add(strSubstring2);
                String strSubstring3 = str.substring(iS1 + 1, iS0);
                AbstractC2995aW.p(strSubstring3, "this as java.lang.String…ing(startIndex, endIndex)");
                arrayList.add(strSubstring3);
            }
            i = iS0 + 1;
        }
        return arrayList;
    }

    public static void w(StringBuilder sb, List list) {
        AbstractC2995aW.q(list, "<this>");
        C4999xD c4999xDA0 = AbstractC3375el.a0(AbstractC3375el.f0(0, list.size()), 2);
        int i = c4999xDA0.f5212a;
        int i2 = c4999xDA0.b;
        int i3 = c4999xDA0.c;
        if ((i3 <= 0 || i > i2) && (i3 >= 0 || i2 > i)) {
            return;
        }
        while (true) {
            int i4 = i + i3;
            String str = (String) list.get(i);
            String str2 = (String) list.get(i + 1);
            if (i > 0) {
                sb.append('&');
            }
            sb.append(str);
            if (str2 != null) {
                sb.append('=');
                sb.append(str2);
            }
            if (i == i2) {
                return;
            } else {
                i = i4;
            }
        }
    }

    public static Set x(C4447qz c4447qz) {
        int size = c4447qz.size();
        TreeSet treeSet = null;
        int i = 0;
        while (i < size) {
            int i2 = i + 1;
            if (AbstractC3089ba0.o0(HttpResponseHeader.Vary, c4447qz.b(i))) {
                String strE = c4447qz.e(i);
                if (treeSet == null) {
                    Comparator comparator = String.CASE_INSENSITIVE_ORDER;
                    AbstractC2995aW.p(comparator, "CASE_INSENSITIVE_ORDER");
                    treeSet = new TreeSet(comparator);
                }
                Iterator it = AbstractC3089ba0.K0(strE, new char[]{','}).iterator();
                while (it.hasNext()) {
                    treeSet.add(AbstractC3089ba0.V0((String) it.next()).toString());
                }
            }
            i = i2;
        }
        return treeSet == null ? C2942Zq.f4095a : treeSet;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4353pt
    public void a(O30 o30) {
        switch (this.f4315a) {
            case 0:
                return;
            default:
                throw new UnsupportedOperationException();
        }
    }

    public C5104yU c() {
        switch (this.f4315a) {
            case 22:
                if (n()) {
                    return new C5072y4();
                }
                return null;
            default:
                String property = System.getProperty("java.specification.version", "unknown");
                try {
                    AbstractC2995aW.p(property, "jvmVersion");
                    if (Integer.parseInt(property) >= 9) {
                        return null;
                    }
                } catch (NumberFormatException unused) {
                }
                try {
                    Class<?> cls = Class.forName("org.eclipse.jetty.alpn.ALPN", true, null);
                    Class<?> cls2 = Class.forName(AbstractC2995aW.v0("$Provider", "org.eclipse.jetty.alpn.ALPN"), true, null);
                    Class<?> cls3 = Class.forName(AbstractC2995aW.v0("$ClientProvider", "org.eclipse.jetty.alpn.ALPN"), true, null);
                    Class<?> cls4 = Class.forName(AbstractC2995aW.v0("$ServerProvider", "org.eclipse.jetty.alpn.ALPN"), true, null);
                    Method method = cls.getMethod("put", SSLSocket.class, cls2);
                    Method method2 = cls.getMethod("get", SSLSocket.class);
                    Method method3 = cls.getMethod("remove", SSLSocket.class);
                    AbstractC2995aW.p(method, "putMethod");
                    AbstractC2995aW.p(method2, "getMethod");
                    AbstractC2995aW.p(method3, "removeMethod");
                    AbstractC2995aW.p(cls3, "clientProviderClass");
                    AbstractC2995aW.p(cls4, "serverProviderClass");
                    return new C4824vE(method, method2, method3, cls3, cls4);
                } catch (ClassNotFoundException | NoSuchMethodException unused2) {
                    return null;
                }
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4353pt
    public void endTracks() {
        switch (this.f4315a) {
            case 0:
                return;
            default:
                throw new UnsupportedOperationException();
        }
    }

    public synchronized C2800Ue i(String str) {
        C2800Ue c2800Ue;
        String strV0;
        try {
            AbstractC2995aW.q(str, "javaName");
            LinkedHashMap linkedHashMap = C2800Ue.d;
            c2800Ue = (C2800Ue) linkedHashMap.get(str);
            if (c2800Ue == null) {
                if (AbstractC3089ba0.N0(str, "TLS_", false)) {
                    String strSubstring = str.substring(4);
                    AbstractC2995aW.p(strSubstring, "this as java.lang.String).substring(startIndex)");
                    strV0 = AbstractC2995aW.v0(strSubstring, "SSL_");
                } else if (AbstractC3089ba0.N0(str, "SSL_", false)) {
                    String strSubstring2 = str.substring(4);
                    AbstractC2995aW.p(strSubstring2, "this as java.lang.String).substring(startIndex)");
                    strV0 = AbstractC2995aW.v0(strSubstring2, "TLS_");
                } else {
                    strV0 = str;
                }
                c2800Ue = (C2800Ue) linkedHashMap.get(strV0);
                if (c2800Ue == null) {
                    c2800Ue = new C2800Ue(str);
                }
                linkedHashMap.put(str, c2800Ue);
            }
        } catch (Throwable th) {
            throw th;
        }
        return c2800Ue;
    }

    public boolean n() {
        switch (this.f4315a) {
            case 22:
                return C5072y4.f;
            case 23:
            default:
                C5104yU c5104yU = C5104yU.f5278a;
                return AbstractC2995aW.i("Dalvik", System.getProperty("java.vm.name")) && Build.VERSION.SDK_INT >= 29;
            case 24:
                return SS.e;
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4353pt
    public InterfaceC4326pd0 track(int i, int i2) {
        switch (this.f4315a) {
            case 0:
                return new C4262oq();
            default:
                throw new UnsupportedOperationException();
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C3336eJ(int i, int i2) {
        this(0);
        this.f4315a = i;
        switch (i) {
            case 1:
                this(1);
                break;
            case 2:
                this(2);
                break;
            case 3:
                this(3);
                break;
            case 4:
                this(4);
                break;
            case 5:
                this(5);
                break;
            case 6:
                this(6);
                break;
            case 7:
                this(7);
                break;
            case 8:
                this(8);
                break;
            case 9:
                this(9);
                break;
            case 10:
                this(10);
                break;
            case 11:
                this(11);
                break;
            case 12:
                this(12);
                break;
            case 13:
                this(13);
                break;
            case 14:
                this(14);
                break;
            case 15:
                this(15);
                break;
            case 16:
                this(16);
                break;
            case 17:
                this(17);
                break;
            case 18:
                this(18);
                break;
            case 19:
                this(19);
                break;
            case 20:
                this(20);
                break;
            case 21:
                this(21);
                break;
            case 22:
                this(22);
                break;
            case 23:
                this(23);
                break;
            case 24:
                this(24);
                break;
            case 25:
                this(25);
                break;
            case 26:
                this(26);
                break;
            case 27:
                this(27);
                break;
            case 28:
                this(28);
                break;
            case 29:
                this(29);
                break;
            default:
                break;
        }
    }
}
