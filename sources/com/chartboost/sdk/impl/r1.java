package com.chartboost.sdk.impl;

/* JADX INFO: loaded from: classes3.dex */
public class r1 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q1 f14984b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f14985c;

    public r1(q1 q1Var, boolean z2, int i2) {
        this.f14984b = q1Var;
        this.f14985c = z2;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f14984b.a(this.f14985c);
    }
}
