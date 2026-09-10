package androidx.compose.runtime.snapshots;

import androidx.compose.runtime.lightstruck;
import com.google.android.gms.ads.RequestConfiguration;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import p002kotlin.KotlinNothingValueException;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.jvm.internal.Ref$IntRef;

/* JADX INFO: compiled from: SnapshotStateList.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\b\n\n\u0002\u0010)\n\u0002\b\b\n\u0002\u0010+\n\u0002\b\u001a\b\u0001\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B%\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0018\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001d\u0010\u0013\u001a\u00020\u000e2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0018\u0010\u0016\u001a\u00028\u00002\u0006\u0010\u0015\u001a\u00020\u0005H\u0096\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0018\u001a\u00020\u00052\u0006\u0010\r\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0016\u0010\u001d\u001a\b\u0012\u0004\u0012\u00028\u00000\u001cH\u0096\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010\u001f\u001a\u00020\u00052\u0006\u0010\r\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u001f\u0010\u0019J\u0017\u0010 \u001a\u00020\u000e2\u0006\u0010\r\u001a\u00028\u0000H\u0016¢\u0006\u0004\b \u0010\u0010J\u001f\u0010 \u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\u00052\u0006\u0010\r\u001a\u00028\u0000H\u0016¢\u0006\u0004\b \u0010!J%\u0010\"\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u00052\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011H\u0016¢\u0006\u0004\b\"\u0010#J\u001d\u0010\"\u001a\u00020\u000e2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011H\u0016¢\u0006\u0004\b\"\u0010\u0014J\u000f\u0010$\u001a\u00020\nH\u0016¢\u0006\u0004\b$\u0010\fJ\u0015\u0010&\u001a\b\u0012\u0004\u0012\u00028\u00000%H\u0016¢\u0006\u0004\b&\u0010'J\u001d\u0010&\u001a\b\u0012\u0004\u0012\u00028\u00000%2\u0006\u0010\u0015\u001a\u00020\u0005H\u0016¢\u0006\u0004\b&\u0010(J\u0017\u0010)\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00028\u0000H\u0016¢\u0006\u0004\b)\u0010\u0010J\u001d\u0010*\u001a\u00020\u000e2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011H\u0016¢\u0006\u0004\b*\u0010\u0014J\u0017\u0010+\u001a\u00028\u00002\u0006\u0010\u0015\u001a\u00020\u0005H\u0016¢\u0006\u0004\b+\u0010\u0017J\u001d\u0010,\u001a\u00020\u000e2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011H\u0016¢\u0006\u0004\b,\u0010\u0014J \u0010-\u001a\u00028\u00002\u0006\u0010\u0015\u001a\u00020\u00052\u0006\u0010\r\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b-\u0010.J%\u0010/\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005H\u0016¢\u0006\u0004\b/\u00100R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0006¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u00104R\u0014\u00107\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u0016\u00109\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u00106R$\u0010>\u001a\u00020\u00052\u0006\u0010:\u001a\u00020\u00058\u0016@RX\u0096\u000e¢\u0006\f\n\u0004\b;\u00106\u001a\u0004\b<\u0010=¨\u0006?"}, d2 = {"Landroidx/compose/runtime/snapshots/creditor;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "", "Landroidx/compose/runtime/snapshots/SnapshotStateList;", "parentList", "", "fromIndex", "toIndex", "<init>", "(Landroidx/compose/runtime/snapshots/SnapshotStateList;II)V", "", "marial", "()V", "element", "", "contains", "(Ljava/lang/Object;)Z", "", "elements", "containsAll", "(Ljava/util/Collection;)Z", "index", "get", "(I)Ljava/lang/Object;", "indexOf", "(Ljava/lang/Object;)I", "isEmpty", "()Z", "", "iterator", "()Ljava/util/Iterator;", "lastIndexOf", "add", "(ILjava/lang/Object;)V", "addAll", "(ILjava/util/Collection;)Z", "clear", "", "listIterator", "()Ljava/util/ListIterator;", "(I)Ljava/util/ListIterator;", "remove", "removeAll", "wireman", "retainAll", "set", "(ILjava/lang/Object;)Ljava/lang/Object;", "subList", "(II)Ljava/util/List;", "kowloon", "Landroidx/compose/runtime/snapshots/SnapshotStateList;", "getParentList", "()Landroidx/compose/runtime/snapshots/SnapshotStateList;", "arytenoidectomy", "I", "offset", "monoploid", "structure", "value", "polloi", "saneness", "()I", "size", "runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class creditor<T> implements List<T>, unready.wireman {

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name and from kotlin metadata */
    public final int offset;

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name and from kotlin metadata */
    public final SnapshotStateList<T> parentList;

    /* JADX INFO: renamed from: monoploid, reason: collision with root package name and from kotlin metadata */
    public int structure;

    /* JADX INFO: renamed from: polloi, reason: collision with root package name and from kotlin metadata */
    public int size;

    /* JADX INFO: compiled from: SnapshotStateList.kt */
    @Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0010+\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0001\n\u0002\b\b*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\n\u0010\u0007J\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u000f\u0010\u0004J\u0010\u0010\u0010\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u0010\u0010\tJ\u000f\u0010\u0011\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0013\u0010\u000e¨\u0006\u0014"}, d2 = {"androidx/compose/runtime/snapshots/creditor$attabal", "", "", "hasPrevious", "()Z", "", "nextIndex", "()I", "previous", "()Ljava/lang/Object;", "previousIndex", "element", "", "saneness", "(Ljava/lang/Object;)Ljava/lang/Void;", "hasNext", "next", "wireman", "()Ljava/lang/Void;", "marial", "runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class attabal implements ListIterator<T>, unready.attabal {

        /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
        public final /* synthetic */ creditor<T> f6185arytenoidectomy;

        /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
        public final /* synthetic */ Ref$IntRef f6186kowloon;

        public attabal(Ref$IntRef ref$IntRef, creditor<T> creditorVar) {
            this.f6186kowloon = ref$IntRef;
            this.f6185arytenoidectomy = creditorVar;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
            return this.f6186kowloon.element < this.f6185arytenoidectomy.size() - 1;
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return this.f6186kowloon.element >= 0;
        }

        @Override // java.util.ListIterator
        /* JADX INFO: renamed from: marial, reason: merged with bridge method [inline-methods] */
        public Void set(T element) {
            cord.cutely();
            throw new KotlinNothingValueException();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public T next() {
            int i = this.f6186kowloon.element + 1;
            cord.impassible(i, this.f6185arytenoidectomy.size());
            this.f6186kowloon.element = i;
            return this.f6185arytenoidectomy.get(i);
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return this.f6186kowloon.element + 1;
        }

        @Override // java.util.ListIterator
        public T previous() {
            int i = this.f6186kowloon.element;
            cord.impassible(i, this.f6185arytenoidectomy.size());
            this.f6186kowloon.element = i - 1;
            return this.f6185arytenoidectomy.get(i);
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return this.f6186kowloon.element;
        }

        @Override // java.util.ListIterator
        /* JADX INFO: renamed from: saneness, reason: merged with bridge method [inline-methods] */
        public Void add(T element) {
            cord.cutely();
            throw new KotlinNothingValueException();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        /* JADX INFO: renamed from: wireman, reason: merged with bridge method [inline-methods] */
        public Void remove() {
            cord.cutely();
            throw new KotlinNothingValueException();
        }
    }

    public creditor(SnapshotStateList<T> snapshotStateList, int i, int i2) {
        this.parentList = snapshotStateList;
        this.offset = i;
        this.structure = cord.impromptu(snapshotStateList);
        this.size = i2 - i;
    }

    private final void marial() {
        if (cord.impromptu(this.parentList) != this.structure) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.List, java.util.Collection
    public boolean add(T element) {
        marial();
        this.parentList.add(this.offset + size(), element);
        this.size = size() + 1;
        this.structure = cord.impromptu(this.parentList);
        return true;
    }

    @Override // java.util.List
    public boolean addAll(int index, Collection<? extends T> elements) {
        marial();
        boolean zAddAll = this.parentList.addAll(index + this.offset, elements);
        if (zAddAll) {
            this.size = size() + elements.size();
            this.structure = cord.impromptu(this.parentList);
        }
        return zAddAll;
    }

    @Override // java.util.List, java.util.Collection
    public void clear() {
        if (size() > 0) {
            marial();
            SnapshotStateList<T> snapshotStateList = this.parentList;
            int i = this.offset;
            snapshotStateList.taiyuan(i, size() + i);
            this.size = 0;
            this.structure = cord.impromptu(this.parentList);
        }
    }

    @Override // java.util.List, java.util.Collection
    public boolean contains(Object element) {
        return indexOf(element) >= 0;
    }

    @Override // java.util.List, java.util.Collection
    public boolean containsAll(Collection<?> elements) {
        Collection<?> collection2 = elements;
        if ((collection2 instanceof Collection) && collection2.isEmpty()) {
            return true;
        }
        Iterator<T> it = collection2.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.List
    public T get(int index) {
        marial();
        cord.impassible(index, size());
        return this.parentList.get(this.offset + index);
    }

    @Override // java.util.List
    public int indexOf(Object element) {
        marial();
        int i = this.offset;
        Iterator<Integer> it = p002kotlin.ranges.wireman.monoploid(i, size() + i).iterator();
        while (it.hasNext()) {
            int iNextInt = ((p002kotlin.collections.kattegat) it).nextInt();
            if (Intrinsics.wireman(element, this.parentList.get(iNextInt))) {
                return iNextInt - this.offset;
            }
        }
        return -1;
    }

    @Override // java.util.List, java.util.Collection
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public Iterator<T> iterator() {
        return listIterator();
    }

    @Override // java.util.List
    public int lastIndexOf(Object element) {
        marial();
        int size = this.offset + size();
        do {
            size--;
            if (size < this.offset) {
                return -1;
            }
        } while (!Intrinsics.wireman(element, this.parentList.get(size)));
        return size - this.offset;
    }

    @Override // java.util.List
    public ListIterator<T> listIterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    public final /* bridge */ T remove(int i) {
        return wireman(i);
    }

    @Override // java.util.List, java.util.Collection
    public boolean removeAll(Collection<?> elements) {
        Iterator<?> it = elements.iterator();
        while (true) {
            boolean z = false;
            while (it.hasNext()) {
                if (remove(it.next()) || z) {
                    z = true;
                }
            }
            return z;
        }
    }

    @Override // java.util.List, java.util.Collection
    public boolean retainAll(Collection<?> elements) {
        marial();
        SnapshotStateList<T> snapshotStateList = this.parentList;
        int i = this.offset;
        int iArytenoidectomy = snapshotStateList.arytenoidectomy(elements, i, size() + i);
        if (iArytenoidectomy > 0) {
            this.structure = cord.impromptu(this.parentList);
            this.size = size() - iArytenoidectomy;
        }
        return iArytenoidectomy > 0;
    }

    /* JADX INFO: renamed from: saneness, reason: from getter */
    public int getSize() {
        return this.size;
    }

    @Override // java.util.List
    public T set(int index, T element) {
        cord.impassible(index, size());
        marial();
        T t = this.parentList.set(index + this.offset, element);
        this.structure = cord.impromptu(this.parentList);
        return t;
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ int size() {
        return getSize();
    }

    @Override // java.util.List
    public List<T> subList(int fromIndex, int toIndex) {
        if (!(fromIndex >= 0 && fromIndex <= toIndex && toIndex <= size())) {
            lightstruck.attabal("fromIndex or toIndex are out of bounds");
        }
        marial();
        SnapshotStateList<T> snapshotStateList = this.parentList;
        int i = this.offset;
        return new creditor(snapshotStateList, fromIndex + i, toIndex + i);
    }

    @Override // java.util.List, java.util.Collection
    public Object[] toArray() {
        return p002kotlin.jvm.internal.impromptu.attabal(this);
    }

    public T wireman(int index) {
        marial();
        T tRemove = this.parentList.remove(this.offset + index);
        this.size = size() - 1;
        this.structure = cord.impromptu(this.parentList);
        return tRemove;
    }

    @Override // java.util.List
    public ListIterator<T> listIterator(int index) {
        marial();
        Ref$IntRef ref$IntRef = new Ref$IntRef();
        ref$IntRef.element = index - 1;
        return new attabal(ref$IntRef, this);
    }

    @Override // java.util.List, java.util.Collection
    public boolean remove(Object element) {
        int iIndexOf = indexOf(element);
        if (iIndexOf < 0) {
            return false;
        }
        remove(iIndexOf);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public <T> T[] toArray(T[] tArr) {
        return (T[]) p002kotlin.jvm.internal.impromptu.saneness(this, tArr);
    }

    @Override // java.util.List
    public void add(int index, T element) {
        marial();
        this.parentList.add(this.offset + index, element);
        this.size = size() + 1;
        this.structure = cord.impromptu(this.parentList);
    }

    @Override // java.util.List, java.util.Collection
    public boolean addAll(Collection<? extends T> elements) {
        return addAll(size(), elements);
    }
}
