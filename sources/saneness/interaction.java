package saneness;

import ads_mobile_sdk.a22;
import ads_mobile_sdk.bl;
import ads_mobile_sdk.e2;
import ads_mobile_sdk.gk2;
import ads_mobile_sdk.h1;
import ads_mobile_sdk.l13;
import ads_mobile_sdk.ur;
import ads_mobile_sdk.wb0;
import ads_mobile_sdk.x12;
import java.util.Optional;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class interaction extends bl {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public interaction(String adId, h1 adConfiguration, ur commonConfiguration, l13 traceMetaSet, Optional webView, e2 adEventEmitter, wb0 delegatingAdListener, preterite fullScreenAdPresenter, x12 phantomReferences, gk2 safeBrowsingManager, a22 placementIdWrapper) {
        super(adId, adConfiguration, commonConfiguration, traceMetaSet, webView, adEventEmitter, delegatingAdListener, fullScreenAdPresenter, phantomReferences, safeBrowsingManager, placementIdWrapper);
        Intrinsics.checkNotNullParameter(adId, "adId");
        Intrinsics.checkNotNullParameter(adConfiguration, "adConfiguration");
        Intrinsics.checkNotNullParameter(commonConfiguration, "commonConfiguration");
        Intrinsics.checkNotNullParameter(traceMetaSet, "traceMetaSet");
        Intrinsics.checkNotNullParameter(webView, "webView");
        Intrinsics.checkNotNullParameter(adEventEmitter, "adEventEmitter");
        Intrinsics.checkNotNullParameter(delegatingAdListener, "delegatingAdListener");
        Intrinsics.checkNotNullParameter(fullScreenAdPresenter, "fullScreenAdPresenter");
        Intrinsics.checkNotNullParameter(phantomReferences, "phantomReferences");
        Intrinsics.checkNotNullParameter(safeBrowsingManager, "safeBrowsingManager");
        Intrinsics.checkNotNullParameter(placementIdWrapper, "placementIdWrapper");
    }
}
