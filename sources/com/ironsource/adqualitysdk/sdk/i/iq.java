package com.ironsource.adqualitysdk.sdk.i;

import android.content.Context;
import android.content.SharedPreferences;
import android.media.AudioTrack;
import android.os.SystemClock;
import android.provider.Settings;
import android.text.TextUtils;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.unity3d.services.UnityAdsConstants;
import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class iq {

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static int f2537 = 0;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static int f2538 = 1;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static int[] f2539 = {-1114918010, 842280557, 1814131441, -2020790066, -1460963615, -1849956010, 507104337, 328168651, -299376099, 444399546, -2066626417, -1857866589, 1989214282, 1571197419, 470549943, 426554165, -118622915, 766931779};

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static String m2536(Context context) {
        SharedPreferences sharedPreferences = context.getSharedPreferences(m2537(new int[]{2021447317, -2012736564, 770059104, -333426947, 1575470097, -1436084815}, (ViewConfiguration.getScrollBarSize() >> 8) + 11).intern(), 0);
        String string = sharedPreferences.getString(m2537(new int[]{-976268854, -980446288, 918728648, -2040782322, 1864521079, 618275421, 1573582597, -297946851, 1629494889, -785226584}, 17 - ExpandableListView.getPackedPositionChild(0L)).intern(), null);
        if (!TextUtils.isEmpty(string)) {
            return string;
        }
        f2538 = (f2537 + 89) % 128;
        String string2 = UUID.randomUUID().toString();
        sharedPreferences.edit().putString(m2537(new int[]{-976268854, -980446288, 918728648, -2040782322, 1864521079, 618275421, 1573582597, -297946851, 1629494889, -785226584}, (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 18).intern(), string2).commit();
        f2538 = (f2537 + 53) % 128;
        return string2;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static String m2537(int[] iArr, int i10) {
        String str;
        synchronized (a.f61) {
            try {
                char[] cArr = new char[4];
                char[] cArr2 = new char[iArr.length << 1];
                int[] iArr2 = (int[]) f2539.clone();
                a.f58 = 0;
                while (true) {
                    int i11 = a.f58;
                    if (i11 < iArr.length) {
                        int i12 = iArr[i11];
                        char c4 = (char) (i12 >> 16);
                        cArr[0] = c4;
                        char c5 = (char) i12;
                        cArr[1] = c5;
                        char c10 = (char) (iArr[i11 + 1] >> 16);
                        cArr[2] = c10;
                        char c11 = (char) iArr[i11 + 1];
                        cArr[3] = c11;
                        a.f59 = (c4 << 16) + c5;
                        a.f60 = (c10 << 16) + c11;
                        a.m199(iArr2);
                        for (int i13 = 0; i13 < 16; i13++) {
                            int i14 = a.f59 ^ iArr2[i13];
                            a.f59 = i14;
                            int iM200 = a.m200(i14) ^ a.f60;
                            int i15 = a.f59;
                            a.f59 = iM200;
                            a.f60 = i15;
                        }
                        int i16 = a.f59;
                        int i17 = a.f60;
                        a.f59 = i17;
                        a.f60 = i16;
                        int i18 = i16 ^ iArr2[16];
                        a.f60 = i18;
                        int i19 = i17 ^ iArr2[17];
                        a.f59 = i19;
                        cArr[0] = (char) (i19 >>> 16);
                        cArr[1] = (char) i19;
                        cArr[2] = (char) (i18 >>> 16);
                        cArr[3] = (char) i18;
                        a.m199(iArr2);
                        int i20 = a.f58;
                        cArr2[i20 << 1] = cArr[0];
                        cArr2[(i20 << 1) + 1] = cArr[1];
                        cArr2[(i20 << 1) + 2] = cArr[2];
                        cArr2[(i20 << 1) + 3] = cArr[3];
                        a.f58 = i20 + 2;
                    } else {
                        str = new String(cArr2, 0, i10);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return str;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static void m2538(String str, String str2) {
        int i10 = f2538 + 15;
        f2537 = i10 % 128;
        int i11 = i10 % 2;
        m.m2964(str, str2);
        if (i11 != 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static String m2539(Context context) {
        String string;
        int i10 = f2538 + 79;
        f2537 = i10 % 128;
        if (i10 % 2 == 0 ? (string = Settings.Secure.getString(context.getApplicationContext().getContentResolver(), m2537(new int[]{196345434, 231546399, -1572575530, 164135203, 1629494889, -785226584}, 10 - (AudioTrack.getMinVolume() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (AudioTrack.getMinVolume() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1))).intern())) == null : (string = Settings.Secure.getString(context.getApplicationContext().getContentResolver(), m2537(new int[]{196345434, 231546399, -1572575530, 164135203, 1629494889, -785226584}, 83 % (AudioTrack.getMinVolume() > 2.0f ? 1 : (AudioTrack.getMinVolume() == 2.0f ? 0 : -1))).intern())) == null) {
            m2540(m2537(new int[]{690197029, -2124749307, 1900645363, 2142893633, 595617393, -25345736, 837911805, 628437357, -1690578991, -915338882, 643909765, 1889543487, 299326911, 1617777004, 2016330192, 1265055473, -132468840, -141832221}, 34 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))).intern(), m2537(new int[]{1874355207, -1730275650, 2013048332, 1427729107, 271221222, -2020518168, -482505242, -1979944703, 1535572600, 1247463161, -14708358, 1611338058, -1645631396, -1738373450, -1806397197, 1063138580, 18747416, 2138842833, 385779476, -1389803971, -214169130, 220897736, -1523945210, 2084861108}, 47 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))).intern());
            string = m2536(context);
            f2538 = (f2537 + 77) % 128;
        }
        f2537 = (f2538 + 87) % 128;
        return string;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static void m2540(String str, String str2) {
        int i10 = f2537 + 35;
        f2538 = i10 % 128;
        int i11 = i10 % 2;
        m.m2972(str, str2);
        if (i11 == 0) {
            int i12 = 44 / 0;
        }
    }
}
