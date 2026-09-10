package sg.bigo.ads.controller.c;

import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public final class j implements sg.bigo.ads.api.core.o.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f47981a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f47982b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f47983c;
    private final long d;

    public j(JSONObject jSONObject) {
        this.f47981a = jSONObject.optInt("video_impression_area_rate", 0);
        this.f47982b = jSONObject.optLong("video_impression_time", 0L);
        this.f47983c = jSONObject.optInt("image_impression_area_rate", 0);
        this.d = jSONObject.optLong("image_impression_time", 0L);
    }

    @Override // sg.bigo.ads.api.core.o.b
    public final int a() {
        return this.f47981a;
    }

    @Override // sg.bigo.ads.api.core.o.b
    public final long b() {
        return this.f47982b;
    }

    @Override // sg.bigo.ads.api.core.o.b
    public final int c() {
        return this.f47983c;
    }

    @Override // sg.bigo.ads.api.core.o.b
    public final long d() {
        return this.d;
    }
}
