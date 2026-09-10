package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.ads.nativead.NativeAd;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class zzbwf extends NativeAd.AdChoicesInfo {
    private final List zza = new ArrayList();
    private String zzb;

    public zzbwf(zzbjr zzbjrVar) {
        try {
            this.zzb = zzbjrVar.zzb();
        } catch (RemoteException e2) {
            com.google.android.gms.ads.internal.util.client.zzo.zzg("", e2);
            this.zzb = "";
        }
        try {
            for (Object obj : zzbjrVar.zzc()) {
                zzbjy zzbjyVarZzh = obj instanceof IBinder ? zzbjx.zzh((IBinder) obj) : null;
                if (zzbjyVarZzh != null) {
                    this.zza.add(new zzbwh(zzbjyVarZzh));
                }
            }
        } catch (RemoteException e3) {
            com.google.android.gms.ads.internal.util.client.zzo.zzg("", e3);
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
