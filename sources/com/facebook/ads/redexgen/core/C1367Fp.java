package com.facebook.ads.redexgen.core;

import android.util.SparseBooleanArray;
import android.view.ViewGroup;
import java.util.List;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Fp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C1367Fp extends AbstractC1648Qq<FY> {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public AbstractC1835Yb A04;
    public InterfaceC1841Yh A05;
    public String A06;
    public List<C2138e5> A07;
    public boolean A08;
    public final SparseBooleanArray A09 = new SparseBooleanArray();
    public final AbstractC2465jd A0A;
    public final C1706Sx A0B;
    public final C2300gi A0C;
    public final VA A0D;
    public final Y2 A0E;
    public final C1376Fy A0F;
    public final C2245fp A0G;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public C1367Fp(C2300gi c2300gi, List<C2138e5> list, AbstractC2465jd abstractC2465jd, VA va, C1706Sx c1706Sx, C2245fp c2245fp, Y2 y2, InterfaceC1841Yh interfaceC1841Yh, String str, int i2, int i3, int i4, int i5, C1376Fy c1376Fy, AbstractC1835Yb abstractC1835Yb) {
        this.A0C = c2300gi;
        this.A0D = va;
        this.A0B = c1706Sx;
        this.A0G = c2245fp;
        this.A0E = y2;
        this.A05 = interfaceC1841Yh;
        this.A0A = abstractC2465jd;
        this.A07 = list;
        this.A00 = i2;
        this.A03 = i5;
        this.A06 = str;
        this.A01 = i4;
        this.A02 = i3;
        this.A0F = c1376Fy;
        this.A04 = abstractC1835Yb;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.core.AbstractC1648Qq
    /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final FY A0F(ViewGroup viewGroup, int i2) {
        return new FY(AbstractC2070cy.A00(new C2016c6(this.A0C, this.A0D, this.A05, this.A0A, null, this.A0G, this.A0E).A0P(this.A04).A0U(), this.A03, this.A06, this.A0F), this.A09, this.A0G, this.A00, this.A01, this.A02, this.A07.size(), this.A0C, this.A0A.A2A());
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.core.AbstractC1648Qq
    /* JADX INFO: renamed from: A01, reason: merged with bridge method [inline-methods] */
    public final void A0K(FY fy, int i2) {
        fy.A0q(this.A07.get(i2), this.A0D, this.A0B, this.A0E, this.A06);
        if (!this.A08 && i2 == 0) {
            fy.AJF();
            this.A08 = true;
        }
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1648Qq
    public final int A0B() {
        return this.A07.size();
    }
}
