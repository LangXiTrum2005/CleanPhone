package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.os.SystemClock;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.j90, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C3764j90 implements InterfaceC4042mN {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC2412Ff f4541a;
    public boolean b;
    public long c;
    public long d;
    public EU e = EU.d;

    public C3764j90(InterfaceC2412Ff interfaceC2412Ff) {
        this.f4541a = interfaceC2412Ff;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4042mN
    public final void a(EU eu) {
        if (this.b) {
            b(getPositionUs());
        }
        this.e = eu;
    }

    public final void b(long j) {
        this.c = j;
        if (this.b) {
            ((Oa0) this.f4541a).getClass();
            this.d = SystemClock.elapsedRealtime();
        }
    }

    public final void c() {
        if (this.b) {
            return;
        }
        ((Oa0) this.f4541a).getClass();
        this.d = SystemClock.elapsedRealtime();
        this.b = true;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4042mN
    public final EU getPlaybackParameters() {
        return this.e;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4042mN
    public final long getPositionUs() {
        long j = this.c;
        if (!this.b) {
            return j;
        }
        ((Oa0) this.f4541a).getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime() - this.d;
        EU eu = this.e;
        return j + (eu.f3024a == 1.0f ? Ug0.L(jElapsedRealtime) : jElapsedRealtime * ((long) eu.c));
    }
}
