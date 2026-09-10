package com.google.android.gms.internal.ads;

import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public abstract class zzhxq {
    public abstract void zza(zzhyq zzhyqVar, Object obj) throws IOException;

    public final zzhxq zzc() {
        return !(this instanceof zzhxp) ? new zzhxp(this, null) : this;
    }
}
