package com.facebook.ads.redexgen.core;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Nm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C0913Nm implements InterfaceC2095ol {
    public final List<InterfaceC2096om> A00 = new ArrayList();

    @Override // com.facebook.ads.redexgen.core.InterfaceC2095ol
    public final InterfaceC2096om A6Y(int i) {
        this.A00.get(i);
        return null;
    }

    @Override // java.lang.Iterable
    public final Iterator<InterfaceC2096om> iterator() {
        return this.A00.iterator();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2095ol
    public final int size() {
        return this.A00.size();
    }
}
