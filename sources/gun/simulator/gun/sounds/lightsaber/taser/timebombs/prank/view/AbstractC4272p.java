package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.util.ListIterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC4272p extends Yf0 implements ListIterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f4816a;
    public int b;

    public AbstractC4272p(int i, int i2) {
        FW.q(i2, i);
        this.f4816a = i;
        this.b = i2;
    }

    public final void a(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator
    public final /* bridge */ /* synthetic */ void add(Object obj) {
        a(obj);
        throw null;
    }

    public abstract Object b(int i);

    public final void c(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.b < this.f4816a;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.b > 0;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i = this.b;
        this.b = i + 1;
        return b(i);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.b;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i = this.b - 1;
        this.b = i;
        return b(i);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.b - 1;
    }

    @Override // java.util.ListIterator
    public final /* bridge */ /* synthetic */ void set(Object obj) {
        c(obj);
        throw null;
    }
}
