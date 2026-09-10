package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import com.google.protobuf.LazyStringArrayList;
import java.util.AbstractList;
import java.util.RandomAccess;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.lH, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3948lH extends AbstractList implements RandomAccess {
    private final LazyStringArrayList list;

    public C3948lH(LazyStringArrayList lazyStringArrayList) {
        this.list = lazyStringArrayList;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.list.size();
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int i, byte[] bArr) {
        this.list.add(i, bArr);
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public byte[] get(int i) {
        return this.list.getByteArray(i);
    }

    @Override // java.util.AbstractList, java.util.List
    public byte[] remove(int i) {
        String strRemove = this.list.remove(i);
        ((AbstractList) this).modCount++;
        return LazyStringArrayList.asByteArray(strRemove);
    }

    @Override // java.util.AbstractList, java.util.List
    public byte[] set(int i, byte[] bArr) {
        Object andReturn = this.list.setAndReturn(i, bArr);
        ((AbstractList) this).modCount++;
        return LazyStringArrayList.asByteArray(andReturn);
    }
}
