package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.util.Pair;
import java.util.Arrays;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.c7, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C3144c7 {
    public static final C3144c7 c = new C3144c7(new int[]{2}, 8);
    public static final C3144c7 d = new C3144c7(new int[]{2, 5, 6}, 8);
    public static final C4405qY e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int[] f4205a;
    public final int b;

    static {
        EC ec = new EC(4);
        ec.b(5, 6);
        ec.b(17, 6);
        ec.b(7, 6);
        ec.b(18, 6);
        ec.b(6, 8);
        ec.b(8, 8);
        ec.b(14, 8);
        e = ec.a();
    }

    public C3144c7(int[] iArr, int i) {
        if (iArr != null) {
            int[] iArrCopyOf = Arrays.copyOf(iArr, iArr.length);
            this.f4205a = iArrCopyOf;
            Arrays.sort(iArrCopyOf);
        } else {
            this.f4205a = new int[0];
        }
        this.b = i;
    }

    /* JADX WARN: Code duplicated, block: B:48:0x0089  */
    public final Pair a(C4619sw c4619sw) {
        int iIntValue;
        String str = c4619sw.l;
        str.getClass();
        int iD = AbstractC5011xP.d(str, c4619sw.i);
        Integer numValueOf = Integer.valueOf(iD);
        C4405qY c4405qY = e;
        if (!c4405qY.containsKey(numValueOf)) {
            return null;
        }
        int[] iArr = this.f4205a;
        int i = 6;
        if (iD == 18 && Arrays.binarySearch(iArr, 18) < 0) {
            iD = 6;
        } else if (iD == 8 && Arrays.binarySearch(iArr, 8) < 0) {
            iD = 7;
        }
        if (Arrays.binarySearch(iArr, iD) < 0) {
            return null;
        }
        int i2 = c4619sw.y;
        if (i2 == -1 || iD == 18) {
            int i3 = c4619sw.z;
            if (i3 == -1) {
                i3 = 48000;
            }
            if (Ug0.f3833a >= 29) {
                iIntValue = AbstractC3056b7.b(iD, i3);
            } else {
                Object obj = c4405qY.get(Integer.valueOf(iD));
                iIntValue = ((Integer) (obj != null ? obj : 0)).intValue();
            }
            i2 = iIntValue;
        } else if (i2 > this.b) {
            return null;
        }
        int i4 = Ug0.f3833a;
        if (i4 > 28) {
            i = i2;
        } else if (i2 == 7) {
            i = 8;
        } else if (i2 != 3 && i2 != 4 && i2 != 5) {
            i = i2;
        }
        if (i4 <= 26 && "fugu".equals(Ug0.b) && i == 1) {
            i = 2;
        }
        int iP = Ug0.p(i);
        if (iP == 0) {
            return null;
        }
        return Pair.create(Integer.valueOf(iD), Integer.valueOf(iP));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3144c7)) {
            return false;
        }
        C3144c7 c3144c7 = (C3144c7) obj;
        return Arrays.equals(this.f4205a, c3144c7.f4205a) && this.b == c3144c7.b;
    }

    public final int hashCode() {
        return (Arrays.hashCode(this.f4205a) * 31) + this.b;
    }

    public final String toString() {
        return "AudioCapabilities[maxChannelCount=" + this.b + ", supportedEncodings=" + Arrays.toString(this.f4205a) + "]";
    }
}
