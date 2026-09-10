package com.applovin.impl;

import android.content.pm.PackageInfo;
import android.os.Build;
import android.text.TextUtils;
import com.applovin.impl.sdk.SessionTracker;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.AppLovinEventTypes;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkUtils;
import com.ironsource.C0375hc;
import com.ironsource.O6;
import com.ironsource.X3;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public abstract class g2 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static volatile ExecutorService f7968g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final com.applovin.impl.sdk.l f7970a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final com.applovin.impl.sdk.p f7971b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final f2.b f7972c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Map f7973d = defpackage.e.w();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Set f7974e = Collections.synchronizedSet(new HashSet());

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int f7967f = (int) TimeUnit.SECONDS.toMillis(30);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final Object f7969h = new Object();

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class a implements ThreadFactory {

        /* JADX INFO: renamed from: com.applovin.impl.g2$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        public class C0006a implements Thread.UncaughtExceptionHandler {
            public C0006a() {
            }

            @Override // java.lang.Thread.UncaughtExceptionHandler
            public void uncaughtException(Thread thread, Throwable th2) {
                g2.this.f7970a.Q();
                if (com.applovin.impl.sdk.p.a()) {
                    g2.this.f7970a.Q().a("HealthEventsReporter", "Caught unhandled exception", th2);
                }
            }
        }

        public a() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable, "AppLovinSdk:health_events_reporter");
            thread.setDaemon(true);
            thread.setPriority(((Integer) g2.this.f7970a.a(z4.S)).intValue());
            thread.setUncaughtExceptionHandler(new C0006a());
            return thread;
        }
    }

    public g2(com.applovin.impl.sdk.l lVar, f2.b bVar) {
        this.f7970a = lVar;
        this.f7971b = lVar.Q();
        this.f7972c = bVar;
        a();
    }

    private void c(f2 f2Var, List list) {
        HttpURLConnection httpURLConnection;
        Throwable th2;
        if (f2Var.a() == f2.b.AD || f2Var.a() == f2.b.MEDIATED_AD || f2Var.a() == f2.b.USER_SESSION || !q7.a(((Integer) this.f7970a.a(z4.B)).intValue())) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Map map = (Map) it.next();
            try {
                httpURLConnection = (HttpURLConnection) a(f2Var, map).openConnection();
                try {
                    int i10 = f7967f;
                    httpURLConnection.setConnectTimeout(i10);
                    httpURLConnection.setReadTimeout(i10);
                    httpURLConnection.setDefaultUseCaches(false);
                    httpURLConnection.setAllowUserInteraction(false);
                    httpURLConnection.setUseCaches(false);
                    httpURLConnection.setInstanceFollowRedirects(true);
                    httpURLConnection.setDoOutput(false);
                    httpURLConnection.setRequestMethod(C0375hc.f28789b);
                    httpURLConnection.setRequestProperty("AppLovin-Event-Type", f2Var.b());
                    int responseCode = httpURLConnection.getResponseCode();
                    if (com.applovin.impl.sdk.p.a()) {
                        this.f7971b.a("HealthEventsReporter", f2Var.b() + " reported with code " + responseCode + " and extra parameters " + map);
                    }
                    this.f7973d.put(f2Var, Long.valueOf(System.currentTimeMillis()));
                    q7.a(httpURLConnection, this.f7970a);
                } catch (Throwable th3) {
                    th2 = th3;
                    try {
                        if (com.applovin.impl.sdk.p.a()) {
                            this.f7971b.d("HealthEventsReporter", "Failed to report " + f2Var.b() + " with extra parameters " + map, th2);
                        }
                        q7.a(httpURLConnection, this.f7970a);
                    } catch (Throwable th4) {
                        q7.a(httpURLConnection, this.f7970a);
                        throw th4;
                    }
                }
            } catch (Throwable th5) {
                httpURLConnection = null;
                th2 = th5;
            }
        }
    }

    public void d(f2 f2Var, Map map) {
        a(f2Var, map, 0L);
    }

    private void a() {
        if (f7968g != null) {
            return;
        }
        synchronized (f7969h) {
            try {
                if (f7968g != null) {
                    return;
                }
                f7968g = Executors.newFixedThreadPool(1, new a());
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private void d(f2 f2Var, List list) {
        String str = (String) this.f7970a.a(z4.C);
        if (TextUtils.isEmpty(str)) {
            return;
        }
        double dA = f2Var.a(this.f7970a);
        if (q7.a(dA)) {
            if (((Boolean) this.f7970a.a(z4.I)).booleanValue()) {
                a(str, f2Var, a(f2Var, dA, list));
                return;
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                f7968g.execute(new bc.r(this, str, f2Var, a(f2Var, dA, Collections.singletonList((Map) it.next())), 4));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void a(String str, f2 f2Var, JSONObject jSONObject) {
        HttpURLConnection httpURLConnection = null;
        try {
            URL url = new URL(str);
            byte[] bytes = jSONObject.toString().getBytes("UTF-8");
            HttpURLConnection httpURLConnection2 = (HttpURLConnection) url.openConnection();
            try {
                int i10 = f7967f;
                httpURLConnection2.setConnectTimeout(i10);
                httpURLConnection2.setReadTimeout(i10);
                httpURLConnection2.setRequestProperty("Content-Type", "application/json; charset=utf-8");
                httpURLConnection2.setDefaultUseCaches(false);
                httpURLConnection2.setAllowUserInteraction(false);
                httpURLConnection2.setUseCaches(false);
                httpURLConnection2.setInstanceFollowRedirects(true);
                httpURLConnection2.setDoOutput(true);
                httpURLConnection2.setFixedLengthStreamingMode(bytes.length);
                httpURLConnection2.setRequestMethod(C0375hc.f28789b);
                httpURLConnection2.setRequestProperty("AppLovin-Event-Type", f2Var.b());
                OutputStream outputStream = httpURLConnection2.getOutputStream();
                outputStream.write(bytes);
                outputStream.close();
                int responseCode = httpURLConnection2.getResponseCode();
                if (com.applovin.impl.sdk.p.a()) {
                    this.f7971b.a("HealthEventsReporter", f2Var.b() + " reported with code " + responseCode);
                }
                this.f7973d.put(f2Var, Long.valueOf(System.currentTimeMillis()));
                q7.a(httpURLConnection2, this.f7970a);
            } catch (Throwable th2) {
                th = th2;
                httpURLConnection = httpURLConnection2;
                try {
                    if (com.applovin.impl.sdk.p.a()) {
                        this.f7971b.d("HealthEventsReporter", "Failed to report " + f2Var.b(), th);
                    }
                } finally {
                    q7.a(httpURLConnection, this.f7970a);
                }
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    public void a(f2 f2Var, String str) {
        a(f2Var, str, new HashMap());
    }

    public void a(f2 f2Var, String str, Map map) {
        map.put("source", str);
        d(f2Var, map);
    }

    public void a(f2 f2Var, String str, Map map, String str2) {
        if (!StringUtils.isValidString(str2) || this.f7974e.add(str2)) {
            map.put("source", str);
            a(f2Var, str, map);
        }
    }

    public void a(f2 f2Var, Map map, long j10) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(map);
        a(f2Var, arrayList, j10);
    }

    public void a(f2 f2Var, List list, long j10) {
        if (a(f2Var, j10)) {
            return;
        }
        try {
            if (q7.i()) {
                f7968g.execute(new androidx.fragment.app.d(this, f2Var, list, 9));
            } else {
                b(f2Var, list);
            }
        } catch (Throwable th2) {
            if (com.applovin.impl.sdk.p.a()) {
                this.f7971b.d("HealthEventsReporter", "Failed to report " + f2Var.b() + " with extra parameters collection " + list, th2);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void b(f2 f2Var, List list) {
        if (AppLovinSdkUtils.isEmulator()) {
            return;
        }
        if (com.applovin.impl.sdk.p.a()) {
            this.f7971b.a("HealthEventsReporter", "Reporting " + f2Var.b() + " with extra parameters collection " + list);
        }
        if (this.f7972c != f2Var.a()) {
            m1.a("Health event " + f2Var.b() + " category: " + f2Var.a() + " does not match the reporter category: " + this.f7972c, new Object[0]);
        }
        c(f2Var, list);
        d(f2Var, list);
    }

    private Map c(f2 f2Var, Map map) {
        HashMap map2 = new HashMap(map);
        if (f2Var == f2.X0) {
            map2.remove("details");
        }
        return map2;
    }

    private Map b(f2 f2Var, Map map) {
        HashMap map2 = new HashMap();
        map2.put("type", f2Var.b());
        if (f2Var == f2.T0 || f2Var == f2.S0 || f2Var == f2.f7860j1 || f2Var == f2.h1) {
            if (((Boolean) this.f7970a.a(z4.f10255t4)).booleanValue()) {
                CollectionUtils.putStringIfValid("wvvc", String.valueOf(o8.d()), map2);
                CollectionUtils.putStringIfValid("wvv", o8.c(), map2);
                CollectionUtils.putStringIfValid("wvpn", o8.b(), map2);
            }
            CollectionUtils.putStringIfValid("oglv", this.f7970a.B().K(), map2);
        }
        Map mapN = this.f7970a.B().N();
        map2.put(O6.H, String.valueOf(mapN.get(O6.H)));
        map2.put("country_code", String.valueOf(mapN.get("country_code")));
        map2.put("cc", this.f7970a.w().getCountryCode());
        map2.put("applovin_random_token", this.f7970a.j0());
        map2.put("compass_random_token", this.f7970a.v());
        map2.put(O6.B, Build.MODEL);
        map2.put("brand", Build.MANUFACTURER);
        map2.put("brand_name", Build.BRAND);
        map2.put("hardware", Build.HARDWARE);
        map2.put("revision", Build.DEVICE);
        map2.put(O6.F, Build.VERSION.RELEASE);
        map2.put("api_level", String.valueOf(Build.VERSION.SDK_INT));
        map2.put("sdk_version", String.valueOf(AppLovinSdk.VERSION));
        CollectionUtils.putStringIfValid("ad_review_sdk_version", j.b(), map2);
        map2.put(O6.f26751u, (String) this.f7970a.a(z4.f10251t));
        b(map2);
        a(map2);
        if (map != null) {
            map2.putAll(c(f2Var, map));
        }
        return map2;
    }

    private URL a(f2 f2Var, Map map) throws UnsupportedEncodingException {
        StringBuilder sb2 = new StringBuilder("https://ms.applovin.com/1.0/sdk/error?");
        Iterator it = b(f2Var, map).entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            String strEncode = URLEncoder.encode((String) entry.getKey(), "UTF-8");
            String strEncode2 = URLEncoder.encode((String) entry.getValue(), "UTF-8");
            sb2.append(strEncode);
            sb2.append(X3.j.f27830b);
            sb2.append(strEncode2);
            if (it.hasNext()) {
                sb2.append(X3.j.f27832c);
            }
        }
        return new URL(sb2.toString());
    }

    private JSONObject a(f2 f2Var, double d10, List list) {
        JSONObject jSONObject = new JSONObject();
        JsonUtils.putLong(jSONObject, "ts_ms", System.currentTimeMillis());
        if (f2Var == f2.T0 || f2Var == f2.S0 || f2Var == f2.f7860j1 || f2Var == f2.h1) {
            if (((Boolean) this.f7970a.a(z4.f10255t4)).booleanValue()) {
                JsonUtils.putStringIfValid(jSONObject, "wvvc", String.valueOf(o8.d()));
                JsonUtils.putStringIfValid(jSONObject, "wvv", o8.c());
                JsonUtils.putStringIfValid(jSONObject, "wvpn", o8.b());
            }
            JsonUtils.putStringIfValid(jSONObject, "oglv", this.f7970a.B().K());
        }
        JSONObject jSONObject2 = new JSONObject();
        Map mapN = this.f7970a.B().N();
        JsonUtils.putObject(jSONObject2, O6.H, mapN.get(O6.H));
        JsonUtils.putObject(jSONObject2, O6.F, mapN.get(O6.F));
        JsonUtils.putObject(jSONObject2, "api_level", String.valueOf(mapN.get("api_level")));
        JsonUtils.putObject(jSONObject2, "brand", mapN.get("brand"));
        JsonUtils.putObject(jSONObject2, O6.B, mapN.get(O6.B));
        JsonUtils.putObject(jSONObject2, "brand_name", mapN.get("brand_name"));
        JsonUtils.putObject(jSONObject2, "hardware", mapN.get("hardware"));
        JsonUtils.putObject(jSONObject2, "revision", mapN.get("revision"));
        JsonUtils.putObject(jSONObject2, "country_code", mapN.get("country_code"));
        JsonUtils.putObject(jSONObject2, "cc", this.f7970a.w().getCountryCode());
        JsonUtils.putObject(jSONObject2, "applovin_random_token", this.f7970a.j0());
        JsonUtils.putObject(jSONObject2, "compass_random_token", this.f7970a.v());
        JsonUtils.putObject(jSONObject2, "art", StringUtils.emptyIfNull(this.f7970a.s()));
        JsonUtils.putObject(jSONObject2, "ad_review_sdk_version", StringUtils.emptyIfNull(j.b()));
        Map mapG = this.f7970a.B().G();
        JsonUtils.putObject(jSONObject2, "sdk_version", mapG.get("sdk_version"));
        JsonUtils.putObject(jSONObject2, "plugin_version", this.f7970a.a(z4.R3));
        JsonUtils.putObject(jSONObject2, "app_version", mapG.get("app_version"));
        JsonUtils.putObject(jSONObject2, "package_name", mapG.get("package_name"));
        JsonUtils.putObject(jSONObject2, "app_version_code", String.valueOf(mapG.get("app_version_code")));
        JsonUtils.putObject(jSONObject2, "first_install", Boolean.toString(Boolean.TRUE.equals((Boolean) mapG.get("first_install_v2"))));
        JsonUtils.putObject(jSONObject2, O6.f26751u, this.f7970a.a(z4.f10251t));
        JsonUtils.putObject(jSONObject2, "mediation_provider", this.f7970a.X());
        SessionTracker sessionTrackerO0 = this.f7970a.o0();
        JsonUtils.putObject(jSONObject2, "app_state", sessionTrackerO0.getCurrentApplicationState().b());
        JsonUtils.putObject(jSONObject2, "app_state_duration_ms", Long.valueOf(sessionTrackerO0.getCurrentApplicationStateDurationMillis()));
        JsonUtils.putObject(jSONObject2, "session_id", sessionTrackerO0.getSessionId());
        JsonUtils.putObject(jSONObject2, "session_duration_ms", Long.valueOf(System.currentTimeMillis() - com.applovin.impl.sdk.l.o()));
        JsonUtils.putObject(jSONObject, "shared_fields", jSONObject2);
        JSONArray jSONArray = new JSONArray();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Map map = (Map) it.next();
            JSONObject jSONObject3 = new JSONObject();
            JsonUtils.putDouble(jSONObject3, "ts_ms", System.currentTimeMillis());
            JsonUtils.putString(jSONObject3, "type", f2Var.b());
            JsonUtils.putDouble(jSONObject3, "weight", d10);
            JsonUtils.putString(jSONObject3, AppLovinEventTypes.USER_COMPLETED_LEVEL, "DEBUG");
            a(map);
            JsonUtils.putAll(jSONObject3, (Map<String, ?>) map);
            jSONArray.put(jSONObject3);
        }
        JsonUtils.putObject(jSONObject, "events", jSONArray);
        return jSONObject;
    }

    private void b(Map map) {
        PackageInfo packageInfoA = q7.a(com.applovin.impl.sdk.l.p(), 0);
        map.put("package_name", com.applovin.impl.sdk.l.p().getPackageName());
        map.put("app_version", packageInfoA != null ? packageInfoA.versionName : "");
        map.put("app_version_code", String.valueOf(packageInfoA != null ? packageInfoA.versionCode : 0));
    }

    private void a(Map map) {
        if (map == null) {
            return;
        }
        Object objA = this.f7970a.J().a();
        Long lC = this.f7970a.J().c();
        if (objA instanceof com.applovin.impl.sdk.ad.b) {
            map.put("fs_ad_network", "AppLovin");
            map.put("fs_ad_creative_id", Long.toString(((com.applovin.impl.sdk.ad.b) objA).getAdIdNumber()));
            map.put("fs_ad_memory_usage", lC != null ? lC.toString() : "Error");
        } else {
            if (objA instanceof a3) {
                a3 a3Var = (a3) objA;
                map.put("fs_ad_network", a3Var.getNetworkName());
                map.put("fs_ad_creative_id", a3Var.getCreativeId());
                map.put("fs_ad_memory_usage", lC != null ? lC.toString() : "Error");
                return;
            }
            map.put("fs_ad_network", "None");
            map.put("fs_ad_creative_id", "None");
            map.put("fs_ad_memory_usage", "None");
        }
    }

    private boolean a(f2 f2Var, long j10) {
        Long l = (Long) this.f7973d.get(f2Var);
        return System.currentTimeMillis() - (l != null ? l.longValue() : -1L) < j10;
    }
}
