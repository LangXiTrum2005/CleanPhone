package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.graphics.PointF;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.applovin.shadow.okhttp3.internal.http2.Settings;
import com.unity3d.services.UnityAdsConstants;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class kg {

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static long f2982 = 0;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static int f2983 = 0;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static char f2984 = 31817;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static int f2985 = 0;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static int f2986 = 1;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static String m2829(char c4, String str, String str2, String str3, int i10) {
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
                        cArr6[i15] = (char) (((((long) (c10 ^ cArr[i15])) ^ f2982) ^ ((long) f2985)) ^ ((long) f2984));
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

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static String m2830(String str) {
        try {
            Mac mac = Mac.getInstance("HmacSHA1");
            mac.init(new SecretKeySpec(m2829((char) (ViewConfiguration.getJumpTapTimeout() >> 16), "\u0000\u0000\u0000\u0000", "抃ȣ퍜ᄉ", "ྑ押\u2e9a\udb6bК옇밉ሴ렝礣楋࣋숃㻮鬳쨒뗹\uded1韞隗铂ꥎᇐ鍘䄘䪘\ue702⬼ᄌ\ue0f5䍅䱇\u2e61覢", 1 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))).intern().getBytes(m2829((char) (TextUtils.getOffsetBefore("", 0) + 12439), "\u0000\u0000\u0000\u0000", "넩텬韼ᐰ", "⩇\uf794ꅢ䦀겹", (PointF.length(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (PointF.length(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)) - 53384015).intern()), mac.getAlgorithm()));
            String strM2521 = il.m2521(mac.doFinal(str.replaceAll(m2829((char) ((ViewConfiguration.getScrollFriction() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (ViewConfiguration.getScrollFriction() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)) + 12575), "\u0000\u0000\u0000\u0000", "ኆӄ₼퀱", "ꌛ", 50242 - AndroidCharacter.getMirror('0')).intern(), "").replaceAll(m2829((char) (TextUtils.lastIndexOf("", '0', 0) + 45142), "\u0000\u0000\u0000\u0000", "姈罥嗯뾰", "씓", View.getDefaultSize(0, 0) - 276863655).intern(), "").getBytes(m2829((char) ((ViewConfiguration.getFadingEdgeLength() >> 16) + 12439), "\u0000\u0000\u0000\u0000", "넩텬韼ᐰ", "⩇\uf794ꅢ䦀겹", (-53384015) - (Process.myTid() >> 22)).intern())));
            f2983 = (f2986 + 1) % 128;
            return strM2521;
        } catch (Exception e10) {
            String strIntern = m2829((char) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), "\u0000\u0000\u0000\u0000", "ڥ䉄ৄ༗", "ܕ䭩揔껀극\ueddf꣕藘係", Color.blue(0) - 1002290170).intern();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(m2829((char) Gravity.getAbsoluteGravity(0, 0), "\u0000\u0000\u0000\u0000", "踵\uf7bb쎘毟", "쀿댹࣎\ueb8a⚠㰌漓", (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) - 1728595058).intern());
            sb2.append(e10.getLocalizedMessage());
            m.m2972(strIntern, sb2.toString());
            return null;
        }
    }
}
