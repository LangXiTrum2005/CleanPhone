package com.google.android.gms.internal.ads;

import android.content.Context;
import com.applovin.impl.Z;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.common.util.concurrent.ListenableFuture;
import com.p004ironsource.qt;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class zzels implements zzelm {
    private final zzdlv zza;
    private final zzgyw zzb;
    private final zzdqf zzc;
    private final zzfjj zzd;
    private final zzdsv zze;
    private final zzdwy zzf;
    private final VersionInfoParcel zzg;
    private final Context zzh;
    private final zzcbg zzi;

    public zzels(zzdlv zzdlvVar, zzgyw zzgywVar, zzdqf zzdqfVar, zzfjj zzfjjVar, zzdsv zzdsvVar, zzdwy zzdwyVar, VersionInfoParcel versionInfoParcel, Context context, zzcbg zzcbgVar) {
        this.zzg = versionInfoParcel;
        this.zzh = context;
        this.zzi = zzcbgVar;
        this.zza = zzdlvVar;
        this.zzb = zzgywVar;
        this.zzc = zzdqfVar;
        this.zzd = zzfjjVar;
        this.zze = zzdsvVar;
        this.zzf = zzdwyVar;
    }

    private final ListenableFuture zzg(final zzfic zzficVar, final zzfhr zzfhrVar, final JSONObject jSONObject) {
        com.google.android.gms.ads.internal.zzb zzbVar;
        zzcbk zzcbkVar;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzcL)).booleanValue()) {
            Z.t(this.zzf.zze(), zzdwm.RENDERING_WEBVIEW_CREATION_START.zza());
        }
        final ListenableFuture listenableFutureZzb = this.zzd.zzb();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzpa)).booleanValue()) {
            Context context = this.zzh;
            zzcbk zzcbkVarZza = zzdaf.zza(context, this.zzg, zzfhrVar, this.zzi);
            zzbVar = new com.google.android.gms.ads.internal.zzb(context, zzcbkVarZza, null);
            zzcbkVar = zzcbkVarZza;
        } else {
            zzbVar = new com.google.android.gms.ads.internal.zzb(this.zzh, null, null);
            zzcbkVar = null;
        }
        final com.google.android.gms.ads.internal.zzb zzbVar2 = zzbVar;
        final zzcbk zzcbkVar2 = zzcbkVar;
        final ListenableFuture listenableFutureZza = this.zzc.zza(zzficVar, zzfhrVar, jSONObject, zzbVar2, zzcbkVar2);
        return zzgym.zzo(listenableFutureZzb, listenableFutureZza).zza(new Callable() { // from class: com.google.android.gms.internal.ads.zzelq
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return this.zza.zzf(listenableFutureZza, listenableFutureZzb, zzficVar, zzfhrVar, jSONObject, zzbVar2, zzcbkVar2);
            }
        }, this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzejg
    public final boolean zza(zzfic zzficVar, zzfhr zzfhrVar) {
        zzfhw zzfhwVar = zzfhrVar.zzs;
        return (zzfhwVar == null || zzfhwVar.zzc == null) ? false : true;
    }

    @Override // com.google.android.gms.internal.ads.zzejg
    public final ListenableFuture zzb(final zzfic zzficVar, final zzfhr zzfhrVar) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzcK)).booleanValue()) {
            Z.t(this.zzf.zze(), zzdwm.RENDERING_NATIVE_ADS_NATIVE_JS_WEBVIEW_START.zza());
        }
        ListenableFuture listenableFutureZzb = this.zzd.zzb();
        zzgxu zzgxuVar = new zzgxu() { // from class: com.google.android.gms.internal.ads.zzelr
            @Override // com.google.android.gms.internal.ads.zzgxu
            public final /* synthetic */ ListenableFuture zza(Object obj) {
                return this.zza.zzc(zzfhrVar, (zzdsp) obj);
            }
        };
        zzgyw zzgywVar = this.zzb;
        return zzgym.zzj(zzgym.zzj(listenableFutureZzb, zzgxuVar, zzgywVar), new zzgxu() { // from class: com.google.android.gms.internal.ads.zzeln
            @Override // com.google.android.gms.internal.ads.zzgxu
            public final /* synthetic */ ListenableFuture zza(Object obj) {
                return this.zza.zzd(zzficVar, zzfhrVar, (JSONArray) obj);
            }
        }, zzgywVar);
    }

    public final /* synthetic */ ListenableFuture zzc(zzfhr zzfhrVar, final zzdsp zzdspVar) throws JSONException {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzcK)).booleanValue()) {
            Z.t(this.zzf.zze(), zzdwm.RENDERING_NATIVE_ADS_PREPROCESS_START.zza());
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("isNonagon", true);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzjS)).booleanValue() && PlatformVersion.isAtLeastR()) {
            jSONObject.put("skipDeepLinkValidation", true);
        }
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put(qt.f26623n, zzfhrVar.zzs.zzc);
        jSONObject2.put("sdk_params", jSONObject);
        return zzgym.zzj(zzdspVar.zzc("google.afma.nativeAds.preProcessJson", jSONObject2), new zzgxu() { // from class: com.google.android.gms.internal.ads.zzelo
            @Override // com.google.android.gms.internal.ads.zzgxu
            public final /* synthetic */ ListenableFuture zza(Object obj) {
                return this.zza.zze(zzdspVar, (JSONObject) obj);
            }
        }, this.zzb);
    }

    public final /* synthetic */ ListenableFuture zzd(zzfic zzficVar, zzfhr zzfhrVar, JSONArray jSONArray) {
        if (jSONArray.length() == 0) {
            return zzgym.zzc(new zzebr(3));
        }
        int i2 = zzficVar.zza.zza.zzl;
        if (i2 <= 1) {
            return zzgym.zzk(zzg(zzficVar, zzfhrVar, jSONArray.getJSONObject(0)), zzelp.zza, this.zzb);
        }
        int length = jSONArray.length();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzcM)).booleanValue()) {
            this.zzf.zzd("nsl", String.valueOf(length));
        }
        this.zzd.zza(Math.min(length, i2));
        ArrayList arrayList = new ArrayList(i2);
        for (int i3 = 0; i3 < i2; i3++) {
            if (i3 < length) {
                arrayList.add(zzg(zzficVar, zzfhrVar, jSONArray.getJSONObject(i3)));
            } else {
                arrayList.add(zzgym.zzc(new zzebr(3)));
            }
        }
        return zzgym.zza(arrayList);
    }

    public final /* synthetic */ ListenableFuture zze(zzdsp zzdspVar, JSONObject jSONObject) throws zzbru {
        this.zzd.zzc(zzgym.zza(zzdspVar));
        if (!jSONObject.optBoolean("success")) {
            throw new zzbru("process json failed");
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzcK)).booleanValue()) {
            Z.t(this.zzf.zze(), zzdwm.RENDERING_NATIVE_ADS_PREPROCESS_END.zza());
        }
        return zzgym.zza(jSONObject.getJSONObject("json").getJSONArray("ads"));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final /* synthetic */ zzdnh zzf(ListenableFuture listenableFuture, ListenableFuture listenableFuture2, zzfic zzficVar, zzfhr zzfhrVar, JSONObject jSONObject, com.google.android.gms.ads.internal.zzb zzbVar, zzcbk zzcbkVar) throws Throwable {
        zzdnm zzdnmVar = (zzdnm) listenableFuture.get();
        zzdsp zzdspVar = (zzdsp) listenableFuture2.get();
        zzbgb zzbgbVar = zzbgk.zzcL;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgbVar)).booleanValue()) {
            Z.t(this.zzf.zze(), zzdwm.RENDERING_WEBVIEW_CREATION_END.zza());
        }
        zzdnn zzdnnVarZzd = this.zza.zzd(new zzcwa(zzficVar, zzfhrVar, null), new zzdnx(zzdnmVar), new zzdmi(jSONObject, zzdspVar, zzbVar, zzcbkVar));
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgbVar)).booleanValue()) {
            long jCurrentTimeMillis = com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis();
            zzdwy zzdwyVar = this.zzf;
            zzdwyVar.zze().putLong(zzdwm.RENDERING_AD_COMPONENT_CREATION_END.zza(), jCurrentTimeMillis);
            zzdwyVar.zze().putLong(zzdwm.RENDERING_CONFIGURE_WEBVIEW_START.zza(), jCurrentTimeMillis);
        }
        zzdnnVarZzd.zzi().zzb();
        zzdnnVarZzd.zzj().zza(zzdspVar);
        zzdnnVarZzd.zzk().zza(zzdnmVar.zzT());
        zzdnnVarZzd.zzl().zza(this.zze, zzdnmVar.zzU());
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgbVar)).booleanValue()) {
            Z.t(this.zzf.zze(), zzdwm.RENDERING_CONFIGURE_WEBVIEW_END.zza());
        }
        return zzdnnVarZzd.zzh();
    }
}
