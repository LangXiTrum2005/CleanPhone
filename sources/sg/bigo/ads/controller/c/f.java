package sg.bigo.ads.controller.c;

import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public final class f implements sg.bigo.ads.api.core.c.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f47970a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f47971b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List<Object> f47972c = new ArrayList();

    public f(JSONObject jSONObject) {
        this.f47970a = jSONObject.optInt("click_mode", 2);
        this.f47971b = jSONObject.optInt("wrong_click_time", 500);
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("reconfirm_click_region");
        if (jSONArrayOptJSONArray != null) {
            for (int i2 = 0; i2 < jSONArrayOptJSONArray.length(); i2++) {
                JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i2);
                if (jSONObjectOptJSONObject != null) {
                    this.f47972c.add(new g(jSONObjectOptJSONObject));
                }
            }
        }
    }

    @Override // sg.bigo.ads.api.core.c.a
    public final int a() {
        return this.f47970a;
    }

    @Override // sg.bigo.ads.api.core.c.a
    public final int b() {
        return this.f47971b;
    }
}
