package lerp;

/* JADX INFO: compiled from: LinearCurveFit.java */
/* JADX INFO: loaded from: classes.dex */
public class beachfront extends saneness {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public double[] f32779attabal;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public double f32780dern;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public double[] f32781marial;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public double[][] f32782saneness;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public boolean f32783wireman = true;

    public beachfront(double[] dArr, double[][] dArr2) {
        this.f32780dern = Double.NaN;
        int length = dArr2[0].length;
        this.f32781marial = new double[length];
        this.f32779attabal = dArr;
        this.f32782saneness = dArr2;
        if (length <= 2) {
            return;
        }
        int i = 0;
        double d = 0.0d;
        while (true) {
            double d2 = d;
            if (i >= dArr.length) {
                this.f32780dern = 0.0d;
                return;
            }
            double d3 = dArr2[i][0];
            if (i > 0) {
                Math.hypot(d3 - d, d3 - d2);
            }
            i++;
            d = d3;
        }
    }

    /* JADX WARN: Code duplicated, block: B:4:0x000a A[PHI: r3
  0x000a: PHI (r3v4 double) = (r3v0 double), (r3v2 double) binds: [B:3:0x0008, B:6:0x0012] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // lerp.saneness
    public double beachfront(double d, int i) {
        double[] dArr = this.f32779attabal;
        int length = dArr.length;
        int i2 = 0;
        double d2 = dArr[0];
        if (d < d2) {
            d = d2;
        } else {
            d2 = dArr[length - 1];
            if (d >= d2) {
                d = d2;
            }
        }
        while (i2 < length - 1) {
            double[] dArr2 = this.f32779attabal;
            int i3 = i2 + 1;
            double d3 = dArr2[i3];
            if (d <= d3) {
                double d4 = d3 - dArr2[i2];
                double[][] dArr3 = this.f32782saneness;
                return (dArr3[i3][i] - dArr3[i2][i]) / d4;
            }
            i2 = i3;
        }
        return 0.0d;
    }

    /* JADX WARN: Code duplicated, block: B:4:0x000f A[PHI: r4
  0x000f: PHI (r4v5 double) = (r4v0 double), (r4v2 double) binds: [B:3:0x000d, B:6:0x0017] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // lerp.saneness
    public void competently(double d, double[] dArr) {
        double[] dArr2 = this.f32779attabal;
        int length = dArr2.length;
        int length2 = this.f32782saneness[0].length;
        double d2 = dArr2[0];
        if (d <= d2) {
            d = d2;
        } else {
            d2 = dArr2[length - 1];
            if (d >= d2) {
                d = d2;
            }
        }
        int i = 0;
        while (i < length - 1) {
            double[] dArr3 = this.f32779attabal;
            int i2 = i + 1;
            double d3 = dArr3[i2];
            if (d <= d3) {
                double d4 = d3 - dArr3[i];
                for (int i3 = 0; i3 < length2; i3++) {
                    double[][] dArr4 = this.f32782saneness;
                    dArr[i3] = (dArr4[i2][i3] - dArr4[i][i3]) / d4;
                }
                return;
            }
            i = i2;
        }
    }

    @Override // lerp.saneness
    public double dern(double d, int i) {
        double d2;
        double d3;
        double dBeachfront;
        double[] dArr = this.f32779attabal;
        int length = dArr.length;
        int i2 = 0;
        if (this.f32783wireman) {
            double d4 = dArr[0];
            if (d <= d4) {
                d2 = this.f32782saneness[0][i];
                d3 = d - d4;
                dBeachfront = beachfront(d4, i);
            } else {
                int i3 = length - 1;
                double d5 = dArr[i3];
                if (d >= d5) {
                    d2 = this.f32782saneness[i3][i];
                    d3 = d - d5;
                    dBeachfront = beachfront(d5, i);
                }
            }
            return d2 + (d3 * dBeachfront);
        }
        if (d <= dArr[0]) {
            return this.f32782saneness[0][i];
        }
        int i4 = length - 1;
        if (d >= dArr[i4]) {
            return this.f32782saneness[i4][i];
        }
        while (i2 < length - 1) {
            double[] dArr2 = this.f32779attabal;
            double d6 = dArr2[i2];
            if (d == d6) {
                return this.f32782saneness[i2][i];
            }
            int i5 = i2 + 1;
            double d7 = dArr2[i5];
            if (d < d7) {
                double d8 = (d - d6) / (d7 - d6);
                double[][] dArr3 = this.f32782saneness;
                return (dArr3[i2][i] * (1.0d - d8)) + (dArr3[i5][i] * d8);
            }
            i2 = i5;
        }
        return 0.0d;
    }

    @Override // lerp.saneness
    public double[] impromptu() {
        return this.f32779attabal;
    }

    @Override // lerp.saneness
    public void marial(double d, float[] fArr) {
        double[] dArr = this.f32779attabal;
        int length = dArr.length;
        int i = 0;
        int length2 = this.f32782saneness[0].length;
        if (this.f32783wireman) {
            double d2 = dArr[0];
            if (d <= d2) {
                competently(d2, this.f32781marial);
                for (int i2 = 0; i2 < length2; i2++) {
                    fArr[i2] = (float) (this.f32782saneness[0][i2] + ((d - this.f32779attabal[0]) * this.f32781marial[i2]));
                }
                return;
            }
            int i3 = length - 1;
            double d3 = dArr[i3];
            if (d >= d3) {
                competently(d3, this.f32781marial);
                while (i < length2) {
                    fArr[i] = (float) (this.f32782saneness[i3][i] + ((d - this.f32779attabal[i3]) * this.f32781marial[i]));
                    i++;
                }
                return;
            }
        } else {
            if (d <= dArr[0]) {
                for (int i4 = 0; i4 < length2; i4++) {
                    fArr[i4] = (float) this.f32782saneness[0][i4];
                }
                return;
            }
            int i5 = length - 1;
            if (d >= dArr[i5]) {
                while (i < length2) {
                    fArr[i] = (float) this.f32782saneness[i5][i];
                    i++;
                }
                return;
            }
        }
        int i6 = 0;
        while (i6 < length - 1) {
            if (d == this.f32779attabal[i6]) {
                for (int i7 = 0; i7 < length2; i7++) {
                    fArr[i7] = (float) this.f32782saneness[i6][i7];
                }
            }
            double[] dArr2 = this.f32779attabal;
            int i8 = i6 + 1;
            double d4 = dArr2[i8];
            if (d < d4) {
                double d5 = dArr2[i6];
                double d6 = (d - d5) / (d4 - d5);
                while (i < length2) {
                    double[][] dArr3 = this.f32782saneness;
                    fArr[i] = (float) ((dArr3[i6][i] * (1.0d - d6)) + (dArr3[i8][i] * d6));
                    i++;
                }
                return;
            }
            i6 = i8;
        }
    }

    @Override // lerp.saneness
    public void wireman(double d, double[] dArr) {
        double[] dArr2 = this.f32779attabal;
        int length = dArr2.length;
        int i = 0;
        int length2 = this.f32782saneness[0].length;
        if (this.f32783wireman) {
            double d2 = dArr2[0];
            if (d <= d2) {
                competently(d2, this.f32781marial);
                for (int i2 = 0; i2 < length2; i2++) {
                    dArr[i2] = this.f32782saneness[0][i2] + ((d - this.f32779attabal[0]) * this.f32781marial[i2]);
                }
                return;
            }
            int i3 = length - 1;
            double d3 = dArr2[i3];
            if (d >= d3) {
                competently(d3, this.f32781marial);
                while (i < length2) {
                    dArr[i] = this.f32782saneness[i3][i] + ((d - this.f32779attabal[i3]) * this.f32781marial[i]);
                    i++;
                }
                return;
            }
        } else {
            if (d <= dArr2[0]) {
                for (int i4 = 0; i4 < length2; i4++) {
                    dArr[i4] = this.f32782saneness[0][i4];
                }
                return;
            }
            int i5 = length - 1;
            if (d >= dArr2[i5]) {
                while (i < length2) {
                    dArr[i] = this.f32782saneness[i5][i];
                    i++;
                }
                return;
            }
        }
        int i6 = 0;
        while (i6 < length - 1) {
            if (d == this.f32779attabal[i6]) {
                for (int i7 = 0; i7 < length2; i7++) {
                    dArr[i7] = this.f32782saneness[i6][i7];
                }
            }
            double[] dArr3 = this.f32779attabal;
            int i8 = i6 + 1;
            double d4 = dArr3[i8];
            if (d < d4) {
                double d5 = dArr3[i6];
                double d6 = (d - d5) / (d4 - d5);
                while (i < length2) {
                    double[][] dArr4 = this.f32782saneness;
                    dArr[i] = (dArr4[i6][i] * (1.0d - d6)) + (dArr4[i8][i] * d6);
                    i++;
                }
                return;
            }
            i6 = i8;
        }
    }
}
