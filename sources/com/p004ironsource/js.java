package com.p004ironsource;

import android.app.Activity;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
@Deprecated
public interface js {
    void a(Activity activity);

    void a(String str, String str2, int i2);

    void a(String str, String str2, String str3, Map<String, String> map, np npVar);

    void a(String str, String str2, String str3, Map<String, String> map, sp spVar);

    void a(JSONObject jSONObject);

    boolean a(String str);

    void b(JSONObject jSONObject);

    void c(JSONObject jSONObject);

    void onPause(Activity activity);

    void onResume(Activity activity);
}
