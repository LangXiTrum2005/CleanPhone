package com.google.android.gms.internal.ads;

import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public class zzhxj {
    @Deprecated
    public zzhxj() {
    }

    public final String toString() {
        try {
            StringBuilder sb = new StringBuilder();
            zzhyq zzhyqVar = new zzhyq(zzhye.zza(sb));
            zzhyqVar.zza(zzhxo.LENIENT);
            zzhym.zza.zza(zzhyqVar, this);
            return sb.toString();
        } catch (IOException e2) {
            throw new AssertionError(e2);
        }
    }

    public String zzd() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public final zzhxl zze() {
        if (this instanceof zzhxl) {
            return (zzhxl) this;
        }
        throw new IllegalStateException("Not a JSON Object: ".concat(toString()));
    }

    public final zzhxi zzf() {
        if (this instanceof zzhxi) {
            return (zzhxi) this;
        }
        throw new IllegalStateException("Not a JSON Array: ".concat(toString()));
    }

    public final zzhxn zzg() {
        if (this instanceof zzhxn) {
            return (zzhxn) this;
        }
        throw new IllegalStateException("Not a JSON Primitive: ".concat(toString()));
    }
}
