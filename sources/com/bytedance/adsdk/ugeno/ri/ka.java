package com.bytedance.adsdk.ugeno.ri;

import android.text.TextUtils;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class ka {
    public static float[] ik(String str) {
        float[] fArr = {UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT};
        JSONArray jSONArrayRi = com.bytedance.adsdk.ugeno.xha.lr.ri(str, (JSONArray) null);
        if (jSONArrayRi != null && jSONArrayRi.length() == 2) {
            fArr[0] = (float) jSONArrayRi.optDouble(0);
            fArr[1] = (float) jSONArrayRi.optDouble(1);
        }
        return fArr;
    }

    public static Interpolator lr(String str) {
        switch (str.hashCode()) {
            case -1965072618:
                if (str.equals("ease_in")) {
                    return new AccelerateInterpolator();
                }
                break;
            case -1102672091:
                str.equals("linear");
                break;
            case -787702915:
                if (str.equals("ease_out")) {
                    return new DecelerateInterpolator();
                }
                break;
            case 1065009829:
                if (str.equals("ease_in_out")) {
                    return new AccelerateDecelerateInterpolator();
                }
                break;
        }
        return new LinearInterpolator();
    }

    public static int ri(int i) {
        if (i < 0) {
            return -1;
        }
        if (i == 0) {
            return Integer.MIN_VALUE;
        }
        return i - 1;
    }

    public static List<ik> ri(String str, JSONObject jSONObject) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        try {
            JSONArray jSONArray = new JSONArray(str);
            if (jSONArray.length() <= 0) {
                return null;
            }
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i);
                if (jSONObjectOptJSONObject != null) {
                    arrayList.add(ri(jSONObjectOptJSONObject, jSONObject));
                }
            }
            return arrayList;
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }

    public static ik.ri lr(String str, JSONObject jSONObject) {
        JSONArray jSONArrayRi;
        if (TextUtils.isEmpty(str) || (jSONArrayRi = com.bytedance.adsdk.ugeno.xha.lr.ri(str, (JSONArray) null)) == null || jSONArrayRi.length() != 2) {
            return null;
        }
        ik.ri riVar = new ik.ri();
        riVar.ri = com.bytedance.adsdk.ugeno.ik.lr.ri(jSONArrayRi.optString(0), jSONObject);
        riVar.lr = com.bytedance.adsdk.ugeno.ik.lr.ri(jSONArrayRi.optString(1), jSONObject);
        return riVar;
    }

    public static ik ri(JSONObject jSONObject, JSONObject jSONObject2) {
        if (jSONObject == null) {
            return null;
        }
        ik ikVar = new ik();
        ikVar.lr(com.bytedance.adsdk.ugeno.xha.ik.ri(com.bytedance.adsdk.ugeno.ik.lr.ri(jSONObject.optString("delay"), jSONObject2), 0L));
        ikVar.ik(com.bytedance.adsdk.ugeno.ik.lr.ri(jSONObject.optString("name"), jSONObject2));
        ikVar.lr(com.bytedance.adsdk.ugeno.xha.ik.ri(com.bytedance.adsdk.ugeno.ik.lr.ri(jSONObject.optString("playState"), jSONObject2), 1));
        ikVar.ri(Math.max(com.bytedance.adsdk.ugeno.xha.ik.ri(com.bytedance.adsdk.ugeno.ik.lr.ri(jSONObject.optString(IronSourceConstants.EVENTS_DURATION), jSONObject2), 0L), 0L));
        ikVar.ri(com.bytedance.adsdk.ugeno.xha.ik.ri(com.bytedance.adsdk.ugeno.ik.lr.ri(jSONObject.optString("playCount"), jSONObject2), 1));
        ikVar.ri(com.bytedance.adsdk.ugeno.ik.lr.ri(jSONObject.optString("playDirection"), jSONObject2));
        ikVar.ri(lr(jSONObject.optString("transformOrigin"), jSONObject2));
        ikVar.lr(com.bytedance.adsdk.ugeno.ik.lr.ri(jSONObject.optString("timingFunction", "linear"), jSONObject2));
        ikVar.ri(jSONObject.optJSONObject("effect"));
        ikVar.ri(ri(jSONObject.optJSONArray("keyframes"), jSONObject2));
        return ikVar;
    }

    public static Map<String, TreeMap<Float, String>> ri(JSONArray jSONArray, JSONObject jSONObject) {
        if (jSONArray == null || jSONArray.length() <= 0) {
            return null;
        }
        HashMap map = new HashMap();
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i);
            if (jSONObjectOptJSONObject != null) {
                float fOptDouble = (float) jSONObjectOptJSONObject.optDouble("offset");
                Iterator<String> itKeys = jSONObjectOptJSONObject.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    TreeMap treeMap = (TreeMap) map.get(next);
                    if (!TextUtils.equals(next, "offset")) {
                        if (map.containsKey(next) && treeMap != null) {
                            treeMap.put(Float.valueOf(fOptDouble), com.bytedance.adsdk.ugeno.ik.lr.ri(jSONObjectOptJSONObject.optString(next), jSONObject));
                        } else {
                            TreeMap treeMap2 = new TreeMap();
                            treeMap2.put(Float.valueOf(fOptDouble), com.bytedance.adsdk.ugeno.ik.lr.ri(jSONObjectOptJSONObject.optString(next), jSONObject));
                            map.put(next, treeMap2);
                        }
                    }
                }
            }
        }
        return map;
    }

    public static int ri(String str) {
        int iHashCode = str.hashCode();
        if (iHashCode == -1408024454) {
            return str.equals("alternate") ? 2 : 1;
        }
        if (iHashCode != -1039745817) {
            return 1;
        }
        str.equals("normal");
        return 1;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static int ri(String str, int i) {
        int i2 = i / 2;
        if (!TextUtils.isEmpty(str)) {
            str.getClass();
            switch (str) {
                case "bottom":
                case "right":
                    return i;
                case "center":
                    break;
                case "top":
                case "left":
                    return 0;
                default:
                    if (str.endsWith("%")) {
                        try {
                            return (int) ((i * Float.parseFloat(str.substring(0, str.length() - 1))) / 100.0f);
                        } catch (NumberFormatException unused) {
                        }
                        break;
                    } else {
                        try {
                            return Integer.parseInt(str);
                        } catch (NumberFormatException unused2) {
                            return i2;
                        }
                    }
                    break;
            }
        }
        return i2;
    }
}
