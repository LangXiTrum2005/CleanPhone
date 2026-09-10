package com.google.firebase.remoteconfig.internal;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public class ConfigContainer {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Date f20939h = new Date(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final JSONObject f20940a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final JSONObject f20941b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Date f20942c;
    public final JSONArray d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final JSONObject f20943e;
    public final long f;
    public final JSONArray g;

    public static class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public JSONObject f20944a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Date f20945b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public JSONArray f20946c;
        public JSONObject d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public long f20947e;
        public JSONArray f;
    }

    public ConfigContainer(JSONObject jSONObject, Date date, JSONArray jSONArray, JSONObject jSONObject2, long j, JSONArray jSONArray2) throws JSONException {
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put("configs_key", jSONObject);
        jSONObject3.put("fetch_time_key", date.getTime());
        jSONObject3.put("abt_experiments_key", jSONArray);
        jSONObject3.put("personalization_metadata_key", jSONObject2);
        jSONObject3.put("template_version_number_key", j);
        jSONObject3.put("rollout_metadata_key", jSONArray2);
        this.f20941b = jSONObject;
        this.f20942c = date;
        this.d = jSONArray;
        this.f20943e = jSONObject2;
        this.f = j;
        this.g = jSONArray2;
        this.f20940a = jSONObject3;
    }

    public static ConfigContainer a(JSONObject jSONObject) throws JSONException {
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("personalization_metadata_key");
        if (jSONObjectOptJSONObject == null) {
            jSONObjectOptJSONObject = new JSONObject();
        }
        JSONObject jSONObject2 = jSONObjectOptJSONObject;
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("rollout_metadata_key");
        if (jSONArrayOptJSONArray == null) {
            jSONArrayOptJSONArray = new JSONArray();
        }
        return new ConfigContainer(jSONObject.getJSONObject("configs_key"), new Date(jSONObject.getLong("fetch_time_key")), jSONObject.getJSONArray("abt_experiments_key"), jSONObject2, jSONObject.optLong("template_version_number_key"), jSONArrayOptJSONArray);
    }

    public static Builder c() {
        Builder builder = new Builder();
        builder.f20944a = new JSONObject();
        builder.f20945b = f20939h;
        builder.f20946c = new JSONArray();
        builder.d = new JSONObject();
        builder.f20947e = 0L;
        builder.f = new JSONArray();
        return builder;
    }

    public final HashMap b() throws JSONException {
        HashMap map = new HashMap();
        int i2 = 0;
        while (true) {
            JSONArray jSONArray = this.g;
            if (i2 >= jSONArray.length()) {
                return map;
            }
            JSONObject jSONObject = jSONArray.getJSONObject(i2);
            String string = jSONObject.getString("rolloutId");
            String string2 = jSONObject.getString("variantId");
            JSONArray jSONArray2 = jSONObject.getJSONArray("affectedParameterKeys");
            for (int i3 = 0; i3 < jSONArray2.length(); i3++) {
                String string3 = jSONArray2.getString(i3);
                if (!map.containsKey(string3)) {
                    map.put(string3, new HashMap());
                }
                Map map2 = (Map) map.get(string3);
                if (map2 != null) {
                    map2.put(string, string2);
                }
            }
            i2++;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ConfigContainer) {
            return this.f20940a.toString().equals(((ConfigContainer) obj).f20940a.toString());
        }
        return false;
    }

    public final int hashCode() {
        return this.f20940a.hashCode();
    }

    public final String toString() {
        return this.f20940a.toString();
    }
}
