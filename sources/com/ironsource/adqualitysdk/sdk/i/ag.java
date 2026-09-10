package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.ViewConfiguration;
import com.applovin.shadow.okhttp3.internal.http2.Settings;
import com.ironsource.InterfaceC0435l1;
import com.unity3d.services.UnityAdsConstants;
import java.util.Arrays;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class ag implements Comparable<ag> {

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private static int f142 = 1;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static long f143 = 0;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static int f144 = 0;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static int f145 = 0;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static char f146 = 4870;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private jn f147;

    public ag(jn jnVar) {
        this.f147 = jnVar;
    }

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private long m305() {
        f142 = (f144 + 27) % 128;
        long jOptLong = m317().optLong(m310((char) (TextUtils.getCapsMode("", 0, 0) + 53376), "\u0000\u0000\u0000\u0000", "㉬⮮胳駐", "ీ짩", Color.alpha(0)).intern());
        f142 = (f144 + 59) % 128;
        return jOptLong;
    }

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private long m306() {
        f144 = (f142 + 89) % 128;
        long jOptInt = m317().optInt(m310((char) (37785 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))), "\u0000\u0000\u0000\u0000", "첶ꨎ頔Γ", "诫ಚ", ImageFormat.getBitsPerPixel(0) + 1).intern());
        int i10 = f144 + 19;
        f142 = i10 % 128;
        if (i10 % 2 != 0) {
            return jOptInt;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private String m307() {
        int i10 = f144 + InterfaceC0435l1.d.b.f29109f;
        f142 = i10 % 128;
        int i11 = i10 % 2;
        jn jnVar = this.f147;
        if (i11 != 0) {
            return jnVar.m2686();
        }
        jnVar.m2686();
        throw null;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static List<String> m311() {
        int i10 = f142 + 125;
        f144 = i10 % 128;
        return i10 % 2 != 0 ? Arrays.asList(is.f2575) : Arrays.asList(is.f2575);
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(ag agVar) {
        int i10 = f142 + 15;
        f144 = i10 % 128;
        ag agVar2 = agVar;
        if (i10 % 2 != 0) {
            m308(agVar2);
            throw null;
        }
        int iM308 = m308(agVar2);
        int i11 = f144 + 79;
        f142 = i11 % 128;
        if (i11 % 2 != 0) {
            return iM308;
        }
        throw null;
    }

    public final boolean equals(Object obj) {
        int i10 = (f144 + InterfaceC0435l1.d.b.f29112i) % 128;
        f142 = i10;
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        int i11 = i10 + 89;
        f144 = i11 % 128;
        if (i11 % 2 != 0) {
            throw null;
        }
        if (ag.class != obj.getClass()) {
            return false;
        }
        return m307().equals(((ag) obj).m307());
    }

    public final int hashCode() {
        f142 = (f144 + 85) % 128;
        if (m317() == null) {
            return 0;
        }
        int i10 = f144 + 11;
        f142 = i10 % 128;
        int i11 = i10 % 2;
        JSONObject jSONObjectM317 = m317();
        if (i11 == 0) {
            jSONObjectM317.hashCode();
            throw null;
        }
        int iHashCode = jSONObjectM317.hashCode();
        int i12 = f142 + 11;
        f144 = i12 % 128;
        if (i12 % 2 == 0) {
            return iHashCode;
        }
        throw null;
    }

    public final String toString() {
        int i10 = f142 + 1;
        f144 = i10 % 128;
        int i11 = i10 % 2;
        JSONObject jSONObjectM317 = m317();
        if (i11 != 0) {
            jSONObjectM317.toString();
            throw null;
        }
        String string = jSONObjectM317.toString();
        f142 = (f144 + 17) % 128;
        return string;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public final jn m312() {
        int i10 = f144 + 41;
        f142 = i10 % 128;
        int i11 = i10 % 2;
        jn jnVar = this.f147;
        if (i11 == 0) {
            int i12 = 43 / 0;
        }
        return jnVar;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final String m313() {
        int i10 = f144 + 107;
        f142 = i10 % 128;
        return m317().optString((i10 % 2 == 0 ? m310((char) (61498 << Color.argb(0, 1, 0, 1)), "\u0000\u0000\u0000\u0000", "\ue8f5潭㫔돰", "㊮嵃뼻", (-730894872) - TextUtils.indexOf("", "")) : m310((char) (61498 - Color.argb(0, 0, 0, 0)), "\u0000\u0000\u0000\u0000", "\ue8f5潭㫔돰", "㊮嵃뼻", TextUtils.indexOf("", "") - 730894872)).intern(), null);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0026 A[Catch: all -> 0x001c, TryCatch #1 {all -> 0x001c, blocks: (B:3:0x0001, B:5:0x000d, B:17:0x003b, B:16:0x0026, B:11:0x001b, B:14:0x001e, B:7:0x0015, B:22:0x004a), top: B:27:0x0001, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:19:0x0047 A[DONT_GENERATE] */
    /* JADX WARN: Code duplicated, block: B:21:0x0049  */
    /* JADX WARN: Instruction removed from duplicated block: B:19:0x0047, please report this as an issue */
    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final synchronized void m316(int i10) {
        int i11;
        try {
            int i12 = f142 + 83;
            f144 = i12 % 128;
            if (i12 % 2 != 0) {
                int i13 = 97 / 0;
                if (this.f147.m2684() != null) {
                    f144 = (f142 + 13) % 128;
                    kj.m2854(this.f147.m2684(), i10, m311());
                }
                i11 = f144 + 85;
                f142 = i11 % 128;
                if (i11 % 2 != 0) {
                    throw null;
                }
            } else {
                if (this.f147.m2684() != null) {
                    f144 = (f142 + 13) % 128;
                    kj.m2854(this.f147.m2684(), i10, m311());
                }
                i11 = f144 + 85;
                f142 = i11 % 128;
                if (i11 % 2 != 0) {
                    throw null;
                }
            }
            throw th;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final synchronized JSONObject m317() {
        int i10 = f144 + 117;
        f142 = i10 % 128;
        if (i10 % 2 == 0) {
            this.f147.m2684();
            throw null;
        }
        return this.f147.m2684();
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private int m308(ag agVar) {
        long jM305 = m305();
        long jM306 = agVar.m305();
        if (jM305 < jM306) {
            int i10 = f144 + 79;
            f142 = i10 % 128;
            if (i10 % 2 != 0) {
                return -1;
            }
            throw null;
        }
        if (jM305 != jM306) {
            return 1;
        }
        int i11 = f142 + 99;
        f144 = i11 % 128;
        if (i11 % 2 == 0) {
            return m309(agVar);
        }
        m309(agVar);
        throw null;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private int m309(ag agVar) {
        int i10 = f142 + 55;
        f144 = i10 % 128;
        if (i10 % 2 != 0) {
            m306();
            agVar.m306();
            throw null;
        }
        long jM306 = m306();
        long jM307 = agVar.m306();
        if (jM306 < jM307) {
            return -1;
        }
        if (jM306 != jM307) {
            return 1;
        }
        int i11 = f142 + 83;
        f144 = i11 % 128;
        return i11 % 2 != 0 ? 1 : 0;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final void m314(String str) {
        JSONObject jSONObjectM317;
        String strM310;
        int i10 = f142 + 43;
        f144 = i10 % 128;
        try {
            if (i10 % 2 != 0) {
                jSONObjectM317 = m317();
                strM310 = m310((char) (61497 / (AudioTrack.getMaxVolume() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (AudioTrack.getMaxVolume() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1))), "\u0000\u0000\u0000\u0000", "\ue8f5潭㫔돰", "㊮嵃뼻", (ViewConfiguration.getLongPressTimeout() % 39) - 730894872);
            } else {
                jSONObjectM317 = m317();
                strM310 = m310((char) ((AudioTrack.getMaxVolume() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (AudioTrack.getMaxVolume() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)) + 61497), "\u0000\u0000\u0000\u0000", "\ue8f5潭㫔돰", "㊮嵃뼻", (-730894872) - (ViewConfiguration.getLongPressTimeout() >> 16));
            }
            jSONObjectM317.put(strM310.intern(), str);
        } catch (JSONException unused) {
        }
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final String m315() {
        f144 = (f142 + 5) % 128;
        String strOptString = m317().optString(m310((char) ((Process.myPid() >> 22) + 13584), "\u0000\u0000\u0000\u0000", "骖껫႔\udc35", "ᰃ࠷ち쥙", 1 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))).intern());
        int i10 = f144 + 31;
        f142 = i10 % 128;
        if (i10 % 2 != 0) {
            return strOptString;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static String m310(char c4, String str, String str2, String str3, int i10) {
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
                        cArr6[i15] = (char) (((((long) (c10 ^ cArr[i15])) ^ f143) ^ ((long) f145)) ^ ((long) f146));
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
