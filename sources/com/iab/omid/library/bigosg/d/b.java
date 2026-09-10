package com.iab.omid.library.bigosg.d;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Point;
import android.view.WindowManager;
import com.p004ironsource.d9;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static WindowManager f21680b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static String[] f21681c = {"x", "y", "width", "height"};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static float f21679a = Resources.getSystem().getDisplayMetrics().density;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final float f21682a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final float f21683b;

        public a(float f, float f2) {
            this.f21682a = f;
            this.f21683b = f2;
        }
    }

    public static float a(int i2) {
        return i2 / f21679a;
    }

    private static a b(JSONObject jSONObject) {
        float fA;
        float fA2;
        if (f21680b != null) {
            Point point = new Point(0, 0);
            f21680b.getDefaultDisplay().getRealSize(point);
            fA = a(point.x);
            fA2 = a(point.y);
        } else {
            fA = 0.0f;
            fA2 = 0.0f;
        }
        return new a(fA, fA2);
    }

    private static boolean c(JSONObject jSONObject, JSONObject jSONObject2) {
        for (String str : f21681c) {
            if (jSONObject.optDouble(str) != jSONObject2.optDouble(str)) {
                return false;
            }
        }
        return true;
    }

    private static boolean d(JSONObject jSONObject, JSONObject jSONObject2) {
        return jSONObject.optString("adSessionId", "").equals(jSONObject2.optString("adSessionId", ""));
    }

    private static boolean e(JSONObject jSONObject, JSONObject jSONObject2) {
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("isFriendlyObstructionFor");
        JSONArray jSONArrayOptJSONArray2 = jSONObject2.optJSONArray("isFriendlyObstructionFor");
        if (jSONArrayOptJSONArray == null && jSONArrayOptJSONArray2 == null) {
            return true;
        }
        if (!a(jSONArrayOptJSONArray, jSONArrayOptJSONArray2)) {
            return false;
        }
        for (int i2 = 0; i2 < jSONArrayOptJSONArray.length(); i2++) {
            if (!jSONArrayOptJSONArray.optString(i2, "").equals(jSONArrayOptJSONArray2.optString(i2, ""))) {
                return false;
            }
        }
        return true;
    }

    private static boolean f(JSONObject jSONObject, JSONObject jSONObject2) {
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("childViews");
        JSONArray jSONArrayOptJSONArray2 = jSONObject2.optJSONArray("childViews");
        if (jSONArrayOptJSONArray == null && jSONArrayOptJSONArray2 == null) {
            return true;
        }
        if (!a(jSONArrayOptJSONArray, jSONArrayOptJSONArray2)) {
            return false;
        }
        for (int i2 = 0; i2 < jSONArrayOptJSONArray.length(); i2++) {
            if (!b(jSONArrayOptJSONArray.optJSONObject(i2), jSONArrayOptJSONArray2.optJSONObject(i2))) {
                return false;
            }
        }
        return true;
    }

    public static JSONObject a(int i2, int i3, int i4, int i5) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("x", a(i2));
            jSONObject.put("y", a(i3));
            jSONObject.put("width", a(i4));
            jSONObject.put("height", a(i5));
            return jSONObject;
        } catch (JSONException e2) {
            c.a("Error with creating viewStateObject", e2);
            return jSONObject;
        }
    }

    public static void b(JSONObject jSONObject, String str) {
        try {
            jSONObject.put("notVisibleReason", str);
        } catch (JSONException e2) {
            c.a("Error with setting not visible reason", e2);
        }
    }

    public static void a(Context context) {
        if (context != null) {
            f21679a = context.getResources().getDisplayMetrics().density;
            f21680b = (WindowManager) context.getSystemService("window");
        }
    }

    public static boolean b(JSONObject jSONObject, JSONObject jSONObject2) {
        if (jSONObject == null && jSONObject2 == null) {
            return true;
        }
        return jSONObject != null && jSONObject2 != null && c(jSONObject, jSONObject2) && d(jSONObject, jSONObject2) && e(jSONObject, jSONObject2) && f(jSONObject, jSONObject2);
    }

    public static void a(JSONObject jSONObject) {
        a aVarB = b(jSONObject);
        try {
            jSONObject.put("width", aVarB.f21682a);
            jSONObject.put("height", aVarB.f21683b);
        } catch (JSONException unused) {
        }
    }

    public static void a(JSONObject jSONObject, com.iab.omid.library.bigosg.walking.a.C0219a c0219a) {
        com.iab.omid.library.bigosg.b.c cVarA = c0219a.a();
        JSONArray jSONArray = new JSONArray();
        Iterator<String> it = c0219a.b().iterator();
        while (it.hasNext()) {
            jSONArray.put(it.next());
        }
        try {
            jSONObject.put("isFriendlyObstructionFor", jSONArray);
            jSONObject.put("friendlyObstructionClass", cVarA.b());
            jSONObject.put("friendlyObstructionPurpose", cVarA.c());
            jSONObject.put("friendlyObstructionReason", cVarA.d());
        } catch (JSONException e2) {
            c.a("Error with setting friendly obstruction", e2);
        }
    }

    public static void a(JSONObject jSONObject, String str) {
        try {
            jSONObject.put("adSessionId", str);
        } catch (JSONException e2) {
            c.a("Error with setting ad session id", e2);
        }
    }

    public static void a(JSONObject jSONObject, String str, Object obj) {
        try {
            jSONObject.put(str, obj);
        } catch (JSONException e2) {
            c.a("JSONException during JSONObject.put for name [" + str + d9.i.f24752e, e2);
        }
    }

    public static void a(JSONObject jSONObject, JSONObject jSONObject2) {
        try {
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("childViews");
            if (jSONArrayOptJSONArray == null) {
                jSONArrayOptJSONArray = new JSONArray();
                jSONObject.put("childViews", jSONArrayOptJSONArray);
            }
            jSONArrayOptJSONArray.put(jSONObject2);
        } catch (JSONException unused) {
        }
    }

    private static boolean a(JSONArray jSONArray, JSONArray jSONArray2) {
        if (jSONArray == null && jSONArray2 == null) {
            return true;
        }
        return (jSONArray == null || jSONArray2 == null || jSONArray.length() != jSONArray2.length()) ? false : true;
    }
}
