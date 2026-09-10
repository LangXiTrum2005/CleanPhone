package com.p004ironsource;

/* JADX INFO: loaded from: classes5.dex */
public class ew {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected long f24945a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected long f24946b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected long f24947c;

    public long a() {
        return Math.max(0L, this.f24945a - System.currentTimeMillis());
    }

    public void b() {
        this.f24945a = 0L;
        this.f24946b = 0L;
        this.f24947c = 0L;
    }

    public void c(long j) {
        this.f24946b = j;
        this.f24947c = 0L;
    }

    public void a(long j) {
        this.f24945a = System.currentTimeMillis() + j;
    }

    public void b(long j) {
        this.f24947c = j;
        this.f24945a = (j - this.f24946b) + this.f24945a;
    }
}
