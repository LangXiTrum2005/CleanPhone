package sg.bigo.ads.controller.c;

import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public final class r implements sg.bigo.ads.api.core.o.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f48028a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f48029b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f48030c;

    public r(JSONObject jSONObject) {
        this.f48028a = jSONObject.optInt("w");
        this.f48029b = jSONObject.optInt(com.smartdigimkt.m3.h.f36614b);
        this.f48030c = jSONObject.optString("data");
    }

    @Override // sg.bigo.ads.api.core.o.c
    public final int a() {
        return this.f48028a;
    }

    @Override // sg.bigo.ads.api.core.o.c
    public final int b() {
        return this.f48029b;
    }

    @Override // sg.bigo.ads.api.core.o.c
    public final String c() {
        return this.f48030c;
    }
}
