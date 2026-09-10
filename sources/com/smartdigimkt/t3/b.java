package com.smartdigimkt.t3;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Map<String, a> f38707a = new HashMap();

    public static class a {
        private static final int d = 1;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final int f38708e = 2;
        private static final int f = 3;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f38709a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f38710b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f38711c;

        public String a() {
            int i2 = this.f38710b;
            if (i2 != 2) {
                return i2 != 3 ? this.f38709a : Matcher.quoteReplacement(this.f38711c);
            }
            return "";
        }
    }

    public void a(JSONArray jSONArray) {
        this.f38707a.clear();
        if (jSONArray == null || jSONArray.length() <= 0) {
            return;
        }
        for (int i2 = 0; i2 < jSONArray.length(); i2++) {
            try {
                JSONObject jSONObject = jSONArray.getJSONObject(i2);
                String strOptString = jSONObject.optString("macro");
                if (!TextUtils.isEmpty(strOptString)) {
                    a aVar = new a();
                    aVar.f38709a = strOptString;
                    aVar.f38710b = jSONObject.optInt("action", 1);
                    aVar.f38711c = jSONObject.optString("value", "");
                    this.f38707a.put(strOptString, aVar);
                }
            } catch (Throwable unused) {
            }
        }
    }

    public String a(String str, String str2) {
        a aVar;
        Map<String, a> map = this.f38707a;
        return (map == null || (aVar = map.get(str)) == null) ? str2 : aVar.a();
    }
}
