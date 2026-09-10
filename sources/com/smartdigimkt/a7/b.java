package com.smartdigimkt.a7;

import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public class b extends e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f33748a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public a f33749b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f33750c;

    @Override // com.smartdigimkt.a7.e
    public JSONObject a() {
        JSONObject jSONObjectC = this.f33749b.C(this.f33748a);
        if (jSONObjectC != null) {
            try {
                jSONObjectC.put("sdk_time", this.f33750c);
                return jSONObjectC;
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        return jSONObjectC;
    }
}
