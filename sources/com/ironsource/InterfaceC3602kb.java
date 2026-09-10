package com.ironsource;

import com.ironsource.mediationsdk.logger.IronSourceError;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.kb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public interface InterfaceC3602kb<T> {

    /* JADX INFO: renamed from: com.ironsource.kb$a */
    public static final class a<T> implements InterfaceC3602kb<T> {
        private final IronSourceError a;

        public a(IronSourceError error) {
            Intrinsics.checkNotNullParameter(error, "error");
            this.a = error;
        }

        public final IronSourceError a() {
            return this.a;
        }

        public final IronSourceError b() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && Intrinsics.wireman(this.a, ((a) obj).a);
        }

        public int hashCode() {
            return this.a.hashCode();
        }

        public String toString() {
            return "Failure(error=" + this.a + ")";
        }

        public final a<T> a(IronSourceError error) {
            Intrinsics.checkNotNullParameter(error, "error");
            return new a<>(error);
        }

        public static /* synthetic */ a a(a aVar, IronSourceError ironSourceError, int i, Object obj) {
            if ((i & 1) != 0) {
                ironSourceError = aVar.a;
            }
            return aVar.a(ironSourceError);
        }
    }

    /* JADX INFO: renamed from: com.ironsource.kb$b */
    public static final class b<T> implements InterfaceC3602kb<T> {
        private final T a;

        public b(T t) {
            this.a = t;
        }

        public final T a() {
            return this.a;
        }

        public final T b() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && Intrinsics.wireman(this.a, ((b) obj).a);
        }

        public int hashCode() {
            T t = this.a;
            if (t == null) {
                return 0;
            }
            return t.hashCode();
        }

        public String toString() {
            return "Success(value=" + this.a + ")";
        }

        public final b<T> a(T t) {
            return new b<>(t);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ b a(b bVar, Object obj, int i, Object obj2) {
            if ((i & 1) != 0) {
                obj = bVar.a;
            }
            return bVar.a(obj);
        }
    }
}
