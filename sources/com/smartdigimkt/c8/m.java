package com.smartdigimkt.c8;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public class m extends d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.smartdigimkt.v3.e f34366b;

    public m(com.smartdigimkt.v3.e eVar) {
        this.f34366b = eVar;
    }

    @Override // com.smartdigimkt.c8.d
    public Map<String, String> g() {
        String str = this.f34366b.f39088c;
        HashMap map = new HashMap();
        try {
            JSONObject jSONObject = new JSONObject(str);
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                map.put(next, jSONObject.optString(next));
            }
        } catch (Exception unused) {
        }
        return map;
    }

    @Override // com.smartdigimkt.c8.d
    public byte[] j() {
        return new byte[0];
    }

    @Override // com.smartdigimkt.c8.d
    public int l() {
        com.smartdigimkt.v3.e eVar = this.f34366b;
        if (eVar != null) {
            return eVar.f39087b;
        }
        return 2;
    }

    @Override // com.smartdigimkt.c8.d
    public String m() {
        com.smartdigimkt.v3.e eVar = this.f34366b;
        return eVar != null ? eVar.d : "";
    }
}
