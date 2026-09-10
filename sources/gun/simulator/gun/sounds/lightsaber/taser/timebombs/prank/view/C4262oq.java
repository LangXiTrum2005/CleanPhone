package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.io.EOFException;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.oq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C4262oq implements InterfaceC4326pd0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f4810a = new byte[4096];

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4326pd0
    public final void b(int i, JT jt) {
        jt.F(i);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4326pd0
    public final int c(InterfaceC3813jl interfaceC3813jl, int i, boolean z) {
        return f(interfaceC3813jl, i, z);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4326pd0
    public final void d(int i, JT jt) {
        jt.F(i);
    }

    public final int f(InterfaceC3813jl interfaceC3813jl, int i, boolean z) throws EOFException {
        byte[] bArr = this.f4810a;
        int i2 = interfaceC3813jl.read(bArr, 0, Math.min(bArr.length, i));
        if (i2 != -1) {
            return i2;
        }
        if (z) {
            return -1;
        }
        throw new EOFException();
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4326pd0
    public final void e(C4619sw c4619sw) {
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4326pd0
    public final void a(long j, int i, int i2, int i3, C4238od0 c4238od0) {
    }
}
