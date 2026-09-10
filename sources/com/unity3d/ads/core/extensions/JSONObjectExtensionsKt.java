package com.unity3d.ads.core.extensions;

import com.google.android.gms.ads.AdError;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.n;
import org.json.JSONObject;
import zm.a;
import zm.i;
import zm.l;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0018\u0010\u0000\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001*\u00020\u0004¨\u0006\u0005"}, d2 = {"toBuiltInMap", "", "", "", "Lorg/json/JSONObject;", "unity-ads_defaultRelease"}, k = 2, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
public final class JSONObjectExtensionsKt {
    public static final Map<String, Object> toBuiltInMap(JSONObject jSONObject) {
        n.f(jSONObject, "<this>");
        Iterator<String> itKeys = jSONObject.keys();
        n.e(itKeys, "keys()");
        i iVarM = l.M(itKeys);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : (a) iVarM) {
            Object objOpt = jSONObject.opt((String) obj);
            if (objOpt == null || String.valueOf(objOpt).equals(AdError.UNDEFINED_DOMAIN) || String.valueOf(objOpt).equals("null")) {
                objOpt = null;
            }
            linkedHashMap.put(obj, objOpt);
        }
        return linkedHashMap;
    }
}
