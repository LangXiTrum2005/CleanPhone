package com.smartdigimkt.p4;

import android.net.Uri;
import android.text.TextUtils;
import com.startapp.simple.bloomfilter.codec.IOUtils;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
public final class e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int f37535a = 4;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int f37536b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f37537c = 1;
    private static final int d = 2;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int f37538e = 3;

    private e0() {
    }

    public static String a(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        if (str == null) {
            str = "";
        }
        if (str2 == null) {
            str2 = "";
        }
        int[] iArrA = a(str2);
        if (iArrA[0] != -1) {
            sb.append(str2);
            a(sb, iArrA[1], iArrA[2]);
            return sb.toString();
        }
        int[] iArrA2 = a(str);
        if (iArrA[3] == 0) {
            sb.append((CharSequence) str, 0, iArrA2[3]);
            sb.append(str2);
            return sb.toString();
        }
        if (iArrA[2] == 0) {
            sb.append((CharSequence) str, 0, iArrA2[2]);
            sb.append(str2);
            return sb.toString();
        }
        int i2 = iArrA[1];
        if (i2 != 0) {
            int i3 = iArrA2[0] + 1;
            sb.append((CharSequence) str, 0, i3);
            sb.append(str2);
            return a(sb, iArrA[1] + i3, i3 + iArrA[2]);
        }
        if (str2.charAt(i2) == '/') {
            sb.append((CharSequence) str, 0, iArrA2[1]);
            sb.append(str2);
            int i4 = iArrA2[1];
            return a(sb, i4, iArrA[2] + i4);
        }
        int i5 = iArrA2[0] + 2;
        int i6 = iArrA2[1];
        if (i5 >= i6 || i6 != iArrA2[2]) {
            int iLastIndexOf = str.lastIndexOf(47, iArrA2[2] - 1);
            int i7 = iLastIndexOf == -1 ? iArrA2[1] : iLastIndexOf + 1;
            sb.append((CharSequence) str, 0, i7);
            sb.append(str2);
            return a(sb, iArrA2[1], i7 + iArrA[2]);
        }
        sb.append((CharSequence) str, 0, i6);
        sb.append(IOUtils.DIR_SEPARATOR_UNIX);
        sb.append(str2);
        int i8 = iArrA2[1];
        return a(sb, i8, iArrA[2] + i8 + 1);
    }

    public static Uri b(String str, String str2) {
        return Uri.parse(a(str, str2));
    }

    public static Uri a(Uri uri, String str) {
        Uri.Builder builderBuildUpon = uri.buildUpon();
        builderBuildUpon.clearQuery();
        for (String str2 : uri.getQueryParameterNames()) {
            if (!str2.equals(str)) {
                Iterator<String> it = uri.getQueryParameters(str2).iterator();
                while (it.hasNext()) {
                    builderBuildUpon.appendQueryParameter(str2, it.next());
                }
            }
        }
        return builderBuildUpon.build();
    }

    private static String a(StringBuilder sb, int i2, int i3) {
        int i4;
        int iLastIndexOf;
        if (i2 >= i3) {
            return sb.toString();
        }
        if (sb.charAt(i2) == '/') {
            i2++;
        }
        int i5 = i2;
        int i6 = i5;
        while (i5 <= i3) {
            if (i5 == i3) {
                i4 = i5;
            } else if (sb.charAt(i5) == '/') {
                i4 = i5 + 1;
            } else {
                i5++;
            }
            int i7 = i6 + 1;
            if (i5 == i7 && sb.charAt(i6) == '.') {
                sb.delete(i6, i4);
                i3 -= i4 - i6;
            } else {
                if (i5 == i6 + 2 && sb.charAt(i6) == '.' && sb.charAt(i7) == '.') {
                    iLastIndexOf = sb.lastIndexOf("/", i6 - 2) + 1;
                    int i8 = iLastIndexOf > i2 ? iLastIndexOf : i2;
                    sb.delete(i8, i4);
                    i3 -= i4 - i8;
                } else {
                    iLastIndexOf = i5 + 1;
                }
                i6 = iLastIndexOf;
            }
            i5 = i6;
        }
        return sb.toString();
    }

    private static int[] a(String str) {
        int iIndexOf;
        int[] iArr = new int[4];
        if (TextUtils.isEmpty(str)) {
            iArr[0] = -1;
            return iArr;
        }
        int length = str.length();
        int iIndexOf2 = str.indexOf(35);
        if (iIndexOf2 != -1) {
            length = iIndexOf2;
        }
        int iIndexOf3 = str.indexOf(63);
        if (iIndexOf3 == -1 || iIndexOf3 > length) {
            iIndexOf3 = length;
        }
        int iIndexOf4 = str.indexOf(47);
        if (iIndexOf4 == -1 || iIndexOf4 > iIndexOf3) {
            iIndexOf4 = iIndexOf3;
        }
        int iIndexOf5 = str.indexOf(58);
        if (iIndexOf5 > iIndexOf4) {
            iIndexOf5 = -1;
        }
        int i2 = iIndexOf5 + 2;
        if (i2 < iIndexOf3 && str.charAt(iIndexOf5 + 1) == '/' && str.charAt(i2) == '/') {
            iIndexOf = str.indexOf(47, iIndexOf5 + 3);
            if (iIndexOf == -1 || iIndexOf > iIndexOf3) {
                iIndexOf = iIndexOf3;
            }
        } else {
            iIndexOf = iIndexOf5 + 1;
        }
        iArr[0] = iIndexOf5;
        iArr[1] = iIndexOf;
        iArr[2] = iIndexOf3;
        iArr[3] = length;
        return iArr;
    }
}
