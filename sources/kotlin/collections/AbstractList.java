package kotlin.collections;

import androidx.datastore.preferences.protobuf.a;
import com.p004ironsource.x4;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010(\n\u0002\b\u0002\n\u0002\u0010*\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b'\u0018\u0000 \u0018*\u0006\b\u0000\u0010\u0001 \u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003:\u0004\u0019\u001a\u001b\u0018J\u0016\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0096\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00072\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\b\u0010\fJ%\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010\r\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0096\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0016\u0010\u0017¨\u0006\u001c"}, d2 = {"Lkotlin/collections/AbstractList;", "E", "Lkotlin/collections/AbstractCollection;", "", "", "iterator", "()Ljava/util/Iterator;", "", "listIterator", "()Ljava/util/ListIterator;", "", "index", "(I)Ljava/util/ListIterator;", "fromIndex", "toIndex", "subList", "(II)Ljava/util/List;", "", x4.DEFAULT_AUCTION_FALLBACK_VALUE, "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "Companion", "SubList", "IteratorImpl", "ListIteratorImpl", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class AbstractList<E> extends AbstractCollection<E> implements List<E>, KMappedMarker {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    private static final int maxArraySize = 2147483639;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lkotlin/collections/AbstractList$Companion;", "", "", "maxArraySize", "I", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public static void a(int i2, int i3, int i4) {
            if (i2 < 0 || i3 > i4) {
                StringBuilder sbP = a.p(i2, i3, "startIndex: ", ", endIndex: ", ", size: ");
                sbP.append(i4);
                throw new IndexOutOfBoundsException(sbP.toString());
            }
            if (i2 > i3) {
                throw new IllegalArgumentException(android.support.v4.media.a.g(i2, i3, "startIndex: ", " > endIndex: "));
            }
        }

        public static void b(int i2, int i3) {
            if (i2 < 0 || i2 >= i3) {
                throw new IndexOutOfBoundsException(android.support.v4.media.a.g(i2, i3, "index: ", ", size: "));
            }
        }

        public static void c(int i2, int i3) {
            if (i2 < 0 || i2 > i3) {
                throw new IndexOutOfBoundsException(android.support.v4.media.a.g(i2, i3, "index: ", ", size: "));
            }
        }

        public static void d(int i2, int i3, int i4) {
            if (i2 < 0 || i3 > i4) {
                StringBuilder sbP = a.p(i2, i3, "fromIndex: ", ", toIndex: ", ", size: ");
                sbP.append(i4);
                throw new IndexOutOfBoundsException(sbP.toString());
            }
            if (i2 > i3) {
                throw new IllegalArgumentException(android.support.v4.media.a.g(i2, i3, "fromIndex: ", " > toIndex: "));
            }
        }

        public static int e(int i2, int i3) {
            int i4 = i2 + (i2 >> 1);
            if (i4 - i3 < 0) {
                i4 = i3;
            }
            if (i4 - AbstractList.maxArraySize <= 0) {
                return i4;
            }
            if (i3 > AbstractList.maxArraySize) {
                return Integer.MAX_VALUE;
            }
            return AbstractList.maxArraySize;
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0000\b\u0092\u0004\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, d2 = {"Lkotlin/collections/AbstractList$IteratorImpl;", "", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public class IteratorImpl implements Iterator<E>, KMappedMarker {
        public int X;

        public IteratorImpl() {
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.X < AbstractList.this.size();
        }

        @Override // java.util.Iterator
        public final Object next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            int i2 = this.X;
            this.X = i2 + 1;
            return AbstractList.this.get(i2);
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010*\n\u0000\b\u0092\u0004\u0018\u00002\f0\u0001R\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003¨\u0006\u0004"}, d2 = {"Lkotlin/collections/AbstractList$ListIteratorImpl;", "Lkotlin/collections/AbstractList$IteratorImpl;", "Lkotlin/collections/AbstractList;", "", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public class ListIteratorImpl extends AbstractList<E>.IteratorImpl implements ListIterator<E>, KMappedMarker {
        public ListIteratorImpl(int i2) {
            super();
            Companion companion = AbstractList.INSTANCE;
            int size = AbstractList.this.size();
            companion.getClass();
            Companion.c(i2, size);
            this.X = i2;
        }

        @Override // java.util.ListIterator
        public final void add(Object obj) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.ListIterator
        public final boolean hasPrevious() {
            return this.X > 0;
        }

        @Override // java.util.ListIterator
        public final int nextIndex() {
            return this.X;
        }

        @Override // java.util.ListIterator
        public final Object previous() {
            if (!hasPrevious()) {
                throw new NoSuchElementException();
            }
            int i2 = this.X - 1;
            this.X = i2;
            return AbstractList.this.get(i2);
        }

        @Override // java.util.ListIterator
        public final int previousIndex() {
            return this.X - 1;
        }

        @Override // java.util.ListIterator
        public final void set(Object obj) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u0000*\u0006\b\u0001\u0010\u0001 \u00012\b\u0012\u0004\u0012\u00028\u00010\u00022\u00060\u0003j\u0002`\u0004¨\u0006\u0005"}, d2 = {"Lkotlin/collections/AbstractList$SubList;", "E", "Lkotlin/collections/AbstractList;", "Ljava/util/RandomAccess;", "Lkotlin/collections/RandomAccess;", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class SubList<E> extends AbstractList<E> implements RandomAccess {
        public final AbstractList X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public final int f43269Y;
        public final int Z;

        public SubList(AbstractList abstractList, int i2, int i3) {
            this.X = abstractList;
            this.f43269Y = i2;
            Companion companion = AbstractList.INSTANCE;
            int size = abstractList.size();
            companion.getClass();
            Companion.d(i2, i3, size);
            this.Z = i3 - i2;
        }

        @Override // kotlin.collections.AbstractList, java.util.List
        public final Object get(int i2) {
            Companion companion = AbstractList.INSTANCE;
            int i3 = this.Z;
            companion.getClass();
            Companion.b(i2, i3);
            return this.X.get(this.f43269Y + i2);
        }

        @Override // kotlin.collections.AbstractCollection
        /* JADX INFO: renamed from: getSize, reason: from getter */
        public final int getZ() {
            return this.Z;
        }
    }

    @Override // java.util.List
    public void add(int i2, E e2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public boolean addAll(int i2, Collection<? extends E> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection, java.util.List
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof List)) {
            return false;
        }
        Collection other2 = (Collection) other;
        INSTANCE.getClass();
        Intrinsics.f(other2, "other");
        if (size() == other2.size()) {
            Iterator<E> it = other2.iterator();
            Iterator<E> it2 = iterator();
            while (it2.hasNext()) {
                if (!Intrinsics.a(it2.next(), it.next())) {
                }
            }
            return true;
        }
        return false;
    }

    public abstract Object get(int i2);

    @Override // java.util.Collection, java.util.List
    public int hashCode() {
        INSTANCE.getClass();
        Iterator<E> it = iterator();
        int iHashCode = 1;
        while (it.hasNext()) {
            E next = it.next();
            iHashCode = (iHashCode * 31) + (next != null ? next.hashCode() : 0);
        }
        return iHashCode;
    }

    public int indexOf(Object obj) {
        Iterator<E> it = iterator();
        int i2 = 0;
        while (it.hasNext()) {
            if (Intrinsics.a(it.next(), obj)) {
                return i2;
            }
            i2++;
        }
        return -1;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator<E> iterator() {
        return new IteratorImpl();
    }

    public int lastIndexOf(Object obj) {
        ListIterator<E> listIterator = listIterator(size());
        while (listIterator.hasPrevious()) {
            if (Intrinsics.a(listIterator.previous(), obj)) {
                return listIterator.nextIndex();
            }
        }
        return -1;
    }

    @Override // java.util.List
    public ListIterator<E> listIterator() {
        return new ListIteratorImpl(0);
    }

    @Override // java.util.List
    public E remove(int i2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public E set(int i2, E e2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public List<E> subList(int fromIndex, int toIndex) {
        return new SubList(this, fromIndex, toIndex);
    }

    @Override // java.util.List
    public ListIterator<E> listIterator(int index) {
        return new ListIteratorImpl(index);
    }
}
