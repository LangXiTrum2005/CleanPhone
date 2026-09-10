package sg.bigo.ads.api.core;

import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public final class k implements sg.bigo.ads.api.a.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f47047a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f47048b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f47049c;
    private final String d;

    public k(JSONObject jSONObject) {
        this.f47047a = jSONObject.optInt("w");
        this.f47048b = jSONObject.optInt(com.smartdigimkt.m3.h.f36614b);
        this.f47049c = jSONObject.optString("url");
        this.d = jSONObject.optString("md5");
    }

    @Override // sg.bigo.ads.api.a.f
    public final int a() {
        return this.f47047a;
    }

    @Override // sg.bigo.ads.api.a.f
    public final int b() {
        return this.f47048b;
    }

    @Override // sg.bigo.ads.api.a.f
    public final String c() {
        return this.f47049c;
    }
}
