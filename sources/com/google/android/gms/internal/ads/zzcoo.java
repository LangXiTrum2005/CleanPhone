package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class zzcoo extends com.google.android.gms.ads.internal.client.zzda {
    private final Context zza;
    private final VersionInfoParcel zzb;
    private final zzduu zzc;
    private final zzeji zzd;
    private final zzepk zze;
    private final zzdzp zzf;
    private final zzcbw zzg;
    private final zzduz zzh;
    private final zzeak zzi;
    private final zzbje zzj;
    private final zzfnr zzk;
    private final zzfjg zzl;
    private final zzcxv zzm;
    private final zzdxe zzn;
    private boolean zzo = false;
    private final Long zzp = Long.valueOf(com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime());

    public zzcoo(Context context, VersionInfoParcel versionInfoParcel, zzduu zzduuVar, zzeji zzejiVar, zzepk zzepkVar, zzdzp zzdzpVar, zzcbw zzcbwVar, zzduz zzduzVar, zzeak zzeakVar, zzbje zzbjeVar, zzfnr zzfnrVar, zzfjg zzfjgVar, zzcxv zzcxvVar, zzdxe zzdxeVar) {
        this.zza = context;
        this.zzb = versionInfoParcel;
        this.zzc = zzduuVar;
        this.zzd = zzejiVar;
        this.zze = zzepkVar;
        this.zzf = zzdzpVar;
        this.zzg = zzcbwVar;
        this.zzh = zzduzVar;
        this.zzi = zzeakVar;
        this.zzj = zzbjeVar;
        this.zzk = zzfnrVar;
        this.zzl = zzfjgVar;
        this.zzm = zzcxvVar;
        this.zzn = zzdxeVar;
    }

    public final void zzb() {
        if (com.google.android.gms.ads.internal.zzt.zzh().zzo().zzJ()) {
            String strZzL = com.google.android.gms.ads.internal.zzt.zzh().zzo().zzL();
            if (com.google.android.gms.ads.internal.zzt.zzo().zze(this.zza, strZzL, this.zzb.afmaVersion)) {
                return;
            }
            com.google.android.gms.ads.internal.zzt.zzh().zzo().zzK(false);
            com.google.android.gms.ads.internal.zzt.zzh().zzo().zzM("");
        }
    }

    public final /* synthetic */ void zzc() {
        zzfjp.zza(this.zza, true);
    }

    public final /* synthetic */ void zzd() {
        com.google.android.gms.ads.internal.zzt.zzn().zza(this.zza, this.zzn);
    }

    @Override // com.google.android.gms.ads.internal.client.zzdb
    public final synchronized void zze() {
        if (this.zzo) {
            int i2 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("Mobile ads is initialized already.");
            return;
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzcX)).booleanValue()) {
            com.google.android.gms.ads.internal.client.zzbb.zzc();
        }
        Context context = this.zza;
        zzbgk.zza(context);
        com.google.android.gms.ads.internal.zzt.zzh().zze(context, this.zzb, this.zzn);
        this.zzm.zzc();
        com.google.android.gms.ads.internal.zzt.zzj().zza(context);
        this.zzo = true;
        this.zzf.zzc();
        this.zze.zza();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzeS)).booleanValue()) {
            this.zzh.zza();
        }
        this.zzi.zza();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzkA)).booleanValue()) {
            zzcdo.zza.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcon
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzb();
                }
            });
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzmo)).booleanValue()) {
            zzcdo.zza.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcok
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzx();
                }
            });
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzdM)).booleanValue()) {
            zzcdo.zza.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcoi
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzc();
                }
            });
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzfx)).booleanValue()) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzfy)).booleanValue()) {
                zzcdo.zza.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcoj
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        this.zza.zzd();
                    }
                });
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzdb
    public final synchronized void zzf(float f) {
        com.google.android.gms.ads.internal.zzt.zzi().zza(f);
    }

    @Override // com.google.android.gms.ads.internal.client.zzdb
    public final synchronized void zzg(String str) {
        Context context = this.zza;
        zzbgk.zza(context);
        if (!TextUtils.isEmpty(str)) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzeQ)).booleanValue()) {
                com.google.android.gms.ads.internal.zzt.zzl().zza(context, this.zzb, str, null, this.zzk, null, null, this.zzi.zzs());
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzdb
    public final synchronized void zzh(boolean z2) {
        com.google.android.gms.ads.internal.zzt.zzi().zzc(z2);
    }

    @Override // com.google.android.gms.ads.internal.client.zzdb
    public final void zzi(IObjectWrapper iObjectWrapper, String str) {
        if (iObjectWrapper == null) {
            int i2 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzf("Wrapped context is null. Failed to open debug menu.");
            return;
        }
        Context context = (Context) ObjectWrapper.unwrap(iObjectWrapper);
        if (context == null) {
            int i3 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzf("Context is null. Failed to open debug menu.");
        } else {
            com.google.android.gms.ads.internal.util.zzat zzatVar = new com.google.android.gms.ads.internal.util.zzat(context);
            zzatVar.zzc(str);
            zzatVar.zzd(this.zzb.afmaVersion);
            zzatVar.zzb();
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzdb
    public final void zzj(String str, IObjectWrapper iObjectWrapper) {
        String strZzt;
        Runnable runnable;
        Context context = this.zza;
        zzbgk.zza(context);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzeX)).booleanValue()) {
            try {
                com.google.android.gms.ads.internal.zzt.zzc();
                strZzt = com.google.android.gms.ads.internal.util.zzs.zzt(context);
            } catch (RemoteException | RuntimeException e2) {
                com.google.android.gms.ads.internal.zzt.zzh().zzg(e2, "NonagonMobileAdsSettingManager_AppId");
                strZzt = "";
            }
        } else {
            strZzt = "";
        }
        boolean z2 = true;
        String str2 = true == TextUtils.isEmpty(strZzt) ? str : strZzt;
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        boolean zBooleanValue = ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzeQ)).booleanValue();
        zzbgb zzbgbVar = zzbgk.zzbw;
        boolean zBooleanValue2 = zBooleanValue | ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgbVar)).booleanValue();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgbVar)).booleanValue()) {
            final Runnable runnable2 = (Runnable) ObjectWrapper.unwrap(iObjectWrapper);
            runnable = new Runnable() { // from class: com.google.android.gms.internal.ads.zzcol
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzgyw zzgywVar = zzcdo.zzf;
                    final zzcoo zzcooVar = this.zza;
                    final Runnable runnable3 = runnable2;
                    zzgywVar.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcom
                        @Override // java.lang.Runnable
                        public final /* synthetic */ void run() {
                            zzcooVar.zzy(runnable3);
                        }
                    });
                }
            };
        } else {
            runnable = null;
            z2 = zBooleanValue2;
        }
        Runnable runnable3 = runnable;
        if (z2) {
            com.google.android.gms.ads.internal.zzt.zzl().zza(this.zza, this.zzb, str2, runnable3, this.zzk, this.zzn, this.zzp, this.zzi.zzs());
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzdb
    public final synchronized float zzk() {
        return com.google.android.gms.ads.internal.zzt.zzi().zzb();
    }

    @Override // com.google.android.gms.ads.internal.client.zzdb
    public final synchronized boolean zzl() {
        return com.google.android.gms.ads.internal.zzt.zzi().zzd();
    }

    @Override // com.google.android.gms.ads.internal.client.zzdb
    public final String zzm() {
        return this.zzb.afmaVersion;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdb
    public final void zzn(String str) {
        this.zze.zze(str);
    }

    @Override // com.google.android.gms.ads.internal.client.zzdb
    public final void zzo(zzbsz zzbszVar) throws RemoteException {
        this.zzl.zzc(zzbszVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzdb
    public final void zzp(zzbpt zzbptVar) throws RemoteException {
        this.zzf.zzb(zzbptVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzdb
    public final List zzq() throws RemoteException {
        return this.zzf.zzd();
    }

    @Override // com.google.android.gms.ads.internal.client.zzdb
    public final void zzr(com.google.android.gms.ads.internal.client.zzfv zzfvVar) throws RemoteException {
        this.zzg.zzb(this.zza, zzfvVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzdb
    public final void zzs() {
        this.zzf.zza();
    }

    @Override // com.google.android.gms.ads.internal.client.zzdb
    public final void zzt(com.google.android.gms.ads.internal.client.zzdn zzdnVar) throws RemoteException {
        this.zzi.zzo(zzdnVar, zzeaj.API);
    }

    @Override // com.google.android.gms.ads.internal.client.zzdb
    public final void zzu(boolean z2) throws RemoteException {
        try {
            Context context = this.zza;
            zzfzg.zza(context).zzb(z2);
            if (z2) {
                return;
            }
            try {
                if (context.getSharedPreferences("query_info_shared_prefs", 0).edit().clear().commit()) {
                    return;
                } else {
                    throw new IOException("Failed to remove query_info_shared_prefs");
                }
            } catch (IOException e2) {
                com.google.android.gms.ads.internal.zzt.zzh().zzg(e2, "clearStorageOnGpidPubDisable_scar");
                return;
            }
            throw new RemoteException(e.getMessage());
        } catch (IOException e3) {
            throw new RemoteException(e3.getMessage());
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzdb
    public final void zzv(String str) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzkM)).booleanValue()) {
            com.google.android.gms.ads.internal.zzt.zzh().zzt(str);
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzdb
    public final synchronized void zzw() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzcW)).booleanValue()) {
            com.google.android.gms.ads.internal.zzt.zzr().zzc();
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzcX)).booleanValue()) {
                com.google.android.gms.ads.internal.client.zzbb.zzd();
            }
        }
    }

    public final /* synthetic */ void zzx() {
        this.zzj.zza(new zzbxz());
    }

    public final /* synthetic */ void zzy(Runnable runnable) {
        Preconditions.checkMainThread("Adapters must be initialized on the main thread.");
        Map mapZzf = com.google.android.gms.ads.internal.zzt.zzh().zzo().zzi().zzf();
        if (mapZzf.isEmpty()) {
            return;
        }
        if (runnable != null) {
            try {
                runnable.run();
            } catch (Throwable th) {
                int i2 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzj("Could not initialize rewarded ads.", th);
                return;
            }
        }
        if (this.zzc.zzc()) {
            HashMap map = new HashMap();
            Iterator it = mapZzf.values().iterator();
            while (it.hasNext()) {
                for (zzbss zzbssVar : ((zzbst) it.next()).zza) {
                    String str = zzbssVar.zzb;
                    for (String str2 : zzbssVar.zza) {
                        if (!map.containsKey(str2)) {
                            map.put(str2, new ArrayList());
                        }
                        if (str != null) {
                            ((List) map.get(str2)).add(str);
                        }
                    }
                }
            }
            JSONObject jSONObject = new JSONObject();
            for (Map.Entry entry : map.entrySet()) {
                String str3 = (String) entry.getKey();
                try {
                    zzejj zzejjVarZza = this.zzd.zza(str3, jSONObject);
                    if (zzejjVarZza != null) {
                        zzfji zzfjiVar = (zzfji) zzejjVarZza.zzb;
                        if (!zzfjiVar.zzn() && zzfjiVar.zzq()) {
                            zzfjiVar.zzr(this.zza, (zzekw) zzejjVarZza.zzc, (List) entry.getValue());
                            StringBuilder sb = new StringBuilder(String.valueOf(str3).length() + 45);
                            sb.append("Initialized rewarded video mediation adapter ");
                            sb.append(str3);
                            String string = sb.toString();
                            int i3 = com.google.android.gms.ads.internal.util.zze.zza;
                            com.google.android.gms.ads.internal.util.client.zzo.zzd(string);
                        }
                    }
                } catch (zzfir e2) {
                    String strS = android.support.v4.media.a.s(new StringBuilder(String.valueOf(str3).length() + 56), "Failed to initialize rewarded video mediation adapter \"", str3, "\"");
                    int i4 = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzj(strS, e2);
                }
            }
        }
    }
}
