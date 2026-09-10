package sg.bigo.ads.controller.c;

import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public final class i implements sg.bigo.ads.api.core.o.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f47978a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f47979b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f47980c;
    private final String d;

    public i(JSONObject jSONObject) {
        this.f47978a = jSONObject.optInt("w");
        this.f47979b = jSONObject.optInt(com.smartdigimkt.m3.h.f36614b);
        this.f47980c = jSONObject.optString("url");
        this.d = jSONObject.optString("md5");
    }

    @Override // sg.bigo.ads.api.core.o.a
    public final int a() {
        return this.f47978a;
    }

    @Override // sg.bigo.ads.api.core.o.a
    public final int b() {
        return this.f47979b;
    }

    @Override // sg.bigo.ads.api.core.o.a
    public final String c() {
        return this.f47980c;
    }
}
