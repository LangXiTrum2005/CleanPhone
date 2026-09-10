package com.google.android.gms.ads.internal.util.client;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
final class zzc extends Thread {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f10970a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f10971b;

    public zzc(zzf zzfVar, Context context, String str) {
        this.f10970a = context;
        this.f10971b = str;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        new zzu(this.f10970a, null).zzc(this.f10971b, null);
    }
}
