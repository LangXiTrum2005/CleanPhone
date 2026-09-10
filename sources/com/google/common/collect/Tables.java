package com.google.common.collect;

import com.google.common.base.Function;
import com.google.common.base.Objects;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;

/* JADX INFO: loaded from: classes4.dex */
@ElementTypesAreNonnullByDefault
public final class Tables {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Function f19972a = new AnonymousClass1();

    /* JADX INFO: renamed from: com.google.common.collect.Tables$1, reason: invalid class name */
    public class AnonymousClass1 implements Function<Map<Object, Object>, Map<Object, Object>> {
        @Override // com.google.common.base.Function, androidx.arch.core.util.Function, com.google.android.datatransport.Transformer
        public final Object apply(Object obj) {
            return Collections.unmodifiableMap((Map) obj);
        }
    }

    public static abstract class AbstractCell<R, C, V> implements Table.Cell<R, C, V> {
        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj instanceof Table.Cell) {
                Table.Cell cell = (Table.Cell) obj;
                if (Objects.a(d(), cell.d()) && Objects.a(g(), cell.g()) && Objects.a(getValue(), cell.getValue())) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            return Arrays.hashCode(new Object[]{d(), g(), getValue()});
        }

        public final String toString() {
            return "(" + d() + "," + g() + ")=" + getValue();
        }
    }

    public static final class ImmutableCell<R, C, V> extends AbstractCell<R, C, V> implements Serializable {
        private static final long serialVersionUID = 0;
        public final Object X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public final Object f19973Y;
        public final Object Z;

        public ImmutableCell(Object obj, Object obj2, Object obj3) {
            this.X = obj;
            this.f19973Y = obj2;
            this.Z = obj3;
        }

        @Override // com.google.common.collect.Table.Cell
        public final Object d() {
            return this.X;
        }

        @Override // com.google.common.collect.Table.Cell
        public final Object g() {
            return this.f19973Y;
        }

        @Override // com.google.common.collect.Table.Cell
        public final Object getValue() {
            return this.Z;
        }
    }

    public static class TransformedTable<R, C, V1, V2> extends AbstractTable<R, C, V2> {

        /* JADX INFO: renamed from: com.google.common.collect.Tables$TransformedTable$1, reason: invalid class name */
        class AnonymousClass1 implements Function<Table.Cell<Object, Object, Object>, Table.Cell<Object, Object, Object>> {
            @Override // com.google.common.base.Function, androidx.arch.core.util.Function, com.google.android.datatransport.Transformer
            public final Object apply(Object obj) {
                Table.Cell cell = (Table.Cell) obj;
                cell.d();
                cell.g();
                throw null;
            }
        }

        /* JADX INFO: renamed from: com.google.common.collect.Tables$TransformedTable$2, reason: invalid class name */
        class AnonymousClass2 implements Function<Map<Object, Object>, Map<Object, Object>> {
            @Override // com.google.common.base.Function, androidx.arch.core.util.Function, com.google.android.datatransport.Transformer
            public final Object apply(Object obj) {
                throw null;
            }
        }

        /* JADX INFO: renamed from: com.google.common.collect.Tables$TransformedTable$3, reason: invalid class name */
        class AnonymousClass3 implements Function<Map<Object, Object>, Map<Object, Object>> {
            @Override // com.google.common.base.Function, androidx.arch.core.util.Function, com.google.android.datatransport.Transformer
            public final Object apply(Object obj) {
                throw null;
            }
        }

        @Override // com.google.common.collect.AbstractTable
        public final Iterator d() {
            throw null;
        }

        @Override // com.google.common.collect.Table
        public final Map g() {
            throw null;
        }

        @Override // com.google.common.collect.AbstractTable
        public final void h() {
            throw null;
        }

        @Override // com.google.common.collect.AbstractTable
        public final Collection k() {
            throw null;
        }

        @Override // com.google.common.collect.Table
        public final int size() {
            throw null;
        }
    }

    public static class TransposeTable<C, R, V> extends AbstractTable<C, R, V> {
        public static final Function Z = null;

        /* JADX INFO: renamed from: com.google.common.collect.Tables$TransposeTable$1, reason: invalid class name */
        public class AnonymousClass1 implements Function<Table.Cell<?, ?, ?>, Table.Cell<?, ?, ?>> {
            @Override // com.google.common.base.Function, androidx.arch.core.util.Function, com.google.android.datatransport.Transformer
            public final Object apply(Object obj) {
                Table.Cell cell = (Table.Cell) obj;
                return new ImmutableCell(cell.g(), cell.d(), cell.getValue());
            }
        }

        @Override // com.google.common.collect.AbstractTable
        public final Iterator d() {
            throw null;
        }

        @Override // com.google.common.collect.Table
        public final Map g() {
            throw null;
        }

        @Override // com.google.common.collect.AbstractTable
        public final void h() {
            throw null;
        }

        @Override // com.google.common.collect.AbstractTable
        public final boolean i(Object obj) {
            throw null;
        }

        @Override // com.google.common.collect.Table
        public final int size() {
            throw null;
        }
    }

    public static final class UnmodifiableRowSortedMap<R, C, V> extends UnmodifiableTable<R, C, V> implements RowSortedTable<R, C, V> {
        private static final long serialVersionUID = 0;

        @Override // com.google.common.collect.Tables.UnmodifiableTable, com.google.common.collect.ForwardingTable, com.google.common.collect.Table
        public final Map g() {
            throw null;
        }

        @Override // com.google.common.collect.Tables.UnmodifiableTable, com.google.common.collect.ForwardingTable, com.google.common.collect.ForwardingObject
        /* JADX INFO: renamed from: w */
        public final /* bridge */ /* synthetic */ Object x() {
            return null;
        }

        @Override // com.google.common.collect.Tables.UnmodifiableTable, com.google.common.collect.ForwardingTable, com.google.common.collect.Table
        public final SortedMap g() {
            throw null;
        }
    }

    public static class UnmodifiableTable<R, C, V> extends ForwardingTable<R, C, V> implements Serializable {
        private static final long serialVersionUID = 0;

        @Override // com.google.common.collect.ForwardingTable, com.google.common.collect.Table
        public Map g() {
            return Collections.unmodifiableMap(new Maps.TransformedEntriesMap(super.g(), new Maps.AnonymousClass9(Tables.f19972a)));
        }

        @Override // com.google.common.collect.ForwardingTable, com.google.common.collect.Table
        public final Set o() {
            return Collections.unmodifiableSet(super.o());
        }

        @Override // com.google.common.collect.ForwardingTable, com.google.common.collect.ForwardingObject
        /* JADX INFO: renamed from: w */
        public /* bridge */ /* synthetic */ Object x() {
            return null;
        }
    }
}
