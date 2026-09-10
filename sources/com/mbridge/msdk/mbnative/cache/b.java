package com.mbridge.msdk.mbnative.cache;

import com.google.android.gms.internal.measurement.f2;
import com.mbridge.msdk.out.Campaign;
import com.mbridge.msdk.setting.g;
import com.mbridge.msdk.setting.i;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class b<K, V> {
    public long a() {
        g gVarI = f2.i(i.b());
        if (gVarI == null) {
            gVarI = i.b().a();
        }
        return gVarI.c0() * 1000;
    }

    public abstract V a(K k8, int i10);

    public abstract void a(K k8, V v4);

    public abstract void a(K k8, V v4, String str);

    public abstract void a(String str, Campaign campaign, String str2);

    public V b(K k8, int i10) {
        return null;
    }

    public long b() {
        g gVarI = f2.i(i.b());
        if (gVarI == null) {
            gVarI = i.b().a();
        }
        return gVarI.d0() * 1000;
    }
}
