package ads_mobile_sdk;

import android.content.Context;
import java.util.Optional;
import p002kotlin.jvm.internal.Intrinsics;
import saneness.preterite;

/* JADX INFO: loaded from: classes.dex */
public abstract class bl extends v21 {
    public final preterite k;
    public boolean l;
    public boolean m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bl(String adId, h1 adConfiguration, ur commonConfiguration, l13 traceMetaSet, Optional webView, e2 adEventEmitter, wb0 delegatingAdListener, preterite fullScreenAdPresenter, x12 phantomReferences, gk2 safeBrowsingManager, a22 placementIdWrapper) {
        super(adId, adConfiguration, commonConfiguration, traceMetaSet, webView, adEventEmitter, delegatingAdListener, phantomReferences, safeBrowsingManager, placementIdWrapper);
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
        this.k = fullScreenAdPresenter;
    }

    public final void a(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.k.a(context, this.l, this.m);
    }
}
