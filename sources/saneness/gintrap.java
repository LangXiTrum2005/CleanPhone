package saneness;

import ads_mobile_sdk.jk0;
import ads_mobile_sdk.ll;
import ads_mobile_sdk.nd0;
import ads_mobile_sdk.v7;
import ads_mobile_sdk.yf2;
import android.view.View;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class gintrap extends ll {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gintrap(kotlinx.coroutines.saran uiScope, v7 adViewabilityEventEmitter, nd0 displayUtil, View view, amphitheatre clock, jk0 flags, yf2 requestType) {
        super(uiScope, adViewabilityEventEmitter, displayUtil, clock, flags, requestType);
        Intrinsics.checkNotNullParameter(uiScope, "uiScope");
        Intrinsics.checkNotNullParameter(adViewabilityEventEmitter, "adViewabilityEventEmitter");
        Intrinsics.checkNotNullParameter(displayUtil, "displayUtil");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(clock, "clock");
        Intrinsics.checkNotNullParameter(flags, "flags");
        Intrinsics.checkNotNullParameter(requestType, "requestType");
        b(view);
        a(view);
    }
}
