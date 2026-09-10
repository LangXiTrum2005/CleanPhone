package com.google.android.gms.internal.ads;

import android.os.Bundle;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class zzejl {
    private final String zzc;
    private zzfhu zzd = null;
    private zzfhr zze = null;
    private com.google.android.gms.ads.internal.client.zzv zzf = null;
    private final Map zzb = androidx.datastore.preferences.protobuf.a.r();
    private final List zza = androidx.media3.extractor.text.ttml.a.u();

    public zzejl(String str) {
        this.zzc = str;
    }

    private final synchronized void zzj(zzfhr zzfhrVar, int i2) {
        Map map = this.zzb;
        String strZzl = zzl(zzfhrVar);
        if (map.containsKey(strZzl)) {
            return;
        }
        Bundle bundle = new Bundle();
        JSONObject jSONObject = zzfhrVar.zzv;
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            try {
                bundle.putString(next, jSONObject.getString(next));
            } catch (JSONException unused) {
            }
        }
        com.google.android.gms.ads.internal.client.zzv zzvVar = new com.google.android.gms.ads.internal.client.zzv(zzfhrVar.zzE, 0L, null, bundle, zzfhrVar.zzF, zzfhrVar.zzG, zzfhrVar.zzH, zzfhrVar.zzI);
        try {
            this.zza.add(i2, zzvVar);
        } catch (IndexOutOfBoundsException e2) {
            com.google.android.gms.ads.internal.zzt.zzh().zzg(e2, "AdapterResponseInfoCollector.addAdapterResponseInfoEntryAtLocation");
        }
        this.zzb.put(strZzl, zzvVar);
    }

    private final void zzk(zzfhr zzfhrVar, long j, com.google.android.gms.ads.internal.client.zze zzeVar, boolean z2) {
        Map map = this.zzb;
        String strZzl = zzl(zzfhrVar);
        if (map.containsKey(strZzl)) {
            if (this.zze == null) {
                this.zze = zzfhrVar;
            }
            com.google.android.gms.ads.internal.client.zzv zzvVar = (com.google.android.gms.ads.internal.client.zzv) map.get(strZzl);
            zzvVar.zzb = j;
            zzvVar.zzc = zzeVar;
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzhC)).booleanValue() && z2) {
                this.zzf = zzvVar;
            }
        }
    }

    private static String zzl(zzfhr zzfhrVar) {
        return ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzet)).booleanValue() ? zzfhrVar.zzap : zzfhrVar.zzw;
    }

    public final void zza(zzfhu zzfhuVar) {
        this.zzd = zzfhuVar;
    }

    public final void zzb(zzfhr zzfhrVar) {
        zzj(zzfhrVar, this.zza.size());
    }

    public final synchronized void zzc(String str, List list) {
        try {
            Map map = this.zzb;
            if (map.containsKey(str)) {
                com.google.android.gms.ads.internal.client.zzv zzvVar = (com.google.android.gms.ads.internal.client.zzv) map.get(str);
                List list2 = this.zza;
                int iIndexOf = list2.indexOf(zzvVar);
                try {
                    list2.remove(iIndexOf);
                } catch (IndexOutOfBoundsException e2) {
                    com.google.android.gms.ads.internal.zzt.zzh().zzg(e2, "AdapterResponseInfoCollector.replaceAdapterResponseInfoEntry");
                }
                this.zzb.remove(str);
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    zzj((zzfhr) it.next(), iIndexOf);
                    iIndexOf++;
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void zzd(zzfhr zzfhrVar, long j, com.google.android.gms.ads.internal.client.zze zzeVar) {
        zzk(zzfhrVar, j, null, true);
    }

    public final void zze(zzfhr zzfhrVar, long j, com.google.android.gms.ads.internal.client.zze zzeVar) {
        zzk(zzfhrVar, j, zzeVar, false);
    }

    public final zzdad zzf() {
        return new zzdad(this.zze, "", this, this.zzd, this.zzc);
    }

    public final com.google.android.gms.ads.internal.client.zzv zzg() {
        return this.zzf;
    }

    public final List zzh() {
        return this.zza;
    }

    public final void zzi(zzfhr zzfhrVar) {
        Map map = this.zzb;
        Object obj = map.get(zzl(zzfhrVar));
        List list = this.zza;
        int iIndexOf = list.indexOf(obj);
        if (iIndexOf < 0 || iIndexOf >= map.size()) {
            iIndexOf = list.indexOf(this.zzf);
        }
        if (iIndexOf < 0 || iIndexOf >= map.size()) {
            return;
        }
        this.zzf = (com.google.android.gms.ads.internal.client.zzv) list.get(iIndexOf);
        while (true) {
            iIndexOf++;
            if (iIndexOf >= list.size()) {
                return;
            }
            com.google.android.gms.ads.internal.client.zzv zzvVar = (com.google.android.gms.ads.internal.client.zzv) list.get(iIndexOf);
            zzvVar.zzb = 0L;
            zzvVar.zzc = null;
        }
    }
}
