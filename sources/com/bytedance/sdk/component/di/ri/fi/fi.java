package com.bytedance.sdk.component.di.ri.fi;

import java.util.UUID;

/* JADX INFO: loaded from: classes2.dex */
public abstract class fi implements Comparable<fi>, Runnable {
    private String ik;
    private int ri = 5;
    private String lr = UUID.randomUUID().toString() + "-" + String.valueOf(System.nanoTime());

    public fi(String str) {
        this.ik = str;
    }

    public void ri(int i) {
        this.ri = i;
    }

    public int ri() {
        return this.ri;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: ri, reason: merged with bridge method [inline-methods] */
    public int compareTo(fi fiVar) {
        if (ri() < fiVar.ri()) {
            return 1;
        }
        return ri() >= fiVar.ri() ? -1 : 0;
    }
}
