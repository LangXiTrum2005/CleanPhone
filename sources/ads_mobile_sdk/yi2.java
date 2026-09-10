package ads_mobile_sdk;

import complexometry.formularize;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class yi2 extends l1 {
    public final jx2 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yi2(jx2 thirdPartyAdConfigurationRenderer, l13 traceMetaSet, formularize baseRequest, yf2 requestType, long j, int i, h1 adConfiguration, ur commonConfiguration, jm2 serverTransaction, String renderId, a22 placementIdWrapper) {
        super(traceMetaSet, baseRequest, requestType, j, i, adConfiguration, commonConfiguration, serverTransaction, renderId, placementIdWrapper);
        Intrinsics.checkNotNullParameter(thirdPartyAdConfigurationRenderer, "thirdPartyAdConfigurationRenderer");
        Intrinsics.checkNotNullParameter(traceMetaSet, "traceMetaSet");
        Intrinsics.checkNotNullParameter(baseRequest, "baseRequest");
        Intrinsics.checkNotNullParameter(requestType, "requestType");
        Intrinsics.checkNotNullParameter(adConfiguration, "adConfiguration");
        Intrinsics.checkNotNullParameter(commonConfiguration, "commonConfiguration");
        Intrinsics.checkNotNullParameter(serverTransaction, "serverTransaction");
        Intrinsics.checkNotNullParameter(renderId, "renderId");
        Intrinsics.checkNotNullParameter(placementIdWrapper, "placementIdWrapper");
        this.k = thirdPartyAdConfigurationRenderer;
    }

    @Override // ads_mobile_sdk.l1
    public final Object a(boolean z, wretchedly.dern dernVar) {
        return this.k.a(true, dernVar);
    }

    @Override // saneness.idolatry
    public final boolean b() {
        return this.k.b();
    }
}
