package hk;

import an.r;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.n;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class l implements Iterator, kk.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f42401a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f42402b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ r f42403c;

    public l(r rVar) {
        this.f42403c = rVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() throws IOException {
        if (this.f42401a == null && !this.f42402b) {
            String line = ((BufferedReader) this.f42403c.f3793b).readLine();
            this.f42401a = line;
            if (line == null) {
                this.f42402b = true;
            }
        }
        return this.f42401a != null;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        String str = this.f42401a;
        this.f42401a = null;
        n.c(str);
        return str;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
