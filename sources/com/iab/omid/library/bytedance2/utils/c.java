package com.iab.omid.library.bytedance2.utils;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Point;
import android.view.WindowManager;
import com.applovin.impl.Z;
import com.iab.omid.library.bytedance2.adsession.OutputDeviceStatus;
import com.p004ironsource.d9;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static WindowManager f21783a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static String[] f21784b = {"x", "y", "width", "height"};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static float f21785c = Resources.getSystem().getDisplayMetrics().density;

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f21786a;

        static {
            int[] iArr = new int[OutputDeviceStatus.values().length];
            f21786a = iArr;
            try {
                iArr[OutputDeviceStatus.NOT_DETECTED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final float f21787a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final float f21788b;

        public b(float f, float f2) {
            this.f21787a = f;
            this.f21788b = f2;
        }
    }

    public static float a(int i2) {
        return i2 / f21785c;
    }

    public static void b(JSONObject jSONObject) {
        b bVarA = a(jSONObject);
        try {
            jSONObject.put("width", bVarA.f21787a);
            jSONObject.put("height", bVarA.f21788b);
        } catch (JSONException unused) {
        }
    }

    private static boolean c(JSONObject jSONObject, JSONObject jSONObject2) {
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

    private static boolean d(JSONObject jSONObject, JSONObject jSONObject2) {
        return Z.A(jSONObject2, "hasWindowFocus", Boolean.valueOf(jSONObject.optBoolean("hasWindowFocus")));
    }

    private static boolean e(JSONObject jSONObject, JSONObject jSONObject2) {
        return Z.A(jSONObject2, "noOutputDevice", Boolean.valueOf(jSONObject.optBoolean("noOutputDevice")));
    }

    private static boolean f(JSONObject jSONObject, JSONObject jSONObject2) {
        for (String str : f21784b) {
            if (jSONObject.optDouble(str) != jSONObject2.optDouble(str)) {
                return false;
            }
        }
        return true;
    }

    private static boolean g(JSONObject jSONObject, JSONObject jSONObject2) {
        return jSONObject.optString("adSessionId", "").equals(jSONObject2.optString("adSessionId", ""));
    }

    public static boolean h(JSONObject jSONObject, JSONObject jSONObject2) {
        if (jSONObject == null && jSONObject2 == null) {
            return true;
        }
        return jSONObject != null && jSONObject2 != null && f(jSONObject, jSONObject2) && g(jSONObject, jSONObject2) && e(jSONObject, jSONObject2) && d(jSONObject, jSONObject2) && c(jSONObject, jSONObject2) && b(jSONObject, jSONObject2);
    }

    private static b a(JSONObject jSONObject) {
        float fA;
        float fA2;
        if (f21783a != null) {
            Point point = new Point(0, 0);
            f21783a.getDefaultDisplay().getRealSize(point);
            fA = a(point.x);
            fA2 = a(point.y);
        } else {
            fA = 0.0f;
            fA2 = 0.0f;
        }
        return new b(fA, fA2);
    }

    public static void b(JSONObject jSONObject, String str) {
        try {
            jSONObject.put("notVisibleReason", str);
        } catch (JSONException e2) {
            d.a("Error with setting not visible reason", e2);
        }
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
            d.a("Error with creating viewStateObject", e2);
            return jSONObject;
        }
    }

    private static boolean b(JSONObject jSONObject, JSONObject jSONObject2) {
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("childViews");
        JSONArray jSONArrayOptJSONArray2 = jSONObject2.optJSONArray("childViews");
        if (jSONArrayOptJSONArray == null && jSONArrayOptJSONArray2 == null) {
            return true;
        }
        if (!a(jSONArrayOptJSONArray, jSONArrayOptJSONArray2)) {
            return false;
        }
        for (int i2 = 0; i2 < jSONArrayOptJSONArray.length(); i2++) {
            if (!h(jSONArrayOptJSONArray.optJSONObject(i2), jSONArrayOptJSONArray2.optJSONObject(i2))) {
                return false;
            }
        }
        return true;
    }

    public static void a(Context context) {
        if (context != null) {
            f21785c = context.getResources().getDisplayMetrics().density;
            f21783a = (WindowManager) context.getSystemService("window");
        }
    }

    public static void a(JSONObject jSONObject, OutputDeviceStatus outputDeviceStatus) {
        try {
            jSONObject.put("noOutputDevice", a(outputDeviceStatus));
        } catch (JSONException e2) {
            d.a("Error with setting output device status", e2);
        }
    }

    public static void a(JSONObject jSONObject, com.iab.omid.library.bytedance2.walking.a.C0223a c0223a) {
        com.iab.omid.library.bytedance2.internal.e eVarA = c0223a.a();
        JSONArray jSONArray = new JSONArray();
        Iterator<String> it = c0223a.b().iterator();
        while (it.hasNext()) {
            jSONArray.put(it.next());
        }
        try {
            jSONObject.put("isFriendlyObstructionFor", jSONArray);
            jSONObject.put("friendlyObstructionClass", eVarA.d());
            jSONObject.put("friendlyObstructionPurpose", eVarA.b());
            jSONObject.put("friendlyObstructionReason", eVarA.a());
        } catch (JSONException e2) {
            d.a("Error with setting friendly obstruction", e2);
        }
    }

    public static void a(JSONObject jSONObject, Boolean bool) {
        try {
            jSONObject.put("hasWindowFocus", bool);
        } catch (JSONException e2) {
            d.a("Error with setting has window focus", e2);
        }
    }

    public static void a(JSONObject jSONObject, String str) {
        try {
            jSONObject.put("adSessionId", str);
        } catch (JSONException e2) {
            d.a("Error with setting ad session id", e2);
        }
    }

    public static void a(JSONObject jSONObject, String str, Object obj) {
        try {
            jSONObject.put(str, obj);
        } catch (NullPointerException | JSONException e2) {
            d.a("JSONException during JSONObject.put for name [" + str + d9.i.f24752e, e2);
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

    private static boolean a(OutputDeviceStatus outputDeviceStatus) {
        return a.f21786a[outputDeviceStatus.ordinal()] == 1;
    }

    private static boolean a(JSONArray jSONArray, JSONArray jSONArray2) {
        if (jSONArray == null && jSONArray2 == null) {
            return true;
        }
        return (jSONArray == null || jSONArray2 == null || jSONArray.length() != jSONArray2.length()) ? false : true;
    }
}
