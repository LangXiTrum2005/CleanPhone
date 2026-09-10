package com.google.android.gms.ads.nonagon.signalgeneration;

import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.internal.ads.zzbgk;
import com.google.android.gms.internal.ads.zzbid;
import com.google.android.gms.internal.ads.zzccg;
import com.google.android.gms.internal.ads.zzccn;
import com.google.android.gms.internal.ads.zzfne;
import com.google.android.gms.internal.ads.zzfno;
import com.google.android.gms.internal.ads.zzgyj;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
final class zzad implements zzgyj {
    final /* synthetic */ ListenableFuture zza;
    final /* synthetic */ zzccn zzb;
    final /* synthetic */ zzccg zzc;
    final /* synthetic */ zzfne zzd;
    final /* synthetic */ zzau zze;

    public zzad(zzau zzauVar, ListenableFuture listenableFuture, zzccn zzccnVar, zzccg zzccgVar, zzfne zzfneVar) {
        this.zza = listenableFuture;
        this.zzb = zzccnVar;
        this.zzc = zzccgVar;
        this.zzd = zzfneVar;
        Objects.requireNonNull(zzauVar);
        this.zze = zzauVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgyj
    public final void zza(Throwable th) {
        String message = th.getMessage();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zziG)).booleanValue()) {
            com.google.android.gms.ads.internal.zzt.zzh().zzh(th, "SignalGeneratorImpl.generateSignals");
        } else {
            com.google.android.gms.ads.internal.zzt.zzh().zzg(th, "SignalGeneratorImpl.generateSignals");
        }
        zzfno zzfnoVarZzy = zzau.zzy(this.zza, this.zzb);
        if (((Boolean) zzbid.zze.zze()).booleanValue() && zzfnoVarZzy != null) {
            zzfne zzfneVar = this.zzd;
            zzfneVar.zzj(th);
            zzfneVar.zzd(false);
            zzfnoVarZzy.zza(zzfneVar);
            zzfnoVarZzy.zzh();
        }
        zzccg zzccgVar = this.zzc;
        if (zzccgVar == null) {
            return;
        }
        try {
            if (!"Unknown format is no longer supported.".equals(message)) {
                StringBuilder sb = new StringBuilder(String.valueOf(message).length() + 16);
                sb.append("Internal error. ");
                sb.append(message);
                message = sb.toString();
            }
            zzccgVar.zzb(message);
        } catch (RemoteException e2) {
            int i2 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzg("", e2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgyj
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        ListenableFuture listenableFuture = this.zza;
        AtomicBoolean atomicBooleanZzN = this.zze.zzN();
        zzbj zzbjVar = (zzbj) obj;
        zzfno zzfnoVarZzy = zzau.zzy(listenableFuture, this.zzb);
        atomicBooleanZzN.set(true);
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zziA)).booleanValue()) {
            try {
                zzccg zzccgVar = this.zzc;
                if (zzccgVar != null) {
                    zzccgVar.zzb("QueryInfo generation has been disabled.");
                }
            } catch (RemoteException e2) {
                String strConcat = "QueryInfo generation has been disabled.".concat(e2.toString());
                int i2 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzf(strConcat);
            }
            if (!((Boolean) zzbid.zze.zze()).booleanValue() || zzfnoVarZzy == null) {
                return;
            }
            zzfne zzfneVar = this.zzd;
            zzfneVar.zzk("QueryInfo generation has been disabled.");
            zzfneVar.zzd(false);
            zzfnoVarZzy.zza(zzfneVar);
            zzfnoVarZzy.zzh();
            return;
        }
        try {
            if (zzbjVar == null) {
                zzccg zzccgVar2 = this.zzc;
                if (zzccgVar2 != null) {
                    zzccgVar2.zzc(null, null, null);
                }
                zzfne zzfneVar2 = this.zzd;
                zzfneVar2.zzd(true);
                if (!((Boolean) zzbid.zze.zze()).booleanValue() || zzfnoVarZzy == null) {
                    return;
                }
                zzfnoVarZzy.zza(zzfneVar2);
                zzfnoVarZzy.zzh();
                return;
            }
            try {
                if (TextUtils.isEmpty((!TextUtils.isEmpty(zzbjVar.zzc) ? new JSONObject(zzbjVar.zzc) : new JSONObject(zzbjVar.zzb)).optString("request_id", ""))) {
                    int i3 = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzi("The request ID is empty in request JSON.");
                    zzccg zzccgVar3 = this.zzc;
                    if (zzccgVar3 != null) {
                        zzccgVar3.zzb("Internal error: request ID is empty in request JSON.");
                    }
                    zzfne zzfneVar3 = this.zzd;
                    zzfneVar3.zzk("Request ID empty");
                    zzfneVar3.zzd(false);
                    if (!((Boolean) zzbid.zze.zze()).booleanValue() || zzfnoVarZzy == null) {
                        return;
                    }
                    zzfnoVarZzy.zza(zzfneVar3);
                    zzfnoVarZzy.zzh();
                    return;
                }
                Bundle bundle = zzbjVar.zzf;
                zzau zzauVar = this.zze;
                if (zzauVar.zzF() && bundle != null && bundle.getInt(zzauVar.zzH(), -1) == -1) {
                    bundle.putInt(zzauVar.zzH(), zzauVar.zzI().get());
                }
                if (zzauVar.zzE() && bundle != null && TextUtils.isEmpty(bundle.getString(zzauVar.zzG()))) {
                    if (TextUtils.isEmpty(zzauVar.zzK())) {
                        zzauVar.zzL(com.google.android.gms.ads.internal.zzt.zzc().zze(zzauVar.zzz(), zzauVar.zzJ().afmaVersion));
                    }
                    bundle.putString(zzauVar.zzG(), zzauVar.zzK());
                }
                zzccg zzccgVar4 = this.zzc;
                if (zzccgVar4 != null) {
                    if (TextUtils.isEmpty(zzbjVar.zzc)) {
                        zzccgVar4.zzc(zzbjVar.zza, zzbjVar.zzb, bundle);
                    } else {
                        zzccgVar4.zzc(zzbjVar.zza, zzbjVar.zzc, bundle);
                    }
                }
                this.zzd.zzd(true);
                if (!((Boolean) zzbid.zze.zze()).booleanValue() || zzfnoVarZzy == null) {
                    return;
                }
                zzfnoVarZzy.zza(this.zzd);
                zzfnoVarZzy.zzh();
            } catch (JSONException e3) {
                int i4 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzi("Failed to create JSON object from the request string.");
                zzccg zzccgVar5 = this.zzc;
                if (zzccgVar5 != null) {
                    String string = e3.toString();
                    StringBuilder sb = new StringBuilder(string.length() + 33);
                    sb.append("Internal error for request JSON: ");
                    sb.append(string);
                    zzccgVar5.zzb(sb.toString());
                }
                zzfne zzfneVar4 = this.zzd;
                zzfneVar4.zzj(e3);
                zzfneVar4.zzd(false);
                com.google.android.gms.ads.internal.zzt.zzh().zzg(e3, "SignalGeneratorImpl.generateSignals.onSuccess");
                if (!((Boolean) zzbid.zze.zze()).booleanValue() || zzfnoVarZzy == null) {
                    return;
                }
                zzfnoVarZzy.zza(zzfneVar4);
                zzfnoVarZzy.zzh();
            }
        } catch (RemoteException e4) {
            zzfne zzfneVar5 = this.zzd;
            zzfneVar5.zzj(e4);
            zzfneVar5.zzd(false);
            int i5 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzg("", e4);
            com.google.android.gms.ads.internal.zzt.zzh().zzg(e4, "SignalGeneratorImpl.generateSignals.onSuccess");
        } finally {
            if (((Boolean) zzbid.zze.zze()).booleanValue() && zzfnoVarZzy != null) {
                zzfnoVarZzy.zza(this.zzd);
                zzfnoVarZzy.zzh();
            }
        }
    }
}
