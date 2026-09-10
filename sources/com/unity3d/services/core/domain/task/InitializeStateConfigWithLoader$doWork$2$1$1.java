package com.unity3d.services.core.domain.task;

import ak.f;
import ck.e;
import ck.i;
import cn.a0;
import com.unity3d.services.core.configuration.Configuration;
import com.unity3d.services.core.configuration.ErrorState;
import com.unity3d.services.core.configuration.IConfigurationLoader;
import com.unity3d.services.core.configuration.IConfigurationLoaderListener;
import com.unity3d.services.core.request.metrics.Metric;
import com.unity3d.services.core.request.metrics.SDKMetricsSender;
import com.unity3d.services.core.request.metrics.TSIMetric;
import jk.c;
import kotlin.Metadata;
import kotlin.jvm.internal.c0;
import kotlin.jvm.internal.n;
import wj.r;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcn/a0;", "Lwj/r;", "<anonymous>", "(Lcn/a0;)V"}, k = 3, mv = {1, 8, 0})
@e(c = "com.unity3d.services.core.domain.task.InitializeStateConfigWithLoader$doWork$2$1$1", f = "InitializeStateConfigWithLoader.kt", l = {}, m = "invokeSuspend")
public final class InitializeStateConfigWithLoader$doWork$2$1$1 extends i implements c {
    final /* synthetic */ c0 $config;
    final /* synthetic */ c0 $configurationLoader;
    final /* synthetic */ InitializeStateConfigWithLoader.Params $params;
    int label;
    final /* synthetic */ InitializeStateConfigWithLoader this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InitializeStateConfigWithLoader$doWork$2$1$1(c0 c0Var, c0 c0Var2, InitializeStateConfigWithLoader initializeStateConfigWithLoader, InitializeStateConfigWithLoader.Params params, f fVar) {
        super(2, fVar);
        this.$configurationLoader = c0Var;
        this.$config = c0Var2;
        this.this$0 = initializeStateConfigWithLoader;
        this.$params = params;
    }

    @Override // ck.a
    public final f create(Object obj, f fVar) {
        return new InitializeStateConfigWithLoader$doWork$2$1$1(this.$configurationLoader, this.$config, this.this$0, this.$params, fVar);
    }

    @Override // jk.c
    public final Object invoke(a0 a0Var, f fVar) {
        return ((InitializeStateConfigWithLoader$doWork$2$1$1) create(a0Var, fVar)).invokeSuspend(r.f53297a);
    }

    @Override // ck.a
    public final Object invokeSuspend(Object obj) throws Exception {
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        t9.e.z(obj);
        IConfigurationLoader iConfigurationLoader = (IConfigurationLoader) this.$configurationLoader.f44760a;
        final c0 c0Var = this.$config;
        final InitializeStateConfigWithLoader initializeStateConfigWithLoader = this.this$0;
        final InitializeStateConfigWithLoader.Params params = this.$params;
        iConfigurationLoader.loadConfiguration(new IConfigurationLoaderListener() { // from class: com.unity3d.services.core.domain.task.InitializeStateConfigWithLoader$doWork$2$1$1.1
            @Override // com.unity3d.services.core.configuration.IConfigurationLoaderListener
            public void onError(String errorMsg) throws InitializationException {
                n.f(errorMsg, "errorMsg");
                SDKMetricsSender sDKMetricsSender = initializeStateConfigWithLoader.sdkMetricsSender;
                Metric metricNewEmergencySwitchOff = TSIMetric.newEmergencySwitchOff();
                n.e(metricNewEmergencySwitchOff, "newEmergencySwitchOff()");
                sDKMetricsSender.sendMetric(metricNewEmergencySwitchOff);
                throw new InitializationException(ErrorState.NetworkConfigRequest, new Exception(errorMsg), params.getConfig());
            }

            @Override // com.unity3d.services.core.configuration.IConfigurationLoaderListener
            public void onSuccess(Configuration configuration) {
                n.f(configuration, "configuration");
                c0Var.f44760a = configuration;
                configuration.saveToDisk();
                initializeStateConfigWithLoader.tokenStorage.setInitToken(((Configuration) c0Var.f44760a).getUnifiedAuctionToken());
            }
        });
        return r.f53297a;
    }
}
