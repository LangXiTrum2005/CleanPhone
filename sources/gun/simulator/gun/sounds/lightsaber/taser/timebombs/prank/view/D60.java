package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.util.Arrays;
import java.util.Random;

/* JADX INFO: loaded from: classes2.dex */
public final class D60 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Random f2955a;
    public final int[] b;
    public final int[] c;

    public D60(Random random) {
        this(new int[0], random);
    }

    public final D60 a() {
        return new D60(new Random(this.f2955a.nextLong()));
    }

    public final D60 b(int i, int i2) {
        int[] iArr;
        Random random;
        int[] iArr2 = new int[i2];
        int[] iArr3 = new int[i2];
        int i3 = 0;
        while (true) {
            iArr = this.b;
            random = this.f2955a;
            if (i3 >= i2) {
                break;
            }
            iArr2[i3] = random.nextInt(iArr.length + 1);
            int i4 = i3 + 1;
            int iNextInt = random.nextInt(i4);
            iArr3[i3] = iArr3[iNextInt];
            iArr3[iNextInt] = i3 + i;
            i3 = i4;
        }
        Arrays.sort(iArr2);
        int[] iArr4 = new int[iArr.length + i2];
        int i5 = 0;
        int i6 = 0;
        for (int i7 = 0; i7 < iArr.length + i2; i7++) {
            if (i5 >= i2 || i6 != iArr2[i5]) {
                int i8 = i6 + 1;
                int i9 = iArr[i6];
                iArr4[i7] = i9;
                if (i9 >= i) {
                    iArr4[i7] = i9 + i2;
                }
                i6 = i8;
            } else {
                iArr4[i7] = iArr3[i5];
                i5++;
            }
        }
        return new D60(iArr4, new Random(random.nextLong()));
    }

    public final D60 c(int i, int i2) {
        int i3 = i2 - i;
        int[] iArr = this.b;
        int[] iArr2 = new int[iArr.length - i3];
        int i4 = 0;
        for (int i5 = 0; i5 < iArr.length; i5++) {
            int i6 = iArr[i5];
            if (i6 < i || i6 >= i2) {
                int i7 = i5 - i4;
                if (i6 >= i) {
                    i6 -= i3;
                }
                iArr2[i7] = i6;
            } else {
                i4++;
            }
        }
        return new D60(iArr2, new Random(this.f2955a.nextLong()));
    }

    public D60() {
        this(new Random());
    }

    public D60(int[] iArr, Random random) {
        this.b = iArr;
        this.f2955a = random;
        this.c = new int[iArr.length];
        for (int i = 0; i < iArr.length; i++) {
            this.c[iArr[i]] = i;
        }
    }
}
