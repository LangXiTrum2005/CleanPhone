package com.google.android.exoplayer2.video;

import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
final class FixedFrameRateEstimator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Matcher f18993a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Matcher f18994b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f18995c;
    public long d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f18996e;

    public static final class Matcher {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public long f18997a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public long f18998b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public long f18999c;
        public long d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public long f19000e;
        public long f;
        public final boolean[] g = new boolean[15];

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f19001h;

        public final boolean a() {
            return this.d > 15 && this.f19001h == 0;
        }

        public final void b(long j) {
            long j2 = this.d;
            if (j2 == 0) {
                this.f18997a = j;
            } else if (j2 == 1) {
                long j3 = j - this.f18997a;
                this.f18998b = j3;
                this.f = j3;
                this.f19000e = 1L;
            } else {
                long j4 = j - this.f18999c;
                int i2 = (int) (j2 % 15);
                long jAbs = Math.abs(j4 - this.f18998b);
                boolean[] zArr = this.g;
                if (jAbs <= 1000000) {
                    this.f19000e++;
                    this.f += j4;
                    if (zArr[i2]) {
                        zArr[i2] = false;
                        this.f19001h--;
                    }
                } else if (!zArr[i2]) {
                    zArr[i2] = true;
                    this.f19001h++;
                }
            }
            this.d++;
            this.f18999c = j;
        }

        public final void c() {
            this.d = 0L;
            this.f19000e = 0L;
            this.f = 0L;
            this.f19001h = 0;
            Arrays.fill(this.g, false);
        }
    }
}
