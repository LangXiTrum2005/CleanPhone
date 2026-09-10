package saneness;

import ads_mobile_sdk.a22;
import ads_mobile_sdk.g83;
import ads_mobile_sdk.h1;
import ads_mobile_sdk.jm2;
import ads_mobile_sdk.l13;
import ads_mobile_sdk.rs0;
import ads_mobile_sdk.u20;
import ads_mobile_sdk.ur;
import ads_mobile_sdk.vj;
import ads_mobile_sdk.wf;
import ads_mobile_sdk.yf2;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class sissy extends vj {
    /* JADX WARN: Illegal instructions before constructor call */
    public sissy(int i, long j, complexometry.formularize baseRequest, h1 adConfiguration, wf appSettings, ur commonConfiguration, yf2 requestType, jm2 serverTransaction, l13 traceMetaSet, u20 csiTicker, rs0 htmlUtil, g83 webViewFactory, String renderId, coffeecake adComponentProvider, coffeecake placementIdWrapperProvider, kotlinx.coroutines.saran uiScope) {
        Intrinsics.checkNotNullParameter(renderId, "renderId");
        Intrinsics.checkNotNullParameter(adConfiguration, "adConfiguration");
        Intrinsics.checkNotNullParameter(serverTransaction, "serverTransaction");
        Intrinsics.checkNotNullParameter(traceMetaSet, "traceMetaSet");
        Intrinsics.checkNotNullParameter(adComponentProvider, "adComponentProvider");
        Intrinsics.checkNotNullParameter(csiTicker, "csiTicker");
        Intrinsics.checkNotNullParameter(webViewFactory, "webViewFactory");
        Intrinsics.checkNotNullParameter(commonConfiguration, "commonConfiguration");
        Intrinsics.checkNotNullParameter(baseRequest, "baseRequest");
        Intrinsics.checkNotNullParameter(requestType, "requestType");
        Intrinsics.checkNotNullParameter(uiScope, "uiScope");
        Intrinsics.checkNotNullParameter(appSettings, "appSettings");
        Intrinsics.checkNotNullParameter(htmlUtil, "htmlUtil");
        Intrinsics.checkNotNullParameter(placementIdWrapperProvider, "placementIdWrapperProvider");
        Object obj = placementIdWrapperProvider.get();
        Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
        super(adComponentProvider, csiTicker, webViewFactory, uiScope, htmlUtil, appSettings, traceMetaSet, baseRequest, requestType, j, i, adConfiguration, commonConfiguration, serverTransaction, renderId, (a22) obj);
    }
}
