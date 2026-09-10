package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Op, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C0940Op implements InterfaceC1724iJ {
    public final /* synthetic */ AbstractC0943Os A00;

    public C0940Op(final AbstractC0943Os val$separatorMatcher) {
        this.A00 = val$separatorMatcher;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r0v0, types: [com.facebook.ads.redexgen.X.4a] */
    @Override // com.facebook.ads.redexgen.core.InterfaceC1724iJ
    /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final C04414a AAa(final C1725iK splitter, final CharSequence toSplit) {
        return new Oo(splitter, toSplit) { // from class: com.facebook.ads.redexgen.X.4a
            @Override // com.facebook.ads.redexgen.core.Oo
            public final int A04(int separatorPosition) {
                return separatorPosition + 1;
            }

            @Override // com.facebook.ads.redexgen.core.Oo
            public final int A05(int start) {
                return this.A00.A00.A08(this.A03, start);
            }
        };
    }
}
