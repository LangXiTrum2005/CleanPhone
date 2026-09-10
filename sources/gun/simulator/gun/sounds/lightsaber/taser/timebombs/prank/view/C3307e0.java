package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.io.EOFException;
import java.io.InterruptedIOException;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.e0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C3307e0 implements InterfaceC4177nt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C3395f0 f4300a = new C3395f0(null);
    public final JT b = new JT(16384);
    public boolean c;

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4177nt
    public final int a(InterfaceC4265ot interfaceC4265ot, C2868Wu c2868Wu) {
        JT jt = this.b;
        int i = interfaceC4265ot.read(jt.f3266a, 0, 16384);
        if (i == -1) {
            return -1;
        }
        jt.E(0);
        jt.D(i);
        boolean z = this.c;
        C3395f0 c3395f0 = this.f4300a;
        if (!z) {
            c3395f0.b(4, 0L);
            this.c = true;
        }
        c3395f0.a(jt);
        return 0;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4177nt
    public final boolean b(InterfaceC4265ot interfaceC4265ot) throws EOFException, InterruptedIOException {
        C2938Zm c2938Zm;
        int i;
        JT jt = new JT(10);
        int i2 = 0;
        while (true) {
            c2938Zm = (C2938Zm) interfaceC4265ot;
            c2938Zm.peekFully(jt.f3266a, 0, 10, false);
            jt.E(0);
            if (jt.v() != 4801587) {
                break;
            }
            jt.F(3);
            int iS = jt.s();
            i2 += iS + 10;
            c2938Zm.advancePeekPosition(iS, false);
        }
        c2938Zm.f = 0;
        c2938Zm.advancePeekPosition(i2, false);
        int i3 = i2;
        while (true) {
            int i4 = 0;
            while (true) {
                int i5 = 7;
                c2938Zm.peekFully(jt.f3266a, 0, 7, false);
                jt.E(0);
                int iY = jt.y();
                if (iY == 44096 || iY == 44097) {
                    i4++;
                    if (i4 >= 4) {
                        return true;
                    }
                    byte[] bArr = jt.f3266a;
                    if (bArr.length < 7) {
                        i = -1;
                    } else {
                        int i6 = ((bArr[2] & 255) << 8) | (bArr[3] & 255);
                        if (i6 == 65535) {
                            i6 = ((bArr[4] & 255) << 16) | ((bArr[5] & 255) << 8) | (bArr[6] & 255);
                        } else {
                            i5 = 4;
                        }
                        if (iY == 44097) {
                            i5 += 2;
                        }
                        i = i6 + i5;
                    }
                    if (i == -1) {
                        return false;
                    }
                    c2938Zm.advancePeekPosition(i - 7, false);
                }
            }
            c2938Zm.f = 0;
            i3++;
            if (i3 - i2 >= 8192) {
                return false;
            }
            c2938Zm.advancePeekPosition(i3, false);
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4177nt
    public final void d(InterfaceC4353pt interfaceC4353pt) {
        this.f4300a.c(interfaceC4353pt, new C4416qe0(0, 1));
        interfaceC4353pt.endTracks();
        interfaceC4353pt.a(new C2946Zu(com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET));
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4177nt
    public final void seek(long j, long j2) {
        this.c = false;
        this.f4300a.seek();
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4177nt
    public final void release() {
    }
}
