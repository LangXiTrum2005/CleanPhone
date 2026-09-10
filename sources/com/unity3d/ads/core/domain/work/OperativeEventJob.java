package com.unity3d.ads.core.domain.work;

import ak.f;
import android.content.Context;
import androidx.work.WorkerParameters;
import bk.a;
import ck.c;
import ck.e;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.domain.GetRequestPolicy;
import com.unity3d.ads.core.domain.SendDiagnosticEvent;
import com.unity3d.ads.core.domain.events.UniversalRequestEventSender;
import com.unity3d.ads.core.extensions.TimeExtensionsKt;
import com.unity3d.services.core.di.IServiceComponent;
import com.unity3d.services.core.di.ServiceProvider;
import d5.l;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.n;
import r9.b;
import wj.d;
import xj.b0;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0013\u0010\n\u001a\u00020\tH\u0096@ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bR\u001b\u0010\u0011\u001a\u00020\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001b\u0010\u0016\u001a\u00020\u00128BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u000e\u001a\u0004\b\u0014\u0010\u0015R\u001b\u0010\u001b\u001a\u00020\u00178TX\u0094\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u000e\u001a\u0004\b\u0019\u0010\u001a\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001c"}, d2 = {"Lcom/unity3d/ads/core/domain/work/OperativeEventJob;", "Lcom/unity3d/ads/core/domain/work/UniversalRequestJob;", "Lcom/unity3d/services/core/di/IServiceComponent;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "workerParams", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "Ld5/n;", "doWork", "(Lak/f;)Ljava/lang/Object;", "Lcom/unity3d/ads/core/domain/GetRequestPolicy;", "getOperativeRequestPolicy$delegate", "Lwj/d;", "getGetOperativeRequestPolicy", "()Lcom/unity3d/ads/core/domain/GetRequestPolicy;", "getOperativeRequestPolicy", "Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;", "sendDiagnosticEvent$delegate", "getSendDiagnosticEvent", "()Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;", "sendDiagnosticEvent", "Lcom/unity3d/ads/core/domain/events/UniversalRequestEventSender;", "universalRequestEventSender$delegate", "getUniversalRequestEventSender", "()Lcom/unity3d/ads/core/domain/events/UniversalRequestEventSender;", "universalRequestEventSender", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
public final class OperativeEventJob extends UniversalRequestJob implements IServiceComponent {

    /* JADX INFO: renamed from: getOperativeRequestPolicy$delegate, reason: from kotlin metadata */
    private final d getOperativeRequestPolicy;

    /* JADX INFO: renamed from: sendDiagnosticEvent$delegate, reason: from kotlin metadata */
    private final d sendDiagnosticEvent;

    /* JADX INFO: renamed from: universalRequestEventSender$delegate, reason: from kotlin metadata */
    private final d universalRequestEventSender;

    /* JADX INFO: renamed from: com.unity3d.ads.core.domain.work.OperativeEventJob$doWork$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    @e(c = "com.unity3d.ads.core.domain.work.OperativeEventJob", f = "OperativeEventJob.kt", l = {32}, m = "doWork")
    @Metadata(k = 3, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
    public static final class AnonymousClass1 extends c {
        long J$0;
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(f fVar) {
            super(fVar);
        }

        @Override // ck.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return OperativeEventJob.this.doWork(this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OperativeEventJob(Context context, WorkerParameters workerParams) {
        super(context, workerParams);
        n.f(context, "context");
        n.f(workerParams, "workerParams");
        OperativeEventJob$special$$inlined$inject$default$1 operativeEventJob$special$$inlined$inject$default$1 = new OperativeEventJob$special$$inlined$inject$default$1(this, ServiceProvider.NAMED_OPERATIVE_REQ);
        wj.e eVar = wj.e.f53281b;
        this.getOperativeRequestPolicy = b.t(eVar, operativeEventJob$special$$inlined$inject$default$1);
        this.sendDiagnosticEvent = b.t(eVar, new OperativeEventJob$special$$inlined$inject$default$2(this, ""));
        this.universalRequestEventSender = b.t(eVar, new OperativeEventJob$special$$inlined$inject$default$3(this, ServiceProvider.OPERATIVE_EVENT_SENDER));
    }

    private final GetRequestPolicy getGetOperativeRequestPolicy() {
        return (GetRequestPolicy) this.getOperativeRequestPolicy.getValue();
    }

    private final SendDiagnosticEvent getSendDiagnosticEvent() {
        return (SendDiagnosticEvent) this.sendDiagnosticEvent.getValue();
    }

    /* JADX WARN: Code duplicated, block: B:30:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.unity3d.ads.core.domain.work.UniversalRequestJob, androidx.work.CoroutineWorker
    public Object doWork(f fVar) {
        AnonymousClass1 anonymousClass1;
        Throwable th2;
        long j10;
        String message;
        if (fVar instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) fVar;
            int i10 = anonymousClass1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label = i10 - Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(fVar);
            }
        } else {
            anonymousClass1 = new AnonymousClass1(fVar);
        }
        Object objDoWork = anonymousClass1.result;
        int i11 = anonymousClass1.label;
        if (i11 == 0) {
            t9.e.z(objDoWork);
            long jB = bn.d.b();
            try {
                setRequestPolicy(getGetOperativeRequestPolicy().invoke());
                anonymousClass1.L$0 = this;
                anonymousClass1.J$0 = jB;
                anonymousClass1.label = 1;
                objDoWork = super.doWork(anonymousClass1);
                a aVar = a.f5708a;
                if (objDoWork == aVar) {
                    return aVar;
                }
                j10 = jB;
            } catch (Throwable th3) {
                th2 = th3;
                j10 = jB;
                SendDiagnosticEvent sendDiagnosticEvent = this.getSendDiagnosticEvent();
                DiagnosticEventRequestOuterClass.DiagnosticEventType diagnosticEventType = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_OPERATIVE_EVENT_FAILURE;
                Double d10 = new Double(TimeExtensionsKt.elapsedMillis(new bn.f(j10)));
                wj.f fVar2 = new wj.f("reason", th2.getClass().getSimpleName());
                message = th2.getMessage();
                if (message == null) {
                    message = th2.getClass().getSimpleName();
                }
                SendDiagnosticEvent.DefaultImpls.invoke$default(sendDiagnosticEvent, diagnosticEventType, d10, b0.Q(fVar2, new wj.f("reason_debug", message)), (Map) null, (AdObject) null, (Integer) null, 56, (Object) null);
                this.getLogger().trace("OperativeEventJob failed to process work", th2);
                return new l();
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j10 = anonymousClass1.J$0;
            this = (OperativeEventJob) anonymousClass1.L$0;
            try {
                t9.e.z(objDoWork);
            } catch (Throwable th4) {
                th2 = th4;
                SendDiagnosticEvent sendDiagnosticEvent2 = this.getSendDiagnosticEvent();
                DiagnosticEventRequestOuterClass.DiagnosticEventType diagnosticEventType2 = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_OPERATIVE_EVENT_FAILURE;
                Double d11 = new Double(TimeExtensionsKt.elapsedMillis(new bn.f(j10)));
                wj.f fVar3 = new wj.f("reason", th2.getClass().getSimpleName());
                message = th2.getMessage();
                if (message == null) {
                    message = th2.getClass().getSimpleName();
                }
                SendDiagnosticEvent.DefaultImpls.invoke$default(sendDiagnosticEvent2, diagnosticEventType2, d11, b0.Q(fVar3, new wj.f("reason_debug", message)), (Map) null, (AdObject) null, (Integer) null, 56, (Object) null);
                this.getLogger().trace("OperativeEventJob failed to process work", th2);
                return new l();
            }
        }
        SendDiagnosticEvent.DefaultImpls.invoke$default(this.getSendDiagnosticEvent(), DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_OPERATIVE_EVENT_SENT, new Double(TimeExtensionsKt.elapsedMillis(new bn.f(j10))), (Map) null, (Map) null, (AdObject) null, (Integer) null, 60, (Object) null);
        return (d5.n) objDoWork;
    }

    @Override // com.unity3d.ads.core.domain.work.UniversalRequestJob
    public UniversalRequestEventSender getUniversalRequestEventSender() {
        return (UniversalRequestEventSender) this.universalRequestEventSender.getValue();
    }
}
