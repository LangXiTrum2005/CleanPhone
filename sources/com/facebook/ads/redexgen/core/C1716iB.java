package com.facebook.ads.redexgen.core;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.iB, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1716iB implements InterfaceC0635Cj {
    public final Collection<String> A00;

    public C1716iB() {
        this.A00 = new ArrayList();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0635Cj
    public final void AGG(String str) {
        this.A00.add(str);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0635Cj
    public final void flush() {
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        Iterator<String> it = this.A00.iterator();
        while (it.hasNext()) {
            sb.append(it.next());
            sb.append('\n');
        }
        return sb.toString();
    }
}
