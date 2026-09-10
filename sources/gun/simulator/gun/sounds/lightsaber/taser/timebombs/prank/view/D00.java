package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public final class D00 implements K00 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final J00 f2951a;
    public InterfaceC4326pd0 b;
    public int c;
    public long d = com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET;
    public int e = -1;
    public long f;
    public int g;

    public D00(J00 j00) {
        this.f2951a = j00;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.K00
    public final void a(InterfaceC4353pt interfaceC4353pt, int i) {
        InterfaceC4326pd0 interfaceC4326pd0Track = interfaceC4353pt.track(i, 2);
        this.b = interfaceC4326pd0Track;
        int i2 = Ug0.f3833a;
        interfaceC4326pd0Track.e(this.f2951a.c);
    }

    /* JADX WARN: Code duplicated, block: B:25:0x005b  */
    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.K00
    public final void c(int i, long j, JT jt, boolean z) {
        int i2;
        FW.t(this.b);
        int i3 = this.e;
        if (i3 != -1 && i != G00.a(i3)) {
            int i4 = Ug0.f3833a;
            Locale locale = Locale.US;
            AbstractC4038mJ.f();
        }
        int iA = jt.a();
        this.b.d(iA, jt);
        if (this.g == 0) {
            byte[] bArr = jt.f3266a;
            byte[] bArr2 = {0, 0, 1, -74};
            if (bArr == null) {
                throw new NullPointerException("array");
            }
            int i5 = 0;
            loop0: while (true) {
                if (i5 >= bArr.length - 3) {
                    i5 = -1;
                    break;
                }
                int i6 = 0;
                while (true) {
                    if (i6 >= 4) {
                        break loop0;
                    } else if (bArr[i5 + i6] != bArr2[i6]) {
                        break;
                    } else {
                        i6++;
                    }
                }
                i5++;
            }
            if (i5 != -1) {
                jt.E(i5 + 4);
                i2 = (jt.c() >> 6) != 0 ? 0 : 1;
            }
            this.c = i2;
        }
        this.g += iA;
        if (z) {
            if (this.d == com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET) {
                this.d = j;
            }
            this.b.a(FW.i0(this.f, j, this.d, 90000), this.c, this.g, 0, null);
            this.g = 0;
        }
        this.e = i;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.K00
    public final void seek(long j, long j2) {
        this.d = j;
        this.f = j2;
        this.g = 0;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.K00
    public final void b(long j) {
    }
}
