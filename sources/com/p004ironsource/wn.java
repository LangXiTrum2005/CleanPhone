package com.p004ironsource;

import android.app.Activity;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.mbridge.msdk.mbbid.out.BidResponsed;
import com.p004ironsource.sdk.controller.e;
import com.p004ironsource.sdk.controller.l;
import com.p004ironsource.sdk.utils.Logger;
import com.smartdigimkt.h5.f;
import com.smartdigimkt.m3.h;
import com.smartdigimkt.y4.g;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0007B+\u0012\u0006\u0010\u001c\u001a\u00020\u001a\u0012\u0006\u0010\u001f\u001a\u00020\u001d\u0012\b\b\u0002\u0010\"\u001a\u00020 \u0012\b\b\u0002\u0010%\u001a\u00020#¢\u0006\u0004\b/\u00100J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0002J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\b\u0010\r\u001a\u00020\fH\u0002J\u0010\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\b\u0010\u0010\u001a\u00020\u000fH\u0002J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u0011H\u0002J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\fH\u0016J\b\u0010\u0014\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u0015H\u0016J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u0017H\u0016J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\fH\u0016J\b\u0010\u000e\u001a\u00020\u0006H\u0016R\u0014\u0010\u001c\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001bR\u0014\u0010\u001f\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u001eR\u0014\u0010\"\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010!R\u0014\u0010%\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010$R\u001c\u0010(\u001a\n &*\u0004\u0018\u00010\u001a0\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010\u001bR$\u0010.\u001a\u0004\u0018\u00010)8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b*\u0010+\u001a\u0004\b\u0007\u0010,\"\u0004\b\u0007\u0010-¨\u00061"}, d2 = {"Lcom/ironsource/wn;", "Lcom/ironsource/xn;", "Landroid/app/Activity;", "activity", "Lcom/ironsource/sdk/controller/f$a;", qt.f26623n, "", "a", "Lcom/ironsource/zh$b;", "report", "Lcom/ironsource/zh;", "adData", "Lorg/json/JSONObject;", "d", "b", "Lcom/ironsource/sdk/controller/l$b;", "c", "Lcom/ironsource/qn;", "msg", "loadParams", "destroy", "Lcom/ironsource/ci;", "viewHolder", "Lcom/ironsource/zw;", "viewVisibilityParams", "clickParams", "", "Ljava/lang/String;", "id", "Lcom/ironsource/sdk/controller/e;", "Lcom/ironsource/sdk/controller/e;", "controllerManager", "Lcom/ironsource/qi;", "Lcom/ironsource/qi;", "imageLoader", "Lcom/ironsource/z2;", "Lcom/ironsource/z2;", "adViewManagement", "kotlin.jvm.PlatformType", "e", "logTag", "Lcom/ironsource/xn$a;", f.j, "Lcom/ironsource/xn$a;", "()Lcom/ironsource/xn$a;", "(Lcom/ironsource/xn$a;)V", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "<init>", "(Ljava/lang/String;Lcom/ironsource/sdk/controller/e;Lcom/ironsource/qi;Lcom/ironsource/z2;)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public final class wn implements xn {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final String id;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final e controllerManager;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final qi imageLoader;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final z2 adViewManagement;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final String logTag;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private xn.a listener;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0012\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0004R\u0014\u0010\u000b\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0004R\u0014\u0010\r\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u0004R\u0014\u0010\u000f\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0004R\u0014\u0010\u0011\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0004¨\u0006\u0014"}, d2 = {"Lcom/ironsource/wn$a;", "", "", "b", "Ljava/lang/String;", "LOAD", "c", "LOAD_REPORT", "d", "REGISTER", "e", "CLICK", f.j, "PRIVACY_CLICK", g.f40227p, "VISIBILITY_CHANGED", h.f36614b, "DESTROY", "<init>", "()V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f27624a = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        public static final String LOAD = "nativeAd.load";

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        public static final String LOAD_REPORT = "nativeAd.loadReport";

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        public static final String REGISTER = "nativeAd.register";

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        public static final String CLICK = "nativeAd.click";

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        public static final String PRIVACY_CLICK = "nativeAd.privacyClick";

        /* JADX INFO: renamed from: g, reason: from kotlin metadata */
        public static final String VISIBILITY_CHANGED = "nativeAd.visibilityChanged";

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
        public static final String DESTROY = "nativeAd.destroy";

        private a() {
        }
    }

    public wn(String id, e controllerManager, qi imageLoader, z2 adViewManagement) {
        Intrinsics.f(id, "id");
        Intrinsics.f(controllerManager, "controllerManager");
        Intrinsics.f(imageLoader, "imageLoader");
        Intrinsics.f(adViewManagement, "adViewManagement");
        this.id = id;
        this.controllerManager = controllerManager;
        this.imageLoader = imageLoader;
        this.adViewManagement = adViewManagement;
        this.logTag = BidResponsed.KEY_WN;
        controllerManager.a(id, c());
    }

    @Override // com.p004ironsource.xn
    /* JADX INFO: renamed from: a, reason: from getter */
    public xn.a getListener() {
        return this.listener;
    }

    @Override // com.p004ironsource.xn
    public void destroy() {
        this.controllerManager.a(new com.ironsource.sdk.controller.f.c(this.id, a.DESTROY, new JSONObject()), (l.a) null);
    }

    public /* synthetic */ wn(String str, e eVar, qi qiVar, z2 z2Var, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i2 & 4) != 0) {
            qiVar = new pi(null, 1, 0 == true ? 1 : 0);
        }
        if ((i2 & 8) != 0) {
            z2Var = jh.a();
            Intrinsics.e(z2Var, "getInstance()");
        }
        this(str, eVar, qiVar, z2Var);
    }

    private final void a(Activity activity, com.ironsource.sdk.controller.f.a response) {
        if (response.d() == null) {
            xn.a listener = getListener();
            if (listener != null) {
                listener.a("failed to load native ad: missing params");
                return;
            }
            return;
        }
        if (response.d().optBoolean("success", false)) {
            zh.b bVarA = new zh.a(this.imageLoader, this.adViewManagement).a(activity, response.d());
            a(bVarA, bVarA.getData().h());
            return;
        }
        String reason = response.d().optString("reason", "failed to load native ad: unexpected error");
        xn.a listener2 = getListener();
        if (listener2 != null) {
            Intrinsics.e(reason, "reason");
            listener2.a(reason);
        }
    }

    private final l.b c() {
        return new l.b() { // from class: com.ironsource.L0
            @Override // com.ironsource.sdk.controller.l.b
            public final void a(qn qnVar) {
                wn.a(this.f24203a, qnVar);
            }
        };
    }

    private final JSONObject d() throws JSONException {
        JSONObject jSONObjectPut = new JSONObject().put(com.ironsource.sdk.controller.f.b.COMMAND, a.CLICK).put("sdkCallback", d9.g.f24688U);
        Intrinsics.e(jSONObjectPut, "JSONObject()\n        .pu…hods.ON_RECEIVED_MESSAGE)");
        return jSONObjectPut;
    }

    @Override // com.p004ironsource.xn
    public void b() {
        this.controllerManager.a(new com.ironsource.sdk.controller.f.c(this.id, a.PRIVACY_CLICK, new JSONObject()), (l.a) null);
    }

    private final void b(com.ironsource.sdk.controller.f.a response) {
        if (response.d() == null) {
            Logger.i(this.logTag, "failed to handle show on native ad: missing params");
            return;
        }
        if (response.d().optBoolean("success", false)) {
            xn.a listener = getListener();
            if (listener != null) {
                listener.a();
                return;
            }
            return;
        }
        String strOptString = response.d().optString("reason", "unexpected error");
        Logger.i(this.logTag, "failed to handle show on native ad: " + strOptString);
    }

    @Override // com.p004ironsource.xn
    public void a(Activity activity, JSONObject loadParams) {
        Intrinsics.f(activity, "activity");
        Intrinsics.f(loadParams, "loadParams");
        this.controllerManager.a(activity);
        this.controllerManager.a(new com.ironsource.sdk.controller.f.c(this.id, a.LOAD, loadParams), new N0(this, activity, 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(wn this$0, com.ironsource.sdk.controller.f.a it) {
        Intrinsics.f(this$0, "this$0");
        Intrinsics.f(it, "it");
        this$0.b(it);
    }

    @Override // com.p004ironsource.xn
    public void a(ci viewHolder) throws JSONException {
        Intrinsics.f(viewHolder, "viewHolder");
        JSONObject params = new JSONObject().put("assetViews", viewHolder.t()).put("adViewClickCommand", d());
        String str = this.id;
        Intrinsics.e(params, "params");
        this.controllerManager.a(new com.ironsource.sdk.controller.f.c(str, a.REGISTER, params), (l.a) null);
    }

    private final void a(qn msg) {
        if (msg.f() == null) {
            Logger.i(this.logTag, "failed to handle click on native ad: missing params");
            return;
        }
        if (msg.f().optBoolean("success", false)) {
            xn.a listener = getListener();
            if (listener != null) {
                listener.h();
                return;
            }
            return;
        }
        String strOptString = msg.f().optString("reason", "unexpected error");
        Logger.i(this.logTag, "failed to handle click on native ad: " + strOptString);
    }

    private final void a(com.ironsource.sdk.controller.f.a response) {
        if (response.d() == null) {
            Logger.i(this.logTag, "failed to handle click on native ad: missing params");
            return;
        }
        if (response.d().optBoolean("success", false)) {
            xn.a listener = getListener();
            if (listener != null) {
                listener.h();
                return;
            }
            return;
        }
        String strOptString = response.d().optString("reason", "unexpected error");
        Logger.i(this.logTag, "failed to handle click on native ad: " + strOptString);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(wn this$0, Activity activity, com.ironsource.sdk.controller.f.a it) {
        Intrinsics.f(this$0, "this$0");
        Intrinsics.f(activity, "$activity");
        Intrinsics.f(it, "it");
        this$0.a(activity, it);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(wn this$0, qn msg) {
        Intrinsics.f(this$0, "this$0");
        Intrinsics.f(msg, "msg");
        if (Intrinsics.a(msg.e(), a.CLICK)) {
            this$0.a(msg);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(wn this$0, com.ironsource.sdk.controller.f.a it) {
        Intrinsics.f(this$0, "this$0");
        Intrinsics.f(it, "it");
        this$0.a(it);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(wn this$0, zh adData, com.ironsource.sdk.controller.f.a it) {
        Intrinsics.f(this$0, "this$0");
        Intrinsics.f(adData, "$adData");
        Intrinsics.f(it, "it");
        this$0.a(adData, it);
    }

    @Override // com.p004ironsource.xn
    public void a(xn.a aVar) {
        this.listener = aVar;
    }

    private final void a(zh.b report, zh adData) {
        this.controllerManager.a(new com.ironsource.sdk.controller.f.c(this.id, "nativeAd.loadReport." + this.id, report.b()), new N0(this, adData, 1));
    }

    private final void a(zh adData, com.ironsource.sdk.controller.f.a response) {
        if (response.d() == null) {
            xn.a listener = getListener();
            if (listener != null) {
                listener.a("failed to load native ad: missing report params");
                return;
            }
            return;
        }
        if (response.d().optBoolean("success", false)) {
            xn.a listener2 = getListener();
            if (listener2 != null) {
                listener2.a(adData);
                return;
            }
            return;
        }
        String reason = response.d().optString("reason", "failed to load native ad: unexpected error");
        xn.a listener3 = getListener();
        if (listener3 != null) {
            Intrinsics.e(reason, "reason");
            listener3.a(reason);
        }
    }

    @Override // com.p004ironsource.xn
    public void a(zw viewVisibilityParams) {
        Intrinsics.f(viewVisibilityParams, "viewVisibilityParams");
        this.controllerManager.a(new com.ironsource.sdk.controller.f.c(this.id, a.VISIBILITY_CHANGED, viewVisibilityParams.g()), new M0(this, 1));
    }

    @Override // com.p004ironsource.xn
    public void a(JSONObject clickParams) {
        Intrinsics.f(clickParams, "clickParams");
        this.controllerManager.a(new com.ironsource.sdk.controller.f.c(this.id, a.CLICK, clickParams), new M0(this, 0));
    }
}
