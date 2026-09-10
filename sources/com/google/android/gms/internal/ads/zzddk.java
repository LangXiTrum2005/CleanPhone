package com.google.android.gms.internal.ads;

import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes4.dex */
final class zzddk implements Runnable {
    private final WeakReference zza;

    @Override // java.lang.Runnable
    public final void run() {
        zzddl zzddlVar = (zzddl) this.zza.get();
        if (zzddlVar != null) {
            zzddlVar.zzs(zzddh.zza);
        }
    }
}
