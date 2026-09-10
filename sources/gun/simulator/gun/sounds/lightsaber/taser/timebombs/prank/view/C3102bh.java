package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.bh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3102bh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f4183a;
    public final InterfaceC2766Sw b;

    public C3102bh(InterfaceC2766Sw interfaceC2766Sw, Object obj) {
        this.f4183a = obj;
        this.b = interfaceC2766Sw;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3102bh)) {
            return false;
        }
        C3102bh c3102bh = (C3102bh) obj;
        return AbstractC2995aW.i(this.f4183a, c3102bh.f4183a) && AbstractC2995aW.i(this.b, c3102bh.b);
    }

    public final int hashCode() {
        Object obj = this.f4183a;
        return this.b.hashCode() + ((obj == null ? 0 : obj.hashCode()) * 31);
    }

    public final String toString() {
        return "CompletedWithCancellation(result=" + this.f4183a + ", onCancellation=" + this.b + ')';
    }
}
