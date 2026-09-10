package com.google.firebase.remoteconfig.internal;

import android.content.SharedPreferences;
import com.applovin.impl.sdk.utils.JsonUtils;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public class ConfigSharedPrefsClient {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Date f20980e = new Date(-1);
    public static final Date f = new Date(-1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SharedPreferences f20981a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f20982b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f20983c = new Object();
    public final Object d = new Object();

    public static class BackoffMetadata {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f20984a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Date f20985b;
    }

    public static class RealtimeBackoffMetadata {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f20986a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Date f20987b;
    }

    public ConfigSharedPrefsClient(SharedPreferences sharedPreferences) {
        this.f20981a = sharedPreferences;
    }

    public final BackoffMetadata a() {
        BackoffMetadata backoffMetadata;
        synchronized (this.f20983c) {
            int i2 = this.f20981a.getInt("num_failed_fetches", 0);
            Date date = new Date(this.f20981a.getLong("backoff_end_time_in_millis", -1L));
            backoffMetadata = new BackoffMetadata();
            backoffMetadata.f20984a = i2;
            backoffMetadata.f20985b = date;
        }
        return backoffMetadata;
    }

    public final HashMap b() {
        try {
            JSONObject jSONObject = new JSONObject(this.f20981a.getString("customSignals", JsonUtils.EMPTY_JSON));
            HashMap map = new HashMap();
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                map.put(next, jSONObject.optString(next));
            }
            return map;
        } catch (JSONException unused) {
            return new HashMap();
        }
    }

    public final RealtimeBackoffMetadata c() {
        RealtimeBackoffMetadata realtimeBackoffMetadata;
        synchronized (this.d) {
            int i2 = this.f20981a.getInt("num_failed_realtime_streams", 0);
            Date date = new Date(this.f20981a.getLong("realtime_backoff_end_time_in_millis", -1L));
            realtimeBackoffMetadata = new RealtimeBackoffMetadata();
            realtimeBackoffMetadata.f20986a = i2;
            realtimeBackoffMetadata.f20987b = date;
        }
        return realtimeBackoffMetadata;
    }

    public final void d(int i2, Date date) {
        synchronized (this.f20983c) {
            this.f20981a.edit().putInt("num_failed_fetches", i2).putLong("backoff_end_time_in_millis", date.getTime()).apply();
        }
    }

    public final void e(int i2, Date date) {
        synchronized (this.d) {
            this.f20981a.edit().putInt("num_failed_realtime_streams", i2).putLong("realtime_backoff_end_time_in_millis", date.getTime()).apply();
        }
    }
}
