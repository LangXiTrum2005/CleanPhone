package com.facebook.ads.redexgen.core;

import android.os.Bundle;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.pe, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C2652pe implements AnonymousClass24 {
    public final C2654pg A00;
    public final BP<Integer> A01;
    public static final String A04 = C5C.A0h(0);
    public static final String A03 = C5C.A0h(1);
    public static final AnonymousClass23<C2652pe> A02 = new AnonymousClass23() { // from class: com.facebook.ads.redexgen.X.pf
        @Override // com.facebook.ads.redexgen.core.AnonymousClass23
        public final AnonymousClass24 A6f(Bundle bundle) {
            return C2652pe.A00(bundle);
        }
    };

    public C2652pe(C2654pg c2654pg, List<Integer> trackIndices) {
        if (trackIndices.isEmpty() || (((Integer) Collections.min(trackIndices)).intValue() >= 0 && ((Integer) Collections.max(trackIndices)).intValue() < c2654pg.A01)) {
            this.A00 = c2654pg;
            this.A01 = BP.A05(trackIndices);
            return;
        }
        throw new IndexOutOfBoundsException();
    }

    public static /* synthetic */ C2652pe A00(Bundle bundle) {
        return new C2652pe((C2654pg) C2654pg.A06.A6f((Bundle) AbstractC09153y.A01(bundle.getBundle(A04))), AbstractC1075As.A09((int[]) AbstractC09153y.A01(bundle.getIntArray(A03))));
    }

    public final int A01() {
        return this.A00.A02;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C2652pe c2652pe = (C2652pe) obj;
        return this.A00.equals(c2652pe.A00) && this.A01.equals(c2652pe.A01);
    }

    public final int hashCode() {
        return this.A00.hashCode() + (this.A01.hashCode() * 31);
    }
}
