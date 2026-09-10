package com.smartdigimkt.w;

import com.smartdigimkt.c0.d;
import java.util.Collection;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private d f39193a;

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static a f39194a = new a();

        private b() {
        }
    }

    public static a a() {
        return b.f39194a;
    }

    public JSONArray b() {
        return new JSONArray((Collection) this.f39193a.a());
    }

    private a() {
        this.f39193a = new d(1000);
    }

    public JSONObject a(String str) {
        JSONObject jSONObject = this.f39193a.get(str);
        if (jSONObject != null) {
            return jSONObject;
        }
        return null;
    }

    public void a(JSONObject jSONObject, boolean z2) {
        if (jSONObject != null) {
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                this.f39193a.put(next, jSONObject.optJSONObject(next));
            }
        }
    }
}
