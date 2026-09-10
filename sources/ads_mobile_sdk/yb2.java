package ads_mobile_sdk;

import complexometry.competently;
import kotlinx.coroutines.flow.arytenoidectomy;
import kotlinx.coroutines.saran;
import p002kotlin.jvm.internal.Intrinsics;
import saneness.adultoid;
import saneness.alloy;
import saneness.coffeecake;
import saneness.regie;
import saneness.reparation;

/* JADX INFO: loaded from: classes.dex */
public final class yb2 extends k92 {
    public final competently o;
    public final adultoid p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yb2(competently adRequest, yf2 requestType, jk0 flags, gy0 inspectorAdLifecycleMonitor, ri2 rootTraceCreator, l13 traceMetaSet, String publisherRequestId, String appId, coffeecake componentProvider, saran loadScope, saran backgroundScope, arytenoidectomy cancellationChannel, boolean z) {
        super(loadScope, backgroundScope, traceMetaSet, flags, rootTraceCreator, publisherRequestId, requestType, adRequest, z, appId, inspectorAdLifecycleMonitor, cancellationChannel);
        Intrinsics.checkNotNullParameter(loadScope, "loadScope");
        Intrinsics.checkNotNullParameter(backgroundScope, "backgroundScope");
        Intrinsics.checkNotNullParameter(traceMetaSet, "traceMetaSet");
        Intrinsics.checkNotNullParameter(flags, "flags");
        Intrinsics.checkNotNullParameter(rootTraceCreator, "rootTraceCreator");
        Intrinsics.checkNotNullParameter(publisherRequestId, "publisherRequestId");
        Intrinsics.checkNotNullParameter(requestType, "requestType");
        Intrinsics.checkNotNullParameter(appId, "appId");
        Intrinsics.checkNotNullParameter(inspectorAdLifecycleMonitor, "inspectorAdLifecycleMonitor");
        Intrinsics.checkNotNullParameter(adRequest, "adRequest");
        Intrinsics.checkNotNullParameter(componentProvider, "componentProvider");
        Intrinsics.checkNotNullParameter(cancellationChannel, "cancellationChannel");
        this.o = adRequest;
        this.p = componentProvider;
    }

    @Override // ads_mobile_sdk.k92
    public final Object a(w82 w82Var) {
        Object obj = this.p.get();
        Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
        return ((j31) ((alloy) ((l70) ((regie) a((reparation) obj, this.o))).a().t0.get())).a(w82Var);
    }
}
