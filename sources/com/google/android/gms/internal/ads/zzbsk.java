package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.ads.nativead.NativeAd;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class zzbsk extends NativeAd.AdChoicesInfo {
    private final List zza = new ArrayList();
    private String zzb;

    public zzbsk(zzbfp zzbfpVar) {
        try {
            this.zzb = zzbfpVar.zzg();
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzh("", e);
            this.zzb = "";
        }
        try {
            for (Object obj : zzbfpVar.zzh()) {
                zzbfw zzbfwVarZzg = obj instanceof IBinder ? zzbfv.zzg((IBinder) obj) : null;
                if (zzbfwVarZzg != null) {
                    this.zza.add(new zzbsm(zzbfwVarZzg));
                }
            }
        } catch (RemoteException e2) {
            com.google.android.gms.ads.internal.util.client.zzo.zzh("", e2);
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd.AdChoicesInfo
    public final List<NativeAd.Image> getImages() {
        return this.zza;
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd.AdChoicesInfo
    public final CharSequence getText() {
        return this.zzb;
    }
}
