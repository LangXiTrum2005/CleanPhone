package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX INFO: loaded from: classes4.dex */
public final class H60 extends C4888w0 {
    final /* synthetic */ L60 this$0;

    public H60(L60 l60) {
        this.this$0 = l60;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C4888w0
    public void onBackground() {
        C4917wJ.Companion.d("SignalManager", "SignalManager#onBackground()");
        this.this$0.setEnterBackgroundTime(System.currentTimeMillis());
        L60 l60 = this.this$0;
        l60.setSessionDuration((this.this$0.getEnterBackgroundTime() - this.this$0.getEnterForegroundTime()) + l60.getSessionDuration());
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C4888w0
    public void onForeground() {
        C4917wJ.Companion.d("SignalManager", "SignalManager#onForeground()");
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis - this.this$0.getEnterBackgroundTime() > C3457fi.INSTANCE.getSignalsSessionTimeout()) {
            this.this$0.createNewSessionData();
        }
        this.this$0.setEnterForegroundTime(jCurrentTimeMillis);
        this.this$0.setEnterBackgroundTime(0L);
    }
}
