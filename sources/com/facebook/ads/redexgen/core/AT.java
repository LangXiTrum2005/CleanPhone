package com.facebook.ads.redexgen.core;

import android.os.Bundle;

/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class AT extends AbstractC2835pt {
    public final boolean A00;
    public final boolean A01;
    public static final String A04 = C5C.A0h(1);
    public static final String A03 = C5C.A0h(2);
    public static final AnonymousClass23<AT> A02 = new AnonymousClass23() { // from class: com.facebook.ads.redexgen.X.pr
        @Override // com.facebook.ads.redexgen.core.AnonymousClass23
        public final AnonymousClass24 A6f(Bundle bundle) {
            return AT.A00(bundle);
        }
    };

    public AT() {
        this.A01 = false;
        this.A00 = false;
    }

    public AT(boolean z2) {
        this.A01 = true;
        this.A00 = z2;
    }

    public static AT A00(Bundle bundle) {
        boolean rated = bundle.getInt(AbstractC2835pt.A02, -1) == 3;
        AbstractC10843y.A07(rated);
        boolean rated2 = bundle.getBoolean(A04, false);
        if (rated2) {
            return new AT(bundle.getBoolean(A03, false));
        }
        return new AT();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof AT)) {
            return false;
        }
        AT at = (AT) obj;
        return this.A00 == at.A00 && this.A01 == at.A01;
    }

    public final int hashCode() {
        return CB.A00(Boolean.valueOf(this.A01), Boolean.valueOf(this.A00));
    }
}
