package com.facebook.ads.redexgen.core;

import android.os.Handler;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.n5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C2663n5 implements InterfaceC1251Az {
    public final /* synthetic */ AnonymousClass10 A00;

    public C2663n5(AnonymousClass10 anonymousClass10, B0 b1) {
        this.A00 = anonymousClass10;
        b1.AJa(this, new Handler());
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1251Az
    public final void ADz(B0 b1, long j, long j2) {
        if (this != this.A00.A00) {
            return;
        }
        this.A00.A27();
    }
}
