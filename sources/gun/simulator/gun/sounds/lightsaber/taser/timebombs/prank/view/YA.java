package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import androidx.webkit.ProxyConfig;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class YA {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f4008a;
    public String d;
    public final ArrayList f;
    public List g;
    public String h;
    public String b = "";
    public String c = "";
    public int e = -1;

    public YA() {
        ArrayList arrayList = new ArrayList();
        this.f = arrayList;
        arrayList.add("");
    }

    public final ZA a() {
        ArrayList arrayList;
        String strT;
        String str = this.f4008a;
        if (str == null) {
            throw new IllegalStateException("scheme == null");
        }
        char[] cArr = ZA.k;
        String strT2 = C3336eJ.t(this.b, 0, 0, false, 7);
        String strT3 = C3336eJ.t(this.c, 0, 0, false, 7);
        String str2 = this.d;
        if (str2 == null) {
            throw new IllegalStateException("host == null");
        }
        int iH = this.e;
        if (iH == -1) {
            String str3 = this.f4008a;
            AbstractC2995aW.n(str3);
            iH = C3336eJ.h(str3);
        }
        int i = iH;
        ArrayList<String> arrayList2 = this.f;
        ArrayList arrayList3 = new ArrayList(AbstractC2749Sf.Y(10, arrayList2));
        for (String str4 : arrayList2) {
            char[] cArr2 = ZA.k;
            arrayList3.add(C3336eJ.t(str4, 0, 0, false, 7));
        }
        List list = this.g;
        String strT4 = null;
        if (list == null) {
            arrayList = null;
        } else {
            List<String> list2 = list;
            arrayList = new ArrayList(AbstractC2749Sf.Y(10, list2));
            for (String str5 : list2) {
                if (str5 == null) {
                    strT = null;
                } else {
                    char[] cArr3 = ZA.k;
                    strT = C3336eJ.t(str5, 0, 0, true, 3);
                }
                arrayList.add(strT);
            }
        }
        String str6 = this.h;
        if (str6 != null) {
            char[] cArr4 = ZA.k;
            strT4 = C3336eJ.t(str6, 0, 0, false, 7);
        }
        return new ZA(str, strT2, strT3, str2, i, arrayList3, arrayList, strT4, toString());
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0218  */
    /* JADX WARN: Code duplicated, block: B:102:0x0220 A[LOOP:4: B:102:0x0220->B:220:?, LOOP_START, PHI: r5
  0x0220: PHI (r5v9 int) = (r5v5 int), (r5v10 int) binds: [B:101:0x021e, B:220:?] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:104:0x0223  */
    /* JADX WARN: Code duplicated, block: B:107:0x022c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:113:0x023a  */
    /* JADX WARN: Code duplicated, block: B:123:0x026e  */
    /* JADX WARN: Code duplicated, block: B:126:0x0274  */
    /* JADX WARN: Code duplicated, block: B:127:0x027c  */
    /* JADX WARN: Code duplicated, block: B:129:0x02a2  */
    /* JADX WARN: Code duplicated, block: B:132:0x02c4  */
    /* JADX WARN: Code duplicated, block: B:187:0x03e5  */
    /* JADX WARN: Code duplicated, block: B:215:0x0232 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:216:0x022e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:217:0x0230 A[EDGE_INSN: B:217:0x0230->B:109:0x0230 BREAK  A[LOOP:4: B:102:0x0220->B:220:?], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:218:0x0230 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:4:0x0028  */
    /* JADX WARN: Code duplicated, block: B:73:0x0143  */
    /* JADX WARN: Code duplicated, block: B:76:0x0151  */
    /* JADX WARN: Code duplicated, block: B:77:0x0156  */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    public final void b(ZA za, String str) {
        int i;
        byte b;
        byte b2;
        int i2;
        int iE;
        byte bCharAt;
        ArrayList arrayList;
        String str2;
        int i3;
        int i4;
        int i5;
        int i6;
        char c;
        int i7;
        int i8;
        char cCharAt;
        ArrayList arrayList2;
        int i9;
        boolean z;
        ArrayList arrayList3;
        ArrayList arrayListV;
        AbstractC2995aW.q(str, "input");
        byte[] bArr = Vg0.f3884a;
        int iM = Vg0.m(0, str.length(), str);
        int iN = Vg0.n(iM, str.length(), str);
        byte b3 = -1;
        if (iN - iM >= 2) {
            char cCharAt2 = str.charAt(iM);
            if ((AbstractC2995aW.s(cCharAt2, 97) >= 0 && AbstractC2995aW.s(cCharAt2, 122) <= 0) || (AbstractC2995aW.s(cCharAt2, 65) >= 0 && AbstractC2995aW.s(cCharAt2, 90) <= 0)) {
                i = iM + 1;
                while (true) {
                    if (i < iN) {
                        int i10 = i + 1;
                        char cCharAt3 = str.charAt(i);
                        if (('a' > cCharAt3 || cCharAt3 >= '{') && (('A' > cCharAt3 || cCharAt3 >= '[') && !(('0' <= cCharAt3 && cCharAt3 < ':') || cCharAt3 == '+' || cCharAt3 == '-' || cCharAt3 == '.'))) {
                            if (cCharAt3 == ':') {
                                break;
                            } else {
                                break;
                            }
                        }
                        i = i10;
                    }
                    i = -1;
                    break;
                }
            } else {
                i = -1;
                break;
            }
        } else {
            i = -1;
            break;
        }
        String str3 = "this as java.lang.String…ing(startIndex, endIndex)";
        if (i != -1) {
            if (AbstractC3089ba0.M0(str, "https:", iM, true)) {
                this.f4008a = "https";
                iM += 6;
            } else {
                if (!AbstractC3089ba0.M0(str, "http:", iM, true)) {
                    StringBuilder sb = new StringBuilder("Expected URL scheme 'http' or 'https' but was '");
                    String strSubstring = str.substring(0, i);
                    AbstractC2995aW.p(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                    sb.append(strSubstring);
                    sb.append('\'');
                    throw new IllegalArgumentException(sb.toString());
                }
                this.f4008a = ProxyConfig.MATCH_HTTP;
                iM += 5;
            }
        } else {
            if (za == null) {
                throw new IllegalArgumentException(AbstractC2995aW.v0(str.length() > 6 ? AbstractC2995aW.v0("...", AbstractC3177ca0.Y0(6, str)) : str, "Expected URL scheme 'http' or 'https' but no scheme was found for "));
            }
            this.f4008a = za.f4058a;
        }
        int i11 = iM;
        int i12 = 0;
        while (true) {
            b = 47;
            b2 = 92;
            if (i11 >= iN) {
                break;
            }
            int i13 = i11 + 1;
            char cCharAt4 = str.charAt(i11);
            if (cCharAt4 != '\\' && cCharAt4 != '/') {
                break;
            }
            i12++;
            i11 = i13;
        }
        ArrayList arrayList4 = this.f;
        byte b4 = 63;
        byte b5 = 35;
        if (i12 >= 2 || za == null) {
            i2 = iM + i12;
            boolean z2 = false;
            boolean z3 = false;
            while (true) {
                iE = Vg0.e(i2, iN, str, "@/\\?#");
                if (iE != iN) {
                    bCharAt = str.charAt(iE);
                } else {
                    bCharAt = -1;
                }
                if (bCharAt == b3 || bCharAt == b5 || bCharAt == b || bCharAt == b2 || bCharAt == b4) {
                    break;
                }
                if (bCharAt == 64) {
                    if (z2) {
                        arrayList2 = arrayList4;
                        i9 = iE;
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(this.c);
                        sb2.append("%40");
                        char[] cArr = ZA.k;
                        sb2.append(C3336eJ.d(str, i2, i9, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, PsExtractor.VIDEO_STREAM_MASK));
                        this.c = sb2.toString();
                    } else {
                        int iF = Vg0.f(str, i2, iE, ':');
                        char[] cArr2 = ZA.k;
                        i9 = iE;
                        arrayList2 = arrayList4;
                        String strD = C3336eJ.d(str, i2, iF, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, PsExtractor.VIDEO_STREAM_MASK);
                        if (z3) {
                            strD = AbstractC5044xl.p(new StringBuilder(), this.b, "%40", strD);
                        }
                        this.b = strD;
                        if (iF != i9) {
                            this.c = C3336eJ.d(str, iF + 1, i9, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, PsExtractor.VIDEO_STREAM_MASK);
                            z = true;
                        } else {
                            z = z2;
                        }
                        z2 = z;
                        z3 = true;
                    }
                    i2 = i9 + 1;
                    arrayList4 = arrayList2;
                    str3 = str3;
                    b2 = 92;
                    b = 47;
                    b4 = 63;
                    b5 = 35;
                    b3 = -1;
                }
            }
            arrayList = arrayList4;
            str2 = str3;
            i3 = 1;
            i4 = i2;
            while (true) {
                if (i4 >= iE) {
                    i5 = iE;
                    break;
                }
                cCharAt = str.charAt(i4);
                if (cCharAt == '[') {
                    do {
                        i4++;
                        if (i4 < iE) {
                            break;
                        }
                    } while (str.charAt(i4) != ']');
                } else if (cCharAt == ':') {
                    i5 = i4;
                    break;
                }
                i4++;
            }
            i6 = i5 + 1;
            if (i6 < iE) {
                char[] cArr3 = ZA.k;
                this.d = AbstractC4496rb.C(C3336eJ.t(str, i2, i5, false, 4));
                i7 = i2;
                try {
                    i8 = Integer.parseInt(C3336eJ.d(str, i6, iE, "", false, false, false, false, 248));
                    if (1 <= i8 || i8 >= 65536) {
                        i8 = -1;
                    }
                } catch (NumberFormatException unused) {
                }
                this.e = i8;
                if (i8 != -1) {
                    StringBuilder sb3 = new StringBuilder("Invalid URL port: \"");
                    String strSubstring2 = str.substring(i6, iE);
                    AbstractC2995aW.p(strSubstring2, str2);
                    sb3.append(strSubstring2);
                    sb3.append('\"');
                    throw new IllegalArgumentException(sb3.toString().toString());
                }
                i2 = i7;
                c = '\"';
            } else {
                c = '\"';
                char[] cArr4 = ZA.k;
                this.d = AbstractC4496rb.C(C3336eJ.t(str, i2, i5, false, 4));
                String str4 = this.f4008a;
                AbstractC2995aW.n(str4);
                this.e = C3336eJ.h(str4);
            }
            if (this.d != null) {
                StringBuilder sb4 = new StringBuilder("Invalid URL host: \"");
                String strSubstring3 = str.substring(i2, i5);
                AbstractC2995aW.p(strSubstring3, str2);
                sb4.append(strSubstring3);
                sb4.append(c);
                throw new IllegalArgumentException(sb4.toString().toString());
            }
            iM = iE;
        } else {
            if (AbstractC2995aW.i(za.f4058a, this.f4008a)) {
                this.b = za.e();
                this.c = za.a();
                this.d = za.d;
                this.e = za.e;
                arrayList4.clear();
                arrayList4.addAll(za.c());
                if (iM == iN || str.charAt(iM) == '#') {
                    String strD2 = za.d();
                    if (strD2 == null) {
                        arrayListV = null;
                    } else {
                        char[] cArr5 = ZA.k;
                        arrayListV = C3336eJ.v(C3336eJ.d(strD2, 0, 0, " \"'<>#", true, false, true, false, 211));
                    }
                    this.g = arrayListV;
                }
                arrayList = arrayList4;
                i3 = 1;
            } else {
                i2 = iM + i12;
                boolean z4 = false;
                boolean z5 = false;
                while (true) {
                    iE = Vg0.e(i2, iN, str, "@/\\?#");
                    if (iE != iN) {
                        bCharAt = str.charAt(iE);
                    } else {
                        bCharAt = -1;
                    }
                    if (bCharAt == b3) {
                        break;
                    } else {
                        break;
                    }
                }
                arrayList = arrayList4;
                str2 = str3;
                i3 = 1;
                i4 = i2;
                while (true) {
                    if (i4 >= iE) {
                        i5 = iE;
                        break;
                    }
                    cCharAt = str.charAt(i4);
                    if (cCharAt == '[') {
                        do {
                            i4++;
                            if (i4 < iE) {
                                break;
                                break;
                            }
                        } while (str.charAt(i4) != ']');
                    } else if (cCharAt == ':') {
                        i5 = i4;
                        break;
                    }
                    i4++;
                }
                i6 = i5 + 1;
                if (i6 < iE) {
                    char[] cArr6 = ZA.k;
                    this.d = AbstractC4496rb.C(C3336eJ.t(str, i2, i5, false, 4));
                    i7 = i2;
                    i8 = Integer.parseInt(C3336eJ.d(str, i6, iE, "", false, false, false, false, 248));
                    if (1 <= i8) {
                        i8 = -1;
                    } else {
                        i8 = -1;
                    }
                    this.e = i8;
                    if (i8 != -1) {
                        StringBuilder sb5 = new StringBuilder("Invalid URL port: \"");
                        String strSubstring4 = str.substring(i6, iE);
                        AbstractC2995aW.p(strSubstring4, str2);
                        sb5.append(strSubstring4);
                        sb5.append('\"');
                        throw new IllegalArgumentException(sb5.toString().toString());
                    }
                    i2 = i7;
                    c = '\"';
                } else {
                    c = '\"';
                    char[] cArr7 = ZA.k;
                    this.d = AbstractC4496rb.C(C3336eJ.t(str, i2, i5, false, 4));
                    String str5 = this.f4008a;
                    AbstractC2995aW.n(str5);
                    this.e = C3336eJ.h(str5);
                }
                if (this.d != null) {
                    StringBuilder sb6 = new StringBuilder("Invalid URL host: \"");
                    String strSubstring5 = str.substring(i2, i5);
                    AbstractC2995aW.p(strSubstring5, str2);
                    sb6.append(strSubstring5);
                    sb6.append(c);
                    throw new IllegalArgumentException(sb6.toString().toString());
                }
                iM = iE;
            }
        }
        int iE2 = Vg0.e(iM, iN, str, "?#");
        if (iM != iE2) {
            char cCharAt5 = str.charAt(iM);
            if (cCharAt5 == '/' || cCharAt5 == '\\') {
                arrayList3 = arrayList;
                arrayList3.clear();
                arrayList3.add("");
                iM++;
            } else {
                arrayList3 = arrayList;
                arrayList3.set(arrayList.size() - i3, "");
            }
            while (iM < iE2) {
                int iE3 = Vg0.e(iM, iE2, str, "/\\");
                boolean z6 = iE3 < iE2;
                char[] cArr8 = ZA.k;
                arrayList3 = arrayList3;
                String strD3 = C3336eJ.d(str, iM, iE3, " \"<>^`{}|/\\?#", true, false, false, false, PsExtractor.VIDEO_STREAM_MASK);
                if (!AbstractC2995aW.i(strD3, ".") && !AbstractC3089ba0.o0(strD3, "%2e")) {
                    if (!AbstractC2995aW.i(strD3, "..") && !AbstractC3089ba0.o0(strD3, "%2e.") && !AbstractC3089ba0.o0(strD3, ".%2e") && !AbstractC3089ba0.o0(strD3, "%2e%2e")) {
                        if (((CharSequence) DM.e(arrayList3, i3)).length() == 0) {
                            arrayList3.set(arrayList3.size() - i3, strD3);
                        } else {
                            arrayList3.add(strD3);
                        }
                        if (z6) {
                            arrayList3.add("");
                        }
                    } else if (((String) arrayList3.remove(arrayList3.size() - i3)).length() != 0 || (arrayList3.isEmpty() ^ i3) == 0) {
                        arrayList3.add("");
                    } else {
                        arrayList3.set(arrayList3.size() - i3, "");
                    }
                }
                iM = z6 ? iE3 + 1 : iE3;
            }
        }
        if (iE2 < iN && str.charAt(iE2) == '?') {
            int iF2 = Vg0.f(str, iE2, iN, '#');
            char[] cArr9 = ZA.k;
            this.g = C3336eJ.v(C3336eJ.d(str, iE2 + 1, iF2, " \"'<>#", true, false, true, false, EnumC4719u30.INVALID_BID_PAYLOAD_VALUE));
            iE2 = iF2;
        }
        if (iE2 >= iN || str.charAt(iE2) != '#') {
            return;
        }
        char[] cArr10 = ZA.k;
        this.h = C3336eJ.d(str, iE2 + 1, iN, "", true, false, false, true, 176);
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0086  */
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String str = this.f4008a;
        if (str != null) {
            sb.append(str);
            sb.append("://");
        } else {
            sb.append("//");
        }
        if (this.b.length() > 0 || this.c.length() > 0) {
            sb.append(this.b);
            if (this.c.length() > 0) {
                sb.append(':');
                sb.append(this.c);
            }
            sb.append('@');
        }
        String str2 = this.d;
        if (str2 != null) {
            if (AbstractC3089ba0.k0(str2, ':')) {
                sb.append('[');
                sb.append(this.d);
                sb.append(']');
            } else {
                sb.append(this.d);
            }
        }
        int iH = this.e;
        if (iH != -1 || this.f4008a != null) {
            if (iH == -1) {
                char[] cArr = ZA.k;
                String str3 = this.f4008a;
                AbstractC2995aW.n(str3);
                iH = C3336eJ.h(str3);
            }
            String str4 = this.f4008a;
            if (str4 != null) {
                char[] cArr2 = ZA.k;
                if (iH != C3336eJ.h(str4)) {
                    sb.append(':');
                    sb.append(iH);
                }
            } else {
                sb.append(':');
                sb.append(iH);
            }
        }
        char[] cArr3 = ZA.k;
        ArrayList arrayList = this.f;
        AbstractC2995aW.q(arrayList, "<this>");
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            sb.append('/');
            sb.append((String) arrayList.get(i));
        }
        if (this.g != null) {
            sb.append('?');
            char[] cArr4 = ZA.k;
            List list = this.g;
            AbstractC2995aW.n(list);
            C3336eJ.w(sb, list);
        }
        if (this.h != null) {
            sb.append('#');
            sb.append(this.h);
        }
        String string = sb.toString();
        AbstractC2995aW.p(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }
}
