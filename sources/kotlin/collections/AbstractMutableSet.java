package kotlin.collections;

import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.markers.KMutableSet;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0000\b'\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003¨\u0006\u0004"}, d2 = {"Lkotlin/collections/AbstractMutableSet;", "E", "", "Ljava/util/AbstractSet;", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class AbstractMutableSet<E> extends java.util.AbstractSet<E> implements Set<E>, KMutableSet {
    public abstract int d();

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final /* bridge */ int size() {
        return d();
    }
}
