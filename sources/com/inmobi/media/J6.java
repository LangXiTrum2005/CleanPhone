package com.inmobi.media;

import A.RunnableC0905n;
import android.os.SystemClock;
import com.inmobi.commons.core.configs.TelemetryConfig;
import com.unity3d.services.core.network.model.HttpRequest;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import kotlin.Pair;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes5.dex */
public final class J6 {
    public static void a(F6 funnelState, R6 r6, Integer num, Function2 function2) {
        Intrinsics.f(funnelState, "funnelState");
        if (r6 == null || funnelState.f22816c <= r6.f) {
            return;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("plType", r6.f23120a.f23172c);
        linkedHashMap.put("impressionId", r6.f23120a.f23171b);
        linkedHashMap.put("plId", Long.valueOf(r6.f23120a.f23170a));
        linkedHashMap.put("adType", r6.f23120a.d);
        linkedHashMap.put("markupType", r6.f23120a.f23173e);
        linkedHashMap.put("creativeType", r6.f23120a.f);
        linkedHashMap.put("metadataBlob", r6.f23120a.g);
        linkedHashMap.put("isRewarded", Boolean.valueOf(r6.f23120a.f23174h));
        String str = r6.g;
        if (str == null) {
            str = r6.f23120a.f23175i;
        }
        linkedHashMap.put("trigger", str);
        linkedHashMap.put("urlType", r6.f23121b);
        if (num != null) {
            linkedHashMap.put("errorCode", num);
        }
        long j = r6.d;
        if (j != 0) {
            ScheduledExecutorService scheduledExecutorService = Ie.f22893a;
            linkedHashMap.put("latency", Long.valueOf(SystemClock.elapsedRealtime() - j));
        }
        r6.f = funnelState.f22816c;
        ((ScheduledThreadPoolExecutor) AbstractC3332z4.f24144b.getX()).submit(new RunnableC0905n(7, linkedHashMap, funnelState));
        if (r6.f23122c > ((TelemetryConfig.LandingPageConfig) r6.f23123e.getX()).getMaxFunnelsToTrackPerAd() || function2 == null) {
            return;
        }
        String str2 = funnelState.f22815b;
        String str3 = r6.g;
        if (str3 == null) {
            str3 = r6.f23120a.f23175i;
        }
        function2.invoke(str2, MapsKt.j(new Pair("$OPENMODE", str3), new Pair("$URLTYPE", r6.f23121b)));
    }

    public static String a(String str) {
        if (str != null && str.length() != 0 && StringsKt.l(str, "://", false)) {
            if (StringsKt.M(str, "inmobideeplink://", true)) {
                return "inmobideeplink";
            }
            if (StringsKt.M(str, "inmobinativebrowser://", true)) {
                return "inmobinativebrowser";
            }
            if (StringsKt.M(str, "https://", true)) {
                return HttpRequest.DEFAULT_SCHEME;
            }
            if (StringsKt.M(str, "http://", true)) {
                return "http";
            }
            return StringsKt.M(str, "market://", true) ? "market" : com.smartdigimkt.m6.a.r.j;
        }
        return "invalid";
    }

    public static /* synthetic */ void a(F6 f6, R6 r6, Integer num, int i2) {
        if ((i2 & 4) != 0) {
            num = null;
        }
        a(f6, r6, num, (Function2) null);
    }

    public static final void a(Map keyValueMap, F6 funnelState) {
        Intrinsics.f(keyValueMap, "$keyValueMap");
        Intrinsics.f(funnelState, "$funnelState");
        keyValueMap.put("networkType", L3.q());
        String str = funnelState.f22814a;
        Pd pd = Pd.f23077a;
        Pd.b(str, keyValueMap, Td.SDK);
    }
}
