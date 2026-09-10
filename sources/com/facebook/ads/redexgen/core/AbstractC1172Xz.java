package com.facebook.ads.redexgen.core;

import android.graphics.Color;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.badlogic.gdx.Input;
import com.umeng.analytics.pro.cw;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.EnumC4719u30;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Xz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class AbstractC1172Xz {
    public static byte[] A00;
    public static String[] A01 = {"eEHk", "ygOhJn4gwhgM9pR66mJFLHE8jb74qaTG", "SWTMetVjWMGXvvbk4HbXZY7l6nAfW5gw", "kDTk3o3meTC0HRu", "GMMw8R09GyvqwOCNAxdHnqSVewSvsbQS", "nHjkRL0Prd5osTlH9GGbQuiEatOgPQ3G", "seEmdveek1dWIL04QMImsaHPaV43qN1B", "r"};
    public static final Pattern A02;
    public static final Map<String, Integer> A03;
    public static final Map<String, Integer> A04;
    public static final Pattern A05;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static int A06(List<C1160Xn> list, String str, C1168Xv c1168Xv) {
        List<C1169Xw> listA0E = A0E(list, str, c1168Xv);
        for (int i = 0; i < listA0E.size(); i++) {
            C1160Xn c1160Xn = listA0E.get(i).A01;
            if (c1160Xn.A07() != -1) {
                return c1160Xn.A07();
            }
        }
        return -1;
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static SpannedString A07(String str, String str2, List<C1160Xn> list) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        ArrayDeque arrayDeque = new ArrayDeque();
        int iA05 = 0;
        ArrayList arrayList = new ArrayList();
        while (iA05 < str2.length()) {
            char cCharAt = str2.charAt(iA05);
            switch (cCharAt) {
                case '&':
                    int iIndexOf = str2.indexOf(59, iA05 + 1);
                    int iIndexOf2 = str2.indexOf(32, iA05 + 1);
                    if (iIndexOf == -1) {
                        iIndexOf = iIndexOf2;
                    } else if (iIndexOf2 != -1) {
                        iIndexOf = Math.min(iIndexOf, iIndexOf2);
                    }
                    if (iIndexOf == -1) {
                        spannableStringBuilder.append(cCharAt);
                        iA05++;
                    } else {
                        A0J(str2.substring(iA05 + 1, iIndexOf), spannableStringBuilder);
                        if (iIndexOf == iIndexOf2) {
                            spannableStringBuilder.append((CharSequence) A0C(1, 1, 17));
                        }
                        iA05 = iIndexOf + 1;
                    }
                    break;
                case '<':
                    if (iA05 + 1 < str2.length()) {
                        int i = iA05;
                        boolean z = str2.charAt(i + 1) == '/';
                        iA05 = A05(str2, i + 1);
                        boolean z2 = str2.charAt(iA05 + (-2)) == '/';
                        String strSubstring = str2.substring((z ? 2 : 1) + i, z2 ? iA05 - 2 : iA05 - 1);
                        if (!strSubstring.trim().isEmpty()) {
                            String strA0D = A0D(strSubstring);
                            if (A0O(strA0D)) {
                                if (z) {
                                    while (!arrayDeque.isEmpty()) {
                                        C1168Xv c1168Xv = (C1168Xv) arrayDeque.pop();
                                        A0K(str, c1168Xv, arrayList, spannableStringBuilder, list);
                                        if (arrayDeque.isEmpty()) {
                                            arrayList.clear();
                                        } else {
                                            arrayList.add(new C1167Xu(c1168Xv, spannableStringBuilder.length()));
                                        }
                                        if (c1168Xv.A01.equals(strA0D)) {
                                        }
                                        break;
                                    }
                                } else if (!z2) {
                                    arrayDeque.push(C1168Xv.A01(strSubstring, spannableStringBuilder.length()));
                                }
                            }
                        }
                    } else {
                        iA05++;
                    }
                    break;
                default:
                    spannableStringBuilder.append(cCharAt);
                    iA05++;
                    break;
            }
        }
        while (true) {
            boolean zIsEmpty = arrayDeque.isEmpty();
            if (A01[7].length() == 19) {
                throw new RuntimeException();
            }
            A01[6] = "0PgF5BeDatFZnxwC6wxmb2Fcjflavslz";
            if (zIsEmpty) {
                A0K(str, C1168Xv.A00(), Collections.emptyList(), spannableStringBuilder, list);
                return SpannedString.valueOf(spannableStringBuilder);
            }
            A0K(str, (C1168Xv) arrayDeque.pop(), arrayList, spannableStringBuilder, list);
        }
    }

    public static String A0C(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 29);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A0F() {
        A00 = new byte[]{27, 44, 0, 19, 103, 104, cw.n, 4, 18, 1, 19, 103, 104, cw.n, 18, 112, 112, 108, 35, 4, 28, 11, 6, 3, cw.l, 74, 77, 28, cw.m, 24, 30, 3, 9, 11, 6, 77, 74, 28, 11, 6, 31, cw.m, 80, 74, 26, 61, 37, 50, 63, 58, 55, 115, 50, 63, 58, 52, 61, 62, 54, 61, 39, 115, 37, 50, 63, 38, 54, 105, 115, 69, 98, 122, 109, 96, 101, 104, 44, 109, 98, 111, 100, 99, 126, 44, 122, 109, 96, 121, 105, 54, 44, 33, 25, 27, 2, 2, 27, 28, 21, 82, cw.n, 19, 22, 82, 17, 7, 23, 82, 1, 23, 6, 6, 27, 28, 21, 72, 82, 36, 28, 30, 7, 7, 30, 25, cw.n, 87, 20, 2, 18, 87, 0, 30, 3, 31, 87, 21, 22, 19, 87, 31, 18, 22, 19, 18, 5, 77, 87, 66, 121, 124, 121, 120, 96, 121, 55, 116, 98, 114, 55, 100, 114, 99, 99, 126, 121, 112, 55, 94, 108, 107, 127, 125, 125, 74, 124, 108, 89, 104, 123, 122, 108, 123, 28, 103, 27, 105, 26, 44, 90, 46, 33, 89, 91, 46, 1, 89, 95, 95, 76, 46, 1, 89, 90, 46, 33, 89, 91, 90, 92, 88, 91, 77, 86, 122, 119, 114, 124, 117, 76, 64, 93, 34, 93, 88, 96, 93, 83, 94, 92, 84, 78, 75, 115, 78, 64, 89, 73, 68, 65, 121, 69, 95, 71, 72, 108, 105, 81, 98, 103, 99, 107, 103, 98, 90, 104, 100, 98, 96, 107, 113, 100, 53, 48, 8, 37, 50, 51, 25, 28, 36, 12, 19, 18, cw.m, 30, 87, 82, 106, 76, 80, 89, 89, 90, 66, 56, 54, 59, 57, 49, 2, 12, 21, 5, 94, 49, 55, 60, 38, 55, 32, 63, 37, 61, 50, 122, 113, 123, 28, cw.m, 52, 112, 126, 119, 118, 107, 112, 119, 126, 57, 108, 119, 106, 108, 105, 105, 118, 107, 109, 124, 125, 57, 124, 119, 109, 112, 109, 96, 35, 57, 62, 63, 25, 20, 27, 18, 127, 118, 117, 103, 96, 101, 97, 105, 95, 90, 93, 86, cw.k, 8, cw.m, 4, 76, cw.k, 4, 7, 21, 27, 30, 25, 18, 90, 5, 30, cw.n, 31, 3, 41, 55, 90, 66, 99, 111, 105, 107, 96, 122, 111, 1, 5, 8, 8, 0, 9, 119, 123, 106, 105, 71, 88, 68, 94, 67, 94, 88, 89, 21, 2, 3, 4, 31, 17, 30, 2, 5, 27, 121, 127, 38, 33, 54, 45, 93, 71, 84, 75, 53, 50, 39, 52, 50, 27, 45, 27, 8, 31, 25, 4, cw.l, 12, 1, 121, 102, 103, 122, 107, 43, 55, 62, 62, 61, 37};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static void A0H(SpannableStringBuilder spannableStringBuilder, String str, C1168Xv c1168Xv, List<C1167Xu> list, List<C1160Xn> list2) {
        int iA06 = A06(list2, str, c1168Xv);
        ArrayList arrayList = new ArrayList(list.size());
        arrayList.addAll(list);
        Collections.sort(arrayList, C1167Xu.A02);
        int length = 0;
        int i = c1168Xv.A00;
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            if (A0C(415, 2, 22).equals(((C1167Xu) arrayList.get(i2)).A01.A01)) {
                C1167Xu c1167Xu = (C1167Xu) arrayList.get(i2);
                int iA00 = A00(A06(list2, str, c1167Xu.A01), iA06, 1);
                int i3 = c1167Xu.A01.A00 - length;
                int i4 = c1167Xu.A00 - length;
                CharSequence charSequenceSubSequence = spannableStringBuilder.subSequence(i3, i4);
                spannableStringBuilder.delete(i3, i4);
                spannableStringBuilder.setSpan(new C0977Qc(charSequenceSubSequence.toString(), iA00), i, i3, 33);
                length += charSequenceSubSequence.length();
                i = i3;
            }
        }
    }

    static {
        A0F();
        A02 = Pattern.compile(A0C(Input.Keys.F17, 26, 111));
        A05 = Pattern.compile(A0C(3, 12, 38));
        HashMap map = new HashMap();
        map.put(A0C(440, 5, 19), Integer.valueOf(Color.rgb(255, 255, 255)));
        map.put(A0C(349, 4, 17), Integer.valueOf(Color.rgb(0, 255, 0)));
        map.put(A0C(300, 4, 65), Integer.valueOf(Color.rgb(0, 255, 255)));
        map.put(A0C(405, 3, 122), Integer.valueOf(Color.rgb(255, 0, 0)));
        map.put(A0C(445, 6, 79), Integer.valueOf(Color.rgb(255, 255, 0)));
        map.put(A0C(380, 7, 19), Integer.valueOf(Color.rgb(255, 0, 255)));
        map.put(A0C(289, 4, EnumC4719u30.INVALID_METRICS_ENDPOINT_VALUE), Integer.valueOf(Color.rgb(0, 0, 255)));
        map.put(A0C(284, 5, 71), Integer.valueOf(Color.rgb(0, 0, 0)));
        Map<String, Integer> defaultColors = Collections.unmodifiableMap(map);
        A04 = defaultColors;
        HashMap map2 = new HashMap();
        map2.put(A0C(267, 8, 102), Integer.valueOf(Color.rgb(255, 255, 255)));
        map2.put(A0C(244, 7, 19), Integer.valueOf(Color.rgb(0, 255, 0)));
        map2.put(A0C(237, 7, 59), Integer.valueOf(Color.rgb(0, 255, 255)));
        map2.put(A0C(261, 6, 74), Integer.valueOf(Color.rgb(255, 0, 0)));
        map2.put(A0C(275, 9, 40), Integer.valueOf(Color.rgb(255, 255, 0)));
        map2.put(A0C(251, 10, 24), Integer.valueOf(Color.rgb(255, 0, 255)));
        map2.put(A0C(230, 7, 49), Integer.valueOf(Color.rgb(0, 0, 255)));
        map2.put(A0C(EnumC4719u30.INVALID_WATERFALL_PLACEMENT_ID_VALUE, 8, 34), Integer.valueOf(Color.rgb(0, 0, 0)));
        Map<String, Integer> defaultBackgroundColors = Collections.unmodifiableMap(map2);
        A03 = defaultBackgroundColors;
    }

    public static int A00(int i, int i2, int i3) {
        if (i != -1) {
            return i;
        }
        if (i2 != -1) {
            return i2;
        }
        if (i3 != -1) {
            return i3;
        }
        throw new IllegalArgumentException();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:24:0x0098 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:25:0x0099 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:26:0x009a A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:4:0x000a  */
    /* JADX WARN: Code duplicated, block: B:6:0x000e  */
    public static int A01(String str) {
        byte b;
        switch (str.hashCode()) {
            case -1364013995:
                if (str.equals(A0C(294, 6, 79))) {
                    b = 1;
                } else {
                    b = -1;
                }
                switch (b) {
                    case 0:
                        return 0;
                    case 1:
                    case 2:
                        return 1;
                    case 3:
                        return 2;
                    default:
                        AbstractC1561fb.A07(A0C(167, 15, 20), A0C(69, 22, 17) + str);
                        return Integer.MIN_VALUE;
                }
            case -1074341483:
                if (str.equals(A0C(387, 6, 113))) {
                    b = 2;
                } else {
                    b = -1;
                }
                switch (b) {
                    case 0:
                        return 0;
                    case 1:
                    case 2:
                        return 1;
                    case 3:
                        return 2;
                    default:
                        AbstractC1561fb.A07(A0C(167, 15, 20), A0C(69, 22, 17) + str);
                        return Integer.MIN_VALUE;
                }
            case 100571:
                if (str.equals(A0C(304, 3, 2))) {
                    b = 3;
                } else {
                    b = -1;
                }
                switch (b) {
                    case 0:
                        return 0;
                    case 1:
                    case 2:
                        return 1;
                    case 3:
                        return 2;
                    default:
                        AbstractC1561fb.A07(A0C(167, 15, 20), A0C(69, 22, 17) + str);
                        return Integer.MIN_VALUE;
                }
            case 109757538:
                boolean zEquals = str.equals(A0C(TypedValues.CycleType.TYPE_WAVE_PHASE, 5, 91));
                if (A01[6].charAt(6) != 'e') {
                    throw new RuntimeException();
                }
                A01[0] = "xY9JAjZyRY1gGTbWC";
                if (zEquals) {
                    b = 0;
                } else {
                    b = -1;
                }
                switch (b) {
                    case 0:
                        return 0;
                    case 1:
                    case 2:
                        return 1;
                    case 3:
                        return 2;
                    default:
                        AbstractC1561fb.A07(A0C(167, 15, 20), A0C(69, 22, 17) + str);
                        return Integer.MIN_VALUE;
                }
            default:
                b = -1;
                switch (b) {
                    case 0:
                        return 0;
                    case 1:
                    case 2:
                        return 1;
                    case 3:
                        return 2;
                    default:
                        AbstractC1561fb.A07(A0C(167, 15, 20), A0C(69, 22, 17) + str);
                        return Integer.MIN_VALUE;
                }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:28:0x00bc A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:29:0x00bd A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:30:0x00be A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:4:0x000a  */
    /* JADX WARN: Code duplicated, block: B:6:0x000e  */
    public static int A02(String str) {
        byte b;
        switch (str.hashCode()) {
            case -1842484672:
                if (str.equals(A0C(357, 9, 124))) {
                    b = 0;
                } else {
                    b = -1;
                }
                switch (b) {
                    case 0:
                    case 1:
                        return 0;
                    case 2:
                    case 3:
                        return 1;
                    case 4:
                    case 5:
                        return 2;
                    default:
                        AbstractC1561fb.A07(A0C(167, 15, 20), A0C(69, 22, 17) + str);
                        return Integer.MIN_VALUE;
                }
            case -1364013995:
                if (str.equals(A0C(294, 6, 79))) {
                    b = 2;
                } else {
                    b = -1;
                }
                switch (b) {
                    case 0:
                    case 1:
                        return 0;
                    case 2:
                    case 3:
                        return 1;
                    case 4:
                    case 5:
                        return 2;
                    default:
                        AbstractC1561fb.A07(A0C(167, 15, 20), A0C(69, 22, 17) + str);
                        return Integer.MIN_VALUE;
                }
            case -1276788989:
                if (str.equals(A0C(366, 10, 106))) {
                    b = 4;
                } else {
                    b = -1;
                }
                switch (b) {
                    case 0:
                    case 1:
                        return 0;
                    case 2:
                    case 3:
                        return 1;
                    case 4:
                    case 5:
                        return 2;
                    default:
                        AbstractC1561fb.A07(A0C(167, 15, 20), A0C(69, 22, 17) + str);
                        return Integer.MIN_VALUE;
                }
            case -1074341483:
                if (str.equals(A0C(387, 6, 113))) {
                    b = 3;
                } else {
                    b = -1;
                }
                switch (b) {
                    case 0:
                    case 1:
                        return 0;
                    case 2:
                    case 3:
                        return 1;
                    case 4:
                    case 5:
                        return 2;
                    default:
                        AbstractC1561fb.A07(A0C(167, 15, 20), A0C(69, 22, 17) + str);
                        return Integer.MIN_VALUE;
                }
            case 100571:
                String[] strArr = A01;
                if (strArr[2].length() != strArr[3].length()) {
                    A01[7] = "5rvXLqkgrfEaUjvAjlSxl5wMf";
                    if (str.equals(A0C(304, 3, 2))) {
                        b = 5;
                    } else {
                        b = -1;
                    }
                    switch (b) {
                        case 0:
                        case 1:
                            return 0;
                        case 2:
                        case 3:
                            return 1;
                        case 4:
                        case 5:
                            return 2;
                        default:
                            AbstractC1561fb.A07(A0C(167, 15, 20), A0C(69, 22, 17) + str);
                            return Integer.MIN_VALUE;
                    }
                }
                throw new RuntimeException();
            case 109757538:
                if (str.equals(A0C(TypedValues.CycleType.TYPE_WAVE_PHASE, 5, 91))) {
                    b = 1;
                } else {
                    b = -1;
                }
                switch (b) {
                    case 0:
                    case 1:
                        return 0;
                    case 2:
                    case 3:
                        return 1;
                    case 4:
                    case 5:
                        return 2;
                    default:
                        AbstractC1561fb.A07(A0C(167, 15, 20), A0C(69, 22, 17) + str);
                        return Integer.MIN_VALUE;
                }
            default:
                b = -1;
                switch (b) {
                    case 0:
                    case 1:
                        return 0;
                    case 2:
                    case 3:
                        return 1;
                    case 4:
                    case 5:
                        return 2;
                    default:
                        AbstractC1561fb.A07(A0C(167, 15, 20), A0C(69, 22, 17) + str);
                        return Integer.MIN_VALUE;
                }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:4:0x000c  */
    public static int A03(String str) {
        byte b;
        switch (str.hashCode()) {
            case -1364013995:
                if (!str.equals(A0C(294, 6, 79))) {
                    b = -1;
                } else {
                    b = 2;
                }
                break;
            case -1074341483:
                if (!str.equals(A0C(387, 6, 113))) {
                    b = -1;
                } else {
                    b = 3;
                }
                break;
            case 100571:
                if (!str.equals(A0C(304, 3, 2))) {
                    b = -1;
                } else {
                    b = 4;
                }
                break;
            case 3317767:
                if (!str.equals(A0C(345, 4, 14))) {
                    b = -1;
                } else {
                    b = 1;
                }
                break;
            case 108511772:
                if (!str.equals(A0C(408, 5, 107))) {
                    b = -1;
                } else {
                    b = 5;
                }
                break;
            case 109757538:
                if (!str.equals(A0C(TypedValues.CycleType.TYPE_WAVE_PHASE, 5, 91))) {
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
                return 1;
            case 1:
                return 4;
            case 2:
            case 3:
                return 2;
            case 4:
                return 3;
            case 5:
                return 5;
            default:
                AbstractC1561fb.A07(A0C(167, 15, 20), A0C(44, 25, 78) + str);
                return 2;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:4:0x0008  */
    public static int A04(String str) {
        byte b;
        switch (str.hashCode()) {
            case 3462:
                if (!str.equals(A0C(376, 2, 88))) {
                    b = -1;
                } else {
                    b = 1;
                }
                break;
            case 3642:
                if (!str.equals(A0C(413, 2, 106))) {
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
                return 1;
            case 1:
                return 2;
            default:
                AbstractC1561fb.A07(A0C(167, 15, 20), A0C(18, 26, EnumC4719u30.JSON_ENCODE_ERROR_VALUE) + str);
                return Integer.MIN_VALUE;
        }
    }

    public static int A05(String str, int i) {
        int iIndexOf = str.indexOf(62, i);
        if (iIndexOf == -1) {
            int index = str.length();
            return index;
        }
        int index2 = iIndexOf + 1;
        return index2;
    }

    public static C1164Xr A08(C1576fq c1576fq, List<C1160Xn> list) {
        String strA0T = c1576fq.A0T();
        if (strA0T == null) {
            return null;
        }
        Matcher matcher = A02.matcher(strA0T);
        if (A01[1].charAt(15) == '6') {
            A01[1] = "5Ft19vFhd6FDY0w6LCtGNSBk2kXgcVxq";
            if (matcher.matches()) {
                return A09(null, matcher, c1576fq, list);
            }
            String strA0T2 = c1576fq.A0T();
            String firstLine = A01[0];
            if (firstLine.length() != 10) {
                A01[0] = "N";
                if (strA0T2 == null) {
                    return null;
                }
                Matcher matcher2 = A02.matcher(strA0T2);
                if (!matcher2.matches()) {
                    return null;
                }
                String firstLine2 = strA0T.trim();
                return A09(firstLine2, matcher2, c1576fq, list);
            }
        }
        throw new RuntimeException();
    }

    public static C1164Xr A09(String str, Matcher matcher, C1576fq c1576fq, List<C1160Xn> list) {
        C1171Xy c1171Xy = new C1171Xy();
        try {
            c1171Xy.A09 = Y0.A01((String) AbstractC1517es.A01(matcher.group(1)));
            c1171Xy.A08 = Y0.A01((String) AbstractC1517es.A01(matcher.group(2)));
            A0L((String) AbstractC1517es.A01(matcher.group(3)), c1171Xy);
            StringBuilder sb = new StringBuilder();
            String strA0T = c1576fq.A0T();
            while (!TextUtils.isEmpty(strA0T)) {
                if (sb.length() > 0) {
                    sb.append(A0C(0, 1, 12));
                }
                sb.append(strA0T.trim());
                strA0T = c1576fq.A0T();
            }
            c1171Xy.A0A = A07(str, sb.toString(), list);
            return c1171Xy.A07();
        } catch (NumberFormatException unused) {
            AbstractC1561fb.A07(A0C(167, 15, 20), A0C(EnumC4719u30.ASSET_FAILED_STATUS_CODE_VALUE, 30, 106) + matcher.group());
            return null;
        }
    }

    public static C1374cY A0A(String str) {
        C1171Xy builder = new C1171Xy();
        A0L(str, builder);
        return builder.A08();
    }

    public static C0982Qh A0B(CharSequence charSequence) {
        C1171Xy infoBuilder = new C1171Xy();
        infoBuilder.A0A = charSequence;
        return infoBuilder.A08().A0H();
    }

    public static String A0D(String str) {
        String strTrim = str.trim();
        AbstractC1517es.A07(!strTrim.isEmpty());
        return AbstractC1600gE.A1P(strTrim, A0C(182, 5, 90))[0];
    }

    public static List<C1169Xw> A0E(List<C1160Xn> list, String str, C1168Xv c1168Xv) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            C1160Xn c1160Xn = list.get(i);
            int i2 = c1160Xn.A09(str, c1168Xv.A01, c1168Xv.A03, c1168Xv.A02);
            if (i2 > 0) {
                arrayList.add(new C1169Xw(i2, c1160Xn));
            }
        }
        Collections.sort(arrayList);
        if (A01[1].charAt(15) != '6') {
            throw new RuntimeException();
        }
        String[] strArr = A01;
        strArr[5] = "jno2Jg06ahIxx4HH69mV0ZThEPzyhJ91";
        strArr[4] = "OKW2X00AiPItgC6saRqupgXKGg6PccDV";
        return arrayList;
    }

    public static void A0G(SpannableStringBuilder spannableStringBuilder, C1160Xn c1160Xn, int i, int i2) {
        if (c1160Xn == null) {
            return;
        }
        if (c1160Xn.A08() != -1) {
            AbstractC1380ce.A00(spannableStringBuilder, new StyleSpan(c1160Xn.A08()), i, i2, 33);
        }
        if (c1160Xn.A0S()) {
            spannableStringBuilder.setSpan(new StrikethroughSpan(), i, i2, 33);
        }
        if (c1160Xn.A0T()) {
            spannableStringBuilder.setSpan(new UnderlineSpan(), i, i2, 33);
        }
        if (c1160Xn.A0R()) {
            AbstractC1380ce.A00(spannableStringBuilder, new ForegroundColorSpan(c1160Xn.A05()), i, i2, 33);
        }
        boolean zA0Q = c1160Xn.A0Q();
        if (A01[0].length() != 10) {
            A01[0] = "NratlLA6o";
            if (zA0Q) {
                AbstractC1380ce.A00(spannableStringBuilder, new BackgroundColorSpan(c1160Xn.A04()), i, i2, 33);
            }
            if (c1160Xn.A0K() != null) {
                AbstractC1380ce.A00(spannableStringBuilder, new TypefaceSpan(c1160Xn.A0K()), i, i2, 33);
            }
            switch (c1160Xn.A06()) {
                case 1:
                    AbstractC1380ce.A00(spannableStringBuilder, new AbsoluteSizeSpan((int) c1160Xn.A03(), true), i, i2, 33);
                    break;
                case 2:
                    AbstractC1380ce.A00(spannableStringBuilder, new RelativeSizeSpan(c1160Xn.A03()), i, i2, 33);
                    break;
                case 3:
                    AbstractC1380ce.A00(spannableStringBuilder, new RelativeSizeSpan(c1160Xn.A03() / 100.0f), i, i2, 33);
                    break;
            }
            if (c1160Xn.A0P()) {
                spannableStringBuilder.setSpan(new C0978Qd(), i, i2, 33);
                return;
            }
            return;
        }
        throw new RuntimeException();
    }

    public static void A0I(SpannableStringBuilder spannableStringBuilder, Set<String> set, int i, int i2) {
        for (String className : set) {
            if (A04.containsKey(className)) {
                spannableStringBuilder.setSpan(new ForegroundColorSpan(A04.get(className).intValue()), i, i2, 33);
            } else if (A03.containsKey(className)) {
                spannableStringBuilder.setSpan(new BackgroundColorSpan(A03.get(className).intValue()), i, i2, 33);
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:4:0x0007  */
    public static void A0J(String str, SpannableStringBuilder spannableStringBuilder) {
        byte b;
        switch (str.hashCode()) {
            case 3309:
                if (!str.equals(A0C(307, 2, 102))) {
                    b = -1;
                } else {
                    b = 1;
                }
                break;
            case 3464:
                if (!str.equals(A0C(378, 2, 43))) {
                    b = -1;
                } else {
                    b = 0;
                }
                break;
            case 96708:
                if (!str.equals(A0C(EnumC4719u30.MRAID_JS_DOES_NOT_EXIST_VALUE, 3, 48))) {
                    b = -1;
                } else {
                    b = 3;
                }
                break;
            case 3374865:
                if (!str.equals(A0C(393, 4, 4))) {
                    b = -1;
                } else {
                    b = 2;
                }
                break;
            default:
                b = -1;
                break;
        }
        switch (b) {
            case 0:
                spannableStringBuilder.append('<');
                break;
            case 1:
                spannableStringBuilder.append('>');
                break;
            case 2:
                spannableStringBuilder.append(' ');
                break;
            case 3:
                spannableStringBuilder.append('&');
                break;
            default:
                AbstractC1561fb.A07(A0C(167, 15, 20), A0C(310, 31, 4) + str + A0C(16, 2, 86));
                break;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:4:0x0011  */
    public static void A0K(String str, C1168Xv c1168Xv, List<C1167Xu> list, SpannableStringBuilder spannableStringBuilder, List<C1160Xn> list2) {
        byte b;
        int i = c1168Xv.A00;
        int i2 = spannableStringBuilder.length();
        String str2 = c1168Xv.A01;
        int start = str2.hashCode();
        switch (start) {
            case 0:
                if (str2.equals(A0C(0, 0, 47))) {
                    b = 7;
                } else {
                    b = -1;
                }
                break;
            case Input.Keys.BUTTON_C /* 98 */:
                if (str2.equals(A0C(EnumC4719u30.AD_LOAD_FAIL_RETRY_AFTER_VALUE, 1, 93))) {
                    b = 0;
                } else {
                    b = -1;
                }
                break;
            case Input.Keys.BUTTON_X /* 99 */:
                if (str2.equals(A0C(293, 1, 32))) {
                    b = 4;
                } else {
                    b = -1;
                }
                break;
            case 105:
                if (str2.equals(A0C(309, 1, 64))) {
                    b = 1;
                } else {
                    b = -1;
                }
                break;
            case ASSET_FAILED_STATUS_CODE_VALUE:
                if (str2.equals(A0C(430, 1, 115))) {
                    b = 3;
                } else {
                    b = -1;
                }
                break;
            case PROTOBUF_SERIALIZATION_ERROR_VALUE:
                if (str2.equals(A0C(431, 1, 70))) {
                    b = 6;
                } else {
                    b = -1;
                }
                break;
            case 3314158:
                if (str2.equals(A0C(341, 4, 104))) {
                    b = 5;
                } else {
                    b = -1;
                }
                break;
            case 3511770:
                if (str2.equals(A0C(417, 4, 73))) {
                    b = 2;
                } else {
                    b = -1;
                }
                break;
            default:
                b = -1;
                break;
        }
        String[] strArr = A01;
        String str3 = strArr[5];
        String str4 = strArr[4];
        int end = str3.charAt(6);
        int start2 = str4.charAt(6);
        if (end != start2) {
            throw new RuntimeException();
        }
        A01[1] = "EuVFPal9ZYo9WC06fnmcjAZYorp0BU1U";
        switch (b) {
            case 0:
                spannableStringBuilder.setSpan(new StyleSpan(1), i, i2, 33);
                break;
            case 1:
                spannableStringBuilder.setSpan(new StyleSpan(2), i, i2, 33);
                break;
            case 2:
                A0H(spannableStringBuilder, str, c1168Xv, list, list2);
                break;
            case 3:
                spannableStringBuilder.setSpan(new UnderlineSpan(), i, i2, 33);
                break;
            case 4:
                A0I(spannableStringBuilder, c1168Xv.A03, i, i2);
                break;
            case 5:
            case 6:
            case 7:
                break;
            default:
                return;
        }
        List<C1169Xw> listA0E = A0E(list2, str, c1168Xv);
        for (int end2 = 0; end2 < start; end2++) {
            A0G(spannableStringBuilder, listA0E.get(end2).A01, i, i2);
        }
    }

    public static void A0L(String str, C1171Xy c1171Xy) {
        String name = A0C(167, 15, 20);
        Matcher matcher = A05.matcher(str);
        while (matcher.find()) {
            String str2 = (String) AbstractC1517es.A01(matcher.group(1));
            String str3 = (String) AbstractC1517es.A01(matcher.group(2));
            try {
                if (A0C(353, 4, 46).equals(str2)) {
                    A0M(str3, c1171Xy);
                } else if (A0C(EnumC4719u30.INVALID_ADUNIT_BID_PAYLOAD_VALUE, 5, 6).equals(str2)) {
                    c1171Xy.A06 = A03(str3);
                } else if (A0C(397, 8, 42).equals(str2)) {
                    A0N(str3, c1171Xy);
                } else if (A0C(TypedValues.CycleType.TYPE_WAVE_SHAPE, 4, 51).equals(str2)) {
                    c1171Xy.A02 = Y0.A00(str3);
                } else if (A0C(432, 8, 112).equals(str2)) {
                    c1171Xy.A07 = A04(str3);
                } else {
                    AbstractC1561fb.A07(name, A0C(Input.Keys.NUMPAD_3, 20, 10) + str2 + A0C(15, 1, 87) + str3);
                }
            } catch (NumberFormatException unused) {
                AbstractC1561fb.A07(name, A0C(91, 26, 111) + matcher.group());
            }
        }
    }

    public static void A0M(String str, C1171Xy c1171Xy) {
        int iIndexOf = str.indexOf(44);
        if (iIndexOf != -1) {
            int commaIndex = iIndexOf + 1;
            c1171Xy.A03 = A01(str.substring(commaIndex));
            str = str.substring(0, iIndexOf);
        }
        if (str.endsWith(A0C(2, 1, 56))) {
            float fA00 = Y0.A00(str);
            if (A01[1].charAt(15) != '6') {
                throw new RuntimeException();
            }
            String[] strArr = A01;
            strArr[2] = "RaiSszSRRKf8njehoETRLL5obseuriYt";
            strArr[3] = "MxAaWh4BXlB3WfP";
            c1171Xy.A00 = fA00;
            c1171Xy.A04 = 0;
            return;
        }
        int commaIndex2 = Integer.parseInt(str);
        c1171Xy.A00 = commaIndex2;
        if (A01[1].charAt(15) != '6') {
            c1171Xy.A04 = 1;
            return;
        }
        String[] strArr2 = A01;
        strArr2[2] = "199UenBBObik8ecpBas0Ux8CeW7wk8Fz";
        strArr2[3] = "OpVrY9ibNUeEmPb";
        c1171Xy.A04 = 1;
    }

    public static void A0N(String str, C1171Xy c1171Xy) {
        int iIndexOf = str.indexOf(44);
        if (iIndexOf != -1) {
            int commaIndex = iIndexOf + 1;
            c1171Xy.A05 = A02(str.substring(commaIndex));
            str = str.substring(0, iIndexOf);
        }
        c1171Xy.A01 = Y0.A00(str);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:4:0x0009  */
    public static boolean A0O(String str) {
        byte b;
        switch (str.hashCode()) {
            case Input.Keys.BUTTON_C /* 98 */:
                if (!str.equals(A0C(EnumC4719u30.AD_LOAD_FAIL_RETRY_AFTER_VALUE, 1, 93))) {
                    b = -1;
                } else {
                    b = 0;
                }
                break;
            case Input.Keys.BUTTON_X /* 99 */:
                if (!str.equals(A0C(293, 1, 32))) {
                    b = -1;
                } else {
                    b = 1;
                }
                break;
            case 105:
                if (!str.equals(A0C(309, 1, 64))) {
                    b = -1;
                } else {
                    b = 2;
                }
                break;
            case ASSET_FAILED_STATUS_CODE_VALUE:
                if (!str.equals(A0C(430, 1, 115))) {
                    b = -1;
                } else {
                    b = 6;
                }
                break;
            case PROTOBUF_SERIALIZATION_ERROR_VALUE:
                if (!str.equals(A0C(431, 1, 70))) {
                    b = -1;
                } else {
                    b = 7;
                }
                break;
            case 3650:
                if (!str.equals(A0C(415, 2, 22))) {
                    b = -1;
                } else {
                    b = 5;
                }
                break;
            case 3314158:
                if (!str.equals(A0C(341, 4, 104))) {
                    b = -1;
                } else {
                    b = 3;
                }
                break;
            case 3511770:
                if (!str.equals(A0C(417, 4, 73))) {
                    b = -1;
                } else {
                    b = 4;
                }
                break;
            default:
                b = -1;
                break;
        }
        switch (b) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
                return true;
            default:
                return false;
        }
    }
}
