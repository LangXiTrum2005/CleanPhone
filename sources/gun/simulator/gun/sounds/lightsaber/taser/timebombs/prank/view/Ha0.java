package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.os.CountDownTimer;
import androidx.annotation.VisibleForTesting;

/* JADX INFO: loaded from: classes4.dex */
public final class Ha0 {
    private final double durationSecs;
    private boolean isCanceled;
    private boolean isPaused;
    private double nextDurationSecs;
    private final InterfaceC2714Qw onFinish;
    private final InterfaceC2714Qw onTick;
    private final boolean repeats;
    private long startTimeMillis;
    private CountDownTimer timer;

    public Ha0(double d, boolean z, InterfaceC2714Qw interfaceC2714Qw, InterfaceC2714Qw interfaceC2714Qw2) {
        AbstractC2995aW.q(interfaceC2714Qw, "onTick");
        AbstractC2995aW.q(interfaceC2714Qw2, "onFinish");
        this.durationSecs = d;
        this.repeats = z;
        this.onTick = interfaceC2714Qw;
        this.onFinish = interfaceC2714Qw2;
        this.nextDurationSecs = d;
    }

    private final CountDownTimer createCountdown(long j) {
        return new Ga0(j, this);
    }

    private final long getDurationMillis() {
        return (long) (this.durationSecs * ((double) 1000));
    }

    private final double getElapsedSecs() {
        return getElapsedMillis$vungle_ads_release() / ((long) 1000);
    }

    private final long getNextDurationMillis() {
        return (long) (this.nextDurationSecs * ((double) 1000));
    }

    public final void cancel() {
        this.isPaused = false;
        this.isCanceled = true;
        CountDownTimer countDownTimer = this.timer;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        this.timer = null;
    }

    public final long getElapsedMillis$vungle_ads_release() {
        long jCurrentTimeMillis;
        long nextDurationMillis;
        if (this.isPaused) {
            jCurrentTimeMillis = getDurationMillis();
            nextDurationMillis = getNextDurationMillis();
        } else {
            jCurrentTimeMillis = System.currentTimeMillis();
            nextDurationMillis = this.startTimeMillis;
        }
        return jCurrentTimeMillis - nextDurationMillis;
    }

    public final double getNextDurationSecs$vungle_ads_release() {
        return this.nextDurationSecs;
    }

    public final long getStartTimeMillis$vungle_ads_release() {
        return this.startTimeMillis;
    }

    public final CountDownTimer getTimer$vungle_ads_release() {
        return this.timer;
    }

    public final void pause() {
        if (this.timer == null) {
            return;
        }
        this.nextDurationSecs -= getElapsedSecs();
        this.isPaused = true;
        CountDownTimer countDownTimer = this.timer;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        this.timer = null;
    }

    public final void reset() {
        cancel();
        start();
    }

    public final void resume() {
        if (this.isPaused) {
            this.isPaused = false;
            start();
        }
    }

    public final void setNextDurationSecs$vungle_ads_release(double d) {
        this.nextDurationSecs = d;
    }

    public final void setStartTimeMillis$vungle_ads_release(long j) {
        this.startTimeMillis = j;
    }

    public final void setTimer$vungle_ads_release(CountDownTimer countDownTimer) {
        this.timer = countDownTimer;
    }

    public final void start() {
        this.startTimeMillis = System.currentTimeMillis();
        CountDownTimer countDownTimerCreateCountdown = createCountdown(getNextDurationMillis());
        this.timer = countDownTimerCreateCountdown;
        if (countDownTimerCreateCountdown != null) {
            countDownTimerCreateCountdown.start();
        }
    }

    public /* synthetic */ Ha0(double d, boolean z, InterfaceC2714Qw interfaceC2714Qw, InterfaceC2714Qw interfaceC2714Qw2, int i, AbstractC2471Hm abstractC2471Hm) {
        this(d, z, (i & 4) != 0 ? Fa0.INSTANCE : interfaceC2714Qw, interfaceC2714Qw2);
    }

    @VisibleForTesting
    public static /* synthetic */ void getElapsedMillis$vungle_ads_release$annotations() {
    }

    @VisibleForTesting
    public static /* synthetic */ void getNextDurationSecs$vungle_ads_release$annotations() {
    }

    @VisibleForTesting
    public static /* synthetic */ void getStartTimeMillis$vungle_ads_release$annotations() {
    }

    @VisibleForTesting
    public static /* synthetic */ void getTimer$vungle_ads_release$annotations() {
    }
}
