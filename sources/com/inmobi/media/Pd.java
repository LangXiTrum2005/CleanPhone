package com.inmobi.media;

import A.RunnableC0887e;
import com.inmobi.commons.core.configs.Config;
import com.inmobi.commons.core.configs.TelemetryConfig;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyMap;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
import kotlin.text.StringsKt;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public final class Pd implements InterfaceC3274va, Db, N2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Pd f23077a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f23078b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final List f23079c;
    public static final AtomicBoolean d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static volatile TelemetryConfig f23080e;
    public static C3236t4 f;
    public static volatile C2956be g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Od f23081h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static Xd f23082i;

    static {
        Pd pd = new Pd();
        f23077a = pd;
        f23078b = "Pd";
        ArrayList arrayListL = CollectionsKt.L("AdLoadCalled", "AdLoadDroppedAtSDK", "AdLoadSuccessful", "AdLoadFailed", "ServerFill", "ServerNoFill", "ServerError", "AssetDownloaded", "AdShowCalled", "AdShowSuccessful", "AdShowFailed", "AdGetSignalsCalled", "AdGetSignalsSucceeded", "AdGetSignalsFailed", "UnifiedIdNetworkCallRequested", "UnifiedIdNetworkResponseFailure", "FetchApiInvoked", "FetchCallbackFailure", "AdImpressionSuccessful", "RenderSuccess", "ParseSuccess", "PageStarted", "WebViewLoadFinished", "FireAdReady", "WebViewLoadCalled", "FireAdFailed", "ResourceCacheMiss", "ResourceCacheHit", "ResourceDiskCacheFileMissing", "ResourceDiskCacheFileEvicted", "LowAvailableSpaceForCache", "WebViewRenderProcessGoneEvent", "clickStartCalled", "landingsStartSuccess", "landingsStartFailed", "browserOpenFailed", "landingsPageStarted", "landingsCompleteSuccess", "landingsCompleteFailed", "ImmersiveNotSupported", "AdNotReady", "IAPFetchFailed", "BillingClientConnectionError", "BillingClientNotCompatible", "PingFailed", "PingStarted", "PingSuccess", "CompanionWebViewLoadCalled", "CompanionWebViewLoadFailed", "CompanionFireAdReady", "CompanionFireAdFailed", "CompanionWebViewPageStarted", "CompanionWebViewLoadFinished");
        f23079c = arrayListL;
        d = new AtomicBoolean(false);
        LinkedHashMap linkedHashMap = O2.f23027a;
        Config configA = M2.a("telemetry", Uc.b(), pd);
        Intrinsics.d(configA, "null cannot be cast to non-null type com.inmobi.commons.core.configs.TelemetryConfig");
        f23080e = (TelemetryConfig) configA;
        TelemetryConfig telemetryConfig = f23080e;
        g = new C2956be(new Sd(telemetryConfig.getEnabled(), telemetryConfig.getAssetReporting().isImageEnabled(), telemetryConfig.getAssetReporting().isGifEnabled(), telemetryConfig.getAssetReporting().isVideoEnabled(), telemetryConfig.getDisableAllGeneralEvents(), telemetryConfig.getPriorityEventsList(), telemetryConfig.getSamplingFactor()), CollectionsKt.i0(arrayListL));
        f23081h = Od.f23049a;
    }

    public static final void b(String eventType, Map keyValueMap, Td telemetryEventType) {
        Intrinsics.f(eventType, "eventType");
        Intrinsics.f(keyValueMap, "keyValueMap");
        Intrinsics.f(telemetryEventType, "telemetryEventType");
        Uc.a(new RunnableC0887e(eventType, keyValueMap, telemetryEventType, 4));
    }

    public static final void c() {
        if (d.getAndSet(true)) {
            return;
        }
        Pd pd = f23077a;
        if (T1.a(Nc.e(), null, null, 63) > 0) {
            pd.b();
        }
        Uc.f().a(new int[]{2, 1, 150, 152, 151}, f23081h);
        f23082i = new Xd(f23080e);
    }

    @Override // com.inmobi.media.N2
    public final void a(Config config) {
        Intrinsics.f(config, "config");
        if (config instanceof TelemetryConfig) {
            TelemetryConfig telemetryConfig = (TelemetryConfig) config;
            f23080e = telemetryConfig;
            g = new C2956be(new Sd(telemetryConfig.getEnabled(), telemetryConfig.getAssetReporting().isImageEnabled(), telemetryConfig.getAssetReporting().isGifEnabled(), telemetryConfig.getAssetReporting().isVideoEnabled(), telemetryConfig.getDisableAllGeneralEvents(), telemetryConfig.getPriorityEventsList(), telemetryConfig.getSamplingFactor()), CollectionsKt.i0(f23079c));
            Xd xd = f23082i;
            if (xd != null) {
                xd.f23350a = telemetryConfig;
            }
        }
    }

    public final void b() {
        if (d.get()) {
            C3189q4 eventConfig = f23080e.getEventConfig();
            eventConfig.k = f23080e.getTelemetryUrl();
            C3236t4 c3236t4 = f;
            if (c3236t4 == null) {
                f = new C3236t4(Nc.e(), this, eventConfig, this);
            } else {
                c3236t4.f24004i = eventConfig;
            }
            C3236t4 c3236t5 = f;
            if (c3236t5 != null) {
                C3189q4 c3189q4 = c3236t5.f24004i;
                if (c3236t5.f.get() || c3189q4 == null) {
                    return;
                }
                c3236t5.a(c3189q4.f23917c, true);
            }
        }
    }

    public static final void c(String eventType, Map keyValueMap, Td telemetryEventType) {
        String str;
        Intrinsics.f(eventType, "$eventType");
        Intrinsics.f(keyValueMap, "$keyValueMap");
        Intrinsics.f(telemetryEventType, "$telemetryEventType");
        Objects.toString(keyValueMap);
        try {
            if (g == null) {
                return;
            }
            Pd pd = f23077a;
            if (a(eventType, keyValueMap, telemetryEventType)) {
                return;
            }
            C2956be c2956be = g;
            if (c2956be != null) {
                int iA = c2956be.a(telemetryEventType, eventType);
                if (iA != 0) {
                    if (iA != 1) {
                        return;
                    }
                    if (keyValueMap.get("samplingRate") == null) {
                        keyValueMap.put("samplingRate", 100);
                    }
                } else if (keyValueMap.get("samplingRate") == null) {
                    keyValueMap.put("samplingRate", Integer.valueOf(MathKt.a((((double) 1) - f23080e.getSamplingFactor()) * ((double) 100))));
                }
                int iOrdinal = telemetryEventType.ordinal();
                if (iOrdinal == 0) {
                    str = "sdk";
                } else if (iOrdinal == 1) {
                    str = "template";
                } else {
                    throw new NoWhenBranchMatchedException();
                }
                Wd wd = new Wd(eventType, null, str);
                keyValueMap.put("eventType", wd.f23247a);
                String string = UUID.randomUUID().toString();
                Intrinsics.e(string, "toString(...)");
                keyValueMap.put("eventId", string);
                keyValueMap.put("isTemplateEvent", Boolean.valueOf(telemetryEventType == Td.TEMPLATE));
                String string2 = new JSONObject(keyValueMap).toString();
                Intrinsics.e(string2, "toString(...)");
                wd.d = string2;
                int iA2 = (T1.a(Nc.e(), null, null, 63) + 1) - f23080e.getMaxEventsToPersist();
                if (iA2 > 0) {
                    Nc.e().a(iA2);
                    int iA3 = Ud.a() + iA2;
                    if (iA3 != -1) {
                        Ud.f23277b = iA3;
                        C6 c6 = Ud.f23276a;
                        if (c6 != null) {
                            C6.a(c6, "count", iA3, false, 4, (Object) null);
                        }
                    }
                }
                Nc.e().a(wd);
                pd.b();
                return;
            }
            Intrinsics.m("mTelemetryValidator");
            throw null;
        } catch (Exception unused) {
        }
    }

    /* JADX WARN: Code duplicated, block: B:38:0x008e  */
    public static boolean a(String eventType, Map keyValueMap, Td telemetryEventType) {
        boolean z2;
        C2956be c2956be = g;
        if (c2956be != null) {
            Intrinsics.f(telemetryEventType, "telemetryEventType");
            Intrinsics.f(keyValueMap, "keyValueMap");
            Intrinsics.f(eventType, "eventType");
            if (c2956be.f23466a.f23182a) {
                int iOrdinal = telemetryEventType.ordinal();
                if (iOrdinal == 0) {
                    Oc oc = c2956be.f23467b;
                    oc.getClass();
                    Sd sd = oc.f23046a;
                    if ((sd.f23185e && !sd.f.contains(eventType)) || (!keyValueMap.isEmpty() && eventType.equals("AssetDownloaded") && keyValueMap.containsKey("assetType") && ((com.smartdigimkt.x.d.c.k.equals(keyValueMap.get("assetType")) && !oc.f23046a.f23183b) || (("gif".equals(keyValueMap.get("assetType")) && !oc.f23046a.f23184c) || ("video".equals(keyValueMap.get("assetType")) && !oc.f23046a.d))))) {
                        z2 = false;
                    }
                } else if (iOrdinal != 1) {
                    throw new NoWhenBranchMatchedException();
                }
                z2 = true;
            } else {
                z2 = false;
            }
            return !z2;
        }
        Intrinsics.m("mTelemetryValidator");
        throw null;
    }

    @Override // com.inmobi.media.InterfaceC3274va
    public final C3220s4 a() {
        int iA;
        String string;
        if (L3.f22938a.p() == 1) {
            iA = f23080e.getWifiConfig().a();
        } else {
            iA = f23080e.getMobileConfig().a();
        }
        ArrayList<Wd> arrayListJ0 = CollectionsKt.j0(Nc.e().b(iA));
        if (!a("DatabaseMaxLimitReachedV2", EmptyMap.X, Td.SDK) && arrayListJ0.size() < iA && Ud.a() > 0) {
            int iA2 = Ud.a();
            Wd wd = new Wd("DatabaseMaxLimitReachedV2", null, "sdk");
            String string2 = new JSONObject(MapsKt.g(new Pair("eventId", androidx.media3.extractor.text.ttml.a.m("toString(...)")), new Pair("eventType", "DatabaseMaxLimitReachedV2"), new Pair("samplingRate", 100), new Pair("isTemplateEvent", Boolean.FALSE), new Pair("eventLostCount", Integer.valueOf(iA2)))).toString();
            Intrinsics.e(string2, "toString(...)");
            wd.d = string2;
            Ud.f23278c = Integer.valueOf(wd.f23249c);
            arrayListJ0.add(wd);
        }
        if (arrayListJ0.isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = arrayListJ0.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(((Wd) it.next()).f23249c));
        }
        try {
            String strB = Uc.b();
            if (strB == null) {
                strB = "";
            }
            LinkedHashMap linkedHashMapL = MapsKt.l(new Pair("im-accid", strB), new Pair("version", "4.0.0"), new Pair("mk-version", Vc.a()), new Pair("u-appbid", C2994e1.f23537a), new Pair("tp", Vc.d()));
            String strF = Vc.f();
            if (strF != null) {
                linkedHashMapL.put("tp-v", strF);
            }
            JSONObject jSONObject = new JSONObject(linkedHashMapL);
            JSONArray jSONArray = new JSONArray();
            for (Wd wd2 : arrayListJ0) {
                if (StringsKt.a0(wd2.a()).toString().length() > 0) {
                    jSONArray.put(new JSONObject(wd2.a()));
                }
            }
            jSONObject.put("payload", jSONArray);
            string = jSONObject.toString();
        } catch (JSONException unused) {
            string = null;
        }
        if (string != null) {
            return new C3220s4(arrayList, string);
        }
        return null;
    }
}
