package com.facebook.ads.redexgen.core;

import android.view.View;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.l9, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1897l9 extends AbstractC04765m {
    public C1897l9(AnonymousClass62 anonymousClass62) {
        super(anonymousClass62, null);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC04765m
    public final int A06() {
        return this.A02.A0X();
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC04765m
    public final int A07() {
        return this.A02.A0X() - this.A02.A0d();
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC04765m
    public final int A08() {
        return this.A02.A0d();
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC04765m
    public final int A09() {
        return this.A02.A0Y();
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC04765m
    public final int A0A() {
        return this.A02.A0g();
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC04765m
    public final int A0B() {
        return (this.A02.A0X() - this.A02.A0g()) - this.A02.A0d();
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC04765m
    public final int A0C(View view) {
        return this.A02.A0j(view) + ((AnonymousClass63) view.getLayoutParams()).bottomMargin;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC04765m
    public final int A0D(View view) {
        AnonymousClass63 anonymousClass63 = (AnonymousClass63) view.getLayoutParams();
        return this.A02.A0l(view) + anonymousClass63.topMargin + anonymousClass63.bottomMargin;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC04765m
    public final int A0E(View view) {
        AnonymousClass63 anonymousClass63 = (AnonymousClass63) view.getLayoutParams();
        return this.A02.A0m(view) + anonymousClass63.leftMargin + anonymousClass63.rightMargin;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC04765m
    public final int A0F(View view) {
        return this.A02.A0o(view) - ((AnonymousClass63) view.getLayoutParams()).topMargin;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC04765m
    public final int A0G(View view) {
        this.A02.A1E(view, true, this.A01);
        return this.A01.bottom;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC04765m
    public final int A0H(View view) {
        this.A02.A1E(view, true, this.A01);
        return this.A01.top;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC04765m
    public final void A0J(int i) {
        this.A02.A10(i);
    }
}
