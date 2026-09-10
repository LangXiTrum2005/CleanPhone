package com.iab.omid.library.adcolony.d;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Point;
import android.view.WindowManager;
import com.applovin.impl.Z;
import com.p004ironsource.d9;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static WindowManager f21487b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static String[] f21488c = {"x", "y", "width", "height"};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static float f21486a = Resources.getSystem().getDisplayMetrics().density;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final float f21489a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final float f21490b;

        public a(float f, float f2) {
            this.f21489a = f;
            this.f21490b = f2;
        }
    }

    public static float a(int i2) {
        return i2 / f21486a;
    }

    private static a b(JSONObject jSONObject) {
        float fA;
        float fA2;
        if (f21487b != null) {
            Point point = new Point(0, 0);
            f21487b.getDefaultDisplay().getRealSize(point);
            fA = a(point.x);
            fA2 = a(point.y);
        } else {
            fA = 0.0f;
            fA2 = 0.0f;
        }
        return new a(fA, fA2);
    }

    private static boolean c(JSONObject jSONObject, JSONObject jSONObject2) {
        for (String str : f21488c) {
            if (jSONObject.optDouble(str) != jSONObject2.optDouble(str)) {
                return false;
            }
        }
        return true;
    }

    private static boolean d(JSONObject jSONObject, JSONObject jSONObject2) {
        return Z.A(jSONObject2, "hasWindowFocus", Boolean.valueOf(jSONObject.optBoolean("hasWindowFocus")));
    }

    private static boolean e(JSONObject jSONObject, JSONObject jSONObject2) {
        return jSONObject.optString("adSessionId", "").equals(jSONObject2.optString("adSessionId", ""));
    }

    private static boolean f(JSONObject jSONObject, JSONObject jSONObject2) {
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

    private static boolean g(JSONObject jSONObject, JSONObject jSONObject2) {
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
            f21486a = context.getResources().getDisplayMetrics().density;
            f21487b = (WindowManager) context.getSystemService("window");
        }
    }

    public static boolean b(JSONObject jSONObject, JSONObject jSONObject2) {
        if (jSONObject == null && jSONObject2 == null) {
            return true;
        }
        return jSONObject != null && jSONObject2 != null && c(jSONObject, jSONObject2) && e(jSONObject, jSONObject2) && d(jSONObject, jSONObject2) && f(jSONObject, jSONObject2) && g(jSONObject, jSONObject2);
    }

    public static void a(JSONObject jSONObject) {
        a aVarB = b(jSONObject);
        try {
            jSONObject.put("width", aVarB.f21489a);
            jSONObject.put("height", aVarB.f21490b);
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
    }

    public static void a(JSONObject jSONObject, com.iab.omid.library.adcolony.walking.a.C0212a c0212a) {
        com.iab.omid.library.adcolony.b.c cVarA = c0212a.a();
        JSONArray jSONArray = new JSONArray();
        Iterator<String> it = c0212a.b().iterator();
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

    public static void a(JSONObject jSONObject, Boolean bool) {
        try {
            jSONObject.put("hasWindowFocus", bool);
        } catch (JSONException e2) {
            c.a("Error with setting not visible reason", e2);
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
        } catch (NullPointerException | JSONException e2) {
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
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
    }

    private static boolean a(JSONArray jSONArray, JSONArray jSONArray2) {
        if (jSONArray == null && jSONArray2 == null) {
            return true;
        }
        return (jSONArray == null || jSONArray2 == null || jSONArray.length() != jSONArray2.length()) ? false : true;
    }
}
