package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class t2 implements b6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b6 f23979a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f23980b;

    public t2(String str) {
        this.f23979a = b6.S8;
        this.f23980b = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof t2)) {
            return false;
        }
        t2 t2Var = (t2) obj;
        return this.f23980b.equals(t2Var.f23980b) && this.f23979a.equals(t2Var.f23979a);
    }

    public final int hashCode() {
        return this.f23979a.hashCode() + (this.f23980b.hashCode() * 31);
    }

    @Override // com.google.android.gms.internal.measurement.b6
    public final b6 m(String str, d8 d8Var, ArrayList arrayList) {
        throw new IllegalStateException("Control does not have functions");
    }

    @Override // com.google.android.gms.internal.measurement.b6
    public final String zzc() {
        throw new IllegalStateException("Control is not a String");
    }

    @Override // com.google.android.gms.internal.measurement.b6
    public final Double zzd() {
        throw new IllegalStateException("Control is not a double");
    }

    @Override // com.google.android.gms.internal.measurement.b6
    public final Boolean zze() {
        throw new IllegalStateException("Control is not a boolean");
    }

    @Override // com.google.android.gms.internal.measurement.b6
    public final Iterator zzf() {
        return null;
    }

    @Override // com.google.android.gms.internal.measurement.b6
    public final b6 zzt() {
        return new t2(this.f23980b, this.f23979a.zzt());
    }

    public t2(String str, b6 b6Var) {
        this.f23979a = b6Var;
        this.f23980b = str;
    }
}
