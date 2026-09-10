package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.util.Arrays;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.od0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C4238od0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f4798a;
    public final byte[] b;
    public final int c;
    public final int d;

    public C4238od0(int i, byte[] bArr, int i2, int i3) {
        this.f4798a = i;
        this.b = bArr;
        this.c = i2;
        this.d = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C4238od0.class != obj.getClass()) {
            return false;
        }
        C4238od0 c4238od0 = (C4238od0) obj;
        return this.f4798a == c4238od0.f4798a && this.c == c4238od0.c && this.d == c4238od0.d && Arrays.equals(this.b, c4238od0.b);
    }

    public final int hashCode() {
        return ((((Arrays.hashCode(this.b) + (this.f4798a * 31)) * 31) + this.c) * 31) + this.d;
    }
}
