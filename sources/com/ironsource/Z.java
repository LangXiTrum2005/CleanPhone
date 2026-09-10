package com.ironsource;

import android.content.Context;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.ironsourceads.InitListener;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class Z implements Y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC0518pc f28059a;

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static final class a implements Mc {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Y8 f28060a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ InitListener f28061b;

        public a(Y8 y10, InitListener initListener) {
            this.f28060a = y10;
            this.f28061b = initListener;
        }

        @Override // com.ironsource.Mc
        public void onFail(C0532q8 error) {
            kotlin.jvm.internal.n.f(error, "error");
            IronLog.ADAPTER_API.verbose("initSDKWithNetworkConfigurations error: " + error);
            this.f28061b.onInitFailed(C0600u5.f30795a.a(new IronSourceError(error.a(), error.b())));
        }

        @Override // com.ironsource.Mc
        public void onSuccess() {
            IronLog ironLog = IronLog.ADAPTER_API;
            ironLog.verbose("initSDKWithNetworkConfigurations success");
            X xE = this.f28060a.e();
            ironLog.verbose("controllerURL = " + (xE != null ? xE.a() : null));
            X xE2 = this.f28060a.e();
            ironLog.verbose("controllerConfig = " + (xE2 != null ? xE2.b() : null));
            X xE3 = this.f28060a.e();
            ironLog.verbose("debugMode = " + (xE3 != null ? Integer.valueOf(xE3.c()) : null));
            ironLog.verbose("applicationKey = " + this.f28060a.d());
            ironLog.verbose("userId = " + this.f28060a.h());
            this.f28061b.onInitSuccess();
        }
    }

    public Z(InterfaceC0518pc networkInitApi) {
        kotlin.jvm.internal.n.f(networkInitApi, "networkInitApi");
        this.f28059a = networkInitApi;
    }

    @Override // com.ironsource.Y
    public void a(Context context, Y8 initConfig, InitListener initListener) {
        JSONObject jSONObjectB;
        String strA;
        kotlin.jvm.internal.n.f(context, "context");
        kotlin.jvm.internal.n.f(initConfig, "initConfig");
        kotlin.jvm.internal.n.f(initListener, "initListener");
        InterfaceC0518pc interfaceC0518pc = this.f28059a;
        X xE = initConfig.e();
        interfaceC0518pc.a(xE != null ? xE.c() : 0);
        X xE2 = initConfig.e();
        if (xE2 != null && (strA = xE2.a()) != null) {
            this.f28059a.b(strA);
        }
        X xE3 = initConfig.e();
        if (xE3 != null && (jSONObjectB = xE3.b()) != null) {
            InterfaceC0518pc interfaceC0518pc2 = this.f28059a;
            String string = jSONObjectB.toString();
            kotlin.jvm.internal.n.e(string, "applicationConfig.toString()");
            interfaceC0518pc2.a(string);
        }
        Map<String, String> mapA = new C0482nc().a();
        this.f28059a.a(new a(initConfig, initListener));
        this.f28059a.a(context, initConfig.d(), initConfig.h(), mapA);
    }
}
