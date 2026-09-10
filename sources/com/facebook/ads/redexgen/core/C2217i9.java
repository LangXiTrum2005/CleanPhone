package com.facebook.ads.redexgen.core;

import android.content.Context;
import android.content.res.ColorStateList;
import android.view.View;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.i9, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C2217i9 implements InterfaceC1435Ou {
    private C1436Ov A00(InterfaceC1434Ot interfaceC1434Ot) {
        return (C1436Ov) interfaceC1434Ot.A7E();
    }

    public final void A01(InterfaceC1434Ot interfaceC1434Ot) {
        if (!interfaceC1434Ot.A9R()) {
            interfaceC1434Ot.AJl(0, 0, 0, 0);
            return;
        }
        float fA8S = A8S(interfaceC1434Ot);
        float fA8r = A8r(interfaceC1434Ot);
        float elevation = AbstractC1438Ox.A00(fA8S, fA8r, interfaceC1434Ot.A8q());
        int vPadding = (int) Math.ceil(elevation);
        float elevation2 = AbstractC1438Ox.A01(fA8S, fA8r, interfaceC1434Ot.A8q());
        int iCeil = (int) Math.ceil(elevation2);
        interfaceC1434Ot.AJl(vPadding, iCeil, vPadding, iCeil);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1435Ou
    public final ColorStateList A71(InterfaceC1434Ot interfaceC1434Ot) {
        return A00(interfaceC1434Ot).A05();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1435Ou
    public final float A7v(InterfaceC1434Ot interfaceC1434Ot) {
        return interfaceC1434Ot.A7F().getElevation();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1435Ou
    public final float A8S(InterfaceC1434Ot interfaceC1434Ot) {
        return A00(interfaceC1434Ot).A03();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1435Ou
    public final float A8X(InterfaceC1434Ot interfaceC1434Ot) {
        return A8r(interfaceC1434Ot) * 2.0f;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1435Ou
    public final float A8Y(InterfaceC1434Ot interfaceC1434Ot) {
        return A8r(interfaceC1434Ot) * 2.0f;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1435Ou
    public final float A8r(InterfaceC1434Ot interfaceC1434Ot) {
        return A00(interfaceC1434Ot).A04();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1435Ou
    public final void AAE() {
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1435Ou
    public final void AAG(InterfaceC1434Ot interfaceC1434Ot, Context context, ColorStateList colorStateList, float f, float f2, float f3) {
        C1436Ov background = new C1436Ov(colorStateList, f);
        interfaceC1434Ot.AJK(background);
        View view = interfaceC1434Ot.A7F();
        view.setClipToOutline(true);
        view.setElevation(f2);
        AJX(interfaceC1434Ot, f3);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1435Ou
    public final void ADP(InterfaceC1434Ot interfaceC1434Ot) {
        AJX(interfaceC1434Ot, A8S(interfaceC1434Ot));
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1435Ou
    public final void AFT(InterfaceC1434Ot interfaceC1434Ot) {
        AJX(interfaceC1434Ot, A8S(interfaceC1434Ot));
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1435Ou
    public final void AJJ(InterfaceC1434Ot interfaceC1434Ot, ColorStateList colorStateList) {
        A00(interfaceC1434Ot).A08(colorStateList);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1435Ou
    public final void AJP(InterfaceC1434Ot interfaceC1434Ot, float f) {
        interfaceC1434Ot.A7F().setElevation(f);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1435Ou
    public final void AJX(InterfaceC1434Ot interfaceC1434Ot, float f) {
        A00(interfaceC1434Ot).A07(f, interfaceC1434Ot.A9R(), interfaceC1434Ot.A8q());
        A01(interfaceC1434Ot);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1435Ou
    public final void AJj(InterfaceC1434Ot interfaceC1434Ot, float f) {
        A00(interfaceC1434Ot).A06(f);
    }
}
