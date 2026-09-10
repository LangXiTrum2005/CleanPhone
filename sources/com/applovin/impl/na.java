package com.applovin.impl;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class na implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8864a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ y1 f8865b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f8866c;

    public /* synthetic */ na(y1 y1Var, String str, int i10) {
        this.f8864a = i10;
        this.f8865b = y1Var;
        this.f8866c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f8864a) {
            case 0:
                this.f8865b.b(this.f8866c);
                break;
            default:
                this.f8865b.c(this.f8866c);
                break;
        }
    }
}
