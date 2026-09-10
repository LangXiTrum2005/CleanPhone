package sg.bigo.ads.core.d.a;

import java.util.HashMap;
import org.json.JSONArray;
import org.json.JSONObject;
import sg.bigo.ads.common.utils.q;

/* JADX INFO: loaded from: classes7.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f48346a = 10;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f48347b = 900000;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashMap<String, C0867a> f48348c;

    /* JADX INFO: renamed from: sg.bigo.ads.core.d.a.a$a, reason: collision with other inner class name */
    public static class C0867a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        String f48349a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        boolean f48350b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f48351c;
        public int d;

        public static C0867a a(String str) {
            C0867a c0867a = new C0867a();
            c0867a.f48349a = str;
            c0867a.f48350b = true;
            c0867a.f48351c = true;
            c0867a.d = 86400000;
            return c0867a;
        }

        public final void a(JSONObject jSONObject) {
            if (jSONObject == null) {
                sg.bigo.ads.common.t.a.a(0, "Stats", "eventConfig is null.");
                return;
            }
            this.f48349a = jSONObject.optString("event_id");
            this.f48350b = jSONObject.optInt("status") == 1;
            this.f48351c = jSONObject.optInt("delay") == 1;
            int iOptInt = jSONObject.optInt("expired") * 1000;
            this.d = iOptInt;
            if (iOptInt == 0) {
                this.d = 86400000;
            }
        }
    }

    public a() {
        HashMap<String, C0867a> map = new HashMap<>();
        this.f48348c = map;
        b();
        map.put("06002002", C0867a.a("06002002"));
        map.put("06002007", C0867a.a("06002007"));
    }

    private void b() {
        this.f48346a = 10;
        this.f48347b = 900000;
        this.f48348c.clear();
    }

    public final int a() {
        return Math.round(this.f48346a * 0.8f);
    }

    public final void a(JSONObject jSONObject) {
        if (jSONObject == null) {
            b();
            return;
        }
        this.f48346a = jSONObject.optInt("delay_num", 10);
        int iOptInt = jSONObject.optInt("delay_interval") * 1000;
        this.f48347b = iOptInt;
        if (iOptInt == 0) {
            this.f48347b = 900000;
        }
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("event_config");
        if (jSONArrayOptJSONArray == null || jSONArrayOptJSONArray.length() <= 0) {
            return;
        }
        for (int i2 = 0; i2 < jSONArrayOptJSONArray.length(); i2++) {
            C0867a c0867a = new C0867a();
            c0867a.a(jSONArrayOptJSONArray.optJSONObject(i2));
            if (q.b((CharSequence) c0867a.f48349a)) {
                this.f48348c.put(c0867a.f48349a, c0867a);
            }
        }
    }

    public final boolean a(String str) {
        C0867a c0867a = this.f48348c.get(str);
        if (c0867a == null) {
            return false;
        }
        return c0867a.f48350b;
    }
}
