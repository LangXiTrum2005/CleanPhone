package sg.bigo.ads.ad.banner;

import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import sg.bigo.ads.api.AdSize;

/* JADX INFO: loaded from: classes7.dex */
public final class a {
    public static JSONArray a(List<AdSize> list) {
        JSONArray jSONArray = new JSONArray();
        for (AdSize adSize : list) {
            if (adSize != null) {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("w", adSize.getWidth());
                    jSONObject.put(com.smartdigimkt.m3.h.f36614b, adSize.getHeight());
                    jSONObject.put("t", AdSize.ADAPTIVE.equals(adSize.f46958a) ? 1 : 0);
                } catch (JSONException unused) {
                }
                jSONArray.put(jSONObject);
            }
        }
        return jSONArray;
    }
}
