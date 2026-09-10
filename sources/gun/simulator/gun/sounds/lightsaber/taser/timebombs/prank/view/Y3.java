package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.util.concurrent.BlockingQueue;

/* JADX INFO: loaded from: classes4.dex */
public final class Y3 implements X3 {
    final /* synthetic */ BlockingQueue<C4455r30> $currentSendingErrors;

    public Y3(BlockingQueue<C4455r30> blockingQueue) {
        this.$currentSendingErrors = blockingQueue;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.X3
    public void onFailure() {
        C4917wJ.Companion.d("AnalyticsClient", "Failed to send " + this.$currentSendingErrors.size() + " errors");
        C2961a4.INSTANCE.getErrors$vungle_ads_release().addAll(this.$currentSendingErrors);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.X3
    public void onSuccess() {
        C4917wJ.Companion.d("AnalyticsClient", "Sent " + this.$currentSendingErrors.size() + " errors");
    }
}
