package sg.bigo.ads.api.core;

/* JADX INFO: loaded from: classes7.dex */
public final class u {
    public int d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f47069a = "";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f47070b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f47071c = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f47072e = 0;
    public long f = 0;
    public String g = "";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f47073h = false;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f47074i = "";
    private long k = 0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private long f47075l = 0;
    private long m = 0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private long f47076n = 0;
    public boolean j = false;

    public u(int i2) {
        this.d = i2;
    }

    public final void a(int i2) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (i2 == 1) {
            if (this.k <= 0) {
                this.k = jCurrentTimeMillis;
            }
        } else if (i2 == 2) {
            if (this.f47075l <= 0) {
                this.f47075l = jCurrentTimeMillis;
            }
        } else {
            if (i2 != 3) {
                return;
            }
            if (this.m <= 0) {
                this.m = jCurrentTimeMillis;
            }
            if (this.f47076n <= 0) {
                this.f47076n = jCurrentTimeMillis;
            }
        }
    }

    public final void b(int i2) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (i2 == 1) {
            if (this.f47070b <= 0) {
                long j = this.k;
                if (j > 0) {
                    this.f47070b = jCurrentTimeMillis - j;
                    return;
                }
                return;
            }
            return;
        }
        if (i2 == 2) {
            this.j = true;
            if (this.f47071c <= 0) {
                long j2 = this.f47075l;
                if (j2 > 0) {
                    this.f47071c = jCurrentTimeMillis - j2;
                    return;
                }
                return;
            }
            return;
        }
        if (i2 == 3) {
            if (this.f47072e <= 0) {
                long j3 = this.m;
                if (j3 > 0) {
                    this.f47072e = jCurrentTimeMillis - j3;
                    return;
                }
                return;
            }
            return;
        }
        if (i2 == 4 && this.f <= 0) {
            long j4 = this.f47076n;
            if (j4 > 0) {
                this.f = jCurrentTimeMillis - j4;
            }
        }
    }

    public final void a(String str, String str2, boolean z2) {
        this.g = str;
        this.f47074i = str2;
        this.f47073h = z2;
    }
}
