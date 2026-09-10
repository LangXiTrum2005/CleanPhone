package com.applovin.impl;

import android.net.Uri;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public class u7 implements s4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f9846a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f9847b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Uri f9848c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private z7 f9849d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Set f9850e = new HashSet();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Map f9851f = new HashMap();

    private u7() {
    }

    public static u7 a(q8 q8Var, u7 u7Var, v7 v7Var, com.applovin.impl.sdk.l lVar) {
        q8 q8VarC;
        if (q8Var == null) {
            throw new IllegalArgumentException("No node specified.");
        }
        if (lVar == null) {
            throw new IllegalArgumentException("No sdk specified.");
        }
        if (u7Var == null) {
            try {
                u7Var = new u7();
            } catch (Throwable th2) {
                lVar.Q();
                if (com.applovin.impl.sdk.p.a()) {
                    lVar.Q().a("VastCompanionAd", "Error occurred while initializing", th2);
                }
                lVar.E().a("VastCompanionAd", th2);
                return null;
            }
        }
        if (u7Var.f9846a == 0 && u7Var.f9847b == 0) {
            int i10 = StringUtils.parseInt((String) q8Var.a().get("width"));
            int i11 = StringUtils.parseInt((String) q8Var.a().get("height"));
            if (i10 > 0 && i11 > 0) {
                u7Var.f9846a = i10;
                u7Var.f9847b = i11;
            }
        }
        u7Var.f9849d = z7.a(q8Var, u7Var.f9849d, lVar);
        if (u7Var.f9848c == null && (q8VarC = q8Var.c("CompanionClickThrough")) != null) {
            String strD = q8VarC.d();
            if (StringUtils.isValidString(strD)) {
                u7Var.f9848c = Uri.parse(strD);
            }
        }
        d8.a(q8Var.a("CompanionClickTracking"), u7Var.f9850e, v7Var, lVar);
        d8.a(q8Var, u7Var.f9851f, v7Var, lVar);
        return u7Var;
    }

    public Set b() {
        return this.f9850e;
    }

    public Uri c() {
        return this.f9848c;
    }

    public Map d() {
        return this.f9851f;
    }

    public z7 e() {
        return this.f9849d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u7)) {
            return false;
        }
        u7 u7Var = (u7) obj;
        if (this.f9846a != u7Var.f9846a || this.f9847b != u7Var.f9847b) {
            return false;
        }
        Uri uri = this.f9848c;
        if (uri == null ? u7Var.f9848c != null : !uri.equals(u7Var.f9848c)) {
            return false;
        }
        z7 z7Var = this.f9849d;
        if (z7Var == null ? u7Var.f9849d != null : !z7Var.equals(u7Var.f9849d)) {
            return false;
        }
        Set set = this.f9850e;
        if (set == null ? u7Var.f9850e != null : !set.equals(u7Var.f9850e)) {
            return false;
        }
        Map map = this.f9851f;
        if (map != null) {
            return map.equals(u7Var.f9851f);
        }
        return u7Var.f9851f == null;
    }

    public int hashCode() {
        int i10 = ((this.f9846a * 31) + this.f9847b) * 31;
        Uri uri = this.f9848c;
        int iHashCode = (i10 + (uri != null ? uri.hashCode() : 0)) * 31;
        z7 z7Var = this.f9849d;
        int iHashCode2 = (iHashCode + (z7Var != null ? z7Var.hashCode() : 0)) * 31;
        Set set = this.f9850e;
        int iHashCode3 = (iHashCode2 + (set != null ? set.hashCode() : 0)) * 31;
        Map map = this.f9851f;
        return iHashCode3 + (map != null ? map.hashCode() : 0);
    }

    public String toString() {
        return "VastCompanionAd{width=" + this.f9846a + ", height=" + this.f9847b + ", destinationUri=" + this.f9848c + ", nonVideoResource=" + this.f9849d + ", clickTrackers=" + this.f9850e + ", eventTrackers=" + this.f9851f + '}';
    }

    public static u7 a(JSONObject jSONObject, com.applovin.impl.sdk.l lVar) {
        if (jSONObject == null) {
            return null;
        }
        int i10 = JsonUtils.getInt(jSONObject, "width", 0);
        int i11 = JsonUtils.getInt(jSONObject, "height", 0);
        String string = JsonUtils.getString(jSONObject, "destination_uri", null);
        Uri uri = StringUtils.isValidString(string) ? Uri.parse(string) : null;
        z7 z7VarA = z7.a(JsonUtils.getJSONObject(jSONObject, "non_video_resource", (JSONObject) null), lVar);
        JSONArray jSONArrayX = defpackage.e.x("click_trackers", jSONObject);
        HashSet hashSet = new HashSet();
        for (int i12 = 0; i12 < jSONArrayX.length(); i12++) {
            b8 b8VarA = b8.a(JsonUtils.getJSONObject(jSONArrayX, i12, (JSONObject) null), lVar);
            if (b8VarA != null) {
                hashSet.add(b8VarA);
            }
        }
        u7 u7Var = new u7();
        u7Var.f9846a = i10;
        u7Var.f9847b = i11;
        u7Var.f9848c = uri;
        u7Var.f9849d = z7VarA;
        u7Var.f9850e.addAll(hashSet);
        return u7Var;
    }

    @Override // com.applovin.impl.s4
    public JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        JsonUtils.putInt(jSONObject, "width", this.f9846a);
        JsonUtils.putInt(jSONObject, "height", this.f9847b);
        Uri uri = this.f9848c;
        JsonUtils.putString(jSONObject, "destination_uri", uri == null ? null : uri.toString());
        z7 z7Var = this.f9849d;
        JsonUtils.putJSONObject(jSONObject, "non_video_resource", z7Var != null ? z7Var.a() : null);
        JSONArray jSONArray = new JSONArray();
        Iterator it = this.f9850e.iterator();
        while (it.hasNext()) {
            jSONArray.put(((b8) it.next()).a());
        }
        JsonUtils.putJsonArray(jSONObject, "click_trackers", jSONArray);
        return jSONObject;
    }
}
