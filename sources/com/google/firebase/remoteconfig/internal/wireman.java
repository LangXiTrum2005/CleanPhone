package com.google.firebase.remoteconfig.internal;

import android.content.SharedPreferences;
import com.applovin.impl.sdk.utils.JsonUtils;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: ConfigSharedPrefsClient.java */
/* JADX INFO: loaded from: classes3.dex */
public class wireman {

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
    public static final Date f22856beachfront = new Date(-1);

    /* JADX INFO: renamed from: competently, reason: collision with root package name */
    public static final Date f22857competently = new Date(-1);

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final SharedPreferences f22858attabal;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final Object f22861saneness = new Object();

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final Object f22859dern = new Object();

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public final Object f22862wireman = new Object();

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public final Object f22860marial = new Object();

    /* JADX INFO: compiled from: ConfigSharedPrefsClient.java */
    public static class attabal {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public int f22863attabal;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public Date f22864saneness;

        public attabal(int i, Date date) {
            this.f22863attabal = i;
            this.f22864saneness = date;
        }

        public Date attabal() {
            return this.f22864saneness;
        }

        public int saneness() {
            return this.f22863attabal;
        }
    }

    /* JADX INFO: compiled from: ConfigSharedPrefsClient.java */
    public static class saneness {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public int f22865attabal;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public Date f22866saneness;

        public saneness(int i, Date date) {
            this.f22865attabal = i;
            this.f22866saneness = date;
        }

        public Date attabal() {
            return this.f22866saneness;
        }

        public int saneness() {
            return this.f22865attabal;
        }
    }

    public wireman(SharedPreferences sharedPreferences) {
        this.f22858attabal = sharedPreferences;
    }

    public void apical(int i, Date date) {
        synchronized (this.f22859dern) {
            this.f22858attabal.edit().putInt("num_failed_fetches", i).putLong("backoff_end_time_in_millis", date.getTime()).apply();
        }
    }

    public void arytenoidectomy(Date date) {
        synchronized (this.f22861saneness) {
            this.f22858attabal.edit().putInt("last_fetch_status", -1).putLong("last_fetch_time_in_millis", date.getTime()).apply();
        }
    }

    public attabal attabal() {
        attabal attabalVar;
        synchronized (this.f22859dern) {
            attabalVar = new attabal(this.f22858attabal.getInt("num_failed_fetches", 0), new Date(this.f22858attabal.getLong("backoff_end_time_in_millis", -1L)));
        }
        return attabalVar;
    }

    public long beachfront() {
        return this.f22858attabal.getLong("last_template_version", 0L);
    }

    public long competently() {
        return this.f22858attabal.getLong("minimum_fetch_interval_in_seconds", ConfigFetchHandler.f22789cutely);
    }

    public void cutely() {
        triweekly(0, f22857competently);
    }

    public long dern() {
        return this.f22858attabal.getLong("fetch_timeout_in_seconds", 60L);
    }

    public void formularize(String str) {
        synchronized (this.f22861saneness) {
            this.f22858attabal.edit().putString("last_fetch_etag", str).apply();
        }
    }

    public void impassible(long j) {
        synchronized (this.f22861saneness) {
            this.f22858attabal.edit().putLong("last_template_version", j).apply();
        }
    }

    public saneness impromptu() {
        saneness sanenessVar;
        synchronized (this.f22862wireman) {
            sanenessVar = new saneness(this.f22858attabal.getInt("num_failed_realtime_streams", 0), new Date(this.f22858attabal.getLong("realtime_backoff_end_time_in_millis", -1L)));
        }
        return sanenessVar;
    }

    public void kowloon() {
        synchronized (this.f22861saneness) {
            this.f22858attabal.edit().putInt("last_fetch_status", 1).apply();
        }
    }

    public Date marial() {
        return new Date(this.f22858attabal.getLong("last_fetch_time_in_millis", -1L));
    }

    public void monoploid() {
        synchronized (this.f22861saneness) {
            this.f22858attabal.edit().putInt("last_fetch_status", 2).apply();
        }
    }

    public Map<String, String> saneness() {
        try {
            JSONObject jSONObject = new JSONObject(this.f22858attabal.getString("customSignals", JsonUtils.EMPTY_JSON));
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

    public void taiyuan() {
        apical(0, f22857competently);
    }

    public void triweekly(int i, Date date) {
        synchronized (this.f22862wireman) {
            this.f22858attabal.edit().putInt("num_failed_realtime_streams", i).putLong("realtime_backoff_end_time_in_millis", date.getTime()).apply();
        }
    }

    public String wireman() {
        return this.f22858attabal.getString("last_fetch_etag", null);
    }
}
