package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.StrictMode;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.client.zzo;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class tl implements SharedPreferences.OnSharedPreferenceChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f20435a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public SharedPreferences f20436b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public JSONObject f20437c = new JSONObject();

    public final void a(Context context) {
        SharedPreferences sharedPreferences;
        SharedPreferences sharedPreferences2;
        synchronized (this.f20435a) {
            try {
                if (this.f20436b != null) {
                    return;
                }
                if (context.getApplicationContext() != null) {
                    context = context.getApplicationContext();
                }
                zzba.zza();
                try {
                    sharedPreferences = context.getSharedPreferences("google_adapter_flags", 0);
                } catch (IllegalStateException e10) {
                    zzo.zzj("", e10);
                    sharedPreferences = null;
                }
                this.f20436b = sharedPreferences;
                if (sharedPreferences != null) {
                    try {
                        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
                        try {
                            StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitDiskReads().permitDiskWrites().build());
                            String string = sharedPreferences.getString("flag_configuration", JsonUtils.EMPTY_JSON);
                            StrictMode.setThreadPolicy(threadPolicy);
                            this.f20437c = new JSONObject(string);
                        } catch (Throwable th2) {
                            StrictMode.setThreadPolicy(threadPolicy);
                            throw th2;
                        }
                    } catch (JSONException unused) {
                    }
                }
                if (!((Boolean) fn.f14464b.o()).booleanValue() && (sharedPreferences2 = this.f20436b) != null) {
                    sharedPreferences2.registerOnSharedPreferenceChangeListener(this);
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
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
                this.f20437c = new JSONObject(string);
            } catch (Throwable th2) {
                StrictMode.setThreadPolicy(threadPolicy);
                throw th2;
            }
        } catch (JSONException unused) {
        }
    }
}
