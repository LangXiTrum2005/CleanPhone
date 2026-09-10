package com.ironsource;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class Pg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<B> f27065a;

    /* JADX WARN: Multi-variable type inference failed */
    public Pg(List<? extends B> instances) {
        kotlin.jvm.internal.n.f(instances, "instances");
        this.f27065a = instances;
    }

    public final List<B> a() {
        return this.f27065a;
    }

    public final List<B> b() {
        return this.f27065a;
    }

    public final int c() {
        return this.f27065a.size();
    }

    public final String d() {
        ArrayList arrayList = new ArrayList();
        for (B b10 : this.f27065a) {
            arrayList.add(a(b10.h(), b10.r()));
        }
        return xj.n.u0(arrayList, ",", null, null, null, 62);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Pg) && kotlin.jvm.internal.n.a(this.f27065a, ((Pg) obj).f27065a);
    }

    public int hashCode() {
        return this.f27065a.hashCode();
    }

    public String toString() {
        return "WaterfallInstances(instances=" + this.f27065a + ")";
    }

    public final Pg a(List<? extends B> instances) {
        kotlin.jvm.internal.n.f(instances, "instances");
        return new Pg(instances);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Pg a(Pg pg2, List list, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            list = pg2.f27065a;
        }
        return pg2.a(list);
    }

    private final String a(C0526q2 c0526q2, int i10) {
        return String.format("%s%s", Arrays.copyOf(new Object[]{Integer.valueOf(i10), c0526q2.c()}, 2));
    }
}
