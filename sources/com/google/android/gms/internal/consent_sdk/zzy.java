package com.google.android.gms.internal.consent_sdk;

import com.google.android.ump.ConsentInformation;
import java.util.HashSet;

/* JADX INFO: loaded from: classes4.dex */
final class zzy {
    private final zzz zza;
    private final zzcl zzb;
    private int zzc = 0;
    private ConsentInformation.PrivacyOptionsRequirementStatus zzd = ConsentInformation.PrivacyOptionsRequirementStatus.UNKNOWN;

    public zzy(zzz zzzVar, zzcl zzclVar) {
        this.zza = zzzVar;
        this.zzb = zzclVar;
    }

    /* JADX WARN: Code duplicated, block: B:39:0x00a6  */
    public final zzab zza() throws zzg {
        String str;
        zzcl zzclVar = this.zzb;
        int i2 = zzclVar.zzf;
        boolean z2 = i2 == 8;
        zzz zzzVar = this.zza;
        zzzVar.zzc.zzh(z2);
        int i3 = i2 - 1;
        if (i2 == 0) {
            throw null;
        }
        switch (i3) {
            case 1:
            case 2:
            case 3:
                this.zzc = 3;
                break;
            case 4:
                this.zzc = 2;
                break;
            case 5:
                this.zzc = 1;
                break;
            case 6:
                throw new zzg(1, "Invalid response from server: ".concat(String.valueOf(zzclVar.zzc)));
            case 7:
                throw new zzg(3, "Publisher misconfiguration: ".concat(String.valueOf(zzclVar.zzc)));
            default:
                throw new zzg(1, "Invalid response from server.");
        }
        int i4 = zzclVar.zzg;
        int i5 = i4 - 1;
        if (i4 == 0) {
            throw null;
        }
        if (i5 == 1) {
            this.zzd = ConsentInformation.PrivacyOptionsRequirementStatus.REQUIRED;
        } else {
            if (i5 != 2) {
                throw new zzg(1, "Invalid response from server.");
            }
            this.zzd = ConsentInformation.PrivacyOptionsRequirementStatus.NOT_REQUIRED;
        }
        String str2 = zzclVar.zza;
        zzbq zzbqVar = str2 == null ? null : new zzbq(zzclVar.zzb, str2);
        zzzVar.zzc.zzj(new HashSet(zzclVar.zzd));
        for (zzck zzckVar : zzclVar.zze) {
            int i6 = zzckVar.zzb;
            int i7 = i6 - 1;
            if (i6 == 0) {
                throw null;
            }
            if (i7 == 0) {
                str = null;
            } else if (i7 == 1) {
                str = "write";
            } else if (i7 != 2) {
                str = null;
            } else {
                str = "clear";
            }
            if (str != null) {
                zzzVar.zza.zzb(str, zzckVar.zza, zzzVar.zzb);
            }
        }
        return new zzab(this.zzc, this.zzd, zzbqVar, null);
    }
}
