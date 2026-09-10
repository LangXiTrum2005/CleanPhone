package com.applovin.impl;

import com.applovin.impl.sdk.utils.JsonUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public class s7 implements s4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f9248a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List f9249b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f9250c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Set f9251d;

    private s7(String str, List list, String str2, Set set) {
        this.f9248a = str;
        this.f9249b = list;
        this.f9250c = str2;
        this.f9251d = set;
    }

    public static s7 a(q8 q8Var, v7 v7Var, com.applovin.impl.sdk.l lVar) {
        try {
            String str = (String) q8Var.a().get("vendor");
            q8 q8VarB = q8Var.b("VerificationParameters");
            String strD = q8VarB != null ? q8VarB.d() : null;
            List listA = q8Var.a("JavaScriptResource");
            ArrayList arrayList = new ArrayList(listA.size());
            Iterator it = listA.iterator();
            while (it.hasNext()) {
                y7 y7VarA = y7.a((q8) it.next(), lVar);
                if (y7VarA != null) {
                    arrayList.add(y7VarA);
                }
            }
            HashMap map = new HashMap();
            d8.a(q8Var, map, v7Var, lVar);
            return new s7(str, arrayList, strD, (Set) map.get("verificationNotExecuted"));
        } catch (Throwable th2) {
            lVar.Q();
            if (com.applovin.impl.sdk.p.a()) {
                lVar.Q().a("VastAdVerification", "Error occurred while initializing", th2);
            }
            lVar.E().a("VastAdVerification", th2);
            return null;
        }
    }

    public Set b() {
        return this.f9251d;
    }

    public List c() {
        return this.f9249b;
    }

    public String d() {
        return this.f9248a;
    }

    public String e() {
        return this.f9250c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            s7 s7Var = (s7) obj;
            String str = this.f9248a;
            if (str == null ? s7Var.f9248a != null : !str.equals(s7Var.f9248a)) {
                return false;
            }
            List list = this.f9249b;
            if (list == null ? s7Var.f9249b != null : !list.equals(s7Var.f9249b)) {
                return false;
            }
            String str2 = this.f9250c;
            if (str2 == null ? s7Var.f9250c != null : !str2.equals(s7Var.f9250c)) {
                return false;
            }
            Set set = this.f9251d;
            if (set != null) {
                return set.equals(s7Var.f9251d);
            }
            if (s7Var.f9251d == null) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        String str = this.f9248a;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        List list = this.f9249b;
        int iHashCode2 = (iHashCode + (list != null ? list.hashCode() : 0)) * 31;
        String str2 = this.f9250c;
        int iHashCode3 = (iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        Set set = this.f9251d;
        return iHashCode3 + (set != null ? set.hashCode() : 0);
    }

    public String toString() {
        return "VastAdVerification{vendorId='" + this.f9248a + "'javascriptResources='" + this.f9249b + "'verificationParameters='" + this.f9250c + "'errorEventTrackers='" + this.f9251d + "'}";
    }

    public static s7 a(JSONObject jSONObject, com.applovin.impl.sdk.l lVar) {
        if (jSONObject == null) {
            return null;
        }
        String string = JsonUtils.getString(jSONObject, "vendor_id", null);
        JSONArray jSONArrayX = defpackage.e.x("javascript_resources", jSONObject);
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < jSONArrayX.length(); i10++) {
            y7 y7VarA = y7.a(JsonUtils.getJSONObject(jSONArrayX, i10, (JSONObject) null), lVar);
            if (y7VarA != null) {
                arrayList.add(y7VarA);
            }
        }
        String string2 = JsonUtils.getString(jSONObject, "verification_parameters", null);
        JSONArray jSONArrayX2 = defpackage.e.x("error_event_trackers", jSONObject);
        HashSet hashSet = new HashSet();
        for (int i11 = 0; i11 < jSONArrayX2.length(); i11++) {
            b8 b8VarA = b8.a(JsonUtils.getJSONObject(jSONArrayX2, i11, (JSONObject) null), lVar);
            if (b8VarA != null) {
                hashSet.add(b8VarA);
            }
        }
        return new s7(string, arrayList, string2, hashSet);
    }

    @Override // com.applovin.impl.s4
    public JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        JsonUtils.putString(jSONObject, "vendor_id", this.f9248a);
        if (this.f9249b != null) {
            JSONArray jSONArray = new JSONArray();
            Iterator it = this.f9249b.iterator();
            while (it.hasNext()) {
                jSONArray.put(((y7) it.next()).a());
            }
            JsonUtils.putJsonArray(jSONObject, "javascript_resources", jSONArray);
        }
        JsonUtils.putString(jSONObject, "verification_parameters", this.f9250c);
        if (this.f9251d != null) {
            JSONArray jSONArray2 = new JSONArray();
            Iterator it2 = this.f9251d.iterator();
            while (it2.hasNext()) {
                jSONArray2.put(((b8) it2.next()).a());
            }
            JsonUtils.putJsonArray(jSONObject, "error_event_trackers", jSONArray2);
        }
        return jSONObject;
    }
}
