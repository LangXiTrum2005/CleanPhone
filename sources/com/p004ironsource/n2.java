package com.p004ironsource;

/* JADX INFO: loaded from: classes5.dex */
public class n2 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f26225e = -1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f26226a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f26227b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f26228c;
    private final long d;

    public enum a {
        MANUAL,
        MANUAL_WITH_AUTOMATIC_RELOAD,
        AUTOMATIC_LOAD_AFTER_CLOSE,
        AUTOMATIC_LOAD_WHILE_SHOW
    }

    public n2(a aVar, long j, long j2, long j3) {
        this.f26226a = aVar;
        this.f26227b = j;
        this.f26228c = j2;
        this.d = j3;
    }

    public a a() {
        return this.f26226a;
    }

    public long b() {
        return this.d;
    }

    public long c() {
        return this.f26228c;
    }

    public long d() {
        return this.f26227b;
    }

    public boolean e() {
        a aVar = this.f26226a;
        return aVar == a.AUTOMATIC_LOAD_AFTER_CLOSE || aVar == a.AUTOMATIC_LOAD_WHILE_SHOW;
    }

    public boolean f() {
        a aVar = this.f26226a;
        return aVar == a.MANUAL || aVar == a.MANUAL_WITH_AUTOMATIC_RELOAD;
    }
}
