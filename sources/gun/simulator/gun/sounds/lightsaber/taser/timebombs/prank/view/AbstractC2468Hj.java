package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Hj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC2468Hj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f3179a;
    public int b;
    public boolean c;

    public AbstractC2468Hj(String str) {
        if (str == null) {
            throw new IllegalArgumentException("name cannot be null.");
        }
        this.f3179a = str;
    }

    public final String toString() {
        return this.f3179a;
    }
}
