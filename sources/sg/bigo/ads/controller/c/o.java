package sg.bigo.ads.controller.c;

import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public final class o implements sg.bigo.ads.api.core.c.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f48011a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f48012b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f48013c;
    private final String d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f48014e;
    private final int f;
    private final String g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final String f48015h;

    public o(JSONObject jSONObject) {
        this.f48011a = jSONObject.optString("imageurl");
        this.f48012b = jSONObject.optString("clickurl");
        this.f48013c = jSONObject.optString("longlegaltext");
        this.d = jSONObject.optString("ad_info");
        this.f48014e = jSONObject.optString("ad_link");
        this.f = jSONObject.optInt("percent");
        this.g = jSONObject.optString("rec_rule");
        this.f48015h = jSONObject.optString("user_privacy");
    }

    @Override // sg.bigo.ads.api.core.c.e
    public final String a() {
        return this.f48011a;
    }

    @Override // sg.bigo.ads.api.core.c.e
    public final String b() {
        return this.f48012b;
    }

    @Override // sg.bigo.ads.api.core.c.e
    public final String c() {
        return this.f48013c;
    }

    @Override // sg.bigo.ads.api.core.c.e
    public final String d() {
        return this.d;
    }

    @Override // sg.bigo.ads.api.core.c.e
    public final String e() {
        return this.f48014e;
    }

    @Override // sg.bigo.ads.api.core.c.e
    public final int f() {
        return this.f;
    }

    @Override // sg.bigo.ads.api.core.c.e
    public final String g() {
        return this.g;
    }

    @Override // sg.bigo.ads.api.core.c.e
    public final String h() {
        return this.f48015h;
    }
}
