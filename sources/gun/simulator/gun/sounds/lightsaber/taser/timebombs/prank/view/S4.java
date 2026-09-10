package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX INFO: loaded from: classes2.dex */
public abstract class S4 extends T4 {
    public final /* synthetic */ int d = 0;

    public S4(int i, int i2, String str) {
        super(i, new String[]{str}, i2);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3405f5
    public final int c() {
        switch (this.d) {
            case 0:
                return 2;
            default:
                return 3;
        }
    }

    public final float j(float f, float f2, int i, float f3, float f4) {
        if (f >= this.b[0]) {
            float fK = k(f);
            return i == 1 ? AbstractC5044xl.w(fK, f4, f2, f4) : AbstractC5044xl.w(fK, f3, f2, f3);
        }
        int iD = DM.D(i);
        if (iD != 0) {
            return iD != 1 ? f3 : AbstractC5044xl.w(f4, f3, f2, f3);
        }
        return f4;
    }

    public final float k(float f) {
        float[] fArr = this.b;
        int length = fArr.length - 2;
        for (int i = 2; i <= length; i += 2) {
            if (fArr[i] > f) {
                length = i - 2;
                break;
            }
        }
        int i2 = (int) this.c[length >> 1];
        if (i2 != 0) {
            return i2 != 1 ? f(length, f, 1, i2 - 2) : fArr[length + 1];
        }
        float f2 = fArr[length];
        float f3 = fArr[length + 1];
        return AbstractC5044xl.w(fArr[length + 3], f3, (f - f2) / (fArr[length + 2] - f2), f3);
    }

    public final float l(float f, float f2, int i, float f3, float f4) {
        if (f < this.b[0]) {
            int iD = DM.D(i);
            if (iD != 0) {
                return iD != 1 ? f3 : AbstractC5044xl.w(f4, f3, f2, f3);
            }
            return f4;
        }
        float fK = k(f);
        int iD2 = DM.D(i);
        if (iD2 == 0) {
            return (fK * f2) + f4;
        }
        if (iD2 == 1 || iD2 == 2) {
            fK += f4 - f3;
        }
        return (fK * f2) + f3;
    }

    public final float m(float f, float f2, int i, int i2, float f3, float f4) {
        if (f < this.b[0]) {
            int iD = DM.D(i);
            if (iD != 0) {
                return iD != 1 ? f3 : AbstractC5044xl.w(f4, f3, f2, f3);
            }
            return f4;
        }
        float fK = k(f) * f4;
        if (f2 == 1.0f) {
            return i == 4 ? (f3 + fK) - f4 : fK;
        }
        if (i2 == 2) {
            int iD2 = DM.D(i);
            if (iD2 == 0) {
                return (((Math.signum(f4) * Math.abs(fK)) - f4) * f2) + f4;
            }
            if (iD2 == 1 || iD2 == 2) {
                return (((Math.signum(f3) * Math.abs(fK)) - f3) * f2) + f3;
            }
        } else {
            int iD3 = DM.D(i);
            if (iD3 == 0) {
                float fSignum = Math.signum(fK) * Math.abs(f4);
                return AbstractC5044xl.w(fK, fSignum, f2, fSignum);
            }
            if (iD3 == 1 || iD3 == 2) {
                float fSignum2 = Math.signum(fK) * Math.abs(f3);
                return AbstractC5044xl.w(fK, fSignum2, f2, fSignum2);
            }
        }
        return AbstractC5044xl.w(fK, f4, f2, f3);
    }

    public S4(int i, int i2, String str, String str2) {
        super(i, new String[]{str, str2}, i2);
    }
}
