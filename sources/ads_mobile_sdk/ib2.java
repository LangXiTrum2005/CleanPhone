package ads_mobile_sdk;

import kotlinx.coroutines.flow.arytenoidectomy;
import kotlinx.coroutines.saran;
import p002kotlin.jvm.internal.Intrinsics;
import saneness.adultoid;
import saneness.alloy;
import saneness.coffeecake;
import saneness.loungewear;
import saneness.reparation;
import saneness.sonnetize;

/* JADX INFO: loaded from: classes.dex */
public final class ib2 extends k92 {
    public final com.google.android.libraries.ads.mobile.sdk.nativead.saneness o;
    public final adultoid p;
    public final int q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ib2(saran loadScope, saran backgroundScope, com.google.android.libraries.ads.mobile.sdk.nativead.saneness nativeAdRequest, l13 traceMetaSet, jk0 flags, ri2 rootTraceCreator, String publisherRequestId, yf2 requestType, String appId, boolean z, gy0 inspectorAdLifecycleMonitor, coffeecake componentProvider, int i, arytenoidectomy cancellationChannel) {
        super(loadScope, backgroundScope, traceMetaSet, flags, rootTraceCreator, publisherRequestId, requestType, nativeAdRequest, z, appId, inspectorAdLifecycleMonitor, cancellationChannel);
        Intrinsics.checkNotNullParameter(loadScope, "loadScope");
        Intrinsics.checkNotNullParameter(backgroundScope, "backgroundScope");
        Intrinsics.checkNotNullParameter(nativeAdRequest, "nativeAdRequest");
        Intrinsics.checkNotNullParameter(traceMetaSet, "traceMetaSet");
        Intrinsics.checkNotNullParameter(flags, "flags");
        Intrinsics.checkNotNullParameter(rootTraceCreator, "rootTraceCreator");
        Intrinsics.checkNotNullParameter(publisherRequestId, "publisherRequestId");
        Intrinsics.checkNotNullParameter(requestType, "requestType");
        Intrinsics.checkNotNullParameter(appId, "appId");
        Intrinsics.checkNotNullParameter(inspectorAdLifecycleMonitor, "inspectorAdLifecycleMonitor");
        Intrinsics.checkNotNullParameter(componentProvider, "componentProvider");
        Intrinsics.checkNotNullParameter(cancellationChannel, "cancellationChannel");
        this.o = nativeAdRequest;
        this.p = componentProvider;
        this.q = i;
    }

    @Override // ads_mobile_sdk.k92
    public final Object a(w82 w82Var) {
        Object obj = this.p.get();
        Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
        loungewear loungewearVar = (loungewear) a((reparation) obj, this.o);
        com.google.android.libraries.ads.mobile.sdk.nativead.saneness sanenessVar = this.o;
        h70 h70Var = (h70) loungewearVar;
        sanenessVar.getClass();
        h70Var.l = sanenessVar;
        h70Var.k = Integer.valueOf(this.q);
        h70Var.m = Boolean.FALSE;
        h70Var.n = new sonnetize();
        return ((j31) ((alloy) h70Var.a().B0.get())).a(w82Var);
    }
}
