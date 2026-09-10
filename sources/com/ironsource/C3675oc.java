package com.ironsource;

import java.util.LinkedHashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.oc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3675oc implements InterfaceC3481df<JSONObject>, InterfaceC3445bf<C3639mc> {
    private final Map<String, C3574j1> a = new LinkedHashMap();

    @Override // com.ironsource.InterfaceC3455c7
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject a(EnumC3463cf mode) throws JSONException {
        Intrinsics.checkNotNullParameter(mode, "mode");
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry<String, C3574j1> entry : this.a.entrySet()) {
            String key = entry.getKey();
            JSONArray jSONArrayA = entry.getValue().a(mode);
            if (jSONArrayA.length() > 0) {
                jSONObject.put(key, jSONArrayA);
            }
        }
        return jSONObject;
    }

    @Override // com.ironsource.InterfaceC3445bf
    public void a(C3639mc record) {
        Intrinsics.checkNotNullParameter(record, "record");
        String strC = record.c();
        Map<String, C3574j1> map = this.a;
        C3574j1 c3574j1 = map.get(strC);
        if (c3574j1 == null) {
            c3574j1 = new C3574j1();
            map.put(strC, c3574j1);
        }
        c3574j1.a(record.a(new C3657nc()));
    }
}
