package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
final class zzasd {
    long zza;
    final String zzb;
    final String zzc;
    final long zzd;
    final long zze;
    final long zzf;
    final long zzg;
    final List zzh;

    private zzasd(String str, String str2, long j, long j2, long j3, long j4, List list) {
        this.zzb = str;
        this.zzc = true == "".equals(str2) ? null : str2;
        this.zzd = j;
        this.zze = j2;
        this.zzf = j3;
        this.zzg = j4;
        this.zzh = list;
    }

    public static zzasd zza(zzase zzaseVar) throws IOException {
        if (zzasg.zzi(zzaseVar) != 538247942) {
            throw new IOException();
        }
        String strZzm = zzasg.zzm(zzaseVar);
        String strZzm2 = zzasg.zzm(zzaseVar);
        long jZzk = zzasg.zzk(zzaseVar);
        long jZzk2 = zzasg.zzk(zzaseVar);
        long jZzk3 = zzasg.zzk(zzaseVar);
        long jZzk4 = zzasg.zzk(zzaseVar);
        int iZzi = zzasg.zzi(zzaseVar);
        if (iZzi < 0) {
            throw new IOException(androidx.datastore.preferences.protobuf.a.g(iZzi, "readHeaderList size=", new StringBuilder(String.valueOf(iZzi).length() + 20)));
        }
        List arrayList = iZzi == 0 ? Collections.EMPTY_LIST : new ArrayList();
        for (int i2 = 0; i2 < iZzi; i2++) {
            arrayList.add(new zzarc(zzasg.zzm(zzaseVar).intern(), zzasg.zzm(zzaseVar).intern()));
        }
        return new zzasd(strZzm, strZzm2, jZzk, jZzk2, jZzk3, jZzk4, arrayList);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r11v1, types: [java.util.List] */
    public zzasd(String str, zzaqt zzaqtVar) {
        String str2 = zzaqtVar.zzb;
        long j = zzaqtVar.zzc;
        long j2 = zzaqtVar.zzd;
        long j3 = zzaqtVar.zze;
        long j4 = zzaqtVar.zzf;
        ?? arrayList = zzaqtVar.zzh;
        if (arrayList == 0) {
            Map map = zzaqtVar.zzg;
            arrayList = new ArrayList(map.size());
            for (Map.Entry entry : map.entrySet()) {
                arrayList.add(new zzarc((String) entry.getKey(), (String) entry.getValue()));
            }
        }
        this(str, str2, j, j2, j3, j4, arrayList);
    }
}
