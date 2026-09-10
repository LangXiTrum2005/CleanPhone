package com.facebook.ads.redexgen.core;

import android.text.TextUtils;
import com.badlogic.gdx.Input;
import com.umeng.analytics.pro.cw;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.EnumC4719u30;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Xj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1156Xj {
    public static byte[] A02;
    public static String[] A03 = {"dsJKxIPhnLL7tG5hphgnPR", "eYxaWiKxC1CpChZOhzGkUxq9HbI", "EkV5JnJXgKAhVW", "rMdsGuayVsLOHtT1X951xYEiF4NjxlSm", "b3c6BNhNC8skmEOaobvPBja1Cg7mRvkm", "t9SsVCc3B2JevdCYf2IfVWE2tTpzDIp", "D3mMXSL3tlVqwsXw8Pm", "mCEguhOof6xxi"};
    public static final Pattern A04;
    public static final Pattern A05;
    public final C1576fq A00 = new C1576fq();
    public final StringBuilder A01 = new StringBuilder();

    public static String A01(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 96);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A07() {
        A02 = new byte[]{-116, -114, -107, -118, -60, -19, -41, -41, 0, 18, 2, -26, -15, 22, 30, 9, 20, 17, 12, -56, cw.l, 23, 22, 28, -43, 27, 17, 34, cw.k, -30, -56, -49, 52, 66, 63, 83, 81, 81, 32, 80, 80, 45, 62, 79, 80, 66, 79, -44, -90, -47, -48, -21, -28, -34, -40, -38, -78, -105, -99, -48, -45, -105, -46, -97, -98, -105, -47, -46, -9, -63, -63, -40, -45, -12, -55, -58, -46, -10, -61, -11, -57, -62, -40, -12, -55, -58, -46, -10, -60, -62, -63, 9, 17, 21, -2, 6, 21, -66, -62, -67, -49, -38, -38, 29, 28, 30, 38, 34, 45, 42, 48, 41, 31, -24, 30, 42, 39, 42, 45, 50, 63, 60, 52, 35, 47, 44, 47, 50, -19, -14, -16, -14, -3, -4, -24, -16, -12, -3, -4, 2, -69, -12, -17, -5, -9, -6, 7, -36, -27, -28, -22, -93, -23, -33, -16, -37, -54, -45, -46, -40, -111, -41, -40, -35, -48, -55, -5, 4, 3, 9, -62, 12, -6, -2, -4, -3, 9, -29, -18, -37, -26, -29, -35, cw.l, 21, 4, 17, -30, -22, 81, 84, 65, 88, 12, 79, 78, 82, 72, 83, 72, 78, 77, 68, 53, 72, 68, -3, 51, 63, 61, 50, 57, 62, 53, -3, 69, 64, 66, 57, 55, 56, 68, 60, 45, 64, 60, -11, 44, 45, 43, 55, 58, 41, 60, 49, 55, 54, 75, 68, 58, 59, 72, -30, -37, -47, -46, -33, -39, -42, -37, -46, 23, 60};
    }

    static {
        A07();
        A05 = Pattern.compile(A01(49, 19, 21));
        A04 = Pattern.compile(A01(68, 32, 57));
    }

    public static char A00(C1576fq c1576fq, int i) {
        return (char) c1576fq.A0l()[i];
    }

    public static String A02(C1576fq c1576fq) {
        int limit = c1576fq.A09();
        int iA0A = c1576fq.A0A();
        char c = 0;
        while (limit < iA0A && c == 0) {
            int i = limit + 1;
            int position = c1576fq.A0l()[limit];
            int limit2 = (char) position;
            c = limit2 == 41 ? (char) 1 : (char) 0;
            limit = i;
        }
        int position2 = c1576fq.A09();
        return c1576fq.A0W((limit - 1) - position2).trim();
    }

    public static String A03(C1576fq c1576fq, StringBuilder sb) {
        sb.setLength(0);
        int iA09 = c1576fq.A09();
        int iA0A = c1576fq.A0A();
        boolean z = false;
        while (iA09 < iA0A && !z) {
            int position = c1576fq.A0l()[iA09];
            char c = (char) position;
            if ((c < 'A' || c > 'Z') && ((c < 'a' || c > 'z') && (c < '0' || c > '9'))) {
                String[] strArr = A03;
                String str = strArr[2];
                String str2 = strArr[1];
                int limit = str.length();
                int position2 = str2.length();
                if (limit == position2) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A03;
                strArr2[4] = "Vh15wAcBJ5awNMogLa7ya5lgHGEvzhGm";
                strArr2[3] = "I7Vba0Ch2uGY8uHZbKRjlO1gIbEJA64m";
                if (c != '#' && c != '-' && c != '.') {
                    String[] strArr3 = A03;
                    String str3 = strArr3[2];
                    String str4 = strArr3[1];
                    int limit2 = str3.length();
                    int position3 = str4.length();
                    if (limit2 != position3) {
                        A03[0] = "VZQzf231kw8V1N2gjYTC7U";
                        if (c != '_') {
                            z = true;
                        }
                    } else {
                        A03[6] = "5JAbk";
                        if (c != '_') {
                            z = true;
                        }
                    }
                }
            }
            iA09++;
            sb.append(c);
        }
        int position4 = c1576fq.A09();
        c1576fq.A0g(iA09 - position4);
        return sb.toString();
    }

    public static String A04(C1576fq c1576fq, StringBuilder sb) {
        A0A(c1576fq);
        if (c1576fq.A07() == 0) {
            return null;
        }
        String strA03 = A03(c1576fq, sb);
        String strA01 = A01(0, 0, 10);
        if (!strA01.equals(strA03)) {
            return strA03;
        }
        String identifier = strA01 + ((char) c1576fq.A0I());
        return identifier;
    }

    public static String A05(C1576fq c1576fq, StringBuilder sb) {
        StringBuilder sb2 = new StringBuilder();
        boolean z = false;
        while (!z) {
            int iA09 = c1576fq.A09();
            String strA04 = A04(c1576fq, sb);
            if (strA04 == null) {
                return null;
            }
            boolean zEquals = A01(252, 1, 95).equals(strA04);
            String[] strArr = A03;
            if (strArr[2].length() != strArr[1].length()) {
                String[] strArr2 = A03;
                strArr2[2] = "RiENs95LW29xQs";
                strArr2[1] = "98BY1tMXf9qss3p7P2Y9sQRSEcM";
                if (zEquals || A01(11, 1, 75).equals(strA04)) {
                    c1576fq.A0f(iA09);
                    String[] strArr3 = A03;
                    if (strArr3[2].length() != strArr3[1].length()) {
                        A03[0] = "seKadn7BPsw689XAgHb6bG";
                        z = true;
                    }
                } else {
                    sb2.append(strA04);
                }
            }
            throw new RuntimeException();
        }
        String token = sb2.toString();
        String[] strArr4 = A03;
        if (strArr4[2].length() != strArr4[1].length()) {
            A03[0] = "PJ9IZmVYrBrltLTNDzSXuq";
            return token;
        }
        throw new RuntimeException();
    }

    public static String A06(C1576fq c1576fq, StringBuilder sb) {
        A0A(c1576fq);
        if (c1576fq.A07() < 5) {
            return null;
        }
        String strA0W = c1576fq.A0W(5);
        String cueSelector = A01(6, 5, 61);
        if (!cueSelector.equals(strA0W)) {
            return null;
        }
        int iA09 = c1576fq.A09();
        String token = A04(c1576fq, sb);
        if (token == null) {
            return null;
        }
        String cueSelector2 = A01(251, 1, 60);
        if (cueSelector2.equals(token)) {
            c1576fq.A0f(iA09);
            String cueSelector3 = A01(0, 0, 10);
            return cueSelector3;
        }
        String target = null;
        String cueSelector4 = A01(3, 1, 2);
        if (cueSelector4.equals(token)) {
            target = A02(c1576fq);
        }
        String token2 = A04(c1576fq, sb);
        String cueSelector5 = A01(4, 1, 59);
        if (cueSelector5.equals(token2)) {
            return target;
        }
        return null;
    }

    private void A08(C1160Xn c1160Xn, String str) {
        if (A01(0, 0, 10).equals(str)) {
            return;
        }
        int iIndexOf = str.indexOf(91);
        if (iIndexOf != -1) {
            Matcher matcher = A05.matcher(str.substring(iIndexOf));
            if (matcher.matches()) {
                c1160Xn.A0N((String) AbstractC1517es.A01(matcher.group(1)));
            }
            str = str.substring(0, iIndexOf);
        }
        String[] strArrA1O = AbstractC1600gE.A1O(str, A01(47, 2, 24));
        String str2 = strArrA1O[0];
        int iIndexOf2 = str2.indexOf(35);
        if (iIndexOf2 != -1) {
            c1160Xn.A0M(str2.substring(0, iIndexOf2));
            int voiceStartIndex = iIndexOf2 + 1;
            c1160Xn.A0L(str2.substring(voiceStartIndex));
        } else {
            c1160Xn.A0M(str2);
        }
        int voiceStartIndex2 = strArrA1O.length;
        if (voiceStartIndex2 > 1) {
            int length = strArrA1O.length;
            if (A03[6].length() == 26) {
                throw new RuntimeException();
            }
            A03[7] = "DE4gkVpytXw0E";
            c1160Xn.A0O((String[]) AbstractC1600gE.A1J(strArrA1O, 1, length));
        }
    }

    public static void A09(C1576fq c1576fq) {
        String line;
        do {
            line = c1576fq.A0T();
        } while (!TextUtils.isEmpty(line));
    }

    public static void A0A(C1576fq c1576fq) {
        boolean skipping = true;
        while (c1576fq.A07() > 0 && skipping) {
            boolean skipping2 = A0E(c1576fq);
            if (!skipping2) {
                boolean skipping3 = A0D(c1576fq);
                if (!skipping3) {
                    skipping = false;
                }
            }
            skipping = true;
        }
    }

    /* JADX WARN: Code duplicated, block: B:44:0x013a  */
    /* JADX WARN: Code duplicated, block: B:47:0x014e  */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00ca, code lost:
    
        if (r5 != false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00cc, code lost:
    
        r8.A0E(1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00d0, code lost:
    
        if (r5 != false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00d3, code lost:
    
        r0 = A01(237, 5, gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.EnumC4719u30.PROTOBUF_SERIALIZATION_ERROR_VALUE);
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00e0, code lost:
    
        if (r0.equals(r3) == false) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00e2, code lost:
    
        r0 = com.facebook.ads.redexgen.core.C1156Xj.A03[5];
        r1 = r0.length();
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00ee, code lost:
    
        if (r1 == 24) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00f0, code lost:
    
        r2 = com.facebook.ads.redexgen.core.C1156Xj.A03;
        r2[2] = "2GynIgqiIEDsRS";
        r2[1] = "abFw2srtb6fHYJRwJQGI2AV9x9f";
        r8.A0E(2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0213, code lost:
    
        throw new java.lang.RuntimeException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:?, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void A0B(com.facebook.ads.redexgen.core.C1576fq r7, com.facebook.ads.redexgen.core.C1160Xn r8, java.lang.StringBuilder r9) {
        /*
            Method dump skipped, instruction units count: 539
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.core.C1156Xj.A0B(com.facebook.ads.redexgen.X.fq, com.facebook.ads.redexgen.X.Xn, java.lang.StringBuilder):void");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:8:0x0057  */
    public static void A0C(String str, C1160Xn c1160Xn) {
        byte b;
        Matcher matcher = A04.matcher(AbstractC1684hb.A01(str));
        if (!matcher.matches()) {
            AbstractC1561fb.A07(A01(32, 15, EnumC4719u30.INVALID_METRICS_ENDPOINT_VALUE), A01(12, 20, 72) + str + A01(1, 2, 7));
            return;
        }
        String str2 = (String) AbstractC1517es.A01(matcher.group(2));
        switch (str2.hashCode()) {
            case 37:
                if (!str2.equals(A01(0, 1, 7))) {
                    b = -1;
                } else {
                    b = 2;
                }
                break;
            case 3240:
                if (!str2.equals(A01(134, 2, 35))) {
                    b = -1;
                } else {
                    b = 1;
                }
                break;
            case 3592:
                if (!str2.equals(A01(Input.Keys.F17, 2, 18))) {
                    b = -1;
                } else {
                    b = 0;
                }
                break;
            default:
                b = -1;
                break;
        }
        switch (b) {
            case 0:
                c1160Xn.A0D(1);
                break;
            case 1:
                c1160Xn.A0D(2);
                break;
            case 2:
                c1160Xn.A0D(3);
                break;
            default:
                throw new IllegalStateException();
        }
        c1160Xn.A0A(Float.parseFloat((String) AbstractC1517es.A01(matcher.group(1))));
    }

    public static boolean A0D(C1576fq c1576fq) {
        int limit = c1576fq.A09();
        int position = c1576fq.A0A();
        byte[] bArrA0l = c1576fq.A0l();
        if (limit + 2 > position) {
            return false;
        }
        int i = limit + 1;
        if (bArrA0l[limit] != 47) {
            return false;
        }
        int limit2 = i + 1;
        if (bArrA0l[i] == 42) {
            while (limit2 + 1 < position) {
                int i2 = limit2 + 1;
                char c = (char) bArrA0l[limit2];
                if (A03[6].length() != 26) {
                    String[] strArr = A03;
                    strArr[4] = "InySU7HyHkZtinqWem4y3oF8qKSZptkm";
                    strArr[3] = "9rITYseV6onPcQDc5rgMmOR6tqaZC7Ym";
                    if (c == '*') {
                        byte b = bArrA0l[i2];
                        String[] strArr2 = A03;
                        String str = strArr2[4];
                        String str2 = strArr2[3];
                        char limit3 = str.charAt(31);
                        char skippedChar = str2.charAt(31);
                        if (limit3 != skippedChar) {
                            throw new RuntimeException();
                        }
                        A03[0] = "PHoPDNz6odAuL8Ungw6NIS";
                        char skippedChar2 = (char) b;
                        if (skippedChar2 == '/') {
                            position = i2 + 1;
                            if (A03[7].length() == 13) {
                                String[] strArr3 = A03;
                                strArr3[4] = "IfEe7uD6oKRguQWJVmvx6dgg7t6qyFvm";
                                strArr3[3] = "gAgfrBFNHRp7NBff9DkLQ3D4ENn77jVm";
                                limit2 = position;
                            }
                        }
                    }
                    limit2 = i2;
                }
                throw new RuntimeException();
            }
            int position2 = position - c1576fq.A09();
            if (A03[7].length() == 13) {
                A03[7] = "AHX5fonDzRqAb";
                c1576fq.A0g(position2);
                return true;
            }
            throw new RuntimeException();
        }
        return false;
    }

    public static boolean A0E(C1576fq c1576fq) {
        switch (A00(c1576fq, c1576fq.A09())) {
            case '\t':
            case '\n':
            case '\f':
            case '\r':
            case ' ':
                c1576fq.A0g(1);
                return true;
            default:
                return false;
        }
    }

    public final List<C1160Xn> A0F(C1576fq c1576fq) {
        String selector;
        this.A01.setLength(0);
        int iA09 = c1576fq.A09();
        A09(c1576fq);
        C1576fq c1576fq2 = this.A00;
        byte[] bArrA0l = c1576fq.A0l();
        int initialInputPosition = c1576fq.A09();
        c1576fq2.A0j(bArrA0l, initialInputPosition);
        this.A00.A0f(iA09);
        ArrayList arrayList = new ArrayList();
        while (true) {
            String selector2 = A06(this.A00, this.A01);
            if (selector2 == null) {
                return arrayList;
            }
            if (!A01(251, 1, 60).equals(A04(this.A00, this.A01))) {
                return arrayList;
            }
            C1160Xn c1160Xn = new C1160Xn();
            A08(c1160Xn, selector2);
            String strA04 = null;
            boolean z = false;
            while (true) {
                selector = A01(252, 1, 95);
                if (z) {
                    break;
                }
                int iA010 = this.A00.A09();
                strA04 = A04(this.A00, this.A01);
                z = strA04 == null || selector.equals(strA04);
                if (!z) {
                    this.A00.A0f(iA010);
                    A0B(this.A00, c1160Xn, this.A01);
                }
            }
            if (selector.equals(strA04)) {
                arrayList.add(c1160Xn);
            }
        }
    }
}
