package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.kb0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC3882kb0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f4603a;
    public final boolean b;
    public C4234ob0 c;
    public long d;

    public AbstractC3882kb0(String str, boolean z) {
        AbstractC2995aW.q(str, "name");
        this.f4603a = str;
        this.b = z;
        this.d = -1L;
    }

    public abstract long a();

    public final String toString() {
        return this.f4603a;
    }
}
