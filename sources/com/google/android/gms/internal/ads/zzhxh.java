package com.google.android.gms.internal.ads;

import com.startapp.simple.bloomfilter.codec.IOUtils;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
public final class zzhxh {
    public static final zzhxh zza = new zzhxh("", "", false);
    private final String zzb;
    private final String zzc;
    private final boolean zzd;

    static {
        new zzhxh(IOUtils.LINE_SEPARATOR_UNIX, "  ", true);
    }

    private zzhxh(String str, String str2, boolean z2) {
        Objects.requireNonNull(str, "newline == null");
        Objects.requireNonNull(str2, "indent == null");
        if (!str.matches("[\r\n]*")) {
            throw new IllegalArgumentException("Only combinations of \\n and \\r are allowed in newline.");
        }
        if (!str2.matches("[ \t]*")) {
            throw new IllegalArgumentException("Only combinations of spaces and tabs are allowed in indent.");
        }
        this.zzb = str;
        this.zzc = str2;
        this.zzd = z2;
    }

    public final String zza() {
        return this.zzb;
    }

    public final String zzb() {
        return this.zzc;
    }

    public final boolean zzc() {
        return this.zzd;
    }
}
