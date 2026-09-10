package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import com.applovin.impl.Z;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public final class zzit extends zzau {
    public final int zzc;
    public final String zzd;
    public final int zze;
    public final zzv zzf;
    public final int zzg;
    public final zzwg zzh;
    final boolean zzi;

    private zzit(int i2, Throwable th, int i3) {
        this(i2, th, null, i3, null, -1, null, 4, null, false);
    }

    public static zzit zza(IOException iOException, int i2) {
        return new zzit(0, iOException, i2);
    }

    public static zzit zzb(Throwable th, String str, int i2, zzv zzvVar, int i3, zzwg zzwgVar, boolean z2, int i4) {
        if (zzvVar == null) {
            i3 = 4;
        }
        return new zzit(1, th, null, i4, str, i2, zzvVar, i3, zzwgVar, z2);
    }

    public static zzit zzc(RuntimeException runtimeException, int i2) {
        return new zzit(2, runtimeException, i2);
    }

    public final zzit zzd(zzwg zzwgVar) {
        String message = getMessage();
        String str = zzfj.zza;
        return new zzit(message, getCause(), this.zza, this.zzc, this.zzd, this.zze, this.zzf, this.zzg, zzwgVar, this.zzb, this.zzi);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    private zzit(int i2, Throwable th, String str, int i3, String str2, int i4, zzv zzvVar, int i5, zzwg zzwgVar, boolean z2) {
        String str3;
        int i6;
        String strS;
        String str4;
        if (i2 == 0) {
            str3 = str2;
            i6 = i4;
            strS = "Source error";
        } else if (i2 != 1) {
            strS = "Unexpected runtime error";
            str3 = str2;
            i6 = i4;
        } else {
            String strValueOf = String.valueOf(zzvVar);
            String str5 = zzfj.zza;
            if (i5 == 0) {
                str4 = "NO";
            } else if (i5 == 1) {
                str4 = "NO_UNSUPPORTED_TYPE";
            } else if (i5 == 2) {
                str4 = "NO_UNSUPPORTED_DRM";
            } else if (i5 == 3) {
                str4 = "NO_EXCEEDS_CAPABILITIES";
            } else {
                if (i5 != 4) {
                    throw new IllegalStateException();
                }
                str4 = "YES";
            }
            StringBuilder sb = new StringBuilder(str4.length() + strValueOf.length() + Z.d(String.valueOf(i4), String.valueOf(str2).length() + 14, 9) + 19);
            str3 = str2;
            sb.append(str3);
            sb.append(" error, index=");
            i6 = i4;
            sb.append(i6);
            sb.append(", format=");
            strS = android.support.v4.media.a.s(sb, strValueOf, ", format_supported=", str4);
        }
        this(TextUtils.isEmpty(null) ? strS : strS.concat(": null"), th, i3, i2, str3, i6, zzvVar, i5, zzwgVar, SystemClock.elapsedRealtime(), z2);
    }

    private zzit(String str, Throwable th, int i2, int i3, String str2, int i4, zzv zzvVar, int i5, zzwg zzwgVar, long j, boolean z2) {
        boolean z3;
        super(str, th, i2, Bundle.EMPTY, j);
        if (!z2) {
            z3 = true;
        } else if (i3 == 1) {
            i3 = 1;
            z3 = true;
        } else {
            z3 = false;
        }
        zzgqa.zza(z3);
        zzgqa.zza(th != null);
        this.zzc = i3;
        this.zzd = str2;
        this.zze = i4;
        this.zzf = zzvVar;
        this.zzg = i5;
        this.zzh = zzwgVar;
        this.zzi = z2;
    }
}
