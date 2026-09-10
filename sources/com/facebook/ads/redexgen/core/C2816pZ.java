package com.facebook.ads.redexgen.core;

import android.os.Bundle;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.pZ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C2816pZ implements AnonymousClass24 {
    public final int A00;
    public final C2823pg A01;
    public final boolean A02;
    public final int[] A03;
    public final boolean[] A04;
    public static final String A07 = C5C.A0h(0);
    public static final String A09 = C5C.A0h(1);
    public static final String A08 = C5C.A0h(3);
    public static final String A06 = C5C.A0h(4);
    public static final AnonymousClass23<C2816pZ> A05 = new AnonymousClass23() { // from class: com.facebook.ads.redexgen.X.pa
        @Override // com.facebook.ads.redexgen.core.AnonymousClass23
        public final AnonymousClass24 A6f(Bundle bundle) {
            return C2816pZ.A00(bundle);
        }
    };

    public C2816pZ(C2823pg c2823pg, boolean z2, int[] iArr, boolean[] zArr) {
        this.A00 = c2823pg.A01;
        boolean z3 = false;
        AbstractC10843y.A07(this.A00 == iArr.length && this.A00 == zArr.length);
        this.A01 = c2823pg;
        if (z2 && this.A00 > 1) {
            z3 = true;
        }
        this.A02 = z3;
        this.A03 = (int[]) iArr.clone();
        this.A04 = (boolean[]) zArr.clone();
    }

    public static /* synthetic */ C2816pZ A00(Bundle bundle) {
        C2823pg c2823pg = (C2823pg) C2823pg.A06.A6f((Bundle) AbstractC10843y.A01(bundle.getBundle(A07)));
        int[] iArr = (int[]) AbstractC2523ka.A00(bundle.getIntArray(A09), new int[c2823pg.A01]);
        boolean[] selected = (boolean[]) AbstractC2523ka.A00(bundle.getBooleanArray(A08), new boolean[c2823pg.A01]);
        return new C2816pZ(c2823pg, bundle.getBoolean(A06, false), iArr, selected);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C2816pZ c2816pZ = (C2816pZ) obj;
        if (this.A02 == c2816pZ.A02 && this.A01.equals(c2816pZ.A01) && Arrays.equals(this.A03, c2816pZ.A03) && Arrays.equals(this.A04, c2816pZ.A04)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((((this.A01.hashCode() * 31) + (this.A02 ? 1 : 0)) * 31) + Arrays.hashCode(this.A03)) * 31) + Arrays.hashCode(this.A04);
    }
}
