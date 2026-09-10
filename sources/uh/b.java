package uh;

import android.content.Context;
import b2.w;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.query.QueryInfo;
import go.k;
import m0.s1;
import ph.d;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class b extends k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public sh.a f52215a;

    @Override // go.k
    public final void K(Context context, String str, d dVar, w wVar, s1 s1Var) {
        AdRequest adRequestBuild = this.f52215a.b().build();
        m5.k kVar = new m5.k(11, wVar, s1Var);
        a aVar = new a(0);
        aVar.f52213b = str;
        aVar.f52214c = kVar;
        QueryInfo.generate(context, a0(dVar), adRequestBuild, aVar);
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

    public final AdFormat a0(d dVar) {
        int iOrdinal = dVar.ordinal();
        if (iOrdinal == 1) {
            return AdFormat.INTERSTITIAL;
        }
        if (iOrdinal != 2) {
            return iOrdinal != 3 ? AdFormat.UNKNOWN : AdFormat.BANNER;
        }
        return AdFormat.REWARDED;
    }
}
