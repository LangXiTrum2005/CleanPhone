package lerp;

import com.ironsource.X3;
import java.lang.reflect.Array;
import java.text.DecimalFormat;

/* JADX INFO: compiled from: TimeCycleSplineSet.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class kowloon {

    /* JADX INFO: renamed from: apical, reason: collision with root package name */
    public static float f32812apical = 6.2831855f;

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public saneness f32813attabal;

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
    public String f32814beachfront;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public int f32819marial;

    /* JADX INFO: renamed from: taiyuan, reason: collision with root package name */
    public long f32821taiyuan;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public int f32820saneness = 0;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public int[] f32817dern = new int[10];

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public float[][] f32822wireman = (float[][]) Array.newInstance((Class<?>) Float.TYPE, 10, 3);

    /* JADX INFO: renamed from: competently, reason: collision with root package name */
    public float[] f32815competently = new float[3];

    /* JADX INFO: renamed from: impromptu, reason: collision with root package name */
    public boolean f32818impromptu = false;

    /* JADX INFO: renamed from: cutely, reason: collision with root package name */
    public float f32816cutely = Float.NaN;

    /* JADX INFO: compiled from: TimeCycleSplineSet.java */
    public static class attabal {
        public static void attabal(int[] iArr, float[][] fArr, int i, int i2) {
            int[] iArr2 = new int[iArr.length + 10];
            iArr2[0] = i2;
            iArr2[1] = i;
            int i3 = 2;
            while (i3 > 0) {
                int i4 = iArr2[i3 - 1];
                int i5 = i3 - 2;
                int i6 = iArr2[i5];
                if (i4 < i6) {
                    int iSaneness = saneness(iArr, fArr, i4, i6);
                    iArr2[i5] = iSaneness - 1;
                    iArr2[i3 - 1] = i4;
                    int i7 = i3 + 1;
                    iArr2[i3] = i6;
                    i3 += 2;
                    iArr2[i7] = iSaneness + 1;
                } else {
                    i3 = i5;
                }
            }
        }

        public static void dern(int[] iArr, float[][] fArr, int i, int i2) {
            int i3 = iArr[i];
            iArr[i] = iArr[i2];
            iArr[i2] = i3;
            float[] fArr2 = fArr[i];
            fArr[i] = fArr[i2];
            fArr[i2] = fArr2;
        }

        public static int saneness(int[] iArr, float[][] fArr, int i, int i2) {
            int i3 = iArr[i2];
            int i4 = i;
            while (i < i2) {
                if (iArr[i] <= i3) {
                    dern(iArr, fArr, i4, i);
                    i4++;
                }
                i++;
            }
            dern(iArr, fArr, i4, i2);
            return i4;
        }
    }

    public float attabal(float f) {
        float fAbs;
        switch (this.f32820saneness) {
            case 1:
                return Math.signum(f * f32812apical);
            case 2:
                fAbs = Math.abs(f);
                break;
            case 3:
                return (((f * 2.0f) + 1.0f) % 2.0f) - 1.0f;
            case 4:
                fAbs = ((f * 2.0f) + 1.0f) % 2.0f;
                break;
            case 5:
                return (float) Math.cos(f * f32812apical);
            case 6:
                float fAbs2 = 1.0f - Math.abs(((f * 4.0f) % 4.0f) - 2.0f);
                fAbs = fAbs2 * fAbs2;
                break;
            default:
                return (float) Math.sin(f * f32812apical);
        }
        return 1.0f - fAbs;
    }

    public void dern(long j) {
        this.f32821taiyuan = j;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0050  */
    public void marial(int i) {
        int i2 = this.f32819marial;
        if (i2 == 0) {
            System.err.getClass();
            return;
        }
        attabal.attabal(this.f32817dern, this.f32822wireman, 0, i2 - 1);
        int i3 = 1;
        int i4 = 0;
        while (true) {
            int[] iArr = this.f32817dern;
            if (i3 >= iArr.length) {
                break;
            }
            if (iArr[i3] != iArr[i3 - 1]) {
                i4++;
            }
            i3++;
        }
        if (i4 == 0) {
            i4 = 1;
        }
        double[] dArr = new double[i4];
        double[][] dArr2 = (double[][]) Array.newInstance((Class<?>) Double.TYPE, i4, 3);
        int i5 = 0;
        for (int i6 = 0; i6 < this.f32819marial; i6++) {
            if (i6 > 0) {
                int[] iArr2 = this.f32817dern;
                if (iArr2[i6] != iArr2[i6 - 1]) {
                    dArr[i5] = ((double) this.f32817dern[i6]) * 0.01d;
                    double[] dArr3 = dArr2[i5];
                    float[] fArr = this.f32822wireman[i6];
                    dArr3[0] = fArr[0];
                    dArr3[1] = fArr[1];
                    dArr3[2] = fArr[2];
                    i5++;
                }
            } else {
                dArr[i5] = ((double) this.f32817dern[i6]) * 0.01d;
                double[] dArr4 = dArr2[i5];
                float[] fArr2 = this.f32822wireman[i6];
                dArr4[0] = fArr2[0];
                dArr4[1] = fArr2[1];
                dArr4[2] = fArr2[2];
                i5++;
            }
        }
        this.f32813attabal = saneness.attabal(i, dArr, dArr2);
    }

    public void saneness(int i, float f, float f2, int i2, float f3) {
        int[] iArr = this.f32817dern;
        int i3 = this.f32819marial;
        iArr[i3] = i;
        float[] fArr = this.f32822wireman[i3];
        fArr[0] = f;
        fArr[1] = f2;
        fArr[2] = f3;
        this.f32820saneness = Math.max(this.f32820saneness, i2);
        this.f32819marial++;
    }

    public String toString() {
        String str = this.f32814beachfront;
        DecimalFormat decimalFormat = new DecimalFormat("##.##");
        for (int i = 0; i < this.f32819marial; i++) {
            str = str + X3.j.d + this.f32817dern[i] + " , " + decimalFormat.format(this.f32822wireman[i]) + "] ";
        }
        return str;
    }

    public void wireman(String str) {
        this.f32814beachfront = str;
    }
}
