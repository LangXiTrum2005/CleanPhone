package com.p004ironsource.sdk.controller;

import android.app.Activity;
import android.content.Context;
import com.p004ironsource.mediationsdk.logger.IronLog;
import com.p004ironsource.mh;
import com.p004ironsource.pg;
import com.p004ironsource.q9;
import com.p004ironsource.v9;
import com.p004ironsource.va;
import com.p004ironsource.w9;
import com.p004ironsource.x9;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public class n implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final pg f26954a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f26955b;

    public class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ l.a f26956a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.ironsource.sdk.controller.f.c f26957b;

        public a(l.a aVar, com.ironsource.sdk.controller.f.c cVar) {
            this.f26956a = aVar;
            this.f26957b = cVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                if (this.f26956a == null) {
                    return;
                }
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("success", false);
                jSONObject.put("reason", n.this.f26955b);
                this.f26956a.a(new com.ironsource.sdk.controller.f.a(this.f26957b.getCom.ironsource.sdk.controller.f.b.b java.lang.String(), jSONObject));
            } catch (JSONException e2) {
                q9.d().a(e2);
                IronLog.INTERNAL.error(e2.toString());
            }
        }
    }

    public class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ x9 f26959a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ va f26960b;

        public b(x9 x9Var, va vaVar) {
            this.f26959a = x9Var;
            this.f26960b = vaVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f26959a.a(mh.e.RewardedVideo, this.f26960b.h(), n.this.f26955b);
        }
    }

    public class c implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ x9 f26962a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ JSONObject f26963b;

        public c(x9 x9Var, JSONObject jSONObject) {
            this.f26962a = x9Var;
            this.f26963b = jSONObject;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f26962a.d(this.f26963b.optString("demandSourceName"), n.this.f26955b);
        }
    }

    public class d implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ w9 f26965a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ va f26966b;

        public d(w9 w9Var, va vaVar) {
            this.f26965a = w9Var;
            this.f26966b = vaVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f26965a.a(mh.e.Interstitial, this.f26966b.h(), n.this.f26955b);
        }
    }

    public class e implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ w9 f26968a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f26969b;

        public e(w9 w9Var, String str) {
            this.f26968a = w9Var;
            this.f26969b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f26968a.c(this.f26969b, n.this.f26955b);
        }
    }

    public class f implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ w9 f26971a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ va f26972b;

        public f(w9 w9Var, va vaVar) {
            this.f26971a = w9Var;
            this.f26972b = vaVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f26971a.c(this.f26972b.h(), n.this.f26955b);
        }
    }

    public class g implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ w9 f26974a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ JSONObject f26975b;

        public g(w9 w9Var, JSONObject jSONObject) {
            this.f26974a = w9Var;
            this.f26975b = jSONObject;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f26974a.b(this.f26975b.optString("demandSourceName"), n.this.f26955b);
        }
    }

    public class h implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ w9 f26977a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ va f26978b;

        public h(w9 w9Var, va vaVar) {
            this.f26977a = w9Var;
            this.f26978b = vaVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f26977a.b(this.f26978b.h(), n.this.f26955b);
        }
    }

    public class i implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ v9 f26980a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Map f26981b;

        public i(v9 v9Var, Map map) {
            this.f26980a = v9Var;
            this.f26981b = map;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f26980a.a((String) this.f26981b.get("demandSourceName"), n.this.f26955b);
        }
    }

    public class j implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ v9 f26983a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ JSONObject f26984b;

        public j(v9 v9Var, JSONObject jSONObject) {
            this.f26983a = v9Var;
            this.f26984b = jSONObject;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f26983a.a(this.f26984b.optString("demandSourceName"), n.this.f26955b);
        }
    }

    public n(String str, pg pgVar) {
        this.f26954a = pgVar;
        this.f26955b = str;
    }

    @Override // com.p004ironsource.sdk.controller.l
    public void b(Context context) {
    }

    @Override // com.p004ironsource.sdk.controller.l
    public void d() {
    }

    @Override // com.p004ironsource.sdk.controller.l
    public void destroy() {
    }

    @Override // com.p004ironsource.sdk.controller.l
    public void e() {
    }

    @Override // com.p004ironsource.sdk.controller.l
    public void f() {
    }

    @Override // com.p004ironsource.sdk.controller.l
    public mh.c g() {
        return mh.c.Native;
    }

    @Override // com.p004ironsource.sdk.controller.l
    public void a() {
    }

    @Override // com.p004ironsource.sdk.controller.l
    public void b(va vaVar) {
    }

    @Override // com.p004ironsource.sdk.controller.l
    public void a(Activity activity) {
    }

    @Override // com.p004ironsource.sdk.controller.l
    public void b(va vaVar, Map<String, String> map, w9 w9Var) {
        if (w9Var != null) {
            a(new f(w9Var, vaVar));
        }
    }

    @Override // com.p004ironsource.sdk.controller.l
    public void a(Context context) {
    }

    @Override // com.p004ironsource.sdk.controller.l
    public void b(JSONObject jSONObject) {
    }

    @Override // com.p004ironsource.sdk.controller.l
    public void a(com.ironsource.sdk.controller.f.c cVar, l.a aVar) {
        a(new a(aVar, cVar));
    }

    @Override // com.p004ironsource.sdk.controller.l
    public void a(va vaVar) {
    }

    @Override // com.p004ironsource.sdk.controller.l
    public void a(va vaVar, Map<String, String> map, v9 v9Var) {
        if (v9Var != null) {
            a(new i(v9Var, map));
        }
    }

    @Override // com.p004ironsource.sdk.controller.l
    public void a(va vaVar, Map<String, String> map, w9 w9Var) {
        if (w9Var != null) {
            a(new h(w9Var, vaVar));
        }
    }

    public void a(Runnable runnable) {
        pg pgVar = this.f26954a;
        if (pgVar != null) {
            pgVar.c(runnable);
        }
    }

    @Override // com.p004ironsource.sdk.controller.l
    public void a(String str, w9 w9Var) {
        if (w9Var != null) {
            a(new e(w9Var, str));
        }
    }

    @Override // com.p004ironsource.sdk.controller.l
    public void a(String str, String str2, va vaVar, v9 v9Var) {
        if (v9Var != null) {
            v9Var.a(mh.e.Banner, vaVar.h(), this.f26955b);
        }
    }

    @Override // com.p004ironsource.sdk.controller.l
    public void a(String str, String str2, va vaVar, w9 w9Var) {
        if (w9Var != null) {
            a(new d(w9Var, vaVar));
        }
    }

    @Override // com.p004ironsource.sdk.controller.l
    public void a(String str, String str2, va vaVar, x9 x9Var) {
        if (x9Var != null) {
            a(new b(x9Var, vaVar));
        }
    }

    @Override // com.p004ironsource.sdk.controller.l
    public void a(JSONObject jSONObject) {
    }

    @Override // com.p004ironsource.sdk.controller.l
    public void a(JSONObject jSONObject, v9 v9Var) {
        if (v9Var != null) {
            a(new j(v9Var, jSONObject));
        }
    }

    @Override // com.p004ironsource.sdk.controller.l
    public void a(JSONObject jSONObject, w9 w9Var) {
        if (w9Var != null) {
            a(new g(w9Var, jSONObject));
        }
    }

    @Override // com.p004ironsource.sdk.controller.l
    public void a(JSONObject jSONObject, x9 x9Var) {
        if (x9Var != null) {
            a(new c(x9Var, jSONObject));
        }
    }

    @Override // com.p004ironsource.sdk.controller.l
    public boolean a(String str) {
        return false;
    }
}
