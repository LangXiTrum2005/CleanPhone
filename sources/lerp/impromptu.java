package lerp;

import java.util.Arrays;

/* JADX INFO: compiled from: Oscillator.java */
/* JADX INFO: loaded from: classes.dex */
public class impromptu {

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
    public int f32805beachfront;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public double[] f32807dern;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public competently f32809marial;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public String f32811wireman;

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public float[] f32804attabal = new float[0];

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public double[] f32810saneness = new double[0];

    /* JADX INFO: renamed from: competently, reason: collision with root package name */
    public double f32806competently = 6.283185307179586d;

    /* JADX INFO: renamed from: impromptu, reason: collision with root package name */
    public boolean f32808impromptu = false;

    public void attabal(double d, float f) {
        int length = this.f32804attabal.length + 1;
        int iBinarySearch = Arrays.binarySearch(this.f32810saneness, d);
        if (iBinarySearch < 0) {
            iBinarySearch = (-iBinarySearch) - 1;
        }
        this.f32810saneness = Arrays.copyOf(this.f32810saneness, length);
        this.f32804attabal = Arrays.copyOf(this.f32804attabal, length);
        this.f32807dern = new double[length];
        double[] dArr = this.f32810saneness;
        System.arraycopy(dArr, iBinarySearch, dArr, iBinarySearch + 1, (length - iBinarySearch) - 1);
        this.f32810saneness[iBinarySearch] = d;
        this.f32804attabal[iBinarySearch] = f;
        this.f32808impromptu = false;
    }

    public void beachfront() {
        double d = 0.0d;
        int i = 0;
        while (true) {
            float[] fArr = this.f32804attabal;
            if (i >= fArr.length) {
                break;
            }
            d += (double) fArr[i];
            i++;
        }
        double d2 = 0.0d;
        int i2 = 1;
        while (true) {
            float[] fArr2 = this.f32804attabal;
            if (i2 >= fArr2.length) {
                break;
            }
            int i3 = i2 - 1;
            float f = (fArr2[i3] + fArr2[i2]) / 2.0f;
            double[] dArr = this.f32810saneness;
            d2 += (dArr[i2] - dArr[i3]) * ((double) f);
            i2++;
        }
        int i4 = 0;
        while (true) {
            float[] fArr3 = this.f32804attabal;
            if (i4 >= fArr3.length) {
                break;
            }
            fArr3[i4] = fArr3[i4] * ((float) (d / d2));
            i4++;
        }
        this.f32807dern[0] = 0.0d;
        int i5 = 1;
        while (true) {
            float[] fArr4 = this.f32804attabal;
            if (i5 >= fArr4.length) {
                this.f32808impromptu = true;
                return;
            }
            int i6 = i5 - 1;
            float f2 = (fArr4[i6] + fArr4[i5]) / 2.0f;
            double[] dArr2 = this.f32810saneness;
            double d3 = dArr2[i5] - dArr2[i6];
            double[] dArr3 = this.f32807dern;
            dArr3[i5] = dArr3[i6] + (d3 * ((double) f2));
            i5++;
        }
    }

    public void competently(int i, String str) {
        this.f32805beachfront = i;
        this.f32811wireman = str;
        if (str != null) {
            this.f32809marial = competently.taiyuan(str);
        }
    }

    public double dern(double d) {
        if (d <= 0.0d) {
            return 0.0d;
        }
        if (d >= 1.0d) {
            return 1.0d;
        }
        int iBinarySearch = Arrays.binarySearch(this.f32810saneness, d);
        if (iBinarySearch < 0) {
            iBinarySearch = (-iBinarySearch) - 1;
        }
        float[] fArr = this.f32804attabal;
        float f = fArr[iBinarySearch];
        int i = iBinarySearch - 1;
        float f2 = fArr[i];
        double d2 = f - f2;
        double[] dArr = this.f32810saneness;
        double d3 = dArr[iBinarySearch];
        double d4 = dArr[i];
        double d5 = d2 / (d3 - d4);
        return this.f32807dern[i] + ((((double) f2) - (d5 * d4)) * (d - d4)) + ((d5 * ((d * d) - (d4 * d4))) / 2.0d);
    }

    public double marial(double d, double d2) {
        double dAbs;
        double dDern = dern(d) + d2;
        switch (this.f32805beachfront) {
            case 1:
                return Math.signum(0.5d - (dDern % 1.0d));
            case 2:
                dAbs = Math.abs((((dDern * 4.0d) + 1.0d) % 4.0d) - 2.0d);
                break;
            case 3:
                return (((dDern * 2.0d) + 1.0d) % 2.0d) - 1.0d;
            case 4:
                dAbs = ((dDern * 2.0d) + 1.0d) % 2.0d;
                break;
            case 5:
                return Math.cos(this.f32806competently * (d2 + dDern));
            case 6:
                double dAbs2 = 1.0d - Math.abs(((dDern * 4.0d) % 4.0d) - 2.0d);
                dAbs = dAbs2 * dAbs2;
                break;
            case 7:
                return this.f32809marial.dern(dDern % 1.0d, 0);
            default:
                return Math.sin(this.f32806competently * dDern);
        }
        return 1.0d - dAbs;
    }

    public double saneness(double d) {
        if (d <= 0.0d) {
            return 0.0d;
        }
        if (d >= 1.0d) {
            return 1.0d;
        }
        int iBinarySearch = Arrays.binarySearch(this.f32810saneness, d);
        if (iBinarySearch < 0) {
            iBinarySearch = (-iBinarySearch) - 1;
        }
        float[] fArr = this.f32804attabal;
        float f = fArr[iBinarySearch];
        int i = iBinarySearch - 1;
        float f2 = fArr[i];
        double d2 = f - f2;
        double[] dArr = this.f32810saneness;
        double d3 = dArr[iBinarySearch];
        double d4 = dArr[i];
        double d5 = d2 / (d3 - d4);
        return (d * d5) + (((double) f2) - (d5 * d4));
    }

    public String toString() {
        return "pos =" + Arrays.toString(this.f32810saneness) + " period=" + Arrays.toString(this.f32804attabal);
    }

    public double wireman(double d, double d2, double d3) {
        double dDern = d2 + dern(d);
        double dSaneness = saneness(d) + d3;
        switch (this.f32805beachfront) {
            case 1:
                return 0.0d;
            case 2:
                return dSaneness * 4.0d * Math.signum((((dDern * 4.0d) + 3.0d) % 4.0d) - 2.0d);
            case 3:
                return dSaneness * 2.0d;
            case 4:
                return (-dSaneness) * 2.0d;
            case 5:
                double d4 = this.f32806competently;
                return (-d4) * dSaneness * Math.sin(d4 * dDern);
            case 6:
                return dSaneness * 4.0d * ((((dDern * 4.0d) + 2.0d) % 4.0d) - 2.0d);
            case 7:
                return this.f32809marial.beachfront(dDern % 1.0d, 0);
            default:
                double d5 = this.f32806competently;
                return dSaneness * d5 * Math.cos(d5 * dDern);
        }
    }
}
