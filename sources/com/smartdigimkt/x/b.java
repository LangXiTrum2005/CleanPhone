package com.smartdigimkt.x;

import android.text.TextUtils;
import java.io.Serializable;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class b implements Serializable, com.smartdigimkt.w1.a {
    private static final String k = "https://img.toponad.com/sdk/app-permissions.html?key=";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static String f39648l = "app_name";
    private static String m = "perm_desc";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static String f39649n = "ori_perm_desc";
    private static String o = "ori_perm_all";

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static String f39650p = "pri_url";
    private static String q = "upd_time";
    private static String r = "app_ver";
    private static String s = "dev_name";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f39651a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f39652b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ArrayList<String> f39653c = new ArrayList<>(3);
    private ArrayList<String> d = new ArrayList<>(3);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private ArrayList<String> f39654e = new ArrayList<>(3);
    private String f;
    private String g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private String f39655h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private String f39656i;
    private String j;

    private static b a(b bVar) {
        return bVar == null ? new b() : bVar;
    }

    public String b() {
        return this.f39652b;
    }

    public void c(String str) {
        this.f39652b = str;
    }

    public void d(ArrayList<String> arrayList) {
        this.d = arrayList;
    }

    public String e() {
        return this.f39651a;
    }

    public void f(String str) {
        this.f39651a = str;
    }

    public void g(String str) {
        this.f = str;
    }

    public ArrayList<String> h() {
        return this.d;
    }

    public String i() {
        return this.f;
    }

    public String j() {
        return this.g;
    }

    public String k() {
        return this.f39655h;
    }

    public JSONObject l() {
        try {
            JSONObject jSONObject = new JSONObject(this.f39651a);
            if (jSONObject.length() > 0) {
                return jSONObject;
            }
            return null;
        } catch (JSONException e2) {
            e2.printStackTrace();
            return null;
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ApkDisplayInfo{appName='");
        sb.append(this.f39652b);
        sb.append("', permDescJArray=");
        sb.append(this.f39653c);
        sb.append(", permDescOriJArray=");
        sb.append(this.d);
        sb.append(", permDescAll=");
        sb.append(this.f39654e);
        sb.append(", priUrl='");
        sb.append(this.g);
        sb.append("', updateTime='");
        sb.append(this.f39655h);
        sb.append("', appVersion='");
        sb.append(this.f39656i);
        sb.append("', devName='");
        return android.support.v4.media.a.r(sb, this.j, "'}");
    }

    public static ArrayList<String> a(JSONArray jSONArray) {
        if (jSONArray == null || jSONArray.length() <= 0) {
            return null;
        }
        ArrayList<String> arrayList = new ArrayList<>();
        for (int i2 = 0; i2 < jSONArray.length(); i2++) {
            arrayList.add(jSONArray.optString(i2));
        }
        return arrayList;
    }

    public void b(ArrayList<String> arrayList) {
        this.f39654e = arrayList;
    }

    public void c(ArrayList<String> arrayList) {
        this.f39653c = arrayList;
    }

    public void d(String str) {
        this.f39656i = str;
    }

    public void e(String str) {
        this.j = str;
    }

    public ArrayList<String> f() {
        return this.f39654e;
    }

    public ArrayList<String> g() {
        return this.f39653c;
    }

    public void h(String str) {
        this.g = str;
    }

    public void i(String str) {
        this.f39655h = str;
    }

    public static b b(String str) {
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

    public String c() {
        return this.f39656i;
    }

    public String d() {
        return this.j;
    }

    public static JSONArray a(ArrayList<String> arrayList) {
        if (arrayList == null || arrayList.size() <= 0) {
            return null;
        }
        JSONArray jSONArray = new JSONArray();
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            jSONArray.put(arrayList.get(i2));
        }
        return jSONArray;
    }

    public static b a(JSONObject jSONObject) {
        b bVarA = null;
        if (jSONObject != null) {
            if (jSONObject.has(f39648l)) {
                bVarA = a((b) null);
                bVarA.c(jSONObject.optString(f39648l));
            }
            if (jSONObject.has(m)) {
                bVarA = a(bVarA);
                JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray(m);
                if (jSONArrayOptJSONArray != null) {
                    bVarA.c(a(jSONArrayOptJSONArray));
                    ArrayList<String> arrayListF = bVarA.f();
                    String str = k;
                    for (int i2 = 0; i2 < jSONArrayOptJSONArray.length(); i2++) {
                        try {
                            if (jSONArrayOptJSONArray.get(i2) instanceof String) {
                                str = i2 == 0 ? str + jSONArrayOptJSONArray.optString(i2) : str + "," + jSONArrayOptJSONArray.optString(i2);
                            }
                        } catch (JSONException e2) {
                            e2.printStackTrace();
                        }
                    }
                    bVarA.g(str);
                    bVarA.b(arrayListF);
                }
            }
            if (jSONObject.has(f39649n)) {
                bVarA = a(bVarA);
                JSONArray jSONArrayOptJSONArray2 = jSONObject.optJSONArray(f39649n);
                if (jSONArrayOptJSONArray2 != null) {
                    bVarA.d(a(jSONArrayOptJSONArray2));
                    ArrayList<String> arrayListF2 = bVarA.f();
                    for (int i3 = 0; i3 < jSONArrayOptJSONArray2.length(); i3++) {
                        try {
                            Object obj = jSONArrayOptJSONArray2.get(i3);
                            if (obj instanceof String) {
                                arrayListF2.add((String) obj);
                            }
                        } catch (JSONException e3) {
                            e3.printStackTrace();
                        }
                    }
                    bVarA.b(arrayListF2);
                }
            }
            if (jSONObject.has(f39650p)) {
                bVarA = a(bVarA);
                bVarA.h(jSONObject.optString(f39650p));
            }
            if (jSONObject.has(q)) {
                bVarA = a(bVarA);
                bVarA.i(jSONObject.optString(q));
            }
            if (jSONObject.has(r)) {
                bVarA = a(bVarA);
                bVarA.d(jSONObject.optString(r));
            }
            if (jSONObject.has(s)) {
                bVarA = a(bVarA);
                bVarA.e(jSONObject.optString(s));
            }
            if (bVarA != null) {
                bVarA.f(jSONObject.toString());
            }
        }
        return bVarA;
    }
}
