package com.ironsource;

import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.be, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3444be implements G8, G8.a {
    private C3426ae a;
    private boolean b;

    @Override // com.ironsource.G8
    public Sa a() {
        C3426ae c3426ae = this.a;
        if (c3426ae != null) {
            return new Sa(c3426ae);
        }
        return null;
    }

    @Override // com.ironsource.G8
    public J9 b() {
        C3426ae c3426ae = this.a;
        if (c3426ae != null) {
            return new J9(c3426ae);
        }
        return null;
    }

    @Override // com.ironsource.G8
    public boolean c() {
        return this.b;
    }

    @Override // com.ironsource.G8.a
    public void d() {
        this.b = true;
    }

    @Override // com.ironsource.G8.a
    public void a(C3426ae sdkConfig) {
        Intrinsics.checkNotNullParameter(sdkConfig, "sdkConfig");
        this.a = sdkConfig;
    }
}
