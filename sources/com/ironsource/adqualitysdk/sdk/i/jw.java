package com.ironsource.adqualitysdk.sdk.i;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import com.applovin.shadow.okhttp3.internal.http2.Settings;
import com.unity3d.services.UnityAdsConstants;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class jw {

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static jw f2905;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private Map<String, e> f2906;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private Map<String, e> f2907 = new HashMap();

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private Handler f2908 = new Handler(Looper.getMainLooper());

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public enum e {
        f2919,
        f2917,
        f2920;


        /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
        private static int f2912 = 1;

        /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
        private static int f2913;

        /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
        private static char f2914;

        /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
        private static int f2915;

        /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
        private static long f2918;

        static {
            m2761();
            f2912 = (f2915 + 33) % 128;
        }

        public static e valueOf(String str) {
            f2912 = (f2915 + 49) % 128;
            e eVar = (e) Enum.valueOf(e.class, str);
            f2912 = (f2915 + 9) % 128;
            return eVar;
        }

        /* JADX INFO: renamed from: values, reason: to resolve conflict with enum method */
        public static e[] valuesCustom() throws CloneNotSupportedException {
            int i10 = f2915 + 79;
            f2912 = i10 % 128;
            if (i10 % 2 == 0) {
                values().clone();
                throw null;
            }
            e[] eVarArr = (e[]) values().clone();
            int i11 = f2912 + 51;
            f2915 = i11 % 128;
            if (i11 % 2 != 0) {
                int i12 = 21 / 0;
            }
            return eVarArr;
        }

        /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
        public static void m2761() {
            f2918 = 0L;
            f2913 = 1183494631;
            f2914 = (char) 0;
        }

        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        private static String m2762(char c4, String str, String str2, String str3, int i10) {
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
                            cArr6[i15] = (char) (((((long) (c10 ^ cArr[i15])) ^ f2918) ^ ((long) f2913)) ^ ((long) f2914));
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

        /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
        public static e m2760(String str) {
            f2915 = (f2912 + 67) % 128;
            if (!TextUtils.isEmpty(str)) {
                int iHashCode = str.hashCode();
                if (iHashCode != 3642) {
                    if (iHashCode != 96921) {
                        if (iHashCode == 109261 && str.equals(m2762((char) (TextUtils.getTrimmedLength("") + 28132), "\u0000\u0000\u0000\u0000", "媣暖\ue4c4\ud86d", "힜⑰渏", (-999909798) - (KeyEvent.getMaxKeyCode() >> 16)).intern())) {
                            return f2919;
                        }
                    } else if (str.equals(m2762((char) (26394 - ((byte) KeyEvent.getModifierMetaStateMask())), "\u0000\u0000\u0000\u0000", "ꞻ萱ᭁ孧", "䌗꾜⪘", 1099182503 - (TypedValue.complexToFraction(0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (TypedValue.complexToFraction(0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1))).intern())) {
                        f2915 = (f2912 + 119) % 128;
                        return f2917;
                    }
                } else if (str.equals(m2762((char) ((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 22123), "\u0000\u0000\u0000\u0000", "\uf4bc푒毬孖", "닛긞", (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 1).intern())) {
                    e eVar = f2920;
                    int i10 = f2912 + 119;
                    f2915 = i10 % 128;
                    if (i10 % 2 == 0) {
                        return eVar;
                    }
                    throw null;
                }
            }
            return null;
        }
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private synchronized Map<String, e> m2752() {
        return new HashMap(this.f2907);
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static synchronized jw m2753() {
        try {
            if (f2905 == null) {
                f2905 = new jw();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f2905;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private synchronized e m2754(Activity activity) {
        if (activity != null) {
            String name = activity.getClass().getName();
            if (m2752().containsKey(name)) {
                return m2752().get(name);
            }
            if (m2755().containsKey(name)) {
                return m2755().get(name);
            }
        }
        return e.m2760(ar.m468().mo481());
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public final synchronized boolean m2757(Activity activity) {
        return e.f2920 == m2754(activity);
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final synchronized void m2758(final String str, final e eVar) {
        this.f2908.post(new je() { // from class: com.ironsource.adqualitysdk.sdk.i.jw.2
            @Override // com.ironsource.adqualitysdk.sdk.i.je
            /* JADX INFO: renamed from: ｋ */
            public final void mo254() {
                synchronized (jw.this) {
                    jw.this.f2907.put(str, eVar);
                }
            }
        });
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final synchronized boolean m2759(Activity activity) {
        return e.f2917 == m2754(activity);
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private synchronized Map<String, e> m2755() {
        try {
            if (this.f2906 == null) {
                this.f2906 = new HashMap();
                JSONObject jSONObjectMo477 = ar.m468().mo477();
                if (jSONObjectMo477 != null) {
                    this.f2906 = kj.m2860(jSONObjectMo477, new kj.a<e>() { // from class: com.ironsource.adqualitysdk.sdk.i.jw.4
                        @Override // com.ironsource.adqualitysdk.sdk.i.kj.a
                        /* JADX INFO: renamed from: ｋ */
                        public final /* synthetic */ e mo541(JSONObject jSONObject, String str) {
                            return e.m2760(jSONObject.optString(str));
                        }
                    });
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f2906;
    }
}
