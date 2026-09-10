package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.yx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C5148yx implements Iterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5307a;
    public int b;
    public Object c;
    public final /* synthetic */ InterfaceC4545s40 d;

    public C5148yx(C3792ja0 c3792ja0) {
        this.f5307a = 1;
        this.d = c3792ja0;
        this.c = c3792ja0.f4558a.iterator();
    }

    public final void a() {
        Object objInvoke;
        int i = this.b;
        C5236zx c5236zx = (C5236zx) this.d;
        if (i == -2) {
            objInvoke = c5236zx.f5353a.invoke();
        } else {
            InterfaceC2766Sw interfaceC2766Sw = c5236zx.b;
            Object obj = this.c;
            AbstractC2995aW.n(obj);
            objInvoke = interfaceC2766Sw.invoke(obj);
        }
        this.c = objInvoke;
        this.b = objInvoke == null ? 0 : 1;
    }

    public final void b() {
        while (this.b < ((C3792ja0) this.d).b && ((Iterator) this.c).hasNext()) {
            ((Iterator) this.c).next();
            this.b++;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f5307a) {
            case 0:
                if (this.b < 0) {
                    a();
                }
                return this.b == 1;
            default:
                b();
                return this.b < ((C3792ja0) this.d).c && ((Iterator) this.c).hasNext();
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f5307a) {
            case 0:
                if (this.b < 0) {
                    a();
                }
                if (this.b == 0) {
                    throw new NoSuchElementException();
                }
                Object obj = this.c;
                AbstractC2995aW.o(obj, "null cannot be cast to non-null type T of kotlin.sequences.GeneratorSequence");
                this.b = -1;
                return obj;
            default:
                b();
                int i = this.b;
                if (i >= ((C3792ja0) this.d).c) {
                    throw new NoSuchElementException();
                }
                this.b = i + 1;
                return ((Iterator) this.c).next();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f5307a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public C5148yx(C5236zx c5236zx) {
        this.f5307a = 0;
        this.d = c5236zx;
        this.b = -2;
    }
}
