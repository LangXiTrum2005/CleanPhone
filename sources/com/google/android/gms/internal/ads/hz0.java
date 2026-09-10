package com.google.android.gms.internal.ads;

import android.content.res.Resources;
import android.graphics.Point;
import android.view.WindowManager;
import com.ironsource.X3;
import com.unity3d.services.UnityAdsConstants;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public abstract class hz0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static WindowManager f15437a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String[] f15438b = {"x", "y", "width", "height"};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static float f15439c = Resources.getSystem().getDisplayMetrics().density;

    public static JSONObject a(int i10, int i11, int i12, int i13) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("x", i10 / f15439c);
            jSONObject.put("y", i11 / f15439c);
            jSONObject.put("width", i12 / f15439c);
            jSONObject.put("height", i13 / f15439c);
            return jSONObject;
        } catch (JSONException e10) {
            rb0.k("Error with creating viewStateObject", e10);
            return jSONObject;
        }
    }

    public static void b(JSONObject jSONObject, String str, Object obj) {
        try {
            jSONObject.put(str, obj);
        } catch (NullPointerException | JSONException e10) {
            StringBuilder sb2 = new StringBuilder(str.length() + 47);
            sb2.append("JSONException during JSONObject.put for name [");
            sb2.append(str);
            sb2.append(X3.j.f27836e);
            rb0.k(sb2.toString(), e10);
        }
    }

    public static void c(JSONObject jSONObject, JSONObject jSONObject2) {
        try {
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("childViews");
            if (jSONArrayOptJSONArray == null) {
                jSONArrayOptJSONArray = new JSONArray();
                jSONObject.put("childViews", jSONArrayOptJSONArray);
            }
            jSONArrayOptJSONArray.put(jSONObject2);
        } catch (JSONException e10) {
            e10.printStackTrace();
        }
    }

    public static void d(JSONObject jSONObject) {
        float f10;
        float f11;
        if (f15437a != null) {
            Point point = new Point(0, 0);
            f15437a.getDefaultDisplay().getRealSize(point);
            float f12 = point.x;
            float f13 = f15439c;
            f10 = f12 / f13;
            f11 = point.y / f13;
        } else {
            f10 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            f11 = 0.0f;
        }
        try {
            jSONObject.put("width", f10);
            jSONObject.put("height", f11);
        } catch (JSONException e10) {
            e10.printStackTrace();
        }
    }

    /* JADX WARN: Code duplicated, block: B:51:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:53:0x00d6 A[LOOP:1: B:49:0x00c2->B:53:0x00d6, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:60:0x00db A[SYNTHETIC] */
    public static boolean e(JSONObject jSONObject, JSONObject jSONObject2) {
        JSONArray jSONArrayOptJSONArray;
        JSONArray jSONArrayOptJSONArray2;
        int i10;
        if (jSONObject == null && jSONObject2 == null) {
            return true;
        }
        if (jSONObject != null && jSONObject2 != null) {
            for (int i11 = 0; i11 < 4; i11++) {
                String str = f15438b[i11];
                if (jSONObject.optDouble(str) == jSONObject2.optDouble(str)) {
                }
            }
            if (jSONObject.optString("adSessionId", "").equals(jSONObject2.optString("adSessionId", "")) && Boolean.valueOf(jSONObject.optBoolean("noOutputDevice")).equals(Boolean.valueOf(jSONObject2.optBoolean("noOutputDevice"))) && Boolean.valueOf(jSONObject.optBoolean("hasWindowFocus")).equals(Boolean.valueOf(jSONObject2.optBoolean("hasWindowFocus")))) {
                JSONArray jSONArrayOptJSONArray3 = jSONObject.optJSONArray("isFriendlyObstructionFor");
                JSONArray jSONArrayOptJSONArray4 = jSONObject2.optJSONArray("isFriendlyObstructionFor");
                if (jSONArrayOptJSONArray3 == null && jSONArrayOptJSONArray4 == null) {
                    jSONArrayOptJSONArray = jSONObject.optJSONArray("childViews");
                    jSONArrayOptJSONArray2 = jSONObject2.optJSONArray("childViews");
                    if (jSONArrayOptJSONArray != null) {
                    }
                    if (jSONArrayOptJSONArray != null) {
                        for (i10 = 0; i10 < jSONArrayOptJSONArray.length(); i10++) {
                            if (e(jSONArrayOptJSONArray.optJSONObject(i10), jSONArrayOptJSONArray2.optJSONObject(i10))) {
                            }
                        }
                        return true;
                    }
                    while (i10 < jSONArrayOptJSONArray.length()) {
                        if (e(jSONArrayOptJSONArray.optJSONObject(i10), jSONArrayOptJSONArray2.optJSONObject(i10))) {
                        }
                    }
                    return true;
                }
                if ((jSONArrayOptJSONArray3 == null && jSONArrayOptJSONArray4 == null) || (jSONArrayOptJSONArray3 != null && jSONArrayOptJSONArray4 != null && jSONArrayOptJSONArray3.length() == jSONArrayOptJSONArray4.length())) {
                    for (int i12 = 0; i12 < jSONArrayOptJSONArray3.length(); i12++) {
                        if (jSONArrayOptJSONArray3.optString(i12, "").equals(jSONArrayOptJSONArray4.optString(i12, ""))) {
                        }
                    }
                    jSONArrayOptJSONArray = jSONObject.optJSONArray("childViews");
                    jSONArrayOptJSONArray2 = jSONObject2.optJSONArray("childViews");
                    if (jSONArrayOptJSONArray != null && jSONArrayOptJSONArray2 == null) {
                        return true;
                    }
                    if ((jSONArrayOptJSONArray != null && jSONArrayOptJSONArray2 == null) || (jSONArrayOptJSONArray != null && jSONArrayOptJSONArray2 != null && jSONArrayOptJSONArray.length() == jSONArrayOptJSONArray2.length())) {
                        while (i10 < jSONArrayOptJSONArray.length()) {
                            if (e(jSONArrayOptJSONArray.optJSONObject(i10), jSONArrayOptJSONArray2.optJSONObject(i10))) {
                            }
                        }
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
