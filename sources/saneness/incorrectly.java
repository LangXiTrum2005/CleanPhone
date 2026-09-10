package saneness;

/* JADX INFO: loaded from: classes.dex */
public abstract class incorrectly implements rostrated {
    @Override // java.util.Iterator
    public final Object next() {
        return Byte.valueOf(a());
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
