package com.bytedance.adsdk.ugeno.Lxb;

import android.text.TextUtils;
import android.util.Pair;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class lk {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:17:0x0032  */
    public static Interpolator LD(String str) {
        byte b;
        switch (str) {
            case "ease_in":
                b = 0;
                break;
            case "linear":
                b = 3;
                break;
            case "ease_out":
                b = 2;
                break;
            case "ease_in_out":
                b = 1;
                break;
            default:
                b = -1;
                break;
        }
        if (b == 0) {
            return new AccelerateInterpolator();
        }
        if (b != 1) {
            return b != 2 ? new LinearInterpolator() : new DecelerateInterpolator();
        }
        return new AccelerateDecelerateInterpolator();
    }

    public static int Lxb(int i) {
        if (i < 0) {
            return -1;
        }
        if (i == 0) {
            return 1;
        }
        return i - 1;
    }

    public static LD.Lxb ZU(String str) {
        JSONArray jSONArrayLxb;
        if (TextUtils.isEmpty(str) || (jSONArrayLxb = com.bytedance.adsdk.ugeno.ebl.LD.Lxb(str, (JSONArray) null)) == null || jSONArrayLxb.length() != 2) {
            return null;
        }
        LD.Lxb lxb = new LD.Lxb();
        lxb.Lxb = jSONArrayLxb.optString(0);
        lxb.LD = jSONArrayLxb.optString(1);
        return lxb;
    }

    public static float[] lk(String str) {
        float[] fArr = {0.0f, 0.0f};
        JSONArray jSONArrayLxb = com.bytedance.adsdk.ugeno.ebl.LD.Lxb(str, (JSONArray) null);
        if (jSONArrayLxb != null && jSONArrayLxb.length() == 2) {
            fArr[0] = (float) jSONArrayLxb.optDouble(0);
            fArr[1] = (float) jSONArrayLxb.optDouble(1);
        }
        return fArr;
    }

    public static LD Lxb(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        LD ld = new LD();
        ld.LD(jSONObject.optLong("delay"));
        ld.Lxb(jSONObject.optLong("duration"));
        ld.Lxb(jSONObject.optInt("playCount", 1));
        ld.Lxb(jSONObject.optString("playDirection"));
        ld.Lxb(ZU(jSONObject.optString("transformOrigin")));
        ld.LD(jSONObject.optString("timingFunction", "linear"));
        ld.Lxb(jSONObject.optJSONObject("effect"));
        ld.Lxb(Lxb(jSONObject.optJSONArray("keyframes")));
        return ld;
    }

    public static Map<String, TreeMap<Float, String>> Lxb(JSONArray jSONArray) {
        if (jSONArray == null || jSONArray.length() <= 0) {
            return null;
        }
        HashMap map = new HashMap();
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i);
            if (jSONObjectOptJSONObject != null) {
                float fOptDouble = (float) jSONObjectOptJSONObject.optDouble(TypedValues.CycleType.S_WAVE_OFFSET);
                Iterator<String> itKeys = jSONObjectOptJSONObject.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    TreeMap treeMap = (TreeMap) map.get(next);
                    if (!TextUtils.equals(next, TypedValues.CycleType.S_WAVE_OFFSET)) {
                        if (map.containsKey(next) && treeMap != null) {
                            treeMap.put(Float.valueOf(fOptDouble), jSONObjectOptJSONObject.optString(next));
                        } else {
                            TreeMap treeMap2 = new TreeMap();
                            new Pair(Float.valueOf(fOptDouble), jSONObjectOptJSONObject.optString(next));
                            treeMap2.put(Float.valueOf(fOptDouble), jSONObjectOptJSONObject.optString(next));
                            map.put(next, treeMap2);
                        }
                    }
                }
            }
        }
        return map;
    }

    public static int Lxb(String str) {
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

    public static int Lxb(String str, int i) {
        int i2 = i / 2;
        if (TextUtils.isEmpty(str)) {
            return i2;
        }
        str.getClass();
        switch (str) {
            case "bottom":
            case "right":
                return i;
            case "center":
                return i2;
            case "top":
            case "left":
                return 0;
            default:
                if (str.endsWith("%")) {
                    try {
                        return (int) ((i * Float.parseFloat(str.substring(0, str.length() - 1))) / 100.0f);
                    } catch (NumberFormatException unused) {
                        return i2;
                    }
                }
                try {
                    return Integer.parseInt(str);
                } catch (NumberFormatException unused2) {
                    return i2;
                }
        }
    }
}
