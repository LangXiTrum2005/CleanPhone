package patroclinal;

import com.ironsource.C3414a2;
import com.ironsource.X3;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ULongArray.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0016\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010(\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u000b\b\u0087@\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001-B\u0011\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006B\u0011\b\u0001\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0003H\u0086\u0002¢\u0006\u0004\b\f\u0010\rJ \u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u0002H\u0086\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0016\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00020\u0012H\u0096\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0018\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u001d\u0010\u001a\u001a\u00020\u00162\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\u001eHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b!\u0010\"J\u001a\u0010%\u001a\u00020\u00162\b\u0010$\u001a\u0004\u0018\u00010#HÖ\u0003¢\u0006\u0004\b%\u0010&R\u001a\u0010\b\u001a\u00020\u00078\u0000X\u0081\u0004¢\u0006\f\n\u0004\b'\u0010(\u0012\u0004\b)\u0010*R\u0014\u0010\u0004\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b+\u0010,\u0088\u0001\b\u0092\u0001\u00020\u0007¨\u0006."}, d2 = {"Lpatroclinal/polloi;", "", "Lpatroclinal/monoploid;", "", "size", "wireman", "(I)[J", "", X3.a.k, "marial", "([J)[J", "index", "cutely", "([JI)J", "value", "", "polloi", "([JIJ)V", "", "monoploid", "([J)Ljava/util/Iterator;", "element", "", "competently", "([JJ)Z", "elements", "impromptu", "([JLjava/util/Collection;)Z", "arytenoidectomy", "([J)Z", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", C3414a2.d, "equals", "(Ljava/lang/Object;)Z", "kowloon", "[J", "getStorage$annotations", "()V", "triweekly", "([J)I", "attabal", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class polloi implements Collection<monoploid>, unready.attabal {

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name and from kotlin metadata */
    public final long[] storage;

    /* JADX INFO: compiled from: ULongArray.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0002\u0010\u0016\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0004\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007H\u0096\u0002¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0016\u0010\u0011\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"Lpatroclinal/polloi$attabal;", "", "Lpatroclinal/monoploid;", "", "array", "<init>", "([J)V", "", "hasNext", "()Z", "saneness", "()J", "kowloon", "[J", "", "arytenoidectomy", "I", "index", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class attabal implements Iterator<monoploid>, unready.attabal {

        /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name and from kotlin metadata */
        public int index;

        /* JADX INFO: renamed from: kowloon, reason: collision with root package name and from kotlin metadata */
        public final long[] array;

        public attabal(long[] array) {
            Intrinsics.checkNotNullParameter(array, "array");
            this.array = array;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.index < this.array.length;
        }

        @Override // java.util.Iterator
        public /* bridge */ /* synthetic */ monoploid next() {
            return monoploid.attabal(saneness());
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public long saneness() {
            int i = this.index;
            long[] jArr = this.array;
            if (i >= jArr.length) {
                throw new NoSuchElementException(String.valueOf(this.index));
            }
            this.index = i + 1;
            return monoploid.dern(jArr[i]);
        }
    }

    public /* synthetic */ polloi(long[] jArr) {
        this.storage = jArr;
    }

    public static boolean arytenoidectomy(long[] jArr) {
        return jArr.length == 0;
    }

    public static boolean competently(long[] jArr, long j) {
        return p002kotlin.collections.polloi.merc(jArr, j);
    }

    public static final long cutely(long[] jArr, int i) {
        return monoploid.dern(jArr[i]);
    }

    public static boolean impromptu(long[] jArr, Collection<monoploid> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        Collection<monoploid> collection2 = elements;
        if (collection2.isEmpty()) {
            return true;
        }
        for (Object obj : collection2) {
            if (!(obj instanceof monoploid) || !p002kotlin.collections.polloi.merc(jArr, ((monoploid) obj).getData())) {
                return false;
            }
        }
        return true;
    }

    public static int kowloon(long[] jArr) {
        return Arrays.hashCode(jArr);
    }

    public static long[] marial(long[] storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        return storage;
    }

    public static String molybdenite(long[] jArr) {
        return "ULongArray(storage=" + Arrays.toString(jArr) + ')';
    }

    public static Iterator<monoploid> monoploid(long[] jArr) {
        return new attabal(jArr);
    }

    public static final void polloi(long[] jArr, int i, long j) {
        jArr[i] = j;
    }

    public static final /* synthetic */ polloi saneness(long[] jArr) {
        return new polloi(jArr);
    }

    public static boolean taiyuan(long[] jArr, Object obj) {
        return (obj instanceof polloi) && Intrinsics.wireman(jArr, ((polloi) obj).getStorage());
    }

    public static int triweekly(long[] jArr) {
        return jArr.length;
    }

    public static long[] wireman(int i) {
        return marial(new long[i]);
    }

    @Override // java.util.Collection
    public /* bridge */ /* synthetic */ boolean add(monoploid monoploidVar) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean addAll(Collection<? extends monoploid> collection2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean beachfront(long j) {
        return competently(this.storage, j);
    }

    @Override // java.util.Collection
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof monoploid) {
            return beachfront(((monoploid) obj).getData());
        }
        return false;
    }

    @Override // java.util.Collection
    public boolean containsAll(Collection<?> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        return impromptu(this.storage, elements);
    }

    @Override // java.util.Collection
    public boolean equals(Object other) {
        return taiyuan(this.storage, other);
    }

    /* JADX INFO: renamed from: graveside, reason: from getter */
    public final /* synthetic */ long[] getStorage() {
        return this.storage;
    }

    @Override // java.util.Collection
    public int hashCode() {
        return kowloon(this.storage);
    }

    @Override // java.util.Collection
    /* JADX INFO: renamed from: impassible, reason: merged with bridge method [inline-methods] */
    public int size() {
        return triweekly(this.storage);
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        return arytenoidectomy(this.storage);
    }

    @Override // java.util.Collection, java.lang.Iterable
    public Iterator<monoploid> iterator() {
        return monoploid(this.storage);
    }

    @Override // java.util.Collection
    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean removeAll(Collection<?> collection2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean retainAll(Collection<?> collection2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public Object[] toArray() {
        return p002kotlin.jvm.internal.impromptu.attabal(this);
    }

    public String toString() {
        return molybdenite(this.storage);
    }

    @Override // java.util.Collection
    public <T> T[] toArray(T[] array) {
        Intrinsics.checkNotNullParameter(array, "array");
        return (T[]) p002kotlin.jvm.internal.impromptu.saneness(this, array);
    }
}
