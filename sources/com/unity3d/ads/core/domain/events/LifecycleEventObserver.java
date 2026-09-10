package com.unity3d.ads.core.domain.events;

import ak.f;
import ck.e;
import ck.i;
import cn.a0;
import com.unity3d.ads.core.data.datasource.LifecycleDataSource;
import com.unity3d.ads.core.data.repository.DeviceInfoRepository;
import com.unity3d.ads.core.domain.GetRequestPolicy;
import com.unity3d.ads.core.domain.GetUniversalRequestForPayLoad;
import com.unity3d.ads.core.log.Logger;
import com.unity3d.ads.gatewayclient.GatewayClient;
import fn.a1;
import fn.g;
import fn.n0;
import fn.q;
import fn.s;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import jk.b;
import jk.c;
import kotlin.Metadata;
import kotlin.jvm.internal.n;
import kotlin.jvm.internal.o;
import wj.r;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012H\u0086\u0002¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0015R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0016R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0017R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0018R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0019R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u001aR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u001bR\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"Lcom/unity3d/ads/core/domain/events/LifecycleEventObserver;", "", "Lcom/unity3d/ads/core/domain/GetUniversalRequestForPayLoad;", "getUniversalRequestForPayLoad", "Lcn/a0;", "scope", "Lcom/unity3d/ads/core/data/datasource/LifecycleDataSource;", "lifecycleDataSource", "Lcom/unity3d/ads/core/data/repository/DeviceInfoRepository;", "deviceInfoRepository", "Lcom/unity3d/ads/gatewayclient/GatewayClient;", "gatewayClient", "Lcom/unity3d/ads/core/domain/GetRequestPolicy;", "getRequestPolicy", "Lcom/unity3d/ads/core/log/Logger;", "logger", "<init>", "(Lcom/unity3d/ads/core/domain/GetUniversalRequestForPayLoad;Lcn/a0;Lcom/unity3d/ads/core/data/datasource/LifecycleDataSource;Lcom/unity3d/ads/core/data/repository/DeviceInfoRepository;Lcom/unity3d/ads/gatewayclient/GatewayClient;Lcom/unity3d/ads/core/domain/GetRequestPolicy;Lcom/unity3d/ads/core/log/Logger;)V", "Lwj/r;", "invoke", "()V", "Lcom/unity3d/ads/core/domain/GetUniversalRequestForPayLoad;", "Lcn/a0;", "Lcom/unity3d/ads/core/data/datasource/LifecycleDataSource;", "Lcom/unity3d/ads/core/data/repository/DeviceInfoRepository;", "Lcom/unity3d/ads/gatewayclient/GatewayClient;", "Lcom/unity3d/ads/core/domain/GetRequestPolicy;", "Lcom/unity3d/ads/core/log/Logger;", "Lfn/n0;", "", "isRunning", "Lfn/n0;", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
public final class LifecycleEventObserver {
    private final DeviceInfoRepository deviceInfoRepository;
    private final GatewayClient gatewayClient;
    private final GetRequestPolicy getRequestPolicy;
    private final GetUniversalRequestForPayLoad getUniversalRequestForPayLoad;
    private final n0 isRunning;
    private final LifecycleDataSource lifecycleDataSource;
    private final Logger logger;
    private final a0 scope;

    /* JADX INFO: renamed from: com.unity3d.ads.core.domain.events.LifecycleEventObserver$invoke$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "isActive", "Lwj/r;", "<anonymous>", "(Z)V"}, k = 3, mv = {1, 8, 0})
    @e(c = "com.unity3d.ads.core.domain.events.LifecycleEventObserver$invoke$2", f = "LifecycleEventObserver.kt", l = {44, DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_SUBSCRIPTION_STARTED_VALUE, DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_SUBSCRIPTION_SUCCESS_VALUE}, m = "invokeSuspend")
    public static final class AnonymousClass2 extends i implements c {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        /* synthetic */ boolean Z$0;
        int label;

        public AnonymousClass2(f fVar) {
            super(2, fVar);
        }

        @Override // ck.a
        public final f create(Object obj, f fVar) {
            AnonymousClass2 anonymousClass2 = LifecycleEventObserver.this.new AnonymousClass2(fVar);
            anonymousClass2.Z$0 = ((Boolean) obj).booleanValue();
            return anonymousClass2;
        }

        @Override // jk.c
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return invoke(((Boolean) obj).booleanValue(), (f) obj2);
        }

        /* JADX WARN: Code restructure failed: missing block: B:29:0x00e1, code lost:
        
            if (com.unity3d.ads.gatewayclient.GatewayClient.DefaultImpls.request$default(r1, null, (gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest) r0, r3, r4, r12, 1, null) == r10) goto L30;
         */
        @Override // ck.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r13) {
            /*
                Method dump skipped, instruction units count: 242
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.events.LifecycleEventObserver.AnonymousClass2.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        public final Object invoke(boolean z10, f fVar) {
            return ((AnonymousClass2) create(Boolean.valueOf(z10), fVar)).invokeSuspend(r.f53297a);
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ads.core.domain.events.LifecycleEventObserver$invoke$3, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lwj/r;", "invoke", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    public static final class AnonymousClass3 extends o implements b {
        public AnonymousClass3() {
            super(1);
        }

        @Override // jk.b
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return r.f53297a;
        }

        public final void invoke(Throwable th2) {
            n0 n0Var = LifecycleEventObserver.this.isRunning;
            Boolean bool = Boolean.FALSE;
            a1 a1Var = (a1) n0Var;
            a1Var.getClass();
            a1Var.e0(null, bool);
        }
    }

    public LifecycleEventObserver(GetUniversalRequestForPayLoad getUniversalRequestForPayLoad, a0 scope, LifecycleDataSource lifecycleDataSource, DeviceInfoRepository deviceInfoRepository, GatewayClient gatewayClient, GetRequestPolicy getRequestPolicy, Logger logger) {
        n.f(getUniversalRequestForPayLoad, "getUniversalRequestForPayLoad");
        n.f(scope, "scope");
        n.f(lifecycleDataSource, "lifecycleDataSource");
        n.f(deviceInfoRepository, "deviceInfoRepository");
        n.f(gatewayClient, "gatewayClient");
        n.f(getRequestPolicy, "getRequestPolicy");
        n.f(logger, "logger");
        this.getUniversalRequestForPayLoad = getUniversalRequestForPayLoad;
        this.scope = scope;
        this.lifecycleDataSource = lifecycleDataSource;
        this.deviceInfoRepository = deviceInfoRepository;
        this.gatewayClient = gatewayClient;
        this.getRequestPolicy = getRequestPolicy;
        this.logger = logger;
        this.isRunning = g.c(Boolean.FALSE);
    }

    public final void invoke() {
        a1 a1Var;
        Object value;
        Boolean bool;
        n0 n0Var = this.isRunning;
        do {
            a1Var = (a1) n0Var;
            value = a1Var.getValue();
            bool = (Boolean) value;
            bool.getClass();
        } while (!a1Var.c0(value, Boolean.TRUE));
        if (bool.booleanValue()) {
            return;
        }
        g.o(new s(new q(this.lifecycleDataSource.getAppActive(), 0), new AnonymousClass2(null), 2), this.scope).n(new AnonymousClass3());
    }
}
