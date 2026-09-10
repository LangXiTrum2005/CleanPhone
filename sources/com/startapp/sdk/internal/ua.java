package com.startapp.sdk.internal;

/* JADX INFO: loaded from: classes6.dex */
public final class ua implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ za f41540a;

    public ua(za zaVar) {
        this.f41540a = zaVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Runnable runnable = this.f41540a.f41772J;
        if (runnable != null) {
            runnable.run();
        }
    }
}
