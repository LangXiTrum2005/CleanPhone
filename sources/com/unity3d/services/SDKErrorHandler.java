package com.unity3d.services;

import ak.f;
import ak.j;
import ak.k;
import ck.e;
import ck.i;
import cn.a0;
import cn.d0;
import cn.w;
import cn.x;
import cn.y;
import cn.z;
import com.google.protobuf.ByteString;
import com.ironsource.X3;
import com.unity3d.ads.core.configuration.AlternativeFlowReader;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.data.model.CoroutineOpportunity;
import com.unity3d.ads.core.domain.SendDiagnosticEvent;
import com.unity3d.ads.core.extensions.ExceptionExtensionsKt;
import com.unity3d.ads.core.extensions.ProtobufExtensionsKt;
import com.unity3d.services.core.log.DeviceLog;
import com.unity3d.services.core.request.metrics.Metric;
import com.unity3d.services.core.request.metrics.SDKMetricsSender;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import hn.d;
import java.util.Map;
import jk.c;
import kotlin.Metadata;
import kotlin.jvm.internal.n;
import wj.r;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0003\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 /2\u00020\u0001:\u0001/B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ9\u0010\u0014\u001a\u00020\u00132\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001c\u001a\u00020\f2\u0006\u0010\u001b\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0019\u0010\u001e\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u001b\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u001f\u0010\"\u001a\u00020\u00132\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010!\u001a\u00020 H\u0016¢\u0006\u0004\b\"\u0010#R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010$R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010%R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010&R\u0014\u0010(\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u001a\u0010+\u001a\u00020*8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.¨\u00060"}, d2 = {"Lcom/unity3d/services/SDKErrorHandler;", "Lcn/y;", "Lcn/w;", "defaultDispatcher", "Lcom/unity3d/ads/core/configuration/AlternativeFlowReader;", "alternativeFlowReader", "Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;", "sendDiagnosticEvent", "Lcom/unity3d/services/core/request/metrics/SDKMetricsSender;", "sdkMetricsSender", "<init>", "(Lcn/w;Lcom/unity3d/ads/core/configuration/AlternativeFlowReader;Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;Lcom/unity3d/services/core/request/metrics/SDKMetricsSender;)V", "", "name", "reason", "scopeName", "stackTrace", "Lcom/google/protobuf/ByteString;", "opportunityId", "Lwj/r;", "sendDiagnostic", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/google/protobuf/ByteString;)V", "Lcom/unity3d/services/core/request/metrics/Metric;", "metric", "sendMetric", "(Lcom/unity3d/services/core/request/metrics/Metric;)V", "Lak/k;", "context", "retrieveCoroutineName", "(Lak/k;)Ljava/lang/String;", "retrieveOpportunityId", "(Lak/k;)Lcom/google/protobuf/ByteString;", "", "exception", "handleException", "(Lak/k;Ljava/lang/Throwable;)V", "Lcom/unity3d/ads/core/configuration/AlternativeFlowReader;", "Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;", "Lcom/unity3d/services/core/request/metrics/SDKMetricsSender;", "Lcn/a0;", "scope", "Lcn/a0;", "Lcn/x;", X3.i.W, "Lcn/x;", "getKey", "()Lcn/x;", "Companion", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
public final class SDKErrorHandler implements y {
    public static final String UNITY_PACKAGE = "com.unity3d";
    public static final String UNKNOWN_FILE = "unknown";
    private final AlternativeFlowReader alternativeFlowReader;
    private final x key;
    private final a0 scope;
    private final SDKMetricsSender sdkMetricsSender;
    private final SendDiagnosticEvent sendDiagnosticEvent;

    /* JADX INFO: renamed from: com.unity3d.services.SDKErrorHandler$handleException$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcn/a0;", "Lwj/r;", "<anonymous>", "(Lcn/a0;)V"}, k = 3, mv = {1, 8, 0})
    @e(c = "com.unity3d.services.SDKErrorHandler$handleException$1", f = "SDKErrorHandler.kt", l = {}, m = "invokeSuspend")
    public static final class AnonymousClass1 extends i implements c {
        final /* synthetic */ k $context;
        final /* synthetic */ Throwable $exception;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(k kVar, Throwable th2, f fVar) {
            super(2, fVar);
            this.$context = kVar;
            this.$exception = th2;
        }

        @Override // ck.a
        public final f create(Object obj, f fVar) {
            return SDKErrorHandler.this.new AnonymousClass1(this.$context, this.$exception, fVar);
        }

        @Override // jk.c
        public final Object invoke(a0 a0Var, f fVar) {
            return ((AnonymousClass1) create(a0Var, fVar)).invokeSuspend(r.f53297a);
        }

        @Override // ck.a
        public final Object invokeSuspend(Object obj) {
            String str;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t9.e.z(obj);
            String strRetrieveCoroutineName = SDKErrorHandler.this.retrieveCoroutineName(this.$context);
            ByteString byteStringRetrieveOpportunityId = SDKErrorHandler.this.retrieveOpportunityId(this.$context);
            Throwable th2 = this.$exception;
            if (th2 instanceof NullPointerException) {
                str = "native_exception_npe";
            } else if (th2 instanceof OutOfMemoryError) {
                str = "native_exception_oom";
            } else if (th2 instanceof IllegalStateException) {
                str = "native_exception_ise";
            } else if (th2 instanceof SecurityException) {
                str = "native_exception_se";
            } else {
                str = th2 instanceof RuntimeException ? "native_exception_re" : "native_exception";
            }
            String str2 = str;
            boolean zInvoke = SDKErrorHandler.this.alternativeFlowReader.invoke();
            String strRetrieveUnityCrashValue = ExceptionExtensionsKt.retrieveUnityCrashValue(this.$exception);
            DeviceLog.error("Unity Ads SDK encountered an exception: " + strRetrieveUnityCrashValue);
            if (zInvoke) {
                SDKErrorHandler.this.sendDiagnostic(str2, strRetrieveUnityCrashValue, strRetrieveCoroutineName, ExceptionExtensionsKt.getShortenedStackTrace(this.$exception, 15), byteStringRetrieveOpportunityId);
            } else {
                SDKErrorHandler.this.sendMetric(new Metric(str2, strRetrieveUnityCrashValue, null, 4, null));
            }
            return r.f53297a;
        }
    }

    public SDKErrorHandler(w defaultDispatcher, AlternativeFlowReader alternativeFlowReader, SendDiagnosticEvent sendDiagnosticEvent, SDKMetricsSender sdkMetricsSender) {
        n.f(defaultDispatcher, "defaultDispatcher");
        n.f(alternativeFlowReader, "alternativeFlowReader");
        n.f(sendDiagnosticEvent, "sendDiagnosticEvent");
        n.f(sdkMetricsSender, "sdkMetricsSender");
        this.alternativeFlowReader = alternativeFlowReader;
        this.sendDiagnosticEvent = sendDiagnosticEvent;
        this.sdkMetricsSender = sdkMetricsSender;
        d dVarY = d0.y(d0.b(defaultDispatcher), new z("SDKErrorHandler"));
        x xVar = x.f6783a;
        this.scope = d0.y(dVarY, new SDKErrorHandler$special$$inlined$CoroutineExceptionHandler$1(xVar));
        this.key = xVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String retrieveCoroutineName(k context) {
        String str;
        z zVar = (z) context.get(z.f6788b);
        return (zVar == null || (str = zVar.f6789a) == null) ? "unknown" : str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ByteString retrieveOpportunityId(k context) {
        CoroutineOpportunity coroutineOpportunity = (CoroutineOpportunity) context.get(CoroutineOpportunity.INSTANCE);
        if (coroutineOpportunity != null) {
            return coroutineOpportunity.getValue();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void sendDiagnostic(String name, String reason, String scopeName, String stackTrace, ByteString opportunityId) {
        SendDiagnosticEvent sendDiagnosticEvent = this.sendDiagnosticEvent;
        yj.f fVar = new yj.f();
        fVar.put("reason", reason);
        fVar.put("reason_debug", stackTrace);
        fVar.put("coroutine_name", scopeName);
        if (opportunityId != null) {
            String string = ProtobufExtensionsKt.toUUID(opportunityId).toString();
            n.e(string, "it.toUUID().toString()");
            fVar.put("impressionOpportunityId", string);
        }
        SendDiagnosticEvent.DefaultImpls.invoke$default(sendDiagnosticEvent, name, (Double) null, fVar.g(), (Map) null, (AdObject) null, (Integer) null, 58, (Object) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void sendMetric(Metric metric) {
        this.sdkMetricsSender.sendMetric(metric);
    }

    @Override // ak.k
    public <R> R fold(R r2, c cVar) {
        return (R) com.google.android.gms.internal.auth.i.p(this, r2, cVar);
    }

    @Override // ak.k
    public <E extends ak.i> E get(j jVar) {
        return (E) com.google.android.gms.internal.auth.i.r(this, jVar);
    }

    @Override // cn.y
    public void handleException(k context, Throwable exception) {
        n.f(context, "context");
        n.f(exception, "exception");
        d0.w(this.scope, null, new AnonymousClass1(context, exception, null), 3);
    }

    @Override // ak.k
    public k minusKey(j jVar) {
        return com.google.android.gms.internal.auth.i.z(this, jVar);
    }

    @Override // ak.k
    public k plus(k kVar) {
        return com.google.android.gms.internal.auth.i.D(this, kVar);
    }

    @Override // ak.i
    public x getKey() {
        return this.key;
    }
}
