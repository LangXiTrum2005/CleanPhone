package com.google.android.gms.internal.measurement;

import android.support.v4.media.a;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class zzbi extends zzav {
    @Override // com.google.android.gms.internal.measurement.zzav
    public final zzao zza(String str, zzg zzgVar, List list) {
        if (str == null || str.isEmpty() || !zzgVar.zzd(str)) {
            throw new IllegalArgumentException(a.C("Command not found: ", str));
        }
        zzao zzaoVarZzh = zzgVar.zzh(str);
        if (zzaoVarZzh instanceof zzai) {
            return ((zzai) zzaoVarZzh).zza(zzgVar, list);
        }
        throw new IllegalArgumentException(a.n("Function ", str, " is not defined"));
    }
}
