package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.os.CountDownTimer;

/* JADX INFO: loaded from: classes4.dex */
public final class Ga0 extends CountDownTimer {
    final /* synthetic */ Ha0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Ga0(long j, Ha0 ha0) {
        super(j, j);
        this.this$0 = ha0;
    }

    @Override // android.os.CountDownTimer
    public void onFinish() {
        Ha0 ha0 = this.this$0;
        ha0.onFinish.invoke();
        if (!ha0.repeats || ha0.isCanceled) {
            ha0.cancel();
        } else {
            ha0.setNextDurationSecs$vungle_ads_release(ha0.durationSecs);
            ha0.start();
        }
    }

    @Override // android.os.CountDownTimer
    public void onTick(long j) {
        this.this$0.onTick.invoke();
    }
}
