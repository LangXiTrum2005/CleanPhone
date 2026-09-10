package com.facebook.ads.redexgen.core;

import android.view.View;
import java.util.Comparator;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Pu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C1628Pu implements Comparator<View> {
    /* JADX INFO: Access modifiers changed from: private */
    @Override // java.util.Comparator
    /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final int compare(View view, View view2) {
        C1622Po c1622Po = (C1622Po) view.getLayoutParams();
        C1622Po c1622Po2 = (C1622Po) view2.getLayoutParams();
        if (c1622Po.A05 != c1622Po2.A05) {
            return c1622Po.A05 ? 1 : -1;
        }
        return c1622Po.A02 - c1622Po2.A02;
    }
}
