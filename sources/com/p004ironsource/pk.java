package com.p004ironsource;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.p004ironsource.mediationsdk.logger.IronLog;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public class pk {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f26500b = "pk";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f26501c = "supersonic_shared_preferen";
    private static final String d = "version";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String f26502e = "back_button_state";
    private static final String f = "search_keys";
    private static final String g = "^\\d+_\\d+$";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static pk f26503h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private SharedPreferences f26504a;

    private pk(Context context) {
        this.f26504a = context.getSharedPreferences("supersonic_shared_preferen", 0);
    }

    public static synchronized pk a(Context context) {
        try {
            if (f26503h == null) {
                f26503h = new pk(context);
            }
        } catch (Throwable th) {
            throw th;
        }
        return f26503h;
    }

    public static synchronized pk e() {
        return f26503h;
    }

    public mh.a b() {
        int i2 = Integer.parseInt(this.f26504a.getString(f26502e, "2"));
        if (i2 == 0) {
            return mh.a.None;
        }
        if (i2 == 1) {
            return mh.a.Device;
        }
        return i2 == 2 ? mh.a.Controller : mh.a.Controller;
    }

    public String c() {
        return this.f26504a.getString("version", x4.DISABLED_AUCTION_FALLBACK_ID);
    }

    public List<String> d() {
        String string = this.f26504a.getString(f, null);
        ArrayList arrayList = new ArrayList();
        if (string != null) {
            is isVar = new is(string);
            if (isVar.a(d9.h.f24715R)) {
                try {
                    arrayList.addAll(isVar.a((JSONArray) isVar.b(d9.h.f24715R)));
                    return arrayList;
                } catch (JSONException e2) {
                    q9.d().a(e2);
                    IronLog.INTERNAL.error(e2.toString());
                }
            }
        }
        return arrayList;
    }

    private boolean b(String str) {
        return str.matches(g);
    }

    public String a(String str) {
        String string = this.f26504a.getString(str, null);
        return string != null ? string : JsonUtils.EMPTY_JSON;
    }

    public void c(String str) {
        SharedPreferences.Editor editorEdit = this.f26504a.edit();
        editorEdit.putString(f26502e, str);
        editorEdit.apply();
    }

    public void d(String str) {
        if (c().equalsIgnoreCase(str)) {
            return;
        }
        SharedPreferences.Editor editorEdit = this.f26504a.edit();
        editorEdit.putString("version", str);
        editorEdit.apply();
    }

    public void e(String str) {
        SharedPreferences.Editor editorEdit = this.f26504a.edit();
        editorEdit.putString(f, str);
        editorEdit.apply();
    }

    public ArrayList<String> a() {
        ArrayList<String> arrayList = new ArrayList<>();
        String[] strArr = (String[]) this.f26504a.getAll().keySet().toArray(new String[0]);
        SharedPreferences.Editor editorEdit = this.f26504a.edit();
        for (String str : strArr) {
            if (b(str)) {
                arrayList.add(str);
                editorEdit.remove(str);
            }
        }
        editorEdit.apply();
        return arrayList;
    }

    public void a(String str, String str2) {
        SharedPreferences.Editor editorEdit = this.f26504a.edit();
        editorEdit.putString(str, str2);
        editorEdit.apply();
    }

    public boolean a(String str, String str2, String str3) {
        String string = this.f26504a.getString("ssaUserData", null);
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
            SharedPreferences.Editor editorEdit = this.f26504a.edit();
            editorEdit.putString("ssaUserData", jSONObject.toString());
            editorEdit.apply();
            return true;
        } catch (JSONException e2) {
            q9.d().a(e2);
            IronLog.INTERNAL.error(e2.toString());
            return false;
        }
    }
}
