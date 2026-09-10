package ads_mobile_sdk;

import android.content.res.Resources;
import android.graphics.Point;
import android.view.WindowManager;
import com.unity3d.services.UnityAdsConstants;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import saneness.estimative;

/* JADX INFO: loaded from: classes.dex */
public abstract class nw1 {
    public static WindowManager a;
    public static final String[] b = {"x", "y", "width", "height"};
    public static float c = Resources.getSystem().getDisplayMetrics().density;

    public static void a(JSONObject jSONObject, JSONObject jSONObject2) {
        try {
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("childViews");
            if (jSONArrayOptJSONArray == null) {
                jSONArrayOptJSONArray = new JSONArray();
                jSONObject.put("childViews", jSONArrayOptJSONArray);
            }
            jSONArrayOptJSONArray.put(jSONObject2);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    public static boolean b(JSONObject jSONObject, JSONObject jSONObject2) {
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("childViews");
        JSONArray jSONArrayOptJSONArray2 = jSONObject2.optJSONArray("childViews");
        if (jSONArrayOptJSONArray == null && jSONArrayOptJSONArray2 == null) {
            return true;
        }
        if (!(jSONArrayOptJSONArray == null && jSONArrayOptJSONArray2 == null) && (jSONArrayOptJSONArray == null || jSONArrayOptJSONArray2 == null || jSONArrayOptJSONArray.length() != jSONArrayOptJSONArray2.length())) {
            return false;
        }
        for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
            if (!c(jSONArrayOptJSONArray.optJSONObject(i), jSONArrayOptJSONArray2.optJSONObject(i))) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:44:0x00aa A[RETURN] */
    public static boolean c(JSONObject jSONObject, JSONObject jSONObject2) {
        if (jSONObject == null && jSONObject2 == null) {
            return true;
        }
        if (jSONObject != null && jSONObject2 != null) {
            String[] strArr = b;
            for (int i = 0; i < 4; i++) {
                String str = strArr[i];
                if (jSONObject.optDouble(str) == jSONObject2.optDouble(str)) {
                }
            }
            if (jSONObject.optString("adSessionId", "").equals(jSONObject2.optString("adSessionId", "")) && Boolean.valueOf(jSONObject.optBoolean("noOutputDevice")).equals(Boolean.valueOf(jSONObject2.optBoolean("noOutputDevice"))) && Boolean.valueOf(jSONObject.optBoolean("hasWindowFocus")).equals(Boolean.valueOf(jSONObject2.optBoolean("hasWindowFocus")))) {
                JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("isFriendlyObstructionFor");
                JSONArray jSONArrayOptJSONArray2 = jSONObject2.optJSONArray("isFriendlyObstructionFor");
                if (jSONArrayOptJSONArray == null && jSONArrayOptJSONArray2 == null) {
                    if (b(jSONObject, jSONObject2)) {
                        return true;
                    }
                } else if ((jSONArrayOptJSONArray == null && jSONArrayOptJSONArray2 == null) || (jSONArrayOptJSONArray != null && jSONArrayOptJSONArray2 != null && jSONArrayOptJSONArray.length() == jSONArrayOptJSONArray2.length())) {
                    for (int i2 = 0; i2 < jSONArrayOptJSONArray.length(); i2++) {
                        if (jSONArrayOptJSONArray.optString(i2, "").equals(jSONArrayOptJSONArray2.optString(i2, ""))) {
                        }
                    }
                    if (b(jSONObject, jSONObject2)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static void a(JSONObject jSONObject, String str, Object obj) {
        try {
            jSONObject.put(str, obj);
        } catch (NullPointerException | JSONException unused) {
        }
    }

    public static void a(JSONObject jSONObject) {
        float f;
        float f2;
        if (a != null) {
            Point point = new Point(0, 0);
            a.getDefaultDisplay().getRealSize(point);
            float f3 = point.x;
            float f4 = c;
            f = f3 / f4;
            f2 = point.y / f4;
        } else {
            f = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            f2 = 0.0f;
        }
        try {
            jSONObject.put("width", f);
            jSONObject.put("height", f2);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    public static JSONObject a(int i, int i2, int i3, int i4) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("x", i / c);
            jSONObject.put("y", i2 / c);
            jSONObject.put("width", i3 / c);
            jSONObject.put("height", i4 / c);
            return jSONObject;
        } catch (JSONException e) {
            estimative.attabal("Error with creating viewStateObject", e);
            return jSONObject;
        }
    }
}
