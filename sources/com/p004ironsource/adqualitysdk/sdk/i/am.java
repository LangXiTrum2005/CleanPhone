package com.p004ironsource.adqualitysdk.sdk.i;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.graphics.Color;
import android.graphics.PointF;
import android.view.ViewConfiguration;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes5.dex */
public final class am {

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private static int f305 = 1;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static char f306 = 28484;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static char f307 = 24929;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static int f308 = 0;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static char f309 = 26745;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static char f310 = 11118;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static Class m422() {
        boolean z2;
        int iGreen;
        int i2 = f305 + 105;
        f308 = i2 % 128;
        if (i2 % 2 != 0) {
            z2 = true;
            iGreen = 68 - Color.green(1);
        } else {
            z2 = false;
            iGreen = Color.green(0) + 60;
        }
        Class clsM2724 = jz.m2724(m425("ᘝ夣朽昆ᑺ\udd8eཬ䗠횡㝨ﰯ\ue09a鴦腌ؽᕤⱔ퓉❧〴誏頒▎봤ᘝ夣䰣\udbee\ufffe鰢⏕㌔\ue832먄⦠捗㾯⊗\udeb9㡑ﰯ\ue09a鴦腌趘ᆒⱔ퓉❧〴誏頒\udbfc⧏ᘝ夣䰣\udbee\ufffe鰢", iGreen).intern(), z2);
        int i3 = f305 + 51;
        f308 = i3 % 128;
        if (i3 % 2 == 0) {
            return clsM2724;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static void m423(Object obj, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        f305 = (f308 + 35) % 128;
        try {
            jz.m2726(obj, m425("ഉ쯘醢醁辮臀\ufffe鰢㹃쐊ֿ毘ᮾ┃\ufffe鰢", 16 - (ViewConfiguration.getMaximumFlingVelocity() >> 16)).intern(), Arrays.asList(broadcastReceiver, intentFilter)).invoke(obj, broadcastReceiver, intentFilter);
            f305 = (f308 + 31) % 128;
        } catch (IllegalAccessException | InvocationTargetException unused) {
        }
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static Object m424(Context context) {
        f308 = (f305 + 97) % 128;
        try {
            Object objInvoke = jz.m2726(m422(), m425("䞵줯暞隷ᰋ䉶\ue298麟䉻蓊⊱펷", 11 - (ViewConfiguration.getScrollBarSize() >> 8)).intern(), Arrays.asList(context)).invoke(null, context);
            int i2 = f308 + 49;
            f305 = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 34 / 0;
            }
            return objInvoke;
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static void m426(Object obj, BroadcastReceiver broadcastReceiver) {
        f305 = (f308 + 119) % 128;
        try {
            jz.m2726(obj, m425("꧕涽ഉ쯘醢醁辮臀\ufffe鰢㹃쐊ֿ毘ᮾ┃\ufffe鰢", (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 18).intern(), Arrays.asList(broadcastReceiver)).invoke(obj, broadcastReceiver);
            int i2 = f308 + 3;
            f305 = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 77 / 0;
            }
        } catch (IllegalAccessException | InvocationTargetException unused) {
        }
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static String m425(String str, int i2) {
        String str2;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (m.f2870) {
            try {
                char[] cArr2 = new char[cArr.length];
                m.f2869 = 0;
                char[] cArr3 = new char[2];
                while (true) {
                    int i3 = m.f2869;
                    if (i3 < cArr.length) {
                        cArr3[0] = cArr[i3];
                        cArr3[1] = cArr[i3 + 1];
                        int i4 = 58224;
                        for (int i5 = 0; i5 < 16; i5++) {
                            char c2 = cArr3[1];
                            char c3 = cArr3[0];
                            char c4 = (char) (c2 - (((c3 + i4) ^ ((c3 << 4) + f306)) ^ ((c3 >>> 5) + f310)));
                            cArr3[1] = c4;
                            cArr3[0] = (char) (c3 - (((c4 >>> 5) + f307) ^ ((c4 + i4) ^ ((c4 << 4) + f309))));
                            i4 -= 40503;
                        }
                        int i6 = m.f2869;
                        cArr2[i6] = cArr3[0];
                        cArr2[i6 + 1] = cArr3[1];
                        m.f2869 = i6 + 2;
                    } else {
                        str2 = new String(cArr2, 0, i2);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return str2;
    }
}
