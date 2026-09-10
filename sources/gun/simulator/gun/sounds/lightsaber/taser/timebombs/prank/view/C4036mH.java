package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import com.google.protobuf.ByteString;
import com.google.protobuf.LazyStringArrayList;
import java.util.AbstractList;
import java.util.RandomAccess;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.mH, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4036mH extends AbstractList implements RandomAccess {
    private final LazyStringArrayList list;

    public C4036mH(LazyStringArrayList lazyStringArrayList) {
        this.list = lazyStringArrayList;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.list.size();
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int i, ByteString byteString) {
        this.list.add(i, byteString);
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public ByteString get(int i) {
        return this.list.getByteString(i);
    }

    @Override // java.util.AbstractList, java.util.List
    public ByteString remove(int i) {
        String strRemove = this.list.remove(i);
        ((AbstractList) this).modCount++;
        return LazyStringArrayList.asByteString(strRemove);
    }

    @Override // java.util.AbstractList, java.util.List
    public ByteString set(int i, ByteString byteString) {
        Object andReturn = this.list.setAndReturn(i, byteString);
        ((AbstractList) this).modCount++;
        return LazyStringArrayList.asByteString(andReturn);
    }
}
