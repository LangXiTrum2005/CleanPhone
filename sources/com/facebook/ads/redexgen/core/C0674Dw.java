package com.facebook.ads.redexgen.core;

import android.os.Bundle;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Dw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0674Dw extends AbstractC1189Yr {
    public final boolean A00;
    public final boolean A01;
    public static String[] A02 = {"KvRsWQnCxzZs0XS", "1HWwvDCNAzdU2SlIb9", "mPN48Z3YXpSi45I4IprQsXBy2yWouHzS", "1Kslfp8e4lxmFF26GLpj1iDXpC", "jv2DZkWZDzNFk7YS1FZ9TOlayKriIsTk", "HoDcLp1db17Ys7H80pVsqVRDAZIzaFhx", "USA3", "H9Yw7mnPNvj0vX40QvFxmw6TBd9XPsGr"};
    public static final String A05 = AbstractC1600gE.A0h(1);
    public static final String A04 = AbstractC1600gE.A0h(2);
    public static final InterfaceC0903Na<C0674Dw> A03 = new InterfaceC0903Na() { // from class: com.facebook.ads.redexgen.X.Yk
        @Override // com.facebook.ads.redexgen.core.InterfaceC0903Na
        public final InterfaceC0904Nb A6V(Bundle bundle) {
            return C0674Dw.A00(bundle);
        }
    };

    public C0674Dw() {
        this.A01 = false;
        this.A00 = false;
    }

    public C0674Dw(boolean z) {
        this.A01 = true;
        this.A00 = z;
    }

    public static C0674Dw A00(Bundle bundle) {
        boolean rated = bundle.getInt(AbstractC1189Yr.A02, -1) == 3;
        AbstractC1517es.A07(rated);
        boolean rated2 = bundle.getBoolean(A05, false);
        if (rated2) {
            return new C0674Dw(bundle.getBoolean(A04, false));
        }
        return new C0674Dw();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C0674Dw)) {
            return false;
        }
        C0674Dw c0674Dw = (C0674Dw) obj;
        if (this.A00 != c0674Dw.A00) {
            return false;
        }
        boolean z = this.A01;
        boolean z2 = c0674Dw.A01;
        if (A02[6].length() != 4) {
            throw new RuntimeException();
        }
        A02[0] = "Q8dOHh8rsVu7EFBQiGuBH3fzgac";
        return z == z2;
    }

    public final int hashCode() {
        return AbstractC0942Or.A00(Boolean.valueOf(this.A01), Boolean.valueOf(this.A00));
    }
}
