package com.p004ironsource.adqualitysdk.sdk.i;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.p004ironsource.adqualitysdk.sdk.IronSourceAdQuality;
import com.startapp.simple.bloomfilter.codec.CharEncoding;
import com.vungle.ads.internal.protos.Sdk;
import java.io.UnsupportedEncodingException;
import java.util.Calendar;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public class jr {

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private static int f2762 = 1;

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private static char[] f2763 = {'6', 'g', 'k', 's', '4', 'f', 'l', AbstractJsonLexerKt.COLON, 'o', 'f', '1', 'l', AbstractJsonLexerKt.COLON, 'y', 243, 238, 233, 237, 'p', 217, 217, 225, 226, 217, 208, 209, 219, 223, 213, 213, 'l', 214, 219, 221, 223, 228, 224, '^', 177, 178, 184, '1', 'h', 'm', 'g', '`', 'i', 'n', 'k', 'k', 'd', 'h', 'j', 'b', '6', 'p', 'l', 'l', ' ', 'R', 'Z', 'c', 'k', 'f', 'j', 'n', 'v', 'e', AbstractJsonLexerKt.BEGIN_LIST, 'k', 's', 'm', 'l', 's', AbstractJsonLexerKt.END_LIST, 'V', 'i', 'i', 'k', 'i', 'j', 'q', 'p'};

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private static int f2764 = 0;

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private static char f2765 = 716;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static int f2766;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static long f2767;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private ao f2768;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private Context f2769;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private long f2770;

    public jr(Context context, ao aoVar, long j) {
        this.f2769 = context;
        this.f2768 = aoVar;
        this.f2770 = j;
        new gp(context);
    }

    /* JADX INFO: renamed from: ﻛ */
    public JSONObject mo285(JSONObject jSONObject, boolean z2, boolean z3, boolean z4) throws JSONException {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        JSONObject jSONObjectM2767 = kc.m2767(jSONObject);
        jSONObjectM2767.put(m2650(ViewConfiguration.getScrollBarFadeDuration() >> 16, (char) ((ViewConfiguration.getJumpTapTimeout() >> 16) + 64494), "\ue463呥\uee75뫻", "撛襽煎搚\uf3b6씐", "\u0000\u0000\u0000\u0000").intern(), this.f2768.m439());
        String strM444 = this.f2768.m444();
        if (!TextUtils.isEmpty(strM444)) {
            jSONObjectM2767.put(m2650(View.getDefaultSize(0, 0), (char) (((byte) KeyEvent.getModifierMetaStateMask()) + 1311), "۔늄ẝ笅", "䛕멾鐼\u1fc5", "\u0000\u0000\u0000\u0000").intern(), strM444);
        }
        if (z3) {
            f2764 = (f2762 + 33) % 128;
            if (this.f2770 > 0) {
                jSONObjectM2767.put(m2651(false, new int[]{0, 4, 0, 0}, "\u0000\u0001\u0001\u0001").intern(), this.f2770);
            }
            jSONObjectM2767.put(m2650(View.MeasureSpec.getMode(0) + 758450404, (char) (30109 - ((byte) KeyEvent.getModifierMetaStateMask())), "\ue411㔈鸭赵", "愎ܪづ呹빔", "\u0000\u0000\u0000\u0000").intern(), this.f2768.m438());
            jSONObjectM2767.put(m2651(true, new int[]{4, 3, 0, 2}, "\u0001\u0001\u0000").intern(), this.f2768.m436());
            jSONObjectM2767.put(m2651(false, new int[]{7, 3, 0, 0}, "\u0001\u0000\u0001").intern(), this.f2768.m440());
            jSONObjectM2767.put(m2651(true, new int[]{10, 2, 0, 0}, "\u0001\u0000").intern(), this.f2768.m448());
            jSONObjectM2767.put(m2650(ViewConfiguration.getScrollDefaultDelay() >> 16, (char) (2405 - KeyEvent.keyCodeFromString("")), "❠叠斄젉", "魇⥋", "\u0000\u0000\u0000\u0000").intern(), ((double) Calendar.getInstance().getTimeZone().getRawOffset()) / 3600000.0d);
            jSONObjectM2767.put(m2650(Drawable.resolveOpacity(0, 0) + 1296659128, (char) (18929 - TextUtils.indexOf((CharSequence) "", '0')), "렭䥲\uf24d㹉", "⽓\ue9c2ᰴ섘\ued52", "\u0000\u0000\u0000\u0000").intern(), IronSourceAdQuality.getSDKVersion());
            jSONObjectM2767.put(m2651(true, new int[]{12, 1, 0, 1}, "\u0000").intern(), jw.m2672());
            jSONObjectM2767.put(m2651(false, new int[]{13, 5, Sdk.SDKError.Reason.OMSDK_JS_WRITE_FAILED_VALUE, 0}, "\u0000\u0000\u0001\u0001\u0001").intern(), Build.MODEL);
            jSONObjectM2767.put(m2651(true, new int[]{18, 12, 110, 0}, "\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000").intern(), Build.MANUFACTURER);
            jSONObjectM2767.put(m2650((-1) - TextUtils.indexOf((CharSequence) "", '0'), (char) (ViewConfiguration.getPressedStateDuration() >> 16), "墘珄୷㏇", "\udc36뗼瘘㍉鏡岠㇙ꂆ", "\u0000\u0000\u0000\u0000").intern(), m2651(false, new int[]{30, 7, 116, 1}, "\u0000\u0001\u0001\u0000\u0000\u0001\u0000").intern());
            jSONObjectM2767.put(m2650(1217061422 - MotionEvent.axisFromString(""), (char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 26541), "⿵諢깈퉧", "昪貂玫", "\u0000\u0000\u0000\u0000").intern(), jy.m2707());
            jw.m2673(this.f2769, jSONObjectM2767);
            jy.m2714(this.f2769, jSONObjectM2767);
            jy.m2697(this.f2769, jSONObjectM2767, z4);
            jy.m2709(jSONObjectM2767);
            jy.m2705(jSONObjectM2767);
            jSONObjectM2767.put(m2651(true, new int[]{37, 4, 70, 0}, "\u0000\u0001\u0000\u0001").intern(), z2);
            jy.m2701(this.f2769, jSONObjectM2767);
            jy.m2698(jSONObjectM2767);
            try {
                JSONObject jSONObject2 = new JSONObject(this.f2768.m434());
                jSONObject2.remove(m2651(true, new int[]{41, 13, 0, 0}, "\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001").intern());
                if (jSONObject2.length() > 0) {
                    f2762 = (f2764 + 119) % 128;
                    jSONObjectM2767.putOpt(m2651(false, new int[]{54, 4, 0, 4}, "\u0001\u0001\u0000\u0000").intern(), jSONObject2);
                }
                return jSONObjectM2767;
            } catch (Exception e2) {
                n.m2832(m2651(false, new int[]{58, 25, 0, 0}, "\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001").intern(), m2650(View.resolveSizeAndState(0, 0, 0), (char) ((Process.getThreadPriority(0) + 20) >> 6), "腨ꏲ\ua63b䲆", "\uf8c3灷麬\ueefaꎷ䶷݆ꠦ齿꧖⾪ｩ겤鬙䛍懕쟓έ醿\uf08c\uf5e6猧뿕瘴蘣晶곿룘㡗\u09b4㏉獣못Ḓنڌ", "\u0000\u0000\u0000\u0000").intern(), e2);
            }
        }
        return jSONObjectM2767;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final ao m2652() {
        int i2 = f2762 + 49;
        f2764 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.f2768;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static String m2650(int i2, char c2, String str, String str2, String str3) {
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
        synchronized (j.f2569) {
            try {
                char[] cArr4 = (char[]) cArr3.clone();
                char[] cArr5 = (char[]) cArr.clone();
                cArr4[0] = (char) (c2 ^ cArr4[0]);
                cArr5[2] = (char) (cArr5[2] + ((char) i2));
                int length = cArr2.length;
                char[] cArr6 = new char[length];
                j.f2567 = 0;
                while (true) {
                    int i3 = j.f2567;
                    if (i3 < length) {
                        int i4 = (i3 + 2) % 4;
                        int i5 = (i3 + 3) % 4;
                        int i6 = cArr4[i3 % 4] * 32718;
                        char c3 = cArr5[i4];
                        char c4 = (char) ((i6 + c3) % 65535);
                        j.f2568 = c4;
                        cArr5[i5] = (char) (((cArr4[i5] * 32718) + c3) / 65535);
                        cArr4[i5] = c4;
                        int i7 = j.f2567;
                        cArr6[i7] = (char) (((((long) (c4 ^ cArr2[i7])) ^ f2767) ^ ((long) f2766)) ^ ((long) f2765));
                        j.f2567 = i7 + 1;
                    } else {
                        str4 = new String(cArr6);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return str4;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static String m2651(boolean z2, int[] iArr, String str) throws UnsupportedEncodingException {
        String str2;
        Object bytes = str;
        if (str != null) {
            bytes = str.getBytes(CharEncoding.ISO_8859_1);
        }
        byte[] bArr = (byte[]) bytes;
        synchronized (h.f2186) {
            try {
                int i2 = iArr[0];
                int i3 = iArr[1];
                int i4 = iArr[2];
                int i5 = iArr[3];
                char[] cArr = new char[i3];
                System.arraycopy(f2763, i2, cArr, 0, i3);
                if (bArr != null) {
                    char[] cArr2 = new char[i3];
                    h.f2185 = 0;
                    char c2 = 0;
                    while (true) {
                        int i6 = h.f2185;
                        if (i6 >= i3) {
                            break;
                        }
                        if (bArr[i6] == 1) {
                            cArr2[i6] = (char) (((cArr[i6] << 1) + 1) - c2);
                        } else {
                            cArr2[i6] = (char) ((cArr[i6] << 1) - c2);
                        }
                        c2 = cArr2[i6];
                        h.f2185 = i6 + 1;
                    }
                    cArr = cArr2;
                }
                if (i5 > 0) {
                    char[] cArr3 = new char[i3];
                    System.arraycopy(cArr, 0, cArr3, 0, i3);
                    int i7 = i3 - i5;
                    System.arraycopy(cArr3, 0, cArr, i7, i5);
                    System.arraycopy(cArr3, i5, cArr, 0, i7);
                }
                if (z2) {
                    char[] cArr4 = new char[i3];
                    h.f2185 = 0;
                    while (true) {
                        int i8 = h.f2185;
                        if (i8 >= i3) {
                            break;
                        }
                        cArr4[i8] = cArr[(i3 - i8) - 1];
                        h.f2185 = i8 + 1;
                    }
                    cArr = cArr4;
                }
                if (i4 > 0) {
                    h.f2185 = 0;
                    while (true) {
                        int i9 = h.f2185;
                        if (i9 >= i3) {
                            break;
                        }
                        cArr[i9] = (char) (cArr[i9] - iArr[2]);
                        h.f2185 = i9 + 1;
                    }
                }
                str2 = new String(cArr);
            } catch (Throwable th) {
                throw th;
            }
        }
        return str2;
    }
}
