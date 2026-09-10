package com.ironsource.adqualitysdk.sdk.i;

import android.content.Context;
import android.text.TextUtils;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class io {

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private ip f2518;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private String f2519;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private Context f2520;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private ir f2521;

    public io(Context context, String str, String str2) {
        this.f2520 = context.getApplicationContext();
        this.f2519 = str2;
        this.f2521 = new ir(this.f2520, str);
        this.f2518 = new ip(im.f2517, this.f2520.getPackageName(), iq.m2539(this.f2520), this.f2519);
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public final HashMap<String, String> m2525(String str, int i10) {
        try {
            HashMap<String, String> mapM2543 = this.f2521.m2543(str, i10);
            HashMap<String, String> map = new HashMap<>();
            for (String str2 : mapM2543.keySet()) {
                String str3 = mapM2543.get(str2);
                if (str3 != null && !TextUtils.isEmpty(str3)) {
                    try {
                        map.put(str2, this.f2518.m2534(str3));
                    } catch (ip.d unused) {
                    }
                }
            }
            return map;
        } catch (Throwable unused2) {
            return null;
        }
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public final String m2527(String str) {
        try {
            String strM2546 = this.f2521.m2546(str);
            if (strM2546 == null || TextUtils.isEmpty(strM2546)) {
                return strM2546;
            }
            try {
                return this.f2518.m2534(strM2546);
            } catch (ip.d unused) {
                return "";
            }
        } catch (Throwable unused2) {
            return null;
        }
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final int m2528(String str) {
        try {
            return this.f2521.m2545(str);
        } catch (Throwable unused) {
            return 0;
        }
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final void m2529(String str, String str2) {
        try {
            this.f2521.m2547(str, this.f2518.m2535(str2));
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public final void m2526(String str) {
        try {
            this.f2521.m2544(str);
        } catch (Throwable unused) {
        }
    }
}
