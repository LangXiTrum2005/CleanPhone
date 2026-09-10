package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class j01 extends z01 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f15889c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f15890d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ArrayList f15891e;

    public j01(int i10, long j10) {
        super(i10, 0);
        this.f15889c = j10;
        this.f15890d = new ArrayList();
        this.f15891e = new ArrayList();
    }

    public final w01 g(int i10) {
        ArrayList arrayList = this.f15890d;
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            w01 w01Var = (w01) arrayList.get(i11);
            if (w01Var.f22444b == i10) {
                return w01Var;
            }
        }
        return null;
    }

    public final j01 h(int i10) {
        ArrayList arrayList = this.f15891e;
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            j01 j01Var = (j01) arrayList.get(i11);
            if (j01Var.f22444b == i10) {
                return j01Var;
            }
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.z01
    public final String toString() {
        String strE = z01.e(this.f22444b);
        String string = Arrays.toString(this.f15890d.toArray());
        String string2 = Arrays.toString(this.f15891e.toArray());
        int length = strE.length();
        StringBuilder sb2 = new StringBuilder(length + 9 + String.valueOf(string).length() + 13 + String.valueOf(string2).length());
        d5.u.r(sb2, strE, " leaves: ", string, " containers: ");
        sb2.append(string2);
        return sb2.toString();
    }
}
