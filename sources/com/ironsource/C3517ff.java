package com.ironsource;

import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.ff, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3517ff {
    private final String a;
    private final String b;

    public C3517ff(String identifier, String baseConst) {
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        Intrinsics.checkNotNullParameter(baseConst, "baseConst");
        this.a = identifier;
        this.b = baseConst;
    }

    public final String a() {
        return this.a + "_" + this.b;
    }
}
