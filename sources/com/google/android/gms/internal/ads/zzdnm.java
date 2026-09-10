package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.view.View;
import androidx.collection.SimpleArrayMap;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.common.util.concurrent.ListenableFuture;
import com.p004ironsource.d9;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class zzdnm {
    private int zza;
    private com.google.android.gms.ads.internal.client.zzed zzb;
    private zzbjr zzc;
    private View zzd;
    private List zze;
    private com.google.android.gms.ads.internal.client.zzez zzg;
    private Bundle zzh;
    private zzcir zzi;
    private zzcir zzj;
    private zzcir zzk;
    private zzejb zzl;
    private ListenableFuture zzm;
    private zzcdt zzn;
    private View zzo;
    private View zzp;
    private IObjectWrapper zzq;
    private double zzr;
    private zzbjy zzs;
    private zzbjy zzt;
    private String zzu;
    private float zzx;
    private String zzy;
    private final SimpleArrayMap zzv = new SimpleArrayMap(0);
    private final SimpleArrayMap zzw = new SimpleArrayMap(0);
    private List zzf = Collections.EMPTY_LIST;

    public static zzdnm zzaf(zzbto zzbtoVar) {
        try {
            return zzak(zzam(zzbtoVar.zzn(), zzbtoVar), zzbtoVar.zzo(), (View) zzal(zzbtoVar.zzp()), zzbtoVar.zze(), zzbtoVar.zzf(), zzbtoVar.zzg(), zzbtoVar.zzs(), zzbtoVar.zzi(), (View) zzal(zzbtoVar.zzq()), zzbtoVar.zzr(), zzbtoVar.zzl(), zzbtoVar.zzm(), zzbtoVar.zzk(), zzbtoVar.zzh(), zzbtoVar.zzj(), zzbtoVar.zzz());
        } catch (RemoteException e2) {
            int i2 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Failed to get native ad assets from unified ad mapper", e2);
            return null;
        }
    }

    public static zzdnm zzag(zzbtl zzbtlVar) {
        try {
            zzdnl zzdnlVarZzam = zzam(zzbtlVar.zzs(), null);
            zzbjr zzbjrVarZzt = zzbtlVar.zzt();
            View view = (View) zzal(zzbtlVar.zzr());
            String strZze = zzbtlVar.zze();
            List listZzf = zzbtlVar.zzf();
            String strZzg = zzbtlVar.zzg();
            Bundle bundleZzp = zzbtlVar.zzp();
            String strZzi = zzbtlVar.zzi();
            View view2 = (View) zzal(zzbtlVar.zzu());
            IObjectWrapper iObjectWrapperZzv = zzbtlVar.zzv();
            String strZzj = zzbtlVar.zzj();
            zzbjy zzbjyVarZzh = zzbtlVar.zzh();
            zzdnm zzdnmVar = new zzdnm();
            zzdnmVar.zza = 1;
            zzdnmVar.zzb = zzdnlVarZzam;
            zzdnmVar.zzc = zzbjrVarZzt;
            zzdnmVar.zzd = view;
            zzdnmVar.zzs("headline", strZze);
            zzdnmVar.zze = listZzf;
            zzdnmVar.zzs("body", strZzg);
            zzdnmVar.zzh = bundleZzp;
            zzdnmVar.zzs("call_to_action", strZzi);
            zzdnmVar.zzo = view2;
            zzdnmVar.zzq = iObjectWrapperZzv;
            zzdnmVar.zzs(d9.h.F0, strZzj);
            zzdnmVar.zzt = zzbjyVarZzh;
            return zzdnmVar;
        } catch (RemoteException e2) {
            int i2 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Failed to get native ad from content ad mapper", e2);
            return null;
        }
    }

    public static zzdnm zzah(zzbtk zzbtkVar) {
        try {
            zzdnl zzdnlVarZzam = zzam(zzbtkVar.zzt(), null);
            zzbjr zzbjrVarZzv = zzbtkVar.zzv();
            View view = (View) zzal(zzbtkVar.zzu());
            String strZze = zzbtkVar.zze();
            List listZzf = zzbtkVar.zzf();
            String strZzg = zzbtkVar.zzg();
            Bundle bundleZzr = zzbtkVar.zzr();
            String strZzi = zzbtkVar.zzi();
            View view2 = (View) zzal(zzbtkVar.zzw());
            IObjectWrapper iObjectWrapperZzx = zzbtkVar.zzx();
            String strZzk = zzbtkVar.zzk();
            String strZzl = zzbtkVar.zzl();
            double dZzj = zzbtkVar.zzj();
            zzbjy zzbjyVarZzh = zzbtkVar.zzh();
            try {
                zzdnm zzdnmVar = new zzdnm();
                zzdnmVar.zza = 2;
                zzdnmVar.zzb = zzdnlVarZzam;
                zzdnmVar.zzc = zzbjrVarZzv;
                zzdnmVar.zzd = view;
                zzdnmVar.zzs("headline", strZze);
                zzdnmVar.zze = listZzf;
                zzdnmVar.zzs("body", strZzg);
                zzdnmVar.zzh = bundleZzr;
                zzdnmVar.zzs("call_to_action", strZzi);
                zzdnmVar.zzo = view2;
                zzdnmVar.zzq = iObjectWrapperZzx;
                zzdnmVar.zzs(d9.h.f24716U, strZzk);
                zzdnmVar.zzs("price", strZzl);
                zzdnmVar.zzr = dZzj;
                zzdnmVar.zzs = zzbjyVarZzh;
                return zzdnmVar;
            } catch (RemoteException e2) {
                e = e2;
                int i2 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzj("Failed to get native ad from app install ad mapper", e);
                return 0;
            }
        } catch (RemoteException e3) {
            e = e3;
        }
    }

    public static zzdnm zzai(zzbtk zzbtkVar) {
        try {
            return zzak(zzam(zzbtkVar.zzt(), null), zzbtkVar.zzv(), (View) zzal(zzbtkVar.zzu()), zzbtkVar.zze(), zzbtkVar.zzf(), zzbtkVar.zzg(), zzbtkVar.zzr(), zzbtkVar.zzi(), (View) zzal(zzbtkVar.zzw()), zzbtkVar.zzx(), zzbtkVar.zzk(), zzbtkVar.zzl(), zzbtkVar.zzj(), zzbtkVar.zzh(), null, 0.0f);
        } catch (RemoteException e2) {
            int i2 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Failed to get native ad assets from app install ad mapper", e2);
            return null;
        }
    }

    public static zzdnm zzaj(zzbtl zzbtlVar) {
        try {
            return zzak(zzam(zzbtlVar.zzs(), null), zzbtlVar.zzt(), (View) zzal(zzbtlVar.zzr()), zzbtlVar.zze(), zzbtlVar.zzf(), zzbtlVar.zzg(), zzbtlVar.zzp(), zzbtlVar.zzi(), (View) zzal(zzbtlVar.zzu()), zzbtlVar.zzv(), null, null, -1.0d, zzbtlVar.zzh(), zzbtlVar.zzj(), 0.0f);
        } catch (RemoteException e2) {
            int i2 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Failed to get native ad assets from content ad mapper", e2);
            return null;
        }
    }

    private static zzdnm zzak(com.google.android.gms.ads.internal.client.zzed zzedVar, zzbjr zzbjrVar, View view, String str, List list, String str2, Bundle bundle, String str3, View view2, IObjectWrapper iObjectWrapper, String str4, String str5, double d, zzbjy zzbjyVar, String str6, float f) {
        zzdnm zzdnmVar = new zzdnm();
        zzdnmVar.zza = 6;
        zzdnmVar.zzb = zzedVar;
        zzdnmVar.zzc = zzbjrVar;
        zzdnmVar.zzd = view;
        zzdnmVar.zzs("headline", str);
        zzdnmVar.zze = list;
        zzdnmVar.zzs("body", str2);
        zzdnmVar.zzh = bundle;
        zzdnmVar.zzs("call_to_action", str3);
        zzdnmVar.zzo = view2;
        zzdnmVar.zzq = iObjectWrapper;
        zzdnmVar.zzs(d9.h.f24716U, str4);
        zzdnmVar.zzs("price", str5);
        zzdnmVar.zzr = d;
        zzdnmVar.zzs = zzbjyVar;
        zzdnmVar.zzs(d9.h.F0, str6);
        zzdnmVar.zzu(f);
        return zzdnmVar;
    }

    private static Object zzal(IObjectWrapper iObjectWrapper) {
        if (iObjectWrapper == null) {
            return null;
        }
        return ObjectWrapper.unwrap(iObjectWrapper);
    }

    private static zzdnl zzam(com.google.android.gms.ads.internal.client.zzed zzedVar, zzbto zzbtoVar) {
        if (zzedVar == null) {
            return null;
        }
        return new zzdnl(zzedVar, zzbtoVar);
    }

    public final synchronized View zzA() {
        return this.zzd;
    }

    public final synchronized String zzB() {
        return zzw("headline");
    }

    public final synchronized List zzC() {
        return this.zze;
    }

    public final zzbjy zzD() {
        List list = this.zze;
        if (list == null || list.isEmpty()) {
            return null;
        }
        Object obj = this.zze.get(0);
        if (obj instanceof IBinder) {
            return zzbjx.zzh((IBinder) obj);
        }
        return null;
    }

    public final synchronized List zzE() {
        return this.zzf;
    }

    public final synchronized com.google.android.gms.ads.internal.client.zzez zzF() {
        return this.zzg;
    }

    public final synchronized String zzG() {
        return zzw("body");
    }

    public final synchronized Bundle zzH() {
        try {
            if (this.zzh == null) {
                this.zzh = new Bundle();
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.zzh;
    }

    public final synchronized String zzI() {
        return zzw("call_to_action");
    }

    public final synchronized View zzJ() {
        return this.zzo;
    }

    public final synchronized View zzK() {
        return this.zzp;
    }

    public final synchronized IObjectWrapper zzL() {
        return this.zzq;
    }

    public final synchronized String zzM() {
        return zzw(d9.h.f24716U);
    }

    public final synchronized String zzN() {
        return zzw("price");
    }

    public final synchronized double zzO() {
        return this.zzr;
    }

    public final synchronized zzbjy zzP() {
        return this.zzs;
    }

    public final synchronized String zzQ() {
        return zzw(d9.h.F0);
    }

    public final synchronized zzbjy zzR() {
        return this.zzt;
    }

    public final synchronized String zzS() {
        return this.zzu;
    }

    public final synchronized zzcir zzT() {
        return this.zzi;
    }

    public final synchronized zzcir zzU() {
        return this.zzj;
    }

    public final synchronized boolean zzV() {
        return this.zzj != null;
    }

    public final synchronized zzcir zzW() {
        return this.zzk;
    }

    public final synchronized ListenableFuture zzX() {
        return this.zzm;
    }

    public final synchronized zzcdt zzY() {
        return this.zzn;
    }

    public final synchronized zzejb zzZ() {
        return this.zzl;
    }

    public final synchronized void zza(int i2) {
        this.zza = i2;
    }

    public final synchronized SimpleArrayMap zzaa() {
        return this.zzv;
    }

    public final synchronized float zzab() {
        return this.zzx;
    }

    public final synchronized String zzac() {
        return this.zzy;
    }

    public final synchronized SimpleArrayMap zzad() {
        return this.zzw;
    }

    public final synchronized void zzae() {
        try {
            zzcir zzcirVar = this.zzi;
            if (zzcirVar != null) {
                zzcirVar.destroy();
                this.zzi = null;
            }
            zzcir zzcirVar2 = this.zzj;
            if (zzcirVar2 != null) {
                zzcirVar2.destroy();
                this.zzj = null;
            }
            zzcir zzcirVar3 = this.zzk;
            if (zzcirVar3 != null) {
                zzcirVar3.destroy();
                this.zzk = null;
            }
            ListenableFuture listenableFuture = this.zzm;
            if (listenableFuture != null) {
                listenableFuture.cancel(false);
                this.zzm = null;
            }
            zzcdt zzcdtVar = this.zzn;
            if (zzcdtVar != null) {
                zzcdtVar.cancel(false);
                this.zzn = null;
            }
            this.zzl = null;
            this.zzv.clear();
            this.zzw.clear();
            this.zzb = null;
            this.zzc = null;
            this.zzd = null;
            this.zze = null;
            this.zzh = null;
            this.zzo = null;
            this.zzp = null;
            this.zzq = null;
            this.zzs = null;
            this.zzt = null;
            this.zzu = null;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void zzb(com.google.android.gms.ads.internal.client.zzed zzedVar) {
        this.zzb = zzedVar;
    }

    public final synchronized void zzc(zzbjr zzbjrVar) {
        this.zzc = zzbjrVar;
    }

    public final synchronized void zzd(List list) {
        this.zze = list;
    }

    public final synchronized void zze(List list) {
        this.zzf = list;
    }

    public final synchronized void zzf(com.google.android.gms.ads.internal.client.zzez zzezVar) {
        this.zzg = zzezVar;
    }

    public final synchronized void zzg(View view) {
        this.zzo = view;
    }

    public final synchronized void zzh(View view) {
        this.zzp = view;
    }

    public final synchronized void zzi(double d) {
        this.zzr = d;
    }

    public final synchronized void zzj(zzbjy zzbjyVar) {
        this.zzs = zzbjyVar;
    }

    public final synchronized void zzk(zzbjy zzbjyVar) {
        this.zzt = zzbjyVar;
    }

    public final synchronized void zzl(String str) {
        this.zzu = str;
    }

    public final synchronized void zzm(zzcir zzcirVar) {
        this.zzi = zzcirVar;
    }

    public final synchronized void zzn(zzcir zzcirVar) {
        this.zzj = zzcirVar;
    }

    public final synchronized void zzo(zzcir zzcirVar) {
        this.zzk = zzcirVar;
    }

    public final synchronized void zzp(ListenableFuture listenableFuture) {
        this.zzm = listenableFuture;
    }

    public final synchronized void zzq(zzejb zzejbVar) {
        this.zzl = zzejbVar;
    }

    public final synchronized void zzr(zzcdt zzcdtVar) {
        this.zzn = zzcdtVar;
    }

    public final synchronized void zzs(String str, String str2) {
        try {
            if (str2 == null) {
                this.zzw.remove(str);
            } else {
                this.zzw.put(str, str2);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void zzt(String str, zzbjj zzbjjVar) {
        try {
            if (zzbjjVar == null) {
                this.zzv.remove(str);
            } else {
                this.zzv.put(str, zzbjjVar);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void zzu(float f) {
        this.zzx = f;
    }

    public final synchronized void zzv(String str) {
        this.zzy = str;
    }

    public final synchronized String zzw(String str) {
        return (String) this.zzw.get(str);
    }

    public final synchronized int zzx() {
        return this.zza;
    }

    public final synchronized com.google.android.gms.ads.internal.client.zzed zzy() {
        return this.zzb;
    }

    public final synchronized zzbjr zzz() {
        return this.zzc;
    }
}
