package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.oj0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C4250oj0 extends KV {
    final /* synthetic */ Runnable $command;
    final /* synthetic */ Runnable $fail;

    public C4250oj0(Runnable runnable, Runnable runnable2) {
        this.$command = runnable;
        this.$fail = runnable2;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.KV, java.lang.Comparable
    public int compareTo(Object obj) {
        AbstractC2995aW.q(obj, "other");
        if (!(obj instanceof KV)) {
            return 0;
        }
        return AbstractC2995aW.s(((KV) obj).getPriority(), getPriority());
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.KV
    public int getPriority() {
        return ((KV) this.$command).getPriority();
    }

    @Override // java.lang.Runnable
    public void run() {
        C4689tj0.Companion.wrapRunnableWithFail(this.$command, this.$fail);
    }
}
