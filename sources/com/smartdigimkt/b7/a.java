package com.smartdigimkt.b7;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public class a {
    private static volatile a f = null;
    private static final String g = "IABTCF_PurposeConsents";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final String f33967h = "IABTCF_TCString";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final String f33968i = "IABTCF_AddtlConsent";
    private static final String j = "IABTCF_VendorConsents";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private SharedPreferences f33969a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f33970b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f33971c;
    private String d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f33972e;

    private a(Context context) {
        this.f33969a = PreferenceManager.getDefaultSharedPreferences(context);
    }

    public static a a(Context context) {
        if (f == null) {
            synchronized (a.class) {
                try {
                    if (f == null) {
                        f = new a(context);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f;
    }

    public String b() {
        SharedPreferences sharedPreferences = this.f33969a;
        return sharedPreferences != null ? sharedPreferences.getString(g, "") : this.f33970b;
    }

    public String c() {
        SharedPreferences sharedPreferences = this.f33969a;
        return sharedPreferences != null ? sharedPreferences.getString("IABTCF_TCString", "") : "";
    }

    public String d() {
        SharedPreferences sharedPreferences = this.f33969a;
        return sharedPreferences != null ? sharedPreferences.getString(j, "") : "";
    }

    public String a() {
        SharedPreferences sharedPreferences = this.f33969a;
        return sharedPreferences != null ? sharedPreferences.getString(f33968i, "") : "";
    }

    public synchronized JSONObject a(JSONObject jSONObject) {
        try {
            if (TextUtils.isEmpty(this.f33971c)) {
                this.f33971c = c();
                this.d = a();
            }
            if (jSONObject != null) {
                if (!TextUtils.isEmpty(this.f33971c)) {
                    jSONObject.put("tc_string", this.f33971c);
                }
                if (!TextUtils.isEmpty(this.d)) {
                    jSONObject.put("addtl_consent", this.d);
                }
            }
        } catch (Throwable unused) {
        }
        return jSONObject;
    }
}
