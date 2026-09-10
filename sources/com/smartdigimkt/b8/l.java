package com.smartdigimkt.b8;

import android.text.TextUtils;
import com.smartdigimkt.sdk.api.AdError;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public class l extends a {
    public l(int i2, com.smartdigimkt.w6.l lVar, String str, Map<String, Object> map) {
        super(new com.smartdigimkt.c8.k(i2, lVar, str, map));
    }

    public void a(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            ((com.smartdigimkt.c8.k) this.f33979e).n().put("scenario", str);
        } catch (Throwable unused) {
        }
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
            JSONObject jSONObjectN = ((com.smartdigimkt.c8.k) this.f33979e).n();
            String string = jSONObject.toString();
            String string2 = jSONObjectN != null ? jSONObjectN.toString() : "";
            String strM = this.f33979e.m();
            com.smartdigimkt.i7.h.a().a(this.f33979e.l(), strM, string, string2, com.smartdigimkt.a7.d.a(1000));
            com.smartdigimkt.i7.d.a("tk", adError.getCode(), adError.getMessage(), strM, "", "1", "");
        } catch (Throwable unused2) {
        }
    }
}
