package com.smartdigimkt.d8;

import com.smartdigimkt.i7.h;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public class e extends c {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final String f34522i = getClass().getSimpleName();
    List<com.smartdigimkt.a7.b> j;
    boolean k;

    public e(List<com.smartdigimkt.a7.b> list) {
        this.j = list;
    }

    @Override // com.smartdigimkt.d8.c
    public int a() {
        return 8;
    }

    @Override // com.smartdigimkt.d8.c
    public byte[] c() {
        List<com.smartdigimkt.a7.b> list = this.j;
        return (list == null || list.size() <= 0) ? new byte[0] : a(a(false));
    }

    @Override // com.smartdigimkt.d8.c
    public int d() {
        return 3;
    }

    @Override // com.smartdigimkt.d8.c
    public int f() {
        return 6;
    }

    @Override // com.smartdigimkt.d8.c
    public boolean h() {
        return this.k;
    }

    @Override // com.smartdigimkt.d8.c
    public void a(String str, String str2, String str3, int i2) {
        if (this.k) {
            return;
        }
        String strM = androidx.datastore.preferences.protobuf.a.m(str3, ":", i2);
        List<com.smartdigimkt.a7.b> list = this.j;
        com.smartdigimkt.i7.d.a("tk", str, str2, strM, (String) null, String.valueOf(list != null ? list.size() : 0), String.valueOf(1));
        h.a().a(3, "", "", a(true), com.smartdigimkt.a7.d.a(1000));
    }

    private String a(boolean z2) {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObjectB = super.b();
        JSONObject jSONObjectE = super.e();
        try {
            jSONObjectB.put("app_id", com.smartdigimkt.m6.b.p().f());
            jSONObjectB.put("tcp_tk_da_type", this.f34516a);
            jSONObjectB.put("tcp_rate", this.f34517b);
            Iterator<String> itKeys = jSONObjectE.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                jSONObjectB.put(next, jSONObjectE.opt(next));
            }
        } catch (JSONException unused) {
        }
        String strB = com.smartdigimkt.n8.b.b(jSONObjectB.toString());
        JSONArray jSONArray = new JSONArray();
        List<com.smartdigimkt.a7.b> list = this.j;
        if (list != null) {
            Iterator<com.smartdigimkt.a7.b> it = list.iterator();
            while (it.hasNext()) {
                JSONObject jSONObjectA = it.next().a();
                if (z2 && jSONObjectA != null) {
                    try {
                        jSONObjectA.put("ofl", 1);
                    } catch (JSONException e2) {
                        e2.printStackTrace();
                    }
                }
                jSONArray.put(jSONObjectA);
            }
        }
        String strB2 = com.smartdigimkt.n8.b.b(jSONArray.toString());
        String strA = com.smartdigimkt.n8.e.a(com.smartdigimkt.m6.b.p().g() + "api_ver=1.0&common=" + strB + "&data=" + strB2);
        try {
            jSONObject.put("common", strB);
            jSONObject.put("data", strB2);
            jSONObject.put("api_ver", "1.0");
            jSONObject.put("sign", strA);
        } catch (Exception unused2) {
        }
        return jSONObject.toString();
    }
}
