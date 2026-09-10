package com.google.android.exoplayer2.util;

/* JADX INFO: loaded from: classes3.dex */
public class ConditionVariable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SystemClock f18898a = Clock.f18892a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f18899b;

    public ConditionVariable(int i2) {
    }

    public final synchronized void a() {
        while (!this.f18899b) {
            wait();
        }
    }

    public final synchronized void b() {
        boolean z2 = false;
        while (!this.f18899b) {
            try {
                wait();
            } catch (InterruptedException unused) {
                z2 = true;
            }
        }
        if (z2) {
            Thread.currentThread().interrupt();
        }
    }

    public final synchronized void c() {
        this.f18899b = false;
    }

    public final synchronized boolean d() {
        if (this.f18899b) {
            return false;
        }
        this.f18899b = true;
        notifyAll();
        return true;
    }
}
