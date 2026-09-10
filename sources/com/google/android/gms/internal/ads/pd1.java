package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class pd1 extends id1 {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public List f18588p;

    public pd1(ca1 ca1Var, boolean z10) {
        List arrayList;
        super(ca1Var, z10, true);
        if (ca1Var.isEmpty()) {
            arrayList = Collections.EMPTY_LIST;
        } else {
            int size = ca1Var.size();
            rb0.p(size, "initialArraySize");
            arrayList = new ArrayList(size);
        }
        for (int i10 = 0; i10 < ca1Var.size(); i10++) {
            arrayList.add(null);
        }
        this.f18588p = arrayList;
        v();
    }

    @Override // com.google.android.gms.internal.ads.id1
    public final void r(int i10) {
        this.l = null;
        this.f18588p = null;
    }

    @Override // com.google.android.gms.internal.ads.id1
    public final void w(int i10, Object obj) {
        List list = this.f18588p;
        if (list != null) {
            list.set(i10, new qd1(obj));
        }
    }

    @Override // com.google.android.gms.internal.ads.id1
    public final void x() {
        List<qd1> list = this.f18588p;
        if (list != null) {
            int size = list.size();
            rb0.p(size, "initialArraySize");
            ArrayList arrayList = new ArrayList(size);
            for (qd1 qd1Var : list) {
                arrayList.add(qd1Var != null ? qd1Var.f19027a : null);
            }
            c(Collections.unmodifiableList(arrayList));
        }
    }
}
