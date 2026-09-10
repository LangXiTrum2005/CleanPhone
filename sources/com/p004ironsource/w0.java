package com.p004ironsource;

import android.content.Context;
import com.p004ironsource.mediationsdk.logger.IronLog;
import com.p004ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.ironsourceads.InitListener;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\f\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ \u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016R\u0014\u0010\f\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u000b¨\u0006\u000f"}, d2 = {"Lcom/ironsource/w0;", "Lcom/ironsource/v0;", "Landroid/content/Context;", "context", "Lcom/ironsource/ti;", "initConfig", "Lcom/unity3d/ironsourceads/InitListener;", "initListener", "", "a", "Lcom/ironsource/so;", "Lcom/ironsource/so;", "networkInitApi", "<init>", "(Lcom/ironsource/so;)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public final class w0 implements v0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final so networkInitApi;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¨\u0006\u0007"}, d2 = {"com/ironsource/w0$a", "Lcom/ironsource/pp;", "", "onSuccess", "Lcom/ironsource/nh;", "error", "onFail", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
    public static final class a implements pp {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ ti f27557a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ InitListener f27558b;

        public a(ti tiVar, InitListener initListener) {
            this.f27557a = tiVar;
            this.f27558b = initListener;
        }

        @Override // com.p004ironsource.pp
        public void onFail(nh error) {
            Intrinsics.f(error, "error");
            IronLog.ADAPTER_API.verbose("initSDKWithNetworkConfigurations error: " + error);
            this.f27558b.onInitFailed(wb.f27568a.a(new IronSourceError(error.a(), error.b())));
        }

        @Override // com.p004ironsource.pp
        public void onSuccess() {
            IronLog ironLog = IronLog.ADAPTER_API;
            ironLog.verbose("initSDKWithNetworkConfigurations success");
            StringBuilder sb = new StringBuilder("controllerURL = ");
            u0 applicationConfig = this.f27557a.getApplicationConfig();
            sb.append(applicationConfig != null ? applicationConfig.c() : null);
            ironLog.verbose(sb.toString());
            StringBuilder sb2 = new StringBuilder("controllerConfig = ");
            u0 applicationConfig2 = this.f27557a.getApplicationConfig();
            sb2.append(applicationConfig2 != null ? applicationConfig2.a() : null);
            ironLog.verbose(sb2.toString());
            StringBuilder sb3 = new StringBuilder("debugMode = ");
            u0 applicationConfig3 = this.f27557a.getApplicationConfig();
            sb3.append(applicationConfig3 != null ? Integer.valueOf(applicationConfig3.b()) : null);
            ironLog.verbose(sb3.toString());
            ironLog.verbose("applicationKey = " + this.f27557a.d());
            ironLog.verbose("userId = " + this.f27557a.h());
            this.f27558b.onInitSuccess();
        }
    }

    public w0(so networkInitApi) {
        Intrinsics.f(networkInitApi, "networkInitApi");
        this.networkInitApi = networkInitApi;
    }

    @Override // com.p004ironsource.v0
    public void a(Context context, ti initConfig, InitListener initListener) {
        JSONObject jSONObjectA;
        String strC;
        Intrinsics.f(context, "context");
        Intrinsics.f(initConfig, "initConfig");
        Intrinsics.f(initListener, "initListener");
        so soVar = this.networkInitApi;
        u0 applicationConfig = initConfig.getApplicationConfig();
        soVar.a(applicationConfig != null ? applicationConfig.b() : 0);
        u0 applicationConfig2 = initConfig.getApplicationConfig();
        if (applicationConfig2 != null && (strC = applicationConfig2.c()) != null) {
            this.networkInitApi.b(strC);
        }
        u0 applicationConfig3 = initConfig.getApplicationConfig();
        if (applicationConfig3 != null && (jSONObjectA = applicationConfig3.a()) != null) {
            so soVar2 = this.networkInitApi;
            String string = jSONObjectA.toString();
            Intrinsics.e(string, "applicationConfig.toString()");
            soVar2.a(string);
        }
        Map<String, String> mapA = new qo().a();
        this.networkInitApi.a(new a(initConfig, initListener));
        this.networkInitApi.a(context, initConfig.d(), initConfig.h(), mapA);
    }
}
