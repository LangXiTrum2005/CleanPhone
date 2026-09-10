package ads_mobile_sdk;

import kotlinx.coroutines.saran;
import p002kotlin.jvm.internal.Intrinsics;
import saneness.rotuma;

/* JADX INFO: loaded from: classes.dex */
public final class b93 extends ya1 implements rotuma {
    public final gq0 j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b93(gq0 gmaWebView, ri2 rootTraceCreator, l13 traceMetaSet, ip0 gmaUtil, saran backgroundScope, jk0 flags) {
        super(rootTraceCreator, traceMetaSet, gmaUtil, backgroundScope, flags);
        Intrinsics.checkNotNullParameter(gmaWebView, "gmaWebView");
        Intrinsics.checkNotNullParameter(rootTraceCreator, "rootTraceCreator");
        Intrinsics.checkNotNullParameter(traceMetaSet, "traceMetaSet");
        Intrinsics.checkNotNullParameter(gmaUtil, "gmaUtil");
        Intrinsics.checkNotNullParameter(backgroundScope, "backgroundScope");
        Intrinsics.checkNotNullParameter(flags, "flags");
        this.j = gmaWebView;
    }

    @Override // saneness.rotuma
    public final gq0 a() {
        return this.j;
    }
}
