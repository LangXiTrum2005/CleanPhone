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

/* JADX INFO: renamed from: com.ironsource.aa, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C3422aa {
    private static final String b = "aa";
    private static final String c = "supersonic_shared_preferen";
    private static final String d = "version";
    private static final String e = "back_button_state";
    private static final String f = "search_keys";
    private static final String g = "^\\d+_\\d+$";
    private static C3422aa h;
    private SharedPreferences a;

    private C3422aa(Context context) {
        this.a = context.getSharedPreferences("supersonic_shared_preferen", 0);
    }

    public static synchronized C3422aa a(Context context) {
        try {
            if (h == null) {
                h = new C3422aa(context);
            }
        } catch (Throwable th) {
            throw th;
        }
        return h;
    }

    public static synchronized C3422aa e() {
        return h;
    }

    public C3653n8.a b() {
        int i = Integer.parseInt(this.a.getString(e, "2"));
        if (i == 0) {
            return C3653n8.a.None;
        }
        if (i == 1) {
            return C3653n8.a.Device;
        }
        return i == 2 ? C3653n8.a.Controller : C3653n8.a.Controller;
    }

    public void c(String str) {
        SharedPreferences.Editor editorEdit = this.a.edit();
        editorEdit.putString(e, str);
        editorEdit.apply();
    }

    public List<String> d() {
        String string = this.a.getString(f, null);
        ArrayList arrayList = new ArrayList();
        if (string != null) {
            Vd vd = new Vd(string);
            if (vd.a(X3.i.R)) {
                try {
                    arrayList.addAll(vd.a((JSONArray) vd.b(X3.i.R)));
                    return arrayList;
                } catch (JSONException e2) {
                    C3631m4.d().a(e2);
                    IronLog.INTERNAL.error(e2.toString());
                }
            }
        }
        return arrayList;
    }

    public void e(String str) {
        SharedPreferences.Editor editorEdit = this.a.edit();
        editorEdit.putString(f, str);
        editorEdit.apply();
    }

    public void a(String str, String str2) {
        SharedPreferences.Editor editorEdit = this.a.edit();
        editorEdit.putString(str, str2);
        editorEdit.apply();
    }

    public String c() {
        return this.a.getString("version", C3414a2.f);
    }

    public String a(String str) {
        String string = this.a.getString(str, null);
        return string != null ? string : JsonUtils.EMPTY_JSON;
    }

    private boolean b(String str) {
        return str.matches(g);
    }

    public boolean a(String str, String str2, String str3) {
        String string = this.a.getString("ssaUserData", null);
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
            SharedPreferences.Editor editorEdit = this.a.edit();
            editorEdit.putString("ssaUserData", jSONObject.toString());
            editorEdit.apply();
            return true;
        } catch (JSONException e2) {
            C3631m4.d().a(e2);
            IronLog.INTERNAL.error(e2.toString());
            return false;
        }
    }

    public void d(String str) {
        if (c().equalsIgnoreCase(str)) {
            return;
        }
        SharedPreferences.Editor editorEdit = this.a.edit();
        editorEdit.putString("version", str);
        editorEdit.apply();
    }

    public ArrayList<String> a() {
        ArrayList<String> arrayList = new ArrayList<>();
        String[] strArr = (String[]) this.a.getAll().keySet().toArray(new String[0]);
        SharedPreferences.Editor editorEdit = this.a.edit();
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
