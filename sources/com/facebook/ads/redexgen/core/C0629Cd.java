package com.facebook.ads.redexgen.core;

import java.io.Closeable;
import java.io.IOException;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Cd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0629Cd implements Closeable {
    public C0628Cc A00;
    public boolean A01;
    public final C0627Cb A02;
    public final Runnable A03;

    public C0629Cd(long j, Runnable runnable) {
        this.A02 = new C0627Cb(j);
        this.A02.A02();
        this.A03 = runnable;
        this.A01 = false;
    }

    private final synchronized void A03() {
        if (this.A00 == null && !this.A01) {
            this.A00 = new C0628Cc(this);
        }
    }

    public final C0627Cb A04() {
        return this.A02;
    }

    public final synchronized void A05() {
        if (this.A01) {
            return;
        }
        if (this.A00 == null) {
            this.A00 = new C0628Cc(this);
        }
        this.A00.A00();
    }

    public final synchronized void A06() {
        if (this.A02.A05() && !this.A01) {
            A03();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        C0628Cc executing;
        synchronized (this) {
            this.A01 = true;
            executing = this.A00;
        }
        if (executing != null) {
            executing.close();
        }
    }
}
