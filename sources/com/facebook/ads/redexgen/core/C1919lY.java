package com.facebook.ads.redexgen.core;

import android.graphics.drawable.Drawable;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.lY, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1919lY implements InterfaceC04343t {
    public Drawable A00;
    public final /* synthetic */ AbstractC04333s A01;

    public C1919lY(AbstractC04333s abstractC04333s) {
        this.A01 = abstractC04333s;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC04343t
    public final Drawable A74() {
        return this.A00;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC04343t
    public final AbstractC04333s A75() {
        return this.A01;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC04343t
    public final boolean A8g() {
        return this.A01.getPreventCornerOverlap();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC04343t
    public final boolean A9H() {
        return this.A01.getUseCompatPadding();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC04343t
    public final void AIQ(Drawable drawable) {
        this.A00 = drawable;
        this.A01.setBackgroundDrawable(drawable);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC04343t
    public final void AIr(int i, int i2, int i3, int i4) {
        this.A01.A05.set(i, i2, i3, i4);
        super/*android.widget.FrameLayout*/.setPadding(this.A01.A04.left + i, this.A01.A04.top + i2, this.A01.A04.right + i3, this.A01.A04.bottom + i4);
    }
}
