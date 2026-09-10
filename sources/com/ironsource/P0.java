package com.ironsource;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class P0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f26808e = -1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f26809a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f26810b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f26811c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f26812d;

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public enum a {
        MANUAL,
        MANUAL_WITH_AUTOMATIC_RELOAD,
        AUTOMATIC_LOAD_AFTER_CLOSE,
        AUTOMATIC_LOAD_WHILE_SHOW
    }

    public P0(a aVar, long j10, long j11, long j12) {
        this.f26809a = aVar;
        this.f26810b = j10;
        this.f26811c = j11;
        this.f26812d = j12;
    }

    public a a() {
        return this.f26809a;
    }

    public long b() {
        return this.f26812d;
    }

    public long c() {
        return this.f26811c;
    }

    public long d() {
        return this.f26810b;
    }

    public boolean e() {
        a aVar = this.f26809a;
        return aVar == a.AUTOMATIC_LOAD_AFTER_CLOSE || aVar == a.AUTOMATIC_LOAD_WHILE_SHOW;
    }

    public boolean f() {
        a aVar = this.f26809a;
        return aVar == a.MANUAL || aVar == a.MANUAL_WITH_AUTOMATIC_RELOAD;
    }
}
