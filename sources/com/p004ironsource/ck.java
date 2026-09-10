package com.p004ironsource;

import android.content.Context;
import com.applovin.impl.H0;
import com.p004ironsource.mediationsdk.config.ConfigFile;
import com.p004ironsource.mediationsdk.logger.IronLog;
import com.p004ironsource.mediationsdk.logger.IronSourceError;
import com.p004ironsource.mediationsdk.model.NetworkSettings;
import com.p004ironsource.mediationsdk.p;
import com.unity3d.ironsourceads.InitListener;
import com.unity3d.ironsourceads.InitRequest;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0017\u0010\u0018J*\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0002J\"\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0002J\"\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\fH\u0002J\u001e\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\bJ\u0016\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0010R\u0014\u0010\u0016\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0019"}, d2 = {"Lcom/ironsource/ck;", "", "Landroid/content/Context;", "context", "Lcom/ironsource/qt;", "serverResponse", "Lcom/ironsource/ib;", "initDuration", "Lcom/unity3d/ironsourceads/InitListener;", "initializationListener", "", "a", "Lcom/ironsource/ps;", "error", "Lcom/unity3d/ironsourceads/InitRequest;", "initRequest", "", "key", "value", "Lcom/ironsource/bj;", "b", "Lcom/ironsource/bj;", "tools", "<init>", "()V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public final class ck {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ck f24548a = new ck();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final bj tools = new bj();

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¨\u0006\u0007"}, d2 = {"com/ironsource/ck$a", "Lcom/unity3d/ironsourceads/InitListener;", "", "onInitSuccess", "Lcom/ironsource/mediationsdk/logger/IronSourceError;", "error", "onInitFailed", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
    public static final class a implements InitListener {
        @Override // com.unity3d.ironsourceads.InitListener
        public void onInitFailed(IronSourceError error) {
            Intrinsics.f(error, "error");
        }

        @Override // com.unity3d.ironsourceads.InitListener
        public void onInitSuccess() {
        }
    }

    @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¨\u0006\b"}, d2 = {"com/ironsource/ck$b", "Lcom/ironsource/ts;", "Lcom/ironsource/ns;", "sdkConfig", "", "a", "Lcom/ironsource/ps;", "error", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
    public static final class b implements ts {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f24550a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ ib f24551b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ InitListener f24552c;

        public b(Context context, ib ibVar, InitListener initListener) {
            this.f24550a = context;
            this.f24551b = ibVar;
            this.f24552c = initListener;
        }

        @Override // com.p004ironsource.ts
        public void a(ns sdkConfig) {
            Intrinsics.f(sdkConfig, "sdkConfig");
            ck.f24548a.a(this.f24550a, sdkConfig.d(), this.f24551b, this.f24552c);
        }

        @Override // com.p004ironsource.ts
        public void a(ps error) {
            Intrinsics.f(error, "error");
            ck.f24548a.a(this.f24552c, this.f24551b, error);
        }
    }

    private ck() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(Context context, qt serverResponse, ib initDuration, InitListener initializationListener) {
        String strR = p.j().r();
        ti tiVarF = serverResponse.f();
        Intrinsics.e(tiVarF, "serverResponse.initialConfiguration");
        NetworkSettings networkSettingsB = serverResponse.k().b("IronSource");
        Intrinsics.e(networkSettingsB, "serverResponse.providerS…s.IRONSOURCE_CONFIG_NAME)");
        JSONObject interstitialSettings = networkSettingsB.getInterstitialSettings();
        Intrinsics.e(interstitialSettings, "networkSettings.interstitialSettings");
        tiVarF.a(new u0.a(interstitialSettings));
        tiVarF.a(ConfigFile.getConfigFile().getPluginType());
        tiVarF.b(strR);
        new w0(new to()).a(context, tiVarF, new a());
        a(serverResponse, initDuration, initializationListener);
    }

    public final void a(Context context, InitRequest initRequest, InitListener initializationListener) {
        Intrinsics.f(context, "context");
        Intrinsics.f(initRequest, "initRequest");
        Intrinsics.f(initializationListener, "initializationListener");
        IronLog.API.info("IronSourceAds.init() appkey: " + initRequest.getAppKey() + ", legacyAdFormats: " + initRequest.getLegacyAdFormats() + ", context: " + context.getClass().getSimpleName());
        tools.a(new H0(initRequest, context, initializationListener, 14));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(ps error, InitListener initListener) {
        Intrinsics.f(error, "$error");
        IronLog.CALLBACK.info("InitListener.onInitFailed() error " + error);
        if (initListener != null) {
            initListener.onInitFailed(tools.a(error));
        }
    }

    private final void a(qt serverResponse, ib initDuration, InitListener initializationListener) {
        i4 i4VarE;
        z3 z3VarB = serverResponse.c().getApplicationConfigurations();
        new pn().a((z3VarB == null || (i4VarE = z3VarB.e()) == null) ? null : i4VarE.b(), true);
        String sessionId = p.j().r();
        mo moVarA = mo.INSTANCE.a();
        moVarA.a(serverResponse.k());
        moVarA.a(serverResponse.c());
        Intrinsics.e(sessionId, "sessionId");
        moVarA.a(sessionId);
        moVarA.g();
        long jA = ib.a(initDuration);
        bj bjVar = tools;
        qt.a aVarH = serverResponse.h();
        Intrinsics.e(aVarH, "serverResponse.origin");
        bjVar.a(jA, aVarH);
        bjVar.b(new D(initializationListener, 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(InitListener initListener) {
        IronLog.CALLBACK.info("InitListener.onInitSuccess()");
        if (initListener != null) {
            initListener.onInitSuccess();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(InitListener initializationListener, ib initDuration, ps error) {
        long jA = ib.a(initDuration);
        bj bjVar = tools;
        bjVar.a(error, jA);
        bjVar.b(new G0(6, error, initializationListener));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(InitRequest initRequest, Context context, InitListener initializationListener) {
        Intrinsics.f(initRequest, "$initRequest");
        Intrinsics.f(context, "$context");
        Intrinsics.f(initializationListener, "$initializationListener");
        ib ibVar = new ib();
        ct.f24585a.c(context, new vs(initRequest.getAppKey(), null, ArraysKt.N(tools.a(initRequest.getLegacyAdFormats())), 2, null), new b(context, ibVar, initializationListener));
    }

    public final void a(String key, String value) {
        Intrinsics.f(key, "key");
        Intrinsics.f(value, "value");
        ArrayList arrayList = new ArrayList();
        arrayList.add(value);
        p.j().a(key, arrayList);
    }
}
