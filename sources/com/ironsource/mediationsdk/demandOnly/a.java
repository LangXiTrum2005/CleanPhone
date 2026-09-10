package com.ironsource.mediationsdk.demandOnly;

import com.ironsource.C0526q2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public interface a {

    /* JADX INFO: renamed from: com.ironsource.mediationsdk.demandOnly.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static final class C0080a implements a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final List<C0526q2> f29381a;

        public C0080a() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        @Override // com.ironsource.mediationsdk.demandOnly.a
        public C0526q2 a(String instanceName) {
            Object next;
            kotlin.jvm.internal.n.f(instanceName, "instanceName");
            Iterator<T> it = this.f29381a.iterator();
            while (it.hasNext()) {
                next = it.next();
                if (kotlin.jvm.internal.n.a(((C0526q2) next).c(), instanceName)) {
                    return (C0526q2) next;
                }
            }
            next = null;
            return (C0526q2) next;
        }

        @Override // com.ironsource.mediationsdk.demandOnly.a
        public String b() {
            return this.f29381a.isEmpty() ? "" : defpackage.e.n("1", ((C0526q2) xj.n.o0(this.f29381a)).c());
        }

        @Override // com.ironsource.mediationsdk.demandOnly.a
        public C0526q2 get(int i10) {
            if (i10 < 0 || i10 >= this.f29381a.size()) {
                return null;
            }
            return this.f29381a.get(i10);
        }

        @Override // com.ironsource.mediationsdk.demandOnly.a
        public boolean isEmpty() {
            return this.f29381a.isEmpty();
        }

        public C0080a(List<C0526q2> waterfall) {
            kotlin.jvm.internal.n.f(waterfall, "waterfall");
            this.f29381a = waterfall;
        }

        @Override // com.ironsource.mediationsdk.demandOnly.a
        public List<C0526q2> a() {
            return this.f29381a;
        }

        public /* synthetic */ C0080a(List list, int i10, kotlin.jvm.internal.g gVar) {
            this((i10 & 1) != 0 ? new ArrayList() : list);
        }
    }

    C0526q2 a(String str);

    List<C0526q2> a();

    String b();

    C0526q2 get(int i10);

    boolean isEmpty();
}
