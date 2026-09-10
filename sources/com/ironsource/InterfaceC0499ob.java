package com.ironsource;

import com.ironsource.mediationsdk.logger.IronSourceError;

/* JADX INFO: renamed from: com.ironsource.ob, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public interface InterfaceC0499ob<T> {

    /* JADX INFO: renamed from: com.ironsource.ob$a */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static final class a<T> implements InterfaceC0499ob<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final IronSourceError f29934a;

        public a(IronSourceError error) {
            kotlin.jvm.internal.n.f(error, "error");
            this.f29934a = error;
        }

        public final IronSourceError a() {
            return this.f29934a;
        }

        public final IronSourceError b() {
            return this.f29934a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && kotlin.jvm.internal.n.a(this.f29934a, ((a) obj).f29934a);
        }

        public int hashCode() {
            return this.f29934a.hashCode();
        }

        public String toString() {
            return "Failure(error=" + this.f29934a + ")";
        }

        public final a<T> a(IronSourceError error) {
            kotlin.jvm.internal.n.f(error, "error");
            return new a<>(error);
        }

        public static /* synthetic */ a a(a aVar, IronSourceError ironSourceError, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                ironSourceError = aVar.f29934a;
            }
            return aVar.a(ironSourceError);
        }
    }

    /* JADX INFO: renamed from: com.ironsource.ob$b */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static final class b<T> implements InterfaceC0499ob<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final T f29935a;

        public b(T t10) {
            this.f29935a = t10;
        }

        public final T a() {
            return this.f29935a;
        }

        public final T b() {
            return this.f29935a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && kotlin.jvm.internal.n.a(this.f29935a, ((b) obj).f29935a);
        }

        public int hashCode() {
            T t10 = this.f29935a;
            if (t10 == null) {
                return 0;
            }
            return t10.hashCode();
        }

        public String toString() {
            return "Success(value=" + this.f29935a + ")";
        }

        public final b<T> a(T t10) {
            return new b<>(t10);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ b a(b bVar, Object obj, int i10, Object obj2) {
            if ((i10 & 1) != 0) {
                obj = bVar.f29935a;
            }
            return bVar.a(obj);
        }
    }
}
