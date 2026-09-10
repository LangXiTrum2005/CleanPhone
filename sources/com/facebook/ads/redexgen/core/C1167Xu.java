package com.facebook.ads.redexgen.core;

import java.util.Comparator;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Xu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1167Xu {
    public static final Comparator<C1167Xu> A02 = new Comparator() { // from class: com.facebook.ads.redexgen.X.Xt
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return Integer.compare(((C1167Xu) obj).A01.A00, ((C1167Xu) obj2).A01.A00);
        }
    };
    public final int A00;
    public final C1168Xv A01;

    public C1167Xu(C1168Xv c1168Xv, int i) {
        this.A01 = c1168Xv;
        this.A00 = i;
    }
}
