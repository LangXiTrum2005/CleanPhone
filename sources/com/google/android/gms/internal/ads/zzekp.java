package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.ExecutionException;

/* JADX INFO: loaded from: classes4.dex */
public final class zzekp implements zzejm {
    private final Context zza;
    private final zzcuh zzb;
    private View zzc;
    private zzbti zzd;

    public zzekp(Context context, zzcuh zzcuhVar) {
        this.zza = context;
        this.zzb = zzcuhVar;
    }

    @Override // com.google.android.gms.internal.ads.zzejm
    public final void zza(zzfic zzficVar, zzfhr zzfhrVar, zzejj zzejjVar) throws zzfir {
        try {
            zzbuy zzbuyVar = (zzbuy) zzejjVar.zzb;
            zzbuyVar.zzo(zzfhrVar.zzZ);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zziY)).booleanValue() && zzfhrVar.zzag) {
                String str = zzfhrVar.zzU;
                String string = zzfhrVar.zzv.toString();
                zzfik zzfikVar = zzficVar.zza.zza;
                zzbuyVar.zzq(str, string, zzfikVar.zzd, ObjectWrapper.wrap(this.zza), new zzeko(this, zzejjVar, null), (zzbtf) zzejjVar.zzc, zzfikVar.zzf);
                return;
            }
            String str2 = zzfhrVar.zzU;
            String string2 = zzfhrVar.zzv.toString();
            zzfik zzfikVar2 = zzficVar.zza.zza;
            zzbuyVar.zzi(str2, string2, zzfikVar2.zzd, ObjectWrapper.wrap(this.zza), new zzeko(this, zzejjVar, null), (zzbtf) zzejjVar.zzc, zzfikVar2.zzf);
        } catch (RemoteException e2) {
            throw new zzfir(e2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.zzejm
    public final /* bridge */ /* synthetic */ Object zzb(zzfic zzficVar, final zzfhr zzfhrVar, final zzejj zzejjVar) throws zzfir, zzemv {
        final View view;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zziY)).booleanValue() && zzfhrVar.zzag) {
            try {
                view = (View) ObjectWrapper.unwrap(this.zzd.zze());
                boolean zZzf = this.zzd.zzf();
                if (view == null) {
                    throw new zzfir(new Exception("BannerRtbAdapterWrapper interscrollerView should not be null"));
                }
                if (zZzf) {
                    try {
                        view = (View) zzgym.zzj(zzgym.zza(null), new zzgxu() { // from class: com.google.android.gms.internal.ads.zzekm
                            @Override // com.google.android.gms.internal.ads.zzgxu
                            public final /* synthetic */ ListenableFuture zza(Object obj) {
                                return this.zza.zzc(view, zzfhrVar, obj);
                            }
                        }, zzcdo.zzf).get();
                    } catch (InterruptedException | ExecutionException e2) {
                        throw new zzfir(e2);
                    }
                }
            } catch (RemoteException e3) {
                throw new zzfir(e3);
            }
        } else {
            view = this.zzc;
        }
        zzctd zzctdVarZzf = this.zzb.zzf(new zzcwa(zzficVar, zzfhrVar, zzejjVar.zza), new zzctj(view, null, new zzcvi() { // from class: com.google.android.gms.internal.ads.zzekn
            @Override // com.google.android.gms.internal.ads.zzcvi
            public final /* synthetic */ com.google.android.gms.ads.internal.client.zzed zza() throws zzfir {
                try {
                    return ((zzbuy) zzejjVar.zzb).zzh();
                } catch (RemoteException e4) {
                    throw new zzfir(e4);
                }
            }
        }, (zzfhs) zzfhrVar.zzu.get(0)));
        zzctdVarZzf.zzk().zza(view);
        ((zzekv) zzejjVar.zzc).zzc(zzctdVarZzf.zzg());
        return zzctdVarZzf.zzi();
    }

    public final /* synthetic */ ListenableFuture zzc(View view, zzfhr zzfhrVar, Object obj) {
        return zzgym.zza(zzcuw.zza(this.zza, view, zzfhrVar));
    }

    public final /* synthetic */ void zzd(View view) {
        this.zzc = view;
    }

    public final /* synthetic */ void zze(zzbti zzbtiVar) {
        this.zzd = zzbtiVar;
    }
}
