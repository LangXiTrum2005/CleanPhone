package sg.bigo.ads.controller.c;

import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public final class n implements sg.bigo.ads.api.core.c.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    String f48005a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    String f48006b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    String f48007c;
    String d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    String f48008e;
    String f;
    String[] g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    String[] f48009h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    String f48010i;

    public n(JSONObject jSONObject) {
        this.f48005a = jSONObject.optString("icon");
        this.f48006b = jSONObject.optString("title");
        this.f48007c = jSONObject.optString("rate");
        this.d = jSONObject.optString("comments");
        this.f48008e = jSONObject.optString("downloads");
        this.f = jSONObject.optString("description");
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("genre");
        if (jSONArrayOptJSONArray != null && jSONArrayOptJSONArray.length() > 0) {
            this.g = new String[jSONArrayOptJSONArray.length()];
            for (int i2 = 0; i2 < jSONArrayOptJSONArray.length(); i2++) {
                this.g[i2] = jSONArrayOptJSONArray.optString(i2);
            }
        }
        JSONArray jSONArrayOptJSONArray2 = jSONObject.optJSONArray("img");
        if (jSONArrayOptJSONArray2 != null && jSONArrayOptJSONArray2.length() > 0) {
            this.f48009h = new String[jSONArrayOptJSONArray2.length()];
            for (int i3 = 0; i3 < jSONArrayOptJSONArray2.length(); i3++) {
                this.f48009h[i3] = jSONArrayOptJSONArray2.optString(i3);
            }
        }
        this.f48010i = jSONObject.optString("name");
    }

    @Override // sg.bigo.ads.api.core.c.d
    public final String a() {
        return this.f48005a;
    }

    @Override // sg.bigo.ads.api.core.c.d
    public final String b() {
        return this.f48006b;
    }

    @Override // sg.bigo.ads.api.core.c.d
    public final String c() {
        return this.f;
    }

    @Override // sg.bigo.ads.api.core.c.d
    public final String[] d() {
        return this.g;
    }

    @Override // sg.bigo.ads.api.core.c.d
    public final String[] e() {
        return this.f48009h;
    }

    @Override // sg.bigo.ads.api.core.c.d
    public final String f() {
        return this.f48010i;
    }
}
