package com.ironsource;

/* JADX INFO: renamed from: com.ironsource.kg, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class C0432kg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected long f29070a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected long f29071b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected long f29072c;

    public long a() {
        return Math.max(0L, this.f29070a - System.currentTimeMillis());
    }

    public void b(long j10) {
        this.f29072c = j10;
        this.f29070a = (j10 - this.f29071b) + this.f29070a;
    }

    public void c(long j10) {
        this.f29071b = j10;
        this.f29072c = 0L;
    }

    public void a(long j10) {
        this.f29070a = System.currentTimeMillis() + j10;
    }

    public void b() {
        this.f29070a = 0L;
        this.f29071b = 0L;
        this.f29072c = 0L;
    }
}
