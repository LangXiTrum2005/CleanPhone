package com.facebook.ads.redexgen.core;

import android.util.SparseBooleanArray;
import android.view.ViewGroup;
import java.util.List;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.h3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1650h3 extends AbstractC04805q<C1411d9> {
    public int A00;
    public int A01;
    public int A02;
    public DR A03;
    public JL A04;
    public String A05;
    public List<C0758Hc> A06;
    public final SparseBooleanArray A07 = new SparseBooleanArray();
    public final AbstractC1984md A08;
    public final C05357t A09;
    public final C1828k1 A0A;
    public final A7 A0B;
    public final C1744ie A0C;
    public final C0647Cv A0D;
    public final C0863Ld A0E;
    public final C1283b5 A0F;

    public C1650h3(C1828k1 c1828k1, List<C0758Hc> list, AbstractC1984md abstractC1984md, A7 a7, C1744ie c1744ie, DR dr, String str, C0863Ld c0863Ld, C1283b5 c1283b5) {
        this.A0A = c1828k1;
        this.A0B = a7;
        this.A0C = c1744ie;
        this.A09 = c1744ie.A11();
        this.A04 = c1744ie.A1B();
        this.A0D = c1744ie.A1A();
        this.A03 = dr;
        this.A08 = abstractC1984md;
        this.A06 = list;
        this.A05 = str;
        this.A0E = c0863Ld;
        this.A0F = c1283b5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.core.AbstractC04805q
    /* JADX INFO: renamed from: A01, reason: merged with bridge method [inline-methods] */
    public final C1411d9 A0D(ViewGroup viewGroup, int i) {
        return new C1411d9(FR.A00(new C0726Fw(this.A0A, this.A0B, this.A03, this.A08, null, this.A04, this.A0D).A0O(this.A0F).A0K(this.A0C).A0Q(), this.A0C, this.A05, this.A0E), this.A07, this.A04, this.A06.size(), this.A0A, this.A08.A1c());
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.core.AbstractC04805q
    /* JADX INFO: renamed from: A02, reason: merged with bridge method [inline-methods] */
    public final void A0E(C1411d9 c1411d9, int i) {
        C0758Hc c0758Hc = this.A06.get(i);
        c1411d9.A0k(this.A04);
        c1411d9.A0j(c0758Hc, this.A0B, this.A09, this.A0D, this.A05, this.A00, this.A02, this.A01);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC04805q
    public final int A0C() {
        return this.A06.size();
    }

    public final void A0G(int i, int i2, int i3) {
        boolean needsUpdate = i != this.A00;
        this.A00 = i;
        this.A02 = i2;
        this.A01 = i3;
        if (needsUpdate) {
            A06();
        }
    }

    public final void A0H(JL jl) {
        this.A04 = jl;
    }
}
