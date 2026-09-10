package com.ironsource;

import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class E5 implements E0 {
    public final Map<String, Object> a(C0363h0 adProperties) {
        kotlin.jvm.internal.n.f(adProperties, "adProperties");
        HashMap map = new HashMap();
        map.put(IronSourceConstants.EVENTS_PROGRAMMATIC, 1);
        String string = adProperties.a().toString();
        kotlin.jvm.internal.n.e(string, "adProperties.adFormat.toString()");
        map.put(Wa.f27573f, string);
        map.put("adf", Integer.valueOf(If.c(adProperties.a())));
        String string2 = adProperties.b().toString();
        kotlin.jvm.internal.n.e(string2, "adProperties.adId.toString()");
        map.put(Wa.f27576i, string2);
        map.put("mediationAdUnitId", adProperties.c());
        map.put("isMultipleAdUnits", 1);
        return map;
    }
}
