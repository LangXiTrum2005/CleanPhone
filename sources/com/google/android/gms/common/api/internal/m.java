package com.google.android.gms.common.api.internal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f11729a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f11730b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f11731c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f11732d;

    public m(am.e eVar, boolean z10, na.b bVar, int i10) {
        this.f11729a = eVar;
        this.f11730b = z10;
        this.f11732d = bVar;
        this.f11731c = i10;
    }

    public static m b() {
        m mVar = new m();
        mVar.f11730b = true;
        mVar.f11731c = 0;
        return mVar;
    }

    public static m c(char c4) {
        return new m(new am.e(new na.c(c4), 22), false, na.d.f46628b, Integer.MAX_VALUE);
    }

    public m a() {
        k9.c0.a("execute parameter required", ((k) this.f11732d) != null);
        i9.c[] cVarArr = (i9.c[]) this.f11729a;
        boolean z10 = this.f11730b;
        int i10 = this.f11731c;
        m mVar = new m();
        mVar.f11732d = this;
        mVar.f11729a = cVarArr;
        boolean z11 = false;
        if (cVarArr != null && z10) {
            z11 = true;
        }
        mVar.f11730b = z11;
        mVar.f11731c = i10;
        return mVar;
    }

    public List d(CharSequence charSequence) {
        charSequence.getClass();
        Iterator itZ = ((am.e) this.f11729a).z(this, charSequence);
        ArrayList arrayList = new ArrayList();
        while (true) {
            na.q qVar = (na.q) itZ;
            if (!qVar.hasNext()) {
                return Collections.unmodifiableList(arrayList);
            }
            arrayList.add((String) qVar.next());
        }
    }
}
