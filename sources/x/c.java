package x;

import com.ironsource.X3;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.n;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class c implements Iterator, Map.Entry {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f53487a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f53488b = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f53489c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e f53490d;

    public c(e eVar) {
        this.f53490d = eVar;
        this.f53487a = eVar.f53506c - 1;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (!this.f53489c) {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Object key = entry.getKey();
        int i10 = this.f53488b;
        e eVar = this.f53490d;
        return n.a(key, eVar.f(i10)) && n.a(entry.getValue(), eVar.j(this.f53488b));
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        if (this.f53489c) {
            return this.f53490d.f(this.f53488b);
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        if (this.f53489c) {
            return this.f53490d.j(this.f53488b);
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f53488b < this.f53487a;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        if (!this.f53489c) {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        int i10 = this.f53488b;
        e eVar = this.f53490d;
        Object objF = eVar.f(i10);
        Object objJ = eVar.j(this.f53488b);
        return (objF == null ? 0 : objF.hashCode()) ^ (objJ != null ? objJ.hashCode() : 0);
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f53488b++;
        this.f53489c = true;
        return this;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f53489c) {
            throw new IllegalStateException();
        }
        this.f53490d.h(this.f53488b);
        this.f53488b--;
        this.f53487a--;
        this.f53489c = false;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        if (this.f53489c) {
            return this.f53490d.i(this.f53488b, obj);
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    public final String toString() {
        return getKey() + X3.j.f27830b + getValue();
    }
}
