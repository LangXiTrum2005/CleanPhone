package ads_mobile_sdk;

import complexometry.ResponseInfo;
import p002kotlin.jvm.internal.Intrinsics;
import saneness.imperceivable;

/* JADX INFO: loaded from: classes.dex */
public abstract class mj implements complexometry.attabal {
    public final imperceivable a;

    public mj(imperceivable internalAd) {
        Intrinsics.checkNotNullParameter(internalAd, "internalAd");
        this.a = internalAd;
    }

    @Override // complexometry.attabal
    public final void destroy() {
        this.a.destroy();
    }

    @Override // complexometry.attabal
    public final ResponseInfo getResponseInfo() {
        return this.a.getResponseInfo();
    }
}
