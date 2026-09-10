package sg.bigo.ads.ad.e;

import sg.bigo.ads.ad.interstitial.t;
import sg.bigo.ads.api.AdInteractionListener;
import sg.bigo.ads.api.InterstitialAd;
import sg.bigo.ads.api.RewardAdInteractionListener;
import sg.bigo.ads.api.RewardVideoAd;
import sg.bigo.ads.api.core.n;

/* JADX INFO: loaded from: classes7.dex */
public final class h extends t implements RewardVideoAd {

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private RewardAdInteractionListener f45720E;

    public h(sg.bigo.ads.api.core.g gVar) {
        super(gVar);
    }

    @Override // sg.bigo.ads.ad.interstitial.t, sg.bigo.ads.ad.interstitial.k
    public final Class<? extends sg.bigo.ads.controller.e.b<?>> A() {
        if (G()) {
            return d.class;
        }
        if (y()) {
            return F() ? f.class : g.class;
        }
        return e.class;
    }

    @Override // sg.bigo.ads.ad.interstitial.t
    public final boolean G() {
        sg.bigo.ads.ad.b.c cVar = ((t) this).f46647z;
        return (cVar instanceof sg.bigo.ads.ad.b.a.g) || (cVar instanceof sg.bigo.ads.ad.b.a.f);
    }

    public final void H() {
        sg.bigo.ads.core.d.b.b(this.f45584b.f47032a, this);
        RewardAdInteractionListener rewardAdInteractionListener = this.f45720E;
        if (rewardAdInteractionListener != null) {
            rewardAdInteractionListener.onAdRewarded();
        }
    }

    @Override // sg.bigo.ads.ad.interstitial.t, sg.bigo.ads.ad.interstitial.k
    public final void b(sg.bigo.ads.api.b.d.a<InterstitialAd> aVar) {
        super.b(aVar);
    }

    @Override // sg.bigo.ads.ad.interstitial.t, sg.bigo.ads.ad.interstitial.k, sg.bigo.ads.ad.d, sg.bigo.ads.ad.c
    public final void destroyInMainThread() {
        super.destroyInMainThread();
        this.f45720E = null;
    }

    @Override // sg.bigo.ads.api.RewardVideoAd
    public final void setAdInteractionListener(RewardAdInteractionListener rewardAdInteractionListener) {
        super.setAdInteractionListener((AdInteractionListener) rewardAdInteractionListener);
        this.f45720E = rewardAdInteractionListener;
    }

    @Override // sg.bigo.ads.ad.interstitial.k
    public final int x() {
        sg.bigo.ads.core.a.a aVar = (sg.bigo.ads.core.a.a) this.f45584b.f47032a;
        n nVarAV = aVar.aV();
        long jAU = nVarAV != null ? nVarAV.f47056c : 0L;
        if (jAU == 0) {
            jAU = aVar.aU();
        }
        return (int) (jAU / 1000);
    }
}
