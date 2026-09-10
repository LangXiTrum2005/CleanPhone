package com.facebook.ads.redexgen.core;

import android.database.DataSetObserver;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Ps, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C1626Ps extends DataSetObserver {
    public final /* synthetic */ Pv A00;

    public C1626Ps(Pv pv) {
        this.A00 = pv;
    }

    @Override // android.database.DataSetObserver
    public final void onChanged() {
        this.A00.A0e();
    }

    @Override // android.database.DataSetObserver
    public final void onInvalidated() {
        this.A00.A0e();
    }
}
