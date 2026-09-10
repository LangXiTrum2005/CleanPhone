package com.smartdigimkt.d3;

import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f34425a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f34426b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private a f34427c;

    public b(int i2, int i3, a aVar) {
        this.f34425a = i2;
        this.f34426b = i3;
        this.f34427c = aVar;
    }

    public int a() {
        return this.f34425a;
    }

    public void b(int i2) {
        this.f34426b = i2;
    }

    public int c() {
        return this.f34426b;
    }

    public void a(int i2) {
        this.f34425a = i2;
    }

    public a b() {
        return this.f34427c;
    }

    public void a(a aVar) {
        this.f34427c = aVar;
    }

    public static List<b> a(JSONArray jSONArray) {
        if (jSONArray != null && jSONArray.length() > 0) {
            ArrayList arrayList = new ArrayList();
            for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                try {
                    JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i2);
                    int iOptInt = jSONObjectOptJSONObject.optInt("id");
                    int iOptInt2 = jSONObjectOptJSONObject.optInt("timeout");
                    JSONObject jSONObjectOptJSONObject2 = jSONObjectOptJSONObject.optJSONObject("params");
                    arrayList.add(new b(iOptInt, iOptInt2, jSONObjectOptJSONObject2 != null ? a.a(jSONObjectOptJSONObject2) : null));
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
            }
            return arrayList;
        }
        return null;
    }
}
