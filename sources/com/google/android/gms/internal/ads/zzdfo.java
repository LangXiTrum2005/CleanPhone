package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.admanager.AppEventListener;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public final class zzdfo extends zzdgi implements zzbmf {
    public zzdfo(Set set) {
        super(set);
    }

    @Override // com.google.android.gms.internal.ads.zzbmf
    public final synchronized void zzb(final String str, final String str2) {
        zzs(new zzdgh() { // from class: com.google.android.gms.internal.ads.zzdfn
            @Override // com.google.android.gms.internal.ads.zzdgh
            public final /* synthetic */ void zza(Object obj) {
                ((AppEventListener) obj).onAppEvent(str, str2);
            }
        });
    }
}
