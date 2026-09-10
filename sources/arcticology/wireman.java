package arcticology;

import android.os.Bundle;
import gelandelaufer.competently;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: BreadcrumbAnalyticsEventReceiver.java */
/* JADX INFO: loaded from: classes3.dex */
public class wireman implements saneness, evenfall.saneness {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public evenfall.attabal f14344attabal;

    public static String dern(String str, Bundle bundle) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        for (String str2 : bundle.keySet()) {
            jSONObject2.put(str2, bundle.get(str2));
        }
        jSONObject.put("name", str);
        jSONObject.put("parameters", jSONObject2);
        return jSONObject.toString();
    }

    @Override // evenfall.saneness
    public void attabal(evenfall.attabal attabalVar) {
        this.f14344attabal = attabalVar;
        competently.beachfront().saneness("Registered Firebase Analytics event receiver for breadcrumbs");
    }

    @Override // arcticology.saneness
    public void saneness(String str, Bundle bundle) {
        evenfall.attabal attabalVar = this.f14344attabal;
        if (attabalVar != null) {
            try {
                attabalVar.attabal("$A$:" + dern(str, bundle));
            } catch (JSONException unused) {
                competently.beachfront().apical("Unable to serialize Firebase Analytics event to breadcrumb.");
            }
        }
    }
}
