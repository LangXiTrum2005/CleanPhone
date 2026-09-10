package com.smartdigimkt.x;

import android.text.TextUtils;
import java.io.Serializable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class r implements Serializable, com.smartdigimkt.w1.a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String f39815h = "amount_max";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final String f39816i = "callback_rule";
    public static final String j = "virtual_currency";
    public static final String k = "amount";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final String f39817l = "icon";
    public static final String m = "currency_id";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final String f39818n = "name";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f39819a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f39820b = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f39821c = "";
    private int d = 1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f39822e = "";
    private int f = 1;
    private String g = "Virtual Item";

    public void a(int i2) {
        this.d = i2;
    }

    public int b() {
        return this.d;
    }

    public int c() {
        return this.f39819a;
    }

    public int d() {
        return this.f39820b;
    }

    public int e() {
        return this.f;
    }

    public String f() {
        return this.f39822e;
    }

    public String g() {
        return this.g;
    }

    public String h() {
        return this.f39821c;
    }

    public JSONObject i() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("amount_max", this.f39819a);
            jSONObject.put("callback_rule", this.f39820b);
            jSONObject.put("virtual_currency", this.f39821c);
            jSONObject.put("amount", this.d);
            jSONObject.put("icon", this.f39822e);
            jSONObject.put("currency_id", this.f);
            jSONObject.put("name", this.g);
            return jSONObject;
        } catch (JSONException e2) {
            e2.printStackTrace();
            return jSONObject;
        }
    }

    public static r a(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        r rVar = new r();
        rVar.b(jSONObject.optInt("amount_max", 0));
        rVar.c(jSONObject.optInt("callback_rule", 1));
        rVar.e(jSONObject.optString("virtual_currency", ""));
        rVar.c(jSONObject.optString("icon", ""));
        rVar.d(jSONObject.optInt("currency_id", 1));
        if (jSONObject.has("amount")) {
            rVar.a(jSONObject.optInt("amount", 1));
        }
        if (jSONObject.has("name")) {
            rVar.d(jSONObject.optString("name", "Virtual Item"));
        }
        return rVar;
    }

    public void b(int i2) {
        this.f39819a = i2;
    }

    public void c(int i2) {
        this.f39820b = i2;
    }

    public void d(int i2) {
        this.f = i2;
    }

    public void e(String str) {
        this.f39821c = str;
    }

    public static r b(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            return a(new JSONObject(str));
        } catch (JSONException e2) {
            e2.printStackTrace();
            return null;
        }
    }

    public void c(String str) {
        this.f39822e = str;
    }

    public void d(String str) {
        this.g = str;
    }
}
