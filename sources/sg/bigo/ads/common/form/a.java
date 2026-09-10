package sg.bigo.ads.common.form;

import android.content.Context;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import org.json.JSONObject;
import sg.bigo.ads.api.a.e;

/* JADX INFO: loaded from: classes7.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static String f47163a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static Locale f47164b;

    public static String a(Context context, int i2) {
        return sg.bigo.ads.common.utils.a.a(context, i2, f47164b);
    }

    public static void b(int i2) {
        b.a();
        b.b(i2);
    }

    public static String a(String str, Map<String, Object> map) {
        if (map == null) {
            return "";
        }
        try {
            JSONObject jSONObject = (JSONObject) map.get("form_qa");
            if (jSONObject != null) {
                return jSONObject.getString(str);
            }
        } catch (Exception unused) {
        }
        return "";
    }

    public static Map<String, Object> a(int i2) {
        b.a();
        return b.a(i2);
    }

    public static Map<String, Object> a(e eVar, boolean z2, JSONObject jSONObject) {
        HashMap map = new HashMap();
        JSONObject jSONObject2 = new JSONObject();
        try {
            JSONObject jSONObject3 = new JSONObject(eVar.g());
            Iterator<String> itKeys = jSONObject3.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                jSONObject2.put(next, jSONObject3.optString(next, ""));
            }
            jSONObject2.put("privacy", z2 ? "1" : "0");
            jSONObject2.put("style_id", String.valueOf(eVar.f()));
        } catch (Exception unused) {
        }
        map.put("extra", jSONObject2);
        map.put("form_qa", jSONObject);
        map.put("form_id", Long.valueOf(eVar.c()));
        map.put("timestamp_ms", Long.valueOf(System.currentTimeMillis()));
        return map;
    }

    public static void a(final int i2, int i3) {
        b.a().a(a(i2), new b.a() { // from class: sg.bigo.ads.common.form.a.1
            @Override // sg.bigo.ads.common.form.b.a
            public final void a(int i4) {
                a.b(i2);
            }

            @Override // sg.bigo.ads.common.form.b.a
            public final void a(Map<String, Object> map) {
            }
        }, i3);
    }

    public static void a(int i2, Map<String, Object> map) {
        if (map != null) {
            b.a();
            b.a(i2, map);
        }
    }

    public static boolean a(Map<String, Object> map) {
        if (map == null) {
            return true;
        }
        String strOptString = "";
        try {
            JSONObject jSONObject = (JSONObject) map.get("extra");
            if (jSONObject != null && jSONObject.has("privacy")) {
                strOptString = jSONObject.optString("privacy", "0");
            }
        } catch (Exception unused) {
        }
        return "1".equals(strOptString);
    }
}
