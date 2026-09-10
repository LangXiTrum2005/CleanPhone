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
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.inmobi.commons.core.configs.AdConfig;
import com.p004ironsource.cs;
import com.p004ironsource.f9;
import com.p004ironsource.mediationsdk.logger.IronSourceError;
import com.smartdigimkt.o1.b;
import com.smartdigimkt.sdk.basead.ui.BaseATView;
import com.vungle.ads.internal.protos.Sdk;
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
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.ov, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C2776ov implements EP {
    public static byte[] A01;
    public final /* synthetic */ C2775ou A00;

    static {
        A01();
    }

    public static String A00(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] ^ i4) ^ 18);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{118, 67, 67, 82, 90, 71, 67, 82, 83, 23, 67, 88, 23, 84, 69, 82, 86, 67, 82, 23, 83, 82, 84, 88, 83, 82, 69, 23, 81, 88, 69, 23, 66, 89, 68, 66, 71, 71, 88, 69, 67, 82, 83, 23, 81, 88, 69, 90, 86, 67, 28, 13, 13, 17, 20, 30, 28, 9, 20, 18, 19, 82, 30, 24, 28, 80, 75, 77, 69, 121, 104, 104, 116, 113, 123, 121, 108, 113, 119, 118, 55, 123, 125, 121, 53, 47, 40, 32, 107, 122, 122, 102, 99, 105, 107, 126, 99, 101, 100, 37, 110, 124, 104, 121, AbstractJsonLexerKt.TC_INVALID, 104, 121, 69, 84, 84, 72, 77, 71, 69, 80, 77, 75, 74, 11, 84, 67, 87, 5, 20, 20, 8, 13, 7, 5, 16, 13, 11, 10, 75, 16, 16, 9, 8, 79, 28, 9, 8, 0, 17, 17, 13, 8, 2, 0, 21, 8, 14, 15, 78, 25, 76, 12, 17, 85, 76, 2, 4, 0, 76, 87, 81, 89, 53, 36, 36, 56, 61, 55, 53, 32, 61, 59, 58, 123, 44, 121, 57, 36, 96, 121, 34, 32, 32, 50, 35, 35, 63, 58, 48, 50, 39, 58, 60, 61, 124, 43, 126, 34, 38, 58, 48, 56, 39, 58, 62, 54, 126, 39, 43, 96, 52, 12, 29, 29, 1, 4, 14, 12, 25, 4, 2, 3, 66, 21, 64, 30, 24, 15, 31, 4, 29, 68, 85, 72, 68, 31, 70, 68, 68, 83, 66, 95, 83, 8, 95, 10, 84, 84, 70};
    }

    public C2776ov(C2775ou c2775ou) {
        this.A00 = c2775ou;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:4:0x0009  */
    @Override // com.facebook.ads.redexgen.core.EP
    public final InterfaceC2599lq A5K(C2860qI c2860qI) {
        byte b2;
        String str = c2860qI.A0W;
        switch (str.hashCode()) {
            case -1351681404:
                if (!str.equals(A00(88, 19, 24))) {
                    b2 = -1;
                } else {
                    b2 = 9;
                }
                break;
            case -1248334819:
                if (!str.equals(A00(107, 15, 54))) {
                    b2 = -1;
                } else {
                    b2 = 10;
                }
                break;
            case -1026075066:
                if (!str.equals(A00(167, 21, 70))) {
                    b2 = -1;
                } else {
                    b2 = 2;
                }
                break;
            case -1004728940:
                if (!str.equals(A00(236, 8, 34))) {
                    b2 = -1;
                } else {
                    b2 = 0;
                }
                break;
            case 691401887:
                if (!str.equals(A00(188, 28, 65))) {
                    b2 = -1;
                } else {
                    b2 = 5;
                }
                break;
            case 822864842:
                if (!str.equals(A00(244, 10, 53))) {
                    b2 = -1;
                } else {
                    b2 = 1;
                }
                break;
            case 930165504:
                if (!str.equals(A00(142, 25, 115))) {
                    b2 = -1;
                } else {
                    b2 = 7;
                }
                break;
            case 1566015601:
                if (!str.equals(A00(50, 19, 111))) {
                    b2 = -1;
                } else {
                    b2 = 6;
                }
                break;
            case 1566016562:
                if (!str.equals(A00(69, 19, 10))) {
                    b2 = -1;
                } else {
                    b2 = 8;
                }
                break;
            case 1668750253:
                if (!str.equals(A00(Sdk.SDKError.Reason.AD_RESPONSE_INVALID_TEMPLATE_TYPE_VALUE, 20, 127))) {
                    b2 = -1;
                } else {
                    b2 = 4;
                }
                break;
            case 1693976202:
                if (!str.equals(A00(122, 20, 118))) {
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
                return new C8T() { // from class: com.facebook.ads.redexgen.X.1M
                    public static byte[] A02;
                    public static String[] A03 = {"epLQ4LbruRQu4TauEDrO5bv5Gt", "lRHUrkH9gFGX2N51jXHSI4WiLesC2sz", "FQaGWX09aBSonO1KXWblQ89ZNSDo33Hs", "Tkmuz5Wj47OzYTdqGDI6w0S24YPshGEJ", "sgOZPElMCLLZtQnBcWUjhEzDIZNKx3Aa", "fl5M4MkFrWZTay9Eb0GxyqH", "d522uHqhkgB6wqoRNygeE3zqn3vb1GZ9", "ktGThckFXvstcJxcyByVYeW6HtIWaGJ1"};
                    public final C11074v A00;
                    public final KX A01;

                    public static String A01(int i2, int i3, int i4) {
                        byte[] bArrCopyOfRange = Arrays.copyOfRange(A02, i2, i2 + i3);
                        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
                            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] ^ i4) ^ 88);
                        }
                        return new String(bArrCopyOfRange);
                    }

                    public static void A02() {
                        A02 = new byte[]{123, 26, 73, 78, 67, 86, 95, 26, 88, 86, 85, 89, 81, 26, 77, 91, 73, 26, 92, 85, 79, 84, 94, 26, 91, 92, 78, 95, 72, 26, 78, 82, 95, 26, 92, 83, 72, 73, 78, 26, 89, 79, 95, 20, 108, 109, 118, 103, 88, 95, 82, 71, 78, 53, 7, 0, 20, 22, 22, 38, 7, 1, 13, 6, 7, 16};
                    }

                    static {
                        A02();
                    }

                    {
                        A01(53, 13, 58);
                        this.A00 = new C11074v();
                        this.A01 = new KX();
                    }

                    public static int A00(C11074v c11074v) {
                        int currentInputPosition = -1;
                        int iA09 = 0;
                        while (currentInputPosition == -1) {
                            iA09 = c11074v.A09();
                            String strA0T = c11074v.A0T();
                            if (strA0T == null) {
                                currentInputPosition = 0;
                            } else if (A01(48, 5, 83).equals(strA0T)) {
                                currentInputPosition = 2;
                            } else if (strA0T.startsWith(A01(44, 4, 122))) {
                                currentInputPosition = 1;
                            } else {
                                currentInputPosition = 3;
                            }
                        }
                        c11074v.A0f(iA09);
                        return currentInputPosition;
                    }

                    public static void A03(C11074v c11074v) {
                        while (!TextUtils.isEmpty(c11074v.A0T())) {
                        }
                    }

                    @Override // com.facebook.ads.redexgen.core.C8T
                    public final InterfaceC1464Jj A0g(byte[] bArr, int i2, boolean z2) throws C2592lj {
                        C1486Kf c1486KfA0A;
                        this.A00.A0j(bArr, i2);
                        ArrayList arrayList = new ArrayList();
                        try {
                            AbstractC1495Ko.A04(this.A00);
                            while (!TextUtils.isEmpty(this.A00.A0T())) {
                            }
                            ArrayList arrayList2 = new ArrayList();
                            while (true) {
                                int iA00 = A00(this.A00);
                                if (iA00 == 0) {
                                    return new C2582lZ(arrayList2);
                                }
                                String[] strArr = A03;
                                if (strArr[3].charAt(29) != strArr[7].charAt(29)) {
                                    throw new RuntimeException();
                                }
                                String[] strArr2 = A03;
                                strArr2[5] = "xiLYwX29jkzhCedrUoNIffc";
                                strArr2[0] = "YvTJvYd1hKFZiQGGAeLzXV3lAN";
                                if (iA00 == 1) {
                                    A03(this.A00);
                                } else if (iA00 == 2) {
                                    if (arrayList2.isEmpty()) {
                                        this.A00.A0T();
                                        arrayList.addAll(this.A01.A0F(this.A00));
                                    } else {
                                        throw new C2592lj(A01(0, 44, 98));
                                    }
                                } else if (iA00 == 3 && (c1486KfA0A = AbstractC1494Kn.A0A(this.A00, arrayList)) != null) {
                                    arrayList2.add(c1486KfA0A);
                                }
                            }
                        } catch (C3K e2) {
                            throw new C2592lj(e2);
                        }
                    }
                };
            case 1:
                return new C1R(c2860qI.A0X);
            case 2:
                return new C8T() { // from class: com.facebook.ads.redexgen.X.1N
                    public static byte[] A01;
                    public final C11074v A00;

                    static {
                        A02();
                    }

                    public static String A01(int i2, int i3, int i4) {
                        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i2, i2 + i3);
                        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
                            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] - i4) - 125);
                        }
                        return new String(bArrCopyOfRange);
                    }

                    public static void A02() {
                        A01 = new byte[]{22, 59, 48, 60, 58, 61, 57, 50, 65, 50, -19, 26, 61, 1, 36, 50, 47, 67, 65, 65, -19, 33, 60, 61, -19, 25, 50, 67, 50, 57, -19, 47, 60, 69, -19, 53, 50, 46, 49, 50, 63, -19, 51, 60, 66, 59, 49, -5, 47, 84, 73, 85, 83, 86, 82, 75, 90, 75, 6, 92, 90, 90, 6, 73, 91, 75, 6, 72, 85, 94, 6, 78, 75, 71, 74, 75, 88, 6, 76, 85, 91, 84, 74, 20, 62, 97, 37, 72, 86, 83, 103, 101, 101, 53, 86, 84, 96, 85, 86, 99};
                    }

                    {
                        A01(84, 16, 116);
                        this.A00 = new C11074v();
                    }

                    public static C2810pT A00(C11074v c11074v, int i2) throws C2592lj {
                        C10743o c10743oA08 = null;
                        CharSequence charSequenceA01 = null;
                        while (i2 > 0) {
                            if (i2 >= 8) {
                                int iA0C = c11074v.A0C();
                                int boxType = c11074v.A0C();
                                int boxSize = iA0C - 8;
                                String strA0r = C5C.A0r(c11074v.A0l(), c11074v.A09(), boxSize);
                                c11074v.A0g(boxSize);
                                i2 = (i2 - 8) - boxSize;
                                if (boxType == 1937011815) {
                                    c10743oA08 = AbstractC1494Kn.A08(strA0r);
                                } else if (boxType == 1885436268) {
                                    charSequenceA01 = AbstractC1494Kn.A07(null, strA0r.trim(), Collections.emptyList());
                                }
                            } else {
                                throw new C2592lj(A01(48, 36, 105));
                            }
                        }
                        if (charSequenceA01 == null) {
                            charSequenceA01 = A01(0, 0, 70);
                        }
                        if (c10743oA08 != null) {
                            C10743o cueBuilder = c10743oA08.A0G(charSequenceA01);
                            return cueBuilder.A0H();
                        }
                        return AbstractC1494Kn.A09(charSequenceA01);
                    }

                    @Override // com.facebook.ads.redexgen.core.C8T
                    public final InterfaceC1464Jj A0g(byte[] bArr, int i2, boolean z2) throws C2592lj {
                        this.A00.A0j(bArr, i2);
                        ArrayList arrayList = new ArrayList();
                        while (this.A00.A07() > 0) {
                            if (this.A00.A07() >= 8) {
                                int boxType = this.A00.A0C();
                                int boxSize = this.A00.A0C();
                                if (boxSize == 1987343459) {
                                    arrayList.add(A00(this.A00, boxType - 8));
                                } else {
                                    this.A00.A0g(boxType - 8);
                                }
                            } else {
                                throw new C2592lj(A01(0, 48, 80));
                            }
                        }
                        return new C2583la(arrayList);
                    }
                };
            case 3:
                return new C8T() { // from class: com.facebook.ads.redexgen.X.1P
                    public static byte[] A01;
                    public static String[] A02 = {"p1JjjwHZ", "QiEjWLFXcVg7o", "nhuwGOrxAOZ3j55eqRpahgaz0GwfX6tj", "6yXpXZapadp8VRb316vvjAm5hV4yaSxg", "TGmXy7X22d03bAdpvyZyh6X1I", "ARR0m23eYWSlS3UtdvlKiKeM", "Lwdw5zAjTw10lXQrei1yTZcIsGO5NNLU", "PxBJlerCHj8MDVjvQLeWSQf3c"};
                    public static final Pattern A03;
                    public static final Pattern A04;
                    public static final KJ A05;
                    public static final KK A06;
                    public static final Pattern A07;
                    public static final Pattern A08;
                    public static final Pattern A09;
                    public static final Pattern A0A;
                    public static final Pattern A0B;
                    public final XmlPullParserFactory A00;

                    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
                    /* JADX WARN: Code duplicated, block: B:25:0x00d3  */
                    /* JADX WARN: Failed to parse debug info
                    java.lang.ArrayIndexOutOfBoundsException
                     */
                    public static long A01(String str2, KK kk) throws C2592lj {
                        Matcher matcher = A08.matcher(str2);
                        byte b3 = 5;
                        if (matcher.matches()) {
                            double d = (Long.parseLong((String) AbstractC10843y.A01(matcher.group(1))) * b.f37307P) + (Long.parseLong((String) AbstractC10843y.A01(matcher.group(2))) * 60) + Long.parseLong((String) AbstractC10843y.A01(matcher.group(3)));
                            String strGroup = matcher.group(4);
                            double d2 = d + (strGroup != null ? Double.parseDouble(strGroup) : 0.0d);
                            String strGroup2 = matcher.group(5);
                            String[] strArr = A02;
                            if (strArr[1].length() == strArr[5].length()) {
                                throw new RuntimeException();
                            }
                            String[] strArr2 = A02;
                            strArr2[6] = "mLEwrm7vKLrlfB6LVj0FJa0TtKMuAs5P";
                            strArr2[2] = "qTZwtworCWndH0Ay7tgKRNpRsf0PfjPC";
                            double d3 = d2 + (strGroup2 != null ? Long.parseLong(strGroup2) / kk.A00 : 0.0d);
                            String strGroup3 = matcher.group(6);
                            return (long) (1000000.0d * (d3 + (strGroup3 != null ? (Long.parseLong(strGroup3) / ((double) kk.A01)) / ((double) kk.A00) : 0.0d)));
                        }
                        Matcher matcher2 = A0A.matcher(str2);
                        if (!matcher2.matches()) {
                            throw new C2592lj(A0A(IronSourceError.ERROR_NT_INSTANCE_LOAD_TIMEOUT, 27, 100) + str2);
                        }
                        double d4 = Double.parseDouble((String) AbstractC10843y.A01(matcher2.group(1)));
                        String str3 = (String) AbstractC10843y.A01(matcher2.group(2));
                        switch (str3.hashCode()) {
                            case 102:
                                if (!str3.equals(A0A(1361, 1, 8))) {
                                    b3 = -1;
                                } else {
                                    b3 = 4;
                                }
                                break;
                            case 104:
                                if (!str3.equals(A0A(1467, 1, 40))) {
                                    b3 = -1;
                                } else {
                                    b3 = 0;
                                }
                                break;
                            case 109:
                                if (!str3.equals(A0A(1552, 1, 100))) {
                                    b3 = -1;
                                } else {
                                    b3 = 1;
                                }
                                break;
                            case 115:
                                if (!str3.equals(A0A(1640, 1, 44))) {
                                    b3 = -1;
                                } else {
                                    b3 = 2;
                                }
                                break;
                            case 116:
                                if (!str3.equals(A0A(1679, 1, 82))) {
                                    b3 = -1;
                                }
                                break;
                            case 3494:
                                if (!str3.equals(A0A(1561, 2, 125))) {
                                    b3 = -1;
                                } else {
                                    b3 = 3;
                                }
                                break;
                            default:
                                b3 = -1;
                                break;
                        }
                        switch (b3) {
                            case 0:
                                d4 *= 3600.0d;
                                break;
                            case 1:
                                d4 *= 60.0d;
                                break;
                            case 3:
                                d4 /= 1000.0d;
                                break;
                            case 4:
                                d4 /= (double) kk.A00;
                                break;
                            case 5:
                                d4 /= (double) kk.A02;
                                break;
                        }
                        return (long) (1000000.0d * d4);
                    }

                    /* JADX WARN: Failed to parse debug info
                    java.lang.ArrayIndexOutOfBoundsException
                     */
                    public static KJ A03(XmlPullParser xmlPullParser, KJ kj) throws C2592lj {
                        String attributeValue = xmlPullParser.getAttributeValue(A0A(1472, 35, 92), A0A(1285, 14, 65));
                        if (attributeValue == null) {
                            return kj;
                        }
                        Matcher matcher = A07.matcher(attributeValue);
                        boolean zMatches = matcher.matches();
                        String strA0A = A0A(166, 36, 70);
                        String strA0A2 = A0A(892, 11, 16);
                        if (!zMatches) {
                            AbstractC10924g.A07(strA0A2, strA0A + attributeValue);
                            return kj;
                        }
                        try {
                            int i2 = Integer.parseInt((String) AbstractC10843y.A01(matcher.group(1)));
                            int i3 = Integer.parseInt((String) AbstractC10843y.A01(matcher.group(2)));
                            if (i2 == 0 || i3 == 0) {
                                throw new C2592lj(A0A(557, 24, 126) + i2 + A0A(0, 1, 42) + i3);
                            }
                            return new KJ(i2, i3);
                        } catch (NumberFormatException unused) {
                            AbstractC10924g.A07(strA0A2, strA0A + attributeValue);
                            return kj;
                        }
                    }

                    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
                    /* JADX WARN: Code duplicated, block: B:10:0x0042  */
                    /* JADX WARN: Code duplicated, block: B:12:0x0050  */
                    /* JADX WARN: Code duplicated, block: B:13:0x0055  */
                    /* JADX WARN: Code duplicated, block: B:15:0x005d  */
                    /* JADX WARN: Code duplicated, block: B:16:0x0060  */
                    /* JADX WARN: Code duplicated, block: B:18:0x0067  */
                    /* JADX WARN: Code duplicated, block: B:19:0x006a  */
                    /* JADX WARN: Code duplicated, block: B:20:0x006f  */
                    /* JADX WARN: Code duplicated, block: B:21:0x0074  */
                    /* JADX WARN: Code duplicated, block: B:6:0x0039  */
                    /* JADX WARN: Code duplicated, block: B:74:0x003f A[DONT_GENERATE, SYNTHETIC] */
                    /* JADX WARN: Code duplicated, block: B:75:0x003f A[SYNTHETIC] */
                    /* JADX WARN: Code duplicated, block: B:77:0x003f A[SYNTHETIC] */
                    /* JADX WARN: Code duplicated, block: B:79:0x003f A[SYNTHETIC] */
                    /* JADX WARN: Failed to parse debug info
                    java.lang.ArrayIndexOutOfBoundsException
                     */
                    public static KM A06(XmlPullParser xmlPullParser, KM km, Map<String, KN> map, KK kk) throws C2592lj {
                        byte b3;
                        String[] strArrA0G;
                        long jA01 = -9223372036854775807L;
                        long jA02 = -9223372036854775807L;
                        long jA03 = -9223372036854775807L;
                        String strA0A = A0A(0, 0, 87);
                        String strSubstring = null;
                        String[] strArr = null;
                        int attributeCount = xmlPullParser.getAttributeCount();
                        KT ktA09 = A09(xmlPullParser, null);
                        for (int i2 = 0; i2 < attributeCount; i2++) {
                            String attributeName = xmlPullParser.getAttributeName(i2);
                            String attributeValue = xmlPullParser.getAttributeValue(i2);
                            switch (attributeName.hashCode()) {
                                case -934795532:
                                    if (attributeName.equals(A0A(1613, 6, 33))) {
                                        b3 = 4;
                                    } else {
                                        b3 = -1;
                                    }
                                    switch (b3) {
                                        case 0:
                                            jA02 = A01(attributeValue, kk);
                                            break;
                                        case 1:
                                            jA03 = A01(attributeValue, kk);
                                            break;
                                        case 2:
                                            jA01 = A01(attributeValue, kk);
                                            break;
                                        case 3:
                                            strArrA0G = A0G(attributeValue);
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
                                            if (attributeValue.startsWith(A0A(1, 1, 51))) {
                                                strSubstring = attributeValue.substring(1);
                                            }
                                            break;
                                    }
                                    break;
                                case 99841:
                                    if (attributeName.equals(A0A(1347, 3, 53))) {
                                        b3 = 2;
                                    } else {
                                        b3 = -1;
                                    }
                                    switch (b3) {
                                        case 0:
                                            jA02 = A01(attributeValue, kk);
                                            break;
                                        case 1:
                                            jA03 = A01(attributeValue, kk);
                                            break;
                                        case 2:
                                            jA01 = A01(attributeValue, kk);
                                            break;
                                        case 3:
                                            strArrA0G = A0G(attributeValue);
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
                                            if (attributeValue.startsWith(A0A(1, 1, 51))) {
                                                strSubstring = attributeValue.substring(1);
                                            }
                                            break;
                                    }
                                    break;
                                case 100571:
                                    if (attributeName.equals(A0A(1352, 3, 17))) {
                                        b3 = 1;
                                    } else {
                                        b3 = -1;
                                    }
                                    switch (b3) {
                                        case 0:
                                            jA02 = A01(attributeValue, kk);
                                            break;
                                        case 1:
                                            jA03 = A01(attributeValue, kk);
                                            break;
                                        case 2:
                                            jA01 = A01(attributeValue, kk);
                                            break;
                                        case 3:
                                            strArrA0G = A0G(attributeValue);
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
                                            if (attributeValue.startsWith(A0A(1, 1, 51))) {
                                                strSubstring = attributeValue.substring(1);
                                            }
                                            break;
                                    }
                                    break;
                                case 93616297:
                                    if (attributeName.equals(A0A(1270, 5, 60))) {
                                        b3 = 0;
                                    } else {
                                        b3 = -1;
                                    }
                                    switch (b3) {
                                        case 0:
                                            jA02 = A01(attributeValue, kk);
                                            break;
                                        case 1:
                                            jA03 = A01(attributeValue, kk);
                                            break;
                                        case 2:
                                            jA01 = A01(attributeValue, kk);
                                            break;
                                        case 3:
                                            strArrA0G = A0G(attributeValue);
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
                                            if (attributeValue.startsWith(A0A(1, 1, 51))) {
                                                strSubstring = attributeValue.substring(1);
                                            }
                                            break;
                                    }
                                    break;
                                case 109780401:
                                    if (attributeName.equals(A0A(1655, 5, 93))) {
                                        b3 = 3;
                                    } else {
                                        b3 = -1;
                                    }
                                    switch (b3) {
                                        case 0:
                                            jA02 = A01(attributeValue, kk);
                                            break;
                                        case 1:
                                            jA03 = A01(attributeValue, kk);
                                            break;
                                        case 2:
                                            jA01 = A01(attributeValue, kk);
                                            break;
                                        case 3:
                                            strArrA0G = A0G(attributeValue);
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
                                            if (attributeValue.startsWith(A0A(1, 1, 51))) {
                                                strSubstring = attributeValue.substring(1);
                                            }
                                            break;
                                    }
                                    break;
                                case 1292595405:
                                    if (A02[0].length() == 7) {
                                        throw new RuntimeException();
                                    }
                                    A02[0] = "FcYwA1owpw";
                                    if (attributeName.equals(A0A(1232, 15, 51))) {
                                        b3 = 5;
                                    } else {
                                        b3 = -1;
                                    }
                                    switch (b3) {
                                        case 0:
                                            jA02 = A01(attributeValue, kk);
                                            break;
                                        case 1:
                                            jA03 = A01(attributeValue, kk);
                                            break;
                                        case 2:
                                            jA01 = A01(attributeValue, kk);
                                            break;
                                        case 3:
                                            strArrA0G = A0G(attributeValue);
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
                                            if (attributeValue.startsWith(A0A(1, 1, 51))) {
                                                strSubstring = attributeValue.substring(1);
                                            }
                                            break;
                                    }
                                    break;
                                    break;
                                default:
                                    b3 = -1;
                                    switch (b3) {
                                        case 0:
                                            jA02 = A01(attributeValue, kk);
                                            break;
                                        case 1:
                                            jA03 = A01(attributeValue, kk);
                                            break;
                                        case 2:
                                            jA01 = A01(attributeValue, kk);
                                            break;
                                        case 3:
                                            strArrA0G = A0G(attributeValue);
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
                                            if (attributeValue.startsWith(A0A(1, 1, 51))) {
                                                strSubstring = attributeValue.substring(1);
                                            }
                                            break;
                                    }
                                    break;
                            }
                        }
                        if (km != null && km.A02 != -9223372036854775807L) {
                            if (jA02 != -9223372036854775807L) {
                                long j = km.A02;
                                if (A02[3].charAt(8) != 'a') {
                                    jA02 += j;
                                } else {
                                    String[] strArr2 = A02;
                                    strArr2[6] = "4egwN988QRVxw0yAxczVmSNgNtgmaxGX";
                                    strArr2[2] = "SadwrkDoEbwTlMV1MTCuskhR2RkUu0E1";
                                    jA02 += j;
                                }
                            }
                            if (jA03 != -9223372036854775807L) {
                                long j2 = km.A02;
                                String[] strArr3 = A02;
                                if (strArr3[1].length() == strArr3[5].length()) {
                                    throw new RuntimeException();
                                }
                                A02[3] = "SZxfmWq4amNcL9TaQQOLLAMwfZNolhcd";
                                jA03 += j2;
                            }
                        }
                        if (jA03 == -9223372036854775807L) {
                            if (jA01 != -9223372036854775807L) {
                                jA03 = jA02 + jA01;
                            } else if (km != null && km.A01 != -9223372036854775807L) {
                                jA03 = km.A01;
                            }
                        }
                        return KM.A02(xmlPullParser.getName(), jA02, jA03, ktA09, strArr, strA0A, strSubstring, km);
                    }

                    public static String A0A(int i2, int i3, int i4) {
                        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i2, i2 + i3);
                        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
                            byte b3 = bArrCopyOfRange[i5];
                            if (A02[0].length() == 7) {
                                throw new RuntimeException();
                            }
                            String[] strArr = A02;
                            strArr[1] = "MzedSJZDJL3LD";
                            strArr[5] = "g6loelR4939QZaycQmxedlYL";
                            bArrCopyOfRange[i5] = (byte) ((b3 - i4) - 113);
                        }
                        return new String(bArrCopyOfRange);
                    }

                    /* JADX WARN: Failed to parse debug info
                    java.lang.ArrayIndexOutOfBoundsException
                     */
                    public static Map<String, KT> A0B(XmlPullParser xmlPullParser, Map<String, KT> map, KJ kj, KL kl, Map<String, KN> map2, Map<String, String> map3) throws XmlPullParserException, IOException {
                        do {
                            xmlPullParser.next();
                            String strA0A = A0A(1655, 5, 93);
                            if (C5I.A04(xmlPullParser, strA0A)) {
                                String strA00 = C5I.A00(xmlPullParser, strA0A);
                                KT ktA09 = A09(xmlPullParser, new KT());
                                if (strA00 != null) {
                                    String[] strArrA0G = A0G(strA00);
                                    if (A02[3].charAt(8) != 'a') {
                                        throw new RuntimeException();
                                    }
                                    String[] strArr = A02;
                                    strArr[6] = "oxowjvWuzCcWkzEkDRByU8LkLZUydqr3";
                                    strArr[2] = "XAdwn62c6rSvSVMr71C9Wpdxl0LeAUIU";
                                    for (String str2 : strArrA0G) {
                                        ktA09.A0O(map.get(str2));
                                    }
                                }
                                String strA0X = ktA09.A0X();
                                if (strA0X != null) {
                                    map.put(strA0X, ktA09);
                                }
                            } else if (C5I.A04(xmlPullParser, A0A(1613, 6, 33))) {
                                KN knA07 = A07(xmlPullParser, kj, kl);
                                if (knA07 != null) {
                                    map2.put(knA07.A09, knA07);
                                }
                            } else {
                                boolean zA04 = C5I.A04(xmlPullParser, A0A(1553, 8, 69));
                                String[] strArr2 = A02;
                                if (strArr2[1].length() == strArr2[5].length()) {
                                    throw new RuntimeException();
                                }
                                String[] strArr3 = A02;
                                strArr3[6] = "B6Mw4qhmB6vQw7zev9YlYKUDY0kxCfVe";
                                strArr3[2] = "G12wwLtLBhQxBioY68m1H9JFDs55K6Az";
                                if (zA04) {
                                    A0E(xmlPullParser, map3);
                                }
                            }
                        } while (!C5I.A03(xmlPullParser, A0A(1468, 4, 96)));
                        return map;
                    }

                    public static void A0C() {
                        byte[] bArr = {-69, -57, 6, -27, -20, -36, 11, 55, 61, 52, 44, 54, -17, 60, -24, 43, 58, 45, 41, 60, 45, -24, 32, 53, 52, 24, 61, 52, 52, 24, 41, 58, 59, 45, 58, 14, 41, 43, 60, 55, 58, 65, -24, 49, 54, 59, 60, 41, 54, 43, 45, 28, 55, 63, 66, 59, 58, -10, 70, 55, 72, 73, 63, 68, 61, -10, 56, 55, 57, 65, 61, 72, 69, 75, 68, 58, -10, 76, 55, 66, 75, 59, 16, -10, -73, -46, -38, -35, -42, -43, -111, -31, -46, -29, -28, -38, -33, -40, -111, -44, -32, -35, -32, -29, -111, -25, -46, -35, -26, -42, -85, -111, 16, 43, 51, 54, 47, 46, -22, 58, 43, 60, 61, 51, 56, 49, -22, 48, 57, 56, 62, 29, 51, 68, 47, -22, 64, 43, 54, 63, 47, 4, -22, 0, 27, 35, 38, 31, 30, -38, 46, 41, -38, 42, 27, 44, 45, 31, -38, 45, 34, 31, 27, 44, -12, -38, 0, 30, 37, 38, 41, 32, 37, 30, -41, 36, 24, 35, 29, 38, 41, 36, 28, 27, -41, 26, 28, 35, 35, -41, 41, 28, 42, 38, 35, 44, 43, 32, 38, 37, -15, -41, 29, 59, 66, 67, 70, 61, 66, 59, -12, 65, 53, 64, 58, 67, 70, 65, 57, 56, -12, 72, 72, 71, -12, 57, 76, 72, 57, 66, 72, 14, -12, 52, 82, 89, 90, 93, 84, 89, 82, 11, 89, 90, 89, 24, 91, 84, 99, 80, 87, 11, 95, 95, 94, 11, 80, 99, 95, 80, 89, 95, 37, 11, 1, 31, 38, 39, 42, 33, 38, 31, -40, 42, 29, 31, 33, 39, 38, -40, 47, 33, 44, 32, -40, 37, 25, 36, 30, 39, 42, 37, 29, 28, -40, 29, 48, 44, 29, 38, 44, -14, -40, -41, -11, -4, -3, 0, -9, -4, -11, -82, 0, -13, -11, -9, -3, -4, -82, 5, -9, 2, -10, -82, -5, -17, -6, -12, -3, 0, -5, -13, -14, -82, -3, 0, -9, -11, -9, -4, -56, -82, -15, 15, 22, 23, 26, 17, 22, 15, -56, 26, 13, 15, 17, 23, 22, -56, 31, 17, 28, 16, -56, 21, 17, 27, 27, 17, 22, 15, -56, 28, 28, 27, -30, 13, 32, 28, 13, 22, 28, -30, -56, 40, 70, 77, 78, 81, 72, 77, 70, -1, 81, 68, 70, 72, 78, 77, -1, 86, 72, 83, 71, -1, 84, 77, 82, 84, 79, 79, 78, 81, 83, 68, 67, -1, 68, 87, 83, 68, 77, 83, 25, -1, -9, 21, 28, 29, 32, 23, 28, 21, -50, 32, 19, 21, 23, 29, 28, -50, 37, 23, 34, 22, -50, 35, 28, 33, 35, 30, 30, 29, 32, 34, 19, 18, -50, 29, 32, 23, 21, 23, 28, -24, -50, -20, 10, 17, 18, 21, 12, 17, 10, -61, 21, 8, 10, 12, 18, 17, -61, 26, 12, 23, 11, 18, 24, 23, -61, 4, 17, -61, 8, 27, 23, 8, 17, 23, -57, -27, -20, -19, -16, -25, -20, -27, -98, -16, -29, -27, -25, -19, -20, -98, -11, -25, -14, -26, -19, -13, -14, -98, -33, -20, -98, -19, -16, -25, -27, -25, -20, 44, 74, 81, 82, 85, 76, 81, 74, 3, 88, 81, 86, 88, 83, 83, 82, 85, 87, 72, 71, 3, 87, 68, 74, 29, 3, 56, 93, 101, 80, 91, 88, 83, 15, 82, 84, 91, 91, 15, 97, 84, 98, 94, 91, 100, 99, 88, 94, 93, 15, -46, -9, -1, -22, -11, -14, -19, -87, -18, 1, -7, -5, -18, -4, -4, -14, -8, -9, -87, -17, -8, -5, -87, -17, -8, -9, -3, -36, -14, 3, -18, -61, -87, -80, 6, 43, 51, 30, 41, 38, 33, -35, 43, 50, 42, 31, 34, 47, -35, 44, 35, -35, 34, 43, 49, 47, 38, 34, 48, -35, 35, 44, 47, -35, 35, 44, 43, 49, 16, 38, 55, 34, -9, -35, -16, 21, 29, 8, 19, 16, 11, -57, 28, 21, 16, 27, -57, 13, 22, 25, -57, 13, 22, 21, 27, -6, 16, 33, 12, -31, -57, -50, 2, 39, 47, 26, 37, 34, 29, -39, 47, 26, 37, 46, 30, -39, 31, 40, 43, -39, 44, 33, 30, 26, 43, -13, -39, 34, 54, 65, 59, 68, 71, 66, 58, 57, -11, 73, 62, 66, 58, -11, 58, 77, 69, 71, 58, 72, 72, 62, 68, 67, 15, -11, 39, 79, 70, 78, 67, 74, 70, 63, -6, 80, 59, 70, 79, 63, 77, -6, 67, 72, -6, 64, 73, 72, 78, 45, 67, 84, 63, -6, 59, 78, 78, 76, 67, 60, 79, 78, 63, 8, -6, 42, 67, 61, 69, 67, 72, 65, -6, 78, 66, 63, -6, 77, 63, 61, 73, 72, 62, -6, 80, 59, 70, 79, 63, -6, 64, 73, 76, -6, 80, 63, 76, 78, 67, 61, 59, 70, -6, 64, 73, 72, 78, -6, 77, 67, 84, 63, -6, 59, 72, 62, -6, 67, 65, 72, 73, 76, 67, 72, 65, -6, 78, 66, 63, -6, 64, 67, 76, 77, 78, 8, -58, -25, -104, -52, -52, -59, -60, -104, -21, -19, -38, -20, -31, -20, -28, -35, -21, -104, -34, -25, -19, -26, -36, -31, 3, -2, -2, 0, -13, 1, 1, -9, -4, -11, -82, -2, -17, 0, 1, -13, 0, -82, -13, 0, 0, -3, 0, -43, -11, -18, -19, -59, -26, -28, -16, -27, -26, -13, -10, 15, 2, 3, 13, 6, -63, 21, 16, -63, 5, 6, 4, 16, 5, 6, -63, 20, 16, 22, 19, 4, 6, -25, 0, -9, 10, 2, -9, -11, 6, -9, -10, -78, -9, 4, 4, 1, 4, -78, 9, -6, -9, 0, -78, 4, -9, -13, -10, -5, 0, -7, -78, -5, 0, 2, 7, 6, -64, 9, 32, -40, -42, -96, -96, -45, -88, -91, -79, -43, -94, -90, -95, -73, -45, -88, -91, -79, -43, -93, -95, -96, -24, -16, -12, -35, -27, -12, -99, -95, -100, -16, -70, -19, -65, -67, -17, 
                        -47, -18, -10, -67, -18, -64, -47, -18, -10, -68, -47, -69, -73, -74, -47, -101, -50, -93, -96, -84, -48, -98, -101, -78, -83, -49, -95, -50, -93, -96, -84, -48, -98, -100, -78, -100, -101, -37, -17, -32, -17, -26, -17, -32, -26, -17, -39, -17, -25, -100, -105, 17, -37, 14, -29, -32, -20, 16, 14, -29, -32, -20, 16, -34, -36, -19, -37, 14, -29, -32, -20, 16, 14, -29, -32, -20, 16, -36, -19, -37, 14, -29, -32, -20, 16, 14, -29, -32, -20, 16, -36, -37, -14, -19, -37, 15, -31, 14, -29, -32, -20, 16, -34, -36, 47, -19, -37, 14, -29, -32, -20, 16, 14, -29, -32, -20, 16, -36, -37, -14, -19, 15, -31, -37, 14, -29, -32, -20, 16, -34, -36, -36, -14, -36, -14, -41, 54, 0, 52, 60, 3, 1, -8, 0, 52, 60, 3, 1, -4, -49, -103, -51, -43, -100, -51, -97, -80, -51, -43, -101, -80, -102, -106, -111, -103, -51, -43, -100, -51, -97, -80, -51, -43, -101, -80, -102, -106, -107, 18, -36, 16, 24, -33, 16, -30, -13, 16, 24, -34, -13, -35, 36, 44, -44, -36, 16, 24, -33, 16, -30, -13, 16, 24, -34, -13, -35, 36, 44, -40, -9, -4, 10, -5, 8, 28, 39, 39, 58, 57, 59, 67, 63, 74, 71, 77, 70, 60, 27, 71, 68, 71, 74, 6, 5, 7, 15, 11, 22, 19, 25, 18, 8, -19, 17, 5, 11, 9, 76, 75, 93, 79, 15, 14, 32, 18, -16, 28, 27, 33, 14, 22, 27, 18, 31, 54, 57, 58, 67, 70, 57, 15, 18, 20, 22, 27, -2, 11, 0, 21, 25, 38, 35, 27, 52, 68, 21, 23, 30, 30, 4, 23, 37, 33, 30, 39, 38, 27, 33, 32, -26, -24, -15, -9, -24, -11, 45, 57, 54, 57, 60, 79, 91, 90, 96, 77, 85, 90, 81, 94, -32, -35, -16, -35, -24, -23, -16, -19, -15, -19, -8, -23, -10, 68, 73, 83, 80, 76, 65, 89, 33, 76, 73, 71, 78, 61, 66, 79, 10, 27, 24, 34, 42, -25, -16, -26, 3, 22, 18, 3, 12, 18, -33, -19, -10, -11, -5, -51, -24, -12, -16, -13, 0, -28, -19, -20, -14, -47, -25, -8, -29, 54, 63, 62, 68, 35, 68, 73, 60, 53, 4, 13, 12, 18, -11, 3, 7, 5, 6, 18, 80, 92, 75, 87, 79, 60, 75, 94, 79, -15, -3, -20, -8, -16, -35, -20, -1, -16, -40, 0, -9, -1, -12, -5, -9, -12, -16, -3, -20, -8, -25, -13, -21, -40, -25, -6, -21, -45, -5, -14, -6, -17, -10, -14, -17, -21, -8, -90, -22, -11, -21, -7, -12, -83, -6, -90, -18, -25, -4, -21, -90, -72, -90, -10, -25, -8, -6, -7, 1, 57, 54, 50, 53, 53, 65, 65, 61, 7, -4, -4, 68, 68, 68, -5, 68, 0, -5, 60, 63, 52, -4, 59, 64, -4, 65, 65, 58, 57, -16, 61, 46, 63, 46, 58, 50, 65, 50, 63, 52, 47, 3, 7, -5, 1, -1, -35, -30, -38, -29, -26, -31, -43, -24, -35, -29, -30, 0, 11, -8, 3, 0, -6, 50, 39, 63, 53, 59, 58, 87, 80, 81, 95, 4, 1, 6, -3, 12, 0, 10, 7, 13, -1, 0, 66, 35, 27, 42, 23, 26, 23, 42, 23, 91, 97, 40, 48, 39, 47, 36, 13, 42, 50, -4, 39, 36, 34, 41, 76, 77, 74, 71, 76, 67, 82, 70, 80, 77, 83, 69, 70, 60, 61, 60, 51, 25, 26, 32, 25, 15, 16, 29, 23, 20, 25, 16, 33, 36, 27, 25, 27, 32, -31, 80, 88, 4, -9, -7, -5, 1, 0, -3, -12, -14, -13, -1, 88, 91, 72, 95, 75, 78, 59, 82, 41, 72, 76, 66, 77, 66, 72, 71, 16, 37, 26, 23, 19, 36, 34, 31, 16, 29, 32, 33, 14, 31, 33, 65, 66, 71, 58, 51, 71, 72, 77, 64, 61, 66, 59, 74, 76, 57, 29, 73, 56, 68, 60, 41, 56, 75, 60, 55, 27, 9, 53, 35, 45, 51, -3, -21, -5, -11, 42, 27, 46, 42, 60, 45, 64, 60, 9, 52, 49, 47, 54, 60, 45, 64, 60, 11, 55, 53, 42, 49, 54, 45, -6, -21, -2, -6, -55, -11, -12, -6, -25, -17, -12, -21, -8, 67, 52, 71, 67, 19, 52, 50, 62, 65, 48, 67, 56, 62, 61, 22, 7, 26, 22, -25, 15, 18, 10, 3, 21, 11, 21, 80, 69, 63, 71, 46, 61, 80, 65, 29, 29, 47, 40, 30, 31, 44, 38, 35, 40, 31, -8, -13, -22, -11, -22, -17, -24, -50, -16, -27, -26};
                        String[] strArr = A02;
                        if (strArr[6].charAt(3) != strArr[2].charAt(3)) {
                            throw new RuntimeException();
                        }
                        A02[3] = "YYEb81Zja86Dd7gFpf2yHyw2w0ZKb0ns";
                        A01 = bArr;
                    }

                    /* JADX WARN: Failed to parse debug info
                    java.lang.ArrayIndexOutOfBoundsException
                     */
                    @Override // com.facebook.ads.redexgen.core.C8T
                    public final InterfaceC1464Jj A0g(byte[] bArr, int i2, boolean z2) throws C2592lj {
                        String strA0A = A0A(0, 0, 87);
                        try {
                            XmlPullParser xmlPullParserNewPullParser = this.A00.newPullParser();
                            HashMap map = new HashMap();
                            HashMap map2 = new HashMap();
                            HashMap map3 = new HashMap();
                            map2.put(strA0A, new KN(strA0A));
                            xmlPullParserNewPullParser.setInput(new ByteArrayInputStream(bArr, 0, i2), null);
                            C2585lc c2585lc = null;
                            ArrayDeque arrayDeque = new ArrayDeque();
                            int i3 = 0;
                            KK kkA04 = A06;
                            KJ kjA03 = A05;
                            KL klA05 = null;
                            for (int eventType = xmlPullParserNewPullParser.getEventType(); eventType != 1; eventType = xmlPullParserNewPullParser.getEventType()) {
                                KM km = (KM) arrayDeque.peek();
                                if (i3 == 0) {
                                    String name = xmlPullParserNewPullParser.getName();
                                    String strA0A2 = A0A(1761, 2, 56);
                                    if (eventType == 2) {
                                        if (strA0A2.equals(name)) {
                                            kkA04 = A04(xmlPullParserNewPullParser);
                                            kjA03 = A03(xmlPullParserNewPullParser, A05);
                                            klA05 = A05(xmlPullParserNewPullParser);
                                        }
                                        boolean zA0F = A0F(name);
                                        String strA0A3 = A0A(892, 11, 16);
                                        if (!zA0F) {
                                            AbstractC10924g.A06(strA0A3, A0A(531, 26, 114) + xmlPullParserNewPullParser.getName());
                                            i3++;
                                        } else if (A0A(1468, 4, 96).equals(name)) {
                                            A0B(xmlPullParserNewPullParser, map, kjA03, klA05, map2, map3);
                                        } else {
                                            try {
                                                KM kmA06 = A06(xmlPullParserNewPullParser, km, map2, kkA04);
                                                arrayDeque.push(kmA06);
                                                if (km != null) {
                                                    km.A0F(kmA06);
                                                }
                                            } catch (C2592lj e2) {
                                                AbstractC10924g.A0A(strA0A3, A0A(868, 24, 29), e2);
                                                i3++;
                                            }
                                        }
                                    } else if (eventType == 4) {
                                        ((KM) AbstractC10843y.A01(km)).A0F(KM.A01(xmlPullParserNewPullParser.getText()));
                                    } else if (eventType == 3) {
                                        if (xmlPullParserNewPullParser.getName().equals(strA0A2)) {
                                            c2585lc = new C2585lc((KM) AbstractC10843y.A01((KM) arrayDeque.peek()), map, map2, map3);
                                        }
                                        arrayDeque.pop();
                                    }
                                } else {
                                    if (A02[0].length() == 7) {
                                        throw new RuntimeException();
                                    }
                                    A02[3] = "q6wSX38Wa3tvhMiP87hlFBAs7B3bq4ae";
                                    if (eventType == 2) {
                                        i3++;
                                    } else if (eventType == 3) {
                                        i3--;
                                    }
                                }
                                xmlPullParserNewPullParser.next();
                            }
                            if (c2585lc != null) {
                                return c2585lc;
                            }
                            throw new C2592lj(A0A(845, 23, 7));
                        } catch (IOException e3) {
                            throw new IllegalStateException(A0A(926, 36, 33), e3);
                        } catch (XmlPullParserException e4) {
                            throw new C2592lj(A0A(903, 23, 48), e4);
                        }
                    }

                    static {
                        A0C();
                        A08 = Pattern.compile(A0A(IronSourceError.ERROR_DO_IS_CALL_LOAD_BEFORE_SHOW, 85, 66));
                        A0A = Pattern.compile(A0A(f9.j, 37, 2));
                        A09 = Pattern.compile(A0A(965, 29, 7));
                        A04 = Pattern.compile(A0A(994, 20, 33));
                        A03 = Pattern.compile(A0A(1149, 29, 0));
                        A0B = Pattern.compile(A0A(1178, 31, 67));
                        A07 = Pattern.compile(A0A(1136, 13, 103));
                        A06 = new KK(30.0f, 1, 1);
                        A05 = new KJ(32, 15);
                    }

                    {
                        A0A(892, 11, 16);
                        try {
                            this.A00 = XmlPullParserFactory.newInstance();
                            this.A00.setNamespaceAware(true);
                        } catch (XmlPullParserException e2) {
                            throw new RuntimeException(A0A(6, 45, 87), e2);
                        }
                    }

                    public static float A00(String str2) {
                        Matcher matcher = A04.matcher(str2);
                        boolean zMatches = matcher.matches();
                        String strA0A = A0A(892, 11, 16);
                        if (!zMatches) {
                            AbstractC10924g.A07(strA0A, A0A(683, 25, 72) + str2);
                            return Float.MAX_VALUE;
                        }
                        try {
                            return Math.min(100.0f, Math.max(-100.0f, Float.parseFloat((String) AbstractC10843y.A01(matcher.group(1)))));
                        } catch (NumberFormatException e2) {
                            AbstractC10924g.A0A(strA0A, A0A(143, 23, 73) + str2, e2);
                            return Float.MAX_VALUE;
                        }
                    }

                    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
                    /* JADX WARN: Code duplicated, block: B:4:0x000b  */
                    public static Layout.Alignment A02(String str2) {
                        byte b3;
                        String strA01 = AbstractC2495k7.A01(str2);
                        switch (strA01.hashCode()) {
                            case -1364013995:
                                if (!strA01.equals(A0A(1299, 6, 18))) {
                                    b3 = -1;
                                } else {
                                    b3 = 4;
                                }
                                break;
                            case 100571:
                                if (!strA01.equals(A0A(1352, 3, 17))) {
                                    b3 = -1;
                                } else {
                                    b3 = 3;
                                }
                                break;
                            case 3317767:
                                if (!strA01.equals(A0A(1537, 4, 122))) {
                                    b3 = -1;
                                } else {
                                    b3 = 0;
                                }
                                break;
                            case 108511772:
                                if (!strA01.equals(A0A(1619, 5, 26))) {
                                    b3 = -1;
                                } else {
                                    b3 = 2;
                                }
                                break;
                            case 109757538:
                                if (!strA01.equals(A0A(1650, 5, 60))) {
                                    b3 = -1;
                                } else {
                                    b3 = 1;
                                }
                                break;
                            default:
                                b3 = -1;
                                break;
                        }
                        switch (b3) {
                            case 0:
                            case 1:
                                return Layout.Alignment.ALIGN_NORMAL;
                            case 2:
                            case 3:
                                Layout.Alignment alignment = Layout.Alignment.ALIGN_OPPOSITE;
                                if (A02[3].charAt(8) != 'a') {
                                    throw new RuntimeException();
                                }
                                A02[0] = "QuoyGMZU77HTmr";
                                return alignment;
                            case 4:
                                return Layout.Alignment.ALIGN_CENTER;
                            default:
                                return null;
                        }
                    }

                    public static KK A04(XmlPullParser xmlPullParser) throws C2592lj {
                        int tickRate = 30;
                        String strA0A = A0A(1399, 9, 121);
                        String strA0A2 = A0A(1472, 35, 92);
                        String attributeValue = xmlPullParser.getAttributeValue(strA0A2, strA0A);
                        if (attributeValue != null) {
                            tickRate = Integer.parseInt(attributeValue);
                        }
                        float numerator = 1.0f;
                        String attributeValue2 = xmlPullParser.getAttributeValue(strA0A2, A0A(1408, 19, 26));
                        if (attributeValue2 != null) {
                            String[] strArrA1O = C5C.A1O(attributeValue2, A0A(0, 1, 42));
                            if (strArrA1O.length == 2) {
                                int frameRate = Integer.parseInt(strArrA1O[0]);
                                float numerator2 = frameRate;
                                int frameRate2 = Integer.parseInt(strArrA1O[1]);
                                numerator = numerator2 / frameRate2;
                            } else {
                                String frameRateString = A0A(1427, 40, 21);
                                throw new C2592lj(frameRateString);
                            }
                        }
                        int subFrameRate = A06.A01;
                        String attributeValue3 = xmlPullParser.getAttributeValue(strA0A2, A0A(1667, 12, 102));
                        if (attributeValue3 != null) {
                            subFrameRate = Integer.parseInt(attributeValue3);
                        }
                        int i2 = A06.A02;
                        String strA0A3 = A0A(1753, 8, 107);
                        String[] strArr = A02;
                        String frameRateString2 = strArr[1];
                        String str2 = strArr[5];
                        int length = frameRateString2.length();
                        int frameRate3 = str2.length();
                        if (length == frameRate3) {
                            throw new RuntimeException();
                        }
                        String[] strArr2 = A02;
                        strArr2[6] = "ZUswaBax6tLaE1IC4JCUj1Icv8MP2XMH";
                        strArr2[2] = "PhpwRqbX9uhXuGLmIXMh7Q7Ymyg4xhXC";
                        String attributeValue4 = xmlPullParser.getAttributeValue(strA0A2, strA0A3);
                        if (attributeValue4 != null) {
                            i2 = Integer.parseInt(attributeValue4);
                        }
                        return new KK(tickRate * numerator, subFrameRate, i2);
                    }

                    public static KL A05(XmlPullParser xmlPullParser) {
                        String strA00 = C5I.A00(xmlPullParser, A0A(1355, 6, 45));
                        if (strA00 == null) {
                            return null;
                        }
                        Matcher matcher = A0B.matcher(strA00);
                        boolean zMatches = matcher.matches();
                        String strA0A = A0A(892, 11, 16);
                        if (!zMatches) {
                            StringBuilder sb = new StringBuilder();
                            String ttsExtent = A0A(233, 31, 122);
                            AbstractC10924g.A07(strA0A, sb.append(ttsExtent).append(strA00).toString());
                            return null;
                        }
                        try {
                            String ttsExtent2 = matcher.group(1);
                            int i2 = Integer.parseInt((String) AbstractC10843y.A01(ttsExtent2));
                            String ttsExtent3 = matcher.group(2);
                            return new KL(i2, Integer.parseInt((String) AbstractC10843y.A01(ttsExtent3)));
                        } catch (NumberFormatException unused) {
                            StringBuilder sb2 = new StringBuilder();
                            String ttsExtent4 = A0A(202, 31, 99);
                            AbstractC10924g.A07(strA0A, sb2.append(ttsExtent4).append(strA00).toString());
                            return null;
                        }
                    }

                    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
                    /* JADX WARN: Code duplicated, block: B:41:0x01b7  */
                    /* JADX WARN: Code duplicated, block: B:47:0x01e1  */
                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.String] */
                    /* JADX WARN: Type inference failed for: r3v2 */
                    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.CharSequence, java.lang.String] */
                    /* JADX WARN: Type inference failed for: r5v2 */
                    public static KN A07(XmlPullParser xmlPullParser, KJ kj, KL kl) {
                        float f;
                        float line;
                        float f2;
                        float f3;
                        byte b3;
                        String strA00 = C5I.A00(xmlPullParser, A0A(cs.a.INSTANCE_NOT_FOUND_IN_SHOW, 2, 90));
                        if (strA00 == null) {
                            return null;
                        }
                        String strA01 = C5I.A00(xmlPullParser, A0A(1604, 6, 65));
                        String strA0A = A0A(892, 11, 16);
                        if (strA01 != 0) {
                            Matcher matcher = A03.matcher(strA01);
                            Matcher matcher2 = A0B.matcher(strA01);
                            boolean zMatches = matcher.matches();
                            String strA0A2 = A0A(BaseATView.g.f38290N, 39, 29);
                            String strA0A3 = A0A(342, 41, 55);
                            byte b4 = 2;
                            try {
                                if (zMatches) {
                                    try {
                                        f = Float.parseFloat((String) AbstractC10843y.A01(matcher.group(1))) / 100.0f;
                                        line = Float.parseFloat((String) AbstractC10843y.A01(matcher.group(2))) / 100.0f;
                                    } catch (NumberFormatException unused) {
                                        AbstractC10924g.A07(strA0A, strA0A2 + ((String) strA01));
                                        return null;
                                    }
                                } else {
                                    boolean zMatches2 = matcher2.matches();
                                    String[] strArr = A02;
                                    if (strArr[6].charAt(3) != strArr[2].charAt(3)) {
                                        throw new RuntimeException();
                                    }
                                    String[] strArr2 = A02;
                                    strArr2[4] = "JOMz8RfhZxjyjCW014gv2m0MH";
                                    strArr2[7] = "qk3Phvnbbo37fKBWKDjhM47dE";
                                    if (zMatches2) {
                                        if (kl == null) {
                                            AbstractC10924g.A07(strA0A, strA0A3 + ((String) strA01));
                                            return null;
                                        }
                                        int i2 = Integer.parseInt((String) AbstractC10843y.A01(matcher2.group(1)));
                                        int i3 = Integer.parseInt((String) AbstractC10843y.A01(matcher2.group(2)));
                                        int width = kl.A01;
                                        f = i2 / width;
                                        int width2 = kl.A00;
                                        line = i3 / width2;
                                    } else {
                                        AbstractC10924g.A07(strA0A, A0A(424, 41, 61) + ((String) strA01));
                                        return null;
                                    }
                                }
                                String strA02 = C5I.A00(xmlPullParser, A0A(1355, 6, 45));
                                if (strA02 != null) {
                                    Matcher matcher3 = A03.matcher(strA02);
                                    Matcher matcher4 = A0B.matcher(strA02);
                                    boolean zMatches3 = matcher3.matches();
                                    String strA0A4 = A0A(264, 39, 71);
                                    try {
                                        if (zMatches3) {
                                            try {
                                                f2 = Float.parseFloat((String) AbstractC10843y.A01(matcher3.group(1))) / 100.0f;
                                                f3 = Float.parseFloat((String) AbstractC10843y.A01(matcher3.group(2))) / 100.0f;
                                            } catch (NumberFormatException unused2) {
                                                AbstractC10924g.A07(strA0A, strA0A4 + ((String) strA01));
                                                return null;
                                            }
                                        } else if (matcher4.matches()) {
                                            if (kl == null) {
                                                AbstractC10924g.A07(strA0A, strA0A3 + ((String) strA01));
                                                return null;
                                            }
                                            int i4 = Integer.parseInt((String) AbstractC10843y.A01(matcher4.group(1)));
                                            int i5 = Integer.parseInt((String) AbstractC10843y.A01(matcher4.group(2)));
                                            int extentWidth = kl.A01;
                                            f2 = i4 / extentWidth;
                                            int extentWidth2 = kl.A00;
                                            f3 = i5 / extentWidth2;
                                        } else {
                                            AbstractC10924g.A07(strA0A, A0A(383, 41, 110) + ((String) strA01));
                                            return null;
                                        }
                                        int i6 = 0;
                                        strA01 = 1332;
                                        strA0A = 12;
                                        String strA03 = C5I.A00(xmlPullParser, A0A(1332, 12, 111));
                                        if (strA03 != null) {
                                            String strA04 = AbstractC2495k7.A01(strA03);
                                            switch (strA04.hashCode()) {
                                                case -1364013995:
                                                    if (!strA04.equals(A0A(1299, 6, 18))) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 0;
                                                    }
                                                    break;
                                                case 92734940:
                                                    if (!strA04.equals(A0A(1209, 5, 37))) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 1;
                                                    }
                                                    break;
                                                default:
                                                    b3 = -1;
                                                    break;
                                            }
                                            switch (b3) {
                                                case 0:
                                                    i6 = 1;
                                                    float width3 = f3 / 2.0f;
                                                    line += width3;
                                                    break;
                                                case 1:
                                                    i6 = 2;
                                                    line += f3;
                                                    break;
                                            }
                                        }
                                        float width4 = kj.A01;
                                        float f4 = 1.0f / width4;
                                        int i7 = Integer.MIN_VALUE;
                                        String strA05 = C5I.A00(xmlPullParser, A0A(1772, 11, 16));
                                        if (strA05 != null) {
                                            String strA06 = AbstractC2495k7.A01(strA05);
                                            switch (strA06.hashCode()) {
                                                case 3694:
                                                    if (!strA06.equals(A0A(1680, 2, 54))) {
                                                        b4 = -1;
                                                    } else {
                                                        b4 = 0;
                                                    }
                                                    break;
                                                case 3553396:
                                                    if (!strA06.equals(A0A(1682, 4, 80))) {
                                                        b4 = -1;
                                                    } else {
                                                        b4 = 1;
                                                    }
                                                    break;
                                                case 3553576:
                                                    if (!strA06.equals(A0A(1686, 4, 24))) {
                                                        b4 = -1;
                                                    }
                                                    break;
                                                default:
                                                    b4 = -1;
                                                    break;
                                            }
                                            switch (b4) {
                                                case 0:
                                                case 1:
                                                    i7 = 2;
                                                    break;
                                                case 2:
                                                    i7 = 1;
                                                    break;
                                            }
                                        }
                                        float regionTextHeight = f2;
                                        float position = f;
                                        return new KN(strA00, position, line, 0, i6, regionTextHeight, f3, 1, f4, i7);
                                    } catch (NumberFormatException unused3) {
                                        AbstractC10924g.A07(strA0A, strA0A4 + strA01);
                                        return null;
                                    }
                                }
                                AbstractC10924g.A07(strA0A, A0A(465, 33, 50));
                                return null;
                            } catch (NumberFormatException unused4) {
                                AbstractC10924g.A07(strA0A, strA0A2 + ((String) strA01));
                                return null;
                            }
                        }
                        AbstractC10924g.A07(strA0A, A0A(498, 33, 13));
                        return null;
                    }

                    public static KT A08(KT kt) {
                        return kt == null ? new KT() : kt;
                    }

                    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
                    /* JADX WARN: Code duplicated, block: B:101:0x0297  */
                    /* JADX WARN: Code duplicated, block: B:102:0x02a4  */
                    /* JADX WARN: Code duplicated, block: B:103:0x02b6  */
                    /* JADX WARN: Code duplicated, block: B:104:0x02c0  */
                    /* JADX WARN: Code duplicated, block: B:105:0x02ca  */
                    /* JADX WARN: Code duplicated, block: B:106:0x02d4  */
                    /* JADX WARN: Code duplicated, block: B:107:0x02e2  */
                    /* JADX WARN: Code duplicated, block: B:108:0x02f0  */
                    /* JADX WARN: Code duplicated, block: B:10:0x0032  */
                    /* JADX WARN: Code duplicated, block: B:110:0x030d  */
                    /* JADX WARN: Code duplicated, block: B:111:0x031f  */
                    /* JADX WARN: Code duplicated, block: B:112:0x032c  */
                    /* JADX WARN: Code duplicated, block: B:113:0x0343  */
                    /* JADX WARN: Code duplicated, block: B:114:0x034d  */
                    /* JADX WARN: Code duplicated, block: B:117:0x0379  */
                    /* JADX WARN: Code duplicated, block: B:120:0x03a6  */
                    /* JADX WARN: Code duplicated, block: B:122:0x03b9  */
                    /* JADX WARN: Code duplicated, block: B:13:0x003e  */
                    /* JADX WARN: Code duplicated, block: B:15:0x004d  */
                    /* JADX WARN: Code duplicated, block: B:165:0x0508  */
                    /* JADX WARN: Code duplicated, block: B:16:0x004f  */
                    /* JADX WARN: Code duplicated, block: B:176:0x0557  */
                    /* JADX WARN: Code duplicated, block: B:193:0x03c3 A[EXC_TOP_SPLITTER, SYNTHETIC] */
                    /* JADX WARN: Code duplicated, block: B:19:0x006c  */
                    /* JADX WARN: Code duplicated, block: B:200:0x0440 A[SYNTHETIC] */
                    /* JADX WARN: Code duplicated, block: B:201:0x0440 A[SYNTHETIC] */
                    /* JADX WARN: Code duplicated, block: B:205:0x002f A[DONT_GENERATE, SYNTHETIC] */
                    /* JADX WARN: Code duplicated, block: B:21:0x007e  */
                    /* JADX WARN: Code duplicated, block: B:22:0x007f A[PHI: r15
  0x007f: PHI (r15v5 byte) = (r15v1 byte), (r15v1 byte), (r15v6 byte), (r15v1 byte), (r15v7 byte) binds: [B:11:0x003a, B:20:0x007c, B:21:0x007e, B:14:0x004b, B:15:0x004d] A[DONT_GENERATE, DONT_INLINE]] */
                    /* JADX WARN: Code duplicated, block: B:232:0x002f A[SYNTHETIC] */
                    /* JADX WARN: Code duplicated, block: B:236:0x002f A[DONT_GENERATE, SYNTHETIC] */
                    /* JADX WARN: Code duplicated, block: B:237:0x002f A[DONT_GENERATE, SYNTHETIC] */
                    /* JADX WARN: Code duplicated, block: B:238:0x002f A[DONT_GENERATE, SYNTHETIC] */
                    /* JADX WARN: Code duplicated, block: B:239:0x002f A[DONT_GENERATE, SYNTHETIC] */
                    /* JADX WARN: Code duplicated, block: B:24:0x0083  */
                    /* JADX WARN: Code duplicated, block: B:26:0x009a  */
                    /* JADX WARN: Code duplicated, block: B:27:0x009f  */
                    /* JADX WARN: Code duplicated, block: B:28:0x00b0  */
                    /* JADX WARN: Code duplicated, block: B:29:0x00ba  */
                    /* JADX WARN: Code duplicated, block: B:30:0x00c8  */
                    /* JADX WARN: Code duplicated, block: B:31:0x00d6  */
                    /* JADX WARN: Code duplicated, block: B:33:0x00e1  */
                    /* JADX WARN: Code duplicated, block: B:36:0x00e7  */
                    /* JADX WARN: Code duplicated, block: B:38:0x00f7  */
                    /* JADX WARN: Code duplicated, block: B:39:0x00f9  */
                    /* JADX WARN: Code duplicated, block: B:41:0x0111  */
                    /* JADX WARN: Code duplicated, block: B:43:0x0122  */
                    /* JADX WARN: Code duplicated, block: B:44:0x0124  */
                    /* JADX WARN: Code duplicated, block: B:46:0x0134  */
                    /* JADX WARN: Code duplicated, block: B:47:0x0136  */
                    /* JADX WARN: Code duplicated, block: B:49:0x0152  */
                    /* JADX WARN: Code duplicated, block: B:52:0x0159  */
                    /* JADX WARN: Code duplicated, block: B:55:0x016d  */
                    /* JADX WARN: Code duplicated, block: B:56:0x0177  */
                    /* JADX WARN: Code duplicated, block: B:57:0x0181  */
                    /* JADX WARN: Code duplicated, block: B:58:0x018b  */
                    /* JADX WARN: Code duplicated, block: B:59:0x0195  */
                    /* JADX WARN: Code duplicated, block: B:63:0x01a5  */
                    /* JADX WARN: Code duplicated, block: B:65:0x01b4  */
                    /* JADX WARN: Code duplicated, block: B:66:0x01b6  */
                    /* JADX WARN: Code duplicated, block: B:68:0x01c5  */
                    /* JADX WARN: Code duplicated, block: B:69:0x01c7  */
                    /* JADX WARN: Code duplicated, block: B:6:0x0021  */
                    /* JADX WARN: Code duplicated, block: B:70:0x01d1  */
                    /* JADX WARN: Code duplicated, block: B:71:0x01db  */
                    /* JADX WARN: Code duplicated, block: B:73:0x01e6  */
                    /* JADX WARN: Code duplicated, block: B:76:0x01ed  */
                    /* JADX WARN: Code duplicated, block: B:78:0x01fc  */
                    /* JADX WARN: Code duplicated, block: B:79:0x01ff  */
                    /* JADX WARN: Code duplicated, block: B:81:0x0210  */
                    /* JADX WARN: Code duplicated, block: B:83:0x0226  */
                    /* JADX WARN: Code duplicated, block: B:84:0x0229  */
                    /* JADX WARN: Code duplicated, block: B:87:0x0234  */
                    /* JADX WARN: Code duplicated, block: B:89:0x0244  */
                    /* JADX WARN: Code duplicated, block: B:90:0x0247  */
                    /* JADX WARN: Code duplicated, block: B:93:0x0258  */
                    /* JADX WARN: Code duplicated, block: B:95:0x0268  */
                    /* JADX WARN: Code duplicated, block: B:96:0x026c  */
                    /* JADX WARN: Code duplicated, block: B:98:0x027c  */
                    /* JADX WARN: Code duplicated, block: B:99:0x0280  */
                    public static KT A09(XmlPullParser xmlPullParser, KT kt) {
                        byte b3;
                        KT ktA08;
                        boolean zEqualsIgnoreCase;
                        int i2;
                        String strA01;
                        int attributeCount;
                        int i3;
                        KT ktA09;
                        int i4;
                        int attributeCount2;
                        String strA02;
                        int attributeCount3;
                        String strA03;
                        int attributeCount4;
                        String strA0A;
                        int i5;
                        int attributeCount5;
                        int i6;
                        int attributeCount6;
                        String strA04;
                        int attributeCount7;
                        KT ktA010;
                        int i7;
                        int attributeCount8;
                        String strA0A2;
                        int i8;
                        int attributeCount9;
                        KT ktA011 = kt;
                        int attributeCount10 = xmlPullParser.getAttributeCount();
                        for (int i9 = 0; i9 < attributeCount10; i9++) {
                            String attributeValue = xmlPullParser.getAttributeValue(i9);
                            String attributeName = xmlPullParser.getAttributeName(i9);
                            int attributeCount11 = attributeName.hashCode();
                            byte b4 = 5;
                            byte b5 = 3;
                            byte b6 = -1;
                            switch (attributeCount11) {
                                case -1550943582:
                                    if (attributeName.equals(A0A(1380, 9, 95))) {
                                        b3 = 6;
                                    } else {
                                        b3 = -1;
                                    }
                                    String strA0A3 = A0A(892, 11, 16);
                                    switch (b3) {
                                        case 0:
                                            if (A0A(1655, 5, 93).equals(xmlPullParser.getName())) {
                                                ktA011 = A08(ktA011).A0Q(attributeValue);
                                            }
                                            break;
                                        case 1:
                                            ktA011 = A08(ktA011);
                                            try {
                                                int attributeCount12 = AnonymousClass47.A01(attributeValue);
                                                ktA011.A0G(attributeCount12);
                                            } catch (IllegalArgumentException unused) {
                                                AbstractC10924g.A07(strA0A3, A0A(51, 33, 101) + attributeValue);
                                            }
                                            break;
                                        case 2:
                                            ktA011 = A08(ktA011);
                                            try {
                                                int attributeCount13 = AnonymousClass47.A01(attributeValue);
                                                ktA011.A0H(attributeCount13);
                                            } catch (IllegalArgumentException unused2) {
                                                AbstractC10924g.A07(strA0A3, A0A(84, 28, 0) + attributeValue);
                                            }
                                            break;
                                        case 3:
                                            ktA011 = A08(ktA011).A0P(attributeValue);
                                            break;
                                        case 4:
                                            try {
                                                ktA011 = A08(ktA011);
                                                A0D(attributeValue, ktA011);
                                            } catch (C2592lj unused3) {
                                                AbstractC10924g.A07(strA0A3, A0A(112, 31, 89) + attributeValue);
                                            }
                                            break;
                                        case 5:
                                            ktA011 = A08(ktA011).A0R(A0A(1279, 4, 70).equalsIgnoreCase(attributeValue));
                                            break;
                                        case 6:
                                            ktA08 = A08(ktA011);
                                            zEqualsIgnoreCase = A0A(1525, 6, 38).equalsIgnoreCase(attributeValue);
                                            i2 = A02[0].length();
                                            if (i2 != 7) {
                                                String[] strArr = A02;
                                                strArr[1] = "3LAgyyDE1fiF0";
                                                strArr[5] = "1Nn0OmHZpjO5zuXdFxViYYhi";
                                                ktA011 = ktA08.A0S(zEqualsIgnoreCase);
                                            } else {
                                                A02[3] = "rHlCayaIaBq6HOiiZnZ7WLhH9IM1pHxI";
                                                ktA011 = ktA08.A0S(zEqualsIgnoreCase);
                                            }
                                            break;
                                        case 7:
                                            ktA011 = A08(ktA011).A0M(A02(attributeValue));
                                            break;
                                        case 8:
                                            ktA011 = A08(ktA011).A0L(A02(attributeValue));
                                            break;
                                        case 9:
                                            strA04 = AbstractC2495k7.A01(attributeValue);
                                            attributeCount7 = strA04.hashCode();
                                            switch (attributeCount7) {
                                                case 96673:
                                                    if (strA04.equals(A0A(1214, 3, 74))) {
                                                        b6 = 1;
                                                    }
                                                    switch (b6) {
                                                        case 0:
                                                            ktA011 = A08(ktA011).A0U(false);
                                                            break;
                                                        case 1:
                                                            ktA010 = A08(ktA011);
                                                            String[] strArr2 = A02;
                                                            String str2 = strArr2[6];
                                                            String str3 = strArr2[2];
                                                            i7 = str2.charAt(3);
                                                            attributeCount8 = str3.charAt(3);
                                                            if (i7 != attributeCount8) {
                                                                ktA011 = ktA010.A0U(true);
                                                            } else {
                                                                String[] strArr3 = A02;
                                                                strArr3[4] = "vXebmLnNF52WQsSE6i6dOepDl";
                                                                strArr3[7] = "VyoJ0PyeyBelBF2UzGSxOycy2";
                                                                ktA011 = ktA010.A0U(true);
                                                            }
                                                            break;
                                                    }
                                                    break;
                                                case 3387192:
                                                    strA0A2 = A0A(1589, 4, 93);
                                                    String[] strArr4 = A02;
                                                    String str4 = strArr4[4];
                                                    String str5 = strArr4[7];
                                                    i8 = str4.length();
                                                    attributeCount9 = str5.length();
                                                    if (i8 != attributeCount9) {
                                                        String[] strArr5 = A02;
                                                        strArr5[6] = "KuhwJ7ghsOXYSD0w45zfNovp0dFSdmRc";
                                                        strArr5[2] = "7BZwCfoQFB9cKVUBMfAbcYdCpdo30x6t";
                                                        if (strA04.equals(strA0A2)) {
                                                            b6 = 0;
                                                        }
                                                        switch (b6) {
                                                            case 0:
                                                                ktA011 = A08(ktA011).A0U(false);
                                                                break;
                                                            case 1:
                                                                ktA010 = A08(ktA011);
                                                                String[] strArr6 = A02;
                                                                String str6 = strArr6[6];
                                                                String str7 = strArr6[2];
                                                                i7 = str6.charAt(3);
                                                                attributeCount8 = str7.charAt(3);
                                                                if (i7 != attributeCount8) {
                                                                    ktA011 = ktA010.A0U(true);
                                                                } else {
                                                                    String[] strArr7 = A02;
                                                                    strArr7[4] = "vXebmLnNF52WQsSE6i6dOepDl";
                                                                    strArr7[7] = "VyoJ0PyeyBelBF2UzGSxOycy2";
                                                                    ktA011 = ktA010.A0U(true);
                                                                }
                                                                break;
                                                        }
                                                    } else {
                                                        throw new RuntimeException();
                                                    }
                                                    break;
                                                default:
                                                    switch (b6) {
                                                        case 0:
                                                            ktA011 = A08(ktA011).A0U(false);
                                                            break;
                                                        case 1:
                                                            ktA010 = A08(ktA011);
                                                            String[] strArr8 = A02;
                                                            String str8 = strArr8[6];
                                                            String str9 = strArr8[2];
                                                            i7 = str8.charAt(3);
                                                            attributeCount8 = str9.charAt(3);
                                                            if (i7 != attributeCount8) {
                                                                ktA011 = ktA010.A0U(true);
                                                            } else {
                                                                String[] strArr9 = A02;
                                                                strArr9[4] = "vXebmLnNF52WQsSE6i6dOepDl";
                                                                strArr9[7] = "VyoJ0PyeyBelBF2UzGSxOycy2";
                                                                ktA011 = ktA010.A0U(true);
                                                            }
                                                            break;
                                                    }
                                                    break;
                                            }
                                            break;
                                        case 10:
                                            strA01 = AbstractC2495k7.A01(attributeValue);
                                            attributeCount = strA01.hashCode();
                                            switch (attributeCount) {
                                                case -618561360:
                                                    if (strA01.equals(A0A(1251, 13, 60))) {
                                                        b4 = 2;
                                                    } else {
                                                        b4 = -1;
                                                    }
                                                    break;
                                                case -410956671:
                                                    if (strA01.equals(A0A(1310, 9, 123))) {
                                                        b4 = 0;
                                                    } else {
                                                        b4 = -1;
                                                    }
                                                    break;
                                                case -250518009:
                                                    if (!strA01.equals(A0A(1323, 9, 19))) {
                                                        b4 = -1;
                                                    }
                                                    break;
                                                case -136074796:
                                                    if (strA01.equals(A0A(1714, 13, 21))) {
                                                        b4 = 4;
                                                    } else {
                                                        b4 = -1;
                                                    }
                                                    break;
                                                case 3016401:
                                                    i3 = A02[0].length();
                                                    if (i3 != 7) {
                                                        String[] strArr10 = A02;
                                                        strArr10[4] = "LIbObqkBHnKY9czcuqJXmaycY";
                                                        strArr10[7] = "8yr68kE48uI7ct7K5MzK8s3n0";
                                                        if (strA01.equals(A0A(1247, 4, 121))) {
                                                            b4 = 1;
                                                        } else {
                                                            b4 = -1;
                                                        }
                                                    } else if (strA01.equals(A0A(1247, 4, 121))) {
                                                        b4 = 1;
                                                    } else {
                                                        b4 = -1;
                                                    }
                                                    break;
                                                case 3556653:
                                                    if (strA01.equals(A0A(1690, 4, 69))) {
                                                        b4 = 3;
                                                    } else {
                                                        b4 = -1;
                                                    }
                                                    break;
                                                default:
                                                    b4 = -1;
                                                    break;
                                            }
                                            switch (b4) {
                                                case 0:
                                                    ktA011 = A08(ktA011).A0K(1);
                                                    break;
                                                case 1:
                                                case 2:
                                                    ktA011 = A08(ktA011).A0K(2);
                                                    break;
                                                case 3:
                                                case 4:
                                                    ktA011 = A08(ktA011).A0K(3);
                                                    break;
                                                case 5:
                                                    ktA09 = A08(ktA011);
                                                    String[] strArr11 = A02;
                                                    String str10 = strArr11[6];
                                                    String str11 = strArr11[2];
                                                    i4 = str10.charAt(3);
                                                    attributeCount2 = str11.charAt(3);
                                                    if (i4 != attributeCount2) {
                                                        A02[0] = "J4PxtYpjCjcISuW5D9hp9p1SdEi";
                                                        ktA011 = ktA09.A0K(4);
                                                    } else {
                                                        String[] strArr12 = A02;
                                                        strArr12[4] = "5y5J9haLXfISwEnEFuDPzKTDZ";
                                                        strArr12[7] = "OL7OkctduLhf4RZoSVrAZg0CW";
                                                        ktA011 = ktA09.A0K(4);
                                                    }
                                                    break;
                                            }
                                            break;
                                        case 11:
                                            strA02 = AbstractC2495k7.A01(attributeValue);
                                            attributeCount3 = strA02.hashCode();
                                            switch (attributeCount3) {
                                                case -1392885889:
                                                    if (strA02.equals(A0A(1264, 6, 99))) {
                                                        b6 = 0;
                                                    }
                                                    break;
                                                case 92734940:
                                                    if (strA02.equals(A0A(1209, 5, 37))) {
                                                        b6 = 1;
                                                    }
                                                    break;
                                            }
                                            switch (b6) {
                                                case 0:
                                                    ktA011 = A08(ktA011).A0J(1);
                                                    break;
                                                case 1:
                                                    ktA011 = A08(ktA011).A0J(2);
                                                    break;
                                            }
                                            break;
                                        case 12:
                                            strA03 = AbstractC2495k7.A01(attributeValue);
                                            attributeCount4 = strA03.hashCode();
                                            switch (attributeCount4) {
                                                case -1461280213:
                                                    strA0A = A0A(1593, 11, 58);
                                                    String[] strArr13 = A02;
                                                    String str12 = strArr13[4];
                                                    String str13 = strArr13[7];
                                                    i5 = str12.length();
                                                    attributeCount5 = str13.length();
                                                    if (i5 != attributeCount5) {
                                                        String[] strArr14 = A02;
                                                        strArr14[1] = "bik63b6qq3sx6";
                                                        strArr14[5] = "UnBPKnpUlJfync8N3sKzurGh";
                                                        if (!strA03.equals(strA0A)) {
                                                            b5 = -1;
                                                        }
                                                    } else if (!strA03.equals(strA0A)) {
                                                        b5 = -1;
                                                    }
                                                    switch (b5) {
                                                        case 0:
                                                            ktA011 = A08(ktA011).A0T(true);
                                                            break;
                                                        case 1:
                                                            ktA011 = A08(ktA011).A0T(false);
                                                            break;
                                                        case 2:
                                                            ktA011 = A08(ktA011).A0V(true);
                                                            break;
                                                        case 3:
                                                            ktA011 = A08(ktA011).A0V(false);
                                                            break;
                                                    }
                                                    break;
                                                case -1026963764:
                                                    if (strA03.equals(A0A(1763, 9, 73))) {
                                                        b5 = 2;
                                                    } else {
                                                        b5 = -1;
                                                    }
                                                    switch (b5) {
                                                        case 0:
                                                            ktA011 = A08(ktA011).A0T(true);
                                                            break;
                                                        case 1:
                                                            ktA011 = A08(ktA011).A0T(false);
                                                            break;
                                                        case 2:
                                                            ktA011 = A08(ktA011).A0V(true);
                                                            break;
                                                        case 3:
                                                            ktA011 = A08(ktA011).A0V(false);
                                                            break;
                                                    }
                                                    break;
                                                case 913457136:
                                                    String[] strArr15 = A02;
                                                    String str14 = strArr15[1];
                                                    String str15 = strArr15[5];
                                                    i6 = str14.length();
                                                    attributeCount6 = str15.length();
                                                    if (i6 == attributeCount6) {
                                                        A02[3] = "e93UUhN2aqZLtboheHnNzqcVXHE9GMfx";
                                                        if (strA03.equals(A0A(1576, 13, 109))) {
                                                            b5 = 1;
                                                        } else {
                                                            b5 = -1;
                                                        }
                                                        switch (b5) {
                                                            case 0:
                                                                ktA011 = A08(ktA011).A0T(true);
                                                                break;
                                                            case 1:
                                                                ktA011 = A08(ktA011).A0T(false);
                                                                break;
                                                            case 2:
                                                                ktA011 = A08(ktA011).A0V(true);
                                                                break;
                                                            case 3:
                                                                ktA011 = A08(ktA011).A0V(false);
                                                                break;
                                                        }
                                                    } else {
                                                        throw new RuntimeException();
                                                    }
                                                    break;
                                                case 1679736913:
                                                    if (strA03.equals(A0A(1541, 11, 39))) {
                                                        b5 = 0;
                                                    } else {
                                                        b5 = -1;
                                                    }
                                                    switch (b5) {
                                                        case 0:
                                                            ktA011 = A08(ktA011).A0T(true);
                                                            break;
                                                        case 1:
                                                            ktA011 = A08(ktA011).A0T(false);
                                                            break;
                                                        case 2:
                                                            ktA011 = A08(ktA011).A0V(true);
                                                            break;
                                                        case 3:
                                                            ktA011 = A08(ktA011).A0V(false);
                                                            break;
                                                    }
                                                    break;
                                                default:
                                                    b5 = -1;
                                                    switch (b5) {
                                                        case 0:
                                                            ktA011 = A08(ktA011).A0T(true);
                                                            break;
                                                        case 1:
                                                            ktA011 = A08(ktA011).A0T(false);
                                                            break;
                                                        case 2:
                                                            ktA011 = A08(ktA011).A0V(true);
                                                            break;
                                                        case 3:
                                                            ktA011 = A08(ktA011).A0V(false);
                                                            break;
                                                    }
                                                    break;
                                            }
                                            break;
                                        case 13:
                                            ktA011 = A08(ktA011).A0N(KI.A01(attributeValue));
                                            break;
                                        case 14:
                                            ktA011 = A08(ktA011).A0F(A00(attributeValue));
                                            break;
                                    }
                                    break;
                                case -1224696685:
                                    if (attributeName.equals(A0A(1362, 10, 22))) {
                                        b3 = 3;
                                    } else {
                                        b3 = -1;
                                    }
                                    String strA0A4 = A0A(892, 11, 16);
                                    switch (b3) {
                                        case 0:
                                            if (A0A(1655, 5, 93).equals(xmlPullParser.getName())) {
                                                ktA011 = A08(ktA011).A0Q(attributeValue);
                                            }
                                            break;
                                        case 1:
                                            ktA011 = A08(ktA011);
                                            int attributeCount14 = AnonymousClass47.A01(attributeValue);
                                            ktA011.A0G(attributeCount14);
                                            break;
                                        case 2:
                                            ktA011 = A08(ktA011);
                                            int attributeCount15 = AnonymousClass47.A01(attributeValue);
                                            ktA011.A0H(attributeCount15);
                                            break;
                                        case 3:
                                            ktA011 = A08(ktA011).A0P(attributeValue);
                                            break;
                                        case 4:
                                            ktA011 = A08(ktA011);
                                            A0D(attributeValue, ktA011);
                                            break;
                                        case 5:
                                            ktA011 = A08(ktA011).A0R(A0A(1279, 4, 70).equalsIgnoreCase(attributeValue));
                                            break;
                                        case 6:
                                            ktA08 = A08(ktA011);
                                            zEqualsIgnoreCase = A0A(1525, 6, 38).equalsIgnoreCase(attributeValue);
                                            i2 = A02[0].length();
                                            if (i2 != 7) {
                                                String[] strArr16 = A02;
                                                strArr16[1] = "3LAgyyDE1fiF0";
                                                strArr16[5] = "1Nn0OmHZpjO5zuXdFxViYYhi";
                                                ktA011 = ktA08.A0S(zEqualsIgnoreCase);
                                            } else {
                                                A02[3] = "rHlCayaIaBq6HOiiZnZ7WLhH9IM1pHxI";
                                                ktA011 = ktA08.A0S(zEqualsIgnoreCase);
                                            }
                                            break;
                                        case 7:
                                            ktA011 = A08(ktA011).A0M(A02(attributeValue));
                                            break;
                                        case 8:
                                            ktA011 = A08(ktA011).A0L(A02(attributeValue));
                                            break;
                                        case 9:
                                            strA04 = AbstractC2495k7.A01(attributeValue);
                                            attributeCount7 = strA04.hashCode();
                                            switch (attributeCount7) {
                                                case 96673:
                                                    if (strA04.equals(A0A(1214, 3, 74))) {
                                                        b6 = 1;
                                                    }
                                                    switch (b6) {
                                                        case 0:
                                                            ktA011 = A08(ktA011).A0U(false);
                                                            break;
                                                        case 1:
                                                            ktA010 = A08(ktA011);
                                                            String[] strArr17 = A02;
                                                            String str16 = strArr17[6];
                                                            String str17 = strArr17[2];
                                                            i7 = str16.charAt(3);
                                                            attributeCount8 = str17.charAt(3);
                                                            if (i7 != attributeCount8) {
                                                                ktA011 = ktA010.A0U(true);
                                                            } else {
                                                                String[] strArr18 = A02;
                                                                strArr18[4] = "vXebmLnNF52WQsSE6i6dOepDl";
                                                                strArr18[7] = "VyoJ0PyeyBelBF2UzGSxOycy2";
                                                                ktA011 = ktA010.A0U(true);
                                                            }
                                                            break;
                                                    }
                                                    break;
                                                case 3387192:
                                                    strA0A2 = A0A(1589, 4, 93);
                                                    String[] strArr19 = A02;
                                                    String str18 = strArr19[4];
                                                    String str19 = strArr19[7];
                                                    i8 = str18.length();
                                                    attributeCount9 = str19.length();
                                                    if (i8 != attributeCount9) {
                                                        String[] strArr20 = A02;
                                                        strArr20[6] = "KuhwJ7ghsOXYSD0w45zfNovp0dFSdmRc";
                                                        strArr20[2] = "7BZwCfoQFB9cKVUBMfAbcYdCpdo30x6t";
                                                        if (strA04.equals(strA0A2)) {
                                                            b6 = 0;
                                                        }
                                                        switch (b6) {
                                                            case 0:
                                                                ktA011 = A08(ktA011).A0U(false);
                                                                break;
                                                            case 1:
                                                                ktA010 = A08(ktA011);
                                                                String[] strArr110 = A02;
                                                                String str110 = strArr110[6];
                                                                String str111 = strArr110[2];
                                                                i7 = str110.charAt(3);
                                                                attributeCount8 = str111.charAt(3);
                                                                if (i7 != attributeCount8) {
                                                                    ktA011 = ktA010.A0U(true);
                                                                } else {
                                                                    String[] strArr111 = A02;
                                                                    strArr111[4] = "vXebmLnNF52WQsSE6i6dOepDl";
                                                                    strArr111[7] = "VyoJ0PyeyBelBF2UzGSxOycy2";
                                                                    ktA011 = ktA010.A0U(true);
                                                                }
                                                                break;
                                                        }
                                                    } else {
                                                        throw new RuntimeException();
                                                    }
                                                    break;
                                                default:
                                                    switch (b6) {
                                                        case 0:
                                                            ktA011 = A08(ktA011).A0U(false);
                                                            break;
                                                        case 1:
                                                            ktA010 = A08(ktA011);
                                                            String[] strArr112 = A02;
                                                            String str112 = strArr112[6];
                                                            String str113 = strArr112[2];
                                                            i7 = str112.charAt(3);
                                                            attributeCount8 = str113.charAt(3);
                                                            if (i7 != attributeCount8) {
                                                                ktA011 = ktA010.A0U(true);
                                                            } else {
                                                                String[] strArr113 = A02;
                                                                strArr113[4] = "vXebmLnNF52WQsSE6i6dOepDl";
                                                                strArr113[7] = "VyoJ0PyeyBelBF2UzGSxOycy2";
                                                                ktA011 = ktA010.A0U(true);
                                                            }
                                                            break;
                                                    }
                                                    break;
                                            }
                                            break;
                                        case 10:
                                            strA01 = AbstractC2495k7.A01(attributeValue);
                                            attributeCount = strA01.hashCode();
                                            switch (attributeCount) {
                                                case -618561360:
                                                    if (strA01.equals(A0A(1251, 13, 60))) {
                                                        b4 = 2;
                                                    } else {
                                                        b4 = -1;
                                                    }
                                                    break;
                                                case -410956671:
                                                    if (strA01.equals(A0A(1310, 9, 123))) {
                                                        b4 = 0;
                                                    } else {
                                                        b4 = -1;
                                                    }
                                                    break;
                                                case -250518009:
                                                    if (!strA01.equals(A0A(1323, 9, 19))) {
                                                        b4 = -1;
                                                    }
                                                    break;
                                                case -136074796:
                                                    if (strA01.equals(A0A(1714, 13, 21))) {
                                                        b4 = 4;
                                                    } else {
                                                        b4 = -1;
                                                    }
                                                    break;
                                                case 3016401:
                                                    i3 = A02[0].length();
                                                    if (i3 != 7) {
                                                        String[] strArr114 = A02;
                                                        strArr114[4] = "LIbObqkBHnKY9czcuqJXmaycY";
                                                        strArr114[7] = "8yr68kE48uI7ct7K5MzK8s3n0";
                                                        if (strA01.equals(A0A(1247, 4, 121))) {
                                                            b4 = 1;
                                                        } else {
                                                            b4 = -1;
                                                        }
                                                    } else if (strA01.equals(A0A(1247, 4, 121))) {
                                                        b4 = 1;
                                                    } else {
                                                        b4 = -1;
                                                    }
                                                    break;
                                                case 3556653:
                                                    if (strA01.equals(A0A(1690, 4, 69))) {
                                                        b4 = 3;
                                                    } else {
                                                        b4 = -1;
                                                    }
                                                    break;
                                                default:
                                                    b4 = -1;
                                                    break;
                                            }
                                            switch (b4) {
                                                case 0:
                                                    ktA011 = A08(ktA011).A0K(1);
                                                    break;
                                                case 1:
                                                case 2:
                                                    ktA011 = A08(ktA011).A0K(2);
                                                    break;
                                                case 3:
                                                case 4:
                                                    ktA011 = A08(ktA011).A0K(3);
                                                    break;
                                                case 5:
                                                    ktA09 = A08(ktA011);
                                                    String[] strArr115 = A02;
                                                    String str114 = strArr115[6];
                                                    String str115 = strArr115[2];
                                                    i4 = str114.charAt(3);
                                                    attributeCount2 = str115.charAt(3);
                                                    if (i4 != attributeCount2) {
                                                        A02[0] = "J4PxtYpjCjcISuW5D9hp9p1SdEi";
                                                        ktA011 = ktA09.A0K(4);
                                                    } else {
                                                        String[] strArr116 = A02;
                                                        strArr116[4] = "5y5J9haLXfISwEnEFuDPzKTDZ";
                                                        strArr116[7] = "OL7OkctduLhf4RZoSVrAZg0CW";
                                                        ktA011 = ktA09.A0K(4);
                                                    }
                                                    break;
                                            }
                                            break;
                                        case 11:
                                            strA02 = AbstractC2495k7.A01(attributeValue);
                                            attributeCount3 = strA02.hashCode();
                                            switch (attributeCount3) {
                                                case -1392885889:
                                                    if (strA02.equals(A0A(1264, 6, 99))) {
                                                        b6 = 0;
                                                    }
                                                    break;
                                                case 92734940:
                                                    if (strA02.equals(A0A(1209, 5, 37))) {
                                                        b6 = 1;
                                                    }
                                                    break;
                                            }
                                            switch (b6) {
                                                case 0:
                                                    ktA011 = A08(ktA011).A0J(1);
                                                    break;
                                                case 1:
                                                    ktA011 = A08(ktA011).A0J(2);
                                                    break;
                                            }
                                            break;
                                        case 12:
                                            strA03 = AbstractC2495k7.A01(attributeValue);
                                            attributeCount4 = strA03.hashCode();
                                            switch (attributeCount4) {
                                                case -1461280213:
                                                    strA0A = A0A(1593, 11, 58);
                                                    String[] strArr117 = A02;
                                                    String str116 = strArr117[4];
                                                    String str117 = strArr117[7];
                                                    i5 = str116.length();
                                                    attributeCount5 = str117.length();
                                                    if (i5 != attributeCount5) {
                                                        String[] strArr118 = A02;
                                                        strArr118[1] = "bik63b6qq3sx6";
                                                        strArr118[5] = "UnBPKnpUlJfync8N3sKzurGh";
                                                        if (!strA03.equals(strA0A)) {
                                                            b5 = -1;
                                                        }
                                                    } else if (!strA03.equals(strA0A)) {
                                                        b5 = -1;
                                                    }
                                                    switch (b5) {
                                                        case 0:
                                                            ktA011 = A08(ktA011).A0T(true);
                                                            break;
                                                        case 1:
                                                            ktA011 = A08(ktA011).A0T(false);
                                                            break;
                                                        case 2:
                                                            ktA011 = A08(ktA011).A0V(true);
                                                            break;
                                                        case 3:
                                                            ktA011 = A08(ktA011).A0V(false);
                                                            break;
                                                    }
                                                    break;
                                                case -1026963764:
                                                    if (strA03.equals(A0A(1763, 9, 73))) {
                                                        b5 = 2;
                                                    } else {
                                                        b5 = -1;
                                                    }
                                                    switch (b5) {
                                                        case 0:
                                                            ktA011 = A08(ktA011).A0T(true);
                                                            break;
                                                        case 1:
                                                            ktA011 = A08(ktA011).A0T(false);
                                                            break;
                                                        case 2:
                                                            ktA011 = A08(ktA011).A0V(true);
                                                            break;
                                                        case 3:
                                                            ktA011 = A08(ktA011).A0V(false);
                                                            break;
                                                    }
                                                    break;
                                                case 913457136:
                                                    String[] strArr119 = A02;
                                                    String str118 = strArr119[1];
                                                    String str119 = strArr119[5];
                                                    i6 = str118.length();
                                                    attributeCount6 = str119.length();
                                                    if (i6 == attributeCount6) {
                                                        A02[3] = "e93UUhN2aqZLtboheHnNzqcVXHE9GMfx";
                                                        if (strA03.equals(A0A(1576, 13, 109))) {
                                                            b5 = 1;
                                                        } else {
                                                            b5 = -1;
                                                        }
                                                        switch (b5) {
                                                            case 0:
                                                                ktA011 = A08(ktA011).A0T(true);
                                                                break;
                                                            case 1:
                                                                ktA011 = A08(ktA011).A0T(false);
                                                                break;
                                                            case 2:
                                                                ktA011 = A08(ktA011).A0V(true);
                                                                break;
                                                            case 3:
                                                                ktA011 = A08(ktA011).A0V(false);
                                                                break;
                                                        }
                                                    } else {
                                                        throw new RuntimeException();
                                                    }
                                                    break;
                                                case 1679736913:
                                                    if (strA03.equals(A0A(1541, 11, 39))) {
                                                        b5 = 0;
                                                    } else {
                                                        b5 = -1;
                                                    }
                                                    switch (b5) {
                                                        case 0:
                                                            ktA011 = A08(ktA011).A0T(true);
                                                            break;
                                                        case 1:
                                                            ktA011 = A08(ktA011).A0T(false);
                                                            break;
                                                        case 2:
                                                            ktA011 = A08(ktA011).A0V(true);
                                                            break;
                                                        case 3:
                                                            ktA011 = A08(ktA011).A0V(false);
                                                            break;
                                                    }
                                                    break;
                                                default:
                                                    b5 = -1;
                                                    switch (b5) {
                                                        case 0:
                                                            ktA011 = A08(ktA011).A0T(true);
                                                            break;
                                                        case 1:
                                                            ktA011 = A08(ktA011).A0T(false);
                                                            break;
                                                        case 2:
                                                            ktA011 = A08(ktA011).A0V(true);
                                                            break;
                                                        case 3:
                                                            ktA011 = A08(ktA011).A0V(false);
                                                            break;
                                                    }
                                                    break;
                                            }
                                            break;
                                        case 13:
                                            ktA011 = A08(ktA011).A0N(KI.A01(attributeValue));
                                            break;
                                        case 14:
                                            ktA011 = A08(ktA011).A0F(A00(attributeValue));
                                            break;
                                    }
                                    break;
                                case -1065511464:
                                    if (attributeName.equals(A0A(1694, 9, 87))) {
                                        b3 = 7;
                                    } else {
                                        b3 = -1;
                                    }
                                    String strA0A5 = A0A(892, 11, 16);
                                    switch (b3) {
                                        case 0:
                                            if (A0A(1655, 5, 93).equals(xmlPullParser.getName())) {
                                                ktA011 = A08(ktA011).A0Q(attributeValue);
                                            }
                                            break;
                                        case 1:
                                            ktA011 = A08(ktA011);
                                            int attributeCount16 = AnonymousClass47.A01(attributeValue);
                                            ktA011.A0G(attributeCount16);
                                            break;
                                        case 2:
                                            ktA011 = A08(ktA011);
                                            int attributeCount17 = AnonymousClass47.A01(attributeValue);
                                            ktA011.A0H(attributeCount17);
                                            break;
                                        case 3:
                                            ktA011 = A08(ktA011).A0P(attributeValue);
                                            break;
                                        case 4:
                                            ktA011 = A08(ktA011);
                                            A0D(attributeValue, ktA011);
                                            break;
                                        case 5:
                                            ktA011 = A08(ktA011).A0R(A0A(1279, 4, 70).equalsIgnoreCase(attributeValue));
                                            break;
                                        case 6:
                                            ktA08 = A08(ktA011);
                                            zEqualsIgnoreCase = A0A(1525, 6, 38).equalsIgnoreCase(attributeValue);
                                            i2 = A02[0].length();
                                            if (i2 != 7) {
                                                String[] strArr120 = A02;
                                                strArr120[1] = "3LAgyyDE1fiF0";
                                                strArr120[5] = "1Nn0OmHZpjO5zuXdFxViYYhi";
                                                ktA011 = ktA08.A0S(zEqualsIgnoreCase);
                                            } else {
                                                A02[3] = "rHlCayaIaBq6HOiiZnZ7WLhH9IM1pHxI";
                                                ktA011 = ktA08.A0S(zEqualsIgnoreCase);
                                            }
                                            break;
                                        case 7:
                                            ktA011 = A08(ktA011).A0M(A02(attributeValue));
                                            break;
                                        case 8:
                                            ktA011 = A08(ktA011).A0L(A02(attributeValue));
                                            break;
                                        case 9:
                                            strA04 = AbstractC2495k7.A01(attributeValue);
                                            attributeCount7 = strA04.hashCode();
                                            switch (attributeCount7) {
                                                case 96673:
                                                    if (strA04.equals(A0A(1214, 3, 74))) {
                                                        b6 = 1;
                                                    }
                                                    switch (b6) {
                                                        case 0:
                                                            ktA011 = A08(ktA011).A0U(false);
                                                            break;
                                                        case 1:
                                                            ktA010 = A08(ktA011);
                                                            String[] strArr1110 = A02;
                                                            String str1110 = strArr1110[6];
                                                            String str1111 = strArr1110[2];
                                                            i7 = str1110.charAt(3);
                                                            attributeCount8 = str1111.charAt(3);
                                                            if (i7 != attributeCount8) {
                                                                ktA011 = ktA010.A0U(true);
                                                            } else {
                                                                String[] strArr1111 = A02;
                                                                strArr1111[4] = "vXebmLnNF52WQsSE6i6dOepDl";
                                                                strArr1111[7] = "VyoJ0PyeyBelBF2UzGSxOycy2";
                                                                ktA011 = ktA010.A0U(true);
                                                            }
                                                            break;
                                                    }
                                                    break;
                                                case 3387192:
                                                    strA0A2 = A0A(1589, 4, 93);
                                                    String[] strArr121 = A02;
                                                    String str120 = strArr121[4];
                                                    String str121 = strArr121[7];
                                                    i8 = str120.length();
                                                    attributeCount9 = str121.length();
                                                    if (i8 != attributeCount9) {
                                                        String[] strArr21 = A02;
                                                        strArr21[6] = "KuhwJ7ghsOXYSD0w45zfNovp0dFSdmRc";
                                                        strArr21[2] = "7BZwCfoQFB9cKVUBMfAbcYdCpdo30x6t";
                                                        if (strA04.equals(strA0A2)) {
                                                            b6 = 0;
                                                        }
                                                        switch (b6) {
                                                            case 0:
                                                                ktA011 = A08(ktA011).A0U(false);
                                                                break;
                                                            case 1:
                                                                ktA010 = A08(ktA011);
                                                                String[] strArr1112 = A02;
                                                                String str1112 = strArr1112[6];
                                                                String str1113 = strArr1112[2];
                                                                i7 = str1112.charAt(3);
                                                                attributeCount8 = str1113.charAt(3);
                                                                if (i7 != attributeCount8) {
                                                                    ktA011 = ktA010.A0U(true);
                                                                } else {
                                                                    String[] strArr1113 = A02;
                                                                    strArr1113[4] = "vXebmLnNF52WQsSE6i6dOepDl";
                                                                    strArr1113[7] = "VyoJ0PyeyBelBF2UzGSxOycy2";
                                                                    ktA011 = ktA010.A0U(true);
                                                                }
                                                                break;
                                                        }
                                                    } else {
                                                        throw new RuntimeException();
                                                    }
                                                    break;
                                                default:
                                                    switch (b6) {
                                                        case 0:
                                                            ktA011 = A08(ktA011).A0U(false);
                                                            break;
                                                        case 1:
                                                            ktA010 = A08(ktA011);
                                                            String[] strArr1114 = A02;
                                                            String str1114 = strArr1114[6];
                                                            String str1115 = strArr1114[2];
                                                            i7 = str1114.charAt(3);
                                                            attributeCount8 = str1115.charAt(3);
                                                            if (i7 != attributeCount8) {
                                                                ktA011 = ktA010.A0U(true);
                                                            } else {
                                                                String[] strArr1115 = A02;
                                                                strArr1115[4] = "vXebmLnNF52WQsSE6i6dOepDl";
                                                                strArr1115[7] = "VyoJ0PyeyBelBF2UzGSxOycy2";
                                                                ktA011 = ktA010.A0U(true);
                                                            }
                                                            break;
                                                    }
                                                    break;
                                            }
                                            break;
                                        case 10:
                                            strA01 = AbstractC2495k7.A01(attributeValue);
                                            attributeCount = strA01.hashCode();
                                            switch (attributeCount) {
                                                case -618561360:
                                                    if (strA01.equals(A0A(1251, 13, 60))) {
                                                        b4 = 2;
                                                    } else {
                                                        b4 = -1;
                                                    }
                                                    break;
                                                case -410956671:
                                                    if (strA01.equals(A0A(1310, 9, 123))) {
                                                        b4 = 0;
                                                    } else {
                                                        b4 = -1;
                                                    }
                                                    break;
                                                case -250518009:
                                                    if (!strA01.equals(A0A(1323, 9, 19))) {
                                                        b4 = -1;
                                                    }
                                                    break;
                                                case -136074796:
                                                    if (strA01.equals(A0A(1714, 13, 21))) {
                                                        b4 = 4;
                                                    } else {
                                                        b4 = -1;
                                                    }
                                                    break;
                                                case 3016401:
                                                    i3 = A02[0].length();
                                                    if (i3 != 7) {
                                                        String[] strArr1116 = A02;
                                                        strArr1116[4] = "LIbObqkBHnKY9czcuqJXmaycY";
                                                        strArr1116[7] = "8yr68kE48uI7ct7K5MzK8s3n0";
                                                        if (strA01.equals(A0A(1247, 4, 121))) {
                                                            b4 = 1;
                                                        } else {
                                                            b4 = -1;
                                                        }
                                                    } else if (strA01.equals(A0A(1247, 4, 121))) {
                                                        b4 = 1;
                                                    } else {
                                                        b4 = -1;
                                                    }
                                                    break;
                                                case 3556653:
                                                    if (strA01.equals(A0A(1690, 4, 69))) {
                                                        b4 = 3;
                                                    } else {
                                                        b4 = -1;
                                                    }
                                                    break;
                                                default:
                                                    b4 = -1;
                                                    break;
                                            }
                                            switch (b4) {
                                                case 0:
                                                    ktA011 = A08(ktA011).A0K(1);
                                                    break;
                                                case 1:
                                                case 2:
                                                    ktA011 = A08(ktA011).A0K(2);
                                                    break;
                                                case 3:
                                                case 4:
                                                    ktA011 = A08(ktA011).A0K(3);
                                                    break;
                                                case 5:
                                                    ktA09 = A08(ktA011);
                                                    String[] strArr1117 = A02;
                                                    String str1116 = strArr1117[6];
                                                    String str1117 = strArr1117[2];
                                                    i4 = str1116.charAt(3);
                                                    attributeCount2 = str1117.charAt(3);
                                                    if (i4 != attributeCount2) {
                                                        A02[0] = "J4PxtYpjCjcISuW5D9hp9p1SdEi";
                                                        ktA011 = ktA09.A0K(4);
                                                    } else {
                                                        String[] strArr1118 = A02;
                                                        strArr1118[4] = "5y5J9haLXfISwEnEFuDPzKTDZ";
                                                        strArr1118[7] = "OL7OkctduLhf4RZoSVrAZg0CW";
                                                        ktA011 = ktA09.A0K(4);
                                                    }
                                                    break;
                                            }
                                            break;
                                        case 11:
                                            strA02 = AbstractC2495k7.A01(attributeValue);
                                            attributeCount3 = strA02.hashCode();
                                            switch (attributeCount3) {
                                                case -1392885889:
                                                    if (strA02.equals(A0A(1264, 6, 99))) {
                                                        b6 = 0;
                                                    }
                                                    break;
                                                case 92734940:
                                                    if (strA02.equals(A0A(1209, 5, 37))) {
                                                        b6 = 1;
                                                    }
                                                    break;
                                            }
                                            switch (b6) {
                                                case 0:
                                                    ktA011 = A08(ktA011).A0J(1);
                                                    break;
                                                case 1:
                                                    ktA011 = A08(ktA011).A0J(2);
                                                    break;
                                            }
                                            break;
                                        case 12:
                                            strA03 = AbstractC2495k7.A01(attributeValue);
                                            attributeCount4 = strA03.hashCode();
                                            switch (attributeCount4) {
                                                case -1461280213:
                                                    strA0A = A0A(1593, 11, 58);
                                                    String[] strArr1119 = A02;
                                                    String str1118 = strArr1119[4];
                                                    String str1119 = strArr1119[7];
                                                    i5 = str1118.length();
                                                    attributeCount5 = str1119.length();
                                                    if (i5 != attributeCount5) {
                                                        String[] strArr1120 = A02;
                                                        strArr1120[1] = "bik63b6qq3sx6";
                                                        strArr1120[5] = "UnBPKnpUlJfync8N3sKzurGh";
                                                        if (!strA03.equals(strA0A)) {
                                                            b5 = -1;
                                                        }
                                                    } else if (!strA03.equals(strA0A)) {
                                                        b5 = -1;
                                                    }
                                                    switch (b5) {
                                                        case 0:
                                                            ktA011 = A08(ktA011).A0T(true);
                                                            break;
                                                        case 1:
                                                            ktA011 = A08(ktA011).A0T(false);
                                                            break;
                                                        case 2:
                                                            ktA011 = A08(ktA011).A0V(true);
                                                            break;
                                                        case 3:
                                                            ktA011 = A08(ktA011).A0V(false);
                                                            break;
                                                    }
                                                    break;
                                                case -1026963764:
                                                    if (strA03.equals(A0A(1763, 9, 73))) {
                                                        b5 = 2;
                                                    } else {
                                                        b5 = -1;
                                                    }
                                                    switch (b5) {
                                                        case 0:
                                                            ktA011 = A08(ktA011).A0T(true);
                                                            break;
                                                        case 1:
                                                            ktA011 = A08(ktA011).A0T(false);
                                                            break;
                                                        case 2:
                                                            ktA011 = A08(ktA011).A0V(true);
                                                            break;
                                                        case 3:
                                                            ktA011 = A08(ktA011).A0V(false);
                                                            break;
                                                    }
                                                    break;
                                                case 913457136:
                                                    String[] strArr1121 = A02;
                                                    String str1120 = strArr1121[1];
                                                    String str1121 = strArr1121[5];
                                                    i6 = str1120.length();
                                                    attributeCount6 = str1121.length();
                                                    if (i6 == attributeCount6) {
                                                        A02[3] = "e93UUhN2aqZLtboheHnNzqcVXHE9GMfx";
                                                        if (strA03.equals(A0A(1576, 13, 109))) {
                                                            b5 = 1;
                                                        } else {
                                                            b5 = -1;
                                                        }
                                                        switch (b5) {
                                                            case 0:
                                                                ktA011 = A08(ktA011).A0T(true);
                                                                break;
                                                            case 1:
                                                                ktA011 = A08(ktA011).A0T(false);
                                                                break;
                                                            case 2:
                                                                ktA011 = A08(ktA011).A0V(true);
                                                                break;
                                                            case 3:
                                                                ktA011 = A08(ktA011).A0V(false);
                                                                break;
                                                        }
                                                    } else {
                                                        throw new RuntimeException();
                                                    }
                                                    break;
                                                case 1679736913:
                                                    if (strA03.equals(A0A(1541, 11, 39))) {
                                                        b5 = 0;
                                                    } else {
                                                        b5 = -1;
                                                    }
                                                    switch (b5) {
                                                        case 0:
                                                            ktA011 = A08(ktA011).A0T(true);
                                                            break;
                                                        case 1:
                                                            ktA011 = A08(ktA011).A0T(false);
                                                            break;
                                                        case 2:
                                                            ktA011 = A08(ktA011).A0V(true);
                                                            break;
                                                        case 3:
                                                            ktA011 = A08(ktA011).A0V(false);
                                                            break;
                                                    }
                                                    break;
                                                default:
                                                    b5 = -1;
                                                    switch (b5) {
                                                        case 0:
                                                            ktA011 = A08(ktA011).A0T(true);
                                                            break;
                                                        case 1:
                                                            ktA011 = A08(ktA011).A0T(false);
                                                            break;
                                                        case 2:
                                                            ktA011 = A08(ktA011).A0V(true);
                                                            break;
                                                        case 3:
                                                            ktA011 = A08(ktA011).A0V(false);
                                                            break;
                                                    }
                                                    break;
                                            }
                                            break;
                                        case 13:
                                            ktA011 = A08(ktA011).A0N(KI.A01(attributeValue));
                                            break;
                                        case 14:
                                            ktA011 = A08(ktA011).A0F(A00(attributeValue));
                                            break;
                                    }
                                    break;
                                case -879295043:
                                    if (attributeName.equals(A0A(1727, 14, 94))) {
                                        b3 = 12;
                                    } else {
                                        b3 = -1;
                                    }
                                    String strA0A6 = A0A(892, 11, 16);
                                    switch (b3) {
                                        case 0:
                                            if (A0A(1655, 5, 93).equals(xmlPullParser.getName())) {
                                                ktA011 = A08(ktA011).A0Q(attributeValue);
                                            }
                                            break;
                                        case 1:
                                            ktA011 = A08(ktA011);
                                            int attributeCount18 = AnonymousClass47.A01(attributeValue);
                                            ktA011.A0G(attributeCount18);
                                            break;
                                        case 2:
                                            ktA011 = A08(ktA011);
                                            int attributeCount19 = AnonymousClass47.A01(attributeValue);
                                            ktA011.A0H(attributeCount19);
                                            break;
                                        case 3:
                                            ktA011 = A08(ktA011).A0P(attributeValue);
                                            break;
                                        case 4:
                                            ktA011 = A08(ktA011);
                                            A0D(attributeValue, ktA011);
                                            break;
                                        case 5:
                                            ktA011 = A08(ktA011).A0R(A0A(1279, 4, 70).equalsIgnoreCase(attributeValue));
                                            break;
                                        case 6:
                                            ktA08 = A08(ktA011);
                                            zEqualsIgnoreCase = A0A(1525, 6, 38).equalsIgnoreCase(attributeValue);
                                            i2 = A02[0].length();
                                            if (i2 != 7) {
                                                String[] strArr122 = A02;
                                                strArr122[1] = "3LAgyyDE1fiF0";
                                                strArr122[5] = "1Nn0OmHZpjO5zuXdFxViYYhi";
                                                ktA011 = ktA08.A0S(zEqualsIgnoreCase);
                                            } else {
                                                A02[3] = "rHlCayaIaBq6HOiiZnZ7WLhH9IM1pHxI";
                                                ktA011 = ktA08.A0S(zEqualsIgnoreCase);
                                            }
                                            break;
                                        case 7:
                                            ktA011 = A08(ktA011).A0M(A02(attributeValue));
                                            break;
                                        case 8:
                                            ktA011 = A08(ktA011).A0L(A02(attributeValue));
                                            break;
                                        case 9:
                                            strA04 = AbstractC2495k7.A01(attributeValue);
                                            attributeCount7 = strA04.hashCode();
                                            switch (attributeCount7) {
                                                case 96673:
                                                    if (strA04.equals(A0A(1214, 3, 74))) {
                                                        b6 = 1;
                                                    }
                                                    switch (b6) {
                                                        case 0:
                                                            ktA011 = A08(ktA011).A0U(false);
                                                            break;
                                                        case 1:
                                                            ktA010 = A08(ktA011);
                                                            String[] strArr11110 = A02;
                                                            String str11110 = strArr11110[6];
                                                            String str11111 = strArr11110[2];
                                                            i7 = str11110.charAt(3);
                                                            attributeCount8 = str11111.charAt(3);
                                                            if (i7 != attributeCount8) {
                                                                ktA011 = ktA010.A0U(true);
                                                            } else {
                                                                String[] strArr11111 = A02;
                                                                strArr11111[4] = "vXebmLnNF52WQsSE6i6dOepDl";
                                                                strArr11111[7] = "VyoJ0PyeyBelBF2UzGSxOycy2";
                                                                ktA011 = ktA010.A0U(true);
                                                            }
                                                            break;
                                                    }
                                                    break;
                                                case 3387192:
                                                    strA0A2 = A0A(1589, 4, 93);
                                                    String[] strArr123 = A02;
                                                    String str122 = strArr123[4];
                                                    String str123 = strArr123[7];
                                                    i8 = str122.length();
                                                    attributeCount9 = str123.length();
                                                    if (i8 != attributeCount9) {
                                                        String[] strArr22 = A02;
                                                        strArr22[6] = "KuhwJ7ghsOXYSD0w45zfNovp0dFSdmRc";
                                                        strArr22[2] = "7BZwCfoQFB9cKVUBMfAbcYdCpdo30x6t";
                                                        if (strA04.equals(strA0A2)) {
                                                            b6 = 0;
                                                        }
                                                        switch (b6) {
                                                            case 0:
                                                                ktA011 = A08(ktA011).A0U(false);
                                                                break;
                                                            case 1:
                                                                ktA010 = A08(ktA011);
                                                                String[] strArr11112 = A02;
                                                                String str11112 = strArr11112[6];
                                                                String str11113 = strArr11112[2];
                                                                i7 = str11112.charAt(3);
                                                                attributeCount8 = str11113.charAt(3);
                                                                if (i7 != attributeCount8) {
                                                                    ktA011 = ktA010.A0U(true);
                                                                } else {
                                                                    String[] strArr11113 = A02;
                                                                    strArr11113[4] = "vXebmLnNF52WQsSE6i6dOepDl";
                                                                    strArr11113[7] = "VyoJ0PyeyBelBF2UzGSxOycy2";
                                                                    ktA011 = ktA010.A0U(true);
                                                                }
                                                                break;
                                                        }
                                                    } else {
                                                        throw new RuntimeException();
                                                    }
                                                    break;
                                                default:
                                                    switch (b6) {
                                                        case 0:
                                                            ktA011 = A08(ktA011).A0U(false);
                                                            break;
                                                        case 1:
                                                            ktA010 = A08(ktA011);
                                                            String[] strArr11114 = A02;
                                                            String str11114 = strArr11114[6];
                                                            String str11115 = strArr11114[2];
                                                            i7 = str11114.charAt(3);
                                                            attributeCount8 = str11115.charAt(3);
                                                            if (i7 != attributeCount8) {
                                                                ktA011 = ktA010.A0U(true);
                                                            } else {
                                                                String[] strArr11115 = A02;
                                                                strArr11115[4] = "vXebmLnNF52WQsSE6i6dOepDl";
                                                                strArr11115[7] = "VyoJ0PyeyBelBF2UzGSxOycy2";
                                                                ktA011 = ktA010.A0U(true);
                                                            }
                                                            break;
                                                    }
                                                    break;
                                            }
                                            break;
                                        case 10:
                                            strA01 = AbstractC2495k7.A01(attributeValue);
                                            attributeCount = strA01.hashCode();
                                            switch (attributeCount) {
                                                case -618561360:
                                                    if (strA01.equals(A0A(1251, 13, 60))) {
                                                        b4 = 2;
                                                    } else {
                                                        b4 = -1;
                                                    }
                                                    break;
                                                case -410956671:
                                                    if (strA01.equals(A0A(1310, 9, 123))) {
                                                        b4 = 0;
                                                    } else {
                                                        b4 = -1;
                                                    }
                                                    break;
                                                case -250518009:
                                                    if (!strA01.equals(A0A(1323, 9, 19))) {
                                                        b4 = -1;
                                                    }
                                                    break;
                                                case -136074796:
                                                    if (strA01.equals(A0A(1714, 13, 21))) {
                                                        b4 = 4;
                                                    } else {
                                                        b4 = -1;
                                                    }
                                                    break;
                                                case 3016401:
                                                    i3 = A02[0].length();
                                                    if (i3 != 7) {
                                                        String[] strArr11116 = A02;
                                                        strArr11116[4] = "LIbObqkBHnKY9czcuqJXmaycY";
                                                        strArr11116[7] = "8yr68kE48uI7ct7K5MzK8s3n0";
                                                        if (strA01.equals(A0A(1247, 4, 121))) {
                                                            b4 = 1;
                                                        } else {
                                                            b4 = -1;
                                                        }
                                                    } else if (strA01.equals(A0A(1247, 4, 121))) {
                                                        b4 = 1;
                                                    } else {
                                                        b4 = -1;
                                                    }
                                                    break;
                                                case 3556653:
                                                    if (strA01.equals(A0A(1690, 4, 69))) {
                                                        b4 = 3;
                                                    } else {
                                                        b4 = -1;
                                                    }
                                                    break;
                                                default:
                                                    b4 = -1;
                                                    break;
                                            }
                                            switch (b4) {
                                                case 0:
                                                    ktA011 = A08(ktA011).A0K(1);
                                                    break;
                                                case 1:
                                                case 2:
                                                    ktA011 = A08(ktA011).A0K(2);
                                                    break;
                                                case 3:
                                                case 4:
                                                    ktA011 = A08(ktA011).A0K(3);
                                                    break;
                                                case 5:
                                                    ktA09 = A08(ktA011);
                                                    String[] strArr11117 = A02;
                                                    String str11116 = strArr11117[6];
                                                    String str11117 = strArr11117[2];
                                                    i4 = str11116.charAt(3);
                                                    attributeCount2 = str11117.charAt(3);
                                                    if (i4 != attributeCount2) {
                                                        A02[0] = "J4PxtYpjCjcISuW5D9hp9p1SdEi";
                                                        ktA011 = ktA09.A0K(4);
                                                    } else {
                                                        String[] strArr11118 = A02;
                                                        strArr11118[4] = "5y5J9haLXfISwEnEFuDPzKTDZ";
                                                        strArr11118[7] = "OL7OkctduLhf4RZoSVrAZg0CW";
                                                        ktA011 = ktA09.A0K(4);
                                                    }
                                                    break;
                                            }
                                            break;
                                        case 11:
                                            strA02 = AbstractC2495k7.A01(attributeValue);
                                            attributeCount3 = strA02.hashCode();
                                            switch (attributeCount3) {
                                                case -1392885889:
                                                    if (strA02.equals(A0A(1264, 6, 99))) {
                                                        b6 = 0;
                                                    }
                                                    break;
                                                case 92734940:
                                                    if (strA02.equals(A0A(1209, 5, 37))) {
                                                        b6 = 1;
                                                    }
                                                    break;
                                            }
                                            switch (b6) {
                                                case 0:
                                                    ktA011 = A08(ktA011).A0J(1);
                                                    break;
                                                case 1:
                                                    ktA011 = A08(ktA011).A0J(2);
                                                    break;
                                            }
                                            break;
                                        case 12:
                                            strA03 = AbstractC2495k7.A01(attributeValue);
                                            attributeCount4 = strA03.hashCode();
                                            switch (attributeCount4) {
                                                case -1461280213:
                                                    strA0A = A0A(1593, 11, 58);
                                                    String[] strArr11119 = A02;
                                                    String str11118 = strArr11119[4];
                                                    String str11119 = strArr11119[7];
                                                    i5 = str11118.length();
                                                    attributeCount5 = str11119.length();
                                                    if (i5 != attributeCount5) {
                                                        String[] strArr1122 = A02;
                                                        strArr1122[1] = "bik63b6qq3sx6";
                                                        strArr1122[5] = "UnBPKnpUlJfync8N3sKzurGh";
                                                        if (!strA03.equals(strA0A)) {
                                                            b5 = -1;
                                                        }
                                                    } else if (!strA03.equals(strA0A)) {
                                                        b5 = -1;
                                                    }
                                                    switch (b5) {
                                                        case 0:
                                                            ktA011 = A08(ktA011).A0T(true);
                                                            break;
                                                        case 1:
                                                            ktA011 = A08(ktA011).A0T(false);
                                                            break;
                                                        case 2:
                                                            ktA011 = A08(ktA011).A0V(true);
                                                            break;
                                                        case 3:
                                                            ktA011 = A08(ktA011).A0V(false);
                                                            break;
                                                    }
                                                    break;
                                                case -1026963764:
                                                    if (strA03.equals(A0A(1763, 9, 73))) {
                                                        b5 = 2;
                                                    } else {
                                                        b5 = -1;
                                                    }
                                                    switch (b5) {
                                                        case 0:
                                                            ktA011 = A08(ktA011).A0T(true);
                                                            break;
                                                        case 1:
                                                            ktA011 = A08(ktA011).A0T(false);
                                                            break;
                                                        case 2:
                                                            ktA011 = A08(ktA011).A0V(true);
                                                            break;
                                                        case 3:
                                                            ktA011 = A08(ktA011).A0V(false);
                                                            break;
                                                    }
                                                    break;
                                                case 913457136:
                                                    String[] strArr1123 = A02;
                                                    String str1122 = strArr1123[1];
                                                    String str1123 = strArr1123[5];
                                                    i6 = str1122.length();
                                                    attributeCount6 = str1123.length();
                                                    if (i6 == attributeCount6) {
                                                        A02[3] = "e93UUhN2aqZLtboheHnNzqcVXHE9GMfx";
                                                        if (strA03.equals(A0A(1576, 13, 109))) {
                                                            b5 = 1;
                                                        } else {
                                                            b5 = -1;
                                                        }
                                                        switch (b5) {
                                                            case 0:
                                                                ktA011 = A08(ktA011).A0T(true);
                                                                break;
                                                            case 1:
                                                                ktA011 = A08(ktA011).A0T(false);
                                                                break;
                                                            case 2:
                                                                ktA011 = A08(ktA011).A0V(true);
                                                                break;
                                                            case 3:
                                                                ktA011 = A08(ktA011).A0V(false);
                                                                break;
                                                        }
                                                    } else {
                                                        throw new RuntimeException();
                                                    }
                                                    break;
                                                case 1679736913:
                                                    if (strA03.equals(A0A(1541, 11, 39))) {
                                                        b5 = 0;
                                                    } else {
                                                        b5 = -1;
                                                    }
                                                    switch (b5) {
                                                        case 0:
                                                            ktA011 = A08(ktA011).A0T(true);
                                                            break;
                                                        case 1:
                                                            ktA011 = A08(ktA011).A0T(false);
                                                            break;
                                                        case 2:
                                                            ktA011 = A08(ktA011).A0V(true);
                                                            break;
                                                        case 3:
                                                            ktA011 = A08(ktA011).A0V(false);
                                                            break;
                                                    }
                                                    break;
                                                default:
                                                    b5 = -1;
                                                    switch (b5) {
                                                        case 0:
                                                            ktA011 = A08(ktA011).A0T(true);
                                                            break;
                                                        case 1:
                                                            ktA011 = A08(ktA011).A0T(false);
                                                            break;
                                                        case 2:
                                                            ktA011 = A08(ktA011).A0V(true);
                                                            break;
                                                        case 3:
                                                            ktA011 = A08(ktA011).A0V(false);
                                                            break;
                                                    }
                                                    break;
                                            }
                                            break;
                                        case 13:
                                            ktA011 = A08(ktA011).A0N(KI.A01(attributeValue));
                                            break;
                                        case 14:
                                            ktA011 = A08(ktA011).A0F(A00(attributeValue));
                                            break;
                                    }
                                    break;
                                case -734428249:
                                    String strA0A7 = A0A(1389, 10, 45);
                                    int i10 = A02[3].charAt(8);
                                    if (i10 == 97) {
                                        A02[3] = "fe6MNLffa3xUvXQ94HR1CDOyy1WS5JE1";
                                        if (attributeName.equals(strA0A7)) {
                                            b3 = 5;
                                        } else {
                                            b3 = -1;
                                        }
                                    } else if (attributeName.equals(strA0A7)) {
                                        b3 = 5;
                                    } else {
                                        b3 = -1;
                                    }
                                    String strA0A8 = A0A(892, 11, 16);
                                    switch (b3) {
                                        case 0:
                                            if (A0A(1655, 5, 93).equals(xmlPullParser.getName())) {
                                                ktA011 = A08(ktA011).A0Q(attributeValue);
                                            }
                                            break;
                                        case 1:
                                            ktA011 = A08(ktA011);
                                            int attributeCount110 = AnonymousClass47.A01(attributeValue);
                                            ktA011.A0G(attributeCount110);
                                            break;
                                        case 2:
                                            ktA011 = A08(ktA011);
                                            int attributeCount111 = AnonymousClass47.A01(attributeValue);
                                            ktA011.A0H(attributeCount111);
                                            break;
                                        case 3:
                                            ktA011 = A08(ktA011).A0P(attributeValue);
                                            break;
                                        case 4:
                                            ktA011 = A08(ktA011);
                                            A0D(attributeValue, ktA011);
                                            break;
                                        case 5:
                                            ktA011 = A08(ktA011).A0R(A0A(1279, 4, 70).equalsIgnoreCase(attributeValue));
                                            break;
                                        case 6:
                                            ktA08 = A08(ktA011);
                                            zEqualsIgnoreCase = A0A(1525, 6, 38).equalsIgnoreCase(attributeValue);
                                            i2 = A02[0].length();
                                            if (i2 != 7) {
                                                String[] strArr124 = A02;
                                                strArr124[1] = "3LAgyyDE1fiF0";
                                                strArr124[5] = "1Nn0OmHZpjO5zuXdFxViYYhi";
                                                ktA011 = ktA08.A0S(zEqualsIgnoreCase);
                                            } else {
                                                A02[3] = "rHlCayaIaBq6HOiiZnZ7WLhH9IM1pHxI";
                                                ktA011 = ktA08.A0S(zEqualsIgnoreCase);
                                            }
                                            break;
                                        case 7:
                                            ktA011 = A08(ktA011).A0M(A02(attributeValue));
                                            break;
                                        case 8:
                                            ktA011 = A08(ktA011).A0L(A02(attributeValue));
                                            break;
                                        case 9:
                                            strA04 = AbstractC2495k7.A01(attributeValue);
                                            attributeCount7 = strA04.hashCode();
                                            switch (attributeCount7) {
                                                case 96673:
                                                    if (strA04.equals(A0A(1214, 3, 74))) {
                                                        b6 = 1;
                                                    }
                                                    switch (b6) {
                                                        case 0:
                                                            ktA011 = A08(ktA011).A0U(false);
                                                            break;
                                                        case 1:
                                                            ktA010 = A08(ktA011);
                                                            String[] strArr111110 = A02;
                                                            String str111110 = strArr111110[6];
                                                            String str111111 = strArr111110[2];
                                                            i7 = str111110.charAt(3);
                                                            attributeCount8 = str111111.charAt(3);
                                                            if (i7 != attributeCount8) {
                                                                ktA011 = ktA010.A0U(true);
                                                            } else {
                                                                String[] strArr111111 = A02;
                                                                strArr111111[4] = "vXebmLnNF52WQsSE6i6dOepDl";
                                                                strArr111111[7] = "VyoJ0PyeyBelBF2UzGSxOycy2";
                                                                ktA011 = ktA010.A0U(true);
                                                            }
                                                            break;
                                                    }
                                                    break;
                                                case 3387192:
                                                    strA0A2 = A0A(1589, 4, 93);
                                                    String[] strArr125 = A02;
                                                    String str124 = strArr125[4];
                                                    String str125 = strArr125[7];
                                                    i8 = str124.length();
                                                    attributeCount9 = str125.length();
                                                    if (i8 != attributeCount9) {
                                                        String[] strArr23 = A02;
                                                        strArr23[6] = "KuhwJ7ghsOXYSD0w45zfNovp0dFSdmRc";
                                                        strArr23[2] = "7BZwCfoQFB9cKVUBMfAbcYdCpdo30x6t";
                                                        if (strA04.equals(strA0A2)) {
                                                            b6 = 0;
                                                        }
                                                        switch (b6) {
                                                            case 0:
                                                                ktA011 = A08(ktA011).A0U(false);
                                                                break;
                                                            case 1:
                                                                ktA010 = A08(ktA011);
                                                                String[] strArr111112 = A02;
                                                                String str111112 = strArr111112[6];
                                                                String str111113 = strArr111112[2];
                                                                i7 = str111112.charAt(3);
                                                                attributeCount8 = str111113.charAt(3);
                                                                if (i7 != attributeCount8) {
                                                                    ktA011 = ktA010.A0U(true);
                                                                } else {
                                                                    String[] strArr111113 = A02;
                                                                    strArr111113[4] = "vXebmLnNF52WQsSE6i6dOepDl";
                                                                    strArr111113[7] = "VyoJ0PyeyBelBF2UzGSxOycy2";
                                                                    ktA011 = ktA010.A0U(true);
                                                                }
                                                                break;
                                                        }
                                                    } else {
                                                        throw new RuntimeException();
                                                    }
                                                    break;
                                                default:
                                                    switch (b6) {
                                                        case 0:
                                                            ktA011 = A08(ktA011).A0U(false);
                                                            break;
                                                        case 1:
                                                            ktA010 = A08(ktA011);
                                                            String[] strArr111114 = A02;
                                                            String str111114 = strArr111114[6];
                                                            String str111115 = strArr111114[2];
                                                            i7 = str111114.charAt(3);
                                                            attributeCount8 = str111115.charAt(3);
                                                            if (i7 != attributeCount8) {
                                                                ktA011 = ktA010.A0U(true);
                                                            } else {
                                                                String[] strArr111115 = A02;
                                                                strArr111115[4] = "vXebmLnNF52WQsSE6i6dOepDl";
                                                                strArr111115[7] = "VyoJ0PyeyBelBF2UzGSxOycy2";
                                                                ktA011 = ktA010.A0U(true);
                                                            }
                                                            break;
                                                    }
                                                    break;
                                            }
                                            break;
                                        case 10:
                                            strA01 = AbstractC2495k7.A01(attributeValue);
                                            attributeCount = strA01.hashCode();
                                            switch (attributeCount) {
                                                case -618561360:
                                                    if (strA01.equals(A0A(1251, 13, 60))) {
                                                        b4 = 2;
                                                    } else {
                                                        b4 = -1;
                                                    }
                                                    break;
                                                case -410956671:
                                                    if (strA01.equals(A0A(1310, 9, 123))) {
                                                        b4 = 0;
                                                    } else {
                                                        b4 = -1;
                                                    }
                                                    break;
                                                case -250518009:
                                                    if (!strA01.equals(A0A(1323, 9, 19))) {
                                                        b4 = -1;
                                                    }
                                                    break;
                                                case -136074796:
                                                    if (strA01.equals(A0A(1714, 13, 21))) {
                                                        b4 = 4;
                                                    } else {
                                                        b4 = -1;
                                                    }
                                                    break;
                                                case 3016401:
                                                    i3 = A02[0].length();
                                                    if (i3 != 7) {
                                                        String[] strArr111116 = A02;
                                                        strArr111116[4] = "LIbObqkBHnKY9czcuqJXmaycY";
                                                        strArr111116[7] = "8yr68kE48uI7ct7K5MzK8s3n0";
                                                        if (strA01.equals(A0A(1247, 4, 121))) {
                                                            b4 = 1;
                                                        } else {
                                                            b4 = -1;
                                                        }
                                                    } else if (strA01.equals(A0A(1247, 4, 121))) {
                                                        b4 = 1;
                                                    } else {
                                                        b4 = -1;
                                                    }
                                                    break;
                                                case 3556653:
                                                    if (strA01.equals(A0A(1690, 4, 69))) {
                                                        b4 = 3;
                                                    } else {
                                                        b4 = -1;
                                                    }
                                                    break;
                                                default:
                                                    b4 = -1;
                                                    break;
                                            }
                                            switch (b4) {
                                                case 0:
                                                    ktA011 = A08(ktA011).A0K(1);
                                                    break;
                                                case 1:
                                                case 2:
                                                    ktA011 = A08(ktA011).A0K(2);
                                                    break;
                                                case 3:
                                                case 4:
                                                    ktA011 = A08(ktA011).A0K(3);
                                                    break;
                                                case 5:
                                                    ktA09 = A08(ktA011);
                                                    String[] strArr111117 = A02;
                                                    String str111116 = strArr111117[6];
                                                    String str111117 = strArr111117[2];
                                                    i4 = str111116.charAt(3);
                                                    attributeCount2 = str111117.charAt(3);
                                                    if (i4 != attributeCount2) {
                                                        A02[0] = "J4PxtYpjCjcISuW5D9hp9p1SdEi";
                                                        ktA011 = ktA09.A0K(4);
                                                    } else {
                                                        String[] strArr111118 = A02;
                                                        strArr111118[4] = "5y5J9haLXfISwEnEFuDPzKTDZ";
                                                        strArr111118[7] = "OL7OkctduLhf4RZoSVrAZg0CW";
                                                        ktA011 = ktA09.A0K(4);
                                                    }
                                                    break;
                                            }
                                            break;
                                        case 11:
                                            strA02 = AbstractC2495k7.A01(attributeValue);
                                            attributeCount3 = strA02.hashCode();
                                            switch (attributeCount3) {
                                                case -1392885889:
                                                    if (strA02.equals(A0A(1264, 6, 99))) {
                                                        b6 = 0;
                                                    }
                                                    break;
                                                case 92734940:
                                                    if (strA02.equals(A0A(1209, 5, 37))) {
                                                        b6 = 1;
                                                    }
                                                    break;
                                            }
                                            switch (b6) {
                                                case 0:
                                                    ktA011 = A08(ktA011).A0J(1);
                                                    break;
                                                case 1:
                                                    ktA011 = A08(ktA011).A0J(2);
                                                    break;
                                            }
                                            break;
                                        case 12:
                                            strA03 = AbstractC2495k7.A01(attributeValue);
                                            attributeCount4 = strA03.hashCode();
                                            switch (attributeCount4) {
                                                case -1461280213:
                                                    strA0A = A0A(1593, 11, 58);
                                                    String[] strArr111119 = A02;
                                                    String str111118 = strArr111119[4];
                                                    String str111119 = strArr111119[7];
                                                    i5 = str111118.length();
                                                    attributeCount5 = str111119.length();
                                                    if (i5 != attributeCount5) {
                                                        String[] strArr1124 = A02;
                                                        strArr1124[1] = "bik63b6qq3sx6";
                                                        strArr1124[5] = "UnBPKnpUlJfync8N3sKzurGh";
                                                        if (!strA03.equals(strA0A)) {
                                                            b5 = -1;
                                                        }
                                                    } else if (!strA03.equals(strA0A)) {
                                                        b5 = -1;
                                                    }
                                                    switch (b5) {
                                                        case 0:
                                                            ktA011 = A08(ktA011).A0T(true);
                                                            break;
                                                        case 1:
                                                            ktA011 = A08(ktA011).A0T(false);
                                                            break;
                                                        case 2:
                                                            ktA011 = A08(ktA011).A0V(true);
                                                            break;
                                                        case 3:
                                                            ktA011 = A08(ktA011).A0V(false);
                                                            break;
                                                    }
                                                    break;
                                                case -1026963764:
                                                    if (strA03.equals(A0A(1763, 9, 73))) {
                                                        b5 = 2;
                                                    } else {
                                                        b5 = -1;
                                                    }
                                                    switch (b5) {
                                                        case 0:
                                                            ktA011 = A08(ktA011).A0T(true);
                                                            break;
                                                        case 1:
                                                            ktA011 = A08(ktA011).A0T(false);
                                                            break;
                                                        case 2:
                                                            ktA011 = A08(ktA011).A0V(true);
                                                            break;
                                                        case 3:
                                                            ktA011 = A08(ktA011).A0V(false);
                                                            break;
                                                    }
                                                    break;
                                                case 913457136:
                                                    String[] strArr1125 = A02;
                                                    String str1124 = strArr1125[1];
                                                    String str1125 = strArr1125[5];
                                                    i6 = str1124.length();
                                                    attributeCount6 = str1125.length();
                                                    if (i6 == attributeCount6) {
                                                        A02[3] = "e93UUhN2aqZLtboheHnNzqcVXHE9GMfx";
                                                        if (strA03.equals(A0A(1576, 13, 109))) {
                                                            b5 = 1;
                                                        } else {
                                                            b5 = -1;
                                                        }
                                                        switch (b5) {
                                                            case 0:
                                                                ktA011 = A08(ktA011).A0T(true);
                                                                break;
                                                            case 1:
                                                                ktA011 = A08(ktA011).A0T(false);
                                                                break;
                                                            case 2:
                                                                ktA011 = A08(ktA011).A0V(true);
                                                                break;
                                                            case 3:
                                                                ktA011 = A08(ktA011).A0V(false);
                                                                break;
                                                        }
                                                    } else {
                                                        throw new RuntimeException();
                                                    }
                                                    break;
                                                case 1679736913:
                                                    if (strA03.equals(A0A(1541, 11, 39))) {
                                                        b5 = 0;
                                                    } else {
                                                        b5 = -1;
                                                    }
                                                    switch (b5) {
                                                        case 0:
                                                            ktA011 = A08(ktA011).A0T(true);
                                                            break;
                                                        case 1:
                                                            ktA011 = A08(ktA011).A0T(false);
                                                            break;
                                                        case 2:
                                                            ktA011 = A08(ktA011).A0V(true);
                                                            break;
                                                        case 3:
                                                            ktA011 = A08(ktA011).A0V(false);
                                                            break;
                                                    }
                                                    break;
                                                default:
                                                    b5 = -1;
                                                    switch (b5) {
                                                        case 0:
                                                            ktA011 = A08(ktA011).A0T(true);
                                                            break;
                                                        case 1:
                                                            ktA011 = A08(ktA011).A0T(false);
                                                            break;
                                                        case 2:
                                                            ktA011 = A08(ktA011).A0V(true);
                                                            break;
                                                        case 3:
                                                            ktA011 = A08(ktA011).A0V(false);
                                                            break;
                                                    }
                                                    break;
                                            }
                                            break;
                                        case 13:
                                            ktA011 = A08(ktA011).A0N(KI.A01(attributeValue));
                                            break;
                                        case 14:
                                            ktA011 = A08(ktA011).A0F(A00(attributeValue));
                                            break;
                                    }
                                    break;
                                case 3355:
                                    if (attributeName.equals(A0A(cs.a.INSTANCE_NOT_FOUND_IN_SHOW, 2, 90))) {
                                        b3 = 0;
                                    } else {
                                        b3 = -1;
                                    }
                                    String strA0A9 = A0A(892, 11, 16);
                                    switch (b3) {
                                        case 0:
                                            if (A0A(1655, 5, 93).equals(xmlPullParser.getName())) {
                                                ktA011 = A08(ktA011).A0Q(attributeValue);
                                            }
                                            break;
                                        case 1:
                                            ktA011 = A08(ktA011);
                                            int attributeCount112 = AnonymousClass47.A01(attributeValue);
                                            ktA011.A0G(attributeCount112);
                                            break;
                                        case 2:
                                            ktA011 = A08(ktA011);
                                            int attributeCount113 = AnonymousClass47.A01(attributeValue);
                                            ktA011.A0H(attributeCount113);
                                            break;
                                        case 3:
                                            ktA011 = A08(ktA011).A0P(attributeValue);
                                            break;
                                        case 4:
                                            ktA011 = A08(ktA011);
                                            A0D(attributeValue, ktA011);
                                            break;
                                        case 5:
                                            ktA011 = A08(ktA011).A0R(A0A(1279, 4, 70).equalsIgnoreCase(attributeValue));
                                            break;
                                        case 6:
                                            ktA08 = A08(ktA011);
                                            zEqualsIgnoreCase = A0A(1525, 6, 38).equalsIgnoreCase(attributeValue);
                                            i2 = A02[0].length();
                                            if (i2 != 7) {
                                                String[] strArr126 = A02;
                                                strArr126[1] = "3LAgyyDE1fiF0";
                                                strArr126[5] = "1Nn0OmHZpjO5zuXdFxViYYhi";
                                                ktA011 = ktA08.A0S(zEqualsIgnoreCase);
                                            } else {
                                                A02[3] = "rHlCayaIaBq6HOiiZnZ7WLhH9IM1pHxI";
                                                ktA011 = ktA08.A0S(zEqualsIgnoreCase);
                                            }
                                            break;
                                        case 7:
                                            ktA011 = A08(ktA011).A0M(A02(attributeValue));
                                            break;
                                        case 8:
                                            ktA011 = A08(ktA011).A0L(A02(attributeValue));
                                            break;
                                        case 9:
                                            strA04 = AbstractC2495k7.A01(attributeValue);
                                            attributeCount7 = strA04.hashCode();
                                            switch (attributeCount7) {
                                                case 96673:
                                                    if (strA04.equals(A0A(1214, 3, 74))) {
                                                        b6 = 1;
                                                    }
                                                    switch (b6) {
                                                        case 0:
                                                            ktA011 = A08(ktA011).A0U(false);
                                                            break;
                                                        case 1:
                                                            ktA010 = A08(ktA011);
                                                            String[] strArr1111110 = A02;
                                                            String str1111110 = strArr1111110[6];
                                                            String str1111111 = strArr1111110[2];
                                                            i7 = str1111110.charAt(3);
                                                            attributeCount8 = str1111111.charAt(3);
                                                            if (i7 != attributeCount8) {
                                                                ktA011 = ktA010.A0U(true);
                                                            } else {
                                                                String[] strArr1111111 = A02;
                                                                strArr1111111[4] = "vXebmLnNF52WQsSE6i6dOepDl";
                                                                strArr1111111[7] = "VyoJ0PyeyBelBF2UzGSxOycy2";
                                                                ktA011 = ktA010.A0U(true);
                                                            }
                                                            break;
                                                    }
                                                    break;
                                                case 3387192:
                                                    strA0A2 = A0A(1589, 4, 93);
                                                    String[] strArr127 = A02;
                                                    String str126 = strArr127[4];
                                                    String str127 = strArr127[7];
                                                    i8 = str126.length();
                                                    attributeCount9 = str127.length();
                                                    if (i8 != attributeCount9) {
                                                        String[] strArr24 = A02;
                                                        strArr24[6] = "KuhwJ7ghsOXYSD0w45zfNovp0dFSdmRc";
                                                        strArr24[2] = "7BZwCfoQFB9cKVUBMfAbcYdCpdo30x6t";
                                                        if (strA04.equals(strA0A2)) {
                                                            b6 = 0;
                                                        }
                                                        switch (b6) {
                                                            case 0:
                                                                ktA011 = A08(ktA011).A0U(false);
                                                                break;
                                                            case 1:
                                                                ktA010 = A08(ktA011);
                                                                String[] strArr1111112 = A02;
                                                                String str1111112 = strArr1111112[6];
                                                                String str1111113 = strArr1111112[2];
                                                                i7 = str1111112.charAt(3);
                                                                attributeCount8 = str1111113.charAt(3);
                                                                if (i7 != attributeCount8) {
                                                                    ktA011 = ktA010.A0U(true);
                                                                } else {
                                                                    String[] strArr1111113 = A02;
                                                                    strArr1111113[4] = "vXebmLnNF52WQsSE6i6dOepDl";
                                                                    strArr1111113[7] = "VyoJ0PyeyBelBF2UzGSxOycy2";
                                                                    ktA011 = ktA010.A0U(true);
                                                                }
                                                                break;
                                                        }
                                                    } else {
                                                        throw new RuntimeException();
                                                    }
                                                    break;
                                                default:
                                                    switch (b6) {
                                                        case 0:
                                                            ktA011 = A08(ktA011).A0U(false);
                                                            break;
                                                        case 1:
                                                            ktA010 = A08(ktA011);
                                                            String[] strArr1111114 = A02;
                                                            String str1111114 = strArr1111114[6];
                                                            String str1111115 = strArr1111114[2];
                                                            i7 = str1111114.charAt(3);
                                                            attributeCount8 = str1111115.charAt(3);
                                                            if (i7 != attributeCount8) {
                                                                ktA011 = ktA010.A0U(true);
                                                            } else {
                                                                String[] strArr1111115 = A02;
                                                                strArr1111115[4] = "vXebmLnNF52WQsSE6i6dOepDl";
                                                                strArr1111115[7] = "VyoJ0PyeyBelBF2UzGSxOycy2";
                                                                ktA011 = ktA010.A0U(true);
                                                            }
                                                            break;
                                                    }
                                                    break;
                                            }
                                            break;
                                        case 10:
                                            strA01 = AbstractC2495k7.A01(attributeValue);
                                            attributeCount = strA01.hashCode();
                                            switch (attributeCount) {
                                                case -618561360:
                                                    if (strA01.equals(A0A(1251, 13, 60))) {
                                                        b4 = 2;
                                                    } else {
                                                        b4 = -1;
                                                    }
                                                    break;
                                                case -410956671:
                                                    if (strA01.equals(A0A(1310, 9, 123))) {
                                                        b4 = 0;
                                                    } else {
                                                        b4 = -1;
                                                    }
                                                    break;
                                                case -250518009:
                                                    if (!strA01.equals(A0A(1323, 9, 19))) {
                                                        b4 = -1;
                                                    }
                                                    break;
                                                case -136074796:
                                                    if (strA01.equals(A0A(1714, 13, 21))) {
                                                        b4 = 4;
                                                    } else {
                                                        b4 = -1;
                                                    }
                                                    break;
                                                case 3016401:
                                                    i3 = A02[0].length();
                                                    if (i3 != 7) {
                                                        String[] strArr1111116 = A02;
                                                        strArr1111116[4] = "LIbObqkBHnKY9czcuqJXmaycY";
                                                        strArr1111116[7] = "8yr68kE48uI7ct7K5MzK8s3n0";
                                                        if (strA01.equals(A0A(1247, 4, 121))) {
                                                            b4 = 1;
                                                        } else {
                                                            b4 = -1;
                                                        }
                                                    } else if (strA01.equals(A0A(1247, 4, 121))) {
                                                        b4 = 1;
                                                    } else {
                                                        b4 = -1;
                                                    }
                                                    break;
                                                case 3556653:
                                                    if (strA01.equals(A0A(1690, 4, 69))) {
                                                        b4 = 3;
                                                    } else {
                                                        b4 = -1;
                                                    }
                                                    break;
                                                default:
                                                    b4 = -1;
                                                    break;
                                            }
                                            switch (b4) {
                                                case 0:
                                                    ktA011 = A08(ktA011).A0K(1);
                                                    break;
                                                case 1:
                                                case 2:
                                                    ktA011 = A08(ktA011).A0K(2);
                                                    break;
                                                case 3:
                                                case 4:
                                                    ktA011 = A08(ktA011).A0K(3);
                                                    break;
                                                case 5:
                                                    ktA09 = A08(ktA011);
                                                    String[] strArr1111117 = A02;
                                                    String str1111116 = strArr1111117[6];
                                                    String str1111117 = strArr1111117[2];
                                                    i4 = str1111116.charAt(3);
                                                    attributeCount2 = str1111117.charAt(3);
                                                    if (i4 != attributeCount2) {
                                                        A02[0] = "J4PxtYpjCjcISuW5D9hp9p1SdEi";
                                                        ktA011 = ktA09.A0K(4);
                                                    } else {
                                                        String[] strArr1111118 = A02;
                                                        strArr1111118[4] = "5y5J9haLXfISwEnEFuDPzKTDZ";
                                                        strArr1111118[7] = "OL7OkctduLhf4RZoSVrAZg0CW";
                                                        ktA011 = ktA09.A0K(4);
                                                    }
                                                    break;
                                            }
                                            break;
                                        case 11:
                                            strA02 = AbstractC2495k7.A01(attributeValue);
                                            attributeCount3 = strA02.hashCode();
                                            switch (attributeCount3) {
                                                case -1392885889:
                                                    if (strA02.equals(A0A(1264, 6, 99))) {
                                                        b6 = 0;
                                                    }
                                                    break;
                                                case 92734940:
                                                    if (strA02.equals(A0A(1209, 5, 37))) {
                                                        b6 = 1;
                                                    }
                                                    break;
                                            }
                                            switch (b6) {
                                                case 0:
                                                    ktA011 = A08(ktA011).A0J(1);
                                                    break;
                                                case 1:
                                                    ktA011 = A08(ktA011).A0J(2);
                                                    break;
                                            }
                                            break;
                                        case 12:
                                            strA03 = AbstractC2495k7.A01(attributeValue);
                                            attributeCount4 = strA03.hashCode();
                                            switch (attributeCount4) {
                                                case -1461280213:
                                                    strA0A = A0A(1593, 11, 58);
                                                    String[] strArr1111119 = A02;
                                                    String str1111118 = strArr1111119[4];
                                                    String str1111119 = strArr1111119[7];
                                                    i5 = str1111118.length();
                                                    attributeCount5 = str1111119.length();
                                                    if (i5 != attributeCount5) {
                                                        String[] strArr1126 = A02;
                                                        strArr1126[1] = "bik63b6qq3sx6";
                                                        strArr1126[5] = "UnBPKnpUlJfync8N3sKzurGh";
                                                        if (!strA03.equals(strA0A)) {
                                                            b5 = -1;
                                                        }
                                                    } else if (!strA03.equals(strA0A)) {
                                                        b5 = -1;
                                                    }
                                                    switch (b5) {
                                                        case 0:
                                                            ktA011 = A08(ktA011).A0T(true);
                                                            break;
                                                        case 1:
                                                            ktA011 = A08(ktA011).A0T(false);
                                                            break;
                                                        case 2:
                                                            ktA011 = A08(ktA011).A0V(true);
                                                            break;
                                                        case 3:
                                                            ktA011 = A08(ktA011).A0V(false);
                                                            break;
                                                    }
                                                    break;
                                                case -1026963764:
                                                    if (strA03.equals(A0A(1763, 9, 73))) {
                                                        b5 = 2;
                                                    } else {
                                                        b5 = -1;
                                                    }
                                                    switch (b5) {
                                                        case 0:
                                                            ktA011 = A08(ktA011).A0T(true);
                                                            break;
                                                        case 1:
                                                            ktA011 = A08(ktA011).A0T(false);
                                                            break;
                                                        case 2:
                                                            ktA011 = A08(ktA011).A0V(true);
                                                            break;
                                                        case 3:
                                                            ktA011 = A08(ktA011).A0V(false);
                                                            break;
                                                    }
                                                    break;
                                                case 913457136:
                                                    String[] strArr1127 = A02;
                                                    String str1126 = strArr1127[1];
                                                    String str1127 = strArr1127[5];
                                                    i6 = str1126.length();
                                                    attributeCount6 = str1127.length();
                                                    if (i6 == attributeCount6) {
                                                        A02[3] = "e93UUhN2aqZLtboheHnNzqcVXHE9GMfx";
                                                        if (strA03.equals(A0A(1576, 13, 109))) {
                                                            b5 = 1;
                                                        } else {
                                                            b5 = -1;
                                                        }
                                                        switch (b5) {
                                                            case 0:
                                                                ktA011 = A08(ktA011).A0T(true);
                                                                break;
                                                            case 1:
                                                                ktA011 = A08(ktA011).A0T(false);
                                                                break;
                                                            case 2:
                                                                ktA011 = A08(ktA011).A0V(true);
                                                                break;
                                                            case 3:
                                                                ktA011 = A08(ktA011).A0V(false);
                                                                break;
                                                        }
                                                    } else {
                                                        throw new RuntimeException();
                                                    }
                                                    break;
                                                case 1679736913:
                                                    if (strA03.equals(A0A(1541, 11, 39))) {
                                                        b5 = 0;
                                                    } else {
                                                        b5 = -1;
                                                    }
                                                    switch (b5) {
                                                        case 0:
                                                            ktA011 = A08(ktA011).A0T(true);
                                                            break;
                                                        case 1:
                                                            ktA011 = A08(ktA011).A0T(false);
                                                            break;
                                                        case 2:
                                                            ktA011 = A08(ktA011).A0V(true);
                                                            break;
                                                        case 3:
                                                            ktA011 = A08(ktA011).A0V(false);
                                                            break;
                                                    }
                                                    break;
                                                default:
                                                    b5 = -1;
                                                    switch (b5) {
                                                        case 0:
                                                            ktA011 = A08(ktA011).A0T(true);
                                                            break;
                                                        case 1:
                                                            ktA011 = A08(ktA011).A0T(false);
                                                            break;
                                                        case 2:
                                                            ktA011 = A08(ktA011).A0V(true);
                                                            break;
                                                        case 3:
                                                            ktA011 = A08(ktA011).A0V(false);
                                                            break;
                                                    }
                                                    break;
                                            }
                                            break;
                                        case 13:
                                            ktA011 = A08(ktA011).A0N(KI.A01(attributeValue));
                                            break;
                                        case 14:
                                            ktA011 = A08(ktA011).A0F(A00(attributeValue));
                                            break;
                                    }
                                    break;
                                case 3511770:
                                    String[] strArr25 = A02;
                                    String str20 = strArr25[6];
                                    String str21 = strArr25[2];
                                    int i11 = str20.charAt(3);
                                    int attributeCount20 = str21.charAt(3);
                                    if (i11 == attributeCount20) {
                                        String[] strArr26 = A02;
                                        strArr26[6] = "r3WwEsdAzhczhwcQVK7AHARKaZJ6b8mu";
                                        strArr26[2] = "SqtwuV9PjyH6OGgQkhkCGcnknbgAyTvh";
                                        if (attributeName.equals(A0A(1624, 4, 117))) {
                                            b3 = 10;
                                        } else {
                                            b3 = -1;
                                        }
                                    } else if (attributeName.equals(A0A(1624, 4, 117))) {
                                        b3 = 10;
                                    } else {
                                        b3 = -1;
                                    }
                                    String strA0A10 = A0A(892, 11, 16);
                                    switch (b3) {
                                        case 0:
                                            if (A0A(1655, 5, 93).equals(xmlPullParser.getName())) {
                                                ktA011 = A08(ktA011).A0Q(attributeValue);
                                            }
                                            break;
                                        case 1:
                                            ktA011 = A08(ktA011);
                                            int attributeCount114 = AnonymousClass47.A01(attributeValue);
                                            ktA011.A0G(attributeCount114);
                                            break;
                                        case 2:
                                            ktA011 = A08(ktA011);
                                            int attributeCount115 = AnonymousClass47.A01(attributeValue);
                                            ktA011.A0H(attributeCount115);
                                            break;
                                        case 3:
                                            ktA011 = A08(ktA011).A0P(attributeValue);
                                            break;
                                        case 4:
                                            ktA011 = A08(ktA011);
                                            A0D(attributeValue, ktA011);
                                            break;
                                        case 5:
                                            ktA011 = A08(ktA011).A0R(A0A(1279, 4, 70).equalsIgnoreCase(attributeValue));
                                            break;
                                        case 6:
                                            ktA08 = A08(ktA011);
                                            zEqualsIgnoreCase = A0A(1525, 6, 38).equalsIgnoreCase(attributeValue);
                                            i2 = A02[0].length();
                                            if (i2 != 7) {
                                                String[] strArr128 = A02;
                                                strArr128[1] = "3LAgyyDE1fiF0";
                                                strArr128[5] = "1Nn0OmHZpjO5zuXdFxViYYhi";
                                                ktA011 = ktA08.A0S(zEqualsIgnoreCase);
                                            } else {
                                                A02[3] = "rHlCayaIaBq6HOiiZnZ7WLhH9IM1pHxI";
                                                ktA011 = ktA08.A0S(zEqualsIgnoreCase);
                                            }
                                            break;
                                        case 7:
                                            ktA011 = A08(ktA011).A0M(A02(attributeValue));
                                            break;
                                        case 8:
                                            ktA011 = A08(ktA011).A0L(A02(attributeValue));
                                            break;
                                        case 9:
                                            strA04 = AbstractC2495k7.A01(attributeValue);
                                            attributeCount7 = strA04.hashCode();
                                            switch (attributeCount7) {
                                                case 96673:
                                                    if (strA04.equals(A0A(1214, 3, 74))) {
                                                        b6 = 1;
                                                    }
                                                    switch (b6) {
                                                        case 0:
                                                            ktA011 = A08(ktA011).A0U(false);
                                                            break;
                                                        case 1:
                                                            ktA010 = A08(ktA011);
                                                            String[] strArr11111110 = A02;
                                                            String str11111110 = strArr11111110[6];
                                                            String str11111111 = strArr11111110[2];
                                                            i7 = str11111110.charAt(3);
                                                            attributeCount8 = str11111111.charAt(3);
                                                            if (i7 != attributeCount8) {
                                                                ktA011 = ktA010.A0U(true);
                                                            } else {
                                                                String[] strArr11111111 = A02;
                                                                strArr11111111[4] = "vXebmLnNF52WQsSE6i6dOepDl";
                                                                strArr11111111[7] = "VyoJ0PyeyBelBF2UzGSxOycy2";
                                                                ktA011 = ktA010.A0U(true);
                                                            }
                                                            break;
                                                    }
                                                    break;
                                                case 3387192:
                                                    strA0A2 = A0A(1589, 4, 93);
                                                    String[] strArr129 = A02;
                                                    String str128 = strArr129[4];
                                                    String str129 = strArr129[7];
                                                    i8 = str128.length();
                                                    attributeCount9 = str129.length();
                                                    if (i8 != attributeCount9) {
                                                        String[] strArr27 = A02;
                                                        strArr27[6] = "KuhwJ7ghsOXYSD0w45zfNovp0dFSdmRc";
                                                        strArr27[2] = "7BZwCfoQFB9cKVUBMfAbcYdCpdo30x6t";
                                                        if (strA04.equals(strA0A2)) {
                                                            b6 = 0;
                                                        }
                                                        switch (b6) {
                                                            case 0:
                                                                ktA011 = A08(ktA011).A0U(false);
                                                                break;
                                                            case 1:
                                                                ktA010 = A08(ktA011);
                                                                String[] strArr11111112 = A02;
                                                                String str11111112 = strArr11111112[6];
                                                                String str11111113 = strArr11111112[2];
                                                                i7 = str11111112.charAt(3);
                                                                attributeCount8 = str11111113.charAt(3);
                                                                if (i7 != attributeCount8) {
                                                                    ktA011 = ktA010.A0U(true);
                                                                } else {
                                                                    String[] strArr11111113 = A02;
                                                                    strArr11111113[4] = "vXebmLnNF52WQsSE6i6dOepDl";
                                                                    strArr11111113[7] = "VyoJ0PyeyBelBF2UzGSxOycy2";
                                                                    ktA011 = ktA010.A0U(true);
                                                                }
                                                                break;
                                                        }
                                                    } else {
                                                        throw new RuntimeException();
                                                    }
                                                    break;
                                                default:
                                                    switch (b6) {
                                                        case 0:
                                                            ktA011 = A08(ktA011).A0U(false);
                                                            break;
                                                        case 1:
                                                            ktA010 = A08(ktA011);
                                                            String[] strArr11111114 = A02;
                                                            String str11111114 = strArr11111114[6];
                                                            String str11111115 = strArr11111114[2];
                                                            i7 = str11111114.charAt(3);
                                                            attributeCount8 = str11111115.charAt(3);
                                                            if (i7 != attributeCount8) {
                                                                ktA011 = ktA010.A0U(true);
                                                            } else {
                                                                String[] strArr11111115 = A02;
                                                                strArr11111115[4] = "vXebmLnNF52WQsSE6i6dOepDl";
                                                                strArr11111115[7] = "VyoJ0PyeyBelBF2UzGSxOycy2";
                                                                ktA011 = ktA010.A0U(true);
                                                            }
                                                            break;
                                                    }
                                                    break;
                                            }
                                            break;
                                        case 10:
                                            strA01 = AbstractC2495k7.A01(attributeValue);
                                            attributeCount = strA01.hashCode();
                                            switch (attributeCount) {
                                                case -618561360:
                                                    if (strA01.equals(A0A(1251, 13, 60))) {
                                                        b4 = 2;
                                                    } else {
                                                        b4 = -1;
                                                    }
                                                    break;
                                                case -410956671:
                                                    if (strA01.equals(A0A(1310, 9, 123))) {
                                                        b4 = 0;
                                                    } else {
                                                        b4 = -1;
                                                    }
                                                    break;
                                                case -250518009:
                                                    if (!strA01.equals(A0A(1323, 9, 19))) {
                                                        b4 = -1;
                                                    }
                                                    break;
                                                case -136074796:
                                                    if (strA01.equals(A0A(1714, 13, 21))) {
                                                        b4 = 4;
                                                    } else {
                                                        b4 = -1;
                                                    }
                                                    break;
                                                case 3016401:
                                                    i3 = A02[0].length();
                                                    if (i3 != 7) {
                                                        String[] strArr11111116 = A02;
                                                        strArr11111116[4] = "LIbObqkBHnKY9czcuqJXmaycY";
                                                        strArr11111116[7] = "8yr68kE48uI7ct7K5MzK8s3n0";
                                                        if (strA01.equals(A0A(1247, 4, 121))) {
                                                            b4 = 1;
                                                        } else {
                                                            b4 = -1;
                                                        }
                                                    } else if (strA01.equals(A0A(1247, 4, 121))) {
                                                        b4 = 1;
                                                    } else {
                                                        b4 = -1;
                                                    }
                                                    break;
                                                case 3556653:
                                                    if (strA01.equals(A0A(1690, 4, 69))) {
                                                        b4 = 3;
                                                    } else {
                                                        b4 = -1;
                                                    }
                                                    break;
                                                default:
                                                    b4 = -1;
                                                    break;
                                            }
                                            switch (b4) {
                                                case 0:
                                                    ktA011 = A08(ktA011).A0K(1);
                                                    break;
                                                case 1:
                                                case 2:
                                                    ktA011 = A08(ktA011).A0K(2);
                                                    break;
                                                case 3:
                                                case 4:
                                                    ktA011 = A08(ktA011).A0K(3);
                                                    break;
                                                case 5:
                                                    ktA09 = A08(ktA011);
                                                    String[] strArr11111117 = A02;
                                                    String str11111116 = strArr11111117[6];
                                                    String str11111117 = strArr11111117[2];
                                                    i4 = str11111116.charAt(3);
                                                    attributeCount2 = str11111117.charAt(3);
                                                    if (i4 != attributeCount2) {
                                                        A02[0] = "J4PxtYpjCjcISuW5D9hp9p1SdEi";
                                                        ktA011 = ktA09.A0K(4);
                                                    } else {
                                                        String[] strArr11111118 = A02;
                                                        strArr11111118[4] = "5y5J9haLXfISwEnEFuDPzKTDZ";
                                                        strArr11111118[7] = "OL7OkctduLhf4RZoSVrAZg0CW";
                                                        ktA011 = ktA09.A0K(4);
                                                    }
                                                    break;
                                            }
                                            break;
                                        case 11:
                                            strA02 = AbstractC2495k7.A01(attributeValue);
                                            attributeCount3 = strA02.hashCode();
                                            switch (attributeCount3) {
                                                case -1392885889:
                                                    if (strA02.equals(A0A(1264, 6, 99))) {
                                                        b6 = 0;
                                                    }
                                                    break;
                                                case 92734940:
                                                    if (strA02.equals(A0A(1209, 5, 37))) {
                                                        b6 = 1;
                                                    }
                                                    break;
                                            }
                                            switch (b6) {
                                                case 0:
                                                    ktA011 = A08(ktA011).A0J(1);
                                                    break;
                                                case 1:
                                                    ktA011 = A08(ktA011).A0J(2);
                                                    break;
                                            }
                                            break;
                                        case 12:
                                            strA03 = AbstractC2495k7.A01(attributeValue);
                                            attributeCount4 = strA03.hashCode();
                                            switch (attributeCount4) {
                                                case -1461280213:
                                                    strA0A = A0A(1593, 11, 58);
                                                    String[] strArr11111119 = A02;
                                                    String str11111118 = strArr11111119[4];
                                                    String str11111119 = strArr11111119[7];
                                                    i5 = str11111118.length();
                                                    attributeCount5 = str11111119.length();
                                                    if (i5 != attributeCount5) {
                                                        String[] strArr1128 = A02;
                                                        strArr1128[1] = "bik63b6qq3sx6";
                                                        strArr1128[5] = "UnBPKnpUlJfync8N3sKzurGh";
                                                        if (!strA03.equals(strA0A)) {
                                                            b5 = -1;
                                                        }
                                                    } else if (!strA03.equals(strA0A)) {
                                                        b5 = -1;
                                                    }
                                                    switch (b5) {
                                                        case 0:
                                                            ktA011 = A08(ktA011).A0T(true);
                                                            break;
                                                        case 1:
                                                            ktA011 = A08(ktA011).A0T(false);
                                                            break;
                                                        case 2:
                                                            ktA011 = A08(ktA011).A0V(true);
                                                            break;
                                                        case 3:
                                                            ktA011 = A08(ktA011).A0V(false);
                                                            break;
                                                    }
                                                    break;
                                                case -1026963764:
                                                    if (strA03.equals(A0A(1763, 9, 73))) {
                                                        b5 = 2;
                                                    } else {
                                                        b5 = -1;
                                                    }
                                                    switch (b5) {
                                                        case 0:
                                                            ktA011 = A08(ktA011).A0T(true);
                                                            break;
                                                        case 1:
                                                            ktA011 = A08(ktA011).A0T(false);
                                                            break;
                                                        case 2:
                                                            ktA011 = A08(ktA011).A0V(true);
                                                            break;
                                                        case 3:
                                                            ktA011 = A08(ktA011).A0V(false);
                                                            break;
                                                    }
                                                    break;
                                                case 913457136:
                                                    String[] strArr1129 = A02;
                                                    String str1128 = strArr1129[1];
                                                    String str1129 = strArr1129[5];
                                                    i6 = str1128.length();
                                                    attributeCount6 = str1129.length();
                                                    if (i6 == attributeCount6) {
                                                        A02[3] = "e93UUhN2aqZLtboheHnNzqcVXHE9GMfx";
                                                        if (strA03.equals(A0A(1576, 13, 109))) {
                                                            b5 = 1;
                                                        } else {
                                                            b5 = -1;
                                                        }
                                                        switch (b5) {
                                                            case 0:
                                                                ktA011 = A08(ktA011).A0T(true);
                                                                break;
                                                            case 1:
                                                                ktA011 = A08(ktA011).A0T(false);
                                                                break;
                                                            case 2:
                                                                ktA011 = A08(ktA011).A0V(true);
                                                                break;
                                                            case 3:
                                                                ktA011 = A08(ktA011).A0V(false);
                                                                break;
                                                        }
                                                    } else {
                                                        throw new RuntimeException();
                                                    }
                                                    break;
                                                case 1679736913:
                                                    if (strA03.equals(A0A(1541, 11, 39))) {
                                                        b5 = 0;
                                                    } else {
                                                        b5 = -1;
                                                    }
                                                    switch (b5) {
                                                        case 0:
                                                            ktA011 = A08(ktA011).A0T(true);
                                                            break;
                                                        case 1:
                                                            ktA011 = A08(ktA011).A0T(false);
                                                            break;
                                                        case 2:
                                                            ktA011 = A08(ktA011).A0V(true);
                                                            break;
                                                        case 3:
                                                            ktA011 = A08(ktA011).A0V(false);
                                                            break;
                                                    }
                                                    break;
                                                default:
                                                    b5 = -1;
                                                    switch (b5) {
                                                        case 0:
                                                            ktA011 = A08(ktA011).A0T(true);
                                                            break;
                                                        case 1:
                                                            ktA011 = A08(ktA011).A0T(false);
                                                            break;
                                                        case 2:
                                                            ktA011 = A08(ktA011).A0V(true);
                                                            break;
                                                        case 3:
                                                            ktA011 = A08(ktA011).A0V(false);
                                                            break;
                                                    }
                                                    break;
                                            }
                                            break;
                                        case 13:
                                            ktA011 = A08(ktA011).A0N(KI.A01(attributeValue));
                                            break;
                                        case 14:
                                            ktA011 = A08(ktA011).A0F(A00(attributeValue));
                                            break;
                                    }
                                    break;
                                case 94842723:
                                    String strA0A11 = A0A(1305, 5, 89);
                                    String[] strArr28 = A02;
                                    String str22 = strArr28[4];
                                    String str23 = strArr28[7];
                                    int i12 = str22.length();
                                    int attributeCount21 = str23.length();
                                    if (i12 != attributeCount21) {
                                        throw new RuntimeException();
                                    }
                                    A02[0] = "jWhc4LCLE9nWhLcrRob1";
                                    if (attributeName.equals(strA0A11)) {
                                        b3 = 2;
                                    } else {
                                        b3 = -1;
                                    }
                                    String strA0A12 = A0A(892, 11, 16);
                                    switch (b3) {
                                        case 0:
                                            if (A0A(1655, 5, 93).equals(xmlPullParser.getName())) {
                                                ktA011 = A08(ktA011).A0Q(attributeValue);
                                            }
                                            break;
                                        case 1:
                                            ktA011 = A08(ktA011);
                                            int attributeCount116 = AnonymousClass47.A01(attributeValue);
                                            ktA011.A0G(attributeCount116);
                                            break;
                                        case 2:
                                            ktA011 = A08(ktA011);
                                            int attributeCount117 = AnonymousClass47.A01(attributeValue);
                                            ktA011.A0H(attributeCount117);
                                            break;
                                        case 3:
                                            ktA011 = A08(ktA011).A0P(attributeValue);
                                            break;
                                        case 4:
                                            ktA011 = A08(ktA011);
                                            A0D(attributeValue, ktA011);
                                            break;
                                        case 5:
                                            ktA011 = A08(ktA011).A0R(A0A(1279, 4, 70).equalsIgnoreCase(attributeValue));
                                            break;
                                        case 6:
                                            ktA08 = A08(ktA011);
                                            zEqualsIgnoreCase = A0A(1525, 6, 38).equalsIgnoreCase(attributeValue);
                                            i2 = A02[0].length();
                                            if (i2 != 7) {
                                                String[] strArr1210 = A02;
                                                strArr1210[1] = "3LAgyyDE1fiF0";
                                                strArr1210[5] = "1Nn0OmHZpjO5zuXdFxViYYhi";
                                                ktA011 = ktA08.A0S(zEqualsIgnoreCase);
                                            } else {
                                                A02[3] = "rHlCayaIaBq6HOiiZnZ7WLhH9IM1pHxI";
                                                ktA011 = ktA08.A0S(zEqualsIgnoreCase);
                                            }
                                            break;
                                        case 7:
                                            ktA011 = A08(ktA011).A0M(A02(attributeValue));
                                            break;
                                        case 8:
                                            ktA011 = A08(ktA011).A0L(A02(attributeValue));
                                            break;
                                        case 9:
                                            strA04 = AbstractC2495k7.A01(attributeValue);
                                            attributeCount7 = strA04.hashCode();
                                            switch (attributeCount7) {
                                                case 96673:
                                                    if (strA04.equals(A0A(1214, 3, 74))) {
                                                        b6 = 1;
                                                    }
                                                    switch (b6) {
                                                        case 0:
                                                            ktA011 = A08(ktA011).A0U(false);
                                                            break;
                                                        case 1:
                                                            ktA010 = A08(ktA011);
                                                            String[] strArr111111110 = A02;
                                                            String str111111110 = strArr111111110[6];
                                                            String str111111111 = strArr111111110[2];
                                                            i7 = str111111110.charAt(3);
                                                            attributeCount8 = str111111111.charAt(3);
                                                            if (i7 != attributeCount8) {
                                                                ktA011 = ktA010.A0U(true);
                                                            } else {
                                                                String[] strArr111111111 = A02;
                                                                strArr111111111[4] = "vXebmLnNF52WQsSE6i6dOepDl";
                                                                strArr111111111[7] = "VyoJ0PyeyBelBF2UzGSxOycy2";
                                                                ktA011 = ktA010.A0U(true);
                                                            }
                                                            break;
                                                    }
                                                    break;
                                                case 3387192:
                                                    strA0A2 = A0A(1589, 4, 93);
                                                    String[] strArr1211 = A02;
                                                    String str1210 = strArr1211[4];
                                                    String str1211 = strArr1211[7];
                                                    i8 = str1210.length();
                                                    attributeCount9 = str1211.length();
                                                    if (i8 != attributeCount9) {
                                                        String[] strArr29 = A02;
                                                        strArr29[6] = "KuhwJ7ghsOXYSD0w45zfNovp0dFSdmRc";
                                                        strArr29[2] = "7BZwCfoQFB9cKVUBMfAbcYdCpdo30x6t";
                                                        if (strA04.equals(strA0A2)) {
                                                            b6 = 0;
                                                        }
                                                        switch (b6) {
                                                            case 0:
                                                                ktA011 = A08(ktA011).A0U(false);
                                                                break;
                                                            case 1:
                                                                ktA010 = A08(ktA011);
                                                                String[] strArr111111112 = A02;
                                                                String str111111112 = strArr111111112[6];
                                                                String str111111113 = strArr111111112[2];
                                                                i7 = str111111112.charAt(3);
                                                                attributeCount8 = str111111113.charAt(3);
                                                                if (i7 != attributeCount8) {
                                                                    ktA011 = ktA010.A0U(true);
                                                                } else {
                                                                    String[] strArr111111113 = A02;
                                                                    strArr111111113[4] = "vXebmLnNF52WQsSE6i6dOepDl";
                                                                    strArr111111113[7] = "VyoJ0PyeyBelBF2UzGSxOycy2";
                                                                    ktA011 = ktA010.A0U(true);
                                                                }
                                                                break;
                                                        }
                                                    } else {
                                                        throw new RuntimeException();
                                                    }
                                                    break;
                                                default:
                                                    switch (b6) {
                                                        case 0:
                                                            ktA011 = A08(ktA011).A0U(false);
                                                            break;
                                                        case 1:
                                                            ktA010 = A08(ktA011);
                                                            String[] strArr111111114 = A02;
                                                            String str111111114 = strArr111111114[6];
                                                            String str111111115 = strArr111111114[2];
                                                            i7 = str111111114.charAt(3);
                                                            attributeCount8 = str111111115.charAt(3);
                                                            if (i7 != attributeCount8) {
                                                                ktA011 = ktA010.A0U(true);
                                                            } else {
                                                                String[] strArr111111115 = A02;
                                                                strArr111111115[4] = "vXebmLnNF52WQsSE6i6dOepDl";
                                                                strArr111111115[7] = "VyoJ0PyeyBelBF2UzGSxOycy2";
                                                                ktA011 = ktA010.A0U(true);
                                                            }
                                                            break;
                                                    }
                                                    break;
                                            }
                                            break;
                                        case 10:
                                            strA01 = AbstractC2495k7.A01(attributeValue);
                                            attributeCount = strA01.hashCode();
                                            switch (attributeCount) {
                                                case -618561360:
                                                    if (strA01.equals(A0A(1251, 13, 60))) {
                                                        b4 = 2;
                                                    } else {
                                                        b4 = -1;
                                                    }
                                                    break;
                                                case -410956671:
                                                    if (strA01.equals(A0A(1310, 9, 123))) {
                                                        b4 = 0;
                                                    } else {
                                                        b4 = -1;
                                                    }
                                                    break;
                                                case -250518009:
                                                    if (!strA01.equals(A0A(1323, 9, 19))) {
                                                        b4 = -1;
                                                    }
                                                    break;
                                                case -136074796:
                                                    if (strA01.equals(A0A(1714, 13, 21))) {
                                                        b4 = 4;
                                                    } else {
                                                        b4 = -1;
                                                    }
                                                    break;
                                                case 3016401:
                                                    i3 = A02[0].length();
                                                    if (i3 != 7) {
                                                        String[] strArr111111116 = A02;
                                                        strArr111111116[4] = "LIbObqkBHnKY9czcuqJXmaycY";
                                                        strArr111111116[7] = "8yr68kE48uI7ct7K5MzK8s3n0";
                                                        if (strA01.equals(A0A(1247, 4, 121))) {
                                                            b4 = 1;
                                                        } else {
                                                            b4 = -1;
                                                        }
                                                    } else if (strA01.equals(A0A(1247, 4, 121))) {
                                                        b4 = 1;
                                                    } else {
                                                        b4 = -1;
                                                    }
                                                    break;
                                                case 3556653:
                                                    if (strA01.equals(A0A(1690, 4, 69))) {
                                                        b4 = 3;
                                                    } else {
                                                        b4 = -1;
                                                    }
                                                    break;
                                                default:
                                                    b4 = -1;
                                                    break;
                                            }
                                            switch (b4) {
                                                case 0:
                                                    ktA011 = A08(ktA011).A0K(1);
                                                    break;
                                                case 1:
                                                case 2:
                                                    ktA011 = A08(ktA011).A0K(2);
                                                    break;
                                                case 3:
                                                case 4:
                                                    ktA011 = A08(ktA011).A0K(3);
                                                    break;
                                                case 5:
                                                    ktA09 = A08(ktA011);
                                                    String[] strArr111111117 = A02;
                                                    String str111111116 = strArr111111117[6];
                                                    String str111111117 = strArr111111117[2];
                                                    i4 = str111111116.charAt(3);
                                                    attributeCount2 = str111111117.charAt(3);
                                                    if (i4 != attributeCount2) {
                                                        A02[0] = "J4PxtYpjCjcISuW5D9hp9p1SdEi";
                                                        ktA011 = ktA09.A0K(4);
                                                    } else {
                                                        String[] strArr111111118 = A02;
                                                        strArr111111118[4] = "5y5J9haLXfISwEnEFuDPzKTDZ";
                                                        strArr111111118[7] = "OL7OkctduLhf4RZoSVrAZg0CW";
                                                        ktA011 = ktA09.A0K(4);
                                                    }
                                                    break;
                                            }
                                            break;
                                        case 11:
                                            strA02 = AbstractC2495k7.A01(attributeValue);
                                            attributeCount3 = strA02.hashCode();
                                            switch (attributeCount3) {
                                                case -1392885889:
                                                    if (strA02.equals(A0A(1264, 6, 99))) {
                                                        b6 = 0;
                                                    }
                                                    break;
                                                case 92734940:
                                                    if (strA02.equals(A0A(1209, 5, 37))) {
                                                        b6 = 1;
                                                    }
                                                    break;
                                            }
                                            switch (b6) {
                                                case 0:
                                                    ktA011 = A08(ktA011).A0J(1);
                                                    break;
                                                case 1:
                                                    ktA011 = A08(ktA011).A0J(2);
                                                    break;
                                            }
                                            break;
                                        case 12:
                                            strA03 = AbstractC2495k7.A01(attributeValue);
                                            attributeCount4 = strA03.hashCode();
                                            switch (attributeCount4) {
                                                case -1461280213:
                                                    strA0A = A0A(1593, 11, 58);
                                                    String[] strArr111111119 = A02;
                                                    String str111111118 = strArr111111119[4];
                                                    String str111111119 = strArr111111119[7];
                                                    i5 = str111111118.length();
                                                    attributeCount5 = str111111119.length();
                                                    if (i5 != attributeCount5) {
                                                        String[] strArr11210 = A02;
                                                        strArr11210[1] = "bik63b6qq3sx6";
                                                        strArr11210[5] = "UnBPKnpUlJfync8N3sKzurGh";
                                                        if (!strA03.equals(strA0A)) {
                                                            b5 = -1;
                                                        }
                                                    } else if (!strA03.equals(strA0A)) {
                                                        b5 = -1;
                                                    }
                                                    switch (b5) {
                                                        case 0:
                                                            ktA011 = A08(ktA011).A0T(true);
                                                            break;
                                                        case 1:
                                                            ktA011 = A08(ktA011).A0T(false);
                                                            break;
                                                        case 2:
                                                            ktA011 = A08(ktA011).A0V(true);
                                                            break;
                                                        case 3:
                                                            ktA011 = A08(ktA011).A0V(false);
                                                            break;
                                                    }
                                                    break;
                                                case -1026963764:
                                                    if (strA03.equals(A0A(1763, 9, 73))) {
                                                        b5 = 2;
                                                    } else {
                                                        b5 = -1;
                                                    }
                                                    switch (b5) {
                                                        case 0:
                                                            ktA011 = A08(ktA011).A0T(true);
                                                            break;
                                                        case 1:
                                                            ktA011 = A08(ktA011).A0T(false);
                                                            break;
                                                        case 2:
                                                            ktA011 = A08(ktA011).A0V(true);
                                                            break;
                                                        case 3:
                                                            ktA011 = A08(ktA011).A0V(false);
                                                            break;
                                                    }
                                                    break;
                                                case 913457136:
                                                    String[] strArr11211 = A02;
                                                    String str11210 = strArr11211[1];
                                                    String str11211 = strArr11211[5];
                                                    i6 = str11210.length();
                                                    attributeCount6 = str11211.length();
                                                    if (i6 == attributeCount6) {
                                                        A02[3] = "e93UUhN2aqZLtboheHnNzqcVXHE9GMfx";
                                                        if (strA03.equals(A0A(1576, 13, 109))) {
                                                            b5 = 1;
                                                        } else {
                                                            b5 = -1;
                                                        }
                                                        switch (b5) {
                                                            case 0:
                                                                ktA011 = A08(ktA011).A0T(true);
                                                                break;
                                                            case 1:
                                                                ktA011 = A08(ktA011).A0T(false);
                                                                break;
                                                            case 2:
                                                                ktA011 = A08(ktA011).A0V(true);
                                                                break;
                                                            case 3:
                                                                ktA011 = A08(ktA011).A0V(false);
                                                                break;
                                                        }
                                                    } else {
                                                        throw new RuntimeException();
                                                    }
                                                    break;
                                                case 1679736913:
                                                    if (strA03.equals(A0A(1541, 11, 39))) {
                                                        b5 = 0;
                                                    } else {
                                                        b5 = -1;
                                                    }
                                                    switch (b5) {
                                                        case 0:
                                                            ktA011 = A08(ktA011).A0T(true);
                                                            break;
                                                        case 1:
                                                            ktA011 = A08(ktA011).A0T(false);
                                                            break;
                                                        case 2:
                                                            ktA011 = A08(ktA011).A0V(true);
                                                            break;
                                                        case 3:
                                                            ktA011 = A08(ktA011).A0V(false);
                                                            break;
                                                    }
                                                    break;
                                                default:
                                                    b5 = -1;
                                                    switch (b5) {
                                                        case 0:
                                                            ktA011 = A08(ktA011).A0T(true);
                                                            break;
                                                        case 1:
                                                            ktA011 = A08(ktA011).A0T(false);
                                                            break;
                                                        case 2:
                                                            ktA011 = A08(ktA011).A0V(true);
                                                            break;
                                                        case 3:
                                                            ktA011 = A08(ktA011).A0V(false);
                                                            break;
                                                    }
                                                    break;
                                            }
                                            break;
                                        case 13:
                                            ktA011 = A08(ktA011).A0N(KI.A01(attributeValue));
                                            break;
                                        case 14:
                                            ktA011 = A08(ktA011).A0F(A00(attributeValue));
                                            break;
                                    }
                                    break;
                                    break;
                                case 109403361:
                                    String[] strArr30 = A02;
                                    String str24 = strArr30[4];
                                    String str25 = strArr30[7];
                                    int i13 = str24.length();
                                    int attributeCount22 = str25.length();
                                    if (i13 != attributeCount22) {
                                        throw new RuntimeException();
                                    }
                                    A02[3] = "GnfcohyZaQ6EawQBfHDTHpH0pVR69ODz";
                                    if (attributeName.equals(A0A(1641, 5, 65))) {
                                        b3 = 14;
                                    } else {
                                        b3 = -1;
                                    }
                                    String strA0A13 = A0A(892, 11, 16);
                                    switch (b3) {
                                        case 0:
                                            if (A0A(1655, 5, 93).equals(xmlPullParser.getName())) {
                                                ktA011 = A08(ktA011).A0Q(attributeValue);
                                            }
                                            break;
                                        case 1:
                                            ktA011 = A08(ktA011);
                                            int attributeCount118 = AnonymousClass47.A01(attributeValue);
                                            ktA011.A0G(attributeCount118);
                                            break;
                                        case 2:
                                            ktA011 = A08(ktA011);
                                            int attributeCount119 = AnonymousClass47.A01(attributeValue);
                                            ktA011.A0H(attributeCount119);
                                            break;
                                        case 3:
                                            ktA011 = A08(ktA011).A0P(attributeValue);
                                            break;
                                        case 4:
                                            ktA011 = A08(ktA011);
                                            A0D(attributeValue, ktA011);
                                            break;
                                        case 5:
                                            ktA011 = A08(ktA011).A0R(A0A(1279, 4, 70).equalsIgnoreCase(attributeValue));
                                            break;
                                        case 6:
                                            ktA08 = A08(ktA011);
                                            zEqualsIgnoreCase = A0A(1525, 6, 38).equalsIgnoreCase(attributeValue);
                                            i2 = A02[0].length();
                                            if (i2 != 7) {
                                                String[] strArr1212 = A02;
                                                strArr1212[1] = "3LAgyyDE1fiF0";
                                                strArr1212[5] = "1Nn0OmHZpjO5zuXdFxViYYhi";
                                                ktA011 = ktA08.A0S(zEqualsIgnoreCase);
                                            } else {
                                                A02[3] = "rHlCayaIaBq6HOiiZnZ7WLhH9IM1pHxI";
                                                ktA011 = ktA08.A0S(zEqualsIgnoreCase);
                                            }
                                            break;
                                        case 7:
                                            ktA011 = A08(ktA011).A0M(A02(attributeValue));
                                            break;
                                        case 8:
                                            ktA011 = A08(ktA011).A0L(A02(attributeValue));
                                            break;
                                        case 9:
                                            strA04 = AbstractC2495k7.A01(attributeValue);
                                            attributeCount7 = strA04.hashCode();
                                            switch (attributeCount7) {
                                                case 96673:
                                                    if (strA04.equals(A0A(1214, 3, 74))) {
                                                        b6 = 1;
                                                    }
                                                    switch (b6) {
                                                        case 0:
                                                            ktA011 = A08(ktA011).A0U(false);
                                                            break;
                                                        case 1:
                                                            ktA010 = A08(ktA011);
                                                            String[] strArr1111111110 = A02;
                                                            String str1111111110 = strArr1111111110[6];
                                                            String str1111111111 = strArr1111111110[2];
                                                            i7 = str1111111110.charAt(3);
                                                            attributeCount8 = str1111111111.charAt(3);
                                                            if (i7 != attributeCount8) {
                                                                ktA011 = ktA010.A0U(true);
                                                            } else {
                                                                String[] strArr1111111111 = A02;
                                                                strArr1111111111[4] = "vXebmLnNF52WQsSE6i6dOepDl";
                                                                strArr1111111111[7] = "VyoJ0PyeyBelBF2UzGSxOycy2";
                                                                ktA011 = ktA010.A0U(true);
                                                            }
                                                            break;
                                                    }
                                                    break;
                                                case 3387192:
                                                    strA0A2 = A0A(1589, 4, 93);
                                                    String[] strArr1213 = A02;
                                                    String str1212 = strArr1213[4];
                                                    String str1213 = strArr1213[7];
                                                    i8 = str1212.length();
                                                    attributeCount9 = str1213.length();
                                                    if (i8 != attributeCount9) {
                                                        String[] strArr210 = A02;
                                                        strArr210[6] = "KuhwJ7ghsOXYSD0w45zfNovp0dFSdmRc";
                                                        strArr210[2] = "7BZwCfoQFB9cKVUBMfAbcYdCpdo30x6t";
                                                        if (strA04.equals(strA0A2)) {
                                                            b6 = 0;
                                                        }
                                                        switch (b6) {
                                                            case 0:
                                                                ktA011 = A08(ktA011).A0U(false);
                                                                break;
                                                            case 1:
                                                                ktA010 = A08(ktA011);
                                                                String[] strArr1111111112 = A02;
                                                                String str1111111112 = strArr1111111112[6];
                                                                String str1111111113 = strArr1111111112[2];
                                                                i7 = str1111111112.charAt(3);
                                                                attributeCount8 = str1111111113.charAt(3);
                                                                if (i7 != attributeCount8) {
                                                                    ktA011 = ktA010.A0U(true);
                                                                } else {
                                                                    String[] strArr1111111113 = A02;
                                                                    strArr1111111113[4] = "vXebmLnNF52WQsSE6i6dOepDl";
                                                                    strArr1111111113[7] = "VyoJ0PyeyBelBF2UzGSxOycy2";
                                                                    ktA011 = ktA010.A0U(true);
                                                                }
                                                                break;
                                                        }
                                                    } else {
                                                        throw new RuntimeException();
                                                    }
                                                    break;
                                                default:
                                                    switch (b6) {
                                                        case 0:
                                                            ktA011 = A08(ktA011).A0U(false);
                                                            break;
                                                        case 1:
                                                            ktA010 = A08(ktA011);
                                                            String[] strArr1111111114 = A02;
                                                            String str1111111114 = strArr1111111114[6];
                                                            String str1111111115 = strArr1111111114[2];
                                                            i7 = str1111111114.charAt(3);
                                                            attributeCount8 = str1111111115.charAt(3);
                                                            if (i7 != attributeCount8) {
                                                                ktA011 = ktA010.A0U(true);
                                                            } else {
                                                                String[] strArr1111111115 = A02;
                                                                strArr1111111115[4] = "vXebmLnNF52WQsSE6i6dOepDl";
                                                                strArr1111111115[7] = "VyoJ0PyeyBelBF2UzGSxOycy2";
                                                                ktA011 = ktA010.A0U(true);
                                                            }
                                                            break;
                                                    }
                                                    break;
                                            }
                                            break;
                                        case 10:
                                            strA01 = AbstractC2495k7.A01(attributeValue);
                                            attributeCount = strA01.hashCode();
                                            switch (attributeCount) {
                                                case -618561360:
                                                    if (strA01.equals(A0A(1251, 13, 60))) {
                                                        b4 = 2;
                                                    } else {
                                                        b4 = -1;
                                                    }
                                                    break;
                                                case -410956671:
                                                    if (strA01.equals(A0A(1310, 9, 123))) {
                                                        b4 = 0;
                                                    } else {
                                                        b4 = -1;
                                                    }
                                                    break;
                                                case -250518009:
                                                    if (!strA01.equals(A0A(1323, 9, 19))) {
                                                        b4 = -1;
                                                    }
                                                    break;
                                                case -136074796:
                                                    if (strA01.equals(A0A(1714, 13, 21))) {
                                                        b4 = 4;
                                                    } else {
                                                        b4 = -1;
                                                    }
                                                    break;
                                                case 3016401:
                                                    i3 = A02[0].length();
                                                    if (i3 != 7) {
                                                        String[] strArr1111111116 = A02;
                                                        strArr1111111116[4] = "LIbObqkBHnKY9czcuqJXmaycY";
                                                        strArr1111111116[7] = "8yr68kE48uI7ct7K5MzK8s3n0";
                                                        if (strA01.equals(A0A(1247, 4, 121))) {
                                                            b4 = 1;
                                                        } else {
                                                            b4 = -1;
                                                        }
                                                    } else if (strA01.equals(A0A(1247, 4, 121))) {
                                                        b4 = 1;
                                                    } else {
                                                        b4 = -1;
                                                    }
                                                    break;
                                                case 3556653:
                                                    if (strA01.equals(A0A(1690, 4, 69))) {
                                                        b4 = 3;
                                                    } else {
                                                        b4 = -1;
                                                    }
                                                    break;
                                                default:
                                                    b4 = -1;
                                                    break;
                                            }
                                            switch (b4) {
                                                case 0:
                                                    ktA011 = A08(ktA011).A0K(1);
                                                    break;
                                                case 1:
                                                case 2:
                                                    ktA011 = A08(ktA011).A0K(2);
                                                    break;
                                                case 3:
                                                case 4:
                                                    ktA011 = A08(ktA011).A0K(3);
                                                    break;
                                                case 5:
                                                    ktA09 = A08(ktA011);
                                                    String[] strArr1111111117 = A02;
                                                    String str1111111116 = strArr1111111117[6];
                                                    String str1111111117 = strArr1111111117[2];
                                                    i4 = str1111111116.charAt(3);
                                                    attributeCount2 = str1111111117.charAt(3);
                                                    if (i4 != attributeCount2) {
                                                        A02[0] = "J4PxtYpjCjcISuW5D9hp9p1SdEi";
                                                        ktA011 = ktA09.A0K(4);
                                                    } else {
                                                        String[] strArr1111111118 = A02;
                                                        strArr1111111118[4] = "5y5J9haLXfISwEnEFuDPzKTDZ";
                                                        strArr1111111118[7] = "OL7OkctduLhf4RZoSVrAZg0CW";
                                                        ktA011 = ktA09.A0K(4);
                                                    }
                                                    break;
                                            }
                                            break;
                                        case 11:
                                            strA02 = AbstractC2495k7.A01(attributeValue);
                                            attributeCount3 = strA02.hashCode();
                                            switch (attributeCount3) {
                                                case -1392885889:
                                                    if (strA02.equals(A0A(1264, 6, 99))) {
                                                        b6 = 0;
                                                    }
                                                    break;
                                                case 92734940:
                                                    if (strA02.equals(A0A(1209, 5, 37))) {
                                                        b6 = 1;
                                                    }
                                                    break;
                                            }
                                            switch (b6) {
                                                case 0:
                                                    ktA011 = A08(ktA011).A0J(1);
                                                    break;
                                                case 1:
                                                    ktA011 = A08(ktA011).A0J(2);
                                                    break;
                                            }
                                            break;
                                        case 12:
                                            strA03 = AbstractC2495k7.A01(attributeValue);
                                            attributeCount4 = strA03.hashCode();
                                            switch (attributeCount4) {
                                                case -1461280213:
                                                    strA0A = A0A(1593, 11, 58);
                                                    String[] strArr1111111119 = A02;
                                                    String str1111111118 = strArr1111111119[4];
                                                    String str1111111119 = strArr1111111119[7];
                                                    i5 = str1111111118.length();
                                                    attributeCount5 = str1111111119.length();
                                                    if (i5 != attributeCount5) {
                                                        String[] strArr11212 = A02;
                                                        strArr11212[1] = "bik63b6qq3sx6";
                                                        strArr11212[5] = "UnBPKnpUlJfync8N3sKzurGh";
                                                        if (!strA03.equals(strA0A)) {
                                                            b5 = -1;
                                                        }
                                                    } else if (!strA03.equals(strA0A)) {
                                                        b5 = -1;
                                                    }
                                                    switch (b5) {
                                                        case 0:
                                                            ktA011 = A08(ktA011).A0T(true);
                                                            break;
                                                        case 1:
                                                            ktA011 = A08(ktA011).A0T(false);
                                                            break;
                                                        case 2:
                                                            ktA011 = A08(ktA011).A0V(true);
                                                            break;
                                                        case 3:
                                                            ktA011 = A08(ktA011).A0V(false);
                                                            break;
                                                    }
                                                    break;
                                                case -1026963764:
                                                    if (strA03.equals(A0A(1763, 9, 73))) {
                                                        b5 = 2;
                                                    } else {
                                                        b5 = -1;
                                                    }
                                                    switch (b5) {
                                                        case 0:
                                                            ktA011 = A08(ktA011).A0T(true);
                                                            break;
                                                        case 1:
                                                            ktA011 = A08(ktA011).A0T(false);
                                                            break;
                                                        case 2:
                                                            ktA011 = A08(ktA011).A0V(true);
                                                            break;
                                                        case 3:
                                                            ktA011 = A08(ktA011).A0V(false);
                                                            break;
                                                    }
                                                    break;
                                                case 913457136:
                                                    String[] strArr11213 = A02;
                                                    String str11212 = strArr11213[1];
                                                    String str11213 = strArr11213[5];
                                                    i6 = str11212.length();
                                                    attributeCount6 = str11213.length();
                                                    if (i6 == attributeCount6) {
                                                        A02[3] = "e93UUhN2aqZLtboheHnNzqcVXHE9GMfx";
                                                        if (strA03.equals(A0A(1576, 13, 109))) {
                                                            b5 = 1;
                                                        } else {
                                                            b5 = -1;
                                                        }
                                                        switch (b5) {
                                                            case 0:
                                                                ktA011 = A08(ktA011).A0T(true);
                                                                break;
                                                            case 1:
                                                                ktA011 = A08(ktA011).A0T(false);
                                                                break;
                                                            case 2:
                                                                ktA011 = A08(ktA011).A0V(true);
                                                                break;
                                                            case 3:
                                                                ktA011 = A08(ktA011).A0V(false);
                                                                break;
                                                        }
                                                    } else {
                                                        throw new RuntimeException();
                                                    }
                                                    break;
                                                case 1679736913:
                                                    if (strA03.equals(A0A(1541, 11, 39))) {
                                                        b5 = 0;
                                                    } else {
                                                        b5 = -1;
                                                    }
                                                    switch (b5) {
                                                        case 0:
                                                            ktA011 = A08(ktA011).A0T(true);
                                                            break;
                                                        case 1:
                                                            ktA011 = A08(ktA011).A0T(false);
                                                            break;
                                                        case 2:
                                                            ktA011 = A08(ktA011).A0V(true);
                                                            break;
                                                        case 3:
                                                            ktA011 = A08(ktA011).A0V(false);
                                                            break;
                                                    }
                                                    break;
                                                default:
                                                    b5 = -1;
                                                    switch (b5) {
                                                        case 0:
                                                            ktA011 = A08(ktA011).A0T(true);
                                                            break;
                                                        case 1:
                                                            ktA011 = A08(ktA011).A0T(false);
                                                            break;
                                                        case 2:
                                                            ktA011 = A08(ktA011).A0V(true);
                                                            break;
                                                        case 3:
                                                            ktA011 = A08(ktA011).A0V(false);
                                                            break;
                                                    }
                                                    break;
                                            }
                                            break;
                                        case 13:
                                            ktA011 = A08(ktA011).A0N(KI.A01(attributeValue));
                                            break;
                                        case 14:
                                            ktA011 = A08(ktA011).A0F(A00(attributeValue));
                                            break;
                                    }
                                    break;
                                    break;
                                case 110138194:
                                    if (attributeName.equals(A0A(1703, 11, 87))) {
                                        b3 = 9;
                                    } else {
                                        b3 = -1;
                                    }
                                    String strA0A14 = A0A(892, 11, 16);
                                    switch (b3) {
                                        case 0:
                                            if (A0A(1655, 5, 93).equals(xmlPullParser.getName())) {
                                                ktA011 = A08(ktA011).A0Q(attributeValue);
                                            }
                                            break;
                                        case 1:
                                            ktA011 = A08(ktA011);
                                            int attributeCount1110 = AnonymousClass47.A01(attributeValue);
                                            ktA011.A0G(attributeCount1110);
                                            break;
                                        case 2:
                                            ktA011 = A08(ktA011);
                                            int attributeCount1111 = AnonymousClass47.A01(attributeValue);
                                            ktA011.A0H(attributeCount1111);
                                            break;
                                        case 3:
                                            ktA011 = A08(ktA011).A0P(attributeValue);
                                            break;
                                        case 4:
                                            ktA011 = A08(ktA011);
                                            A0D(attributeValue, ktA011);
                                            break;
                                        case 5:
                                            ktA011 = A08(ktA011).A0R(A0A(1279, 4, 70).equalsIgnoreCase(attributeValue));
                                            break;
                                        case 6:
                                            ktA08 = A08(ktA011);
                                            zEqualsIgnoreCase = A0A(1525, 6, 38).equalsIgnoreCase(attributeValue);
                                            i2 = A02[0].length();
                                            if (i2 != 7) {
                                                String[] strArr1214 = A02;
                                                strArr1214[1] = "3LAgyyDE1fiF0";
                                                strArr1214[5] = "1Nn0OmHZpjO5zuXdFxViYYhi";
                                                ktA011 = ktA08.A0S(zEqualsIgnoreCase);
                                            } else {
                                                A02[3] = "rHlCayaIaBq6HOiiZnZ7WLhH9IM1pHxI";
                                                ktA011 = ktA08.A0S(zEqualsIgnoreCase);
                                            }
                                            break;
                                        case 7:
                                            ktA011 = A08(ktA011).A0M(A02(attributeValue));
                                            break;
                                        case 8:
                                            ktA011 = A08(ktA011).A0L(A02(attributeValue));
                                            break;
                                        case 9:
                                            strA04 = AbstractC2495k7.A01(attributeValue);
                                            attributeCount7 = strA04.hashCode();
                                            switch (attributeCount7) {
                                                case 96673:
                                                    if (strA04.equals(A0A(1214, 3, 74))) {
                                                        b6 = 1;
                                                    }
                                                    switch (b6) {
                                                        case 0:
                                                            ktA011 = A08(ktA011).A0U(false);
                                                            break;
                                                        case 1:
                                                            ktA010 = A08(ktA011);
                                                            String[] strArr11111111110 = A02;
                                                            String str11111111110 = strArr11111111110[6];
                                                            String str11111111111 = strArr11111111110[2];
                                                            i7 = str11111111110.charAt(3);
                                                            attributeCount8 = str11111111111.charAt(3);
                                                            if (i7 != attributeCount8) {
                                                                ktA011 = ktA010.A0U(true);
                                                            } else {
                                                                String[] strArr11111111111 = A02;
                                                                strArr11111111111[4] = "vXebmLnNF52WQsSE6i6dOepDl";
                                                                strArr11111111111[7] = "VyoJ0PyeyBelBF2UzGSxOycy2";
                                                                ktA011 = ktA010.A0U(true);
                                                            }
                                                            break;
                                                    }
                                                    break;
                                                case 3387192:
                                                    strA0A2 = A0A(1589, 4, 93);
                                                    String[] strArr1215 = A02;
                                                    String str1214 = strArr1215[4];
                                                    String str1215 = strArr1215[7];
                                                    i8 = str1214.length();
                                                    attributeCount9 = str1215.length();
                                                    if (i8 != attributeCount9) {
                                                        String[] strArr211 = A02;
                                                        strArr211[6] = "KuhwJ7ghsOXYSD0w45zfNovp0dFSdmRc";
                                                        strArr211[2] = "7BZwCfoQFB9cKVUBMfAbcYdCpdo30x6t";
                                                        if (strA04.equals(strA0A2)) {
                                                            b6 = 0;
                                                        }
                                                        switch (b6) {
                                                            case 0:
                                                                ktA011 = A08(ktA011).A0U(false);
                                                                break;
                                                            case 1:
                                                                ktA010 = A08(ktA011);
                                                                String[] strArr11111111112 = A02;
                                                                String str11111111112 = strArr11111111112[6];
                                                                String str11111111113 = strArr11111111112[2];
                                                                i7 = str11111111112.charAt(3);
                                                                attributeCount8 = str11111111113.charAt(3);
                                                                if (i7 != attributeCount8) {
                                                                    ktA011 = ktA010.A0U(true);
                                                                } else {
                                                                    String[] strArr11111111113 = A02;
                                                                    strArr11111111113[4] = "vXebmLnNF52WQsSE6i6dOepDl";
                                                                    strArr11111111113[7] = "VyoJ0PyeyBelBF2UzGSxOycy2";
                                                                    ktA011 = ktA010.A0U(true);
                                                                }
                                                                break;
                                                        }
                                                    } else {
                                                        throw new RuntimeException();
                                                    }
                                                    break;
                                                default:
                                                    switch (b6) {
                                                        case 0:
                                                            ktA011 = A08(ktA011).A0U(false);
                                                            break;
                                                        case 1:
                                                            ktA010 = A08(ktA011);
                                                            String[] strArr11111111114 = A02;
                                                            String str11111111114 = strArr11111111114[6];
                                                            String str11111111115 = strArr11111111114[2];
                                                            i7 = str11111111114.charAt(3);
                                                            attributeCount8 = str11111111115.charAt(3);
                                                            if (i7 != attributeCount8) {
                                                                ktA011 = ktA010.A0U(true);
                                                            } else {
                                                                String[] strArr11111111115 = A02;
                                                                strArr11111111115[4] = "vXebmLnNF52WQsSE6i6dOepDl";
                                                                strArr11111111115[7] = "VyoJ0PyeyBelBF2UzGSxOycy2";
                                                                ktA011 = ktA010.A0U(true);
                                                            }
                                                            break;
                                                    }
                                                    break;
                                            }
                                            break;
                                        case 10:
                                            strA01 = AbstractC2495k7.A01(attributeValue);
                                            attributeCount = strA01.hashCode();
                                            switch (attributeCount) {
                                                case -618561360:
                                                    if (strA01.equals(A0A(1251, 13, 60))) {
                                                        b4 = 2;
                                                    } else {
                                                        b4 = -1;
                                                    }
                                                    break;
                                                case -410956671:
                                                    if (strA01.equals(A0A(1310, 9, 123))) {
                                                        b4 = 0;
                                                    } else {
                                                        b4 = -1;
                                                    }
                                                    break;
                                                case -250518009:
                                                    if (!strA01.equals(A0A(1323, 9, 19))) {
                                                        b4 = -1;
                                                    }
                                                    break;
                                                case -136074796:
                                                    if (strA01.equals(A0A(1714, 13, 21))) {
                                                        b4 = 4;
                                                    } else {
                                                        b4 = -1;
                                                    }
                                                    break;
                                                case 3016401:
                                                    i3 = A02[0].length();
                                                    if (i3 != 7) {
                                                        String[] strArr11111111116 = A02;
                                                        strArr11111111116[4] = "LIbObqkBHnKY9czcuqJXmaycY";
                                                        strArr11111111116[7] = "8yr68kE48uI7ct7K5MzK8s3n0";
                                                        if (strA01.equals(A0A(1247, 4, 121))) {
                                                            b4 = 1;
                                                        } else {
                                                            b4 = -1;
                                                        }
                                                    } else if (strA01.equals(A0A(1247, 4, 121))) {
                                                        b4 = 1;
                                                    } else {
                                                        b4 = -1;
                                                    }
                                                    break;
                                                case 3556653:
                                                    if (strA01.equals(A0A(1690, 4, 69))) {
                                                        b4 = 3;
                                                    } else {
                                                        b4 = -1;
                                                    }
                                                    break;
                                                default:
                                                    b4 = -1;
                                                    break;
                                            }
                                            switch (b4) {
                                                case 0:
                                                    ktA011 = A08(ktA011).A0K(1);
                                                    break;
                                                case 1:
                                                case 2:
                                                    ktA011 = A08(ktA011).A0K(2);
                                                    break;
                                                case 3:
                                                case 4:
                                                    ktA011 = A08(ktA011).A0K(3);
                                                    break;
                                                case 5:
                                                    ktA09 = A08(ktA011);
                                                    String[] strArr11111111117 = A02;
                                                    String str11111111116 = strArr11111111117[6];
                                                    String str11111111117 = strArr11111111117[2];
                                                    i4 = str11111111116.charAt(3);
                                                    attributeCount2 = str11111111117.charAt(3);
                                                    if (i4 != attributeCount2) {
                                                        A02[0] = "J4PxtYpjCjcISuW5D9hp9p1SdEi";
                                                        ktA011 = ktA09.A0K(4);
                                                    } else {
                                                        String[] strArr11111111118 = A02;
                                                        strArr11111111118[4] = "5y5J9haLXfISwEnEFuDPzKTDZ";
                                                        strArr11111111118[7] = "OL7OkctduLhf4RZoSVrAZg0CW";
                                                        ktA011 = ktA09.A0K(4);
                                                    }
                                                    break;
                                            }
                                            break;
                                        case 11:
                                            strA02 = AbstractC2495k7.A01(attributeValue);
                                            attributeCount3 = strA02.hashCode();
                                            switch (attributeCount3) {
                                                case -1392885889:
                                                    if (strA02.equals(A0A(1264, 6, 99))) {
                                                        b6 = 0;
                                                    }
                                                    break;
                                                case 92734940:
                                                    if (strA02.equals(A0A(1209, 5, 37))) {
                                                        b6 = 1;
                                                    }
                                                    break;
                                            }
                                            switch (b6) {
                                                case 0:
                                                    ktA011 = A08(ktA011).A0J(1);
                                                    break;
                                                case 1:
                                                    ktA011 = A08(ktA011).A0J(2);
                                                    break;
                                            }
                                            break;
                                        case 12:
                                            strA03 = AbstractC2495k7.A01(attributeValue);
                                            attributeCount4 = strA03.hashCode();
                                            switch (attributeCount4) {
                                                case -1461280213:
                                                    strA0A = A0A(1593, 11, 58);
                                                    String[] strArr11111111119 = A02;
                                                    String str11111111118 = strArr11111111119[4];
                                                    String str11111111119 = strArr11111111119[7];
                                                    i5 = str11111111118.length();
                                                    attributeCount5 = str11111111119.length();
                                                    if (i5 != attributeCount5) {
                                                        String[] strArr11214 = A02;
                                                        strArr11214[1] = "bik63b6qq3sx6";
                                                        strArr11214[5] = "UnBPKnpUlJfync8N3sKzurGh";
                                                        if (!strA03.equals(strA0A)) {
                                                            b5 = -1;
                                                        }
                                                    } else if (!strA03.equals(strA0A)) {
                                                        b5 = -1;
                                                    }
                                                    switch (b5) {
                                                        case 0:
                                                            ktA011 = A08(ktA011).A0T(true);
                                                            break;
                                                        case 1:
                                                            ktA011 = A08(ktA011).A0T(false);
                                                            break;
                                                        case 2:
                                                            ktA011 = A08(ktA011).A0V(true);
                                                            break;
                                                        case 3:
                                                            ktA011 = A08(ktA011).A0V(false);
                                                            break;
                                                    }
                                                    break;
                                                case -1026963764:
                                                    if (strA03.equals(A0A(1763, 9, 73))) {
                                                        b5 = 2;
                                                    } else {
                                                        b5 = -1;
                                                    }
                                                    switch (b5) {
                                                        case 0:
                                                            ktA011 = A08(ktA011).A0T(true);
                                                            break;
                                                        case 1:
                                                            ktA011 = A08(ktA011).A0T(false);
                                                            break;
                                                        case 2:
                                                            ktA011 = A08(ktA011).A0V(true);
                                                            break;
                                                        case 3:
                                                            ktA011 = A08(ktA011).A0V(false);
                                                            break;
                                                    }
                                                    break;
                                                case 913457136:
                                                    String[] strArr11215 = A02;
                                                    String str11214 = strArr11215[1];
                                                    String str11215 = strArr11215[5];
                                                    i6 = str11214.length();
                                                    attributeCount6 = str11215.length();
                                                    if (i6 == attributeCount6) {
                                                        A02[3] = "e93UUhN2aqZLtboheHnNzqcVXHE9GMfx";
                                                        if (strA03.equals(A0A(1576, 13, 109))) {
                                                            b5 = 1;
                                                        } else {
                                                            b5 = -1;
                                                        }
                                                        switch (b5) {
                                                            case 0:
                                                                ktA011 = A08(ktA011).A0T(true);
                                                                break;
                                                            case 1:
                                                                ktA011 = A08(ktA011).A0T(false);
                                                                break;
                                                            case 2:
                                                                ktA011 = A08(ktA011).A0V(true);
                                                                break;
                                                            case 3:
                                                                ktA011 = A08(ktA011).A0V(false);
                                                                break;
                                                        }
                                                    } else {
                                                        throw new RuntimeException();
                                                    }
                                                    break;
                                                case 1679736913:
                                                    if (strA03.equals(A0A(1541, 11, 39))) {
                                                        b5 = 0;
                                                    } else {
                                                        b5 = -1;
                                                    }
                                                    switch (b5) {
                                                        case 0:
                                                            ktA011 = A08(ktA011).A0T(true);
                                                            break;
                                                        case 1:
                                                            ktA011 = A08(ktA011).A0T(false);
                                                            break;
                                                        case 2:
                                                            ktA011 = A08(ktA011).A0V(true);
                                                            break;
                                                        case 3:
                                                            ktA011 = A08(ktA011).A0V(false);
                                                            break;
                                                    }
                                                    break;
                                                default:
                                                    b5 = -1;
                                                    switch (b5) {
                                                        case 0:
                                                            ktA011 = A08(ktA011).A0T(true);
                                                            break;
                                                        case 1:
                                                            ktA011 = A08(ktA011).A0T(false);
                                                            break;
                                                        case 2:
                                                            ktA011 = A08(ktA011).A0V(true);
                                                            break;
                                                        case 3:
                                                            ktA011 = A08(ktA011).A0V(false);
                                                            break;
                                                    }
                                                    break;
                                            }
                                            break;
                                        case 13:
                                            ktA011 = A08(ktA011).A0N(KI.A01(attributeValue));
                                            break;
                                        case 14:
                                            ktA011 = A08(ktA011).A0F(A00(attributeValue));
                                            break;
                                    }
                                    break;
                                case 365601008:
                                    if (attributeName.equals(A0A(1372, 8, 13))) {
                                        b3 = 4;
                                    } else {
                                        b3 = -1;
                                    }
                                    String strA0A15 = A0A(892, 11, 16);
                                    switch (b3) {
                                        case 0:
                                            if (A0A(1655, 5, 93).equals(xmlPullParser.getName())) {
                                                ktA011 = A08(ktA011).A0Q(attributeValue);
                                            }
                                            break;
                                        case 1:
                                            ktA011 = A08(ktA011);
                                            int attributeCount1112 = AnonymousClass47.A01(attributeValue);
                                            ktA011.A0G(attributeCount1112);
                                            break;
                                        case 2:
                                            ktA011 = A08(ktA011);
                                            int attributeCount1113 = AnonymousClass47.A01(attributeValue);
                                            ktA011.A0H(attributeCount1113);
                                            break;
                                        case 3:
                                            ktA011 = A08(ktA011).A0P(attributeValue);
                                            break;
                                        case 4:
                                            ktA011 = A08(ktA011);
                                            A0D(attributeValue, ktA011);
                                            break;
                                        case 5:
                                            ktA011 = A08(ktA011).A0R(A0A(1279, 4, 70).equalsIgnoreCase(attributeValue));
                                            break;
                                        case 6:
                                            ktA08 = A08(ktA011);
                                            zEqualsIgnoreCase = A0A(1525, 6, 38).equalsIgnoreCase(attributeValue);
                                            i2 = A02[0].length();
                                            if (i2 != 7) {
                                                String[] strArr1216 = A02;
                                                strArr1216[1] = "3LAgyyDE1fiF0";
                                                strArr1216[5] = "1Nn0OmHZpjO5zuXdFxViYYhi";
                                                ktA011 = ktA08.A0S(zEqualsIgnoreCase);
                                            } else {
                                                A02[3] = "rHlCayaIaBq6HOiiZnZ7WLhH9IM1pHxI";
                                                ktA011 = ktA08.A0S(zEqualsIgnoreCase);
                                            }
                                            break;
                                        case 7:
                                            ktA011 = A08(ktA011).A0M(A02(attributeValue));
                                            break;
                                        case 8:
                                            ktA011 = A08(ktA011).A0L(A02(attributeValue));
                                            break;
                                        case 9:
                                            strA04 = AbstractC2495k7.A01(attributeValue);
                                            attributeCount7 = strA04.hashCode();
                                            switch (attributeCount7) {
                                                case 96673:
                                                    if (strA04.equals(A0A(1214, 3, 74))) {
                                                        b6 = 1;
                                                    }
                                                    switch (b6) {
                                                        case 0:
                                                            ktA011 = A08(ktA011).A0U(false);
                                                            break;
                                                        case 1:
                                                            ktA010 = A08(ktA011);
                                                            String[] strArr111111111110 = A02;
                                                            String str111111111110 = strArr111111111110[6];
                                                            String str111111111111 = strArr111111111110[2];
                                                            i7 = str111111111110.charAt(3);
                                                            attributeCount8 = str111111111111.charAt(3);
                                                            if (i7 != attributeCount8) {
                                                                ktA011 = ktA010.A0U(true);
                                                            } else {
                                                                String[] strArr111111111111 = A02;
                                                                strArr111111111111[4] = "vXebmLnNF52WQsSE6i6dOepDl";
                                                                strArr111111111111[7] = "VyoJ0PyeyBelBF2UzGSxOycy2";
                                                                ktA011 = ktA010.A0U(true);
                                                            }
                                                            break;
                                                    }
                                                    break;
                                                case 3387192:
                                                    strA0A2 = A0A(1589, 4, 93);
                                                    String[] strArr1217 = A02;
                                                    String str1216 = strArr1217[4];
                                                    String str1217 = strArr1217[7];
                                                    i8 = str1216.length();
                                                    attributeCount9 = str1217.length();
                                                    if (i8 != attributeCount9) {
                                                        String[] strArr212 = A02;
                                                        strArr212[6] = "KuhwJ7ghsOXYSD0w45zfNovp0dFSdmRc";
                                                        strArr212[2] = "7BZwCfoQFB9cKVUBMfAbcYdCpdo30x6t";
                                                        if (strA04.equals(strA0A2)) {
                                                            b6 = 0;
                                                        }
                                                        switch (b6) {
                                                            case 0:
                                                                ktA011 = A08(ktA011).A0U(false);
                                                                break;
                                                            case 1:
                                                                ktA010 = A08(ktA011);
                                                                String[] strArr111111111112 = A02;
                                                                String str111111111112 = strArr111111111112[6];
                                                                String str111111111113 = strArr111111111112[2];
                                                                i7 = str111111111112.charAt(3);
                                                                attributeCount8 = str111111111113.charAt(3);
                                                                if (i7 != attributeCount8) {
                                                                    ktA011 = ktA010.A0U(true);
                                                                } else {
                                                                    String[] strArr111111111113 = A02;
                                                                    strArr111111111113[4] = "vXebmLnNF52WQsSE6i6dOepDl";
                                                                    strArr111111111113[7] = "VyoJ0PyeyBelBF2UzGSxOycy2";
                                                                    ktA011 = ktA010.A0U(true);
                                                                }
                                                                break;
                                                        }
                                                    } else {
                                                        throw new RuntimeException();
                                                    }
                                                    break;
                                                default:
                                                    switch (b6) {
                                                        case 0:
                                                            ktA011 = A08(ktA011).A0U(false);
                                                            break;
                                                        case 1:
                                                            ktA010 = A08(ktA011);
                                                            String[] strArr111111111114 = A02;
                                                            String str111111111114 = strArr111111111114[6];
                                                            String str111111111115 = strArr111111111114[2];
                                                            i7 = str111111111114.charAt(3);
                                                            attributeCount8 = str111111111115.charAt(3);
                                                            if (i7 != attributeCount8) {
                                                                ktA011 = ktA010.A0U(true);
                                                            } else {
                                                                String[] strArr111111111115 = A02;
                                                                strArr111111111115[4] = "vXebmLnNF52WQsSE6i6dOepDl";
                                                                strArr111111111115[7] = "VyoJ0PyeyBelBF2UzGSxOycy2";
                                                                ktA011 = ktA010.A0U(true);
                                                            }
                                                            break;
                                                    }
                                                    break;
                                            }
                                            break;
                                        case 10:
                                            strA01 = AbstractC2495k7.A01(attributeValue);
                                            attributeCount = strA01.hashCode();
                                            switch (attributeCount) {
                                                case -618561360:
                                                    if (strA01.equals(A0A(1251, 13, 60))) {
                                                        b4 = 2;
                                                    } else {
                                                        b4 = -1;
                                                    }
                                                    break;
                                                case -410956671:
                                                    if (strA01.equals(A0A(1310, 9, 123))) {
                                                        b4 = 0;
                                                    } else {
                                                        b4 = -1;
                                                    }
                                                    break;
                                                case -250518009:
                                                    if (!strA01.equals(A0A(1323, 9, 19))) {
                                                        b4 = -1;
                                                    }
                                                    break;
                                                case -136074796:
                                                    if (strA01.equals(A0A(1714, 13, 21))) {
                                                        b4 = 4;
                                                    } else {
                                                        b4 = -1;
                                                    }
                                                    break;
                                                case 3016401:
                                                    i3 = A02[0].length();
                                                    if (i3 != 7) {
                                                        String[] strArr111111111116 = A02;
                                                        strArr111111111116[4] = "LIbObqkBHnKY9czcuqJXmaycY";
                                                        strArr111111111116[7] = "8yr68kE48uI7ct7K5MzK8s3n0";
                                                        if (strA01.equals(A0A(1247, 4, 121))) {
                                                            b4 = 1;
                                                        } else {
                                                            b4 = -1;
                                                        }
                                                    } else if (strA01.equals(A0A(1247, 4, 121))) {
                                                        b4 = 1;
                                                    } else {
                                                        b4 = -1;
                                                    }
                                                    break;
                                                case 3556653:
                                                    if (strA01.equals(A0A(1690, 4, 69))) {
                                                        b4 = 3;
                                                    } else {
                                                        b4 = -1;
                                                    }
                                                    break;
                                                default:
                                                    b4 = -1;
                                                    break;
                                            }
                                            switch (b4) {
                                                case 0:
                                                    ktA011 = A08(ktA011).A0K(1);
                                                    break;
                                                case 1:
                                                case 2:
                                                    ktA011 = A08(ktA011).A0K(2);
                                                    break;
                                                case 3:
                                                case 4:
                                                    ktA011 = A08(ktA011).A0K(3);
                                                    break;
                                                case 5:
                                                    ktA09 = A08(ktA011);
                                                    String[] strArr111111111117 = A02;
                                                    String str111111111116 = strArr111111111117[6];
                                                    String str111111111117 = strArr111111111117[2];
                                                    i4 = str111111111116.charAt(3);
                                                    attributeCount2 = str111111111117.charAt(3);
                                                    if (i4 != attributeCount2) {
                                                        A02[0] = "J4PxtYpjCjcISuW5D9hp9p1SdEi";
                                                        ktA011 = ktA09.A0K(4);
                                                    } else {
                                                        String[] strArr111111111118 = A02;
                                                        strArr111111111118[4] = "5y5J9haLXfISwEnEFuDPzKTDZ";
                                                        strArr111111111118[7] = "OL7OkctduLhf4RZoSVrAZg0CW";
                                                        ktA011 = ktA09.A0K(4);
                                                    }
                                                    break;
                                            }
                                            break;
                                        case 11:
                                            strA02 = AbstractC2495k7.A01(attributeValue);
                                            attributeCount3 = strA02.hashCode();
                                            switch (attributeCount3) {
                                                case -1392885889:
                                                    if (strA02.equals(A0A(1264, 6, 99))) {
                                                        b6 = 0;
                                                    }
                                                    break;
                                                case 92734940:
                                                    if (strA02.equals(A0A(1209, 5, 37))) {
                                                        b6 = 1;
                                                    }
                                                    break;
                                            }
                                            switch (b6) {
                                                case 0:
                                                    ktA011 = A08(ktA011).A0J(1);
                                                    break;
                                                case 1:
                                                    ktA011 = A08(ktA011).A0J(2);
                                                    break;
                                            }
                                            break;
                                        case 12:
                                            strA03 = AbstractC2495k7.A01(attributeValue);
                                            attributeCount4 = strA03.hashCode();
                                            switch (attributeCount4) {
                                                case -1461280213:
                                                    strA0A = A0A(1593, 11, 58);
                                                    String[] strArr111111111119 = A02;
                                                    String str111111111118 = strArr111111111119[4];
                                                    String str111111111119 = strArr111111111119[7];
                                                    i5 = str111111111118.length();
                                                    attributeCount5 = str111111111119.length();
                                                    if (i5 != attributeCount5) {
                                                        String[] strArr11216 = A02;
                                                        strArr11216[1] = "bik63b6qq3sx6";
                                                        strArr11216[5] = "UnBPKnpUlJfync8N3sKzurGh";
                                                        if (!strA03.equals(strA0A)) {
                                                            b5 = -1;
                                                        }
                                                    } else if (!strA03.equals(strA0A)) {
                                                        b5 = -1;
                                                    }
                                                    switch (b5) {
                                                        case 0:
                                                            ktA011 = A08(ktA011).A0T(true);
                                                            break;
                                                        case 1:
                                                            ktA011 = A08(ktA011).A0T(false);
                                                            break;
                                                        case 2:
                                                            ktA011 = A08(ktA011).A0V(true);
                                                            break;
                                                        case 3:
                                                            ktA011 = A08(ktA011).A0V(false);
                                                            break;
                                                    }
                                                    break;
                                                case -1026963764:
                                                    if (strA03.equals(A0A(1763, 9, 73))) {
                                                        b5 = 2;
                                                    } else {
                                                        b5 = -1;
                                                    }
                                                    switch (b5) {
                                                        case 0:
                                                            ktA011 = A08(ktA011).A0T(true);
                                                            break;
                                                        case 1:
                                                            ktA011 = A08(ktA011).A0T(false);
                                                            break;
                                                        case 2:
                                                            ktA011 = A08(ktA011).A0V(true);
                                                            break;
                                                        case 3:
                                                            ktA011 = A08(ktA011).A0V(false);
                                                            break;
                                                    }
                                                    break;
                                                case 913457136:
                                                    String[] strArr11217 = A02;
                                                    String str11216 = strArr11217[1];
                                                    String str11217 = strArr11217[5];
                                                    i6 = str11216.length();
                                                    attributeCount6 = str11217.length();
                                                    if (i6 == attributeCount6) {
                                                        A02[3] = "e93UUhN2aqZLtboheHnNzqcVXHE9GMfx";
                                                        if (strA03.equals(A0A(1576, 13, 109))) {
                                                            b5 = 1;
                                                        } else {
                                                            b5 = -1;
                                                        }
                                                        switch (b5) {
                                                            case 0:
                                                                ktA011 = A08(ktA011).A0T(true);
                                                                break;
                                                            case 1:
                                                                ktA011 = A08(ktA011).A0T(false);
                                                                break;
                                                            case 2:
                                                                ktA011 = A08(ktA011).A0V(true);
                                                                break;
                                                            case 3:
                                                                ktA011 = A08(ktA011).A0V(false);
                                                                break;
                                                        }
                                                    } else {
                                                        throw new RuntimeException();
                                                    }
                                                    break;
                                                case 1679736913:
                                                    if (strA03.equals(A0A(1541, 11, 39))) {
                                                        b5 = 0;
                                                    } else {
                                                        b5 = -1;
                                                    }
                                                    switch (b5) {
                                                        case 0:
                                                            ktA011 = A08(ktA011).A0T(true);
                                                            break;
                                                        case 1:
                                                            ktA011 = A08(ktA011).A0T(false);
                                                            break;
                                                        case 2:
                                                            ktA011 = A08(ktA011).A0V(true);
                                                            break;
                                                        case 3:
                                                            ktA011 = A08(ktA011).A0V(false);
                                                            break;
                                                    }
                                                    break;
                                                default:
                                                    b5 = -1;
                                                    switch (b5) {
                                                        case 0:
                                                            ktA011 = A08(ktA011).A0T(true);
                                                            break;
                                                        case 1:
                                                            ktA011 = A08(ktA011).A0T(false);
                                                            break;
                                                        case 2:
                                                            ktA011 = A08(ktA011).A0V(true);
                                                            break;
                                                        case 3:
                                                            ktA011 = A08(ktA011).A0V(false);
                                                            break;
                                                    }
                                                    break;
                                            }
                                            break;
                                        case 13:
                                            ktA011 = A08(ktA011).A0N(KI.A01(attributeValue));
                                            break;
                                        case 14:
                                            ktA011 = A08(ktA011).A0F(A00(attributeValue));
                                            break;
                                    }
                                    break;
                                case 921125321:
                                    String strA0A16 = A0A(1741, 12, 49);
                                    int i14 = A02[3].charAt(8);
                                    if (i14 == 97) {
                                        String[] strArr31 = A02;
                                        strArr31[4] = "pLae2I6vaNRYXal5VxPfkycfu";
                                        strArr31[7] = "8woMJWwEfTDb0STXPvcxVArhw";
                                        if (attributeName.equals(strA0A16)) {
                                            b3 = 13;
                                        } else {
                                            b3 = -1;
                                        }
                                        String strA0A17 = A0A(892, 11, 16);
                                        switch (b3) {
                                            case 0:
                                                if (A0A(1655, 5, 93).equals(xmlPullParser.getName())) {
                                                    ktA011 = A08(ktA011).A0Q(attributeValue);
                                                }
                                                break;
                                            case 1:
                                                ktA011 = A08(ktA011);
                                                int attributeCount1114 = AnonymousClass47.A01(attributeValue);
                                                ktA011.A0G(attributeCount1114);
                                                break;
                                            case 2:
                                                ktA011 = A08(ktA011);
                                                int attributeCount1115 = AnonymousClass47.A01(attributeValue);
                                                ktA011.A0H(attributeCount1115);
                                                break;
                                            case 3:
                                                ktA011 = A08(ktA011).A0P(attributeValue);
                                                break;
                                            case 4:
                                                ktA011 = A08(ktA011);
                                                A0D(attributeValue, ktA011);
                                                break;
                                            case 5:
                                                ktA011 = A08(ktA011).A0R(A0A(1279, 4, 70).equalsIgnoreCase(attributeValue));
                                                break;
                                            case 6:
                                                ktA08 = A08(ktA011);
                                                zEqualsIgnoreCase = A0A(1525, 6, 38).equalsIgnoreCase(attributeValue);
                                                i2 = A02[0].length();
                                                if (i2 != 7) {
                                                    String[] strArr1218 = A02;
                                                    strArr1218[1] = "3LAgyyDE1fiF0";
                                                    strArr1218[5] = "1Nn0OmHZpjO5zuXdFxViYYhi";
                                                    ktA011 = ktA08.A0S(zEqualsIgnoreCase);
                                                } else {
                                                    A02[3] = "rHlCayaIaBq6HOiiZnZ7WLhH9IM1pHxI";
                                                    ktA011 = ktA08.A0S(zEqualsIgnoreCase);
                                                }
                                                break;
                                            case 7:
                                                ktA011 = A08(ktA011).A0M(A02(attributeValue));
                                                break;
                                            case 8:
                                                ktA011 = A08(ktA011).A0L(A02(attributeValue));
                                                break;
                                            case 9:
                                                strA04 = AbstractC2495k7.A01(attributeValue);
                                                attributeCount7 = strA04.hashCode();
                                                switch (attributeCount7) {
                                                    case 96673:
                                                        if (strA04.equals(A0A(1214, 3, 74))) {
                                                            b6 = 1;
                                                        }
                                                        switch (b6) {
                                                            case 0:
                                                                ktA011 = A08(ktA011).A0U(false);
                                                                break;
                                                            case 1:
                                                                ktA010 = A08(ktA011);
                                                                String[] strArr1111111111110 = A02;
                                                                String str1111111111110 = strArr1111111111110[6];
                                                                String str1111111111111 = strArr1111111111110[2];
                                                                i7 = str1111111111110.charAt(3);
                                                                attributeCount8 = str1111111111111.charAt(3);
                                                                if (i7 != attributeCount8) {
                                                                    ktA011 = ktA010.A0U(true);
                                                                } else {
                                                                    String[] strArr1111111111111 = A02;
                                                                    strArr1111111111111[4] = "vXebmLnNF52WQsSE6i6dOepDl";
                                                                    strArr1111111111111[7] = "VyoJ0PyeyBelBF2UzGSxOycy2";
                                                                    ktA011 = ktA010.A0U(true);
                                                                }
                                                                break;
                                                        }
                                                        break;
                                                    case 3387192:
                                                        strA0A2 = A0A(1589, 4, 93);
                                                        String[] strArr1219 = A02;
                                                        String str1218 = strArr1219[4];
                                                        String str1219 = strArr1219[7];
                                                        i8 = str1218.length();
                                                        attributeCount9 = str1219.length();
                                                        if (i8 != attributeCount9) {
                                                            String[] strArr213 = A02;
                                                            strArr213[6] = "KuhwJ7ghsOXYSD0w45zfNovp0dFSdmRc";
                                                            strArr213[2] = "7BZwCfoQFB9cKVUBMfAbcYdCpdo30x6t";
                                                            if (strA04.equals(strA0A2)) {
                                                                b6 = 0;
                                                            }
                                                            switch (b6) {
                                                                case 0:
                                                                    ktA011 = A08(ktA011).A0U(false);
                                                                    break;
                                                                case 1:
                                                                    ktA010 = A08(ktA011);
                                                                    String[] strArr1111111111112 = A02;
                                                                    String str1111111111112 = strArr1111111111112[6];
                                                                    String str1111111111113 = strArr1111111111112[2];
                                                                    i7 = str1111111111112.charAt(3);
                                                                    attributeCount8 = str1111111111113.charAt(3);
                                                                    if (i7 != attributeCount8) {
                                                                        ktA011 = ktA010.A0U(true);
                                                                    } else {
                                                                        String[] strArr1111111111113 = A02;
                                                                        strArr1111111111113[4] = "vXebmLnNF52WQsSE6i6dOepDl";
                                                                        strArr1111111111113[7] = "VyoJ0PyeyBelBF2UzGSxOycy2";
                                                                        ktA011 = ktA010.A0U(true);
                                                                    }
                                                                    break;
                                                            }
                                                        } else {
                                                            break;
                                                        }
                                                        break;
                                                    default:
                                                        switch (b6) {
                                                            case 0:
                                                                ktA011 = A08(ktA011).A0U(false);
                                                                break;
                                                            case 1:
                                                                ktA010 = A08(ktA011);
                                                                String[] strArr1111111111114 = A02;
                                                                String str1111111111114 = strArr1111111111114[6];
                                                                String str1111111111115 = strArr1111111111114[2];
                                                                i7 = str1111111111114.charAt(3);
                                                                attributeCount8 = str1111111111115.charAt(3);
                                                                if (i7 != attributeCount8) {
                                                                    ktA011 = ktA010.A0U(true);
                                                                } else {
                                                                    String[] strArr1111111111115 = A02;
                                                                    strArr1111111111115[4] = "vXebmLnNF52WQsSE6i6dOepDl";
                                                                    strArr1111111111115[7] = "VyoJ0PyeyBelBF2UzGSxOycy2";
                                                                    ktA011 = ktA010.A0U(true);
                                                                }
                                                                break;
                                                        }
                                                        break;
                                                }
                                                break;
                                            case 10:
                                                strA01 = AbstractC2495k7.A01(attributeValue);
                                                attributeCount = strA01.hashCode();
                                                switch (attributeCount) {
                                                    case -618561360:
                                                        if (strA01.equals(A0A(1251, 13, 60))) {
                                                            b4 = 2;
                                                        } else {
                                                            b4 = -1;
                                                        }
                                                        break;
                                                    case -410956671:
                                                        if (strA01.equals(A0A(1310, 9, 123))) {
                                                            b4 = 0;
                                                        } else {
                                                            b4 = -1;
                                                        }
                                                        break;
                                                    case -250518009:
                                                        if (!strA01.equals(A0A(1323, 9, 19))) {
                                                            b4 = -1;
                                                        }
                                                        break;
                                                    case -136074796:
                                                        if (strA01.equals(A0A(1714, 13, 21))) {
                                                            b4 = 4;
                                                        } else {
                                                            b4 = -1;
                                                        }
                                                        break;
                                                    case 3016401:
                                                        i3 = A02[0].length();
                                                        if (i3 != 7) {
                                                            String[] strArr1111111111116 = A02;
                                                            strArr1111111111116[4] = "LIbObqkBHnKY9czcuqJXmaycY";
                                                            strArr1111111111116[7] = "8yr68kE48uI7ct7K5MzK8s3n0";
                                                            if (strA01.equals(A0A(1247, 4, 121))) {
                                                                b4 = 1;
                                                            } else {
                                                                b4 = -1;
                                                            }
                                                        } else if (strA01.equals(A0A(1247, 4, 121))) {
                                                            b4 = 1;
                                                        } else {
                                                            b4 = -1;
                                                        }
                                                        break;
                                                    case 3556653:
                                                        if (strA01.equals(A0A(1690, 4, 69))) {
                                                            b4 = 3;
                                                        } else {
                                                            b4 = -1;
                                                        }
                                                        break;
                                                    default:
                                                        b4 = -1;
                                                        break;
                                                }
                                                switch (b4) {
                                                    case 0:
                                                        ktA011 = A08(ktA011).A0K(1);
                                                        break;
                                                    case 1:
                                                    case 2:
                                                        ktA011 = A08(ktA011).A0K(2);
                                                        break;
                                                    case 3:
                                                    case 4:
                                                        ktA011 = A08(ktA011).A0K(3);
                                                        break;
                                                    case 5:
                                                        ktA09 = A08(ktA011);
                                                        String[] strArr1111111111117 = A02;
                                                        String str1111111111116 = strArr1111111111117[6];
                                                        String str1111111111117 = strArr1111111111117[2];
                                                        i4 = str1111111111116.charAt(3);
                                                        attributeCount2 = str1111111111117.charAt(3);
                                                        if (i4 != attributeCount2) {
                                                            A02[0] = "J4PxtYpjCjcISuW5D9hp9p1SdEi";
                                                            ktA011 = ktA09.A0K(4);
                                                        } else {
                                                            String[] strArr1111111111118 = A02;
                                                            strArr1111111111118[4] = "5y5J9haLXfISwEnEFuDPzKTDZ";
                                                            strArr1111111111118[7] = "OL7OkctduLhf4RZoSVrAZg0CW";
                                                            ktA011 = ktA09.A0K(4);
                                                        }
                                                        break;
                                                }
                                                break;
                                            case 11:
                                                strA02 = AbstractC2495k7.A01(attributeValue);
                                                attributeCount3 = strA02.hashCode();
                                                switch (attributeCount3) {
                                                    case -1392885889:
                                                        if (strA02.equals(A0A(1264, 6, 99))) {
                                                            b6 = 0;
                                                        }
                                                        break;
                                                    case 92734940:
                                                        if (strA02.equals(A0A(1209, 5, 37))) {
                                                            b6 = 1;
                                                        }
                                                        break;
                                                }
                                                switch (b6) {
                                                    case 0:
                                                        ktA011 = A08(ktA011).A0J(1);
                                                        break;
                                                    case 1:
                                                        ktA011 = A08(ktA011).A0J(2);
                                                        break;
                                                }
                                                break;
                                            case 12:
                                                strA03 = AbstractC2495k7.A01(attributeValue);
                                                attributeCount4 = strA03.hashCode();
                                                switch (attributeCount4) {
                                                    case -1461280213:
                                                        strA0A = A0A(1593, 11, 58);
                                                        String[] strArr1111111111119 = A02;
                                                        String str1111111111118 = strArr1111111111119[4];
                                                        String str1111111111119 = strArr1111111111119[7];
                                                        i5 = str1111111111118.length();
                                                        attributeCount5 = str1111111111119.length();
                                                        if (i5 != attributeCount5) {
                                                            String[] strArr11218 = A02;
                                                            strArr11218[1] = "bik63b6qq3sx6";
                                                            strArr11218[5] = "UnBPKnpUlJfync8N3sKzurGh";
                                                            if (!strA03.equals(strA0A)) {
                                                                b5 = -1;
                                                            }
                                                        } else if (!strA03.equals(strA0A)) {
                                                            b5 = -1;
                                                        }
                                                        switch (b5) {
                                                            case 0:
                                                                ktA011 = A08(ktA011).A0T(true);
                                                                break;
                                                            case 1:
                                                                ktA011 = A08(ktA011).A0T(false);
                                                                break;
                                                            case 2:
                                                                ktA011 = A08(ktA011).A0V(true);
                                                                break;
                                                            case 3:
                                                                ktA011 = A08(ktA011).A0V(false);
                                                                break;
                                                        }
                                                        break;
                                                    case -1026963764:
                                                        if (strA03.equals(A0A(1763, 9, 73))) {
                                                            b5 = 2;
                                                        } else {
                                                            b5 = -1;
                                                        }
                                                        switch (b5) {
                                                            case 0:
                                                                ktA011 = A08(ktA011).A0T(true);
                                                                break;
                                                            case 1:
                                                                ktA011 = A08(ktA011).A0T(false);
                                                                break;
                                                            case 2:
                                                                ktA011 = A08(ktA011).A0V(true);
                                                                break;
                                                            case 3:
                                                                ktA011 = A08(ktA011).A0V(false);
                                                                break;
                                                        }
                                                        break;
                                                    case 913457136:
                                                        String[] strArr11219 = A02;
                                                        String str11218 = strArr11219[1];
                                                        String str11219 = strArr11219[5];
                                                        i6 = str11218.length();
                                                        attributeCount6 = str11219.length();
                                                        if (i6 == attributeCount6) {
                                                            break;
                                                        } else {
                                                            A02[3] = "e93UUhN2aqZLtboheHnNzqcVXHE9GMfx";
                                                            if (strA03.equals(A0A(1576, 13, 109))) {
                                                                b5 = 1;
                                                            } else {
                                                                b5 = -1;
                                                            }
                                                            switch (b5) {
                                                                case 0:
                                                                    ktA011 = A08(ktA011).A0T(true);
                                                                    break;
                                                                case 1:
                                                                    ktA011 = A08(ktA011).A0T(false);
                                                                    break;
                                                                case 2:
                                                                    ktA011 = A08(ktA011).A0V(true);
                                                                    break;
                                                                case 3:
                                                                    ktA011 = A08(ktA011).A0V(false);
                                                                    break;
                                                            }
                                                        }
                                                        break;
                                                    case 1679736913:
                                                        if (strA03.equals(A0A(1541, 11, 39))) {
                                                            b5 = 0;
                                                        } else {
                                                            b5 = -1;
                                                        }
                                                        switch (b5) {
                                                            case 0:
                                                                ktA011 = A08(ktA011).A0T(true);
                                                                break;
                                                            case 1:
                                                                ktA011 = A08(ktA011).A0T(false);
                                                                break;
                                                            case 2:
                                                                ktA011 = A08(ktA011).A0V(true);
                                                                break;
                                                            case 3:
                                                                ktA011 = A08(ktA011).A0V(false);
                                                                break;
                                                        }
                                                        break;
                                                    default:
                                                        b5 = -1;
                                                        switch (b5) {
                                                            case 0:
                                                                ktA011 = A08(ktA011).A0T(true);
                                                                break;
                                                            case 1:
                                                                ktA011 = A08(ktA011).A0T(false);
                                                                break;
                                                            case 2:
                                                                ktA011 = A08(ktA011).A0V(true);
                                                                break;
                                                            case 3:
                                                                ktA011 = A08(ktA011).A0V(false);
                                                                break;
                                                        }
                                                        break;
                                                }
                                                break;
                                            case 13:
                                                ktA011 = A08(ktA011).A0N(KI.A01(attributeValue));
                                                break;
                                            case 14:
                                                ktA011 = A08(ktA011).A0F(A00(attributeValue));
                                                break;
                                        }
                                        break;
                                    }
                                    throw new RuntimeException();
                                case 1115953443:
                                    if (attributeName.equals(A0A(1628, 12, 104))) {
                                        b3 = 11;
                                    } else {
                                        b3 = -1;
                                    }
                                    String strA0A18 = A0A(892, 11, 16);
                                    switch (b3) {
                                        case 0:
                                            if (A0A(1655, 5, 93).equals(xmlPullParser.getName())) {
                                                ktA011 = A08(ktA011).A0Q(attributeValue);
                                            }
                                            break;
                                        case 1:
                                            ktA011 = A08(ktA011);
                                            int attributeCount1116 = AnonymousClass47.A01(attributeValue);
                                            ktA011.A0G(attributeCount1116);
                                            break;
                                        case 2:
                                            ktA011 = A08(ktA011);
                                            int attributeCount1117 = AnonymousClass47.A01(attributeValue);
                                            ktA011.A0H(attributeCount1117);
                                            break;
                                        case 3:
                                            ktA011 = A08(ktA011).A0P(attributeValue);
                                            break;
                                        case 4:
                                            ktA011 = A08(ktA011);
                                            A0D(attributeValue, ktA011);
                                            break;
                                        case 5:
                                            ktA011 = A08(ktA011).A0R(A0A(1279, 4, 70).equalsIgnoreCase(attributeValue));
                                            break;
                                        case 6:
                                            ktA08 = A08(ktA011);
                                            zEqualsIgnoreCase = A0A(1525, 6, 38).equalsIgnoreCase(attributeValue);
                                            i2 = A02[0].length();
                                            if (i2 != 7) {
                                                String[] strArr12110 = A02;
                                                strArr12110[1] = "3LAgyyDE1fiF0";
                                                strArr12110[5] = "1Nn0OmHZpjO5zuXdFxViYYhi";
                                                ktA011 = ktA08.A0S(zEqualsIgnoreCase);
                                            } else {
                                                A02[3] = "rHlCayaIaBq6HOiiZnZ7WLhH9IM1pHxI";
                                                ktA011 = ktA08.A0S(zEqualsIgnoreCase);
                                            }
                                            break;
                                        case 7:
                                            ktA011 = A08(ktA011).A0M(A02(attributeValue));
                                            break;
                                        case 8:
                                            ktA011 = A08(ktA011).A0L(A02(attributeValue));
                                            break;
                                        case 9:
                                            strA04 = AbstractC2495k7.A01(attributeValue);
                                            attributeCount7 = strA04.hashCode();
                                            switch (attributeCount7) {
                                                case 96673:
                                                    if (strA04.equals(A0A(1214, 3, 74))) {
                                                        b6 = 1;
                                                    }
                                                    switch (b6) {
                                                        case 0:
                                                            ktA011 = A08(ktA011).A0U(false);
                                                            break;
                                                        case 1:
                                                            ktA010 = A08(ktA011);
                                                            String[] strArr11111111111110 = A02;
                                                            String str11111111111110 = strArr11111111111110[6];
                                                            String str11111111111111 = strArr11111111111110[2];
                                                            i7 = str11111111111110.charAt(3);
                                                            attributeCount8 = str11111111111111.charAt(3);
                                                            if (i7 != attributeCount8) {
                                                                ktA011 = ktA010.A0U(true);
                                                            } else {
                                                                String[] strArr11111111111111 = A02;
                                                                strArr11111111111111[4] = "vXebmLnNF52WQsSE6i6dOepDl";
                                                                strArr11111111111111[7] = "VyoJ0PyeyBelBF2UzGSxOycy2";
                                                                ktA011 = ktA010.A0U(true);
                                                            }
                                                            break;
                                                    }
                                                    break;
                                                case 3387192:
                                                    strA0A2 = A0A(1589, 4, 93);
                                                    String[] strArr12111 = A02;
                                                    String str12110 = strArr12111[4];
                                                    String str12111 = strArr12111[7];
                                                    i8 = str12110.length();
                                                    attributeCount9 = str12111.length();
                                                    if (i8 != attributeCount9) {
                                                        String[] strArr214 = A02;
                                                        strArr214[6] = "KuhwJ7ghsOXYSD0w45zfNovp0dFSdmRc";
                                                        strArr214[2] = "7BZwCfoQFB9cKVUBMfAbcYdCpdo30x6t";
                                                        if (strA04.equals(strA0A2)) {
                                                            b6 = 0;
                                                        }
                                                        switch (b6) {
                                                            case 0:
                                                                ktA011 = A08(ktA011).A0U(false);
                                                                break;
                                                            case 1:
                                                                ktA010 = A08(ktA011);
                                                                String[] strArr11111111111112 = A02;
                                                                String str11111111111112 = strArr11111111111112[6];
                                                                String str11111111111113 = strArr11111111111112[2];
                                                                i7 = str11111111111112.charAt(3);
                                                                attributeCount8 = str11111111111113.charAt(3);
                                                                if (i7 != attributeCount8) {
                                                                    ktA011 = ktA010.A0U(true);
                                                                } else {
                                                                    String[] strArr11111111111113 = A02;
                                                                    strArr11111111111113[4] = "vXebmLnNF52WQsSE6i6dOepDl";
                                                                    strArr11111111111113[7] = "VyoJ0PyeyBelBF2UzGSxOycy2";
                                                                    ktA011 = ktA010.A0U(true);
                                                                }
                                                                break;
                                                        }
                                                    } else {
                                                        throw new RuntimeException();
                                                    }
                                                    break;
                                                default:
                                                    switch (b6) {
                                                        case 0:
                                                            ktA011 = A08(ktA011).A0U(false);
                                                            break;
                                                        case 1:
                                                            ktA010 = A08(ktA011);
                                                            String[] strArr11111111111114 = A02;
                                                            String str11111111111114 = strArr11111111111114[6];
                                                            String str11111111111115 = strArr11111111111114[2];
                                                            i7 = str11111111111114.charAt(3);
                                                            attributeCount8 = str11111111111115.charAt(3);
                                                            if (i7 != attributeCount8) {
                                                                ktA011 = ktA010.A0U(true);
                                                            } else {
                                                                String[] strArr11111111111115 = A02;
                                                                strArr11111111111115[4] = "vXebmLnNF52WQsSE6i6dOepDl";
                                                                strArr11111111111115[7] = "VyoJ0PyeyBelBF2UzGSxOycy2";
                                                                ktA011 = ktA010.A0U(true);
                                                            }
                                                            break;
                                                    }
                                                    break;
                                            }
                                            break;
                                        case 10:
                                            strA01 = AbstractC2495k7.A01(attributeValue);
                                            attributeCount = strA01.hashCode();
                                            switch (attributeCount) {
                                                case -618561360:
                                                    if (strA01.equals(A0A(1251, 13, 60))) {
                                                        b4 = 2;
                                                    } else {
                                                        b4 = -1;
                                                    }
                                                    break;
                                                case -410956671:
                                                    if (strA01.equals(A0A(1310, 9, 123))) {
                                                        b4 = 0;
                                                    } else {
                                                        b4 = -1;
                                                    }
                                                    break;
                                                case -250518009:
                                                    if (!strA01.equals(A0A(1323, 9, 19))) {
                                                        b4 = -1;
                                                    }
                                                    break;
                                                case -136074796:
                                                    if (strA01.equals(A0A(1714, 13, 21))) {
                                                        b4 = 4;
                                                    } else {
                                                        b4 = -1;
                                                    }
                                                    break;
                                                case 3016401:
                                                    i3 = A02[0].length();
                                                    if (i3 != 7) {
                                                        String[] strArr11111111111116 = A02;
                                                        strArr11111111111116[4] = "LIbObqkBHnKY9czcuqJXmaycY";
                                                        strArr11111111111116[7] = "8yr68kE48uI7ct7K5MzK8s3n0";
                                                        if (strA01.equals(A0A(1247, 4, 121))) {
                                                            b4 = 1;
                                                        } else {
                                                            b4 = -1;
                                                        }
                                                    } else if (strA01.equals(A0A(1247, 4, 121))) {
                                                        b4 = 1;
                                                    } else {
                                                        b4 = -1;
                                                    }
                                                    break;
                                                case 3556653:
                                                    if (strA01.equals(A0A(1690, 4, 69))) {
                                                        b4 = 3;
                                                    } else {
                                                        b4 = -1;
                                                    }
                                                    break;
                                                default:
                                                    b4 = -1;
                                                    break;
                                            }
                                            switch (b4) {
                                                case 0:
                                                    ktA011 = A08(ktA011).A0K(1);
                                                    break;
                                                case 1:
                                                case 2:
                                                    ktA011 = A08(ktA011).A0K(2);
                                                    break;
                                                case 3:
                                                case 4:
                                                    ktA011 = A08(ktA011).A0K(3);
                                                    break;
                                                case 5:
                                                    ktA09 = A08(ktA011);
                                                    String[] strArr11111111111117 = A02;
                                                    String str11111111111116 = strArr11111111111117[6];
                                                    String str11111111111117 = strArr11111111111117[2];
                                                    i4 = str11111111111116.charAt(3);
                                                    attributeCount2 = str11111111111117.charAt(3);
                                                    if (i4 != attributeCount2) {
                                                        A02[0] = "J4PxtYpjCjcISuW5D9hp9p1SdEi";
                                                        ktA011 = ktA09.A0K(4);
                                                    } else {
                                                        String[] strArr11111111111118 = A02;
                                                        strArr11111111111118[4] = "5y5J9haLXfISwEnEFuDPzKTDZ";
                                                        strArr11111111111118[7] = "OL7OkctduLhf4RZoSVrAZg0CW";
                                                        ktA011 = ktA09.A0K(4);
                                                    }
                                                    break;
                                            }
                                            break;
                                        case 11:
                                            strA02 = AbstractC2495k7.A01(attributeValue);
                                            attributeCount3 = strA02.hashCode();
                                            switch (attributeCount3) {
                                                case -1392885889:
                                                    if (strA02.equals(A0A(1264, 6, 99))) {
                                                        b6 = 0;
                                                    }
                                                    break;
                                                case 92734940:
                                                    if (strA02.equals(A0A(1209, 5, 37))) {
                                                        b6 = 1;
                                                    }
                                                    break;
                                            }
                                            switch (b6) {
                                                case 0:
                                                    ktA011 = A08(ktA011).A0J(1);
                                                    break;
                                                case 1:
                                                    ktA011 = A08(ktA011).A0J(2);
                                                    break;
                                            }
                                            break;
                                        case 12:
                                            strA03 = AbstractC2495k7.A01(attributeValue);
                                            attributeCount4 = strA03.hashCode();
                                            switch (attributeCount4) {
                                                case -1461280213:
                                                    strA0A = A0A(1593, 11, 58);
                                                    String[] strArr11111111111119 = A02;
                                                    String str11111111111118 = strArr11111111111119[4];
                                                    String str11111111111119 = strArr11111111111119[7];
                                                    i5 = str11111111111118.length();
                                                    attributeCount5 = str11111111111119.length();
                                                    if (i5 != attributeCount5) {
                                                        String[] strArr112110 = A02;
                                                        strArr112110[1] = "bik63b6qq3sx6";
                                                        strArr112110[5] = "UnBPKnpUlJfync8N3sKzurGh";
                                                        if (!strA03.equals(strA0A)) {
                                                            b5 = -1;
                                                        }
                                                    } else if (!strA03.equals(strA0A)) {
                                                        b5 = -1;
                                                    }
                                                    switch (b5) {
                                                        case 0:
                                                            ktA011 = A08(ktA011).A0T(true);
                                                            break;
                                                        case 1:
                                                            ktA011 = A08(ktA011).A0T(false);
                                                            break;
                                                        case 2:
                                                            ktA011 = A08(ktA011).A0V(true);
                                                            break;
                                                        case 3:
                                                            ktA011 = A08(ktA011).A0V(false);
                                                            break;
                                                    }
                                                    break;
                                                case -1026963764:
                                                    if (strA03.equals(A0A(1763, 9, 73))) {
                                                        b5 = 2;
                                                    } else {
                                                        b5 = -1;
                                                    }
                                                    switch (b5) {
                                                        case 0:
                                                            ktA011 = A08(ktA011).A0T(true);
                                                            break;
                                                        case 1:
                                                            ktA011 = A08(ktA011).A0T(false);
                                                            break;
                                                        case 2:
                                                            ktA011 = A08(ktA011).A0V(true);
                                                            break;
                                                        case 3:
                                                            ktA011 = A08(ktA011).A0V(false);
                                                            break;
                                                    }
                                                    break;
                                                case 913457136:
                                                    String[] strArr112111 = A02;
                                                    String str112110 = strArr112111[1];
                                                    String str112111 = strArr112111[5];
                                                    i6 = str112110.length();
                                                    attributeCount6 = str112111.length();
                                                    if (i6 == attributeCount6) {
                                                        A02[3] = "e93UUhN2aqZLtboheHnNzqcVXHE9GMfx";
                                                        if (strA03.equals(A0A(1576, 13, 109))) {
                                                            b5 = 1;
                                                        } else {
                                                            b5 = -1;
                                                        }
                                                        switch (b5) {
                                                            case 0:
                                                                ktA011 = A08(ktA011).A0T(true);
                                                                break;
                                                            case 1:
                                                                ktA011 = A08(ktA011).A0T(false);
                                                                break;
                                                            case 2:
                                                                ktA011 = A08(ktA011).A0V(true);
                                                                break;
                                                            case 3:
                                                                ktA011 = A08(ktA011).A0V(false);
                                                                break;
                                                        }
                                                    } else {
                                                        throw new RuntimeException();
                                                    }
                                                    break;
                                                case 1679736913:
                                                    if (strA03.equals(A0A(1541, 11, 39))) {
                                                        b5 = 0;
                                                    } else {
                                                        b5 = -1;
                                                    }
                                                    switch (b5) {
                                                        case 0:
                                                            ktA011 = A08(ktA011).A0T(true);
                                                            break;
                                                        case 1:
                                                            ktA011 = A08(ktA011).A0T(false);
                                                            break;
                                                        case 2:
                                                            ktA011 = A08(ktA011).A0V(true);
                                                            break;
                                                        case 3:
                                                            ktA011 = A08(ktA011).A0V(false);
                                                            break;
                                                    }
                                                    break;
                                                default:
                                                    b5 = -1;
                                                    switch (b5) {
                                                        case 0:
                                                            ktA011 = A08(ktA011).A0T(true);
                                                            break;
                                                        case 1:
                                                            ktA011 = A08(ktA011).A0T(false);
                                                            break;
                                                        case 2:
                                                            ktA011 = A08(ktA011).A0V(true);
                                                            break;
                                                        case 3:
                                                            ktA011 = A08(ktA011).A0V(false);
                                                            break;
                                                    }
                                                    break;
                                            }
                                            break;
                                        case 13:
                                            ktA011 = A08(ktA011).A0N(KI.A01(attributeValue));
                                            break;
                                        case 14:
                                            ktA011 = A08(ktA011).A0F(A00(attributeValue));
                                            break;
                                    }
                                    break;
                                case 1287124693:
                                    if (attributeName.equals(A0A(1217, 15, 103))) {
                                        b3 = 1;
                                    } else {
                                        b3 = -1;
                                    }
                                    String strA0A19 = A0A(892, 11, 16);
                                    switch (b3) {
                                        case 0:
                                            if (A0A(1655, 5, 93).equals(xmlPullParser.getName())) {
                                                ktA011 = A08(ktA011).A0Q(attributeValue);
                                            }
                                            break;
                                        case 1:
                                            ktA011 = A08(ktA011);
                                            int attributeCount1118 = AnonymousClass47.A01(attributeValue);
                                            ktA011.A0G(attributeCount1118);
                                            break;
                                        case 2:
                                            ktA011 = A08(ktA011);
                                            int attributeCount1119 = AnonymousClass47.A01(attributeValue);
                                            ktA011.A0H(attributeCount1119);
                                            break;
                                        case 3:
                                            ktA011 = A08(ktA011).A0P(attributeValue);
                                            break;
                                        case 4:
                                            ktA011 = A08(ktA011);
                                            A0D(attributeValue, ktA011);
                                            break;
                                        case 5:
                                            ktA011 = A08(ktA011).A0R(A0A(1279, 4, 70).equalsIgnoreCase(attributeValue));
                                            break;
                                        case 6:
                                            ktA08 = A08(ktA011);
                                            zEqualsIgnoreCase = A0A(1525, 6, 38).equalsIgnoreCase(attributeValue);
                                            i2 = A02[0].length();
                                            if (i2 != 7) {
                                                String[] strArr12112 = A02;
                                                strArr12112[1] = "3LAgyyDE1fiF0";
                                                strArr12112[5] = "1Nn0OmHZpjO5zuXdFxViYYhi";
                                                ktA011 = ktA08.A0S(zEqualsIgnoreCase);
                                            } else {
                                                A02[3] = "rHlCayaIaBq6HOiiZnZ7WLhH9IM1pHxI";
                                                ktA011 = ktA08.A0S(zEqualsIgnoreCase);
                                            }
                                            break;
                                        case 7:
                                            ktA011 = A08(ktA011).A0M(A02(attributeValue));
                                            break;
                                        case 8:
                                            ktA011 = A08(ktA011).A0L(A02(attributeValue));
                                            break;
                                        case 9:
                                            strA04 = AbstractC2495k7.A01(attributeValue);
                                            attributeCount7 = strA04.hashCode();
                                            switch (attributeCount7) {
                                                case 96673:
                                                    if (strA04.equals(A0A(1214, 3, 74))) {
                                                        b6 = 1;
                                                    }
                                                    switch (b6) {
                                                        case 0:
                                                            ktA011 = A08(ktA011).A0U(false);
                                                            break;
                                                        case 1:
                                                            ktA010 = A08(ktA011);
                                                            String[] strArr111111111111110 = A02;
                                                            String str111111111111110 = strArr111111111111110[6];
                                                            String str111111111111111 = strArr111111111111110[2];
                                                            i7 = str111111111111110.charAt(3);
                                                            attributeCount8 = str111111111111111.charAt(3);
                                                            if (i7 != attributeCount8) {
                                                                ktA011 = ktA010.A0U(true);
                                                            } else {
                                                                String[] strArr111111111111111 = A02;
                                                                strArr111111111111111[4] = "vXebmLnNF52WQsSE6i6dOepDl";
                                                                strArr111111111111111[7] = "VyoJ0PyeyBelBF2UzGSxOycy2";
                                                                ktA011 = ktA010.A0U(true);
                                                            }
                                                            break;
                                                    }
                                                    break;
                                                case 3387192:
                                                    strA0A2 = A0A(1589, 4, 93);
                                                    String[] strArr12113 = A02;
                                                    String str12112 = strArr12113[4];
                                                    String str12113 = strArr12113[7];
                                                    i8 = str12112.length();
                                                    attributeCount9 = str12113.length();
                                                    if (i8 != attributeCount9) {
                                                        String[] strArr215 = A02;
                                                        strArr215[6] = "KuhwJ7ghsOXYSD0w45zfNovp0dFSdmRc";
                                                        strArr215[2] = "7BZwCfoQFB9cKVUBMfAbcYdCpdo30x6t";
                                                        if (strA04.equals(strA0A2)) {
                                                            b6 = 0;
                                                        }
                                                        switch (b6) {
                                                            case 0:
                                                                ktA011 = A08(ktA011).A0U(false);
                                                                break;
                                                            case 1:
                                                                ktA010 = A08(ktA011);
                                                                String[] strArr111111111111112 = A02;
                                                                String str111111111111112 = strArr111111111111112[6];
                                                                String str111111111111113 = strArr111111111111112[2];
                                                                i7 = str111111111111112.charAt(3);
                                                                attributeCount8 = str111111111111113.charAt(3);
                                                                if (i7 != attributeCount8) {
                                                                    ktA011 = ktA010.A0U(true);
                                                                } else {
                                                                    String[] strArr111111111111113 = A02;
                                                                    strArr111111111111113[4] = "vXebmLnNF52WQsSE6i6dOepDl";
                                                                    strArr111111111111113[7] = "VyoJ0PyeyBelBF2UzGSxOycy2";
                                                                    ktA011 = ktA010.A0U(true);
                                                                }
                                                                break;
                                                        }
                                                    } else {
                                                        throw new RuntimeException();
                                                    }
                                                    break;
                                                default:
                                                    switch (b6) {
                                                        case 0:
                                                            ktA011 = A08(ktA011).A0U(false);
                                                            break;
                                                        case 1:
                                                            ktA010 = A08(ktA011);
                                                            String[] strArr111111111111114 = A02;
                                                            String str111111111111114 = strArr111111111111114[6];
                                                            String str111111111111115 = strArr111111111111114[2];
                                                            i7 = str111111111111114.charAt(3);
                                                            attributeCount8 = str111111111111115.charAt(3);
                                                            if (i7 != attributeCount8) {
                                                                ktA011 = ktA010.A0U(true);
                                                            } else {
                                                                String[] strArr111111111111115 = A02;
                                                                strArr111111111111115[4] = "vXebmLnNF52WQsSE6i6dOepDl";
                                                                strArr111111111111115[7] = "VyoJ0PyeyBelBF2UzGSxOycy2";
                                                                ktA011 = ktA010.A0U(true);
                                                            }
                                                            break;
                                                    }
                                                    break;
                                            }
                                            break;
                                        case 10:
                                            strA01 = AbstractC2495k7.A01(attributeValue);
                                            attributeCount = strA01.hashCode();
                                            switch (attributeCount) {
                                                case -618561360:
                                                    if (strA01.equals(A0A(1251, 13, 60))) {
                                                        b4 = 2;
                                                    } else {
                                                        b4 = -1;
                                                    }
                                                    break;
                                                case -410956671:
                                                    if (strA01.equals(A0A(1310, 9, 123))) {
                                                        b4 = 0;
                                                    } else {
                                                        b4 = -1;
                                                    }
                                                    break;
                                                case -250518009:
                                                    if (!strA01.equals(A0A(1323, 9, 19))) {
                                                        b4 = -1;
                                                    }
                                                    break;
                                                case -136074796:
                                                    if (strA01.equals(A0A(1714, 13, 21))) {
                                                        b4 = 4;
                                                    } else {
                                                        b4 = -1;
                                                    }
                                                    break;
                                                case 3016401:
                                                    i3 = A02[0].length();
                                                    if (i3 != 7) {
                                                        String[] strArr111111111111116 = A02;
                                                        strArr111111111111116[4] = "LIbObqkBHnKY9czcuqJXmaycY";
                                                        strArr111111111111116[7] = "8yr68kE48uI7ct7K5MzK8s3n0";
                                                        if (strA01.equals(A0A(1247, 4, 121))) {
                                                            b4 = 1;
                                                        } else {
                                                            b4 = -1;
                                                        }
                                                    } else if (strA01.equals(A0A(1247, 4, 121))) {
                                                        b4 = 1;
                                                    } else {
                                                        b4 = -1;
                                                    }
                                                    break;
                                                case 3556653:
                                                    if (strA01.equals(A0A(1690, 4, 69))) {
                                                        b4 = 3;
                                                    } else {
                                                        b4 = -1;
                                                    }
                                                    break;
                                                default:
                                                    b4 = -1;
                                                    break;
                                            }
                                            switch (b4) {
                                                case 0:
                                                    ktA011 = A08(ktA011).A0K(1);
                                                    break;
                                                case 1:
                                                case 2:
                                                    ktA011 = A08(ktA011).A0K(2);
                                                    break;
                                                case 3:
                                                case 4:
                                                    ktA011 = A08(ktA011).A0K(3);
                                                    break;
                                                case 5:
                                                    ktA09 = A08(ktA011);
                                                    String[] strArr111111111111117 = A02;
                                                    String str111111111111116 = strArr111111111111117[6];
                                                    String str111111111111117 = strArr111111111111117[2];
                                                    i4 = str111111111111116.charAt(3);
                                                    attributeCount2 = str111111111111117.charAt(3);
                                                    if (i4 != attributeCount2) {
                                                        A02[0] = "J4PxtYpjCjcISuW5D9hp9p1SdEi";
                                                        ktA011 = ktA09.A0K(4);
                                                    } else {
                                                        String[] strArr111111111111118 = A02;
                                                        strArr111111111111118[4] = "5y5J9haLXfISwEnEFuDPzKTDZ";
                                                        strArr111111111111118[7] = "OL7OkctduLhf4RZoSVrAZg0CW";
                                                        ktA011 = ktA09.A0K(4);
                                                    }
                                                    break;
                                            }
                                            break;
                                        case 11:
                                            strA02 = AbstractC2495k7.A01(attributeValue);
                                            attributeCount3 = strA02.hashCode();
                                            switch (attributeCount3) {
                                                case -1392885889:
                                                    if (strA02.equals(A0A(1264, 6, 99))) {
                                                        b6 = 0;
                                                    }
                                                    break;
                                                case 92734940:
                                                    if (strA02.equals(A0A(1209, 5, 37))) {
                                                        b6 = 1;
                                                    }
                                                    break;
                                            }
                                            switch (b6) {
                                                case 0:
                                                    ktA011 = A08(ktA011).A0J(1);
                                                    break;
                                                case 1:
                                                    ktA011 = A08(ktA011).A0J(2);
                                                    break;
                                            }
                                            break;
                                        case 12:
                                            strA03 = AbstractC2495k7.A01(attributeValue);
                                            attributeCount4 = strA03.hashCode();
                                            switch (attributeCount4) {
                                                case -1461280213:
                                                    strA0A = A0A(1593, 11, 58);
                                                    String[] strArr111111111111119 = A02;
                                                    String str111111111111118 = strArr111111111111119[4];
                                                    String str111111111111119 = strArr111111111111119[7];
                                                    i5 = str111111111111118.length();
                                                    attributeCount5 = str111111111111119.length();
                                                    if (i5 != attributeCount5) {
                                                        String[] strArr112112 = A02;
                                                        strArr112112[1] = "bik63b6qq3sx6";
                                                        strArr112112[5] = "UnBPKnpUlJfync8N3sKzurGh";
                                                        if (!strA03.equals(strA0A)) {
                                                            b5 = -1;
                                                        }
                                                    } else if (!strA03.equals(strA0A)) {
                                                        b5 = -1;
                                                    }
                                                    switch (b5) {
                                                        case 0:
                                                            ktA011 = A08(ktA011).A0T(true);
                                                            break;
                                                        case 1:
                                                            ktA011 = A08(ktA011).A0T(false);
                                                            break;
                                                        case 2:
                                                            ktA011 = A08(ktA011).A0V(true);
                                                            break;
                                                        case 3:
                                                            ktA011 = A08(ktA011).A0V(false);
                                                            break;
                                                    }
                                                    break;
                                                case -1026963764:
                                                    if (strA03.equals(A0A(1763, 9, 73))) {
                                                        b5 = 2;
                                                    } else {
                                                        b5 = -1;
                                                    }
                                                    switch (b5) {
                                                        case 0:
                                                            ktA011 = A08(ktA011).A0T(true);
                                                            break;
                                                        case 1:
                                                            ktA011 = A08(ktA011).A0T(false);
                                                            break;
                                                        case 2:
                                                            ktA011 = A08(ktA011).A0V(true);
                                                            break;
                                                        case 3:
                                                            ktA011 = A08(ktA011).A0V(false);
                                                            break;
                                                    }
                                                    break;
                                                case 913457136:
                                                    String[] strArr112113 = A02;
                                                    String str112112 = strArr112113[1];
                                                    String str112113 = strArr112113[5];
                                                    i6 = str112112.length();
                                                    attributeCount6 = str112113.length();
                                                    if (i6 == attributeCount6) {
                                                        A02[3] = "e93UUhN2aqZLtboheHnNzqcVXHE9GMfx";
                                                        if (strA03.equals(A0A(1576, 13, 109))) {
                                                            b5 = 1;
                                                        } else {
                                                            b5 = -1;
                                                        }
                                                        switch (b5) {
                                                            case 0:
                                                                ktA011 = A08(ktA011).A0T(true);
                                                                break;
                                                            case 1:
                                                                ktA011 = A08(ktA011).A0T(false);
                                                                break;
                                                            case 2:
                                                                ktA011 = A08(ktA011).A0V(true);
                                                                break;
                                                            case 3:
                                                                ktA011 = A08(ktA011).A0V(false);
                                                                break;
                                                        }
                                                    } else {
                                                        throw new RuntimeException();
                                                    }
                                                    break;
                                                case 1679736913:
                                                    if (strA03.equals(A0A(1541, 11, 39))) {
                                                        b5 = 0;
                                                    } else {
                                                        b5 = -1;
                                                    }
                                                    switch (b5) {
                                                        case 0:
                                                            ktA011 = A08(ktA011).A0T(true);
                                                            break;
                                                        case 1:
                                                            ktA011 = A08(ktA011).A0T(false);
                                                            break;
                                                        case 2:
                                                            ktA011 = A08(ktA011).A0V(true);
                                                            break;
                                                        case 3:
                                                            ktA011 = A08(ktA011).A0V(false);
                                                            break;
                                                    }
                                                    break;
                                                default:
                                                    b5 = -1;
                                                    switch (b5) {
                                                        case 0:
                                                            ktA011 = A08(ktA011).A0T(true);
                                                            break;
                                                        case 1:
                                                            ktA011 = A08(ktA011).A0T(false);
                                                            break;
                                                        case 2:
                                                            ktA011 = A08(ktA011).A0V(true);
                                                            break;
                                                        case 3:
                                                            ktA011 = A08(ktA011).A0V(false);
                                                            break;
                                                    }
                                                    break;
                                            }
                                            break;
                                        case 13:
                                            ktA011 = A08(ktA011).A0N(KI.A01(attributeValue));
                                            break;
                                        case 14:
                                            ktA011 = A08(ktA011).A0F(A00(attributeValue));
                                            break;
                                    }
                                    break;
                                case 1754920356:
                                    if (attributeName.equals(A0A(1563, 13, 74))) {
                                        b3 = 8;
                                    } else {
                                        b3 = -1;
                                    }
                                    String strA0A110 = A0A(892, 11, 16);
                                    switch (b3) {
                                        case 0:
                                            if (A0A(1655, 5, 93).equals(xmlPullParser.getName())) {
                                                ktA011 = A08(ktA011).A0Q(attributeValue);
                                            }
                                            break;
                                        case 1:
                                            ktA011 = A08(ktA011);
                                            int attributeCount11110 = AnonymousClass47.A01(attributeValue);
                                            ktA011.A0G(attributeCount11110);
                                            break;
                                        case 2:
                                            ktA011 = A08(ktA011);
                                            int attributeCount11111 = AnonymousClass47.A01(attributeValue);
                                            ktA011.A0H(attributeCount11111);
                                            break;
                                        case 3:
                                            ktA011 = A08(ktA011).A0P(attributeValue);
                                            break;
                                        case 4:
                                            ktA011 = A08(ktA011);
                                            A0D(attributeValue, ktA011);
                                            break;
                                        case 5:
                                            ktA011 = A08(ktA011).A0R(A0A(1279, 4, 70).equalsIgnoreCase(attributeValue));
                                            break;
                                        case 6:
                                            ktA08 = A08(ktA011);
                                            zEqualsIgnoreCase = A0A(1525, 6, 38).equalsIgnoreCase(attributeValue);
                                            i2 = A02[0].length();
                                            if (i2 != 7) {
                                                String[] strArr12114 = A02;
                                                strArr12114[1] = "3LAgyyDE1fiF0";
                                                strArr12114[5] = "1Nn0OmHZpjO5zuXdFxViYYhi";
                                                ktA011 = ktA08.A0S(zEqualsIgnoreCase);
                                            } else {
                                                A02[3] = "rHlCayaIaBq6HOiiZnZ7WLhH9IM1pHxI";
                                                ktA011 = ktA08.A0S(zEqualsIgnoreCase);
                                            }
                                            break;
                                        case 7:
                                            ktA011 = A08(ktA011).A0M(A02(attributeValue));
                                            break;
                                        case 8:
                                            ktA011 = A08(ktA011).A0L(A02(attributeValue));
                                            break;
                                        case 9:
                                            strA04 = AbstractC2495k7.A01(attributeValue);
                                            attributeCount7 = strA04.hashCode();
                                            switch (attributeCount7) {
                                                case 96673:
                                                    if (strA04.equals(A0A(1214, 3, 74))) {
                                                        b6 = 1;
                                                    }
                                                    switch (b6) {
                                                        case 0:
                                                            ktA011 = A08(ktA011).A0U(false);
                                                            break;
                                                        case 1:
                                                            ktA010 = A08(ktA011);
                                                            String[] strArr1111111111111110 = A02;
                                                            String str1111111111111110 = strArr1111111111111110[6];
                                                            String str1111111111111111 = strArr1111111111111110[2];
                                                            i7 = str1111111111111110.charAt(3);
                                                            attributeCount8 = str1111111111111111.charAt(3);
                                                            if (i7 != attributeCount8) {
                                                                ktA011 = ktA010.A0U(true);
                                                            } else {
                                                                String[] strArr1111111111111111 = A02;
                                                                strArr1111111111111111[4] = "vXebmLnNF52WQsSE6i6dOepDl";
                                                                strArr1111111111111111[7] = "VyoJ0PyeyBelBF2UzGSxOycy2";
                                                                ktA011 = ktA010.A0U(true);
                                                            }
                                                            break;
                                                    }
                                                    break;
                                                case 3387192:
                                                    strA0A2 = A0A(1589, 4, 93);
                                                    String[] strArr12115 = A02;
                                                    String str12114 = strArr12115[4];
                                                    String str12115 = strArr12115[7];
                                                    i8 = str12114.length();
                                                    attributeCount9 = str12115.length();
                                                    if (i8 != attributeCount9) {
                                                        String[] strArr216 = A02;
                                                        strArr216[6] = "KuhwJ7ghsOXYSD0w45zfNovp0dFSdmRc";
                                                        strArr216[2] = "7BZwCfoQFB9cKVUBMfAbcYdCpdo30x6t";
                                                        if (strA04.equals(strA0A2)) {
                                                            b6 = 0;
                                                        }
                                                        switch (b6) {
                                                            case 0:
                                                                ktA011 = A08(ktA011).A0U(false);
                                                                break;
                                                            case 1:
                                                                ktA010 = A08(ktA011);
                                                                String[] strArr1111111111111112 = A02;
                                                                String str1111111111111112 = strArr1111111111111112[6];
                                                                String str1111111111111113 = strArr1111111111111112[2];
                                                                i7 = str1111111111111112.charAt(3);
                                                                attributeCount8 = str1111111111111113.charAt(3);
                                                                if (i7 != attributeCount8) {
                                                                    ktA011 = ktA010.A0U(true);
                                                                } else {
                                                                    String[] strArr1111111111111113 = A02;
                                                                    strArr1111111111111113[4] = "vXebmLnNF52WQsSE6i6dOepDl";
                                                                    strArr1111111111111113[7] = "VyoJ0PyeyBelBF2UzGSxOycy2";
                                                                    ktA011 = ktA010.A0U(true);
                                                                }
                                                                break;
                                                        }
                                                    } else {
                                                        throw new RuntimeException();
                                                    }
                                                    break;
                                                default:
                                                    switch (b6) {
                                                        case 0:
                                                            ktA011 = A08(ktA011).A0U(false);
                                                            break;
                                                        case 1:
                                                            ktA010 = A08(ktA011);
                                                            String[] strArr1111111111111114 = A02;
                                                            String str1111111111111114 = strArr1111111111111114[6];
                                                            String str1111111111111115 = strArr1111111111111114[2];
                                                            i7 = str1111111111111114.charAt(3);
                                                            attributeCount8 = str1111111111111115.charAt(3);
                                                            if (i7 != attributeCount8) {
                                                                ktA011 = ktA010.A0U(true);
                                                            } else {
                                                                String[] strArr1111111111111115 = A02;
                                                                strArr1111111111111115[4] = "vXebmLnNF52WQsSE6i6dOepDl";
                                                                strArr1111111111111115[7] = "VyoJ0PyeyBelBF2UzGSxOycy2";
                                                                ktA011 = ktA010.A0U(true);
                                                            }
                                                            break;
                                                    }
                                                    break;
                                            }
                                            break;
                                        case 10:
                                            strA01 = AbstractC2495k7.A01(attributeValue);
                                            attributeCount = strA01.hashCode();
                                            switch (attributeCount) {
                                                case -618561360:
                                                    if (strA01.equals(A0A(1251, 13, 60))) {
                                                        b4 = 2;
                                                    } else {
                                                        b4 = -1;
                                                    }
                                                    break;
                                                case -410956671:
                                                    if (strA01.equals(A0A(1310, 9, 123))) {
                                                        b4 = 0;
                                                    } else {
                                                        b4 = -1;
                                                    }
                                                    break;
                                                case -250518009:
                                                    if (!strA01.equals(A0A(1323, 9, 19))) {
                                                        b4 = -1;
                                                    }
                                                    break;
                                                case -136074796:
                                                    if (strA01.equals(A0A(1714, 13, 21))) {
                                                        b4 = 4;
                                                    } else {
                                                        b4 = -1;
                                                    }
                                                    break;
                                                case 3016401:
                                                    i3 = A02[0].length();
                                                    if (i3 != 7) {
                                                        String[] strArr1111111111111116 = A02;
                                                        strArr1111111111111116[4] = "LIbObqkBHnKY9czcuqJXmaycY";
                                                        strArr1111111111111116[7] = "8yr68kE48uI7ct7K5MzK8s3n0";
                                                        if (strA01.equals(A0A(1247, 4, 121))) {
                                                            b4 = 1;
                                                        } else {
                                                            b4 = -1;
                                                        }
                                                    } else if (strA01.equals(A0A(1247, 4, 121))) {
                                                        b4 = 1;
                                                    } else {
                                                        b4 = -1;
                                                    }
                                                    break;
                                                case 3556653:
                                                    if (strA01.equals(A0A(1690, 4, 69))) {
                                                        b4 = 3;
                                                    } else {
                                                        b4 = -1;
                                                    }
                                                    break;
                                                default:
                                                    b4 = -1;
                                                    break;
                                            }
                                            switch (b4) {
                                                case 0:
                                                    ktA011 = A08(ktA011).A0K(1);
                                                    break;
                                                case 1:
                                                case 2:
                                                    ktA011 = A08(ktA011).A0K(2);
                                                    break;
                                                case 3:
                                                case 4:
                                                    ktA011 = A08(ktA011).A0K(3);
                                                    break;
                                                case 5:
                                                    ktA09 = A08(ktA011);
                                                    String[] strArr1111111111111117 = A02;
                                                    String str1111111111111116 = strArr1111111111111117[6];
                                                    String str1111111111111117 = strArr1111111111111117[2];
                                                    i4 = str1111111111111116.charAt(3);
                                                    attributeCount2 = str1111111111111117.charAt(3);
                                                    if (i4 != attributeCount2) {
                                                        A02[0] = "J4PxtYpjCjcISuW5D9hp9p1SdEi";
                                                        ktA011 = ktA09.A0K(4);
                                                    } else {
                                                        String[] strArr1111111111111118 = A02;
                                                        strArr1111111111111118[4] = "5y5J9haLXfISwEnEFuDPzKTDZ";
                                                        strArr1111111111111118[7] = "OL7OkctduLhf4RZoSVrAZg0CW";
                                                        ktA011 = ktA09.A0K(4);
                                                    }
                                                    break;
                                            }
                                            break;
                                        case 11:
                                            strA02 = AbstractC2495k7.A01(attributeValue);
                                            attributeCount3 = strA02.hashCode();
                                            switch (attributeCount3) {
                                                case -1392885889:
                                                    if (strA02.equals(A0A(1264, 6, 99))) {
                                                        b6 = 0;
                                                    }
                                                    break;
                                                case 92734940:
                                                    if (strA02.equals(A0A(1209, 5, 37))) {
                                                        b6 = 1;
                                                    }
                                                    break;
                                            }
                                            switch (b6) {
                                                case 0:
                                                    ktA011 = A08(ktA011).A0J(1);
                                                    break;
                                                case 1:
                                                    ktA011 = A08(ktA011).A0J(2);
                                                    break;
                                            }
                                            break;
                                        case 12:
                                            strA03 = AbstractC2495k7.A01(attributeValue);
                                            attributeCount4 = strA03.hashCode();
                                            switch (attributeCount4) {
                                                case -1461280213:
                                                    strA0A = A0A(1593, 11, 58);
                                                    String[] strArr1111111111111119 = A02;
                                                    String str1111111111111118 = strArr1111111111111119[4];
                                                    String str1111111111111119 = strArr1111111111111119[7];
                                                    i5 = str1111111111111118.length();
                                                    attributeCount5 = str1111111111111119.length();
                                                    if (i5 != attributeCount5) {
                                                        String[] strArr112114 = A02;
                                                        strArr112114[1] = "bik63b6qq3sx6";
                                                        strArr112114[5] = "UnBPKnpUlJfync8N3sKzurGh";
                                                        if (!strA03.equals(strA0A)) {
                                                            b5 = -1;
                                                        }
                                                    } else if (!strA03.equals(strA0A)) {
                                                        b5 = -1;
                                                    }
                                                    switch (b5) {
                                                        case 0:
                                                            ktA011 = A08(ktA011).A0T(true);
                                                            break;
                                                        case 1:
                                                            ktA011 = A08(ktA011).A0T(false);
                                                            break;
                                                        case 2:
                                                            ktA011 = A08(ktA011).A0V(true);
                                                            break;
                                                        case 3:
                                                            ktA011 = A08(ktA011).A0V(false);
                                                            break;
                                                    }
                                                    break;
                                                case -1026963764:
                                                    if (strA03.equals(A0A(1763, 9, 73))) {
                                                        b5 = 2;
                                                    } else {
                                                        b5 = -1;
                                                    }
                                                    switch (b5) {
                                                        case 0:
                                                            ktA011 = A08(ktA011).A0T(true);
                                                            break;
                                                        case 1:
                                                            ktA011 = A08(ktA011).A0T(false);
                                                            break;
                                                        case 2:
                                                            ktA011 = A08(ktA011).A0V(true);
                                                            break;
                                                        case 3:
                                                            ktA011 = A08(ktA011).A0V(false);
                                                            break;
                                                    }
                                                    break;
                                                case 913457136:
                                                    String[] strArr112115 = A02;
                                                    String str112114 = strArr112115[1];
                                                    String str112115 = strArr112115[5];
                                                    i6 = str112114.length();
                                                    attributeCount6 = str112115.length();
                                                    if (i6 == attributeCount6) {
                                                        A02[3] = "e93UUhN2aqZLtboheHnNzqcVXHE9GMfx";
                                                        if (strA03.equals(A0A(1576, 13, 109))) {
                                                            b5 = 1;
                                                        } else {
                                                            b5 = -1;
                                                        }
                                                        switch (b5) {
                                                            case 0:
                                                                ktA011 = A08(ktA011).A0T(true);
                                                                break;
                                                            case 1:
                                                                ktA011 = A08(ktA011).A0T(false);
                                                                break;
                                                            case 2:
                                                                ktA011 = A08(ktA011).A0V(true);
                                                                break;
                                                            case 3:
                                                                ktA011 = A08(ktA011).A0V(false);
                                                                break;
                                                        }
                                                    } else {
                                                        throw new RuntimeException();
                                                    }
                                                    break;
                                                case 1679736913:
                                                    if (strA03.equals(A0A(1541, 11, 39))) {
                                                        b5 = 0;
                                                    } else {
                                                        b5 = -1;
                                                    }
                                                    switch (b5) {
                                                        case 0:
                                                            ktA011 = A08(ktA011).A0T(true);
                                                            break;
                                                        case 1:
                                                            ktA011 = A08(ktA011).A0T(false);
                                                            break;
                                                        case 2:
                                                            ktA011 = A08(ktA011).A0V(true);
                                                            break;
                                                        case 3:
                                                            ktA011 = A08(ktA011).A0V(false);
                                                            break;
                                                    }
                                                    break;
                                                default:
                                                    b5 = -1;
                                                    switch (b5) {
                                                        case 0:
                                                            ktA011 = A08(ktA011).A0T(true);
                                                            break;
                                                        case 1:
                                                            ktA011 = A08(ktA011).A0T(false);
                                                            break;
                                                        case 2:
                                                            ktA011 = A08(ktA011).A0V(true);
                                                            break;
                                                        case 3:
                                                            ktA011 = A08(ktA011).A0V(false);
                                                            break;
                                                    }
                                                    break;
                                            }
                                            break;
                                        case 13:
                                            ktA011 = A08(ktA011).A0N(KI.A01(attributeValue));
                                            break;
                                        case 14:
                                            ktA011 = A08(ktA011).A0F(A00(attributeValue));
                                            break;
                                    }
                                    break;
                                default:
                                    b3 = -1;
                                    String strA0A111 = A0A(892, 11, 16);
                                    switch (b3) {
                                        case 0:
                                            if (A0A(1655, 5, 93).equals(xmlPullParser.getName())) {
                                                ktA011 = A08(ktA011).A0Q(attributeValue);
                                            }
                                            break;
                                        case 1:
                                            ktA011 = A08(ktA011);
                                            int attributeCount11112 = AnonymousClass47.A01(attributeValue);
                                            ktA011.A0G(attributeCount11112);
                                            break;
                                        case 2:
                                            ktA011 = A08(ktA011);
                                            int attributeCount11113 = AnonymousClass47.A01(attributeValue);
                                            ktA011.A0H(attributeCount11113);
                                            break;
                                        case 3:
                                            ktA011 = A08(ktA011).A0P(attributeValue);
                                            break;
                                        case 4:
                                            ktA011 = A08(ktA011);
                                            A0D(attributeValue, ktA011);
                                            break;
                                        case 5:
                                            ktA011 = A08(ktA011).A0R(A0A(1279, 4, 70).equalsIgnoreCase(attributeValue));
                                            break;
                                        case 6:
                                            ktA08 = A08(ktA011);
                                            zEqualsIgnoreCase = A0A(1525, 6, 38).equalsIgnoreCase(attributeValue);
                                            i2 = A02[0].length();
                                            if (i2 != 7) {
                                                String[] strArr12116 = A02;
                                                strArr12116[1] = "3LAgyyDE1fiF0";
                                                strArr12116[5] = "1Nn0OmHZpjO5zuXdFxViYYhi";
                                                ktA011 = ktA08.A0S(zEqualsIgnoreCase);
                                            } else {
                                                A02[3] = "rHlCayaIaBq6HOiiZnZ7WLhH9IM1pHxI";
                                                ktA011 = ktA08.A0S(zEqualsIgnoreCase);
                                            }
                                            break;
                                        case 7:
                                            ktA011 = A08(ktA011).A0M(A02(attributeValue));
                                            break;
                                        case 8:
                                            ktA011 = A08(ktA011).A0L(A02(attributeValue));
                                            break;
                                        case 9:
                                            strA04 = AbstractC2495k7.A01(attributeValue);
                                            attributeCount7 = strA04.hashCode();
                                            switch (attributeCount7) {
                                                case 96673:
                                                    if (strA04.equals(A0A(1214, 3, 74))) {
                                                        b6 = 1;
                                                    }
                                                    switch (b6) {
                                                        case 0:
                                                            ktA011 = A08(ktA011).A0U(false);
                                                            break;
                                                        case 1:
                                                            ktA010 = A08(ktA011);
                                                            String[] strArr11111111111111110 = A02;
                                                            String str11111111111111110 = strArr11111111111111110[6];
                                                            String str11111111111111111 = strArr11111111111111110[2];
                                                            i7 = str11111111111111110.charAt(3);
                                                            attributeCount8 = str11111111111111111.charAt(3);
                                                            if (i7 != attributeCount8) {
                                                                ktA011 = ktA010.A0U(true);
                                                            } else {
                                                                String[] strArr11111111111111111 = A02;
                                                                strArr11111111111111111[4] = "vXebmLnNF52WQsSE6i6dOepDl";
                                                                strArr11111111111111111[7] = "VyoJ0PyeyBelBF2UzGSxOycy2";
                                                                ktA011 = ktA010.A0U(true);
                                                            }
                                                            break;
                                                    }
                                                    break;
                                                case 3387192:
                                                    strA0A2 = A0A(1589, 4, 93);
                                                    String[] strArr12117 = A02;
                                                    String str12116 = strArr12117[4];
                                                    String str12117 = strArr12117[7];
                                                    i8 = str12116.length();
                                                    attributeCount9 = str12117.length();
                                                    if (i8 != attributeCount9) {
                                                        String[] strArr217 = A02;
                                                        strArr217[6] = "KuhwJ7ghsOXYSD0w45zfNovp0dFSdmRc";
                                                        strArr217[2] = "7BZwCfoQFB9cKVUBMfAbcYdCpdo30x6t";
                                                        if (strA04.equals(strA0A2)) {
                                                            b6 = 0;
                                                        }
                                                        switch (b6) {
                                                            case 0:
                                                                ktA011 = A08(ktA011).A0U(false);
                                                                break;
                                                            case 1:
                                                                ktA010 = A08(ktA011);
                                                                String[] strArr11111111111111112 = A02;
                                                                String str11111111111111112 = strArr11111111111111112[6];
                                                                String str11111111111111113 = strArr11111111111111112[2];
                                                                i7 = str11111111111111112.charAt(3);
                                                                attributeCount8 = str11111111111111113.charAt(3);
                                                                if (i7 != attributeCount8) {
                                                                    ktA011 = ktA010.A0U(true);
                                                                } else {
                                                                    String[] strArr11111111111111113 = A02;
                                                                    strArr11111111111111113[4] = "vXebmLnNF52WQsSE6i6dOepDl";
                                                                    strArr11111111111111113[7] = "VyoJ0PyeyBelBF2UzGSxOycy2";
                                                                    ktA011 = ktA010.A0U(true);
                                                                }
                                                                break;
                                                        }
                                                    } else {
                                                        throw new RuntimeException();
                                                    }
                                                    break;
                                                default:
                                                    switch (b6) {
                                                        case 0:
                                                            ktA011 = A08(ktA011).A0U(false);
                                                            break;
                                                        case 1:
                                                            ktA010 = A08(ktA011);
                                                            String[] strArr11111111111111114 = A02;
                                                            String str11111111111111114 = strArr11111111111111114[6];
                                                            String str11111111111111115 = strArr11111111111111114[2];
                                                            i7 = str11111111111111114.charAt(3);
                                                            attributeCount8 = str11111111111111115.charAt(3);
                                                            if (i7 != attributeCount8) {
                                                                ktA011 = ktA010.A0U(true);
                                                            } else {
                                                                String[] strArr11111111111111115 = A02;
                                                                strArr11111111111111115[4] = "vXebmLnNF52WQsSE6i6dOepDl";
                                                                strArr11111111111111115[7] = "VyoJ0PyeyBelBF2UzGSxOycy2";
                                                                ktA011 = ktA010.A0U(true);
                                                            }
                                                            break;
                                                    }
                                                    break;
                                            }
                                            break;
                                        case 10:
                                            strA01 = AbstractC2495k7.A01(attributeValue);
                                            attributeCount = strA01.hashCode();
                                            switch (attributeCount) {
                                                case -618561360:
                                                    if (strA01.equals(A0A(1251, 13, 60))) {
                                                        b4 = 2;
                                                    } else {
                                                        b4 = -1;
                                                    }
                                                    break;
                                                case -410956671:
                                                    if (strA01.equals(A0A(1310, 9, 123))) {
                                                        b4 = 0;
                                                    } else {
                                                        b4 = -1;
                                                    }
                                                    break;
                                                case -250518009:
                                                    if (!strA01.equals(A0A(1323, 9, 19))) {
                                                        b4 = -1;
                                                    }
                                                    break;
                                                case -136074796:
                                                    if (strA01.equals(A0A(1714, 13, 21))) {
                                                        b4 = 4;
                                                    } else {
                                                        b4 = -1;
                                                    }
                                                    break;
                                                case 3016401:
                                                    i3 = A02[0].length();
                                                    if (i3 != 7) {
                                                        String[] strArr11111111111111116 = A02;
                                                        strArr11111111111111116[4] = "LIbObqkBHnKY9czcuqJXmaycY";
                                                        strArr11111111111111116[7] = "8yr68kE48uI7ct7K5MzK8s3n0";
                                                        if (strA01.equals(A0A(1247, 4, 121))) {
                                                            b4 = 1;
                                                        } else {
                                                            b4 = -1;
                                                        }
                                                    } else if (strA01.equals(A0A(1247, 4, 121))) {
                                                        b4 = 1;
                                                    } else {
                                                        b4 = -1;
                                                    }
                                                    break;
                                                case 3556653:
                                                    if (strA01.equals(A0A(1690, 4, 69))) {
                                                        b4 = 3;
                                                    } else {
                                                        b4 = -1;
                                                    }
                                                    break;
                                                default:
                                                    b4 = -1;
                                                    break;
                                            }
                                            switch (b4) {
                                                case 0:
                                                    ktA011 = A08(ktA011).A0K(1);
                                                    break;
                                                case 1:
                                                case 2:
                                                    ktA011 = A08(ktA011).A0K(2);
                                                    break;
                                                case 3:
                                                case 4:
                                                    ktA011 = A08(ktA011).A0K(3);
                                                    break;
                                                case 5:
                                                    ktA09 = A08(ktA011);
                                                    String[] strArr11111111111111117 = A02;
                                                    String str11111111111111116 = strArr11111111111111117[6];
                                                    String str11111111111111117 = strArr11111111111111117[2];
                                                    i4 = str11111111111111116.charAt(3);
                                                    attributeCount2 = str11111111111111117.charAt(3);
                                                    if (i4 != attributeCount2) {
                                                        A02[0] = "J4PxtYpjCjcISuW5D9hp9p1SdEi";
                                                        ktA011 = ktA09.A0K(4);
                                                    } else {
                                                        String[] strArr11111111111111118 = A02;
                                                        strArr11111111111111118[4] = "5y5J9haLXfISwEnEFuDPzKTDZ";
                                                        strArr11111111111111118[7] = "OL7OkctduLhf4RZoSVrAZg0CW";
                                                        ktA011 = ktA09.A0K(4);
                                                    }
                                                    break;
                                            }
                                            break;
                                        case 11:
                                            strA02 = AbstractC2495k7.A01(attributeValue);
                                            attributeCount3 = strA02.hashCode();
                                            switch (attributeCount3) {
                                                case -1392885889:
                                                    if (strA02.equals(A0A(1264, 6, 99))) {
                                                        b6 = 0;
                                                    }
                                                    break;
                                                case 92734940:
                                                    if (strA02.equals(A0A(1209, 5, 37))) {
                                                        b6 = 1;
                                                    }
                                                    break;
                                            }
                                            switch (b6) {
                                                case 0:
                                                    ktA011 = A08(ktA011).A0J(1);
                                                    break;
                                                case 1:
                                                    ktA011 = A08(ktA011).A0J(2);
                                                    break;
                                            }
                                            break;
                                        case 12:
                                            strA03 = AbstractC2495k7.A01(attributeValue);
                                            attributeCount4 = strA03.hashCode();
                                            switch (attributeCount4) {
                                                case -1461280213:
                                                    strA0A = A0A(1593, 11, 58);
                                                    String[] strArr11111111111111119 = A02;
                                                    String str11111111111111118 = strArr11111111111111119[4];
                                                    String str11111111111111119 = strArr11111111111111119[7];
                                                    i5 = str11111111111111118.length();
                                                    attributeCount5 = str11111111111111119.length();
                                                    if (i5 != attributeCount5) {
                                                        String[] strArr112116 = A02;
                                                        strArr112116[1] = "bik63b6qq3sx6";
                                                        strArr112116[5] = "UnBPKnpUlJfync8N3sKzurGh";
                                                        if (!strA03.equals(strA0A)) {
                                                            b5 = -1;
                                                        }
                                                    } else if (!strA03.equals(strA0A)) {
                                                        b5 = -1;
                                                    }
                                                    switch (b5) {
                                                        case 0:
                                                            ktA011 = A08(ktA011).A0T(true);
                                                            break;
                                                        case 1:
                                                            ktA011 = A08(ktA011).A0T(false);
                                                            break;
                                                        case 2:
                                                            ktA011 = A08(ktA011).A0V(true);
                                                            break;
                                                        case 3:
                                                            ktA011 = A08(ktA011).A0V(false);
                                                            break;
                                                    }
                                                    break;
                                                case -1026963764:
                                                    if (strA03.equals(A0A(1763, 9, 73))) {
                                                        b5 = 2;
                                                    } else {
                                                        b5 = -1;
                                                    }
                                                    switch (b5) {
                                                        case 0:
                                                            ktA011 = A08(ktA011).A0T(true);
                                                            break;
                                                        case 1:
                                                            ktA011 = A08(ktA011).A0T(false);
                                                            break;
                                                        case 2:
                                                            ktA011 = A08(ktA011).A0V(true);
                                                            break;
                                                        case 3:
                                                            ktA011 = A08(ktA011).A0V(false);
                                                            break;
                                                    }
                                                    break;
                                                case 913457136:
                                                    String[] strArr112117 = A02;
                                                    String str112116 = strArr112117[1];
                                                    String str112117 = strArr112117[5];
                                                    i6 = str112116.length();
                                                    attributeCount6 = str112117.length();
                                                    if (i6 == attributeCount6) {
                                                        A02[3] = "e93UUhN2aqZLtboheHnNzqcVXHE9GMfx";
                                                        if (strA03.equals(A0A(1576, 13, 109))) {
                                                            b5 = 1;
                                                        } else {
                                                            b5 = -1;
                                                        }
                                                        switch (b5) {
                                                            case 0:
                                                                ktA011 = A08(ktA011).A0T(true);
                                                                break;
                                                            case 1:
                                                                ktA011 = A08(ktA011).A0T(false);
                                                                break;
                                                            case 2:
                                                                ktA011 = A08(ktA011).A0V(true);
                                                                break;
                                                            case 3:
                                                                ktA011 = A08(ktA011).A0V(false);
                                                                break;
                                                        }
                                                    } else {
                                                        throw new RuntimeException();
                                                    }
                                                    break;
                                                case 1679736913:
                                                    if (strA03.equals(A0A(1541, 11, 39))) {
                                                        b5 = 0;
                                                    } else {
                                                        b5 = -1;
                                                    }
                                                    switch (b5) {
                                                        case 0:
                                                            ktA011 = A08(ktA011).A0T(true);
                                                            break;
                                                        case 1:
                                                            ktA011 = A08(ktA011).A0T(false);
                                                            break;
                                                        case 2:
                                                            ktA011 = A08(ktA011).A0V(true);
                                                            break;
                                                        case 3:
                                                            ktA011 = A08(ktA011).A0V(false);
                                                            break;
                                                    }
                                                    break;
                                                default:
                                                    b5 = -1;
                                                    switch (b5) {
                                                        case 0:
                                                            ktA011 = A08(ktA011).A0T(true);
                                                            break;
                                                        case 1:
                                                            ktA011 = A08(ktA011).A0T(false);
                                                            break;
                                                        case 2:
                                                            ktA011 = A08(ktA011).A0V(true);
                                                            break;
                                                        case 3:
                                                            ktA011 = A08(ktA011).A0V(false);
                                                            break;
                                                    }
                                                    break;
                                            }
                                            break;
                                        case 13:
                                            ktA011 = A08(ktA011).A0N(KI.A01(attributeValue));
                                            break;
                                        case 14:
                                            ktA011 = A08(ktA011).A0F(A00(attributeValue));
                                            break;
                                    }
                                    break;
                            }
                        }
                        return ktA011;
                    }

                    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
                    /* JADX WARN: Code duplicated, block: B:9:0x0038  */
                    public static void A0D(String str2, KT kt) throws C2592lj {
                        Matcher matcher;
                        byte b3;
                        String[] strArrA1O = C5C.A1O(str2, A0A(962, 3, 60));
                        if (strArrA1O.length == 1) {
                            matcher = A09.matcher(str2);
                        } else if (strArrA1O.length == 2) {
                            matcher = A09.matcher(strArrA1O[1]);
                            AbstractC10924g.A07(A0A(892, 11, 16), A0A(735, 110, 105));
                        } else {
                            throw new C2592lj(A0A(IronSourceError.ERROR_BN_LOAD_NO_CONFIG, 40, 76) + strArrA1O.length + A0A(5, 1, 61));
                        }
                        boolean zMatches = matcher.matches();
                        String strA0A = A0A(3, 2, 77);
                        if (zMatches) {
                            String str3 = (String) AbstractC10843y.A01(matcher.group(3));
                            switch (str3.hashCode()) {
                                case 37:
                                    if (!str3.equals(A0A(2, 1, 112))) {
                                        b3 = -1;
                                    } else {
                                        b3 = 2;
                                    }
                                    break;
                                case 3240:
                                    if (!str3.equals(A0A(1350, 2, 76))) {
                                        b3 = -1;
                                    } else {
                                        b3 = 1;
                                    }
                                    break;
                                case 3592:
                                    if (!str3.equals(A0A(1611, 2, 111))) {
                                        b3 = -1;
                                    } else {
                                        b3 = 0;
                                    }
                                    break;
                                default:
                                    b3 = -1;
                                    break;
                            }
                            switch (b3) {
                                case 0:
                                    kt.A0I(1);
                                    break;
                                case 1:
                                    kt.A0I(2);
                                    break;
                                case 2:
                                    kt.A0I(3);
                                    break;
                                default:
                                    throw new C2592lj(A0A(655, 28, 54) + str3 + strA0A);
                            }
                            kt.A0E(Float.parseFloat((String) AbstractC10843y.A01(matcher.group(1))));
                            return;
                        }
                        throw new C2592lj(A0A(581, 34, 24) + str2 + strA0A);
                    }

                    public static void A0E(XmlPullParser xmlPullParser, Map<String, String> map) throws XmlPullParserException, IOException {
                        String encodedBitmapData;
                        do {
                            xmlPullParser.next();
                            if (C5I.A04(xmlPullParser, A0A(1509, 5, 41)) && (encodedBitmapData = C5I.A00(xmlPullParser, A0A(cs.a.INSTANCE_NOT_FOUND_IN_SHOW, 2, 90))) != null) {
                                String id = xmlPullParser.nextText();
                                map.put(encodedBitmapData, id);
                            }
                        } while (!C5I.A03(xmlPullParser, A0A(1553, 8, 69)));
                    }

                    public static boolean A0F(String str2) {
                        if (!str2.equals(A0A(1761, 2, 56)) && !str2.equals(A0A(1468, 4, 96)) && !str2.equals(A0A(1275, 4, 43)) && !str2.equals(A0A(1344, 3, 104))) {
                            if (A02[3].charAt(8) == 'a') {
                                String[] strArr = A02;
                                strArr[6] = "5SOwrViEjml2jzAC0QTdKKqpMqKJiIIU";
                                strArr[2] = "utbwyOpqs8b3qaaxxsItXWquxXfcomKh";
                                if (!str2.equals(A0A(1610, 1, 0)) && !str2.equals(A0A(1646, 4, 62)) && !str2.equals(A0A(1283, 2, 97)) && !str2.equals(A0A(1655, 5, 93)) && !str2.equals(A0A(1660, 7, 99)) && !str2.equals(A0A(1531, 6, 85)) && !str2.equals(A0A(1613, 6, 33))) {
                                    if (A02[0].length() != 7) {
                                        String[] strArr2 = A02;
                                        strArr2[4] = "XYEsrL24jboJLM6xnETRDfm0d";
                                        strArr2[7] = "LekapK6bz2qvUkLFlJCVYN0VS";
                                        if (!str2.equals(A0A(1553, 8, 69)) && !str2.equals(A0A(1509, 5, 41)) && !str2.equals(A0A(1319, 4, 11)) && !str2.equals(A0A(1514, 11, 3))) {
                                            return false;
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
                        return strTrim.isEmpty() ? new String[0] : C5C.A1O(strTrim, A0A(962, 3, 60));
                    }
                };
            case 4:
                return new C8T() { // from class: com.facebook.ads.redexgen.X.1Q
                    public static byte[] A02;
                    public static String[] A03 = {"V1ZZWdHDdvp1vpeLHdy", "beDgvqL", "qPeUfXz8O47jIG0mRxxGLFbgYUjiO6tn", "0K37", "zACOzYjEJA3uY03LtXi99GuZvxjyA3vu", "", "yqoUvvveMQQADX2xw", "YF66NynmqVwoWtjOGJ4L1x6BuFt5Rq6F"};
                    public static final Pattern A04;
                    public static final Pattern A05;
                    public final StringBuilder A00;
                    public final ArrayList<String> A01;

                    public static String A03(int i2, int i3, int i4) {
                        byte[] bArrCopyOfRange = Arrays.copyOfRange(A02, i2, i2 + i3);
                        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
                            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] ^ i4) ^ 94);
                        }
                        return new String(bArrCopyOfRange);
                    }

                    public static void A06() {
                        A02 = new byte[]{76, 18, 2, 78, 108, 84, 86, 79, 79, 86, 81, 88, 31, 86, 81, 73, 94, 83, 86, 91, 31, 86, 81, 91, 90, 71, 5, 31, 75, 115, 113, 104, 104, 113, 118, AbstractJsonLexerKt.TC_INVALID, 56, 113, 118, 110, 121, 116, 113, 124, 56, 108, 113, 117, 113, 118, AbstractJsonLexerKt.TC_INVALID, 34, 56, 123, 93, 74, 90, 65, 88, 108, 77, 75, 71, 76, 77, 90, 80, 107, 96, 125, 117, 96, 102, 113, 96, 97, 37, 96, 107, 97, 60, 19, 74, 72, 72, 95, 90, 72, 60, 4, 75, 73, 90, 73, 95, 72, 60, 4, 75, 73, 90, 72, 60, 4, 75, 73, 72, 95, 90, 76, 72, 60, 4, 75, 73, 73, 95, 73, 60, 19, 74, 77, 77, 94, 60, 19, 74, 72, 72, 95, 90, 72, 60, 4, 75, 73, 90, 73, 95, 72, 60, 4, 75, 73, 90, 72, 60, 4, 75, 73, 72, 95, 90, 76, 72, 60, 4, 75, 73, 73, 95, 73, 60, 19, 74, 9, 46, 9, 9, 123, AbstractJsonLexerKt.TC_INVALID, 106, 9, 40, 26, 61, 26, 26, 39, 40, 29, 119, 107, AbstractJsonLexerKt.TC_INVALID, 27, 26, 59, 11, 44, 17, 30, 65, 13, 19, 52, 9, 6, 90, 21, 31, 56, 5, 10, 87, 25, 74, 109, 80, 95, 5, 76, 125, 90, 103, 104, 51, 123, 117, 82, 111, 96, 56, 115, 38, 1, 60, 51, 106, 32, AbstractJsonLexerKt.TC_INVALID, 88, 101, 106, 60, 121, 59, 28, 33, 46, 121, 61};
                    }

                    static {
                        A06();
                        A05 = Pattern.compile(A03(80, 85, 62));
                        A04 = Pattern.compile(A03(165, 9, 11));
                    }

                    {
                        A03(53, 13, 118);
                        this.A00 = new StringBuilder();
                        this.A01 = new ArrayList<>();
                    }

                    public static float A00(int i2) {
                        switch (i2) {
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

                    public static long A01(Matcher matcher, int i2) {
                        long timestampMs;
                        String hours = matcher.group(i2 + 1);
                        if (hours != null) {
                            timestampMs = Long.parseLong(hours) * 60 * 60 * 1000;
                        } else {
                            timestampMs = 0;
                        }
                        long timestampMs2 = timestampMs + (Long.parseLong((String) AbstractC10843y.A01(matcher.group(i2 + 2))) * 60 * 1000) + (Long.parseLong((String) AbstractC10843y.A01(matcher.group(i2 + 3))) * 1000);
                        String hours2 = matcher.group(i2 + 4);
                        if (hours2 != null) {
                            long j = Long.parseLong(hours2);
                            if (A03[6].length() == 8) {
                                throw new RuntimeException();
                            }
                            A03[0] = "CtNVef4YfaKqE1U7uEo";
                            timestampMs2 += j;
                        }
                        return 1000 * timestampMs2;
                    }

                    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
                    /* JADX WARN: Code duplicated, block: B:13:0x007c  */
                    /* JADX WARN: Code duplicated, block: B:15:0x0080  */
                    /* JADX WARN: Code duplicated, block: B:18:0x00a0  */
                    /* JADX WARN: Code duplicated, block: B:19:0x00a4  */
                    /* JADX WARN: Code duplicated, block: B:37:0x00f5  */
                    /* JADX WARN: Code duplicated, block: B:8:0x006e  */
                    private C2810pT A02(Spanned spanned, String str2) {
                        byte b3;
                        byte b4;
                        C10743o c10743oA0G = new C10743o().A0G(spanned);
                        if (str2 == null) {
                            return c10743oA0G.A0H();
                        }
                        int iHashCode = str2.hashCode();
                        String strA03 = A03(235, 6, 30);
                        String strA04 = A03(229, 6, 90);
                        String strA05 = A03(Sdk.SDKError.Reason.STALE_CACHED_RESPONSE_VALUE, 6, 3);
                        String strA06 = A03(Sdk.SDKError.Reason.AD_RESPONSE_TIMED_OUT_VALUE, 6, 80);
                        String strA07 = A03(BaseATView.g.f38289J, 6, 88);
                        String strA08 = A03(205, 6, 111);
                        String strA09 = A03(199, 6, 58);
                        String strA010 = A03(193, 6, 54);
                        String strA011 = A03(187, 6, 46);
                        switch (iHashCode) {
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
                                    b3 = 6;
                                }
                                break;
                            case -685620648:
                                if (!str2.equals(strA09)) {
                                    b3 = -1;
                                } else {
                                    b3 = 3;
                                }
                                break;
                            case -685620617:
                                if (!str2.equals(strA08)) {
                                    b3 = -1;
                                } else {
                                    b3 = 1;
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
                                    b3 = 4;
                                }
                                break;
                            case -685620524:
                                if (!str2.equals(strA05)) {
                                    b3 = -1;
                                } else {
                                    b3 = 2;
                                }
                                break;
                            case -685620493:
                                if (!str2.equals(strA04)) {
                                    b3 = -1;
                                } else {
                                    b3 = 8;
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
                                c10743oA0G.A0A(0);
                                break;
                            case 3:
                            case 4:
                            case 5:
                                c10743oA0G.A0A(2);
                                break;
                            default:
                                c10743oA0G.A0A(1);
                                break;
                        }
                        switch (str2.hashCode()) {
                            case -685620710:
                                if (str2.equals(strA011)) {
                                    b4 = 0;
                                } else {
                                    b4 = -1;
                                }
                                switch (b4) {
                                    case 0:
                                    case 1:
                                    case 2:
                                        c10743oA0G.A09(2);
                                        break;
                                    case 3:
                                    case 4:
                                    case 5:
                                        c10743oA0G.A09(0);
                                        break;
                                    default:
                                        c10743oA0G.A09(1);
                                        break;
                                }
                                C10743o cue = c10743oA0G.A04(A00(c10743oA0G.A01()));
                                return cue.A07(A00(c10743oA0G.A00()), 0).A0H();
                            case -685620679:
                                if (str2.equals(strA010)) {
                                    b4 = 1;
                                } else {
                                    b4 = -1;
                                }
                                switch (b4) {
                                    case 0:
                                    case 1:
                                    case 2:
                                        c10743oA0G.A09(2);
                                        break;
                                    case 3:
                                    case 4:
                                    case 5:
                                        c10743oA0G.A09(0);
                                        break;
                                    default:
                                        c10743oA0G.A09(1);
                                        break;
                                }
                                C10743o cue2 = c10743oA0G.A04(A00(c10743oA0G.A01()));
                                return cue2.A07(A00(c10743oA0G.A00()), 0).A0H();
                            case -685620648:
                                if (str2.equals(strA09)) {
                                    b4 = 2;
                                } else {
                                    b4 = -1;
                                }
                                switch (b4) {
                                    case 0:
                                    case 1:
                                    case 2:
                                        c10743oA0G.A09(2);
                                        break;
                                    case 3:
                                    case 4:
                                    case 5:
                                        c10743oA0G.A09(0);
                                        break;
                                    default:
                                        c10743oA0G.A09(1);
                                        break;
                                }
                                C10743o cue3 = c10743oA0G.A04(A00(c10743oA0G.A01()));
                                return cue3.A07(A00(c10743oA0G.A00()), 0).A0H();
                            case -685620617:
                                if (str2.equals(strA08)) {
                                    b4 = 6;
                                } else {
                                    b4 = -1;
                                }
                                switch (b4) {
                                    case 0:
                                    case 1:
                                    case 2:
                                        c10743oA0G.A09(2);
                                        break;
                                    case 3:
                                    case 4:
                                    case 5:
                                        c10743oA0G.A09(0);
                                        break;
                                    default:
                                        c10743oA0G.A09(1);
                                        break;
                                }
                                C10743o cue4 = c10743oA0G.A04(A00(c10743oA0G.A01()));
                                return cue4.A07(A00(c10743oA0G.A00()), 0).A0H();
                            case -685620586:
                                if (str2.equals(strA07)) {
                                    b4 = 7;
                                } else {
                                    b4 = -1;
                                }
                                switch (b4) {
                                    case 0:
                                    case 1:
                                    case 2:
                                        c10743oA0G.A09(2);
                                        break;
                                    case 3:
                                    case 4:
                                    case 5:
                                        c10743oA0G.A09(0);
                                        break;
                                    default:
                                        c10743oA0G.A09(1);
                                        break;
                                }
                                C10743o cue5 = c10743oA0G.A04(A00(c10743oA0G.A01()));
                                return cue5.A07(A00(c10743oA0G.A00()), 0).A0H();
                            case -685620555:
                                boolean zEquals = str2.equals(strA06);
                                if (A03[2].charAt(27) != 'i') {
                                    A03[6] = "bPzv";
                                    if (zEquals) {
                                        b4 = 8;
                                    } else {
                                        b4 = -1;
                                    }
                                } else {
                                    A03[6] = "UHPaLodBHWPdzWPsqAutdz";
                                    if (zEquals) {
                                        b4 = 8;
                                    } else {
                                        b4 = -1;
                                    }
                                }
                                switch (b4) {
                                    case 0:
                                    case 1:
                                    case 2:
                                        c10743oA0G.A09(2);
                                        break;
                                    case 3:
                                    case 4:
                                    case 5:
                                        c10743oA0G.A09(0);
                                        break;
                                    default:
                                        c10743oA0G.A09(1);
                                        break;
                                }
                                C10743o cue6 = c10743oA0G.A04(A00(c10743oA0G.A01()));
                                return cue6.A07(A00(c10743oA0G.A00()), 0).A0H();
                            case -685620524:
                                if (str2.equals(strA05)) {
                                    b4 = 3;
                                } else {
                                    b4 = -1;
                                }
                                switch (b4) {
                                    case 0:
                                    case 1:
                                    case 2:
                                        c10743oA0G.A09(2);
                                        break;
                                    case 3:
                                    case 4:
                                    case 5:
                                        c10743oA0G.A09(0);
                                        break;
                                    default:
                                        c10743oA0G.A09(1);
                                        break;
                                }
                                C10743o cue7 = c10743oA0G.A04(A00(c10743oA0G.A01()));
                                return cue7.A07(A00(c10743oA0G.A00()), 0).A0H();
                            case -685620493:
                                boolean zEquals2 = str2.equals(strA04);
                                if (A03[5].length() != 0) {
                                    throw new RuntimeException();
                                }
                                A03[7] = "M45Jq4jKyA2H1maO39BtbvDEugCoSizz";
                                if (zEquals2) {
                                    b4 = 4;
                                } else {
                                    b4 = -1;
                                }
                                switch (b4) {
                                    case 0:
                                    case 1:
                                    case 2:
                                        c10743oA0G.A09(2);
                                        break;
                                    case 3:
                                    case 4:
                                    case 5:
                                        c10743oA0G.A09(0);
                                        break;
                                    default:
                                        c10743oA0G.A09(1);
                                        break;
                                }
                                C10743o cue8 = c10743oA0G.A04(A00(c10743oA0G.A01()));
                                return cue8.A07(A00(c10743oA0G.A00()), 0).A0H();
                            case -685620462:
                                if (str2.equals(strA03)) {
                                    b4 = 5;
                                } else {
                                    b4 = -1;
                                }
                                switch (b4) {
                                    case 0:
                                    case 1:
                                    case 2:
                                        c10743oA0G.A09(2);
                                        break;
                                    case 3:
                                    case 4:
                                    case 5:
                                        c10743oA0G.A09(0);
                                        break;
                                    default:
                                        c10743oA0G.A09(1);
                                        break;
                                }
                                C10743o cue9 = c10743oA0G.A04(A00(c10743oA0G.A01()));
                                return cue9.A07(A00(c10743oA0G.A00()), 0).A0H();
                            default:
                                b4 = -1;
                                switch (b4) {
                                    case 0:
                                    case 1:
                                    case 2:
                                        c10743oA0G.A09(2);
                                        break;
                                    case 3:
                                    case 4:
                                    case 5:
                                        c10743oA0G.A09(0);
                                        break;
                                    default:
                                        c10743oA0G.A09(1);
                                        break;
                                }
                                C10743o cue10 = c10743oA0G.A04(A00(c10743oA0G.A01()));
                                return cue10.A07(A00(c10743oA0G.A00()), 0).A0H();
                        }
                    }

                    private String A04(String str2, ArrayList<String> arrayList) {
                        String strTrim = str2.trim();
                        int i2 = 0;
                        StringBuilder sb = new StringBuilder(strTrim);
                        Matcher matcher = A04.matcher(strTrim);
                        while (matcher.find()) {
                            String strGroup = matcher.group();
                            arrayList.add(strGroup);
                            int tagLength = matcher.start() - i2;
                            int start = strGroup.length();
                            sb.replace(tagLength, tagLength + start, A03(0, 0, 37));
                            i2 += start;
                        }
                        return sb.toString();
                    }

                    private Charset A05(C11074v c11074v) {
                        Charset charset = c11074v.A0Z();
                        return charset != null ? charset : AbstractC2497k9.A05;
                    }

                    @Override // com.facebook.ads.redexgen.core.C8T
                    public final InterfaceC1464Jj A0g(byte[] bArr, int i2, boolean z2) {
                        String strA03 = A03(53, 13, 118);
                        ArrayList arrayList = new ArrayList();
                        C10934h c10934h = new C10934h();
                        C11074v c11074v = new C11074v(bArr, i2);
                        Charset charsetA05 = A05(c11074v);
                        while (true) {
                            String strA0Y = c11074v.A0Y(charsetA05);
                            if (strA0Y == null) {
                                break;
                            }
                            if (strA0Y.length() != 0) {
                                try {
                                    Integer.parseInt(strA0Y);
                                    String strA0Y2 = c11074v.A0Y(charsetA05);
                                    if (strA0Y2 == null) {
                                        if (A03[0].length() == 19) {
                                            A03[6] = "HJ3yDRHWzcPXInAXvwJ005QsJz";
                                            AbstractC10924g.A07(strA03, A03(66, 14, 91));
                                            break;
                                        }
                                    } else {
                                        Matcher matcher = A05.matcher(strA0Y2);
                                        if (matcher.matches()) {
                                            c10934h.A04(A01(matcher, 1));
                                            if (A03[6].length() != 8) {
                                                A03[5] = "";
                                                c10934h.A04(A01(matcher, 6));
                                                this.A00.setLength(0);
                                                this.A01.clear();
                                                for (String strA0Y3 = c11074v.A0Y(charsetA05); !TextUtils.isEmpty(strA0Y3); strA0Y3 = c11074v.A0Y(charsetA05)) {
                                                    if (this.A00.length() > 0) {
                                                        this.A00.append(A03(0, 4, 46));
                                                    }
                                                    this.A00.append(A04(strA0Y3, this.A01));
                                                }
                                                Spanned spannedFromHtml = Html.fromHtml(this.A00.toString());
                                                String alignmentTag = null;
                                                for (int i3 = 0; i3 < this.A01.size(); i3++) {
                                                    String str2 = this.A01.get(i3);
                                                    if (A03[5].length() != 0) {
                                                        if (str2.matches(A03(174, 13, 24))) {
                                                            alignmentTag = str2;
                                                            break;
                                                        }
                                                    } else {
                                                        A03[5] = "";
                                                        if (str2.matches(A03(174, 13, 24))) {
                                                            alignmentTag = str2;
                                                            break;
                                                        }
                                                    }
                                                }
                                                arrayList.add(A02(spannedFromHtml, alignmentTag));
                                                arrayList.add(C2810pT.A0J);
                                            }
                                        } else {
                                            AbstractC10924g.A07(strA03, A03(28, 25, 70) + strA0Y2);
                                        }
                                    }
                                    throw new RuntimeException();
                                } catch (NumberFormatException unused) {
                                    AbstractC10924g.A07(strA03, A03(4, 24, 97) + strA0Y);
                                }
                            }
                        }
                        return new C2586ld((C2810pT[]) arrayList.toArray(new C2810pT[0]), c10934h.A05());
                    }
                };
            case 5:
                final List<byte[]> list = c2860qI.A0X;
                return new C8T(list) { // from class: com.facebook.ads.redexgen.X.1O
                    public static byte[] A07;
                    public static String[] A08 = {"1x7tMScy3OwIpxpoM6szN", "Vc9HgGpBlB6xOFpUGzWjKY6X9B2Kx", "Pa2y8LS5d14E5c2iioTa3o6alel444yu", "nvl8EzHImhNd4skDgpAF61hzJTcSqLGr", "i0VKuTBNrkqino8Xl71fJI1fPr2JZBLb", "b0kCsBlNmzlDPYQHWIClkO446cJaLVwv", "T6LNoF", "e0xJgOhUsx7"};
                    public final float A00;
                    public final int A01;
                    public final int A02;
                    public final int A03;
                    public final C11074v A04;
                    public final String A05;
                    public final boolean A06;

                    public static String A00(int i2, int i3, int i4) {
                        byte[] bArrCopyOfRange = Arrays.copyOfRange(A07, i2, i2 + i3);
                        int i5 = 0;
                        while (true) {
                            int length = bArrCopyOfRange.length;
                            String[] strArr = A08;
                            if (strArr[5].charAt(1) != strArr[4].charAt(1)) {
                                throw new RuntimeException();
                            }
                            A08[7] = "yGrIv6QCmXhG";
                            if (i5 >= length) {
                                return new String(bArrCopyOfRange);
                            }
                            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] - i4) - 85);
                            i5++;
                        }
                    }

                    public static void A02() {
                        A07 = new byte[]{-36, -45, -15, -16, -45, 24, 33, 23, -45, -37, -21, -30, 54, 49, -30, 37, 55, 39, 22, 39, 58, 54, -16, 46, 39, 48, 41, 54, 42, -22, -21, -30, -22, -51, -46, 19, 49, 56, 57, 60, 51, 56, 49, -22, 61, 62, 67, 54, -22, 65, 51, 62, 50, -22, 61, 62, 43, 60, 62, -22, -14, -48, -30, -17, -26, -29, 20, 50, 53, 46, 35, 33, 52, 41, 46, 39, -32, 51, 52, 57, 44, -32, 37, 46, 36, -32, -24, 25, 61, -8, 44, 9, 42, 40, 52, 41, 42, 55, -48, -23, -32, -13, -21, -32, -34, -17, -32, -33, -101, -18, -16, -35, -17, -28, -17, -25, -32, -101, -31, -22, -19, -24, -36, -17, -87, 15, -3, 10, 15, -55, 15, 1, 14, 5, 2, -31, -45, -32, -41, -44};
                    }

                    static {
                        A02();
                    }

                    {
                        super(A00(87, 11, 112));
                        this.A04 = new C11074v();
                        int size = list.size();
                        String strA00 = A00(125, 10, 71);
                        if (size == 1 && (list.get(0).length == 48 || list.get(0).length == 53)) {
                            byte[] bArr = list.get(0);
                            this.A03 = bArr[24];
                            this.A02 = ((bArr[26] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 24) | ((bArr[27] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 16) | ((bArr[28] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8) | (bArr[29] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED);
                            this.A05 = A00(61, 5, 40).equals(C5C.A0r(bArr, 43, bArr.length - 43)) ? A00(135, 5, 25) : strA00;
                            this.A01 = bArr[25] * 20;
                            this.A06 = (bArr[0] & 32) != 0;
                            if (this.A06) {
                                int requestedVerticalPlacement = ((bArr[10] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8) | (bArr[11] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED);
                                this.A00 = C5C.A00(requestedVerticalPlacement / this.A01, 0.0f, 0.95f);
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

                    public static String A01(C11074v c11074v) throws C2592lj {
                        A07(c11074v.A07() >= 2);
                        int bomSize = c11074v.A0M();
                        if (bomSize == 0) {
                            return A00(0, 0, 4);
                        }
                        int iA09 = c11074v.A09();
                        Charset charsetA0Z = c11074v.A0Z();
                        int textLength = c11074v.A09();
                        int bomSize2 = bomSize - (textLength - iA09);
                        if (charsetA0Z == null) {
                            charsetA0Z = AbstractC2497k9.A05;
                        }
                        return c11074v.A0X(bomSize2, charsetA0Z);
                    }

                    public static void A03(SpannableStringBuilder spannableStringBuilder, int i2, int i3, int i4, int i5, int i6) {
                        if (i2 != i3) {
                            int colorArgb = i6 | 33;
                            spannableStringBuilder.setSpan(new ForegroundColorSpan(((i2 & 255) << 24) | (i2 >>> 8)), i4, i5, colorArgb);
                        }
                    }

                    public static void A04(SpannableStringBuilder spannableStringBuilder, int i2, int i3, int i4, int i5, int i6) {
                        if (i2 != i3) {
                            int i7 = i6 | 33;
                            int i8 = i2 & 1;
                            String[] strArr = A08;
                            String str2 = strArr[5];
                            String str3 = strArr[4];
                            int iCharAt = str2.charAt(1);
                            int flags = str3.charAt(1);
                            if (iCharAt != flags) {
                                throw new RuntimeException();
                            }
                            String[] strArr2 = A08;
                            strArr2[0] = "CK5gR0nAI76s8EUE0bHGc";
                            strArr2[6] = "a3HU5o";
                            boolean z2 = i8 != 0;
                            int flags2 = i2 & 2;
                            boolean z3 = flags2 != 0;
                            if (z2) {
                                if (z3) {
                                    spannableStringBuilder.setSpan(new StyleSpan(3), i4, i5, i7);
                                } else {
                                    spannableStringBuilder.setSpan(new StyleSpan(1), i4, i5, i7);
                                }
                            } else if (z3) {
                                spannableStringBuilder.setSpan(new StyleSpan(2), i4, i5, i7);
                            }
                            int flags3 = i2 & 4;
                            boolean z4 = flags3 != 0;
                            if (z4) {
                                spannableStringBuilder.setSpan(new UnderlineSpan(), i4, i5, i7);
                            }
                            if (!z4 && !z2 && !z3) {
                                spannableStringBuilder.setSpan(new StyleSpan(0), i4, i5, i7);
                            }
                        }
                    }

                    public static void A05(SpannableStringBuilder spannableStringBuilder, String str2, int i2, int i3) {
                        if (str2 != A00(125, 10, 71)) {
                            spannableStringBuilder.setSpan(new TypefaceSpan(str2), i2, i3, 16711713);
                        }
                    }

                    private void A06(C11074v c11074v, SpannableStringBuilder spannableStringBuilder) throws C2592lj {
                        A07(c11074v.A07() >= 12);
                        int fontFace = c11074v.A0M();
                        int iA0M = c11074v.A0M();
                        c11074v.A0g(2);
                        int iA0I = c11074v.A0I();
                        c11074v.A0g(1);
                        int iA0C = c11074v.A0C();
                        int length = spannableStringBuilder.length();
                        String strA00 = A00(33, 2, 79);
                        String strA01 = A00(87, 11, 112);
                        if (iA0M > length) {
                            StringBuilder sbAppend = new StringBuilder().append(A00(66, 21, 107)).append(iA0M).append(A00(10, 23, 109));
                            int start = spannableStringBuilder.length();
                            AbstractC10924g.A07(strA01, sbAppend.append(start).append(strA00).toString());
                            iA0M = spannableStringBuilder.length();
                        }
                        if (fontFace < iA0M) {
                            A04(spannableStringBuilder, iA0I, this.A03, fontFace, iA0M, 0);
                            A03(spannableStringBuilder, iA0C, this.A02, fontFace, iA0M, 0);
                        } else {
                            AbstractC10924g.A07(strA01, A00(35, 26, 117) + fontFace + A00(0, 10, 94) + iA0M + strA00);
                        }
                    }

                    public static void A07(boolean z2) throws C2592lj {
                        if (z2) {
                        } else {
                            throw new C2592lj(A00(98, 27, 38));
                        }
                    }

                    /* JADX WARN: Code duplicated, block: B:24:0x00b7  */
                    /* JADX WARN: Code duplicated, block: B:26:0x00cb  */
                    /* JADX WARN: Code duplicated, block: B:30:0x00ef  */
                    /* JADX WARN: Code duplicated, block: B:33:0x0102  */
                    @Override // com.facebook.ads.redexgen.core.C8T
                    public final InterfaceC1464Jj A0g(byte[] bArr, int i2, boolean z2) throws C2592lj {
                        C11074v c11074v;
                        String str2;
                        String cueTextString;
                        this.A04.A0j(bArr, i2);
                        String strA01 = A01(this.A04);
                        if (strA01.isEmpty()) {
                            return C2584lb.A02;
                        }
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(strA01);
                        A04(spannableStringBuilder, this.A03, 0, 0, spannableStringBuilder.length(), 16711680);
                        A03(spannableStringBuilder, this.A02, -1, 0, spannableStringBuilder.length(), 16711680);
                        A05(spannableStringBuilder, this.A05, 0, spannableStringBuilder.length());
                        float fA00 = this.A00;
                        while (this.A04.A07() >= 8) {
                            int atomSize = this.A04.A09();
                            int iA0C = this.A04.A0C();
                            int iA0C2 = this.A04.A0C();
                            boolean z3 = true;
                            if (iA0C2 == 1937013100) {
                                int iA07 = this.A04.A07();
                                String[] strArr = A08;
                                String str3 = strArr[0];
                                String cueTextString2 = strArr[6];
                                if (str3.length() == cueTextString2.length()) {
                                    throw new RuntimeException();
                                }
                                String[] strArr2 = A08;
                                strArr2[0] = "Z2UJzHF8zneH9ag5NgWte";
                                strArr2[6] = "yNPyx5";
                                A07(iA07 >= 2);
                                int position = this.A04.A0M();
                                for (int i3 = 0; i3 < position; i3++) {
                                    A06(this.A04, spannableStringBuilder);
                                }
                            } else if (iA0C2 == 1952608120) {
                                boolean z4 = this.A06;
                                String cueTextString3 = A08[1];
                                if (cueTextString3.length() == 29) {
                                    A08[1] = "paw5WSKbqYtpnsyQNjpQb8Noh3AWg";
                                    if (z4) {
                                        c11074v = this.A04;
                                        String[] strArr3 = A08;
                                        str2 = strArr3[2];
                                        cueTextString = strArr3[3];
                                        if (str2.length() != cueTextString.length()) {
                                            String[] strArr4 = A08;
                                            strArr4[0] = "wTXVya3nfhs0Hhsed0pql";
                                            strArr4[6] = "bT1NwA";
                                            if (c11074v.A07() < 2) {
                                                z3 = false;
                                            }
                                        } else if (c11074v.A07() < 2) {
                                            z3 = false;
                                        }
                                        A07(z3);
                                        fA00 = C5C.A00(this.A04.A0M() / this.A01, 0.0f, 0.95f);
                                    }
                                } else if (z4) {
                                    c11074v = this.A04;
                                    String[] strArr5 = A08;
                                    str2 = strArr5[2];
                                    cueTextString = strArr5[3];
                                    if (str2.length() != cueTextString.length()) {
                                        String[] strArr6 = A08;
                                        strArr6[0] = "wTXVya3nfhs0Hhsed0pql";
                                        strArr6[6] = "bT1NwA";
                                        if (c11074v.A07() < 2) {
                                            z3 = false;
                                        }
                                    } else if (c11074v.A07() < 2) {
                                        z3 = false;
                                    }
                                    A07(z3);
                                    fA00 = C5C.A00(this.A04.A0M() / this.A01, 0.0f, 0.95f);
                                }
                            }
                            this.A04.A0f(atomSize + iA0C);
                        }
                        return new C2584lb(new C10743o().A0G(spannableStringBuilder).A07(fA00, 0).A09(0).A0H());
                    }
                };
            case 6:
            case 7:
                return new C1X(c2860qI.A0W, c2860qI.A03, -9223372036854775807L);
            case 8:
                final int i2 = c2860qI.A03;
                final List list2 = null;
                return new C8M(i2, list2) { // from class: com.facebook.ads.redexgen.X.1W
                    public static byte[] A0B;
                    public static String[] A0C = {"StgEnyZrIiHukKZI2mjNBpxMfWWHoY2N", "pPiD", "4nUZoZtFS8Fi7y", "soUNpDdTYgeZzoXYzwhXpymROnExsdJX", "jQfRXI2O9AZyEok5vhLK2LNFq5CUiSFO", "NRbI1hfkyM6vnftXJILRzJXuHgspnZLF", "iSpRtaxsShIsoCeM", "S"};
                    public int A00;
                    public C1470Jp A02;
                    public C1471Jq A03;
                    public List<C2810pT> A04;
                    public List<C2810pT> A05;
                    public final int A06;
                    public final boolean A09;
                    public final C1470Jp[] A0A;
                    public final C11074v A08 = new C11074v();
                    public final C11064u A07 = new C11064u();
                    public int A01 = -1;

                    public static String A00(int i3, int i4, int i5) {
                        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0B, i3, i3 + i4);
                        int i6 = 0;
                        while (true) {
                            int length = bArrCopyOfRange.length;
                            String[] strArr = A0C;
                            if (strArr[2].length() == strArr[7].length()) {
                                throw new RuntimeException();
                            }
                            A0C[1] = "zpnW";
                            if (i6 >= length) {
                                return new String(bArrCopyOfRange);
                            }
                            bArrCopyOfRange[i6] = (byte) ((bArrCopyOfRange[i6] - i5) - 124);
                            i6++;
                        }
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
                        int iA01 = C1470Jp.A01(this.A07.A04(2), this.A07.A04(2), this.A07.A04(2), this.A07.A04(2));
                        int iA02 = C1470Jp.A01(this.A07.A04(2), this.A07.A04(2), this.A07.A04(2), this.A07.A04(2));
                        this.A07.A09(2);
                        this.A02.A0B(iA01, iA02, C1470Jp.A00(this.A07.A04(2), this.A07.A04(2), this.A07.A04(2)));
                    }

                    /* JADX WARN: Failed to parse debug info
                    java.lang.ArrayIndexOutOfBoundsException
                     */
                    private void A06() {
                        int iA01 = C1470Jp.A01(this.A07.A04(2), this.A07.A04(2), this.A07.A04(2), this.A07.A04(2));
                        int iA04 = this.A07.A04(2);
                        int iA00 = C1470Jp.A00(this.A07.A04(2), this.A07.A04(2), this.A07.A04(2));
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
                        A0B = new byte[]{3, 11, 86, 72, 84, 88, 72, 81, 70, 72, 3, 81, 88, 80, 69, 72, 85, 3, 22, 89, 107, 104, 104, 91, 100, 106, 51, -5, -14, 73, 58, 55, 64, -14, 52, 62, 65, 53, 61, 37, 59, 76, 55, -14, 59, 69, -14, 2, 32, 50, 4, -8, 58, 77, 76, -8, 59, 77, 74, 74, 61, 70, 76, -8, 65, 70, 60, 61, 80, -8, 65, 75, -8, 8, 42, 38, -4, -11, -3, 9, 42, 40, 52, 41, 42, 55, 19, 69, 66, 66, 53, 62, 68, 60, 73, -16, 69, 62, 67, 69, 64, 64, 63, 66, 68, 53, 52, -16, 19, 31, 29, 29, 17, 30, 20, 47, 21, 40, 36, 1, -16, 19, 63, 61, 61, 49, 62, 52, 10, -16, -42, 8, 5, 5, -8, 1, 7, -1, 12, -77, 8, 1, 6, 8, 3, 3, 2, 5, 7, -8, -9, -77, -42, -30, -32, -32, -44, -31, -41, -14, -29, -60, -55, -77, -42, 2, 0, 0, -12, 1, -9, -51, -77, -52, -4, -2, -53, -21, -40, -23, -21, -13, -19, -4, -88, -19, -10, -20, -19, -20, -88, -8, -6, -19, -11, -23, -4, -3, -6, -19, -12, 1, -61, -88, -5, -15, 2, -19, -88, -15, -5, -88, 22, 63, 52, 64, 70, 63, 69, 54, 67, 54, 53, -15, 21, 37, 39, 20, 20, 48, 33, 18, 20, 28, 22, 37, 48, 21, 18, 37, 18, -15, 51, 54, 55, 64, 67, 54, -15, 21, 37, 39, 20, 20, 48, 33, 18, 20, 28, 22, 37, 48, 36, 37, 18, 35, 37, 8, 45, 53, 32, 43, 40, 35, -33, 2, -17, -33, 34, 46, 44, 44, 32, 45, 35, -7, -33, 49, 86, 94, 73, 84, 81, 76, 8, 43, 25, 8, 75, 87, 85, 85, 73, 86, 76, 34, 8, -7, 30, 38, 17, 28, 25, 20, -48, -9, -30, -48, 19, 24, 17, 34, 17, 19, 36, 21, 34, -22, -48, -55, -18, -10, -31, -20, -23, -28, -96, -57, -77, -96, -29, -24, -31, -14, -31, -29, -12, -27, -14, -70, -96, -53, -16, -8, -29, -18, -21, -26, -94, -28, -29, -11, -25, -94, -27, -15, -17, -17, -29, -16, -26, -68, -94, -28, 9, 17, -4, 7, 4, -1, -69, 0, 19, 15, 0, 9, -1, 0, -1, -69, -2, 10, 8, 8, -4, 9, -1, -43, -69, -7, 30, 38, 17, 28, 25, 20, -48, 21, 40, 36, 21, 30, 20, 21, 20, -48, 35, 21, 34, 38, 25, 19, 21, -48, 30, 37, 29, 18, 21, 34, -22, -48, 42, 60, 72, 76, 60, 69, 58, 60, -9, 69, 76, 68, 57, 60, 73, -9, 59, 64, 74, 58, 70, 69, 75, 64, 69, 76, 64, 75, 80, 5, -9, 71, 73, 60, 77, 64, 70, 76, 74, 20, 66, 52, 65, 69, 56, 50, 52, 29, 68, 60, 49, 52, 65, -17, 56, 66, -17, 61, 62, 61, -4, 73, 52, 65, 62, -17, -9};
                    }

                    /* JADX WARN: Failed to parse debug info
                    java.lang.ArrayIndexOutOfBoundsException
                     */
                    private void A0E(int i3) {
                        C1470Jp c1470Jp = this.A0A[i3];
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
                        c1470Jp.A0F(zA0H, zA0H2, zA0H3, iA04, zA0H4, iA05, iA06, iA08, iA09, iA07, this.A07.A04(3), this.A07.A04(3));
                    }

                    static {
                        A09();
                    }

                    {
                        this.A06 = i2 == -1 ? 1 : i2;
                        this.A09 = list2 != null && AnonymousClass46.A06(list2);
                        this.A0A = new C1470Jp[8];
                        for (int i3 = 0; i3 < 8; i3++) {
                            this.A0A[i3] = new C1470Jp();
                        }
                        this.A02 = this.A0A[0];
                    }

                    private List<C2810pT> A01() {
                        C1469Jo c1469JoA05;
                        ArrayList arrayList = new ArrayList();
                        int i3 = 0;
                        while (i == 111) {
                            A0C[6] = "prFtgZEgycD";
                            if (i3 < 8) {
                                if (!this.A0A[i3].A0H() && this.A0A[i3].A0I() && (c1469JoA05 = this.A0A[i3].A05()) != null) {
                                    arrayList.add(c1469JoA05);
                                }
                                i3++;
                            } else {
                                Collections.sort(arrayList, C1469Jo.A02);
                                ArrayList arrayList2 = new ArrayList(arrayList.size());
                                for (int i4 = 0; i4 < arrayList.size(); i4++) {
                                    arrayList2.add(((C1469Jo) arrayList.get(i4)).A01);
                                }
                                return Collections.unmodifiableList(arrayList2);
                            }
                        }
                        throw new RuntimeException();
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

                    @RequiresNonNull({"currentDtvCcPacket"})
                    private void A07() {
                        int iA03;
                        int i3 = this.A03.A00;
                        int i4 = (this.A03.A01 * 2) - 1;
                        String strA00 = A00(73, 13, 73);
                        if (i3 != i4) {
                            AbstractC10924g.A04(strA00, A00(TTAdConstant.IMAGE_MODE_VERTICAL_IMG_173, 39, 12) + ((this.A03.A01 * 2) - 1) + A00(50, 23, 92) + this.A03.A00 + A00(0, 18, 103) + this.A03.A02 + A00(48, 2, 123));
                        }
                        boolean z2 = false;
                        this.A07.A0E(this.A03.A03, this.A03.A00);
                        while (this.A07.A01() > 0) {
                            int iA04 = this.A07.A04(3);
                            int command = this.A07.A04(5);
                            if (iA04 == 7) {
                                this.A07.A09(2);
                                iA04 = this.A07.A04(6);
                                if (iA04 < 7) {
                                    AbstractC10924g.A07(strA00, A00(399, 33, 52) + iA04);
                                }
                            }
                            if (command == 0) {
                                if (iA04 == 0) {
                                    break;
                                }
                                AbstractC10924g.A07(strA00, A00(472, 27, 83) + iA04 + A00(27, 21, 86));
                                break;
                            }
                            int i5 = this.A06;
                            int serviceNumber = A0C[5].charAt(13);
                            if (serviceNumber == 102) {
                                String[] strArr = A0C;
                                strArr[2] = "MRR8KxsQlbp3Ig";
                                strArr[7] = "Q";
                                if (iA04 != i5) {
                                    C11064u c11064u = this.A07;
                                    int serviceNumber2 = A0C[0].charAt(19);
                                    if (serviceNumber2 == 78) {
                                        A0C[0] = "hkixqgWbeZd8Awyy7Q6N0KpGxYgVXqbw";
                                        c11064u.A0A(command);
                                    }
                                } else {
                                    C11064u c11064u2 = this.A07;
                                    int serviceNumber3 = A0C[6].length();
                                    if (serviceNumber3 != 3) {
                                        A0C[6] = "3dsCRaEhFxrSmzAmtZA59dB";
                                        iA03 = c11064u2.A03() + (command * 8);
                                    } else {
                                        A0C[1] = "SHH7";
                                        iA03 = c11064u2.A03() + (command * 6);
                                    }
                                    while (this.A07.A03() < iA03) {
                                        int iA05 = this.A07.A04(8);
                                        if (iA05 != 16) {
                                            if (iA05 <= 31) {
                                                A0A(iA05);
                                            } else if (iA05 <= 127) {
                                                A0F(iA05);
                                                z2 = true;
                                            } else if (iA05 <= 159) {
                                                A0B(iA05);
                                                z2 = true;
                                            } else if (iA05 <= 255) {
                                                A0G(iA05);
                                                z2 = true;
                                            } else {
                                                AbstractC10924g.A07(strA00, A00(351, 22, 6) + iA05);
                                            }
                                        } else {
                                            C11064u c11064u3 = this.A07;
                                            int serviceNumber4 = A0C[5].charAt(13);
                                            if (serviceNumber4 == 102) {
                                                A0C[6] = "9u6P";
                                                int iA06 = c11064u3.A04(8);
                                                if (iA06 <= 31) {
                                                    A0C(iA06);
                                                } else if (iA06 <= 127) {
                                                    A0H(iA06);
                                                    z2 = true;
                                                } else if (iA06 <= 159) {
                                                    A0D(iA06);
                                                } else if (iA06 <= 255) {
                                                    A0I(iA06);
                                                    z2 = true;
                                                } else {
                                                    AbstractC10924g.A07(strA00, A00(373, 26, 31) + iA06);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            throw new RuntimeException();
                        }
                        if (z2) {
                            this.A04 = A01();
                        }
                    }

                    private void A08() {
                        for (int i3 = 0; i3 < 8; i3++) {
                            this.A0A[i3].A08();
                        }
                    }

                    private void A0A(int i3) {
                        switch (i3) {
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
                                C1470Jp c1470Jp = this.A02;
                                if (A0C[1].length() == 4) {
                                    A0C[4] = "FGYJlLquXUr7pMFj0Rb0j1D1hbYlwPR1";
                                    c1470Jp.A09('\n');
                                    return;
                                }
                                break;
                            default:
                                String strA00 = A00(73, 13, 73);
                                if (i3 >= 17 && i3 <= 23) {
                                    AbstractC10924g.A07(strA00, A00(86, 44, 84) + i3);
                                    this.A07.A09(8);
                                    return;
                                } else if (A0C[1].length() == 4) {
                                    A0C[0] = "tIivKyJ4yVQrhz6naHsNX4hATBwVD1SZ";
                                    if (i3 >= 24 && i3 <= 31) {
                                        AbstractC10924g.A07(strA00, A00(130, 43, 23) + i3);
                                        this.A07.A09(16);
                                        return;
                                    } else {
                                        AbstractC10924g.A07(strA00, A00(267, 20, 67) + i3);
                                        return;
                                    }
                                }
                                break;
                        }
                        throw new RuntimeException();
                    }

                    /* JADX WARN: Code duplicated, block: B:64:0x014f  */
                    private void A0B(int i3) {
                        switch (i3) {
                            case 128:
                            case 129:
                            case 130:
                            case 131:
                            case OMSDK_DOWNLOAD_JS_ERROR_VALUE:
                            case OMSDK_JS_WRITE_FAILED_VALUE:
                            case 134:
                            case 135:
                                int i4 = i3 - 128;
                                int window = this.A00;
                                if (window == i4) {
                                    return;
                                }
                                this.A00 = i4;
                                this.A02 = this.A0A[i4];
                                return;
                            case PRIVACY_URL_ERROR_VALUE:
                                for (int i5 = 1; i5 <= 8; i5++) {
                                    boolean zA0H = this.A07.A0H();
                                    if (A0C[4].charAt(20) != 'R') {
                                        A0C[4] = "wmiXxVCO1pDCphTe66oY7BPOwyAFxX93";
                                        if (zA0H) {
                                            int i6 = 8 - i5;
                                            this.A0A[i6].A07();
                                        }
                                    } else {
                                        A0C[3] = "RojSNoyJye4svFAgcf8I6qfTjBFYUXnP";
                                        if (zA0H) {
                                            int i7 = 8 - i5;
                                            this.A0A[i7].A07();
                                        }
                                    }
                                }
                                return;
                            case TPAT_RETRY_FAILED_VALUE:
                                for (int i8 = 1; i8 <= 8; i8++) {
                                    if (this.A07.A0H()) {
                                        int i9 = 8 - i8;
                                        this.A0A[i9].A0E(true);
                                    }
                                }
                                return;
                            case 138:
                                for (int i10 = 1; i10 <= 8; i10++) {
                                    if (this.A07.A0H()) {
                                        int i11 = 8 - i10;
                                        this.A0A[i11].A0E(false);
                                    }
                                }
                                return;
                            case 139:
                                for (int i12 = 1; i12 <= 8; i12++) {
                                    if (this.A07.A0H()) {
                                        int i13 = 8 - i12;
                                        C1470Jp c1470Jp = this.A0A[i13];
                                        c1470Jp.A0E(!c1470Jp.A0I());
                                    }
                                }
                                return;
                            case 140:
                                for (int i14 = 1; i14 <= 8; i14++) {
                                    if (this.A07.A0H()) {
                                        int i15 = 8 - i14;
                                        this.A0A[i15].A08();
                                    }
                                }
                                return;
                            case 141:
                                C11064u c11064u = this.A07;
                                if (A0C[3].charAt(1) == 'o') {
                                    A0C[5] = "LOcI8geri01bbfSL3Un4ebrkDtb9fUkR";
                                    c11064u.A09(8);
                                    return;
                                }
                                break;
                            case 142:
                                return;
                            case 143:
                                A08();
                                return;
                            case 144:
                                boolean zA0G = this.A02.A0G();
                                if (A0C[5].charAt(13) == 'f') {
                                    A0C[6] = "3SE5mdYm5uC9wCg4PrUGVOVOhS7UyufG";
                                    if (!zA0G) {
                                        this.A07.A09(16);
                                        return;
                                    } else {
                                        A03();
                                        return;
                                    }
                                }
                                break;
                            case 145:
                                if (!this.A02.A0G()) {
                                    this.A07.A09(24);
                                    return;
                                } else {
                                    A04();
                                    return;
                                }
                            case 146:
                                if (!this.A02.A0G()) {
                                    this.A07.A09(16);
                                    return;
                                } else {
                                    A05();
                                    return;
                                }
                            case 147:
                            case 148:
                            case 149:
                            case 150:
                            default:
                                AbstractC10924g.A07(A00(73, 13, 73), A00(287, 20, 108) + i3);
                                return;
                            case 151:
                                if (!this.A02.A0G()) {
                                    this.A07.A09(32);
                                    return;
                                } else {
                                    A06();
                                    return;
                                }
                            case 152:
                            case 153:
                            case 154:
                            case ModuleDescriptor.MODULE_VERSION /* 155 */:
                            case 156:
                            case 157:
                            case 158:
                            case 159:
                                int i16 = i3 - 152;
                                A0E(i16);
                                int window2 = this.A00;
                                if (window2 == i16) {
                                    return;
                                }
                                this.A00 = i16;
                                this.A02 = this.A0A[i16];
                                return;
                        }
                        throw new RuntimeException();
                    }

                    private void A0C(int i3) {
                        if (i3 <= 7) {
                            return;
                        }
                        if (i3 <= 15) {
                            this.A07.A09(8);
                        } else if (i3 <= 23) {
                            this.A07.A09(16);
                        } else {
                            if (i3 > 31) {
                                return;
                            }
                            this.A07.A09(24);
                        }
                    }

                    private void A0D(int i3) {
                        if (i3 <= 135) {
                            this.A07.A09(32);
                            return;
                        }
                        if (i3 <= 143) {
                            this.A07.A09(40);
                        } else {
                            if (i3 > 159) {
                                return;
                            }
                            this.A07.A09(2);
                            int length = this.A07.A04(6);
                            this.A07.A09(length * 8);
                        }
                    }

                    private void A0F(int i3) {
                        if (i3 == 127) {
                            this.A02.A09((char) 9835);
                        } else {
                            this.A02.A09((char) (i3 & 255));
                        }
                    }

                    private void A0G(int i3) {
                        this.A02.A09((char) (i3 & 255));
                    }

                    private void A0H(int i3) {
                        switch (i3) {
                            case 32:
                                this.A02.A09(' ');
                                return;
                            case 33:
                                this.A02.A09((char) 160);
                                return;
                            case 37:
                                this.A02.A09((char) 8230);
                                return;
                            case 42:
                                this.A02.A09((char) 352);
                                return;
                            case 44:
                                this.A02.A09((char) 338);
                                return;
                            case 48:
                                this.A02.A09((char) 9608);
                                return;
                            case 49:
                                this.A02.A09((char) 8216);
                                return;
                            case 50:
                                C1470Jp c1470Jp = this.A02;
                                if (A0C[6].length() != 3) {
                                    A0C[1] = "dnPp";
                                    c1470Jp.A09((char) 8217);
                                    return;
                                }
                                throw new RuntimeException();
                            case AD_REWARD_USER_VALUE:
                                this.A02.A09((char) 8220);
                                return;
                            case AD_REQUIRED_DOWNLOAD_DURATION_MS_VALUE:
                                this.A02.A09((char) 8221);
                                return;
                            case 53:
                                this.A02.A09((char) 8226);
                                return;
                            case INIT_TO_SUCCESS_CALLBACK_DURATION_MS_VALUE:
                                this.A02.A09((char) 8482);
                                return;
                            case 58:
                                this.A02.A09((char) 353);
                                return;
                            case 60:
                                this.A02.A09((char) 339);
                                return;
                            case APP_BACKGROUND_DURING_AD_LOAD_VALUE:
                                C1470Jp c1470Jp2 = this.A02;
                                if (A0C[0].charAt(19) == 'N') {
                                    A0C[6] = "g2xlw";
                                    c1470Jp2.A09((char) 8480);
                                    return;
                                }
                                break;
                            case AD_PLAY_WITH_PARTIAL_DOWNLOAD_ASSET_VALUE:
                                this.A02.A09((char) 376);
                                return;
                            case 118:
                                this.A02.A09((char) 8539);
                                return;
                            case 119:
                                this.A02.A09((char) 8540);
                                return;
                            case 120:
                                this.A02.A09((char) 8541);
                                return;
                            case 121:
                                this.A02.A09((char) 8542);
                                return;
                            case 122:
                                C1470Jp c1470Jp3 = this.A02;
                                if (A0C[0].charAt(19) == 'N') {
                                    String[] strArr = A0C;
                                    strArr[2] = "AONnD2CR0STnJG";
                                    strArr[7] = "K";
                                    c1470Jp3.A09((char) 9474);
                                    return;
                                }
                                break;
                            case 123:
                                this.A02.A09((char) 9488);
                                return;
                            case 124:
                                this.A02.A09((char) 9492);
                                return;
                            case 125:
                                this.A02.A09((char) 9472);
                                return;
                            case 126:
                                this.A02.A09((char) 9496);
                                return;
                            case 127:
                                this.A02.A09((char) 9484);
                                return;
                            default:
                                AbstractC10924g.A07(A00(73, 13, 73), A00(307, 22, 52) + i3);
                                return;
                        }
                        throw new RuntimeException();
                    }

                    private void A0I(int i3) {
                        if (i3 == 160) {
                            this.A02.A09((char) 13252);
                            return;
                        }
                        AbstractC10924g.A07(A00(73, 13, 73), A00(329, 22, 4) + i3);
                        this.A02.A09('_');
                    }

                    @Override // com.facebook.ads.redexgen.core.C8M
                    /* JADX INFO: renamed from: A0W */
                    public final /* bridge */ /* synthetic */ C8S A5r() throws C2592lj {
                        return super.A5r();
                    }

                    @Override // com.facebook.ads.redexgen.core.C8M
                    /* JADX INFO: renamed from: A0X */
                    public final /* bridge */ /* synthetic */ C8P A5t() throws C2592lj {
                        return super.A5t();
                    }

                    @Override // com.facebook.ads.redexgen.core.C8M
                    public final C2590lh A0Z() {
                        this.A05 = this.A04;
                        return new C2590lh((List) AbstractC10843y.A01(this.A04));
                    }

                    @Override // com.facebook.ads.redexgen.core.C8M
                    /* JADX INFO: renamed from: A0a */
                    public final /* bridge */ /* synthetic */ void AHJ(C8S c8s) throws C2592lj {
                        super.AHJ(c8s);
                    }

                    @Override // com.facebook.ads.redexgen.core.C8M
                    public final void A0b(C8S c8s) {
                        ByteBuffer byteBuffer = (ByteBuffer) AbstractC10843y.A01(c8s.A02);
                        this.A08.A0j(byteBuffer.array(), byteBuffer.limit());
                        while (true) {
                            C11074v c11074v = this.A08;
                            if (A0C[3].charAt(1) != 'o') {
                                throw new RuntimeException();
                            }
                            A0C[5] = "2zTM8NXP9KhrrfnQUZAXf9x7h4oPwvMb";
                            if (c11074v.A07() >= 3) {
                                C11074v c11074v2 = this.A08;
                                if (A0C[6].length() == 3) {
                                    throw new RuntimeException();
                                }
                                A0C[5] = "a4C0oLfpRPdUSfve8yJk6dKzwRXOoh8W";
                                int iA0I = c11074v2.A0I() & 7;
                                int i3 = iA0I & 3;
                                boolean z2 = (iA0I & 4) == 4;
                                byte bA0I = (byte) this.A08.A0I();
                                byte bA0I2 = (byte) this.A08.A0I();
                                if (i3 == 2 || i3 == 3) {
                                    if (z2) {
                                        String strA00 = A00(73, 13, 73);
                                        if (i3 == 3) {
                                            A02();
                                            int i4 = (bA0I & 192) >> 6;
                                            int ccType = this.A01;
                                            if (ccType != -1 && i4 != (this.A01 + 1) % 4) {
                                                A08();
                                                AbstractC10924g.A07(strA00, A00(432, 40, 91) + this.A01 + A00(18, 9, 122) + i4);
                                            }
                                            this.A01 = i4;
                                            int i5 = bA0I & 63;
                                            if (i5 == 0) {
                                                i5 = 64;
                                            }
                                            this.A03 = new C1471Jq(i4, i5);
                                            byte[] inputBufferData = this.A03.A03;
                                            C1471Jq c1471Jq = this.A03;
                                            int i6 = c1471Jq.A00;
                                            c1471Jq.A00 = i6 + 1;
                                            inputBufferData[i6] = bA0I2;
                                        } else {
                                            AbstractC10843y.A07(i3 == 2);
                                            if (this.A03 == null) {
                                                AbstractC10924g.A05(strA00, A00(212, 55, 85));
                                            } else {
                                                byte[] inputBufferData2 = this.A03.A03;
                                                String[] strArr = A0C;
                                                if (strArr[2].length() == strArr[7].length()) {
                                                    throw new RuntimeException();
                                                }
                                                A0C[4] = "YjvVjm4QPcLmngCUKURICEhYITyNXaIl";
                                                C1471Jq c1471Jq2 = this.A03;
                                                int i7 = c1471Jq2.A00;
                                                c1471Jq2.A00 = i7 + 1;
                                                inputBufferData2[i7] = bA0I;
                                                byte[] inputBufferData3 = this.A03.A03;
                                                C1471Jq c1471Jq3 = this.A03;
                                                int i8 = c1471Jq3.A00;
                                                c1471Jq3.A00 = i8 + 1;
                                                inputBufferData3[i8] = bA0I2;
                                            }
                                        }
                                        if (this.A03.A00 == (this.A03.A01 * 2) - 1) {
                                            A02();
                                        }
                                    } else {
                                        continue;
                                    }
                                }
                            } else {
                                return;
                            }
                        }
                    }

                    @Override // com.facebook.ads.redexgen.core.C8M
                    public final boolean A0d() {
                        return this.A04 != this.A05;
                    }

                    @Override // com.facebook.ads.redexgen.core.C8M, com.facebook.ads.redexgen.core.AnonymousClass60
                    public final /* bridge */ /* synthetic */ void AHb() {
                        super.AHb();
                    }

                    @Override // com.facebook.ads.redexgen.core.C8M, com.facebook.ads.redexgen.core.InterfaceC2599lq
                    public final /* bridge */ /* synthetic */ void AJh(long j) {
                        super.AJh(j);
                    }

                    @Override // com.facebook.ads.redexgen.core.C8M, com.facebook.ads.redexgen.core.AnonymousClass60
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
                final List<byte[]> list3 = c2860qI.A0X;
                return new C8T(list3) { // from class: com.facebook.ads.redexgen.X.1T
                    public static byte[] A01;
                    public final K2 A00;

                    static {
                        A01();
                    }

                    /* JADX WARN: Failed to parse debug info
                    java.lang.ArrayIndexOutOfBoundsException
                     */
                    {
                        super(A00(0, 10, 35));
                        C11074v c11074v = new C11074v(list3.get(0));
                        this.A00 = new K2(c11074v.A0M(), c11074v.A0M());
                    }

                    public static String A00(int i3, int i4, int i5) {
                        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i3, i3 + i4);
                        for (int i6 = 0; i6 < bArrCopyOfRange.length; i6++) {
                            bArrCopyOfRange[i6] = (byte) ((bArrCopyOfRange[i6] - i5) - 106);
                        }
                        return new String(bArrCopyOfRange);
                    }

                    public static void A01() {
                        A01 = new byte[]{-47, 3, -17, -47, -14, -16, -4, -15, -14, -1};
                    }

                    @Override // com.facebook.ads.redexgen.core.C8T
                    public final InterfaceC1464Jj A0g(byte[] bArr, int i3, boolean z2) {
                        if (z2) {
                            this.A00.A0J();
                        }
                        return new C2589lg(this.A00.A0I(bArr, i3));
                    }
                };
            case 10:
                return new C8T() { // from class: com.facebook.ads.redexgen.X.1S
                    public static byte[] A04;
                    public static String[] A05 = {"76NlL2uX7lwdFYW1QMx5a8yy6e1HTIfb", "PPHM0li7JhLOVOPCGl5v88MgokGKQYEj", "LiwvhCZeMt7eMvNF2Pj8LYB8xSxq2ldh", "dFyDCM0ueCIxVfSox0aflDZ7gvAI841l", "LzKPlW0IyQE1s7YXIJw5EfFPQg4N9HTr", "CSOqnRNK1RYkqInl5L0si0E", "7S3a0phqj2SDINZS1RTIUWP", "6mBJEewaGVYJqmHVNKA"};
                    public Inflater A00;
                    public final C11074v A01;
                    public final C11074v A02;
                    public final K5 A03;

                    public static String A01(int i3, int i4, int i5) {
                        byte[] bArrCopyOfRange = Arrays.copyOfRange(A04, i3, i3 + i4);
                        int i6 = 0;
                        while (true) {
                            int length = bArrCopyOfRange.length;
                            if (A05[2].charAt(24) != 'x') {
                                throw new RuntimeException();
                            }
                            String[] strArr = A05;
                            strArr[6] = "onjCODWUldEJohp5LCZVLSR";
                            strArr[5] = "Jw3HdCuNfu1JKaBA98S5ZsK";
                            if (i6 >= length) {
                                return new String(bArrCopyOfRange);
                            }
                            bArrCopyOfRange[i6] = (byte) ((bArrCopyOfRange[i6] - i5) - 74);
                            i6++;
                        }
                    }

                    public static void A02() {
                        A04 = new byte[]{-79, -56, -44, -91, -58, -60, -48, -59, -58, -45};
                    }

                    static {
                        A02();
                    }

                    {
                        A01(0, 10, 23);
                        this.A01 = new C11074v();
                        this.A02 = new C11074v();
                        this.A03 = new K5();
                    }

                    public static C2810pT A00(C11074v c11074v, K5 k5) {
                        int limit = c11074v.A0A();
                        int nextSectionPosition = c11074v.A0I();
                        int sectionLength = c11074v.A0M();
                        int sectionType = c11074v.A09() + sectionLength;
                        if (sectionType > limit) {
                            c11074v.A0f(limit);
                            return null;
                        }
                        C2810pT c2810pTA06 = null;
                        switch (nextSectionPosition) {
                            case 20:
                                k5.A02(c11074v, sectionLength);
                                break;
                            case 21:
                                k5.A00(c11074v, sectionLength);
                                break;
                            case 22:
                                k5.A01(c11074v, sectionLength);
                                break;
                            case 128:
                                c2810pTA06 = k5.A06();
                                k5.A07();
                                break;
                        }
                        c11074v.A0f(sectionType);
                        return c2810pTA06;
                    }

                    private void A03(C11074v c11074v) {
                        if (c11074v.A07() > 0 && c11074v.A0B() == 120) {
                            if (this.A00 == null) {
                                this.A00 = new Inflater();
                            }
                            C11074v c11074v2 = this.A02;
                            Inflater inflater = this.A00;
                            if (A05[3].charAt(5) != 'M') {
                                throw new RuntimeException();
                            }
                            A05[2] = "qzpsP6hj6GdiA1o5yIc6icGGxX8HbfHZ";
                            if (C5C.A1D(c11074v, c11074v2, inflater)) {
                                c11074v.A0j(this.A02.A0l(), this.A02.A0A());
                            }
                        }
                    }

                    @Override // com.facebook.ads.redexgen.core.C8T
                    public final InterfaceC1464Jj A0g(byte[] bArr, int i3, boolean z2) throws C2592lj {
                        this.A01.A0j(bArr, i3);
                        A03(this.A01);
                        this.A03.A07();
                        ArrayList arrayList = new ArrayList();
                        while (true) {
                            int iA07 = this.A01.A07();
                            if (A05[7].length() != 19) {
                                throw new RuntimeException();
                            }
                            A05[7] = "qQU5NmoFNSXVl5etyHU";
                            if (iA07 >= 3) {
                                C2810pT c2810pTA00 = A00(this.A01, this.A03);
                                if (c2810pTA00 != null) {
                                    arrayList.add(c2810pTA00);
                                }
                            } else {
                                return new C2588lf(Collections.unmodifiableList(arrayList));
                            }
                        }
                    }
                };
            default:
                throw new IllegalArgumentException(A00(0, 50, 37));
        }
    }

    @Override // com.facebook.ads.redexgen.core.EP
    public final boolean AKN(C2860qI c2860qI) {
        String str = c2860qI.A0W;
        String mimeType = A00(236, 8, 34);
        if (!mimeType.equals(str)) {
            String mimeType2 = A00(244, 10, 53);
            if (!mimeType2.equals(str)) {
                String mimeType3 = A00(122, 20, 118);
                if (!mimeType3.equals(str)) {
                    String mimeType4 = A00(167, 21, 70);
                    if (!mimeType4.equals(str)) {
                        String mimeType5 = A00(Sdk.SDKError.Reason.AD_RESPONSE_INVALID_TEMPLATE_TYPE_VALUE, 20, 127);
                        if (!mimeType5.equals(str)) {
                            String mimeType6 = A00(188, 28, 65);
                            if (!mimeType6.equals(str)) {
                                String mimeType7 = A00(50, 19, 111);
                                if (!mimeType7.equals(str)) {
                                    String mimeType8 = A00(142, 25, 115);
                                    if (!mimeType8.equals(str)) {
                                        String mimeType9 = A00(69, 19, 10);
                                        if (!mimeType9.equals(str)) {
                                            String mimeType10 = A00(88, 19, 24);
                                            if (!mimeType10.equals(str)) {
                                                String mimeType11 = A00(107, 15, 54);
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
