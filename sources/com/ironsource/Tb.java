package com.ironsource;

import android.app.Activity;
import com.ironsource.sdk.utils.Logger;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class Tb implements Ub {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f27231a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.ironsource.sdk.controller.e f27232b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final U8 f27233c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final InterfaceC0292d1 f27234d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f27235e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Ub.a f27236f;

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f27237a = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final String f27238b = "nativeAd.load";

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final String f27239c = "nativeAd.loadReport";

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final String f27240d = "nativeAd.register";

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final String f27241e = "nativeAd.click";

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final String f27242f = "nativeAd.privacyClick";

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final String f27243g = "nativeAd.visibilityChanged";

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final String f27244h = "nativeAd.destroy";

        private a() {
        }
    }

    public Tb(String id2, com.ironsource.sdk.controller.e controllerManager, U8 imageLoader, InterfaceC0292d1 adViewManagement) {
        kotlin.jvm.internal.n.f(id2, "id");
        kotlin.jvm.internal.n.f(controllerManager, "controllerManager");
        kotlin.jvm.internal.n.f(imageLoader, "imageLoader");
        kotlin.jvm.internal.n.f(adViewManagement, "adViewManagement");
        this.f27231a = id2;
        this.f27232b = controllerManager;
        this.f27233c = imageLoader;
        this.f27234d = adViewManagement;
        this.f27235e = "Tb";
        controllerManager.a(id2, d());
    }

    @Override // com.ironsource.Ub
    public void a(Ub.a aVar) {
        this.f27236f = aVar;
    }

    @Override // com.ironsource.Ub
    public Ub.a b() {
        return this.f27236f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(Tb this$0, com.ironsource.sdk.controller.f.a it) {
        kotlin.jvm.internal.n.f(this$0, "this$0");
        kotlin.jvm.internal.n.f(it, "it");
        this$0.b(it);
    }

    private final com.ironsource.sdk.controller.l.b d() {
        return new ai(this, 0);
    }

    private final JSONObject e() throws JSONException {
        JSONObject jSONObjectPut = new JSONObject().put(com.ironsource.sdk.controller.f.b.f30392g, a.f27241e).put("sdkCallback", X3.h.U);
        kotlin.jvm.internal.n.e(jSONObjectPut, "JSONObject()\n        .pu…hods.ON_RECEIVED_MESSAGE)");
        return jSONObjectPut;
    }

    @Override // com.ironsource.Ub
    public void a(Activity activity, JSONObject loadParams) {
        kotlin.jvm.internal.n.f(activity, "activity");
        kotlin.jvm.internal.n.f(loadParams, "loadParams");
        this.f27232b.a(activity);
        this.f27232b.a(new com.ironsource.sdk.controller.f.c(this.f27231a, a.f27238b, loadParams), new yh(this, activity, 1));
    }

    @Override // com.ironsource.Ub
    public void c() {
        this.f27232b.a(new com.ironsource.sdk.controller.f.c(this.f27231a, a.f27242f, new JSONObject()), (com.ironsource.sdk.controller.l.a) null);
    }

    private final void b(com.ironsource.sdk.controller.f.a aVar) {
        if (aVar.d() == null) {
            Logger.i(this.f27235e, "failed to handle show on native ad: missing params");
            return;
        }
        if (!aVar.d().optBoolean("success", false)) {
            String strOptString = aVar.d().optString("reason", "unexpected error");
            Logger.i(this.f27235e, "failed to handle show on native ad: " + strOptString);
            return;
        }
        Ub.a aVarB = b();
        if (aVarB != null) {
            aVarB.a();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(Tb this$0, Activity activity, com.ironsource.sdk.controller.f.a it) {
        kotlin.jvm.internal.n.f(this$0, "this$0");
        kotlin.jvm.internal.n.f(activity, "$activity");
        kotlin.jvm.internal.n.f(it, "it");
        this$0.a(activity, it);
    }

    private final void a(Activity activity, com.ironsource.sdk.controller.f.a aVar) {
        if (aVar.d() == null) {
            Ub.a aVarB = b();
            if (aVarB != null) {
                aVarB.a("failed to load native ad: missing params");
                return;
            }
            return;
        }
        if (!aVar.d().optBoolean("success", false)) {
            String reason = aVar.d().optString("reason", "failed to load native ad: unexpected error");
            Ub.a aVarB2 = b();
            if (aVarB2 != null) {
                kotlin.jvm.internal.n.e(reason, "reason");
                aVarB2.a(reason);
                return;
            }
            return;
        }
        D8.b bVarA = new D8.a(this.f27233c, this.f27234d).a(activity, aVar.d());
        a(bVarA, bVarA.a().h());
    }

    public /* synthetic */ Tb(String str, com.ironsource.sdk.controller.e eVar, U8 u10, InterfaceC0292d1 interfaceC0292d1, int i10, kotlin.jvm.internal.g gVar) {
        if ((i10 & 4) != 0) {
            u10 = new T8(null, 1, 0 == true ? 1 : 0);
        }
        if ((i10 & 8) != 0) {
            interfaceC0292d1 = C0460m8.a();
            kotlin.jvm.internal.n.e(interfaceC0292d1, "getInstance()");
        }
        this(str, eVar, u10, interfaceC0292d1);
    }

    private final void a(D8.b bVar, D8 d10) {
        this.f27232b.a(new com.ironsource.sdk.controller.f.c(this.f27231a, defpackage.e.n("nativeAd.loadReport.", this.f27231a), bVar.b()), new yh(this, d10, 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(Tb this$0, D8 adData, com.ironsource.sdk.controller.f.a it) {
        kotlin.jvm.internal.n.f(this$0, "this$0");
        kotlin.jvm.internal.n.f(adData, "$adData");
        kotlin.jvm.internal.n.f(it, "it");
        this$0.a(adData, it);
    }

    private final void a(D8 d10, com.ironsource.sdk.controller.f.a aVar) {
        if (aVar.d() == null) {
            Ub.a aVarB = b();
            if (aVarB != null) {
                aVarB.a("failed to load native ad: missing report params");
                return;
            }
            return;
        }
        if (!aVar.d().optBoolean("success", false)) {
            String reason = aVar.d().optString("reason", "failed to load native ad: unexpected error");
            Ub.a aVarB2 = b();
            if (aVarB2 != null) {
                kotlin.jvm.internal.n.e(reason, "reason");
                aVarB2.a(reason);
                return;
            }
            return;
        }
        Ub.a aVarB3 = b();
        if (aVarB3 != null) {
            aVarB3.a(d10);
        }
    }

    @Override // com.ironsource.Ub
    public void a() {
        this.f27232b.a(new com.ironsource.sdk.controller.f.c(this.f27231a, a.f27244h, new JSONObject()), (com.ironsource.sdk.controller.l.a) null);
    }

    @Override // com.ironsource.Ub
    public void a(G8 viewHolder) throws JSONException {
        kotlin.jvm.internal.n.f(viewHolder, "viewHolder");
        JSONObject params = new JSONObject().put("assetViews", viewHolder.t()).put("adViewClickCommand", e());
        String str = this.f27231a;
        kotlin.jvm.internal.n.e(params, "params");
        this.f27232b.a(new com.ironsource.sdk.controller.f.c(str, a.f27240d, params), (com.ironsource.sdk.controller.l.a) null);
    }

    @Override // com.ironsource.Ub
    public void a(Gg viewVisibilityParams) {
        kotlin.jvm.internal.n.f(viewVisibilityParams, "viewVisibilityParams");
        this.f27232b.a(new com.ironsource.sdk.controller.f.c(this.f27231a, a.f27243g, viewVisibilityParams.g()), new zh(this, 0));
    }

    @Override // com.ironsource.Ub
    public void a(JSONObject clickParams) {
        kotlin.jvm.internal.n.f(clickParams, "clickParams");
        this.f27232b.a(new com.ironsource.sdk.controller.f.c(this.f27231a, a.f27241e, clickParams), new zh(this, 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(Tb this$0, com.ironsource.sdk.controller.f.a it) {
        kotlin.jvm.internal.n.f(this$0, "this$0");
        kotlin.jvm.internal.n.f(it, "it");
        this$0.a(it);
    }

    private final void a(com.ironsource.sdk.controller.f.a aVar) {
        if (aVar.d() == null) {
            Logger.i(this.f27235e, "failed to handle click on native ad: missing params");
            return;
        }
        if (!aVar.d().optBoolean("success", false)) {
            String strOptString = aVar.d().optString("reason", "unexpected error");
            Logger.i(this.f27235e, "failed to handle click on native ad: " + strOptString);
            return;
        }
        Ub.a aVarB = b();
        if (aVarB != null) {
            aVarB.e();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(Tb this$0, Nb msg) {
        kotlin.jvm.internal.n.f(this$0, "this$0");
        kotlin.jvm.internal.n.f(msg, "msg");
        if (kotlin.jvm.internal.n.a(msg.e(), a.f27241e)) {
            this$0.a(msg);
        }
    }

    private final void a(Nb nb2) {
        if (nb2.f() == null) {
            Logger.i(this.f27235e, "failed to handle click on native ad: missing params");
            return;
        }
        if (!nb2.f().optBoolean("success", false)) {
            String strOptString = nb2.f().optString("reason", "unexpected error");
            Logger.i(this.f27235e, "failed to handle click on native ad: " + strOptString);
            return;
        }
        Ub.a aVarB = b();
        if (aVarB != null) {
            aVarB.e();
        }
    }
}
