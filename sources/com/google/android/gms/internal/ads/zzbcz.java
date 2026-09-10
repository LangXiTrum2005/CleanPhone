package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.admanager.AppEventListener;

/* JADX INFO: loaded from: classes4.dex */
public final class zzbcz extends com.google.android.gms.ads.internal.client.zzcn {
    private final AppEventListener zza;

    public zzbcz(AppEventListener appEventListener) {
        this.zza = appEventListener;
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final void zzb(String str, String str2) {
        this.zza.onAppEvent(str, str2);
    }

    public final AppEventListener zzc() {
        return this.zza;
    }
}
