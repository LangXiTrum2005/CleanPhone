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
import com.applovin.shadow.okhttp3.internal.http.StatusLine;
import com.applovin.shadow.okio.Utf8;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.google.android.gms.ads.AdSize;
import com.vungle.ads.internal.protos.Sdk$SDKError;
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
import org.jacoco.core.data.ExecutionDataWriter;
import org.jacoco.core.runtime.RemoteControlWriter;
import org.objectweb.asm.Opcodes;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Kn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC1325Kn {
    public static byte[] A00;
    public static String[] A01 = {"6VJGxYRVGzkOFylAWqo", "TQDRStRjVTcp84EAqriMHD1W", "Y0YMWliml1c9R0RakThzWHnpZrTCSrBu", "hjS3TiOTsIfHHkhXtOFrFHFAaycKEbQY", "GvjOo5wC83Psjizly91M8Dr7lGNbFkes", "VFbjP0ZwmY6IK0pKGb7V8NSJj5u1SgyV", "T0F9FjreghpLds1JHOV1Zh8xCqpA0ysb", "F9ZBXP7xE9Rr53rKOaE"};
    public static final Pattern A02;
    public static final Map<String, Integer> A03;
    public static final Map<String, Integer> A04;
    public static final Pattern A05;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static int A06(List<C1313Kb> list, String str, C1321Kj c1321Kj) {
        List<C1322Kk> listA0E = A0E(list, str, c1321Kj);
        for (int i = 0; i < listA0E.size(); i++) {
            C1313Kb c1313Kb = listA0E.get(i).A01;
            if (c1313Kb.A07() != -1) {
                return c1313Kb.A07();
            }
        }
        return -1;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0080  */
    /* JADX WARN: Code duplicated, block: B:31:0x0094  */
    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static SpannedString A07(String str, String str2, List<C1313Kb> list) {
        int i;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        ArrayDeque arrayDeque = new ArrayDeque();
        int iA05 = 0;
        ArrayList arrayList = new ArrayList();
        while (true) {
            int length = str2.length();
            if (A01[3].charAt(21) == 'Z') {
                throw new RuntimeException();
            }
            A01[5] = "AeTA9zfG0TGme9BEKFHCyzeTODloAdj0";
            if (iA05 >= length) {
                while (!arrayDeque.isEmpty()) {
                    A0K(str, (C1321Kj) arrayDeque.pop(), arrayList, spannableStringBuilder, list);
                }
                A0K(str, C1321Kj.A00(), Collections.emptyList(), spannableStringBuilder, list);
                return SpannedString.valueOf(spannableStringBuilder);
            }
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
                            spannableStringBuilder.append((CharSequence) A0C(1, 1, 38));
                        }
                        iA05 = iIndexOf + 1;
                    }
                    break;
                case '<':
                    if (iA05 + 1 < str2.length()) {
                        int i2 = iA05;
                        boolean z = str2.charAt(i2 + 1) == '/';
                        iA05 = A05(str2, i2 + 1);
                        boolean z2 = str2.charAt(iA05 + (-2)) == '/';
                        int i3 = (z ? 2 : 1) + i2;
                        if (A01[1].length() != 9) {
                            String[] strArr = A01;
                            strArr[2] = "RmddLkS1dXQ96i0rYlSMmYhsPXo1tsUj";
                            strArr[6] = "bXvTM6kBQx9RsuQ7PFPuWtENxJrNvh3v";
                            if (z2) {
                                i = iA05 - 2;
                            } else {
                                i = iA05 - 1;
                            }
                        } else if (z2) {
                            i = iA05 - 2;
                        } else {
                            i = iA05 - 1;
                        }
                        String strSubstring = str2.substring(i3, i);
                        if (!strSubstring.trim().isEmpty()) {
                            String strA0D = A0D(strSubstring);
                            if (A0O(strA0D)) {
                                if (z) {
                                    while (!arrayDeque.isEmpty()) {
                                        C1321Kj c1321Kj = (C1321Kj) arrayDeque.pop();
                                        A0K(str, c1321Kj, arrayList, spannableStringBuilder, list);
                                        if (!arrayDeque.isEmpty()) {
                                            arrayList.add(new C1320Ki(c1321Kj, spannableStringBuilder.length()));
                                        } else if (A01[1].length() != 9) {
                                            A01[3] = "6LBQPk5FkDk3NWAQRRtmrnBQ3lB0BSgu";
                                            arrayList.clear();
                                        } else {
                                            arrayList.clear();
                                        }
                                        if (c1321Kj.A01.equals(strA0D)) {
                                        }
                                        break;
                                    }
                                } else if (!z2) {
                                    int length2 = spannableStringBuilder.length();
                                    if (A01[4].charAt(3) == 'a') {
                                        arrayDeque.push(C1321Kj.A01(strSubstring, length2));
                                    } else {
                                        String[] strArr2 = A01;
                                        strArr2[0] = "wdDtpexUk8e3MYkSHhs";
                                        strArr2[7] = "WrocTxwzP1SCyFuF7cP";
                                        arrayDeque.push(C1321Kj.A01(strSubstring, length2));
                                    }
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
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static C1317Kf A0A(C09384v c09384v, List<C1313Kb> list) {
        String strA0T = c09384v.A0T();
        if (strA0T == null) {
            return null;
        }
        Matcher matcher = A02.matcher(strA0T);
        if (matcher.matches()) {
            return A0B(null, matcher, c09384v, list);
        }
        String strA0T2 = c09384v.A0T();
        if (strA0T2 == null) {
            return null;
        }
        Matcher matcher2 = A02.matcher(strA0T2);
        if (matcher2.matches()) {
            return A0B(strA0T.trim(), matcher2, c09384v, list);
        }
        return null;
    }

    public static String A0C(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 6);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A0F() {
        A00 = new byte[]{81, 0, 85, 68, 48, Utf8.REPLACEMENT_BYTE, 71, 83, 69, 86, 68, 48, Utf8.REPLACEMENT_BYTE, 71, 69, 0, 106, 118, 51, 20, 12, 27, 22, 19, 30, 90, 93, 12, 31, 8, 14, 19, 25, 27, 22, 93, 90, 12, 27, 22, 15, 31, RemoteControlWriter.BLOCK_CMDDUMP, 90, Utf8.REPLACEMENT_BYTE, 24, 0, 23, 26, 31, 18, 86, 23, 26, 31, ExecutionDataWriter.BLOCK_EXECUTIONDATA, 24, 27, 19, 24, 2, 86, 0, 23, 26, 3, 19, 76, 86, 82, 117, 109, 122, 119, 114, 127, 59, 122, 117, 120, 115, 116, 105, 59, 109, 122, 119, 110, 126, 33, 59, 46, 22, 20, 13, 13, 20, 19, 26, 93, 31, 28, 25, 93, 30, 8, 24, 93, 14, 24, 9, 9, 20, 19, 26, 71, 93, Utf8.REPLACEMENT_BYTE, 7, 5, 28, 28, 5, 2, 11, 76, 15, 25, 9, 76, 27, 5, 24, 4, 76, 14, 13, 8, 76, 4, 9, 13, 8, 9, 30, 86, 76, 53, 14, 11, 14, 15, 23, 14, RemoteControlWriter.BLOCK_CMDDUMP, 3, 21, 5, RemoteControlWriter.BLOCK_CMDDUMP, 19, 5, 20, 20, 9, 14, 7, RemoteControlWriter.BLOCK_CMDDUMP, 10, 56, Utf8.REPLACEMENT_BYTE, 43, 41, 41, 30, 40, 56, 13, 60, 47, 46, 56, 47, 40, 83, 47, 93, 46, 123, 13, 121, 118, 14, 12, 121, 86, 14, 8, 8, 27, 121, 86, 14, 13, 121, 118, 14, 12, 13, 11, 15, 12, 26, 1, 81, 92, 89, 87, 94, 10, 6, 27, 45, 93, 88, 96, 93, 83, 94, 92, 84, 4, 1, 57, 4, 10, 19, 3, 119, 114, 74, 118, 108, 116, 123, 118, 115, 75, 120, 125, 121, 113, 7, 2, 58, 8, 4, 2, 0, 11, ExecutionDataWriter.BLOCK_EXECUTIONDATA, 4, 39, 34, 26, 55, RemoteControlWriter.BLOCK_CMDOK, 33, RemoteControlWriter.BLOCK_CMDDUMP, 69, 125, 85, 74, 75, 86, 71, 91, 94, 102, RemoteControlWriter.BLOCK_CMDDUMP, 92, 85, 85, 86, 78, 6, 8, 5, 7, 15, 15, 1, 24, 8, 7, 101, 99, 104, 114, 99, 116, 7, 29, 5, 10, 117, 126, 116, 65, 82, 0, 3, 13, 4, 5, 24, 3, 4, 13, 74, 31, 4, 25, 31, 26, 26, 5, 24, 30, 15, 14, 74, 15, 4, 30, 3, 30, 19, 80, 74, 77, 76, 90, 87, 88, 81, 69, 76, 79, 93, 107, 110, 106, 98, 65, 68, 67, 72, 35, 38, 33, 42, 98, 35, 42, 41, 59, 113, 116, 115, 120, 48, 111, 116, 122, 117, 105, 106, 116, 113, 105, 79, 67, 69, 71, 76, 86, 67, 5, 1, 12, 12, 4, 13, 53, 57, 40, 43, 29, 2, 30, 4, 25, 4, 2, 3, 73, 94, 95, 84, 79, 65, 78, 82, 37, 59, 69, 67, 7, 0, 23, 12, 86, 76, 95, RemoteControlWriter.BLOCK_CMDDUMP, 0, 7, 18, 1, 7, 110, 124, 44, Utf8.REPLACEMENT_BYTE, 40, 46, 51, 57, 59, 54, 68, 91, 90, 71, 86, 52, 40, 33, 33, 34, 58};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static void A0H(SpannableStringBuilder spannableStringBuilder, String str, C1321Kj c1321Kj, List<C1320Ki> list, List<C1313Kb> list2) {
        int iA06 = A06(list2, str, c1321Kj);
        ArrayList arrayList = new ArrayList(list.size());
        arrayList.addAll(list);
        Collections.sort(arrayList, C1320Ki.A03());
        int length = 0;
        int i = c1321Kj.A00;
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            if (A0C(TTAdConstant.VIDEO_COVER_URL_CODE, 2, 49).equals(((C1320Ki) arrayList.get(i2)).A01.A01)) {
                C1320Ki c1320Ki = (C1320Ki) arrayList.get(i2);
                int iA00 = A00(A06(list2, str, c1320Ki.A01), iA06, 1);
                int i3 = c1320Ki.A01.A00 - length;
                int i4 = c1320Ki.A00 - length;
                CharSequence charSequenceSubSequence = spannableStringBuilder.subSequence(i3, i4);
                spannableStringBuilder.delete(i3, i4);
                spannableStringBuilder.setSpan(new C2637pP(charSequenceSubSequence.toString(), iA00), i, i3, 33);
                length += charSequenceSubSequence.length();
                i = i3;
            }
        }
    }

    static {
        A0F();
        A02 = Pattern.compile(A0C(Opcodes.NEW, 26, 35));
        A05 = Pattern.compile(A0C(3, 12, 106));
        HashMap map = new HashMap();
        map.put(A0C(440, 5, 53), Integer.valueOf(Color.rgb(255, 255, 255)));
        map.put(A0C(349, 4, 1), Integer.valueOf(Color.rgb(0, 255, 0)));
        map.put(A0C(AdSize.MEDIUM_RECTANGLE_WIDTH, 4, 98), Integer.valueOf(Color.rgb(0, 255, 255)));
        map.put(A0C(405, 3, 61), Integer.valueOf(Color.rgb(255, 0, 0)));
        map.put(A0C(445, 6, 75), Integer.valueOf(Color.rgb(255, 255, 0)));
        map.put(A0C(380, 7, 36), Integer.valueOf(Color.rgb(255, 0, 255)));
        map.put(A0C(289, 4, 107), Integer.valueOf(Color.rgb(0, 0, 255)));
        map.put(A0C(284, 5, 98), Integer.valueOf(Color.rgb(0, 0, 0)));
        Map<String, Integer> defaultColors = Collections.unmodifiableMap(map);
        A04 = defaultColors;
        HashMap map2 = new HashMap();
        map2.put(A0C(267, 8, 36), Integer.valueOf(Color.rgb(255, 255, 255)));
        map2.put(A0C(244, 7, 18), Integer.valueOf(Color.rgb(0, 255, 0)));
        map2.put(A0C(237, 7, 19), Integer.valueOf(Color.rgb(0, 255, 255)));
        map2.put(A0C(261, 6, 67), Integer.valueOf(Color.rgb(255, 0, 0)));
        map2.put(A0C(275, 9, 63), Integer.valueOf(Color.rgb(255, 255, 0)));
        map2.put(A0C(251, 10, 99), Integer.valueOf(Color.rgb(255, 0, 255)));
        map2.put(A0C(230, 7, 96), Integer.valueOf(Color.rgb(0, 0, 255)));
        map2.put(A0C(Sdk$SDKError.Reason.INVALID_WATERFALL_PLACEMENT_ID_VALUE, 8, 57), Integer.valueOf(Color.rgb(0, 0, 0)));
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
    /* JADX WARN: Code duplicated, block: B:22:0x0091 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:23:0x0092 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:24:0x0093 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:4:0x000a  */
    /* JADX WARN: Code duplicated, block: B:6:0x000e  */
    public static int A01(String str) {
        byte b;
        switch (str.hashCode()) {
            case -1364013995:
                if (str.equals(A0C(294, 6, 0))) {
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
                        AbstractC09234g.A07(A0C(Opcodes.GOTO, 15, 91), A0C(69, 22, 29) + str);
                        return Integer.MIN_VALUE;
                }
            case -1074341483:
                if (A01[1].length() != 9) {
                    A01[4] = "zDr3pXiReOD9C2voGl4pNyTssnTsthj2";
                    if (str.equals(A0C(387, 6, 110))) {
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
                            AbstractC09234g.A07(A0C(Opcodes.GOTO, 15, 91), A0C(69, 22, 29) + str);
                            return Integer.MIN_VALUE;
                    }
                }
                throw new RuntimeException();
            case 100571:
                if (str.equals(A0C(Sdk$SDKError.Reason.AD_EXPIRED_VALUE, 3, 22))) {
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
                        AbstractC09234g.A07(A0C(Opcodes.GOTO, 15, 91), A0C(69, 22, 29) + str);
                        return Integer.MIN_VALUE;
                }
            case 109757538:
                if (str.equals(A0C(425, 5, 117))) {
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
                        AbstractC09234g.A07(A0C(Opcodes.GOTO, 15, 91), A0C(69, 22, 29) + str);
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
                        AbstractC09234g.A07(A0C(Opcodes.GOTO, 15, 91), A0C(69, 22, 29) + str);
                        return Integer.MIN_VALUE;
                }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:4:0x000a  */
    public static int A02(String str) {
        byte b;
        switch (str.hashCode()) {
            case -1842484672:
                if (!str.equals(A0C(357, 9, 73))) {
                    b = -1;
                } else {
                    b = 0;
                }
                break;
            case -1364013995:
                if (!str.equals(A0C(294, 6, 0))) {
                    b = -1;
                } else {
                    b = 2;
                }
                break;
            case -1276788989:
                if (!str.equals(A0C(366, 10, 27))) {
                    b = -1;
                } else {
                    b = 4;
                }
                break;
            case -1074341483:
                if (!str.equals(A0C(387, 6, 110))) {
                    b = -1;
                } else {
                    b = 3;
                }
                break;
            case 100571:
                if (!str.equals(A0C(Sdk$SDKError.Reason.AD_EXPIRED_VALUE, 3, 22))) {
                    b = -1;
                } else {
                    b = 5;
                }
                break;
            case 109757538:
                if (!str.equals(A0C(425, 5, 117))) {
                    b = -1;
                } else {
                    b = 1;
                }
                break;
            default:
                b = -1;
                break;
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
                AbstractC09234g.A07(A0C(Opcodes.GOTO, 15, 91), A0C(69, 22, 29) + str);
                return Integer.MIN_VALUE;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:4:0x000c  */
    public static int A03(String str) {
        byte b;
        switch (str.hashCode()) {
            case -1364013995:
                if (!str.equals(A0C(294, 6, 0))) {
                    b = -1;
                } else {
                    b = 2;
                }
                break;
            case -1074341483:
                if (!str.equals(A0C(387, 6, 110))) {
                    b = -1;
                } else {
                    b = 3;
                }
                break;
            case 100571:
                if (!str.equals(A0C(Sdk$SDKError.Reason.AD_EXPIRED_VALUE, 3, 22))) {
                    b = -1;
                } else {
                    b = 4;
                }
                break;
            case 3317767:
                if (!str.equals(A0C(345, 4, 47))) {
                    b = -1;
                } else {
                    b = 1;
                }
                break;
            case 108511772:
                if (!str.equals(A0C(408, 5, 32))) {
                    b = -1;
                } else {
                    b = 5;
                }
                break;
            case 109757538:
                if (!str.equals(A0C(425, 5, 117))) {
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
                AbstractC09234g.A07(A0C(Opcodes.GOTO, 15, 91), A0C(44, 25, 112) + str);
                return 2;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:4:0x0008  */
    public static int A04(String str) {
        byte b;
        switch (str.hashCode()) {
            case 3462:
                if (!str.equals(A0C(376, 2, 0))) {
                    b = -1;
                } else {
                    b = 1;
                }
                break;
            case 3642:
                if (!str.equals(A0C(TTAdConstant.VIDEO_INFO_CODE, 2, 81))) {
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
                AbstractC09234g.A07(A0C(Opcodes.GOTO, 15, 91), A0C(18, 26, 124) + str);
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

    public static C09053o A08(String str) {
        C1324Km builder = new C1324Km();
        A0L(str, builder);
        return builder.A07();
    }

    public static C2641pT A09(CharSequence charSequence) {
        C1324Km infoBuilder = new C1324Km();
        infoBuilder.A0A = charSequence;
        return infoBuilder.A07().A0H();
    }

    public static C1317Kf A0B(String str, Matcher matcher, C09384v c09384v, List<C1313Kb> list) {
        C1324Km c1324Km = new C1324Km();
        try {
            c1324Km.A09 = AbstractC1326Ko.A01((String) AbstractC09153y.A01(matcher.group(1)));
            c1324Km.A08 = AbstractC1326Ko.A01((String) AbstractC09153y.A01(matcher.group(2)));
            A0L((String) AbstractC09153y.A01(matcher.group(3)), c1324Km);
            StringBuilder sb = new StringBuilder();
            String strA0T = c09384v.A0T();
            while (true) {
                boolean zIsEmpty = TextUtils.isEmpty(strA0T);
                if (A01[5].charAt(2) == 'h') {
                    throw new RuntimeException();
                }
                A01[1] = "2AwiW2AhFaTR";
                if (!zIsEmpty) {
                    if (sb.length() > 0) {
                        sb.append(A0C(0, 1, 93));
                    }
                    sb.append(strA0T.trim());
                    strA0T = c09384v.A0T();
                } else {
                    c1324Km.A0A = A07(str, sb.toString(), list);
                    return c1324Km.A08();
                }
            }
        } catch (NumberFormatException unused) {
            AbstractC09234g.A07(A0C(Opcodes.GOTO, 15, 91), A0C(117, 30, 106) + matcher.group());
            return null;
        }
    }

    public static String A0D(String str) {
        String strTrim = str.trim();
        AbstractC09153y.A07(!strTrim.isEmpty());
        return C5C.A1P(strTrim, A0C(Opcodes.INVOKEVIRTUAL, 5, 117))[0];
    }

    public static List<C1322Kk> A0E(List<C1313Kb> list, String str, C1321Kj c1321Kj) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            C1313Kb c1313Kb = list.get(i);
            int i2 = c1313Kb.A09(str, c1321Kj.A01, c1321Kj.A03, c1321Kj.A02);
            if (i2 > 0) {
                arrayList.add(new C1322Kk(i2, c1313Kb));
            }
        }
        Collections.sort(arrayList);
        if (A01[3].charAt(21) == 'Z') {
            throw new RuntimeException();
        }
        A01[3] = "10DtqaDx3Mjis7pngfRsmCfeCaw0vB2Q";
        return arrayList;
    }

    public static void A0G(SpannableStringBuilder spannableStringBuilder, C1313Kb c1313Kb, int i, int i2) {
        if (c1313Kb == null) {
            return;
        }
        if (c1313Kb.A08() != -1) {
            AbstractC09103t.A00(spannableStringBuilder, new StyleSpan(c1313Kb.A08()), i, i2, 33);
        }
        if (c1313Kb.A0S()) {
            spannableStringBuilder.setSpan(new StrikethroughSpan(), i, i2, 33);
        }
        boolean zA0T = c1313Kb.A0T();
        if (A01[3].charAt(21) != 'Z') {
            A01[3] = "1YLI45HvZzSZe2yut9V0MUcCwjpGC5gE";
            if (zA0T) {
                spannableStringBuilder.setSpan(new UnderlineSpan(), i, i2, 33);
            }
            if (c1313Kb.A0R()) {
                AbstractC09103t.A00(spannableStringBuilder, new ForegroundColorSpan(c1313Kb.A05()), i, i2, 33);
            }
            if (c1313Kb.A0Q()) {
                AbstractC09103t.A00(spannableStringBuilder, new BackgroundColorSpan(c1313Kb.A04()), i, i2, 33);
            }
            if (c1313Kb.A0K() != null) {
                AbstractC09103t.A00(spannableStringBuilder, new TypefaceSpan(c1313Kb.A0K()), i, i2, 33);
            }
            switch (c1313Kb.A06()) {
                case 1:
                    AbstractC09103t.A00(spannableStringBuilder, new AbsoluteSizeSpan((int) c1313Kb.A03(), true), i, i2, 33);
                    break;
                case 2:
                    AbstractC09103t.A00(spannableStringBuilder, new RelativeSizeSpan(c1313Kb.A03()), i, i2, 33);
                    break;
                case 3:
                    AbstractC09103t.A00(spannableStringBuilder, new RelativeSizeSpan(c1313Kb.A03() / 100.0f), i, i2, 33);
                    break;
            }
            if (c1313Kb.A0P()) {
                spannableStringBuilder.setSpan(new C2638pQ(), i, i2, 33);
                return;
            }
            return;
        }
        throw new RuntimeException();
    }

    public static void A0I(SpannableStringBuilder spannableStringBuilder, Set<String> set, int i, int i2) {
        for (String str : set) {
            boolean zContainsKey = A04.containsKey(str);
            if (A01[1].length() == 9) {
                throw new RuntimeException();
            }
            A01[5] = "YNIn8hUAyZDjSH3JhERqEXsouXgj93JS";
            if (zContainsKey) {
                spannableStringBuilder.setSpan(new ForegroundColorSpan(A04.get(str).intValue()), i, i2, 33);
            } else {
                Map<String, Integer> map = A03;
                String className = A01[3];
                if (className.charAt(21) != 'Z') {
                    A01[3] = "z1JdxX10iLj514Di1TKQv9nGlpU0X7eV";
                    if (map.containsKey(str)) {
                        spannableStringBuilder.setSpan(new BackgroundColorSpan(A03.get(str).intValue()), i, i2, 33);
                    }
                } else if (map.containsKey(str)) {
                    spannableStringBuilder.setSpan(new BackgroundColorSpan(A03.get(str).intValue()), i, i2, 33);
                }
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:10:0x004d  */
    /* JADX WARN: Code duplicated, block: B:11:0x0053  */
    /* JADX WARN: Code duplicated, block: B:4:0x0007  */
    /* JADX WARN: Code duplicated, block: B:6:0x000b  */
    /* JADX WARN: Code duplicated, block: B:8:0x0041  */
    /* JADX WARN: Code duplicated, block: B:9:0x0047  */
    public static void A0J(String str, SpannableStringBuilder spannableStringBuilder) {
        byte b;
        switch (str.hashCode()) {
            case 3309:
                boolean zEquals = str.equals(A0C(307, 2, 32));
                String[] strArr = A01;
                if (strArr[0].length() == strArr[7].length()) {
                    A01[1] = "Z6Yq6aysKH1bmBhKZFPJxCKyS02If";
                    if (zEquals) {
                        b = 1;
                    } else {
                        b = -1;
                    }
                    switch (b) {
                        case 0:
                            spannableStringBuilder.append('<');
                            return;
                        case 1:
                            spannableStringBuilder.append('>');
                            return;
                        case 2:
                            spannableStringBuilder.append(' ');
                            return;
                        case 3:
                            spannableStringBuilder.append('&');
                            return;
                        default:
                            AbstractC09234g.A07(A0C(Opcodes.GOTO, 15, 91), A0C(Sdk$SDKError.Reason.AD_HTML_FAILED_TO_LOAD_VALUE, 31, 108) + str + A0C(16, 2, 87));
                            return;
                    }
                }
                throw new RuntimeException();
            case 3464:
                if (str.equals(A0C(378, 2, 27))) {
                    b = 0;
                } else {
                    b = -1;
                }
                switch (b) {
                    case 0:
                        spannableStringBuilder.append('<');
                        return;
                    case 1:
                        spannableStringBuilder.append('>');
                        return;
                    case 2:
                        spannableStringBuilder.append(' ');
                        return;
                    case 3:
                        spannableStringBuilder.append('&');
                        return;
                    default:
                        AbstractC09234g.A07(A0C(Opcodes.GOTO, 15, 91), A0C(Sdk$SDKError.Reason.AD_HTML_FAILED_TO_LOAD_VALUE, 31, 108) + str + A0C(16, 2, 87));
                        return;
                }
            case 96708:
                boolean zEquals2 = str.equals(A0C(Sdk$SDKError.Reason.MRAID_JS_DOES_NOT_EXIST_VALUE, 3, 109));
                if (A01[5].charAt(2) != 'h') {
                    String[] strArr2 = A01;
                    strArr2[2] = "0e7ADHSVMy4QvuNOaRsoWPMCToECBQOy";
                    strArr2[6] = "0jhJvpoe9graGazv1ZIcpM6WWqxYTLD3";
                    if (zEquals2) {
                        b = 3;
                    } else {
                        b = -1;
                    }
                    switch (b) {
                        case 0:
                            spannableStringBuilder.append('<');
                            return;
                        case 1:
                            spannableStringBuilder.append('>');
                            return;
                        case 2:
                            spannableStringBuilder.append(' ');
                            return;
                        case 3:
                            spannableStringBuilder.append('&');
                            return;
                        default:
                            AbstractC09234g.A07(A0C(Opcodes.GOTO, 15, 91), A0C(Sdk$SDKError.Reason.AD_HTML_FAILED_TO_LOAD_VALUE, 31, 108) + str + A0C(16, 2, 87));
                            return;
                    }
                }
                throw new RuntimeException();
            case 3374865:
                if (str.equals(A0C(393, 4, 93))) {
                    b = 2;
                } else {
                    b = -1;
                }
                switch (b) {
                    case 0:
                        spannableStringBuilder.append('<');
                        return;
                    case 1:
                        spannableStringBuilder.append('>');
                        return;
                    case 2:
                        spannableStringBuilder.append(' ');
                        return;
                    case 3:
                        spannableStringBuilder.append('&');
                        return;
                    default:
                        AbstractC09234g.A07(A0C(Opcodes.GOTO, 15, 91), A0C(Sdk$SDKError.Reason.AD_HTML_FAILED_TO_LOAD_VALUE, 31, 108) + str + A0C(16, 2, 87));
                        return;
                }
            default:
                b = -1;
                switch (b) {
                    case 0:
                        spannableStringBuilder.append('<');
                        return;
                    case 1:
                        spannableStringBuilder.append('>');
                        return;
                    case 2:
                        spannableStringBuilder.append(' ');
                        return;
                    case 3:
                        spannableStringBuilder.append('&');
                        return;
                    default:
                        AbstractC09234g.A07(A0C(Opcodes.GOTO, 15, 91), A0C(Sdk$SDKError.Reason.AD_HTML_FAILED_TO_LOAD_VALUE, 31, 108) + str + A0C(16, 2, 87));
                        return;
                }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:36:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:37:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:38:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:39:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:40:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:44:0x00f0 A[LOOP:0: B:42:0x00ea->B:44:0x00f0, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:4:0x0011  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017 A[RETURN] */
    public static void A0K(String str, C1321Kj c1321Kj, List<C1320Ki> list, SpannableStringBuilder spannableStringBuilder, List<C1313Kb> list2) {
        int start;
        List<C1322Kk> listA0E;
        int end;
        int start2;
        int i = c1321Kj.A00;
        int i2 = spannableStringBuilder.length();
        String str2 = c1321Kj.A01;
        int start3 = str2.hashCode();
        switch (start3) {
            case 0:
                if (str2.equals(A0C(0, 0, 43))) {
                    start = 7;
                } else {
                    start = -1;
                }
                switch (start) {
                    case 0:
                        spannableStringBuilder.setSpan(new StyleSpan(1), i, i2, 33);
                        break;
                    case 1:
                        spannableStringBuilder.setSpan(new StyleSpan(2), i, i2, 33);
                        break;
                    case 2:
                        A0H(spannableStringBuilder, str, c1321Kj, list, list2);
                        break;
                    case 3:
                        spannableStringBuilder.setSpan(new UnderlineSpan(), i, i2, 33);
                        break;
                    case 4:
                        A0I(spannableStringBuilder, c1321Kj.A03, i, i2);
                        break;
                    case 5:
                    case 6:
                    case 7:
                        break;
                    default:
                        return;
                }
                listA0E = A0E(list2, str, c1321Kj);
                for (end = 0; end < start2; end++) {
                    A0G(spannableStringBuilder, listA0E.get(end).A01, i, i2);
                    break;
                }
                return;
            case 98:
                if (str2.equals(A0C(Sdk$SDKError.Reason.AD_LOAD_FAIL_RETRY_AFTER_VALUE, 1, 73))) {
                    start = 0;
                } else {
                    start = -1;
                }
                switch (start) {
                    case 0:
                        spannableStringBuilder.setSpan(new StyleSpan(1), i, i2, 33);
                        break;
                    case 1:
                        spannableStringBuilder.setSpan(new StyleSpan(2), i, i2, 33);
                        break;
                    case 2:
                        A0H(spannableStringBuilder, str, c1321Kj, list, list2);
                        break;
                    case 3:
                        spannableStringBuilder.setSpan(new UnderlineSpan(), i, i2, 33);
                        break;
                    case 4:
                        A0I(spannableStringBuilder, c1321Kj.A03, i, i2);
                        break;
                    case 5:
                    case 6:
                    case 7:
                        break;
                    default:
                        return;
                }
                listA0E = A0E(list2, str, c1321Kj);
                while (end < start2) {
                    A0G(spannableStringBuilder, listA0E.get(end).A01, i, i2);
                    break;
                }
                return;
            case 99:
                if (str2.equals(A0C(293, 1, 98))) {
                    start = 4;
                } else {
                    start = -1;
                }
                switch (start) {
                    case 0:
                        spannableStringBuilder.setSpan(new StyleSpan(1), i, i2, 33);
                        break;
                    case 1:
                        spannableStringBuilder.setSpan(new StyleSpan(2), i, i2, 33);
                        break;
                    case 2:
                        A0H(spannableStringBuilder, str, c1321Kj, list, list2);
                        break;
                    case 3:
                        spannableStringBuilder.setSpan(new UnderlineSpan(), i, i2, 33);
                        break;
                    case 4:
                        A0I(spannableStringBuilder, c1321Kj.A03, i, i2);
                        break;
                    case 5:
                    case 6:
                    case 7:
                        break;
                    default:
                        return;
                }
                listA0E = A0E(list2, str, c1321Kj);
                while (end < start2) {
                    A0G(spannableStringBuilder, listA0E.get(end).A01, i, i2);
                    break;
                }
                return;
            case 105:
                if (str2.equals(A0C(Sdk$SDKError.Reason.ASSET_FAILED_TO_DELETE_VALUE, 1, 111))) {
                    start = 1;
                } else {
                    start = -1;
                }
                switch (start) {
                    case 0:
                        spannableStringBuilder.setSpan(new StyleSpan(1), i, i2, 33);
                        break;
                    case 1:
                        spannableStringBuilder.setSpan(new StyleSpan(2), i, i2, 33);
                        break;
                    case 2:
                        A0H(spannableStringBuilder, str, c1321Kj, list, list2);
                        break;
                    case 3:
                        spannableStringBuilder.setSpan(new UnderlineSpan(), i, i2, 33);
                        break;
                    case 4:
                        A0I(spannableStringBuilder, c1321Kj.A03, i, i2);
                        break;
                    case 5:
                    case 6:
                    case 7:
                        break;
                    default:
                        return;
                }
                listA0E = A0E(list2, str, c1321Kj);
                while (end < start2) {
                    A0G(spannableStringBuilder, listA0E.get(end).A01, i, i2);
                    break;
                }
                return;
            case 117:
                if (str2.equals(A0C(430, 1, 29))) {
                    start = 3;
                } else {
                    start = -1;
                }
                switch (start) {
                    case 0:
                        spannableStringBuilder.setSpan(new StyleSpan(1), i, i2, 33);
                        break;
                    case 1:
                        spannableStringBuilder.setSpan(new StyleSpan(2), i, i2, 33);
                        break;
                    case 2:
                        A0H(spannableStringBuilder, str, c1321Kj, list, list2);
                        break;
                    case 3:
                        spannableStringBuilder.setSpan(new UnderlineSpan(), i, i2, 33);
                        break;
                    case 4:
                        A0I(spannableStringBuilder, c1321Kj.A03, i, i2);
                        break;
                    case 5:
                    case 6:
                    case 7:
                        break;
                    default:
                        return;
                }
                listA0E = A0E(list2, str, c1321Kj);
                while (end < start2) {
                    A0G(spannableStringBuilder, listA0E.get(end).A01, i, i2);
                    break;
                }
                return;
            case 118:
                if (str2.equals(A0C(431, 1, 12))) {
                    start = 6;
                } else {
                    start = -1;
                }
                switch (start) {
                    case 0:
                        spannableStringBuilder.setSpan(new StyleSpan(1), i, i2, 33);
                        break;
                    case 1:
                        spannableStringBuilder.setSpan(new StyleSpan(2), i, i2, 33);
                        break;
                    case 2:
                        A0H(spannableStringBuilder, str, c1321Kj, list, list2);
                        break;
                    case 3:
                        spannableStringBuilder.setSpan(new UnderlineSpan(), i, i2, 33);
                        break;
                    case 4:
                        A0I(spannableStringBuilder, c1321Kj.A03, i, i2);
                        break;
                    case 5:
                    case 6:
                    case 7:
                        break;
                    default:
                        return;
                }
                listA0E = A0E(list2, str, c1321Kj);
                while (end < start2) {
                    A0G(spannableStringBuilder, listA0E.get(end).A01, i, i2);
                    break;
                }
                return;
            case 3314158:
                if (str2.equals(A0C(341, 4, 48))) {
                    start = 5;
                } else {
                    start = -1;
                }
                switch (start) {
                    case 0:
                        spannableStringBuilder.setSpan(new StyleSpan(1), i, i2, 33);
                        break;
                    case 1:
                        spannableStringBuilder.setSpan(new StyleSpan(2), i, i2, 33);
                        break;
                    case 2:
                        A0H(spannableStringBuilder, str, c1321Kj, list, list2);
                        break;
                    case 3:
                        spannableStringBuilder.setSpan(new UnderlineSpan(), i, i2, 33);
                        break;
                    case 4:
                        A0I(spannableStringBuilder, c1321Kj.A03, i, i2);
                        break;
                    case 5:
                    case 6:
                    case 7:
                        break;
                    default:
                        return;
                }
                listA0E = A0E(list2, str, c1321Kj);
                while (end < start2) {
                    A0G(spannableStringBuilder, listA0E.get(end).A01, i, i2);
                    break;
                }
                return;
            case 3511770:
                boolean zEquals = str2.equals(A0C(TTAdConstant.DOWNLOAD_URL_AND_PACKAGE_NAME, 4, 115));
                String[] strArr = A01;
                String str3 = strArr[0];
                String str4 = strArr[7];
                int end2 = str3.length();
                int start4 = str4.length();
                if (end2 != start4) {
                    throw new RuntimeException();
                }
                A01[3] = "p1tLKUYj0fLqnT8dJpZfHw2ryYMkTMQB";
                if (zEquals) {
                    start = 2;
                } else {
                    start = -1;
                }
                switch (start) {
                    case 0:
                        spannableStringBuilder.setSpan(new StyleSpan(1), i, i2, 33);
                        break;
                    case 1:
                        spannableStringBuilder.setSpan(new StyleSpan(2), i, i2, 33);
                        break;
                    case 2:
                        A0H(spannableStringBuilder, str, c1321Kj, list, list2);
                        break;
                    case 3:
                        spannableStringBuilder.setSpan(new UnderlineSpan(), i, i2, 33);
                        break;
                    case 4:
                        A0I(spannableStringBuilder, c1321Kj.A03, i, i2);
                        break;
                    case 5:
                    case 6:
                    case 7:
                        break;
                    default:
                        return;
                }
                listA0E = A0E(list2, str, c1321Kj);
                while (end < start2) {
                    A0G(spannableStringBuilder, listA0E.get(end).A01, i, i2);
                    break;
                }
                return;
            default:
                start = -1;
                switch (start) {
                    case 0:
                        spannableStringBuilder.setSpan(new StyleSpan(1), i, i2, 33);
                        break;
                    case 1:
                        spannableStringBuilder.setSpan(new StyleSpan(2), i, i2, 33);
                        break;
                    case 2:
                        A0H(spannableStringBuilder, str, c1321Kj, list, list2);
                        break;
                    case 3:
                        spannableStringBuilder.setSpan(new UnderlineSpan(), i, i2, 33);
                        break;
                    case 4:
                        A0I(spannableStringBuilder, c1321Kj.A03, i, i2);
                        break;
                    case 5:
                    case 6:
                    case 7:
                        break;
                    default:
                        return;
                }
                listA0E = A0E(list2, str, c1321Kj);
                while (end < start2) {
                    A0G(spannableStringBuilder, listA0E.get(end).A01, i, i2);
                    break;
                }
                return;
        }
    }

    public static void A0L(String str, C1324Km c1324Km) {
        String value = A0C(Opcodes.GOTO, 15, 91);
        Matcher matcher = A05.matcher(str);
        while (matcher.find()) {
            Object objA01 = AbstractC09153y.A01(matcher.group(1));
            String[] strArr = A01;
            if (strArr[2].charAt(10) == strArr[6].charAt(10)) {
                throw new RuntimeException();
            }
            A01[3] = "IuLRiWa83LmFflMS6GnqXQo4BkpBDAaM";
            String str2 = (String) objA01;
            String str3 = (String) AbstractC09153y.A01(matcher.group(2));
            try {
                if (A0C(353, 4, 43).equals(str2)) {
                    A0M(str3, c1324Km);
                } else if (A0C(Sdk$SDKError.Reason.INVALID_ADUNIT_BID_PAYLOAD_VALUE, 5, 54).equals(str2)) {
                    c1324Km.A06 = A03(str3);
                } else if (A0C(397, 8, 107).equals(str2)) {
                    A0N(str3, c1324Km);
                } else if (A0C(StatusLine.HTTP_MISDIRECTED_REQUEST, 4, 35).equals(str2)) {
                    c1324Km.A02 = AbstractC1326Ko.A00(str3);
                } else if (A0C(432, 8, 92).equals(str2)) {
                    c1324Km.A07 = A04(str3);
                } else {
                    AbstractC09234g.A07(value, A0C(Opcodes.I2S, 20, 102) + str2 + A0C(15, 1, 60) + str3);
                }
            } catch (NumberFormatException unused) {
                AbstractC09234g.A07(value, A0C(91, 26, 123) + matcher.group());
            }
        }
    }

    public static void A0M(String str, C1324Km c1324Km) {
        int iIndexOf = str.indexOf(44);
        if (iIndexOf != -1) {
            int commaIndex = iIndexOf + 1;
            c1324Km.A03 = A01(str.substring(commaIndex));
            str = str.substring(0, iIndexOf);
        }
        if (str.endsWith(A0C(2, 1, 118))) {
            c1324Km.A00 = AbstractC1326Ko.A00(str);
            c1324Km.A04 = 0;
        } else {
            int commaIndex2 = Integer.parseInt(str);
            c1324Km.A00 = commaIndex2;
            c1324Km.A04 = 1;
        }
    }

    public static void A0N(String str, C1324Km c1324Km) {
        int iIndexOf = str.indexOf(44);
        if (iIndexOf != -1) {
            int commaIndex = iIndexOf + 1;
            c1324Km.A05 = A02(str.substring(commaIndex));
            str = str.substring(0, iIndexOf);
        }
        c1324Km.A01 = AbstractC1326Ko.A00(str);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0081  */
    /* JADX WARN: Code duplicated, block: B:40:0x00fe A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:6:0x000d A[RETURN] */
    public static boolean A0O(String str) {
        byte b;
        switch (str.hashCode()) {
            case 98:
                if (str.equals(A0C(Sdk$SDKError.Reason.AD_LOAD_FAIL_RETRY_AFTER_VALUE, 1, 73))) {
                    b = 0;
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
            case 99:
                if (str.equals(A0C(293, 1, 98))) {
                    b = 1;
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
            case 105:
                String strA0C = A0C(Sdk$SDKError.Reason.ASSET_FAILED_TO_DELETE_VALUE, 1, 111);
                String[] strArr = A01;
                if (strArr[2].charAt(10) == strArr[6].charAt(10)) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A01;
                strArr2[2] = "lfhFeDS1O2o1uIM0aOGK2jmnN5o1ZQFy";
                strArr2[6] = "gZA4cz0ExJhogJKpMVDSuYGHtyxwi0jr";
                if (str.equals(strA0C)) {
                    b = 2;
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
            case 117:
                if (str.equals(A0C(430, 1, 29))) {
                    b = 6;
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
            case 118:
                if (A01[3].charAt(21) != 'Z') {
                    A01[4] = "nN5IyC8pDtxjsjNmobfqstup1YpOndtX";
                    if (str.equals(A0C(431, 1, 12))) {
                        b = 7;
                    }
                } else {
                    A01[1] = "d0efHOF5zOPljB40";
                    if (str.equals(A0C(431, 1, 6))) {
                        b = 7;
                    }
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
            case 3650:
                if (A01[3].charAt(21) == 'Z') {
                    throw new RuntimeException();
                }
                String[] strArr3 = A01;
                strArr3[0] = "3Lkw1PxTKRAL7UJ3iME";
                strArr3[7] = "Pvn03sQd9gQ2SLf9pLX";
                if (str.equals(A0C(TTAdConstant.VIDEO_COVER_URL_CODE, 2, 49))) {
                    b = 5;
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
            case 3314158:
                if (str.equals(A0C(341, 4, 48))) {
                    b = 3;
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
            case 3511770:
                if (str.equals(A0C(TTAdConstant.DOWNLOAD_URL_AND_PACKAGE_NAME, 4, 115))) {
                    b = 4;
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
        b = -1;
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
