package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.oh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C4245oh extends C4157nh {
    public final boolean c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4245oh(NF nf, boolean z) {
        super(nf);
        AbstractC2995aW.q(nf, "writer");
        this.c = z;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C4157nh
    public final void c(byte b) {
        if (this.c) {
            i(String.valueOf(b & 255));
        } else {
            g(String.valueOf(b & 255));
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C4157nh
    public final void e(int i) {
        boolean z = this.c;
        String string = Long.toString(4294967295L & ((long) i), 10);
        if (z) {
            i(string);
        } else {
            g(string);
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C4157nh
    public final void f(long j) {
        int i = 63;
        String str = "0";
        if (this.c) {
            if (j != 0) {
                if (j > 0) {
                    str = Long.toString(j, 10);
                } else {
                    char[] cArr = new char[64];
                    long j2 = (j >>> 1) / ((long) 5);
                    long j3 = 10;
                    cArr[63] = Character.forDigit((int) (j - (j2 * j3)), 10);
                    while (j2 > 0) {
                        i--;
                        cArr[i] = Character.forDigit((int) (j2 % j3), 10);
                        j2 /= j3;
                    }
                    str = new String(cArr, i, 64 - i);
                }
            }
            i(str);
            return;
        }
        if (j != 0) {
            if (j > 0) {
                str = Long.toString(j, 10);
            } else {
                char[] cArr2 = new char[64];
                long j4 = (j >>> 1) / ((long) 5);
                long j5 = 10;
                cArr2[63] = Character.forDigit((int) (j - (j4 * j5)), 10);
                while (j4 > 0) {
                    i--;
                    cArr2[i] = Character.forDigit((int) (j4 % j5), 10);
                    j4 /= j5;
                }
                str = new String(cArr2, i, 64 - i);
            }
        }
        g(str);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C4157nh
    public final void h(short s) {
        if (this.c) {
            i(String.valueOf(s & 65535));
        } else {
            g(String.valueOf(s & 65535));
        }
    }
}
