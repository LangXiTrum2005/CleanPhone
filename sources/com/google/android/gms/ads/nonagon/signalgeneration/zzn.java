package com.google.android.gms.ads.nonagon.signalgeneration;

import android.util.Pair;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
final class zzn extends LinkedHashMap {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ zzq f11502a;

    public zzn(zzq zzqVar) {
        this.f11502a = zzqVar;
    }

    @Override // java.util.LinkedHashMap
    public final boolean removeEldestEntry(Map.Entry entry) {
        zzq zzqVar = this.f11502a;
        synchronized (zzqVar) {
            try {
                if (size() <= zzqVar.f11507a) {
                    return false;
                }
                zzqVar.f11512f.add(new Pair((String) entry.getKey(), ((zzo) entry.getValue()).zzb));
                return size() > zzqVar.f11507a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
