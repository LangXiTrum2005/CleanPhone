package ads_mobile_sdk;

import android.net.Uri;
import android.webkit.WebView;
import http.competently;
import http.kowloon;
import org.json.JSONException;
import org.json.JSONObject;
import saneness.estimative;
import saneness.glassmaker;

/* JADX INFO: loaded from: classes.dex */
public final class b91 implements kowloon.saneness {
    public final /* synthetic */ d91 a;

    public b91(d91 d91Var) {
        this.a = d91Var;
    }

    @Override // http.kowloon.saneness
    public final void onPostMessage(WebView webView, competently competentlyVar, Uri uri, boolean z, http.attabal attabalVar) {
        try {
            JSONObject jSONObject = new JSONObject(competentlyVar.saneness());
            String string = jSONObject.getString("method");
            String string2 = jSONObject.getJSONObject("data").getString("adSessionId");
            if (string.equals("startSession")) {
                this.a.a(string2);
                return;
            }
            if (string.equals("finishSession")) {
                d91 d91Var = this.a;
                glassmaker glassmakerVar = (glassmaker) d91Var.e.get(string2);
                if (glassmakerVar != null) {
                    glassmakerVar.a();
                    d91Var.e.remove(string2);
                }
            }
        } catch (JSONException e) {
            estimative.attabal("Error parsing JS message in JavaScriptSessionService.", e);
        }
    }
}
