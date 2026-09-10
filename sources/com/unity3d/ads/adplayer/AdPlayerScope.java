package com.unity3d.ads.adplayer;

import ak.k;
import cn.a0;
import cn.d0;
import cn.w;
import cn.y;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import kotlin.Metadata;
import kotlin.jvm.internal.n;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\bR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\tR\u0014\u0010\r\u001a\u00020\n8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"Lcom/unity3d/ads/adplayer/AdPlayerScope;", "Lcn/a0;", "Lcn/w;", "defaultDispatcher", "Lcn/y;", "sdkErrorHandler", "<init>", "(Lcn/w;Lcn/y;)V", "Lcn/w;", "Lcn/y;", "Lak/k;", "getCoroutineContext", "()Lak/k;", "coroutineContext", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
public final class AdPlayerScope implements a0 {
    private final /* synthetic */ a0 $$delegate_0;
    private final w defaultDispatcher;
    private final y sdkErrorHandler;

    public AdPlayerScope(w defaultDispatcher, y sdkErrorHandler) {
        n.f(defaultDispatcher, "defaultDispatcher");
        n.f(sdkErrorHandler, "sdkErrorHandler");
        this.defaultDispatcher = defaultDispatcher;
        this.sdkErrorHandler = sdkErrorHandler;
        this.$$delegate_0 = d0.b(defaultDispatcher.plus(sdkErrorHandler));
    }

    @Override // cn.a0
    public k getCoroutineContext() {
        return this.$$delegate_0.getCoroutineContext();
    }
}
