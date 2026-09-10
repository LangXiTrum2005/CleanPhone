package com.smartdigimkt.b8;

import com.smartdigimkt.sdk.api.SDMAdRequest;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public class e extends a {
    public e(com.smartdigimkt.c8.e eVar) {
        super(eVar);
    }

    @Override // com.smartdigimkt.b8.a
    public Object a(Map<String, List<String>> map, Object obj) {
        com.smartdigimkt.l8.e eVarO;
        try {
            com.smartdigimkt.c8.d dVar = this.f33979e;
            String strI = "";
            if ((dVar instanceof com.smartdigimkt.c8.e) && (eVarO = ((com.smartdigimkt.c8.e) dVar).o()) != null) {
                strI = eVarO.I();
            }
            com.smartdigimkt.i7.d.a("bid", strI, this.j, System.currentTimeMillis(), (SDMAdRequest) null);
            return new JSONObject(obj.toString());
        } catch (Throwable unused) {
            return null;
        }
    }
}
