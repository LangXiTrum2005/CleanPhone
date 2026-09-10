package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.applovin.impl.Z;
import com.google.common.util.concurrent.ListenableFuture;
import com.p004ironsource.d9;
import com.p004ironsource.e9;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class zzdqf {
    private final zzgyw zza;
    private final zzdqu zzb;
    private final zzdqz zzc;
    private final zzdwy zzd;

    public zzdqf(zzgyw zzgywVar, zzdqu zzdquVar, zzdqz zzdqzVar, zzdwy zzdwyVar) {
        this.zza = zzgywVar;
        this.zzb = zzdquVar;
        this.zzc = zzdqzVar;
        this.zzd = zzdwyVar;
    }

    private final ListenableFuture zze(ListenableFuture listenableFuture, zzdwm zzdwmVar) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzcP)).booleanValue()) {
            zzgym.zzr(listenableFuture, new zzdqc(this, zzdwmVar), this.zza);
        }
        return listenableFuture;
    }

    private static final boolean zzf(JSONObject jSONObject) {
        return jSONObject.optInt("template_id") == 3;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x00f6  */
    public final ListenableFuture zza(final zzfic zzficVar, final zzfhr zzfhrVar, final JSONObject jSONObject, com.google.android.gms.ads.internal.zzb zzbVar, zzcbk zzcbkVar) {
        ListenableFuture listenableFutureZza;
        JSONArray jSONArrayOptJSONArray;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzcK)).booleanValue()) {
            Z.t(this.zzd.zze(), zzdwm.RENDERING_NATIVE_ASSETS_LOADING_START.zza());
        }
        final ListenableFuture listenableFutureSubmit = this.zza.submit(new Callable() { // from class: com.google.android.gms.internal.ads.zzdqe
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return this.zza.zzb(zzficVar, zzfhrVar, jSONObject);
            }
        });
        zze(listenableFutureSubmit, zzdwm.NATIVE_ASSETS_LOADING_BASIC_END);
        zzdqu zzdquVar = this.zzb;
        final ListenableFuture listenableFutureZzb = zzdquVar.zzb(jSONObject, "images", zzdwm.NATIVE_ASSETS_LOADING_IMAGE_START);
        zze(listenableFutureZzb, zzdwm.NATIVE_ASSETS_LOADING_IMAGE_END);
        zzfhu zzfhuVar = zzficVar.zzb.zzb;
        final ListenableFuture listenableFutureZzc = zzdquVar.zzc(jSONObject, "images", zzfhrVar, zzfhuVar, zzbVar, zzcbkVar);
        zze(listenableFutureZzc, zzdwm.NATIVE_ASSETS_LOADING_IMAGE_COMPOSITION_END);
        final ListenableFuture listenableFutureZza2 = zzdquVar.zza(jSONObject, "secondary_image", zzdwm.NATIVE_ASSETS_LOADING_LOGO_START);
        zze(listenableFutureZza2, zzdwm.NATIVE_ASSETS_LOADING_LOGO_END);
        final ListenableFuture listenableFutureZza3 = zzdquVar.zza(jSONObject, "app_icon", zzdwm.NATIVE_ASSETS_LOADING_ICON_START);
        zze(listenableFutureZza3, zzdwm.NATIVE_ASSETS_LOADING_ICON_END);
        final ListenableFuture listenableFutureZzd = zzdquVar.zzd(jSONObject, e9.ATTRIBUTION, zzdwm.NATIVE_ASSETS_LOADING_ATTRIBUTION_START);
        zze(listenableFutureZzd, zzdwm.NATIVE_ASSETS_LOADING_ATTRIBUTION_END);
        final ListenableFuture listenableFutureZzg = zzdquVar.zzg(jSONObject, zzfhrVar, zzfhuVar, zzbVar, zzcbkVar);
        zze(listenableFutureZzg, zzdwm.NATIVE_ASSETS_LOADING_VIDEO_END);
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzor)).booleanValue() || !jSONObject.has("video")) {
            listenableFutureZza = zzgym.zza(new Bundle());
            break;
        }
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("video");
        if (jSONObjectOptJSONObject.has("flags") && (jSONArrayOptJSONArray = jSONObjectOptJSONObject.optJSONArray("flags")) != null) {
            int i2 = 0;
            while (true) {
                if (i2 < jSONArrayOptJSONArray.length()) {
                    JSONObject jSONObjectOptJSONObject2 = jSONArrayOptJSONArray.optJSONObject(i2);
                    if (jSONObjectOptJSONObject2 == null || !jSONObjectOptJSONObject2.optString("key").equals("afma_video_player_type")) {
                        i2++;
                    } else {
                        try {
                            if (Integer.parseInt(jSONObjectOptJSONObject2.optString("value")) == 3) {
                                listenableFutureZza = this.zzb.zzf(listenableFutureZzg);
                                zze(listenableFutureZza, zzdwm.NATIVE_ASSETS_LOADING_MEDIA_END);
                                break;
                            }
                        } catch (NumberFormatException unused) {
                        }
                    }
                }
                listenableFutureZza = zzgym.zza(new Bundle());
                break;
            }
        }
        listenableFutureZza = zzgym.zza(new Bundle());
        break;
        final ListenableFuture listenableFutureZza4 = this.zzc.zza(jSONObject, "custom_assets");
        zze(listenableFutureZza4, zzdwm.NATIVE_ASSETS_LOADING_CUSTOM_END);
        final ListenableFuture listenableFutureZze = this.zzb.zze(jSONObject, zzbVar, zzcbkVar);
        zze(listenableFutureZze, zzdwm.NATIVE_ASSETS_LOADING_OMID_END);
        ArrayList arrayList = new ArrayList();
        arrayList.add(listenableFutureSubmit);
        arrayList.add(listenableFutureZzb);
        arrayList.add(listenableFutureZzc);
        arrayList.add(listenableFutureZza2);
        arrayList.add(listenableFutureZza3);
        arrayList.add(listenableFutureZzd);
        arrayList.add(listenableFutureZzg);
        arrayList.add(listenableFutureZza);
        arrayList.add(listenableFutureZza4);
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzgl)).booleanValue() || zzf(jSONObject)) {
            arrayList.add(listenableFutureZze);
        }
        final ListenableFuture listenableFuture = listenableFutureZza;
        return zzgym.zzn(arrayList).zza(new Callable() { // from class: com.google.android.gms.internal.ads.zzdqd
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return this.zza.zzc(listenableFutureSubmit, listenableFutureZzb, listenableFutureZza3, listenableFutureZza2, listenableFutureZzd, jSONObject, listenableFutureZzg, listenableFuture, listenableFutureZzc, listenableFutureZze, listenableFutureZza4);
            }
        }, this.zza);
    }

    public final /* synthetic */ zzdnm zzb(zzfic zzficVar, zzfhr zzfhrVar, JSONObject jSONObject) throws zzemv {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzcP)).booleanValue()) {
            Z.t(this.zzd.zze(), zzdwm.NATIVE_ASSETS_LOADING_BASIC_START.zza());
        }
        zzdnm zzdnmVar = new zzdnm();
        zzdnmVar.zza(jSONObject.optInt("template_id", -1));
        zzdnmVar.zzl(jSONObject.optString("custom_template_id"));
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("omid_settings");
        zzdnmVar.zzv(jSONObjectOptJSONObject != null ? jSONObjectOptJSONObject.optString("omid_partner_name") : null);
        zzfik zzfikVar = zzficVar.zza.zza;
        if (!zzfikVar.zzh.contains(Integer.toString(zzdnmVar.zzx()))) {
            int iZzx = zzdnmVar.zzx();
            throw new zzemv(1, androidx.datastore.preferences.protobuf.a.g(iZzx, "Invalid template ID: ", new StringBuilder(String.valueOf(iZzx).length() + 21)));
        }
        if (zzdnmVar.zzx() == 3) {
            if (zzdnmVar.zzS() == null) {
                throw new zzemv(1, "No custom template id for custom template ad response.");
            }
            if (!zzfikVar.zzi.contains(zzdnmVar.zzS())) {
                throw new zzemv(1, "Unexpected custom template id in the response.");
            }
        }
        zzdnmVar.zzi(jSONObject.optDouble("rating", -1.0d));
        String strOptString = jSONObject.optString("headline", null);
        if (zzfhrVar.zzM) {
            com.google.android.gms.ads.internal.zzt.zzc();
            String strZzD = com.google.android.gms.ads.internal.util.zzs.zzD();
            strOptString = android.support.v4.media.a.s(new StringBuilder(String.valueOf(strZzD).length() + 3 + String.valueOf(strOptString).length()), strZzD, " : ", strOptString);
        }
        zzdnmVar.zzs("headline", strOptString);
        zzdnmVar.zzs("body", jSONObject.optString("body", null));
        zzdnmVar.zzs("call_to_action", jSONObject.optString("call_to_action", null));
        zzdnmVar.zzs(d9.h.f24716U, jSONObject.optString(d9.h.f24716U, null));
        zzdnmVar.zzs("price", jSONObject.optString("price", null));
        zzdnmVar.zzs(d9.h.F0, jSONObject.optString(d9.h.F0, null));
        return zzdnmVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final /* synthetic */ zzdnm zzc(ListenableFuture listenableFuture, ListenableFuture listenableFuture2, ListenableFuture listenableFuture3, ListenableFuture listenableFuture4, ListenableFuture listenableFuture5, JSONObject jSONObject, ListenableFuture listenableFuture6, ListenableFuture listenableFuture7, ListenableFuture listenableFuture8, ListenableFuture listenableFuture9, ListenableFuture listenableFuture10) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzcK)).booleanValue()) {
            Z.t(this.zzd.zze(), zzdwm.RENDERING_NATIVE_ASSETS_LOADING_END.zza());
        }
        zzdnm zzdnmVar = (zzdnm) listenableFuture.get();
        zzdnmVar.zzd((List) listenableFuture2.get());
        zzdnmVar.zzj((zzbjy) listenableFuture3.get());
        zzdnmVar.zzk((zzbjy) listenableFuture4.get());
        zzdnmVar.zzc((zzbjr) listenableFuture5.get());
        zzdnmVar.zze(zzdqu.zzl(jSONObject));
        zzdnmVar.zzf(zzdqu.zzk(jSONObject));
        zzcir zzcirVar = (zzcir) listenableFuture6.get();
        if (zzcirVar != null) {
            zzdnmVar.zzm(zzcirVar);
            zzdnmVar.zzg(zzcirVar.zzE());
            zzdnmVar.zzb(zzcirVar.zzh());
        }
        zzdnmVar.zzH().putAll((Bundle) listenableFuture7.get());
        zzcir zzcirVar2 = (zzcir) listenableFuture8.get();
        if (zzcirVar2 != null) {
            zzdnmVar.zzn(zzcirVar2);
            zzdnmVar.zzh(zzcirVar2.zzE());
        }
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzgl)).booleanValue() || zzf(jSONObject)) {
            zzcir zzcirVar3 = (zzcir) listenableFuture9.get();
            if (zzcirVar3 != null) {
                zzdnmVar.zzo(zzcirVar3);
            }
        } else {
            zzdnmVar.zzp(listenableFuture9);
            zzdnmVar.zzr(new zzcdt());
        }
        for (zzdqw zzdqwVar : (List) listenableFuture10.get()) {
            if (zzdqwVar.zza != 1) {
                zzdnmVar.zzt(zzdqwVar.zzb, zzdqwVar.zzd);
            } else {
                zzdnmVar.zzs(zzdqwVar.zzb, zzdqwVar.zzc);
            }
        }
        return zzdnmVar;
    }

    public final /* synthetic */ zzdwy zzd() {
        return this.zzd;
    }
}
