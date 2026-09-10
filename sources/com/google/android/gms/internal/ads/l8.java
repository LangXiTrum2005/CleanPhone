package com.google.android.gms.internal.ads;

import android.text.Layout;
import android.text.TextUtils;
import com.facebook.appevents.UserDataStore;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class l8 implements q7 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Pattern f16778b = Pattern.compile("^([0-9][0-9]+):([0-9][0-9]):([0-9][0-9])(?:(\\.[0-9]+)|:([0-9][0-9])(?:\\.([0-9]+))?)?$");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Pattern f16779c = Pattern.compile("^([0-9]+(?:\\.[0-9]+)?)(h|m|s|ms|f|t)$");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Pattern f16780d = Pattern.compile("^(([0-9]*.)?[0-9]+)(px|em|%)$");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Pattern f16781e = Pattern.compile("^([-+]?\\d+\\.?\\d*?)%$");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Pattern f16782f = Pattern.compile("^([-+]?\\d+\\.?\\d*?)% ([-+]?\\d+\\.?\\d*?)%$");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Pattern f16783g = Pattern.compile("^([-+]?\\d+\\.?\\d*?)px ([-+]?\\d+\\.?\\d*?)px$");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Pattern f16784h = Pattern.compile("^(\\d+) (\\d+)$");

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final k8 f16785i = new k8(30.0f, 1, 1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final XmlPullParserFactory f16786a;

    public l8() {
        try {
            XmlPullParserFactory xmlPullParserFactoryNewInstance = XmlPullParserFactory.newInstance();
            this.f16786a = xmlPullParserFactoryNewInstance;
            xmlPullParserFactoryNewInstance.setNamespaceAware(true);
        } catch (XmlPullParserException e10) {
            throw new RuntimeException("Couldn't create XmlPullParserFactory instance", e10);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:116:0x0202 A[Catch: o7 -> 0x026a, TryCatch #1 {o7 -> 0x026a, blocks: (B:85:0x0191, B:88:0x01ac, B:91:0x01be, B:93:0x01c4, B:95:0x01cb, B:104:0x01e3, B:114:0x01fc, B:116:0x0202, B:117:0x020a, B:118:0x020b, B:119:0x0228, B:108:0x01ee, B:113:0x01fa, B:120:0x0229, B:121:0x022a, B:122:0x0247, B:90:0x01b3, B:123:0x0248, B:124:0x0269), top: B:224:0x0191 }] */
    /* JADX WARN: Code duplicated, block: B:170:0x0343  */
    /* JADX WARN: Code duplicated, block: B:179:0x0375  */
    /* JADX WARN: Code duplicated, block: B:237:0x020a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:45:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:54:0x0117  */
    /* JADX WARN: Code duplicated, block: B:78:0x017b  */
    /* JADX WARN: Code duplicated, block: B:80:0x0182  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static n8 c(XmlPullParser xmlPullParser, n8 n8Var) {
        Matcher matcher;
        String strGroup;
        i8 i8Var;
        int i10;
        int i11;
        int attributeCount = xmlPullParser.getAttributeCount();
        boolean z10 = false;
        n8 n8VarD = n8Var;
        for (int i12 = 0; i12 < attributeCount; i12++) {
            String attributeValue = xmlPullParser.getAttributeValue(i12);
            String attributeName = xmlPullParser.getAttributeName(i12);
            int i13 = -1;
            switch (attributeName.hashCode()) {
                case -1550943582:
                    if (attributeName.equals(TtmlNode.ATTR_TTS_FONT_STYLE)) {
                        n8VarD = d(n8VarD);
                        n8VarD.f17700i = TtmlNode.ITALIC.equalsIgnoreCase(attributeValue) ? 1 : 0;
                        continue;
                    }
                    break;
                case -1289044182:
                    if (attributeName.equals(TtmlNode.ATTR_TTS_EXTENT)) {
                        n8VarD = d(n8VarD);
                        n8VarD.f17711u = attributeValue;
                    } else {
                        continue;
                    }
                    break;
                case -1224696685:
                    if (attributeName.equals(TtmlNode.ATTR_TTS_FONT_FAMILY)) {
                        n8VarD = d(n8VarD);
                        n8VarD.f17692a = attributeValue;
                    } else {
                        continue;
                    }
                    break;
                case -1065511464:
                    if (attributeName.equals(TtmlNode.ATTR_TTS_TEXT_ALIGN)) {
                        n8VarD = d(n8VarD);
                        n8VarD.f17705o = e(attributeValue);
                    } else {
                        continue;
                    }
                    break;
                case -1008619738:
                    if (attributeName.equals("origin")) {
                        n8VarD = d(n8VarD);
                        n8VarD.f17710t = attributeValue;
                    } else {
                        continue;
                    }
                    break;
                case -879295043:
                    if (attributeName.equals(TtmlNode.ATTR_TTS_TEXT_DECORATION)) {
                        String strE = x10.e(attributeValue);
                        switch (strE.hashCode()) {
                            case -1461280213:
                                if (strE.equals(TtmlNode.NO_UNDERLINE)) {
                                    n8VarD = d(n8VarD);
                                    z10 = false;
                                    n8VarD.f17698g = 0;
                                }
                                break;
                            case -1026963764:
                                if (strE.equals(TtmlNode.UNDERLINE)) {
                                    n8VarD = d(n8VarD);
                                    n8VarD.f17698g = 1;
                                }
                                break;
                            case 913457136:
                                if (strE.equals(TtmlNode.NO_LINETHROUGH)) {
                                    n8VarD = d(n8VarD);
                                    z10 = false;
                                    n8VarD.f17697f = 0;
                                }
                                break;
                            case 1679736913:
                                if (strE.equals(TtmlNode.LINETHROUGH)) {
                                    n8VarD = d(n8VarD);
                                    n8VarD.f17697f = 1;
                                }
                                break;
                        }
                    }
                    break;
                case -734428249:
                    if (attributeName.equals(TtmlNode.ATTR_TTS_FONT_WEIGHT)) {
                        n8VarD = d(n8VarD);
                        n8VarD.f17699h = TtmlNode.BOLD.equalsIgnoreCase(attributeValue) ? 1 : 0;
                    }
                    break;
                case 3355:
                    if (attributeName.equals("id") && TtmlNode.TAG_STYLE.equals(xmlPullParser.getName())) {
                        n8VarD = d(n8VarD);
                        n8VarD.l = attributeValue;
                    }
                    break;
                case 3511770:
                    if (attributeName.equals("ruby")) {
                        String strE2 = x10.e(attributeValue);
                        switch (strE2.hashCode()) {
                            case -618561360:
                                if (strE2.equals("baseContainer")) {
                                    n8VarD = d(n8VarD);
                                    n8VarD.f17703m = 2;
                                }
                                break;
                            case -410956671:
                                if (strE2.equals("container")) {
                                    n8VarD = d(n8VarD);
                                    n8VarD.f17703m = 1;
                                }
                                break;
                            case -250518009:
                                if (strE2.equals("delimiter")) {
                                    n8VarD = d(n8VarD);
                                    n8VarD.f17703m = 4;
                                }
                                break;
                            case -136074796:
                                if (strE2.equals("textContainer")) {
                                    n8VarD = d(n8VarD);
                                    n8VarD.f17703m = 3;
                                }
                                break;
                            case 3016401:
                                if (strE2.equals("base")) {
                                    n8VarD = d(n8VarD);
                                    n8VarD.f17703m = 2;
                                }
                                break;
                            case 3556653:
                                if (strE2.equals("text")) {
                                    n8VarD = d(n8VarD);
                                    n8VarD.f17703m = 3;
                                }
                                break;
                        }
                    }
                    break;
                case 94842723:
                    if (attributeName.equals("color")) {
                        n8VarD = d(n8VarD);
                        try {
                            n8VarD.f17693b = ef0.a(attributeValue, false);
                            n8VarD.f17694c = true;
                        } catch (IllegalArgumentException unused) {
                            com.applovin.impl.ca.q(attributeValue, "Failed parsing color value: ", "TtmlParser");
                        }
                    }
                    break;
                case 109403361:
                    if (attributeName.equals("shear")) {
                        n8 n8VarD2 = d(n8VarD);
                        Matcher matcher2 = f16781e.matcher(attributeValue);
                        float fMin = Float.MAX_VALUE;
                        if (matcher2.matches()) {
                            try {
                                String strGroup2 = matcher2.group(1);
                                if (strGroup2 == null) {
                                    throw null;
                                }
                                fMin = Math.min(100.0f, Math.max(-100.0f, Float.parseFloat(strGroup2)));
                            } catch (NumberFormatException e10) {
                                v71.B("TtmlParser", "Failed to parse shear: ".concat(String.valueOf(attributeValue)), e10);
                            }
                        } else {
                            com.applovin.impl.ca.q(attributeValue, "Invalid value for shear: ", "TtmlParser");
                        }
                        n8VarD2.f17709s = fMin;
                        n8VarD = n8VarD2;
                    }
                    break;
                case 110138194:
                    if (attributeName.equals("textCombine")) {
                        String strE3 = x10.e(attributeValue);
                        int iHashCode = strE3.hashCode();
                        if (iHashCode == 96673) {
                            if (strE3.equals("all")) {
                                n8VarD = d(n8VarD);
                                n8VarD.f17707q = 1;
                            }
                        } else if (iHashCode == 3387192 && strE3.equals("none")) {
                            n8VarD = d(n8VarD);
                            z10 = false;
                            n8VarD.f17707q = 0;
                        }
                        break;
                    }
                    break;
                case 365601008:
                    if (attributeName.equals(TtmlNode.ATTR_TTS_FONT_SIZE)) {
                        try {
                            n8VarD = d(n8VarD);
                            String str = uu0.f20901a;
                            String[] strArrSplit = attributeValue.split("\\s+", -1);
                            int length = strArrSplit.length;
                            Pattern pattern = f16780d;
                            if (length == 1) {
                                matcher = pattern.matcher(attributeValue);
                            } else {
                                if (length != 2) {
                                    StringBuilder sb2 = new StringBuilder(String.valueOf(length).length() + 41);
                                    sb2.append("Invalid number of entries for fontSize: ");
                                    sb2.append(length);
                                    sb2.append(".");
                                    throw new o7(sb2.toString());
                                }
                                matcher = pattern.matcher(strArrSplit[1]);
                                v71.y("TtmlParser", "Multiple values in fontSize attribute. Picking the second value for vertical font size and ignoring the first.");
                            }
                            if (!matcher.matches()) {
                                StringBuilder sb3 = new StringBuilder(attributeValue.length() + 36);
                                sb3.append("Invalid expression for fontSize: '");
                                sb3.append(attributeValue);
                                sb3.append("'.");
                                throw new o7(sb3.toString());
                            }
                            String strGroup3 = matcher.group(3);
                            if (strGroup3 == null) {
                                throw null;
                            }
                            int iHashCode2 = strGroup3.hashCode();
                            if (iHashCode2 == 37) {
                                if (!strGroup3.equals("%")) {
                                    StringBuilder sb4 = new StringBuilder(strGroup3.length() + 30);
                                    sb4.append("Invalid unit for fontSize: '");
                                    sb4.append(strGroup3);
                                    sb4.append("'.");
                                    throw new o7(sb4.toString());
                                }
                                n8VarD.f17701j = 3;
                                strGroup = matcher.group(1);
                                if (strGroup == null) {
                                    throw null;
                                }
                                n8VarD.f17702k = Float.parseFloat(strGroup);
                            } else if (iHashCode2 == 3240) {
                                if (!strGroup3.equals(UserDataStore.EMAIL)) {
                                    StringBuilder sb5 = new StringBuilder(strGroup3.length() + 30);
                                    sb5.append("Invalid unit for fontSize: '");
                                    sb5.append(strGroup3);
                                    sb5.append("'.");
                                    throw new o7(sb5.toString());
                                }
                                n8VarD.f17701j = 2;
                                strGroup = matcher.group(1);
                                if (strGroup == null) {
                                    throw null;
                                }
                                n8VarD.f17702k = Float.parseFloat(strGroup);
                            } else {
                                if (iHashCode2 != 3592 || !strGroup3.equals("px")) {
                                    StringBuilder sb6 = new StringBuilder(strGroup3.length() + 30);
                                    sb6.append("Invalid unit for fontSize: '");
                                    sb6.append(strGroup3);
                                    sb6.append("'.");
                                    throw new o7(sb6.toString());
                                }
                                n8VarD.f17701j = 1;
                                strGroup = matcher.group(1);
                                if (strGroup == null) {
                                    throw null;
                                }
                                n8VarD.f17702k = Float.parseFloat(strGroup);
                            }
                        } catch (o7 unused2) {
                            com.applovin.impl.ca.q(attributeValue, "Failed parsing fontSize value: ", "TtmlParser");
                        }
                    }
                    break;
                case 921125321:
                    if (attributeName.equals("textEmphasis")) {
                        n8VarD = d(n8VarD);
                        Pattern pattern2 = i8.f15648d;
                        if (attributeValue == null) {
                            i8Var = null;
                        } else {
                            String strE4 = x10.e(attributeValue.trim());
                            if (strE4.isEmpty()) {
                                i8Var = null;
                            } else {
                                ia1 ia1VarW = ia1.w(TextUtils.split(strE4, i8.f15648d));
                                String str2 = (String) rb0.o(dv.e(i8.f15652h, ia1VarW), "outside");
                                int iHashCode3 = str2.hashCode();
                                if (iHashCode3 != -1106037339) {
                                    if (iHashCode3 == 92734940 && str2.equals("after")) {
                                        i10 = 2;
                                    } else {
                                        i10 = 1;
                                    }
                                } else if (str2.equals("outside")) {
                                    i10 = -2;
                                } else {
                                    i10 = 1;
                                }
                                gb1 gb1VarE = dv.e(i8.f15649e, ia1VarW);
                                if (gb1VarE.isEmpty()) {
                                    gb1 gb1VarE2 = dv.e(i8.f15651g, ia1VarW);
                                    gb1 gb1VarE3 = dv.e(i8.f15650f, ia1VarW);
                                    if (gb1VarE2.isEmpty() && gb1VarE3.isEmpty()) {
                                        i11 = 0;
                                    } else {
                                        String str3 = (String) rb0.o(gb1VarE2, "filled");
                                        i11 = (str3.hashCode() == 3417674 && str3.equals("open")) ? 2 : 1;
                                        String str4 = (String) rb0.o(gb1VarE3, "circle");
                                        int iHashCode4 = str4.hashCode();
                                        if (iHashCode4 != -905816648) {
                                            if (iHashCode4 == 99657 && str4.equals("dot")) {
                                                i13 = 2;
                                            } else {
                                                i13 = 1;
                                            }
                                        } else if (str4.equals("sesame")) {
                                            i13 = 3;
                                        } else {
                                            i13 = 1;
                                        }
                                    }
                                } else {
                                    String str5 = (String) new la1(gb1VarE, gb1VarE.f14808a, gb1VarE.f14809b).next();
                                    if (str5.hashCode() == 3387192 && str5.equals("none")) {
                                        i11 = 0;
                                        i13 = 0;
                                    } else {
                                        i11 = 0;
                                    }
                                }
                                i8Var = new i8(i13, i11, i10);
                            }
                        }
                        n8VarD.f17708r = i8Var;
                        break;
                    }
                    break;
                case 1115953443:
                    if (attributeName.equals("rubyPosition")) {
                        String strE5 = x10.e(attributeValue);
                        int iHashCode5 = strE5.hashCode();
                        if (iHashCode5 != -1392885889) {
                            if (iHashCode5 == 92734940 && strE5.equals("after")) {
                                n8VarD = d(n8VarD);
                                n8VarD.f17704n = 2;
                            }
                        } else if (strE5.equals("before")) {
                            n8VarD = d(n8VarD);
                            n8VarD.f17704n = 1;
                        }
                    } else {
                        continue;
                    }
                    break;
                case 1287124693:
                    if (attributeName.equals(TtmlNode.ATTR_TTS_BACKGROUND_COLOR)) {
                        n8VarD = d(n8VarD);
                        try {
                            n8VarD.f17695d = ef0.a(attributeValue, z10);
                            n8VarD.f17696e = true;
                        } catch (IllegalArgumentException unused3) {
                            com.applovin.impl.ca.q(attributeValue, "Failed parsing background value: ", "TtmlParser");
                        }
                    } else {
                        continue;
                    }
                    break;
                case 1754920356:
                    if (attributeName.equals("multiRowAlign")) {
                        n8VarD = d(n8VarD);
                        n8VarD.f17706p = e(attributeValue);
                    } else {
                        continue;
                    }
                    break;
                default:
                    continue;
                    break;
            }
            z10 = false;
        }
        return n8VarD;
    }

    public static n8 d(n8 n8Var) {
        return n8Var == null ? new n8() : n8Var;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static Layout.Alignment e(String str) {
        String strE = x10.e(str);
        switch (strE.hashCode()) {
            case -1364013995:
                if (strE.equals(TtmlNode.CENTER)) {
                    return Layout.Alignment.ALIGN_CENTER;
                }
                return null;
            case 100571:
                if (!strE.equals(TtmlNode.END)) {
                    return null;
                }
                break;
            case 3317767:
                if (!strE.equals("left")) {
                    return null;
                }
                return Layout.Alignment.ALIGN_NORMAL;
            case 108511772:
                if (!strE.equals(TtmlNode.RIGHT)) {
                    return null;
                }
                break;
            case 109757538:
                if (!strE.equals("start")) {
                    return null;
                }
                return Layout.Alignment.ALIGN_NORMAL;
            default:
                return null;
        }
        return Layout.Alignment.ALIGN_OPPOSITE;
    }

    public static long f(String str, k8 k8Var) throws o7 {
        double d10;
        double d11;
        Matcher matcher = f16778b.matcher(str);
        if (matcher.matches()) {
            String strGroup = matcher.group(1);
            strGroup.getClass();
            long j10 = Long.parseLong(strGroup) * 3600;
            String strGroup2 = matcher.group(2);
            strGroup2.getClass();
            long j11 = Long.parseLong(strGroup2) * 60;
            String strGroup3 = matcher.group(3);
            strGroup3.getClass();
            double d12 = j10 + j11;
            double d13 = Long.parseLong(strGroup3);
            String strGroup4 = matcher.group(4);
            double d14 = 0.0d;
            double d15 = strGroup4 != null ? Double.parseDouble(strGroup4) : 0.0d;
            double d16 = d12 + d13;
            String strGroup5 = matcher.group(5);
            double d17 = strGroup5 != null ? Long.parseLong(strGroup5) / k8Var.f16361a : 0.0d;
            double d18 = d16 + d15;
            String strGroup6 = matcher.group(6);
            if (strGroup6 != null) {
                d14 = (Long.parseLong(strGroup6) / ((double) k8Var.f16362b)) / ((double) k8Var.f16361a);
            }
            return (long) ((d18 + d17 + d14) * 1000000.0d);
        }
        Matcher matcher2 = f16779c.matcher(str);
        if (!matcher2.matches()) {
            throw new o7("Malformed time expression: ".concat(String.valueOf(str)));
        }
        String strGroup7 = matcher2.group(1);
        strGroup7.getClass();
        double d19 = Double.parseDouble(strGroup7);
        String strGroup8 = matcher2.group(2);
        strGroup8.getClass();
        int iHashCode = strGroup8.hashCode();
        if (iHashCode != 102) {
            if (iHashCode != 104) {
                if (iHashCode != 109) {
                    if (iHashCode != 3494) {
                        if (iHashCode == 115) {
                            strGroup8.equals("s");
                        } else if (iHashCode == 116 && strGroup8.equals("t")) {
                            d10 = k8Var.f16363c;
                            d19 /= d10;
                        }
                    } else if (strGroup8.equals("ms")) {
                        d10 = 1000.0d;
                        d19 /= d10;
                    }
                } else if (strGroup8.equals("m")) {
                    d11 = 60.0d;
                    d19 *= d11;
                }
            } else if (strGroup8.equals("h")) {
                d11 = 3600.0d;
                d19 *= d11;
            }
        } else if (strGroup8.equals("f")) {
            d10 = k8Var.f16361a;
            d19 /= d10;
        }
        return (long) (d19 * 1000000.0d);
    }

    /* JADX WARN: Code duplicated, block: B:157:0x0350  */
    /* JADX WARN: Code duplicated, block: B:160:0x0362  */
    /* JADX WARN: Code duplicated, block: B:163:0x036b A[Catch: NumberFormatException -> 0x0383, IOException -> 0x07f8, XmlPullParserException -> 0x0801, TryCatch #5 {NumberFormatException -> 0x0383, blocks: (B:161:0x0365, B:163:0x036b, B:165:0x0378, B:166:0x0381, B:167:0x0382), top: B:440:0x0365, outer: #20 }] */
    /* JADX WARN: Code duplicated, block: B:165:0x0378 A[Catch: NumberFormatException -> 0x0383, IOException -> 0x07f8, XmlPullParserException -> 0x0801, TryCatch #5 {NumberFormatException -> 0x0383, blocks: (B:161:0x0365, B:163:0x036b, B:165:0x0378, B:166:0x0381, B:167:0x0382), top: B:440:0x0365, outer: #20 }] */
    /* JADX WARN: Code duplicated, block: B:170:0x0390 A[Catch: IOException -> 0x07f8, XmlPullParserException -> 0x0801, TryCatch #20 {IOException -> 0x07f8, XmlPullParserException -> 0x0801, blocks: (B:3:0x0008, B:6:0x005a, B:8:0x0069, B:11:0x0075, B:14:0x0087, B:16:0x008f, B:19:0x0099, B:21:0x00a1, B:25:0x00b7, B:27:0x00d2, B:29:0x00dc, B:30:0x00e0, B:32:0x00ec, B:33:0x00f0, B:67:0x0187, B:86:0x01e0, B:89:0x01f4, B:91:0x01fa, B:93:0x0204, B:95:0x020c, B:97:0x0214, B:99:0x021c, B:101:0x0224, B:103:0x022a, B:105:0x0232, B:107:0x023a, B:109:0x0240, B:111:0x0246, B:113:0x024c, B:115:0x0254, B:118:0x025d, B:420:0x07dd, B:120:0x0292, B:123:0x029a, B:125:0x02a3, B:127:0x02b4, B:129:0x02c0, B:131:0x02cb, B:133:0x02d1, B:135:0x02e5, B:137:0x02eb, B:275:0x057e, B:130:0x02c4, B:139:0x02fb, B:142:0x0307, B:259:0x052d, B:145:0x0326, B:147:0x032e, B:149:0x0336, B:151:0x033e, B:158:0x0352, B:161:0x0365, B:163:0x036b, B:165:0x0378, B:186:0x03e2, B:188:0x03e8, B:190:0x03ee, B:192:0x03f6, B:194:0x03fc, B:197:0x040b, B:199:0x0411, B:201:0x041e, B:221:0x0495, B:223:0x049d, B:237:0x04de, B:239:0x04e8, B:257:0x0520, B:202:0x0429, B:203:0x042a, B:204:0x042b, B:205:0x0438, B:208:0x0440, B:211:0x044e, B:213:0x0454, B:215:0x045f, B:216:0x0473, B:217:0x0474, B:218:0x0475, B:219:0x0482, B:166:0x0381, B:167:0x0382, B:168:0x0383, B:170:0x0390, B:173:0x039a, B:176:0x03a3, B:178:0x03a9, B:180:0x03b4, B:181:0x03c6, B:182:0x03c7, B:183:0x03c8, B:184:0x03d0, B:262:0x0540, B:264:0x054e, B:266:0x0559, B:268:0x055f, B:270:0x056b, B:280:0x05a3, B:284:0x05ca, B:290:0x05ec, B:293:0x05f5, B:391:0x0758, B:304:0x061d, B:307:0x0628, B:311:0x063b, B:308:0x062f, B:310:0x0637, B:328:0x066d, B:334:0x0686, B:338:0x069b, B:342:0x06b0, B:351:0x06e2, B:355:0x06ec, B:359:0x06f4, B:369:0x070b, B:377:0x071e, B:379:0x072c, B:381:0x0731, B:383:0x0735, B:384:0x073c, B:372:0x0712, B:70:0x0194, B:72:0x019e, B:75:0x01a7, B:77:0x01ad, B:79:0x01b8, B:80:0x01c4, B:81:0x01c5, B:82:0x01c6, B:37:0x010c, B:39:0x0118, B:42:0x0124, B:44:0x012a, B:46:0x0137, B:56:0x0158, B:58:0x015c, B:59:0x016f, B:66:0x017f, B:63:0x0179, B:65:0x017e, B:395:0x077d, B:397:0x0789, B:398:0x0790, B:400:0x0797, B:403:0x079b, B:405:0x07a5, B:407:0x07af, B:411:0x07b7, B:409:0x07b4, B:414:0x07ce, B:418:0x07d6, B:425:0x07f7), top: B:464:0x0008, inners: #1, #2, #5, #12, #18 }] */
    /* JADX WARN: Code duplicated, block: B:172:0x0398 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:173:0x039a A[Catch: IOException -> 0x07f8, XmlPullParserException -> 0x0801, TRY_LEAVE, TryCatch #20 {IOException -> 0x07f8, XmlPullParserException -> 0x0801, blocks: (B:3:0x0008, B:6:0x005a, B:8:0x0069, B:11:0x0075, B:14:0x0087, B:16:0x008f, B:19:0x0099, B:21:0x00a1, B:25:0x00b7, B:27:0x00d2, B:29:0x00dc, B:30:0x00e0, B:32:0x00ec, B:33:0x00f0, B:67:0x0187, B:86:0x01e0, B:89:0x01f4, B:91:0x01fa, B:93:0x0204, B:95:0x020c, B:97:0x0214, B:99:0x021c, B:101:0x0224, B:103:0x022a, B:105:0x0232, B:107:0x023a, B:109:0x0240, B:111:0x0246, B:113:0x024c, B:115:0x0254, B:118:0x025d, B:420:0x07dd, B:120:0x0292, B:123:0x029a, B:125:0x02a3, B:127:0x02b4, B:129:0x02c0, B:131:0x02cb, B:133:0x02d1, B:135:0x02e5, B:137:0x02eb, B:275:0x057e, B:130:0x02c4, B:139:0x02fb, B:142:0x0307, B:259:0x052d, B:145:0x0326, B:147:0x032e, B:149:0x0336, B:151:0x033e, B:158:0x0352, B:161:0x0365, B:163:0x036b, B:165:0x0378, B:186:0x03e2, B:188:0x03e8, B:190:0x03ee, B:192:0x03f6, B:194:0x03fc, B:197:0x040b, B:199:0x0411, B:201:0x041e, B:221:0x0495, B:223:0x049d, B:237:0x04de, B:239:0x04e8, B:257:0x0520, B:202:0x0429, B:203:0x042a, B:204:0x042b, B:205:0x0438, B:208:0x0440, B:211:0x044e, B:213:0x0454, B:215:0x045f, B:216:0x0473, B:217:0x0474, B:218:0x0475, B:219:0x0482, B:166:0x0381, B:167:0x0382, B:168:0x0383, B:170:0x0390, B:173:0x039a, B:176:0x03a3, B:178:0x03a9, B:180:0x03b4, B:181:0x03c6, B:182:0x03c7, B:183:0x03c8, B:184:0x03d0, B:262:0x0540, B:264:0x054e, B:266:0x0559, B:268:0x055f, B:270:0x056b, B:280:0x05a3, B:284:0x05ca, B:290:0x05ec, B:293:0x05f5, B:391:0x0758, B:304:0x061d, B:307:0x0628, B:311:0x063b, B:308:0x062f, B:310:0x0637, B:328:0x066d, B:334:0x0686, B:338:0x069b, B:342:0x06b0, B:351:0x06e2, B:355:0x06ec, B:359:0x06f4, B:369:0x070b, B:377:0x071e, B:379:0x072c, B:381:0x0731, B:383:0x0735, B:384:0x073c, B:372:0x0712, B:70:0x0194, B:72:0x019e, B:75:0x01a7, B:77:0x01ad, B:79:0x01b8, B:80:0x01c4, B:81:0x01c5, B:82:0x01c6, B:37:0x010c, B:39:0x0118, B:42:0x0124, B:44:0x012a, B:46:0x0137, B:56:0x0158, B:58:0x015c, B:59:0x016f, B:66:0x017f, B:63:0x0179, B:65:0x017e, B:395:0x077d, B:397:0x0789, B:398:0x0790, B:400:0x0797, B:403:0x079b, B:405:0x07a5, B:407:0x07af, B:411:0x07b7, B:409:0x07b4, B:414:0x07ce, B:418:0x07d6, B:425:0x07f7), top: B:464:0x0008, inners: #1, #2, #5, #12, #18 }] */
    /* JADX WARN: Code duplicated, block: B:175:0x03a2  */
    /* JADX WARN: Code duplicated, block: B:178:0x03a9 A[Catch: NumberFormatException -> 0x03c8, IOException -> 0x07f8, XmlPullParserException -> 0x0801, TryCatch #2 {NumberFormatException -> 0x03c8, blocks: (B:176:0x03a3, B:178:0x03a9, B:180:0x03b4, B:181:0x03c6, B:182:0x03c7), top: B:437:0x03a3, outer: #20 }] */
    /* JADX WARN: Code duplicated, block: B:180:0x03b4 A[Catch: NumberFormatException -> 0x03c8, IOException -> 0x07f8, XmlPullParserException -> 0x0801, TryCatch #2 {NumberFormatException -> 0x03c8, blocks: (B:176:0x03a3, B:178:0x03a9, B:180:0x03b4, B:181:0x03c6, B:182:0x03c7), top: B:437:0x03a3, outer: #20 }] */
    /* JADX WARN: Code duplicated, block: B:184:0x03d0 A[Catch: IOException -> 0x07f8, XmlPullParserException -> 0x0801, TryCatch #20 {IOException -> 0x07f8, XmlPullParserException -> 0x0801, blocks: (B:3:0x0008, B:6:0x005a, B:8:0x0069, B:11:0x0075, B:14:0x0087, B:16:0x008f, B:19:0x0099, B:21:0x00a1, B:25:0x00b7, B:27:0x00d2, B:29:0x00dc, B:30:0x00e0, B:32:0x00ec, B:33:0x00f0, B:67:0x0187, B:86:0x01e0, B:89:0x01f4, B:91:0x01fa, B:93:0x0204, B:95:0x020c, B:97:0x0214, B:99:0x021c, B:101:0x0224, B:103:0x022a, B:105:0x0232, B:107:0x023a, B:109:0x0240, B:111:0x0246, B:113:0x024c, B:115:0x0254, B:118:0x025d, B:420:0x07dd, B:120:0x0292, B:123:0x029a, B:125:0x02a3, B:127:0x02b4, B:129:0x02c0, B:131:0x02cb, B:133:0x02d1, B:135:0x02e5, B:137:0x02eb, B:275:0x057e, B:130:0x02c4, B:139:0x02fb, B:142:0x0307, B:259:0x052d, B:145:0x0326, B:147:0x032e, B:149:0x0336, B:151:0x033e, B:158:0x0352, B:161:0x0365, B:163:0x036b, B:165:0x0378, B:186:0x03e2, B:188:0x03e8, B:190:0x03ee, B:192:0x03f6, B:194:0x03fc, B:197:0x040b, B:199:0x0411, B:201:0x041e, B:221:0x0495, B:223:0x049d, B:237:0x04de, B:239:0x04e8, B:257:0x0520, B:202:0x0429, B:203:0x042a, B:204:0x042b, B:205:0x0438, B:208:0x0440, B:211:0x044e, B:213:0x0454, B:215:0x045f, B:216:0x0473, B:217:0x0474, B:218:0x0475, B:219:0x0482, B:166:0x0381, B:167:0x0382, B:168:0x0383, B:170:0x0390, B:173:0x039a, B:176:0x03a3, B:178:0x03a9, B:180:0x03b4, B:181:0x03c6, B:182:0x03c7, B:183:0x03c8, B:184:0x03d0, B:262:0x0540, B:264:0x054e, B:266:0x0559, B:268:0x055f, B:270:0x056b, B:280:0x05a3, B:284:0x05ca, B:290:0x05ec, B:293:0x05f5, B:391:0x0758, B:304:0x061d, B:307:0x0628, B:311:0x063b, B:308:0x062f, B:310:0x0637, B:328:0x066d, B:334:0x0686, B:338:0x069b, B:342:0x06b0, B:351:0x06e2, B:355:0x06ec, B:359:0x06f4, B:369:0x070b, B:377:0x071e, B:379:0x072c, B:381:0x0731, B:383:0x0735, B:384:0x073c, B:372:0x0712, B:70:0x0194, B:72:0x019e, B:75:0x01a7, B:77:0x01ad, B:79:0x01b8, B:80:0x01c4, B:81:0x01c5, B:82:0x01c6, B:37:0x010c, B:39:0x0118, B:42:0x0124, B:44:0x012a, B:46:0x0137, B:56:0x0158, B:58:0x015c, B:59:0x016f, B:66:0x017f, B:63:0x0179, B:65:0x017e, B:395:0x077d, B:397:0x0789, B:398:0x0790, B:400:0x0797, B:403:0x079b, B:405:0x07a5, B:407:0x07af, B:411:0x07b7, B:409:0x07b4, B:414:0x07ce, B:418:0x07d6, B:425:0x07f7), top: B:464:0x0008, inners: #1, #2, #5, #12, #18 }] */
    /* JADX WARN: Code duplicated, block: B:185:0x03d8  */
    /* JADX WARN: Code duplicated, block: B:194:0x03fc A[Catch: IOException -> 0x07f8, XmlPullParserException -> 0x0801, TRY_LEAVE, TryCatch #20 {IOException -> 0x07f8, XmlPullParserException -> 0x0801, blocks: (B:3:0x0008, B:6:0x005a, B:8:0x0069, B:11:0x0075, B:14:0x0087, B:16:0x008f, B:19:0x0099, B:21:0x00a1, B:25:0x00b7, B:27:0x00d2, B:29:0x00dc, B:30:0x00e0, B:32:0x00ec, B:33:0x00f0, B:67:0x0187, B:86:0x01e0, B:89:0x01f4, B:91:0x01fa, B:93:0x0204, B:95:0x020c, B:97:0x0214, B:99:0x021c, B:101:0x0224, B:103:0x022a, B:105:0x0232, B:107:0x023a, B:109:0x0240, B:111:0x0246, B:113:0x024c, B:115:0x0254, B:118:0x025d, B:420:0x07dd, B:120:0x0292, B:123:0x029a, B:125:0x02a3, B:127:0x02b4, B:129:0x02c0, B:131:0x02cb, B:133:0x02d1, B:135:0x02e5, B:137:0x02eb, B:275:0x057e, B:130:0x02c4, B:139:0x02fb, B:142:0x0307, B:259:0x052d, B:145:0x0326, B:147:0x032e, B:149:0x0336, B:151:0x033e, B:158:0x0352, B:161:0x0365, B:163:0x036b, B:165:0x0378, B:186:0x03e2, B:188:0x03e8, B:190:0x03ee, B:192:0x03f6, B:194:0x03fc, B:197:0x040b, B:199:0x0411, B:201:0x041e, B:221:0x0495, B:223:0x049d, B:237:0x04de, B:239:0x04e8, B:257:0x0520, B:202:0x0429, B:203:0x042a, B:204:0x042b, B:205:0x0438, B:208:0x0440, B:211:0x044e, B:213:0x0454, B:215:0x045f, B:216:0x0473, B:217:0x0474, B:218:0x0475, B:219:0x0482, B:166:0x0381, B:167:0x0382, B:168:0x0383, B:170:0x0390, B:173:0x039a, B:176:0x03a3, B:178:0x03a9, B:180:0x03b4, B:181:0x03c6, B:182:0x03c7, B:183:0x03c8, B:184:0x03d0, B:262:0x0540, B:264:0x054e, B:266:0x0559, B:268:0x055f, B:270:0x056b, B:280:0x05a3, B:284:0x05ca, B:290:0x05ec, B:293:0x05f5, B:391:0x0758, B:304:0x061d, B:307:0x0628, B:311:0x063b, B:308:0x062f, B:310:0x0637, B:328:0x066d, B:334:0x0686, B:338:0x069b, B:342:0x06b0, B:351:0x06e2, B:355:0x06ec, B:359:0x06f4, B:369:0x070b, B:377:0x071e, B:379:0x072c, B:381:0x0731, B:383:0x0735, B:384:0x073c, B:372:0x0712, B:70:0x0194, B:72:0x019e, B:75:0x01a7, B:77:0x01ad, B:79:0x01b8, B:80:0x01c4, B:81:0x01c5, B:82:0x01c6, B:37:0x010c, B:39:0x0118, B:42:0x0124, B:44:0x012a, B:46:0x0137, B:56:0x0158, B:58:0x015c, B:59:0x016f, B:66:0x017f, B:63:0x0179, B:65:0x017e, B:395:0x077d, B:397:0x0789, B:398:0x0790, B:400:0x0797, B:403:0x079b, B:405:0x07a5, B:407:0x07af, B:411:0x07b7, B:409:0x07b4, B:414:0x07ce, B:418:0x07d6, B:425:0x07f7), top: B:464:0x0008, inners: #1, #2, #5, #12, #18 }] */
    /* JADX WARN: Code duplicated, block: B:196:0x040a  */
    /* JADX WARN: Code duplicated, block: B:199:0x0411 A[Catch: NumberFormatException -> 0x042b, IOException -> 0x07f8, XmlPullParserException -> 0x0801, TryCatch #18 {NumberFormatException -> 0x042b, blocks: (B:197:0x040b, B:199:0x0411, B:201:0x041e, B:202:0x0429, B:203:0x042a), top: B:461:0x040b, outer: #20 }] */
    /* JADX WARN: Code duplicated, block: B:201:0x041e A[Catch: NumberFormatException -> 0x042b, IOException -> 0x07f8, XmlPullParserException -> 0x0801, TryCatch #18 {NumberFormatException -> 0x042b, blocks: (B:197:0x040b, B:199:0x0411, B:201:0x041e, B:202:0x0429, B:203:0x042a), top: B:461:0x040b, outer: #20 }] */
    /* JADX WARN: Code duplicated, block: B:205:0x0438 A[Catch: IOException -> 0x07f8, XmlPullParserException -> 0x0801, TryCatch #20 {IOException -> 0x07f8, XmlPullParserException -> 0x0801, blocks: (B:3:0x0008, B:6:0x005a, B:8:0x0069, B:11:0x0075, B:14:0x0087, B:16:0x008f, B:19:0x0099, B:21:0x00a1, B:25:0x00b7, B:27:0x00d2, B:29:0x00dc, B:30:0x00e0, B:32:0x00ec, B:33:0x00f0, B:67:0x0187, B:86:0x01e0, B:89:0x01f4, B:91:0x01fa, B:93:0x0204, B:95:0x020c, B:97:0x0214, B:99:0x021c, B:101:0x0224, B:103:0x022a, B:105:0x0232, B:107:0x023a, B:109:0x0240, B:111:0x0246, B:113:0x024c, B:115:0x0254, B:118:0x025d, B:420:0x07dd, B:120:0x0292, B:123:0x029a, B:125:0x02a3, B:127:0x02b4, B:129:0x02c0, B:131:0x02cb, B:133:0x02d1, B:135:0x02e5, B:137:0x02eb, B:275:0x057e, B:130:0x02c4, B:139:0x02fb, B:142:0x0307, B:259:0x052d, B:145:0x0326, B:147:0x032e, B:149:0x0336, B:151:0x033e, B:158:0x0352, B:161:0x0365, B:163:0x036b, B:165:0x0378, B:186:0x03e2, B:188:0x03e8, B:190:0x03ee, B:192:0x03f6, B:194:0x03fc, B:197:0x040b, B:199:0x0411, B:201:0x041e, B:221:0x0495, B:223:0x049d, B:237:0x04de, B:239:0x04e8, B:257:0x0520, B:202:0x0429, B:203:0x042a, B:204:0x042b, B:205:0x0438, B:208:0x0440, B:211:0x044e, B:213:0x0454, B:215:0x045f, B:216:0x0473, B:217:0x0474, B:218:0x0475, B:219:0x0482, B:166:0x0381, B:167:0x0382, B:168:0x0383, B:170:0x0390, B:173:0x039a, B:176:0x03a3, B:178:0x03a9, B:180:0x03b4, B:181:0x03c6, B:182:0x03c7, B:183:0x03c8, B:184:0x03d0, B:262:0x0540, B:264:0x054e, B:266:0x0559, B:268:0x055f, B:270:0x056b, B:280:0x05a3, B:284:0x05ca, B:290:0x05ec, B:293:0x05f5, B:391:0x0758, B:304:0x061d, B:307:0x0628, B:311:0x063b, B:308:0x062f, B:310:0x0637, B:328:0x066d, B:334:0x0686, B:338:0x069b, B:342:0x06b0, B:351:0x06e2, B:355:0x06ec, B:359:0x06f4, B:369:0x070b, B:377:0x071e, B:379:0x072c, B:381:0x0731, B:383:0x0735, B:384:0x073c, B:372:0x0712, B:70:0x0194, B:72:0x019e, B:75:0x01a7, B:77:0x01ad, B:79:0x01b8, B:80:0x01c4, B:81:0x01c5, B:82:0x01c6, B:37:0x010c, B:39:0x0118, B:42:0x0124, B:44:0x012a, B:46:0x0137, B:56:0x0158, B:58:0x015c, B:59:0x016f, B:66:0x017f, B:63:0x0179, B:65:0x017e, B:395:0x077d, B:397:0x0789, B:398:0x0790, B:400:0x0797, B:403:0x079b, B:405:0x07a5, B:407:0x07af, B:411:0x07b7, B:409:0x07b4, B:414:0x07ce, B:418:0x07d6, B:425:0x07f7), top: B:464:0x0008, inners: #1, #2, #5, #12, #18 }] */
    /* JADX WARN: Code duplicated, block: B:207:0x043e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:208:0x0440 A[Catch: IOException -> 0x07f8, XmlPullParserException -> 0x0801, TRY_LEAVE, TryCatch #20 {IOException -> 0x07f8, XmlPullParserException -> 0x0801, blocks: (B:3:0x0008, B:6:0x005a, B:8:0x0069, B:11:0x0075, B:14:0x0087, B:16:0x008f, B:19:0x0099, B:21:0x00a1, B:25:0x00b7, B:27:0x00d2, B:29:0x00dc, B:30:0x00e0, B:32:0x00ec, B:33:0x00f0, B:67:0x0187, B:86:0x01e0, B:89:0x01f4, B:91:0x01fa, B:93:0x0204, B:95:0x020c, B:97:0x0214, B:99:0x021c, B:101:0x0224, B:103:0x022a, B:105:0x0232, B:107:0x023a, B:109:0x0240, B:111:0x0246, B:113:0x024c, B:115:0x0254, B:118:0x025d, B:420:0x07dd, B:120:0x0292, B:123:0x029a, B:125:0x02a3, B:127:0x02b4, B:129:0x02c0, B:131:0x02cb, B:133:0x02d1, B:135:0x02e5, B:137:0x02eb, B:275:0x057e, B:130:0x02c4, B:139:0x02fb, B:142:0x0307, B:259:0x052d, B:145:0x0326, B:147:0x032e, B:149:0x0336, B:151:0x033e, B:158:0x0352, B:161:0x0365, B:163:0x036b, B:165:0x0378, B:186:0x03e2, B:188:0x03e8, B:190:0x03ee, B:192:0x03f6, B:194:0x03fc, B:197:0x040b, B:199:0x0411, B:201:0x041e, B:221:0x0495, B:223:0x049d, B:237:0x04de, B:239:0x04e8, B:257:0x0520, B:202:0x0429, B:203:0x042a, B:204:0x042b, B:205:0x0438, B:208:0x0440, B:211:0x044e, B:213:0x0454, B:215:0x045f, B:216:0x0473, B:217:0x0474, B:218:0x0475, B:219:0x0482, B:166:0x0381, B:167:0x0382, B:168:0x0383, B:170:0x0390, B:173:0x039a, B:176:0x03a3, B:178:0x03a9, B:180:0x03b4, B:181:0x03c6, B:182:0x03c7, B:183:0x03c8, B:184:0x03d0, B:262:0x0540, B:264:0x054e, B:266:0x0559, B:268:0x055f, B:270:0x056b, B:280:0x05a3, B:284:0x05ca, B:290:0x05ec, B:293:0x05f5, B:391:0x0758, B:304:0x061d, B:307:0x0628, B:311:0x063b, B:308:0x062f, B:310:0x0637, B:328:0x066d, B:334:0x0686, B:338:0x069b, B:342:0x06b0, B:351:0x06e2, B:355:0x06ec, B:359:0x06f4, B:369:0x070b, B:377:0x071e, B:379:0x072c, B:381:0x0731, B:383:0x0735, B:384:0x073c, B:372:0x0712, B:70:0x0194, B:72:0x019e, B:75:0x01a7, B:77:0x01ad, B:79:0x01b8, B:80:0x01c4, B:81:0x01c5, B:82:0x01c6, B:37:0x010c, B:39:0x0118, B:42:0x0124, B:44:0x012a, B:46:0x0137, B:56:0x0158, B:58:0x015c, B:59:0x016f, B:66:0x017f, B:63:0x0179, B:65:0x017e, B:395:0x077d, B:397:0x0789, B:398:0x0790, B:400:0x0797, B:403:0x079b, B:405:0x07a5, B:407:0x07af, B:411:0x07b7, B:409:0x07b4, B:414:0x07ce, B:418:0x07d6, B:425:0x07f7), top: B:464:0x0008, inners: #1, #2, #5, #12, #18 }] */
    /* JADX WARN: Code duplicated, block: B:210:0x044d  */
    /* JADX WARN: Code duplicated, block: B:213:0x0454 A[Catch: NumberFormatException -> 0x0475, IOException -> 0x07f8, XmlPullParserException -> 0x0801, TryCatch #12 {NumberFormatException -> 0x0475, blocks: (B:211:0x044e, B:213:0x0454, B:215:0x045f, B:216:0x0473, B:217:0x0474), top: B:452:0x044e, outer: #20 }] */
    /* JADX WARN: Code duplicated, block: B:215:0x045f A[Catch: NumberFormatException -> 0x0475, IOException -> 0x07f8, XmlPullParserException -> 0x0801, TryCatch #12 {NumberFormatException -> 0x0475, blocks: (B:211:0x044e, B:213:0x0454, B:215:0x045f, B:216:0x0473, B:217:0x0474), top: B:452:0x044e, outer: #20 }] */
    /* JADX WARN: Code duplicated, block: B:219:0x0482 A[Catch: IOException -> 0x07f8, XmlPullParserException -> 0x0801, TryCatch #20 {IOException -> 0x07f8, XmlPullParserException -> 0x0801, blocks: (B:3:0x0008, B:6:0x005a, B:8:0x0069, B:11:0x0075, B:14:0x0087, B:16:0x008f, B:19:0x0099, B:21:0x00a1, B:25:0x00b7, B:27:0x00d2, B:29:0x00dc, B:30:0x00e0, B:32:0x00ec, B:33:0x00f0, B:67:0x0187, B:86:0x01e0, B:89:0x01f4, B:91:0x01fa, B:93:0x0204, B:95:0x020c, B:97:0x0214, B:99:0x021c, B:101:0x0224, B:103:0x022a, B:105:0x0232, B:107:0x023a, B:109:0x0240, B:111:0x0246, B:113:0x024c, B:115:0x0254, B:118:0x025d, B:420:0x07dd, B:120:0x0292, B:123:0x029a, B:125:0x02a3, B:127:0x02b4, B:129:0x02c0, B:131:0x02cb, B:133:0x02d1, B:135:0x02e5, B:137:0x02eb, B:275:0x057e, B:130:0x02c4, B:139:0x02fb, B:142:0x0307, B:259:0x052d, B:145:0x0326, B:147:0x032e, B:149:0x0336, B:151:0x033e, B:158:0x0352, B:161:0x0365, B:163:0x036b, B:165:0x0378, B:186:0x03e2, B:188:0x03e8, B:190:0x03ee, B:192:0x03f6, B:194:0x03fc, B:197:0x040b, B:199:0x0411, B:201:0x041e, B:221:0x0495, B:223:0x049d, B:237:0x04de, B:239:0x04e8, B:257:0x0520, B:202:0x0429, B:203:0x042a, B:204:0x042b, B:205:0x0438, B:208:0x0440, B:211:0x044e, B:213:0x0454, B:215:0x045f, B:216:0x0473, B:217:0x0474, B:218:0x0475, B:219:0x0482, B:166:0x0381, B:167:0x0382, B:168:0x0383, B:170:0x0390, B:173:0x039a, B:176:0x03a3, B:178:0x03a9, B:180:0x03b4, B:181:0x03c6, B:182:0x03c7, B:183:0x03c8, B:184:0x03d0, B:262:0x0540, B:264:0x054e, B:266:0x0559, B:268:0x055f, B:270:0x056b, B:280:0x05a3, B:284:0x05ca, B:290:0x05ec, B:293:0x05f5, B:391:0x0758, B:304:0x061d, B:307:0x0628, B:311:0x063b, B:308:0x062f, B:310:0x0637, B:328:0x066d, B:334:0x0686, B:338:0x069b, B:342:0x06b0, B:351:0x06e2, B:355:0x06ec, B:359:0x06f4, B:369:0x070b, B:377:0x071e, B:379:0x072c, B:381:0x0731, B:383:0x0735, B:384:0x073c, B:372:0x0712, B:70:0x0194, B:72:0x019e, B:75:0x01a7, B:77:0x01ad, B:79:0x01b8, B:80:0x01c4, B:81:0x01c5, B:82:0x01c6, B:37:0x010c, B:39:0x0118, B:42:0x0124, B:44:0x012a, B:46:0x0137, B:56:0x0158, B:58:0x015c, B:59:0x016f, B:66:0x017f, B:63:0x0179, B:65:0x017e, B:395:0x077d, B:397:0x0789, B:398:0x0790, B:400:0x0797, B:403:0x079b, B:405:0x07a5, B:407:0x07af, B:411:0x07b7, B:409:0x07b4, B:414:0x07ce, B:418:0x07d6, B:425:0x07f7), top: B:464:0x0008, inners: #1, #2, #5, #12, #18 }] */
    /* JADX WARN: Code duplicated, block: B:220:0x0491  */
    /* JADX WARN: Code duplicated, block: B:223:0x049d A[Catch: IOException -> 0x07f8, XmlPullParserException -> 0x0801, TRY_LEAVE, TryCatch #20 {IOException -> 0x07f8, XmlPullParserException -> 0x0801, blocks: (B:3:0x0008, B:6:0x005a, B:8:0x0069, B:11:0x0075, B:14:0x0087, B:16:0x008f, B:19:0x0099, B:21:0x00a1, B:25:0x00b7, B:27:0x00d2, B:29:0x00dc, B:30:0x00e0, B:32:0x00ec, B:33:0x00f0, B:67:0x0187, B:86:0x01e0, B:89:0x01f4, B:91:0x01fa, B:93:0x0204, B:95:0x020c, B:97:0x0214, B:99:0x021c, B:101:0x0224, B:103:0x022a, B:105:0x0232, B:107:0x023a, B:109:0x0240, B:111:0x0246, B:113:0x024c, B:115:0x0254, B:118:0x025d, B:420:0x07dd, B:120:0x0292, B:123:0x029a, B:125:0x02a3, B:127:0x02b4, B:129:0x02c0, B:131:0x02cb, B:133:0x02d1, B:135:0x02e5, B:137:0x02eb, B:275:0x057e, B:130:0x02c4, B:139:0x02fb, B:142:0x0307, B:259:0x052d, B:145:0x0326, B:147:0x032e, B:149:0x0336, B:151:0x033e, B:158:0x0352, B:161:0x0365, B:163:0x036b, B:165:0x0378, B:186:0x03e2, B:188:0x03e8, B:190:0x03ee, B:192:0x03f6, B:194:0x03fc, B:197:0x040b, B:199:0x0411, B:201:0x041e, B:221:0x0495, B:223:0x049d, B:237:0x04de, B:239:0x04e8, B:257:0x0520, B:202:0x0429, B:203:0x042a, B:204:0x042b, B:205:0x0438, B:208:0x0440, B:211:0x044e, B:213:0x0454, B:215:0x045f, B:216:0x0473, B:217:0x0474, B:218:0x0475, B:219:0x0482, B:166:0x0381, B:167:0x0382, B:168:0x0383, B:170:0x0390, B:173:0x039a, B:176:0x03a3, B:178:0x03a9, B:180:0x03b4, B:181:0x03c6, B:182:0x03c7, B:183:0x03c8, B:184:0x03d0, B:262:0x0540, B:264:0x054e, B:266:0x0559, B:268:0x055f, B:270:0x056b, B:280:0x05a3, B:284:0x05ca, B:290:0x05ec, B:293:0x05f5, B:391:0x0758, B:304:0x061d, B:307:0x0628, B:311:0x063b, B:308:0x062f, B:310:0x0637, B:328:0x066d, B:334:0x0686, B:338:0x069b, B:342:0x06b0, B:351:0x06e2, B:355:0x06ec, B:359:0x06f4, B:369:0x070b, B:377:0x071e, B:379:0x072c, B:381:0x0731, B:383:0x0735, B:384:0x073c, B:372:0x0712, B:70:0x0194, B:72:0x019e, B:75:0x01a7, B:77:0x01ad, B:79:0x01b8, B:80:0x01c4, B:81:0x01c5, B:82:0x01c6, B:37:0x010c, B:39:0x0118, B:42:0x0124, B:44:0x012a, B:46:0x0137, B:56:0x0158, B:58:0x015c, B:59:0x016f, B:66:0x017f, B:63:0x0179, B:65:0x017e, B:395:0x077d, B:397:0x0789, B:398:0x0790, B:400:0x0797, B:403:0x079b, B:405:0x07a5, B:407:0x07af, B:411:0x07b7, B:409:0x07b4, B:414:0x07ce, B:418:0x07d6, B:425:0x07f7), top: B:464:0x0008, inners: #1, #2, #5, #12, #18 }] */
    /* JADX WARN: Code duplicated, block: B:226:0x04aa  */
    /* JADX WARN: Code duplicated, block: B:232:0x04c1  */
    /* JADX WARN: Code duplicated, block: B:234:0x04c9  */
    /* JADX WARN: Code duplicated, block: B:235:0x04d5  */
    /* JADX WARN: Code duplicated, block: B:239:0x04e8 A[Catch: IOException -> 0x07f8, XmlPullParserException -> 0x0801, TRY_LEAVE, TryCatch #20 {IOException -> 0x07f8, XmlPullParserException -> 0x0801, blocks: (B:3:0x0008, B:6:0x005a, B:8:0x0069, B:11:0x0075, B:14:0x0087, B:16:0x008f, B:19:0x0099, B:21:0x00a1, B:25:0x00b7, B:27:0x00d2, B:29:0x00dc, B:30:0x00e0, B:32:0x00ec, B:33:0x00f0, B:67:0x0187, B:86:0x01e0, B:89:0x01f4, B:91:0x01fa, B:93:0x0204, B:95:0x020c, B:97:0x0214, B:99:0x021c, B:101:0x0224, B:103:0x022a, B:105:0x0232, B:107:0x023a, B:109:0x0240, B:111:0x0246, B:113:0x024c, B:115:0x0254, B:118:0x025d, B:420:0x07dd, B:120:0x0292, B:123:0x029a, B:125:0x02a3, B:127:0x02b4, B:129:0x02c0, B:131:0x02cb, B:133:0x02d1, B:135:0x02e5, B:137:0x02eb, B:275:0x057e, B:130:0x02c4, B:139:0x02fb, B:142:0x0307, B:259:0x052d, B:145:0x0326, B:147:0x032e, B:149:0x0336, B:151:0x033e, B:158:0x0352, B:161:0x0365, B:163:0x036b, B:165:0x0378, B:186:0x03e2, B:188:0x03e8, B:190:0x03ee, B:192:0x03f6, B:194:0x03fc, B:197:0x040b, B:199:0x0411, B:201:0x041e, B:221:0x0495, B:223:0x049d, B:237:0x04de, B:239:0x04e8, B:257:0x0520, B:202:0x0429, B:203:0x042a, B:204:0x042b, B:205:0x0438, B:208:0x0440, B:211:0x044e, B:213:0x0454, B:215:0x045f, B:216:0x0473, B:217:0x0474, B:218:0x0475, B:219:0x0482, B:166:0x0381, B:167:0x0382, B:168:0x0383, B:170:0x0390, B:173:0x039a, B:176:0x03a3, B:178:0x03a9, B:180:0x03b4, B:181:0x03c6, B:182:0x03c7, B:183:0x03c8, B:184:0x03d0, B:262:0x0540, B:264:0x054e, B:266:0x0559, B:268:0x055f, B:270:0x056b, B:280:0x05a3, B:284:0x05ca, B:290:0x05ec, B:293:0x05f5, B:391:0x0758, B:304:0x061d, B:307:0x0628, B:311:0x063b, B:308:0x062f, B:310:0x0637, B:328:0x066d, B:334:0x0686, B:338:0x069b, B:342:0x06b0, B:351:0x06e2, B:355:0x06ec, B:359:0x06f4, B:369:0x070b, B:377:0x071e, B:379:0x072c, B:381:0x0731, B:383:0x0735, B:384:0x073c, B:372:0x0712, B:70:0x0194, B:72:0x019e, B:75:0x01a7, B:77:0x01ad, B:79:0x01b8, B:80:0x01c4, B:81:0x01c5, B:82:0x01c6, B:37:0x010c, B:39:0x0118, B:42:0x0124, B:44:0x012a, B:46:0x0137, B:56:0x0158, B:58:0x015c, B:59:0x016f, B:66:0x017f, B:63:0x0179, B:65:0x017e, B:395:0x077d, B:397:0x0789, B:398:0x0790, B:400:0x0797, B:403:0x079b, B:405:0x07a5, B:407:0x07af, B:411:0x07b7, B:409:0x07b4, B:414:0x07ce, B:418:0x07d6, B:425:0x07f7), top: B:464:0x0008, inners: #1, #2, #5, #12, #18 }] */
    /* JADX WARN: Code duplicated, block: B:242:0x04f4  */
    /* JADX WARN: Code duplicated, block: B:244:0x04f9  */
    /* JADX WARN: Code duplicated, block: B:250:0x050a  */
    /* JADX WARN: Code duplicated, block: B:253:0x0513  */
    /* JADX WARN: Code duplicated, block: B:255:0x051b  */
    /* JADX WARN: Code duplicated, block: B:256:0x051e  */
    /* JADX WARN: Code duplicated, block: B:471:0x0382 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:472:0x0381 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:473:0x03c7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:474:0x03c6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:475:0x042a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:476:0x0429 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:477:0x0474 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:478:0x0473 A[SYNTHETIC] */
    /* JADX WARN: Failed to find 'out' block for switch in B:286:0x05d8. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v23 */
    /* JADX WARN: Type inference failed for: r14v24 */
    /* JADX WARN: Type inference failed for: r14v26 */
    /* JADX WARN: Type inference failed for: r14v27 */
    /* JADX WARN: Type inference failed for: r14v8 */
    /* JADX WARN: Type inference failed for: r14v9, types: [com.google.android.gms.internal.ads.n3] */
    /* JADX WARN: Type inference failed for: r15v1 */
    /* JADX WARN: Type inference failed for: r15v2 */
    /* JADX WARN: Type inference failed for: r15v25 */
    /* JADX WARN: Type inference failed for: r15v27 */
    /* JADX WARN: Type inference failed for: r15v28 */
    /* JADX WARN: Type inference failed for: r15v29 */
    /* JADX WARN: Type inference failed for: r15v3 */
    /* JADX WARN: Type inference failed for: r15v30 */
    /* JADX WARN: Type inference failed for: r15v4 */
    /* JADX WARN: Type inference failed for: r15v5 */
    /* JADX WARN: Type inference failed for: r15v7 */
    /* JADX WARN: Type inference failed for: r15v8 */
    /* JADX WARN: Type inference failed for: r15v9 */
    /* JADX WARN: Type inference failed for: r16v1 */
    /* JADX WARN: Type inference failed for: r16v10 */
    /* JADX WARN: Type inference failed for: r16v11 */
    /* JADX WARN: Type inference failed for: r16v12 */
    /* JADX WARN: Type inference failed for: r16v13 */
    /* JADX WARN: Type inference failed for: r16v14 */
    /* JADX WARN: Type inference failed for: r16v15 */
    /* JADX WARN: Type inference failed for: r16v16 */
    /* JADX WARN: Type inference failed for: r16v17 */
    /* JADX WARN: Type inference failed for: r16v18 */
    /* JADX WARN: Type inference failed for: r16v2 */
    /* JADX WARN: Type inference failed for: r16v21 */
    /* JADX WARN: Type inference failed for: r16v23, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r16v29 */
    /* JADX WARN: Type inference failed for: r16v3 */
    /* JADX WARN: Type inference failed for: r16v32 */
    /* JADX WARN: Type inference failed for: r16v33 */
    /* JADX WARN: Type inference failed for: r16v34 */
    /* JADX WARN: Type inference failed for: r16v36 */
    /* JADX WARN: Type inference failed for: r16v37 */
    /* JADX WARN: Type inference failed for: r16v38 */
    /* JADX WARN: Type inference failed for: r16v39 */
    /* JADX WARN: Type inference failed for: r16v4 */
    /* JADX WARN: Type inference failed for: r16v40 */
    /* JADX WARN: Type inference failed for: r16v41 */
    /* JADX WARN: Type inference failed for: r16v42 */
    /* JADX WARN: Type inference failed for: r16v43 */
    /* JADX WARN: Type inference failed for: r16v44 */
    /* JADX WARN: Type inference failed for: r16v45 */
    /* JADX WARN: Type inference failed for: r16v46 */
    /* JADX WARN: Type inference failed for: r16v47 */
    /* JADX WARN: Type inference failed for: r16v48 */
    /* JADX WARN: Type inference failed for: r16v49 */
    /* JADX WARN: Type inference failed for: r16v5 */
    /* JADX WARN: Type inference failed for: r16v50 */
    /* JADX WARN: Type inference failed for: r16v51 */
    /* JADX WARN: Type inference failed for: r16v6 */
    /* JADX WARN: Type inference failed for: r16v7 */
    /* JADX WARN: Type inference failed for: r16v8 */
    /* JADX WARN: Type inference failed for: r16v9 */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v21 */
    /* JADX WARN: Type inference failed for: r1v22 */
    /* JADX WARN: Type inference failed for: r1v23, types: [com.google.android.gms.internal.ads.k8] */
    /* JADX WARN: Type inference failed for: r1v24, types: [com.google.android.gms.internal.ads.k8] */
    /* JADX WARN: Type inference failed for: r1v25, types: [com.google.android.gms.internal.ads.k8] */
    /* JADX WARN: Type inference failed for: r1v26 */
    /* JADX WARN: Type inference failed for: r1v27 */
    /* JADX WARN: Type inference failed for: r1v31 */
    /* JADX WARN: Type inference failed for: r1v83 */
    /* JADX WARN: Type inference failed for: r1v84 */
    /* JADX WARN: Type inference failed for: r1v85 */
    /* JADX WARN: Type inference failed for: r1v86 */
    /* JADX WARN: Type inference failed for: r1v87 */
    /* JADX WARN: Type inference failed for: r2v31 */
    /* JADX WARN: Type inference failed for: r2v39 */
    /* JADX WARN: Type inference failed for: r2v65, types: [com.google.android.gms.internal.ads.m8, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v67 */
    /* JADX WARN: Type inference failed for: r47v1, types: [com.google.android.gms.internal.ads.n8, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r8v42, types: [com.google.android.gms.internal.ads.k8] */
    public final o8 a(byte[] bArr, int i10, int i11) {
        String str;
        String str2;
        String str3;
        k8 k8Var;
        o8 o8Var;
        HashMap map;
        ?? r14;
        ?? r15;
        HashMap map2;
        int i12;
        int i13;
        ?? r16;
        j8 j8Var;
        j8 j8Var2;
        long j10;
        long j11;
        boolean z10;
        String str4;
        String[] strArrSplit;
        int i14;
        ?? r17;
        int i15;
        String str5;
        String str6;
        String str7;
        String strX;
        String str8;
        String strA;
        String str9;
        Pattern pattern;
        HashMap map3;
        float f10;
        float f11;
        ?? m8Var;
        String strX2;
        float f12;
        float f13;
        String strX3;
        float f14;
        int i16;
        String strX4;
        int i17;
        String strE;
        int iHashCode;
        String strE2;
        int iHashCode2;
        Matcher matcher;
        Matcher matcher2;
        String strGroup;
        int i18;
        String strGroup2;
        String strGroup3;
        float f15;
        String strGroup4;
        String strX5;
        n8 n8Var;
        Matcher matcher3;
        Matcher matcher4;
        String strGroup5;
        int i19;
        String strGroup6;
        String strGroup7;
        float f16;
        String strGroup8;
        n8 n8Var2;
        String[] strArrSplit2;
        float f17;
        boolean z11;
        int i20;
        ?? r18;
        ?? n3Var;
        ?? r19;
        String str10 = "";
        String str11 = "http://www.w3.org/ns/ttml#parameter";
        String str12 = "Ignoring unsupported tag: ";
        try {
            XmlPullParser xmlPullParserNewPullParser = this.f16786a.newPullParser();
            HashMap map4 = new HashMap();
            HashMap map5 = new HashMap();
            HashMap map6 = new HashMap();
            map5.put("", new m8("", -3.4028235E38f, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, Integer.MIN_VALUE, -3.4028235E38f, Integer.MIN_VALUE));
            Object obj = null;
            xmlPullParserNewPullParser.setInput(new ByteArrayInputStream(bArr, i10, i11), null);
            ArrayDeque arrayDeque = new ArrayDeque();
            int eventType = xmlPullParserNewPullParser.getEventType();
            k8 k8Var2 = f16785i;
            o8 o8Var2 = null;
            ?? r110 = 0;
            ?? r111 = k8Var2;
            int i21 = 0;
            int i22 = 15;
            while (eventType != 1) {
                ?? r47 = obj;
                j8 j8Var3 = (j8) arrayDeque.peek();
                if (i21 == 0) {
                    String name = xmlPullParserNewPullParser.getName();
                    str = str10;
                    if (eventType == 2) {
                        boolean zEquals = TtmlNode.TAG_TT.equals(name);
                        Pattern pattern2 = f16783g;
                        o8 o8Var3 = o8Var2;
                        if (zEquals) {
                            String attributeValue = xmlPullParserNewPullParser.getAttributeValue(str11, "frameRate");
                            int i23 = attributeValue != null ? Integer.parseInt(attributeValue) : 30;
                            String attributeValue2 = xmlPullParserNewPullParser.getAttributeValue(str11, "frameRateMultiplier");
                            if (attributeValue2 != null) {
                                String str13 = uu0.f20901a;
                                String[] strArrSplit3 = attributeValue2.split(" ", -1);
                                ps1.C("frameRateMultiplier doesn't have 2 parts", strArrSplit3.length == 2);
                                f17 = Integer.parseInt(strArrSplit3[0]) / Integer.parseInt(strArrSplit3[1]);
                            } else {
                                f17 = 1.0f;
                            }
                            int i24 = k8Var2.f16362b;
                            String attributeValue3 = xmlPullParserNewPullParser.getAttributeValue(str11, "subFrameRate");
                            if (attributeValue3 != null) {
                                i24 = Integer.parseInt(attributeValue3);
                            }
                            int i25 = k8Var2.f16363c;
                            float f18 = f17;
                            String attributeValue4 = xmlPullParserNewPullParser.getAttributeValue(str11, "tickRate");
                            if (attributeValue4 != null) {
                                i25 = Integer.parseInt(attributeValue4);
                            }
                            ?? k8Var3 = new k8(i23 * f18, i24, i25);
                            String attributeValue5 = xmlPullParserNewPullParser.getAttributeValue(str11, "cellResolution");
                            if (attributeValue5 == null) {
                                str2 = str11;
                                r19 = k8Var3;
                                k8Var = k8Var2;
                                i22 = 15;
                                r18 = r19;
                            } else {
                                Matcher matcher5 = f16784h.matcher(attributeValue5);
                                if (matcher5.matches()) {
                                    str2 = str11;
                                    try {
                                        k8Var3 = matcher5.group(1);
                                        try {
                                            if (k8Var3 == 0) {
                                                throw r47;
                                            }
                                            int i26 = Integer.parseInt(k8Var3);
                                            String strGroup9 = matcher5.group(2);
                                            if (strGroup9 == null) {
                                                throw r47;
                                            }
                                            int i27 = Integer.parseInt(strGroup9);
                                            if (i26 == 0) {
                                                z11 = false;
                                                i20 = i27;
                                            } else if (i27 != 0) {
                                                i20 = i27;
                                                z11 = true;
                                            } else {
                                                i20 = 0;
                                                z11 = false;
                                            }
                                            if (z11) {
                                                r18 = k8Var3;
                                                k8Var = k8Var2;
                                                i22 = i20;
                                            } else {
                                                try {
                                                    throw new IllegalArgumentException(dv.B("Invalid cell resolution %s %s", Integer.valueOf(i26), Integer.valueOf(i20)));
                                                } catch (NumberFormatException unused) {
                                                }
                                            }
                                        } catch (NumberFormatException unused2) {
                                            v71.y("TtmlParser", "Ignoring malformed cell resolution: ".concat(attributeValue5));
                                            r19 = k8Var3;
                                            i22 = 15;
                                            r18 = r19;
                                        }
                                    } catch (NumberFormatException unused3) {
                                    }
                                    k8Var = k8Var2;
                                    v71.y("TtmlParser", "Ignoring malformed cell resolution: ".concat(attributeValue5));
                                    r19 = k8Var3;
                                    i22 = 15;
                                    r18 = r19;
                                } else {
                                    v71.y("TtmlParser", "Ignoring malformed cell resolution: ".concat(attributeValue5));
                                    str2 = str11;
                                    r19 = k8Var3;
                                    k8Var = k8Var2;
                                    i22 = 15;
                                    r18 = r19;
                                }
                            }
                            String strX6 = dv.x(xmlPullParserNewPullParser, TtmlNode.ATTR_TTS_EXTENT);
                            if (strX6 == null) {
                                n3Var = r47;
                                r15 = r18;
                                r14 = n3Var;
                            } else {
                                Matcher matcher6 = pattern2.matcher(strX6);
                                if (matcher6.matches()) {
                                    try {
                                        String strGroup10 = matcher6.group(1);
                                        if (strGroup10 == null) {
                                            throw r47;
                                        }
                                        int i28 = Integer.parseInt(strGroup10);
                                        String strGroup11 = matcher6.group(2);
                                        if (strGroup11 == null) {
                                            throw r47;
                                        }
                                        n3Var = new n3(i28, Integer.parseInt(strGroup11), false);
                                        r15 = r18;
                                        r14 = n3Var;
                                    } catch (NumberFormatException unused4) {
                                        v71.y("TtmlParser", "Ignoring malformed tts extent: ".concat(strX6));
                                        n3Var = r47;
                                    }
                                } else {
                                    v71.y("TtmlParser", "Ignoring non-pixel tts extent: ".concat(strX6));
                                }
                                n3Var = r47;
                                r15 = r18;
                                r14 = n3Var;
                            }
                        } else {
                            str2 = str11;
                            j8Var3 = j8Var3;
                            arrayDeque = arrayDeque;
                            k8Var = k8Var2;
                            r14 = r110;
                            r15 = r111;
                        }
                        int i29 = i22;
                        boolean zEquals2 = name.equals(TtmlNode.TAG_TT);
                        String str14 = "image";
                        String str15 = TtmlNode.TAG_METADATA;
                        String str16 = TtmlNode.TAG_REGION;
                        String str17 = TtmlNode.TAG_HEAD;
                        ?? r112 = r15;
                        if (zEquals2 || name.equals(TtmlNode.TAG_HEAD)) {
                            map2 = map6;
                        } else {
                            map2 = map6;
                            if (!name.equals("body") && !name.equals(TtmlNode.TAG_DIV) && !name.equals(TtmlNode.TAG_P) && !name.equals(TtmlNode.TAG_SPAN) && !name.equals(TtmlNode.TAG_BR) && !name.equals(TtmlNode.TAG_STYLE) && !name.equals(TtmlNode.TAG_STYLING) && !name.equals(TtmlNode.TAG_LAYOUT) && !name.equals(TtmlNode.TAG_REGION) && !name.equals(TtmlNode.TAG_METADATA) && !name.equals("image") && !name.equals("data") && !name.equals("information")) {
                                String name2 = xmlPullParserNewPullParser.getName();
                                StringBuilder sb2 = new StringBuilder(String.valueOf(name2).length() + 26);
                                sb2.append(str12);
                                sb2.append(name2);
                                v71.r("TtmlParser", sb2.toString());
                                i22 = i29;
                                str3 = str12;
                                r111 = r112;
                                o8Var2 = o8Var3;
                                arrayDeque = arrayDeque;
                                map = map2;
                                r110 = r14;
                                i21 = 1;
                            }
                        }
                        boolean zEquals3 = TtmlNode.TAG_HEAD.equals(name);
                        String str18 = "\\s+";
                        if (zEquals3) {
                            while (true) {
                                xmlPullParserNewPullParser.next();
                                if (dv.t(xmlPullParserNewPullParser, TtmlNode.TAG_STYLE)) {
                                    String strX7 = dv.x(xmlPullParserNewPullParser, TtmlNode.TAG_STYLE);
                                    str3 = str12;
                                    n8 n8VarC = c(xmlPullParserNewPullParser, new n8());
                                    if (strX7 != null) {
                                        String strTrim = strX7.trim();
                                        if (strTrim.isEmpty()) {
                                            strArrSplit2 = new String[0];
                                        } else {
                                            String str19 = uu0.f20901a;
                                            strArrSplit2 = strTrim.split(str18, -1);
                                        }
                                        String[] strArr = strArrSplit2;
                                        int i30 = 0;
                                        for (int length = strArrSplit2.length; i30 < length; length = length) {
                                            n8VarC.c((n8) map4.get(strArr[i30]));
                                            i30++;
                                        }
                                    }
                                    String strD = n8VarC.d();
                                    if (strD != null) {
                                        map4.put(strD, n8VarC);
                                    }
                                    str7 = str17;
                                    i15 = i29;
                                    str6 = str14;
                                    str5 = str15;
                                    map = map2;
                                } else {
                                    String str20 = str17;
                                    str3 = str12;
                                    if (dv.t(xmlPullParserNewPullParser, str16)) {
                                        String str21 = str14;
                                        String strX8 = dv.x(xmlPullParserNewPullParser, "id");
                                        if (strX8 == null) {
                                            i15 = i29;
                                            map3 = map5;
                                            str9 = str15;
                                            m8Var = r47;
                                        } else {
                                            String strX9 = dv.x(xmlPullParserNewPullParser, "origin");
                                            if (strX9 == null) {
                                                str8 = strX9;
                                                String strX10 = dv.x(xmlPullParserNewPullParser, TtmlNode.TAG_STYLE);
                                                if (strX10 != null && (n8Var2 = (n8) map4.get(strX10)) != null) {
                                                    strA = n8Var2.a();
                                                }
                                                str9 = str15;
                                                pattern = f16782f;
                                                if (strA != null) {
                                                    map3 = map5;
                                                    matcher3 = pattern.matcher(strA);
                                                    i15 = i29;
                                                    matcher4 = pattern2.matcher(strA);
                                                    if (matcher3.matches()) {
                                                        try {
                                                            strGroup7 = matcher3.group(1);
                                                            if (strGroup7 != null) {
                                                                throw r47;
                                                            }
                                                            f16 = Float.parseFloat(strGroup7) / 100.0f;
                                                            strGroup8 = matcher3.group(2);
                                                            if (strGroup8 != null) {
                                                                throw r47;
                                                            }
                                                            f10 = Float.parseFloat(strGroup8) / 100.0f;
                                                            f11 = f16;
                                                        } catch (NumberFormatException unused5) {
                                                            v71.y("TtmlParser", "Ignoring region with malformed origin: ".concat(strA));
                                                        }
                                                    } else {
                                                        if (matcher4.matches()) {
                                                            v71.y("TtmlParser", "Ignoring region with unsupported origin: ".concat(strA));
                                                        } else if (r14 == 0) {
                                                            v71.y("TtmlParser", "Ignoring region with missing tts:extent: ".concat(strA));
                                                        } else {
                                                            try {
                                                                strGroup5 = matcher4.group(1);
                                                                if (strGroup5 != null) {
                                                                    throw r47;
                                                                }
                                                                i19 = Integer.parseInt(strGroup5);
                                                                strGroup6 = matcher4.group(2);
                                                                if (strGroup6 != null) {
                                                                    throw r47;
                                                                }
                                                                int i31 = Integer.parseInt(strGroup6);
                                                                float f19 = i19 / r14.f17624a;
                                                                f10 = i31 / r14.f17625b;
                                                                f11 = f19;
                                                            } catch (NumberFormatException unused6) {
                                                                v71.y("TtmlParser", "Ignoring region with malformed origin: ".concat(strA));
                                                            }
                                                        }
                                                        m8Var = r47;
                                                        i15 = i15;
                                                    }
                                                } else {
                                                    i15 = i29;
                                                    map3 = map5;
                                                    f10 = 0.0f;
                                                    f11 = 0.0f;
                                                }
                                                strX2 = dv.x(xmlPullParserNewPullParser, TtmlNode.ATTR_TTS_EXTENT);
                                                if (strX2 == null && (strX5 = dv.x(xmlPullParserNewPullParser, TtmlNode.TAG_STYLE)) != null && (n8Var = (n8) map4.get(strX5)) != null) {
                                                    strX2 = n8Var.b();
                                                }
                                                if (strX2 != null) {
                                                    matcher = pattern.matcher(strX2);
                                                    matcher2 = pattern2.matcher(strX2);
                                                    if (matcher.matches()) {
                                                        try {
                                                            strGroup3 = matcher.group(1);
                                                            if (strGroup3 != null) {
                                                                throw r47;
                                                            }
                                                            f15 = Float.parseFloat(strGroup3) / 100.0f;
                                                            strGroup4 = matcher.group(2);
                                                            if (strGroup4 != null) {
                                                                throw r47;
                                                            }
                                                            f12 = f15;
                                                            f13 = Float.parseFloat(strGroup4) / 100.0f;
                                                        } catch (NumberFormatException unused7) {
                                                            v71.y("TtmlParser", "Ignoring region with malformed extent: ".concat(String.valueOf(strA)));
                                                            m8Var = r47;
                                                            i15 = i15;
                                                        }
                                                    } else {
                                                        if (matcher2.matches()) {
                                                            v71.y("TtmlParser", "Ignoring region with unsupported extent: ".concat(String.valueOf(strA)));
                                                        } else if (r14 == 0) {
                                                            v71.y("TtmlParser", "Ignoring region with missing tts:extent: ".concat(String.valueOf(strA)));
                                                        } else {
                                                            try {
                                                                strGroup = matcher2.group(1);
                                                                if (strGroup != null) {
                                                                    throw r47;
                                                                }
                                                                i18 = Integer.parseInt(strGroup);
                                                                strGroup2 = matcher2.group(2);
                                                                if (strGroup2 != null) {
                                                                    throw r47;
                                                                }
                                                                int i32 = Integer.parseInt(strGroup2);
                                                                float f20 = i18 / r14.f17624a;
                                                                f13 = i32 / r14.f17625b;
                                                                f12 = f20;
                                                            } catch (NumberFormatException unused8) {
                                                                v71.y("TtmlParser", "Ignoring region with malformed extent: ".concat(String.valueOf(strA)));
                                                                m8Var = r47;
                                                                i15 = i15;
                                                            }
                                                        }
                                                        m8Var = r47;
                                                        i15 = i15;
                                                    }
                                                } else {
                                                    f12 = 1.0f;
                                                    f13 = 1.0f;
                                                }
                                                strX3 = dv.x(xmlPullParserNewPullParser, TtmlNode.ATTR_TTS_DISPLAY_ALIGN);
                                                if (strX3 != null) {
                                                    strE2 = x10.e(strX3);
                                                    iHashCode2 = strE2.hashCode();
                                                    if (iHashCode2 != -1364013995) {
                                                        if (iHashCode2 != 92734940 && strE2.equals("after")) {
                                                            f14 = f10 + f13;
                                                            i16 = 2;
                                                        } else {
                                                            f14 = f10;
                                                            i16 = 0;
                                                        }
                                                    } else if (strE2.equals(TtmlNode.CENTER)) {
                                                        f14 = f10 + (f13 / 2.0f);
                                                        i16 = 1;
                                                    } else {
                                                        f14 = f10;
                                                        i16 = 0;
                                                    }
                                                } else {
                                                    f14 = f10;
                                                    i16 = 0;
                                                }
                                                float f21 = 1.0f / i15;
                                                strX4 = dv.x(xmlPullParserNewPullParser, "writingMode");
                                                if (strX4 != null) {
                                                    strE = x10.e(strX4);
                                                    iHashCode = strE.hashCode();
                                                    if (iHashCode != 3694) {
                                                        if (iHashCode != 3553396) {
                                                            if (iHashCode == 3553576 && strE.equals("tbrl")) {
                                                                i17 = 1;
                                                            }
                                                        } else if (strE.equals("tblr")) {
                                                            i17 = 2;
                                                        }
                                                        i17 = Integer.MIN_VALUE;
                                                    } else if (strE.equals("tb")) {
                                                        i17 = 2;
                                                    } else {
                                                        i17 = Integer.MIN_VALUE;
                                                    }
                                                } else {
                                                    i17 = Integer.MIN_VALUE;
                                                }
                                                m8Var = new m8(strX8, f11, f14, 0, i16, f12, f13, 1, f21, i17);
                                            } else {
                                                str8 = strX9;
                                            }
                                            strA = str8;
                                            str9 = str15;
                                            pattern = f16782f;
                                            if (strA != null) {
                                                map3 = map5;
                                                matcher3 = pattern.matcher(strA);
                                                i15 = i29;
                                                matcher4 = pattern2.matcher(strA);
                                                if (matcher3.matches()) {
                                                    strGroup7 = matcher3.group(1);
                                                    if (strGroup7 != null) {
                                                        throw r47;
                                                    }
                                                    f16 = Float.parseFloat(strGroup7) / 100.0f;
                                                    strGroup8 = matcher3.group(2);
                                                    if (strGroup8 != null) {
                                                        throw r47;
                                                    }
                                                    f10 = Float.parseFloat(strGroup8) / 100.0f;
                                                    f11 = f16;
                                                } else {
                                                    if (matcher4.matches()) {
                                                        v71.y("TtmlParser", "Ignoring region with unsupported origin: ".concat(strA));
                                                    } else if (r14 == 0) {
                                                        v71.y("TtmlParser", "Ignoring region with missing tts:extent: ".concat(strA));
                                                    } else {
                                                        strGroup5 = matcher4.group(1);
                                                        if (strGroup5 != null) {
                                                            throw r47;
                                                        }
                                                        i19 = Integer.parseInt(strGroup5);
                                                        strGroup6 = matcher4.group(2);
                                                        if (strGroup6 != null) {
                                                            throw r47;
                                                        }
                                                        int i33 = Integer.parseInt(strGroup6);
                                                        float f110 = i19 / r14.f17624a;
                                                        f10 = i33 / r14.f17625b;
                                                        f11 = f110;
                                                    }
                                                    m8Var = r47;
                                                    i15 = i15;
                                                }
                                            } else {
                                                i15 = i29;
                                                map3 = map5;
                                                f10 = 0.0f;
                                                f11 = 0.0f;
                                            }
                                            strX2 = dv.x(xmlPullParserNewPullParser, TtmlNode.ATTR_TTS_EXTENT);
                                            if (strX2 == null) {
                                                strX2 = n8Var.b();
                                            }
                                            if (strX2 != null) {
                                                matcher = pattern.matcher(strX2);
                                                matcher2 = pattern2.matcher(strX2);
                                                if (matcher.matches()) {
                                                    strGroup3 = matcher.group(1);
                                                    if (strGroup3 != null) {
                                                        throw r47;
                                                    }
                                                    f15 = Float.parseFloat(strGroup3) / 100.0f;
                                                    strGroup4 = matcher.group(2);
                                                    if (strGroup4 != null) {
                                                        throw r47;
                                                    }
                                                    f12 = f15;
                                                    f13 = Float.parseFloat(strGroup4) / 100.0f;
                                                } else {
                                                    if (matcher2.matches()) {
                                                        v71.y("TtmlParser", "Ignoring region with unsupported extent: ".concat(String.valueOf(strA)));
                                                    } else if (r14 == 0) {
                                                        v71.y("TtmlParser", "Ignoring region with missing tts:extent: ".concat(String.valueOf(strA)));
                                                    } else {
                                                        strGroup = matcher2.group(1);
                                                        if (strGroup != null) {
                                                            throw r47;
                                                        }
                                                        i18 = Integer.parseInt(strGroup);
                                                        strGroup2 = matcher2.group(2);
                                                        if (strGroup2 != null) {
                                                            throw r47;
                                                        }
                                                        int i34 = Integer.parseInt(strGroup2);
                                                        float f22 = i18 / r14.f17624a;
                                                        f13 = i34 / r14.f17625b;
                                                        f12 = f22;
                                                    }
                                                    m8Var = r47;
                                                    i15 = i15;
                                                }
                                            } else {
                                                f12 = 1.0f;
                                                f13 = 1.0f;
                                            }
                                            strX3 = dv.x(xmlPullParserNewPullParser, TtmlNode.ATTR_TTS_DISPLAY_ALIGN);
                                            if (strX3 != null) {
                                                strE2 = x10.e(strX3);
                                                iHashCode2 = strE2.hashCode();
                                                if (iHashCode2 != -1364013995) {
                                                    if (iHashCode2 != 92734940) {
                                                        f14 = f10;
                                                        i16 = 0;
                                                    } else {
                                                        f14 = f10 + f13;
                                                        i16 = 2;
                                                    }
                                                } else if (strE2.equals(TtmlNode.CENTER)) {
                                                    f14 = f10 + (f13 / 2.0f);
                                                    i16 = 1;
                                                } else {
                                                    f14 = f10;
                                                    i16 = 0;
                                                }
                                            } else {
                                                f14 = f10;
                                                i16 = 0;
                                            }
                                            float f23 = 1.0f / i15;
                                            strX4 = dv.x(xmlPullParserNewPullParser, "writingMode");
                                            if (strX4 != null) {
                                                strE = x10.e(strX4);
                                                iHashCode = strE.hashCode();
                                                if (iHashCode != 3694) {
                                                    if (iHashCode != 3553396) {
                                                        if (iHashCode == 3553576) {
                                                            i17 = 1;
                                                        }
                                                    } else if (strE.equals("tblr")) {
                                                        i17 = 2;
                                                    }
                                                    i17 = Integer.MIN_VALUE;
                                                } else if (strE.equals("tb")) {
                                                    i17 = 2;
                                                } else {
                                                    i17 = Integer.MIN_VALUE;
                                                }
                                            } else {
                                                i17 = Integer.MIN_VALUE;
                                            }
                                            m8Var = new m8(strX8, f11, f14, 0, i16, f12, f13, 1, f23, i17);
                                        }
                                        if (m8Var != 0) {
                                            map5 = map3;
                                            map5.put(m8Var.f17324a, m8Var);
                                        } else {
                                            map5 = map3;
                                        }
                                        str7 = str20;
                                        map = map2;
                                        str6 = str21;
                                        str5 = str9;
                                    } else {
                                        i15 = i29;
                                        String str22 = str14;
                                        str5 = str15;
                                        if (dv.t(xmlPullParserNewPullParser, str5)) {
                                            while (true) {
                                                xmlPullParserNewPullParser.next();
                                                str6 = str22;
                                                if (!dv.t(xmlPullParserNewPullParser, str6) || (strX = dv.x(xmlPullParserNewPullParser, "id")) == null) {
                                                    map = map2;
                                                } else {
                                                    map = map2;
                                                    map.put(strX, xmlPullParserNewPullParser.nextText());
                                                }
                                                if (!dv.k(xmlPullParserNewPullParser, str5)) {
                                                    str22 = str6;
                                                    map2 = map;
                                                }
                                            }
                                        } else {
                                            map = map2;
                                            str6 = str22;
                                        }
                                        str7 = str20;
                                    }
                                }
                                if (dv.k(xmlPullParserNewPullParser, str7)) {
                                    i12 = i15;
                                    arrayDeque = arrayDeque;
                                    r17 = r112;
                                } else {
                                    str15 = str5;
                                    str14 = str6;
                                    map2 = map;
                                    str16 = str16;
                                    str18 = str18;
                                    i29 = i15;
                                    str17 = str7;
                                    str12 = str3;
                                }
                            }
                        } else {
                            i12 = i29;
                            str3 = str12;
                            Object obj2 = TtmlNode.TAG_REGION;
                            String str23 = "\\s+";
                            map = map2;
                            try {
                                int attributeCount = xmlPullParserNewPullParser.getAttributeCount();
                                n8 n8VarC2 = c(xmlPullParserNewPullParser, r47);
                                String str24 = str;
                                int i35 = 0;
                                long jF = C.TIME_UNSET;
                                long jF2 = C.TIME_UNSET;
                                long jF3 = C.TIME_UNSET;
                                String[] strArr2 = null;
                                String strSubstring = null;
                                ?? r113 = r112;
                                while (i35 < attributeCount) {
                                    try {
                                        String attributeName = xmlPullParserNewPullParser.getAttributeName(i35);
                                        String attributeValue6 = xmlPullParserNewPullParser.getAttributeValue(i35);
                                        int i36 = attributeCount;
                                        switch (attributeName.hashCode()) {
                                            case -934795532:
                                                i12 = i12;
                                                r113 = r113;
                                                obj2 = obj2;
                                                if (attributeName.equals(obj2) && map5.containsKey(attributeValue6)) {
                                                    str24 = attributeValue6;
                                                }
                                                i35++;
                                                obj2 = obj2;
                                                r113 = r113;
                                                i12 = i12;
                                                attributeCount = i36;
                                                break;
                                            case 99841:
                                                i12 = i12;
                                                ?? r2 = r113;
                                                r113 = r2;
                                                if (attributeName.equals("dur")) {
                                                    jF3 = f(attributeValue6, r2);
                                                    r113 = r2;
                                                }
                                                obj2 = obj2;
                                                i35++;
                                                obj2 = obj2;
                                                r113 = r113;
                                                i12 = i12;
                                                attributeCount = i36;
                                                break;
                                            case 100571:
                                                i12 = i12;
                                                ?? r3 = r113;
                                                r113 = r3;
                                                if (attributeName.equals(TtmlNode.END)) {
                                                    jF = f(attributeValue6, r3);
                                                    r113 = r3;
                                                }
                                                obj2 = obj2;
                                                i35++;
                                                obj2 = obj2;
                                                r113 = r113;
                                                i12 = i12;
                                                attributeCount = i36;
                                                break;
                                            case 93616297:
                                                i12 = i12;
                                                i13 = 1;
                                                if (attributeName.equals("begin")) {
                                                    ?? r10 = r113;
                                                    try {
                                                        jF2 = f(attributeValue6, r10);
                                                        r113 = r10;
                                                    } catch (o7 e10) {
                                                        e = e10;
                                                        r16 = r10;
                                                        arrayDeque = arrayDeque;
                                                        v71.B("TtmlParser", "Suppressing parser error", e);
                                                        r111 = r16;
                                                        o8Var2 = o8Var3;
                                                        i22 = i12;
                                                        r110 = r14;
                                                        i21 = i13;
                                                        xmlPullParserNewPullParser.next();
                                                        eventType = xmlPullParserNewPullParser.getEventType();
                                                        arrayDeque = arrayDeque;
                                                        map6 = map;
                                                        str10 = str;
                                                        str11 = str2;
                                                        k8Var2 = k8Var;
                                                        str12 = str3;
                                                        obj = null;
                                                        r111 = r111;
                                                        r110 = r110;
                                                    }
                                                } else {
                                                    r113 = r113;
                                                }
                                                obj2 = obj2;
                                                i35++;
                                                obj2 = obj2;
                                                r113 = r113;
                                                i12 = i12;
                                                attributeCount = i36;
                                                break;
                                            case 109780401:
                                                i13 = 1;
                                                if (!attributeName.equals(TtmlNode.TAG_STYLE)) {
                                                    i35++;
                                                    obj2 = obj2;
                                                    r113 = r113;
                                                    i12 = i12;
                                                    attributeCount = i36;
                                                } else {
                                                    try {
                                                        String strTrim2 = attributeValue6.trim();
                                                        if (strTrim2.isEmpty()) {
                                                            z10 = false;
                                                            try {
                                                                strArrSplit = new String[0];
                                                                str4 = str23;
                                                            } catch (o7 e11) {
                                                                e = e11;
                                                                i12 = i12;
                                                                r16 = r113;
                                                                arrayDeque = arrayDeque;
                                                                v71.B("TtmlParser", "Suppressing parser error", e);
                                                                r111 = r16;
                                                                o8Var2 = o8Var3;
                                                                i22 = i12;
                                                                r110 = r14;
                                                                i21 = i13;
                                                                xmlPullParserNewPullParser.next();
                                                                eventType = xmlPullParserNewPullParser.getEventType();
                                                                arrayDeque = arrayDeque;
                                                                map6 = map;
                                                                str10 = str;
                                                                str11 = str2;
                                                                k8Var2 = k8Var;
                                                                str12 = str3;
                                                                obj = null;
                                                                r111 = r111;
                                                                r110 = r110;
                                                            }
                                                        } else {
                                                            z10 = false;
                                                            String str25 = uu0.f20901a;
                                                            str4 = str23;
                                                            strArrSplit = strTrim2.split(str4, -1);
                                                        }
                                                        try {
                                                            if (strArrSplit.length > 0) {
                                                                strArr2 = strArrSplit;
                                                            }
                                                            str23 = str4;
                                                            r113 = r113;
                                                            obj2 = obj2;
                                                            i35++;
                                                            obj2 = obj2;
                                                            r113 = r113;
                                                            i12 = i12;
                                                            attributeCount = i36;
                                                        } catch (o7 e12) {
                                                            e = e12;
                                                            r16 = r113;
                                                            arrayDeque = arrayDeque;
                                                            v71.B("TtmlParser", "Suppressing parser error", e);
                                                            r111 = r16;
                                                            o8Var2 = o8Var3;
                                                            i22 = i12;
                                                            r110 = r14;
                                                            i21 = i13;
                                                            xmlPullParserNewPullParser.next();
                                                            eventType = xmlPullParserNewPullParser.getEventType();
                                                            arrayDeque = arrayDeque;
                                                            map6 = map;
                                                            str10 = str;
                                                            str11 = str2;
                                                            k8Var2 = k8Var;
                                                            str12 = str3;
                                                            obj = null;
                                                            r111 = r111;
                                                            r110 = r110;
                                                        }
                                                    } catch (o7 e13) {
                                                        e = e13;
                                                        i12 = i12;
                                                        z10 = false;
                                                    }
                                                }
                                                break;
                                            case 1292595405:
                                                if (attributeName.equals("backgroundImage")) {
                                                    try {
                                                        if (attributeValue6.startsWith("#")) {
                                                            i14 = 1;
                                                            try {
                                                                strSubstring = attributeValue6.substring(1);
                                                            } catch (o7 e14) {
                                                                e = e14;
                                                                i12 = i12;
                                                                i13 = i14;
                                                                r16 = r113;
                                                                v71.B("TtmlParser", "Suppressing parser error", e);
                                                                r111 = r16;
                                                                o8Var2 = o8Var3;
                                                                i22 = i12;
                                                                r110 = r14;
                                                                i21 = i13;
                                                                xmlPullParserNewPullParser.next();
                                                                eventType = xmlPullParserNewPullParser.getEventType();
                                                                arrayDeque = arrayDeque;
                                                                map6 = map;
                                                                str10 = str;
                                                                str11 = str2;
                                                                k8Var2 = k8Var;
                                                                str12 = str3;
                                                                obj = null;
                                                                r111 = r111;
                                                                r110 = r110;
                                                            }
                                                        }
                                                        i35++;
                                                        obj2 = obj2;
                                                        r113 = r113;
                                                        i12 = i12;
                                                        attributeCount = i36;
                                                    } catch (o7 e15) {
                                                        e = e15;
                                                        i14 = 1;
                                                    }
                                                    break;
                                                }
                                            default:
                                                i12 = i12;
                                                i35++;
                                                obj2 = obj2;
                                                r113 = r113;
                                                i12 = i12;
                                                attributeCount = i36;
                                                break;
                                        }
                                    } catch (o7 e16) {
                                        e = e16;
                                        i12 = i12;
                                        i13 = 1;
                                        r16 = r113;
                                    }
                                }
                                i12 = i12;
                                ?? r11 = r113;
                                i13 = 1;
                                if (j8Var3 != null) {
                                    ?? r114 = r11;
                                    j8Var = j8Var3;
                                    try {
                                        long j12 = j8Var.f16012d;
                                        if (j12 == C.TIME_UNSET) {
                                            j8Var2 = j8Var;
                                            r16 = r114;
                                        } else {
                                            jF2 = jF2 != C.TIME_UNSET ? jF2 + j12 : -9223372036854775807L;
                                            if (jF != C.TIME_UNSET) {
                                                jF += j12;
                                                j8Var2 = j8Var;
                                                r16 = r114;
                                            } else {
                                                j8Var2 = j8Var;
                                                jF = -9223372036854775807L;
                                                r16 = r114;
                                            }
                                        }
                                    } catch (o7 e17) {
                                        e = e17;
                                        r16 = r114;
                                        arrayDeque = arrayDeque;
                                        v71.B("TtmlParser", "Suppressing parser error", e);
                                        r111 = r16;
                                        o8Var2 = o8Var3;
                                        i22 = i12;
                                        r110 = r14;
                                        i21 = i13;
                                        xmlPullParserNewPullParser.next();
                                        eventType = xmlPullParserNewPullParser.getEventType();
                                        arrayDeque = arrayDeque;
                                        map6 = map;
                                        str10 = str;
                                        str11 = str2;
                                        k8Var2 = k8Var;
                                        str12 = str3;
                                        obj = null;
                                        r111 = r111;
                                        r110 = r110;
                                    }
                                } else {
                                    r16 = r11;
                                    j8Var = j8Var3;
                                    j8Var2 = null;
                                }
                                if (jF == C.TIME_UNSET) {
                                    if (jF3 != C.TIME_UNSET) {
                                        j11 = jF2 + jF3;
                                    } else {
                                        if (j8Var2 != null) {
                                            j11 = j8Var2.f16013e;
                                            if (j11 != C.TIME_UNSET) {
                                            }
                                        }
                                        j10 = -9223372036854775807L;
                                    }
                                    j10 = j11;
                                } else {
                                    j10 = jF;
                                }
                                j8 j8VarB = j8.b(xmlPullParserNewPullParser.getName(), jF2, j10, n8VarC2, strArr2, str24, strSubstring, j8Var2);
                                arrayDeque = arrayDeque;
                                try {
                                    arrayDeque.push(j8VarB);
                                    r17 = r16;
                                    if (j8Var != null) {
                                        if (j8Var.f16020m == null) {
                                            j8Var.f16020m = new ArrayList();
                                        }
                                        j8Var.f16020m.add(j8VarB);
                                        r17 = r16;
                                    }
                                } catch (o7 e18) {
                                    e = e18;
                                    v71.B("TtmlParser", "Suppressing parser error", e);
                                    r111 = r16;
                                    o8Var2 = o8Var3;
                                    i22 = i12;
                                    r110 = r14;
                                    i21 = i13;
                                }
                            } catch (o7 e19) {
                                e = e19;
                                i12 = i12;
                                i13 = 1;
                                r16 = r112;
                            }
                        }
                        r111 = r17;
                        o8Var2 = o8Var3;
                        i22 = i12;
                        r110 = r14;
                    } else {
                        str2 = str11;
                        str3 = str12;
                        arrayDeque = arrayDeque;
                        k8Var = k8Var2;
                        o8Var = o8Var2;
                        i21 = i21;
                        map = map6;
                        if (eventType == 4) {
                            if (j8Var3 == null) {
                                throw null;
                            }
                            j8 j8VarA = j8.a(xmlPullParserNewPullParser.getText());
                            if (j8Var3.f16020m == null) {
                                j8Var3.f16020m = new ArrayList();
                            }
                            j8Var3.f16020m.add(j8VarA);
                        } else if (eventType == 3) {
                            if (xmlPullParserNewPullParser.getName().equals(TtmlNode.TAG_TT)) {
                                j8 j8Var4 = (j8) arrayDeque.peek();
                                if (j8Var4 == null) {
                                    throw null;
                                }
                                o8Var2 = new o8(j8Var4, map4, map5, map);
                            } else {
                                o8Var2 = o8Var;
                            }
                            arrayDeque.pop();
                            r111 = r111;
                            r110 = r110;
                        }
                        o8Var2 = o8Var;
                        r111 = r111;
                        r110 = r110;
                    }
                    i21 = i21;
                } else {
                    str = str10;
                    str2 = str11;
                    str3 = str12;
                    arrayDeque = arrayDeque;
                    k8Var = k8Var2;
                    o8Var = o8Var2;
                    i21 = i21;
                    map = map6;
                    if (eventType == 2) {
                        i21++;
                    } else {
                        if (eventType == 3) {
                            i21--;
                        }
                        o8Var2 = o8Var;
                        r111 = r111;
                        r110 = r110;
                        i21 = i21;
                    }
                    o8Var2 = o8Var;
                }
                xmlPullParserNewPullParser.next();
                eventType = xmlPullParserNewPullParser.getEventType();
                arrayDeque = arrayDeque;
                map6 = map;
                str10 = str;
                str11 = str2;
                k8Var2 = k8Var;
                str12 = str3;
                obj = null;
                r111 = r111;
                r110 = r110;
            }
            o8 o8Var4 = o8Var2;
            if (o8Var4 != null) {
                return o8Var4;
            }
            throw null;
        } catch (IOException e20) {
            throw new IllegalStateException("Unexpected error when reading input.", e20);
        } catch (XmlPullParserException e21) {
            throw new IllegalStateException("Unable to decode source", e21);
        }
    }

    @Override // com.google.android.gms.internal.ads.q7
    public final void b(int i10, int i11, b2.d0 d0Var, byte[] bArr) {
        v71.i(a(bArr, i10, i11), d0Var);
    }
}
