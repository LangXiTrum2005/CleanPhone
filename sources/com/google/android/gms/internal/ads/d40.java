package com.google.android.gms.internal.ads;

import android.os.Process;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class d40 extends Thread {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Runnable f13383a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e40 f13384b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d40(e40 e40Var, Runnable runnable, String str, Runnable runnable2) {
        super(runnable, str);
        this.f13383a = runnable2;
        this.f13384b = e40Var;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        Process.setThreadPriority(this.f13384b.f13828b);
        this.f13383a.run();
    }
}
