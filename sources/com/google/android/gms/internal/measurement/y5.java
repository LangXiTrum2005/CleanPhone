package com.google.android.gms.internal.measurement;

import com.facebook.appevents.iap.InAppPurchaseConstants;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public class y5 implements b6, x5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f24170a = new HashMap();

    @Override // com.google.android.gms.internal.measurement.x5
    public final void b(String str, b6 b6Var) {
        HashMap map = this.f24170a;
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
        if (obj instanceof y5) {
            return this.f24170a.equals(((y5) obj).f24170a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f24170a.hashCode();
    }

    @Override // com.google.android.gms.internal.measurement.b6
    public b6 m(String str, d8 d8Var, ArrayList arrayList) {
        return InAppPurchaseConstants.METHOD_TO_STRING.equals(str) ? new e6(toString()) : x5.h(this, new e6(str), d8Var, arrayList);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("{");
        HashMap map = this.f24170a;
        if (!map.isEmpty()) {
            for (String str : map.keySet()) {
                sb2.append(String.format("%s: %s,", str, map.get(str)));
            }
            sb2.deleteCharAt(sb2.lastIndexOf(","));
        }
        sb2.append("}");
        return sb2.toString();
    }

    @Override // com.google.android.gms.internal.measurement.b6
    public final String zzc() {
        return "[object Object]";
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
        return new q5(this.f24170a.keySet().iterator());
    }

    @Override // com.google.android.gms.internal.measurement.x5
    public final boolean zzj(String str) {
        return this.f24170a.containsKey(str);
    }

    @Override // com.google.android.gms.internal.measurement.x5
    public final b6 zzk(String str) {
        HashMap map = this.f24170a;
        return map.containsKey(str) ? (b6) map.get(str) : b6.S8;
    }

    @Override // com.google.android.gms.internal.measurement.b6
    public final b6 zzt() {
        y5 y5Var = new y5();
        for (Map.Entry entry : this.f24170a.entrySet()) {
            boolean z10 = entry.getValue() instanceof x5;
            HashMap map = y5Var.f24170a;
            if (z10) {
                map.put((String) entry.getKey(), (b6) entry.getValue());
            } else {
                map.put((String) entry.getKey(), ((b6) entry.getValue()).zzt());
            }
        }
        return y5Var;
    }
}
