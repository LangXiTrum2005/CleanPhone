package ads_mobile_sdk;

import com.google.android.libraries.ads.mobile.sdk.common.RequestConfiguration;
import kurbash.formularize;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.jvm.internal.MutablePropertyReference1Impl;
import p002kotlin.jvm.internal.polloi;

/* JADX INFO: loaded from: classes.dex */
public final class lf2 {
    public static final /* synthetic */ formularize[] b = {polloi.competently(new MutablePropertyReference1Impl(lf2.class, "requestConfiguration", "getRequestConfiguration()Lcom/google/android/libraries/ads/mobile/sdk/common/RequestConfiguration;", 0))};
    public final vw2 a = new vw2(new RequestConfiguration.attabal().attabal());

    public final RequestConfiguration a() {
        return (RequestConfiguration) this.a.getValue(this, b[0]);
    }

    public final void a(RequestConfiguration requestConfiguration) {
        Intrinsics.checkNotNullParameter(requestConfiguration, "<set-?>");
        this.a.setValue(this, b[0], requestConfiguration);
    }
}
