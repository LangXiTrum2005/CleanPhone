package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.util.Date;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Uh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2803Uh {
    public static final Date g = new Date(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final JSONObject f3834a;
    public final JSONObject b;
    public final Date c;
    public final JSONArray d;
    public final JSONObject e;
    public final long f;

    public C2803Uh(JSONObject jSONObject, Date date, JSONArray jSONArray, JSONObject jSONObject2, long j) throws JSONException {
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put("configs_key", jSONObject);
        jSONObject3.put("fetch_time_key", date.getTime());
        jSONObject3.put("abt_experiments_key", jSONArray);
        jSONObject3.put("personalization_metadata_key", jSONObject2);
        jSONObject3.put("template_version_number_key", j);
        this.b = jSONObject;
        this.c = date;
        this.d = jSONArray;
        this.e = jSONObject2;
        this.f = j;
        this.f3834a = jSONObject3;
    }

    public static C2803Uh a(JSONObject jSONObject) throws JSONException {
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("personalization_metadata_key");
        if (jSONObjectOptJSONObject == null) {
            jSONObjectOptJSONObject = new JSONObject();
        }
        return new C2803Uh(jSONObject.getJSONObject("configs_key"), new Date(jSONObject.getLong("fetch_time_key")), jSONObject.getJSONArray("abt_experiments_key"), jSONObjectOptJSONObject, jSONObject.optLong("template_version_number_key"));
    }

    public static C3647hp b() {
        C3647hp c3647hp = new C3647hp();
        c3647hp.c = new JSONObject();
        c3647hp.d = g;
        c3647hp.e = new JSONArray();
        c3647hp.b = new JSONObject();
        c3647hp.f4473a = 0L;
        return c3647hp;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C2803Uh) {
            return this.f3834a.toString().equals(((C2803Uh) obj).f3834a.toString());
        }
        return false;
    }

    public final int hashCode() {
        return this.f3834a.hashCode();
    }

    public final String toString() {
        return this.f3834a.toString();
    }
}
