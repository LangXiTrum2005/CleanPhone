package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes4.dex */
public final class zzang implements zzaly {
    private final zzer zza = new zzer();

    @Override // com.google.android.gms.internal.ads.zzaly
    public final void zza(byte[] bArr, int i2, int i3, zzalx zzalxVar, zzdr zzdrVar) {
        zzcx zzcxVarZzr;
        zzer zzerVar = this.zza;
        zzerVar.zzb(bArr, i3 + i2);
        zzerVar.zzh(i2);
        ArrayList arrayList = new ArrayList();
        while (zzerVar.zzd() > 0) {
            zzgqa.zzb(zzerVar.zzd() >= 8, "Incomplete Mp4Webvtt Top Level box header found.");
            int iZzB = zzerVar.zzB() - 8;
            if (zzerVar.zzB() == 1987343459) {
                CharSequence charSequenceZzc = null;
                zzcw zzcwVarZzb = null;
                while (iZzB > 0) {
                    zzgqa.zzb(iZzB >= 8, "Incomplete vtt cue box header found.");
                    int iZzB2 = zzerVar.zzB();
                    int iZzB3 = zzerVar.zzB();
                    int i4 = iZzB - 8;
                    int i5 = iZzB2 - 8;
                    String strZzj = zzfj.zzj(zzerVar.zzi(), zzerVar.zzg(), i5);
                    zzerVar.zzk(i5);
                    if (iZzB3 == 1937011815) {
                        zzcwVarZzb = zzanp.zzb(strZzj);
                    } else if (iZzB3 == 1885436268) {
                        charSequenceZzc = zzanp.zzc(null, strZzj.trim(), Collections.EMPTY_LIST);
                    }
                    iZzB = i4 - i5;
                }
                if (charSequenceZzc == null) {
                    charSequenceZzc = "";
                }
                if (zzcwVarZzb != null) {
                    zzcwVarZzb.zza(charSequenceZzc);
                    zzcxVarZzr = zzcwVarZzb.zzr();
                } else {
                    Pattern pattern = zzanp.zza;
                    zzano zzanoVar = new zzano();
                    zzanoVar.zzc = charSequenceZzc;
                    zzcxVarZzr = zzanoVar.zza().zzr();
                }
                arrayList.add(zzcxVarZzr);
            } else {
                zzerVar.zzk(iZzB);
            }
        }
        zzdrVar.zza(new zzalq(arrayList, -9223372036854775807L, -9223372036854775807L));
    }
}
