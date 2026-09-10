package com.google.android.gms.internal.measurement;

import java.util.Collections;
import java.util.EnumMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class z extends androidx.datastore.preferences.protobuf.m {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Map f24187d;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final wh f24188c;

    static {
        EnumMap enumMap = new EnumMap(wh.class);
        for (wh whVar : wh.values()) {
            z[] zVarArr = new z[10];
            for (int i10 = 0; i10 < 10; i10++) {
                zVarArr[i10] = new z(i10, whVar, xh.f24157e);
            }
            enumMap.put(whVar, zVarArr);
        }
        f24187d = Collections.unmodifiableMap(enumMap);
    }

    public z(int i10, wh whVar, xh xhVar) {
        super(xhVar, i10);
        gb.b(whVar, "format char");
        this.f24188c = whVar;
        if (xhVar.a()) {
            return;
        }
        int i11 = whVar.f24130a;
        i11 = xhVar.c() ? i11 & 65503 : i11;
        StringBuilder sb2 = new StringBuilder("%");
        xhVar.d(sb2);
        sb2.append((char) i11);
    }

    @Override // androidx.datastore.preferences.protobuf.m
    public final void D(qg qgVar, Object obj) {
        qgVar.e(obj, this.f24188c, (xh) this.f4131b);
    }
}
