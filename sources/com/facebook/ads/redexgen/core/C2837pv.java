package com.facebook.ads.redexgen.core;

import android.os.Bundle;
import java.util.ArrayList;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.pv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C2837pv implements AnonymousClass24 {
    public final C10492n A00;
    public static String[] A01 = {"mula3CidaM", "QXZvrsMqvoQg77WBvlve", "clHaL9AVxqL", "4", "dTVzaj3Js", "vbPIPyw6rptXOUyrUErD6RaDDuBNyqsV", "dqUk2BmO1rRhKnsvPvl2vnYni3", "mE8b9jVFwC8HjBTnnlrMONG37KhdcP6J"};
    public static final C2837pv A03 = new C3P().A04();
    public static final String A04 = C5C.A0h(0);
    public static final AnonymousClass23<C2837pv> A02 = new AnonymousClass23() { // from class: com.facebook.ads.redexgen.X.pw
        @Override // com.facebook.ads.redexgen.core.AnonymousClass23
        public final AnonymousClass24 A6f(Bundle bundle) {
            return C2837pv.A01(bundle);
        }
    };

    public C2837pv(C10492n c10492n) {
        this.A00 = c10492n;
    }

    public static C2837pv A01(Bundle bundle) {
        ArrayList<Integer> integerArrayList = bundle.getIntegerArrayList(A04);
        if (integerArrayList == null) {
            return A03;
        }
        C3P c3p = new C3P();
        int i2 = 0;
        while (true) {
            int size = integerArrayList.size();
            if (A01[7].charAt(28) != 'c') {
                throw new RuntimeException();
            }
            A01[7] = "mp2TMNIiilctnlK0CRpdI2bFoWxScr6M";
            if (i2 < size) {
                c3p.A00(integerArrayList.get(i2).intValue());
                i2++;
            } else {
                return c3p.A04();
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof C2837pv)) {
                return false;
            }
            return this.A00.equals(((C2837pv) obj).A00);
        }
        if (A01[5].charAt(22) == 'S') {
            throw new RuntimeException();
        }
        String[] strArr = A01;
        strArr[2] = "64Urjp6xISM";
        strArr[0] = "9byEEtKTR1";
        return true;
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }
}
