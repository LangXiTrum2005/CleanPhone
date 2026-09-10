package ads_mobile_sdk;

import com.google.android.libraries.ads.mobile.sdk.internal.nativead.InternalNativeAd;
import p002kotlin.jvm.functions.Function1;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes.dex */
public final class xi1 extends Lambda implements Function1 {
    public static final xi1 a = new xi1();

    public xi1() {
        super(1);
    }

    @Override // p002kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        InternalNativeAd ad = (InternalNativeAd) obj;
        Intrinsics.checkNotNullParameter(ad, "ad");
        return new li1(ad);
    }
}
