package com.google.common.collect;

import com.google.common.base.Preconditions;
import com.google.errorprone.annotations.DoNotMock;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
@ElementTypesAreNonnullByDefault
public abstract class ImmutableTable<R, C, V> extends AbstractTable<R, C, V> implements Serializable {
    private static final long serialVersionUID = 912559;

    @DoNotMock
    public static final class Builder<R, C, V> {
    }

    public static final class SerializedForm implements Serializable {
        private static final long serialVersionUID = 0;
        public final Object[] X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public final Object[] f19862Y;
        public final Object[] Z;
        public final int[] e0;
        public final int[] f0;

        public SerializedForm(Object[] objArr, Object[] objArr2, Object[] objArr3, int[] iArr, int[] iArr2) {
            this.X = objArr;
            this.f19862Y = objArr2;
            this.Z = objArr3;
            this.e0 = iArr;
            this.f0 = iArr2;
        }

        public static SerializedForm a(ImmutableTable immutableTable, int[] iArr, int[] iArr2) {
            ImmutableSet immutableSetKeySet = immutableTable.g().keySet();
            Object[] objArr = ImmutableCollection.X;
            return new SerializedForm(immutableSetKeySet.toArray(objArr), immutableTable.q().keySet().toArray(objArr), immutableTable.v().toArray(objArr), iArr, iArr2);
        }

        public Object readResolve() {
            Object[] objArr = this.Z;
            if (objArr.length == 0) {
                return SparseImmutableTable.h0;
            }
            int length = objArr.length;
            Object[] objArr2 = this.f19862Y;
            Object[] objArr3 = this.X;
            if (length == 1) {
                return new SingletonImmutableTable(objArr3[0], objArr2[0], objArr[0]);
            }
            ImmutableList.Builder builder = new ImmutableList.Builder(objArr.length);
            for (int i2 = 0; i2 < objArr.length; i2++) {
                builder.h(ImmutableTable.n(objArr3[this.e0[i2]], objArr2[this.f0[i2]], objArr[i2]));
            }
            ImmutableList immutableListJ = builder.j();
            ImmutableSet immutableSetV = ImmutableSet.v(objArr3);
            ImmutableSet immutableSetV2 = ImmutableSet.v(objArr2);
            return ((long) ((RegularImmutableList) immutableListJ).e0) > (((long) immutableSetV.size()) * ((long) immutableSetV2.size())) / 2 ? new DenseImmutableTable(immutableListJ, immutableSetV, immutableSetV2) : new SparseImmutableTable(immutableListJ, immutableSetV, immutableSetV2);
        }
    }

    public static Table.Cell n(Object obj, Object obj2, Object obj3) {
        Preconditions.j(obj, "rowKey");
        Preconditions.j(obj2, "columnKey");
        Preconditions.j(obj3, "value");
        return new Tables.ImmutableCell(obj, obj2, obj3);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    @Override // com.google.common.collect.AbstractTable
    public final Iterator d() {
        throw new AssertionError("should never be called");
    }

    @Override // com.google.common.collect.AbstractTable
    public final void h() {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.AbstractTable
    public final boolean i(Object obj) {
        return ((ImmutableCollection) super.l()).contains(obj);
    }

    @Override // com.google.common.collect.AbstractTable
    public final Iterator m() {
        throw new AssertionError("should never be called");
    }

    @Override // com.google.common.collect.AbstractTable, com.google.common.collect.Table
    public final Set o() {
        return (ImmutableSet) super.o();
    }

    public final ImmutableSet p() {
        return (ImmutableSet) super.o();
    }

    public abstract ImmutableMap q();

    @Override // com.google.common.collect.AbstractTable
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public abstract ImmutableSet j();

    @Override // com.google.common.collect.AbstractTable
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public abstract ImmutableCollection k();

    public Object t(Object obj, Object obj2) {
        Map map = (Map) Maps.i(g(), obj);
        if (map == null) {
            return null;
        }
        return Maps.i(map, obj2);
    }

    @Override // com.google.common.collect.Table
    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public abstract ImmutableMap g();

    public final ImmutableCollection v() {
        return (ImmutableCollection) super.l();
    }

    public abstract Object writeReplace();
}
