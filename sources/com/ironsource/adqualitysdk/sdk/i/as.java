package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Process;
import com.ironsource.InterfaceC0435l1;
import com.ironsource.adqualitysdk.sdk.ISAdQualityDeviceIdType;
import com.unity3d.services.UnityAdsConstants;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class as {

    /* JADX INFO: renamed from: ﭖ, reason: contains not printable characters */
    private static int f388 = 0;

    /* JADX INFO: renamed from: ﭴ, reason: contains not printable characters */
    private static int f389 = 1;

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private static int f390 = 153;

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private ISAdQualityDeviceIdType f393;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private String f395 = "";

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private String f397 = m543(8 - (Process.getElapsedCpuTime() > 0 ? 1 : (Process.getElapsedCpuTime() == 0 ? 0 : -1)), true, 234 - (AudioTrack.getMinVolume() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (AudioTrack.getMinVolume() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)), "\ufff4\u0002\u000e\u0003\ufffe�\u0003", 6 - Color.alpha(0)).intern();

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private boolean f399 = true;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private String f396 = "";

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private boolean f398 = false;

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private final Map<String, String> f392 = new ConcurrentHashMap();

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private boolean f391 = false;

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private String f394 = "";

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    public final String m544() {
        int i10 = (f389 + 31) % 128;
        f388 = i10;
        String str = this.f394;
        f389 = (i10 + 49) % 128;
        return str;
    }

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    public final void m545() {
        int i10 = f388;
        int i11 = i10 + 59;
        f389 = i11 % 128;
        int i12 = i11 % 2;
        this.f391 = true;
        int i13 = i10 + 39;
        f389 = i13 % 128;
        if (i13 % 2 == 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    public final Map<String, String> m546() {
        int i10 = (f389 + 53) % 128;
        f388 = i10;
        Map<String, String> map = this.f392;
        f389 = (i10 + 41) % 128;
        return map;
    }

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    public final boolean m547() {
        int i10 = f388 + 73;
        int i11 = i10 % 128;
        f389 = i11;
        int i12 = i10 % 2;
        boolean z10 = this.f391;
        if (i12 == 0) {
            int i13 = 21 / 0;
        }
        f388 = (i11 + InterfaceC0435l1.d.b.f29107d) % 128;
        return z10;
    }

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    public final ISAdQualityDeviceIdType m548() {
        int i10 = (f389 + 97) % 128;
        f388 = i10;
        ISAdQualityDeviceIdType iSAdQualityDeviceIdType = this.f393;
        int i11 = i10 + 99;
        f389 = i11 % 128;
        if (i11 % 2 != 0) {
            return iSAdQualityDeviceIdType;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public final synchronized String m549() {
        int i10 = f388;
        String str = this.f397;
        int i11 = i10 + 37;
        f389 = i11 % 128;
        if (i11 % 2 != 0) {
            return str;
        }
        int i12 = 82 / 0;
        return str;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public final String m551() {
        int i10 = (f388 + 41) % 128;
        f389 = i10;
        String str = this.f396;
        int i11 = i10 + 43;
        f388 = i11 % 128;
        if (i11 % 2 != 0) {
            int i12 = 51 / 0;
        }
        return str;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final void m553(String str) {
        int i10 = f388;
        this.f395 = str;
        int i11 = i10 + 65;
        f389 = i11 % 128;
        if (i11 % 2 == 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final boolean m557() {
        int i10 = f389 + 63;
        int i11 = i10 % 128;
        f388 = i11;
        if (i10 % 2 != 0) {
            throw null;
        }
        boolean z10 = this.f398;
        int i12 = i11 + InterfaceC0435l1.d.b.f29107d;
        f389 = i12 % 128;
        if (i12 % 2 != 0) {
            return z10;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final String m558() {
        int i10 = f388;
        String str = this.f395;
        f389 = (i10 + InterfaceC0435l1.d.b.f29109f) % 128;
        return str;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public final void m550(String str) {
        int i10 = (f389 + 75) % 128;
        f388 = i10;
        this.f396 = str;
        int i11 = i10 + 77;
        f389 = i11 % 128;
        if (i11 % 2 == 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public final void m552(String str, String str2) {
        int i10 = f389;
        f388 = (i10 + 15) % 128;
        if (str != null) {
            if (str2 == null) {
                this.f392.remove(str);
                return;
            } else {
                this.f392.put(str, str2);
                return;
            }
        }
        int i11 = i10 + 63;
        f388 = i11 % 128;
        if (i11 % 2 != 0) {
            int i12 = 19 / 0;
        }
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final boolean m555() {
        int i10 = f389 + 85;
        int i11 = i10 % 128;
        f388 = i11;
        if (i10 % 2 != 0) {
            throw null;
        }
        boolean z10 = this.f399;
        f389 = (i11 + InterfaceC0435l1.d.b.f29109f) % 128;
        return z10;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final void m556(String str) {
        int i10 = (f388 + InterfaceC0435l1.d.b.f29105b) % 128;
        f389 = i10;
        this.f394 = str;
        f388 = (i10 + 73) % 128;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final synchronized void m560(String str) {
        try {
            int i10 = f388 + 63;
            f389 = i10 % 128;
            if (i10 % 2 == 0) {
                this.f397 = str;
                int i11 = 94 / 0;
            } else {
                this.f397 = str;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final void m554(boolean z10) {
        int i10 = f388 + 73;
        f389 = i10 % 128;
        int i11 = i10 % 2;
        this.f398 = z10;
        if (i11 == 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final void m562(boolean z10) {
        int i10 = f389;
        int i11 = i10 + 65;
        f388 = i11 % 128;
        int i12 = i11 % 2;
        this.f399 = z10;
        if (i12 != 0) {
            throw null;
        }
        int i13 = i10 + InterfaceC0435l1.d.b.f29109f;
        f388 = i13 % 128;
        if (i13 % 2 != 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final void m559(ISAdQualityDeviceIdType iSAdQualityDeviceIdType) {
        int i10 = (f389 + 51) % 128;
        f388 = i10;
        this.f393 = iSAdQualityDeviceIdType;
        f389 = (i10 + 1) % 128;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static String m543(int i10, boolean z10, int i11, String str, int i12) {
        String str2;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (d.f1625) {
            try {
                char[] cArr2 = new char[i10];
                d.f1622 = 0;
                while (true) {
                    int i13 = d.f1622;
                    if (i13 >= i10) {
                        break;
                    }
                    d.f1624 = cArr[i13];
                    cArr2[d.f1622] = (char) (d.f1624 + i11);
                    int i14 = d.f1622;
                    cArr2[i14] = (char) (cArr2[i14] - f390);
                    d.f1622 = i14 + 1;
                }
                if (i12 > 0) {
                    d.f1623 = i12;
                    char[] cArr3 = new char[i10];
                    System.arraycopy(cArr2, 0, cArr3, 0, i10);
                    int i15 = d.f1623;
                    System.arraycopy(cArr3, 0, cArr2, i10 - i15, i15);
                    int i16 = d.f1623;
                    System.arraycopy(cArr3, i16, cArr2, 0, i10 - i16);
                }
                if (z10) {
                    char[] cArr4 = new char[i10];
                    d.f1622 = 0;
                    while (true) {
                        int i17 = d.f1622;
                        if (i17 >= i10) {
                            break;
                        }
                        cArr4[i17] = cArr2[(i10 - i17) - 1];
                        d.f1622 = i17 + 1;
                    }
                    cArr2 = cArr4;
                }
                str2 = new String(cArr2);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return str2;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final void m561(Map<String, String> map) {
        this.f392.clear();
        if (map != null) {
            f389 = (f388 + 55) % 128;
            this.f392.putAll(map);
            f389 = (f388 + 21) % 128;
        }
    }
}
