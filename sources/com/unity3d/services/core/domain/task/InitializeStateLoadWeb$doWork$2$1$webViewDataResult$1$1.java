package com.unity3d.services.core.domain.task;

import ak.f;
import bk.a;
import ck.e;
import ck.i;
import cn.a0;
import cn.d0;
import cn.w;
import com.unity3d.ads.core.domain.HttpClientProvider;
import com.unity3d.services.core.configuration.InitializeEventsMetricSender;
import com.unity3d.services.core.network.core.HttpClient;
import com.unity3d.services.core.network.model.HttpRequest;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import jk.c;
import kotlin.Metadata;
import wj.r;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u008a@"}, d2 = {"<anonymous>", "Lcom/unity3d/services/core/network/model/HttpResponse;", "it", ""}, k = 3, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
@e(c = "com.unity3d.services.core.domain.task.InitializeStateLoadWeb$doWork$2$1$webViewDataResult$1$1", f = "InitializeStateLoadWeb.kt", l = {DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_EVENT_PARSE_FAILURE_VALUE}, m = "invokeSuspend")
public final class InitializeStateLoadWeb$doWork$2$1$webViewDataResult$1$1 extends i implements c {
    final /* synthetic */ HttpRequest $request;
    /* synthetic */ int I$0;
    int label;
    final /* synthetic */ InitializeStateLoadWeb this$0;

    /* JADX INFO: renamed from: com.unity3d.services.core.domain.task.InitializeStateLoadWeb$doWork$2$1$webViewDataResult$1$1$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcn/a0;", "Lcom/unity3d/services/core/network/model/HttpResponse;", "<anonymous>", "(Lcn/a0;)Lcom/unity3d/services/core/network/model/HttpResponse;"}, k = 3, mv = {1, 8, 0})
    @e(c = "com.unity3d.services.core.domain.task.InitializeStateLoadWeb$doWork$2$1$webViewDataResult$1$1$1", f = "InitializeStateLoadWeb.kt", l = {DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_EVENT_PARSE_FAILURE_VALUE, DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_EVENT_PARSE_FAILURE_VALUE}, m = "invokeSuspend")
    public static final class AnonymousClass1 extends i implements c {
        final /* synthetic */ HttpRequest $request;
        int label;
        final /* synthetic */ InitializeStateLoadWeb this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(InitializeStateLoadWeb initializeStateLoadWeb, HttpRequest httpRequest, f fVar) {
            super(2, fVar);
            this.this$0 = initializeStateLoadWeb;
            this.$request = httpRequest;
        }

        @Override // ck.a
        public final f create(Object obj, f fVar) {
            return new AnonymousClass1(this.this$0, this.$request, fVar);
        }

        @Override // jk.c
        public final Object invoke(a0 a0Var, f fVar) {
            return ((AnonymousClass1) create(a0Var, fVar)).invokeSuspend(r.f53297a);
        }

        @Override // ck.a
        public final Object invokeSuspend(Object obj) {
            int i10 = this.label;
            a aVar = a.f5708a;
            if (i10 == 0) {
                t9.e.z(obj);
                HttpClientProvider httpClientProvider = this.this$0.httpClientProvider;
                this.label = 1;
                obj = httpClientProvider.invoke(this);
                if (obj != aVar) {
                }
            }
            if (i10 != 1) {
                if (i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t9.e.z(obj);
                return obj;
            }
            t9.e.z(obj);
            HttpRequest httpRequest = this.$request;
            this.label = 2;
            Object objExecute$default = HttpClient.DefaultImpls.execute$default((HttpClient) obj, httpRequest, false, this, 2, null);
            return objExecute$default == aVar ? aVar : objExecute$default;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InitializeStateLoadWeb$doWork$2$1$webViewDataResult$1$1(InitializeStateLoadWeb initializeStateLoadWeb, HttpRequest httpRequest, f fVar) {
        super(2, fVar);
        this.this$0 = initializeStateLoadWeb;
        this.$request = httpRequest;
    }

    @Override // ck.a
    public final f create(Object obj, f fVar) {
        InitializeStateLoadWeb$doWork$2$1$webViewDataResult$1$1 initializeStateLoadWeb$doWork$2$1$webViewDataResult$1$1 = new InitializeStateLoadWeb$doWork$2$1$webViewDataResult$1$1(this.this$0, this.$request, fVar);
        initializeStateLoadWeb$doWork$2$1$webViewDataResult$1$1.I$0 = ((Number) obj).intValue();
        return initializeStateLoadWeb$doWork$2$1$webViewDataResult$1$1;
    }

    public final Object invoke(int i10, f fVar) {
        return ((InitializeStateLoadWeb$doWork$2$1$webViewDataResult$1$1) create(Integer.valueOf(i10), fVar)).invokeSuspend(r.f53297a);
    }

    @Override // ck.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i10 = this.label;
        if (i10 != 0) {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t9.e.z(obj);
            return obj;
        }
        t9.e.z(obj);
        if (this.I$0 > 0) {
            InitializeEventsMetricSender.getInstance().onRetryWebview();
        }
        w io2 = this.this$0.dispatchers.getIo();
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$request, null);
        this.label = 1;
        Object objJ = d0.J(io2, anonymousClass1, this);
        a aVar = a.f5708a;
        return objJ == aVar ? aVar : objJ;
    }

    @Override // jk.c
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return invoke(((Number) obj).intValue(), (f) obj2);
    }
}
