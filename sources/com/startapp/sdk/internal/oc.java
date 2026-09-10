package com.startapp.sdk.internal;

/* JADX INFO: loaded from: classes6.dex */
public final class oc implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ pc f41309a;

    public oc(pc pcVar) {
        this.f41309a = pcVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.f41309a.c();
        } catch (Throwable th) {
            g9.a(th);
        }
    }
}
