package com.ironsource;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public interface C5<T> {

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static final class a<T> implements C5<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final ArrayList<T> f25851a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final ArrayList<T> f25852b;

        public a(ArrayList<T> a8, ArrayList<T> b10) {
            kotlin.jvm.internal.n.f(a8, "a");
            kotlin.jvm.internal.n.f(b10, "b");
            this.f25851a = a8;
            this.f25852b = b10;
        }

        @Override // com.ironsource.C5
        public boolean contains(T t10) {
            return this.f25851a.contains(t10) || this.f25852b.contains(t10);
        }

        @Override // com.ironsource.C5
        public int size() {
            return this.f25852b.size() + this.f25851a.size();
        }

        @Override // com.ironsource.C5
        public List<T> value() {
            return xj.n.B0(this.f25852b, this.f25851a);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static final class b<T> implements C5<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final C5<T> f25853a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Comparator<T> f25854b;

        public b(C5<T> collection, Comparator<T> comparator) {
            kotlin.jvm.internal.n.f(collection, "collection");
            kotlin.jvm.internal.n.f(comparator, "comparator");
            this.f25853a = collection;
            this.f25854b = comparator;
        }

        @Override // com.ironsource.C5
        public boolean contains(T t10) {
            return this.f25853a.contains(t10);
        }

        @Override // com.ironsource.C5
        public int size() {
            return this.f25853a.size();
        }

        @Override // com.ironsource.C5
        public List<T> value() {
            return xj.n.I0(this.f25853a.value(), this.f25854b);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static final class c<T> implements C5<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f25855a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final List<T> f25856b;

        public c(C5<T> collection, int i10) {
            kotlin.jvm.internal.n.f(collection, "collection");
            this.f25855a = i10;
            this.f25856b = collection.value();
        }

        public final List<T> a() {
            int size = this.f25856b.size();
            int i10 = this.f25855a;
            if (size <= i10) {
                return xj.v.f53866a;
            }
            List<T> list = this.f25856b;
            return list.subList(i10, list.size());
        }

        public final List<T> b() {
            List<T> list = this.f25856b;
            int size = list.size();
            int i10 = this.f25855a;
            if (size > i10) {
                size = i10;
            }
            return list.subList(0, size);
        }

        @Override // com.ironsource.C5
        public boolean contains(T t10) {
            return this.f25856b.contains(t10);
        }

        @Override // com.ironsource.C5
        public int size() {
            return this.f25856b.size();
        }

        @Override // com.ironsource.C5
        public List<T> value() {
            return this.f25856b;
        }
    }

    boolean contains(T t10);

    int size();

    List<T> value();
}
