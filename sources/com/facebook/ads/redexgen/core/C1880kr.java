package com.facebook.ads.redexgen.core;

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.kr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1880kr extends C4L {
    public final C4L A00 = new C1881ks(this);
    public final MG A01;

    public C1880kr(MG mg) {
        this.A01 = mg;
    }

    @Override // com.facebook.ads.redexgen.core.C4L
    public final void A07(View view, AccessibilityEvent accessibilityEvent) {
        super.A07(view, accessibilityEvent);
        accessibilityEvent.setClassName(MG.class.getName());
        if ((view instanceof MG) && !A0B()) {
            MG mg = (MG) view;
            if (mg.getLayoutManager() != null) {
                mg.getLayoutManager().A1t(accessibilityEvent);
            }
        }
    }

    @Override // com.facebook.ads.redexgen.core.C4L
    public final void A08(View view, AnonymousClass56 anonymousClass56) {
        super.A08(view, anonymousClass56);
        anonymousClass56.A0O(MG.class.getName());
        if (!A0B() && this.A01.getLayoutManager() != null) {
            this.A01.getLayoutManager().A1F(anonymousClass56);
        }
    }

    @Override // com.facebook.ads.redexgen.core.C4L
    public final boolean A09(View view, int i, Bundle bundle) {
        if (super.A09(view, i, bundle)) {
            return true;
        }
        if (!A0B() && this.A01.getLayoutManager() != null) {
            return this.A01.getLayoutManager().A1V(i, bundle);
        }
        return false;
    }

    public final C4L A0A() {
        return this.A00;
    }

    public final boolean A0B() {
        return this.A01.A1r();
    }
}
