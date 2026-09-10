package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.qa0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C4408qa0 extends C4549s60 implements InterfaceC4731u90 {
    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4731u90
    public final Object getValue() {
        Integer numValueOf;
        synchronized (this) {
            Object[] objArr = this.h;
            AbstractC2995aW.n(objArr);
            numValueOf = Integer.valueOf(((Number) objArr[(objArr.length - 1) & ((int) ((this.i + ((long) ((int) ((n() + ((long) this.k)) - this.i)))) - 1))]).intValue());
        }
        return numValueOf;
    }

    public final void u(int i) {
        synchronized (this) {
            Object[] objArr = this.h;
            AbstractC2995aW.n(objArr);
            a(Integer.valueOf(((Number) objArr[(objArr.length - 1) & ((int) ((this.i + ((long) ((int) ((n() + ((long) this.k)) - this.i)))) - 1))]).intValue() + i));
        }
    }
}
