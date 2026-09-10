package com.smartdigimkt.c8;

import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public class o extends d {
    private List<com.smartdigimkt.a7.b> d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private com.smartdigimkt.a7.b f34371e;
    private final int g;
    boolean f = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f34369b = com.smartdigimkt.m6.b.p().f();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f34370c = com.smartdigimkt.m6.b.p().g();

    public o(int i2, List<com.smartdigimkt.a7.b> list) {
        this.g = i2;
        this.d = list;
    }

    public void a(boolean z2) {
        this.f = z2;
    }

    @Override // com.smartdigimkt.c8.d
    public JSONObject d() {
        JSONObject jSONObjectD = super.d();
        JSONObject jSONObjectI = super.i();
        try {
            jSONObjectD.put("app_id", this.f34369b);
            jSONObjectD.put("tcp_tk_da_type", this.g);
            Iterator<String> itKeys = jSONObjectI.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                jSONObjectD.put(next, jSONObjectI.opt(next));
            }
        } catch (Throwable unused) {
        }
        return jSONObjectD;
    }

    @Override // com.smartdigimkt.c8.d
    public int e() {
        return 6;
    }

    @Override // com.smartdigimkt.c8.d
    public byte[] j() {
        return a(k());
    }

    @Override // com.smartdigimkt.c8.d
    public String k() {
        JSONObject jSONObject = new JSONObject();
        String strB = com.smartdigimkt.n8.b.b(d().toString());
        JSONArray jSONArray = new JSONArray();
        List<com.smartdigimkt.a7.b> list = this.d;
        if (list != null) {
            Iterator<com.smartdigimkt.a7.b> it = list.iterator();
            while (it.hasNext()) {
                JSONObject jSONObjectA = it.next().a();
                a(jSONObjectA);
                jSONArray.put(jSONObjectA);
            }
        } else {
            com.smartdigimkt.a7.b bVar = this.f34371e;
            if (bVar != null) {
                JSONObject jSONObjectA2 = bVar.a();
                a(jSONObjectA2);
                jSONArray.put(jSONObjectA2);
            }
        }
        String strB2 = com.smartdigimkt.n8.b.b(jSONArray.toString());
        StringBuilder sb = new StringBuilder();
        androidx.media3.extractor.text.ttml.a.C(sb, this.f34370c, "api_ver=1.0&common=", strB, "&data=");
        sb.append(strB2);
        String strA = com.smartdigimkt.n8.e.a(sb.toString());
        try {
            jSONObject.put("common", strB);
            jSONObject.put("data", strB2);
            jSONObject.put("api_ver", "1.0");
            jSONObject.put("sign", strA);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        return jSONObject.toString();
    }

    @Override // com.smartdigimkt.c8.d
    public int l() {
        return 1;
    }

    @Override // com.smartdigimkt.c8.d
    public String m() {
        com.smartdigimkt.a7.b bVar = this.f34371e;
        return bVar != null ? bVar.f33749b.M() : com.smartdigimkt.w7.d.h();
    }

    public void a(JSONObject jSONObject) {
        if (!this.f || jSONObject == null) {
            return;
        }
        try {
            jSONObject.put("ofl", 1);
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
    }
}
