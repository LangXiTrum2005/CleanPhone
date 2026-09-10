package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Nn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2627Nn extends AbstractC3402f30 {
    public static final C2627Nn b = new C2627Nn(AbstractC4585sb0.c, AbstractC4585sb0.d, AbstractC4585sb0.f4985a, AbstractC4585sb0.e);

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new UnsupportedOperationException("Dispatchers.Default cannot be closed");
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3899kk
    public final AbstractC3899kk limitedParallelism(int i) {
        WD.j(i);
        return i >= AbstractC4585sb0.c ? this : super.limitedParallelism(i);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3899kk
    public final String toString() {
        return "Dispatchers.Default";
    }
}
