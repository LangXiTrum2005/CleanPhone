package com.smartdigimkt.b8;

import android.text.TextUtils;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public class b extends a {
    public b(com.smartdigimkt.v6.a aVar) {
        super(new com.smartdigimkt.c8.a(aVar));
    }

    @Override // com.smartdigimkt.b8.a
    public void b(int i2, Object obj) {
        if (obj == null) {
            a(i2, -10001, "Return Empty Ad.", com.smartdigimkt.v7.b.a(com.smartdigimkt.v7.b.j, "Return Empty Ad."));
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(obj.toString());
            if (TextUtils.isEmpty(jSONObject.optString("data"))) {
                a(i2, -10002, "Return Empty Ad.", com.smartdigimkt.v7.b.a(com.smartdigimkt.v7.b.j, obj.toString()));
            } else {
                super.b(i2, jSONObject);
            }
        } catch (Throwable unused) {
            a(i2, -99999, "Return Empty Ad.", com.smartdigimkt.v7.b.a(com.smartdigimkt.v7.b.j, obj.toString()));
        }
    }
}
