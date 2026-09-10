package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import com.badlogic.gdx.Input;
import java.io.Serializable;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.d0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C3219d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f4253a;
    public Serializable b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;

    public final boolean a(int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        if (!((i & (-2097152)) == -2097152) || (i2 = (i >>> 19) & 3) == 1 || (i3 = (i >>> 17) & 3) == 0 || (i4 = (i >>> 12) & 15) == 0 || i4 == 15 || (i5 = (i >>> 10) & 3) == 3) {
            return false;
        }
        this.f4253a = i2;
        this.b = AbstractC4496rb.c[3 - i3];
        int i6 = AbstractC4496rb.d[i5];
        this.d = i6;
        if (i2 == 2) {
            this.d = i6 / 2;
        } else if (i2 == 0) {
            this.d = i6 / 4;
        }
        int i7 = (i >>> 9) & 1;
        int i8 = 1152;
        if (i3 != 1) {
            if (i3 != 2) {
                if (i3 != 3) {
                    throw new IllegalArgumentException();
                }
                i8 = 384;
            }
        } else if (i2 != 3) {
            i8 = 576;
        }
        this.g = i8;
        if (i3 == 3) {
            int i9 = i2 == 3 ? AbstractC4496rb.e[i4 - 1] : AbstractC4496rb.f[i4 - 1];
            this.f = i9;
            this.c = (((i9 * 12) / this.d) + i7) * 4;
        } else {
            int i10 = Input.Keys.NUMPAD_0;
            if (i2 == 3) {
                int i11 = i3 == 2 ? AbstractC4496rb.g[i4 - 1] : AbstractC4496rb.h[i4 - 1];
                this.f = i11;
                this.c = ((i11 * Input.Keys.NUMPAD_0) / this.d) + i7;
            } else {
                int i12 = AbstractC4496rb.i[i4 - 1];
                this.f = i12;
                if (i3 == 1) {
                    i10 = 72;
                }
                this.c = ((i10 * i12) / this.d) + i7;
            }
        }
        this.e = ((i >> 6) & 3) == 3 ? 1 : 2;
        return true;
    }
}
