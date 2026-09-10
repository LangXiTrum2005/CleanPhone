package com.facebook.ads.redexgen.core;

import android.content.Context;
import android.content.res.ColorStateList;
import android.view.View;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.lW, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1917lW implements InterfaceC04353u {
    private C04363v A00(InterfaceC04343t interfaceC04343t) {
        return (C04363v) interfaceC04343t.A74();
    }

    public final void A01(InterfaceC04343t interfaceC04343t) {
        if (!interfaceC04343t.A9H()) {
            interfaceC04343t.AIr(0, 0, 0, 0);
            return;
        }
        float fA8I = A8I(interfaceC04343t);
        float fA8h = A8h(interfaceC04343t);
        float elevation = AbstractC04383x.A00(fA8I, fA8h, interfaceC04343t.A8g());
        int vPadding = (int) Math.ceil(elevation);
        float elevation2 = AbstractC04383x.A01(fA8I, fA8h, interfaceC04343t.A8g());
        int iCeil = (int) Math.ceil(elevation2);
        interfaceC04343t.AIr(vPadding, iCeil, vPadding, iCeil);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC04353u
    public final ColorStateList A6r(InterfaceC04343t interfaceC04343t) {
        return A00(interfaceC04343t).A05();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC04353u
    public final float A7l(InterfaceC04343t interfaceC04343t) {
        return interfaceC04343t.A75().getElevation();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC04353u
    public final float A8I(InterfaceC04343t interfaceC04343t) {
        return A00(interfaceC04343t).A03();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC04353u
    public final float A8N(InterfaceC04343t interfaceC04343t) {
        return A8h(interfaceC04343t) * 2.0f;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC04353u
    public final float A8O(InterfaceC04343t interfaceC04343t) {
        return A8h(interfaceC04343t) * 2.0f;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC04353u
    public final float A8h(InterfaceC04343t interfaceC04343t) {
        return A00(interfaceC04343t).A04();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC04353u
    public final void AA4() {
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC04353u
    public final void AA6(InterfaceC04343t interfaceC04343t, Context context, ColorStateList colorStateList, float f, float f2, float f3) {
        C04363v background = new C04363v(colorStateList, f);
        interfaceC04343t.AIQ(background);
        View view = interfaceC04343t.A75();
        view.setClipToOutline(true);
        view.setElevation(f2);
        AId(interfaceC04343t, f3);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC04353u
    public final void ACf(InterfaceC04343t interfaceC04343t) {
        AId(interfaceC04343t, A8I(interfaceC04343t));
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC04353u
    public final void AEe(InterfaceC04343t interfaceC04343t) {
        AId(interfaceC04343t, A8I(interfaceC04343t));
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC04353u
    public final void AIP(InterfaceC04343t interfaceC04343t, ColorStateList colorStateList) {
        A00(interfaceC04343t).A08(colorStateList);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC04353u
    public final void AIV(InterfaceC04343t interfaceC04343t, float f) {
        interfaceC04343t.A75().setElevation(f);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC04353u
    public final void AId(InterfaceC04343t interfaceC04343t, float f) {
        A00(interfaceC04343t).A07(f, interfaceC04343t.A9H(), interfaceC04343t.A8g());
        A01(interfaceC04343t);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC04353u
    public final void AIp(InterfaceC04343t interfaceC04343t, float f) {
        A00(interfaceC04343t).A06(f);
    }
}
