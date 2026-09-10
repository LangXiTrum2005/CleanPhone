package com.google.firebase.concurrent;

import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class i implements Callable {
    public final /* synthetic */ int X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final /* synthetic */ Runnable f20271Y;

    public /* synthetic */ i(Runnable runnable, int i2) {
        this.X = i2;
        this.f20271Y = runnable;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.X) {
            case 0:
                this.f20271Y.run();
                break;
            default:
                this.f20271Y.run();
                break;
        }
        return null;
    }
}
