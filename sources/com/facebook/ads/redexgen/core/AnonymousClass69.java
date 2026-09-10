package com.facebook.ads.redexgen.core;

import android.util.SparseArray;
import java.util.ArrayList;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.69, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class AnonymousClass69 {
    public SparseArray<AnonymousClass68> A00 = new SparseArray<>();
    public int A01 = 0;

    private final long A00(long j, long j2) {
        if (j == 0) {
            return j2;
        }
        return ((j / 4) * 3) + (j2 / 4);
    }

    private AnonymousClass68 A01(int i) {
        AnonymousClass68 anonymousClass68 = this.A00.get(i);
        if (anonymousClass68 == null) {
            AnonymousClass68 anonymousClass69 = new AnonymousClass68();
            this.A00.put(i, anonymousClass69);
            return anonymousClass69;
        }
        return anonymousClass68;
    }

    private final void A02() {
        for (int i = 0; i < i; i++) {
            this.A00.valueAt(i).A03.clear();
        }
    }

    public final C6K A03(int i) {
        AnonymousClass68 anonymousClass68 = this.A00.get(i);
        if (anonymousClass68 != null && !anonymousClass68.A03.isEmpty()) {
            ArrayList<C6K> arrayList = anonymousClass68.A03;
            return arrayList.remove(arrayList.size() - 1);
        }
        return null;
    }

    public final void A04() {
        this.A01--;
    }

    public final void A05(int i, long j) {
        AnonymousClass68 anonymousClass68A01 = A01(i);
        anonymousClass68A01.A01 = A00(anonymousClass68A01.A01, j);
    }

    public final void A06(int i, long j) {
        AnonymousClass68 anonymousClass68A01 = A01(i);
        anonymousClass68A01.A02 = A00(anonymousClass68A01.A02, j);
    }

    public final void A07(AbstractC04805q abstractC04805q) {
        this.A01++;
    }

    public final void A08(AbstractC04805q abstractC04805q, AbstractC04805q abstractC04805q2, boolean z) {
        if (abstractC04805q != null) {
            A04();
        }
        if (!z && this.A01 == 0) {
            A02();
        }
        if (abstractC04805q2 != null) {
            A07(abstractC04805q2);
        }
    }

    public final void A09(C6K c6k) {
        int iA0H = c6k.A0H();
        ArrayList<C6K> arrayList = A01(iA0H).A03;
        int i = this.A00.get(iA0H).A00;
        int viewType = arrayList.size();
        if (i <= viewType) {
            return;
        }
        c6k.A0Q();
        arrayList.add(c6k);
    }

    public final boolean A0A(int i, long j, long j2) {
        long j3 = A01(i).A01;
        return j3 == 0 || j + j3 < j2;
    }

    public final boolean A0B(int i, long j, long j2) {
        long j3 = A01(i).A02;
        return j3 == 0 || j + j3 < j2;
    }
}
