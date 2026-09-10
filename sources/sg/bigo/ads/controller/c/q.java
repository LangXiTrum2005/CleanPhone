package sg.bigo.ads.controller.c;

import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public final class q implements sg.bigo.ads.api.core.c.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final JSONObject f48022a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f48023b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f48024c;
    private final String d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f48025e;
    private final int f;
    private final int g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final String[] f48026h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final String[] f48027i;

    public q(JSONObject jSONObject) {
        this.f48022a = jSONObject;
        this.f48023b = jSONObject.optInt("type", 0);
        this.f48024c = jSONObject.optString("value", "");
        this.d = jSONObject.optString("name", "");
        this.f48025e = jSONObject.optString("uuid", "");
        this.f = jSONObject.optInt("replace", 0);
        this.g = jSONObject.optInt("norepeat", 0);
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("reg");
        if (jSONArrayOptJSONArray == null) {
            this.f48026h = new String[0];
            this.f48027i = new String[0];
            return;
        }
        this.f48026h = new String[jSONArrayOptJSONArray.length()];
        this.f48027i = new String[jSONArrayOptJSONArray.length()];
        for (int i2 = 0; i2 < jSONArrayOptJSONArray.length(); i2++) {
            JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i2);
            if (jSONObjectOptJSONObject != null) {
                this.f48026h[i2] = jSONObjectOptJSONObject.optString("token", "");
                this.f48027i[i2] = jSONObjectOptJSONObject.optString("value", "");
            }
        }
    }

    @Override // sg.bigo.ads.api.core.c.f
    public final JSONObject a() {
        return this.f48022a;
    }
}
