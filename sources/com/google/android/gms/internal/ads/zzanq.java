package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public final class zzanq implements zzaly {
    private final zzer zza = new zzer();
    private final zzanh zzb = new zzanh();

    @Override // com.google.android.gms.internal.ads.zzaly
    public final void zza(byte[] bArr, int i2, int i3, zzalx zzalxVar, zzdr zzdrVar) {
        zzer zzerVar = this.zza;
        zzerVar.zzb(bArr, i3 + i2);
        zzerVar.zzh(i2);
        ArrayList arrayList = new ArrayList();
        try {
            int iZzg = zzerVar.zzg();
            Charset charset = StandardCharsets.UTF_8;
            String strZzN = zzerVar.zzN(charset);
            if (strZzN == null || !strZzN.startsWith("WEBVTT")) {
                zzerVar.zzh(iZzg);
                throw zzat.zzb("Expected WEBVTT. Got ".concat(String.valueOf(zzerVar.zzN(charset))), null);
            }
            while (!TextUtils.isEmpty(zzerVar.zzN(StandardCharsets.UTF_8))) {
            }
            ArrayList arrayList2 = new ArrayList();
            while (true) {
                byte b2 = -1;
                int iZzg2 = 0;
                while (b2 == -1) {
                    iZzg2 = zzerVar.zzg();
                    String strZzN2 = zzerVar.zzN(StandardCharsets.UTF_8);
                    if (strZzN2 == null) {
                        b2 = 0;
                    } else if ("STYLE".equals(strZzN2)) {
                        b2 = 2;
                    } else {
                        b2 = strZzN2.startsWith("NOTE") ? (byte) 1 : (byte) 3;
                    }
                }
                zzerVar.zzh(iZzg2);
                if (b2 == 0) {
                    zzals.zza(new zzant(arrayList2), zzalxVar, zzdrVar);
                    return;
                }
                if (b2 == 1) {
                    while (!TextUtils.isEmpty(zzerVar.zzN(StandardCharsets.UTF_8))) {
                    }
                } else if (b2 != 2) {
                    zzanj zzanjVarZza = zzanp.zza(zzerVar, arrayList);
                    if (zzanjVarZza != null) {
                        arrayList2.add(zzanjVarZza);
                    }
                } else {
                    if (!arrayList2.isEmpty()) {
                        throw new IllegalArgumentException("A style block was found after the first cue.");
                    }
                    zzerVar.zzN(StandardCharsets.UTF_8);
                    arrayList.addAll(this.zzb.zza(zzerVar));
                }
            }
        } catch (zzat e2) {
            throw new IllegalArgumentException(e2);
        }
    }
}
