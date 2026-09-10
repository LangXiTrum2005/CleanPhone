package p002kotlin.collections;

import java.util.AbstractCollection;
import java.util.Collection;
import p002kotlin.Metadata;
import unready.saneness;

/* JADX INFO: compiled from: AbstractMutableCollection.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001f\n\u0002\u0018\u0002\n\u0002\b\u0003\b'\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003B\t\b\u0004¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lkotlin/collections/competently;", "E", "", "Ljava/util/AbstractCollection;", "<init>", "()V", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class competently<E> extends AbstractCollection<E> implements Collection<E>, saneness {
    public abstract int saneness();

    @Override // java.util.AbstractCollection, java.util.Collection
    public final /* bridge */ int size() {
        return saneness();
    }
}
