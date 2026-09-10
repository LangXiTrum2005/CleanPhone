package com.unity3d.services.core.domain.task;

import ak.f;
import bk.a;
import ck.e;
import ck.i;
import cn.a0;
import com.unity3d.services.core.configuration.Configuration;
import com.unity3d.services.core.configuration.ErrorState;
import com.unity3d.services.core.log.DeviceLog;
import com.unity3d.services.core.properties.SdkProperties;
import com.unity3d.services.core.request.NetworkIOException;
import java.util.concurrent.CancellationException;
import jk.c;
import kotlin.Metadata;
import wj.g;
import wj.h;
import wj.r;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcn/a0;", "Lwj/h;", "Lcom/unity3d/services/core/configuration/Configuration;", "<anonymous>", "(Lcn/a0;)Lwj/h;"}, k = 3, mv = {1, 8, 0})
@e(c = "com.unity3d.services.core.domain.task.InitializeStateConfig$doWork$2", f = "InitializeStateConfig.kt", l = {32}, m = "invokeSuspend")
public final class InitializeStateConfig$doWork$2 extends i implements c {
    final /* synthetic */ InitializeStateConfig.Params $params;
    Object L$0;
    int label;
    final /* synthetic */ InitializeStateConfig this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InitializeStateConfig$doWork$2(InitializeStateConfig.Params params, InitializeStateConfig initializeStateConfig, f fVar) {
        super(2, fVar);
        this.$params = params;
        this.this$0 = initializeStateConfig;
    }

    @Override // ck.a
    public final f create(Object obj, f fVar) {
        return new InitializeStateConfig$doWork$2(this.$params, this.this$0, fVar);
    }

    @Override // jk.c
    public final Object invoke(a0 a0Var, f fVar) {
        return ((InitializeStateConfig$doWork$2) create(a0Var, fVar)).invokeSuspend(r.f53297a);
    }

    @Override // ck.a
    public final Object invokeSuspend(Object obj) {
        Object objC;
        Throwable thA;
        Configuration configuration;
        Object objMo3239invokegIAlus;
        int i10 = this.label;
        try {
            if (i10 == 0) {
                t9.e.z(obj);
                InitializeStateConfig.Params params = this.$params;
                InitializeStateConfig initializeStateConfig = this.this$0;
                DeviceLog.info("Unity Ads init: load configuration from " + SdkProperties.getConfigUrl());
                Configuration configuration2 = new Configuration(SdkProperties.getConfigUrl(), params.getConfig().getExperimentsReader());
                try {
                    InitializeStateConfigWithLoader initializeStateConfigWithLoader = initializeStateConfig.initializeStateConfigWithLoader;
                    InitializeStateConfigWithLoader.Params params2 = new InitializeStateConfigWithLoader.Params(configuration2);
                    this.L$0 = configuration2;
                    this.label = 1;
                    objMo3239invokegIAlus = initializeStateConfigWithLoader.mo3239invokegIAlus((BaseParams) params2, (f) this);
                    a aVar = a.f5708a;
                    if (objMo3239invokegIAlus == aVar) {
                        return aVar;
                    }
                    configuration = configuration2;
                } catch (NetworkIOException e10) {
                    e = e10;
                    configuration = configuration2;
                    throw new InitializationException(ErrorState.NetworkConfigRequest, e, configuration);
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                configuration = (Configuration) this.L$0;
                try {
                    t9.e.z(obj);
                    objMo3239invokegIAlus = ((h) obj).f53286a;
                } catch (NetworkIOException e11) {
                    e = e11;
                    throw new InitializationException(ErrorState.NetworkConfigRequest, e, configuration);
                }
            }
            t9.e.z(objMo3239invokegIAlus);
            objC = (Configuration) objMo3239invokegIAlus;
        } catch (CancellationException e12) {
            throw e12;
        } catch (Throwable th2) {
            objC = t9.e.c(th2);
        }
        if ((objC instanceof g) && (thA = h.a(objC)) != null) {
            objC = t9.e.c(thA);
        }
        return new h(objC);
    }
}
