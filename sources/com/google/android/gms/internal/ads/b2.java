package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class b2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f12596a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f12597b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f12598c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f12599d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f12600e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f12601f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f12602g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f12603h;

    public b2() {
        this.f12596a = -1L;
        this.f12597b = -1L;
        this.f12598c = -1L;
        this.f12599d = -1L;
        this.f12600e = -1L;
        this.f12601f = -1L;
        this.f12602g = -1L;
        this.f12603h = -1L;
    }

    public static long a(long j10, long j11, long j12, long j13, long j14, long j15) {
        if (j13 + 1 >= j14 || j11 + 1 >= j12) {
            return j13;
        }
        long j16 = (long) ((j10 - j11) * ((j14 - j13) / (j12 - j11)));
        return l1.y.k(((j16 + j13) - j15) - (j16 / 20), j13, j14 - 1);
    }

    public static long b(long j10, long j11, long j12, long j13, long j14, long j15) {
        if (j13 + 1 >= j14 || 1 + j11 >= j12) {
            return j13;
        }
        long j16 = (long) (((j14 - j13) / (j12 - j11)) * (j10 - j11));
        String str = uu0.f20901a;
        return Math.max(j13, Math.min(((j13 + j16) - j15) - (j16 / 20), j14 - 1));
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x00ba, code lost:
    
        if (r6.contains("REWARDED") == false) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void c(android.content.Context r6, android.view.View r7) {
        /*
            r5 = this;
            long r0 = r5.f12598c
            r5.f12599d = r0
            long r0 = android.os.SystemClock.uptimeMillis()
            r5.f12598c = r0
            long r0 = r5.f12600e
            r2 = -1
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L14
            r5.f12601f = r0
        L14:
            java.lang.String r0 = "window"
            java.lang.Object r6 = r6.getSystemService(r0)
            android.view.WindowManager r6 = (android.view.WindowManager) r6
            android.view.Display r6 = r6.getDefaultDisplay()
            android.util.DisplayMetrics r0 = new android.util.DisplayMetrics
            r0.<init>()
            r6.getRealMetrics(r0)     // Catch: java.lang.NoSuchMethodError -> L29
            goto L2c
        L29:
            r6.getMetrics(r0)
        L2c:
            int r6 = r0.widthPixels
            int r1 = r0.heightPixels
            int r6 = r6 * r1
            if (r7 != 0) goto L35
            goto Lc1
        L35:
            int r1 = r7.getWidth()
            int r4 = r0.widthPixels
            int r1 = java.lang.Math.min(r1, r4)
            int r4 = r7.getHeight()
            int r0 = r0.heightPixels
            int r0 = java.lang.Math.min(r4, r0)
            int r0 = r0 * r1
            int r1 = r0 + r0
            if (r1 < r6) goto L4f
            goto Lbc
        L4f:
            if (r0 != 0) goto Lc1
            java.lang.Class r6 = r7.getClass()     // Catch: java.lang.Throwable -> Lc1
            java.lang.String r6 = r6.getName()     // Catch: java.lang.Throwable -> Lc1
            java.lang.String r0 = "DebugGestureViewWrapper"
            boolean r6 = r6.contains(r0)     // Catch: java.lang.Throwable -> Lc1
            if (r6 == 0) goto L68
            android.view.ViewGroup r7 = (android.view.ViewGroup) r7     // Catch: java.lang.Throwable -> Lc1
            r6 = 0
            android.view.View r7 = r7.getChildAt(r6)     // Catch: java.lang.Throwable -> Lc1
        L68:
            java.lang.Class r6 = r7.getClass()     // Catch: java.lang.Throwable -> Lc1
            java.lang.String r0 = "getAdConfiguration"
            r1 = 0
            java.lang.reflect.Method r6 = r6.getMethod(r0, r1)     // Catch: java.lang.Throwable -> Lc1
            java.lang.Object r6 = r6.invoke(r7, r1)     // Catch: java.lang.Throwable -> Lc1
            java.lang.Class r7 = r6.getClass()     // Catch: java.lang.Throwable -> Lc1
            java.lang.String r0 = "adType"
            java.lang.reflect.Field r7 = r7.getField(r0)     // Catch: java.lang.Throwable -> Lc1
            java.lang.Object r7 = r7.get(r6)     // Catch: java.lang.Throwable -> Lc1
            java.lang.Integer r7 = (java.lang.Integer) r7     // Catch: java.lang.Throwable -> Lc1
            r7.intValue()     // Catch: java.lang.Throwable -> Lc1
            java.lang.Class r6 = r6.getClass()     // Catch: java.lang.Throwable -> Lc1
            java.lang.String r0 = "adTypeToString"
            java.lang.Class r4 = java.lang.Integer.TYPE     // Catch: java.lang.Throwable -> Lc1
            java.lang.Class[] r4 = new java.lang.Class[]{r4}     // Catch: java.lang.Throwable -> Lc1
            java.lang.reflect.Method r6 = r6.getMethod(r0, r4)     // Catch: java.lang.Throwable -> Lc1
            java.lang.Object[] r7 = new java.lang.Object[]{r7}     // Catch: java.lang.Throwable -> Lc1
            java.lang.Object r6 = r6.invoke(r1, r7)     // Catch: java.lang.Throwable -> Lc1
            java.lang.String r6 = (java.lang.String) r6     // Catch: java.lang.Throwable -> Lc1
            java.lang.String r7 = "INTERSTITIAL"
            boolean r7 = r6.contains(r7)     // Catch: java.lang.Throwable -> Lc1
            if (r7 != 0) goto Lbc
            java.lang.String r7 = "APP_OPEN"
            boolean r7 = r6.contains(r7)     // Catch: java.lang.Throwable -> Lc1
            if (r7 != 0) goto Lbc
            java.lang.String r7 = "REWARDED"
            boolean r6 = r6.contains(r7)     // Catch: java.lang.Throwable -> Lc1
            if (r6 == 0) goto Lc1
        Lbc:
            long r6 = r5.f12598c
            r5.f12600e = r6
            return
        Lc1:
            r5.f12600e = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.b2.c(android.content.Context, android.view.View):void");
    }

    public b2(long j10, long j11, long j12, long j13, long j14, long j15, int i10) {
        switch (i10) {
            case 2:
                this.f12596a = j10;
                this.f12597b = j11;
                this.f12599d = 0L;
                this.f12600e = j12;
                this.f12601f = j13;
                this.f12602g = j14;
                this.f12598c = j15;
                this.f12603h = a(j11, 0L, j12, j13, j14, j15);
                break;
            default:
                this.f12596a = j10;
                this.f12597b = j11;
                this.f12599d = 0L;
                this.f12600e = j12;
                this.f12601f = j13;
                this.f12602g = j14;
                this.f12598c = j15;
                this.f12603h = b(j11, 0L, j12, j13, j14, j15);
                break;
        }
    }
}
