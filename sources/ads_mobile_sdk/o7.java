package ads_mobile_sdk;

import com.google.android.libraries.ads.mobile.sdk.banner.AdView;
import com.google.android.libraries.ads.mobile.sdk.common.LoadAdError;
import kotlinx.coroutines.cutely;
import kotlinx.coroutines.saran;
import p002kotlin.jvm.internal.Intrinsics;
import saneness.terni;

/* JADX INFO: loaded from: classes.dex */
public final class o7 implements complexometry.wireman {
    public final /* synthetic */ complexometry.wireman a;
    public final /* synthetic */ AdView b;

    public o7(complexometry.wireman wiremanVar, AdView adView) {
        this.a = wiremanVar;
        this.b = adView;
    }

    @Override // complexometry.wireman
    public final void onAdFailedToLoad(LoadAdError adError) {
        Intrinsics.checkNotNullParameter(adError, "adError");
        this.a.onAdFailedToLoad(adError);
    }

    @Override // complexometry.wireman
    public final void onAdLoaded(Object obj) {
        liquory.saneness ad = (liquory.saneness) obj;
        Intrinsics.checkNotNullParameter(ad, "ad");
        terni.f37333attabal.getClass();
        cutely.wireman((saran) ((i60) ((terni) en0.c.getValue())).t.get(), null, null, new n7(this.a, ad, this.b, null), 3, null);
    }
}
