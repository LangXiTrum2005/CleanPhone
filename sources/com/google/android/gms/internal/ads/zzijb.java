package com.google.android.gms.internal.ads;

import com.p004ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes4.dex */
public class zzijb {
    final LinkedHashMap zza;

    public zzijb(int i2) {
        this.zza = zzijd.zzc(i2);
    }

    public final zzijb zza(Object obj, zzijp zzijpVar) {
        zzijo.zza(obj, "key");
        zzijo.zza(zzijpVar, IronSourceConstants.EVENTS_PROVIDER);
        this.zza.put(obj, zzijpVar);
        return this;
    }
}
