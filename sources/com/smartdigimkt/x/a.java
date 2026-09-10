package com.smartdigimkt.x;

import android.text.TextUtils;
import java.io.Serializable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class a implements Serializable, com.smartdigimkt.w1.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static String f39645c = "a";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f39646a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f39647b;

    public void a(int i2) {
        this.f39646a = i2;
    }

    public int b() {
        return this.f39646a;
    }

    public int c() {
        return this.f39647b;
    }

    public JSONObject d() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("hlp", this.f39647b);
            jSONObject.put(com.smartdigimkt.q0.b.w0, this.f39646a);
            return jSONObject;
        } catch (JSONException e2) {
            e2.printStackTrace();
            return jSONObject;
        }
    }

    public void b(int i2) {
        this.f39647b = i2;
    }

    public static a b(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            a aVar = new a();
            if (jSONObject.has("hlp")) {
                aVar.b(jSONObject.optInt("hlp"));
            }
            if (jSONObject.has(com.smartdigimkt.q0.b.w0)) {
                aVar.a(jSONObject.optInt(com.smartdigimkt.q0.b.w0));
            }
            return aVar;
        } catch (Throwable th) {
            th.getMessage();
            return null;
        }
    }
}
