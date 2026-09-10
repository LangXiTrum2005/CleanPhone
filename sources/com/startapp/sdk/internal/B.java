package com.startapp.sdk.internal;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class B implements Runnable {
    public final /* synthetic */ int X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final /* synthetic */ al f40768Y;

    public /* synthetic */ B(al alVar, int i2) {
        this.X = i2;
        this.f40768Y = alVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.X) {
            case 0:
                al.d(this.f40768Y);
                break;
            case 1:
                al.g(this.f40768Y);
                break;
            case 2:
                this.f40768Y.d();
                break;
            case 3:
                this.f40768Y.f();
                break;
            case 4:
                this.f40768Y.f();
                break;
            default:
                al.a(this.f40768Y);
                break;
        }
    }
}
