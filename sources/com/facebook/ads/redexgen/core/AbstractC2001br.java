package com.facebook.ads.redexgen.core;

import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.br, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC2001br {
    public static final int A00 = YB.A00();

    public static void A00(C2300gi c2300gi, ViewGroup viewGroup, String str) {
        new LM(viewGroup, c2300gi).A07(str);
        View view = new View(c2300gi);
        view.setId(A00);
        view.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        YB.A0U(view, c2300gi);
        viewGroup.addView(view, 0);
    }
}
