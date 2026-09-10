package com.google.android.gms.internal.ads;

import android.os.Bundle;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONException;

/* JADX INFO: loaded from: classes3.dex */
public final class zzedb {
    private final String zzc;

    @Nullable
    private zzfbr zzd = null;

    @Nullable
    private zzfbo zze = null;

    @Nullable
    private com.google.android.gms.ads.internal.client.zzw zzf = null;
    private final Map zzb = Collections.synchronizedMap(new HashMap());
    private final List zza = Collections.synchronizedList(new ArrayList());

    public zzedb(String str) {
        this.zzc = str;
    }

    private static String zzj(zzfbo zzfboVar) {
        return ((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzdH)).booleanValue() ? zzfboVar.zzap : zzfboVar.zzw;
    }

    private final synchronized void zzk(zzfbo zzfboVar, int i) {
        Map map = this.zzb;
        String strZzj = zzj(zzfboVar);
        if (map.containsKey(strZzj)) {
            return;
        }
        Bundle bundle = new Bundle();
        Iterator<String> itKeys = zzfboVar.zzv.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            try {
                bundle.putString(next, zzfboVar.zzv.getString(next));
            } catch (JSONException unused) {
            }
        }
        com.google.android.gms.ads.internal.client.zzw zzwVar = new com.google.android.gms.ads.internal.client.zzw(zzfboVar.zzE, 0L, null, bundle, zzfboVar.zzF, zzfboVar.zzG, zzfboVar.zzH, zzfboVar.zzI);
        try {
            this.zza.add(i, zzwVar);
        } catch (IndexOutOfBoundsException e) {
            com.google.android.gms.ads.internal.zzv.zzp().zzw(e, "AdapterResponseInfoCollector.addAdapterResponseInfoEntryAtLocation");
        }
        this.zzb.put(strZzj, zzwVar);
    }

    private final void zzl(zzfbo zzfboVar, long j, @Nullable com.google.android.gms.ads.internal.client.zze zzeVar, boolean z) {
        Map map = this.zzb;
        String strZzj = zzj(zzfboVar);
        if (map.containsKey(strZzj)) {
            if (this.zze == null) {
                this.zze = zzfboVar;
            }
            com.google.android.gms.ads.internal.client.zzw zzwVar = (com.google.android.gms.ads.internal.client.zzw) this.zzb.get(strZzj);
            zzwVar.zzb = j;
            zzwVar.zzc = zzeVar;
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzgD)).booleanValue() && z) {
                this.zzf = zzwVar;
            }
        }
    }

    @Nullable
    public final com.google.android.gms.ads.internal.client.zzw zza() {
        return this.zzf;
    }

    public final zzcvm zzb() {
        return new zzcvm(this.zze, "", this, this.zzd, this.zzc);
    }

    public final List zzc() {
        return this.zza;
    }

    public final void zzd(zzfbo zzfboVar) {
        zzk(zzfboVar, this.zza.size());
    }

    public final void zze(zzfbo zzfboVar) {
        int iIndexOf = this.zza.indexOf(this.zzb.get(zzj(zzfboVar)));
        if (iIndexOf < 0 || iIndexOf >= this.zzb.size()) {
            iIndexOf = this.zza.indexOf(this.zzf);
        }
        if (iIndexOf < 0 || iIndexOf >= this.zzb.size()) {
            return;
        }
        this.zzf = (com.google.android.gms.ads.internal.client.zzw) this.zza.get(iIndexOf);
        while (true) {
            iIndexOf++;
            if (iIndexOf >= this.zza.size()) {
                return;
            }
            com.google.android.gms.ads.internal.client.zzw zzwVar = (com.google.android.gms.ads.internal.client.zzw) this.zza.get(iIndexOf);
            zzwVar.zzb = 0L;
            zzwVar.zzc = null;
        }
    }

    public final void zzf(zzfbo zzfboVar, long j, @Nullable com.google.android.gms.ads.internal.client.zze zzeVar) {
        zzl(zzfboVar, j, zzeVar, false);
    }

    public final void zzg(zzfbo zzfboVar, long j, @Nullable com.google.android.gms.ads.internal.client.zze zzeVar) {
        zzl(zzfboVar, j, null, true);
    }

    public final synchronized void zzh(String str, List list) {
        try {
            if (this.zzb.containsKey(str)) {
                int iIndexOf = this.zza.indexOf((com.google.android.gms.ads.internal.client.zzw) this.zzb.get(str));
                try {
                    this.zza.remove(iIndexOf);
                } catch (IndexOutOfBoundsException e) {
                    com.google.android.gms.ads.internal.zzv.zzp().zzw(e, "AdapterResponseInfoCollector.replaceAdapterResponseInfoEntry");
                }
                this.zzb.remove(str);
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    zzk((zzfbo) it.next(), iIndexOf);
                    iIndexOf++;
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void zzi(zzfbr zzfbrVar) {
        this.zzd = zzfbrVar;
    }
}
