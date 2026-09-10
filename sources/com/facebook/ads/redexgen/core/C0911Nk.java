package com.facebook.ads.redexgen.core;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Nk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C0911Nk implements InterfaceC2082oW {
    public final /* synthetic */ C0910Nj A00;

    public C0911Nk(C0910Nj c0910Nj) {
        this.A00 = c0910Nj;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2082oW
    public final void AF0() {
        ArrayList arrayList;
        synchronized (this.A00.A07) {
            arrayList = new ArrayList(this.A00.A07.size());
            for (Runnable runnable : this.A00.A07.values()) {
                if (runnable != null) {
                    arrayList.add(runnable);
                }
            }
            this.A00.A07.clear();
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
        if (this.A00.A00 != null) {
            this.A00.A00.AF0();
        }
    }
}
