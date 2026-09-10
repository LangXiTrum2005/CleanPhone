package com.google.android.gms.ads.internal.util;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class zzbf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String[] f11071a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final double[] f11072b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final double[] f11073c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int[] f11074d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f11075e;

    public zzbf(zzbe zzbeVar) {
        ArrayList arrayList = zzbeVar.f11069b;
        int size = arrayList.size();
        this.f11071a = (String[]) zzbeVar.f11068a.toArray(new String[size]);
        int size2 = arrayList.size();
        double[] dArr = new double[size2];
        for (int i10 = 0; i10 < size2; i10++) {
            dArr[i10] = ((Double) arrayList.get(i10)).doubleValue();
        }
        this.f11072b = dArr;
        ArrayList arrayList2 = zzbeVar.f11070c;
        int size3 = arrayList2.size();
        double[] dArr2 = new double[size3];
        for (int i11 = 0; i11 < size3; i11++) {
            dArr2[i11] = ((Double) arrayList2.get(i11)).doubleValue();
        }
        this.f11073c = dArr2;
        this.f11074d = new int[size];
        this.f11075e = 0;
    }

    public final void zza(double d10) {
        this.f11075e++;
        int i10 = 0;
        while (true) {
            double[] dArr = this.f11073c;
            if (i10 >= dArr.length) {
                return;
            }
            double d11 = dArr[i10];
            if (d11 <= d10 && d10 < this.f11072b[i10]) {
                int[] iArr = this.f11074d;
                iArr[i10] = iArr[i10] + 1;
            }
            if (d10 < d11) {
                return;
            } else {
                i10++;
            }
        }
    }

    public final List zzb() {
        String[] strArr = this.f11071a;
        ArrayList arrayList = new ArrayList(strArr.length);
        for (int i10 = 0; i10 < strArr.length; i10++) {
            String str = strArr[i10];
            double d10 = this.f11073c[i10];
            double d11 = this.f11072b[i10];
            int i11 = this.f11074d[i10];
            arrayList.add(new zzbd(str, d10, d11, ((double) i11) / ((double) this.f11075e), i11));
        }
        return arrayList;
    }
}
