package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.util.concurrent.BlockingQueue;

/* JADX INFO: loaded from: classes4.dex */
public final class Z3 implements X3 {
    final /* synthetic */ BlockingQueue<C5071y30> $currentSendingMetrics;

    public Z3(BlockingQueue<C5071y30> blockingQueue) {
        this.$currentSendingMetrics = blockingQueue;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.X3
    public void onFailure() {
        C4917wJ.Companion.d("AnalyticsClient", "Failed to send " + this.$currentSendingMetrics.size() + " metrics");
        C2961a4.INSTANCE.getMetrics$vungle_ads_release().addAll(this.$currentSendingMetrics);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.X3
    public void onSuccess() {
        C4917wJ.Companion.d("AnalyticsClient", "Sent " + this.$currentSendingMetrics.size() + " metrics");
    }
}
