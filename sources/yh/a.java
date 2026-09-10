package yh;

import android.content.Context;
import android.os.Bundle;
import b2.w;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.query.QueryInfo;
import go.k;
import m0.s1;
import ph.d;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class a extends k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public wh.a f54400a;

    @Override // go.k
    public final void K(Context context, String str, d dVar, w wVar, s1 s1Var) {
        AdFormat adFormat;
        AdRequest.Builder requestAgent = new AdRequest.Builder().setRequestAgent(this.f54400a.f53208a.f42458b);
        Bundle bundle = new Bundle();
        bundle.putString("query_info_type", "requester_type_5");
        AdRequest adRequestBuild = requestAgent.addNetworkExtrasBundle(AdMobAdapter.class, bundle).build();
        m5.k kVar = new m5.k(11, wVar, s1Var);
        uh.a aVar = new uh.a(1);
        aVar.f52213b = str;
        aVar.f52214c = kVar;
        int iOrdinal = dVar.ordinal();
        if (iOrdinal != 2) {
            adFormat = iOrdinal != 3 ? AdFormat.INTERSTITIAL : AdFormat.BANNER;
        } else {
            adFormat = AdFormat.REWARDED;
        }
        QueryInfo.generate(context, adFormat, adRequestBuild, aVar);
    }

    @Override // go.k
    public final void L(Context context, d dVar, w wVar, s1 s1Var) {
        String str;
        int iOrdinal = dVar.ordinal();
        if (iOrdinal == 1) {
            str = "gmaScarBiddingInterstitialSignal";
        } else if (iOrdinal != 2) {
            str = iOrdinal != 3 ? "" : "gmaScarBiddingBannerSignal";
        } else {
            str = "gmaScarBiddingRewardedSignal";
        }
        K(context, str, dVar, wVar, s1Var);
    }
}
