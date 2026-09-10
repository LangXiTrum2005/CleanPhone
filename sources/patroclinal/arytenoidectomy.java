package patroclinal;

import com.ironsource.C3414a2;
import com.ironsource.X3;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: UIntArray.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010(\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u000b\b\u0087@\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001-B\u0011\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006B\u0011\b\u0001\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0003H\u0086\u0002¢\u0006\u0004\b\f\u0010\rJ \u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u0002H\u0086\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0016\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00020\u0012H\u0096\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0018\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u001d\u0010\u001a\u001a\u00020\u00162\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\u001eHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b!\u0010\"J\u001a\u0010%\u001a\u00020\u00162\b\u0010$\u001a\u0004\u0018\u00010#HÖ\u0003¢\u0006\u0004\b%\u0010&R\u001a\u0010\b\u001a\u00020\u00078\u0000X\u0081\u0004¢\u0006\f\n\u0004\b'\u0010(\u0012\u0004\b)\u0010*R\u0014\u0010\u0004\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b+\u0010,\u0088\u0001\b\u0092\u0001\u00020\u0007¨\u0006."}, d2 = {"Lpatroclinal/arytenoidectomy;", "", "Lpatroclinal/kowloon;", "", "size", "wireman", "(I)[I", "", X3.a.k, "marial", "([I)[I", "index", "cutely", "([II)I", "value", "", "polloi", "([III)V", "", "monoploid", "([I)Ljava/util/Iterator;", "element", "", "competently", "([II)Z", "elements", "impromptu", "([ILjava/util/Collection;)Z", "arytenoidectomy", "([I)Z", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", C3414a2.d, "equals", "(Ljava/lang/Object;)Z", "kowloon", "[I", "getStorage$annotations", "()V", "triweekly", "([I)I", "attabal", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class arytenoidectomy implements Collection<kowloon>, unready.attabal {

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name and from kotlin metadata */
    public final int[] storage;

    /* JADX INFO: compiled from: UIntArray.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0004\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007H\u0096\u0002¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0016\u0010\u0011\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"Lpatroclinal/arytenoidectomy$attabal;", "", "Lpatroclinal/kowloon;", "", "array", "<init>", "([I)V", "", "hasNext", "()Z", "saneness", "()I", "kowloon", "[I", "", "arytenoidectomy", "I", "index", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class attabal implements Iterator<kowloon>, unready.attabal {

        /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name and from kotlin metadata */
        public int index;

        /* JADX INFO: renamed from: kowloon, reason: collision with root package name and from kotlin metadata */
        public final int[] array;

        public attabal(int[] array) {
            Intrinsics.checkNotNullParameter(array, "array");
            this.array = array;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.index < this.array.length;
        }

        @Override // java.util.Iterator
        public /* bridge */ /* synthetic */ kowloon next() {
            return kowloon.attabal(saneness());
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public int saneness() {
            int i = this.index;
            int[] iArr = this.array;
            if (i >= iArr.length) {
                throw new NoSuchElementException(String.valueOf(this.index));
            }
            this.index = i + 1;
            return kowloon.dern(iArr[i]);
        }
    }

    public /* synthetic */ arytenoidectomy(int[] iArr) {
        this.storage = iArr;
    }

    public static boolean arytenoidectomy(int[] iArr) {
        return iArr.length == 0;
    }

    public static boolean competently(int[] iArr, int i) {
        return p002kotlin.collections.polloi.restrictive(iArr, i);
    }

    public static final int cutely(int[] iArr, int i) {
        return kowloon.dern(iArr[i]);
    }

    public static boolean impromptu(int[] iArr, Collection<kowloon> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        Collection<kowloon> collection2 = elements;
        if (collection2.isEmpty()) {
            return true;
        }
        for (Object obj : collection2) {
            if (!(obj instanceof kowloon) || !p002kotlin.collections.polloi.restrictive(iArr, ((kowloon) obj).getData())) {
                return false;
            }
        }
        return true;
    }

    public static int kowloon(int[] iArr) {
        return Arrays.hashCode(iArr);
    }

    public static int[] marial(int[] storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        return storage;
    }

    public static String molybdenite(int[] iArr) {
        return "UIntArray(storage=" + Arrays.toString(iArr) + ')';
    }

    public static Iterator<kowloon> monoploid(int[] iArr) {
        return new attabal(iArr);
    }

    public static final void polloi(int[] iArr, int i, int i2) {
        iArr[i] = i2;
    }

    public static final /* synthetic */ arytenoidectomy saneness(int[] iArr) {
        return new arytenoidectomy(iArr);
    }

    public static boolean taiyuan(int[] iArr, Object obj) {
        return (obj instanceof arytenoidectomy) && Intrinsics.wireman(iArr, ((arytenoidectomy) obj).getStorage());
    }

    public static int triweekly(int[] iArr) {
        return iArr.length;
    }

    public static int[] wireman(int i) {
        return marial(new int[i]);
    }

    @Override // java.util.Collection
    public /* bridge */ /* synthetic */ boolean add(kowloon kowloonVar) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean addAll(Collection<? extends kowloon> collection2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean beachfront(int i) {
        return competently(this.storage, i);
    }

    @Override // java.util.Collection
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof kowloon) {
            return beachfront(((kowloon) obj).getData());
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
    public final /* synthetic */ int[] getStorage() {
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
    public Iterator<kowloon> iterator() {
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
