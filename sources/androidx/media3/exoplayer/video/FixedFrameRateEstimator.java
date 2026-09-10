package androidx.media3.exoplayer.video;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
final class FixedFrameRateEstimator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Matcher f6624a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Matcher f6625b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f6626c;
    public long d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f6627e;

    public static final class Matcher {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public long f6628a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public long f6629b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public long f6630c;
        public long d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public long f6631e;
        public long f;
        public final boolean[] g = new boolean[15];

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f6632h;

        public final boolean a() {
            return this.d > 15 && this.f6632h == 0;
        }

        public final void b(long j) {
            long j2 = this.d;
            if (j2 == 0) {
                this.f6628a = j;
            } else if (j2 == 1) {
                long j3 = j - this.f6628a;
                this.f6629b = j3;
                this.f = j3;
                this.f6631e = 1L;
            } else {
                long j4 = j - this.f6630c;
                int i2 = (int) (j2 % 15);
                long jAbs = Math.abs(j4 - this.f6629b);
                boolean[] zArr = this.g;
                if (jAbs <= 1000000) {
                    this.f6631e++;
                    this.f += j4;
                    if (zArr[i2]) {
                        zArr[i2] = false;
                        this.f6632h--;
                    }
                } else if (!zArr[i2]) {
                    zArr[i2] = true;
                    this.f6632h++;
                }
            }
            this.d++;
            this.f6630c = j;
        }

        public final void c() {
            this.d = 0L;
            this.f6631e = 0L;
            this.f = 0L;
            this.f6632h = 0;
            Arrays.fill(this.g, false);
        }
    }
}
