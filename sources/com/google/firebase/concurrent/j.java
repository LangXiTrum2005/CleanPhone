package com.google.firebase.concurrent;

import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class j implements Callable {
    public final /* synthetic */ int X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final /* synthetic */ Runnable f20272Y;
    public final /* synthetic */ Object Z;

    public /* synthetic */ j(int i2, Object obj, Runnable runnable) {
        this.X = i2;
        this.f20272Y = runnable;
        this.Z = obj;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.X) {
            case 0:
                this.f20272Y.run();
                break;
            default:
                this.f20272Y.run();
                break;
        }
        return this.Z;
    }
}
