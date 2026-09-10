package snarler;

import android.os.Bundle;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: compiled from: Personalization.java */
/* JADX INFO: loaded from: classes3.dex */
public class arytenoidectomy {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final friedmanite.saneness<anthomaniac.attabal> f37643attabal;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final Map<String, String> f37644saneness = Collections.synchronizedMap(new HashMap());

    public arytenoidectomy(friedmanite.saneness<anthomaniac.attabal> sanenessVar) {
        this.f37643attabal = sanenessVar;
    }

    public void attabal(String str, com.google.firebase.remoteconfig.internal.saneness sanenessVar) {
        JSONObject jSONObjectOptJSONObject;
        anthomaniac.attabal attabalVar = this.f37643attabal.get();
        if (attabalVar == null) {
            return;
        }
        JSONObject jSONObjectImpromptu = sanenessVar.impromptu();
        if (jSONObjectImpromptu.length() < 1) {
            return;
        }
        JSONObject jSONObjectBeachfront = sanenessVar.beachfront();
        if (jSONObjectBeachfront.length() >= 1 && (jSONObjectOptJSONObject = jSONObjectImpromptu.optJSONObject(str)) != null) {
            String strOptString = jSONObjectOptJSONObject.optString("choiceId");
            if (strOptString.isEmpty()) {
                return;
            }
            synchronized (this.f37644saneness) {
                try {
                    if (strOptString.equals(this.f37644saneness.get(str))) {
                        return;
                    }
                    this.f37644saneness.put(str, strOptString);
                    Bundle bundle = new Bundle();
                    bundle.putString("arm_key", str);
                    bundle.putString("arm_value", jSONObjectBeachfront.optString(str));
                    bundle.putString("personalization_id", jSONObjectOptJSONObject.optString("personalizationId"));
                    bundle.putInt("arm_index", jSONObjectOptJSONObject.optInt("armIndex", -1));
                    bundle.putString("group", jSONObjectOptJSONObject.optString("group"));
                    attabalVar.attabal("fp", "personalization_assignment", bundle);
                    Bundle bundle2 = new Bundle();
                    bundle2.putString("_fpid", strOptString);
                    attabalVar.attabal("fp", "_fpc", bundle2);
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }
}
