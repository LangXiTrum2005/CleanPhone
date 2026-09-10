package com.ironsource.adqualitysdk.sdk.i;

import android.content.Context;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Build;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.applovin.shadow.okhttp3.internal.http2.Settings;
import com.ironsource.adqualitysdk.sdk.IronSourceAdQuality;
import com.unity3d.services.UnityAdsConstants;
import java.util.Calendar;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class ka {

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private static int f2935 = 1;

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private static int f2938;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private long f2941;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private as f2942;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private Context f2943;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static char[] f2940 = {62889, 17968, 37544, 61211, 15245, 29721, 'i', 46075, 26466, 6907, 22842, 60093, 15922, 17341, 46054, 'b', 54501, 43373, 32196, 'u', 46049, 26484, 'u', 46059, 't', 'm', 46055, 26484, 6909, 52812, 49398, 29554, 42981, 55926, 3805, 16722, 62920, 10327, 23726, 36641, 50094, 30257, 33936, 14103, 58245, 40475, 19134, 1328, 45477, 'n', 46079, 26481, 6894, 'a', 46060, 26465, 6855, 52809, 33222, 13657, 59596, 39967, 20394, 828, 46775, 27138, 'm', 46076, 26484, 6892, 59470, 23523, 36686, 62178, 9806, 27083, 56662, 195, 29750, 42901, 60218, 24230, 33306, 62850, 14604, 27779, 53448, 1122, 30705, 47986, 61149, 21062, 34251, 51544, 15549, 29426, 49485, 5589, 26688, 48357, 62271, 18406, 39531, 61075, 15638, 29065, 50184, 6391, 28466, 41890, 63035, 19030, 40607, 60739, 8654, 29795, 51454, 7975, 21477, 42500, 64144, 18697, 40399, 53283, 9392, 31591, 53162, 961, 22106, 43721, 63835};

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static long f2939 = 2141125209773618056L;

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private static long f2937 = -1007451451062934977L;

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private static int f2934 = 0;

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private static char f2936 = 0;

    public ka(Context context, as asVar, long j10) {
        this.f2943 = context;
        this.f2942 = asVar;
        this.f2941 = j10;
        new ha(context);
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static String m2774(char c4, int i10, int i11) {
        String str;
        synchronized (c.f1153) {
            try {
                char[] cArr = new char[i11];
                c.f1154 = 0;
                while (true) {
                    int i12 = c.f1154;
                    if (i12 < i11) {
                        cArr[i12] = (char) ((((long) f2940[i10 + i12]) ^ (((long) i12) * f2939)) ^ ((long) c4));
                        c.f1154 = i12 + 1;
                    } else {
                        str = new String(cArr);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return str;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public final as m2776() {
        int i10 = (f2938 + 87) % 128;
        f2935 = i10;
        as asVar = this.f2942;
        f2938 = (i10 + 87) % 128;
        return asVar;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0017  */
    /* JADX WARN: Code duplicated, block: B:9:0x0025  */
    /* JADX INFO: renamed from: ﾇ */
    public JSONObject mo326(JSONObject jSONObject, boolean z10, boolean z11, boolean z12) throws JSONException {
        JSONObject jSONObject2;
        int i10 = f2935 + 37;
        f2938 = i10 % 128;
        if (i10 % 2 != 0) {
            int i11 = 54 / 0;
            if (jSONObject == null) {
                jSONObject2 = new JSONObject();
                f2938 = (f2935 + 23) % 128;
            } else {
                jSONObject2 = jSONObject;
            }
        } else if (jSONObject == null) {
            jSONObject2 = new JSONObject();
            f2938 = (f2935 + 23) % 128;
        } else {
            jSONObject2 = jSONObject;
        }
        JSONObject jSONObjectM2855 = kj.m2855(jSONObject2);
        jSONObjectM2855.put(m2774((char) (62920 - Color.green(0)), TextUtils.getCapsMode("", 0, 0), 5 - TextUtils.lastIndexOf("", '0')).intern(), this.f2942.m558());
        String strM551 = this.f2942.m551();
        if (!TextUtils.isEmpty(strM551)) {
            jSONObjectM2855.put(m2774((char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 1), (ViewConfiguration.getScrollDefaultDelay() >> 16) + 6, ((Process.getThreadPriority(0) + 20) >> 6) + 4).intern(), strM551);
            f2938 = (f2935 + 79) % 128;
        }
        if (z11) {
            if (this.f2941 > 0) {
                jSONObjectM2855.put(m2774((char) (22870 - View.MeasureSpec.getMode(0)), 10 - View.resolveSize(0, 0), (ViewConfiguration.getPressedStateDuration() >> 16) + 4).intern(), this.f2941);
            }
            jSONObjectM2855.put(m2774((char) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 45958), Gravity.getAbsoluteGravity(0, 0) + 14, 5 - (ViewConfiguration.getPressedStateDuration() >> 16)).intern(), this.f2942.m557());
            jSONObjectM2855.put(m2775((char) (4678 - (ViewConfiguration.getLongPressTimeout() >> 16)), "∿㋱퀾\uf204", "\uefd2塌䘿餒", "㚅᯾䬖", 1062751471 - (ViewConfiguration.getJumpTapTimeout() >> 16)).intern(), this.f2942.m548());
            jSONObjectM2855.put(m2774((char) (AudioTrack.getMinVolume() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (AudioTrack.getMinVolume() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)), 19 - (TypedValue.complexToFloat(0) > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (TypedValue.complexToFloat(0) == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)), (ViewConfiguration.getEdgeSlop() >> 16) + 3).intern(), this.f2942.m549());
            jSONObjectM2855.put(m2774((char) (Process.myTid() >> 22), 22 - View.resolveSizeAndState(0, 0, 0), View.resolveSize(0, 0) + 2).intern(), this.f2942.m555());
            jSONObjectM2855.put(m2775((char) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 12740), "∿㋱퀾\uf204", "\ue26dꁷ쎒\ued31", "쎻촌", (TypedValue.complexToFraction(0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (TypedValue.complexToFraction(0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1))).intern(), ((double) Calendar.getInstance().getTimeZone().getRawOffset()) / 3600000.0d);
            jSONObjectM2855.put(m2775((char) (TextUtils.indexOf((CharSequence) "", '0', 0) + 9678), "∿㋱퀾\uf204", "\ud819⪙쵬\uf525", "眬龊\ue446㎓\u169f", 1814731224 - Drawable.resolveOpacity(0, 0)).intern(), IronSourceAdQuality.getSDKVersion());
            jSONObjectM2855.put(m2774((char) KeyEvent.getDeadChar(0, 0), 24 - Color.argb(0, 0, 0, 0), Color.green(0) + 1).intern(), kh.m2834());
            jSONObjectM2855.put(m2774((char) ('0' - AndroidCharacter.getMirror('0')), (ViewConfiguration.getDoubleTapTimeout() >> 16) + 25, 6 - (ViewConfiguration.getScrollFriction() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (ViewConfiguration.getScrollFriction() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1))).intern(), Build.MODEL);
            jSONObjectM2855.put(m2774((char) (49308 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))), (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 29, ((Process.getThreadPriority(0) + 20) >> 6) + 12).intern(), Build.MANUFACTURER);
            jSONObjectM2855.put(m2775((char) Gravity.getAbsoluteGravity(0, 0), "∿㋱퀾\uf204", "Ճ\uf459儆荼", "榆ꀓ疹烚\udaa0蓊\ueba1ꗞ", ViewConfiguration.getWindowTouchSlop() >> 8).intern(), m2774((char) (ExpandableListView.getPackedPositionGroup(0L) + 34033), ImageFormat.getBitsPerPixel(0) + 43, 7 - View.combineMeasuredStates(0, 0)).intern());
            jSONObjectM2855.put(m2775((char) (27409 - TextUtils.lastIndexOf("", '0')), "∿㋱퀾\uf204", "虞螳ረ㙫", "茴羸퇱", 679981959 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))).intern(), kf.m2816());
            kh.m2833(this.f2943, jSONObjectM2855);
            kf.m2827(this.f2943, jSONObjectM2855);
            kf.m2817(this.f2943, jSONObjectM2855, z12);
            kf.m2819(jSONObjectM2855);
            kf.m2828(jSONObjectM2855);
            jSONObjectM2855.put(m2774((char) ExpandableListView.getPackedPositionGroup(0L), 49 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (ViewConfiguration.getPressedStateDuration() >> 16) + 4).intern(), z10);
            kf.m2815(this.f2943, jSONObjectM2855);
            kf.m2822(jSONObjectM2855);
            try {
                JSONObject jSONObject3 = new JSONObject(this.f2942.m546());
                jSONObject3.remove(m2774((char) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), View.MeasureSpec.getSize(0) + 53, 13 - TextUtils.getOffsetBefore("", 0)).intern());
                jSONObject3.remove(m2775((char) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 11), "∿㋱퀾\uf204", "쇍\ue158ఁ똀", "\ufb0d\uea73곜콗\uf343缏⥐瓷쾔枮쬅⩀膪\ufaeaㇳ\uea9a苡⟬", AndroidCharacter.getMirror('0') - '0').intern());
                if (jSONObject3.length() > 0) {
                    int i12 = f2935 + 97;
                    f2938 = i12 % 128;
                    jSONObjectM2855.putOpt((i12 % 2 != 0 ? m2774((char) (ViewConfiguration.getFadingEdgeLength() + 114), 24 >> (ViewConfiguration.getMinimumFlingVelocity() << 60), 5 >> (ViewConfiguration.getJumpTapTimeout() >> 119)) : m2774((char) (ViewConfiguration.getFadingEdgeLength() >> 16), (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 66, 4 - (ViewConfiguration.getJumpTapTimeout() >> 16))).intern(), jSONObject3);
                }
                return jSONObjectM2855;
            } catch (Exception e10) {
                m.m2983(m2774((char) ((ViewConfiguration.getDoubleTapTimeout() >> 16) + 59407), 70 - Color.green(0), (ViewConfiguration.getScrollFriction() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (ViewConfiguration.getScrollFriction() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)) + 24).intern(), m2774((char) (29367 - (ViewConfiguration.getTapTimeout() >> 16)), Color.rgb(0, 0, 0) + 16777311, 36 - TextUtils.getOffsetAfter("", 0)).intern(), e10);
            }
        }
        return jSONObjectM2855;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static String m2775(char c4, String str, String str2, String str3, int i10) {
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
                        cArr6[i15] = (char) (((((long) (c10 ^ cArr[i15])) ^ f2937) ^ ((long) f2934)) ^ ((long) f2936));
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
