package com.facebook.ads.redexgen.core;

import android.text.TextUtils;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.nM, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C2511nM extends AbstractC1165Eh<C2511nM> implements Comparable<C2511nM> {
    public static String[] A0I = {"kuPF6Ds61I7lkNvdz9bcVPsTInik8V3M", "Qk0zKRkYsaxRz9XBLHG1rmY7ne3qL", "U5xl3sY91uvZaW", "4oEkNGaUX02G9U6MTdWApFSB5pjWlUNx", "CFtCC3eFdvC", "EnNVjubCw6rdwWEp5vRTdV2Ipxq1ST06", "834ujo2VifTXBI2K", "5tr2zEJniV6LNy5ijK5ku"};
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final int A07;
    public final int A08;
    public final int A09;
    public final C10499i A0A;
    public final String A0B;
    public final boolean A0C;
    public final boolean A0D;
    public final boolean A0E;
    public final boolean A0F;
    public final boolean A0G;
    public final boolean A0H;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public C2511nM(int i, C2654pg c2654pg, int i2, C10499i c10499i, int i3, boolean z, InterfaceC2362kj<C2691qI> interfaceC2362kj) {
        super(i, c2654pg, i2);
        this.A0A = c10499i;
        this.A0B = C10489h.A0K(super.A02.A0V);
        this.A0F = C10489h.A0S(i3, false);
        int i4 = 0;
        int i5 = Integer.MAX_VALUE;
        for (int i6 = 0; i6 < c10499i.A0I.size(); i6++) {
            int iA02 = C10489h.A02(super.A02, c10499i.A0I.get(i6), false);
            if (iA02 > 0) {
                i5 = i6;
                i4 = iA02;
                break;
            }
        }
        this.A04 = i5;
        this.A05 = i4;
        this.A07 = C10489h.A00(super.A02.A0E, ((C2650pc) c10499i).A0B);
        this.A0C = super.A02.A0E == 0 || (super.A02.A0E & 1) != 0;
        this.A0D = (super.A02.A0H & 1) != 0;
        this.A01 = super.A02.A06;
        this.A08 = super.A02.A0G;
        this.A00 = super.A02.A05;
        this.A0E = (super.A02.A05 == -1 || super.A02.A05 <= ((C2650pc) c10499i).A01) && (super.A02.A06 == -1 || super.A02.A06 <= ((C2650pc) c10499i).A02) && interfaceC2362kj.A4C(super.A02);
        String[] strArrA1L = C5C.A1L();
        int i7 = Integer.MAX_VALUE;
        int i8 = 0;
        for (int i9 = 0; i9 < strArrA1L.length; i9++) {
            int iA03 = C10489h.A02(super.A02, strArrA1L[i9], false);
            if (iA03 > 0) {
                i7 = i9;
                i8 = iA03;
                break;
            }
        }
        this.A02 = i7;
        this.A03 = i8;
        int i10 = Integer.MAX_VALUE;
        for (int i11 = 0; i11 < c10499i.A0J.size(); i11++) {
            if (super.A02.A0W != null && super.A02.A0W.equals(c10499i.A0J.get(i11))) {
                i10 = i11;
                break;
            }
        }
        this.A06 = i10;
        this.A0H = AbstractC10037i.A02(i3) == 128;
        this.A0G = AbstractC10037i.A04(i3) == 64;
        this.A09 = A00(i3, z);
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static int A02(List<C2511nM> list, List<C2511nM> list2) {
        return ((C2511nM) Collections.max(list)).compareTo((C2511nM) Collections.max(list2));
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static BP<C2511nM> A03(int i, C2654pg c2654pg, C10499i c10499i, int[] iArr, boolean z, InterfaceC2362kj<C2691qI> interfaceC2362kj) {
        C2K c2kA01 = BP.A01();
        for (int i2 = 0; i2 < c2654pg.A01; i2++) {
            c2kA01.A04(new C2511nM(i, c2654pg, i2, c10499i, iArr[i2], z, interfaceC2362kj));
        }
        return c2kA01.A05();
    }

    private int A00(int i, boolean z) {
        if (!C10489h.A0S(i, this.A0A.A0B)) {
            return 0;
        }
        if (!this.A0E && !this.A0A.A09) {
            return 0;
        }
        if (C10489h.A0S(i, false) && this.A0E && super.A02.A05 != -1 && !this.A0A.A0N && !this.A0A.A0O && (this.A0A.A04 || !z)) {
            return 2;
        }
        return 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.qK != com.google.common.collect.Ordering<java.lang.Integer> */
    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: A01, reason: merged with bridge method [inline-methods] */
    public final int compareTo(C2511nM c2511nM) {
        AbstractC2693qK abstractC2693qKA06;
        AbstractC2693qK abstractC2693qKA07 = (this.A0E && this.A0F) ? C10489h.A09 : C10489h.A09.A06();
        AbstractC2543ns abstractC2543nsA08 = AbstractC2543ns.A01().A09(this.A0F, c2511nM.A0F).A08(Integer.valueOf(this.A04), Integer.valueOf(c2511nM.A04), AbstractC2693qK.A03().A06()).A06(this.A05, c2511nM.A05).A06(this.A07, c2511nM.A07).A09(this.A0D, c2511nM.A0D).A09(this.A0C, c2511nM.A0C).A08(Integer.valueOf(this.A02), Integer.valueOf(c2511nM.A02), AbstractC2693qK.A03().A06()).A06(this.A03, c2511nM.A03).A09(this.A0E, c2511nM.A0E).A08(Integer.valueOf(this.A06), Integer.valueOf(c2511nM.A06), AbstractC2693qK.A03().A06());
        Integer numValueOf = Integer.valueOf(this.A00);
        Integer numValueOf2 = Integer.valueOf(c2511nM.A00);
        if (this.A0A.A0O) {
            abstractC2693qKA06 = C10489h.A09.A06();
        } else {
            abstractC2693qKA06 = C10489h.A0A;
        }
        AbstractC2543ns abstractC2543nsA09 = abstractC2543nsA08.A08(numValueOf, numValueOf2, abstractC2693qKA06).A09(this.A0H, c2511nM.A0H).A09(this.A0G, c2511nM.A0G).A08(Integer.valueOf(this.A01), Integer.valueOf(c2511nM.A01), abstractC2693qKA07).A08(Integer.valueOf(this.A08), Integer.valueOf(c2511nM.A08), abstractC2693qKA07);
        Integer numValueOf3 = Integer.valueOf(this.A00);
        Integer numValueOf4 = Integer.valueOf(c2511nM.A00);
        if (!C5C.A1E(this.A0B, c2511nM.A0B)) {
            abstractC2693qKA07 = C10489h.A0A;
        }
        return abstractC2543nsA09.A08(numValueOf3, numValueOf4, abstractC2693qKA07).A05();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:10:0x0036  */
    @Override // com.facebook.ads.redexgen.core.AbstractC1165Eh
    /* JADX INFO: renamed from: A04, reason: merged with bridge method [inline-methods] */
    public final boolean A09(C2511nM c2511nM) {
        if (this.A0A.A00) {
            if ((!this.A0A.A02 || (super.A02.A0W != null && TextUtils.equals(super.A02.A0W, ((AbstractC1165Eh) c2511nM).A02.A0W))) && ((this.A0A.A03 || (super.A02.A0G != -1 && super.A02.A0G == ((AbstractC1165Eh) c2511nM).A02.A0G)) && (this.A0A.A01 || (this.A0H == c2511nM.A0H && this.A0G == c2511nM.A0G)))) {
            }
        } else if (super.A02.A06 != -1) {
            int i = super.A02.A06;
            String[] strArr = A0I;
            if (strArr[5].charAt(5) == strArr[0].charAt(5)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0I;
            strArr2[5] = "4j0Ebeo7wJOJZxGoc5hIgJQJaA3nIP6d";
            strArr2[0] = "7JU6hRyIHJ6Xx4Pnq3EsCWmSiYve8JpD";
            if (i == ((AbstractC1165Eh) c2511nM).A02.A06) {
                return !this.A0A.A02 ? true : true;
            }
        }
        return false;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1165Eh
    public final int A08() {
        return this.A09;
    }
}
