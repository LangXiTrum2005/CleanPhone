package lerp;

import com.ironsource.X3;
import java.lang.reflect.Array;
import java.text.DecimalFormat;
import java.util.Arrays;

/* JADX INFO: compiled from: SplineSet.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class cutely {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public saneness f32789attabal;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public String f32791marial;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public int f32793wireman;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public int[] f32792saneness = new int[10];

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public float[] f32790dern = new float[10];

    /* JADX INFO: compiled from: SplineSet.java */
    public static class attabal {
        public static void attabal(int[] iArr, float[] fArr, int i, int i2) {
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

        public static void dern(int[] iArr, float[] fArr, int i, int i2) {
            int i3 = iArr[i];
            iArr[i] = iArr[i2];
            iArr[i2] = i3;
            float f = fArr[i];
            fArr[i] = fArr[i2];
            fArr[i2] = f;
        }

        public static int saneness(int[] iArr, float[] fArr, int i, int i2) {
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
        return (float) this.f32789attabal.dern(f, 0);
    }

    public void dern(int i, float f) {
        int[] iArr = this.f32792saneness;
        if (iArr.length < this.f32793wireman + 1) {
            this.f32792saneness = Arrays.copyOf(iArr, iArr.length * 2);
            float[] fArr = this.f32790dern;
            this.f32790dern = Arrays.copyOf(fArr, fArr.length * 2);
        }
        int[] iArr2 = this.f32792saneness;
        int i2 = this.f32793wireman;
        iArr2[i2] = i;
        this.f32790dern[i2] = f;
        this.f32793wireman = i2 + 1;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0048  */
    public void marial(int i) {
        int i2 = this.f32793wireman;
        if (i2 == 0) {
            return;
        }
        attabal.attabal(this.f32792saneness, this.f32790dern, 0, i2 - 1);
        int i3 = 1;
        for (int i4 = 1; i4 < this.f32793wireman; i4++) {
            int[] iArr = this.f32792saneness;
            if (iArr[i4 - 1] != iArr[i4]) {
                i3++;
            }
        }
        double[] dArr = new double[i3];
        double[][] dArr2 = (double[][]) Array.newInstance((Class<?>) Double.TYPE, i3, 1);
        int i5 = 0;
        for (int i6 = 0; i6 < this.f32793wireman; i6++) {
            if (i6 > 0) {
                int[] iArr2 = this.f32792saneness;
                if (iArr2[i6] != iArr2[i6 - 1]) {
                    dArr[i5] = ((double) this.f32792saneness[i6]) * 0.01d;
                    dArr2[i5][0] = this.f32790dern[i6];
                    i5++;
                }
            } else {
                dArr[i5] = ((double) this.f32792saneness[i6]) * 0.01d;
                dArr2[i5][0] = this.f32790dern[i6];
                i5++;
            }
        }
        this.f32789attabal = saneness.attabal(i, dArr, dArr2);
    }

    public float saneness(float f) {
        return (float) this.f32789attabal.beachfront(f, 0);
    }

    public String toString() {
        String str = this.f32791marial;
        DecimalFormat decimalFormat = new DecimalFormat("##.##");
        for (int i = 0; i < this.f32793wireman; i++) {
            str = str + X3.j.d + this.f32792saneness[i] + " , " + decimalFormat.format(this.f32790dern[i]) + "] ";
        }
        return str;
    }

    public void wireman(String str) {
        this.f32791marial = str;
    }
}
