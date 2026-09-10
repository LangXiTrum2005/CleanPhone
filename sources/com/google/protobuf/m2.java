package com.google.protobuf;

import java.util.AbstractList;
import java.util.RandomAccess;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class m2 extends AbstractList implements RandomAccess {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f24902a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LazyStringArrayList f24903b;

    public /* synthetic */ m2(LazyStringArrayList lazyStringArrayList, int i10) {
        this.f24902a = i10;
        this.f24903b = lazyStringArrayList;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i10, Object obj) {
        switch (this.f24902a) {
            case 0:
                this.f24903b.add(i10, (byte[]) obj);
                ((AbstractList) this).modCount++;
                break;
            default:
                this.f24903b.add(i10, (ByteString) obj);
                ((AbstractList) this).modCount++;
                break;
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i10) {
        switch (this.f24902a) {
            case 0:
                return this.f24903b.getByteArray(i10);
            default:
                return this.f24903b.getByteString(i10);
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object remove(int i10) {
        switch (this.f24902a) {
            case 0:
                String strRemove = this.f24903b.remove(i10);
                ((AbstractList) this).modCount++;
                return LazyStringArrayList.asByteArray(strRemove);
            default:
                String strRemove2 = this.f24903b.remove(i10);
                ((AbstractList) this).modCount++;
                return LazyStringArrayList.asByteString(strRemove2);
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i10, Object obj) {
        switch (this.f24902a) {
            case 0:
                Object andReturn = this.f24903b.setAndReturn(i10, (byte[]) obj);
                ((AbstractList) this).modCount++;
                return LazyStringArrayList.asByteArray(andReturn);
            default:
                Object andReturn2 = this.f24903b.setAndReturn(i10, (ByteString) obj);
                ((AbstractList) this).modCount++;
                return LazyStringArrayList.asByteString(andReturn2);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        switch (this.f24902a) {
            case 0:
                break;
        }
        return this.f24903b.size();
    }
}
