package com.facebook.ads.redexgen.core;

import android.util.SparseBooleanArray;
import android.view.ViewGroup;
import java.util.List;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Fp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C1198Fp extends AbstractC1479Qq<FY> {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public AbstractC1666Yb A04;
    public InterfaceC1672Yh A05;
    public String A06;
    public List<C1969e5> A07;
    public boolean A08;
    public final SparseBooleanArray A09 = new SparseBooleanArray();
    public final AbstractC2296jd A0A;
    public final C1537Sx A0B;
    public final C2131gi A0C;
    public final VA A0D;
    public final Y2 A0E;
    public final C1207Fy A0F;
    public final C2076fp A0G;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public C1198Fp(C2131gi c2131gi, List<C1969e5> list, AbstractC2296jd abstractC2296jd, VA va, C1537Sx c1537Sx, C2076fp c2076fp, Y2 y2, InterfaceC1672Yh interfaceC1672Yh, String str, int i, int i2, int i3, int i4, C1207Fy c1207Fy, AbstractC1666Yb abstractC1666Yb) {
        this.A0C = c2131gi;
        this.A0D = va;
        this.A0B = c1537Sx;
        this.A0G = c2076fp;
        this.A0E = y2;
        this.A05 = interfaceC1672Yh;
        this.A0A = abstractC2296jd;
        this.A07 = list;
        this.A00 = i;
        this.A03 = i4;
        this.A06 = str;
        this.A01 = i3;
        this.A02 = i2;
        this.A0F = c1207Fy;
        this.A04 = abstractC1666Yb;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.core.AbstractC1479Qq
    /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final FY A0F(ViewGroup viewGroup, int i) {
        return new FY(AbstractC1901cy.A00(new C1847c6(this.A0C, this.A0D, this.A05, this.A0A, null, this.A0G, this.A0E).A0P(this.A04).A0U(), this.A03, this.A06, this.A0F), this.A09, this.A0G, this.A00, this.A01, this.A02, this.A07.size(), this.A0C, this.A0A.A2A());
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.core.AbstractC1479Qq
    /* JADX INFO: renamed from: A01, reason: merged with bridge method [inline-methods] */
    public final void A0K(FY fy, int i) {
        fy.A0q(this.A07.get(i), this.A0D, this.A0B, this.A0E, this.A06);
        if (!this.A08 && i == 0) {
            fy.AJF();
            this.A08 = true;
        }
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1479Qq
    public final int A0B() {
        return this.A07.size();
    }
}
