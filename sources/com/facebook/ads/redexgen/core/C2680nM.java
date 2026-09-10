package com.facebook.ads.redexgen.core;

import android.text.TextUtils;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.nM, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C2680nM extends AbstractC1334Eh<C2680nM> implements Comparable<C2680nM> {
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
    public final C12189i A0A;
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
    public C2680nM(int i2, C2823pg c2823pg, int i3, C12189i c12189i, int i4, boolean z2, InterfaceC2531kj<C2860qI> interfaceC2531kj) {
        super(i2, c2823pg, i3);
        this.A0A = c12189i;
        this.A0B = C12179h.A0K(super.A02.A0V);
        this.A0F = C12179h.A0S(i4, false);
        int i5 = 0;
        int i6 = Integer.MAX_VALUE;
        for (int i7 = 0; i7 < c12189i.A0I.size(); i7++) {
            int iA02 = C12179h.A02(super.A02, c12189i.A0I.get(i7), false);
            if (iA02 > 0) {
                i6 = i7;
                i5 = iA02;
                break;
            }
        }
        this.A04 = i6;
        this.A05 = i5;
        this.A07 = C12179h.A00(super.A02.A0E, ((C2819pc) c12189i).A0B);
        this.A0C = super.A02.A0E == 0 || (super.A02.A0E & 1) != 0;
        this.A0D = (super.A02.A0H & 1) != 0;
        this.A01 = super.A02.A06;
        this.A08 = super.A02.A0G;
        this.A00 = super.A02.A05;
        this.A0E = (super.A02.A05 == -1 || super.A02.A05 <= ((C2819pc) c12189i).A01) && (super.A02.A06 == -1 || super.A02.A06 <= ((C2819pc) c12189i).A02) && interfaceC2531kj.A4C(super.A02);
        String[] strArrA1L = C5C.A1L();
        int i8 = Integer.MAX_VALUE;
        int i9 = 0;
        for (int i10 = 0; i10 < strArrA1L.length; i10++) {
            int iA03 = C12179h.A02(super.A02, strArrA1L[i10], false);
            if (iA03 > 0) {
                i8 = i10;
                i9 = iA03;
                break;
            }
        }
        this.A02 = i8;
        this.A03 = i9;
        int i11 = Integer.MAX_VALUE;
        for (int i12 = 0; i12 < c12189i.A0J.size(); i12++) {
            if (super.A02.A0W != null && super.A02.A0W.equals(c12189i.A0J.get(i12))) {
                i11 = i12;
                break;
            }
        }
        this.A06 = i11;
        this.A0H = AbstractC11727i.A02(i4) == 128;
        this.A0G = AbstractC11727i.A04(i4) == 64;
        this.A09 = A00(i4, z2);
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static int A02(List<C2680nM> list, List<C2680nM> list2) {
        return ((C2680nM) Collections.max(list)).compareTo((C2680nM) Collections.max(list2));
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static BP<C2680nM> A03(int i2, C2823pg c2823pg, C12189i c12189i, int[] iArr, boolean z2, InterfaceC2531kj<C2860qI> interfaceC2531kj) {
        C2K c2kA01 = BP.A01();
        for (int i3 = 0; i3 < c2823pg.A01; i3++) {
            c2kA01.A04(new C2680nM(i2, c2823pg, i3, c12189i, iArr[i3], z2, interfaceC2531kj));
        }
        return c2kA01.A05();
    }

    private int A00(int i2, boolean z2) {
        if (!C12179h.A0S(i2, this.A0A.A0B)) {
            return 0;
        }
        if (!this.A0E && !this.A0A.A09) {
            return 0;
        }
        if (C12179h.A0S(i2, false) && this.A0E && super.A02.A05 != -1 && !this.A0A.A0N && !this.A0A.A0O && (this.A0A.A04 || !z2)) {
            return 2;
        }
        return 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.qK != com.google.common.collect.Ordering<java.lang.Integer> */
    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: A01, reason: merged with bridge method [inline-methods] */
    public final int compareTo(C2680nM c2680nM) {
        AbstractC2862qK abstractC2862qKA06;
        AbstractC2862qK abstractC2862qKA07 = (this.A0E && this.A0F) ? C12179h.A09 : C12179h.A09.A06();
        AbstractC2712ns abstractC2712nsA08 = AbstractC2712ns.A01().A09(this.A0F, c2680nM.A0F).A08(Integer.valueOf(this.A04), Integer.valueOf(c2680nM.A04), AbstractC2862qK.A03().A06()).A06(this.A05, c2680nM.A05).A06(this.A07, c2680nM.A07).A09(this.A0D, c2680nM.A0D).A09(this.A0C, c2680nM.A0C).A08(Integer.valueOf(this.A02), Integer.valueOf(c2680nM.A02), AbstractC2862qK.A03().A06()).A06(this.A03, c2680nM.A03).A09(this.A0E, c2680nM.A0E).A08(Integer.valueOf(this.A06), Integer.valueOf(c2680nM.A06), AbstractC2862qK.A03().A06());
        Integer numValueOf = Integer.valueOf(this.A00);
        Integer numValueOf2 = Integer.valueOf(c2680nM.A00);
        if (this.A0A.A0O) {
            abstractC2862qKA06 = C12179h.A09.A06();
        } else {
            abstractC2862qKA06 = C12179h.A0A;
        }
        AbstractC2712ns abstractC2712nsA09 = abstractC2712nsA08.A08(numValueOf, numValueOf2, abstractC2862qKA06).A09(this.A0H, c2680nM.A0H).A09(this.A0G, c2680nM.A0G).A08(Integer.valueOf(this.A01), Integer.valueOf(c2680nM.A01), abstractC2862qKA07).A08(Integer.valueOf(this.A08), Integer.valueOf(c2680nM.A08), abstractC2862qKA07);
        Integer numValueOf3 = Integer.valueOf(this.A00);
        Integer numValueOf4 = Integer.valueOf(c2680nM.A00);
        if (!C5C.A1E(this.A0B, c2680nM.A0B)) {
            abstractC2862qKA07 = C12179h.A0A;
        }
        return abstractC2712nsA09.A08(numValueOf3, numValueOf4, abstractC2862qKA07).A05();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:10:0x0036  */
    @Override // com.facebook.ads.redexgen.core.AbstractC1334Eh
    /* JADX INFO: renamed from: A04, reason: merged with bridge method [inline-methods] */
    public final boolean A09(C2680nM c2680nM) {
        if (this.A0A.A00) {
            if ((!this.A0A.A02 || (super.A02.A0W != null && TextUtils.equals(super.A02.A0W, ((AbstractC1334Eh) c2680nM).A02.A0W))) && ((this.A0A.A03 || (super.A02.A0G != -1 && super.A02.A0G == ((AbstractC1334Eh) c2680nM).A02.A0G)) && (this.A0A.A01 || (this.A0H == c2680nM.A0H && this.A0G == c2680nM.A0G)))) {
            }
        } else if (super.A02.A06 != -1) {
            int i2 = super.A02.A06;
            String[] strArr = A0I;
            if (strArr[5].charAt(5) == strArr[0].charAt(5)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0I;
            strArr2[5] = "4j0Ebeo7wJOJZxGoc5hIgJQJaA3nIP6d";
            strArr2[0] = "7JU6hRyIHJ6Xx4Pnq3EsCWmSiYve8JpD";
            if (i2 == ((AbstractC1334Eh) c2680nM).A02.A06) {
                return !this.A0A.A02 ? true : true;
            }
        }
        return false;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1334Eh
    public final int A08() {
        return this.A09;
    }
}
