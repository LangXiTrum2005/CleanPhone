package androidx.core.view;

import android.view.View;
import android.view.ViewGroup;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.markers.KMutableIterator;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010)\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"androidx/core/view/ViewGroupKt$iterator$1", "", "Landroid/view/View;", "core-ktx_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class ViewGroupKt$iterator$1 implements Iterator<View>, KMutableIterator {
    public int X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final /* synthetic */ ViewGroup f4482Y;

    public ViewGroupKt$iterator$1(ViewGroup viewGroup) {
        this.f4482Y = viewGroup;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.X < this.f4482Y.getChildCount();
    }

    @Override // java.util.Iterator
    public final View next() {
        int i2 = this.X;
        this.X = i2 + 1;
        View childAt = this.f4482Y.getChildAt(i2);
        if (childAt != null) {
            return childAt;
        }
        throw new IndexOutOfBoundsException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        int i2 = this.X - 1;
        this.X = i2;
        this.f4482Y.removeViewAt(i2);
    }
}
