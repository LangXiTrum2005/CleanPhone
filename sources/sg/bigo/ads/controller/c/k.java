package sg.bigo.ads.controller.c;

import android.text.TextUtils;
import com.p004ironsource.d9;
import java.util.LinkedHashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public final class k implements sg.bigo.ads.api.core.c.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f47984a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f47985b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f47986c;
    private final JSONArray d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f47987e;
    private final int f;
    private final String g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f47988h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final String f47989i;
    private final Map<String, String> j = new LinkedHashMap();
    private final String k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final int f47990l;

    public k(JSONObject jSONObject) {
        this.f47984a = jSONObject.optString("land_url", "");
        this.f47985b = jSONObject.optString("deeplink_url", "");
        this.f47986c = jSONObject.optInt("web_ad_model", 0);
        this.f47987e = jSONObject.optString("return_tracker_url", "");
        this.f = jSONObject.optInt("land_preload_type", 0);
        this.g = jSONObject.optString("click_open_pkg", "");
        this.f47988h = jSONObject.optInt("probe_interval", 0);
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("pixel");
        if (jSONObjectOptJSONObject != null) {
            this.f47989i = jSONObjectOptJSONObject.optString("host", "");
            String strOptString = jSONObjectOptJSONObject.optString("value", "");
            if (!sg.bigo.ads.common.utils.q.a((CharSequence) strOptString)) {
                b(strOptString);
            }
        } else {
            this.f47989i = "";
        }
        this.k = jSONObject.optString("pre_landing_url", "");
        this.f47990l = jSONObject.optInt("pre_landing_scene", 0);
        this.d = jSONObject.optJSONArray("webview_bundle");
    }

    @Override // sg.bigo.ads.api.core.c.b
    public final String a() {
        return this.f47984a;
    }

    @Override // sg.bigo.ads.api.core.c.b
    public final String b() {
        return this.f47985b;
    }

    @Override // sg.bigo.ads.api.core.c.b
    public final int c() {
        return this.f47986c;
    }

    @Override // sg.bigo.ads.api.core.c.b
    public final JSONArray d() {
        return this.d;
    }

    @Override // sg.bigo.ads.api.core.c.b
    public final String e() {
        return this.f47987e;
    }

    @Override // sg.bigo.ads.api.core.c.b
    public final int f() {
        return this.f;
    }

    @Override // sg.bigo.ads.api.core.c.b
    public final String g() {
        return this.g;
    }

    @Override // sg.bigo.ads.api.core.c.b
    public final String h() {
        return this.f47989i;
    }

    @Override // sg.bigo.ads.api.core.c.b
    public final Map<String, String> i() {
        return this.j;
    }

    @Override // sg.bigo.ads.api.core.c.b
    public final String j() {
        return this.k;
    }

    @Override // sg.bigo.ads.api.core.c.b
    public final int k() {
        return this.f47990l;
    }

    private void b(String str) {
        this.j.clear();
        if (TextUtils.isEmpty(str)) {
            return;
        }
        for (String strD : str.split(d9.i.f24749c)) {
            if (strD.indexOf(d9.i.f24747b) >= 0) {
                String strSubstring = strD.substring(0, strD.indexOf(d9.i.f24747b));
                if (!TextUtils.isEmpty(strSubstring)) {
                    String str2 = this.j.get(strSubstring);
                    if (sg.bigo.ads.common.utils.q.b((CharSequence) str2)) {
                        strD = android.support.v4.media.a.D(str2, d9.i.f24749c, strD);
                    }
                    this.j.put(strSubstring, strD);
                }
            }
        }
    }

    @Override // sg.bigo.ads.api.core.c.b
    public final void a(String str) {
        this.f47984a = str;
    }
}
