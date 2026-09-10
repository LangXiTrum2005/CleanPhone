package com.google.crypto.tink.shaded.protobuf;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* JADX INFO: compiled from: ProtobufArrayList.java */
/* JADX INFO: loaded from: classes3.dex */
public final class dent<E> extends dern<E> implements RandomAccess {

    /* JADX INFO: renamed from: molybdenite, reason: collision with root package name */
    public static final dent<Object> f22188molybdenite;

    /* JADX INFO: renamed from: polloi, reason: collision with root package name */
    public static final Object[] f22189polloi;

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
    public E[] f22190arytenoidectomy;

    /* JADX INFO: renamed from: monoploid, reason: collision with root package name */
    public int f22191monoploid;

    static {
        Object[] objArr = new Object[0];
        f22189polloi = objArr;
        f22188molybdenite = new dent<>(objArr, 0, false);
    }

    public dent(E[] eArr, int i, boolean z) {
        super(z);
        this.f22190arytenoidectomy = eArr;
        this.f22191monoploid = i;
    }

    private static int beachfront(int i) {
        return Math.max(((i * 3) / 2) + 1, 10);
    }

    private String competently(int i) {
        return "Index:" + i + ", Size:" + this.f22191monoploid;
    }

    public static <E> E[] dern(int i) {
        return (E[]) new Object[i];
    }

    private void marial(int i) {
        if (i < 0 || i >= this.f22191monoploid) {
            throw new IndexOutOfBoundsException(competently(i));
        }
    }

    public static <E> dent<E> wireman() {
        return (dent<E>) f22188molybdenite;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(E e) {
        saneness();
        int i = this.f22191monoploid;
        E[] eArr = this.f22190arytenoidectomy;
        if (i == eArr.length) {
            this.f22190arytenoidectomy = (E[]) Arrays.copyOf(this.f22190arytenoidectomy, beachfront(eArr.length));
        }
        E[] eArr2 = this.f22190arytenoidectomy;
        int i2 = this.f22191monoploid;
        this.f22191monoploid = i2 + 1;
        eArr2[i2] = e;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public E get(int i) {
        marial(i);
        return this.f22190arytenoidectomy[i];
    }

    @Override // com.google.crypto.tink.shaded.protobuf.rotuma.taiyuan
    /* JADX INFO: renamed from: impromptu, reason: merged with bridge method [inline-methods] */
    public dent<E> mutableCopyWithCapacity(int i) {
        if (i >= this.f22191monoploid) {
            return new dent<>(i == 0 ? f22189polloi : Arrays.copyOf(this.f22190arytenoidectomy, i), this.f22191monoploid, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.dern, java.util.AbstractList, java.util.List
    public E remove(int i) {
        saneness();
        marial(i);
        E[] eArr = this.f22190arytenoidectomy;
        E e = eArr[i];
        int i2 = this.f22191monoploid;
        if (i < i2 - 1) {
            System.arraycopy(eArr, i + 1, eArr, i, (i2 - i) - 1);
        }
        this.f22191monoploid--;
        ((AbstractList) this).modCount++;
        return e;
    }

    @Override // java.util.AbstractList, java.util.List
    public E set(int i, E e) {
        saneness();
        marial(i);
        E[] eArr = this.f22190arytenoidectomy;
        E e2 = eArr[i];
        eArr[i] = e;
        ((AbstractList) this).modCount++;
        return e2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f22191monoploid;
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int i, E e) {
        int i2;
        saneness();
        if (i >= 0 && i <= (i2 = this.f22191monoploid)) {
            E[] eArr = this.f22190arytenoidectomy;
            if (i2 < eArr.length) {
                System.arraycopy(eArr, i, eArr, i + 1, i2 - i);
            } else {
                E[] eArr2 = (E[]) dern(beachfront(eArr.length));
                System.arraycopy(this.f22190arytenoidectomy, 0, eArr2, 0, i);
                System.arraycopy(this.f22190arytenoidectomy, i, eArr2, i + 1, this.f22191monoploid - i);
                this.f22190arytenoidectomy = eArr2;
            }
            this.f22190arytenoidectomy[i] = e;
            this.f22191monoploid++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(competently(i));
    }
}
