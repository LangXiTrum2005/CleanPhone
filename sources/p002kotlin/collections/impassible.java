package p002kotlin.collections;

import com.google.android.gms.ads.RequestConfiguration;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import java.util.AbstractList;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.ranges.wireman;

/* JADX INFO: compiled from: ArrayDeque.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0010\u001e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b!\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\r\b\u0007\u0018\u0000 Q*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002:\u0001RB\t\b\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u000b\u0010\tJ\u0017\u0010\r\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u000f\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0010\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0011\u0010\u000eJ%\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u00052\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u0013H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u0019\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u0018\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u001f\u0010\u001b\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u0018\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u001b\u0010\u001aJ\u001f\u0010\u001e\u001a\u00020\u00072\u0006\u0010\u001c\u001a\u00020\u00052\u0006\u0010\u001d\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u001e\u0010\u001aJ\u000f\u0010\u001f\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u001f\u0010\u0004J\u000f\u0010!\u001a\u00020 H\u0016¢\u0006\u0004\b!\u0010\"J\r\u0010#\u001a\u00028\u0000¢\u0006\u0004\b#\u0010$J\r\u0010%\u001a\u00028\u0000¢\u0006\u0004\b%\u0010$J\u0015\u0010'\u001a\u00020\u00072\u0006\u0010&\u001a\u00028\u0000¢\u0006\u0004\b'\u0010(J\u0015\u0010)\u001a\u00020\u00072\u0006\u0010&\u001a\u00028\u0000¢\u0006\u0004\b)\u0010(J\r\u0010*\u001a\u00028\u0000¢\u0006\u0004\b*\u0010$J\u000f\u0010+\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b+\u0010$J\r\u0010,\u001a\u00028\u0000¢\u0006\u0004\b,\u0010$J\u000f\u0010-\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b-\u0010$J\u0017\u0010.\u001a\u00020 2\u0006\u0010&\u001a\u00028\u0000H\u0016¢\u0006\u0004\b.\u0010/J\u001f\u0010.\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u00052\u0006\u0010&\u001a\u00028\u0000H\u0016¢\u0006\u0004\b.\u00100J\u001d\u00101\u001a\u00020 2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u0013H\u0016¢\u0006\u0004\b1\u00102J%\u00101\u001a\u00020 2\u0006\u0010\f\u001a\u00020\u00052\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u0013H\u0016¢\u0006\u0004\b1\u00103J\u0018\u00104\u001a\u00028\u00002\u0006\u0010\f\u001a\u00020\u0005H\u0096\u0002¢\u0006\u0004\b4\u00105J \u00106\u001a\u00028\u00002\u0006\u0010\f\u001a\u00020\u00052\u0006\u0010&\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b6\u00107J\u0018\u00108\u001a\u00020 2\u0006\u0010&\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b8\u0010/J\u0017\u00109\u001a\u00020\u00052\u0006\u0010&\u001a\u00028\u0000H\u0016¢\u0006\u0004\b9\u0010:J\u0017\u0010;\u001a\u00020\u00052\u0006\u0010&\u001a\u00028\u0000H\u0016¢\u0006\u0004\b;\u0010:J\u0017\u0010<\u001a\u00020 2\u0006\u0010&\u001a\u00028\u0000H\u0016¢\u0006\u0004\b<\u0010/J\u0017\u0010=\u001a\u00028\u00002\u0006\u0010\f\u001a\u00020\u0005H\u0016¢\u0006\u0004\b=\u00105J\u001d\u0010>\u001a\u00020 2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u0013H\u0016¢\u0006\u0004\b>\u00102J\u001d\u0010?\u001a\u00020 2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u0013H\u0016¢\u0006\u0004\b?\u00102J\u000f\u0010@\u001a\u00020\u0007H\u0016¢\u0006\u0004\b@\u0010\u0004J)\u0010D\u001a\b\u0012\u0004\u0012\u00028\u00010B\"\u0004\b\u0001\u0010A2\f\u0010C\u001a\b\u0012\u0004\u0012\u00028\u00010BH\u0016¢\u0006\u0004\bD\u0010EJ\u0017\u0010D\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010F0BH\u0016¢\u0006\u0004\bD\u0010GJ\u001f\u0010H\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u0018\u001a\u00020\u0005H\u0014¢\u0006\u0004\bH\u0010\u001aR\u0016\u0010J\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010IR\u001e\u0010L\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010F0B8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010KR$\u0010P\u001a\u00020\u00052\u0006\u0010M\u001a\u00020\u00058\u0016@RX\u0096\u000e¢\u0006\f\n\u0004\b\u001b\u0010I\u001a\u0004\bN\u0010O¨\u0006S"}, d2 = {"Lkotlin/collections/impassible;", "E", "Lkotlin/collections/impromptu;", "<init>", "()V", "", "minCapacity", "", "beachfront", "(I)V", "newCapacity", "wireman", "index", "cutely", "(I)I", "impromptu", "competently", "marial", "internalIndex", "", "elements", "saneness", "(ILjava/util/Collection;)V", "fromIndex", "toIndex", "arytenoidectomy", "(II)V", "monoploid", "internalFromIndex", "internalToIndex", "taiyuan", "impassible", "", "isEmpty", "()Z", "first", "()Ljava/lang/Object;", "last", "element", "addFirst", "(Ljava/lang/Object;)V", "addLast", "removeFirst", "triweekly", "removeLast", "kowloon", "add", "(Ljava/lang/Object;)Z", "(ILjava/lang/Object;)V", "addAll", "(Ljava/util/Collection;)Z", "(ILjava/util/Collection;)Z", "get", "(I)Ljava/lang/Object;", "set", "(ILjava/lang/Object;)Ljava/lang/Object;", "contains", "indexOf", "(Ljava/lang/Object;)I", "lastIndexOf", "remove", "removeAt", "removeAll", "retainAll", "clear", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "", "array", "toArray", "([Ljava/lang/Object;)[Ljava/lang/Object;", "", "()[Ljava/lang/Object;", "removeRange", "I", TtmlNode.TAG_HEAD, "[Ljava/lang/Object;", "elementData", "value", "getSize", "()I", "size", "polloi", "attabal", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class impassible<E> extends impromptu<E> {

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name and from kotlin metadata */
    public Object[] elementData = f29340molybdenite;

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name and from kotlin metadata */
    public int head;

    /* JADX INFO: renamed from: monoploid, reason: collision with root package name and from kotlin metadata */
    public int size;

    /* JADX INFO: renamed from: molybdenite, reason: collision with root package name */
    public static final Object[] f29340molybdenite = new Object[0];

    private final void beachfront(int minCapacity) {
        if (minCapacity < 0) {
            throw new IllegalStateException("Deque is too big.");
        }
        Object[] objArr = this.elementData;
        if (minCapacity <= objArr.length) {
            return;
        }
        if (objArr == f29340molybdenite) {
            this.elementData = new Object[wireman.wireman(minCapacity, 10)];
        } else {
            wireman(wireman.INSTANCE.marial(objArr.length, minCapacity));
        }
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(E element) {
        addLast(element);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends E> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        if (elements.isEmpty()) {
            return false;
        }
        impassible();
        beachfront(size() + elements.size());
        saneness(cutely(this.head + size()), elements);
        return true;
    }

    public final void addFirst(E element) {
        impassible();
        beachfront(size() + 1);
        int iMarial = marial(this.head);
        this.head = iMarial;
        this.elementData[iMarial] = element;
        this.size = size() + 1;
    }

    public final void addLast(E element) {
        impassible();
        beachfront(size() + 1);
        this.elementData[cutely(this.head + size())] = element;
        this.size = size() + 1;
    }

    public final void arytenoidectomy(int fromIndex, int toIndex) {
        int iCutely = cutely(this.head + (fromIndex - 1));
        int iCutely2 = cutely(this.head + (toIndex - 1));
        while (fromIndex > 0) {
            int i = iCutely + 1;
            int iMin = Math.min(fromIndex, Math.min(i, iCutely2 + 1));
            Object[] objArr = this.elementData;
            int i2 = iCutely2 - iMin;
            int i3 = iCutely - iMin;
            arytenoidectomy.taiyuan(objArr, objArr, i2 + 1, i3 + 1, i);
            iCutely = impromptu(i3);
            iCutely2 = impromptu(i2);
            fromIndex -= iMin;
        }
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        if (!isEmpty()) {
            impassible();
            taiyuan(this.head, cutely(this.head + size()));
        }
        this.head = 0;
        this.size = 0;
    }

    public final int competently(int index) {
        if (index == polloi.walach(this.elementData)) {
            return 0;
        }
        return index + 1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean contains(Object element) {
        return indexOf(element) != -1;
    }

    public final int cutely(int index) {
        Object[] objArr = this.elementData;
        return index >= objArr.length ? index - objArr.length : index;
    }

    public final E first() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        return (E) this.elementData[this.head];
    }

    @Override // java.util.AbstractList, java.util.List
    public E get(int index) {
        wireman.INSTANCE.saneness(index, size());
        return (E) this.elementData[cutely(this.head + index)];
    }

    @Override // p002kotlin.collections.impromptu
    public int getSize() {
        return this.size;
    }

    public final void impassible() {
        ((AbstractList) this).modCount++;
    }

    public final int impromptu(int index) {
        return index < 0 ? index + this.elementData.length : index;
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object element) {
        int i;
        int iCutely = cutely(this.head + size());
        int length = this.head;
        if (length < iCutely) {
            while (length < iCutely) {
                if (Intrinsics.wireman(element, this.elementData[length])) {
                    i = this.head;
                } else {
                    length++;
                }
            }
            return -1;
        }
        if (length < iCutely) {
            return -1;
        }
        int length2 = this.elementData.length;
        while (length < length2) {
            if (Intrinsics.wireman(element, this.elementData[length])) {
                i = this.head;
            } else {
                length++;
            }
        }
        for (int i2 = 0; i2 < iCutely; i2++) {
            if (Intrinsics.wireman(element, this.elementData[i2])) {
                length = i2 + this.elementData.length;
                i = this.head;
            }
        }
        return -1;
        return length - i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean isEmpty() {
        return size() == 0;
    }

    public final E kowloon() {
        if (isEmpty()) {
            return null;
        }
        return removeLast();
    }

    public final E last() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        return (E) this.elementData[cutely(this.head + adultoid.triweekly(this))];
    }

    @Override // java.util.AbstractList, java.util.List
    public int lastIndexOf(Object element) {
        int iWalach;
        int i;
        int iCutely = cutely(this.head + size());
        int i2 = this.head;
        if (i2 < iCutely) {
            iWalach = iCutely - 1;
            if (i2 <= iWalach) {
                while (!Intrinsics.wireman(element, this.elementData[iWalach])) {
                    if (iWalach != i2) {
                        iWalach--;
                    }
                }
                i = this.head;
                return iWalach - i;
            }
            return -1;
        }
        if (i2 > iCutely) {
            for (int i3 = iCutely - 1; -1 < i3; i3--) {
                if (Intrinsics.wireman(element, this.elementData[i3])) {
                    iWalach = i3 + this.elementData.length;
                    i = this.head;
                    return iWalach - i;
                }
            }
            iWalach = polloi.walach(this.elementData);
            int i4 = this.head;
            if (i4 <= iWalach) {
                while (!Intrinsics.wireman(element, this.elementData[iWalach])) {
                    if (iWalach != i4) {
                        iWalach--;
                    }
                }
                i = this.head;
                return iWalach - i;
            }
        }
        return -1;
    }

    public final int marial(int index) {
        return index == 0 ? polloi.walach(this.elementData) : index - 1;
    }

    public final void monoploid(int fromIndex, int toIndex) {
        int iCutely = cutely(this.head + toIndex);
        int iCutely2 = cutely(this.head + fromIndex);
        int size = size();
        while (true) {
            size -= toIndex;
            if (size <= 0) {
                return;
            }
            Object[] objArr = this.elementData;
            toIndex = Math.min(size, Math.min(objArr.length - iCutely, objArr.length - iCutely2));
            Object[] objArr2 = this.elementData;
            int i = iCutely + toIndex;
            arytenoidectomy.taiyuan(objArr2, objArr2, iCutely2, iCutely, i);
            iCutely = cutely(i);
            iCutely2 = cutely(iCutely2 + toIndex);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean remove(Object element) {
        int iIndexOf = indexOf(element);
        if (iIndexOf == -1) {
            return false;
        }
        removeAt(iIndexOf);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean removeAll(Collection<?> elements) {
        int iCutely;
        Intrinsics.checkNotNullParameter(elements, "elements");
        boolean z = false;
        z = false;
        z = false;
        if (!isEmpty() && this.elementData.length != 0) {
            int iCutely2 = cutely(this.head + size());
            int i = this.head;
            if (i < iCutely2) {
                iCutely = i;
                while (i < iCutely2) {
                    Object obj = this.elementData[i];
                    if (elements.contains(obj)) {
                        z = true;
                    } else {
                        this.elementData[iCutely] = obj;
                        iCutely++;
                    }
                    i++;
                }
                arytenoidectomy.molybdenite(this.elementData, null, iCutely, iCutely2);
            } else {
                int length = this.elementData.length;
                boolean z2 = false;
                int i2 = i;
                while (i < length) {
                    Object[] objArr = this.elementData;
                    Object obj2 = objArr[i];
                    objArr[i] = null;
                    if (elements.contains(obj2)) {
                        z2 = true;
                    } else {
                        this.elementData[i2] = obj2;
                        i2++;
                    }
                    i++;
                }
                iCutely = cutely(i2);
                for (int i3 = 0; i3 < iCutely2; i3++) {
                    Object[] objArr2 = this.elementData;
                    Object obj3 = objArr2[i3];
                    objArr2[i3] = null;
                    if (elements.contains(obj3)) {
                        z2 = true;
                    } else {
                        this.elementData[iCutely] = obj3;
                        iCutely = competently(iCutely);
                    }
                }
                z = z2;
            }
            if (z) {
                impassible();
                this.size = impromptu(iCutely - this.head);
            }
        }
        return z;
    }

    @Override // p002kotlin.collections.impromptu
    public E removeAt(int index) {
        wireman.INSTANCE.saneness(index, size());
        if (index == adultoid.triweekly(this)) {
            return removeLast();
        }
        if (index == 0) {
            return removeFirst();
        }
        impassible();
        int iCutely = cutely(this.head + index);
        E e = (E) this.elementData[iCutely];
        if (index < (size() >> 1)) {
            int i = this.head;
            if (iCutely >= i) {
                Object[] objArr = this.elementData;
                arytenoidectomy.taiyuan(objArr, objArr, i + 1, i, iCutely);
            } else {
                Object[] objArr2 = this.elementData;
                arytenoidectomy.taiyuan(objArr2, objArr2, 1, 0, iCutely);
                Object[] objArr3 = this.elementData;
                objArr3[0] = objArr3[objArr3.length - 1];
                int i2 = this.head;
                arytenoidectomy.taiyuan(objArr3, objArr3, i2 + 1, i2, objArr3.length - 1);
            }
            Object[] objArr4 = this.elementData;
            int i3 = this.head;
            objArr4[i3] = null;
            this.head = competently(i3);
        } else {
            int iCutely2 = cutely(this.head + adultoid.triweekly(this));
            if (iCutely <= iCutely2) {
                Object[] objArr5 = this.elementData;
                arytenoidectomy.taiyuan(objArr5, objArr5, iCutely, iCutely + 1, iCutely2 + 1);
            } else {
                Object[] objArr6 = this.elementData;
                arytenoidectomy.taiyuan(objArr6, objArr6, iCutely, iCutely + 1, objArr6.length);
                Object[] objArr7 = this.elementData;
                objArr7[objArr7.length - 1] = objArr7[0];
                arytenoidectomy.taiyuan(objArr7, objArr7, 0, 1, iCutely2 + 1);
            }
            this.elementData[iCutely2] = null;
        }
        this.size = size() - 1;
        return e;
    }

    public final E removeFirst() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        impassible();
        Object[] objArr = this.elementData;
        int i = this.head;
        E e = (E) objArr[i];
        objArr[i] = null;
        this.head = competently(i);
        this.size = size() - 1;
        return e;
    }

    public final E removeLast() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        impassible();
        int iCutely = cutely(this.head + adultoid.triweekly(this));
        Object[] objArr = this.elementData;
        E e = (E) objArr[iCutely];
        objArr[iCutely] = null;
        this.size = size() - 1;
        return e;
    }

    @Override // java.util.AbstractList
    public void removeRange(int fromIndex, int toIndex) {
        wireman.INSTANCE.wireman(fromIndex, toIndex, size());
        int i = toIndex - fromIndex;
        if (i == 0) {
            return;
        }
        if (i == size()) {
            clear();
            return;
        }
        if (i == 1) {
            removeAt(fromIndex);
            return;
        }
        impassible();
        if (fromIndex < size() - toIndex) {
            arytenoidectomy(fromIndex, toIndex);
            int iCutely = cutely(this.head + i);
            taiyuan(this.head, iCutely);
            this.head = iCutely;
        } else {
            monoploid(fromIndex, toIndex);
            int iCutely2 = cutely(this.head + size());
            taiyuan(impromptu(iCutely2 - i), iCutely2);
        }
        this.size = size() - i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean retainAll(Collection<?> elements) {
        int iCutely;
        Intrinsics.checkNotNullParameter(elements, "elements");
        boolean z = false;
        z = false;
        z = false;
        if (!isEmpty() && this.elementData.length != 0) {
            int iCutely2 = cutely(this.head + size());
            int i = this.head;
            if (i < iCutely2) {
                iCutely = i;
                while (i < iCutely2) {
                    Object obj = this.elementData[i];
                    if (elements.contains(obj)) {
                        this.elementData[iCutely] = obj;
                        iCutely++;
                    } else {
                        z = true;
                    }
                    i++;
                }
                arytenoidectomy.molybdenite(this.elementData, null, iCutely, iCutely2);
            } else {
                int length = this.elementData.length;
                boolean z2 = false;
                int i2 = i;
                while (i < length) {
                    Object[] objArr = this.elementData;
                    Object obj2 = objArr[i];
                    objArr[i] = null;
                    if (elements.contains(obj2)) {
                        this.elementData[i2] = obj2;
                        i2++;
                    } else {
                        z2 = true;
                    }
                    i++;
                }
                iCutely = cutely(i2);
                for (int i3 = 0; i3 < iCutely2; i3++) {
                    Object[] objArr2 = this.elementData;
                    Object obj3 = objArr2[i3];
                    objArr2[i3] = null;
                    if (elements.contains(obj3)) {
                        this.elementData[iCutely] = obj3;
                        iCutely = competently(iCutely);
                    } else {
                        z2 = true;
                    }
                }
                z = z2;
            }
            if (z) {
                impassible();
                this.size = impromptu(iCutely - this.head);
            }
        }
        return z;
    }

    public final void saneness(int internalIndex, Collection<? extends E> elements) {
        Iterator<? extends E> it = elements.iterator();
        int length = this.elementData.length;
        while (internalIndex < length && it.hasNext()) {
            this.elementData[internalIndex] = it.next();
            internalIndex++;
        }
        int i = this.head;
        for (int i2 = 0; i2 < i && it.hasNext(); i2++) {
            this.elementData[i2] = it.next();
        }
        this.size = size() + elements.size();
    }

    @Override // p002kotlin.collections.impromptu, java.util.AbstractList, java.util.List
    public E set(int index, E element) {
        wireman.INSTANCE.saneness(index, size());
        int iCutely = cutely(this.head + index);
        Object[] objArr = this.elementData;
        E e = (E) objArr[iCutely];
        objArr[iCutely] = element;
        return e;
    }

    public final void taiyuan(int internalFromIndex, int internalToIndex) {
        if (internalFromIndex < internalToIndex) {
            arytenoidectomy.molybdenite(this.elementData, null, internalFromIndex, internalToIndex);
            return;
        }
        Object[] objArr = this.elementData;
        arytenoidectomy.molybdenite(objArr, null, internalFromIndex, objArr.length);
        arytenoidectomy.molybdenite(this.elementData, null, 0, internalToIndex);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public <T> T[] toArray(T[] array) {
        Intrinsics.checkNotNullParameter(array, "array");
        if (array.length < size()) {
            array = (T[]) triweekly.attabal(array, size());
        }
        T[] tArr = array;
        int iCutely = cutely(this.head + size());
        int i = this.head;
        if (i < iCutely) {
            arytenoidectomy.triweekly(this.elementData, tArr, 0, i, iCutely, 2, null);
        } else if (!isEmpty()) {
            Object[] objArr = this.elementData;
            arytenoidectomy.taiyuan(objArr, tArr, 0, this.head, objArr.length);
            Object[] objArr2 = this.elementData;
            arytenoidectomy.taiyuan(objArr2, tArr, objArr2.length - this.head, 0, iCutely);
        }
        return (T[]) graveside.beachfront(size(), tArr);
    }

    public final E triweekly() {
        if (isEmpty()) {
            return null;
        }
        return removeFirst();
    }

    public final void wireman(int newCapacity) {
        Object[] objArr = new Object[newCapacity];
        Object[] objArr2 = this.elementData;
        arytenoidectomy.taiyuan(objArr2, objArr, 0, this.head, objArr2.length);
        Object[] objArr3 = this.elementData;
        int length = objArr3.length;
        int i = this.head;
        arytenoidectomy.taiyuan(objArr3, objArr, length - i, 0, i);
        this.head = 0;
        this.elementData = objArr;
    }

    @Override // p002kotlin.collections.impromptu, java.util.AbstractList, java.util.List
    public void add(int index, E element) {
        wireman.INSTANCE.dern(index, size());
        if (index == size()) {
            addLast(element);
            return;
        }
        if (index == 0) {
            addFirst(element);
            return;
        }
        impassible();
        beachfront(size() + 1);
        int iCutely = cutely(this.head + index);
        if (index < ((size() + 1) >> 1)) {
            int iMarial = marial(iCutely);
            int iMarial2 = marial(this.head);
            int i = this.head;
            if (iMarial >= i) {
                Object[] objArr = this.elementData;
                objArr[iMarial2] = objArr[i];
                arytenoidectomy.taiyuan(objArr, objArr, i, i + 1, iMarial + 1);
            } else {
                Object[] objArr2 = this.elementData;
                arytenoidectomy.taiyuan(objArr2, objArr2, i - 1, i, objArr2.length);
                Object[] objArr3 = this.elementData;
                objArr3[objArr3.length - 1] = objArr3[0];
                arytenoidectomy.taiyuan(objArr3, objArr3, 0, 1, iMarial + 1);
            }
            this.elementData[iMarial] = element;
            this.head = iMarial2;
        } else {
            int iCutely2 = cutely(this.head + size());
            if (iCutely < iCutely2) {
                Object[] objArr4 = this.elementData;
                arytenoidectomy.taiyuan(objArr4, objArr4, iCutely + 1, iCutely, iCutely2);
            } else {
                Object[] objArr5 = this.elementData;
                arytenoidectomy.taiyuan(objArr5, objArr5, 1, 0, iCutely2);
                Object[] objArr6 = this.elementData;
                objArr6[0] = objArr6[objArr6.length - 1];
                arytenoidectomy.taiyuan(objArr6, objArr6, iCutely + 1, iCutely, objArr6.length - 1);
            }
            this.elementData[iCutely] = element;
        }
        this.size = size() + 1;
    }

    @Override // java.util.AbstractList, java.util.List
    public boolean addAll(int index, Collection<? extends E> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        wireman.INSTANCE.dern(index, size());
        if (elements.isEmpty()) {
            return false;
        }
        if (index == size()) {
            return addAll(elements);
        }
        impassible();
        beachfront(size() + elements.size());
        int iCutely = cutely(this.head + size());
        int iCutely2 = cutely(this.head + index);
        int size = elements.size();
        if (index < ((size() + 1) >> 1)) {
            int i = this.head;
            int length = i - size;
            if (iCutely2 < i) {
                Object[] objArr = this.elementData;
                arytenoidectomy.taiyuan(objArr, objArr, length, i, objArr.length);
                if (size >= iCutely2) {
                    Object[] objArr2 = this.elementData;
                    arytenoidectomy.taiyuan(objArr2, objArr2, objArr2.length - size, 0, iCutely2);
                } else {
                    Object[] objArr3 = this.elementData;
                    arytenoidectomy.taiyuan(objArr3, objArr3, objArr3.length - size, 0, size);
                    Object[] objArr4 = this.elementData;
                    arytenoidectomy.taiyuan(objArr4, objArr4, 0, size, iCutely2);
                }
            } else if (length >= 0) {
                Object[] objArr5 = this.elementData;
                arytenoidectomy.taiyuan(objArr5, objArr5, length, i, iCutely2);
            } else {
                Object[] objArr6 = this.elementData;
                length += objArr6.length;
                int i2 = iCutely2 - i;
                int length2 = objArr6.length - length;
                if (length2 >= i2) {
                    arytenoidectomy.taiyuan(objArr6, objArr6, length, i, iCutely2);
                } else {
                    arytenoidectomy.taiyuan(objArr6, objArr6, length, i, i + length2);
                    Object[] objArr7 = this.elementData;
                    arytenoidectomy.taiyuan(objArr7, objArr7, 0, this.head + length2, iCutely2);
                }
            }
            this.head = length;
            saneness(impromptu(iCutely2 - size), elements);
        } else {
            int i3 = iCutely2 + size;
            if (iCutely2 < iCutely) {
                int i4 = size + iCutely;
                Object[] objArr8 = this.elementData;
                if (i4 <= objArr8.length) {
                    arytenoidectomy.taiyuan(objArr8, objArr8, i3, iCutely2, iCutely);
                } else if (i3 >= objArr8.length) {
                    arytenoidectomy.taiyuan(objArr8, objArr8, i3 - objArr8.length, iCutely2, iCutely);
                } else {
                    int length3 = iCutely - (i4 - objArr8.length);
                    arytenoidectomy.taiyuan(objArr8, objArr8, 0, length3, iCutely);
                    Object[] objArr9 = this.elementData;
                    arytenoidectomy.taiyuan(objArr9, objArr9, i3, iCutely2, length3);
                }
            } else {
                Object[] objArr10 = this.elementData;
                arytenoidectomy.taiyuan(objArr10, objArr10, size, 0, iCutely);
                Object[] objArr11 = this.elementData;
                if (i3 >= objArr11.length) {
                    arytenoidectomy.taiyuan(objArr11, objArr11, i3 - objArr11.length, iCutely2, objArr11.length);
                } else {
                    arytenoidectomy.taiyuan(objArr11, objArr11, 0, objArr11.length - size, objArr11.length);
                    Object[] objArr12 = this.elementData;
                    arytenoidectomy.taiyuan(objArr12, objArr12, i3, iCutely2, objArr12.length - size);
                }
            }
            saneness(iCutely2, elements);
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public Object[] toArray() {
        return toArray(new Object[size()]);
    }
}
