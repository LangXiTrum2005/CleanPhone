package com.facebook.ads.redexgen.core;

import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Map;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Xa, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class AbstractC1147Xa {
    public static byte[] A00;
    public static String[] A01 = {"QkrKC5a9HGO1VS2Nr20Zvk3JFP", "uVKS0vBB3TT3VWssVvKEF4U9Nxg5TVLK", "SqlAoSUEvaweoiTgoiPcUXvWXEI6wTZm", "m8SPGRRUbAmmOaM0X88GQPymY3rDTEt1", "Ern8YSZyJZj7omHfxA7B45NpB8UqIAIv", "bUhGjQCUJl5tnps0a5GeYBzhyf73sWbL", "25bhM2Fj5xfDYZIZW4I933wnOnoSOL", "PPg7fQ"};

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static XY A01(XY xy, Map<String, C1152Xf> map) {
        ArrayDeque arrayDeque = new ArrayDeque();
        arrayDeque.push(xy);
        while (!arrayDeque.isEmpty()) {
            XY xy2 = (XY) arrayDeque.pop();
            C1152Xf c1152XfA02 = A02(xy2.A04, xy2.A0H(), map);
            if (c1152XfA02 != null && c1152XfA02.A09() == 3) {
                return xy2;
            }
            for (int iA0C = xy2.A0C() - 1; iA0C >= 0; iA0C--) {
                arrayDeque.push(xy2.A0D(iA0C));
            }
        }
        return null;
    }

    public static String A03(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 20);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A05() {
        A00 = new byte[]{100, 67, 64, 93, -84, -74, -106, -84, -74, 113, -119, -121, -114, -114, -121, -116, -123, 62, -112, -109, -128, -105, 114, -125, -106, -110, 62, -116, -115, -126, -125, 62, -107, -121, -110, -122, -115, -109, -110, 62, -125, -106, 127, -127, -110, -118, -105, 62, -115, -116, -125, 62, -110, -125, -106, -110, 62, -127, -122, -121, -118, -126, 76, 113, -111, -118, -119, 111, -126, -117, -127, -126, -113, 114, -111, -122, -119, -107, 90, 67, -106, -78, 106, 124, 70, 71, -105, 101};
    }

    static {
        A05();
    }

    public static XY A00(XY xy, Map<String, C1152Xf> map) {
        while (xy != null) {
            C1152Xf c1152Xf = xy.A04;
            if (A01[7].length() == 6) {
                String[] strArr = A01;
                strArr[5] = "FJhPyoeR10uaAtsz4U1qJC2AJPQIPAdg";
                strArr[1] = "25BN7Bc1Zle4H3smEMCWXAXgKioc8R88";
                C1152Xf style = A02(c1152Xf, xy.A0H(), map);
                if (style != null) {
                    int iA09 = style.A09();
                    String[] strArr2 = A01;
                    if (strArr2[5].charAt(14) == strArr2[1].charAt(14)) {
                        String[] strArr3 = A01;
                        strArr3[2] = "0OWuISU5bxcKebsApSi9UxhskUElLSLu";
                        strArr3[4] = "a06iXSnhb0OksA3A9yAUG3JWvjPmssuJ";
                        if (iA09 == 1) {
                            return xy;
                        }
                    }
                }
                xy = xy.A03;
            }
            throw new RuntimeException();
        }
        return null;
    }

    public static C1152Xf A02(C1152Xf c1152Xf, String[] strArr, Map<String, C1152Xf> map) {
        int i = 0;
        if (c1152Xf == null) {
            if (strArr == null) {
                return null;
            }
            int length = strArr.length;
            String[] strArr2 = A01;
            if (strArr2[5].charAt(14) != strArr2[1].charAt(14)) {
                throw new RuntimeException();
            }
            A01[6] = "Mp21XTMjNzlma0Wc8BYrjuLlaZyv5N";
            if (length == 1) {
                return map.get(strArr[0]);
            }
            if (strArr.length > 1) {
                C1152Xf c1152Xf2 = new C1152Xf();
                int length2 = strArr.length;
                while (i < length2) {
                    c1152Xf2.A0O(map.get(strArr[i]));
                    i++;
                }
                return c1152Xf2;
            }
        } else {
            if (strArr != null && strArr.length == 1) {
                return c1152Xf.A0O(map.get(strArr[0]));
            }
            if (strArr != null && strArr.length > 1) {
                int length3 = strArr.length;
                while (i < length3) {
                    c1152Xf.A0O(map.get(strArr[i]));
                    i++;
                }
                return c1152Xf;
            }
        }
        return c1152Xf;
    }

    public static String A04(String str) {
        String strA03 = A03(1, 2, 34);
        String strA04 = A03(0, 1, 70);
        String strReplaceAll = str.replaceAll(strA03, strA04);
        String out = A03(4, 5, 120);
        String strReplaceAll2 = strReplaceAll.replaceAll(out, strA04);
        String strA05 = A03(3, 1, 41);
        String strReplaceAll3 = strReplaceAll2.replaceAll(strA04, strA05);
        String out2 = A03(77, 11, 38);
        return strReplaceAll3.replaceAll(out2, strA05);
    }

    /* JADX WARN: Code duplicated, block: B:56:0x012a  */
    /* JADX WARN: Code duplicated, block: B:59:0x0131  */
    /* JADX WARN: Code duplicated, block: B:61:0x0137  */
    /* JADX WARN: Code duplicated, block: B:63:0x0140  */
    /* JADX WARN: Code duplicated, block: B:65:0x0158  */
    /* JADX WARN: Code duplicated, block: B:71:0x0178  */
    /* JADX WARN: Code duplicated, block: B:72:0x017a  */
    /* JADX WARN: Code duplicated, block: B:75:0x019c  */
    public static void A06(Spannable spannable, int i, int i2, C1152Xf c1152Xf, XY xy, Map<String, C1152Xf> map, int i3) {
        XY xyA01;
        String strA03;
        String[] strArr;
        XY containerNode;
        C1152Xf c1152XfA02;
        int iA08;
        C1152Xf c1152XfA03;
        int position;
        int i4;
        int i5;
        if (c1152Xf.A0A() != -1) {
            spannable.setSpan(new StyleSpan(c1152Xf.A0A()), i, i2, 33);
        }
        if (c1152Xf.A0b()) {
            spannable.setSpan(new StrikethroughSpan(), i, i2, 33);
        }
        if (c1152Xf.A0c()) {
            spannable.setSpan(new UnderlineSpan(), i, i2, 33);
        }
        if (c1152Xf.A0a()) {
            AbstractC1380ce.A00(spannable, new ForegroundColorSpan(c1152Xf.A06()), i, i2, 33);
        }
        if (c1152Xf.A0Z()) {
            AbstractC1380ce.A00(spannable, new BackgroundColorSpan(c1152Xf.A05()), i, i2, 33);
        }
        if (c1152Xf.A0W() != null) {
            AbstractC1380ce.A00(spannable, new TypefaceSpan(c1152Xf.A0W()), i, i2, 33);
        }
        if (c1152Xf.A0D() != null) {
            XU xu = (XU) AbstractC1517es.A01(c1152Xf.A0D());
            if (xu.A01 == -1) {
                if (i3 == 2 || i3 == 1) {
                    position = 3;
                } else {
                    position = 1;
                }
                i4 = 1;
            } else {
                position = xu.A01;
                i4 = xu.A00;
            }
            if (xu.A02 == -2) {
                i5 = 1;
            } else {
                i5 = xu.A02;
            }
            AbstractC1380ce.A00(spannable, new QY(position, i4, i5), i, i2, 33);
        }
        int position2 = c1152Xf.A09();
        if (A01[6].length() == 30) {
            String[] strArr2 = A01;
            strArr2[5] = "ZGI5Vpl6hDAHYzsofxmvfMnc5cudBvpX";
            strArr2[1] = "dri5QEUT2D66vSsuWMOenl69GKhsewyG";
            switch (position2) {
                case 2:
                    XY xyA00 = A00(xy, map);
                    String[] strArr3 = A01;
                    if (strArr3[2].charAt(5) == strArr3[4].charAt(5)) {
                        String[] strArr4 = A01;
                        strArr4[5] = "l4Z63mtAc6GdWwsflu85HMTn3pPwPz3t";
                        strArr4[1] = "Dqv4GBq57Pj0zEsPxfrLcIuz7BecfX09";
                        if (xyA00 != null) {
                            xyA01 = A01(xyA00, map);
                            if (xyA01 != null) {
                                if (xyA01.A0C() == 1) {
                                    strA03 = A03(63, 14, 9);
                                    strArr = A01;
                                    if (strArr[5].charAt(14) == strArr[1].charAt(14)) {
                                        A01[6] = "sseZQ5ppnA83MfGWcvAkBEULvPjTHQ";
                                        AbstractC1561fb.A06(strA03, A03(9, 54, 10));
                                    }
                                } else {
                                    containerNode = xyA01.A0D(0);
                                    if (containerNode.A08 != null) {
                                        XY containerNode2 = xyA01.A0D(0);
                                        String str = (String) AbstractC1600gE.A0f(containerNode2.A08);
                                        c1152XfA02 = A02(xyA01.A04, xyA01.A0H(), map);
                                        if (c1152XfA02 != null) {
                                            iA08 = c1152XfA02.A08();
                                        } else {
                                            iA08 = -1;
                                        }
                                        if (iA08 == -1) {
                                            iA08 = c1152XfA03.A08();
                                        }
                                        spannable.setSpan(new C0977Qc(str, iA08), i, i2, 33);
                                    } else {
                                        strA03 = A03(63, 14, 9);
                                        strArr = A01;
                                        if (strArr[5].charAt(14) == strArr[1].charAt(14)) {
                                            A01[6] = "sseZQ5ppnA83MfGWcvAkBEULvPjTHQ";
                                            AbstractC1561fb.A06(strA03, A03(9, 54, 10));
                                        }
                                    }
                                }
                            }
                        }
                    } else if (xyA00 != null) {
                        xyA01 = A01(xyA00, map);
                        if (xyA01 != null) {
                            if (xyA01.A0C() == 1) {
                                strA03 = A03(63, 14, 9);
                                strArr = A01;
                                if (strArr[5].charAt(14) == strArr[1].charAt(14)) {
                                    A01[6] = "sseZQ5ppnA83MfGWcvAkBEULvPjTHQ";
                                    AbstractC1561fb.A06(strA03, A03(9, 54, 10));
                                }
                            } else {
                                containerNode = xyA01.A0D(0);
                                if (containerNode.A08 != null) {
                                    XY containerNode3 = xyA01.A0D(0);
                                    String str2 = (String) AbstractC1600gE.A0f(containerNode3.A08);
                                    c1152XfA02 = A02(xyA01.A04, xyA01.A0H(), map);
                                    if (c1152XfA02 != null) {
                                        iA08 = c1152XfA02.A08();
                                    } else {
                                        iA08 = -1;
                                    }
                                    if (iA08 == -1 && (c1152XfA03 = A02(xyA00.A04, xyA00.A0H(), map)) != null) {
                                        iA08 = c1152XfA03.A08();
                                    }
                                    spannable.setSpan(new C0977Qc(str2, iA08), i, i2, 33);
                                } else {
                                    strA03 = A03(63, 14, 9);
                                    strArr = A01;
                                    if (strArr[5].charAt(14) == strArr[1].charAt(14)) {
                                        A01[6] = "sseZQ5ppnA83MfGWcvAkBEULvPjTHQ";
                                        AbstractC1561fb.A06(strA03, A03(9, 54, 10));
                                    }
                                }
                            }
                        }
                    }
                    break;
                case 3:
                case 4:
                    spannable.setSpan(new XR(), i, i2, 33);
                    break;
            }
            if (c1152Xf.A0Y()) {
                AbstractC1380ce.A00(spannable, new C0978Qd(), i, i2, 33);
            }
            switch (c1152Xf.A07()) {
                case 1:
                    AbstractC1380ce.A00(spannable, new AbsoluteSizeSpan((int) c1152Xf.A03(), true), i, i2, 33);
                    return;
                case 2:
                    AbstractC1380ce.A00(spannable, new RelativeSizeSpan(c1152Xf.A03()), i, i2, 33);
                    return;
                case 3:
                    AbstractC1380ce.A00(spannable, new RelativeSizeSpan(c1152Xf.A03() / 100.0f), i, i2, 33);
                    return;
                default:
                    return;
            }
        }
        throw new RuntimeException();
    }

    public static void A07(SpannableStringBuilder spannableStringBuilder) {
        int length = spannableStringBuilder.length() - 1;
        while (length >= 0 && spannableStringBuilder.charAt(length) == ' ') {
            length--;
        }
        if (length >= 0 && spannableStringBuilder.charAt(length) != '\n') {
            spannableStringBuilder.append('\n');
        }
    }
}
