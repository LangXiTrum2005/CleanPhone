package com.facebook.ads.redexgen.core;

import android.os.Bundle;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.q7, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C2849q7 implements AnonymousClass24 {
    public final C2854qC A00;

    @Deprecated
    public final AW A01;
    public final C2852qA A02;
    public final AnonymousClass32 A03;

    @Deprecated
    public final C2851q9 A04;
    public final C2844q2 A05;
    public final String A06;
    public static String[] A07 = {"wAM8vtdO0lmHfSdh0aX8JSKdnwpCp9D2", "", "J6SB4ddL0FfEeVIHYuGnUGetWM2QRdUO", "0HTq7SjPEUFdYYph8tikUta3pLjb69Rn", "wGA6vSFg01QHk42FD2L8p637KRkqAXcn", "9eG6h6QaFREs2gWO0", "Z5vutuZNVsi2rK7c87KXUNl8wBJYnGEL", "V2BGt2aUfGoyLxnwwGFsOMeTNor3H3xe"};
    public static final C2849q7 A09 = new C10562u().A05();
    public static final AnonymousClass23<C2849q7> A08 = new AnonymousClass23() { // from class: com.facebook.ads.redexgen.X.qE
        @Override // com.facebook.ads.redexgen.core.AnonymousClass23
        public final AnonymousClass24 A6f(Bundle bundle) {
            return C2849q7.A00(bundle);
        }
    };

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static C2849q7 A00(Bundle bundle) {
        String str = (String) AbstractC10843y.A01(bundle.getString(A02(0), ""));
        Bundle bundle2 = bundle.getBundle(A02(1));
        C2852qA c2852qA = bundle2 == null ? C2852qA.A07 : (C2852qA) C2852qA.A06.A6f(bundle2);
        Bundle bundle3 = bundle.getBundle(A02(2));
        C2844q2 c2844q2 = bundle3 == null ? C2844q2.A0Z : (C2844q2) C2844q2.A0Y.A6f(bundle3);
        Bundle bundle4 = bundle.getBundle(A02(3));
        return new C2849q7(str, bundle4 == null ? AW.A00 : (AW) C2854qC.A05.A6f(bundle4), null, c2852qA, c2844q2);
    }

    public C2849q7(String str, AW aw, C2851q9 c2851q9, C2852qA c2852qA, C2844q2 c2844q2) {
        this.A06 = str;
        this.A03 = c2851q9;
        this.A04 = c2851q9;
        this.A02 = c2852qA;
        this.A05 = c2844q2;
        this.A00 = aw;
        this.A01 = aw;
    }

    public static String A02(int i2) {
        return Integer.toString(i2, 36);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2849q7)) {
            return false;
        }
        C2849q7 c2849q7 = (C2849q7) obj;
        if (C5C.A1E(this.A06, c2849q7.A06)) {
            C2854qC c2854qC = this.A00;
            C2854qC c2854qC2 = c2849q7.A00;
            String[] strArr = A07;
            if (strArr[7].charAt(22) != strArr[2].charAt(22)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A07;
            strArr2[7] = "WE1TlvFnuMEFfhCqOSZQGPel0cAOxnij";
            strArr2[2] = "QIjSvgjDyRqWUwkha5pDZVewjWBdao8T";
            if (c2854qC.equals(c2854qC2) && C5C.A1E(this.A03, c2849q7.A03) && C5C.A1E(this.A02, c2849q7.A02) && C5C.A1E(this.A05, c2849q7.A05)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int result = this.A06.hashCode();
        int i2 = result * 31;
        int result2 = this.A03 != null ? this.A03.hashCode() : 0;
        int iHashCode = (((i2 + result2) * 31) + this.A02.hashCode()) * 31;
        C2854qC c2854qC = this.A00;
        String[] strArr = A07;
        String str = strArr[4];
        String str2 = strArr[3];
        int iCharAt = str.charAt(31);
        int result3 = str2.charAt(31);
        if (iCharAt != result3) {
            throw new RuntimeException();
        }
        String[] strArr2 = A07;
        strArr2[7] = "oKnJE1KY80M0C2djBAWfSHeSjkObNKTB";
        strArr2[2] = "bdrBBUaZbF1SVnsIGw0ZL6eMFfyDgZAn";
        int result4 = c2854qC.hashCode();
        return ((iHashCode + result4) * 31) + this.A05.hashCode();
    }
}
