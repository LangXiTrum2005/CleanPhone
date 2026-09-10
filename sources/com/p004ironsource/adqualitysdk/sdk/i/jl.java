package com.p004ironsource.adqualitysdk.sdk.i;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public final class jl {

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static jl f2719;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private Map<String, b> f2720;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private Map<String, b> f2721 = new HashMap();

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private Handler f2722 = new Handler(Looper.getMainLooper());

    public enum b {
        f2731,
        f2734,
        f2733;


        /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
        private static int f2726 = 0;

        /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
        private static char f2727 = 0;

        /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
        private static int f2728 = 1;

        /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
        private static int f2729;

        /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
        private static long f2730;

        static {
            m2625();
            int i2 = f2726 + 111;
            f2728 = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 87 / 0;
            }
        }

        public static b valueOf(String str) {
            int i2 = f2728 + 7;
            f2726 = i2 % 128;
            if (i2 % 2 != 0) {
                Enum.valueOf(b.class, str);
                throw null;
            }
            b bVar = (b) Enum.valueOf(b.class, str);
            int i3 = f2726 + 99;
            f2728 = i3 % 128;
            if (i3 % 2 != 0) {
                return bVar;
            }
            throw null;
        }

        /* JADX INFO: renamed from: values, reason: to resolve conflict with enum method */
        public static b[] valuesCustom() throws CloneNotSupportedException {
            int i2 = f2726 + 59;
            f2728 = i2 % 128;
            if (i2 % 2 != 0) {
                return (b[]) values().clone();
            }
            values().clone();
            throw null;
        }

        /* JADX WARN: Code duplicated, block: B:20:0x0069  */
        /* JADX WARN: Code duplicated, block: B:27:0x00b6  */
        /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
        public static b m2623(String str) {
            int i2 = f2726 + 61;
            f2728 = i2 % 128;
            byte b2 = 0;
            if (i2 % 2 == 0) {
                int i3 = 6 / 0;
                if (TextUtils.isEmpty(str)) {
                    return null;
                }
            } else if (TextUtils.isEmpty(str)) {
                return null;
            }
            f2728 = (f2726 + 89) % 128;
            int iHashCode = str.hashCode();
            if (iHashCode != 3642) {
                if (iHashCode != 96921) {
                    if (iHashCode == 109261 && str.equals(m2624(705611823 - TextUtils.getOffsetBefore("", 0), (char) (View.MeasureSpec.makeMeasureSpec(0, 0) + 22770), "⾒່\uf22a㭘", "ᷳ\uef08우", "\u0000\u0000\u0000\u0000").intern())) {
                        int i4 = f2726 + 101;
                        f2728 = i4 % 128;
                        if (i4 % 2 == 0) {
                            b2 = 1;
                        }
                    } else {
                        b2 = -1;
                    }
                } else if (str.equals(m2624(1737404966 - (Process.myPid() >> 22), (char) ((ViewConfiguration.getFadingEdgeLength() >> 16) + 21012), "⛳躲ᑧꝒ", "㦑ዣ暗", "\u0000\u0000\u0000\u0000").intern())) {
                    b2 = 1;
                } else {
                    b2 = -1;
                }
            } else if (str.equals(m2624(ViewConfiguration.getEdgeSlop() >> 16, (char) (50547 - (ViewConfiguration.getKeyRepeatTimeout() >> 16)), "⥏턘獇Ⓟ", "ﳟ\u0af7", "\u0000\u0000\u0000\u0000").intern())) {
                b2 = 2;
            } else {
                b2 = -1;
            }
            if (b2 == 0) {
                b bVar = f2731;
                f2726 = (f2728 + 77) % 128;
                return bVar;
            }
            if (b2 == 1) {
                return f2734;
            }
            if (b2 != 2) {
                return null;
            }
            return f2733;
        }

        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
        private static String m2624(int i2, char c2, String str, String str2, String str3) {
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
                            cArr6[i7] = (char) (((((long) (c4 ^ cArr2[i7])) ^ f2730) ^ ((long) f2729)) ^ ((long) f2727));
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

        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        public static void m2625() {
            f2730 = 0L;
            f2729 = -539447659;
            f2727 = (char) 0;
        }
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private synchronized Map<String, b> m2618() {
        try {
            if (this.f2720 == null) {
                this.f2720 = new HashMap();
                JSONObject jSONObjectMo477 = as.m467().mo477();
                if (jSONObjectMo477 != null) {
                    this.f2720 = kc.m2765(jSONObjectMo477, new kc.c<b>() { // from class: com.ironsource.adqualitysdk.sdk.i.jl.4
                        @Override // com.ironsource.adqualitysdk.sdk.i.kc.c
                        /* JADX INFO: renamed from: ﻛ */
                        public final /* synthetic */ b mo534(JSONObject jSONObject, String str) {
                            return b.m2623(jSONObject.optString(str));
                        }
                    });
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f2720;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static synchronized jl m2619() {
        try {
            if (f2719 == null) {
                f2719 = new jl();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f2719;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final synchronized boolean m2620(Activity activity) {
        return b.f2734 == m2615(activity);
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private synchronized b m2615(Activity activity) {
        if (activity != null) {
            String name = activity.getClass().getName();
            if (m2617().containsKey(name)) {
                return m2617().get(name);
            }
            if (m2618().containsKey(name)) {
                return m2618().get(name);
            }
        }
        return b.m2623(as.m467().mo474());
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private synchronized Map<String, b> m2617() {
        return new HashMap(this.f2721);
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final synchronized void m2621(final String str, final b bVar) {
        this.f2722.post(new it() { // from class: com.ironsource.adqualitysdk.sdk.i.jl.1
            @Override // com.p004ironsource.adqualitysdk.sdk.i.it
            /* JADX INFO: renamed from: ﾒ */
            public final void mo276() {
                synchronized (jl.this) {
                    jl.this.f2721.put(str, bVar);
                }
            }
        });
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final synchronized boolean m2622(Activity activity) {
        return b.f2733 == m2615(activity);
    }
}
