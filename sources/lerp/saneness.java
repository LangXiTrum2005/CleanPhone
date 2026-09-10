package lerp;

/* JADX INFO: compiled from: CurveFit.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class saneness {

    /* JADX INFO: compiled from: CurveFit.java */
    public static class attabal extends saneness {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public double f32852attabal;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public double[] f32853saneness;

        public attabal(double d, double[] dArr) {
            this.f32852attabal = d;
            this.f32853saneness = dArr;
        }

        @Override // lerp.saneness
        public double beachfront(double d, int i) {
            return 0.0d;
        }

        @Override // lerp.saneness
        public void competently(double d, double[] dArr) {
            for (int i = 0; i < this.f32853saneness.length; i++) {
                dArr[i] = 0.0d;
            }
        }

        @Override // lerp.saneness
        public double dern(double d, int i) {
            return this.f32853saneness[i];
        }

        @Override // lerp.saneness
        public double[] impromptu() {
            return new double[]{this.f32852attabal};
        }

        @Override // lerp.saneness
        public void marial(double d, float[] fArr) {
            int i = 0;
            while (true) {
                double[] dArr = this.f32853saneness;
                if (i >= dArr.length) {
                    return;
                }
                fArr[i] = (float) dArr[i];
                i++;
            }
        }

        @Override // lerp.saneness
        public void wireman(double d, double[] dArr) {
            double[] dArr2 = this.f32853saneness;
            System.arraycopy(dArr2, 0, dArr, 0, dArr2.length);
        }
    }

    public static saneness attabal(int i, double[] dArr, double[][] dArr2) {
        if (dArr.length == 1) {
            i = 2;
        }
        if (i != 0) {
            return i != 2 ? new beachfront(dArr, dArr2) : new attabal(dArr[0], dArr2[0]);
        }
        return new competently(dArr, dArr2);
    }

    public static saneness saneness(int[] iArr, double[] dArr, double[][] dArr2) {
        return new lerp.attabal(iArr, dArr, dArr2);
    }

    public abstract double beachfront(double d, int i);

    public abstract void competently(double d, double[] dArr);

    public abstract double dern(double d, int i);

    public abstract double[] impromptu();

    public abstract void marial(double d, float[] fArr);

    public abstract void wireman(double d, double[] dArr);
}
