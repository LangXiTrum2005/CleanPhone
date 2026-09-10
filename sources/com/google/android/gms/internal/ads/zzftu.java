package com.google.android.gms.internal.ads;

import java.util.HashSet;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class zzftu extends zzftq {
    public zzftu(zzftj zzftjVar, HashSet hashSet, JSONObject jSONObject, long j) {
        super(zzftjVar, hashSet, jSONObject, j);
    }

    private final void zzc(String str) {
        zzfsf zzfsfVarZza = zzfsf.zza();
        if (zzfsfVarZza != null) {
            for (zzfrl zzfrlVar : zzfsfVarZza.zze()) {
                if (((zzftq) this).zza.contains(zzfrlVar.zzh())) {
                    zzfrlVar.zzg().zzi(str, this.zzc);
                }
            }
        }
    }

    @Override // android.os.AsyncTask
    public final /* synthetic */ Object doInBackground(Object[] objArr) {
        return this.zzb.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzftr, android.os.AsyncTask
    public final /* synthetic */ void onPostExecute(Object obj) {
        String str = (String) obj;
        zzc(str);
        super.onPostExecute(str);
    }

    @Override // com.google.android.gms.internal.ads.zzftr
    /* JADX INFO: renamed from: zza */
    public final void onPostExecute(String str) {
        zzc(str);
        super.onPostExecute(str);
    }
}
