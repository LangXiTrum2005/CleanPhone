package com.unity3d.ads.core.extensions;

import com.bumptech.glide.d;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.n;
import org.json.JSONArray;
import org.json.JSONException;
import pk.b;
import pk.c;
import xj.p;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0003\u001a\u001c\u0010\u0000\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00030\u0001*\u00020\u0004\u001a\u001d\u0010\u0005\u001a\u0010\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00070\u00070\u0006*\u00020\u0004¢\u0006\u0002\u0010\t¨\u0006\n"}, d2 = {"getHeadersMap", "", "", "", "Lorg/json/JSONArray;", "toTypedArray", "", "", "kotlin.jvm.PlatformType", "(Lorg/json/JSONArray;)[Ljava/lang/Object;", "unity-ads_defaultRelease"}, k = 2, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
public final class JSONArrayExtensionsKt {
    public static final Map<String, List<String>> getHeadersMap(JSONArray jSONArray) throws JSONException {
        n.f(jSONArray, "<this>");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int length = jSONArray.length();
        for (int i10 = 0; i10 < length; i10++) {
            Object obj = jSONArray.get(i10);
            n.d(obj, "null cannot be cast to non-null type org.json.JSONArray");
            JSONArray jSONArray2 = (JSONArray) obj;
            List arrayList = (List) linkedHashMap.get(jSONArray2.getString(0));
            if (arrayList == null) {
                arrayList = new ArrayList();
            }
            String string = jSONArray2.getString(1);
            n.e(string, "header.getString(1)");
            arrayList.add(string);
            String string2 = jSONArray2.getString(0);
            n.e(string2, "header.getString(0)");
            linkedHashMap.put(string2, arrayList);
        }
        return linkedHashMap;
    }

    public static final Object[] toTypedArray(JSONArray jSONArray) {
        n.f(jSONArray, "<this>");
        c cVarO = d.O(0, jSONArray.length());
        ArrayList arrayList = new ArrayList(p.W(cVarO, 10));
        Iterator it = cVarO.iterator();
        while (it.hasNext()) {
            arrayList.add(jSONArray.get(((b) it).nextInt()));
        }
        return arrayList.toArray(new Object[0]);
    }
}
