package com.thinkup.core.common.mo;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

/* JADX INFO: loaded from: classes6.dex */
public class o {
    private static volatile o om;
    SharedPreferences o;
    final String m = "IABTCF_PurposeConsents";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    final String f41883n = "IABTCF_TCString";
    final String o0 = "IABTCF_AddtlConsent";
    final String oo = "IABTCF_VendorConsents";

    private o(Context context) {
        this.o = PreferenceManager.getDefaultSharedPreferences(context);
    }

    public static o o(Context context) {
        if (om == null) {
            synchronized (o.class) {
                try {
                    if (om == null) {
                        om = new o(context);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return om;
    }

    public final String m() {
        SharedPreferences sharedPreferences = this.o;
        return sharedPreferences != null ? sharedPreferences.getString("IABTCF_TCString", "") : "";
    }

    public final String n() {
        SharedPreferences sharedPreferences = this.o;
        return sharedPreferences != null ? sharedPreferences.getString("IABTCF_AddtlConsent", "") : "";
    }

    public final String o0() {
        SharedPreferences sharedPreferences = this.o;
        return sharedPreferences != null ? sharedPreferences.getString("IABTCF_VendorConsents", "") : "";
    }

    public final String o() {
        SharedPreferences sharedPreferences = this.o;
        return sharedPreferences != null ? sharedPreferences.getString("IABTCF_PurposeConsents", "") : "";
    }
}
