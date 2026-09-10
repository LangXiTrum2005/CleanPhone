package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX INFO: loaded from: classes4.dex */
public abstract class ZL {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C2985aM f4066a;
    public int b;
    public int c;

    public ZL(C2985aM c2985aM) {
        AbstractC2995aW.q(c2985aM, "map");
        this.f4066a = c2985aM;
        this.c = -1;
        a();
    }

    public final void a() {
        while (true) {
            int i = this.b;
            C2985aM c2985aM = this.f4066a;
            if (i >= c2985aM.f || c2985aM.c[i] >= 0) {
                return;
            } else {
                this.b = i + 1;
            }
        }
    }

    public final boolean hasNext() {
        return this.b < this.f4066a.f;
    }

    public final void remove() {
        if (this.c == -1) {
            throw new IllegalStateException("Call next() before removing element from the iterator.".toString());
        }
        C2985aM c2985aM = this.f4066a;
        c2985aM.b();
        c2985aM.k(this.c);
        this.c = -1;
    }
}
