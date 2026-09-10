package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.text.TextUtils;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class zzdzy implements zzdan, zzddq, zzdcc {
    private final zzeak zza;
    private final String zzb;
    private final String zzc;
    private zzdad zzf;
    private com.google.android.gms.ads.internal.client.zze zzg;
    private JSONObject zzk;
    private JSONObject zzl;
    private boolean zzm;
    private boolean zzn;
    private boolean zzo;
    private String zzh = "";
    private String zzi = "";
    private String zzj = "";
    private int zzd = 0;
    private zzdzx zze = zzdzx.AD_REQUESTED;

    public zzdzy(zzeak zzeakVar, zzfik zzfikVar, String str) {
        this.zza = zzeakVar;
        this.zzc = str;
        this.zzb = zzfikVar.zzg;
    }

    private final JSONObject zzh(zzdad zzdadVar) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("winningAdapterClassName", zzdadVar.zze());
        jSONObject.put("responseSecsSinceEpoch", zzdadVar.zzc());
        jSONObject.put("responseId", zzdadVar.zzf());
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzkC)).booleanValue()) {
            String strZzd = zzdadVar.zzd();
            if (!TextUtils.isEmpty(strZzd)) {
                String strValueOf = String.valueOf(strZzd);
                int i2 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzd("Bidding data: ".concat(strValueOf));
                jSONObject.put("biddingData", new JSONObject(strZzd));
            }
        }
        if (!TextUtils.isEmpty(this.zzh)) {
            jSONObject.put("adRequestUrl", this.zzh);
        }
        if (!TextUtils.isEmpty(this.zzi)) {
            jSONObject.put("postBody", this.zzi);
        }
        if (!TextUtils.isEmpty(this.zzj)) {
            jSONObject.put("adResponseBody", this.zzj);
        }
        Object obj = this.zzk;
        if (obj != null) {
            jSONObject.put("adResponseHeaders", obj);
        }
        Object obj2 = this.zzl;
        if (obj2 != null) {
            jSONObject.put("transactionExtras", obj2);
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzkF)).booleanValue()) {
            jSONObject.put("hasExceededMemoryLimit", this.zzo);
        }
        JSONArray jSONArray = new JSONArray();
        for (com.google.android.gms.ads.internal.client.zzv zzvVar : zzdadVar.zzg()) {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("adapterClassName", zzvVar.zza);
            jSONObject2.put("latencyMillis", zzvVar.zzb);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzkD)).booleanValue()) {
                jSONObject2.put("credentials", com.google.android.gms.ads.internal.client.zzbb.zza().zzm(zzvVar.zzd));
            }
            com.google.android.gms.ads.internal.client.zze zzeVar = zzvVar.zzc;
            jSONObject2.put("error", zzeVar == null ? null : zzi(zzeVar));
            jSONArray.put(jSONObject2);
        }
        jSONObject.put("adNetworks", jSONArray);
        return jSONObject;
    }

    private static JSONObject zzi(com.google.android.gms.ads.internal.client.zze zzeVar) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("errorDomain", zzeVar.zzc);
        jSONObject.put("errorCode", zzeVar.zza);
        jSONObject.put("errorDescription", zzeVar.zzb);
        com.google.android.gms.ads.internal.client.zze zzeVar2 = zzeVar.zzd;
        jSONObject.put("underlyingError", zzeVar2 == null ? null : zzi(zzeVar2));
        return jSONObject;
    }

    @Override // com.google.android.gms.internal.ads.zzdcc
    public final void zza(zzcvk zzcvkVar) {
        zzeak zzeakVar = this.zza;
        if (zzeakVar.zzs()) {
            this.zzf = zzcvkVar.zzn();
            this.zze = zzdzx.AD_LOADED;
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzkJ)).booleanValue()) {
                zzeakVar.zzk(this.zzb, this);
            }
        }
    }

    public final boolean zzc() {
        return this.zze != zzdzx.AD_REQUESTED;
    }

    public final String zzd() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzdan
    public final void zzdI(com.google.android.gms.ads.internal.client.zze zzeVar) {
        zzeak zzeakVar = this.zza;
        if (zzeakVar.zzs()) {
            this.zze = zzdzx.AD_LOAD_FAILED;
            this.zzg = zzeVar;
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzkJ)).booleanValue()) {
                zzeakVar.zzk(this.zzb, this);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzddq
    public final void zzdO(zzbza zzbzaVar) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzkJ)).booleanValue()) {
            return;
        }
        zzeak zzeakVar = this.zza;
        if (zzeakVar.zzs()) {
            zzeakVar.zzk(this.zzb, this);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzddq
    public final void zzdP(zzfic zzficVar) {
        zzeak zzeakVar = this.zza;
        if (zzeakVar.zzs()) {
            zzfib zzfibVar = zzficVar.zzb;
            List list = zzfibVar.zza;
            if (!list.isEmpty()) {
                this.zzd = ((zzfhr) list.get(0)).zzb;
            }
            zzfhu zzfhuVar = zzfibVar.zzb;
            String str = zzfhuVar.zzl;
            if (!TextUtils.isEmpty(str)) {
                this.zzh = str;
            }
            String str2 = zzfhuVar.zzm;
            if (!TextUtils.isEmpty(str2)) {
                this.zzi = str2;
            }
            JSONObject jSONObject = zzfhuVar.zzp;
            if (jSONObject.length() > 0) {
                this.zzl = jSONObject;
            }
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzkF)).booleanValue()) {
                if (!zzeakVar.zzm()) {
                    this.zzo = true;
                    return;
                }
                String str3 = zzfhuVar.zzn;
                if (!TextUtils.isEmpty(str3)) {
                    this.zzj = str3;
                }
                JSONObject jSONObject2 = zzfhuVar.zzo;
                if (jSONObject2.length() > 0) {
                    this.zzk = jSONObject2;
                }
                JSONObject jSONObject3 = this.zzk;
                int length = jSONObject3 != null ? jSONObject3.toString().length() : 0;
                if (!TextUtils.isEmpty(this.zzj)) {
                    length += this.zzj.length();
                }
                zzeakVar.zzl(length);
            }
        }
    }

    public final void zze() {
        this.zzm = true;
    }

    public final void zzf() {
        this.zzn = true;
    }

    public final JSONObject zzg() throws JSONException {
        JSONObject jSONObjectZzh;
        IBinder iBinder;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("state", this.zze);
        jSONObject.put("format", zzfhr.zza(this.zzd));
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzkJ)).booleanValue()) {
            jSONObject.put("isOutOfContext", this.zzm);
            if (this.zzm) {
                jSONObject.put("shown", this.zzn);
            }
        }
        zzdad zzdadVar = this.zzf;
        if (zzdadVar != null) {
            jSONObjectZzh = zzh(zzdadVar);
        } else {
            com.google.android.gms.ads.internal.client.zze zzeVar = this.zzg;
            JSONObject jSONObjectZzh2 = null;
            if (zzeVar != null && (iBinder = zzeVar.zze) != null) {
                zzdad zzdadVar2 = (zzdad) iBinder;
                jSONObjectZzh2 = zzh(zzdadVar2);
                if (zzdadVar2.zzg().isEmpty()) {
                    JSONArray jSONArray = new JSONArray();
                    jSONArray.put(zzi(this.zzg));
                    jSONObjectZzh2.put("errors", jSONArray);
                }
            }
            jSONObjectZzh = jSONObjectZzh2;
        }
        jSONObject.put("responseInfo", jSONObjectZzh);
        return jSONObject;
    }
}
