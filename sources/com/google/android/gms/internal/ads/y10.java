package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class y10 implements Iterable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f22072a = new ArrayList();

    public final boolean b(b30 b30Var) {
        ArrayList arrayList = new ArrayList();
        for (w10 w10Var : this.f22072a) {
            if (w10Var.f21361b == b30Var) {
                arrayList.add(w10Var);
            }
        }
        if (arrayList.isEmpty()) {
            return false;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((w10) it.next()).f21362c.p();
        }
        return true;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.f22072a.iterator();
    }
}
