package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class c6 implements b6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f23350a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f23351b;

    public c6(ArrayList arrayList, String str) {
        this.f23350a = str;
        ArrayList arrayList2 = new ArrayList();
        this.f23351b = arrayList2;
        arrayList2.addAll(arrayList);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c6)) {
            return false;
        }
        c6 c6Var = (c6) obj;
        String str = c6Var.f23350a;
        String str2 = this.f23350a;
        if (str2 == null ? str == null : str2.equals(str)) {
            return this.f23351b.equals(c6Var.f23351b);
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f23350a;
        return this.f23351b.hashCode() + ((str != null ? str.hashCode() : 0) * 31);
    }

    @Override // com.google.android.gms.internal.measurement.b6
    public final b6 m(String str, d8 d8Var, ArrayList arrayList) {
        throw new IllegalStateException("Statement is not an evaluated entity");
    }

    @Override // com.google.android.gms.internal.measurement.b6
    public final String zzc() {
        throw new IllegalStateException("Statement cannot be cast as String");
    }

    @Override // com.google.android.gms.internal.measurement.b6
    public final Double zzd() {
        throw new IllegalStateException("Statement cannot be cast as Double");
    }

    @Override // com.google.android.gms.internal.measurement.b6
    public final Boolean zze() {
        throw new IllegalStateException("Statement cannot be cast as Boolean");
    }

    @Override // com.google.android.gms.internal.measurement.b6
    public final Iterator zzf() {
        return null;
    }

    @Override // com.google.android.gms.internal.measurement.b6
    public final b6 zzt() {
        return this;
    }
}
