package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.wb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC4936wb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5184a = 0;
    public int b;

    public AbstractC4936wb() {
    }

    public static String b(int i) {
        return "" + ((char) ((i >> 24) & 255)) + ((char) ((i >> 16) & 255)) + ((char) ((i >> 8) & 255)) + ((char) (i & 255));
    }

    public static int d(int i) {
        return (i >> 24) & 255;
    }

    public final void a(int i) {
        this.b = i | this.b;
    }

    public final boolean c(int i) {
        return (this.b & i) == i;
    }

    public String toString() {
        switch (this.f5184a) {
            case 1:
                return b(this.b);
            default:
                return super.toString();
        }
    }

    public AbstractC4936wb(int i) {
        this.b = i;
    }
}
