package com.unity3d.services.core.domain.task;

import ak.f;
import bk.a;
import ck.e;
import ck.i;
import cn.a0;
import cn.w;
import com.ironsource.InterfaceC0435l1;
import com.unity3d.services.core.configuration.Configuration;
import com.unity3d.services.core.configuration.ConfigurationLoader;
import com.unity3d.services.core.configuration.ConfigurationRequestFactory;
import com.unity3d.services.core.configuration.ErrorState;
import com.unity3d.services.core.configuration.InitRequestType;
import com.unity3d.services.core.configuration.InitializeEventsMetricSender;
import com.unity3d.services.core.configuration.PrivacyConfigStorage;
import com.unity3d.services.core.configuration.PrivacyConfigurationLoader;
import com.unity3d.services.core.device.reader.DeviceInfoDataFactory;
import com.unity3d.services.core.di.IServicesRegistry;
import com.unity3d.services.core.extensions.AbortRetryException;
import com.unity3d.services.core.extensions.TaskExtensionsKt;
import com.unity3d.services.core.network.core.HttpClient;
import com.unity3d.services.core.request.metrics.SDKMetricsSender;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import java.util.concurrent.CancellationException;
import jk.c;
import kotlin.Metadata;
import kotlin.jvm.internal.c0;
import kotlin.jvm.internal.d0;
import kotlin.jvm.internal.e0;
import wj.g;
import wj.h;
import wj.r;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcn/a0;", "Lwj/h;", "Lcom/unity3d/services/core/configuration/Configuration;", "<anonymous>", "(Lcn/a0;)Lwj/h;"}, k = 3, mv = {1, 8, 0})
@e(c = "com.unity3d.services.core.domain.task.InitializeStateConfigWithLoader$doWork$2", f = "InitializeStateConfigWithLoader.kt", l = {DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_EVENT_BUILD_FAILURE_VALUE, InterfaceC0435l1.d.b.f29105b, InterfaceC0435l1.d.b.f29110g}, m = "invokeSuspend")
public final class InitializeStateConfigWithLoader$doWork$2 extends i implements c {
    final /* synthetic */ InitializeStateConfigWithLoader.Params $params;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    final /* synthetic */ InitializeStateConfigWithLoader this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InitializeStateConfigWithLoader$doWork$2(InitializeStateConfigWithLoader initializeStateConfigWithLoader, InitializeStateConfigWithLoader.Params params, f fVar) {
        super(2, fVar);
        this.this$0 = initializeStateConfigWithLoader;
        this.$params = params;
    }

    @Override // ck.a
    public final f create(Object obj, f fVar) {
        InitializeStateConfigWithLoader$doWork$2 initializeStateConfigWithLoader$doWork$2 = new InitializeStateConfigWithLoader$doWork$2(this.this$0, this.$params, fVar);
        initializeStateConfigWithLoader$doWork$2.L$0 = obj;
        return initializeStateConfigWithLoader$doWork$2;
    }

    @Override // jk.c
    public final Object invoke(a0 a0Var, f fVar) {
        return ((InitializeStateConfigWithLoader$doWork$2) create(a0Var, fVar)).invokeSuspend(r.f53297a);
    }

    /* JADX WARN: Code duplicated, block: B:48:0x0194 A[Catch: all -> 0x01f5, CancellationException -> 0x020f, TryCatch #6 {CancellationException -> 0x020f, all -> 0x01f5, blocks: (B:8:0x001d, B:52:0x01bf, B:58:0x01f0, B:46:0x0190, B:48:0x0194, B:53:0x01c9, B:54:0x01db, B:45:0x018b, B:33:0x014e, B:35:0x0152, B:55:0x01dc, B:56:0x01e9, B:57:0x01ea, B:32:0x0149, B:23:0x007c), top: B:80:0x000d }] */
    /* JADX WARN: Code duplicated, block: B:51:0x01be  */
    /* JADX WARN: Code duplicated, block: B:53:0x01c9 A[Catch: all -> 0x01f5, CancellationException -> 0x020f, TryCatch #6 {CancellationException -> 0x020f, all -> 0x01f5, blocks: (B:8:0x001d, B:52:0x01bf, B:58:0x01f0, B:46:0x0190, B:48:0x0194, B:53:0x01c9, B:54:0x01db, B:45:0x018b, B:33:0x014e, B:35:0x0152, B:55:0x01dc, B:56:0x01e9, B:57:0x01ea, B:32:0x0149, B:23:0x007c), top: B:80:0x000d }] */
    @Override // ck.a
    public final Object invokeSuspend(Object obj) {
        Object objC;
        Throwable thA;
        c0 c0Var;
        InitializeStateConfigWithLoader initializeStateConfigWithLoader;
        InitializeStateConfigWithLoader.Params params;
        c0 c0Var2;
        Object objC2;
        InitializeStateConfigWithLoader initializeStateConfigWithLoader2;
        InitializeStateConfigWithLoader.Params params2;
        c0 c0Var3;
        Configuration configuration;
        c0 c0Var4;
        c0 c0Var5;
        Object objMo3239invokegIAlus;
        Object objC3;
        c0 c0Var6;
        c0 c0Var7;
        InitializeStateConfigWithLoader initializeStateConfigWithLoader3;
        InitializeStateConfigWithLoader.Params params3;
        c0 c0Var8;
        w io2;
        InitializeStateConfigWithLoader$doWork$2$1$1 initializeStateConfigWithLoader$doWork$2$1$1;
        c0 c0Var9;
        int i10 = this.label;
        a aVar = a.f5708a;
        try {
            if (i10 == 0) {
                t9.e.z(obj);
                a0 a0Var = (a0) this.L$0;
                InitializeStateConfigWithLoader initializeStateConfigWithLoader4 = this.this$0;
                InitializeStateConfigWithLoader.Params params4 = this.$params;
                PrivacyConfigStorage privacyConfigStorage = PrivacyConfigStorage.getInstance();
                DeviceInfoDataFactory deviceInfoDataFactory = new DeviceInfoDataFactory(initializeStateConfigWithLoader4.sdkMetricsSender);
                c0 c0Var10 = new c0();
                ConfigurationRequestFactory configurationRequestFactory = new ConfigurationRequestFactory(params4.getConfig(), deviceInfoDataFactory.getDeviceInfoData(InitRequestType.TOKEN));
                SDKMetricsSender sDKMetricsSender = initializeStateConfigWithLoader4.sdkMetricsSender;
                IServicesRegistry registry = initializeStateConfigWithLoader4.getServiceProvider().getRegistry();
                e0 e0Var = d0.f44761a;
                ConfigurationLoader configurationLoader = new ConfigurationLoader(configurationRequestFactory, sDKMetricsSender, (HttpClient) registry.getService("", e0Var.b(HttpClient.class)));
                c0Var10.f44760a = configurationLoader;
                c0Var10.f44760a = new PrivacyConfigurationLoader(configurationLoader, new ConfigurationRequestFactory(params4.getConfig(), deviceInfoDataFactory.getDeviceInfoData(InitRequestType.PRIVACY)), privacyConfigStorage, (HttpClient) initializeStateConfigWithLoader4.getServiceProvider().getRegistry().getService("", e0Var.b(HttpClient.class)));
                c0 c0Var11 = new c0();
                c0Var11.f44760a = new Configuration();
                try {
                    int maxRetries = params4.getConfig().getMaxRetries();
                    double retryScalingFactor = params4.getConfig().getRetryScalingFactor();
                    long retryDelay = params4.getConfig().getRetryDelay();
                    InitializationException initializationException = new InitializationException(ErrorState.NetworkConfigRequest, new Exception(), params4.getConfig());
                    InitializeStateConfigWithLoader$doWork$2$1$configResult$1$1 initializeStateConfigWithLoader$doWork$2$1$configResult$1$1 = new InitializeStateConfigWithLoader$doWork$2$1$configResult$1$1(initializeStateConfigWithLoader4, c0Var10, c0Var11, null);
                    this.L$0 = a0Var;
                    this.L$1 = initializeStateConfigWithLoader4;
                    this.L$2 = params4;
                    this.L$3 = c0Var10;
                    this.L$4 = c0Var11;
                    this.label = 1;
                    if (TaskExtensionsKt.withRetry(retryDelay, maxRetries, retryScalingFactor, initializationException, initializeStateConfigWithLoader$doWork$2$1$configResult$1$1, this) != aVar) {
                        c0Var = c0Var11;
                        initializeStateConfigWithLoader = initializeStateConfigWithLoader4;
                        params = params4;
                        c0Var2 = c0Var10;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    c0Var = c0Var11;
                    initializeStateConfigWithLoader = initializeStateConfigWithLoader4;
                    params = params4;
                    c0Var2 = c0Var10;
                    objC2 = t9.e.c(th);
                }
                return aVar;
            }
            if (i10 == 1) {
                c0Var = (c0) this.L$4;
                c0Var2 = (c0) this.L$3;
                params = (InitializeStateConfigWithLoader.Params) this.L$2;
                initializeStateConfigWithLoader = (InitializeStateConfigWithLoader) this.L$1;
                try {
                    t9.e.z(obj);
                } catch (Throwable th3) {
                    th = th3;
                    objC2 = t9.e.c(th);
                }
            } else {
                if (i10 == 2) {
                    c0Var = (c0) this.L$4;
                    c0Var5 = (c0) this.L$3;
                    c0Var3 = (c0) this.L$2;
                    params2 = (InitializeStateConfigWithLoader.Params) this.L$1;
                    initializeStateConfigWithLoader2 = (InitializeStateConfigWithLoader) this.L$0;
                    try {
                        t9.e.z(obj);
                        objMo3239invokegIAlus = ((h) obj).f53286a;
                        objC3 = new h(objMo3239invokegIAlus);
                    } catch (Throwable th4) {
                        th = th4;
                        objC3 = t9.e.c(th);
                    }
                    c0Var6 = c0Var3;
                    c0Var7 = c0Var5;
                    initializeStateConfigWithLoader3 = initializeStateConfigWithLoader2;
                    params3 = params2;
                    c0Var8 = c0Var;
                    if (!(objC3 instanceof g)) {
                        throw new InitializationException(ErrorState.NetworkConfigRequest, new Exception("No connected events within the timeout!"), params3.getConfig());
                    }
                    InitializeEventsMetricSender.getInstance().onRetryConfig();
                    io2 = initializeStateConfigWithLoader3.dispatchers.getIo();
                    initializeStateConfigWithLoader$doWork$2$1$1 = new InitializeStateConfigWithLoader$doWork$2$1$1(c0Var6, c0Var7, initializeStateConfigWithLoader3, params3, null);
                    this.L$0 = c0Var7;
                    this.L$1 = c0Var8;
                    this.L$2 = null;
                    this.L$3 = null;
                    this.L$4 = null;
                    this.label = 3;
                    if (cn.d0.J(io2, initializeStateConfigWithLoader$doWork$2$1$1, this) != aVar) {
                        c0Var9 = c0Var7;
                    }
                    return aVar;
                }
                if (i10 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c0Var8 = (c0) this.L$1;
                c0Var9 = (c0) this.L$0;
                t9.e.z(obj);
            }
            configuration = (Configuration) c0Var9.f44760a;
            c0 c0Var12 = c0Var9;
            c0Var = c0Var8;
            c0Var4 = c0Var12;
            c0Var.f44760a = configuration;
            objC = c0Var4.f44760a;
            if ((objC instanceof g) && (thA = h.a(objC)) != null) {
                objC = t9.e.c(thA);
            }
            return new h(objC);
            objC2 = r.f53297a;
            initializeStateConfigWithLoader2 = initializeStateConfigWithLoader;
            params2 = params;
            c0Var3 = c0Var2;
            if (objC2 instanceof g) {
                Throwable thA2 = h.a(objC2);
                if (thA2 instanceof AbortRetryException) {
                    throw new InitializationException(ErrorState.NetworkConfigRequest, (Exception) thA2, params2.getConfig());
                }
                try {
                    InitializeStateNetworkError initializeStateNetworkError = initializeStateConfigWithLoader2.initializeStateNetworkError;
                    InitializeStateNetworkError.Params params5 = new InitializeStateNetworkError.Params(params2.getConfig());
                    this.L$0 = initializeStateConfigWithLoader2;
                    this.L$1 = params2;
                    this.L$2 = c0Var3;
                    this.L$3 = c0Var;
                    this.L$4 = c0Var;
                    this.label = 2;
                    objMo3239invokegIAlus = initializeStateNetworkError.mo3239invokegIAlus(params5, this);
                    if (objMo3239invokegIAlus != aVar) {
                        c0Var5 = c0Var;
                        objC3 = new h(objMo3239invokegIAlus);
                        c0Var6 = c0Var3;
                        c0Var7 = c0Var5;
                        initializeStateConfigWithLoader3 = initializeStateConfigWithLoader2;
                        params3 = params2;
                        c0Var8 = c0Var;
                        if (!(objC3 instanceof g)) {
                            throw new InitializationException(ErrorState.NetworkConfigRequest, new Exception("No connected events within the timeout!"), params3.getConfig());
                        }
                        InitializeEventsMetricSender.getInstance().onRetryConfig();
                        io2 = initializeStateConfigWithLoader3.dispatchers.getIo();
                        initializeStateConfigWithLoader$doWork$2$1$1 = new InitializeStateConfigWithLoader$doWork$2$1$1(c0Var6, c0Var7, initializeStateConfigWithLoader3, params3, null);
                        this.L$0 = c0Var7;
                        this.L$1 = c0Var8;
                        this.L$2 = null;
                        this.L$3 = null;
                        this.L$4 = null;
                        this.label = 3;
                        if (cn.d0.J(io2, initializeStateConfigWithLoader$doWork$2$1$1, this) != aVar) {
                            c0Var9 = c0Var7;
                            configuration = (Configuration) c0Var9.f44760a;
                            c0 c0Var13 = c0Var9;
                            c0Var = c0Var8;
                            c0Var4 = c0Var13;
                        }
                    }
                } catch (Throwable th5) {
                    th = th5;
                    c0Var5 = c0Var;
                    objC3 = t9.e.c(th);
                }
                return aVar;
            }
            configuration = (Configuration) c0Var.f44760a;
            c0Var4 = c0Var;
            c0Var.f44760a = configuration;
            objC = c0Var4.f44760a;
        } catch (CancellationException e10) {
            throw e10;
        } catch (Throwable th6) {
            objC = t9.e.c(th6);
        }
        if (objC instanceof g) {
            objC = t9.e.c(thA);
        }
        return new h(objC);
    }
}
