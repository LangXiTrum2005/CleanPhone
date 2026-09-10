package com.p004ironsource.sdk.controller;

import android.app.Activity;
import android.content.Context;
import com.p004ironsource.mh;
import com.p004ironsource.qn;
import com.p004ironsource.v9;
import com.p004ironsource.va;
import com.p004ironsource.w9;
import com.p004ironsource.x9;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public interface l {

    public interface a {
        void a(f.a aVar);
    }

    public interface b {
        void a(qn qnVar);
    }

    void a();

    void a(Activity activity);

    void a(Context context);

    void a(f.c cVar, a aVar);

    void a(va vaVar);

    void a(va vaVar, Map<String, String> map, v9 v9Var);

    void a(va vaVar, Map<String, String> map, w9 w9Var);

    void a(String str, w9 w9Var);

    void a(String str, String str2, va vaVar, v9 v9Var);

    void a(String str, String str2, va vaVar, w9 w9Var);

    void a(String str, String str2, va vaVar, x9 x9Var);

    void a(JSONObject jSONObject);

    void a(JSONObject jSONObject, v9 v9Var);

    void a(JSONObject jSONObject, w9 w9Var);

    void a(JSONObject jSONObject, x9 x9Var);

    boolean a(String str);

    void b(Context context);

    void b(va vaVar);

    void b(va vaVar, Map<String, String> map, w9 w9Var);

    void b(JSONObject jSONObject);

    void d();

    void destroy();

    @Deprecated
    void e();

    void f();

    mh.c g();
}
