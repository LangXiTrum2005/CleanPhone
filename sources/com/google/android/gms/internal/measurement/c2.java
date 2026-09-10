package com.google.android.gms.internal.measurement;

import com.facebook.appevents.iap.InAppPurchaseConstants;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class c2 implements b6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f23341a;

    public c2(Boolean bool) {
        this.f23341a = bool == null ? false : bool.booleanValue();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c2) && this.f23341a == ((c2) obj).f23341a;
    }

    public final int hashCode() {
        return Boolean.valueOf(this.f23341a).hashCode();
    }

    @Override // com.google.android.gms.internal.measurement.b6
    public final b6 m(String str, d8 d8Var, ArrayList arrayList) {
        boolean zEquals = InAppPurchaseConstants.METHOD_TO_STRING.equals(str);
        boolean z10 = this.f23341a;
        if (zEquals) {
            return new e6(Boolean.toString(z10));
        }
        throw new IllegalArgumentException(q4.a.i(Boolean.toString(z10), ".", str, " is not a function."));
    }

    public final String toString() {
        return String.valueOf(this.f23341a);
    }

    @Override // com.google.android.gms.internal.measurement.b6
    public final String zzc() {
        return Boolean.toString(this.f23341a);
    }

    @Override // com.google.android.gms.internal.measurement.b6
    public final Double zzd() {
        return Double.valueOf(true != this.f23341a ? 0.0d : 1.0d);
    }

    @Override // com.google.android.gms.internal.measurement.b6
    public final Boolean zze() {
        return Boolean.valueOf(this.f23341a);
    }

    @Override // com.google.android.gms.internal.measurement.b6
    public final Iterator zzf() {
        return null;
    }

    @Override // com.google.android.gms.internal.measurement.b6
    public final b6 zzt() {
        return new c2(Boolean.valueOf(this.f23341a));
    }
}
