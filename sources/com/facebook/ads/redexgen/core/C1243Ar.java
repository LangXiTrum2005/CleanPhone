package com.facebook.ads.redexgen.core;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Ar, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C1243Ar implements InterfaceC2916rY {
    public final List<InterfaceC2917rZ> A00 = new ArrayList();

    @Override // com.facebook.ads.redexgen.core.InterfaceC2916rY
    public final InterfaceC2917rZ A6i(int i2) {
        this.A00.get(i2);
        return null;
    }

    @Override // java.lang.Iterable
    public final Iterator<InterfaceC2917rZ> iterator() {
        return this.A00.iterator();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2916rY
    public final int size() {
        return this.A00.size();
    }
}
