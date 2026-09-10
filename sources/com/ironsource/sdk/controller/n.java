package com.ironsource.sdk.controller;

import android.app.Activity;
import android.content.Context;
import com.ironsource.C0474n4;
import com.ironsource.C0514p8;
import com.ironsource.InterfaceC0563s4;
import com.ironsource.InterfaceC0581t4;
import com.ironsource.InterfaceC0599u4;
import com.ironsource.R7;
import com.ironsource.T4;
import com.ironsource.mediationsdk.logger.IronLog;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class n implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final R7 f30431a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f30432b;

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ l.a f30433a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.ironsource.sdk.controller.f.c f30434b;

        public a(l.a aVar, com.ironsource.sdk.controller.f.c cVar) {
            this.f30433a = aVar;
            this.f30434b = cVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                if (this.f30433a == null) {
                    return;
                }
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("success", false);
                jSONObject.put("reason", n.this.f30432b);
                this.f30433a.a(new com.ironsource.sdk.controller.f.a(this.f30434b.f(), jSONObject));
            } catch (JSONException e10) {
                C0474n4.d().a(e10);
                IronLog.INTERNAL.error(e10.toString());
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC0599u4 f30436a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ T4 f30437b;

        public b(InterfaceC0599u4 interfaceC0599u4, T4 t10) {
            this.f30436a = interfaceC0599u4;
            this.f30437b = t10;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f30436a.a(C0514p8.e.RewardedVideo, this.f30437b.h(), n.this.f30432b);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class c implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC0599u4 f30439a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ JSONObject f30440b;

        public c(InterfaceC0599u4 interfaceC0599u4, JSONObject jSONObject) {
            this.f30439a = interfaceC0599u4;
            this.f30440b = jSONObject;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f30439a.b(this.f30440b.optString("demandSourceName"), n.this.f30432b);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class d implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC0581t4 f30442a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ T4 f30443b;

        public d(InterfaceC0581t4 interfaceC0581t4, T4 t10) {
            this.f30442a = interfaceC0581t4;
            this.f30443b = t10;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f30442a.a(C0514p8.e.Interstitial, this.f30443b.h(), n.this.f30432b);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class e implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC0581t4 f30445a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f30446b;

        public e(InterfaceC0581t4 interfaceC0581t4, String str) {
            this.f30445a = interfaceC0581t4;
            this.f30446b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f30445a.a(this.f30446b, n.this.f30432b);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class f implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC0581t4 f30448a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ T4 f30449b;

        public f(InterfaceC0581t4 interfaceC0581t4, T4 t10) {
            this.f30448a = interfaceC0581t4;
            this.f30449b = t10;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f30448a.a(this.f30449b.h(), n.this.f30432b);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class g implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC0581t4 f30451a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ JSONObject f30452b;

        public g(InterfaceC0581t4 interfaceC0581t4, JSONObject jSONObject) {
            this.f30451a = interfaceC0581t4;
            this.f30452b = jSONObject;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f30451a.d(this.f30452b.optString("demandSourceName"), n.this.f30432b);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class h implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC0581t4 f30454a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ T4 f30455b;

        public h(InterfaceC0581t4 interfaceC0581t4, T4 t10) {
            this.f30454a = interfaceC0581t4;
            this.f30455b = t10;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f30454a.d(this.f30455b.h(), n.this.f30432b);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class i implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC0563s4 f30457a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Map f30458b;

        public i(InterfaceC0563s4 interfaceC0563s4, Map map) {
            this.f30457a = interfaceC0563s4;
            this.f30458b = map;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f30457a.c((String) this.f30458b.get("demandSourceName"), n.this.f30432b);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class j implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC0563s4 f30460a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ JSONObject f30461b;

        public j(InterfaceC0563s4 interfaceC0563s4, JSONObject jSONObject) {
            this.f30460a = interfaceC0563s4;
            this.f30461b = jSONObject;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f30460a.c(this.f30461b.optString("demandSourceName"), n.this.f30432b);
        }
    }

    public n(String str, R7 r10) {
        this.f30431a = r10;
        this.f30432b = str;
    }

    @Override // com.ironsource.sdk.controller.l
    public void b() {
    }

    @Override // com.ironsource.sdk.controller.l
    public C0514p8.c h() {
        return C0514p8.c.Native;
    }

    @Override // com.ironsource.sdk.controller.l
    public void a() {
    }

    @Override // com.ironsource.sdk.controller.l
    public void b(Context context) {
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(Activity activity) {
    }

    @Override // com.ironsource.sdk.controller.l
    public void b(T4 t10) {
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(Context context) {
    }

    @Override // com.ironsource.sdk.controller.l
    public void b(JSONObject jSONObject) {
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(T4 t10) {
    }

    @Override // com.ironsource.sdk.controller.l
    public void b(T4 t10, Map<String, String> map, InterfaceC0581t4 interfaceC0581t4) {
        if (interfaceC0581t4 != null) {
            a(new f(interfaceC0581t4, t10));
        }
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(JSONObject jSONObject) {
    }

    @Override // com.ironsource.sdk.controller.l
    public boolean a(String str) {
        return false;
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(String str, String str2, T4 t10, InterfaceC0599u4 interfaceC0599u4) {
        if (interfaceC0599u4 != null) {
            a(new b(interfaceC0599u4, t10));
        }
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(JSONObject jSONObject, InterfaceC0599u4 interfaceC0599u4) {
        if (interfaceC0599u4 != null) {
            a(new c(interfaceC0599u4, jSONObject));
        }
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(String str, String str2, T4 t10, InterfaceC0581t4 interfaceC0581t4) {
        if (interfaceC0581t4 != null) {
            a(new d(interfaceC0581t4, t10));
        }
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(String str, InterfaceC0581t4 interfaceC0581t4) {
        if (interfaceC0581t4 != null) {
            a(new e(interfaceC0581t4, str));
        }
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(JSONObject jSONObject, InterfaceC0581t4 interfaceC0581t4) {
        if (interfaceC0581t4 != null) {
            a(new g(interfaceC0581t4, jSONObject));
        }
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(T4 t10, Map<String, String> map, InterfaceC0581t4 interfaceC0581t4) {
        if (interfaceC0581t4 != null) {
            a(new h(interfaceC0581t4, t10));
        }
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(String str, String str2, T4 t10, InterfaceC0563s4 interfaceC0563s4) {
        if (interfaceC0563s4 != null) {
            interfaceC0563s4.a(C0514p8.e.Banner, t10.h(), this.f30432b);
        }
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(T4 t10, Map<String, String> map, InterfaceC0563s4 interfaceC0563s4) {
        if (interfaceC0563s4 != null) {
            a(new i(interfaceC0563s4, map));
        }
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(JSONObject jSONObject, InterfaceC0563s4 interfaceC0563s4) {
        if (interfaceC0563s4 != null) {
            a(new j(interfaceC0563s4, jSONObject));
        }
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(com.ironsource.sdk.controller.f.c cVar, l.a aVar) {
        a(new a(aVar, cVar));
    }

    public void a(Runnable runnable) {
        R7 r10 = this.f30431a;
        if (r10 != null) {
            r10.c(runnable);
        }
    }

    @Override // com.ironsource.sdk.controller.l
    public void e() {
    }

    @Override // com.ironsource.sdk.controller.l
    public void f() {
    }

    @Override // com.ironsource.sdk.controller.l
    public void g() {
    }
}
