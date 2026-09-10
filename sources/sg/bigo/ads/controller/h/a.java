package sg.bigo.ads.controller.h;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import sg.bigo.ads.common.utils.r;

/* JADX INFO: loaded from: classes7.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f48165a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f48166b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f48167c;
    public Map<String, Object> d;

    public a(String str) {
        a(str);
    }

    private void a(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.f48167c = jSONObject.optString("data");
            this.f48165a = jSONObject.optInt("code");
            this.f48166b = jSONObject.optString("msg");
            r.a(jSONObject.optInt("timestamp", 0));
            this.d = new HashMap();
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                if (!TextUtils.equals("data", next) && !TextUtils.equals("code", next) && !TextUtils.equals("msg", next)) {
                    this.d.put(next, jSONObject.opt(next));
                }
            }
        } catch (JSONException unused) {
            this.f48167c = "";
            this.f48165a = 1005;
            this.f48166b = "Invalid response.";
        }
    }

    public final boolean a() {
        return this.f48165a == 1;
    }
}
