package com.facebook.ads.redexgen.core;

import android.view.View;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.lA, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1898lA extends AbstractC04765m {
    public C1898lA(AnonymousClass62 anonymousClass62) {
        super(anonymousClass62, null);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC04765m
    public final int A06() {
        return this.A02.A0h();
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC04765m
    public final int A07() {
        return this.A02.A0h() - this.A02.A0f();
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC04765m
    public final int A08() {
        return this.A02.A0f();
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC04765m
    public final int A09() {
        return this.A02.A0i();
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC04765m
    public final int A0A() {
        return this.A02.A0e();
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC04765m
    public final int A0B() {
        return (this.A02.A0h() - this.A02.A0e()) - this.A02.A0f();
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC04765m
    public final int A0C(View view) {
        return this.A02.A0n(view) + ((AnonymousClass63) view.getLayoutParams()).rightMargin;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC04765m
    public final int A0D(View view) {
        AnonymousClass63 anonymousClass63 = (AnonymousClass63) view.getLayoutParams();
        return this.A02.A0m(view) + anonymousClass63.leftMargin + anonymousClass63.rightMargin;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC04765m
    public final int A0E(View view) {
        AnonymousClass63 anonymousClass63 = (AnonymousClass63) view.getLayoutParams();
        return this.A02.A0l(view) + anonymousClass63.topMargin + anonymousClass63.bottomMargin;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC04765m
    public final int A0F(View view) {
        return this.A02.A0k(view) - ((AnonymousClass63) view.getLayoutParams()).leftMargin;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC04765m
    public final int A0G(View view) {
        this.A02.A1E(view, true, this.A01);
        return this.A01.right;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC04765m
    public final int A0H(View view) {
        this.A02.A1E(view, true, this.A01);
        return this.A01.left;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC04765m
    public final void A0J(int i) {
        this.A02.A0z(i);
    }
}
