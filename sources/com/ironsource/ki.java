package com.ironsource;

import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.ironsourceads.banner.BannerAdView;
import com.unity3d.ironsourceads.interstitial.InterstitialAd;
import com.unity3d.ironsourceads.rewarded.RewardedAd;
import com.unity3d.mediation.LevelPlayAdError;
import com.unity3d.mediation.LevelPlayAdInfo;
import com.unity3d.mediation.LevelPlayInitListener;
import com.unity3d.mediation.banner.LevelPlayBannerAdViewListener;
import com.unity3d.mediation.rewarded.LevelPlayReward;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ki implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f29075a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f29076b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f29077c;

    public /* synthetic */ ki(int i10, Object obj, Object obj2) {
        this.f29075a = i10;
        this.f29076b = obj;
        this.f29077c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f29075a) {
            case 0:
                ((AbstractC0437l3.c) this.f29076b).b((D7.a) this.f29077c);
                break;
            case 1:
                C0650x1.a.a((androidx.lifecycle.m) this.f29076b, (C0650x1.a) this.f29077c);
                break;
            case 2:
                A9.a((IronSourceError) this.f29076b, (A9) this.f29077c);
                break;
            case 3:
                A9.a((InterstitialAd) this.f29076b, (A9) this.f29077c);
                break;
            case 4:
                Aa.a((LevelPlayAdError) this.f29076b, (Aa) this.f29077c);
                break;
            case 5:
                Aa.a((Aa) this.f29076b, (LevelPlayBannerAdViewListener) this.f29077c);
                break;
            case 6:
                B2.a((B2) this.f29076b, (Eg) this.f29077c);
                break;
            case 7:
                B2.a((B2) this.f29076b, (Map) this.f29077c);
                break;
            case 8:
                Be.a((Be) this.f29076b, (C0520pe) this.f29077c);
                break;
            case 9:
                Be.b((InterfaceC0591te) this.f29076b, (C0520pe) this.f29077c);
                break;
            case 10:
                Be.a((C0645we) this.f29076b, (Be) this.f29077c);
                break;
            case 11:
                Ce.a((InterfaceC0591te) this.f29076b, (IronSourceError) this.f29077c);
                break;
            case 12:
                Ef.a((Ef) this.f29076b, (AbstractRunnableC0430ke) this.f29077c);
                break;
            case 13:
                Wd.a((Wd) this.f29076b, (IronSourceError) this.f29077c);
                break;
            case 14:
                Ya.a((Ya) this.f29076b, (LevelPlayReward) this.f29077c);
                break;
            case 15:
                Yd.a((Yd) this.f29076b, (K9) this.f29077c);
                break;
            case 16:
                Yd.a((Yd) this.f29076b, (IronSourceError) this.f29077c);
                break;
            case 17:
                C0240a3.a((C0240a3) this.f29076b, (IronSourceError) this.f29077c);
                break;
            case 18:
                C0251ae.a((C0251ae) this.f29076b, (IronSourceError) this.f29077c);
                break;
            case 19:
                C0251ae.a((RewardedAd) this.f29076b, (C0251ae) this.f29077c);
                break;
            case 20:
                C0276c3.a((IronSourceError) this.f29076b, (C0276c3) this.f29077c);
                break;
            case 21:
                C0276c3.a((BannerAdView) this.f29076b, (C0276c3) this.f29077c);
                break;
            case 22:
                C0289cg.a((C0289cg) this.f29076b, (String) this.f29077c);
                break;
            case 23:
                C0427kb.a((C0427kb) this.f29076b, (InterfaceC0463mb) this.f29077c);
                break;
            case 24:
                C0427kb.a((C0427kb) this.f29076b, (String) this.f29077c);
                break;
            case 25:
                C0427kb.a((C0427kb) this.f29076b, (LevelPlayAdError) this.f29077c);
                break;
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_LOAD_STARTED_AD_VIEWER_VALUE:
                C0458m6.a((C0458m6) this.f29076b, (LevelPlayAdInfo) this.f29077c);
                break;
            case 27:
                C0481nb.a((C0481nb) this.f29076b, (Map) this.f29077c);
                break;
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_MEMORY_WARNING_VALUE:
                C0494o6.a((C0494o6) this.f29076b, (LevelPlayAdInfo) this.f29077c);
                break;
            default:
                C0606ub.a((LevelPlayInitListener) this.f29076b, (Va) this.f29077c);
                break;
        }
    }
}
