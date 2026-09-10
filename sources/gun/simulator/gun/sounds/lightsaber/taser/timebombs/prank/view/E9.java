package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes2.dex */
public abstract class E9 implements InterfaceC3954lN {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f3012a;
    public final long b;
    public long c;

    public E9(long j, long j2) {
        this.f3012a = j;
        this.b = j2;
        this.c = j - 1;
    }

    public final void a() {
        long j = this.c;
        if (j < this.f3012a || j > this.b) {
            throw new NoSuchElementException();
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3954lN
    public final boolean next() {
        long j = this.c + 1;
        this.c = j;
        return !(j > this.b);
    }
}
