package com.p004ironsource.adqualitysdk.sdk.i;

import android.content.Context;
import android.text.TextUtils;
import java.util.HashMap;

/* JADX INFO: loaded from: classes5.dex */
public final class id {

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private String f2363;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private ii f2364;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private Cif f2365;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private Context f2366;

    public id(Context context, String str, String str2) {
        this.f2366 = context.getApplicationContext();
        this.f2363 = str2;
        this.f2364 = new ii(this.f2366, str);
        this.f2365 = new Cif(ib.f2355, this.f2366.getPackageName(), ij.m2437(this.f2366), this.f2363);
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public final int m2399(String str) {
        try {
            return this.f2364.m2430(str);
        } catch (Throwable unused) {
            return 0;
        }
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final void m2400(String str) {
        try {
            this.f2364.m2429(str);
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final HashMap<String, String> m2401(String str, int i2) {
        try {
            HashMap<String, String> mapM2431 = this.f2364.m2431(str, i2);
            HashMap<String, String> map = new HashMap<>();
            for (String str2 : mapM2431.keySet()) {
                String str3 = mapM2431.get(str2);
                if (str3 != null && !TextUtils.isEmpty(str3)) {
                    try {
                        map.put(str2, this.f2365.m2409(str3));
                    } catch (Cif.c unused) {
                    }
                }
            }
            return map;
        } catch (Throwable unused2) {
            return null;
        }
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final String m2402(String str) {
        try {
            String strM2432 = this.f2364.m2432(str);
            if (strM2432 == null || TextUtils.isEmpty(strM2432)) {
                return strM2432;
            }
            try {
                return this.f2365.m2409(strM2432);
            } catch (Cif.c unused) {
                return "";
            }
        } catch (Throwable unused2) {
            return null;
        }
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final void m2403(String str, String str2) {
        try {
            this.f2364.m2428(str, this.f2365.m2408(str2));
        } catch (Throwable unused) {
        }
    }
}
