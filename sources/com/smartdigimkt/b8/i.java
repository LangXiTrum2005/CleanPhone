package com.smartdigimkt.b8;

import android.text.TextUtils;
import com.smartdigimkt.sdk.api.AdError;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public class i extends a {
    private JSONObject t;

    public i(int i2, com.smartdigimkt.z6.a aVar, String str) {
        super(new com.smartdigimkt.c8.h(i2, aVar, str));
        com.smartdigimkt.c8.d dVar = this.f33979e;
        if (dVar instanceof com.smartdigimkt.c8.h) {
            this.t = ((com.smartdigimkt.c8.h) dVar).o();
        }
    }

    public void a(String str) {
        JSONObject jSONObject;
        try {
            if (TextUtils.isEmpty(str) || (jSONObject = this.t) == null) {
                return;
            }
            jSONObject.put("scenario", str);
        } catch (Throwable unused) {
        }
    }

    public String k() {
        com.smartdigimkt.c8.d dVar = this.f33979e;
        return dVar instanceof com.smartdigimkt.c8.h ? ((com.smartdigimkt.c8.h) dVar).n() : "";
    }

    @Override // com.smartdigimkt.b8.a
    public void a(AdError adError) {
        try {
            JSONObject jSONObject = new JSONObject();
            Map<String, String> mapG = this.f33979e.g();
            if (mapG != null) {
                try {
                    for (String str : mapG.keySet()) {
                        jSONObject.put(str, mapG.get(str));
                    }
                } catch (Exception unused) {
                }
            }
            String string = jSONObject.toString();
            JSONObject jSONObject2 = this.t;
            String string2 = jSONObject2 != null ? jSONObject2.toString() : "";
            String strM = this.f33979e.m();
            com.smartdigimkt.i7.h.a().a(this.f33979e.l(), strM, string, string2, com.smartdigimkt.a7.d.a(1000));
            com.smartdigimkt.i7.d.a("tk", adError.getCode(), adError.getMessage(), strM, "", "1", "");
        } catch (Throwable unused2) {
        }
    }
}
