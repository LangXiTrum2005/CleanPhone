package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.ads.formats.NativeAd;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class zzbjs extends NativeAd.AdChoicesInfo {
    private final zzbjr zza;
    private final List zzb = new ArrayList();
    private String zzc;

    public zzbjs(zzbjr zzbjrVar) {
        IBinder iBinder;
        this.zza = zzbjrVar;
        try {
            this.zzc = zzbjrVar.zzb();
        } catch (RemoteException e2) {
            com.google.android.gms.ads.internal.util.client.zzo.zzg("", e2);
            this.zzc = "";
        }
        try {
            for (Object obj : zzbjrVar.zzc()) {
                zzbjy zzbjwVar = null;
                if ((obj instanceof IBinder) && (iBinder = (IBinder) obj) != null) {
                    IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
                    zzbjwVar = iInterfaceQueryLocalInterface instanceof zzbjy ? (zzbjy) iInterfaceQueryLocalInterface : new zzbjw(iBinder);
                }
                if (zzbjwVar != null) {
                    this.zzb.add(new zzbjz(zzbjwVar));
                }
            }
        } catch (RemoteException e3) {
            com.google.android.gms.ads.internal.util.client.zzo.zzg("", e3);
        }
    }

    @Override // com.google.android.gms.ads.formats.NativeAd.AdChoicesInfo
    public final List<NativeAd.Image> getImages() {
        return this.zzb;
    }

    @Override // com.google.android.gms.ads.formats.NativeAd.AdChoicesInfo
    public final CharSequence getText() {
        return this.zzc;
    }
}
