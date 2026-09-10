package com.unity3d.ads.core.domain.events;

import ak.f;
import bk.a;
import ck.e;
import ck.i;
import cn.a0;
import cn.d0;
import cn.w;
import cn.x;
import com.unity3d.ads.core.data.datasource.UniversalRequestDataSource;
import com.unity3d.ads.core.data.repository.OperativeEventRepository;
import com.unity3d.ads.core.domain.GetRequestPolicy;
import com.unity3d.ads.core.domain.GetUniversalRequestForPayLoad;
import com.unity3d.ads.core.domain.SendDiagnosticEvent;
import com.unity3d.ads.core.domain.work.BackgroundWorker;
import fn.a1;
import fn.g;
import fn.n0;
import fn.s;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import gatewayprotocol.v1.OperativeEventRequestOuterClass;
import jk.c;
import kotlin.Metadata;
import kotlin.jvm.internal.n;
import wj.r;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0013\u0010\u0015\u001a\u00020\u0014H\u0086Bø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0017R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0018R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0019R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u001aR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u001bR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u001cR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u001dR\u001a\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010#\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006%"}, d2 = {"Lcom/unity3d/ads/core/domain/events/OperativeEventObserver;", "", "Lcom/unity3d/ads/core/domain/GetUniversalRequestForPayLoad;", "getUniversalRequestForPayLoad", "Lcn/w;", "defaultDispatcher", "Lcom/unity3d/ads/core/data/repository/OperativeEventRepository;", "operativeEventRepository", "Lcom/unity3d/ads/core/data/datasource/UniversalRequestDataSource;", "universalRequestDataSource", "Lcom/unity3d/ads/core/domain/work/BackgroundWorker;", "backgroundWorker", "Lcom/unity3d/ads/core/domain/events/UniversalRequestEventSender;", "universalRequestEventSender", "Lcom/unity3d/ads/core/domain/GetRequestPolicy;", "operativeRequestPolicy", "Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;", "sendDiagnosticEvent", "<init>", "(Lcom/unity3d/ads/core/domain/GetUniversalRequestForPayLoad;Lcn/w;Lcom/unity3d/ads/core/data/repository/OperativeEventRepository;Lcom/unity3d/ads/core/data/datasource/UniversalRequestDataSource;Lcom/unity3d/ads/core/domain/work/BackgroundWorker;Lcom/unity3d/ads/core/domain/events/UniversalRequestEventSender;Lcom/unity3d/ads/core/domain/GetRequestPolicy;Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;)V", "Lwj/r;", "invoke", "(Lak/f;)Ljava/lang/Object;", "Lcom/unity3d/ads/core/domain/GetUniversalRequestForPayLoad;", "Lcom/unity3d/ads/core/data/repository/OperativeEventRepository;", "Lcom/unity3d/ads/core/data/datasource/UniversalRequestDataSource;", "Lcom/unity3d/ads/core/domain/work/BackgroundWorker;", "Lcom/unity3d/ads/core/domain/events/UniversalRequestEventSender;", "Lcom/unity3d/ads/core/domain/GetRequestPolicy;", "Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;", "Lfn/n0;", "", "isRunning", "Lfn/n0;", "Lcn/a0;", "scope", "Lcn/a0;", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
public final class OperativeEventObserver {
    private final BackgroundWorker backgroundWorker;
    private final GetUniversalRequestForPayLoad getUniversalRequestForPayLoad;
    private final n0 isRunning;
    private final OperativeEventRepository operativeEventRepository;
    private final GetRequestPolicy operativeRequestPolicy;
    private final a0 scope;
    private final SendDiagnosticEvent sendDiagnosticEvent;
    private final UniversalRequestDataSource universalRequestDataSource;
    private final UniversalRequestEventSender universalRequestEventSender;

    /* JADX INFO: renamed from: com.unity3d.ads.core.domain.events.OperativeEventObserver$invoke$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcn/a0;", "Lwj/r;", "<anonymous>", "(Lcn/a0;)V"}, k = 3, mv = {1, 8, 0})
    @e(c = "com.unity3d.ads.core.domain.events.OperativeEventObserver$invoke$2", f = "OperativeEventObserver.kt", l = {}, m = "invokeSuspend")
    public static final class AnonymousClass2 extends i implements c {
        int label;

        /* JADX INFO: renamed from: com.unity3d.ads.core.domain.events.OperativeEventObserver$invoke$2$2, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lgatewayprotocol/v1/OperativeEventRequestOuterClass$OperativeEventRequest;", "operativeEventRequest", "Lwj/r;", "<anonymous>", "(Lgatewayprotocol/v1/OperativeEventRequestOuterClass$OperativeEventRequest;)V"}, k = 3, mv = {1, 8, 0})
        @e(c = "com.unity3d.ads.core.domain.events.OperativeEventObserver$invoke$2$2", f = "OperativeEventObserver.kt", l = {DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_EXTRAS_EXCEEDED_SIZE_VALUE, DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_SUBSCRIPTION_STARTED_VALUE, DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_SEND_STARTED_VALUE}, m = "invokeSuspend")
        public static final class C02182 extends i implements c {
            /* synthetic */ Object L$0;
            Object L$1;
            int label;
            final /* synthetic */ OperativeEventObserver this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C02182(OperativeEventObserver operativeEventObserver, f fVar) {
                super(2, fVar);
                this.this$0 = operativeEventObserver;
            }

            @Override // ck.a
            public final f create(Object obj, f fVar) {
                C02182 c02182 = new C02182(this.this$0, fVar);
                c02182.L$0 = obj;
                return c02182;
            }

            @Override // jk.c
            public final Object invoke(OperativeEventRequestOuterClass.OperativeEventRequest operativeEventRequest, f fVar) {
                return ((C02182) create(operativeEventRequest, fVar)).invokeSuspend(r.f53297a);
            }

            /* JADX WARN: Code restructure failed: missing block: B:26:0x00eb, code lost:
            
                if (r15.invoke(r2, r0, r14) == r4) goto L27;
             */
            @Override // ck.a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r15) {
                /*
                    Method dump skipped, instruction units count: 241
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.events.OperativeEventObserver.AnonymousClass2.C02182.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        public AnonymousClass2(f fVar) {
            super(2, fVar);
        }

        @Override // ck.a
        public final f create(Object obj, f fVar) {
            return OperativeEventObserver.this.new AnonymousClass2(fVar);
        }

        @Override // jk.c
        public final Object invoke(a0 a0Var, f fVar) {
            return ((AnonymousClass2) create(a0Var, fVar)).invokeSuspend(r.f53297a);
        }

        @Override // ck.a
        public final Object invokeSuspend(Object obj) {
            a1 a1Var;
            Object value;
            Boolean bool;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t9.e.z(obj);
            n0 n0Var = OperativeEventObserver.this.isRunning;
            do {
                a1Var = (a1) n0Var;
                value = a1Var.getValue();
                bool = (Boolean) value;
                bool.getClass();
            } while (!a1Var.c0(value, Boolean.TRUE));
            boolean zBooleanValue = bool.booleanValue();
            r rVar = r.f53297a;
            if (zBooleanValue) {
                return rVar;
            }
            g.o(new s(OperativeEventObserver.this.operativeEventRepository.getOperativeEvents(), new C02182(OperativeEventObserver.this, null), 2), OperativeEventObserver.this.scope);
            return rVar;
        }
    }

    public OperativeEventObserver(GetUniversalRequestForPayLoad getUniversalRequestForPayLoad, w defaultDispatcher, OperativeEventRepository operativeEventRepository, UniversalRequestDataSource universalRequestDataSource, BackgroundWorker backgroundWorker, UniversalRequestEventSender universalRequestEventSender, GetRequestPolicy operativeRequestPolicy, SendDiagnosticEvent sendDiagnosticEvent) {
        n.f(getUniversalRequestForPayLoad, "getUniversalRequestForPayLoad");
        n.f(defaultDispatcher, "defaultDispatcher");
        n.f(operativeEventRepository, "operativeEventRepository");
        n.f(universalRequestDataSource, "universalRequestDataSource");
        n.f(backgroundWorker, "backgroundWorker");
        n.f(universalRequestEventSender, "universalRequestEventSender");
        n.f(operativeRequestPolicy, "operativeRequestPolicy");
        n.f(sendDiagnosticEvent, "sendDiagnosticEvent");
        this.getUniversalRequestForPayLoad = getUniversalRequestForPayLoad;
        this.operativeEventRepository = operativeEventRepository;
        this.universalRequestDataSource = universalRequestDataSource;
        this.backgroundWorker = backgroundWorker;
        this.universalRequestEventSender = universalRequestEventSender;
        this.operativeRequestPolicy = operativeRequestPolicy;
        this.sendDiagnosticEvent = sendDiagnosticEvent;
        this.isRunning = g.c(Boolean.FALSE);
        this.scope = d0.b(defaultDispatcher.plus(new OperativeEventObserver$special$$inlined$CoroutineExceptionHandler$1(x.f6783a)));
    }

    public final Object invoke(f fVar) throws Throwable {
        Object objJ = d0.J(this.scope.getCoroutineContext(), new AnonymousClass2(null), fVar);
        return objJ == a.f5708a ? objJ : r.f53297a;
    }
}
