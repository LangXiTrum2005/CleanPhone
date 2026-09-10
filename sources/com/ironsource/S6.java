package com.ironsource;

import android.content.Context;
import com.ironsource.environment.ContextProvider;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class S6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f27173a = "adunit_data";

    public void a(String str, Object obj) {
        P6.b().b(str, obj);
    }

    public void a(Map<String, Object> map) {
        P6.b().a(map);
    }

    public void a(String str, JSONArray jSONArray) {
        P6.b().a(str, jSONArray);
    }

    public void a(String str, JSONObject jSONObject) {
        P6.b().a(str, jSONObject);
    }

    public void a(Context context) {
        P6.b().c(context);
    }

    public void a(String str) {
        P6.b().b(str);
    }

    public void a(String str, Object obj, O6.a aVar) {
        try {
            String strName = aVar.name();
            P6 p6B = P6.b();
            JSONObject jSONObjectOptJSONObject = p6B.b(ContextProvider.getInstance().getApplicationContext()).optJSONObject(f27173a);
            if (jSONObjectOptJSONObject == null) {
                p6B.b(f27173a, new JSONObject().put(strName, new JSONObject().put(str, obj)));
                return;
            }
            JSONObject jSONObjectOptJSONObject2 = jSONObjectOptJSONObject.optJSONObject(strName);
            if (jSONObjectOptJSONObject2 == null) {
                p6B.b(f27173a, jSONObjectOptJSONObject.put(strName, new JSONObject().put(str, obj)));
            } else {
                p6B.b(f27173a, jSONObjectOptJSONObject.put(strName, jSONObjectOptJSONObject2.put(str, obj)));
            }
        } catch (JSONException e10) {
            C0474n4.d().a(e10);
        }
    }

    public void a(String str, O6.a aVar) {
        JSONObject jSONObjectOptJSONObject;
        try {
            String strName = aVar.name();
            P6 p6B = P6.b();
            JSONObject jSONObjectOptJSONObject2 = p6B.b(ContextProvider.getInstance().getApplicationContext()).optJSONObject(f27173a);
            if (jSONObjectOptJSONObject2 == null || (jSONObjectOptJSONObject = jSONObjectOptJSONObject2.optJSONObject(strName)) == null || jSONObjectOptJSONObject.remove(str) == null) {
                return;
            }
            p6B.b(f27173a, jSONObjectOptJSONObject2.put(strName, jSONObjectOptJSONObject));
        } catch (JSONException e10) {
            C0474n4.d().a(e10);
        }
    }
}
