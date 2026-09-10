package kotlin.collections;

import java.util.RandomAccess;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00060\u0003j\u0002`\u0004¨\u0006\u0005"}, d2 = {"kotlin/collections/ArraysKt___ArraysJvmKt$asList$1", "Lkotlin/collections/AbstractList;", "", "Ljava/util/RandomAccess;", "Lkotlin/collections/RandomAccess;", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ArraysKt___ArraysJvmKt$asList$1 extends AbstractList<Byte> implements RandomAccess {
    @Override // kotlin.collections.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        if (!(obj instanceof Byte)) {
            return false;
        }
        ArraysKt.g(null, ((Number) obj).byteValue());
        throw null;
    }

    @Override // kotlin.collections.AbstractList, java.util.List
    public final Object get(int i2) {
        throw null;
    }

    @Override // kotlin.collections.AbstractCollection
    /* JADX INFO: renamed from: getSize */
    public final int getZ() {
        throw null;
    }

    @Override // kotlin.collections.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Byte)) {
            return -1;
        }
        ArraysKt.C(null, ((Number) obj).byteValue());
        throw null;
    }

    @Override // kotlin.collections.AbstractCollection, java.util.Collection
    public final boolean isEmpty() {
        throw null;
    }

    @Override // kotlin.collections.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        if (!(obj instanceof Byte)) {
            return -1;
        }
        ((Number) obj).byteValue();
        Intrinsics.f(null, "<this>");
        throw null;
    }
}
