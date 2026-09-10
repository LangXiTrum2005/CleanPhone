package com.unity3d.services.core.network.mapper;

import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.n;
import org.json.JSONArray;
import xj.o;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0000\u001a\u001e\u0010\u0000\u001a\u00020\u0001*\u0016\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0004\u0018\u00010\u0002¨\u0006\u0005"}, d2 = {"toResponseHeadersMap", "Lorg/json/JSONArray;", "", "", "", "unity-ads_defaultRelease"}, k = 2, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
public final class HttpResponseHeaderToJSONArrayKt {
    public static final JSONArray toResponseHeadersMap(Map<String, ? extends List<String>> map) {
        Set<Map.Entry<String, ? extends List<String>>> setEntrySet;
        if (map == null || (setEntrySet = map.entrySet()) == null) {
            return new JSONArray();
        }
        JSONArray jSONArray = new JSONArray();
        Iterator<T> it = setEntrySet.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            jSONArray = jSONArray.put(new JSONArray((Collection) o.Q((String) entry.getKey(), (List) entry.getValue())));
            n.e(jSONArray, "acc.put(JSONArray(listOf(key, value)))");
        }
        return jSONArray;
    }
}
