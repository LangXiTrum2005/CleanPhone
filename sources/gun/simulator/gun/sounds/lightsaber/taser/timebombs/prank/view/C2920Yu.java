package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.util.Arrays;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Yu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2920Yu extends K90 {
    public C3036av n;
    public C2894Xu o;

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.K90
    public final long b(JT jt) {
        byte[] bArr = jt.f3266a;
        if (bArr[0] != -1) {
            return -1L;
        }
        int i = (bArr[2] & 255) >> 4;
        if (i == 6 || i == 7) {
            jt.F(4);
            jt.z();
        }
        int iO = AbstractC2340Cl.O(i, jt);
        jt.E(0);
        return iO;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.K90
    public final boolean c(JT jt, long j, C3491g4 c3491g4) {
        byte[] bArr = jt.f3266a;
        C3036av c3036av = this.n;
        if (c3036av == null) {
            C3036av c3036av2 = new C3036av(bArr, 17);
            this.n = c3036av2;
            c3491g4.b = c3036av2.c(Arrays.copyOfRange(bArr, 9, jt.c), null);
            return true;
        }
        byte b = bArr[0];
        if ((b & 127) != 3) {
            if (b != -1) {
                return true;
            }
            C2894Xu c2894Xu = this.o;
            if (c2894Xu != null) {
                c2894Xu.c = j;
                c3491g4.c = c2894Xu;
            }
            ((C4619sw) c3491g4.b).getClass();
            return false;
        }
        C3491g4 c3491g4B0 = AbstractC2845Vx.b0(jt);
        C3036av c3036av3 = new C3036av(c3036av.f4147a, c3036av.b, c3036av.c, c3036av.d, c3036av.e, c3036av.g, c3036av.h, c3036av.j, c3491g4B0, c3036av.l);
        this.n = c3036av3;
        C2894Xu c2894Xu2 = new C2894Xu();
        c2894Xu2.f3998a = c3036av3;
        c2894Xu2.b = c3491g4B0;
        c2894Xu2.c = -1L;
        c2894Xu2.d = -1L;
        this.o = c2894Xu2;
        return true;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.K90
    public final void d(boolean z) {
        super.d(z);
        if (z) {
            this.n = null;
            this.o = null;
        }
    }
}
