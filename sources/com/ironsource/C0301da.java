package com.ironsource;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.ironsource.mediationsdk.logger.IronLog;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.da, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class C0301da {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f28460b = "da";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f28461c = "supersonic_shared_preferen";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f28462d = "version";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String f28463e = "back_button_state";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final String f28464f = "search_keys";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final String f28465g = "^\\d+_\\d+$";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static C0301da f28466h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private SharedPreferences f28467a;

    private C0301da(Context context) {
        this.f28467a = context.getSharedPreferences("supersonic_shared_preferen", 0);
    }

    public static synchronized C0301da a(Context context) {
        try {
            if (f28466h == null) {
                f28466h = new C0301da(context);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f28466h;
    }

    public static synchronized C0301da e() {
        return f28466h;
    }

    public C0514p8.a b() {
        int i10 = Integer.parseInt(this.f28467a.getString(f28463e, "2"));
        if (i10 == 0) {
            return C0514p8.a.None;
        }
        if (i10 == 1) {
            return C0514p8.a.Device;
        }
        return i10 == 2 ? C0514p8.a.Controller : C0514p8.a.Controller;
    }

    public void c(String str) {
        SharedPreferences.Editor editorEdit = this.f28467a.edit();
        editorEdit.putString(f28463e, str);
        editorEdit.apply();
    }

    public List<String> d() {
        String string = this.f28467a.getString(f28464f, null);
        ArrayList arrayList = new ArrayList();
        if (string != null) {
            C0395ie c0395ie = new C0395ie(string);
            if (c0395ie.a(X3.i.R)) {
                try {
                    arrayList.addAll(c0395ie.a((JSONArray) c0395ie.b(X3.i.R)));
                    return arrayList;
                } catch (JSONException e10) {
                    C0474n4.d().a(e10);
                    IronLog.INTERNAL.error(e10.toString());
                }
            }
        }
        return arrayList;
    }

    public void e(String str) {
        SharedPreferences.Editor editorEdit = this.f28467a.edit();
        editorEdit.putString(f28464f, str);
        editorEdit.apply();
    }

    public void a(String str, String str2) {
        SharedPreferences.Editor editorEdit = this.f28467a.edit();
        editorEdit.putString(str, str2);
        editorEdit.apply();
    }

    public String c() {
        return this.f28467a.getString("version", C0239a2.f28156f);
    }

    public String a(String str) {
        String string = this.f28467a.getString(str, null);
        return string != null ? string : JsonUtils.EMPTY_JSON;
    }

    private boolean b(String str) {
        return str.matches(f28465g);
    }

    public boolean a(String str, String str2, String str3) {
        String string = this.f28467a.getString("ssaUserData", null);
        if (TextUtils.isEmpty(string)) {
            return false;
        }
        try {
            JSONObject jSONObject = new JSONObject(string);
            if (jSONObject.isNull(str2)) {
                return false;
            }
            JSONObject jSONObject2 = jSONObject.getJSONObject(str2);
            if (jSONObject2.isNull(str3)) {
                return false;
            }
            jSONObject2.getJSONObject(str3).put("timestamp", str);
            SharedPreferences.Editor editorEdit = this.f28467a.edit();
            editorEdit.putString("ssaUserData", jSONObject.toString());
            editorEdit.apply();
            return true;
        } catch (JSONException e10) {
            C0474n4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
            return false;
        }
    }

    public void d(String str) {
        if (c().equalsIgnoreCase(str)) {
            return;
        }
        SharedPreferences.Editor editorEdit = this.f28467a.edit();
        editorEdit.putString("version", str);
        editorEdit.apply();
    }

    public ArrayList<String> a() {
        ArrayList<String> arrayList = new ArrayList<>();
        String[] strArr = (String[]) this.f28467a.getAll().keySet().toArray(new String[0]);
        SharedPreferences.Editor editorEdit = this.f28467a.edit();
        for (String str : strArr) {
            if (b(str)) {
                arrayList.add(str);
                editorEdit.remove(str);
            }
        }
        editorEdit.apply();
        return arrayList;
    }
}
