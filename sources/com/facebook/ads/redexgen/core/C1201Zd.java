package com.facebook.ads.redexgen.core;

import android.text.Html;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.view.PointerIconCompat;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.GL32;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.umeng.analytics.pro.cw;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.EnumC4719u30;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.Inflater;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Zd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1201Zd implements InterfaceC1381cf {
    public static byte[] A01;
    public static String[] A02 = {"C2oNjknnU7f0", "jamwzdSlwK1VU9u2UPn", "R5XcbmNqMJoFdKqssmR", "W7b6qf23Duc83Oe128GfM5mv1DxgoN8Y", "fTV0s6uNTGHyORXoaD3", "RFlveHiMlXMp", "PvM4dczZRLrPOakCL90n8efAwxIuVll9", "L6hM6Wtzh6wW7MGPsexTAJgQv27bcN2T"};
    public final /* synthetic */ C1199Zb A00;

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        int i4 = 0;
        while (true) {
            int length = bArrCopyOfRange.length;
            String[] strArr = A02;
            if (strArr[0].length() != strArr[5].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A02;
            strArr2[3] = "Fu6viaOBrSAOhEjkX6qfziNnimGyiClw";
            strArr2[6] = "bt6qonQCYxBAXULI4C8iqHb7bpxGx1TI";
            if (i4 >= length) {
                return new String(bArrCopyOfRange);
            }
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 94);
            i4++;
        }
    }

    public static void A01() {
        A01 = new byte[]{-21, 30, 30, cw.m, 23, 26, 30, cw.m, cw.l, -54, 30, 25, -54, cw.k, 28, cw.m, 11, 30, cw.m, -54, cw.l, cw.m, cw.k, 25, cw.l, cw.m, 28, -54, cw.n, 25, 28, -54, 31, 24, 29, 31, 26, 26, 25, 28, 30, cw.m, cw.l, -54, cw.n, 25, 28, 23, 11, 30, -58, -43, -43, -47, -50, -56, -58, -39, -50, -44, -45, -108, -56, -54, -58, -110, -101, -107, -99, -41, -26, -26, -30, -33, -39, -41, -22, -33, -27, -28, -91, -39, -37, -41, -93, -83, -90, -82, 4, 19, 19, cw.m, 12, 6, 4, 23, 12, 18, 17, -46, 7, 25, 5, 22, 24, 5, 22, cw.n, 31, 31, 27, 24, 18, cw.n, 35, 24, 30, 29, -34, 31, 22, 34, -20, -5, -5, -9, -12, -18, -20, -1, -12, -6, -7, -70, -1, -1, -8, -9, -74, 3, -8, -9, -10, 5, 5, 1, -2, -8, -10, 9, -2, 4, 3, -60, cw.k, -62, 2, 5, -55, -62, -8, -6, -10, -62, -53, -59, -51, 52, 67, 67, 63, 60, 54, 52, 71, 60, 66, 65, 2, 75, 0, 64, 67, 7, 0, 73, 71, 71, 55, 70, 70, 66, 63, 57, 55, 74, 63, 69, 68, 5, 78, 3, 71, 75, 63, 57, 65, 74, 63, 67, 59, 3, 74, 78, 9, 61, -37, -22, -22, -26, -29, -35, -37, -18, -29, -23, -24, -87, -14, -89, -19, -17, -36, -20, -29, -22, 44, 29, 48, 44, -25, 46, 44, 44, 30, cw.m, 34, 30, -39, 34, -41, 29, 29, 11};
    }

    static {
        A01();
    }

    public C1201Zd(C1199Zb c1199Zb) {
        this.A00 = c1199Zb;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:4:0x0009  */
    @Override // com.facebook.ads.redexgen.core.InterfaceC1381cf
    public final TQ A5A(ZM zm) {
        byte b;
        String str = zm.A0W;
        switch (str.hashCode()) {
            case -1351681404:
                if (!str.equals(A00(88, 19, 69))) {
                    b = -1;
                } else {
                    b = 9;
                }
                break;
            case -1248334819:
                if (!str.equals(A00(107, 15, 81))) {
                    b = -1;
                } else {
                    b = 10;
                }
                break;
            case -1026075066:
                if (!str.equals(A00(167, 21, EnumC4719u30.ASSET_FAILED_STATUS_CODE_VALUE))) {
                    b = -1;
                } else {
                    b = 2;
                }
                break;
            case -1004728940:
                if (!str.equals(A00(236, 8, 90))) {
                    b = -1;
                } else {
                    b = 0;
                }
                break;
            case 691401887:
                if (!str.equals(A00(Input.Keys.F18, 28, 120))) {
                    b = -1;
                } else {
                    b = 5;
                }
                break;
            case 822864842:
                if (!str.equals(A00(244, 10, 76))) {
                    b = -1;
                } else {
                    b = 1;
                }
                break;
            case 930165504:
                if (!str.equals(A00(Input.Keys.F12, 25, 55))) {
                    b = -1;
                } else {
                    b = 7;
                }
                break;
            case 1566015601:
                if (!str.equals(A00(50, 19, 7))) {
                    b = -1;
                } else {
                    b = 6;
                }
                break;
            case 1566016562:
                if (!str.equals(A00(69, 19, 24))) {
                    b = -1;
                } else {
                    b = 8;
                }
                break;
            case 1668750253:
                if (!str.equals(A00(EnumC4719u30.AD_RESPONSE_INVALID_TEMPLATE_TYPE_VALUE, 20, 28))) {
                    b = -1;
                } else {
                    b = 4;
                }
                break;
            case 1693976202:
                if (!str.equals(A00(122, 20, 45))) {
                    b = -1;
                } else {
                    b = 3;
                }
                break;
            default:
                b = -1;
                break;
        }
        switch (b) {
            case 0:
                return new C9H() { // from class: com.facebook.ads.redexgen.X.11
                    public static byte[] A02;
                    public static String[] A03 = {"T9PRe", "zmTKMZoG7iX7oy1Nc1A", "Lfs9febFe2vV", "flgaV8jd2", "TuPgqZLWJtBUEOOYXH7L1f5bT08jUYp1", "6FT4W0AmbHQ15T88T1g", "DM2wuWQyrezwjkuwyPvj4JmDR3eUlx69", "tv77"};
                    public final C1156Xj A00;
                    public final C1576fq A01;

                    public static String A01(int i, int i2, int i3) {
                        byte[] bArrCopyOfRange = Arrays.copyOfRange(A02, i, i + i2);
                        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
                            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 83);
                        }
                        return new String(bArrCopyOfRange);
                    }

                    public static void A02() {
                        A02 = new byte[]{-23, -56, 27, 28, 33, 20, cw.k, -56, 10, 20, 23, 11, 19, -56, 31, 9, 27, -56, cw.l, 23, 29, 22, 12, -56, 9, cw.l, 28, cw.k, 26, -56, 28, cw.n, cw.k, -56, cw.l, 17, 26, 27, 28, -56, 11, 29, cw.k, -42, 24, 25, 30, cw.m, -52, -51, -46, -59, -66, -63, -49, -52, -32, -34, -34, -82, -49, -51, -39, -50, -49, -36};
                    }

                    static {
                        A02();
                    }

                    {
                        A01(53, 13, 23);
                        this.A01 = new C1576fq();
                        this.A00 = new C1156Xj();
                    }

                    public static int A00(C1576fq c1576fq) {
                        int currentInputPosition = -1;
                        int iA09 = 0;
                        while (currentInputPosition == -1) {
                            iA09 = c1576fq.A09();
                            int currentInputPosition2 = A03[5].length();
                            if (currentInputPosition2 != 19) {
                                throw new RuntimeException();
                            }
                            String[] strArr = A03;
                            strArr[4] = "897ltLChZGwVJAWHvfSJ3xrGcLBnCvdy";
                            strArr[6] = "dyU8XL3oiKkhT59g12Hf6WmaJSZBVtZp";
                            String strA0T = c1576fq.A0T();
                            if (strA0T == null) {
                                currentInputPosition = 0;
                            } else if (A01(48, 5, 38).equals(strA0T)) {
                                currentInputPosition = 2;
                            } else if (strA0T.startsWith(A01(44, 4, EnumC4719u30.JSON_ENCODE_ERROR_VALUE))) {
                                currentInputPosition = 1;
                            } else {
                                currentInputPosition = 3;
                            }
                        }
                        c1576fq.A0f(iA09);
                        return currentInputPosition;
                    }

                    public static void A03(C1576fq c1576fq) {
                        while (!TextUtils.isEmpty(c1576fq.A0T())) {
                        }
                    }

                    @Override // com.facebook.ads.redexgen.core.C9H
                    public final InterfaceC1142Wv A0g(byte[] bArr, int i, boolean z) throws TP {
                        C1164Xr c1164XrA08;
                        this.A01.A0j(bArr, i);
                        ArrayList arrayList = new ArrayList();
                        try {
                            Y0.A04(this.A01);
                            while (!TextUtils.isEmpty(this.A01.A0T())) {
                            }
                            ArrayList arrayList2 = new ArrayList();
                            while (true) {
                                int iA00 = A00(this.A01);
                                if (iA00 != 0) {
                                    if (iA00 == 1) {
                                        A03(this.A01);
                                    } else if (iA00 == 2) {
                                        if (arrayList2.isEmpty()) {
                                            this.A01.A0T();
                                            arrayList.addAll(this.A00.A0F(this.A01));
                                        } else {
                                            throw new TP(A01(0, 44, 85));
                                        }
                                    } else if (iA00 == 3 && (c1164XrA08 = AbstractC1172Xz.A08(this.A01, arrayList)) != null) {
                                        arrayList2.add(c1164XrA08);
                                    }
                                } else {
                                    return new T9(arrayList2);
                                }
                            }
                        } catch (Q6 e) {
                            throw new TP(e);
                        }
                    }
                };
            case 1:
                return new AnonymousClass16(zm.A0X);
            case 2:
                return new C9H() { // from class: com.facebook.ads.redexgen.X.12
                    public static byte[] A02;
                    public static String[] A03 = {"3qqRpIc7eYIJvwcUHGBBhNHBQscftOpG", "r99bEwqop96FdhTXGsAeWl7EmtJQ93zA", "l6Rtn7SWgWxZdRa2", "KbHb1UrnNB05JiV0mVK20gLIf1Vf3xrw", "QTXA6yeYuZ4uODkg2NYaiUxnsE2Rwd4o", "IstwiDJXedkTxZZrG2nkehqZk7gHU8ft", "MzFxyePgfM94w5wAeuVhNJkZQr3kN6kV", "DFKSIEjXqmdUeZs9"};
                    public final C1163Xq A00;
                    public final C1576fq A01;

                    public static String A01(int i, int i2, int i3) {
                        byte[] bArrCopyOfRange = Arrays.copyOfRange(A02, i, i + i2);
                        int i4 = 0;
                        while (true) {
                            int length = bArrCopyOfRange.length;
                            String[] strArr = A03;
                            if (strArr[3].charAt(3) != strArr[1].charAt(3)) {
                                throw new RuntimeException();
                            }
                            String[] strArr2 = A03;
                            strArr2[7] = "7DgaYEPzmH1eRvtV";
                            strArr2[2] = "8MICOCA274m9bWy4";
                            if (i4 >= length) {
                                return new String(bArrCopyOfRange);
                            }
                            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 26);
                            i4++;
                        }
                    }

                    public static void A02() {
                        A02 = new byte[]{-36, 1, -10, 2, 0, 3, -1, -8, 7, -8, -77, -32, 3, -57, -22, -8, -11, 9, 7, 7, -77, -25, 2, 3, -77, -33, -8, 9, -8, -1, -77, -11, 2, 11, -77, -5, -8, -12, -9, -8, 5, -77, -7, 2, 8, 1, -9, -63, -58, -21, -32, -20, -22, -19, -23, -30, -15, -30, -99, -13, -15, -15, -99, -32, -14, -30, -99, -33, -20, -11, -99, -27, -30, -34, -31, -30, -17, -99, -29, -20, -14, -21, -31, -85, -108, -73, 123, -98, -84, -87, -67, -69, -69, -117, -84, -86, -74, -85, -84, -71};
                    }

                    static {
                        A02();
                    }

                    {
                        A01(84, 16, 45);
                        this.A01 = new C1576fq();
                        this.A00 = new C1163Xq();
                    }

                    public static C0982Qh A00(C1576fq c1576fq, int i) throws TP {
                        C1374cY c1374cYA0A = null;
                        CharSequence charSequenceA01 = null;
                        while (i > 0) {
                            if (i >= 8) {
                                int iA0C = c1576fq.A0C();
                                int boxType = c1576fq.A0C();
                                int boxSize = iA0C - 8;
                                String strA0r = AbstractC1600gE.A0r(c1576fq.A0l(), c1576fq.A09(), boxSize);
                                c1576fq.A0g(boxSize);
                                i = (i - 8) - boxSize;
                                if (boxType == 1937011815) {
                                    c1374cYA0A = AbstractC1172Xz.A0A(strA0r);
                                } else if (boxType == 1885436268) {
                                    charSequenceA01 = AbstractC1172Xz.A07(null, strA0r.trim(), Collections.emptyList());
                                }
                            } else {
                                throw new TP(A01(48, 36, 99));
                            }
                        }
                        if (charSequenceA01 == null) {
                            charSequenceA01 = A01(0, 0, 26);
                        }
                        if (c1374cYA0A != null) {
                            C1374cY c1374cYA0G = c1374cYA0A.A0G(charSequenceA01);
                            String[] strArr = A03;
                            if (strArr[3].charAt(3) != strArr[1].charAt(3)) {
                                throw new RuntimeException();
                            }
                            String[] strArr2 = A03;
                            strArr2[6] = "cHQZwLGKzV7x8ErPdc4FlPiVSrXFEpE2";
                            strArr2[0] = "Nq3KjOzhrHflZ8qkhMRfzo8YnRYLvtO3";
                            return c1374cYA0G.A0H();
                        }
                        return AbstractC1172Xz.A0B(charSequenceA01);
                    }

                    @Override // com.facebook.ads.redexgen.core.C9H
                    public final InterfaceC1142Wv A0g(byte[] bArr, int i, boolean z) throws TP {
                        this.A01.A0j(bArr, i);
                        ArrayList arrayList = new ArrayList();
                        while (this.A01.A07() > 0) {
                            if (this.A01.A07() >= 8) {
                                int iA0C = this.A01.A0C();
                                int boxSize = this.A01.A0C();
                                if (boxSize == 1987343459) {
                                    arrayList.add(A00(this.A01, iA0C - 8));
                                } else {
                                    C1576fq c1576fq = this.A01;
                                    String[] strArr = A03;
                                    String str2 = strArr[6];
                                    String str3 = strArr[0];
                                    int boxSize2 = str2.charAt(12);
                                    if (boxSize2 == str3.charAt(12)) {
                                        throw new RuntimeException();
                                    }
                                    String[] strArr2 = A03;
                                    strArr2[3] = "tt5boxMA6zOVe1q3iWRC6wVIWhKjFxUN";
                                    strArr2[1] = "JgpbcgdeK05SwxHapnLNuHT6PBEeZj3G";
                                    c1576fq.A0g(iA0C - 8);
                                }
                            } else {
                                throw new TP(A01(0, 48, 121));
                            }
                        }
                        return new TB(arrayList);
                    }
                };
            case 3:
                return new C9H() { // from class: com.facebook.ads.redexgen.X.14
                    public static byte[] A01;
                    public static String[] A02 = {"P8GZY6j8AF", "reAg56jhjo", "HupIFxrzaE8KLJ130mB81O9huHY0LT5g", "lUr4CuOjqfsgfkBRXM9CXBlkeQmQwG30", "dv6A5tg6autRVRcERoUyUPlgv", "2oxe4Bb2VYj5YxjSK2N", "GEIDstLnzhffpmb97xaLB2Lr1phmMGaz", "IdORLd"};
                    public static final Pattern A03;
                    public static final Pattern A04;
                    public static final XV A05;
                    public static final XW A06;
                    public static final Pattern A07;
                    public static final Pattern A08;
                    public static final Pattern A09;
                    public static final Pattern A0A;
                    public static final Pattern A0B;
                    public final XmlPullParserFactory A00;

                    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
                    /* JADX WARN: Code duplicated, block: B:21:0x00af  */
                    /* JADX WARN: Code duplicated, block: B:47:0x0144  */
                    /* JADX WARN: Failed to parse debug info
                    java.lang.ArrayIndexOutOfBoundsException
                     */
                    public static long A01(String str2, XW xw) throws TP {
                        Matcher matcher = A08.matcher(str2);
                        byte b2 = 5;
                        if (matcher.matches()) {
                            double d = (Long.parseLong((String) AbstractC1517es.A01(matcher.group(1))) * 3600) + (Long.parseLong((String) AbstractC1517es.A01(matcher.group(2))) * 60) + Long.parseLong((String) AbstractC1517es.A01(matcher.group(3)));
                            String strGroup = matcher.group(4);
                            double d2 = d + (strGroup != null ? Double.parseDouble(strGroup) : 0.0d);
                            String strGroup2 = matcher.group(5);
                            double d3 = d2 + (strGroup2 != null ? Long.parseLong(strGroup2) / xw.A00 : 0.0d);
                            String strGroup3 = matcher.group(6);
                            return (long) (1000000.0d * (d3 + (strGroup3 != null ? (Long.parseLong(strGroup3) / ((double) xw.A01)) / ((double) xw.A00) : 0.0d)));
                        }
                        Matcher matcher2 = A0A.matcher(str2);
                        if (!matcher2.matches()) {
                            throw new TP(A0A(708, 27, 30) + str2);
                        }
                        double d4 = Double.parseDouble((String) AbstractC1517es.A01(matcher2.group(1)));
                        String str3 = (String) AbstractC1517es.A01(matcher2.group(2));
                        switch (str3.hashCode()) {
                            case 102:
                                if (!str3.equals(A0A(1361, 1, 5))) {
                                    b2 = -1;
                                } else {
                                    b2 = 4;
                                }
                                break;
                            case 104:
                                if (!str3.equals(A0A(1467, 1, 80))) {
                                    b2 = -1;
                                } else {
                                    b2 = 0;
                                }
                                break;
                            case 109:
                                String strA0A = A0A(1552, 1, 51);
                                if (A02[5].length() == 19) {
                                    String[] strArr = A02;
                                    strArr[1] = "9sxmp6eWe8";
                                    strArr[0] = "skIazfqkGq";
                                    if (!str3.equals(strA0A)) {
                                        b2 = -1;
                                    } else {
                                        b2 = 1;
                                    }
                                } else if (!str3.equals(strA0A)) {
                                    b2 = -1;
                                } else {
                                    b2 = 1;
                                }
                                break;
                            case 115:
                                if (!str3.equals(A0A(1640, 1, 67))) {
                                    b2 = -1;
                                } else {
                                    b2 = 2;
                                }
                                break;
                            case 116:
                                if (!str3.equals(A0A(1679, 1, 24))) {
                                    b2 = -1;
                                }
                                break;
                            case 3494:
                                if (!str3.equals(A0A(1561, 2, 79))) {
                                    b2 = -1;
                                } else {
                                    b2 = 3;
                                }
                                break;
                            default:
                                b2 = -1;
                                break;
                        }
                        switch (b2) {
                            case 0:
                                if (A02[5].length() != 19) {
                                    throw new RuntimeException();
                                }
                                String[] strArr2 = A02;
                                strArr2[2] = "mAyqwTEqI0cs2ts3HI4ogWECxm5AMBnt";
                                strArr2[6] = "F8cjMjR86WDCgUX2DRABZrnAaVN35Ifz";
                                d4 *= 3600.0d;
                                break;
                            case 1:
                                d4 *= 60.0d;
                                break;
                            case 3:
                                d4 /= 1000.0d;
                                break;
                            case 4:
                                d4 /= (double) xw.A00;
                                break;
                            case 5:
                                d4 /= (double) xw.A02;
                                break;
                        }
                        return (long) (1000000.0d * d4);
                    }

                    /* JADX WARN: Failed to parse debug info
                    java.lang.ArrayIndexOutOfBoundsException
                     */
                    public static XV A03(XmlPullParser xmlPullParser, XV xv) throws TP {
                        String attributeValue = xmlPullParser.getAttributeValue(A0A(1472, 35, 34), A0A(GL20.GL_OUT_OF_MEMORY, 14, 112));
                        if (attributeValue == null) {
                            return xv;
                        }
                        Matcher matcher = A07.matcher(attributeValue);
                        boolean zMatches = matcher.matches();
                        String strA0A = A0A(166, 36, 0);
                        String strA0A2 = A0A(892, 11, 120);
                        if (!zMatches) {
                            AbstractC1561fb.A07(strA0A2, strA0A + attributeValue);
                            return xv;
                        }
                        try {
                            int i = Integer.parseInt((String) AbstractC1517es.A01(matcher.group(1)));
                            int i2 = Integer.parseInt((String) AbstractC1517es.A01(matcher.group(2)));
                            if (i == 0 || i2 == 0) {
                                throw new TP(A0A(557, 24, 110) + i + A0A(0, 1, 45) + i2);
                            }
                            return new XV(i, i2);
                        } catch (NumberFormatException unused) {
                            AbstractC1561fb.A07(strA0A2, strA0A + attributeValue);
                            return xv;
                        }
                    }

                    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
                    /* JADX WARN: Code duplicated, block: B:47:0x0141  */
                    /* JADX WARN: Code duplicated, block: B:6:0x0039  */
                    /* JADX WARN: Failed to parse debug info
                    java.lang.ArrayIndexOutOfBoundsException
                     */
                    public static XY A06(XmlPullParser xmlPullParser, XY xy, Map<String, XZ> map, XW xw) throws TP {
                        byte b2;
                        long jA01 = C.TIME_UNSET;
                        long jA02 = C.TIME_UNSET;
                        long jA03 = C.TIME_UNSET;
                        String strA0A = A0A(0, 0, 83);
                        String strSubstring = null;
                        String[] strArr = null;
                        int attributeCount = xmlPullParser.getAttributeCount();
                        C1152Xf c1152XfA09 = A09(xmlPullParser, null);
                        for (int i = 0; i < attributeCount; i++) {
                            String attributeName = xmlPullParser.getAttributeName(i);
                            String attributeValue = xmlPullParser.getAttributeValue(i);
                            switch (attributeName.hashCode()) {
                                case -934795532:
                                    String[] strArr2 = A02;
                                    if (strArr2[2].charAt(10) != strArr2[6].charAt(10)) {
                                        String[] strArr3 = A02;
                                        strArr3[2] = "c35HiUTUDVwu32lZ9DBhykI84dfkfI34";
                                        strArr3[6] = "0soer8n4PFpeoMVgzBWJrmJIKHPcOCmK";
                                        if (attributeName.equals(A0A(1613, 6, 21))) {
                                            b2 = 4;
                                        } else {
                                            b2 = -1;
                                        }
                                    } else {
                                        A02[3] = "TSKessLQdFmSNfuUAVqQlOgbqR9XMeCA";
                                        if (attributeName.equals(A0A(1613, 6, 1))) {
                                            b2 = 4;
                                        } else {
                                            b2 = -1;
                                        }
                                    }
                                    break;
                                case 99841:
                                    if (attributeName.equals(A0A(1347, 3, 104))) {
                                        b2 = 2;
                                    } else {
                                        b2 = -1;
                                    }
                                    break;
                                case 100571:
                                    if (attributeName.equals(A0A(1352, 3, 42))) {
                                        b2 = 1;
                                    } else {
                                        b2 = -1;
                                    }
                                    break;
                                case 93616297:
                                    if (attributeName.equals(A0A(1270, 5, 111))) {
                                        b2 = 0;
                                    } else {
                                        b2 = -1;
                                    }
                                    break;
                                case 109780401:
                                    if (attributeName.equals(A0A(1655, 5, 75))) {
                                        b2 = 3;
                                    } else {
                                        b2 = -1;
                                    }
                                    break;
                                case 1292595405:
                                    if (attributeName.equals(A0A(1232, 15, 73))) {
                                        b2 = 5;
                                    } else {
                                        b2 = -1;
                                    }
                                    break;
                                default:
                                    b2 = -1;
                                    break;
                            }
                            switch (b2) {
                                case 0:
                                    jA02 = A01(attributeValue, xw);
                                    break;
                                case 1:
                                    jA03 = A01(attributeValue, xw);
                                    break;
                                case 2:
                                    jA01 = A01(attributeValue, xw);
                                    break;
                                case 3:
                                    String[] strArrA0G = A0G(attributeValue);
                                    if (strArrA0G.length > 0) {
                                        strArr = strArrA0G;
                                    }
                                    break;
                                case 4:
                                    if (map.containsKey(attributeValue)) {
                                        strA0A = attributeValue;
                                    }
                                    break;
                                case 5:
                                    if (A02[5].length() != 19) {
                                        throw new RuntimeException();
                                    }
                                    A02[3] = "4hvTS3jN1C9VilTOozz4eC9p9XgEFCFT";
                                    if (attributeValue.startsWith(A0A(1, 1, 123))) {
                                        strSubstring = attributeValue.substring(1);
                                        String[] strArr4 = A02;
                                        if (strArr4[2].charAt(10) != strArr4[6].charAt(10)) {
                                            A02[3] = "eqAH5CufUPr9yrkh7A1xlzG7ydrHsBlg";
                                        } else {
                                            String[] strArr5 = A02;
                                            strArr5[1] = "pA5OQxgQBV";
                                            strArr5[0] = "YcVhe5m1Ds";
                                        }
                                    }
                                    break;
                                    break;
                            }
                        }
                        if (xy != null && xy.A02 != C.TIME_UNSET) {
                            if (jA02 != C.TIME_UNSET) {
                                jA02 += xy.A02;
                            }
                            if (jA03 != C.TIME_UNSET) {
                                jA03 += xy.A02;
                            }
                        }
                        if (jA03 == C.TIME_UNSET) {
                            String[] strArr6 = A02;
                            if (strArr6[1].length() == strArr6[0].length()) {
                                A02[5] = "iHHGMjuwqQuMuUzOsHF";
                                if (jA01 != C.TIME_UNSET) {
                                    jA03 = jA02 + jA01;
                                } else if (xy != null && xy.A01 != C.TIME_UNSET) {
                                    jA03 = xy.A01;
                                }
                            }
                            throw new RuntimeException();
                        }
                        String name = xmlPullParser.getName();
                        if (A02[3].charAt(27) != 'k') {
                            A02[5] = "ZLGlSu1aEKDQullIIt8";
                            return XY.A02(name, jA02, jA03, c1152XfA09, strArr, strA0A, strSubstring, xy);
                        }
                        String[] strArr7 = A02;
                        strArr7[2] = "yaA8tgJtwGsnuO9ysqkc9NDGo45W3zLt";
                        strArr7[6] = "oTpoNVJAgdjBz40Q1angUlbYgZci9Xu1";
                        return XY.A02(name, jA02, jA03, c1152XfA09, strArr, strA0A, strSubstring, xy);
                    }

                    public static String A0A(int i, int i2, int i3) {
                        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i, i + i2);
                        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
                            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 38);
                        }
                        return new String(bArrCopyOfRange);
                    }

                    /* JADX WARN: Failed to parse debug info
                    java.lang.ArrayIndexOutOfBoundsException
                     */
                    public static Map<String, C1152Xf> A0B(XmlPullParser xmlPullParser, Map<String, C1152Xf> map, XV xv, XX xx, Map<String, XZ> map2, Map<String, String> map3) throws XmlPullParserException, IOException {
                        do {
                            xmlPullParser.next();
                            String strA0A = A0A(1655, 5, 75);
                            if (AbstractC1606gK.A04(xmlPullParser, strA0A)) {
                                String strA00 = AbstractC1606gK.A00(xmlPullParser, strA0A);
                                C1152Xf c1152XfA09 = A09(xmlPullParser, new C1152Xf());
                                if (strA00 != null) {
                                    String[] strArrA0G = A0G(strA00);
                                    for (String str2 : strArrA0G) {
                                        c1152XfA09.A0O(map.get(str2));
                                    }
                                }
                                String strA0X = c1152XfA09.A0X();
                                if (strA0X != null) {
                                    map.put(strA0X, c1152XfA09);
                                }
                            } else if (AbstractC1606gK.A04(xmlPullParser, A0A(1613, 6, 21))) {
                                XZ xzA07 = A07(xmlPullParser, xv, xx);
                                if (xzA07 != null) {
                                    map2.put(xzA07.A09, xzA07);
                                }
                            } else if (AbstractC1606gK.A04(xmlPullParser, A0A(1553, 8, 18))) {
                                A0E(xmlPullParser, map3);
                            }
                        } while (!AbstractC1606gK.A03(xmlPullParser, A0A(1468, 4, 99)));
                        return map;
                    }

                    public static void A0C() {
                        byte[] bArr = {43, 126, 32, 85, 92, 75, 85, 121, 99, 122, 114, 120, 49, 98, 54, 117, 100, 115, 119, 98, 115, 54, 78, 123, 122, 70, 99, 122, 122, 70, 119, 100, 101, 115, 100, 80, 119, 117, 98, 121, 100, 111, 54, 127, 120, 101, 98, 119, 120, 117, 115, 59, 28, 20, 17, 24, 25, 93, cw.k, 28, cw.m, cw.l, 20, 19, 26, 93, 31, 28, 30, 22, 26, cw.m, 18, 8, 19, 25, 93, 11, 28, 17, 8, 24, 71, 93, 59, 28, 20, 17, 24, 25, 93, cw.k, 28, cw.m, cw.l, 20, 19, 26, 93, 30, 18, 17, 18, cw.m, 93, 11, 28, 17, 8, 24, 71, 93, cw.l, 41, 33, 36, 45, 44, 104, 56, 41, 58, 59, 33, 38, 47, 104, 46, 39, 38, 60, 27, 33, 50, 45, 104, 62, 41, 36, 61, 45, 114, 104, cw.k, 42, 34, 39, 46, 47, 107, 63, 36, 107, 59, 42, 57, 56, 46, 107, 56, 35, 46, 42, 57, 113, 107, 111, 65, 72, 73, 84, 79, 72, 65, 6, 75, 71, 74, 64, 73, 84, 75, 67, 66, 6, 69, 67, 74, 74, 6, 84, 67, 85, 73, 74, 83, 82, 79, 73, 72, 28, 6, 37, 11, 2, 3, 30, 5, 2, 11, 76, 1, cw.k, 0, 10, 3, 30, 1, 9, 8, 76, 24, 24, 31, 76, 9, 20, 24, 9, 2, 24, 86, 76, 84, 122, 115, 114, 111, 116, 115, 122, 61, 115, 114, 115, 48, 109, 116, 101, 120, 113, 61, 105, 105, 110, 61, 120, 101, 105, 120, 115, 105, 39, 61, 112, 94, 87, 86, 75, 80, 87, 94, 25, 75, 92, 94, 80, 86, 87, 25, 78, 80, 77, 81, 25, 84, 88, 85, 95, 86, 75, 84, 92, 93, 25, 92, 65, 77, 92, 87, 77, 3, 25, 101, 75, 66, 67, 94, 69, 66, 75, 12, 94, 73, 75, 69, 67, 66, 12, 91, 69, 88, 68, 12, 65, 77, 64, 74, 67, 94, 65, 73, 72, 12, 67, 94, 69, 75, 69, 66, 22, 12, 120, 86, 95, 94, 67, 88, 95, 86, 17, 67, 84, 86, 88, 94, 95, 17, 70, 88, 69, 89, 17, 92, 88, 66, 66, 88, 95, 86, 17, 69, 69, 66, 11, 84, 73, 69, 84, 95, 69, 11, 17, 30, 48, 57, 56, 37, 62, 57, 48, 119, 37, 50, 48, 62, 56, 57, 119, 32, 62, 35, 63, 119, 34, 57, 36, 34, 39, 39, 56, 37, 35, 50, 51, 119, 50, 47, 35, 50, 57, 35, 109, 119, 68, 106, 99, 98, 127, 100, 99, 106, 45, 127, 104, 106, 100, 98, 99, 45, 122, 100, 121, 101, 45, 120, 99, 126, 120, 125, 125, 98, 127, 121, 104, 105, 45, 98, 127, 100, 106, 100, 99, 55, 45, 105, 71, 78, 79, 82, 73, 78, 71, 0, 82, 69, 71, 73, 79, 78, 0, 87, 73, 84, 72, 79, 85, 84, 0, 65, 78, 0, 69, 88, 84, 69, 78, 84, 54, 24, 17, cw.n, cw.k, 22, 17, 24, 95, cw.k, 26, 24, 22, cw.n, 17, 95, 8, 22, 11, 23, cw.n, 10, 11, 95, 30, 17, 95, cw.n, cw.k, 22, 24, 22, 17, 87, 121, 112, 113, 108, 119, 112, 121, 62, 107, 112, 109, 107, 110, 110, 113, 108, 106, 123, 122, 62, 106, 127, 121, 36, 62, 1, 38, 62, 41, 36, 33, 44, 104, 43, 45, 36, 36, 104, 58, 45, 59, 39, 36, 61, 60, 33, 39, 38, 104, 93, 122, 98, 117, 120, 125, 112, 52, 113, 108, 100, 102, 113, 103, 103, 125, 123, 122, 52, 114, 123, 102, 52, 114, 123, 122, 96, 71, 125, 110, 113, 46, 52, 51, 94, 121, 97, 118, 123, 126, 115, 55, 121, 98, 122, 117, 114, 101, 55, 120, 113, 55, 114, 121, 99, 101, 126, 114, 100, 55, 113, 120, 101, 55, 113, 120, 121, 99, 68, 126, 109, 114, 45, 55, 124, 91, 67, 84, 89, 92, 81, 21, 64, 91, 92, 65, 21, 83, 90, 71, 21, 83, 90, 91, 65, 102, 92, 79, 80, cw.m, 21, 18, 64, 103, 127, 104, 101, 96, 109, 41, 127, 104, 101, 124, 108, 41, 111, 102, 123, 41, 122, 97, 108, 104, 123, 51, 41, 117, 89, 84, 94, 87, 74, 85, 93, 92, 24, 76, 81, 85, 93, 24, 93, 64, 72, 74, 93, 75, 75, 81, 87, 86, 2, 24, 30, 38, 63, 39, 58, 35, 63, 54, 115, 37, 50, 63, 38, 54, 32, 115, 58, 61, 115, 53, 60, 61, 39, 0, 58, 41, 54, 115, 50, 39, 39, 33, 58, 49, 38, 39, 54, 125, 115, 3, 58, 48, 56, 58, 61, 52, 115, 39, 59, 54, 115, 32, 54, 48, 60, 61, 55, 115, 37, 50, 63, 38, 54, 115, 53, 60, 33, 115, 37, 54, 33, 39, 58, 48, 50, 63, 115, 53, 60, 61, 39, 115, 32, 58, 41, 54, 115, 50, 61, 55, 115, 58, 52, 61, 60, 33, 58, 61, 52, 115, 39, 59, 54, 115, 53, 58, 33, 32, 39, 125, 108, 77, 2, 118, 118, 111, 110, 2, 81, 87, 64, 86, 75, 86, 78, 71, 81, 2, 68, 77, 87, 76, 70, 57, 31, 26, 26, 24, cw.m, 25, 25, 3, 4, cw.k, 74, 26, 11, 24, 25, cw.m, 24, 74, cw.m, 24, 24, 5, 24, 10, 42, 51, 50, 26, 59, 61, 49, 58, 59, 44, 43, cw.n, 31, 28, 18, 27, 94, 10, 17, 94, 26, 27, 29, 17, 26, 27, 94, cw.k, 17, 11, 12, 29, 27, 12, 55, 60, 33, 41, 60, 58, 45, 60, 61, 121, 60, 43, 43, 54, 43, 121, 46, 49, 60, 55, 121, 43, 60, 56, 61, 48, 55, 62, 121, 48, 55, 41, 44, 45, 119, 87, 120, 32, 12, 122, 122, 9, 98, 127, 107, cw.m, 120, 124, 123, 109, 9, 98, 127, 107, cw.m, 121, 123, 122, 34, 42, 46, 55, 63, 46, 119, 123, 118, 81, 39, 84, 34, 36, 82, 
                        48, 83, 107, 36, 83, 33, 48, 83, 107, 37, 48, 38, 42, 43, cw.l, 120, 11, 96, 125, 105, cw.k, 123, 120, 111, 106, 12, 126, 11, 96, 125, 105, cw.k, 123, 121, 111, 121, 120, 56, 44, 61, 44, 35, 44, 61, 35, 44, 54, 44, 36, 121, 116, 18, 100, 23, 124, 97, 117, 17, 23, 124, 97, 117, 17, 103, 101, 118, 100, 23, 124, 97, 117, 17, 23, 124, 97, 117, 17, 101, 118, 100, 23, 124, 97, 117, 17, 23, 124, 97, 117, 17, 101, 100, 115, 118, 100, cw.n, 98, 23, 124, 97, 117, 17, 103, 101, 48, 118, 100, 23, 124, 97, 117, 17, 23, 124, 97, 117, 17, 101, 100, 115, 118, cw.n, 98, 100, 23, 124, 97, 117, 17, 103, 101, 101, 115, 101, 115, 104, 17, 103, 19, 43, 100, 102, 111, 103, 19, 43, 100, 102, 107, 22, 96, 20, 44, 99, 20, 102, 119, 20, 44, 98, 119, 97, 109, 104, 96, 20, 44, 99, 20, 102, 119, 20, 44, 98, 119, 97, 109, 108, 51, 69, 49, 9, 70, 49, 67, 82, 49, 9, 71, 82, 68, 29, 21, 77, 69, 49, 9, 70, 49, 67, 82, 49, 9, 71, 82, 68, 29, 21, 73, 28, 27, 9, 24, cw.m, 102, 107, 107, 82, 81, 83, 91, 87, 66, 95, 69, 94, 84, 115, 95, 92, 95, 66, cw.k, cw.l, 12, 4, 8, 29, 0, 26, 1, 11, 38, 2, cw.l, 8, 10, 72, 75, 89, 79, 37, 38, 52, 34, 4, 40, 41, 51, 38, 46, 41, 34, 53, cw.m, 8, 11, 2, 31, 8, 43, 44, 46, 32, 39, 106, 103, 108, 113, 108, 97, 98, 106, 30, cw.l, 53, 51, 58, 58, 4, 51, 37, 57, 58, 35, 34, 63, 57, 56, 1, 7, 12, 22, 7, cw.n, 63, 51, 48, 51, 46, 85, 89, 88, 66, 87, 95, 88, 83, 68, 65, 68, 81, 68, 66, 67, 74, 79, 75, 79, 82, 67, 84, 24, 21, cw.m, 12, cw.n, 29, 5, 61, cw.n, 21, 27, 18, 119, 122, 101, 42, 59, 60, 9, 1, 105, 98, 104, 61, 32, 44, 61, 54, 44, 69, 6, cw.m, cw.l, 20, 38, 1, cw.k, 9, 12, 25, 109, 100, 101, 127, 88, 98, 113, 110, 43, 34, 35, 57, 30, 57, 52, 33, 40, 45, 36, 37, 63, 28, 46, 34, 44, 35, 63, 50, 38, 53, 57, 49, 6, 53, 32, 49, 25, cw.k, 30, 18, 26, 45, 30, 11, 26, 50, 10, 19, 11, 22, cw.m, 19, 22, 26, cw.k, 8, 28, cw.m, 3, 11, 60, cw.m, 26, 11, 35, 27, 2, 26, 7, 30, 2, 7, 11, 28, 78, 10, 1, 11, 29, 0, 73, 26, 78, 6, cw.m, 24, 11, 78, 92, 78, 30, cw.m, 28, 26, 29, 30, 45, 32, 36, 33, 108, 112, 112, 116, 62, 43, 43, 115, 115, 115, 42, 115, 55, 42, 107, 118, 99, 43, 106, 119, 43, 112, 112, 105, 104, 39, 116, 101, 118, 101, 105, 97, 112, 97, 118, 9, 4, 34, 38, 42, 44, 46, 7, 0, 8, 1, 28, 3, cw.m, 26, 7, 1, 0, 69, 88, 77, 64, 69, 79, 5, 8, cw.n, 6, 28, 29, 27, 18, 17, 3, 114, 119, 112, 123, 106, 118, 108, 113, 107, 121, 118, 120, 89, 81, 64, 85, 80, 85, 64, 85, 4, 26, 48, 40, 49, 41, 52, cw.m, 50, 42, 28, 49, 52, 58, 51, 125, 124, 127, 122, 125, 118, 103, 123, 97, 124, 102, 116, 123, 117, 116, 117, 126, 108, 109, 119, 108, 102, 103, 112, 110, 107, 108, 103, 7, 26, 1, cw.m, 1, 6, 28, 2, 10, 65, 86, 84, 90, 92, 93, 43, 48, 62, 49, 45, 71, 64, 87, 76, 85, 82, 69, 94, 119, 72, 84, 78, 83, 78, 72, 73, 22, 85, 78, 67, 71, 84, 101, 102, 119, 120, 42, 45, 56, 43, 45, 30, 25, 20, 1, 8, 93, 90, 87, 66, 71, 64, 73, 84, 82, 69, 97, 85, 70, 74, 66, 117, 70, 83, 66, 74, 91, 77, 121, 111, 97, 127, 42, 60, 44, 50, 67, 82, 79, 67, 48, 33, 60, 48, 5, 40, 45, 35, 42, 82, 67, 94, 82, 101, 73, 75, 68, 79, 72, 67, 71, 86, 75, 71, 112, 92, 93, 71, 82, 90, 93, 86, 65, cw.m, 30, 3, cw.m, 63, 30, 24, 20, 9, 26, cw.m, 18, 20, 21, 23, 6, 27, 23, 38, cw.l, 19, 11, 2, cw.n, 10, cw.n, 120, 101, 111, 103, 94, 109, 120, 105, 66, 66, 29, 6, 12, cw.k, 26, 4, 1, 6, cw.k, 67, 70, 93, 64, 93, 90, 83, 121, 91, 80, 81};
                        String[] strArr = A02;
                        if (strArr[2].charAt(10) == strArr[6].charAt(10)) {
                            throw new RuntimeException();
                        }
                        String[] strArr2 = A02;
                        strArr2[7] = "U7Ydty";
                        strArr2[4] = "i9OpsshPuIR8wYXgdP1INo5uv";
                        A01 = bArr;
                    }

                    /* JADX WARN: Failed to parse debug info
                    java.lang.ArrayIndexOutOfBoundsException
                     */
                    @Override // com.facebook.ads.redexgen.core.C9H
                    public final InterfaceC1142Wv A0g(byte[] bArr, int i, boolean z) throws TP {
                        String strA0A = A0A(0, 0, 83);
                        try {
                            XmlPullParser xmlPullParserNewPullParser = this.A00.newPullParser();
                            HashMap map = new HashMap();
                            HashMap map2 = new HashMap();
                            HashMap map3 = new HashMap();
                            map2.put(strA0A, new XZ(strA0A));
                            xmlPullParserNewPullParser.setInput(new ByteArrayInputStream(bArr, 0, i), null);
                            TD td = null;
                            ArrayDeque arrayDeque = new ArrayDeque();
                            int i2 = 0;
                            XW xwA04 = A06;
                            XV xvA03 = A05;
                            XX xxA05 = null;
                            for (int eventType = xmlPullParserNewPullParser.getEventType(); eventType != 1; eventType = xmlPullParserNewPullParser.getEventType()) {
                                XY xy = (XY) arrayDeque.peek();
                                if (i2 == 0) {
                                    String name = xmlPullParserNewPullParser.getName();
                                    String strA0A2 = A0A(1761, 2, 16);
                                    if (eventType == 2) {
                                        if (strA0A2.equals(name)) {
                                            xwA04 = A04(xmlPullParserNewPullParser);
                                            xvA03 = A03(xmlPullParserNewPullParser, A05);
                                            xxA05 = A05(xmlPullParserNewPullParser);
                                        }
                                        boolean zA0F = A0F(name);
                                        String strA0A3 = A0A(892, 11, 120);
                                        if (!zA0F) {
                                            AbstractC1561fb.A06(strA0A3, A0A(531, 26, 56) + xmlPullParserNewPullParser.getName());
                                            i2++;
                                        } else if (A0A(1468, 4, 99).equals(name)) {
                                            A0B(xmlPullParserNewPullParser, map, xvA03, xxA05, map2, map3);
                                        } else {
                                            try {
                                                XY xyA06 = A06(xmlPullParserNewPullParser, xy, map2, xwA04);
                                                arrayDeque.push(xyA06);
                                                if (xy != null) {
                                                    xy.A0F(xyA06);
                                                }
                                            } catch (TP e) {
                                                AbstractC1561fb.A0A(strA0A3, A0A(868, 24, 76), e);
                                                i2++;
                                            }
                                        }
                                    } else if (eventType == 4) {
                                        ((XY) AbstractC1517es.A01(xy)).A0F(XY.A01(xmlPullParserNewPullParser.getText()));
                                    } else {
                                        if (A02[3].charAt(27) == 'k') {
                                            throw new RuntimeException();
                                        }
                                        String[] strArr = A02;
                                        strArr[7] = "SD92fX";
                                        strArr[4] = "ozqaVBt0IZOaXUU7UIxPKisCf";
                                        if (eventType == 3) {
                                            if (xmlPullParserNewPullParser.getName().equals(strA0A2)) {
                                                td = new TD((XY) AbstractC1517es.A01((XY) arrayDeque.peek()), map, map2, map3);
                                            }
                                            arrayDeque.pop();
                                        }
                                    }
                                    xmlPullParserNewPullParser.next();
                                } else {
                                    if (eventType == 2) {
                                        i2++;
                                    } else {
                                        String[] strArr2 = A02;
                                        if (strArr2[7].length() == strArr2[4].length()) {
                                            throw new RuntimeException();
                                        }
                                        String[] strArr3 = A02;
                                        strArr3[1] = "j7LpVLPfgU";
                                        strArr3[0] = "TeldLaMvv8";
                                        if (eventType == 3) {
                                            i2--;
                                        }
                                    }
                                    xmlPullParserNewPullParser.next();
                                }
                            }
                            if (td != null) {
                                return td;
                            }
                            throw new TP(A0A(845, 23, 4));
                        } catch (IOException e2) {
                            throw new IllegalStateException(A0A(926, 36, EnumC4719u30.ASSET_FAILED_MAX_SPACE_EXCEEDED_VALUE), e2);
                        } catch (XmlPullParserException e3) {
                            throw new TP(A0A(TypedValues.Custom.TYPE_STRING, 23, 88), e3);
                        }
                    }

                    static {
                        A0C();
                        A08 = Pattern.compile(A0A(1051, 85, 106));
                        A0A = Pattern.compile(A0A(PointerIconCompat.TYPE_HORIZONTAL_DOUBLE_ARROW, 37, EnumC4719u30.PROTOBUF_SERIALIZATION_ERROR_VALUE));
                        A09 = Pattern.compile(A0A(965, 29, 116));
                        A04 = Pattern.compile(A0A(994, 20, 41));
                        A03 = Pattern.compile(A0A(1149, 29, 110));
                        A0B = Pattern.compile(A0A(1178, 31, 75));
                        A07 = Pattern.compile(A0A(1136, 13, 105));
                        A06 = new XW(30.0f, 1, 1);
                        A05 = new XV(32, 15);
                    }

                    {
                        A0A(892, 11, 120);
                        try {
                            this.A00 = XmlPullParserFactory.newInstance();
                            this.A00.setNamespaceAware(true);
                        } catch (XmlPullParserException e) {
                            throw new RuntimeException(A0A(6, 45, 48), e);
                        }
                    }

                    public static float A00(String str2) {
                        Matcher matcher = A04.matcher(str2);
                        boolean zMatches = matcher.matches();
                        String strA0A = A0A(892, 11, 120);
                        if (!zMatches) {
                            AbstractC1561fb.A07(strA0A, A0A(683, 25, 47) + str2);
                            return Float.MAX_VALUE;
                        }
                        try {
                            return Math.min(100.0f, Math.max(-100.0f, Float.parseFloat((String) AbstractC1517es.A01(matcher.group(1)))));
                        } catch (NumberFormatException e) {
                            AbstractC1561fb.A0A(strA0A, A0A(Input.Keys.NUM_LOCK, 23, 109) + str2, e);
                            return Float.MAX_VALUE;
                        }
                    }

                    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
                    /* JADX WARN: Code duplicated, block: B:4:0x000b  */
                    public static Layout.Alignment A02(String str2) {
                        byte b2;
                        String strA01 = AbstractC1684hb.A01(str2);
                        switch (strA01.hashCode()) {
                            case -1364013995:
                                if (!strA01.equals(A0A(1299, 6, 68))) {
                                    b2 = -1;
                                } else {
                                    b2 = 4;
                                }
                                break;
                            case 100571:
                                if (!strA01.equals(A0A(1352, 3, 42))) {
                                    b2 = -1;
                                } else {
                                    b2 = 3;
                                }
                                break;
                            case 3317767:
                                if (!strA01.equals(A0A(1537, 4, 81))) {
                                    b2 = -1;
                                } else {
                                    b2 = 0;
                                }
                                break;
                            case 108511772:
                                if (!strA01.equals(A0A(1619, 5, EnumC4719u30.ASSET_FAILED_MAX_SPACE_EXCEEDED_VALUE))) {
                                    b2 = -1;
                                } else {
                                    b2 = 2;
                                }
                                break;
                            case 109757538:
                                if (!strA01.equals(A0A(1650, 5, EnumC4719u30.ASSET_FAILED_MAX_SPACE_EXCEEDED_VALUE))) {
                                    b2 = -1;
                                } else {
                                    b2 = 1;
                                }
                                break;
                            default:
                                b2 = -1;
                                break;
                        }
                        switch (b2) {
                            case 0:
                            case 1:
                                return Layout.Alignment.ALIGN_NORMAL;
                            case 2:
                            case 3:
                                Layout.Alignment alignment = Layout.Alignment.ALIGN_OPPOSITE;
                                String[] strArr = A02;
                                if (strArr[2].charAt(10) == strArr[6].charAt(10)) {
                                    throw new RuntimeException();
                                }
                                A02[3] = "gEN5w1qCcbQvfcLdSJtX6vlIOg7nCrwF";
                                return alignment;
                            case 4:
                                return Layout.Alignment.ALIGN_CENTER;
                            default:
                                return null;
                        }
                    }

                    public static XW A04(XmlPullParser xmlPullParser) throws TP {
                        int i = 30;
                        String strA0A = A0A(1399, 9, 114);
                        String frameRateMultiplierString = A0A(1472, 35, 34);
                        String attributeValue = xmlPullParser.getAttributeValue(frameRateMultiplierString, strA0A);
                        if (attributeValue != null) {
                            i = Integer.parseInt(attributeValue);
                        }
                        float f = 1.0f;
                        String attributeValue2 = xmlPullParser.getAttributeValue(frameRateMultiplierString, A0A(1408, 19, 89));
                        if (attributeValue2 != null) {
                            String[] parts = AbstractC1600gE.A1O(attributeValue2, A0A(0, 1, 45));
                            if (parts.length == 2) {
                                String str2 = parts[0];
                                String[] strArr = A02;
                                String frameRateString = strArr[7];
                                String str3 = strArr[4];
                                int length = frameRateString.length();
                                int frameRate = str3.length();
                                if (length == frameRate) {
                                    throw new RuntimeException();
                                }
                                String[] strArr2 = A02;
                                strArr2[7] = "siUsj8";
                                strArr2[4] = "oIe91khz6MrFpkSfZhK5pkWoX";
                                int frameRate2 = Integer.parseInt(str2);
                                float f2 = frameRate2;
                                int frameRate3 = Integer.parseInt(parts[1]);
                                f = f2 / frameRate3;
                            } else {
                                String frameRateString2 = A0A(1427, 40, 72);
                                throw new TP(frameRateString2);
                            }
                        }
                        int tickRate = A06.A01;
                        String attributeValue3 = xmlPullParser.getAttributeValue(frameRateMultiplierString, A0A(1667, 12, 1));
                        if (attributeValue3 != null) {
                            tickRate = Integer.parseInt(attributeValue3);
                        }
                        int i2 = A06.A02;
                        String attributeValue4 = xmlPullParser.getAttributeValue(frameRateMultiplierString, A0A(1753, 8, 42));
                        if (attributeValue4 != null) {
                            i2 = Integer.parseInt(attributeValue4);
                        }
                        return new XW(i * f, tickRate, i2);
                    }

                    public static XX A05(XmlPullParser xmlPullParser) {
                        String strA00 = AbstractC1606gK.A00(xmlPullParser, A0A(1355, 6, EnumC4719u30.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE));
                        if (strA00 == null) {
                            return null;
                        }
                        Matcher matcher = A0B.matcher(strA00);
                        boolean zMatches = matcher.matches();
                        String strA0A = A0A(892, 11, 120);
                        if (!zMatches) {
                            StringBuilder sb = new StringBuilder();
                            String ttsExtent = A0A(233, 31, 59);
                            AbstractC1561fb.A07(strA0A, sb.append(ttsExtent).append(strA00).toString());
                            return null;
                        }
                        try {
                            String ttsExtent2 = matcher.group(1);
                            int i = Integer.parseInt((String) AbstractC1517es.A01(ttsExtent2));
                            String ttsExtent3 = matcher.group(2);
                            return new XX(i, Integer.parseInt((String) AbstractC1517es.A01(ttsExtent3)));
                        } catch (NumberFormatException unused) {
                            StringBuilder sb2 = new StringBuilder();
                            String ttsExtent4 = A0A(202, 31, 74);
                            AbstractC1561fb.A07(strA0A, sb2.append(ttsExtent4).append(strA00).toString());
                            return null;
                        }
                    }

                    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
                    /* JADX WARN: Code duplicated, block: B:41:0x01b9 A[PHI: r0
  0x01b9: PHI (r0v68 java.lang.String) = (r0v51 java.lang.String), (r0v85 java.lang.String) binds: [B:73:0x0284, B:40:0x01b7] A[DONT_GENERATE, DONT_INLINE]] */
                    /* JADX WARN: Code duplicated, block: B:43:0x01c4  */
                    /* JADX WARN: Code duplicated, block: B:49:0x01ee  */
                    /* JADX WARN: Code duplicated, block: B:64:0x023c  */
                    /* JADX WARN: Code duplicated, block: B:65:0x0240  */
                    /* JADX WARN: Code duplicated, block: B:66:0x0248  */
                    /* JADX WARN: Code duplicated, block: B:68:0x0257  */
                    /* JADX WARN: Code duplicated, block: B:69:0x025a  */
                    /* JADX WARN: Code duplicated, block: B:71:0x0269  */
                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.String] */
                    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.String[]] */
                    /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.CharSequence, java.lang.String] */
                    /* JADX WARN: Type inference failed for: r9v2 */
                    public static XZ A07(XmlPullParser xmlPullParser, XV xv, XX xx) {
                        float f;
                        float f2;
                        float f3;
                        float f4;
                        String strA00;
                        String strA01;
                        byte b2;
                        String strA02 = AbstractC1606gK.A00(xmlPullParser, A0A(1507, 2, 70));
                        if (strA02 == null) {
                            return null;
                        }
                        String strA03 = AbstractC1606gK.A00(xmlPullParser, A0A(1604, 6, 78));
                        String strA0A = A0A(892, 11, 120);
                        if (strA03 != 0) {
                            Matcher matcher = A03.matcher(strA03);
                            Matcher originPercentageMatcher = A0B.matcher(strA03);
                            boolean zMatches = matcher.matches();
                            if (A02[5].length() != 19) {
                                throw new RuntimeException();
                            }
                            A02[3] = "g8RH2XkPSUWBUHgbgH9nfdSCNtbRAFrJ";
                            String strA0A2 = A0A(303, 39, 10);
                            String strA0A3 = A0A(342, 41, 23);
                            byte b3 = 2;
                            try {
                                if (zMatches) {
                                    try {
                                        f = Float.parseFloat((String) AbstractC1517es.A01(matcher.group(1))) / 100.0f;
                                        f2 = Float.parseFloat((String) AbstractC1517es.A01(matcher.group(2))) / 100.0f;
                                    } catch (NumberFormatException unused) {
                                        AbstractC1561fb.A07(strA0A, strA0A2 + ((String) strA03));
                                        return null;
                                    }
                                } else if (originPercentageMatcher.matches()) {
                                    if (xx == null) {
                                        AbstractC1561fb.A07(strA0A, strA0A3 + ((String) strA03));
                                        return null;
                                    }
                                    int height = Integer.parseInt((String) AbstractC1517es.A01(originPercentageMatcher.group(1)));
                                    int i = Integer.parseInt((String) AbstractC1517es.A01(originPercentageMatcher.group(2)));
                                    f = height / xx.A01;
                                    float position = xx.A00;
                                    f2 = i / position;
                                } else {
                                    AbstractC1561fb.A07(strA0A, A0A(424, 41, 43) + ((String) strA03));
                                    return null;
                                }
                                strA0A2 = A0A(1355, 6, EnumC4719u30.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE);
                                String strA04 = AbstractC1606gK.A00(xmlPullParser, strA0A2);
                                if (strA04 != null) {
                                    Matcher matcher2 = A03.matcher(strA04);
                                    Matcher extentPercentageMatcher = A0B.matcher(strA04);
                                    boolean zMatches2 = matcher2.matches();
                                    String strA0A4 = A0A(264, 39, 31);
                                    try {
                                        if (zMatches2) {
                                            try {
                                                f3 = Float.parseFloat((String) AbstractC1517es.A01(matcher2.group(1))) / 100.0f;
                                                f4 = Float.parseFloat((String) AbstractC1517es.A01(matcher2.group(2))) / 100.0f;
                                            } catch (NumberFormatException unused2) {
                                                AbstractC1561fb.A07(strA0A, strA0A4 + ((String) strA03));
                                                return null;
                                            }
                                        } else if (extentPercentageMatcher.matches()) {
                                            if (xx == null) {
                                                AbstractC1561fb.A07(strA0A, strA0A3 + ((String) strA03));
                                                return null;
                                            }
                                            int i2 = Integer.parseInt((String) AbstractC1517es.A01(extentPercentageMatcher.group(1)));
                                            int i3 = Integer.parseInt((String) AbstractC1517es.A01(extentPercentageMatcher.group(2)));
                                            int extentWidth = xx.A01;
                                            f3 = i2 / extentWidth;
                                            int extentWidth2 = xx.A00;
                                            f4 = i3 / extentWidth2;
                                        } else {
                                            AbstractC1561fb.A07(strA0A, A0A(383, 41, 113) + ((String) strA03));
                                            return null;
                                        }
                                        int i4 = 0;
                                        strA03 = 1332;
                                        strA0A = A02;
                                        if (strA0A[1].length() != strA0A[0].length()) {
                                            A02[5] = "yPshLpHeDXHuA42gM9T";
                                            strA00 = AbstractC1606gK.A00(xmlPullParser, A0A(1332, 0, 33));
                                            if (strA00 != null) {
                                                strA01 = AbstractC1684hb.A01(strA00);
                                                switch (strA01.hashCode()) {
                                                    case -1364013995:
                                                        if (strA01.equals(A0A(1299, 6, 68))) {
                                                            b2 = -1;
                                                        } else {
                                                            b2 = 0;
                                                        }
                                                        break;
                                                    case 92734940:
                                                        if (strA01.equals(A0A(1209, 5, 91))) {
                                                            b2 = -1;
                                                        } else {
                                                            b2 = 1;
                                                        }
                                                        break;
                                                    default:
                                                        b2 = -1;
                                                        break;
                                                }
                                                switch (b2) {
                                                    case 0:
                                                        i4 = 1;
                                                        float width = f4 / 2.0f;
                                                        f2 += width;
                                                        break;
                                                    case 1:
                                                        i4 = 2;
                                                        f2 += f4;
                                                        break;
                                                }
                                            }
                                        } else {
                                            String[] strArr = A02;
                                            strArr[1] = "pMev3chZQP";
                                            strArr[0] = "MB5dBaadqs";
                                            strA00 = AbstractC1606gK.A00(xmlPullParser, A0A(1332, 12, 90));
                                            if (strA00 != null) {
                                                strA01 = AbstractC1684hb.A01(strA00);
                                                switch (strA01.hashCode()) {
                                                    case -1364013995:
                                                        if (strA01.equals(A0A(1299, 6, 68))) {
                                                            b2 = -1;
                                                        } else {
                                                            b2 = 0;
                                                        }
                                                        break;
                                                    case 92734940:
                                                        if (strA01.equals(A0A(1209, 5, 91))) {
                                                            b2 = -1;
                                                        } else {
                                                            b2 = 1;
                                                        }
                                                        break;
                                                    default:
                                                        b2 = -1;
                                                        break;
                                                }
                                                switch (b2) {
                                                    case 0:
                                                        i4 = 1;
                                                        float width2 = f4 / 2.0f;
                                                        f2 += width2;
                                                        break;
                                                    case 1:
                                                        i4 = 2;
                                                        f2 += f4;
                                                        break;
                                                }
                                            }
                                        }
                                        float width3 = xv.A01;
                                        float f5 = 1.0f / width3;
                                        int i5 = Integer.MIN_VALUE;
                                        String strA05 = AbstractC1606gK.A00(xmlPullParser, A0A(1772, 11, 18));
                                        if (strA05 != null) {
                                            String strA06 = AbstractC1684hb.A01(strA05);
                                            switch (strA06.hashCode()) {
                                                case 3694:
                                                    if (!strA06.equals(A0A(1680, 2, 9))) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 0;
                                                    }
                                                    break;
                                                case 3553396:
                                                    if (!strA06.equals(A0A(1682, 4, 43))) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 1;
                                                    }
                                                    break;
                                                case 3553576:
                                                    if (!strA06.equals(A0A(1686, 4, 120))) {
                                                        b3 = -1;
                                                    }
                                                    break;
                                                default:
                                                    b3 = -1;
                                                    break;
                                            }
                                            switch (b3) {
                                                case 0:
                                                case 1:
                                                    i5 = 2;
                                                    break;
                                                case 2:
                                                    i5 = 1;
                                                    break;
                                            }
                                        }
                                        float regionTextHeight = f3;
                                        float position2 = f;
                                        return new XZ(strA02, position2, f2, 0, i4, regionTextHeight, f4, 1, f5, i5);
                                    } catch (NumberFormatException unused3) {
                                        AbstractC1561fb.A07(strA0A, strA0A4 + strA03);
                                        return null;
                                    }
                                }
                                AbstractC1561fb.A07(strA0A, A0A(465, 33, 6));
                                return null;
                            } catch (NumberFormatException unused4) {
                                AbstractC1561fb.A07(strA0A, strA0A2 + ((String) strA03));
                                return null;
                            }
                        }
                        AbstractC1561fb.A07(strA0A, A0A(498, 33, 89));
                        return null;
                    }

                    public static C1152Xf A08(C1152Xf c1152Xf) {
                        return c1152Xf == null ? new C1152Xf() : c1152Xf;
                    }

                    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
                    /* JADX WARN: Code duplicated, block: B:137:0x03fe  */
                    /* JADX WARN: Code duplicated, block: B:14:0x0057  */
                    /* JADX WARN: Code duplicated, block: B:168:0x01b0 A[SYNTHETIC] */
                    /* JADX WARN: Code duplicated, block: B:198:0x002f A[DONT_GENERATE, SYNTHETIC] */
                    /* JADX WARN: Code duplicated, block: B:200:0x002f A[DONT_GENERATE, SYNTHETIC] */
                    /* JADX WARN: Code duplicated, block: B:32:0x00c3  */
                    /* JADX WARN: Code duplicated, block: B:33:0x00cd  */
                    /* JADX WARN: Code duplicated, block: B:34:0x00d7  */
                    /* JADX WARN: Code duplicated, block: B:35:0x00e1  */
                    /* JADX WARN: Code duplicated, block: B:50:0x013c  */
                    /* JADX WARN: Code duplicated, block: B:53:0x0143  */
                    /* JADX WARN: Code duplicated, block: B:55:0x0156  */
                    /* JADX WARN: Code duplicated, block: B:6:0x0021  */
                    /* JADX WARN: Code duplicated, block: B:78:0x01ed  */
                    /* JADX WARN: Code duplicated, block: B:79:0x01f7  */
                    /* JADX WARN: Code duplicated, block: B:80:0x0201  */
                    public static C1152Xf A09(XmlPullParser xmlPullParser, C1152Xf c1152Xf) {
                        byte b2;
                        C1152Xf c1152XfA08;
                        int i;
                        C1152Xf c1152XfA09 = c1152Xf;
                        int attributeCount = xmlPullParser.getAttributeCount();
                        for (int i2 = 0; i2 < attributeCount; i2++) {
                            String attributeValue = xmlPullParser.getAttributeValue(i2);
                            String attributeName = xmlPullParser.getAttributeName(i2);
                            int attributeCount2 = attributeName.hashCode();
                            byte b3 = 5;
                            byte b4 = 3;
                            byte b5 = -1;
                            switch (attributeCount2) {
                                case -1550943582:
                                    if (attributeName.equals(A0A(1380, 9, 107))) {
                                        b2 = 6;
                                    } else {
                                        b2 = -1;
                                    }
                                    break;
                                case -1224696685:
                                    if (attributeName.equals(A0A(1362, 10, 70))) {
                                        b2 = 3;
                                    } else {
                                        b2 = -1;
                                    }
                                    break;
                                case -1065511464:
                                    if (attributeName.equals(A0A(1694, 9, 98))) {
                                        b2 = 7;
                                    } else {
                                        b2 = -1;
                                    }
                                    break;
                                case -879295043:
                                    if (attributeName.equals(A0A(1727, 14, 93))) {
                                        b2 = 12;
                                    } else {
                                        b2 = -1;
                                    }
                                    break;
                                case -734428249:
                                    if (attributeName.equals(A0A(1389, 10, 109))) {
                                        b2 = 5;
                                    } else {
                                        b2 = -1;
                                    }
                                    break;
                                case 3355:
                                    if (attributeName.equals(A0A(1507, 2, 70))) {
                                        b2 = 0;
                                    } else {
                                        b2 = -1;
                                    }
                                    break;
                                case 3511770:
                                    String[] strArr = A02;
                                    String str2 = strArr[1];
                                    String str3 = strArr[0];
                                    int i3 = str2.length();
                                    int attributeCount3 = str3.length();
                                    if (i3 == attributeCount3) {
                                        A02[3] = "Z9uyz0lMwKhZVu5WVm9RmyRzuNaqrKnm";
                                        if (attributeName.equals(A0A(1624, 4, 19))) {
                                            b2 = 10;
                                        } else {
                                            b2 = -1;
                                        }
                                    } else if (attributeName.equals(A0A(1624, 4, 19))) {
                                        b2 = 10;
                                    } else {
                                        b2 = -1;
                                    }
                                    break;
                                case 94842723:
                                    if (attributeName.equals(A0A(1305, 5, 122))) {
                                        b2 = 2;
                                    } else {
                                        b2 = -1;
                                    }
                                    break;
                                case 109403361:
                                    if (attributeName.equals(A0A(1641, 5, 0))) {
                                        b2 = cw.l;
                                    } else {
                                        b2 = -1;
                                    }
                                    break;
                                case 110138194:
                                    if (attributeName.equals(A0A(1703, 11, 0))) {
                                        b2 = 9;
                                    } else {
                                        b2 = -1;
                                    }
                                    break;
                                case 365601008:
                                    if (attributeName.equals(A0A(1372, 8, 45))) {
                                        b2 = 4;
                                    } else {
                                        b2 = -1;
                                    }
                                    break;
                                case 921125321:
                                    if (attributeName.equals(A0A(1741, 12, 69))) {
                                        b2 = cw.k;
                                    } else {
                                        b2 = -1;
                                    }
                                    break;
                                case 1115953443:
                                    if (attributeName.equals(A0A(1628, 12, 1))) {
                                        b2 = 11;
                                    } else {
                                        b2 = -1;
                                    }
                                    break;
                                case 1287124693:
                                    if (attributeName.equals(A0A(1217, 15, 22))) {
                                        b2 = 1;
                                    } else {
                                        b2 = -1;
                                    }
                                    break;
                                case 1754920356:
                                    if (attributeName.equals(A0A(1563, 13, 123))) {
                                        b2 = 8;
                                    } else {
                                        b2 = -1;
                                    }
                                    break;
                                default:
                                    b2 = -1;
                                    break;
                            }
                            String strA0A = A0A(892, 11, 120);
                            switch (b2) {
                                case 0:
                                    if (A0A(1655, 5, 75).equals(xmlPullParser.getName())) {
                                        c1152XfA09 = A08(c1152XfA09).A0Q(attributeValue);
                                    }
                                    break;
                                case 1:
                                    c1152XfA09 = A08(c1152XfA09);
                                    try {
                                        int attributeCount4 = AbstractC1526f1.A01(attributeValue);
                                        c1152XfA09.A0G(attributeCount4);
                                    } catch (IllegalArgumentException unused) {
                                        AbstractC1561fb.A07(strA0A, A0A(51, 33, 91) + attributeValue);
                                    }
                                    break;
                                case 2:
                                    c1152XfA09 = A08(c1152XfA09);
                                    try {
                                        int attributeCount5 = AbstractC1526f1.A01(attributeValue);
                                        c1152XfA09.A0H(attributeCount5);
                                    } catch (IllegalArgumentException unused2) {
                                        AbstractC1561fb.A07(strA0A, A0A(84, 28, 91) + attributeValue);
                                    }
                                    break;
                                case 3:
                                    c1152XfA09 = A08(c1152XfA09).A0P(attributeValue);
                                    break;
                                case 4:
                                    try {
                                        c1152XfA09 = A08(c1152XfA09);
                                        A0D(attributeValue, c1152XfA09);
                                    } catch (TP unused3) {
                                        AbstractC1561fb.A07(strA0A, A0A(112, 31, 110) + attributeValue);
                                    }
                                    break;
                                case 5:
                                    c1152XfA09 = A08(c1152XfA09).A0R(A0A(1279, 4, 40).equalsIgnoreCase(attributeValue));
                                    break;
                                case 6:
                                    c1152XfA09 = A08(c1152XfA09).A0S(A0A(1525, 6, 10).equalsIgnoreCase(attributeValue));
                                    break;
                                case 7:
                                    c1152XfA09 = A08(c1152XfA09).A0M(A02(attributeValue));
                                    break;
                                case 8:
                                    c1152XfA09 = A08(c1152XfA09).A0L(A02(attributeValue));
                                    break;
                                case 9:
                                    String strA01 = AbstractC1684hb.A01(attributeValue);
                                    int attributeCount6 = strA01.hashCode();
                                    switch (attributeCount6) {
                                        case 96673:
                                            if (strA01.equals(A0A(1214, 3, 33))) {
                                                b5 = 1;
                                            }
                                            break;
                                        case 3387192:
                                            if (strA01.equals(A0A(1589, 4, 61))) {
                                                b5 = 0;
                                            }
                                            break;
                                    }
                                    switch (b5) {
                                        case 0:
                                            c1152XfA09 = A08(c1152XfA09).A0U(false);
                                            break;
                                        case 1:
                                            c1152XfA09 = A08(c1152XfA09).A0U(true);
                                            break;
                                    }
                                    break;
                                case 10:
                                    String strA02 = AbstractC1684hb.A01(attributeValue);
                                    int attributeCount7 = strA02.hashCode();
                                    switch (attributeCount7) {
                                        case -618561360:
                                            if (strA02.equals(A0A(1251, 13, 97))) {
                                                b3 = 2;
                                            } else {
                                                b3 = -1;
                                            }
                                            switch (b3) {
                                                case 0:
                                                    c1152XfA09 = A08(c1152XfA09).A0K(1);
                                                    break;
                                                case 1:
                                                case 2:
                                                    c1152XfA09 = A08(c1152XfA09).A0K(2);
                                                    break;
                                                case 3:
                                                case 4:
                                                    c1152XfA08 = A08(c1152XfA09);
                                                    i = A02[3].charAt(27);
                                                    if (i != 107) {
                                                        throw new RuntimeException();
                                                    }
                                                    A02[5] = "sp4iAD0CawBQtSVCmak";
                                                    c1152XfA09 = c1152XfA08.A0K(3);
                                                    break;
                                                    break;
                                                case 5:
                                                    c1152XfA09 = A08(c1152XfA09).A0K(4);
                                                    break;
                                            }
                                            break;
                                        case -410956671:
                                            if (strA02.equals(A0A(1310, 9, 16))) {
                                                b3 = 0;
                                            } else {
                                                b3 = -1;
                                            }
                                            switch (b3) {
                                                case 0:
                                                    c1152XfA09 = A08(c1152XfA09).A0K(1);
                                                    break;
                                                case 1:
                                                case 2:
                                                    c1152XfA09 = A08(c1152XfA09).A0K(2);
                                                    break;
                                                case 3:
                                                case 4:
                                                    c1152XfA08 = A08(c1152XfA09);
                                                    i = A02[3].charAt(27);
                                                    if (i != 107) {
                                                        throw new RuntimeException();
                                                    }
                                                    A02[5] = "sp4iAD0CawBQtSVCmak";
                                                    c1152XfA09 = c1152XfA08.A0K(3);
                                                    break;
                                                    break;
                                                case 5:
                                                    c1152XfA09 = A08(c1152XfA09).A0K(4);
                                                    break;
                                            }
                                            break;
                                        case -250518009:
                                            String strA0A2 = A0A(1323, 9, 0);
                                            int i4 = A02[5].length();
                                            if (i4 == 19) {
                                                A02[5] = "sAIZ7viPxyZdy9DdV4b";
                                                if (!strA02.equals(strA0A2)) {
                                                    b3 = -1;
                                                }
                                                switch (b3) {
                                                    case 0:
                                                        c1152XfA09 = A08(c1152XfA09).A0K(1);
                                                        break;
                                                    case 1:
                                                    case 2:
                                                        c1152XfA09 = A08(c1152XfA09).A0K(2);
                                                        break;
                                                    case 3:
                                                    case 4:
                                                        c1152XfA08 = A08(c1152XfA09);
                                                        i = A02[3].charAt(27);
                                                        if (i != 107) {
                                                            A02[5] = "sp4iAD0CawBQtSVCmak";
                                                            c1152XfA09 = c1152XfA08.A0K(3);
                                                        }
                                                        break;
                                                    case 5:
                                                        c1152XfA09 = A08(c1152XfA09).A0K(4);
                                                        break;
                                                }
                                            }
                                            throw new RuntimeException();
                                        case -136074796:
                                            if (strA02.equals(A0A(1714, 13, 21))) {
                                                b3 = 4;
                                            } else {
                                                b3 = -1;
                                            }
                                            switch (b3) {
                                                case 0:
                                                    c1152XfA09 = A08(c1152XfA09).A0K(1);
                                                    break;
                                                case 1:
                                                case 2:
                                                    c1152XfA09 = A08(c1152XfA09).A0K(2);
                                                    break;
                                                case 3:
                                                case 4:
                                                    c1152XfA08 = A08(c1152XfA09);
                                                    i = A02[3].charAt(27);
                                                    if (i != 107) {
                                                        throw new RuntimeException();
                                                    }
                                                    A02[5] = "sp4iAD0CawBQtSVCmak";
                                                    c1152XfA09 = c1152XfA08.A0K(3);
                                                    break;
                                                    break;
                                                case 5:
                                                    c1152XfA09 = A08(c1152XfA09).A0K(4);
                                                    break;
                                            }
                                            break;
                                        case 3016401:
                                            if (strA02.equals(A0A(1247, 4, 12))) {
                                                b3 = 1;
                                            } else {
                                                b3 = -1;
                                            }
                                            switch (b3) {
                                                case 0:
                                                    c1152XfA09 = A08(c1152XfA09).A0K(1);
                                                    break;
                                                case 1:
                                                case 2:
                                                    c1152XfA09 = A08(c1152XfA09).A0K(2);
                                                    break;
                                                case 3:
                                                case 4:
                                                    c1152XfA08 = A08(c1152XfA09);
                                                    i = A02[3].charAt(27);
                                                    if (i != 107) {
                                                        throw new RuntimeException();
                                                    }
                                                    A02[5] = "sp4iAD0CawBQtSVCmak";
                                                    c1152XfA09 = c1152XfA08.A0K(3);
                                                    break;
                                                    break;
                                                case 5:
                                                    c1152XfA09 = A08(c1152XfA09).A0K(4);
                                                    break;
                                            }
                                            break;
                                        case 3556653:
                                            if (strA02.equals(A0A(1690, 4, 17))) {
                                                b3 = 3;
                                            } else {
                                                b3 = -1;
                                            }
                                            switch (b3) {
                                                case 0:
                                                    c1152XfA09 = A08(c1152XfA09).A0K(1);
                                                    break;
                                                case 1:
                                                case 2:
                                                    c1152XfA09 = A08(c1152XfA09).A0K(2);
                                                    break;
                                                case 3:
                                                case 4:
                                                    c1152XfA08 = A08(c1152XfA09);
                                                    i = A02[3].charAt(27);
                                                    if (i != 107) {
                                                        throw new RuntimeException();
                                                    }
                                                    A02[5] = "sp4iAD0CawBQtSVCmak";
                                                    c1152XfA09 = c1152XfA08.A0K(3);
                                                    break;
                                                    break;
                                                case 5:
                                                    c1152XfA09 = A08(c1152XfA09).A0K(4);
                                                    break;
                                            }
                                            break;
                                        default:
                                            b3 = -1;
                                            switch (b3) {
                                                case 0:
                                                    c1152XfA09 = A08(c1152XfA09).A0K(1);
                                                    break;
                                                case 1:
                                                case 2:
                                                    c1152XfA09 = A08(c1152XfA09).A0K(2);
                                                    break;
                                                case 3:
                                                case 4:
                                                    c1152XfA08 = A08(c1152XfA09);
                                                    i = A02[3].charAt(27);
                                                    if (i != 107) {
                                                        throw new RuntimeException();
                                                    }
                                                    A02[5] = "sp4iAD0CawBQtSVCmak";
                                                    c1152XfA09 = c1152XfA08.A0K(3);
                                                    break;
                                                    break;
                                                case 5:
                                                    c1152XfA09 = A08(c1152XfA09).A0K(4);
                                                    break;
                                            }
                                            break;
                                    }
                                    break;
                                case 11:
                                    String strA03 = AbstractC1684hb.A01(attributeValue);
                                    int attributeCount8 = strA03.hashCode();
                                    switch (attributeCount8) {
                                        case -1392885889:
                                            if (strA03.equals(A0A(1264, 6, 75))) {
                                                b5 = 0;
                                            }
                                            break;
                                        case 92734940:
                                            if (strA03.equals(A0A(1209, 5, 91))) {
                                                b5 = 1;
                                            }
                                            break;
                                    }
                                    switch (b5) {
                                        case 0:
                                            c1152XfA09 = A08(c1152XfA09).A0J(1);
                                            break;
                                        case 1:
                                            c1152XfA09 = A08(c1152XfA09).A0J(2);
                                            break;
                                    }
                                    break;
                                case 12:
                                    String strA04 = AbstractC1684hb.A01(attributeValue);
                                    int attributeCount9 = strA04.hashCode();
                                    switch (attributeCount9) {
                                        case -1461280213:
                                            String[] strArr2 = A02;
                                            String str4 = strArr2[1];
                                            String str5 = strArr2[0];
                                            int i5 = str4.length();
                                            int attributeCount10 = str5.length();
                                            if (i5 == attributeCount10) {
                                                String[] strArr3 = A02;
                                                strArr3[1] = "YPZiKMTKnb";
                                                strArr3[0] = "3xe2DIORb4";
                                                if (!strA04.equals(A0A(1593, 11, 36))) {
                                                    b4 = -1;
                                                }
                                                switch (b4) {
                                                    case 0:
                                                        c1152XfA09 = A08(c1152XfA09).A0T(true);
                                                        break;
                                                    case 1:
                                                        c1152XfA09 = A08(c1152XfA09).A0T(false);
                                                        break;
                                                    case 2:
                                                        c1152XfA09 = A08(c1152XfA09).A0V(true);
                                                        break;
                                                    case 3:
                                                        c1152XfA09 = A08(c1152XfA09).A0V(false);
                                                        break;
                                                }
                                            } else {
                                                throw new RuntimeException();
                                            }
                                            break;
                                        case -1026963764:
                                            if (strA04.equals(A0A(1763, 9, 78))) {
                                                b4 = 2;
                                            } else {
                                                b4 = -1;
                                            }
                                            switch (b4) {
                                                case 0:
                                                    c1152XfA09 = A08(c1152XfA09).A0T(true);
                                                    break;
                                                case 1:
                                                    c1152XfA09 = A08(c1152XfA09).A0T(false);
                                                    break;
                                                case 2:
                                                    c1152XfA09 = A08(c1152XfA09).A0V(true);
                                                    break;
                                                case 3:
                                                    c1152XfA09 = A08(c1152XfA09).A0V(false);
                                                    break;
                                            }
                                            break;
                                        case 913457136:
                                            if (strA04.equals(A0A(1576, 13, 53))) {
                                                b4 = 1;
                                            } else {
                                                b4 = -1;
                                            }
                                            switch (b4) {
                                                case 0:
                                                    c1152XfA09 = A08(c1152XfA09).A0T(true);
                                                    break;
                                                case 1:
                                                    c1152XfA09 = A08(c1152XfA09).A0T(false);
                                                    break;
                                                case 2:
                                                    c1152XfA09 = A08(c1152XfA09).A0V(true);
                                                    break;
                                                case 3:
                                                    c1152XfA09 = A08(c1152XfA09).A0V(false);
                                                    break;
                                            }
                                            break;
                                        case 1679736913:
                                            if (strA04.equals(A0A(1541, 11, 56))) {
                                                b4 = 0;
                                            } else {
                                                b4 = -1;
                                            }
                                            switch (b4) {
                                                case 0:
                                                    c1152XfA09 = A08(c1152XfA09).A0T(true);
                                                    break;
                                                case 1:
                                                    c1152XfA09 = A08(c1152XfA09).A0T(false);
                                                    break;
                                                case 2:
                                                    c1152XfA09 = A08(c1152XfA09).A0V(true);
                                                    break;
                                                case 3:
                                                    c1152XfA09 = A08(c1152XfA09).A0V(false);
                                                    break;
                                            }
                                            break;
                                        default:
                                            b4 = -1;
                                            switch (b4) {
                                                case 0:
                                                    c1152XfA09 = A08(c1152XfA09).A0T(true);
                                                    break;
                                                case 1:
                                                    c1152XfA09 = A08(c1152XfA09).A0T(false);
                                                    break;
                                                case 2:
                                                    c1152XfA09 = A08(c1152XfA09).A0V(true);
                                                    break;
                                                case 3:
                                                    c1152XfA09 = A08(c1152XfA09).A0V(false);
                                                    break;
                                            }
                                            break;
                                    }
                                    break;
                                case 13:
                                    c1152XfA09 = A08(c1152XfA09).A0N(XU.A01(attributeValue));
                                    break;
                                case 14:
                                    c1152XfA09 = A08(c1152XfA09).A0F(A00(attributeValue));
                                    break;
                            }
                        }
                        return c1152XfA09;
                    }

                    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
                    /* JADX WARN: Code duplicated, block: B:11:0x0058  */
                    /* JADX WARN: Code duplicated, block: B:19:0x00ae  */
                    public static void A0D(String str2, C1152Xf c1152Xf) throws TP {
                        Matcher matcher;
                        byte b2;
                        String[] strArrA1O = AbstractC1600gE.A1O(str2, A0A(962, 3, 45));
                        if (strArrA1O.length == 1) {
                            Pattern pattern = A09;
                            String[] strArr = A02;
                            if (strArr[2].charAt(10) == strArr[6].charAt(10)) {
                                throw new RuntimeException();
                            }
                            String[] strArr2 = A02;
                            strArr2[7] = "5DkFsT";
                            strArr2[4] = "JPVG55SCSAfbSrxWvsFXa7t5E";
                            matcher = pattern.matcher(str2);
                        } else if (strArrA1O.length == 2) {
                            matcher = A09.matcher(strArrA1O[1]);
                            AbstractC1561fb.A07(A0A(892, 11, 120), A0A(735, 110, EnumC4719u30.ASSET_FAILED_STATUS_CODE_VALUE));
                        } else {
                            throw new TP(A0A(615, 40, 49) + strArrA1O.length + A0A(5, 1, 67));
                        }
                        boolean zMatches = matcher.matches();
                        String strA0A = A0A(3, 2, 84);
                        if (zMatches) {
                            String str3 = (String) AbstractC1517es.A01(matcher.group(3));
                            switch (str3.hashCode()) {
                                case 37:
                                    if (!str3.equals(A0A(2, 1, 35))) {
                                        b2 = -1;
                                    } else {
                                        b2 = 2;
                                    }
                                    break;
                                case 3240:
                                    if (!str3.equals(A0A(1350, 2, 74))) {
                                        b2 = -1;
                                    } else {
                                        b2 = 1;
                                    }
                                    break;
                                case 3592:
                                    boolean zEquals = str3.equals(A0A(1611, 2, 84));
                                    String[] strArr3 = A02;
                                    if (strArr3[7].length() == strArr3[4].length()) {
                                        String[] strArr4 = A02;
                                        strArr4[1] = "wFsFDdO1h5";
                                        strArr4[0] = "kmTd4lrDXN";
                                        if (!zEquals) {
                                            b2 = -1;
                                        } else {
                                            b2 = 0;
                                        }
                                    } else {
                                        String[] strArr5 = A02;
                                        strArr5[1] = "5nGrAlb1dN";
                                        strArr5[0] = "Oa0RG3fNcB";
                                        if (!zEquals) {
                                            b2 = -1;
                                        } else {
                                            b2 = 0;
                                        }
                                    }
                                    break;
                                default:
                                    b2 = -1;
                                    break;
                            }
                            switch (b2) {
                                case 0:
                                    c1152Xf.A0I(1);
                                    break;
                                case 1:
                                    c1152Xf.A0I(2);
                                    break;
                                case 2:
                                    c1152Xf.A0I(3);
                                    break;
                                default:
                                    throw new TP(A0A(655, 28, 19) + str3 + strA0A);
                            }
                            c1152Xf.A0E(Float.parseFloat((String) AbstractC1517es.A01(matcher.group(1))));
                            return;
                        }
                        throw new TP(A0A(581, 34, 50) + str2 + strA0A);
                    }

                    public static void A0E(XmlPullParser xmlPullParser, Map<String, String> map) throws XmlPullParserException, IOException {
                        String encodedBitmapData;
                        do {
                            xmlPullParser.next();
                            if (AbstractC1606gK.A04(xmlPullParser, A0A(1509, 5, 109)) && (encodedBitmapData = AbstractC1606gK.A00(xmlPullParser, A0A(1507, 2, 70))) != null) {
                                String id = xmlPullParser.nextText();
                                map.put(encodedBitmapData, id);
                            }
                        } while (!AbstractC1606gK.A03(xmlPullParser, A0A(1553, 8, 18)));
                    }

                    /* JADX WARN: Code duplicated, block: B:39:0x013d  */
                    /* JADX WARN: Code duplicated, block: B:41:0x014b  */
                    /* JADX WARN: Code duplicated, block: B:43:0x016d  */
                    /* JADX WARN: Code duplicated, block: B:47:0x017d A[RETURN, SYNTHETIC] */
                    public static boolean A0F(String str2) {
                        boolean zEquals;
                        String[] strArr;
                        if (!str2.equals(A0A(1761, 2, 16)) && !str2.equals(A0A(1468, 4, 99)) && !str2.equals(A0A(1275, 4, 46)) && !str2.equals(A0A(1344, 3, 53))) {
                            String[] strArr2 = A02;
                            if (strArr2[1].length() == strArr2[0].length()) {
                                A02[5] = "4hgo6v8UoTOwtbXz2ln";
                                if (!str2.equals(A0A(1610, 1, 74))) {
                                    String strA0A = A0A(1646, 4, 48);
                                    String[] strArr3 = A02;
                                    if (strArr3[1].length() == strArr3[0].length()) {
                                        String[] strArr4 = A02;
                                        strArr4[1] = "WbAJWKN6v2";
                                        strArr4[0] = "Qn4rzvOrEs";
                                        if (!str2.equals(strA0A) && !str2.equals(A0A(GL32.GL_STACK_OVERFLOW, 2, 90)) && !str2.equals(A0A(1655, 5, 75)) && !str2.equals(A0A(1660, 7, 8)) && !str2.equals(A0A(1531, 6, 79)) && !str2.equals(A0A(1613, 6, 21))) {
                                            String[] strArr5 = A02;
                                            if (strArr5[2].charAt(10) == strArr5[6].charAt(10)) {
                                                throw new RuntimeException();
                                            }
                                            String[] strArr6 = A02;
                                            strArr6[1] = "S0H5tKiU2I";
                                            strArr6[0] = "bpBgwwDRnX";
                                            if (!str2.equals(A0A(1553, 8, 18))) {
                                                String[] strArr7 = A02;
                                                if (strArr7[2].charAt(10) != strArr7[6].charAt(10)) {
                                                    A02[3] = "AKxjjEq8ZaJGJpqzr4k9ah9SpTlcW0BN";
                                                    if (!str2.equals(A0A(1509, 5, 109))) {
                                                        if (!str2.equals(A0A(1319, 4, 3))) {
                                                            zEquals = str2.equals(A0A(1514, 11, 72));
                                                            strArr = A02;
                                                            if (strArr[2].charAt(10) != strArr[6].charAt(10)) {
                                                                String[] strArr8 = A02;
                                                                strArr8[2] = "7O0IOsseQh6lkxvLI83590t9BAvjBS5v";
                                                                strArr8[6] = "FM0JqcQPZ7bZjX09PcPCkxkNHBWlt1ma";
                                                                if (zEquals) {
                                                                    return false;
                                                                }
                                                            }
                                                        }
                                                    }
                                                } else if (!str2.equals(A0A(1509, 5, 109))) {
                                                    if (!str2.equals(A0A(1319, 4, 3))) {
                                                        zEquals = str2.equals(A0A(1514, 11, 72));
                                                        strArr = A02;
                                                        if (strArr[2].charAt(10) != strArr[6].charAt(10)) {
                                                            String[] strArr9 = A02;
                                                            strArr9[2] = "7O0IOsseQh6lkxvLI83590t9BAvjBS5v";
                                                            strArr9[6] = "FM0JqcQPZ7bZjX09PcPCkxkNHBWlt1ma";
                                                            if (zEquals) {
                                                                return false;
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            throw new RuntimeException();
                        }
                        return true;
                    }

                    public static String[] A0G(String str2) {
                        String strTrim = str2.trim();
                        return strTrim.isEmpty() ? new String[0] : AbstractC1600gE.A1O(strTrim, A0A(962, 3, 45));
                    }
                };
            case 4:
                return new C9H() { // from class: com.facebook.ads.redexgen.X.15
                    public static byte[] A02;
                    public static String[] A03 = {"r0lvJnOtFsJYK3x7gv5UYsJt", "VnF0k8U4ciJNxofgyTFSw3ccewRsZ47c", "fsuLcvRVsxZ2rTEanaVbOEJgUgKa", "QCGBAuDyIUZCTGV3FkvzsXKkZw9xaMeV", "OBeJQ0r261EMvG6aZEiLMqDObptxiaWl", "6bEtBbKNi7pz22WioFbPg3IQaruhrnje", "Qr6WKkyKIx3Is0W", "mwHS4icgD9kJKck1jhl6DgteGwyFGZ"};
                    public static final Pattern A04;
                    public static final Pattern A05;
                    public final StringBuilder A00;
                    public final ArrayList<String> A01;

                    public static String A03(int i, int i2, int i3) {
                        byte[] bArrCopyOfRange = Arrays.copyOfRange(A02, i, i + i2);
                        int i4 = 0;
                        while (true) {
                            int length = bArrCopyOfRange.length;
                            if (A03[6].length() != 15) {
                                throw new RuntimeException();
                            }
                            A03[0] = "zSIjhaz4vBPnq489uoCd6Qdj";
                            if (i4 >= length) {
                                return new String(bArrCopyOfRange);
                            }
                            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 88);
                            i4++;
                        }
                    }

                    public static void A06() {
                        A02 = new byte[]{-73, -35, -19, -71, -75, -51, -53, -46, -46, -53, -48, -55, -126, -53, -48, -40, -61, -50, -53, -58, -126, -53, -48, -58, -57, -38, -100, -126, cw.n, 40, 38, 45, 45, 38, 43, 36, -35, 38, 43, 51, 30, 41, 38, 33, -35, 49, 38, 42, 38, 43, 36, -9, -35, cw.n, 50, 31, 47, 38, 45, 1, 34, 32, 44, 33, 34, 47, -58, -33, -42, -23, -31, -42, -44, -27, -42, -43, -111, -42, -33, -43, 38, 61, -12, -14, -14, 9, 4, -14, 38, 46, -11, -13, 4, -13, 9, -14, 38, 46, -11, -13, 4, -14, 38, 46, -11, -13, -14, 9, 4, -10, -14, 38, 46, -11, -13, -13, 9, -13, 38, 61, -12, -9, -9, 8, 38, 61, -12, -14, -14, 9, 4, -14, 38, 46, -11, -13, 4, -13, 9, -14, 38, 46, -11, -13, 4, -14, 38, 46, -11, -13, -14, 9, 4, -10, -14, 38, 46, -11, -13, -13, 9, -13, 38, 61, -12, -50, -19, -50, -50, -96, -100, -79, -50, -17, -22, 9, -22, -22, -17, -4, -23, -65, -69, -57, -21, -22, 11, 32, 1, 6, 19, -42, 34, 33, 2, 7, 20, -40, 35, 43, 12, 17, 30, -29, 45, 75, 44, 49, 62, 4, 77, 72, 41, 46, 59, 2, 74, 43, 12, 17, 30, -26, 45, -17, -48, -43, -30, -85, -15, 39, 8, cw.k, 26, -28, 41, -8, -39, -34, -21, -74, -6};
                    }

                    static {
                        A06();
                        A05 = Pattern.compile(A03(80, 85, 114));
                        A04 = Pattern.compile(A03(165, 9, 26));
                    }

                    {
                        A03(53, 13, 101);
                        this.A00 = new StringBuilder();
                        this.A01 = new ArrayList<>();
                    }

                    public static float A00(int i) {
                        switch (i) {
                            case 0:
                                return 0.08f;
                            case 1:
                                return 0.5f;
                            case 2:
                                return 0.92f;
                            default:
                                throw new IllegalArgumentException();
                        }
                    }

                    public static long A01(Matcher matcher, int i) {
                        long j;
                        String hours = matcher.group(i + 1);
                        if (hours != null) {
                            j = Long.parseLong(hours) * 60 * 60 * 1000;
                        } else {
                            j = 0;
                        }
                        long j2 = j + (Long.parseLong((String) AbstractC1517es.A01(matcher.group(i + 2))) * 60 * 1000) + (Long.parseLong((String) AbstractC1517es.A01(matcher.group(i + 3))) * 1000);
                        String hours2 = matcher.group(i + 4);
                        if (hours2 != null) {
                            j2 += Long.parseLong(hours2);
                        }
                        return 1000 * j2;
                    }

                    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
                    /* JADX WARN: Code duplicated, block: B:13:0x007d  */
                    /* JADX WARN: Code duplicated, block: B:8:0x006f  */
                    private C0982Qh A02(Spanned spanned, String str2) {
                        byte b2;
                        byte b3;
                        C1374cY c1374cYA0G = new C1374cY().A0G(spanned);
                        if (str2 == null) {
                            return c1374cYA0G.A0H();
                        }
                        int iHashCode = str2.hashCode();
                        String strA03 = A03(235, 6, 37);
                        String strA04 = A03(229, 6, 84);
                        String strA05 = A03(EnumC4719u30.STALE_CACHED_RESPONSE_VALUE, 6, 28);
                        String strA06 = A03(EnumC4719u30.AD_RESPONSE_TIMED_OUT_VALUE, 6, 88);
                        String strA07 = A03(211, 6, EnumC4719u30.ASSET_FAILED_STATUS_CODE_VALUE);
                        String strA08 = A03(205, 6, 120);
                        String strA09 = A03(199, 6, 88);
                        String strA010 = A03(Input.Keys.F23, 6, 78);
                        String strA011 = A03(Input.Keys.F17, 6, 77);
                        switch (iHashCode) {
                            case -685620710:
                                if (!str2.equals(strA011)) {
                                    b2 = -1;
                                } else {
                                    b2 = 0;
                                }
                                break;
                            case -685620679:
                                if (!str2.equals(strA010)) {
                                    b2 = -1;
                                } else {
                                    b2 = 6;
                                }
                                break;
                            case -685620648:
                                if (!str2.equals(strA09)) {
                                    b2 = -1;
                                } else {
                                    b2 = 3;
                                }
                                break;
                            case -685620617:
                                if (!str2.equals(strA08)) {
                                    b2 = -1;
                                } else {
                                    b2 = 1;
                                }
                                break;
                            case -685620586:
                                if (!str2.equals(strA07)) {
                                    b2 = -1;
                                } else {
                                    b2 = 7;
                                }
                                break;
                            case -685620555:
                                if (!str2.equals(strA06)) {
                                    b2 = -1;
                                } else {
                                    b2 = 4;
                                }
                                break;
                            case -685620524:
                                if (!str2.equals(strA05)) {
                                    b2 = -1;
                                } else {
                                    b2 = 2;
                                }
                                break;
                            case -685620493:
                                if (!str2.equals(strA04)) {
                                    b2 = -1;
                                } else {
                                    b2 = 8;
                                }
                                break;
                            case -685620462:
                                if (!str2.equals(strA03)) {
                                    b2 = -1;
                                } else {
                                    b2 = 5;
                                }
                                break;
                            default:
                                b2 = -1;
                                break;
                        }
                        switch (b2) {
                            case 0:
                            case 1:
                            case 2:
                                c1374cYA0G.A0A(0);
                                break;
                            case 3:
                            case 4:
                            case 5:
                                c1374cYA0G.A0A(2);
                                break;
                            default:
                                c1374cYA0G.A0A(1);
                                break;
                        }
                        switch (str2.hashCode()) {
                            case -685620710:
                                if (!str2.equals(strA011)) {
                                    b3 = -1;
                                } else {
                                    b3 = 0;
                                }
                                break;
                            case -685620679:
                                if (!str2.equals(strA010)) {
                                    b3 = -1;
                                } else {
                                    b3 = 1;
                                }
                                break;
                            case -685620648:
                                if (!str2.equals(strA09)) {
                                    b3 = -1;
                                } else {
                                    b3 = 2;
                                }
                                break;
                            case -685620617:
                                if (!str2.equals(strA08)) {
                                    b3 = -1;
                                } else {
                                    b3 = 6;
                                }
                                break;
                            case -685620586:
                                if (!str2.equals(strA07)) {
                                    b3 = -1;
                                } else {
                                    b3 = 7;
                                }
                                break;
                            case -685620555:
                                if (!str2.equals(strA06)) {
                                    b3 = -1;
                                } else {
                                    b3 = 8;
                                }
                                break;
                            case -685620524:
                                if (!str2.equals(strA05)) {
                                    b3 = -1;
                                } else {
                                    b3 = 3;
                                }
                                break;
                            case -685620493:
                                if (!str2.equals(strA04)) {
                                    b3 = -1;
                                } else {
                                    b3 = 4;
                                }
                                break;
                            case -685620462:
                                if (!str2.equals(strA03)) {
                                    b3 = -1;
                                } else {
                                    b3 = 5;
                                }
                                break;
                            default:
                                b3 = -1;
                                break;
                        }
                        switch (b3) {
                            case 0:
                            case 1:
                            case 2:
                                c1374cYA0G.A09(2);
                                break;
                            case 3:
                            case 4:
                            case 5:
                                c1374cYA0G.A09(0);
                                break;
                            default:
                                c1374cYA0G.A09(1);
                                break;
                        }
                        return c1374cYA0G.A04(A00(c1374cYA0G.A01())).A07(A00(c1374cYA0G.A00()), 0).A0H();
                    }

                    private String A04(String str2, ArrayList<String> arrayList) {
                        String strTrim = str2.trim();
                        int i = 0;
                        StringBuilder sb = new StringBuilder(strTrim);
                        Matcher matcher = A04.matcher(strTrim);
                        while (matcher.find()) {
                            String strGroup = matcher.group();
                            arrayList.add(strGroup);
                            int tagLength = matcher.start() - i;
                            int start = strGroup.length();
                            sb.replace(tagLength, tagLength + start, A03(0, 0, 81));
                            i += start;
                        }
                        return sb.toString();
                    }

                    private Charset A05(C1576fq c1576fq) {
                        Charset charset = c1576fq.A0Z();
                        return charset != null ? charset : AbstractC1686hd.A06;
                    }

                    @Override // com.facebook.ads.redexgen.core.C9H
                    public final InterfaceC1142Wv A0g(byte[] bArr, int i, boolean z) {
                        String strA03 = A03(53, 13, 101);
                        ArrayList arrayList = new ArrayList();
                        C1562fc c1562fc = new C1562fc();
                        C1576fq c1576fq = new C1576fq(bArr, i);
                        Charset charsetA05 = A05(c1576fq);
                        while (true) {
                            String strA0Y = c1576fq.A0Y(charsetA05);
                            if (strA0Y == null) {
                                break;
                            }
                            if (strA0Y.length() != 0) {
                                try {
                                    Integer.parseInt(strA0Y);
                                    String strA0Y2 = c1576fq.A0Y(charsetA05);
                                    if (strA0Y2 == null) {
                                        AbstractC1561fb.A07(strA03, A03(66, 14, 25));
                                        break;
                                    }
                                    Matcher matcher = A05.matcher(strA0Y2);
                                    if (matcher.matches()) {
                                        c1562fc.A04(A01(matcher, 1));
                                        c1562fc.A04(A01(matcher, 6));
                                        this.A00.setLength(0);
                                        this.A01.clear();
                                        for (String strA0Y3 = c1576fq.A0Y(charsetA05); !TextUtils.isEmpty(strA0Y3); strA0Y3 = c1576fq.A0Y(charsetA05)) {
                                            if (this.A00.length() > 0) {
                                                this.A00.append(A03(0, 4, 35));
                                            }
                                            this.A00.append(A04(strA0Y3, this.A01));
                                        }
                                        Spanned spannedFromHtml = Html.fromHtml(this.A00.toString());
                                        String tag = null;
                                        for (int i2 = 0; i2 < this.A01.size(); i2++) {
                                            String alignmentTag = this.A01.get(i2);
                                            if (alignmentTag.matches(A03(174, 13, 54))) {
                                                tag = alignmentTag;
                                                break;
                                            }
                                        }
                                        arrayList.add(A02(spannedFromHtml, tag));
                                        arrayList.add(C0982Qh.A0J);
                                    } else {
                                        AbstractC1561fb.A07(strA03, A03(28, 25, 101) + strA0Y2);
                                    }
                                } catch (NumberFormatException unused) {
                                    AbstractC1561fb.A07(strA03, A03(4, 24, 10) + strA0Y);
                                }
                            }
                        }
                        return new TE((C0982Qh[]) arrayList.toArray(new C0982Qh[0]), c1562fc.A05());
                    }
                };
            case 5:
                final List<byte[]> list = zm.A0X;
                return new C9H(list) { // from class: com.facebook.ads.redexgen.X.13
                    public static byte[] A07;
                    public static String[] A08 = {"4nF1dTtIX3QnzMxvvIR5aopWZNFG9yDN", "Y8RTti4nXUK0nEdE8bWaci3m0qNna248", "58YTL7XhNvjiCRHekJO1CYmqJdxHYEXu", "gDEv", "6rRwIeqgl0WcUS7bB4hYCkyvDII6nojb", "MyrFlppseoEGeBwaNCUBXPAkDL1HGVTr", "speOLcH8eSHVdHbPwc4PeGY", "3EYION9j3S6IQWmDu"};
                    public final float A00;
                    public final int A01;
                    public final int A02;
                    public final int A03;
                    public final C1576fq A04;
                    public final String A05;
                    public final boolean A06;

                    public static String A00(int i, int i2, int i3) {
                        byte[] bArrCopyOfRange = Arrays.copyOfRange(A07, i, i + i2);
                        int i4 = 0;
                        while (true) {
                            int length = bArrCopyOfRange.length;
                            if (A08[0].charAt(11) != 'n') {
                                throw new RuntimeException();
                            }
                            A08[1] = "cVVetBd2EeYS1iwNAfZ2T43nKXQx9HbA";
                            if (i4 >= length) {
                                return new String(bArrCopyOfRange);
                            }
                            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 93);
                            i4++;
                        }
                    }

                    public static void A02() {
                        A07 = new byte[]{-44, -53, -23, -24, -53, cw.n, 25, cw.m, -53, -45, -2, -11, 73, 68, -11, 56, 74, 58, 41, 58, 77, 73, 3, 65, 58, 67, 60, 73, 61, -3, -2, -11, -3, -82, -77, 37, 67, 74, 75, 78, 69, 74, 67, -4, 79, 80, 85, 72, -4, 83, 69, 80, 68, -4, 79, 80, 61, 78, 80, -4, 4, 30, 48, 61, 52, 49, 0, 30, 33, 26, cw.m, cw.k, 32, 21, 26, 19, -52, 31, 32, 37, 24, -52, 17, 26, cw.n, -52, -44, 1, 37, -32, 20, -15, 18, cw.n, 28, 17, 18, 31, -58, -33, -42, -23, -31, -42, -44, -27, -42, -43, -111, -28, -26, -45, -27, -38, -27, -35, -42, -111, -41, -32, -29, -34, -46, -27, -97, 54, 36, 49, 54, -16, 54, 40, 53, 44, 41, 39, 25, 38, 29, 26};
                    }

                    static {
                        A02();
                    }

                    {
                        super(A00(87, 11, 80));
                        this.A04 = new C1576fq();
                        int size = list.size();
                        String strA00 = A00(EnumC4719u30.INVALID_METRICS_ENDPOINT_VALUE, 10, 102);
                        if (size == 1 && (list.get(0).length == 48 || list.get(0).length == 53)) {
                            byte[] bArr = list.get(0);
                            this.A03 = bArr[24];
                            this.A02 = ((bArr[26] & 255) << 24) | ((bArr[27] & 255) << 16) | ((bArr[28] & 255) << 8) | (bArr[29] & 255);
                            this.A05 = A00(61, 5, 110).equals(AbstractC1600gE.A0r(bArr, 43, bArr.length - 43)) ? A00(135, 5, 87) : strA00;
                            this.A01 = bArr[25] * 20;
                            this.A06 = (bArr[0] & 32) != 0;
                            if (this.A06) {
                                int requestedVerticalPlacement = ((bArr[10] & 255) << 8) | (bArr[11] & 255);
                                this.A00 = AbstractC1600gE.A00(requestedVerticalPlacement / this.A01, 0.0f, 0.95f);
                                return;
                            } else {
                                this.A00 = 0.85f;
                                return;
                            }
                        }
                        this.A03 = 0;
                        this.A02 = -1;
                        this.A05 = strA00;
                        this.A06 = false;
                        this.A00 = 0.85f;
                        this.A01 = -1;
                    }

                    public static String A01(C1576fq c1576fq) throws TP {
                        A07(c1576fq.A07() >= 2);
                        int bomSize = c1576fq.A0M();
                        if (bomSize == 0) {
                            return A00(0, 0, 52);
                        }
                        int iA09 = c1576fq.A09();
                        Charset charsetA0Z = c1576fq.A0Z();
                        int textLength = c1576fq.A09();
                        int bomSize2 = bomSize - (textLength - iA09);
                        if (charsetA0Z == null) {
                            charsetA0Z = AbstractC1686hd.A06;
                        }
                        return c1576fq.A0X(bomSize2, charsetA0Z);
                    }

                    public static void A03(SpannableStringBuilder spannableStringBuilder, int i, int i2, int i3, int i4, int i5) {
                        if (i != i2) {
                            int colorArgb = i5 | 33;
                            spannableStringBuilder.setSpan(new ForegroundColorSpan(((i & 255) << 24) | (i >>> 8)), i3, i4, colorArgb);
                        }
                    }

                    public static void A04(SpannableStringBuilder spannableStringBuilder, int i, int i2, int i3, int i4, int i5) {
                        if (i != i2) {
                            int i6 = i5 | 33;
                            int flags = i & 1;
                            boolean z = flags != 0;
                            int flags2 = i & 2;
                            boolean z2 = flags2 != 0;
                            if (z) {
                                if (z2) {
                                    spannableStringBuilder.setSpan(new StyleSpan(3), i3, i4, i6);
                                } else {
                                    spannableStringBuilder.setSpan(new StyleSpan(1), i3, i4, i6);
                                }
                            } else if (z2) {
                                spannableStringBuilder.setSpan(new StyleSpan(2), i3, i4, i6);
                            }
                            int flags3 = i & 4;
                            boolean z3 = flags3 != 0;
                            if (z3) {
                                spannableStringBuilder.setSpan(new UnderlineSpan(), i3, i4, i6);
                            }
                            if (!z3 && !z && !z2) {
                                spannableStringBuilder.setSpan(new StyleSpan(0), i3, i4, i6);
                            }
                        }
                    }

                    public static void A05(SpannableStringBuilder spannableStringBuilder, String str2, int i, int i2) {
                        if (str2 != A00(EnumC4719u30.INVALID_METRICS_ENDPOINT_VALUE, 10, 102)) {
                            spannableStringBuilder.setSpan(new TypefaceSpan(str2), i, i2, 16711713);
                        }
                    }

                    private void A06(C1576fq c1576fq, SpannableStringBuilder spannableStringBuilder) throws TP {
                        A07(c1576fq.A07() >= 12);
                        int fontFace = c1576fq.A0M();
                        int iA0M = c1576fq.A0M();
                        c1576fq.A0g(2);
                        int iA0I = c1576fq.A0I();
                        c1576fq.A0g(1);
                        int iA0C = c1576fq.A0C();
                        int length = spannableStringBuilder.length();
                        String strA00 = A00(33, 2, 40);
                        String strA01 = A00(87, 11, 80);
                        if (iA0M > length) {
                            StringBuilder sbAppend = new StringBuilder().append(A00(66, 21, 79)).append(iA0M).append(A00(10, 23, 120));
                            int start = spannableStringBuilder.length();
                            AbstractC1561fb.A07(strA01, sbAppend.append(start).append(strA00).toString());
                            iA0M = spannableStringBuilder.length();
                        }
                        if (fontFace < iA0M) {
                            A04(spannableStringBuilder, iA0I, this.A03, fontFace, iA0M, 0);
                            A03(spannableStringBuilder, iA0C, this.A02, fontFace, iA0M, 0);
                        } else {
                            AbstractC1561fb.A07(strA01, A00(35, 26, EnumC4719u30.ASSET_FAILED_MAX_SPACE_EXCEEDED_VALUE) + fontFace + A00(0, 10, 78) + iA0M + strA00);
                        }
                    }

                    public static void A07(boolean z) throws TP {
                        if (z) {
                        } else {
                            throw new TP(A00(98, 27, 20));
                        }
                    }

                    @Override // com.facebook.ads.redexgen.core.C9H
                    public final InterfaceC1142Wv A0g(byte[] bArr, int i, boolean z) throws TP {
                        this.A04.A0j(bArr, i);
                        String strA01 = A01(this.A04);
                        if (strA01.isEmpty()) {
                            return TC.A01;
                        }
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(strA01);
                        A04(spannableStringBuilder, this.A03, 0, 0, spannableStringBuilder.length(), 16711680);
                        A03(spannableStringBuilder, this.A02, -1, 0, spannableStringBuilder.length(), 16711680);
                        A05(spannableStringBuilder, this.A05, 0, spannableStringBuilder.length());
                        float fA00 = this.A00;
                        while (this.A04.A07() >= 8) {
                            int iA09 = this.A04.A09();
                            int iA0C = this.A04.A0C();
                            int atomType = this.A04.A0C();
                            if (atomType == 1937013100) {
                                A07(this.A04.A07() >= 2);
                                int styleRecordCount = this.A04.A0M();
                                for (int atomType2 = 0; atomType2 < styleRecordCount; atomType2++) {
                                    A06(this.A04, spannableStringBuilder);
                                    if (A08[1].charAt(4) != 't') {
                                        throw new RuntimeException();
                                    }
                                    String[] strArr = A08;
                                    strArr[7] = "p15WFq1xDBvfKK082";
                                    strArr[3] = "oZwp";
                                }
                            } else if (atomType == 1952608120 && this.A06) {
                                A07(this.A04.A07() >= 2);
                                float verticalPlacement = this.A04.A0M();
                                fA00 = AbstractC1600gE.A00(verticalPlacement / this.A01, 0.0f, 0.95f);
                            }
                            this.A04.A0f(iA09 + iA0C);
                        }
                        return new TC(new C1374cY().A0G(spannableStringBuilder).A07(fA00, 0).A09(0).A0H());
                    }
                };
            case 6:
            case 7:
                return new C1C(zm.A0W, zm.A03, C.TIME_UNSET);
            case 8:
                final int i = zm.A03;
                final List list2 = null;
                return new AbstractC05568p(i, list2) { // from class: com.facebook.ads.redexgen.X.1B
                    public static byte[] A0B;
                    public static String[] A0C = {"iVN3kqMWcyIx32t5TufqHa9BwnjjEP2N", "mRbbDhwaLbunbvjBvCoPW7zbBrAMtsiZ", "ar", "fhrC5Btj", "AyrLDH9l", "qpwCcVFHAiXy08jirliygoElzq0IG0LD", "S0dfHaeJvAb6qU9cu1VcjWW6d9AcZSIO", "t0n6bP7MeBJNg85UHRyj2DOEehvUrVrC"};
                    public int A00;
                    public X1 A02;
                    public X2 A03;
                    public List<C0982Qh> A04;
                    public List<C0982Qh> A05;
                    public final int A06;
                    public final boolean A09;
                    public final X1[] A0A;
                    public final C1576fq A08 = new C1576fq();
                    public final C1575fp A07 = new C1575fp();
                    public int A01 = -1;

                    public static String A00(int i2, int i3, int i4) {
                        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0B, i2, i2 + i3);
                        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
                            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] - i4) - 18);
                        }
                        return new String(bArrCopyOfRange);
                    }

                    /* JADX WARN: Failed to parse debug info
                    java.lang.ArrayIndexOutOfBoundsException
                     */
                    private void A03() {
                        this.A02.A0C(this.A07.A04(4), this.A07.A04(2), this.A07.A04(2), this.A07.A0H(), this.A07.A0H(), this.A07.A04(3), this.A07.A04(3));
                    }

                    /* JADX WARN: Failed to parse debug info
                    java.lang.ArrayIndexOutOfBoundsException
                     */
                    private void A04() {
                        int iA01 = X1.A01(this.A07.A04(2), this.A07.A04(2), this.A07.A04(2), this.A07.A04(2));
                        int iA02 = X1.A01(this.A07.A04(2), this.A07.A04(2), this.A07.A04(2), this.A07.A04(2));
                        this.A07.A09(2);
                        this.A02.A0B(iA01, iA02, X1.A00(this.A07.A04(2), this.A07.A04(2), this.A07.A04(2)));
                    }

                    /* JADX WARN: Failed to parse debug info
                    java.lang.ArrayIndexOutOfBoundsException
                     */
                    private void A06() {
                        int iA01 = X1.A01(this.A07.A04(2), this.A07.A04(2), this.A07.A04(2), this.A07.A04(2));
                        int iA04 = this.A07.A04(2);
                        int iA00 = X1.A00(this.A07.A04(2), this.A07.A04(2), this.A07.A04(2));
                        if (this.A07.A0H()) {
                            iA04 |= 4;
                        }
                        boolean zA0H = this.A07.A0H();
                        int iA05 = this.A07.A04(2);
                        int iA06 = this.A07.A04(2);
                        int iA07 = this.A07.A04(2);
                        this.A07.A09(8);
                        this.A02.A0D(iA01, iA00, zA0H, iA04, iA05, iA06, iA07);
                    }

                    public static void A09() {
                        A0B = new byte[]{64, 72, -109, -123, -111, -107, -123, -114, -125, -123, 64, -114, -107, -115, -126, -123, -110, 64, -105, -38, -20, -23, -23, -36, -27, -21, -76, 89, 80, -89, -104, -107, -98, 80, -110, -100, -97, -109, -101, -125, -103, -86, -107, 80, -103, -93, 80, 96, -84, -66, 126, 114, -76, -57, -58, 114, -75, -57, -60, -60, -73, -64, -58, 114, -69, -64, -74, -73, -54, 114, -69, -59, 114, 89, 123, 119, 77, 70, 78, 90, 123, 121, -123, 122, 123, -120, 123, -83, -86, -86, -99, -90, -84, -92, -79, 88, -83, -90, -85, -83, -88, -88, -89, -86, -84, -99, -100, 88, 123, -121, -123, -123, 121, -122, 124, -105, 125, -112, -116, 105, 88, 123, -89, -91, -91, -103, -90, -100, 114, 88, -63, -13, -16, -16, -29, -20, -14, -22, -9, -98, -13, -20, -15, -13, -18, -18, -19, -16, -14, -29, -30, -98, -63, -51, -53, -53, -65, -52, -62, -35, -50, -81, -76, -98, -63, -19, -21, -21, -33, -20, -30, -72, -98, 94, -114, -112, 93, 125, 106, 123, 125, -123, 127, -114, 58, 127, -120, 126, 127, 126, 58, -118, -116, 127, -121, 123, -114, -113, -116, 127, -122, -109, 85, 58, -115, -125, -108, 127, 58, -125, -115, 58, -112, -71, -82, -70, -64, -71, -65, -80, -67, -80, -81, 107, -113, -97, -95, -114, -114, -86, -101, -116, -114, -106, -112, -97, -86, -113, -116, -97, -116, 107, -83, -80, -79, -70, -67, -80, 107, -113, -97, -95, -114, -114, -86, -101, -116, -114, -106, -112, -97, -86, -98, -97, -116, -99, -97, 93, -126, -118, 117, -128, 125, 120, 52, 87, 68, 52, 119, -125, -127, -127, 117, -126, 120, 78, 52, -102, -65, -57, -78, -67, -70, -75, 113, -108, -126, 113, -76, -64, -66, -66, -78, -65, -75, -117, 113, -38, -1, 7, -14, -3, -6, -11, -79, -40, -61, -79, -12, -7, -14, 3, -14, -12, 5, -10, 3, -53, -79, -71, -34, -26, -47, -36, -39, -44, -112, -73, -93, -112, -45, -40, -47, -30, -47, -45, -28, -43, -30, -86, -112, -100, -63, -55, -76, -65, -68, -73, 115, -75, -76, -58, -72, 115, -74, -62, -64, -64, -76, -63, -73, -115, 115, -61, -24, -16, -37, -26, -29, -34, -102, -33, -14, -18, -33, -24, -34, -33, -34, -102, -35, -23, -25, -25, -37, -24, -34, -76, -102, -93, -56, -48, -69, -58, -61, -66, 122, -65, -46, -50, -65, -56, -66, -65, -66, 122, -51, -65, -52, -48, -61, -67, -65, 122, -56, -49, -57, -68, -65, -52, -108, 122, -126, -108, -96, -92, -108, -99, -110, -108, 79, -99, -92, -100, -111, -108, -95, 79, -109, -104, -94, -110, -98, -99, -93, -104, -99, -92, -104, -93, -88, 93, 79, -97, -95, -108, -91, -104, -98, -92, -94, 108, -108, -122, -109, -105, -118, -124, -122, 111, -106, -114, -125, -122, -109, 65, -118, -108, 65, -113, -112, -113, 78, -101, -122, -109, -112, 65, 73};
                    }

                    /* JADX WARN: Failed to parse debug info
                    java.lang.ArrayIndexOutOfBoundsException
                     */
                    private void A0E(int i2) {
                        X1 x1 = this.A0A[i2];
                        this.A07.A09(2);
                        boolean zA0H = this.A07.A0H();
                        boolean zA0H2 = this.A07.A0H();
                        boolean zA0H3 = this.A07.A0H();
                        int iA04 = this.A07.A04(3);
                        boolean zA0H4 = this.A07.A0H();
                        int iA05 = this.A07.A04(7);
                        int iA06 = this.A07.A04(8);
                        int iA07 = this.A07.A04(4);
                        int iA08 = this.A07.A04(4);
                        this.A07.A09(2);
                        int iA09 = this.A07.A04(6);
                        this.A07.A09(2);
                        x1.A0F(zA0H, zA0H2, zA0H3, iA04, zA0H4, iA05, iA06, iA08, iA09, iA07, this.A07.A04(3), this.A07.A04(3));
                    }

                    static {
                        A09();
                    }

                    {
                        this.A06 = i == -1 ? 1 : i;
                        this.A09 = list2 != null && AbstractC1525f0.A06(list2);
                        this.A0A = new X1[8];
                        for (int i2 = 0; i2 < 8; i2++) {
                            this.A0A[i2] = new X1();
                        }
                        this.A02 = this.A0A[0];
                    }

                    private List<C0982Qh> A01() {
                        X0 x0A05;
                        ArrayList arrayList = new ArrayList();
                        for (int i2 = 0; i2 < 8; i2++) {
                            if (!this.A0A[i2].A0H() && this.A0A[i2].A0I() && (x0A05 = this.A0A[i2].A05()) != null) {
                                arrayList.add(x0A05);
                            }
                        }
                        Collections.sort(arrayList, X0.A02);
                        ArrayList arrayList2 = new ArrayList(arrayList.size());
                        for (int i3 = 0; i3 < arrayList.size(); i3++) {
                            arrayList2.add(((X0) arrayList.get(i3)).A01);
                        }
                        List<C0982Qh> listUnmodifiableList = Collections.unmodifiableList(arrayList2);
                        if (A0C[1].charAt(9) != 'b') {
                            throw new RuntimeException();
                        }
                        String[] strArr = A0C;
                        strArr[0] = "7BYlcvv0ertnjGSqFgy904DZ6XNs0JyK";
                        strArr[7] = "gkJllchrribjSTyO5Hrumu1AIAUAJpgo";
                        return listUnmodifiableList;
                    }

                    private void A02() {
                        if (this.A03 == null) {
                            return;
                        }
                        A07();
                        this.A03 = null;
                    }

                    private void A05() {
                        this.A07.A09(4);
                        int iA04 = this.A07.A04(4);
                        this.A07.A09(2);
                        int column = this.A07.A04(6);
                        this.A02.A0A(iA04, column);
                    }

                    /* JADX WARN: Code duplicated, block: B:64:0x0199 A[SYNTHETIC] */
                    /* JADX WARN: Code duplicated, block: B:65:0x0165 A[SYNTHETIC] */
                    /* JADX WARN: Code duplicated, block: B:66:0x0161 A[SYNTHETIC] */
                    /* JADX WARN: Code duplicated, block: B:67:0x016c A[SYNTHETIC] */
                    /* JADX WARN: Code duplicated, block: B:68:0x0167 A[SYNTHETIC] */
                    /* JADX WARN: Code duplicated, block: B:69:0x0173 A[SYNTHETIC] */
                    /* JADX WARN: Code duplicated, block: B:70:0x016e A[SYNTHETIC] */
                    /* JADX WARN: Code duplicated, block: B:71:0x017a A[SYNTHETIC] */
                    /* JADX WARN: Code duplicated, block: B:72:0x0175 A[SYNTHETIC] */
                    /* JADX WARN: Code duplicated, block: B:73:0x015f A[SYNTHETIC] */
                    /* JADX WARN: Code duplicated, block: B:74:0x01a5 A[SYNTHETIC] */
                    /* JADX WARN: Code duplicated, block: B:75:0x01a1 A[SYNTHETIC] */
                    /* JADX WARN: Code duplicated, block: B:76:0x01ac A[SYNTHETIC] */
                    /* JADX WARN: Code duplicated, block: B:77:0x01a7 A[SYNTHETIC] */
                    /* JADX WARN: Code duplicated, block: B:78:0x01b2 A[SYNTHETIC] */
                    /* JADX WARN: Code duplicated, block: B:79:0x01ae A[SYNTHETIC] */
                    /* JADX WARN: Code duplicated, block: B:80:0x01ba A[SYNTHETIC] */
                    /* JADX WARN: Code duplicated, block: B:81:0x01b4 A[SYNTHETIC] */
                    @RequiresNonNull({"currentDtvCcPacket"})
                    private void A07() {
                        int iA04;
                        int iA05;
                        int i2 = this.A03.A00;
                        int i3 = (this.A03.A01 * 2) - 1;
                        String strA00 = A00(73, 13, 4);
                        if (i2 != i3) {
                            AbstractC1561fb.A04(strA00, A00(173, 39, 8) + ((this.A03.A01 * 2) - 1) + A00(50, 23, 64) + this.A03.A00 + A00(0, 18, 14) + this.A03.A02 + A00(48, 2, 113));
                        }
                        boolean z = false;
                        this.A07.A0E(this.A03.A03, this.A03.A00);
                        while (this.A07.A01() > 0) {
                            int iA06 = this.A07.A04(3);
                            int iA07 = this.A07.A04(5);
                            if (iA06 == 7) {
                                this.A07.A09(2);
                                iA06 = this.A07.A04(6);
                                if (iA06 < 7) {
                                    AbstractC1561fb.A07(strA00, A00(399, 33, 72) + iA06);
                                }
                            }
                            if (iA07 == 0) {
                                if (iA06 == 0) {
                                    break;
                                }
                                AbstractC1561fb.A07(strA00, A00(472, 27, 15) + iA06 + A00(27, 21, 30));
                                break;
                            }
                            if (iA06 != this.A06) {
                                this.A07.A0A(iA07);
                            } else {
                                int iA03 = this.A07.A03();
                                int i4 = iA07 * 8;
                                int serviceNumber = A0C[1].charAt(9);
                                if (serviceNumber != 98) {
                                    throw new RuntimeException();
                                }
                                String[] strArr = A0C;
                                strArr[3] = "5FIcYawU";
                                strArr[4] = "Y93oUJHR";
                                int i5 = iA03 + i4;
                                while (true) {
                                    C1575fp c1575fp = this.A07;
                                    int serviceNumber2 = A0C[2].length();
                                    if (serviceNumber2 != 2) {
                                        if (c1575fp.A03() >= i5) {
                                            break;
                                        }
                                        iA04 = this.A07.A04(8);
                                        if (iA04 != 16) {
                                            if (iA04 <= 31) {
                                                A0A(iA04);
                                            } else if (iA04 <= 127) {
                                                A0F(iA04);
                                                z = true;
                                            } else if (iA04 <= 159) {
                                                A0B(iA04);
                                                z = true;
                                            } else if (iA04 <= 255) {
                                                A0G(iA04);
                                                z = true;
                                            } else {
                                                AbstractC1561fb.A07(strA00, A00(351, 22, 65) + iA04);
                                            }
                                        } else {
                                            iA05 = this.A07.A04(8);
                                            if (iA05 <= 31) {
                                                A0C(iA05);
                                            } else if (iA05 <= 127) {
                                                A0H(iA05);
                                                z = true;
                                            } else if (iA05 <= 159) {
                                                A0D(iA05);
                                            } else if (iA05 <= 255) {
                                                A0I(iA05);
                                                z = true;
                                            } else {
                                                AbstractC1561fb.A07(strA00, A00(373, 26, 104) + iA05);
                                            }
                                        }
                                    } else {
                                        A0C[2] = "Eg";
                                        if (c1575fp.A03() >= i5) {
                                            break;
                                        }
                                        iA04 = this.A07.A04(8);
                                        if (iA04 != 16) {
                                            if (iA04 <= 31) {
                                                A0A(iA04);
                                            } else if (iA04 <= 127) {
                                                A0F(iA04);
                                                z = true;
                                            } else if (iA04 <= 159) {
                                                A0B(iA04);
                                                z = true;
                                            } else if (iA04 <= 255) {
                                                A0G(iA04);
                                                z = true;
                                            } else {
                                                AbstractC1561fb.A07(strA00, A00(351, 22, 65) + iA04);
                                            }
                                        } else {
                                            iA05 = this.A07.A04(8);
                                            if (iA05 <= 31) {
                                                A0C(iA05);
                                            } else if (iA05 <= 127) {
                                                A0H(iA05);
                                                z = true;
                                            } else if (iA05 <= 159) {
                                                A0D(iA05);
                                            } else if (iA05 <= 255) {
                                                A0I(iA05);
                                                z = true;
                                            } else {
                                                AbstractC1561fb.A07(strA00, A00(373, 26, 104) + iA05);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        if (z) {
                            this.A04 = A01();
                        }
                    }

                    private void A08() {
                        for (int i2 = 0; i2 < 8; i2++) {
                            this.A0A[i2].A08();
                        }
                    }

                    private void A0A(int i2) {
                        switch (i2) {
                            case 0:
                            case 14:
                                return;
                            case 3:
                                this.A04 = A01();
                                return;
                            case 8:
                                this.A02.A06();
                                return;
                            case 12:
                                A08();
                                return;
                            case 13:
                                this.A02.A09('\n');
                                return;
                            default:
                                String strA00 = A00(73, 13, 4);
                                if (i2 >= 17 && i2 <= 23) {
                                    AbstractC1561fb.A07(strA00, A00(86, 44, 38) + i2);
                                    this.A07.A09(8);
                                    return;
                                }
                                if (A0C[1].charAt(9) == 'b') {
                                    String[] strArr = A0C;
                                    strArr[0] = "g9DyyDnNJd4LgnUwc0ZdizjQUZVeC3Bm";
                                    strArr[7] = "Xx8OfFNjRzXZgQQFbRADCkePMeeunK0f";
                                    if (i2 >= 24) {
                                        if (A0C[2].length() == 2) {
                                            String[] strArr2 = A0C;
                                            strArr2[6] = "ERsIJeA8OLio6gb05uvF41rqbNR5J5gR";
                                            strArr2[5] = "7cjpKb6XqD9Rd6vVaORkQkLiwwxC5YVu";
                                            if (i2 <= 31) {
                                                AbstractC1561fb.A07(strA00, A00(130, 43, 108) + i2);
                                                this.A07.A09(16);
                                                return;
                                            }
                                        }
                                    }
                                    AbstractC1561fb.A07(strA00, A00(267, 20, 2) + i2);
                                    return;
                                }
                                throw new RuntimeException();
                        }
                    }

                    /* JADX WARN: Code duplicated, block: B:62:0x0171  */
                    /* JADX WARN: Code duplicated, block: B:64:0x0181  */
                    /* JADX WARN: Code duplicated, block: B:66:0x0195  */
                    private void A0B(int i2) {
                        X1[] x1Arr;
                        int i3;
                        switch (i2) {
                            case 128:
                            case 129:
                            case 130:
                            case 131:
                            case 132:
                            case 133:
                            case 134:
                            case 135:
                                int i4 = i2 - 128;
                                int window = this.A00;
                                if (window == i4) {
                                    return;
                                }
                                this.A00 = i4;
                                X1 x1 = this.A0A[i4];
                                String[] strArr = A0C;
                                String str2 = strArr[3];
                                String str3 = strArr[4];
                                int length = str2.length();
                                int window2 = str3.length();
                                if (length == window2) {
                                    A0C[2] = "LQ";
                                    this.A02 = x1;
                                    return;
                                }
                                break;
                            case 136:
                                for (int i5 = 1; i5 <= 8; i5++) {
                                    if (this.A07.A0H()) {
                                        int i6 = 8 - i5;
                                        this.A0A[i6].A07();
                                    }
                                }
                                return;
                            case 137:
                                for (int i7 = 1; i7 <= 8; i7++) {
                                    C1575fp c1575fp = this.A07;
                                    String[] strArr2 = A0C;
                                    String str4 = strArr2[0];
                                    String str5 = strArr2[7];
                                    int iCharAt = str4.charAt(17);
                                    int i8 = str5.charAt(17);
                                    if (iCharAt != i8) {
                                        String[] strArr3 = A0C;
                                        strArr3[3] = "IELljvlc";
                                        strArr3[4] = "WQGGDJNw";
                                        if (c1575fp.A0H()) {
                                            x1Arr = this.A0A;
                                            i3 = 8 - i7;
                                            if (A0C[2].length() != 2) {
                                                String[] strArr4 = A0C;
                                                strArr4[3] = "YGHDpWEv";
                                                strArr4[4] = "qu8uA8nt";
                                                x1Arr[i3].A0E(true);
                                            } else {
                                                String[] strArr5 = A0C;
                                                strArr5[0] = "4fDGu4b0bY0YOGoN04mSanuP9qNDxvsJ";
                                                strArr5[7] = "e6zWCvitwv72JPtr7d9lFA9SnOZSyEo4";
                                                x1Arr[i3].A0E(true);
                                            }
                                        }
                                    } else {
                                        String[] strArr6 = A0C;
                                        strArr6[6] = "18RAEN3BokLd3UUluoZBJG3a9ZS1sQIW";
                                        strArr6[5] = "HqwMLoNURZKYuEcYTPFpHBGk6ooYlVbe";
                                        if (c1575fp.A0H()) {
                                            x1Arr = this.A0A;
                                            i3 = 8 - i7;
                                            if (A0C[2].length() != 2) {
                                                String[] strArr7 = A0C;
                                                strArr7[3] = "YGHDpWEv";
                                                strArr7[4] = "qu8uA8nt";
                                                x1Arr[i3].A0E(true);
                                            } else {
                                                String[] strArr8 = A0C;
                                                strArr8[0] = "4fDGu4b0bY0YOGoN04mSanuP9qNDxvsJ";
                                                strArr8[7] = "e6zWCvitwv72JPtr7d9lFA9SnOZSyEo4";
                                                x1Arr[i3].A0E(true);
                                            }
                                        }
                                    }
                                }
                                return;
                            case 138:
                                for (int i9 = 1; i9 <= 8; i9++) {
                                    if (this.A07.A0H()) {
                                        int i10 = 8 - i9;
                                        this.A0A[i10].A0E(false);
                                    }
                                }
                                return;
                            case Input.Keys.F9 /* 139 */:
                                for (int i11 = 1; i11 <= 8; i11++) {
                                    if (this.A07.A0H()) {
                                        int i12 = 8 - i11;
                                        X1 x2 = this.A0A[i12];
                                        x2.A0E(!x2.A0I());
                                    }
                                }
                                return;
                            case Input.Keys.F10 /* 140 */:
                                for (int i13 = 1; i13 <= 8; i13++) {
                                    if (this.A07.A0H()) {
                                        int i14 = 8 - i13;
                                        this.A0A[i14].A08();
                                    }
                                }
                                return;
                            case Input.Keys.F11 /* 141 */:
                                C1575fp c1575fp2 = this.A07;
                                if (A0C[2].length() != 2) {
                                    throw new RuntimeException();
                                }
                                A0C[1] = "GmfhOuStvb8kqiMFOQoVvHjXb0Myoulv";
                                c1575fp2.A09(8);
                                return;
                            case Input.Keys.F12 /* 142 */:
                                return;
                            case Input.Keys.NUM_LOCK /* 143 */:
                                A08();
                                return;
                            case Input.Keys.NUMPAD_0 /* 144 */:
                                if (!this.A02.A0G()) {
                                    this.A07.A09(16);
                                    return;
                                } else {
                                    A03();
                                    return;
                                }
                            case Input.Keys.NUMPAD_1 /* 145 */:
                                if (!this.A02.A0G()) {
                                    this.A07.A09(24);
                                    return;
                                } else {
                                    A04();
                                    return;
                                }
                            case Input.Keys.NUMPAD_2 /* 146 */:
                                if (!this.A02.A0G()) {
                                    this.A07.A09(16);
                                    return;
                                } else {
                                    A05();
                                    return;
                                }
                            case Input.Keys.NUMPAD_3 /* 147 */:
                            case Input.Keys.NUMPAD_4 /* 148 */:
                            case Input.Keys.NUMPAD_5 /* 149 */:
                            case Input.Keys.NUMPAD_6 /* 150 */:
                            default:
                                AbstractC1561fb.A07(A00(73, 13, 4), A00(287, 20, 63) + i2);
                                return;
                            case Input.Keys.NUMPAD_7 /* 151 */:
                                X1 x3 = this.A02;
                                String[] strArr9 = A0C;
                                if (strArr9[3].length() != strArr9[4].length()) {
                                    throw new RuntimeException();
                                }
                                String[] strArr10 = A0C;
                                strArr10[0] = "wJbXxN8nOc8h7Oa1eQjUS4XNuxhTBhyh";
                                strArr10[7] = "Q5UPyeycBckRUPeaeVxFsljxiVx564tD";
                                if (!x3.A0G()) {
                                    this.A07.A09(32);
                                    return;
                                } else {
                                    A06();
                                    return;
                                }
                            case Input.Keys.NUMPAD_8 /* 152 */:
                            case Input.Keys.NUMPAD_9 /* 153 */:
                            case Input.Keys.NUMPAD_DIVIDE /* 154 */:
                            case Input.Keys.NUMPAD_MULTIPLY /* 155 */:
                            case Input.Keys.NUMPAD_SUBTRACT /* 156 */:
                            case Input.Keys.NUMPAD_ADD /* 157 */:
                            case Input.Keys.NUMPAD_DOT /* 158 */:
                            case Input.Keys.NUMPAD_COMMA /* 159 */:
                                int i15 = i2 - 152;
                                A0E(i15);
                                int window3 = this.A00;
                                if (window3 == i15) {
                                    return;
                                }
                                this.A00 = i15;
                                String[] strArr11 = A0C;
                                String str6 = strArr11[3];
                                String str7 = strArr11[4];
                                int length2 = str6.length();
                                int window4 = str7.length();
                                if (length2 == window4) {
                                    String[] strArr12 = A0C;
                                    strArr12[0] = "fnWcca6tSNnLogxGM68VyxomZbRF2PRB";
                                    strArr12[7] = "roT71dXLQI6jpvWe1bFil80t93pIq1qR";
                                    this.A02 = this.A0A[i15];
                                    return;
                                }
                                break;
                        }
                        throw new RuntimeException();
                    }

                    private void A0C(int i2) {
                        if (i2 <= 7) {
                            return;
                        }
                        if (i2 <= 15) {
                            this.A07.A09(8);
                        } else if (i2 <= 23) {
                            this.A07.A09(16);
                        } else {
                            if (i2 > 31) {
                                return;
                            }
                            this.A07.A09(24);
                        }
                    }

                    private void A0D(int i2) {
                        if (i2 <= 135) {
                            this.A07.A09(32);
                            return;
                        }
                        if (i2 <= 143) {
                            this.A07.A09(40);
                        } else {
                            if (i2 > 159) {
                                return;
                            }
                            this.A07.A09(2);
                            int length = this.A07.A04(6);
                            this.A07.A09(length * 8);
                        }
                    }

                    private void A0F(int i2) {
                        if (i2 == 127) {
                            this.A02.A09((char) 9835);
                            return;
                        }
                        X1 x1 = this.A02;
                        int i3 = i2 & 255;
                        if (A0C[2].length() != 2) {
                            throw new RuntimeException();
                        }
                        A0C[2] = "3T";
                        x1.A09((char) i3);
                    }

                    private void A0G(int i2) {
                        this.A02.A09((char) (i2 & 255));
                    }

                    private void A0H(int i2) {
                        switch (i2) {
                            case 32:
                                this.A02.A09(' ');
                                break;
                            case 33:
                                this.A02.A09((char) 160);
                                break;
                            case 37:
                                this.A02.A09((char) 8230);
                                break;
                            case 42:
                                this.A02.A09((char) 352);
                                break;
                            case 44:
                                this.A02.A09((char) 338);
                                break;
                            case 48:
                                this.A02.A09((char) 9608);
                                break;
                            case 49:
                                this.A02.A09((char) 8216);
                                break;
                            case 50:
                                this.A02.A09((char) 8217);
                                break;
                            case 51:
                                this.A02.A09((char) 8220);
                                break;
                            case 52:
                                this.A02.A09((char) 8221);
                                break;
                            case 53:
                                this.A02.A09((char) 8226);
                                break;
                            case Input.Keys.ALT_LEFT /* 57 */:
                                this.A02.A09((char) 8482);
                                break;
                            case Input.Keys.ALT_RIGHT /* 58 */:
                                this.A02.A09((char) 353);
                                break;
                            case 60:
                                this.A02.A09((char) 339);
                                break;
                            case Input.Keys.TAB /* 61 */:
                                this.A02.A09((char) 8480);
                                break;
                            case 63:
                                this.A02.A09((char) 376);
                                break;
                            case PROTOBUF_SERIALIZATION_ERROR_VALUE:
                                this.A02.A09((char) 8539);
                                break;
                            case JSON_ENCODE_ERROR_VALUE:
                                this.A02.A09((char) 8540);
                                break;
                            case 120:
                                this.A02.A09((char) 8541);
                                break;
                            case 121:
                                this.A02.A09((char) 8542);
                                break;
                            case 122:
                                this.A02.A09((char) 9474);
                                break;
                            case 123:
                                this.A02.A09((char) 9488);
                                break;
                            case 124:
                                this.A02.A09((char) 9492);
                                break;
                            case INVALID_METRICS_ENDPOINT_VALUE:
                                this.A02.A09((char) 9472);
                                break;
                            case ASSET_FAILED_INSUFFICIENT_SPACE_VALUE:
                                this.A02.A09((char) 9496);
                                break;
                            case ASSET_FAILED_MAX_SPACE_EXCEEDED_VALUE:
                                this.A02.A09((char) 9484);
                                break;
                            default:
                                AbstractC1561fb.A07(A00(73, 13, 4), A00(307, 22, EnumC4719u30.ASSET_FAILED_MAX_SPACE_EXCEEDED_VALUE) + i2);
                                break;
                        }
                    }

                    private void A0I(int i2) {
                        if (i2 == 160) {
                            this.A02.A09((char) 13252);
                            return;
                        }
                        AbstractC1561fb.A07(A00(73, 13, 4), A00(329, 22, 94) + i2);
                        this.A02.A09('_');
                    }

                    @Override // com.facebook.ads.redexgen.core.AbstractC05568p
                    /* JADX INFO: renamed from: A0W */
                    public final /* bridge */ /* synthetic */ C05598s A5h() throws TP {
                        return super.A5h();
                    }

                    @Override // com.facebook.ads.redexgen.core.AbstractC05568p
                    /* JADX INFO: renamed from: A0X */
                    public final /* bridge */ /* synthetic */ AbstractC05578q A5j() throws TP {
                        return super.A5j();
                    }

                    @Override // com.facebook.ads.redexgen.core.AbstractC05568p
                    public final TI A0Z() {
                        this.A05 = this.A04;
                        return new TI((List) AbstractC1517es.A01(this.A04));
                    }

                    @Override // com.facebook.ads.redexgen.core.AbstractC05568p
                    /* JADX INFO: renamed from: A0a */
                    public final /* bridge */ /* synthetic */ void AGR(C05598s c05598s) throws TP {
                        super.AGR(c05598s);
                    }

                    @Override // com.facebook.ads.redexgen.core.AbstractC05568p
                    public final void A0b(C05598s c05598s) {
                        ByteBuffer byteBuffer = (ByteBuffer) AbstractC1517es.A01(c05598s.A02);
                        this.A08.A0j(byteBuffer.array(), byteBuffer.limit());
                        while (this.A08.A07() >= 3) {
                            int iA0I = this.A08.A0I() & 7;
                            int ccType = iA0I & 3;
                            boolean z = (iA0I & 4) == 4;
                            C1576fq c1576fq = this.A08;
                            String[] strArr = A0C;
                            if (strArr[6].charAt(30) == strArr[5].charAt(30)) {
                                throw new RuntimeException();
                            }
                            String[] strArr2 = A0C;
                            strArr2[0] = "5raryeRP2BxsiNz4MSWHgBkL5LcMTceh";
                            strArr2[7] = "jGzTymZTrs8OIXqdG79RlKBveyGnP2Kn";
                            byte bA0I = (byte) c1576fq.A0I();
                            byte bA0I2 = (byte) this.A08.A0I();
                            if (ccType == 2 || ccType == 3) {
                                if (z) {
                                    String strA00 = A00(73, 13, 4);
                                    if (ccType == 3) {
                                        A02();
                                        int packetSize = (bA0I & 192) >> 6;
                                        if (this.A01 != -1 && packetSize != (this.A01 + 1) % 4) {
                                            A08();
                                            AbstractC1561fb.A07(strA00, A00(432, 40, 29) + this.A01 + A00(18, 9, 101) + packetSize);
                                        }
                                        this.A01 = packetSize;
                                        int i2 = bA0I & 63;
                                        if (i2 == 0) {
                                            i2 = 64;
                                        }
                                        this.A03 = new X2(packetSize, i2);
                                        byte[] bArr = this.A03.A03;
                                        X2 x2 = this.A03;
                                        int i3 = x2.A00;
                                        x2.A00 = i3 + 1;
                                        bArr[i3] = bA0I2;
                                    } else {
                                        AbstractC1517es.A07(ccType == 2);
                                        if (this.A03 == null) {
                                            AbstractC1561fb.A05(strA00, A00(EnumC4719u30.PLACEMENT_SLEEP_VALUE, 55, 57));
                                        } else {
                                            byte[] bArr2 = this.A03.A03;
                                            X2 x3 = this.A03;
                                            int i4 = x3.A00;
                                            x3.A00 = i4 + 1;
                                            bArr2[i4] = bA0I;
                                            byte[] bArr3 = this.A03.A03;
                                            X2 x4 = this.A03;
                                            int i5 = x4.A00;
                                            x4.A00 = i5 + 1;
                                            bArr3[i5] = bA0I2;
                                        }
                                    }
                                    if (this.A03.A00 == (this.A03.A01 * 2) - 1) {
                                        A02();
                                    }
                                }
                            }
                        }
                    }

                    @Override // com.facebook.ads.redexgen.core.AbstractC05568p
                    public final boolean A0d() {
                        return this.A04 != this.A05;
                    }

                    @Override // com.facebook.ads.redexgen.core.AbstractC05568p, com.facebook.ads.redexgen.core.InterfaceC1037Sl
                    public final /* bridge */ /* synthetic */ void AGj() {
                        super.AGj();
                    }

                    @Override // com.facebook.ads.redexgen.core.AbstractC05568p, com.facebook.ads.redexgen.core.TQ
                    public final /* bridge */ /* synthetic */ void AIn(long j) {
                        super.AIn(j);
                    }

                    @Override // com.facebook.ads.redexgen.core.AbstractC05568p, com.facebook.ads.redexgen.core.InterfaceC1037Sl
                    public final void flush() {
                        super.flush();
                        this.A04 = null;
                        this.A05 = null;
                        this.A00 = 0;
                        this.A02 = this.A0A[this.A00];
                        A08();
                        this.A03 = null;
                    }
                };
            case 9:
                final List<byte[]> list3 = zm.A0X;
                return new C9H(list3) { // from class: com.facebook.ads.redexgen.X.18
                    public static byte[] A01;
                    public final XE A00;

                    static {
                        A01();
                    }

                    /* JADX WARN: Failed to parse debug info
                    java.lang.ArrayIndexOutOfBoundsException
                     */
                    {
                        super(A00(0, 10, 86));
                        C1576fq c1576fq = new C1576fq(list3.get(0));
                        this.A00 = new XE(c1576fq.A0M(), c1576fq.A0M());
                    }

                    public static String A00(int i2, int i3, int i4) {
                        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i2, i2 + i3);
                        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
                            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] ^ i4) ^ 11);
                        }
                        return new String(bArrCopyOfRange);
                    }

                    public static void A01() {
                        A01 = new byte[]{25, 43, 63, 25, 56, 62, 50, 57, 56, 47};
                    }

                    @Override // com.facebook.ads.redexgen.core.C9H
                    public final InterfaceC1142Wv A0g(byte[] bArr, int i2, boolean z) {
                        if (z) {
                            this.A00.A0J();
                        }
                        return new TH(this.A00.A0I(bArr, i2));
                    }
                };
            case 10:
                return new C9H() { // from class: com.facebook.ads.redexgen.X.17
                    public static byte[] A04;
                    public static String[] A05 = {"2xXW3T1XOjHQMlgy7N1U1rbXs5lnvGNX", "YFiSwYnHVL0vdi7Co4DtRHBtWSOtG", "NU5l", "OZTlSwSPbqme9mmkwE5YWBOGyB", "KtgAeAKgTJHgfJK4atPcJXr9TYzGENm6", "unO7gCHcQb3GvOk3iZQ274JLn6KdNSiD", "viAmB19OZjoDLpUnvBYb", "IP5KxX518fDu5LW5fhKD"};
                    public Inflater A00;
                    public final XH A01;
                    public final C1576fq A02;
                    public final C1576fq A03;

                    public static String A01(int i2, int i3, int i4) {
                        byte[] bArrCopyOfRange = Arrays.copyOfRange(A04, i2, i2 + i3);
                        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
                            byte b2 = (byte) ((bArrCopyOfRange[i5] ^ i4) ^ EnumC4719u30.INVALID_METRICS_ENDPOINT_VALUE);
                            if (A05[3].length() == 29) {
                                throw new RuntimeException();
                            }
                            A05[3] = "AZ2Q9JrgDs";
                            bArrCopyOfRange[i5] = b2;
                        }
                        return new String(bArrCopyOfRange);
                    }

                    public static void A02() {
                        A04 = new byte[]{105, 94, 74, 125, 92, 90, 86, 93, 92, 75};
                    }

                    static {
                        A02();
                    }

                    {
                        A01(0, 10, 68);
                        this.A02 = new C1576fq();
                        this.A03 = new C1576fq();
                        this.A01 = new XH();
                    }

                    public static C0982Qh A00(C1576fq c1576fq, XH xh) {
                        int limit = c1576fq.A0A();
                        int iA0I = c1576fq.A0I();
                        int iA0M = c1576fq.A0M();
                        int nextSectionPosition = c1576fq.A09() + iA0M;
                        if (nextSectionPosition > limit) {
                            c1576fq.A0f(limit);
                            return null;
                        }
                        C0982Qh c0982QhA06 = null;
                        String[] strArr = A05;
                        String str2 = strArr[2];
                        String str3 = strArr[1];
                        int sectionType = str2.length();
                        if (sectionType != str3.length()) {
                            String[] strArr2 = A05;
                            strArr2[2] = "chK2";
                            strArr2[1] = "EdFMrvqzgo1IWKAcfpYmJVd0PiP8z";
                            switch (iA0I) {
                                case 20:
                                    xh.A05(c1576fq, iA0M);
                                    break;
                                case 21:
                                    xh.A03(c1576fq, iA0M);
                                    break;
                                case 22:
                                    xh.A04(c1576fq, iA0M);
                                    break;
                                case 128:
                                    c0982QhA06 = xh.A06();
                                    xh.A07();
                                    break;
                            }
                            c1576fq.A0f(nextSectionPosition);
                            return c0982QhA06;
                        }
                        throw new RuntimeException();
                    }

                    private void A03(C1576fq c1576fq) {
                        if (c1576fq.A07() > 0 && c1576fq.A0B() == 120) {
                            if (this.A00 == null) {
                                this.A00 = new Inflater();
                            }
                            if (AbstractC1600gE.A1D(c1576fq, this.A03, this.A00)) {
                                c1576fq.A0j(this.A03.A0l(), this.A03.A0A());
                            }
                        }
                    }

                    @Override // com.facebook.ads.redexgen.core.C9H
                    public final InterfaceC1142Wv A0g(byte[] bArr, int i2, boolean z) throws TP {
                        this.A02.A0j(bArr, i2);
                        A03(this.A02);
                        this.A01.A07();
                        ArrayList arrayList = new ArrayList();
                        while (this.A02.A07() >= 3) {
                            C0982Qh c0982QhA00 = A00(this.A02, this.A01);
                            if (c0982QhA00 != null) {
                                arrayList.add(c0982QhA00);
                            }
                        }
                        return new TG(Collections.unmodifiableList(arrayList));
                    }
                };
            default:
                throw new IllegalArgumentException(A00(0, 50, 76));
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1381cf
    public final boolean AJS(ZM zm) {
        String str = zm.A0W;
        String mimeType = A00(236, 8, 90);
        if (!mimeType.equals(str)) {
            String mimeType2 = A00(244, 10, 76);
            if (!mimeType2.equals(str)) {
                String mimeType3 = A00(122, 20, 45);
                if (!mimeType3.equals(str)) {
                    String mimeType4 = A00(167, 21, EnumC4719u30.ASSET_FAILED_STATUS_CODE_VALUE);
                    if (!mimeType4.equals(str)) {
                        String mimeType5 = A00(EnumC4719u30.AD_RESPONSE_INVALID_TEMPLATE_TYPE_VALUE, 20, 28);
                        if (!mimeType5.equals(str)) {
                            String mimeType6 = A00(Input.Keys.F18, 28, 120);
                            if (!mimeType6.equals(str)) {
                                String mimeType7 = A00(50, 19, 7);
                                if (!mimeType7.equals(str)) {
                                    String mimeType8 = A00(Input.Keys.F12, 25, 55);
                                    if (!mimeType8.equals(str)) {
                                        String mimeType9 = A00(69, 19, 24);
                                        if (!mimeType9.equals(str)) {
                                            String mimeType10 = A00(88, 19, 69);
                                            if (!mimeType10.equals(str)) {
                                                String mimeType11 = A00(107, 15, 81);
                                                if (!mimeType11.equals(str)) {
                                                    return false;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return true;
    }
}
