package com.facebook.ads.redexgen.core;

import android.os.Handler;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.n5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C2494n5 implements InterfaceC1082Az {
    public final /* synthetic */ AnonymousClass10 A00;

    public C2494n5(AnonymousClass10 anonymousClass10, B0 b0) {
        this.A00 = anonymousClass10;
        b0.AJa(this, new Handler());
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1082Az
    public final void ADz(B0 b0, long j, long j2) {
        if (this != this.A00.A00) {
            return;
        }
        this.A00.A27();
    }
}
