package ads_mobile_sdk;

import android.view.View;
import com.google.android.gms.ads.mediation.Adapter;
import com.google.android.gms.ads.mediation.MediationAppOpenAd;
import com.google.android.gms.ads.mediation.MediationInterstitialAd;
import com.google.android.gms.ads.mediation.MediationRewardedAd;
import p002kotlin.jvm.internal.Intrinsics;
import saneness.conclusively;
import saneness.weimar;

/* JADX INFO: loaded from: classes.dex */
public final class fe1 extends ux0 implements conclusively {
    public View b;
    public weimar c;
    public MediationInterstitialAd d;
    public MediationRewardedAd e;
    public MediationAppOpenAd f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fe1(Adapter adapter) {
        super(adapter);
        Intrinsics.checkNotNullParameter(adapter, "adapter");
    }
}
