package com.facebook.ads.redexgen.core;

import android.view.View;
import android.view.ViewGroup;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class ZT extends View {

    @Nullable
    public ZS A00;

    public ZT(C2300gi c2300gi, ZS zs) {
        super(c2300gi);
        this.A00 = zs;
        setLayoutParams(new ViewGroup.LayoutParams(0, 0));
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i2) {
        ZS zs = this.A00;
    }
}
