package com.ironsource;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class Jd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map<String, C0679yc> f26354a;

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static final class a extends kotlin.jvm.internal.o implements jk.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ JSONObject f26355a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(JSONObject jSONObject) {
            super(1);
            this.f26355a = jSONObject;
        }

        @Override // jk.b
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final wj.f invoke(String networkName) throws JSONException {
            kotlin.jvm.internal.n.e(networkName, "networkName");
            JSONObject jSONObject = this.f26355a.getJSONObject(networkName);
            kotlin.jvm.internal.n.e(jSONObject, "providerSettings.getJSONObject(networkName)");
            return new wj.f(networkName, new C0679yc(networkName, jSONObject));
        }
    }

    public Jd(JSONObject providerSettings) {
        kotlin.jvm.internal.n.f(providerSettings, "providerSettings");
        Iterator<String> itKeys = providerSettings.keys();
        kotlin.jvm.internal.n.e(itKeys, "providerSettings\n          .keys()");
        zm.s sVarU = zm.l.U(zm.l.M(itKeys), new a(providerSettings));
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = sVarU.f55130a.iterator();
        while (it.hasNext()) {
            wj.f fVar = (wj.f) sVarU.f55131b.invoke(it.next());
            linkedHashMap.put(fVar.f53283a, fVar.f53284b);
        }
        Map<String, C0679yc> mapS = xj.b0.S(linkedHashMap);
        this.f26354a = mapS;
        for (Map.Entry<String, C0679yc> entry : mapS.entrySet()) {
            entry.getKey();
            C0679yc value = entry.getValue();
            if (b(value)) {
                value.b(a(value));
            }
        }
    }

    private final boolean b(C0679yc c0679yc) {
        return c0679yc.o() && c0679yc.l().length() > 0;
    }

    public final Map<String, C0679yc> a() {
        return this.f26354a;
    }

    private final C0679yc a(C0679yc c0679yc) {
        return this.f26354a.get(c0679yc.h());
    }
}
