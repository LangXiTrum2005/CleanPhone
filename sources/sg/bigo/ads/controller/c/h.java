package sg.bigo.ads.controller.c;

import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public final class h implements sg.bigo.ads.api.core.i.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f47975a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f47976b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f47977c;

    public h(JSONObject jSONObject) {
        this.f47975a = jSONObject.optInt("w");
        this.f47976b = jSONObject.optInt(com.smartdigimkt.m3.h.f36614b);
        this.f47977c = jSONObject.optString("data");
    }

    @Override // sg.bigo.ads.api.core.i.b
    public final int a() {
        return this.f47975a;
    }

    @Override // sg.bigo.ads.api.core.i.b
    public final int b() {
        return this.f47976b;
    }

    @Override // sg.bigo.ads.api.core.i.b
    public final String c() {
        return this.f47977c;
    }
}
