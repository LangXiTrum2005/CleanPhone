package com.smartdigimkt.y3;

import android.media.AudioTimestamp;
import android.media.AudioTrack;
import com.smartdigimkt.p4.f0;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: loaded from: classes6.dex */
final class i {
    private static final int g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final int f40064h = 1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final int f40065i = 2;
    private static final int j = 3;
    private static final int k = 4;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final int f40066l = 5000;
    private static final int m = 10000000;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final int f40067n = 500000;
    private static final int o = 500000;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f40068a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f40069b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f40070c;
    private long d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f40071e;
    private long f;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final AudioTrack f40072a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final AudioTimestamp f40073b = new AudioTimestamp();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private long f40074c;
        private long d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private long f40075e;

        public a(AudioTrack audioTrack) {
            this.f40072a = audioTrack;
        }

        public long a() {
            return this.f40075e;
        }

        public long b() {
            return this.f40073b.nanoTime / 1000;
        }

        public boolean c() {
            boolean timestamp = this.f40072a.getTimestamp(this.f40073b);
            if (timestamp) {
                long j = this.f40073b.framePosition;
                if (this.d > j) {
                    this.f40074c++;
                }
                this.d = j;
                this.f40075e = j + (this.f40074c << 32);
            }
            return timestamp;
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface b {
    }

    public i(AudioTrack audioTrack) {
        if (f0.f37540a >= 19) {
            this.f40068a = new a(audioTrack);
            g();
        } else {
            this.f40068a = null;
            a(3);
        }
    }

    public boolean a(long j2) {
        a aVar = this.f40068a;
        if (aVar == null || j2 - this.f40071e < this.d) {
            return false;
        }
        this.f40071e = j2;
        boolean zC = aVar.c();
        int i2 = this.f40069b;
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        if (i2 != 4) {
                            throw new IllegalStateException();
                        }
                    } else if (zC) {
                        g();
                        return zC;
                    }
                } else if (!zC) {
                    g();
                    return zC;
                }
            } else {
                if (!zC) {
                    g();
                    return zC;
                }
                if (this.f40068a.a() > this.f) {
                    a(2);
                    return zC;
                }
            }
        } else {
            if (zC) {
                if (this.f40068a.b() < this.f40070c) {
                    return false;
                }
                this.f = this.f40068a.a();
                a(1);
                return zC;
            }
            if (j2 - this.f40070c > 500000) {
                a(3);
            }
        }
        return zC;
    }

    public long b() {
        a aVar = this.f40068a;
        if (aVar != null) {
            return aVar.a();
        }
        return -1L;
    }

    public long c() {
        a aVar = this.f40068a;
        if (aVar != null) {
            return aVar.b();
        }
        return -9223372036854775807L;
    }

    public boolean d() {
        int i2 = this.f40069b;
        return i2 == 1 || i2 == 2;
    }

    public boolean e() {
        return this.f40069b == 2;
    }

    public void f() {
        a(4);
    }

    public void g() {
        if (this.f40068a != null) {
            a(0);
        }
    }

    public void a() {
        if (this.f40069b == 4) {
            g();
        }
    }

    private void a(int i2) {
        this.f40069b = i2;
        if (i2 == 0) {
            this.f40071e = 0L;
            this.f = -1L;
            this.f40070c = System.nanoTime() / 1000;
            this.d = 5000L;
            return;
        }
        if (i2 == 1) {
            this.d = 5000L;
            return;
        }
        if (i2 == 2 || i2 == 3) {
            this.d = 10000000L;
        } else {
            if (i2 == 4) {
                this.d = 500000L;
                return;
            }
            throw new IllegalStateException();
        }
    }
}
