package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import com.google.protobuf.UnmodifiableLazyStringList;
import java.util.Iterator;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.ag0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3012ag0 implements Iterator {
    Iterator<String> iter;
    final /* synthetic */ UnmodifiableLazyStringList this$0;

    public C3012ag0(UnmodifiableLazyStringList unmodifiableLazyStringList) {
        this.this$0 = unmodifiableLazyStringList;
        this.iter = unmodifiableLazyStringList.list.iterator();
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.iter.hasNext();
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Iterator
    public String next() {
        return this.iter.next();
    }
}
