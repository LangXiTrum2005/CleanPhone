package androidx.datastore.preferences.protobuf;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* JADX INFO: compiled from: ProtobufArrayList.java */
/* JADX INFO: loaded from: classes.dex */
public final class dent<E> extends dern<E> implements RandomAccess {

    /* JADX INFO: renamed from: polloi, reason: collision with root package name */
    public static final dent<Object> f9707polloi = new dent<>(new Object[0], 0, false);

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
    public E[] f9708arytenoidectomy;

    /* JADX INFO: renamed from: monoploid, reason: collision with root package name */
    public int f9709monoploid;

    public dent(E[] eArr, int i, boolean z) {
        super(z);
        this.f9708arytenoidectomy = eArr;
        this.f9709monoploid = i;
    }

    private String beachfront(int i) {
        return "Index:" + i + ", Size:" + this.f9709monoploid;
    }

    public static <E> E[] dern(int i) {
        return (E[]) new Object[i];
    }

    private void marial(int i) {
        if (i < 0 || i >= this.f9709monoploid) {
            throw new IndexOutOfBoundsException(beachfront(i));
        }
    }

    public static <E> dent<E> wireman() {
        return (dent<E>) f9707polloi;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(E e) {
        saneness();
        int i = this.f9709monoploid;
        E[] eArr = this.f9708arytenoidectomy;
        if (i == eArr.length) {
            this.f9708arytenoidectomy = (E[]) Arrays.copyOf(eArr, ((i * 3) / 2) + 1);
        }
        E[] eArr2 = this.f9708arytenoidectomy;
        int i2 = this.f9709monoploid;
        this.f9709monoploid = i2 + 1;
        eArr2[i2] = e;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // androidx.datastore.preferences.protobuf.gintrap.beachfront
    /* JADX INFO: renamed from: competently, reason: merged with bridge method [inline-methods] */
    public dent<E> mutableCopyWithCapacity(int i) {
        if (i >= this.f9709monoploid) {
            return new dent<>(Arrays.copyOf(this.f9708arytenoidectomy, i), this.f9709monoploid, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.List
    public E get(int i) {
        marial(i);
        return this.f9708arytenoidectomy[i];
    }

    @Override // androidx.datastore.preferences.protobuf.dern, java.util.AbstractList, java.util.List
    public E remove(int i) {
        saneness();
        marial(i);
        E[] eArr = this.f9708arytenoidectomy;
        E e = eArr[i];
        int i2 = this.f9709monoploid;
        if (i < i2 - 1) {
            System.arraycopy(eArr, i + 1, eArr, i, (i2 - i) - 1);
        }
        this.f9709monoploid--;
        ((AbstractList) this).modCount++;
        return e;
    }

    @Override // java.util.AbstractList, java.util.List
    public E set(int i, E e) {
        saneness();
        marial(i);
        E[] eArr = this.f9708arytenoidectomy;
        E e2 = eArr[i];
        eArr[i] = e;
        ((AbstractList) this).modCount++;
        return e2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f9709monoploid;
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int i, E e) {
        int i2;
        saneness();
        if (i >= 0 && i <= (i2 = this.f9709monoploid)) {
            E[] eArr = this.f9708arytenoidectomy;
            if (i2 < eArr.length) {
                System.arraycopy(eArr, i, eArr, i + 1, i2 - i);
            } else {
                E[] eArr2 = (E[]) dern(((i2 * 3) / 2) + 1);
                System.arraycopy(this.f9708arytenoidectomy, 0, eArr2, 0, i);
                System.arraycopy(this.f9708arytenoidectomy, i, eArr2, i + 1, this.f9709monoploid - i);
                this.f9708arytenoidectomy = eArr2;
            }
            this.f9708arytenoidectomy[i] = e;
            this.f9709monoploid++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(beachfront(i));
    }
}
