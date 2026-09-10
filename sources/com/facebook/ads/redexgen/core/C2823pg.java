package com.facebook.ads.redexgen.core;

import android.os.Bundle;
import com.facebook.ads.androidx.media3.common.Format;
import java.util.Arrays;
import java.util.List;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.pg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C2823pg implements AnonymousClass24 {
    public static byte[] A05;
    public static final AnonymousClass23<C2823pg> A06;
    public static final String A07;
    public static final String A08;
    public int A00;
    public final int A01;
    public final int A02;
    public final String A03;
    public final C2860qI[] A04;

    public static String A02(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A05, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] ^ i4) ^ 15);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A05() {
        A05 = new byte[]{95, 28, 16, 18, 29, 22, 17, 26, 27, 95, 22, 17, 95, 16, 17, 26, 95, 43, 13, 30, 28, 20, 56, 13, 16, 10, 15, 69, 95, 88, 100, 99, 107, 55, 49, 34, 32, 40, 99, 112, 119, AbstractJsonLexerKt.TC_INVALID, 35, 37, 54, 52, 60, 119, 103, 126, 119, 54, 57, 51, 119, 112, 62, 106, 71, 72, 72, 75, 92, 75, 64, 90, 14, 22, 48, 35, 33, 41, 5, 48, 45, 55, 50, 50, 63, 48, 57, 43, 63, 57, 59, 45, 40, 53, 54, 63, 122, 60, 54, 59, 61, 41, 61, 38, 44};
    }

    static {
        A05();
        A07 = C5C.A0h(0);
        A08 = C5C.A0h(1);
        A06 = new AnonymousClass23() { // from class: com.facebook.ads.redexgen.X.ph
            @Override // com.facebook.ads.redexgen.core.AnonymousClass23
            public final AnonymousClass24 A6f(Bundle bundle) {
                return C2823pg.A01(bundle);
            }
        };
    }

    public C2823pg(String str, C2860qI... c2860qIArr) {
        AbstractC10843y.A07(c2860qIArr.length > 0);
        this.A03 = str;
        this.A04 = c2860qIArr;
        this.A01 = c2860qIArr.length;
        int iA01 = C3J.A01(c2860qIArr[0].A0W);
        this.A02 = iA01 == -1 ? C3J.A01(c2860qIArr[0].A0S) : iA01;
        A04();
    }

    public C2823pg(C2860qI... c2860qIArr) {
        this(A02(0, 0, 114), c2860qIArr);
    }

    public static int A00(int i2) {
        return i2 | 16384;
    }

    public static /* synthetic */ C2823pg A01(Bundle bundle) {
        List listA01;
        List<Format> formats = bundle.getParcelableArrayList(A07);
        if (formats == null) {
            listA01 = MetaExoPlayerCustomizedCollections.A01();
        } else {
            listA01 = AnonymousClass44.A01(C2860qI.A0b, formats);
        }
        String id = bundle.getString(A08, A02(0, 0, 114));
        return new C2823pg(id, (C2860qI[]) listA01.toArray(new C2860qI[0]));
    }

    public static String A03(String str) {
        return (str == null || str.equals(A02(96, 3, 71))) ? A02(0, 0, 114) : str;
    }

    private void A04() {
        String strA03 = A03(this.A04[0].A0V);
        int iA00 = A00(this.A04[0].A0E);
        for (int i2 = 1; i2 < this.A04.length; i2++) {
            String language = this.A04[i2].A0V;
            if (!strA03.equals(A03(language))) {
                String str = this.A04[0].A0V;
                String str2 = this.A04[i2].A0V;
                String language2 = A02(77, 9, 81);
                A06(language2, str, str2, i2);
                return;
            }
            if (iA00 != A00(this.A04[i2].A0E)) {
                String binaryString = Integer.toBinaryString(this.A04[0].A0E);
                String binaryString2 = Integer.toBinaryString(this.A04[i2].A0E);
                String language3 = A02(86, 10, 85);
                A06(language3, binaryString, binaryString2, i2);
                return;
            }
        }
    }

    public static void A06(String str, String str2, String str3, int i2) {
        AbstractC10924g.A08(A02(67, 10, 77), A02(0, 0, 114), new IllegalStateException(A02(57, 10, 33) + str + A02(0, 30, 112) + str2 + A02(39, 17, 88) + str3 + A02(30, 9, 76) + i2 + A02(56, 1, 24)));
    }

    public final int A07(C2860qI c2860qI) {
        for (int i2 = 0; i2 < i; i2++) {
            if (c2860qI == this.A04[i2]) {
                return i2;
            }
        }
        return -1;
    }

    public final C2860qI A08(int i2) {
        return this.A04[i2];
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C2823pg c2823pg = (C2823pg) obj;
        return this.A03.equals(c2823pg.A03) && Arrays.equals(this.A04, c2823pg.A04);
    }

    public final int hashCode() {
        if (this.A00 == 0) {
            int result = this.A03.hashCode();
            this.A00 = (((17 * 31) + result) * 31) + Arrays.hashCode(this.A04);
        }
        int result2 = this.A00;
        return result2;
    }
}
