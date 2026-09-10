package com.google.android.gms.internal.ads;

import android.util.Base64;
import com.p004ironsource.d9;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class zzagg {
    public static int zza(int i2) {
        int i3 = 0;
        while (i2 > 0) {
            i2 >>>= 1;
            i3++;
        }
        return i3;
    }

    public static zzagd zzb(zzer zzerVar, boolean z2, boolean z3) throws zzat {
        if (z2) {
            zzd(3, zzerVar, false);
        }
        String strZzK = zzerVar.zzK((int) zzerVar.zzA(), StandardCharsets.UTF_8);
        int length = strZzK.length();
        long jZzA = zzerVar.zzA();
        String[] strArr = new String[(int) jZzA];
        int length2 = length + 15;
        for (int i2 = 0; i2 < jZzA; i2++) {
            String strZzK2 = zzerVar.zzK((int) zzerVar.zzA(), StandardCharsets.UTF_8);
            strArr[i2] = strZzK2;
            length2 = length2 + 4 + strZzK2.length();
        }
        if (z3 && (zzerVar.zzs() & 1) == 0) {
            throw zzat.zzb("framing bit expected to be set", null);
        }
        return new zzagd(strZzK, strArr, length2 + 1);
    }

    public static zzap zzc(List list) {
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < list.size(); i2++) {
            String str = (String) list.get(i2);
            String str2 = zzfj.zza;
            String[] strArrSplit = str.split(d9.i.f24747b, 2);
            if (strArrSplit.length != 2) {
                zzee.zzc("VorbisUtil", "Failed to parse Vorbis comment: ".concat(str));
            } else if (strArrSplit[0].equals("METADATA_BLOCK_PICTURE")) {
                try {
                    arrayList.add(zzaht.zzb(new zzer(Base64.decode(strArrSplit[1], 0))));
                } catch (RuntimeException e2) {
                    zzee.zzd("VorbisUtil", "Failed to parse vorbis picture", e2);
                }
            } else {
                arrayList.add(new zzair(strArrSplit[0], strArrSplit[1]));
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new zzap(arrayList);
    }

    public static boolean zzd(int i2, zzer zzerVar, boolean z2) throws zzat {
        if (zzerVar.zzd() < 7) {
            if (z2) {
                return false;
            }
            int iZzd = zzerVar.zzd();
            StringBuilder sb = new StringBuilder(String.valueOf(iZzd).length() + 18);
            sb.append("too short header: ");
            sb.append(iZzd);
            throw zzat.zzb(sb.toString(), null);
        }
        if (zzerVar.zzs() != i2) {
            if (z2) {
                return false;
            }
            throw zzat.zzb("expected header type ".concat(String.valueOf(Integer.toHexString(i2))), null);
        }
        if (zzerVar.zzs() == 118 && zzerVar.zzs() == 111 && zzerVar.zzs() == 114 && zzerVar.zzs() == 98 && zzerVar.zzs() == 105 && zzerVar.zzs() == 115) {
            return true;
        }
        if (z2) {
            return false;
        }
        throw zzat.zzb("expected characters 'vorbis'", null);
    }
}
