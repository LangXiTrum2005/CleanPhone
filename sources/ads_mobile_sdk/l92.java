package ads_mobile_sdk;

import com.google.android.libraries.ads.mobile.sdk.common.LoadAdError;
import p002kotlin.jvm.internal.Intrinsics;
import saneness.canephora;

/* JADX INFO: loaded from: classes.dex */
public final class l92 implements canephora {
    public final LoadAdError a;

    public l92(LoadAdError error) {
        Intrinsics.checkNotNullParameter(error, "error");
        this.a = error;
    }

    public final LoadAdError a() {
        return this.a;
    }
}
