package com.kochava.tracker.init.internal;

import android.net.Uri;
import com.kochava.core.json.internal.JsonArray;
import com.kochava.core.json.internal.JsonArrayApi;
import com.kochava.core.json.internal.JsonObject;
import com.kochava.core.json.internal.JsonObjectApi;
import com.kochava.core.util.internal.ObjectUtil;
import com.kochava.tracker.privacy.internal.PrivacyProfile;
import com.kochava.tracker.privacy.internal.PrivacyProfileApi;
import com.p004ironsource.d9;
import com.p004ironsource.e9;
import com.smartdigimkt.m6.a;
import com.smartdigimkt.q0.b;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes5.dex */
public final class InitResponse implements InitResponseApi {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InitResponseAttribution f28178a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InitResponseDeeplinks f28179b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final InitResponseGeneral f28180c;
    public final InitResponseHuaweiReferrer d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final InitResponseConfig f28181e;
    public final InitResponseInstall f;
    public final InitResponseInstallReferrer g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final InitResponseInstantApps f28182h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final InitResponseNetworking f28183i;
    public final InitResponsePrivacy j;
    public final InitResponsePushNotifications k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final InitResponseSessions f28184l;
    public final InitResponseSamsungReferrer m;

    public InitResponse() {
        this.f28178a = new InitResponseAttribution();
        this.f28179b = new InitResponseDeeplinks();
        this.f28180c = new InitResponseGeneral();
        this.d = new InitResponseHuaweiReferrer();
        this.f28181e = new InitResponseConfig();
        this.f = new InitResponseInstall();
        this.g = new InitResponseInstallReferrer();
        this.f28182h = new InitResponseInstantApps();
        this.f28183i = new InitResponseNetworking();
        this.j = new InitResponsePrivacy();
        this.k = new InitResponsePushNotifications();
        this.f28184l = new InitResponseSessions();
        this.m = new InitResponseSamsungReferrer();
    }

    public static InitResponse a(JsonObjectApi jsonObjectApi) {
        JsonObjectApi jsonObjectApiK = jsonObjectApi.k(e9.ATTRIBUTION, true);
        Boolean bool = Boolean.TRUE;
        InitResponseAttribution initResponseAttribution = new InitResponseAttribution(jsonObjectApiK.f("wait", Double.valueOf(3.0d)).doubleValue(), jsonObjectApiK.j("enabled", bool).booleanValue());
        JsonObjectApi jsonObjectApiK2 = jsonObjectApi.k("deeplinks", true);
        boolean zBooleanValue = jsonObjectApiK2.j("allow_deferred", bool).booleanValue();
        double dDoubleValue = jsonObjectApiK2.f("timeout_minimum", Double.valueOf(0.25d)).doubleValue();
        double dDoubleValue2 = jsonObjectApiK2.f("timeout_maximum", Double.valueOf(30.0d)).doubleValue();
        JsonObjectApi jsonObjectApiK3 = jsonObjectApiK2.k("deferred_prefetch", false);
        InitResponseDeeplinksDeferredPrefetch initResponseDeeplinksDeferredPrefetch = null;
        if (jsonObjectApiK3 != null) {
            initResponseDeeplinksDeferredPrefetch = new InitResponseDeeplinksDeferredPrefetch(jsonObjectApiK3.j("match", Boolean.FALSE).booleanValue(), jsonObjectApiK3.getString("detail", null), jsonObjectApiK3.k(a.r.j, false));
        }
        InitResponseDeeplinks initResponseDeeplinks = new InitResponseDeeplinks(zBooleanValue, dDoubleValue, dDoubleValue2, initResponseDeeplinksDeferredPrefetch);
        JsonObjectApi jsonObjectApiK4 = jsonObjectApi.k("general", true);
        InitResponseGeneral initResponseGeneral = new InitResponseGeneral(jsonObjectApiK4.j("sdk_disabled", Boolean.FALSE).booleanValue(), jsonObjectApiK4.f("servertime", Double.valueOf(0.0d)).doubleValue(), jsonObjectApiK4.getString("app_id_override", ""), jsonObjectApiK4.getString("device_id_override", ""));
        JsonObjectApi jsonObjectApiK5 = jsonObjectApi.k("huawei_referrer", true);
        InitResponseHuaweiReferrer initResponseHuaweiReferrer = new InitResponseHuaweiReferrer(jsonObjectApiK5.j("enabled", bool).booleanValue(), jsonObjectApiK5.s(1, "retries").intValue(), jsonObjectApiK5.f("retry_wait", Double.valueOf(1.0d)).doubleValue(), jsonObjectApiK5.f("timeout", Double.valueOf(10.0d)).doubleValue());
        JsonObjectApi jsonObjectApiK6 = jsonObjectApi.k(b.i0, true);
        InitResponseConfig initResponseConfig = new InitResponseConfig(jsonObjectApiK6.f("staleness", Double.valueOf(14400.0d)).doubleValue(), jsonObjectApiK6.getString("init_token", ""));
        JsonObjectApi jsonObjectApiK7 = jsonObjectApi.k("install", true);
        InitResponseInstall initResponseInstall = new InitResponseInstall(jsonObjectApiK7.getString("resend_id", ""), jsonObjectApiK7.j("updates_enabled", bool).booleanValue());
        JsonObjectApi jsonObjectApiK8 = jsonObjectApi.k("install_referrer", true);
        InitResponseInstallReferrer initResponseInstallReferrer = new InitResponseInstallReferrer(jsonObjectApiK8.j("enabled", bool).booleanValue(), jsonObjectApiK8.s(1, "retries").intValue(), jsonObjectApiK8.f("retry_wait", Double.valueOf(1.0d)).doubleValue(), jsonObjectApiK8.f("timeout", Double.valueOf(10.0d)).doubleValue());
        JsonObjectApi jsonObjectApiK9 = jsonObjectApi.k("instant_apps", true);
        InitResponseInstantApps initResponseInstantApps = new InitResponseInstantApps(jsonObjectApiK9.f("install_deeplink_wait", Double.valueOf(10.0d)).doubleValue(), jsonObjectApiK9.j("install_deeplink_clicks_kill", bool).booleanValue());
        JsonObjectApi jsonObjectApiK10 = jsonObjectApi.k("networking", true);
        double dDoubleValue3 = jsonObjectApiK10.f("tracking_wait", Double.valueOf(10.0d)).doubleValue();
        double dDoubleValue4 = jsonObjectApiK10.f("seconds_per_request", Double.valueOf(0.0d)).doubleValue();
        JsonObjectApi jsonObjectApiK11 = jsonObjectApiK10.k("urls", true);
        String string = jsonObjectApiK11.getString(d9.a.f, "");
        Uri uri = Uri.EMPTY;
        Uri uriO = ObjectUtil.o(string);
        Uri uri2 = uriO != null ? uriO : uri;
        Uri uriO2 = ObjectUtil.o(jsonObjectApiK11.getString("install", ""));
        Uri uri3 = uriO2 != null ? uriO2 : uri;
        Uri uriO3 = ObjectUtil.o(jsonObjectApiK11.getString("get_attribution", ""));
        Uri uri4 = uriO3 != null ? uriO3 : uri;
        Uri uriO4 = ObjectUtil.o(jsonObjectApiK11.getString("update", ""));
        Uri uri5 = uriO4 != null ? uriO4 : uri;
        Uri uriO5 = ObjectUtil.o(jsonObjectApiK11.getString("identityLink", ""));
        Uri uri6 = uriO5 != null ? uriO5 : uri;
        Uri uriO6 = ObjectUtil.o(jsonObjectApiK11.getString("smartlink", ""));
        Uri uri7 = uriO6 != null ? uriO6 : uri;
        Uri uriO7 = ObjectUtil.o(jsonObjectApiK11.getString("push_token_add", ""));
        Uri uri8 = uriO7 != null ? uriO7 : uri;
        Uri uriO8 = ObjectUtil.o(jsonObjectApiK11.getString("push_token_remove", ""));
        Uri uri9 = uriO8 != null ? uriO8 : uri;
        Uri uriO9 = ObjectUtil.o(jsonObjectApiK11.getString("session", ""));
        Uri uri10 = uriO9 != null ? uriO9 : uri;
        Uri uriO10 = ObjectUtil.o(jsonObjectApiK11.getString("session_begin", ""));
        Uri uri11 = uriO10 != null ? uriO10 : uri;
        Uri uriO11 = ObjectUtil.o(jsonObjectApiK11.getString("session_end", ""));
        Uri uri12 = uriO11 != null ? uriO11 : uri;
        Uri uriO12 = ObjectUtil.o(jsonObjectApiK11.getString("event", ""));
        InitResponseNetworking initResponseNetworking = new InitResponseNetworking(dDoubleValue3, dDoubleValue4, new InitResponseNetworkingUrls(uri2, uri3, uri4, uri5, uri6, uri7, uri8, uri9, uri10, uri11, uri12, uriO12 != null ? uriO12 : uri, jsonObjectApiK11.k("event_by_name", true)), jsonObjectApiK10.d("retry_waterfall"));
        JsonObjectApi jsonObjectApiK12 = jsonObjectApi.k("privacy", true);
        JsonArrayApi jsonArrayApiD = jsonObjectApiK12.d("profiles");
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        while (i2 < jsonArrayApiD.length()) {
            JsonObjectApi jsonObjectApiB = jsonArrayApiD.b(i2);
            InitResponseInstantApps initResponseInstantApps2 = initResponseInstantApps;
            if (jsonObjectApiB != null) {
                arrayList.add(new PrivacyProfile(jsonObjectApiB.getString("name", ""), jsonObjectApiB.j("sleep", Boolean.FALSE).booleanValue(), ObjectUtil.e(jsonObjectApiB.d("payloads")), ObjectUtil.e(jsonObjectApiB.d("keys"))));
            }
            i2++;
            jsonArrayApiD = jsonArrayApiD;
            initResponseInstantApps = initResponseInstantApps2;
            initResponseGeneral = initResponseGeneral;
        }
        InitResponseInstantApps initResponseInstantApps3 = initResponseInstantApps;
        PrivacyProfileApi[] privacyProfileApiArr = (PrivacyProfileApi[]) arrayList.toArray(new PrivacyProfileApi[0]);
        String[] strArrE = ObjectUtil.e(jsonObjectApiK12.d("allow_custom_ids"));
        String[] strArrE2 = ObjectUtil.e(jsonObjectApiK12.d("deny_datapoints"));
        String[] strArrE3 = ObjectUtil.e(jsonObjectApiK12.d("deny_event_names"));
        String[] strArrE4 = ObjectUtil.e(jsonObjectApiK12.d("deny_identity_links"));
        JsonObjectApi jsonObjectApiK13 = jsonObjectApiK12.k("intelligent_consent", true);
        Boolean bool2 = Boolean.FALSE;
        InitResponsePrivacy initResponsePrivacy = new InitResponsePrivacy(privacyProfileApiArr, strArrE, strArrE2, strArrE3, strArrE4, new InitResponsePrivacyIntelligentConsent(jsonObjectApiK13.j("gdpr_enabled", bool2).booleanValue(), jsonObjectApiK13.j("gdpr_applies", bool2).booleanValue()));
        JsonObjectApi jsonObjectApiK14 = jsonObjectApi.k("push_notifications", true);
        InitResponsePushNotifications initResponsePushNotifications = new InitResponsePushNotifications(jsonObjectApiK14.j("enabled", bool2).booleanValue(), jsonObjectApiK14.getString("resend_id", ""));
        JsonObjectApi jsonObjectApiK15 = jsonObjectApi.k("sessions", true);
        Boolean bool3 = Boolean.TRUE;
        InitResponseSessions initResponseSessions = new InitResponseSessions(jsonObjectApiK15.j("enabled", bool3).booleanValue(), jsonObjectApiK15.f("minimum", Double.valueOf(30.0d)).doubleValue(), jsonObjectApiK15.f("window", Double.valueOf(600.0d)).doubleValue());
        JsonObjectApi jsonObjectApiK16 = jsonObjectApi.k("samsung_referrer", true);
        return new InitResponse(initResponseAttribution, initResponseDeeplinks, initResponseGeneral, initResponseHuaweiReferrer, initResponseConfig, initResponseInstall, initResponseInstallReferrer, initResponseInstantApps3, initResponseNetworking, initResponsePrivacy, initResponsePushNotifications, initResponseSessions, new InitResponseSamsungReferrer(jsonObjectApiK16.j("enabled", bool3).booleanValue(), jsonObjectApiK16.s(1, "retries").intValue(), jsonObjectApiK16.f("retry_wait", Double.valueOf(1.0d)).doubleValue(), jsonObjectApiK16.f("timeout", Double.valueOf(10.0d)).doubleValue()));
    }

    public final JsonObject b() {
        JsonObject jsonObjectW = JsonObject.w();
        InitResponseAttribution initResponseAttribution = this.f28178a;
        JsonObjectApi jsonObjectApiW = JsonObject.w();
        jsonObjectApiW.o("enabled", initResponseAttribution.f28185a);
        jsonObjectApiW.q(initResponseAttribution.f28186b, "wait");
        jsonObjectW.r(e9.ATTRIBUTION, jsonObjectApiW);
        InitResponseDeeplinks initResponseDeeplinks = this.f28179b;
        JsonObjectApi jsonObjectApiW2 = JsonObject.w();
        jsonObjectApiW2.o("allow_deferred", initResponseDeeplinks.f28189a);
        jsonObjectApiW2.q(initResponseDeeplinks.f28190b, "timeout_minimum");
        jsonObjectApiW2.q(initResponseDeeplinks.f28191c, "timeout_maximum");
        InitResponseDeeplinksDeferredPrefetch initResponseDeeplinksDeferredPrefetch = initResponseDeeplinks.d;
        if (initResponseDeeplinksDeferredPrefetch != null) {
            jsonObjectApiW2.r("deferred_prefetch", initResponseDeeplinksDeferredPrefetch.toJson());
        }
        jsonObjectW.r("deeplinks", jsonObjectApiW2);
        InitResponseGeneral initResponseGeneral = this.f28180c;
        JsonObjectApi jsonObjectApiW3 = JsonObject.w();
        jsonObjectApiW3.o("sdk_disabled", initResponseGeneral.f28195a);
        jsonObjectApiW3.q(initResponseGeneral.f28196b, "servertime");
        jsonObjectApiW3.g("app_id_override", initResponseGeneral.f28197c);
        jsonObjectApiW3.g("device_id_override", initResponseGeneral.d);
        jsonObjectW.r("general", jsonObjectApiW3);
        InitResponseHuaweiReferrer initResponseHuaweiReferrer = this.d;
        JsonObject jsonObjectW2 = JsonObject.w();
        jsonObjectW2.o("enabled", initResponseHuaweiReferrer.f28198a);
        jsonObjectW2.z(initResponseHuaweiReferrer.f28199b, "retries");
        jsonObjectW2.q(initResponseHuaweiReferrer.f28200c, "retry_wait");
        jsonObjectW2.q(initResponseHuaweiReferrer.d, "timeout");
        jsonObjectW.r("huawei_referrer", jsonObjectW2);
        InitResponseConfig initResponseConfig = this.f28181e;
        JsonObjectApi jsonObjectApiW4 = JsonObject.w();
        jsonObjectApiW4.q(initResponseConfig.f28187a, "staleness");
        jsonObjectApiW4.g("init_token", initResponseConfig.f28188b);
        jsonObjectW.r(b.i0, jsonObjectApiW4);
        InitResponseInstall initResponseInstall = this.f;
        JsonObjectApi jsonObjectApiW5 = JsonObject.w();
        jsonObjectApiW5.g("resend_id", initResponseInstall.f28201a);
        jsonObjectApiW5.o("updates_enabled", initResponseInstall.f28202b);
        jsonObjectW.r("install", jsonObjectApiW5);
        InitResponseInstallReferrer initResponseInstallReferrer = this.g;
        JsonObject jsonObjectW3 = JsonObject.w();
        jsonObjectW3.o("enabled", initResponseInstallReferrer.f28203a);
        jsonObjectW3.z(initResponseInstallReferrer.f28204b, "retries");
        jsonObjectW3.q(initResponseInstallReferrer.f28205c, "retry_wait");
        jsonObjectW3.q(initResponseInstallReferrer.d, "timeout");
        jsonObjectW.r("install_referrer", jsonObjectW3);
        InitResponseInstantApps initResponseInstantApps = this.f28182h;
        JsonObjectApi jsonObjectApiW6 = JsonObject.w();
        jsonObjectApiW6.q(initResponseInstantApps.f28206a, "install_deeplink_wait");
        jsonObjectApiW6.o("install_deeplink_clicks_kill", initResponseInstantApps.f28207b);
        jsonObjectW.r("instant_apps", jsonObjectApiW6);
        InitResponseNetworking initResponseNetworking = this.f28183i;
        initResponseNetworking.getClass();
        JsonObject jsonObjectW4 = JsonObject.w();
        jsonObjectW4.q(initResponseNetworking.f28208a, "tracking_wait");
        jsonObjectW4.q(initResponseNetworking.f28209b, "seconds_per_request");
        InitResponseNetworkingUrls initResponseNetworkingUrls = initResponseNetworking.f28210c;
        initResponseNetworkingUrls.getClass();
        JsonObject jsonObjectW5 = JsonObject.w();
        jsonObjectW5.g(d9.a.f, initResponseNetworkingUrls.f28211a.toString());
        jsonObjectW5.g("install", initResponseNetworkingUrls.f28212b.toString());
        jsonObjectW5.g("get_attribution", initResponseNetworkingUrls.f28213c.toString());
        jsonObjectW5.g("update", initResponseNetworkingUrls.d.toString());
        jsonObjectW5.g("identityLink", initResponseNetworkingUrls.f28214e.toString());
        jsonObjectW5.g("smartlink", initResponseNetworkingUrls.f.toString());
        jsonObjectW5.g("push_token_add", initResponseNetworkingUrls.g.toString());
        jsonObjectW5.g("push_token_remove", initResponseNetworkingUrls.f28215h.toString());
        jsonObjectW5.g("session", initResponseNetworkingUrls.f28216i.toString());
        jsonObjectW5.g("session_begin", initResponseNetworkingUrls.j.toString());
        jsonObjectW5.g("session_end", initResponseNetworkingUrls.k.toString());
        jsonObjectW5.g("event", initResponseNetworkingUrls.f28217l.toString());
        jsonObjectW5.r("event_by_name", initResponseNetworkingUrls.m);
        jsonObjectW4.r("urls", jsonObjectW5);
        jsonObjectW4.A("retry_waterfall", initResponseNetworking.d);
        jsonObjectW.r("networking", jsonObjectW4);
        InitResponsePrivacy initResponsePrivacy = this.j;
        initResponsePrivacy.getClass();
        JsonObject jsonObjectW6 = JsonObject.w();
        JsonArray jsonArrayG = JsonArray.g();
        for (PrivacyProfileApi privacyProfileApi : initResponsePrivacy.f28218a) {
            if (privacyProfileApi != null) {
                jsonArrayG.f(privacyProfileApi.toJson());
            }
        }
        jsonObjectW6.A("profiles", jsonArrayG);
        jsonObjectW6.A("allow_custom_ids", ObjectUtil.p(initResponsePrivacy.f28219b));
        jsonObjectW6.A("deny_datapoints", ObjectUtil.p(initResponsePrivacy.f28220c));
        jsonObjectW6.A("deny_event_names", ObjectUtil.p(initResponsePrivacy.d));
        jsonObjectW6.A("deny_identity_links", ObjectUtil.p(initResponsePrivacy.f28221e));
        InitResponsePrivacyIntelligentConsent initResponsePrivacyIntelligentConsent = initResponsePrivacy.f;
        JsonObject jsonObjectW7 = JsonObject.w();
        jsonObjectW7.o("gdpr_enabled", initResponsePrivacyIntelligentConsent.f28222a);
        jsonObjectW7.o("gdpr_applies", initResponsePrivacyIntelligentConsent.f28223b);
        jsonObjectW6.r("intelligent_consent", jsonObjectW7);
        jsonObjectW.r("privacy", jsonObjectW6);
        InitResponsePushNotifications initResponsePushNotifications = this.k;
        initResponsePushNotifications.getClass();
        JsonObjectApi jsonObjectApiW7 = JsonObject.w();
        jsonObjectApiW7.o("enabled", initResponsePushNotifications.f28224a);
        jsonObjectApiW7.g("resend_id", initResponsePushNotifications.f28225b);
        jsonObjectW.r("push_notifications", jsonObjectApiW7);
        InitResponseSessions initResponseSessions = this.f28184l;
        initResponseSessions.getClass();
        JsonObjectApi jsonObjectApiW8 = JsonObject.w();
        jsonObjectApiW8.o("enabled", initResponseSessions.f28229a);
        jsonObjectApiW8.q(initResponseSessions.f28230b, "minimum");
        jsonObjectApiW8.q(initResponseSessions.f28231c, "window");
        jsonObjectW.r("sessions", jsonObjectApiW8);
        InitResponseSamsungReferrer initResponseSamsungReferrer = this.m;
        initResponseSamsungReferrer.getClass();
        JsonObject jsonObjectW8 = JsonObject.w();
        jsonObjectW8.o("enabled", initResponseSamsungReferrer.f28226a);
        jsonObjectW8.z(initResponseSamsungReferrer.f28227b, "retries");
        jsonObjectW8.q(initResponseSamsungReferrer.f28228c, "retry_wait");
        jsonObjectW8.q(initResponseSamsungReferrer.d, "timeout");
        jsonObjectW.r("samsung_referrer", jsonObjectW8);
        return jsonObjectW;
    }

    public InitResponse(InitResponseAttribution initResponseAttribution, InitResponseDeeplinks initResponseDeeplinks, InitResponseGeneral initResponseGeneral, InitResponseHuaweiReferrer initResponseHuaweiReferrer, InitResponseConfig initResponseConfig, InitResponseInstall initResponseInstall, InitResponseInstallReferrer initResponseInstallReferrer, InitResponseInstantApps initResponseInstantApps, InitResponseNetworking initResponseNetworking, InitResponsePrivacy initResponsePrivacy, InitResponsePushNotifications initResponsePushNotifications, InitResponseSessions initResponseSessions, InitResponseSamsungReferrer initResponseSamsungReferrer) {
        this.f28178a = initResponseAttribution;
        this.f28179b = initResponseDeeplinks;
        this.f28180c = initResponseGeneral;
        this.d = initResponseHuaweiReferrer;
        this.f28181e = initResponseConfig;
        this.f = initResponseInstall;
        this.g = initResponseInstallReferrer;
        this.f28182h = initResponseInstantApps;
        this.f28183i = initResponseNetworking;
        this.j = initResponsePrivacy;
        this.k = initResponsePushNotifications;
        this.f28184l = initResponseSessions;
        this.m = initResponseSamsungReferrer;
    }
}
