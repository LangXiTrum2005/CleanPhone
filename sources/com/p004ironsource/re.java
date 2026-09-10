package com.p004ironsource;

import android.content.Context;
import com.p004ironsource.environment.ContextProvider;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public class re {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f26669a = "adunit_data";

    public void a(Context context) {
        oe.b().c(context);
    }

    public void a(String str, ne.a aVar) {
        JSONObject jSONObjectOptJSONObject;
        try {
            String strName = aVar.name();
            oe oeVarB = oe.b();
            JSONObject jSONObjectOptJSONObject2 = oeVarB.b(ContextProvider.getInstance().getApplicationContext()).optJSONObject(f26669a);
            if (jSONObjectOptJSONObject2 == null || (jSONObjectOptJSONObject = jSONObjectOptJSONObject2.optJSONObject(strName)) == null || jSONObjectOptJSONObject.remove(str) == null) {
                return;
            }
            oeVarB.b(f26669a, jSONObjectOptJSONObject2.put(strName, jSONObjectOptJSONObject));
        } catch (JSONException e2) {
            q9.d().a(e2);
        }
    }

    public void a(String str, Object obj) {
        oe.b().b(str, obj);
    }

    public void a(String str, Object obj, ne.a aVar) {
        JSONObject jSONObjectPut;
        try {
            String strName = aVar.name();
            oe oeVarB = oe.b();
            JSONObject jSONObjectOptJSONObject = oeVarB.b(ContextProvider.getInstance().getApplicationContext()).optJSONObject(f26669a);
            if (jSONObjectOptJSONObject == null) {
                jSONObjectPut = new JSONObject().put(strName, new JSONObject().put(str, obj));
            } else {
                JSONObject jSONObjectOptJSONObject2 = jSONObjectOptJSONObject.optJSONObject(strName);
                jSONObjectPut = jSONObjectOptJSONObject2 == null ? jSONObjectOptJSONObject.put(strName, new JSONObject().put(str, obj)) : jSONObjectOptJSONObject.put(strName, jSONObjectOptJSONObject2.put(str, obj));
            }
            oeVarB.b(f26669a, jSONObjectPut);
        } catch (JSONException e2) {
            q9.d().a(e2);
        }
    }

    public void a(String str, JSONArray jSONArray) {
        oe.b().a(str, jSONArray);
    }

    public void a(String str, JSONObject jSONObject) {
        oe.b().a(str, jSONObject);
    }

    public void a(Map<String, Object> map) {
        oe.b().a(map);
    }
}
