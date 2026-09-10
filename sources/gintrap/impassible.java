package gintrap;

import java.util.NoSuchElementException;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: TrieIterator.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0001\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B/\u0012\u000e\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\u000bJ7\u0010\r\u001a\u00020\f2\u000e\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00032\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\r\u0010\u000bJ\u0010\u0010\u000e\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0010\u0010\u000fJ\u001f\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0017\u0010\u000fR\u0016\u0010\t\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001e\u0010\u001c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0016\u0010 \u001a\u00020\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006!"}, d2 = {"Lgintrap/impassible;", "E", "Lgintrap/attabal;", "", "", "root", "", "index", "size", "height", "<init>", "([Ljava/lang/Object;III)V", "", "triweekly", "next", "()Ljava/lang/Object;", "previous", "startLevel", "cutely", "(II)V", "indexPredicate", "impassible", "(I)V", "taiyuan", "monoploid", "I", "polloi", "[Ljava/lang/Object;", "path", "", "molybdenite", "Z", "isInRightEdge", "runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class impassible<E> extends attabal<E> {

    /* JADX INFO: renamed from: molybdenite, reason: collision with root package name and from kotlin metadata */
    public boolean isInRightEdge;

    /* JADX INFO: renamed from: monoploid, reason: collision with root package name and from kotlin metadata */
    public int height;

    /* JADX INFO: renamed from: polloi, reason: collision with root package name and from kotlin metadata */
    public Object[] path;

    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r5v3 */
    public impassible(Object[] objArr, int i, int i2, int i3) {
        super(i, i2);
        this.height = i3;
        Object[] objArr2 = new Object[i3];
        this.path = objArr2;
        ?? r5 = i == i2 ? 1 : 0;
        this.isInRightEdge = r5;
        objArr2[0] = objArr;
        cutely(i - r5, 1);
    }

    public final void cutely(int index, int startLevel) {
        int i = (this.height - startLevel) * 5;
        while (startLevel < this.height) {
            Object[] objArr = this.path;
            Object obj = objArr[startLevel - 1];
            Intrinsics.competently(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            objArr[startLevel] = ((Object[]) obj)[triweekly.attabal(index, i)];
            i -= 5;
            startLevel++;
        }
    }

    public final void impassible(int indexPredicate) {
        int i = 0;
        while (triweekly.attabal(getIndex(), i) == indexPredicate) {
            i += 5;
        }
        if (i > 0) {
            cutely(getIndex(), ((this.height - 1) - (i / 5)) + 1);
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public E next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        E eTaiyuan = taiyuan();
        competently(getIndex() + 1);
        if (getIndex() == getSize()) {
            this.isInRightEdge = true;
            return eTaiyuan;
        }
        impassible(0);
        return eTaiyuan;
    }

    @Override // java.util.ListIterator
    public E previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        competently(getIndex() - 1);
        if (this.isInRightEdge) {
            this.isInRightEdge = false;
            return taiyuan();
        }
        impassible(31);
        return taiyuan();
    }

    public final E taiyuan() {
        int index = getIndex() & 31;
        Object obj = this.path[this.height - 1];
        Intrinsics.competently(obj, "null cannot be cast to non-null type kotlin.Array<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.TrieIterator>");
        return (E) ((Object[]) obj)[index];
    }

    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r0v4 */
    public final void triweekly(Object[] root, int index, int size, int height) {
        competently(index);
        impromptu(size);
        this.height = height;
        if (this.path.length < height) {
            this.path = new Object[height];
        }
        this.path[0] = root;
        ?? r0 = index == size ? 1 : 0;
        this.isInRightEdge = r0;
        cutely(index - r0, 1);
    }
}
