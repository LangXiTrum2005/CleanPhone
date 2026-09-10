package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.IBinder;
import android.text.TextUtils;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class zzfgy implements zzfgw {
    private final Context zza;
    private final int zzp;
    private long zzb = 0;
    private long zzc = -1;
    private boolean zzd = false;
    private int zzq = 2;
    private int zzr = 2;
    private int zze = 0;
    private String zzf = "";
    private String zzg = "";
    private String zzh = "";
    private String zzi = "";
    private zzfhm zzj = zzfhm.SCAR_REQUEST_TYPE_UNSPECIFIED;
    private String zzk = "";
    private String zzl = "";
    private String zzm = "";
    private boolean zzn = false;
    private boolean zzo = false;

    public zzfgy(Context context, int i) {
        this.zza = context;
        this.zzp = i;
    }

    public final synchronized zzfgy zzA() {
        this.zzc = com.google.android.gms.ads.internal.zzv.zzC().elapsedRealtime();
        return this;
    }

    public final synchronized zzfgy zzK(int i) {
        this.zzq = i;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfgw
    public final /* bridge */ /* synthetic */ zzfgw zza(com.google.android.gms.ads.internal.client.zze zzeVar) {
        zzr(zzeVar);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfgw
    public final /* bridge */ /* synthetic */ zzfgw zzb(zzfbz zzfbzVar) {
        zzs(zzfbzVar);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfgw
    public final /* bridge */ /* synthetic */ zzfgw zzc(String str) {
        zzt(str);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfgw
    public final /* bridge */ /* synthetic */ zzfgw zzd(String str) {
        zzu(str);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfgw
    public final /* bridge */ /* synthetic */ zzfgw zze(String str) {
        zzv(str);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfgw
    public final /* bridge */ /* synthetic */ zzfgw zzf(zzfhm zzfhmVar) {
        zzw(zzfhmVar);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfgw
    public final /* bridge */ /* synthetic */ zzfgw zzg(boolean z) {
        zzx(z);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfgw
    public final /* bridge */ /* synthetic */ zzfgw zzh(Throwable th) {
        zzy(th);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfgw
    public final /* bridge */ /* synthetic */ zzfgw zzi() {
        zzz();
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfgw
    public final /* bridge */ /* synthetic */ zzfgw zzj() {
        zzA();
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfgw
    public final synchronized boolean zzk() {
        return this.zzo;
    }

    @Override // com.google.android.gms.internal.ads.zzfgw
    public final boolean zzl() {
        return !TextUtils.isEmpty(this.zzh);
    }

    @Override // com.google.android.gms.internal.ads.zzfgw
    @Nullable
    public final synchronized zzfha zzm() {
        try {
            zzfgz zzfgzVar = null;
            if (this.zzn) {
                return null;
            }
            this.zzn = true;
            if (!this.zzo) {
                zzz();
            }
            if (this.zzc < 0) {
                zzA();
            }
            return new zzfha(this, zzfgzVar);
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfgw
    public final /* bridge */ /* synthetic */ zzfgw zzn(int i) {
        zzK(i);
        return this;
    }

    public final synchronized zzfgy zzr(com.google.android.gms.ads.internal.client.zze zzeVar) {
        try {
            IBinder iBinder = zzeVar.zze;
            if (iBinder != null) {
                zzcvm zzcvmVar = (zzcvm) iBinder;
                String strZzk = zzcvmVar.zzk();
                if (!TextUtils.isEmpty(strZzk)) {
                    this.zzf = strZzk;
                }
                String strZzi = zzcvmVar.zzi();
                if (!TextUtils.isEmpty(strZzi)) {
                    this.zzg = strZzi;
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return this;
    }

    public final synchronized zzfgy zzs(zzfbz zzfbzVar) {
        try {
            if (!TextUtils.isEmpty(zzfbzVar.zzb.zzb)) {
                this.zzf = zzfbzVar.zzb.zzb;
            }
            for (zzfbo zzfboVar : zzfbzVar.zza) {
                if (!TextUtils.isEmpty(zzfboVar.zzab)) {
                    this.zzg = zzfboVar.zzab;
                    break;
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return this;
    }

    public final synchronized zzfgy zzt(String str) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zziI)).booleanValue()) {
            this.zzm = str;
        }
        return this;
    }

    public final synchronized zzfgy zzu(String str) {
        this.zzh = str;
        return this;
    }

    public final synchronized zzfgy zzv(String str) {
        this.zzi = str;
        return this;
    }

    public final synchronized zzfgy zzw(zzfhm zzfhmVar) {
        this.zzj = zzfhmVar;
        return this;
    }

    public final synchronized zzfgy zzx(boolean z) {
        this.zzd = z;
        return this;
    }

    public final synchronized zzfgy zzy(Throwable th) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zziI)).booleanValue()) {
            this.zzl = zzbuh.zzf(th);
            this.zzk = (String) zzfvc.zzb(zzfty.zzc('\n')).zzd(zzbuh.zze(th)).iterator().next();
        }
        return this;
    }

    public final synchronized zzfgy zzz() {
        Configuration configuration;
        this.zze = com.google.android.gms.ads.internal.zzv.zzr().zzm(this.zza);
        Resources resources = this.zza.getResources();
        int i = 2;
        if (resources != null && (configuration = resources.getConfiguration()) != null) {
            i = configuration.orientation == 2 ? 4 : 3;
        }
        this.zzr = i;
        this.zzb = com.google.android.gms.ads.internal.zzv.zzC().elapsedRealtime();
        this.zzo = true;
        return this;
    }
}
