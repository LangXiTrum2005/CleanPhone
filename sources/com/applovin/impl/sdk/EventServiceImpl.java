package com.applovin.impl.sdk;

import android.content.Intent;
import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import com.applovin.impl.f0;
import com.applovin.impl.f6;
import com.applovin.impl.j1;
import com.applovin.impl.k5;
import com.applovin.impl.q7;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.t1;
import com.applovin.impl.u6;
import com.applovin.impl.w4;
import com.applovin.impl.z4;
import com.applovin.sdk.AppLovinEventParameters;
import com.applovin.sdk.AppLovinEventService;
import com.applovin.sdk.AppLovinEventTypes;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinWebViewActivity;
import com.ironsource.O6;
import com.ironsource.X3;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public class EventServiceImpl implements AppLovinEventService {
    public static final List<String> ALLOW_PRE_INIT_EVENT_TYPES = Arrays.asList("landing", X3.i.f27789e0, "resumed", "cf_start", "tos_ok", "gdpr_ok");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final l f9305a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AtomicBoolean f9306b = new AtomicBoolean();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Deque f9307c = new ArrayDeque();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Object f9308d = new Object();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private volatile boolean f9309e;

    public EventServiceImpl(l lVar) {
        this.f9305a = lVar;
    }

    private void c(String str, Map map, Map map2) {
        if (map.containsKey("items")) {
            Object obj = map.get("items");
            if (!(obj instanceof List)) {
                a(str, map, map2, "Invalid 'items' value: expected a list.");
                a("Invalid 'items' value: expected a list.");
                return;
            }
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                if (!(it.next() instanceof Map)) {
                    a(str, map, map2, "Invalid element in 'items': expected a map.");
                    a("Invalid element in 'items': expected a map.");
                    return;
                }
            }
        }
        a(str, map, map2, "");
        this.f9305a.s0().a((k5) new u6(this.f9305a, false, defpackage.e.n("track_event:", str), new bc.r(this, str, map, map2, 11)), f6.b.OTHER);
    }

    private String d() {
        return defpackage.e.q((String) this.f9305a.a(z4.f10222p0), "4.0/pix", new StringBuilder());
    }

    public void clearTrackedAxonEvents() {
        synchronized (this.f9308d) {
            this.f9307c.clear();
        }
    }

    public List<f0> getTrackedAxonEvents() {
        ArrayList arrayList;
        synchronized (this.f9308d) {
            arrayList = new ArrayList(this.f9307c);
        }
        return arrayList;
    }

    public boolean isAxonEventTracked() {
        return this.f9309e;
    }

    public void maybeTrackAppOpenEvent() {
        if (this.f9306b.compareAndSet(false, true)) {
            this.f9305a.G().trackEvent("landing");
        }
    }

    public String toString() {
        return "EventService{}";
    }

    @Override // com.applovin.sdk.AppLovinEventService
    public void trackCheckout(String str, Map<String, String> map) {
        Map<String, ?> map2 = CollectionUtils.map(map);
        map2.put(AppLovinEventParameters.CHECKOUT_TRANSACTION_IDENTIFIER, str);
        trackEvent(AppLovinEventTypes.USER_COMPLETED_CHECKOUT, map2);
    }

    @Override // com.applovin.sdk.AppLovinEventService
    public void trackEvent(String str) {
        trackEvent(str, new HashMap());
    }

    public void trackEventSynchronously(String str) {
        this.f9305a.Q();
        if (p.a()) {
            this.f9305a.Q().a("AppLovinEventService", "Tracking event: \"" + str + "\" synchronously");
        }
        t1 t1Var = new t1(str, new HashMap());
        boolean zContains = this.f9305a.c(z4.f10295z0).contains(t1Var.c());
        Map mapA = a(t1Var, true, zContains);
        HashMap map = new HashMap(t1Var.d());
        if (((Boolean) this.f9305a.a(z4.J5)).booleanValue() || ((Boolean) this.f9305a.a(z4.E5)).booleanValue()) {
            map.putAll(mapA);
            mapA = null;
        }
        this.f9305a.h0().e(com.applovin.impl.sdk.network.d.b().d(d()).a(c()).b(mapA).c(map).a(a(t1Var, zContains)).c(((Boolean) this.f9305a.a(z4.U5)).booleanValue()).a(((Boolean) this.f9305a.a(z4.f10227p5)).booleanValue()).a());
    }

    @Override // com.applovin.sdk.AppLovinEventService
    public void trackInAppPurchase(Intent intent, Map<String, String> map) {
        Map<String, ?> map2 = CollectionUtils.map(map);
        try {
            map2.put(AppLovinEventParameters.IN_APP_PURCHASE_DATA, intent.getStringExtra("INAPP_PURCHASE_DATA"));
            map2.put(AppLovinEventParameters.IN_APP_DATA_SIGNATURE, intent.getStringExtra("INAPP_DATA_SIGNATURE"));
        } catch (Throwable th2) {
            p.c("AppLovinEventService", "Unable to track in app purchase - invalid purchase intent", th2);
            this.f9305a.E().a("AppLovinEventService", "trackIAP", th2);
        }
        trackEvent("iap", map2);
    }

    private void a(String str, Map map) {
        boolean zContains = ALLOW_PRE_INIT_EVENT_TYPES.contains(str);
        this.f9305a.s0().a((k5) new u6(this.f9305a, zContains, "submitTrackEventPostback", new v(this, str, map, zContains, 0)), f6.b.OTHER);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(String str, Map map, Map map2) {
        Map map3 = CollectionUtils.map("AppLovin-Event", str);
        map3.put("AppLovin-SDK-Name", "AppLovin-MAX");
        com.applovin.impl.sdk.network.d.b bVarD = com.applovin.impl.sdk.network.d.b().d(b()).a(a()).a(map3).c(a(str, map, map2)).a(((Boolean) this.f9305a.a(z4.f10227p5)).booleanValue()).a(w4.a.a(((Integer) this.f9305a.a(z4.A5)).intValue())).d(false);
        if (this.f9305a.u0().c()) {
            bVarD.b(CollectionUtils.map("axon_test_code", "1"));
        }
        this.f9305a.h0().e(bVarD.a());
    }

    @Override // com.applovin.sdk.AppLovinEventService
    public void trackEvent(String str, Map<String, ?> map) {
        trackEvent(str, map, new HashMap());
    }

    @Override // com.applovin.sdk.AppLovinEventService
    public void trackEvent(String str, Map<String, ?> map, Map<String, Object> map2) {
        if (TextUtils.isEmpty(str)) {
            a("Unable to track empty event");
        } else if (this.f9305a.c(z4.A0).contains(str)) {
            c(str, map, map2);
        } else {
            a(str, map);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(String str, Map map, boolean z10) {
        t1 t1Var = new t1(str, map);
        boolean zContains = this.f9305a.c(z4.f10295z0).contains(t1Var.c());
        Map mapA = a(t1Var, false, zContains);
        HashMap map2 = new HashMap(t1Var.d());
        if (((Boolean) this.f9305a.a(z4.J5)).booleanValue() || ((Boolean) this.f9305a.a(z4.E5)).booleanValue()) {
            map2.putAll(mapA);
            mapA = null;
        }
        this.f9305a.h0().e(com.applovin.impl.sdk.network.d.b().d(d()).a(c()).a(a(t1Var, zContains)).b(mapA).c(map2).c(((Boolean) this.f9305a.a(z4.U5)).booleanValue()).a(((Boolean) this.f9305a.a(z4.f10227p5)).booleanValue()).d(z10).a(w4.a.a(((Integer) this.f9305a.a(z4.f10300z5)).intValue())).a());
    }

    private String b() {
        return defpackage.e.q((String) this.f9305a.a(z4.r0), "v1/app", new StringBuilder());
    }

    private String c() {
        return defpackage.e.q((String) this.f9305a.a(z4.f10231q0), "4.0/pix", new StringBuilder());
    }

    private void a(String str) {
        p.h("AppLovinEventService", str);
        if (q7.c(this.f9305a)) {
            throw new IllegalArgumentException(str);
        }
    }

    private Map a(t1 t1Var, boolean z10, boolean z11) {
        Map mapA = this.f9305a.B().a((Map) null, z10, false);
        mapA.put("event_id", t1Var.b());
        mapA.put("ts", Long.toString(t1Var.a()));
        if (z11) {
            mapA.put(NotificationCompat.CATEGORY_EVENT, t1Var.c());
        } else {
            mapA.put(NotificationCompat.CATEGORY_EVENT, "postinstall");
            mapA.put("sub_event", t1Var.c());
        }
        return q7.a(mapA);
    }

    private Map a(t1 t1Var, boolean z10) {
        HashMap map = new HashMap();
        if (z10) {
            map.put("AppLovin-Event", t1Var.c());
            return map;
        }
        map.put("AppLovin-Event", "postinstall");
        map.put("AppLovin-Sub-Event", t1Var.c());
        return map;
    }

    private Map a(String str, Map map, Map map2) {
        HashMap map3 = new HashMap();
        t1 t1Var = new t1(str, map);
        map3.put("id", t1Var.b());
        map3.put("name", t1Var.c());
        map3.put("data", t1Var.d());
        map3.put("timestamp", j1.a(t1Var.a()));
        Map mapG = this.f9305a.B().G();
        map3.put("app_info", mapG);
        map3.put("device_info", this.f9305a.B().p());
        CollectionUtils.putObjectToStringIfValid("dedupe_id", map2.get("dedupe_id"), map3);
        HashMap map4 = new HashMap();
        map4.put("connectEventKey", this.f9305a.r());
        CollectionUtils.putStringIfValid("eventId", this.f9305a.F(), map4);
        map4.put("version", AppLovinSdk.VERSION);
        map4.put(AppLovinWebViewActivity.INTENT_EXTRA_KEY_SDK_KEY, this.f9305a.k0());
        map4.put(O6.H, this.f9305a.B().A());
        if (((Boolean) this.f9305a.a(z4.P3)).booleanValue()) {
            CollectionUtils.putStringIfValid("art", this.f9305a.s(), map4);
        }
        HashMap map5 = new HashMap();
        map5.put("firstVisitTs", mapG.get("ia_v2"));
        map5.put("lastVisitTs", mapG.get("last_launch_ms"));
        map5.put("visitCount", mapG.get("app_launch_count"));
        map5.put("currentVisitStartTs", mapG.get("alts_ms"));
        map4.put("visitInfo", map5);
        map3.put("axon", map4);
        return map3;
    }

    private void a(String str, Map map, Map map2, String str2) {
        f0 f0Var = new f0(str, map, map2, str2);
        synchronized (this.f9308d) {
            try {
                if (this.f9307c.size() == ((Integer) this.f9305a.a(z4.B0)).intValue()) {
                    this.f9307c.pollLast();
                }
                this.f9307c.addFirst(f0Var);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.f9309e = true;
    }

    private String a() {
        return defpackage.e.q((String) this.f9305a.a(z4.f10244s0), "v1/app", new StringBuilder());
    }
}
