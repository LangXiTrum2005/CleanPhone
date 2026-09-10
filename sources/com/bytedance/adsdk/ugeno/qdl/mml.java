package com.bytedance.adsdk.ugeno.qdl;

import android.text.TextUtils;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class mml {
    public static float[] lnr(String str) {
        float[] fArr = {0.0f, 0.0f};
        JSONArray jSONArrayQdl = com.bytedance.adsdk.ugeno.wd.ud.qdl(str, (JSONArray) null);
        if (jSONArrayQdl != null && jSONArrayQdl.length() == 2) {
            fArr[0] = (float) jSONArrayQdl.optDouble(0);
            fArr[1] = (float) jSONArrayQdl.optDouble(1);
        }
        return fArr;
    }

    public static int qdl(int i2) {
        if (i2 < 0) {
            return -1;
        }
        if (i2 == 0) {
            return Integer.MIN_VALUE;
        }
        return i2 - 1;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:17:0x0032  */
    public static Interpolator ud(String str) {
        byte b2;
        switch (str) {
            case "ease_in":
                b2 = 0;
                break;
            case "linear":
                b2 = 3;
                break;
            case "ease_out":
                b2 = 2;
                break;
            case "ease_in_out":
                b2 = 1;
                break;
            default:
                b2 = -1;
                break;
        }
        if (b2 == 0) {
            return new AccelerateInterpolator();
        }
        if (b2 != 1) {
            return b2 != 2 ? new LinearInterpolator() : new DecelerateInterpolator();
        }
        return new AccelerateDecelerateInterpolator();
    }

    public static List<lnr> qdl(String str, JSONObject jSONObject) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        try {
            JSONArray jSONArray = new JSONArray(str);
            if (jSONArray.length() <= 0) {
                return null;
            }
            for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i2);
                if (jSONObjectOptJSONObject != null) {
                    arrayList.add(qdl(jSONObjectOptJSONObject, jSONObject));
                }
            }
            return arrayList;
        } catch (JSONException e2) {
            throw new RuntimeException(e2);
        }
    }

    public static lnr.qdl ud(String str, JSONObject jSONObject) {
        JSONArray jSONArrayQdl;
        if (TextUtils.isEmpty(str) || (jSONArrayQdl = com.bytedance.adsdk.ugeno.wd.ud.qdl(str, (JSONArray) null)) == null || jSONArrayQdl.length() != 2) {
            return null;
        }
        lnr.qdl qdlVar = new lnr.qdl();
        qdlVar.qdl = com.bytedance.adsdk.ugeno.lnr.ud.qdl(jSONArrayQdl.optString(0), jSONObject);
        qdlVar.ud = com.bytedance.adsdk.ugeno.lnr.ud.qdl(jSONArrayQdl.optString(1), jSONObject);
        return qdlVar;
    }

    public static lnr qdl(JSONObject jSONObject, JSONObject jSONObject2) {
        if (jSONObject == null) {
            return null;
        }
        lnr lnrVar = new lnr();
        lnrVar.ud(com.bytedance.adsdk.ugeno.wd.lnr.qdl(com.bytedance.adsdk.ugeno.lnr.ud.qdl(jSONObject.optString("delay"), jSONObject2), 0L));
        lnrVar.lnr(com.bytedance.adsdk.ugeno.lnr.ud.qdl(jSONObject.optString("name"), jSONObject2));
        lnrVar.ud(com.bytedance.adsdk.ugeno.wd.lnr.qdl(com.bytedance.adsdk.ugeno.lnr.ud.qdl(jSONObject.optString("playState"), jSONObject2), 1));
        lnrVar.qdl(Math.max(com.bytedance.adsdk.ugeno.wd.lnr.qdl(com.bytedance.adsdk.ugeno.lnr.ud.qdl(jSONObject.optString("duration"), jSONObject2), 0L), 0L));
        lnrVar.qdl(com.bytedance.adsdk.ugeno.wd.lnr.qdl(com.bytedance.adsdk.ugeno.lnr.ud.qdl(jSONObject.optString("playCount"), jSONObject2), 1));
        lnrVar.qdl(com.bytedance.adsdk.ugeno.lnr.ud.qdl(jSONObject.optString("playDirection"), jSONObject2));
        lnrVar.qdl(ud(jSONObject.optString("transformOrigin"), jSONObject2));
        lnrVar.ud(com.bytedance.adsdk.ugeno.lnr.ud.qdl(jSONObject.optString("timingFunction", "linear"), jSONObject2));
        lnrVar.qdl(jSONObject.optJSONObject("effect"));
        lnrVar.qdl(qdl(jSONObject.optJSONArray("keyframes"), jSONObject2));
        return lnrVar;
    }

    public static Map<String, TreeMap<Float, String>> qdl(JSONArray jSONArray, JSONObject jSONObject) {
        if (jSONArray == null || jSONArray.length() <= 0) {
            return null;
        }
        HashMap map = new HashMap();
        for (int i2 = 0; i2 < jSONArray.length(); i2++) {
            JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i2);
            if (jSONObjectOptJSONObject != null) {
                float fOptDouble = (float) jSONObjectOptJSONObject.optDouble("offset");
                Iterator<String> itKeys = jSONObjectOptJSONObject.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    TreeMap treeMap = (TreeMap) map.get(next);
                    if (!TextUtils.equals(next, "offset")) {
                        if (map.containsKey(next) && treeMap != null) {
                            treeMap.put(Float.valueOf(fOptDouble), com.bytedance.adsdk.ugeno.lnr.ud.qdl(jSONObjectOptJSONObject.optString(next), jSONObject));
                        } else {
                            TreeMap treeMap2 = new TreeMap();
                            treeMap2.put(Float.valueOf(fOptDouble), com.bytedance.adsdk.ugeno.lnr.ud.qdl(jSONObjectOptJSONObject.optString(next), jSONObject));
                            map.put(next, treeMap2);
                        }
                    }
                }
            }
        }
        return map;
    }

    public static int qdl(String str) {
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
    public static int qdl(String str, int i2) {
        byte b2 = 2;
        int i3 = i2 / 2;
        if (!TextUtils.isEmpty(str)) {
            str.getClass();
            switch (str.hashCode()) {
                case -1383228885:
                    b2 = !str.equals("bottom") ? (byte) -1 : (byte) 0;
                    break;
                case -1364013995:
                    b2 = !str.equals(TtmlNode.CENTER) ? (byte) -1 : (byte) 1;
                    break;
                case 115029:
                    if (!str.equals("top")) {
                        b2 = -1;
                    }
                    break;
                case 3317767:
                    b2 = !str.equals(TtmlNode.LEFT) ? (byte) -1 : (byte) 3;
                    break;
                case 108511772:
                    b2 = !str.equals(TtmlNode.RIGHT) ? (byte) -1 : (byte) 4;
                    break;
                default:
                    b2 = -1;
                    break;
            }
            switch (b2) {
                case 0:
                case 4:
                    return i2;
                case 1:
                    break;
                case 2:
                case 3:
                    return 0;
                default:
                    try {
                        if (str.endsWith("%")) {
                            return (int) ((i2 * Float.parseFloat(str.substring(0, str.length() - 1))) / 100.0f);
                        }
                        return Integer.parseInt(str);
                    } catch (NumberFormatException unused) {
                    }
                    break;
            }
        }
        return i3;
    }
}
