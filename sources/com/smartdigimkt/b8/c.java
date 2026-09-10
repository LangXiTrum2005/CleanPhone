package com.smartdigimkt.b8;

import android.content.Context;
import android.text.TextUtils;
import com.smartdigimkt.sdk.api.AdError;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public class c extends a {
    private boolean t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final int f33982u;

    public c(Context context, int i2, List<String> list) {
        super(new com.smartdigimkt.c8.b(context, i2, list));
        this.f33982u = list != null ? list.size() : 0;
    }

    @Override // com.smartdigimkt.b8.a
    public void a(int i2, com.smartdigimkt.w7.c cVar) {
        com.smartdigimkt.c8.d dVar = this.f33979e;
        if (!TextUtils.isEmpty(dVar != null ? dVar.m() : "")) {
            super.a(i2, cVar);
        } else if (cVar != null) {
            cVar.a(i2, Integer.valueOf(this.f33982u));
        }
    }

    @Override // com.smartdigimkt.b8.a
    public boolean g() {
        return true;
    }

    public void a(boolean z2) {
        this.t = z2;
    }

    @Override // com.smartdigimkt.b8.a
    public Object a(Map<String, List<String>> map, Object obj) {
        return Integer.valueOf(this.f33982u);
    }

    @Override // com.smartdigimkt.b8.a
    public void a(AdError adError) {
        if (!this.t || this.f33979e == null) {
            return;
        }
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
            String strK = this.f33979e.k();
            String strM = this.f33979e.m();
            com.smartdigimkt.i7.h.a().a(this.f33979e.l(), strM, string, strK, com.smartdigimkt.a7.d.a(1001));
        } catch (Throwable unused2) {
        }
    }
}
