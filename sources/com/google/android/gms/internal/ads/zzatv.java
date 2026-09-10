package com.google.android.gms.internal.ads;

import java.util.Comparator;

/* JADX INFO: loaded from: classes4.dex */
final class zzatv implements Comparator {
    @Override // java.util.Comparator
    public final /* synthetic */ int compare(Object obj, Object obj2) {
        int length;
        zzatw zzatwVar = (zzatw) obj;
        zzatw zzatwVar2 = (zzatw) obj2;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            length = zzatwVar.zza.length;
            if (i2 >= length || i3 >= zzatwVar2.zza.length) {
                break;
            }
            int iCompare = Integer.compare(zzatw.zzg(zzatwVar.zzb(i2)), zzatw.zzg(zzatwVar2.zzb(i3)));
            if (iCompare != 0) {
                return iCompare;
            }
            i2++;
            i3++;
        }
        return Integer.compare(length, zzatwVar2.zza.length);
    }
}
