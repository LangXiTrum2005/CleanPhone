package com.ironsource;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class L {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f26474a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List<J> f26475b = new CopyOnWriteArrayList();

    public L(int i10) {
        this.f26474a = i10;
    }

    private final boolean b() {
        return this.f26474a == 0;
    }

    private final boolean c() {
        return this.f26474a != -1;
    }

    public final void a(J j10) {
        if (b()) {
            return;
        }
        if (a()) {
            List<J> list = this.f26475b;
            kotlin.jvm.internal.n.f(list, "<this>");
            if (!list.isEmpty()) {
                list.remove(0);
            }
        }
        if (j10 == null) {
            j10 = new J(C0541r0.a.NotPartOfWaterfall);
        }
        this.f26475b.add(j10);
    }

    public final String d() {
        List<J> list = this.f26475b;
        ArrayList arrayList = new ArrayList(xj.p.W(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(((J) it.next()).b().ordinal()));
        }
        return xj.n.u0(arrayList, ",", null, null, null, 62);
    }

    private final boolean a() {
        return c() && this.f26475b.size() >= this.f26474a;
    }
}
