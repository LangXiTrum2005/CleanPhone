package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.formats.MediaView;
import com.google.android.gms.dynamic.ObjectWrapper;

/* JADX INFO: loaded from: classes4.dex */
public final class zzbkt {
    private final zzbks zza;

    public zzbkt(zzbks zzbksVar) {
        Context context;
        this.zza = zzbksVar;
        try {
            context = (Context) ObjectWrapper.unwrap(zzbksVar.zzm());
        } catch (RemoteException | NullPointerException e2) {
            com.google.android.gms.ads.internal.util.client.zzo.zzg("", e2);
            context = null;
        }
        if (context != null) {
            try {
                this.zza.zzn(ObjectWrapper.wrap(new MediaView(context)));
            } catch (RemoteException e3) {
                com.google.android.gms.ads.internal.util.client.zzo.zzg("", e3);
            }
        }
    }

    public final zzbks zza() {
        return this.zza;
    }

    public final String zzb() {
        try {
            return this.zza.zzh();
        } catch (RemoteException e2) {
            com.google.android.gms.ads.internal.util.client.zzo.zzg("", e2);
            return null;
        }
    }
}
