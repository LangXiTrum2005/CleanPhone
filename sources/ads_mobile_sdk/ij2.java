package ads_mobile_sdk;

import android.view.View;
import com.google.android.gms.ads.mediation.MediationAppOpenAd;
import com.google.android.gms.ads.mediation.MediationInterstitialAd;
import com.google.android.gms.ads.mediation.MediationRewardedAd;
import com.google.android.gms.ads.mediation.rtb.RtbAdapter;
import p002kotlin.jvm.internal.Intrinsics;
import saneness.conclusively;
import saneness.weimar;

/* JADX INFO: loaded from: classes.dex */
public final class ij2 extends ux0 implements conclusively {
    public final RtbAdapter b;
    public View c;
    public weimar d;
    public MediationInterstitialAd e;
    public MediationRewardedAd f;
    public MediationAppOpenAd g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ij2(RtbAdapter rtbAdapter) {
        super(rtbAdapter);
        Intrinsics.checkNotNullParameter(rtbAdapter, "rtbAdapter");
        this.b = rtbAdapter;
    }
}
