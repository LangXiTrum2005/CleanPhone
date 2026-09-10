package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.util.Arrays;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.vQ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C4836vQ {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f5129a;
    public boolean b;
    public boolean c;
    public byte[] d;
    public int e;

    public C4836vQ(int i) {
        this.f5129a = i;
        byte[] bArr = new byte[131];
        this.d = bArr;
        bArr[2] = 1;
    }

    public final void a(byte[] bArr, int i, int i2) {
        if (this.b) {
            int i3 = i2 - i;
            byte[] bArr2 = this.d;
            int length = bArr2.length;
            int i4 = this.e;
            if (length < i4 + i3) {
                this.d = Arrays.copyOf(bArr2, (i4 + i3) * 2);
            }
            System.arraycopy(bArr, i, this.d, this.e, i3);
            this.e += i3;
        }
    }

    public final boolean b(int i) {
        if (!this.b) {
            return false;
        }
        this.e -= i;
        this.b = false;
        this.c = true;
        return true;
    }

    public final void c() {
        this.b = false;
        this.c = false;
    }

    public final void d(int i) {
        FW.s(!this.b);
        boolean z = i == this.f5129a;
        this.b = z;
        if (z) {
            this.e = 3;
            this.c = false;
        }
    }
}
