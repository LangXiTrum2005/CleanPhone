package sg.bigo.ads.controller.c;

import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public final class m implements sg.bigo.ads.api.core.c.InterfaceC0832c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f48002a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f48003b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f48004c;

    public m(JSONObject jSONObject) {
        this.f48002a = jSONObject.optString("vendor_url");
        this.f48003b = jSONObject.optString("vendor_key");
        this.f48004c = jSONObject.optString("params");
    }

    @Override // sg.bigo.ads.api.core.c.InterfaceC0832c
    public final String a() {
        return this.f48002a;
    }

    @Override // sg.bigo.ads.api.core.c.InterfaceC0832c
    public final String b() {
        return this.f48003b;
    }

    @Override // sg.bigo.ads.api.core.c.InterfaceC0832c
    public final String c() {
        return this.f48004c;
    }
}
