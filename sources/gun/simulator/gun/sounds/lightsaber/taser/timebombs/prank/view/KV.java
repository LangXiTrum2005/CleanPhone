package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX INFO: loaded from: classes4.dex */
public abstract class KV implements InterfaceRunnableC4513rj0 {
    @Override // java.lang.Comparable
    public int compareTo(Object obj) {
        AbstractC2995aW.q(obj, "other");
        if (!(obj instanceof KV)) {
            return -1;
        }
        return AbstractC2995aW.s(((KV) obj).getPriority(), getPriority());
    }

    public abstract int getPriority();
}
