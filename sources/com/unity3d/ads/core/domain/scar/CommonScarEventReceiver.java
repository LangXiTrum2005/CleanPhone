package com.unity3d.ads.core.domain.scar;

import ak.f;
import ck.e;
import ck.i;
import cn.a0;
import cn.d0;
import com.unity3d.services.core.webview.WebViewEventCategory;
import com.unity3d.services.core.webview.bridge.IEventSender;
import en.a;
import fn.g;
import fn.m0;
import fn.r0;
import fn.u0;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import jk.c;
import kotlin.Metadata;
import kotlin.jvm.internal.n;
import wj.r;
import xj.k;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J;\u0010\r\u001a\u00020\f2\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u00062\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u00062\u0012\u0010\u000b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\n0\t\"\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0011R\u001c\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u001f\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u00168\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0015R\u001d\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00168\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u0018\u001a\u0004\b\u001e\u0010\u001a¨\u0006\u001f"}, d2 = {"Lcom/unity3d/ads/core/domain/scar/CommonScarEventReceiver;", "Lcom/unity3d/services/core/webview/bridge/IEventSender;", "Lcn/a0;", "scope", "<init>", "(Lcn/a0;)V", "", "eventCategory", "eventId", "", "", "params", "", "sendEvent", "(Ljava/lang/Enum;Ljava/lang/Enum;[Ljava/lang/Object;)Z", "canSend", "()Z", "Lcn/a0;", "Lfn/m0;", "", "_versionFlow", "Lfn/m0;", "Lfn/r0;", "versionFlow", "Lfn/r0;", "getVersionFlow", "()Lfn/r0;", "Lcom/unity3d/ads/core/domain/scar/GmaEventData;", "_gmaEventFlow", "gmaEventFlow", "getGmaEventFlow", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
public final class CommonScarEventReceiver implements IEventSender {
    private final m0 _gmaEventFlow;
    private final m0 _versionFlow;
    private final r0 gmaEventFlow;
    private final a0 scope;
    private final r0 versionFlow;

    /* JADX INFO: renamed from: com.unity3d.ads.core.domain.scar.CommonScarEventReceiver$sendEvent$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcn/a0;", "Lwj/r;", "<anonymous>", "(Lcn/a0;)V"}, k = 3, mv = {1, 8, 0})
    @e(c = "com.unity3d.ads.core.domain.scar.CommonScarEventReceiver$sendEvent$1", f = "CommonScarEventReceiver.kt", l = {DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_SHOW_FAILURE_TIME_VALUE, 41, DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_SUBSCRIPTION_SUCCESS_VALUE, 66, 73}, m = "invokeSuspend")
    public static final class AnonymousClass1 extends i implements c {
        final /* synthetic */ Enum<?> $eventId;
        final /* synthetic */ Object[] $params;
        int label;
        final /* synthetic */ CommonScarEventReceiver this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Enum<?> r2, Object[] objArr, CommonScarEventReceiver commonScarEventReceiver, f fVar) {
            super(2, fVar);
            this.$eventId = r2;
            this.$params = objArr;
            this.this$0 = commonScarEventReceiver;
        }

        @Override // ck.a
        public final f create(Object obj, f fVar) {
            return new AnonymousClass1(this.$eventId, this.$params, this.this$0, fVar);
        }

        @Override // jk.c
        public final Object invoke(a0 a0Var, f fVar) {
            return ((AnonymousClass1) create(a0Var, fVar)).invokeSuspend(r.f53297a);
        }

        /* JADX WARN: Code duplicated, block: B:40:0x00f7  */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x0052, code lost:
        
            if (r2.emit(r1, r20) == r9) goto L42;
         */
        /* JADX WARN: Code restructure failed: missing block: B:26:0x0080, code lost:
        
            if (r2.emit(r10, r20) == r9) goto L42;
         */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x00c5, code lost:
        
            if (r2.emit(r10, r20) == r9) goto L42;
         */
        /* JADX WARN: Code restructure failed: missing block: B:41:0x0123, code lost:
        
            if (r1.emit(r10, r20) == r9) goto L42;
         */
        @Override // ck.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r21) {
            /*
                Method dump skipped, instruction units count: 297
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.scar.CommonScarEventReceiver.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public CommonScarEventReceiver(a0 scope) {
        n.f(scope, "scope");
        this.scope = scope;
        u0 u0VarA = g.a((7 & 1) != 0 ? 0 : 100, (7 & 2) == 0 ? 64 : 0, a.f40122a);
        this._versionFlow = u0VarA;
        this.versionFlow = g.g(u0VarA);
        u0 u0VarA2 = g.a((7 & 1) != 0 ? 0 : 100, (7 & 2) == 0 ? 64 : 0, a.f40122a);
        this._gmaEventFlow = u0VarA2;
        this.gmaEventFlow = g.g(u0VarA2);
    }

    @Override // com.unity3d.services.core.webview.bridge.IEventSender
    public boolean canSend() {
        return true;
    }

    public final r0 getGmaEventFlow() {
        return this.gmaEventFlow;
    }

    public final r0 getVersionFlow() {
        return this.versionFlow;
    }

    @Override // com.unity3d.services.core.webview.bridge.IEventSender
    public boolean sendEvent(Enum<?> eventCategory, Enum<?> eventId, Object... params) {
        n.f(eventCategory, "eventCategory");
        n.f(eventId, "eventId");
        n.f(params, "params");
        if (!xj.n.i0(k.E0(new WebViewEventCategory[]{WebViewEventCategory.INIT_GMA, WebViewEventCategory.GMA, WebViewEventCategory.BANNER}), eventCategory)) {
            return false;
        }
        d0.w(this.scope, null, new AnonymousClass1(eventId, params, this, null), 3);
        return true;
    }
}
