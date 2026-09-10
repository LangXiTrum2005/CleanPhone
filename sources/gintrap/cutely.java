package gintrap;

import com.google.android.gms.ads.RequestConfiguration;
import java.util.ConcurrentModificationException;
import java.util.ListIterator;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: PersistentVectorMutableIterator.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010+\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003B\u001d\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u000f\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0013\u0010\fJ\u0017\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0014\u0010\u0012J\u000f\u0010\u0015\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0015\u0010\fJ\u000f\u0010\u0016\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0016\u0010\fJ\u000f\u0010\u0017\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0017\u0010\fR\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001c\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u001e\u0010 \u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0016\u0010\"\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\u001b¨\u0006#"}, d2 = {"Lgintrap/cutely;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "", "Lgintrap/attabal;", "Lgintrap/impromptu;", "builder", "", "index", "<init>", "(Lgintrap/impromptu;I)V", "", "impassible", "()V", "previous", "()Ljava/lang/Object;", "next", "element", "add", "(Ljava/lang/Object;)V", "remove", "set", "triweekly", "taiyuan", "cutely", "monoploid", "Lgintrap/impromptu;", "polloi", "I", "expectedModCount", "Lgintrap/impassible;", "molybdenite", "Lgintrap/impassible;", "trieIterator", "graveside", "lastIteratedIndex", "runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class cutely<T> extends attabal<T> implements ListIterator<T>, unready.attabal {

    /* JADX INFO: renamed from: graveside, reason: collision with root package name and from kotlin metadata */
    public int lastIteratedIndex;

    /* JADX INFO: renamed from: molybdenite, reason: collision with root package name and from kotlin metadata */
    public impassible<? extends T> trieIterator;

    /* JADX INFO: renamed from: monoploid, reason: collision with root package name and from kotlin metadata */
    public final impromptu<T> builder;

    /* JADX INFO: renamed from: polloi, reason: collision with root package name and from kotlin metadata */
    public int expectedModCount;

    public cutely(impromptu<T> impromptuVar, int i) {
        super(i, impromptuVar.size());
        this.builder = impromptuVar;
        this.expectedModCount = impromptuVar.beachfront();
        this.lastIteratedIndex = -1;
        triweekly();
    }

    private final void impassible() {
        impromptu(this.builder.size());
        this.expectedModCount = this.builder.beachfront();
        this.lastIteratedIndex = -1;
        triweekly();
    }

    @Override // gintrap.attabal, java.util.ListIterator
    public void add(T element) {
        taiyuan();
        this.builder.add(getIndex(), element);
        competently(getIndex() + 1);
        impassible();
    }

    public final void cutely() {
        if (this.lastIteratedIndex == -1) {
            throw new IllegalStateException();
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public T next() {
        taiyuan();
        saneness();
        this.lastIteratedIndex = getIndex();
        impassible<? extends T> impassibleVar = this.trieIterator;
        if (impassibleVar == null) {
            Object[] objArrTaiyuan = this.builder.getTail();
            int index = getIndex();
            competently(index + 1);
            return (T) objArrTaiyuan[index];
        }
        if (impassibleVar.hasNext()) {
            competently(getIndex() + 1);
            return impassibleVar.next();
        }
        Object[] objArrTaiyuan2 = this.builder.getTail();
        int index2 = getIndex();
        competently(index2 + 1);
        return (T) objArrTaiyuan2[index2 - impassibleVar.getSize()];
    }

    @Override // java.util.ListIterator
    public T previous() {
        taiyuan();
        wireman();
        this.lastIteratedIndex = getIndex() - 1;
        impassible<? extends T> impassibleVar = this.trieIterator;
        if (impassibleVar == null) {
            Object[] objArrTaiyuan = this.builder.getTail();
            competently(getIndex() - 1);
            return (T) objArrTaiyuan[getIndex()];
        }
        if (getIndex() <= impassibleVar.getSize()) {
            competently(getIndex() - 1);
            return impassibleVar.previous();
        }
        Object[] objArrTaiyuan2 = this.builder.getTail();
        competently(getIndex() - 1);
        return (T) objArrTaiyuan2[getIndex() - impassibleVar.getSize()];
    }

    @Override // gintrap.attabal, java.util.ListIterator, java.util.Iterator
    public void remove() {
        taiyuan();
        cutely();
        this.builder.remove(this.lastIteratedIndex);
        if (this.lastIteratedIndex < getIndex()) {
            competently(this.lastIteratedIndex);
        }
        impassible();
    }

    @Override // gintrap.attabal, java.util.ListIterator
    public void set(T element) {
        taiyuan();
        cutely();
        this.builder.set(this.lastIteratedIndex, element);
        this.expectedModCount = this.builder.beachfront();
        triweekly();
    }

    public final void taiyuan() {
        if (this.expectedModCount != this.builder.beachfront()) {
            throw new ConcurrentModificationException();
        }
    }

    public final void triweekly() {
        Object[] objArrCompetently = this.builder.getRoot();
        if (objArrCompetently == null) {
            this.trieIterator = null;
            return;
        }
        int iWireman = triweekly.wireman(this.builder.size());
        int iCompetently = p002kotlin.ranges.wireman.competently(getIndex(), iWireman);
        int iImpromptu = (this.builder.getRootShift() / 5) + 1;
        impassible<? extends T> impassibleVar = this.trieIterator;
        if (impassibleVar == null) {
            this.trieIterator = new impassible<>(objArrCompetently, iCompetently, iWireman, iImpromptu);
        } else {
            Intrinsics.beachfront(impassibleVar);
            impassibleVar.triweekly(objArrCompetently, iCompetently, iWireman, iImpromptu);
        }
    }
}
