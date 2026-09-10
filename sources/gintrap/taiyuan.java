package gintrap;

import com.google.android.gms.ads.RequestConfiguration;
import p002kotlin.Metadata;

/* JADX INFO: compiled from: PersistentVectorIterator.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B=\u0012\u000e\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u000f\u0010\u000eR\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"Lgintrap/taiyuan;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lgintrap/attabal;", "", "", "root", "tail", "", "index", "size", "trieHeight", "<init>", "([Ljava/lang/Object;[Ljava/lang/Object;III)V", "next", "()Ljava/lang/Object;", "previous", "monoploid", "[Ljava/lang/Object;", "Lgintrap/impassible;", "polloi", "Lgintrap/impassible;", "trieIterator", "runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class taiyuan<T> extends attabal<T> {

    /* JADX INFO: renamed from: monoploid, reason: collision with root package name and from kotlin metadata */
    public final T[] tail;

    /* JADX INFO: renamed from: polloi, reason: collision with root package name and from kotlin metadata */
    public final impassible<T> trieIterator;

    public taiyuan(Object[] objArr, T[] tArr, int i, int i2, int i3) {
        super(i, i2);
        this.tail = tArr;
        int iWireman = triweekly.wireman(i2);
        this.trieIterator = new impassible<>(objArr, p002kotlin.ranges.wireman.competently(i, iWireman), iWireman, i3);
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public T next() {
        saneness();
        if (this.trieIterator.hasNext()) {
            competently(getIndex() + 1);
            return this.trieIterator.next();
        }
        T[] tArr = this.tail;
        int index = getIndex();
        competently(index + 1);
        return tArr[index - this.trieIterator.getSize()];
    }

    @Override // java.util.ListIterator
    public T previous() {
        wireman();
        if (getIndex() <= this.trieIterator.getSize()) {
            competently(getIndex() - 1);
            return this.trieIterator.previous();
        }
        T[] tArr = this.tail;
        competently(getIndex() - 1);
        return tArr[getIndex() - this.trieIterator.getSize()];
    }
}
