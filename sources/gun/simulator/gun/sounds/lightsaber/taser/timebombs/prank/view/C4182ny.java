package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.util.Arrays;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.ny, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C4182ny {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float[] f4768a;
    public final int[] b;

    public C4182ny(float[] fArr, int[] iArr) {
        this.f4768a = fArr;
        this.b = iArr;
    }

    public final void a(C4182ny c4182ny) {
        int i = 0;
        while (true) {
            int[] iArr = c4182ny.b;
            if (i >= iArr.length) {
                return;
            }
            this.f4768a[i] = c4182ny.f4768a[i];
            this.b[i] = iArr[i];
            i++;
        }
    }

    public final C4182ny b(float[] fArr) {
        int iU;
        int[] iArr = new int[fArr.length];
        for (int i = 0; i < fArr.length; i++) {
            float f = fArr[i];
            float[] fArr2 = this.f4768a;
            int iBinarySearch = Arrays.binarySearch(fArr2, f);
            int[] iArr2 = this.b;
            if (iBinarySearch >= 0) {
                iU = iArr2[iBinarySearch];
            } else {
                int i2 = -(iBinarySearch + 1);
                if (i2 == 0) {
                    iU = iArr2[0];
                } else if (i2 == iArr2.length - 1) {
                    iU = iArr2[iArr2.length - 1];
                } else {
                    int i3 = i2 - 1;
                    float f2 = fArr2[i3];
                    iU = AbstractC2340Cl.u((f - f2) / (fArr2[i2] - f2), iArr2[i3], iArr2[i2]);
                }
            }
            iArr[i] = iU;
        }
        return new C4182ny(fArr, iArr);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C4182ny.class != obj.getClass()) {
            return false;
        }
        C4182ny c4182ny = (C4182ny) obj;
        return Arrays.equals(this.f4768a, c4182ny.f4768a) && Arrays.equals(this.b, c4182ny.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.b) + (Arrays.hashCode(this.f4768a) * 31);
    }
}
