package com.p004ironsource;

import android.content.Context;
import androidx.lifecycle.Lifecycle;
import com.p004ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.ironsourceads.InitListener;
import com.unity3d.ironsourceads.banner.BannerAdView;
import com.unity3d.ironsourceads.interstitial.InterstitialAd;
import com.unity3d.ironsourceads.rewarded.RewardedAd;
import com.unity3d.mediation.LevelPlayAdError;
import com.unity3d.mediation.LevelPlayAdInfo;
import com.unity3d.mediation.LevelPlayAdSize;
import com.unity3d.mediation.banner.LevelPlayBannerAdViewListener;
import com.unity3d.mediation.rewarded.LevelPlayReward;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class G0 implements Runnable {
    public final /* synthetic */ int X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final /* synthetic */ Object f24194Y;
    public final /* synthetic */ Object Z;

    public /* synthetic */ G0(int i2, Object obj, Object obj2) {
        this.X = i2;
        this.f24194Y = obj;
        this.Z = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.X) {
            case 0:
                t3.a.a((Lifecycle.Event) this.f24194Y, (t3.a) this.Z);
                break;
            case 1:
                ((u7.c) this.f24194Y).b((ag.a) this.Z);
                break;
            case 2:
                ((an) this.f24194Y).a((String) this.Z);
                break;
            case 3:
                bt.b.a((Context) this.f24194Y, (ns) this.Z);
                break;
            case 4:
                bw.a((bw) this.f24194Y, (iq[]) this.Z);
                break;
            case 5:
                c7.a((c7) this.f24194Y, (IronSourceError) this.Z);
                break;
            case 6:
                ck.a((ps) this.f24194Y, (InitListener) this.Z);
                break;
            case 7:
                ct.a((ts) this.f24194Y, (IronSourceError) this.Z);
                break;
            case 8:
                cw.a((cw) this.f24194Y, (iq[]) this.Z);
                break;
            case 9:
                e7.a((BannerAdView) this.f24194Y, (e7) this.Z);
                break;
            case 10:
                e7.a((IronSourceError) this.f24194Y, (e7) this.Z);
                break;
            case 11:
                hm.a((hm) this.f24194Y, (LevelPlayReward) this.Z);
                break;
            case 12:
                jj.a((jj) this.f24194Y, (IronSourceError) this.Z);
                break;
            case 13:
                ld.a((ld) this.f24194Y, (LevelPlayAdInfo) this.Z);
                break;
            case 14:
                lj.a((lj) this.f24194Y, (zj) this.Z);
                break;
            case 15:
                lj.a((lj) this.f24194Y, (IronSourceError) this.Z);
                break;
            case 16:
                ml.a((LevelPlayAdError) this.f24194Y, (ml) this.Z);
                break;
            case 17:
                ml.a((ml) this.f24194Y, (LevelPlayBannerAdViewListener) this.Z);
                break;
            case 18:
                ml.a((ml) this.f24194Y, (String) this.Z);
                break;
            case 19:
                ml.a((ml) this.f24194Y, (LevelPlayAdSize) this.Z);
                break;
            case 20:
                nj.a((IronSourceError) this.f24194Y, (nj) this.Z);
                break;
            case 21:
                nj.a((InterstitialAd) this.f24194Y, (nj) this.Z);
                break;
            case 22:
                pr.a((pr) this.f24194Y, (IronSourceError) this.Z);
                break;
            case 23:
                qm.a((qm) this.f24194Y, (String) this.Z);
                break;
            case 24:
                qm.a((qm) this.f24194Y, (LevelPlayAdError) this.Z);
                break;
            case 25:
                qm.a((qm) this.f24194Y, (sm) this.Z);
                break;
            case 26:
                rr.a((rr) this.f24194Y, (zj) this.Z);
                break;
            case 27:
                rr.a((rr) this.f24194Y, (IronSourceError) this.Z);
                break;
            case 28:
                tr.a((RewardedAd) this.f24194Y, (tr) this.Z);
                break;
            default:
                tr.a((tr) this.f24194Y, (IronSourceError) this.Z);
                break;
        }
    }
}
