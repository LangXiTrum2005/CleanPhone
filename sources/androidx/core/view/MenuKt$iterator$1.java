package androidx.core.view;

import android.view.MenuItem;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.markers.KMutableIterator;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010)\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"androidx/core/view/MenuKt$iterator$1", "", "Landroid/view/MenuItem;", "core-ktx_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class MenuKt$iterator$1 implements Iterator<MenuItem>, KMutableIterator {
    public int X;

    @Override // java.util.Iterator
    public final boolean hasNext() {
        throw null;
    }

    @Override // java.util.Iterator
    public final MenuItem next() {
        this.X++;
        throw null;
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.X--;
        throw null;
    }
}
