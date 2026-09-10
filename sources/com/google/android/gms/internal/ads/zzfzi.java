package com.google.android.gms.internal.ads;

import android.content.Context;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.UUID;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes4.dex */
class zzfzi {
    static final String zza = new UUID(0, 0).toString();
    final zzfzh zzb;
    final zzfzg zzc;
    private final String zzd;
    private final String zze;
    private final String zzf;
    private final String zzg;
    private final String zzh;

    public zzfzi(Context context, String str, String str2, String str3) {
        this.zzb = zzfzh.zza(context);
        this.zzc = zzfzg.zza(context);
        this.zzd = str;
        this.zze = str.concat("_3p");
        this.zzf = str2;
        this.zzg = str2.concat("_3p");
        this.zzh = str3;
    }

    private final String zzh(String str, String str2, String str3) {
        if (str2 != null && str3 != null) {
            return UUID.nameUUIDFromBytes(android.support.v4.media.a.s(new StringBuilder(str2.length() + str.length() + str3.length()), str, str2, str3).getBytes(StandardCharsets.UTF_8)).toString();
        }
        String str4 = this.zzh;
        String str5 = str2 == null ? AbstractJsonLexerKt.NULL : "not null";
        int length = str5.length();
        String str6 = str3 == null ? AbstractJsonLexerKt.NULL : "not null";
        StringBuilder sb = new StringBuilder(str6.length() + length + 120);
        androidx.media3.extractor.text.ttml.a.C(sb, str4, ": Invalid argument to generate PAIDv1 on 3p traffic, Ad ID is not null, package name is ", str5, ", hashKey is ");
        sb.append(str6);
        throw new IllegalArgumentException(sb.toString());
    }

    public final zzfzf zza(String str, String str2, long j, boolean z2) throws IOException {
        if (str != null) {
            try {
                UUID.fromString(str);
                if (!str.equals(zza)) {
                    String strZze = zze(true);
                    String strZzc = this.zzb.zzc("paid_3p_hash_key", null);
                    if (strZze != null && strZzc != null && !strZze.equals(zzh(str, str2, strZzc))) {
                        return zzb(str, str2);
                    }
                }
            } catch (IllegalArgumentException unused) {
            }
            return new zzfzf();
        }
        boolean z3 = str != null;
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis < 0) {
            throw new IllegalStateException(this.zzh.concat(": Invalid negative current timestamp. Updating PAID failed"));
        }
        long jZzd = zzd(z3);
        if (jZzd != -1) {
            if (jCurrentTimeMillis < jZzd) {
                this.zzb.zzb(z3 ? this.zzg : this.zzf, Long.valueOf(jCurrentTimeMillis));
            } else if (jCurrentTimeMillis >= jZzd + j) {
                return zzb(str, str2);
            }
        }
        String strZze2 = zze(z3);
        return (strZze2 != null || z2) ? new zzfzf(strZze2, zzd(z3)) : zzb(str, str2);
    }

    public final zzfzf zzb(String str, String str2) throws IOException {
        if (str == null) {
            return zzf(UUID.randomUUID().toString(), false);
        }
        String string = UUID.randomUUID().toString();
        this.zzb.zzb("paid_3p_hash_key", string);
        return zzf(zzh(str, str2, string), true);
    }

    public final void zzc(boolean z2) throws IOException {
        String str = z2 ? this.zzg : this.zzf;
        zzfzh zzfzhVar = this.zzb;
        zzfzhVar.zzf(str);
        zzfzhVar.zzf(z2 ? this.zze : this.zzd);
    }

    public final long zzd(boolean z2) {
        return this.zzb.zzd(z2 ? this.zzg : this.zzf, -1L);
    }

    public final String zze(boolean z2) {
        return this.zzb.zzc(z2 ? this.zze : this.zzd, null);
    }

    public final zzfzf zzf(String str, boolean z2) throws IOException {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis < 0) {
            throw new IllegalStateException(this.zzh.concat(": Invalid negative current timestamp. Updating PAID failed"));
        }
        zzfzh zzfzhVar = this.zzb;
        zzfzhVar.zzb(z2 ? this.zzg : this.zzf, Long.valueOf(jCurrentTimeMillis));
        zzfzhVar.zzb(z2 ? this.zze : this.zzd, str);
        return new zzfzf(str, jCurrentTimeMillis);
    }

    public final boolean zzg(boolean z2) {
        return this.zzb.zzg(this.zzd);
    }
}
