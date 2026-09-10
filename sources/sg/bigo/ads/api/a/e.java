package sg.bigo.ads.api.a;

import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public interface e {

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f46978a = "";

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f46979b = "";

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f46980c = "";
        public String d = "";
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f46981a = "";

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f46982b = "";
    }

    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f46983a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f46984b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String[] f46985c;
        public String d;

        public c(JSONObject jSONObject) {
            this.f46983a = "";
            this.f46984b = 0;
            this.f46985c = null;
            this.d = "";
            this.f46983a = jSONObject.optString("title", "");
            this.f46984b = jSONObject.optInt("type", 0);
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("options");
            if (jSONArrayOptJSONArray != null && jSONArrayOptJSONArray.length() > 0) {
                this.f46985c = new String[jSONArrayOptJSONArray.length()];
                for (int i2 = 0; i2 < jSONArrayOptJSONArray.length(); i2++) {
                    this.f46985c[i2] = jSONArrayOptJSONArray.optString(i2);
                }
            }
            this.d = jSONObject.optString("id", "");
        }
    }

    String a();

    String b();

    long c();

    int d();

    String e();

    int f();

    String g();

    String h();

    f[] i();

    f j();

    f k();

    b l();

    c[] m();

    a n();
}
