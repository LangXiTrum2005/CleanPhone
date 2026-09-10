package com.facebook.ads.redexgen.core;

import android.graphics.drawable.Drawable;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.iA, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C2387iA implements InterfaceC1603Ot {
    public Drawable A00;
    public final /* synthetic */ C1602Os A01;

    public C2387iA(C1602Os c1602Os) {
        this.A01 = c1602Os;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1603Ot
    public final Drawable A7E() {
        return this.A00;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1603Ot
    public final C1602Os A7F() {
        return this.A01;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1603Ot
    public final boolean A8q() {
        return this.A01.getPreventCornerOverlap();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1603Ot
    public final boolean A9R() {
        return this.A01.getUseCompatPadding();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1603Ot
    public final void AJK(Drawable drawable) {
        this.A00 = drawable;
        this.A01.setBackgroundDrawable(drawable);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1603Ot
    public final void AJl(int i2, int i3, int i4, int i5) {
        this.A01.A05.set(i2, i3, i4, i5);
        super/*android.widget.FrameLayout*/.setPadding(this.A01.A04.left + i2, this.A01.A04.top + i3, this.A01.A04.right + i4, this.A01.A04.bottom + i5);
    }
}
