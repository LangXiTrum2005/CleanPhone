package com.google.android.gms.internal.measurement;

import java.util.Calendar;
import java.util.Date;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class y extends androidx.datastore.preferences.protobuf.m {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final x f24161c;

    public y(xh xhVar, int i10, x xVar) {
        super(xhVar, i10);
        this.f24161c = xVar;
        StringBuilder sb2 = new StringBuilder("%");
        xhVar.d(sb2);
        sb2.append(true != xhVar.c() ? 't' : 'T');
        sb2.append(xVar.f24136a);
    }

    @Override // androidx.datastore.preferences.protobuf.m
    public final void D(qg qgVar, Object obj) {
        xh xhVar = (xh) this.f4131b;
        StringBuilder sb2 = (StringBuilder) qgVar.f23909g;
        boolean z10 = obj instanceof Date;
        x xVar = this.f24161c;
        if (z10 || (obj instanceof Calendar) || (obj instanceof Long)) {
            StringBuilder sb3 = new StringBuilder("%");
            xhVar.d(sb3);
            sb3.append(true != xhVar.c() ? 't' : 'T');
            sb3.append(xVar.f24136a);
            sb2.append(String.format(zh.f24211a, sb3.toString(), obj));
            return;
        }
        char c4 = xVar.f24136a;
        StringBuilder sb4 = new StringBuilder(String.valueOf(c4).length() + 2);
        sb4.append("%t");
        sb4.append(c4);
        qg.h(sb2, obj, sb4.toString());
    }
}
