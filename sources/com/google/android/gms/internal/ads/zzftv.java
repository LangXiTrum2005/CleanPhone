package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.HashSet;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class zzftv extends zzftq {
    public zzftv(zzftj zzftjVar, HashSet hashSet, JSONObject jSONObject, long j) {
        super(zzftjVar, hashSet, jSONObject, j);
    }

    @Override // android.os.AsyncTask
    public final /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
        zzftj zzftjVar = this.zzd;
        JSONObject jSONObject = this.zzb;
        if (zzftb.zzg(jSONObject, zzftjVar.zzd())) {
            return null;
        }
        zzftjVar.zze(jSONObject);
        return jSONObject.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzftr, android.os.AsyncTask
    /* JADX INFO: renamed from: zza */
    public final void onPostExecute(String str) {
        zzfsf zzfsfVarZza;
        if (!TextUtils.isEmpty(str) && (zzfsfVarZza = zzfsf.zza()) != null) {
            for (zzfrl zzfrlVar : zzfsfVarZza.zze()) {
                if (((zzftq) this).zza.contains(zzfrlVar.zzh())) {
                    zzfrlVar.zzg().zzh(str, this.zzc);
                }
            }
        }
        super.onPostExecute(str);
    }
}
