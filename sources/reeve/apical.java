package reeve;

import com.ironsource.X3;
import org.json.JSONException;
import org.json.JSONObject;
import umbriferous.stratoscope;

/* JADX INFO: compiled from: SettingsV3JsonTransform.java */
/* JADX INFO: loaded from: classes3.dex */
public class apical implements competently {
    public static wireman.saneness dern(JSONObject jSONObject) {
        return new wireman.saneness(jSONObject.optInt("max_custom_exception_events", 8), 4);
    }

    public static wireman.attabal saneness(JSONObject jSONObject) {
        return new wireman.attabal(jSONObject.optBoolean("collect_reports", true), jSONObject.optBoolean("collect_anrs", false), jSONObject.optBoolean("collect_build_ids", false));
    }

    public static long wireman(stratoscope stratoscopeVar, long j, JSONObject jSONObject) {
        return jSONObject.has("expires_at") ? jSONObject.optLong("expires_at") : stratoscopeVar.attabal() + (j * 1000);
    }

    @Override // reeve.competently
    public wireman attabal(stratoscope stratoscopeVar, JSONObject jSONObject) throws JSONException {
        int iOptInt = jSONObject.optInt("settings_version", 0);
        int iOptInt2 = jSONObject.optInt("cache_duration", 3600);
        return new wireman(wireman(stratoscopeVar, iOptInt2, jSONObject), jSONObject.has("session") ? dern(jSONObject.getJSONObject("session")) : dern(new JSONObject()), saneness(jSONObject.getJSONObject(X3.a.v)), iOptInt, iOptInt2, jSONObject.optDouble("on_demand_upload_rate_per_minute", 10.0d), jSONObject.optDouble("on_demand_backoff_base", 1.2d), jSONObject.optInt("on_demand_backoff_step_duration_seconds", 60));
    }
}
