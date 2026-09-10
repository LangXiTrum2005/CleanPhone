package com.google.android.gms.ads.internal.util;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class zzbe {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f11068a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f11069b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f11070c = new ArrayList();

    public final zzbe zza(String str, double d10, double d11) {
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        int i10 = 0;
        while (true) {
            arrayList = this.f11068a;
            int size = arrayList.size();
            arrayList2 = this.f11069b;
            arrayList3 = this.f11070c;
            if (i10 >= size) {
                break;
            }
            double dDoubleValue = ((Double) arrayList3.get(i10)).doubleValue();
            double dDoubleValue2 = ((Double) arrayList2.get(i10)).doubleValue();
            if (d10 < dDoubleValue || (dDoubleValue == d10 && d11 < dDoubleValue2)) {
                break;
            }
            i10++;
        }
        arrayList.add(i10, str);
        arrayList3.add(i10, Double.valueOf(d10));
        arrayList2.add(i10, Double.valueOf(d11));
        return this;
    }

    public final zzbf zzb() {
        return new zzbf(this);
    }
}
