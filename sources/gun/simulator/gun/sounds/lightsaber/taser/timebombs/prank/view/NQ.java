package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.view.View;

/* JADX INFO: loaded from: classes4.dex */
public final class NQ implements NC {
    final /* synthetic */ PQ this$0;

    public NQ(PQ pq) {
        this.this$0 = pq;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.NC
    public void onImpression(View view) {
        C4917wJ.Companion.d("NativeAd", "ImpressionTracker checked the native ad view become visible.");
        C3520gR c3520gR = this.this$0.presenter;
        if (c3520gR != null) {
            C3520gR.processCommand$default(c3520gR, "videoViewed", null, 2, null);
        }
        C3520gR c3520gR2 = this.this$0.presenter;
        if (c3520gR2 != null) {
            c3520gR2.processCommand("tpat", C2390Ej.CHECKPOINT_0);
        }
        C3520gR c3520gR3 = this.this$0.presenter;
        if (c3520gR3 != null) {
            c3520gR3.onImpression();
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.NC
    public void onViewInvisible(View view) {
        if (this.this$0.isInvisibleLogged.getAndSet(true)) {
            return;
        }
        C4917wJ.Companion.d("NativeAd", "ImpressionTracker checked the native ad view invisible on play.");
        C2961a4.logMetric$vungle_ads_release$default(C2961a4.INSTANCE, new C3586h70(B30.VIEW_NOT_VISIBLE_ON_PLAY), this.this$0.getLogEntry$vungle_ads_release(), (String) null, 4, (Object) null);
    }
}
