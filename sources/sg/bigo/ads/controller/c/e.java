package sg.bigo.ads.controller.c;

import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public final class e implements sg.bigo.ads.api.core.i.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f47969a;

    public e(JSONObject jSONObject) {
        this.f47969a = jSONObject.optInt("banner_pre_load", 0) == 1;
    }

    @Override // sg.bigo.ads.api.core.i.a
    public final boolean a() {
        return this.f47969a;
    }

    @Override // sg.bigo.ads.api.core.i.a
    public final String[] b() {
        return new String[0];
    }
}
