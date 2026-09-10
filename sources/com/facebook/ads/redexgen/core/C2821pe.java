package com.facebook.ads.redexgen.core;

import android.os.Bundle;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.pe, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C2821pe implements AnonymousClass24 {
    public final C2823pg A00;
    public final BP<Integer> A01;
    public static final String A04 = C5C.A0h(0);
    public static final String A03 = C5C.A0h(1);
    public static final AnonymousClass23<C2821pe> A02 = new AnonymousClass23() { // from class: com.facebook.ads.redexgen.X.pf
        @Override // com.facebook.ads.redexgen.core.AnonymousClass23
        public final AnonymousClass24 A6f(Bundle bundle) {
            return C2821pe.A00(bundle);
        }
    };

    public C2821pe(C2823pg c2823pg, List<Integer> trackIndices) {
        if (trackIndices.isEmpty() || (((Integer) Collections.min(trackIndices)).intValue() >= 0 && ((Integer) Collections.max(trackIndices)).intValue() < c2823pg.A01)) {
            this.A00 = c2823pg;
            this.A01 = BP.A05(trackIndices);
            return;
        }
        throw new IndexOutOfBoundsException();
    }

    public static /* synthetic */ C2821pe A00(Bundle bundle) {
        return new C2821pe((C2823pg) C2823pg.A06.A6f((Bundle) AbstractC10843y.A01(bundle.getBundle(A04))), AbstractC1244As.A09((int[]) AbstractC10843y.A01(bundle.getIntArray(A03))));
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
        C2821pe c2821pe = (C2821pe) obj;
        return this.A00.equals(c2821pe.A00) && this.A01.equals(c2821pe.A01);
    }

    public final int hashCode() {
        return this.A00.hashCode() + (this.A01.hashCode() * 31);
    }
}
