package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.ConditionVariable;
import android.os.StrictMode;
import com.applovin.impl.sdk.utils.JsonUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class yl implements SharedPreferences.OnSharedPreferenceChangeListener {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Context f22296g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f22290a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ConditionVariable f22291b = new ConditionVariable();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile boolean f22292c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public volatile boolean f22293d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public SharedPreferences f22294e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Bundle f22295f = new Bundle();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public JSONObject f22297h = new JSONObject();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f22298i = false;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f22299j = false;

    public final Object a(ul ulVar) {
        if (!this.f22291b.block(5000L)) {
            synchronized (this.f22290a) {
                try {
                    if (!this.f22293d) {
                        throw new IllegalStateException("Flags.initialize() was not called!");
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        if (!this.f22292c || this.f22294e == null || this.f22299j) {
            synchronized (this.f22290a) {
                if (this.f22292c && this.f22294e != null && !this.f22299j) {
                }
                return ulVar.c();
            }
        }
        int i10 = ulVar.f20812a;
        if (i10 != 2) {
            if (i10 == 1 && this.f22297h.has(ulVar.f20813b)) {
                return ulVar.a(this.f22297h);
            }
            StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
            try {
                StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitDiskReads().permitDiskWrites().build());
                return ulVar.b(this.f22294e);
            } finally {
                StrictMode.setThreadPolicy(threadPolicy);
            }
        }
        Bundle bundle = this.f22295f;
        if (bundle == null) {
            return ulVar.c();
        }
        switch (ulVar.f20816e) {
            case 0:
                String str = ulVar.f20813b;
                return bundle.containsKey("com.google.android.gms.ads.flag.".concat(str)) ? Boolean.valueOf(bundle.getBoolean("com.google.android.gms.ads.flag.".concat(str))) : (Boolean) ulVar.c();
            case 1:
                String str2 = ulVar.f20813b;
                return bundle.containsKey("com.google.android.gms.ads.flag.".concat(str2)) ? Integer.valueOf(bundle.getInt("com.google.android.gms.ads.flag.".concat(str2))) : (Integer) ulVar.c();
            case 2:
                String str3 = ulVar.f20813b;
                return bundle.containsKey("com.google.android.gms.ads.flag.".concat(str3)) ? Long.valueOf(bundle.getLong("com.google.android.gms.ads.flag.".concat(str3))) : (Long) ulVar.c();
            case 3:
                String str4 = ulVar.f20813b;
                return bundle.containsKey("com.google.android.gms.ads.flag.".concat(str4)) ? Float.valueOf(bundle.getFloat("com.google.android.gms.ads.flag.".concat(str4))) : (Float) ulVar.c();
            default:
                String str5 = ulVar.f20813b;
                return bundle.containsKey("com.google.android.gms.ads.flag.".concat(str5)) ? bundle.getString("com.google.android.gms.ads.flag.".concat(str5)) : (String) ulVar.c();
        }
    }

    public final Object b(ul ulVar) {
        return (this.f22292c || this.f22293d) ? a(ulVar) : ulVar.c();
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        if (!"flag_configuration".equals(str) || sharedPreferences == null) {
            return;
        }
        try {
            StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
            try {
                StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitDiskReads().permitDiskWrites().build());
                String string = sharedPreferences.getString("flag_configuration", JsonUtils.EMPTY_JSON);
                StrictMode.setThreadPolicy(threadPolicy);
                this.f22297h = new JSONObject(string);
            } catch (Throwable th2) {
                StrictMode.setThreadPolicy(threadPolicy);
                throw th2;
            }
        } catch (JSONException unused) {
        }
    }
}
