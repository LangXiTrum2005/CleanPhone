package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.io.EOFException;
import java.io.InterruptedIOException;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.b0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C3042b0 implements InterfaceC4177nt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C3130c0 f4151a = new C3130c0(null);
    public final JT b = new JT(2786);
    public boolean c;

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4177nt
    public final int a(InterfaceC4265ot interfaceC4265ot, C2868Wu c2868Wu) {
        JT jt = this.b;
        int i = interfaceC4265ot.read(jt.f3266a, 0, 2786);
        if (i == -1) {
            return -1;
        }
        jt.E(0);
        jt.D(i);
        boolean z = this.c;
        C3130c0 c3130c0 = this.f4151a;
        if (!z) {
            c3130c0.b(4, 0L);
            this.c = true;
        }
        c3130c0.a(jt);
        return 0;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4177nt
    public final boolean b(InterfaceC4265ot interfaceC4265ot) throws EOFException, InterruptedIOException {
        C2938Zm c2938Zm;
        int iT;
        JT jt = new JT(10);
        int i = 0;
        while (true) {
            c2938Zm = (C2938Zm) interfaceC4265ot;
            c2938Zm.peekFully(jt.f3266a, 0, 10, false);
            jt.E(0);
            if (jt.v() != 4801587) {
                break;
            }
            jt.F(3);
            int iS = jt.s();
            i += iS + 10;
            c2938Zm.advancePeekPosition(iS, false);
        }
        c2938Zm.f = 0;
        c2938Zm.advancePeekPosition(i, false);
        int i2 = i;
        while (true) {
            int i3 = 0;
            while (true) {
                c2938Zm.peekFully(jt.f3266a, 0, 6, false);
                jt.E(0);
                if (jt.y() != 2935) {
                    break;
                }
                i3++;
                if (i3 >= 4) {
                    return true;
                }
                byte[] bArr = jt.f3266a;
                if (bArr.length < 6) {
                    iT = -1;
                } else if (((bArr[5] & 248) >> 3) > 10) {
                    iT = ((((bArr[2] & 7) << 8) | (bArr[3] & 255)) + 1) * 2;
                } else {
                    byte b = bArr[4];
                    iT = WD.t((b & 192) >> 6, b & 63);
                }
                if (iT == -1) {
                    return false;
                }
                c2938Zm.advancePeekPosition(iT - 6, false);
            }
            c2938Zm.f = 0;
            i2++;
            if (i2 - i >= 8192) {
                return false;
            }
            c2938Zm.advancePeekPosition(i2, false);
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4177nt
    public final void d(InterfaceC4353pt interfaceC4353pt) {
        this.f4151a.c(interfaceC4353pt, new C4416qe0(0, 1));
        interfaceC4353pt.endTracks();
        interfaceC4353pt.a(new C2946Zu(com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET));
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4177nt
    public final void seek(long j, long j2) {
        this.c = false;
        this.f4151a.seek();
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4177nt
    public final void release() {
    }
}
