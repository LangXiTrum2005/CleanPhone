package ads_mobile_sdk;

import java.util.Optional;
import p002kotlin.jvm.internal.Intrinsics;
import saneness.preterite;

/* JADX INFO: loaded from: classes.dex */
public final class k71 extends bl {
    public final gm2 n;
    public final y2 o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k71(String adId, h1 adConfiguration, ur commonConfiguration, l13 traceMetaSet, Optional webView, e2 adEventEmitter, wb0 delegatingAdListener, preterite fullScreenAdPresenter, gm2 serverSideVerificationOptionsHolder, y2 adMetadataHolder, x12 phantomReferences, gk2 safeBrowsingManager, a22 placementIdWrapper) {
        super(adId, adConfiguration, commonConfiguration, traceMetaSet, webView, adEventEmitter, delegatingAdListener, fullScreenAdPresenter, phantomReferences, safeBrowsingManager, placementIdWrapper);
        Intrinsics.checkNotNullParameter(adId, "adId");
        Intrinsics.checkNotNullParameter(adConfiguration, "adConfiguration");
        Intrinsics.checkNotNullParameter(commonConfiguration, "commonConfiguration");
        Intrinsics.checkNotNullParameter(traceMetaSet, "traceMetaSet");
        Intrinsics.checkNotNullParameter(webView, "webView");
        Intrinsics.checkNotNullParameter(adEventEmitter, "adEventEmitter");
        Intrinsics.checkNotNullParameter(delegatingAdListener, "delegatingAdListener");
        Intrinsics.checkNotNullParameter(fullScreenAdPresenter, "fullScreenAdPresenter");
        Intrinsics.checkNotNullParameter(serverSideVerificationOptionsHolder, "serverSideVerificationOptionsHolder");
        Intrinsics.checkNotNullParameter(adMetadataHolder, "adMetadataHolder");
        Intrinsics.checkNotNullParameter(phantomReferences, "phantomReferences");
        Intrinsics.checkNotNullParameter(safeBrowsingManager, "safeBrowsingManager");
        Intrinsics.checkNotNullParameter(placementIdWrapper, "placementIdWrapper");
        this.n = serverSideVerificationOptionsHolder;
        this.o = adMetadataHolder;
    }

    public final void a(scarbroite.saneness options) {
        Intrinsics.checkNotNullParameter(options, "options");
        gm2 gm2Var = this.n;
        gm2Var.a.setValue(gm2Var, gm2.b[0], options);
    }
}
