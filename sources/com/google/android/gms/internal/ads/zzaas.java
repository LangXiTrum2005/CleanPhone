package com.google.android.gms.internal.ads;

import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes4.dex */
final /* synthetic */ class zzaas implements zzdr {
    static final /* synthetic */ zzaas zza = new zzaas();

    private /* synthetic */ zzaas() {
    }

    @Override // com.google.android.gms.internal.ads.zzdr
    public final /* synthetic */ void zza(Object obj) {
        ((ExecutorService) obj).shutdown();
    }
}
