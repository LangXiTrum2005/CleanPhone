package com.ironsource;

import android.content.Context;
import com.ironsource.mediationsdk.config.ConfigFile;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.unity3d.ironsourceads.InitListener;
import com.unity3d.ironsourceads.InitRequest;
import java.util.ArrayList;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class O9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final O9 f26774a = new O9();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final C0390i9 f26775b = new C0390i9();

    private O9() {
    }

    public final void b(boolean z10) throws JSONException {
        a(z10);
        new C0500oc().a(z10);
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static final class b implements InterfaceC0591te {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f26776a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ C0350g5 f26777b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ InitListener f26778c;

        public b(Context context, C0350g5 c0350g5, InitListener initListener) {
            this.f26776a = context;
            this.f26777b = c0350g5;
            this.f26778c = initListener;
        }

        @Override // com.ironsource.InterfaceC0591te
        public void a(C0484ne sdkConfig) {
            kotlin.jvm.internal.n.f(sdkConfig, "sdkConfig");
            O9.f26774a.a(this.f26776a, sdkConfig.d(), this.f26777b, this.f26778c);
        }

        @Override // com.ironsource.InterfaceC0591te
        public void a(C0520pe error, C0300d9 c0300d9) {
            kotlin.jvm.internal.n.f(error, "error");
            O9.f26774a.a(this.f26778c, this.f26777b, error);
        }
    }

    public final void a(Context context, InitRequest initRequest, InitListener initializationListener) {
        kotlin.jvm.internal.n.f(context, "context");
        kotlin.jvm.internal.n.f(initRequest, "initRequest");
        kotlin.jvm.internal.n.f(initializationListener, "initializationListener");
        IronLog.API.info("IronSourceAds.init() appkey: " + initRequest.getAppKey() + ", legacyAdFormats: " + initRequest.getLegacyAdFormats() + ", context: " + context.getClass().getSimpleName());
        f26775b.a(new ph(initRequest, context, initializationListener, 5));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(InitRequest initRequest, Context context, InitListener initializationListener) {
        kotlin.jvm.internal.n.f(initRequest, "$initRequest");
        kotlin.jvm.internal.n.f(context, "$context");
        kotlin.jvm.internal.n.f(initializationListener, "$initializationListener");
        C0350g5 c0350g5 = new C0350g5();
        Ce.f25903a.c(context, new C0627ve(initRequest.getAppKey(), null, xj.k.D0(f26775b.a(initRequest.getLegacyAdFormats())), 2, null), new b(context, c0350g5, initializationListener));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(Context context, Ve ve, C0350g5 c0350g5, InitListener initListener) {
        String strO = com.ironsource.mediationsdk.p.h().o();
        Y8 y8G = ve.g();
        kotlin.jvm.internal.n.e(y8G, "serverResponse.initialConfiguration");
        NetworkSettings networkSettingsB = ve.l().b("IronSource");
        kotlin.jvm.internal.n.e(networkSettingsB, "serverResponse.providerS…s.IRONSOURCE_CONFIG_NAME)");
        JSONObject interstitialSettings = networkSettingsB.getInterstitialSettings();
        kotlin.jvm.internal.n.e(interstitialSettings, "networkSettings.interstitialSettings");
        y8G.a(new X.a(interstitialSettings, Kb.f26413u.d().h()));
        y8G.a(ConfigFile.getConfigFile().getPluginType());
        y8G.b(strO);
        new Z(new C0536qc()).a(context, y8G, new a());
        a(ve, c0350g5, initListener);
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static final class a implements InitListener {
        @Override // com.unity3d.ironsourceads.InitListener
        public void onInitFailed(IronSourceError error) {
            kotlin.jvm.internal.n.f(error, "error");
        }

        @Override // com.unity3d.ironsourceads.InitListener
        public void onInitSuccess() {
        }
    }

    private final void a(Ve ve, C0350g5 c0350g5, InitListener initListener) {
        L1 l1E;
        C1 c1B = ve.c().b();
        new Lb().a((c1B == null || (l1E = c1B.e()) == null) ? null : l1E.b(), true);
        String sessionId = com.ironsource.mediationsdk.p.h().o();
        C0410jc c0410jcA = C0410jc.f28993e.a();
        c0410jcA.a(ve.l());
        c0410jcA.a(ve.c());
        kotlin.jvm.internal.n.e(sessionId, "sessionId");
        c0410jcA.a(sessionId);
        c0410jcA.g();
        long jA = C0350g5.a(c0350g5);
        C0390i9 c0390i9 = f26775b;
        Ve.a aVarI = ve.i();
        kotlin.jvm.internal.n.e(aVarI, "serverResponse.origin");
        c0390i9.a(jA, aVarI);
        c0390i9.b(new androidx.fragment.app.n(initListener, 22));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(InitListener initListener) {
        IronLog.CALLBACK.info("InitListener.onInitSuccess()");
        if (initListener != null) {
            initListener.onInitSuccess();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(InitListener initListener, C0350g5 c0350g5, C0520pe c0520pe) {
        long jA = C0350g5.a(c0350g5);
        C0390i9 c0390i9 = f26775b;
        C0520pe c0520peB = c0390i9.b(c0520pe);
        c0390i9.a(c0520peB, jA);
        c0390i9.b(new ph(c0520pe, initListener, c0520peB, 4));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(C0520pe error, InitListener initListener, C0520pe eventError) {
        kotlin.jvm.internal.n.f(error, "$error");
        kotlin.jvm.internal.n.f(eventError, "$eventError");
        IronLog.CALLBACK.info("InitListener.onInitFailed() error " + error);
        if (initListener != null) {
            initListener.onInitFailed(f26775b.a(eventError));
        }
    }

    private final void a(boolean z10) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(IronSourceConstants.EVENTS_EXT1, String.valueOf(z10));
        Kb.f26413u.d().q().a(new C0654x5(EnumC0672y5.CONSENT_IADS, jSONObject));
    }

    public final void a(String key, String value) {
        kotlin.jvm.internal.n.f(key, "key");
        kotlin.jvm.internal.n.f(value, "value");
        ArrayList arrayList = new ArrayList();
        arrayList.add(value);
        com.ironsource.mediationsdk.p.h().a(key, arrayList);
    }
}
