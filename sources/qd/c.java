package qd;

import com.google.android.gms.internal.ads.k42;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Date f48944h = new Date(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final JSONObject f48945a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final JSONObject f48946b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Date f48947c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final JSONArray f48948d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final JSONObject f48949e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f48950f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final JSONArray f48951g;

    public c(JSONObject jSONObject, Date date, JSONArray jSONArray, JSONObject jSONObject2, long j10, JSONArray jSONArray2) throws JSONException {
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put("configs_key", jSONObject);
        jSONObject3.put("fetch_time_key", date.getTime());
        jSONObject3.put("abt_experiments_key", jSONArray);
        jSONObject3.put("personalization_metadata_key", jSONObject2);
        jSONObject3.put("template_version_number_key", j10);
        jSONObject3.put("rollout_metadata_key", jSONArray2);
        this.f48946b = jSONObject;
        this.f48947c = date;
        this.f48948d = jSONArray;
        this.f48949e = jSONObject2;
        this.f48950f = j10;
        this.f48951g = jSONArray2;
        this.f48945a = jSONObject3;
    }

    public static c a(JSONObject jSONObject) throws JSONException {
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("personalization_metadata_key");
        if (jSONObjectOptJSONObject == null) {
            jSONObjectOptJSONObject = new JSONObject();
        }
        JSONObject jSONObject2 = jSONObjectOptJSONObject;
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("rollout_metadata_key");
        if (jSONArrayOptJSONArray == null) {
            jSONArrayOptJSONArray = new JSONArray();
        }
        return new c(jSONObject.getJSONObject("configs_key"), new Date(jSONObject.getLong("fetch_time_key")), jSONObject.getJSONArray("abt_experiments_key"), jSONObject2, jSONObject.optLong("template_version_number_key"), jSONArrayOptJSONArray);
    }

    public static k42 d() {
        k42 k42Var = new k42();
        k42Var.f16312b = new JSONObject();
        k42Var.f16313c = f48944h;
        k42Var.f16314d = new JSONArray();
        k42Var.f16315e = new JSONObject();
        k42Var.f16311a = 0L;
        k42Var.f16316f = new JSONArray();
        return k42Var;
    }

    public final HashMap b() throws JSONException {
        HashMap map = new HashMap();
        int i10 = 0;
        while (true) {
            JSONArray jSONArray = this.f48948d;
            if (i10 >= jSONArray.length()) {
                return map;
            }
            JSONObject jSONObject = jSONArray.getJSONObject(i10);
            if (jSONObject.has("affectedParameterKeys") && !jSONObject.getString("experimentId").startsWith("rollout")) {
                JSONArray jSONArray2 = jSONObject.getJSONArray("affectedParameterKeys");
                for (int i11 = 0; i11 < jSONArray2.length(); i11++) {
                    map.put(jSONArray2.getString(i11), jSONObject);
                }
            }
            i10++;
        }
    }

    public final HashMap c() throws JSONException {
        HashMap map = new HashMap();
        int i10 = 0;
        while (true) {
            JSONArray jSONArray = this.f48951g;
            if (i10 >= jSONArray.length()) {
                return map;
            }
            JSONObject jSONObject = jSONArray.getJSONObject(i10);
            String string = jSONObject.getString("rolloutId");
            String string2 = jSONObject.getString("variantId");
            JSONArray jSONArray2 = jSONObject.getJSONArray("affectedParameterKeys");
            for (int i11 = 0; i11 < jSONArray2.length(); i11++) {
                String string3 = jSONArray2.getString(i11);
                if (!map.containsKey(string3)) {
                    map.put(string3, new HashMap());
                }
                Map map2 = (Map) map.get(string3);
                if (map2 != null) {
                    map2.put(string, string2);
                }
            }
            i10++;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof c) {
            return this.f48945a.toString().equals(((c) obj).f48945a.toString());
        }
        return false;
    }

    public final int hashCode() {
        return this.f48945a.hashCode();
    }

    public final String toString() {
        return this.f48945a.toString();
    }
}
