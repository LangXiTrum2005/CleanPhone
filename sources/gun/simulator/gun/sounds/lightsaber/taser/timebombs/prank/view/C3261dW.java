package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.io.IOException;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.dW, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C3261dW implements W20 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f4272a;
    public final /* synthetic */ C3525gW b;

    public C3261dW(C3525gW c3525gW, int i) {
        this.b = c3525gW;
        this.f4272a = i;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.W20
    public final int a(C3692iN c3692iN, C2677Pl c2677Pl, int i) {
        C3525gW c3525gW = this.b;
        if (c3525gW.s()) {
            return -3;
        }
        int i2 = this.f4272a;
        c3525gW.m(i2);
        int iA = c3525gW.s[i2].A(c3692iN, c2677Pl, i, c3525gW.K);
        if (iA == -3) {
            c3525gW.n(i2);
        }
        return iA;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.W20
    public final boolean isReady() {
        C3525gW c3525gW = this.b;
        return !c3525gW.s() && c3525gW.s[this.f4272a].v(c3525gW.K);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.W20
    public final void maybeThrowError() throws IOException {
        C3525gW c3525gW = this.b;
        c3525gW.s[this.f4272a].x();
        int iA = c3525gW.d.A(c3525gW.B);
        OI oi = c3525gW.k;
        IOException iOException = oi.c;
        if (iOException != null) {
            throw iOException;
        }
        KI ki = oi.b;
        if (ki != null) {
            if (iA == Integer.MIN_VALUE) {
                iA = ki.f3309a;
            }
            IOException iOException2 = ki.e;
            if (iOException2 != null && ki.f > iA) {
                throw iOException2;
            }
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.W20
    public final int skipData(long j) {
        C3525gW c3525gW = this.b;
        if (c3525gW.s()) {
            return 0;
        }
        int i = this.f4272a;
        c3525gW.m(i);
        V20 v20 = c3525gW.s[i];
        int iS = v20.s(j, c3525gW.K);
        v20.G(iS);
        if (iS != 0) {
            return iS;
        }
        c3525gW.n(i);
        return iS;
    }
}
