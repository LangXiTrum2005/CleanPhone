package com.ironsource.adqualitysdk.sdk.i;

import android.widget.ExpandableListView;
import com.applovin.shadow.okhttp3.internal.http2.Settings;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class cr extends cw {

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static int f1487 = 1;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static long f1488 = 0;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static char f1489 = 61833;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static int f1490;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static int f1491;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static Object m1752(cl clVar, List<Object> list) {
        boolean z10;
        JSONObject jSONObject;
        boolean zBooleanValue = false;
        String str = (String) cw.m1805(list, 0, String.class);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(clVar.m1643());
        sb2.append(m1753((char) (24957 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), "\u0000\u0000\u0000\u0000", "诌㑰纣ୡ", "｀", ExpandableListView.getPackedPositionType(0L) - 1556844405).intern());
        sb2.append(Integer.toHexString(str.hashCode()));
        String string = sb2.toString();
        Throwable th2 = (Throwable) cw.m1805(list, 1, Throwable.class);
        if (list.size() > 2) {
            if (cw.m1804(list, 2, JSONObject.class)) {
                JSONObject jSONObject2 = (JSONObject) cw.m1805(list, 2, JSONObject.class);
                if (list.size() > 3 && cw.m1804(list, 3, Boolean.class)) {
                    zBooleanValue = ((Boolean) cw.m1805(list, 3, Boolean.class)).booleanValue();
                }
                jSONObject = jSONObject2;
                z10 = zBooleanValue;
            } else {
                if (cw.m1804(list, 2, Boolean.class)) {
                    int i10 = f1491 + 51;
                    f1487 = i10 % 128;
                    int i11 = i10 % 2;
                    zBooleanValue = ((Boolean) cw.m1805(list, 2, Boolean.class)).booleanValue();
                }
                z10 = zBooleanValue;
                jSONObject = null;
            }
            kl.m2897(clVar.m1643(), str, string, th2, jSONObject, z10);
            f1487 = (f1491 + 27) % 128;
        } else {
            kl.m2897(clVar.m1643(), str, string, th2, null, false);
        }
        return null;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static String m1753(char c4, String str, String str2, String str3, int i10) {
        String str4;
        Object charArray = str3;
        if (str3 != null) {
            charArray = str3.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        Object charArray2 = str2;
        if (str2 != null) {
            charArray2 = str2.toCharArray();
        }
        char[] cArr2 = (char[]) charArray2;
        Object charArray3 = str;
        if (str != null) {
            charArray3 = str.toCharArray();
        }
        char[] cArr3 = (char[]) charArray3;
        synchronized (f.f2016) {
            try {
                char[] cArr4 = (char[]) cArr2.clone();
                char[] cArr5 = (char[]) cArr3.clone();
                cArr4[0] = (char) (c4 ^ cArr4[0]);
                cArr5[2] = (char) (cArr5[2] + ((char) i10));
                int length = cArr.length;
                char[] cArr6 = new char[length];
                f.f2015 = 0;
                while (true) {
                    int i11 = f.f2015;
                    if (i11 < length) {
                        int i12 = (i11 + 2) % 4;
                        int i13 = (i11 + 3) % 4;
                        int i14 = cArr4[i11 % 4] * 32718;
                        char c5 = cArr5[i12];
                        char c10 = (char) ((i14 + c5) % Settings.DEFAULT_INITIAL_WINDOW_SIZE);
                        f.f2017 = c10;
                        cArr5[i13] = (char) d5.u.d(cArr4[i13], 32718, c5, Settings.DEFAULT_INITIAL_WINDOW_SIZE);
                        cArr4[i13] = c10;
                        int i15 = f.f2015;
                        cArr6[i15] = (char) (((((long) (c10 ^ cArr[i15])) ^ f1488) ^ ((long) f1490)) ^ ((long) f1489));
                        f.f2015 = i15 + 1;
                    } else {
                        str4 = new String(cArr6);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return str4;
    }
}
