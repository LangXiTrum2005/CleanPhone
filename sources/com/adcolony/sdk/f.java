package com.adcolony.sdk;

/* JADX INFO: loaded from: classes.dex */
class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f9137a;

    public synchronized void a(long j) {
        if (!this.f9137a) {
            try {
                wait(j);
            } catch (InterruptedException unused) {
            }
        }
    }

    public synchronized void a(boolean z2) {
        this.f9137a = z2;
        if (z2) {
            notifyAll();
        }
    }

    public boolean a() {
        return this.f9137a;
    }
}
