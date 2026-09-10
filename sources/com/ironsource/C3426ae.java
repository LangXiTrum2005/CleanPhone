package com.ironsource;

import p002kotlin.jvm.internal.DefaultConstructorMarker;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.ae, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C3426ae {
    private final C3587je a;
    private final Fe b;
    private final C3439b9 c;

    public C3426ae(C3587je sdkInitResponse, Fe fe, C3439b9 c3439b9) {
        Intrinsics.checkNotNullParameter(sdkInitResponse, "sdkInitResponse");
        this.a = sdkInitResponse;
        this.b = fe;
        this.c = c3439b9;
    }

    public final M1 a() {
        return this.a.a().b().d();
    }

    public final F1 b() {
        return this.a.a().b().b();
    }

    public final K5 c() {
        return this.a.b();
    }

    public final Ie d() {
        return this.a.c();
    }

    public final Cb e() {
        return this.a.a().b().f();
    }

    public final C3439b9 f() {
        return this.c;
    }

    public final Ie.a g() {
        Ie.a aVarI = this.a.c().i();
        Intrinsics.checkNotNullExpressionValue(aVarI, "sdkInitResponse.fullResponse.origin");
        return aVarI;
    }

    public final C3587je h() {
        return this.a;
    }

    public final Fe i() {
        return this.b;
    }

    public /* synthetic */ C3426ae(C3587je c3587je, Fe fe, C3439b9 c3439b9, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(c3587je, (i & 2) != 0 ? null : fe, (i & 4) != 0 ? null : c3439b9);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C3426ae(C3426ae sdkConfig) {
        this(sdkConfig.a, sdkConfig.b, sdkConfig.c);
        Intrinsics.checkNotNullParameter(sdkConfig, "sdkConfig");
    }
}
