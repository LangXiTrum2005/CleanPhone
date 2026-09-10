package com.p004ironsource;

/* JADX INFO: loaded from: classes5.dex */
public class m2 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f25664e = -1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f25665a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f25666b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f25667c;
    private final long d;

    public enum a {
        MANUAL,
        MANUAL_WITH_AUTOMATIC_RELOAD,
        MANUAL_WITH_LOAD_ON_SHOW,
        AUTOMATIC_LOAD_AFTER_CLOSE,
        AUTOMATIC_LOAD_WHILE_SHOW
    }

    public m2(a aVar, long j, long j2, long j3) {
        this.f25665a = aVar;
        this.f25666b = j;
        this.f25667c = j2;
        this.d = j3;
    }

    public a a() {
        return this.f25665a;
    }

    public long b() {
        return this.d;
    }

    public long c() {
        return this.f25667c;
    }

    public long d() {
        return this.f25666b;
    }

    public boolean e() {
        a aVar = this.f25665a;
        return aVar == a.AUTOMATIC_LOAD_AFTER_CLOSE || aVar == a.AUTOMATIC_LOAD_WHILE_SHOW;
    }

    public boolean f() {
        a aVar = this.f25665a;
        return aVar == a.MANUAL || aVar == a.MANUAL_WITH_AUTOMATIC_RELOAD || aVar == a.MANUAL_WITH_LOAD_ON_SHOW;
    }
}
