package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.util.Arrays;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Ty, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2794Ty {
    public static final byte[] f = {0, 0, 1};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f3802a;
    public int b;
    public int c;
    public int d;
    public byte[] e;

    public final void a(byte[] bArr, int i, int i2) {
        if (this.f3802a) {
            int i3 = i2 - i;
            byte[] bArr2 = this.e;
            int length = bArr2.length;
            int i4 = this.c;
            if (length < i4 + i3) {
                this.e = Arrays.copyOf(bArr2, (i4 + i3) * 2);
            }
            System.arraycopy(bArr, i, this.e, this.c, i3);
            this.c += i3;
        }
    }
}
