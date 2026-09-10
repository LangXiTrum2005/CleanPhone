package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.s, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C4535s extends AbstractC2871Wx {
    public final M40 l;
    public final /* synthetic */ AbstractC4623t m;
    public final /* synthetic */ String n;

    public C4535s(AbstractC4623t abstractC4623t, String str) {
        this.m = abstractC4623t;
        this.n = str;
        this.l = abstractC4623t.b.b;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2871Wx, gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3385er
    public final void D(int i) {
        v0(Long.toString(((long) i) & 4294967295L, 10));
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3385er
    public final M40 a() {
        return this.l;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2871Wx, gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3385er
    public final void f(byte b) {
        v0(String.valueOf(b & 255));
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2871Wx, gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3385er
    public final void s(long j) {
        String str;
        if (j == 0) {
            str = "0";
        } else if (j > 0) {
            str = Long.toString(j, 10);
        } else {
            char[] cArr = new char[64];
            long j2 = (j >>> 1) / ((long) 5);
            long j3 = 10;
            int i = 63;
            cArr[63] = Character.forDigit((int) (j - (j2 * j3)), 10);
            while (j2 > 0) {
                i--;
                cArr[i] = Character.forDigit((int) (j2 % j3), 10);
                j2 /= j3;
            }
            str = new String(cArr, i, 64 - i);
        }
        v0(str);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2871Wx, gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3385er
    public final void v(short s) {
        v0(String.valueOf(s & 65535));
    }

    public final void v0(String str) {
        AbstractC2995aW.q(str, com.umeng.analytics.pro.bc.aH);
        this.m.L(this.n, new C5001xF(str, false));
    }
}
