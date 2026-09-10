package com.p004ironsource;

import android.text.TextUtils;
import com.p004ironsource.mediationsdk.logger.IronLog;
import com.p004ironsource.mediationsdk.utils.IronSourceUtils;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
abstract class AbstractC3351e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f24853a = "eventId";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f24854b = "timestamp";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f24855c = "InterstitialEvents";
    private final String d = "events";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f24856e = "events";
    JSONObject f;
    int g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private String f24857h;

    private String a(int i2) {
        return i2 != 2 ? "events" : "InterstitialEvents";
    }

    public abstract String a();

    public abstract String a(ArrayList<zb> arrayList, JSONObject jSONObject);

    public String b() {
        return TextUtils.isEmpty(this.f24857h) ? a() : this.f24857h;
    }

    public abstract String c();

    public String a(JSONArray jSONArray) {
        try {
            if (this.f == null) {
                return "";
            }
            JSONObject jSONObject = new JSONObject(this.f.toString());
            jSONObject.put("timestamp", IronSourceUtils.getTimestamp());
            jSONObject.put(a(this.g), jSONArray);
            return jSONObject.toString();
        } catch (Exception e2) {
            q9.d().a(e2);
            return "";
        }
    }

    public JSONObject a(zb zbVar) {
        try {
            String strA = zbVar.a();
            JSONObject jSONObject = !TextUtils.isEmpty(strA) ? new JSONObject(strA) : new JSONObject();
            jSONObject.put("eventId", zbVar.c());
            jSONObject.put("timestamp", zbVar.d());
            return jSONObject;
        } catch (JSONException e2) {
            q9.d().a(e2);
            IronLog.INTERNAL.error(e2.toString());
            return null;
        }
    }

    public void a(String str) {
        this.f24857h = str;
    }
}
