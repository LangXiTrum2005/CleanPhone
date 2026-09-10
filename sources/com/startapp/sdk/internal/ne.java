package com.startapp.sdk.internal;

/* JADX INFO: loaded from: classes6.dex */
public final class ne implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ hj f41273a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f41274b;

    public ne(hj hjVar, String str) {
        this.f41273a = hjVar;
        this.f41274b = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        hj hjVar = this.f41273a;
        String str = this.f41274b;
        pe peVar = hjVar.f41068a;
        if (peVar != null) {
            peVar.a(str);
        }
    }
}
