package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.IBinder;
import android.text.TextUtils;
import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public final class zzfng implements zzfne {
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
    private zzfnt zzj = zzfnt.SCAR_REQUEST_TYPE_UNSPECIFIED;
    private String zzk = "";
    private String zzl = "";
    private String zzm = "";
    private boolean zzn = false;
    private boolean zzo = false;

    public zzfng(Context context, int i2) {
        this.zza = context;
        this.zzp = i2;
    }

    public final /* synthetic */ long zzA() {
        return this.zzb;
    }

    public final /* synthetic */ long zzB() {
        return this.zzc;
    }

    public final /* synthetic */ boolean zzC() {
        return this.zzd;
    }

    public final /* synthetic */ int zzD() {
        return this.zze;
    }

    public final /* synthetic */ String zzE() {
        return this.zzf;
    }

    public final /* synthetic */ String zzF() {
        return this.zzg;
    }

    public final /* synthetic */ String zzG() {
        return this.zzh;
    }

    public final /* synthetic */ String zzH() {
        return this.zzi;
    }

    public final /* synthetic */ zzfnt zzI() {
        return this.zzj;
    }

    public final /* synthetic */ String zzJ() {
        return this.zzk;
    }

    public final /* synthetic */ String zzK() {
        return this.zzl;
    }

    public final /* synthetic */ String zzL() {
        return this.zzm;
    }

    public final synchronized zzfng zzM(int i2) {
        this.zzq = i2;
        return this;
    }

    public final /* synthetic */ int zzN() {
        return this.zzp;
    }

    public final /* synthetic */ int zzO() {
        return this.zzq;
    }

    public final /* synthetic */ int zzP() {
        return this.zzr;
    }

    @Override // com.google.android.gms.internal.ads.zzfne
    public final /* bridge */ /* synthetic */ zzfne zza() {
        zzq();
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfne
    public final synchronized boolean zzb() {
        return this.zzo;
    }

    @Override // com.google.android.gms.internal.ads.zzfne
    public final /* bridge */ /* synthetic */ zzfne zzc() {
        zzr();
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfne
    public final /* bridge */ /* synthetic */ zzfne zzd(boolean z2) {
        zzs(z2);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfne
    public final /* bridge */ /* synthetic */ zzfne zze(String str) {
        zzt(str);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfne
    public final /* bridge */ /* synthetic */ zzfne zzf(zzfnt zzfntVar) {
        zzu(zzfntVar);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfne
    public final /* bridge */ /* synthetic */ zzfne zzg(zzfib zzfibVar) {
        zzv(zzfibVar);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfne
    public final /* bridge */ /* synthetic */ zzfne zzh(com.google.android.gms.ads.internal.client.zze zzeVar) {
        zzw(zzeVar);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfne
    public final /* bridge */ /* synthetic */ zzfne zzi(String str) {
        zzx(str);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfne
    public final /* bridge */ /* synthetic */ zzfne zzj(Throwable th) {
        zzy(th);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfne
    public final /* bridge */ /* synthetic */ zzfne zzk(String str) {
        zzz(str);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfne
    public final boolean zzl() {
        return !TextUtils.isEmpty(this.zzh);
    }

    @Override // com.google.android.gms.internal.ads.zzfne
    public final synchronized zzfnh zzm() {
        try {
            if (this.zzn) {
                return null;
            }
            this.zzn = true;
            if (!this.zzo) {
                zzq();
            }
            if (this.zzc < 0) {
                zzr();
            }
            return new zzfnh(this, null);
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfne
    public final /* bridge */ /* synthetic */ zzfne zzp(int i2) {
        zzM(i2);
        return this;
    }

    public final synchronized zzfng zzq() {
        Configuration configuration;
        com.google.android.gms.ads.internal.util.zzz zzzVarZzf = com.google.android.gms.ads.internal.zzt.zzf();
        Context context = this.zza;
        this.zze = zzzVarZzf.zzm(context);
        Resources resources = context.getResources();
        int i2 = 2;
        if (resources != null && (configuration = resources.getConfiguration()) != null) {
            i2 = configuration.orientation == 2 ? 4 : 3;
        }
        this.zzr = i2;
        this.zzb = com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime();
        this.zzo = true;
        return this;
    }

    public final synchronized zzfng zzr() {
        this.zzc = com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime();
        return this;
    }

    public final synchronized zzfng zzs(boolean z2) {
        this.zzd = z2;
        return this;
    }

    public final synchronized zzfng zzt(String str) {
        this.zzi = str;
        return this;
    }

    public final synchronized zzfng zzu(zzfnt zzfntVar) {
        this.zzj = zzfntVar;
        return this;
    }

    public final synchronized zzfng zzv(zzfib zzfibVar) {
        try {
            String str = zzfibVar.zzb.zzb;
            if (!TextUtils.isEmpty(str)) {
                this.zzf = str;
            }
            Iterator it = zzfibVar.zza.iterator();
            while (it.hasNext()) {
                String str2 = ((zzfhr) it.next()).zzab;
                if (!TextUtils.isEmpty(str2)) {
                    this.zzg = str2;
                    break;
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return this;
    }

    public final synchronized zzfng zzw(com.google.android.gms.ads.internal.client.zze zzeVar) {
        try {
            IBinder iBinder = zzeVar.zze;
            if (iBinder != null) {
                zzdad zzdadVar = (zzdad) iBinder;
                String strZzk = zzdadVar.zzk();
                if (!TextUtils.isEmpty(strZzk)) {
                    this.zzf = strZzk;
                }
                String strZzf = zzdadVar.zzf();
                if (!TextUtils.isEmpty(strZzf)) {
                    this.zzg = strZzf;
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return this;
    }

    public final synchronized zzfng zzx(String str) {
        this.zzh = str;
        return this;
    }

    public final synchronized zzfng zzy(Throwable th) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzka)).booleanValue()) {
            this.zzl = zzbxv.zzf(th);
            this.zzk = (String) zzgqp.zza(zzgpo.zzc('\n')).zzd(zzbxv.zze(th)).iterator().next();
        }
        return this;
    }

    public final synchronized zzfng zzz(String str) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzka)).booleanValue()) {
            this.zzm = str;
        }
        return this;
    }
}
