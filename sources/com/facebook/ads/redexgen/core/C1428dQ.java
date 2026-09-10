package com.facebook.ads.redexgen.core;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.dQ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1428dQ {
    public final CopyOnWriteArrayList<C1427dP> A00 = new CopyOnWriteArrayList<>();

    public final void A00(int i, long j, long j2) {
        Iterator<C1427dP> it = this.A00.iterator();
        if (it.hasNext()) {
            it.next();
            C1427dP.A02(null);
            throw null;
        }
    }
}
