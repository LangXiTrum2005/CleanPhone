package com.inmobi.media;

import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.inmobi.media.kb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC3100kb {
    public static final void a(AbstractC3084jb telemetryType) {
        Intrinsics.f(telemetryType, "telemetryType");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (telemetryType instanceof C3020fb) {
            linkedHashMap.put("trigger", ((C3020fb) telemetryType).f23613a);
            Pd pd = Pd.f23077a;
            Pd.b("BillingClientConnectionError", linkedHashMap, Td.SDK);
            return;
        }
        if (telemetryType instanceof C3036gb) {
            linkedHashMap.put("errorCode", Short.valueOf(((C3036gb) telemetryType).f23638a));
            Pd pd2 = Pd.f23077a;
            Pd.b("IAPFetchFailed", linkedHashMap, Td.SDK);
        } else {
            if (!(telemetryType instanceof C3068ib)) {
                if (telemetryType instanceof C3052hb) {
                    Pd pd3 = Pd.f23077a;
                    Pd.b("IAPFetchSuccess", linkedHashMap, Td.SDK);
                    return;
                }
                return;
            }
            String str = ((C3068ib) telemetryType).f23695a;
            if (str != null) {
                linkedHashMap.put("trigger", str);
            }
            Pd pd4 = Pd.f23077a;
            Pd.b("BillingClientNotCompatible", linkedHashMap, Td.SDK);
        }
    }
}
