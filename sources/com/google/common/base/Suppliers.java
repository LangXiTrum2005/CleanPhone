package com.google.common.base;

import android.support.v4.media.a;
import java.io.Serializable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
@ElementTypesAreNonnullByDefault
public final class Suppliers {

    public static class ExpiringMemoizingSupplier<T> implements Supplier<T>, Serializable {
        private static final long serialVersionUID = 0;

        @Override // com.google.common.base.Supplier
        public final Object get() {
            throw null;
        }

        public final String toString() {
            return "Suppliers.memoizeWithExpiration(null, 0, NANOS)";
        }
    }

    public static class MemoizingSupplier<T> implements Supplier<T>, Serializable {
        private static final long serialVersionUID = 0;
        public final Supplier X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public volatile transient boolean f19727Y;
        public transient Object Z;

        public MemoizingSupplier(Supplier supplier) {
            this.X = supplier;
        }

        @Override // com.google.common.base.Supplier
        public final Object get() {
            if (!this.f19727Y) {
                synchronized (this) {
                    try {
                        if (!this.f19727Y) {
                            Object obj = this.X.get();
                            this.Z = obj;
                            this.f19727Y = true;
                            return obj;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            return this.Z;
        }

        public final String toString() {
            return a.q(new StringBuilder("Suppliers.memoize("), this.f19727Y ? a.q(new StringBuilder("<supplier that returned "), this.Z, ">") : this.X, ")");
        }
    }

    public static class NonSerializableMemoizingSupplier<T> implements Supplier<T> {
        public static final androidx.media3.datasource.a Z = new androidx.media3.datasource.a(3);
        public volatile Supplier X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public Object f19728Y;

        @Override // com.google.common.base.Supplier
        public final Object get() {
            Supplier supplier = this.X;
            androidx.media3.datasource.a aVar = Z;
            if (supplier != aVar) {
                synchronized (this) {
                    try {
                        if (this.X != aVar) {
                            Object obj = this.X.get();
                            this.f19728Y = obj;
                            this.X = aVar;
                            return obj;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            return this.f19728Y;
        }

        public final String toString() {
            Object objQ = this.X;
            StringBuilder sb = new StringBuilder("Suppliers.memoize(");
            if (objQ == Z) {
                objQ = a.q(new StringBuilder("<supplier that returned "), this.f19728Y, ">");
            }
            return a.q(sb, objQ, ")");
        }
    }

    public static class SupplierComposition<F, T> implements Supplier<T>, Serializable {
        private static final long serialVersionUID = 0;

        public final boolean equals(Object obj) {
            if (!(obj instanceof SupplierComposition)) {
                return false;
            }
            ((SupplierComposition) obj).getClass();
            throw null;
        }

        @Override // com.google.common.base.Supplier
        public final Object get() {
            throw null;
        }

        public final int hashCode() {
            return Arrays.hashCode(new Object[]{null, null});
        }

        public final String toString() {
            return "Suppliers.compose(null, null)";
        }
    }

    public interface SupplierFunction<T> extends Function<Supplier<T>, T> {
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class SupplierFunctionImpl implements SupplierFunction<Object> {
        public static final /* synthetic */ SupplierFunctionImpl[] X = {new SupplierFunctionImpl("INSTANCE", 0)};

        /* JADX INFO: Fake field, exist only in values array */
        SupplierFunctionImpl EF5;

        public static SupplierFunctionImpl valueOf(String str) {
            return (SupplierFunctionImpl) Enum.valueOf(SupplierFunctionImpl.class, str);
        }

        public static SupplierFunctionImpl[] values() {
            return (SupplierFunctionImpl[]) X.clone();
        }

        @Override // com.google.common.base.Function, androidx.arch.core.util.Function, com.google.android.datatransport.Transformer
        public final Object apply(Object obj) {
            return ((Supplier) obj).get();
        }

        @Override // java.lang.Enum
        public final String toString() {
            return "Suppliers.supplierFunction()";
        }
    }

    public static class SupplierOfInstance<T> implements Supplier<T>, Serializable {
        private static final long serialVersionUID = 0;
        public final Object X;

        public SupplierOfInstance(Object obj) {
            this.X = obj;
        }

        public final boolean equals(Object obj) {
            if (obj instanceof SupplierOfInstance) {
                return Objects.a(this.X, ((SupplierOfInstance) obj).X);
            }
            return false;
        }

        @Override // com.google.common.base.Supplier
        public final Object get() {
            return this.X;
        }

        public final int hashCode() {
            return Arrays.hashCode(new Object[]{this.X});
        }

        public final String toString() {
            return a.q(new StringBuilder("Suppliers.ofInstance("), this.X, ")");
        }
    }

    public static class ThreadSafeSupplier<T> implements Supplier<T>, Serializable {
        private static final long serialVersionUID = 0;

        @Override // com.google.common.base.Supplier
        public final Object get() {
            throw null;
        }

        public final String toString() {
            return "Suppliers.synchronizedSupplier(null)";
        }
    }

    public static Supplier a(Supplier supplier) {
        if ((supplier instanceof NonSerializableMemoizingSupplier) || (supplier instanceof MemoizingSupplier)) {
            return supplier;
        }
        if (supplier instanceof Serializable) {
            return new MemoizingSupplier(supplier);
        }
        NonSerializableMemoizingSupplier nonSerializableMemoizingSupplier = new NonSerializableMemoizingSupplier();
        nonSerializableMemoizingSupplier.X = supplier;
        return nonSerializableMemoizingSupplier;
    }

    public static Supplier b(Object obj) {
        return new SupplierOfInstance(obj);
    }
}
