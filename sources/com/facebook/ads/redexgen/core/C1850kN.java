package com.facebook.ads.redexgen.core;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.kN, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1850kN implements AnonymousClass74 {
    public final /* synthetic */ ImageView A00;
    public final /* synthetic */ AnonymousClass76 A01;
    public final /* synthetic */ C1744ie A02;

    public C1850kN(AnonymousClass76 anonymousClass76, ImageView imageView, C1744ie c1744ie) {
        this.A01 = anonymousClass76;
        this.A00 = imageView;
        this.A02 = c1744ie;
    }

    @Override // com.facebook.ads.redexgen.core.AnonymousClass74
    public final void ADN(Drawable drawable) {
        C1744ie.A0f(drawable, this.A00);
        this.A02.A1K(drawable);
    }
}
