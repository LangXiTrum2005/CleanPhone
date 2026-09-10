package com.ironsource;

import android.text.TextUtils;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.e, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
abstract class AbstractC0308e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f28488a = "eventId";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f28489b = "timestamp";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f28490c = "InterstitialEvents";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f28491d = "events";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f28492e = "events";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    JSONObject f28493f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    int f28494g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private String f28495h;

    private String a(int i10) {
        return i10 != 2 ? "events" : "InterstitialEvents";
    }

    public abstract String a();

    public abstract String a(ArrayList<C0654x5> arrayList, JSONObject jSONObject);

    public String b() {
        return TextUtils.isEmpty(this.f28495h) ? a() : this.f28495h;
    }

    public abstract String c();

    public JSONObject a(C0654x5 c0654x5) {
        JSONObject jSONObject;
        try {
            String strA = c0654x5.a();
            if (!TextUtils.isEmpty(strA)) {
                jSONObject = new JSONObject(strA);
            } else {
                jSONObject = new JSONObject();
            }
            jSONObject.put("eventId", c0654x5.c());
            jSONObject.put("timestamp", c0654x5.d());
            return jSONObject;
        } catch (JSONException e10) {
            C0474n4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
            return null;
        }
    }

    public String a(JSONArray jSONArray) {
        try {
            if (this.f28493f == null) {
                return "";
            }
            JSONObject jSONObject = new JSONObject(this.f28493f.toString());
            jSONObject.put("timestamp", IronSourceUtils.e());
            jSONObject.put(a(this.f28494g), jSONArray);
            return jSONObject.toString();
        } catch (Exception e10) {
            C0474n4.d().a(e10);
            return "";
        }
    }

    public void a(String str) {
        this.f28495h = str;
    }
}
