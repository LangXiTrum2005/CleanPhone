package androidx.collection;

import p002kotlin.Metadata;

/* JADX INFO: compiled from: ScatterSet.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0003\u001a\u0019\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a)\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0004\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00028\u0000¢\u0006\u0004\b\u0006\u0010\u0007\"\u001c\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0002\u0010\t¨\u0006\u000b"}, d2 = {"E", "Landroidx/collection/saran;", "attabal", "()Landroidx/collection/saran;", "element1", "element2", "saneness", "(Ljava/lang/Object;Ljava/lang/Object;)Landroidx/collection/saran;", "", "Landroidx/collection/saran;", "EmptyScatterSet", "collection"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class mathsort {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static final saran<Object> f5710attabal = new saran<>(0);

    public static final <E> saran<E> attabal() {
        return new saran<>(0, 1, null);
    }

    public static final <E> saran<E> saneness(E e, E e2) {
        saran<E> saranVar = new saran<>(2);
        saranVar.rotuma(e);
        saranVar.rotuma(e2);
        return saranVar;
    }
}
