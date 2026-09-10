package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.pj0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C4338pj0 implements InterfaceRunnableC4513rj0 {
    final /* synthetic */ Runnable $command;
    final /* synthetic */ Runnable $fail;

    public C4338pj0(Runnable runnable, Runnable runnable2) {
        this.$command = runnable;
        this.$fail = runnable2;
    }

    @Override // java.lang.Comparable
    public int compareTo(Object obj) {
        AbstractC2995aW.q(obj, "other");
        Runnable runnable = this.$command;
        if (runnable instanceof KV) {
            return ((KV) runnable).compareTo(obj);
        }
        return 0;
    }

    @Override // java.lang.Runnable
    public void run() {
        C4689tj0.Companion.wrapRunnableWithFail(this.$command, this.$fail);
    }
}
