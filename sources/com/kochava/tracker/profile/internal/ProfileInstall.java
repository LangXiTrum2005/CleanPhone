package com.kochava.tracker.profile.internal;

import com.kochava.core.json.internal.JsonObject;
import com.kochava.core.json.internal.JsonObjectApi;
import com.kochava.core.storage.prefs.internal.StoragePrefs;
import com.kochava.tracker.attribution.internal.InstallAttributionResponse;
import com.kochava.tracker.deeplinks.internal.InstantAppDeeplink;
import com.kochava.tracker.huaweireferrer.internal.HuaweiReferrer;
import com.kochava.tracker.huaweireferrer.internal.HuaweiReferrerApi;
import com.kochava.tracker.install.internal.LastInstall;
import com.kochava.tracker.install.internal.LastInstallApi;
import com.kochava.tracker.installreferrer.internal.InstallReferrer;
import com.kochava.tracker.installreferrer.internal.InstallReferrerApi;
import com.kochava.tracker.payload.internal.Payload;
import com.kochava.tracker.payload.internal.PayloadApi;
import com.kochava.tracker.samsungreferrer.SamsungReferrer;
import com.kochava.tracker.samsungreferrer.SamsungReferrerApi;
import com.zg.adlib.storage.AppPreferencesKeys;

/* JADX INFO: loaded from: classes5.dex */
public final class ProfileInstall extends a implements ProfileInstallApi {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public PayloadApi f28288b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public LastInstall f28289c;
    public long d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f28290e;
    public boolean f;
    public JsonObjectApi g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f28291h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public JsonObjectApi f28292i;
    public JsonObjectApi j;
    public InstallAttributionResponse k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public InstallReferrer f28293l;
    public HuaweiReferrer m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public SamsungReferrer f28294n;
    public InstantAppDeeplink o;

    public final synchronized void a() {
        try {
            JsonObjectApi jsonObjectApiC = this.f28312a.c("install.payload", false);
            this.f28288b = jsonObjectApiC != null ? Payload.i(jsonObjectApiC) : null;
            this.f28289c = LastInstall.a(this.f28312a.c("install.last_install_info", true));
            this.d = this.f28312a.d("install.sent_time_millis", 0L).longValue();
            this.f28290e = this.f28312a.d("install.sent_count", 0L).longValue();
            StoragePrefs storagePrefs = this.f28312a;
            Boolean bool = Boolean.FALSE;
            this.f = storagePrefs.a("install.update_watchlist_initialized", bool).booleanValue();
            this.g = this.f28312a.c("install.update_watchlist", true);
            this.f28291h = this.f28312a.a("install.app_limit_ad_tracking", bool).booleanValue();
            this.f28292i = this.f28312a.c("install.identity_link", true);
            this.j = this.f28312a.c("install.custom_device_identifiers", true);
            this.k = InstallAttributionResponse.a(this.f28312a.c("install.attribution", true));
            JsonObjectApi jsonObjectApiC2 = this.f28312a.c("install.install_referrer", false);
            if (jsonObjectApiC2 != null) {
                this.f28293l = InstallReferrer.a(jsonObjectApiC2);
            } else {
                this.f28293l = null;
            }
            JsonObjectApi jsonObjectApiC3 = this.f28312a.c("install.huawei_referrer", false);
            if (jsonObjectApiC3 != null) {
                this.m = HuaweiReferrer.a(jsonObjectApiC3);
            } else {
                this.m = null;
            }
            JsonObjectApi jsonObjectApiC4 = this.f28312a.c("install.samsung_referrer", false);
            if (jsonObjectApiC4 != null) {
                this.f28294n = SamsungReferrer.b(jsonObjectApiC4);
            } else {
                this.f28294n = null;
            }
            JsonObjectApi jsonObjectApiC5 = this.f28312a.c("install.instant_app_deeplink", false);
            if (jsonObjectApiC5 != null) {
                this.o = new InstantAppDeeplink(jsonObjectApiC5.getString("install_app_id", ""), jsonObjectApiC5.getString("install_url", ""), jsonObjectApiC5.n("install_time", 0L).longValue());
            } else {
                this.o = null;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized JsonObjectApi b() {
        return this.j.c();
    }

    public final synchronized HuaweiReferrerApi c() {
        return this.m;
    }

    public final synchronized JsonObjectApi d() {
        return this.f28292i.c();
    }

    public final synchronized InstallReferrerApi e() {
        return this.f28293l;
    }

    public final synchronized LastInstallApi f() {
        return this.f28289c;
    }

    public final synchronized PayloadApi g() {
        return this.f28288b;
    }

    public final synchronized SamsungReferrerApi h() {
        return this.f28294n;
    }

    public final synchronized long i() {
        return this.f28290e;
    }

    public final synchronized long j() {
        return this.d;
    }

    public final synchronized JsonObjectApi k() {
        return this.g;
    }

    public final synchronized boolean l() {
        return this.f28291h;
    }

    public final synchronized boolean m() {
        return this.d > 0;
    }

    public final synchronized void n(boolean z2) {
        this.f28291h = z2;
        this.f28312a.g("install.app_limit_ad_tracking", z2);
    }

    public final synchronized void o(InstallAttributionResponse installAttributionResponse) {
        this.k = installAttributionResponse;
        StoragePrefs storagePrefs = this.f28312a;
        JsonObject jsonObjectW = JsonObject.w();
        jsonObjectW.r("raw", installAttributionResponse.f28100a);
        jsonObjectW.B(installAttributionResponse.f28101b, "retrieved_time_millis");
        jsonObjectW.g(AppPreferencesKeys.DEVICE_ID, installAttributionResponse.f28102c);
        jsonObjectW.o("first_install", installAttributionResponse.d);
        storagePrefs.i("install.attribution", jsonObjectW);
    }

    public final synchronized void p(JsonObjectApi jsonObjectApi) {
        this.j = jsonObjectApi;
        this.f28312a.i("install.custom_device_identifiers", jsonObjectApi);
    }

    public final synchronized void q(HuaweiReferrer huaweiReferrer) {
        this.m = huaweiReferrer;
        this.f28312a.i("install.huawei_referrer", huaweiReferrer.toJson());
    }

    public final synchronized void r(JsonObjectApi jsonObjectApi) {
        this.f28292i = jsonObjectApi;
        this.f28312a.i("install.identity_link", jsonObjectApi);
    }

    public final synchronized void s(InstallReferrer installReferrer) {
        this.f28293l = installReferrer;
        this.f28312a.i("install.install_referrer", installReferrer.toJson());
    }

    public final synchronized void t(LastInstall lastInstall) {
        this.f28289c = lastInstall;
        this.f28312a.i("install.last_install_info", lastInstall.toJson());
    }

    public final synchronized void u(PayloadApi payloadApi) {
        try {
            this.f28288b = payloadApi;
            if (payloadApi != null) {
                this.f28312a.i("install.payload", payloadApi.toJson());
            } else {
                this.f28312a.f("install.payload");
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void v(SamsungReferrer samsungReferrer) {
        this.f28294n = samsungReferrer;
        this.f28312a.i("install.samsung_referrer", samsungReferrer.c());
    }

    public final synchronized void w(long j) {
        this.f28290e = j;
        this.f28312a.j("install.sent_count", j);
    }

    public final synchronized void x(long j) {
        this.d = j;
        this.f28312a.j("install.sent_time_millis", j);
    }

    public final synchronized void y(JsonObjectApi jsonObjectApi) {
        this.g = jsonObjectApi;
        this.f28312a.i("install.update_watchlist", jsonObjectApi);
    }

    public final synchronized void z() {
        this.f = true;
        this.f28312a.g("install.update_watchlist_initialized", true);
    }
}
