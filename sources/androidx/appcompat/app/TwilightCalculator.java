package androidx.appcompat.app;

/* JADX INFO: loaded from: classes.dex */
class TwilightCalculator {
    public static TwilightCalculator d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f3365a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f3366b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f3367c;

    public final void a(long j, double d2, double d3) {
        float f = (j - 946728000000L) / 8.64E7f;
        float f2 = (0.01720197f * f) + 6.24006f;
        double d4 = f2;
        double dSin = (Math.sin(f2 * 3.0f) * 5.236000106378924E-6d) + (Math.sin(2.0f * f2) * 3.4906598739326E-4d) + (Math.sin(d4) * 0.03341960161924362d) + d4 + 1.796593063d + 3.141592653589793d;
        double d5 = (-d3) / 360.0d;
        double dSin2 = (Math.sin(2.0d * dSin) * (-0.0069d)) + (Math.sin(d4) * 0.0053d) + ((double) (Math.round(((double) (f - 9.0E-4f)) - d5) + 9.0E-4f)) + d5;
        double dAsin = Math.asin(Math.sin(0.4092797040939331d) * Math.sin(dSin));
        double d6 = 0.01745329238474369d * d2;
        double dSin3 = (Math.sin(-0.10471975803375244d) - (Math.sin(dAsin) * Math.sin(d6))) / (Math.cos(dAsin) * Math.cos(d6));
        if (dSin3 >= 1.0d) {
            this.f3367c = 1;
            this.f3365a = -1L;
            this.f3366b = -1L;
        } else {
            if (dSin3 <= -1.0d) {
                this.f3367c = 0;
                this.f3365a = -1L;
                this.f3366b = -1L;
                return;
            }
            double dAcos = (float) (Math.acos(dSin3) / 6.283185307179586d);
            this.f3365a = Math.round((dSin2 + dAcos) * 8.64E7d) + 946728000000L;
            long jRound = Math.round((dSin2 - dAcos) * 8.64E7d) + 946728000000L;
            this.f3366b = jRound;
            if (jRound >= j || this.f3365a <= j) {
                this.f3367c = 1;
            } else {
                this.f3367c = 0;
            }
        }
    }
}
