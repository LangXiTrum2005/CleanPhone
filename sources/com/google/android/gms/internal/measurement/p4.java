package com.google.android.gms.internal.measurement;

import com.facebook.appevents.iap.InAppPurchaseConstants;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public abstract class p4 implements b6, x5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f23836a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap f23837b = new HashMap();

    public p4(String str) {
        this.f23836a = str;
    }

    public abstract b6 a(d8 d8Var, List list);

    @Override // com.google.android.gms.internal.measurement.x5
    public final void b(String str, b6 b6Var) {
        HashMap map = this.f23837b;
        if (b6Var == null) {
            map.remove(str);
        } else {
            map.put(str, b6Var);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p4)) {
            return false;
        }
        p4 p4Var = (p4) obj;
        String str = this.f23836a;
        if (str != null) {
            return str.equals(p4Var.f23836a);
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f23836a;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.measurement.b6
    public final b6 m(String str, d8 d8Var, ArrayList arrayList) {
        return InAppPurchaseConstants.METHOD_TO_STRING.equals(str) ? new e6(this.f23836a) : x5.h(this, new e6(str), d8Var, arrayList);
    }

    @Override // com.google.android.gms.internal.measurement.b6
    public final String zzc() {
        return this.f23836a;
    }

    @Override // com.google.android.gms.internal.measurement.b6
    public final Double zzd() {
        return Double.valueOf(Double.NaN);
    }

    @Override // com.google.android.gms.internal.measurement.b6
    public final Boolean zze() {
        return Boolean.TRUE;
    }

    @Override // com.google.android.gms.internal.measurement.b6
    public final Iterator zzf() {
        return new q5(this.f23837b.keySet().iterator());
    }

    @Override // com.google.android.gms.internal.measurement.x5
    public final boolean zzj(String str) {
        return this.f23837b.containsKey(str);
    }

    @Override // com.google.android.gms.internal.measurement.x5
    public final b6 zzk(String str) {
        HashMap map = this.f23837b;
        return map.containsKey(str) ? (b6) map.get(str) : b6.S8;
    }

    @Override // com.google.android.gms.internal.measurement.b6
    public b6 zzt() {
        return this;
    }
}
