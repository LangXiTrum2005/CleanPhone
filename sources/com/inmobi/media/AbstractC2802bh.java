package com.inmobi.media;

import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.LinkedHashMap;
import p002kotlin.NoWhenBranchMatchedException;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.inmobi.media.bh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC2802bh {
    public static final void a(AbstractC2776ah telemetryType) {
        Intrinsics.checkNotNullParameter(telemetryType, "telemetryType");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (telemetryType instanceof Xg) {
            linkedHashMap.put("trigger", ((Xg) telemetryType).a);
            Wj wj = Wj.a;
            Wj.b("BillingClientConnectionError", linkedHashMap, EnumC2779ak.SDK);
        } else if (telemetryType instanceof Yg) {
            linkedHashMap.put(IronSourceConstants.EVENTS_ERROR_CODE, Short.valueOf(((Yg) telemetryType).a));
            Wj wj2 = Wj.a;
            Wj.b("IAPFetchFailed", linkedHashMap, EnumC2779ak.SDK);
        } else {
            if (!(telemetryType instanceof Zg)) {
                throw new NoWhenBranchMatchedException();
            }
            Wj wj3 = Wj.a;
            Wj.b("IAPFetchSuccess", linkedHashMap, EnumC2779ak.SDK);
        }
    }
}
