package androidx.datastore.preferences.protobuf;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public abstract class h extends j {
    private static final long serialVersionUID = 1;

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new e(this);
    }
}
