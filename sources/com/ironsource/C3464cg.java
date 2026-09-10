package com.ironsource;

import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.cg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3464cg {
    private final InterfaceC3667o4 a;

    public C3464cg(InterfaceC3667o4 currentTimeProvider) {
        Intrinsics.checkNotNullParameter(currentTimeProvider, "currentTimeProvider");
        this.a = currentTimeProvider;
    }

    public final boolean a(long j, long j2) {
        long jA = this.a.a();
        return j2 <= 0 || j <= 0 || jA < j || jA - j > j2;
    }
}
