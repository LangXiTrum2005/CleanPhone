package com.kochava.tracker.profile.internal;

import com.kochava.core.json.internal.JsonArrayApi;
import com.kochava.core.json.internal.JsonObjectApi;
import com.kochava.core.storage.prefs.internal.StoragePrefs;
import com.kochava.core.util.internal.ObjectUtil;

/* JADX INFO: loaded from: classes5.dex */
public final class ProfileEngagement extends a implements ProfileEngagementApi {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f28281b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public JsonObjectApi f28282c;
    public String d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f28283e;
    public long f;
    public JsonArrayApi g;

    public final synchronized void a() {
        JsonArrayApi jsonArrayApiI;
        this.f28281b = this.f28312a.a("engagement.push_watchlist_initialized", Boolean.FALSE).booleanValue();
        this.f28282c = this.f28312a.c("engagement.push_watchlist", true);
        this.d = this.f28312a.e("engagement.push_token", null);
        this.f28283e = this.f28312a.a("engagement.push_enabled", Boolean.TRUE).booleanValue();
        this.f = this.f28312a.d("engagement.push_token_sent_time_millis", 0L).longValue();
        StoragePrefs storagePrefs = this.f28312a;
        synchronized (storagePrefs) {
            String strN = ObjectUtil.n(storagePrefs.f28060a.getAll().get("engagement.push_message_id_history"));
            jsonArrayApiI = ObjectUtil.i(strN != null ? strN : null);
        }
        this.g = jsonArrayApiI;
    }

    public final synchronized String b() {
        return this.d;
    }

    public final synchronized JsonObjectApi c() {
        return this.f28282c;
    }

    public final synchronized void d(long j) {
        this.f = j;
        this.f28312a.j("engagement.push_token_sent_time_millis", j);
    }

    public final synchronized void e(JsonObjectApi jsonObjectApi) {
        this.f28282c = jsonObjectApi;
        this.f28312a.i("engagement.push_watchlist", jsonObjectApi);
    }

    public final synchronized void f() {
        this.f28281b = true;
        this.f28312a.g("engagement.push_watchlist_initialized", true);
    }
}
