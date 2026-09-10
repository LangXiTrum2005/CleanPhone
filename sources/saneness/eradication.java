package saneness;

import ads_mobile_sdk.gq0;
import ads_mobile_sdk.jk0;
import ads_mobile_sdk.la3;
import ads_mobile_sdk.ll;
import ads_mobile_sdk.nd0;
import ads_mobile_sdk.yf2;
import java.util.Optional;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class eradication extends ll {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eradication(kotlinx.coroutines.saran uiScope, la3 webViewViewabilityEventEmitter, nd0 displayUtil, Optional optionalWebView, amphitheatre clock, jk0 flags, yf2 requestType) {
        super(uiScope, webViewViewabilityEventEmitter, displayUtil, clock, flags, requestType);
        Intrinsics.checkNotNullParameter(uiScope, "uiScope");
        Intrinsics.checkNotNullParameter(webViewViewabilityEventEmitter, "webViewViewabilityEventEmitter");
        Intrinsics.checkNotNullParameter(displayUtil, "displayUtil");
        Intrinsics.checkNotNullParameter(optionalWebView, "optionalWebView");
        Intrinsics.checkNotNullParameter(clock, "clock");
        Intrinsics.checkNotNullParameter(flags, "flags");
        Intrinsics.checkNotNullParameter(requestType, "requestType");
        gq0 gq0Var = (gq0) monocoque.attabal.saneness(optionalWebView);
        b(gq0Var);
        if (gq0Var != null) {
            a(gq0Var);
        }
    }
}
