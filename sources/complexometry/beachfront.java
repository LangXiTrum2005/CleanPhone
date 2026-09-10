package complexometry;

import ads_mobile_sdk.en0;
import ads_mobile_sdk.g42;
import ads_mobile_sdk.i60;
import ads_mobile_sdk.w52;
import ads_mobile_sdk.yf2;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.Intrinsics;
import saneness.terni;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\b&\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcomplexometry/beachfront;", "AdT", "", "Lads_mobile_sdk/yf2;", "requestType", "<init>", "(Lads_mobile_sdk/yf2;)V", "", "preloadId", "", "attabal", "(Ljava/lang/String;)Z", "ads-mobile-sdk_release"}, k = 1, mv = {1, 9, 0})
public abstract class beachfront<AdT> {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final yf2 f23984attabal;

    public beachfront(yf2 requestType) {
        Intrinsics.checkNotNullParameter(requestType, "requestType");
        this.f23984attabal = requestType;
    }

    public boolean attabal(String preloadId) {
        Intrinsics.checkNotNullParameter(preloadId, "preloadId");
        terni.f37333attabal.getClass();
        w52 w52Var = (w52) ((i60) ((terni) en0.c.getValue())).y0.get();
        yf2 requestType = this.f23984attabal;
        w52Var.getClass();
        Intrinsics.checkNotNullParameter(requestType, "requestType");
        Intrinsics.checkNotNullParameter(preloadId, "configurationId");
        return ((Boolean) kotlinx.coroutines.taiyuan.saneness(null, new g42(requestType, w52Var, preloadId, null), 1, null)).booleanValue();
    }
}
