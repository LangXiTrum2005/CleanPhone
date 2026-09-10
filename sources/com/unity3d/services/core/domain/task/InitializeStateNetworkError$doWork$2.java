package com.unity3d.services.core.domain.task;

import ak.f;
import bk.a;
import ck.e;
import ck.i;
import cn.a0;
import cn.d0;
import com.unity3d.services.core.connectivity.ConnectivityMonitor;
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
@e(c = "com.unity3d.services.core.domain.task.InitializeStateNetworkError$doWork$2", f = "InitializeStateNetworkError.kt", l = {39}, m = "invokeSuspend")
public final class InitializeStateNetworkError$doWork$2 extends i implements c {
    final /* synthetic */ InitializeStateNetworkError.Params $params;
    Object L$0;
    int label;
    final /* synthetic */ InitializeStateNetworkError this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InitializeStateNetworkError$doWork$2(InitializeStateNetworkError initializeStateNetworkError, InitializeStateNetworkError.Params params, f fVar) {
        super(2, fVar);
        this.this$0 = initializeStateNetworkError;
        this.$params = params;
    }

    @Override // ck.a
    public final f create(Object obj, f fVar) {
        return new InitializeStateNetworkError$doWork$2(this.this$0, this.$params, fVar);
    }

    @Override // jk.c
    public final Object invoke(a0 a0Var, f fVar) {
        return ((InitializeStateNetworkError$doWork$2) create(a0Var, fVar)).invokeSuspend(r.f53297a);
    }

    @Override // ck.a
    public final Object invokeSuspend(Object obj) {
        Object objC;
        Throwable thA;
        InitializeStateNetworkError initializeStateNetworkError;
        int i10 = this.label;
        try {
            if (i10 == 0) {
                t9.e.z(obj);
                InitializeStateNetworkError initializeStateNetworkError2 = this.this$0;
                InitializeStateNetworkError.Params params = this.$params;
                DeviceLog.error("Unity Ads init: network error, waiting for connection events");
                initializeStateNetworkError2.maximumConnectedEvents = params.getConfig().getMaximumConnectedEvents();
                initializeStateNetworkError2.connectedEventThreshold = params.getConfig().getConnectedEventThreshold();
                long networkErrorTimeout = params.getConfig().getNetworkErrorTimeout();
                InitializeStateNetworkError$doWork$2$1$success$1 initializeStateNetworkError$doWork$2$1$success$1 = new InitializeStateNetworkError$doWork$2$1$success$1(initializeStateNetworkError2, null);
                this.L$0 = initializeStateNetworkError2;
                this.label = 1;
                Object objK = d0.K(networkErrorTimeout, initializeStateNetworkError$doWork$2$1$success$1, this);
                a aVar = a.f5708a;
                if (objK == aVar) {
                    return aVar;
                }
                obj = objK;
                initializeStateNetworkError = initializeStateNetworkError2;
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                initializeStateNetworkError = (InitializeStateNetworkError) this.L$0;
                t9.e.z(obj);
            }
            if (((r) obj) == null) {
                ConnectivityMonitor.removeListener(initializeStateNetworkError);
                throw new Exception("No connected events within the timeout!");
            }
            objC = r.f53297a;
            if ((objC instanceof g) && (thA = h.a(objC)) != null) {
                objC = t9.e.c(thA);
            }
            return new h(objC);
        } catch (CancellationException e10) {
            throw e10;
        } catch (Throwable th2) {
            objC = t9.e.c(th2);
        }
    }
}
