package com.ironsource;

/* JADX INFO: renamed from: com.ironsource.ne, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class C0484ne {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C0645we f29848a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Se f29849b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final C0300d9 f29850c;

    public C0484ne(C0645we sdkInitResponse, Se se2, C0300d9 c0300d9) {
        kotlin.jvm.internal.n.f(sdkInitResponse, "sdkInitResponse");
        this.f29848a = sdkInitResponse;
        this.f29849b = se2;
        this.f29850c = c0300d9;
    }

    public final M1 a() {
        return this.f29848a.a().b().d();
    }

    public final F1 b() {
        return this.f29848a.a().b().b();
    }

    public final N5 c() {
        return this.f29848a.b();
    }

    public final Ve d() {
        return this.f29848a.c();
    }

    public final Gb e() {
        return this.f29848a.a().b().f();
    }

    public final C0300d9 f() {
        return this.f29850c;
    }

    public final Ve.a g() {
        Ve.a aVarI = this.f29848a.c().i();
        kotlin.jvm.internal.n.e(aVarI, "sdkInitResponse.fullResponse.origin");
        return aVarI;
    }

    public final C0645we h() {
        return this.f29848a;
    }

    public final Se i() {
        return this.f29849b;
    }

    public /* synthetic */ C0484ne(C0645we c0645we, Se se2, C0300d9 c0300d9, int i10, kotlin.jvm.internal.g gVar) {
        this(c0645we, (i10 & 2) != 0 ? null : se2, (i10 & 4) != 0 ? null : c0300d9);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C0484ne(C0484ne sdkConfig) {
        this(sdkConfig.f29848a, sdkConfig.f29849b, sdkConfig.f29850c);
        kotlin.jvm.internal.n.f(sdkConfig, "sdkConfig");
    }
}
