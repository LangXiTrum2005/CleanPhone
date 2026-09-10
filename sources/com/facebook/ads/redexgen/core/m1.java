package com.facebook.ads.redexgen.core;

import android.util.SparseBooleanArray;
import android.view.ViewGroup;
import java.util.List;

/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class M1 extends AbstractC1648Qq<C1368Fq> {
    public int A00;
    public int A01;
    public int A02;
    public InterfaceC1841Yh A03;
    public C2245fp A04;
    public String A05;
    public List<C2138e5> A06;
    public final SparseBooleanArray A07 = new SparseBooleanArray();
    public final AbstractC2465jd A08;
    public final C1706Sx A09;
    public final C2300gi A0A;
    public final VA A0B;
    public final UK A0C;
    public final Y2 A0D;
    public final C6X A0E;
    public final DZ A0F;

    public M1(C2300gi c2300gi, List<C2138e5> list, AbstractC2465jd abstractC2465jd, VA va, UK uk, InterfaceC1841Yh interfaceC1841Yh, String str, C6X c6x, DZ dz) {
        this.A0A = c2300gi;
        this.A0B = va;
        this.A0C = uk;
        this.A09 = uk.A14();
        this.A04 = uk.A1G();
        this.A0D = uk.A1E();
        this.A03 = interfaceC1841Yh;
        this.A08 = abstractC2465jd;
        this.A06 = list;
        this.A05 = str;
        this.A0E = c6x;
        this.A0F = dz;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.core.AbstractC1648Qq
    /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final C1368Fq A0F(ViewGroup viewGroup, int i2) {
        return new C1368Fq(AbstractC1980bW.A00(new C2016c6(this.A0A, this.A0B, this.A03, this.A08, null, this.A04, this.A0D).A0R(this.A0F).A0N(this.A0C).A0U(), this.A0C, this.A05, this.A0E), this.A07, this.A04, this.A06.size(), this.A0A, this.A08.A2A());
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.core.AbstractC1648Qq
    /* JADX INFO: renamed from: A01, reason: merged with bridge method [inline-methods] */
    public final void A0K(C1368Fq c1368Fq, int i2) {
        C2138e5 c2138e5 = this.A06.get(i2);
        c1368Fq.A0q(this.A04);
        c1368Fq.A0p(c2138e5, this.A0B, this.A09, this.A0D, this.A05, this.A00, this.A02, this.A01);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1648Qq
    public final int A0B() {
        return this.A06.size();
    }

    public final void A0O(int i2, int i3, int i4) {
        boolean needsUpdate = i2 != this.A00;
        this.A00 = i2;
        this.A02 = i3;
        this.A01 = i4;
        if (needsUpdate) {
            A0G();
        }
    }

    public final void A0P(C2245fp c2245fp) {
        this.A04 = c2245fp;
    }
}
