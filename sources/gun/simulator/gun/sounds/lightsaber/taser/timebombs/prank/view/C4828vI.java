package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.vI, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C4828vI implements Iterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f5125a;
    public boolean b;
    public final /* synthetic */ C2827Vf c;

    public C4828vI(C2827Vf c2827Vf) {
        this.c = c2827Vf;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() throws IOException {
        if (this.f5125a == null && !this.b) {
            String line = ((BufferedReader) this.c.b).readLine();
            this.f5125a = line;
            if (line == null) {
                this.b = true;
            }
        }
        return this.f5125a != null;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        String str = this.f5125a;
        this.f5125a = null;
        AbstractC2995aW.n(str);
        return str;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
