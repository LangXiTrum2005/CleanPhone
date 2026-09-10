package com.unity3d.services.core.domain.task;

import ak.f;
import ck.e;
import ck.i;
import cn.a0;
import com.unity3d.services.core.configuration.IModuleConfiguration;
import com.unity3d.services.core.log.DeviceLog;
import java.util.concurrent.CancellationException;
import jk.c;
import kotlin.Metadata;
import wj.g;
import wj.h;
import wj.r;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcn/a0;", "Lwj/h;", "Lwj/r;", "<anonymous>", "(Lcn/a0;)Lwj/h;"}, k = 3, mv = {1, 8, 0})
@e(c = "com.unity3d.services.core.domain.task.InitializeStateError$doWork$2", f = "InitializeStateError.kt", l = {}, m = "invokeSuspend")
public final class InitializeStateError$doWork$2 extends i implements c {
    final /* synthetic */ InitializeStateError.Params $params;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InitializeStateError$doWork$2(InitializeStateError.Params params, f fVar) {
        super(2, fVar);
        this.$params = params;
    }

    @Override // ck.a
    public final f create(Object obj, f fVar) {
        return new InitializeStateError$doWork$2(this.$params, fVar);
    }

    @Override // jk.c
    public final Object invoke(a0 a0Var, f fVar) {
        return ((InitializeStateError$doWork$2) create(a0Var, fVar)).invokeSuspend(r.f53297a);
    }

    @Override // ck.a
    public final Object invokeSuspend(Object obj) {
        Object objC;
        Throwable thA;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        t9.e.z(obj);
        InitializeStateError.Params params = this.$params;
        try {
            DeviceLog.error("Unity Ads init: halting init in " + params.getErrorState().getMetricName() + ": " + params.getException().getMessage());
            Class[] moduleConfigurationList = params.getConfig().getModuleConfigurationList();
            if (moduleConfigurationList == null) {
                moduleConfigurationList = new Class[0];
            }
            for (Class cls : moduleConfigurationList) {
                IModuleConfiguration moduleConfiguration = params.getConfig().getModuleConfiguration(cls);
                if (moduleConfiguration != null) {
                    moduleConfiguration.initErrorState(params.getConfig(), params.getErrorState(), params.getException().getMessage());
                }
            }
            objC = r.f53297a;
        } catch (CancellationException e10) {
            throw e10;
        } catch (Throwable th2) {
            objC = t9.e.c(th2);
        }
        if ((objC instanceof g) && (thA = h.a(objC)) != null) {
            objC = t9.e.c(thA);
        }
        return new h(objC);
    }
}
