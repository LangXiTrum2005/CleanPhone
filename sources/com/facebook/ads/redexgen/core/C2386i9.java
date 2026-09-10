package com.facebook.ads.redexgen.core;

import android.content.Context;
import android.content.res.ColorStateList;
import android.view.View;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.i9, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C2386i9 implements InterfaceC1604Ou {
    private C1605Ov A00(InterfaceC1603Ot interfaceC1603Ot) {
        return (C1605Ov) interfaceC1603Ot.A7E();
    }

    public final void A01(InterfaceC1603Ot interfaceC1603Ot) {
        if (!interfaceC1603Ot.A9R()) {
            interfaceC1603Ot.AJl(0, 0, 0, 0);
            return;
        }
        float fA8S = A8S(interfaceC1603Ot);
        float fA8r = A8r(interfaceC1603Ot);
        float elevation = AbstractC1607Ox.A00(fA8S, fA8r, interfaceC1603Ot.A8q());
        int vPadding = (int) Math.ceil(elevation);
        float elevation2 = AbstractC1607Ox.A01(fA8S, fA8r, interfaceC1603Ot.A8q());
        int iCeil = (int) Math.ceil(elevation2);
        interfaceC1603Ot.AJl(vPadding, iCeil, vPadding, iCeil);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1604Ou
    public final ColorStateList A71(InterfaceC1603Ot interfaceC1603Ot) {
        return A00(interfaceC1603Ot).A05();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1604Ou
    public final float A7v(InterfaceC1603Ot interfaceC1603Ot) {
        return interfaceC1603Ot.A7F().getElevation();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1604Ou
    public final float A8S(InterfaceC1603Ot interfaceC1603Ot) {
        return A00(interfaceC1603Ot).A03();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1604Ou
    public final float A8X(InterfaceC1603Ot interfaceC1603Ot) {
        return A8r(interfaceC1603Ot) * 2.0f;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1604Ou
    public final float A8Y(InterfaceC1603Ot interfaceC1603Ot) {
        return A8r(interfaceC1603Ot) * 2.0f;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1604Ou
    public final float A8r(InterfaceC1603Ot interfaceC1603Ot) {
        return A00(interfaceC1603Ot).A04();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1604Ou
    public final void AAE() {
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1604Ou
    public final void AAG(InterfaceC1603Ot interfaceC1603Ot, Context context, ColorStateList colorStateList, float f, float f2, float f3) {
        C1605Ov background = new C1605Ov(colorStateList, f);
        interfaceC1603Ot.AJK(background);
        View view = interfaceC1603Ot.A7F();
        view.setClipToOutline(true);
        view.setElevation(f2);
        AJX(interfaceC1603Ot, f3);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1604Ou
    public final void ADP(InterfaceC1603Ot interfaceC1603Ot) {
        AJX(interfaceC1603Ot, A8S(interfaceC1603Ot));
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1604Ou
    public final void AFT(InterfaceC1603Ot interfaceC1603Ot) {
        AJX(interfaceC1603Ot, A8S(interfaceC1603Ot));
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1604Ou
    public final void AJJ(InterfaceC1603Ot interfaceC1603Ot, ColorStateList colorStateList) {
        A00(interfaceC1603Ot).A08(colorStateList);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1604Ou
    public final void AJP(InterfaceC1603Ot interfaceC1603Ot, float f) {
        interfaceC1603Ot.A7F().setElevation(f);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1604Ou
    public final void AJX(InterfaceC1603Ot interfaceC1603Ot, float f) {
        A00(interfaceC1603Ot).A07(f, interfaceC1603Ot.A9R(), interfaceC1603Ot.A8q());
        A01(interfaceC1603Ot);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1604Ou
    public final void AJj(InterfaceC1603Ot interfaceC1603Ot, float f) {
        A00(interfaceC1603Ot).A06(f);
    }
}
