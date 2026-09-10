package com.google.android.gms.internal.ads;

import java.util.HashSet;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public abstract class zzftq extends zzftr {
    protected final HashSet zza;
    protected final JSONObject zzb;
    protected final long zzc;

    public zzftq(zzftj zzftjVar, HashSet hashSet, JSONObject jSONObject, long j) {
        super(zzftjVar);
        this.zza = new HashSet(hashSet);
        this.zzb = jSONObject;
        this.zzc = j;
    }
}
