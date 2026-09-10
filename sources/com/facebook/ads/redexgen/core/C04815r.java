package com.facebook.ads.redexgen.core;

import android.database.Observable;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.5r, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C04815r extends Observable<AbstractC04825s> {
    public final void A00() {
        for (int size = this.mObservers.size() - 1; size >= 0; size--) {
            ((AbstractC04825s) this.mObservers.get(size)).A00();
        }
    }
}
