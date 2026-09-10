package com.facebook.ads.redexgen.core;

import android.view.View;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.l2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1890l2 implements C6N {
    public final /* synthetic */ AnonymousClass62 A00;

    public C1890l2(AnonymousClass62 anonymousClass62) {
        this.A00 = anonymousClass62;
    }

    @Override // com.facebook.ads.redexgen.core.C6N
    public final View A77(int i) {
        return this.A00.A0t(i);
    }

    @Override // com.facebook.ads.redexgen.core.C6N
    public final int A79(View view) {
        return this.A00.A0j(view) + ((AnonymousClass63) view.getLayoutParams()).bottomMargin;
    }

    @Override // com.facebook.ads.redexgen.core.C6N
    public final int A7A(View view) {
        return this.A00.A0o(view) - ((AnonymousClass63) view.getLayoutParams()).topMargin;
    }

    @Override // com.facebook.ads.redexgen.core.C6N
    public final int A8W() {
        return this.A00.A0X() - this.A00.A0d();
    }

    @Override // com.facebook.ads.redexgen.core.C6N
    public final int A8X() {
        return this.A00.A0g();
    }
}
