package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class zzcxv implements zzddq, zzdjd {
    private zzbyt zza;
    private final Context zzc;
    private final zzfnr zzd;
    private final VersionInfoParcel zze;
    private final Executor zzf;
    private boolean zzg = false;
    private boolean zzh = false;
    private final AtomicBoolean zzb = new AtomicBoolean();

    public zzcxv(Context context, zzfnr zzfnrVar, VersionInfoParcel versionInfoParcel, Executor executor) {
        this.zzc = context;
        this.zzd = zzfnrVar;
        this.zze = versionInfoParcel;
        this.zzf = executor;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x003a  */
    public final void zzc() {
        zzbyt zzbytVar;
        int i2;
        zzbsf zzbsfVarZzb;
        if (!this.zzb.getAndSet(true)) {
            if (((Boolean) zzbik.zzo.zze()).booleanValue()) {
                i2 = 2;
            } else {
                i2 = 3;
                if (!((Boolean) zzbik.zzp.zze()).booleanValue()) {
                    if (((Boolean) zzbik.zzn.zze()).booleanValue()) {
                        try {
                            String strOptString = new JSONObject(com.google.android.gms.ads.internal.zzt.zzh().zzo().zzi().zzd()).optString("local_flag_write");
                            if (TextUtils.equals(strOptString, "client")) {
                                i2 = 2;
                            } else if (!TextUtils.equals(strOptString, NotificationCompat.CATEGORY_SERVICE)) {
                                i2 = 1;
                            }
                        } catch (JSONException unused) {
                        }
                    } else {
                        i2 = 1;
                    }
                }
            }
            int i3 = i2 - 1;
            if (i3 == 1) {
                zzbsfVarZzb = com.google.android.gms.ads.internal.zzt.zzr().zzb(this.zzc, VersionInfoParcel.forPackage(), this.zzd);
            } else if (i3 == 2) {
                zzbsfVarZzb = com.google.android.gms.ads.internal.zzt.zzr().zza(this.zzc, VersionInfoParcel.forPackage(), this.zzd);
            }
            zzbrz zzbrzVar = zzbsc.zza;
            this.zza = new zzbyw(this.zzc, zzbsfVarZzb.zza("google.afma.sdkConstants.getSdkConstants", zzbrzVar, zzbrzVar), this.zze, this.zzf);
            this.zzg = true;
        }
        if (this.zzg && (zzbytVar = this.zza) != null) {
            ListenableFuture listenableFutureZzb = zzbytVar.zzb();
            if (!this.zzh && ((Boolean) zzbic.zzi.zze()).booleanValue()) {
                listenableFutureZzb.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcxu
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        this.zza.zzf();
                    }
                }, this.zzf);
            }
            zzcdr.zza(listenableFutureZzb, "persistFlagsClient");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdjd
    public final void zzd(com.google.android.gms.ads.nonagon.signalgeneration.zzbj zzbjVar) {
        zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzddq
    public final void zzdO(zzbza zzbzaVar) {
        zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzddq
    public final void zzdP(zzfic zzficVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzdjd
    public final void zze(String str) {
        zzc();
    }

    public final /* synthetic */ void zzf() {
        zzbfv.zze(this.zzc);
        this.zzh = true;
    }
}
