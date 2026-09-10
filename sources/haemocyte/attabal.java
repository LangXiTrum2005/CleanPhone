package haemocyte;

import com.google.firebase.remoteconfig.FirebaseRemoteConfigClientException;
import java.util.HashSet;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import snarler.marial;

/* JADX INFO: compiled from: RolloutsStateFactory.java */
/* JADX INFO: loaded from: classes3.dex */
public class attabal {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public marial f27454attabal;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public marial f27455saneness;

    public attabal(marial marialVar, marial marialVar2) {
        this.f27454attabal = marialVar;
        this.f27455saneness = marialVar2;
    }

    public static attabal attabal(marial marialVar, marial marialVar2) {
        return new attabal(marialVar, marialVar2);
    }

    public static String wireman(marial marialVar, String str) {
        com.google.firebase.remoteconfig.internal.saneness sanenessVarMarial = marialVar.marial();
        if (sanenessVarMarial == null) {
            return null;
        }
        try {
            return sanenessVarMarial.beachfront().getString(str);
        } catch (JSONException unused) {
            return null;
        }
    }

    public final String dern(String str) {
        String strWireman = wireman(this.f27454attabal, str);
        if (strWireman != null) {
            return strWireman;
        }
        String strWireman2 = wireman(this.f27455saneness, str);
        return strWireman2 != null ? strWireman2 : "";
    }

    public buttstock.marial saneness(com.google.firebase.remoteconfig.internal.saneness sanenessVar) throws FirebaseRemoteConfigClientException {
        JSONArray jSONArrayTaiyuan = sanenessVar.taiyuan();
        long jCutely = sanenessVar.cutely();
        HashSet hashSet = new HashSet();
        for (int i = 0; i < jSONArrayTaiyuan.length(); i++) {
            try {
                JSONObject jSONObject = jSONArrayTaiyuan.getJSONObject(i);
                String string = jSONObject.getString("rolloutId");
                JSONArray jSONArray = jSONObject.getJSONArray("affectedParameterKeys");
                if (jSONArray.length() > 1) {
                    String.format("Rollout has multiple affected parameter keys.Only the first key will be included in RolloutsState. rolloutId: %s, affectedParameterKeys: %s", string, jSONArray);
                }
                String strOptString = jSONArray.optString(0, "");
                hashSet.add(buttstock.wireman.attabal().wireman(string).beachfront(jSONObject.getString("variantId")).saneness(strOptString).dern(dern(strOptString)).marial(jCutely).attabal());
            } catch (JSONException e) {
                throw new FirebaseRemoteConfigClientException("Exception parsing rollouts metadata to create RolloutsState.", e);
            }
        }
        return buttstock.marial.attabal(hashSet);
    }
}
