package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.qe0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C4416qe0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f4893a;
    public final int b;
    public final int c;
    public int d;
    public String e;

    public C4416qe0(int i, int i2) {
        this(Integer.MIN_VALUE, i, i2);
    }

    public final void a() {
        int i = this.d;
        this.d = i == Integer.MIN_VALUE ? this.b : i + this.c;
        this.e = this.f4893a + this.d;
    }

    public final void b() {
        if (this.d == Integer.MIN_VALUE) {
            throw new IllegalStateException("generateNewId() must be called before retrieving ids.");
        }
    }

    public C4416qe0(int i, int i2, int i3) {
        String strN;
        if (i == Integer.MIN_VALUE) {
            strN = "";
        } else {
            strN = AbstractC3950lJ.n(i, "/");
        }
        this.f4893a = strN;
        this.b = i2;
        this.c = i3;
        this.d = Integer.MIN_VALUE;
        this.e = "";
    }
}
