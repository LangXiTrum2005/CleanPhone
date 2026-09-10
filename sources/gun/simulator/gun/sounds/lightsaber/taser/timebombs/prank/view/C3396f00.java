package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import com.google.protobuf.AbstractC2126l;
import com.google.protobuf.ByteString;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.f00, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3396f00 implements Iterator {
    private final ArrayDeque<com.google.protobuf.C0> breadCrumbs;
    private AbstractC2126l next;

    public /* synthetic */ C3396f00(ByteString byteString, com.google.protobuf.A0 a0) {
        this(byteString);
    }

    private AbstractC2126l getLeafByLeft(ByteString byteString) {
        while (byteString instanceof com.google.protobuf.C0) {
            com.google.protobuf.C0 c0 = (com.google.protobuf.C0) byteString;
            this.breadCrumbs.push(c0);
            byteString = c0.left;
        }
        return (AbstractC2126l) byteString;
    }

    private AbstractC2126l getNextNonEmptyLeaf() {
        AbstractC2126l leafByLeft;
        do {
            ArrayDeque<com.google.protobuf.C0> arrayDeque = this.breadCrumbs;
            if (arrayDeque == null || arrayDeque.isEmpty()) {
                return null;
            }
            leafByLeft = getLeafByLeft(this.breadCrumbs.pop().right);
        } while (leafByLeft.isEmpty());
        return leafByLeft;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.next != null;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException();
    }

    private C3396f00(ByteString byteString) {
        if (!(byteString instanceof com.google.protobuf.C0)) {
            this.breadCrumbs = null;
            this.next = (AbstractC2126l) byteString;
            return;
        }
        com.google.protobuf.C0 c0 = (com.google.protobuf.C0) byteString;
        ArrayDeque<com.google.protobuf.C0> arrayDeque = new ArrayDeque<>(c0.getTreeDepth());
        this.breadCrumbs = arrayDeque;
        arrayDeque.push(c0);
        this.next = getLeafByLeft(c0.left);
    }

    @Override // java.util.Iterator
    public AbstractC2126l next() {
        AbstractC2126l abstractC2126l = this.next;
        if (abstractC2126l == null) {
            throw new NoSuchElementException();
        }
        this.next = getNextNonEmptyLeaf();
        return abstractC2126l;
    }
}
