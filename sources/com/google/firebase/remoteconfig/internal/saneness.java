package com.google.firebase.remoteconfig.internal;

import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: ConfigContainer.java */
/* JADX INFO: loaded from: classes3.dex */
public class saneness {

    /* JADX INFO: renamed from: impromptu, reason: collision with root package name */
    public static final Date f22842impromptu = new Date(0);

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public JSONObject f22843attabal;

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
    public long f22844beachfront;

    /* JADX INFO: renamed from: competently, reason: collision with root package name */
    public JSONArray f22845competently;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public Date f22846dern;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public JSONObject f22847marial;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public JSONObject f22848saneness;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public JSONArray f22849wireman;

    /* JADX INFO: renamed from: com.google.firebase.remoteconfig.internal.saneness$saneness, reason: collision with other inner class name */
    /* JADX INFO: compiled from: ConfigContainer.java */
    public static class C0329saneness {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public JSONObject f22850attabal;

        /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
        public JSONArray f22851beachfront;

        /* JADX INFO: renamed from: dern, reason: collision with root package name */
        public JSONArray f22852dern;

        /* JADX INFO: renamed from: marial, reason: collision with root package name */
        public long f22853marial;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public Date f22854saneness;

        /* JADX INFO: renamed from: wireman, reason: collision with root package name */
        public JSONObject f22855wireman;

        public saneness attabal() throws JSONException {
            return new saneness(this.f22850attabal, this.f22854saneness, this.f22852dern, this.f22855wireman, this.f22853marial, this.f22851beachfront);
        }

        public C0329saneness beachfront(JSONArray jSONArray) {
            try {
                this.f22851beachfront = new JSONArray(jSONArray.toString());
            } catch (JSONException unused) {
            }
            return this;
        }

        public C0329saneness competently(long j) {
            this.f22853marial = j;
            return this;
        }

        public C0329saneness dern(JSONArray jSONArray) {
            try {
                this.f22852dern = new JSONArray(jSONArray.toString());
            } catch (JSONException unused) {
            }
            return this;
        }

        public C0329saneness marial(JSONObject jSONObject) {
            try {
                this.f22855wireman = new JSONObject(jSONObject.toString());
            } catch (JSONException unused) {
            }
            return this;
        }

        public C0329saneness saneness(JSONObject jSONObject) {
            try {
                this.f22850attabal = new JSONObject(jSONObject.toString());
            } catch (JSONException unused) {
            }
            return this;
        }

        public C0329saneness wireman(Date date) {
            this.f22854saneness = date;
            return this;
        }

        public C0329saneness() {
            this.f22850attabal = new JSONObject();
            this.f22854saneness = saneness.f22842impromptu;
            this.f22852dern = new JSONArray();
            this.f22855wireman = new JSONObject();
            this.f22853marial = 0L;
            this.f22851beachfront = new JSONArray();
        }
    }

    public static C0329saneness apical() {
        return new C0329saneness();
    }

    public static saneness saneness(JSONObject jSONObject) throws JSONException {
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("personalization_metadata_key");
        if (jSONObjectOptJSONObject == null) {
            jSONObjectOptJSONObject = new JSONObject();
        }
        JSONObject jSONObject2 = jSONObjectOptJSONObject;
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("rollout_metadata_key");
        if (jSONArrayOptJSONArray == null) {
            jSONArrayOptJSONArray = new JSONArray();
        }
        return new saneness(jSONObject.getJSONObject("configs_key"), new Date(jSONObject.getLong("fetch_time_key")), jSONObject.getJSONArray("abt_experiments_key"), jSONObject2, jSONObject.optLong("template_version_number_key"), jSONArrayOptJSONArray);
    }

    public static saneness wireman(JSONObject jSONObject) throws JSONException {
        return saneness(new JSONObject(jSONObject.toString()));
    }

    public JSONObject beachfront() {
        return this.f22848saneness;
    }

    public Date competently() {
        return this.f22846dern;
    }

    public long cutely() {
        return this.f22844beachfront;
    }

    public final Map<String, Map<String, String>> dern() throws JSONException {
        HashMap map = new HashMap();
        for (int i = 0; i < taiyuan().length(); i++) {
            JSONObject jSONObject = taiyuan().getJSONObject(i);
            String string = jSONObject.getString("rolloutId");
            String string2 = jSONObject.getString("variantId");
            JSONArray jSONArray = jSONObject.getJSONArray("affectedParameterKeys");
            for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                String string3 = jSONArray.getString(i2);
                if (!map.containsKey(string3)) {
                    map.put(string3, new HashMap());
                }
                Map map2 = (Map) map.get(string3);
                if (map2 != null) {
                    map2.put(string, string2);
                }
            }
        }
        return map;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof saneness) {
            return this.f22843attabal.toString().equals(((saneness) obj).toString());
        }
        return false;
    }

    public int hashCode() {
        return this.f22843attabal.hashCode();
    }

    public JSONObject impromptu() {
        return this.f22847marial;
    }

    public Set<String> marial(saneness sanenessVar) throws JSONException {
        JSONObject jSONObjectBeachfront = wireman(sanenessVar.f22843attabal).beachfront();
        Map<String, Map<String, String>> mapDern = dern();
        Map<String, Map<String, String>> mapDern2 = sanenessVar.dern();
        HashSet hashSet = new HashSet();
        Iterator<String> itKeys = beachfront().keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            if (!sanenessVar.beachfront().has(next)) {
                hashSet.add(next);
            } else if (!beachfront().get(next).equals(sanenessVar.beachfront().get(next))) {
                hashSet.add(next);
            } else if ((impromptu().has(next) && !sanenessVar.impromptu().has(next)) || (!impromptu().has(next) && sanenessVar.impromptu().has(next))) {
                hashSet.add(next);
            } else if (impromptu().has(next) && sanenessVar.impromptu().has(next) && !impromptu().getJSONObject(next).toString().equals(sanenessVar.impromptu().getJSONObject(next).toString())) {
                hashSet.add(next);
            } else if (mapDern.containsKey(next) != mapDern2.containsKey(next)) {
                hashSet.add(next);
            } else if (mapDern.containsKey(next) && mapDern2.containsKey(next) && !mapDern.get(next).equals(mapDern2.get(next))) {
                hashSet.add(next);
            } else {
                jSONObjectBeachfront.remove(next);
            }
        }
        Iterator<String> itKeys2 = jSONObjectBeachfront.keys();
        while (itKeys2.hasNext()) {
            hashSet.add(itKeys2.next());
        }
        return hashSet;
    }

    public JSONArray taiyuan() {
        return this.f22845competently;
    }

    public String toString() {
        return this.f22843attabal.toString();
    }

    public saneness(JSONObject jSONObject, Date date, JSONArray jSONArray, JSONObject jSONObject2, long j, JSONArray jSONArray2) throws JSONException {
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put("configs_key", jSONObject);
        jSONObject3.put("fetch_time_key", date.getTime());
        jSONObject3.put("abt_experiments_key", jSONArray);
        jSONObject3.put("personalization_metadata_key", jSONObject2);
        jSONObject3.put("template_version_number_key", j);
        jSONObject3.put("rollout_metadata_key", jSONArray2);
        this.f22848saneness = jSONObject;
        this.f22846dern = date;
        this.f22849wireman = jSONArray;
        this.f22847marial = jSONObject2;
        this.f22844beachfront = j;
        this.f22845competently = jSONArray2;
        this.f22843attabal = jSONObject3;
    }
}
