package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import com.google.protobuf.UnmodifiableLazyStringList;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes3.dex */
public final class Zf0 implements ListIterator {
    ListIterator<String> iter;
    final /* synthetic */ UnmodifiableLazyStringList this$0;
    final /* synthetic */ int val$index;

    public Zf0(UnmodifiableLazyStringList unmodifiableLazyStringList, int i) {
        this.this$0 = unmodifiableLazyStringList;
        this.val$index = i;
        this.iter = unmodifiableLazyStringList.list.listIterator(i);
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public boolean hasNext() {
        return this.iter.hasNext();
    }

    @Override // java.util.ListIterator
    public boolean hasPrevious() {
        return this.iter.hasPrevious();
    }

    @Override // java.util.ListIterator
    public int nextIndex() {
        return this.iter.nextIndex();
    }

    @Override // java.util.ListIterator
    public int previousIndex() {
        return this.iter.previousIndex();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator
    public void add(String str) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public String next() {
        return this.iter.next();
    }

    @Override // java.util.ListIterator
    public String previous() {
        return this.iter.previous();
    }

    @Override // java.util.ListIterator
    public void set(String str) {
        throw new UnsupportedOperationException();
    }
}
