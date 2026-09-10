package reeve;

import org.json.JSONException;
import org.json.JSONObject;
import umbriferous.stratoscope;

/* JADX INFO: compiled from: SettingsJsonParser.java */
/* JADX INFO: loaded from: classes3.dex */
public class beachfront {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final stratoscope f36165attabal;

    public beachfront(stratoscope stratoscopeVar) {
        this.f36165attabal = stratoscopeVar;
    }

    public static competently attabal(int i) {
        if (i == 3) {
            return new apical();
        }
        gelandelaufer.competently.beachfront().wireman("Could not determine SettingsJsonTransform for settings version " + i + ". Using default settings values.");
        return new saneness();
    }

    public wireman saneness(JSONObject jSONObject) throws JSONException {
        return attabal(jSONObject.getInt("settings_version")).attabal(this.f36165attabal, jSONObject);
    }
}
