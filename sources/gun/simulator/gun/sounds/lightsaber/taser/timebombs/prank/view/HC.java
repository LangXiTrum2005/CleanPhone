package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX INFO: loaded from: classes3.dex */
public final class HC extends Yf0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Yf0 f3161a;
    public Yf0 b = C4033mE.e;

    public HC(JC jc) {
        this.f3161a = ((AC) jc.d.values()).listIterator(0);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.b.hasNext() || this.f3161a.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!this.b.hasNext()) {
            this.b = ((AbstractC4822vC) this.f3161a.next()).iterator();
        }
        return this.b.next();
    }
}
