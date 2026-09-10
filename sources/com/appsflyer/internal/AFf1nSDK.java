package com.appsflyer.internal;

import android.text.TextUtils;
import android.view.View;
import android.widget.ExpandableListView;
import java.io.UnsupportedEncodingException;

/* JADX INFO: loaded from: classes2.dex */
public final class AFf1nSDK {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int AFAdRevenueData = 0;
    private static int component2 = 1;
    private static char[] getCurrencyIso4217Code;
    private static int getMediationNetwork;
    private static boolean getMonetizationNetwork;
    private static boolean getRevenue;

    static {
        getMediationNetwork();
        ExpandableListView.getPackedPositionChild(0L);
        AFAdRevenueData = (component2 + 25) % 128;
    }

    private static void a(String str, int[] iArr, String str2, int i, Object[] objArr) throws UnsupportedEncodingException {
        Object charArray = str2;
        if (str2 != null) {
            $11 = ($10 + 75) % 128;
            charArray = str2.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        Object bytes = str;
        if (str != null) {
            bytes = str.getBytes("ISO-8859-1");
        }
        byte[] bArr = (byte[]) bytes;
        AFk1oSDK aFk1oSDK = new AFk1oSDK();
        char[] cArr2 = getCurrencyIso4217Code;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            for (int i2 = 0; i2 < length; i2++) {
                cArr3[i2] = (char) (((long) cArr2[i2]) ^ 1825820251896122634L);
            }
            cArr2 = cArr3;
        }
        int i3 = (int) (1825820251896122634L ^ ((long) getMediationNetwork));
        if (getRevenue) {
            $10 = ($11 + 3) % 128;
            int length2 = bArr.length;
            aFk1oSDK.getMonetizationNetwork = length2;
            char[] cArr4 = new char[length2];
            aFk1oSDK.AFAdRevenueData = 0;
            while (true) {
                int i4 = aFk1oSDK.AFAdRevenueData;
                int i5 = aFk1oSDK.getMonetizationNetwork;
                if (i4 >= i5) {
                    objArr[0] = new String(cArr4);
                    return;
                } else {
                    cArr4[i4] = (char) (cArr2[bArr[(i5 - 1) - i4] + i] - i3);
                    aFk1oSDK.AFAdRevenueData = i4 + 1;
                }
            }
        } else {
            if (!getMonetizationNetwork) {
                int length3 = iArr.length;
                aFk1oSDK.getMonetizationNetwork = length3;
                char[] cArr5 = new char[length3];
                aFk1oSDK.AFAdRevenueData = 0;
                while (true) {
                    int i6 = aFk1oSDK.AFAdRevenueData;
                    int i7 = aFk1oSDK.getMonetizationNetwork;
                    if (i6 >= i7) {
                        break;
                    }
                    $10 = ($11 + 81) % 128;
                    cArr5[i6] = (char) (cArr2[iArr[(i7 - 1) - i6] - i] - i3);
                    aFk1oSDK.AFAdRevenueData = i6 + 1;
                }
                String str3 = new String(cArr5);
                int i8 = $11 + 41;
                $10 = i8 % 128;
                if (i8 % 2 != 0) {
                    throw null;
                }
                objArr[0] = str3;
                return;
            }
            int length4 = cArr.length;
            aFk1oSDK.getMonetizationNetwork = length4;
            char[] cArr6 = new char[length4];
            aFk1oSDK.AFAdRevenueData = 0;
            while (true) {
                int i9 = aFk1oSDK.AFAdRevenueData;
                int i10 = aFk1oSDK.getMonetizationNetwork;
                if (i9 >= i10) {
                    objArr[0] = new String(cArr6);
                    return;
                } else {
                    cArr6[i9] = (char) (cArr2[cArr[(i10 - 1) - i9] - i] - i3);
                    aFk1oSDK.AFAdRevenueData = i9 + 1;
                }
            }
        }
    }

    private static AFi1sSDK getCurrencyIso4217Code(AFi1vSDK aFi1vSDK, String str, String str2, String str3) throws UnsupportedEncodingException {
        String string;
        if (str == null) {
            return new AFi1sSDK(aFi1vSDK.getRevenue == AFh1dSDK.DEFAULT, AFi1ySDK.NA);
        }
        Object[] objArr = new Object[1];
        a("\u008c\u0085\u0081\u0086\u0087\u0085\u008c\u0082\u008b\u0085\u0082\u0082\u0082\u0081\u0086\u0082\u0086\u0081\u008b\u0082\u008c\u0087\u008d\u0083\u0082\u0087\u008c\u0083\u0086\u0087\u0083\u0083\u008b\u0087\u0081\u0083\u008a\u0086\u0089\u0086\u0088\u0086\u0084\u0085\u0087\u0086\u0083\u0085\u0085\u0086\u0086\u0085\u0084\u0082\u0084\u0081\u0083\u0082\u0083\u0081\u0081\u0082\u0081\u0081", null, null, 127 - View.resolveSizeAndState(0, 0, 0), objArr);
        String strIntern = ((String) objArr[0]).intern();
        if (aFi1vSDK.getRevenue == AFh1dSDK.CUSTOM) {
            string = new StringBuilder(str2).reverse().toString();
        } else {
            string = "";
            str3 = strIntern;
        }
        boolean zEquals = getMonetizationNetwork(new StringBuilder(str3).reverse().toString(), aFi1vSDK.getMediationNetwork, "android", "v1", string).equals(str);
        return new AFi1sSDK(zEquals, zEquals ? AFi1ySDK.SUCCESS : AFi1ySDK.FAILURE);
    }

    public static void getMediationNetwork() {
        getCurrencyIso4217Code = new char[]{36169, 36173, 36172, 36163, 36168, 36174, 36175, 36162, 36170, 36190, 36171, 36187, 36191};
        getMediationNetwork = 1912311066;
        getMonetizationNetwork = true;
        getRevenue = true;
    }

    private static String getMonetizationNetwork(String str, String str2, String str3, String str4, String str5) {
        String monetizationNetwork = AFj1dSDK.getMonetizationNetwork(TextUtils.join("\u2063", new String[]{str2, str3, str4, str5, ""}), str);
        if (monetizationNetwork.length() >= 12) {
            return monetizationNetwork.substring(0, 12);
        }
        int i = (AFAdRevenueData + 113) % 128;
        component2 = i;
        int i2 = i + 111;
        AFAdRevenueData = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 63 / 0;
        }
        return monetizationNetwork;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0017 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:11:0x0019  */
    public final AFi1sSDK getRevenue(AFi1vSDK aFi1vSDK, String str, String str2, String str3) {
        if (aFi1vSDK != null) {
            int i = AFAdRevenueData + 111;
            component2 = i % 128;
            if (i % 2 == 0) {
                int i2 = 89 / 0;
                if (str2 != null) {
                    if (str3 != null) {
                        return getCurrencyIso4217Code(aFi1vSDK, str, str2, str3);
                    }
                }
            } else if (str2 != null) {
                if (str3 != null) {
                    return getCurrencyIso4217Code(aFi1vSDK, str, str2, str3);
                }
            }
        }
        component2 = (AFAdRevenueData + 17) % 128;
        return new AFi1sSDK(false, AFi1ySDK.INTERNAL_ERROR);
    }
}
